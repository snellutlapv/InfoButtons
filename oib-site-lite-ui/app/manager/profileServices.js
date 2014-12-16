'use strict';

var oibManagerServiceModule = angular.module('oibManagerServiceModule', ['ngResource']);

var baseCloudUrl = 'https://api.github.com/repos/VHAINNOVATIONS/InfoButtons/contents/';
var profileDirectoryUrl = baseCloudUrl + 'profilestore?ref=development';
var profileContentUrl = baseCloudUrl + 'git/blobs/';

var testCloudProfiles = [{cha: "cha1.1", title: "cloud title 1.1", description: "cloud profile 1.1"}
    , {cha: "cha2", title: "site title 2", description: "site profile 2"}
    , {cha: "cha3.1", title: "cloud title 3.1", description: "cloud profile 3.1"}];

var testSiteProfiles = [{logo: "http://www.uptodate.com/images/UTD3_masthead.png", cha: "c1", title: "UpToDate", description: "Evidence-based clinical decision support resources."}
    , {logo: "http://static.pubmed.gov/portal/portal3rc.fcgi/3908092/img/546849", cha: "c2", title: "PubMed Health", description: "Information for consumers and clinicians on prevention and treatment of diseases and conditions."}
    , {logo: "http://www.merckmanuals.com/assets/images/logo-small.png", cha: "c3", title: "Merck Manual", description: "Concise and complete medical references for doctors, medical students, and healthcare professionals."}];

oibManagerServiceModule.factory('profileFactory', ['$http', function($http) {

    var urlBase = 'http://localhost:3000/';
//    var urlBase = 'http://service.oib.utah.edu:8080/infobutton-service-dev/manager/';
    var profileFactory = {};

    profileFactory.getProfiles = function () {
        return $http.get(urlBase + 'profiles');
    };

    profileFactory.getProfile = function (id) {
        return $http.get(urlBase + 'profile/' + id);
    };

    profileFactory.insertProfile = function (profile) {
        return $http.put(urlBase + 'profile/create', profile);
    };

    profileFactory.updateProfile = function (profile) {
        return $http.put(urlBase + 'profile/update', profile);
    };

    profileFactory.deleteProfile = function (id) {
        return $http.delete(urlBase + 'profile/delete/' + id);
    };

    return profileFactory;
}]);

var uuidGenerator = angular.module('uuidGenerator', []);
uuidGenerator.factory("idGenerator", function () {
    return {
        getNewUuid: function () {
            // http://www.ietf.org/rfc/rfc4122.txt
            var s = [];
            var hexDigits = "0123456789abcdef";
            for (var i = 0; i < 36; i++) {
                s[i] = hexDigits.substr(Math.floor(Math.random() * 0x10), 1);
            }
            s[14] = "4";  // bits 12-15 of the time_hi_and_version field to 0010
            s[19] = hexDigits.substr((s[19] & 0x3) | 0x8, 1);  // bits 6-7 of the clock_seq_hi_and_reserved to 01
            s[8] = s[13] = s[18] = s[23] = "-";
            return s.join("");
        }
    }
});

oibManagerServiceModule.factory('cloudProfileFactory', ['$http', '$resource', 'idGenerator', function ($http, $resource, idGenerator) {

    var serviceUrlBase = 'http://localhost:3000/';

    var cloudProfileFactory = {};

    cloudProfileFactory.getNewId = function () {
        return idGenerator.getNewUuid();
    };
    cloudProfileFactory.getSiteProfiles = function () {
        return testSiteProfiles;
    };
    cloudProfileFactory.addSiteProfile = function (profile) {
    };
    cloudProfileFactory.deleteSiteProfile = function (profileId) {
    };
    cloudProfileFactory.changeSiteProfileStatus = function (status) {
    };

    cloudProfileFactory.getCloudProfiles = function(base64) {
        var profileLinkList = [];
        var jsonString = {};
        $http.defaults.headers.common.Authorization = 'Basic ' + base64.encode('aniskand:WND-r3700');

        $http.get(profileDirectoryUrl).success(function (data) {

            data.forEach(function (profileLink) {

                // filter xml files only
                if (profileLink.path.indexOf('.xml') === (profileLink.path.length - 4)) {

                    var profileUrl = baseCloudUrl + profileLink.path + '?ref=development';
                    var profileInJson = $http.get(profileUrl).success(function (data) {

                        var xmlContentString = base64.decode(data.content);
                        var xmlDoc = $.parseXML(xmlContentString);
                        var $xml = $(xmlDoc);
                        var $title = $xml.find("title");
                        var $contexts = $xml.find("context");
                        var $versionControl = $xml.find("versionControl");
                        var version = $versionControl[0].attributes[0].value;
                        var attr0 = $contexts[0].attributes[0].value;
                        if ($title.text().length > 1) {
                            jsonString = {'sha': data.sha, 'url': profileLink.url, 'title': data.name, 'description': attr0, 'version': version,
                                            'content_utf8': xmlContentString, 'gitUrl': profileLink.html_url};
                            profileLinkList.push(jsonString);
                        }

                    });
                }
            });
        });
        return profileLinkList;
    };

    cloudProfileFactory.updateProfile = function(filename) {

            $http.get(baseCloudUrl + 'profilestore/' + filename + '?ref=development').success(function (profileData) {

                var xmlContentString = atob(profileData.content);
                var xmlDoc = $.parseXML(xmlContentString);
                var $xml = $(xmlDoc);
                var $contexts = $xml.find("context");
                var attr0 = $contexts[0].attributes[0].value;
                var profileJsonString = {'sha' : profileData.sha, 'name' : filename, 'content_utf8' : xmlContentString};
                $http.put(serviceUrlBase + 'profile/updateCloud', profileJsonString, {
                    headers: {
                        'Authorization' : undefined
                    }
                });
            });
    };

    cloudProfileFactory.downloadProfile = function (profile) {
        return $http.put(serviceUrlBase + 'profile/download', profile, {
            headers: {
                'Authorization' : undefined
            }
        });
    };

    cloudProfileFactory.getLocalCloudProfiles = function () {
        return $http.get(serviceUrlBase + 'cloudProfiles', {
            headers: {
                'Authorization' : undefined
            }
        });
    };

    cloudProfileFactory.getGitProfilesFromUrl = function () {   //return cloudProfiles;};

        var profileLinkList = [];
        $http.get(profileDirectoryUrl).success(function (data) {

            data.forEach(function (profileLink) {

                // filter xml files only
                if (profileLink.path.indexOf('.xml') === (profileLink.path.length - 4)) {

                    var profileUrl = baseCloudUrl + profileLink.path;
                    var profileInJson = $http.get(profileUrl).success(function (profileData) {

                        var xmlContentString = atob(profileData.content);
                        var xmlDoc = $.parseXML(xmlContentString);
                        var $xml = $(xmlDoc);
                        var $title = $xml.find("title");
                        var $contexts = $xml.find("context");
                        var attr0 = $contexts[0].attributes[0].value;
                        if ($title.text().length > 1) {
                            var jsonString = {'sha': profileData.sha, 'url': profileLink.url, 'title': $title.text(), 'description': attr0};
                            profileLinkList.push(jsonString);
                        }

                    });
                }
            });
        });

        return profileLinkList;

    };

    return cloudProfileFactory;

}]);
