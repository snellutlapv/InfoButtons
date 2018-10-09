//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.09 at 12:58:47 PM CDT 
//


package org.openinfobutton.schemas.kb;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="codeSystem" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "code")
public class Code {

    @XmlAttribute(name = "code", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String code;
    @XmlAttribute(name = "codeSystem", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String codeSystem;
    @XmlAttribute(name = "codeSystemName")
    @XmlSchemaType(name = "anySimpleType")
    protected String codeSystemName;
    @XmlAttribute(name = "displayName")
    @XmlSchemaType(name = "anySimpleType")
    protected String displayName;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the codeSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSystem() {
        return codeSystem;
    }

    /**
     * Sets the value of the codeSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSystem(String value) {
        this.codeSystem = value;
    }

    /**
     * Gets the value of the codeSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSystemName() {
        return codeSystemName;
    }

    /**
     * Sets the value of the codeSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSystemName(String value) {
        this.codeSystemName = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final Code.Builder<_B> _other) {
        _other.code = this.code;
        _other.codeSystem = this.codeSystem;
        _other.codeSystemName = this.codeSystemName;
        _other.displayName = this.displayName;
    }

    public<_B >Code.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new Code.Builder<_B>(_parentBuilder, this, true);
    }

    public Code.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static Code.Builder<Void> builder() {
        return new Code.Builder<Void>(null, null, false);
    }

    public static<_B >Code.Builder<_B> copyOf(final Code _other) {
        final Code.Builder<_B> _newBuilder = new Code.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final Code.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree codePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("code"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(codePropertyTree!= null):((codePropertyTree == null)||(!codePropertyTree.isLeaf())))) {
            _other.code = this.code;
        }
        final PropertyTree codeSystemPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("codeSystem"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(codeSystemPropertyTree!= null):((codeSystemPropertyTree == null)||(!codeSystemPropertyTree.isLeaf())))) {
            _other.codeSystem = this.codeSystem;
        }
        final PropertyTree codeSystemNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("codeSystemName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(codeSystemNamePropertyTree!= null):((codeSystemNamePropertyTree == null)||(!codeSystemNamePropertyTree.isLeaf())))) {
            _other.codeSystemName = this.codeSystemName;
        }
        final PropertyTree displayNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("displayName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(displayNamePropertyTree!= null):((displayNamePropertyTree == null)||(!displayNamePropertyTree.isLeaf())))) {
            _other.displayName = this.displayName;
        }
    }

    public<_B >Code.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new Code.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public Code.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >Code.Builder<_B> copyOf(final Code _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final Code.Builder<_B> _newBuilder = new Code.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static Code.Builder<Void> copyExcept(final Code _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static Code.Builder<Void> copyOnly(final Code _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final Code _storedValue;
        private String code;
        private String codeSystem;
        private String codeSystemName;
        private String displayName;

        public Builder(final _B _parentBuilder, final Code _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.code = _other.code;
                    this.codeSystem = _other.codeSystem;
                    this.codeSystemName = _other.codeSystemName;
                    this.displayName = _other.displayName;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final Code _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree codePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("code"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(codePropertyTree!= null):((codePropertyTree == null)||(!codePropertyTree.isLeaf())))) {
                        this.code = _other.code;
                    }
                    final PropertyTree codeSystemPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("codeSystem"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(codeSystemPropertyTree!= null):((codeSystemPropertyTree == null)||(!codeSystemPropertyTree.isLeaf())))) {
                        this.codeSystem = _other.codeSystem;
                    }
                    final PropertyTree codeSystemNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("codeSystemName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(codeSystemNamePropertyTree!= null):((codeSystemNamePropertyTree == null)||(!codeSystemNamePropertyTree.isLeaf())))) {
                        this.codeSystemName = _other.codeSystemName;
                    }
                    final PropertyTree displayNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("displayName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(displayNamePropertyTree!= null):((displayNamePropertyTree == null)||(!displayNamePropertyTree.isLeaf())))) {
                        this.displayName = _other.displayName;
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends Code >_P init(final _P _product) {
            _product.code = this.code;
            _product.codeSystem = this.codeSystem;
            _product.codeSystemName = this.codeSystemName;
            _product.displayName = this.displayName;
            return _product;
        }

        /**
         * Sets the new value of "code" (any previous value will be replaced)
         * 
         * @param code
         *     New value of the "code" property.
         */
        public Code.Builder<_B> withCode(final String code) {
            this.code = code;
            return this;
        }

        /**
         * Sets the new value of "codeSystem" (any previous value will be replaced)
         * 
         * @param codeSystem
         *     New value of the "codeSystem" property.
         */
        public Code.Builder<_B> withCodeSystem(final String codeSystem) {
            this.codeSystem = codeSystem;
            return this;
        }

        /**
         * Sets the new value of "codeSystemName" (any previous value will be replaced)
         * 
         * @param codeSystemName
         *     New value of the "codeSystemName" property.
         */
        public Code.Builder<_B> withCodeSystemName(final String codeSystemName) {
            this.codeSystemName = codeSystemName;
            return this;
        }

        /**
         * Sets the new value of "displayName" (any previous value will be replaced)
         * 
         * @param displayName
         *     New value of the "displayName" property.
         */
        public Code.Builder<_B> withDisplayName(final String displayName) {
            this.displayName = displayName;
            return this;
        }

        @Override
        public Code build() {
            if (_storedValue == null) {
                return this.init(new Code());
            } else {
                return ((Code) _storedValue);
            }
        }

    }

    public static class Select
        extends Code.Selector<Code.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static Code.Select _root() {
            return new Code.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, Code.Selector<TRoot, TParent>> code = null;
        private com.kscs.util.jaxb.Selector<TRoot, Code.Selector<TRoot, TParent>> codeSystem = null;
        private com.kscs.util.jaxb.Selector<TRoot, Code.Selector<TRoot, TParent>> codeSystemName = null;
        private com.kscs.util.jaxb.Selector<TRoot, Code.Selector<TRoot, TParent>> displayName = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.code!= null) {
                products.put("code", this.code.init());
            }
            if (this.codeSystem!= null) {
                products.put("codeSystem", this.codeSystem.init());
            }
            if (this.codeSystemName!= null) {
                products.put("codeSystemName", this.codeSystemName.init());
            }
            if (this.displayName!= null) {
                products.put("displayName", this.displayName.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, Code.Selector<TRoot, TParent>> code() {
            return ((this.code == null)?this.code = new com.kscs.util.jaxb.Selector<TRoot, Code.Selector<TRoot, TParent>>(this._root, this, "code"):this.code);
        }

        public com.kscs.util.jaxb.Selector<TRoot, Code.Selector<TRoot, TParent>> codeSystem() {
            return ((this.codeSystem == null)?this.codeSystem = new com.kscs.util.jaxb.Selector<TRoot, Code.Selector<TRoot, TParent>>(this._root, this, "codeSystem"):this.codeSystem);
        }

        public com.kscs.util.jaxb.Selector<TRoot, Code.Selector<TRoot, TParent>> codeSystemName() {
            return ((this.codeSystemName == null)?this.codeSystemName = new com.kscs.util.jaxb.Selector<TRoot, Code.Selector<TRoot, TParent>>(this._root, this, "codeSystemName"):this.codeSystemName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, Code.Selector<TRoot, TParent>> displayName() {
            return ((this.displayName == null)?this.displayName = new com.kscs.util.jaxb.Selector<TRoot, Code.Selector<TRoot, TParent>>(this._root, this, "displayName"):this.displayName);
        }

    }

}
