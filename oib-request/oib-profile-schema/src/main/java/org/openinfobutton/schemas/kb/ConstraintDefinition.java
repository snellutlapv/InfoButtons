//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.09 at 12:58:47 PM CDT 
//


package org.openinfobutton.schemas.kb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java class for ConstraintDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstraintDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tasks" type="{}CDset"/&gt;
 *         &lt;element name="constraint" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{}semanticTypes" minOccurs="0"/&gt;
 *                   &lt;element name="codeSystem" type="{}Id" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstraintDefinition", propOrder = {
    "tasks",
    "constraint"
})
public class ConstraintDefinition {

    @XmlElement(required = true)
    protected CDset tasks;
    @XmlElement(required = true)
    protected List<ConstraintDefinition.Constraint> constraint;

    /**
     * Gets the value of the tasks property.
     * 
     * @return
     *     possible object is
     *     {@link CDset }
     *     
     */
    public CDset getTasks() {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDset }
     *     
     */
    public void setTasks(CDset value) {
        this.tasks = value;
    }

    /**
     * Gets the value of the constraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstraintDefinition.Constraint }
     * 
     * 
     */
    public List<ConstraintDefinition.Constraint> getConstraint() {
        if (constraint == null) {
            constraint = new ArrayList<ConstraintDefinition.Constraint>();
        }
        return this.constraint;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ConstraintDefinition.Builder<_B> _other) {
        _other.tasks = ((this.tasks == null)?null:this.tasks.newCopyBuilder(_other));
        if (this.constraint == null) {
            _other.constraint = null;
        } else {
            _other.constraint = new ArrayList<ConstraintDefinition.Constraint.Builder<ConstraintDefinition.Builder<_B>>>();
            for (ConstraintDefinition.Constraint _item: this.constraint) {
                _other.constraint.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ConstraintDefinition.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ConstraintDefinition.Builder<_B>(_parentBuilder, this, true);
    }

    public ConstraintDefinition.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ConstraintDefinition.Builder<Void> builder() {
        return new ConstraintDefinition.Builder<Void>(null, null, false);
    }

    public static<_B >ConstraintDefinition.Builder<_B> copyOf(final ConstraintDefinition _other) {
        final ConstraintDefinition.Builder<_B> _newBuilder = new ConstraintDefinition.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ConstraintDefinition.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree tasksPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("tasks"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(tasksPropertyTree!= null):((tasksPropertyTree == null)||(!tasksPropertyTree.isLeaf())))) {
            _other.tasks = ((this.tasks == null)?null:this.tasks.newCopyBuilder(_other, tasksPropertyTree, _propertyTreeUse));
        }
        final PropertyTree constraintPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("constraint"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(constraintPropertyTree!= null):((constraintPropertyTree == null)||(!constraintPropertyTree.isLeaf())))) {
            if (this.constraint == null) {
                _other.constraint = null;
            } else {
                _other.constraint = new ArrayList<ConstraintDefinition.Constraint.Builder<ConstraintDefinition.Builder<_B>>>();
                for (ConstraintDefinition.Constraint _item: this.constraint) {
                    _other.constraint.add(((_item == null)?null:_item.newCopyBuilder(_other, constraintPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ConstraintDefinition.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ConstraintDefinition.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ConstraintDefinition.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ConstraintDefinition.Builder<_B> copyOf(final ConstraintDefinition _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ConstraintDefinition.Builder<_B> _newBuilder = new ConstraintDefinition.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ConstraintDefinition.Builder<Void> copyExcept(final ConstraintDefinition _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ConstraintDefinition.Builder<Void> copyOnly(final ConstraintDefinition _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ConstraintDefinition _storedValue;
        private CDset.Builder<ConstraintDefinition.Builder<_B>> tasks;
        private List<ConstraintDefinition.Constraint.Builder<ConstraintDefinition.Builder<_B>>> constraint;

        public Builder(final _B _parentBuilder, final ConstraintDefinition _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.tasks = ((_other.tasks == null)?null:_other.tasks.newCopyBuilder(this));
                    if (_other.constraint == null) {
                        this.constraint = null;
                    } else {
                        this.constraint = new ArrayList<ConstraintDefinition.Constraint.Builder<ConstraintDefinition.Builder<_B>>>();
                        for (ConstraintDefinition.Constraint _item: _other.constraint) {
                            this.constraint.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ConstraintDefinition _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree tasksPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("tasks"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(tasksPropertyTree!= null):((tasksPropertyTree == null)||(!tasksPropertyTree.isLeaf())))) {
                        this.tasks = ((_other.tasks == null)?null:_other.tasks.newCopyBuilder(this, tasksPropertyTree, _propertyTreeUse));
                    }
                    final PropertyTree constraintPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("constraint"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(constraintPropertyTree!= null):((constraintPropertyTree == null)||(!constraintPropertyTree.isLeaf())))) {
                        if (_other.constraint == null) {
                            this.constraint = null;
                        } else {
                            this.constraint = new ArrayList<ConstraintDefinition.Constraint.Builder<ConstraintDefinition.Builder<_B>>>();
                            for (ConstraintDefinition.Constraint _item: _other.constraint) {
                                this.constraint.add(((_item == null)?null:_item.newCopyBuilder(this, constraintPropertyTree, _propertyTreeUse)));
                            }
                        }
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

        protected<_P extends ConstraintDefinition >_P init(final _P _product) {
            _product.tasks = ((this.tasks == null)?null:this.tasks.build());
            if (this.constraint!= null) {
                final List<ConstraintDefinition.Constraint> constraint = new ArrayList<ConstraintDefinition.Constraint>(this.constraint.size());
                for (ConstraintDefinition.Constraint.Builder<ConstraintDefinition.Builder<_B>> _item: this.constraint) {
                    constraint.add(_item.build());
                }
                _product.constraint = constraint;
            }
            return _product;
        }

        /**
         * Sets the new value of "tasks" (any previous value will be replaced)
         * 
         * @param tasks
         *     New value of the "tasks" property.
         */
        public ConstraintDefinition.Builder<_B> withTasks(final CDset tasks) {
            this.tasks = ((tasks == null)?null:new CDset.Builder<ConstraintDefinition.Builder<_B>>(this, tasks, false));
            return this;
        }

        /**
         * Returns a new builder to build the value of the "tasks" property (replacing previous value).
         * Use {@link org.openinfobutton.schemas.kb.CDset.Builder#end()} to return to the current builder.
         * 
         * @return
         *     A new builder to build the value of the "tasks" property.
         *     Use {@link org.openinfobutton.schemas.kb.CDset.Builder#end()} to return to the current builder.
         */
        public CDset.Builder<? extends ConstraintDefinition.Builder<_B>> withTasks() {
            return this.tasks = new CDset.Builder<ConstraintDefinition.Builder<_B>>(this, null, false);
        }

        /**
         * Adds the given items to the value of "constraint"
         * 
         * @param constraint
         *     Items to add to the value of the "constraint" property
         */
        public ConstraintDefinition.Builder<_B> addConstraint(final Iterable<? extends ConstraintDefinition.Constraint> constraint) {
            if (constraint!= null) {
                if (this.constraint == null) {
                    this.constraint = new ArrayList<ConstraintDefinition.Constraint.Builder<ConstraintDefinition.Builder<_B>>>();
                }
                for (ConstraintDefinition.Constraint _item: constraint) {
                    this.constraint.add(new ConstraintDefinition.Constraint.Builder<ConstraintDefinition.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Sets the new value of "constraint" (any previous value will be replaced)
         * 
         * @param constraint
         *     New value of the "constraint" property.
         */
        public ConstraintDefinition.Builder<_B> withConstraint(final Iterable<? extends ConstraintDefinition.Constraint> constraint) {
            if (this.constraint!= null) {
                this.constraint.clear();
            }
            return addConstraint(constraint);
        }

        /**
         * Adds the given items to the value of "constraint"
         * 
         * @param constraint
         *     Items to add to the value of the "constraint" property
         */
        public ConstraintDefinition.Builder<_B> addConstraint(ConstraintDefinition.Constraint... constraint) {
            addConstraint(Arrays.asList(constraint));
            return this;
        }

        /**
         * Sets the new value of "constraint" (any previous value will be replaced)
         * 
         * @param constraint
         *     New value of the "constraint" property.
         */
        public ConstraintDefinition.Builder<_B> withConstraint(ConstraintDefinition.Constraint... constraint) {
            withConstraint(Arrays.asList(constraint));
            return this;
        }

        /**
         * Returns a new builder to build an additional value of the "Constraint" property.
         * Use {@link org.openinfobutton.schemas.kb.ConstraintDefinition.Constraint.Builder#end()} to return to the current builder.
         * 
         * @return
         *     a new builder to build an additional value of the "Constraint" property.
         *     Use {@link org.openinfobutton.schemas.kb.ConstraintDefinition.Constraint.Builder#end()} to return to the current builder.
         */
        public ConstraintDefinition.Constraint.Builder<? extends ConstraintDefinition.Builder<_B>> addConstraint() {
            if (this.constraint == null) {
                this.constraint = new ArrayList<ConstraintDefinition.Constraint.Builder<ConstraintDefinition.Builder<_B>>>();
            }
            final ConstraintDefinition.Constraint.Builder<ConstraintDefinition.Builder<_B>> constraint_Builder = new ConstraintDefinition.Constraint.Builder<ConstraintDefinition.Builder<_B>>(this, null, false);
            this.constraint.add(constraint_Builder);
            return constraint_Builder;
        }

        @Override
        public ConstraintDefinition build() {
            if (_storedValue == null) {
                return this.init(new ConstraintDefinition());
            } else {
                return ((ConstraintDefinition) _storedValue);
            }
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{}semanticTypes" minOccurs="0"/&gt;
     *         &lt;element name="codeSystem" type="{}Id" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "semanticTypes",
        "codeSystem"
    })
    public static class Constraint {

        protected CDset semanticTypes;
        @XmlElement(required = true)
        protected List<Id> codeSystem;

        /**
         * Use when the coverage domain for a specific resource is defined based on a semantic type (e.g., drugs,  symptoms, diseases)
         * 
         * @return
         *     possible object is
         *     {@link CDset }
         *     
         */
        public CDset getSemanticTypes() {
            return semanticTypes;
        }

        /**
         * Sets the value of the semanticTypes property.
         * 
         * @param value
         *     allowed object is
         *     {@link CDset }
         *     
         */
        public void setSemanticTypes(CDset value) {
            this.semanticTypes = value;
        }

        /**
         * Gets the value of the codeSystem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the codeSystem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCodeSystem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Id }
         * 
         * 
         */
        public List<Id> getCodeSystem() {
            if (codeSystem == null) {
                codeSystem = new ArrayList<Id>();
            }
            return this.codeSystem;
        }

        /**
         * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
         * 
         * @param _other
         *     A builder instance to which the state of this object will be copied.
         */
        public<_B >void copyTo(final ConstraintDefinition.Constraint.Builder<_B> _other) {
            _other.semanticTypes = ((this.semanticTypes == null)?null:this.semanticTypes.newCopyBuilder(_other));
            if (this.codeSystem == null) {
                _other.codeSystem = null;
            } else {
                _other.codeSystem = new ArrayList<Id.Builder<ConstraintDefinition.Constraint.Builder<_B>>>();
                for (Id _item: this.codeSystem) {
                    _other.codeSystem.add(((_item == null)?null:_item.newCopyBuilder(_other)));
                }
            }
        }

        public<_B >ConstraintDefinition.Constraint.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
            return new ConstraintDefinition.Constraint.Builder<_B>(_parentBuilder, this, true);
        }

        public ConstraintDefinition.Constraint.Builder<Void> newCopyBuilder() {
            return newCopyBuilder(null);
        }

        public static ConstraintDefinition.Constraint.Builder<Void> builder() {
            return new ConstraintDefinition.Constraint.Builder<Void>(null, null, false);
        }

        public static<_B >ConstraintDefinition.Constraint.Builder<_B> copyOf(final ConstraintDefinition.Constraint _other) {
            final ConstraintDefinition.Constraint.Builder<_B> _newBuilder = new ConstraintDefinition.Constraint.Builder<_B>(null, null, false);
            _other.copyTo(_newBuilder);
            return _newBuilder;
        }

        /**
         * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
         * 
         * @param _other
         *     A builder instance to which the state of this object will be copied.
         */
        public<_B >void copyTo(final ConstraintDefinition.Constraint.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            final PropertyTree semanticTypesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("semanticTypes"));
            if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(semanticTypesPropertyTree!= null):((semanticTypesPropertyTree == null)||(!semanticTypesPropertyTree.isLeaf())))) {
                _other.semanticTypes = ((this.semanticTypes == null)?null:this.semanticTypes.newCopyBuilder(_other, semanticTypesPropertyTree, _propertyTreeUse));
            }
            final PropertyTree codeSystemPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("codeSystem"));
            if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(codeSystemPropertyTree!= null):((codeSystemPropertyTree == null)||(!codeSystemPropertyTree.isLeaf())))) {
                if (this.codeSystem == null) {
                    _other.codeSystem = null;
                } else {
                    _other.codeSystem = new ArrayList<Id.Builder<ConstraintDefinition.Constraint.Builder<_B>>>();
                    for (Id _item: this.codeSystem) {
                        _other.codeSystem.add(((_item == null)?null:_item.newCopyBuilder(_other, codeSystemPropertyTree, _propertyTreeUse)));
                    }
                }
            }
        }

        public<_B >ConstraintDefinition.Constraint.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            return new ConstraintDefinition.Constraint.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
        }

        public ConstraintDefinition.Constraint.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
        }

        public static<_B >ConstraintDefinition.Constraint.Builder<_B> copyOf(final ConstraintDefinition.Constraint _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            final ConstraintDefinition.Constraint.Builder<_B> _newBuilder = new ConstraintDefinition.Constraint.Builder<_B>(null, null, false);
            _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
            return _newBuilder;
        }

        public static ConstraintDefinition.Constraint.Builder<Void> copyExcept(final ConstraintDefinition.Constraint _other, final PropertyTree _propertyTree) {
            return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
        }

        public static ConstraintDefinition.Constraint.Builder<Void> copyOnly(final ConstraintDefinition.Constraint _other, final PropertyTree _propertyTree) {
            return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
        }

        public static class Builder<_B >implements Buildable
        {

            protected final _B _parentBuilder;
            protected final ConstraintDefinition.Constraint _storedValue;
            private CDset.Builder<ConstraintDefinition.Constraint.Builder<_B>> semanticTypes;
            private List<Id.Builder<ConstraintDefinition.Constraint.Builder<_B>>> codeSystem;

            public Builder(final _B _parentBuilder, final ConstraintDefinition.Constraint _other, final boolean _copy) {
                this._parentBuilder = _parentBuilder;
                if (_other!= null) {
                    if (_copy) {
                        _storedValue = null;
                        this.semanticTypes = ((_other.semanticTypes == null)?null:_other.semanticTypes.newCopyBuilder(this));
                        if (_other.codeSystem == null) {
                            this.codeSystem = null;
                        } else {
                            this.codeSystem = new ArrayList<Id.Builder<ConstraintDefinition.Constraint.Builder<_B>>>();
                            for (Id _item: _other.codeSystem) {
                                this.codeSystem.add(((_item == null)?null:_item.newCopyBuilder(this)));
                            }
                        }
                    } else {
                        _storedValue = _other;
                    }
                } else {
                    _storedValue = null;
                }
            }

            public Builder(final _B _parentBuilder, final ConstraintDefinition.Constraint _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
                this._parentBuilder = _parentBuilder;
                if (_other!= null) {
                    if (_copy) {
                        _storedValue = null;
                        final PropertyTree semanticTypesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("semanticTypes"));
                        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(semanticTypesPropertyTree!= null):((semanticTypesPropertyTree == null)||(!semanticTypesPropertyTree.isLeaf())))) {
                            this.semanticTypes = ((_other.semanticTypes == null)?null:_other.semanticTypes.newCopyBuilder(this, semanticTypesPropertyTree, _propertyTreeUse));
                        }
                        final PropertyTree codeSystemPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("codeSystem"));
                        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(codeSystemPropertyTree!= null):((codeSystemPropertyTree == null)||(!codeSystemPropertyTree.isLeaf())))) {
                            if (_other.codeSystem == null) {
                                this.codeSystem = null;
                            } else {
                                this.codeSystem = new ArrayList<Id.Builder<ConstraintDefinition.Constraint.Builder<_B>>>();
                                for (Id _item: _other.codeSystem) {
                                    this.codeSystem.add(((_item == null)?null:_item.newCopyBuilder(this, codeSystemPropertyTree, _propertyTreeUse)));
                                }
                            }
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

            protected<_P extends ConstraintDefinition.Constraint >_P init(final _P _product) {
                _product.semanticTypes = ((this.semanticTypes == null)?null:this.semanticTypes.build());
                if (this.codeSystem!= null) {
                    final List<Id> codeSystem = new ArrayList<Id>(this.codeSystem.size());
                    for (Id.Builder<ConstraintDefinition.Constraint.Builder<_B>> _item: this.codeSystem) {
                        codeSystem.add(_item.build());
                    }
                    _product.codeSystem = codeSystem;
                }
                return _product;
            }

            /**
             * Sets the new value of "semanticTypes" (any previous value will be replaced)
             * 
             * @param semanticTypes
             *     New value of the "semanticTypes" property.
             */
            public ConstraintDefinition.Constraint.Builder<_B> withSemanticTypes(final CDset semanticTypes) {
                this.semanticTypes = ((semanticTypes == null)?null:new CDset.Builder<ConstraintDefinition.Constraint.Builder<_B>>(this, semanticTypes, false));
                return this;
            }

            /**
             * Returns a new builder to build the value of the "semanticTypes" property (replacing previous value).
             * Use {@link org.openinfobutton.schemas.kb.CDset.Builder#end()} to return to the current builder.
             * 
             * @return
             *     A new builder to build the value of the "semanticTypes" property.
             *     Use {@link org.openinfobutton.schemas.kb.CDset.Builder#end()} to return to the current builder.
             */
            public CDset.Builder<? extends ConstraintDefinition.Constraint.Builder<_B>> withSemanticTypes() {
                return this.semanticTypes = new CDset.Builder<ConstraintDefinition.Constraint.Builder<_B>>(this, null, false);
            }

            /**
             * Adds the given items to the value of "codeSystem"
             * 
             * @param codeSystem
             *     Items to add to the value of the "codeSystem" property
             */
            public ConstraintDefinition.Constraint.Builder<_B> addCodeSystem(final Iterable<? extends Id> codeSystem) {
                if (codeSystem!= null) {
                    if (this.codeSystem == null) {
                        this.codeSystem = new ArrayList<Id.Builder<ConstraintDefinition.Constraint.Builder<_B>>>();
                    }
                    for (Id _item: codeSystem) {
                        this.codeSystem.add(new Id.Builder<ConstraintDefinition.Constraint.Builder<_B>>(this, _item, false));
                    }
                }
                return this;
            }

            /**
             * Sets the new value of "codeSystem" (any previous value will be replaced)
             * 
             * @param codeSystem
             *     New value of the "codeSystem" property.
             */
            public ConstraintDefinition.Constraint.Builder<_B> withCodeSystem(final Iterable<? extends Id> codeSystem) {
                if (this.codeSystem!= null) {
                    this.codeSystem.clear();
                }
                return addCodeSystem(codeSystem);
            }

            /**
             * Adds the given items to the value of "codeSystem"
             * 
             * @param codeSystem
             *     Items to add to the value of the "codeSystem" property
             */
            public ConstraintDefinition.Constraint.Builder<_B> addCodeSystem(Id... codeSystem) {
                addCodeSystem(Arrays.asList(codeSystem));
                return this;
            }

            /**
             * Sets the new value of "codeSystem" (any previous value will be replaced)
             * 
             * @param codeSystem
             *     New value of the "codeSystem" property.
             */
            public ConstraintDefinition.Constraint.Builder<_B> withCodeSystem(Id... codeSystem) {
                withCodeSystem(Arrays.asList(codeSystem));
                return this;
            }

            /**
             * Returns a new builder to build an additional value of the "CodeSystem" property.
             * Use {@link org.openinfobutton.schemas.kb.Id.Builder#end()} to return to the current builder.
             * 
             * @return
             *     a new builder to build an additional value of the "CodeSystem" property.
             *     Use {@link org.openinfobutton.schemas.kb.Id.Builder#end()} to return to the current builder.
             */
            public Id.Builder<? extends ConstraintDefinition.Constraint.Builder<_B>> addCodeSystem() {
                if (this.codeSystem == null) {
                    this.codeSystem = new ArrayList<Id.Builder<ConstraintDefinition.Constraint.Builder<_B>>>();
                }
                final Id.Builder<ConstraintDefinition.Constraint.Builder<_B>> codeSystem_Builder = new Id.Builder<ConstraintDefinition.Constraint.Builder<_B>>(this, null, false);
                this.codeSystem.add(codeSystem_Builder);
                return codeSystem_Builder;
            }

            @Override
            public ConstraintDefinition.Constraint build() {
                if (_storedValue == null) {
                    return this.init(new ConstraintDefinition.Constraint());
                } else {
                    return ((ConstraintDefinition.Constraint) _storedValue);
                }
            }

        }

        public static class Select
            extends ConstraintDefinition.Constraint.Selector<ConstraintDefinition.Constraint.Select, Void>
        {


            Select() {
                super(null, null, null);
            }

            public static ConstraintDefinition.Constraint.Select _root() {
                return new ConstraintDefinition.Constraint.Select();
            }

        }

        public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
            extends com.kscs.util.jaxb.Selector<TRoot, TParent>
        {

            private CDset.Selector<TRoot, ConstraintDefinition.Constraint.Selector<TRoot, TParent>> semanticTypes = null;
            private Id.Selector<TRoot, ConstraintDefinition.Constraint.Selector<TRoot, TParent>> codeSystem = null;

            public Selector(final TRoot root, final TParent parent, final String propertyName) {
                super(root, parent, propertyName);
            }

            @Override
            public Map<String, PropertyTree> buildChildren() {
                final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
                products.putAll(super.buildChildren());
                if (this.semanticTypes!= null) {
                    products.put("semanticTypes", this.semanticTypes.init());
                }
                if (this.codeSystem!= null) {
                    products.put("codeSystem", this.codeSystem.init());
                }
                return products;
            }

            public CDset.Selector<TRoot, ConstraintDefinition.Constraint.Selector<TRoot, TParent>> semanticTypes() {
                return ((this.semanticTypes == null)?this.semanticTypes = new CDset.Selector<TRoot, ConstraintDefinition.Constraint.Selector<TRoot, TParent>>(this._root, this, "semanticTypes"):this.semanticTypes);
            }

            public Id.Selector<TRoot, ConstraintDefinition.Constraint.Selector<TRoot, TParent>> codeSystem() {
                return ((this.codeSystem == null)?this.codeSystem = new Id.Selector<TRoot, ConstraintDefinition.Constraint.Selector<TRoot, TParent>>(this._root, this, "codeSystem"):this.codeSystem);
            }

        }

    }

    public static class Select
        extends ConstraintDefinition.Selector<ConstraintDefinition.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ConstraintDefinition.Select _root() {
            return new ConstraintDefinition.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private CDset.Selector<TRoot, ConstraintDefinition.Selector<TRoot, TParent>> tasks = null;
        private ConstraintDefinition.Constraint.Selector<TRoot, ConstraintDefinition.Selector<TRoot, TParent>> constraint = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.tasks!= null) {
                products.put("tasks", this.tasks.init());
            }
            if (this.constraint!= null) {
                products.put("constraint", this.constraint.init());
            }
            return products;
        }

        public CDset.Selector<TRoot, ConstraintDefinition.Selector<TRoot, TParent>> tasks() {
            return ((this.tasks == null)?this.tasks = new CDset.Selector<TRoot, ConstraintDefinition.Selector<TRoot, TParent>>(this._root, this, "tasks"):this.tasks);
        }

        public ConstraintDefinition.Constraint.Selector<TRoot, ConstraintDefinition.Selector<TRoot, TParent>> constraint() {
            return ((this.constraint == null)?this.constraint = new ConstraintDefinition.Constraint.Selector<TRoot, ConstraintDefinition.Selector<TRoot, TParent>>(this._root, this, "constraint"):this.constraint);
        }

    }

}
