package com.fasterxml.jackson.databind.introspect;

import androidx.datastore.preferences.protobuf.e;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes9.dex */
public class POJOPropertiesCollector {
    protected final AnnotationIntrospector _annotationIntrospector;
    protected LinkedList<AnnotatedMember> _anyGetters;
    protected LinkedList<AnnotatedMember> _anySetterField;
    protected LinkedList<AnnotatedMethod> _anySetters;
    protected final AnnotatedClass _classDef;
    protected boolean _collected;
    protected final MapperConfig<?> _config;
    protected LinkedList<POJOPropertyBuilder> _creatorProperties;
    protected final boolean _forSerialization;
    protected HashSet<String> _ignoredPropertyNames;
    protected LinkedHashMap<Object, AnnotatedMember> _injectables;
    protected LinkedList<AnnotatedMember> _jsonValueAccessors;
    protected final String _mutatorPrefix;
    protected LinkedHashMap<String, POJOPropertyBuilder> _properties;
    protected final boolean _stdBeanNaming;
    protected final JavaType _type;
    protected final boolean _useAnnotations;
    protected final VisibilityChecker<?> _visibilityChecker;

    public POJOPropertiesCollector(MapperConfig<?> mapperConfig, boolean z10, JavaType javaType, AnnotatedClass annotatedClass, String str) {
        this._config = mapperConfig;
        this._stdBeanNaming = mapperConfig.isEnabled(MapperFeature.USE_STD_BEAN_NAMING);
        this._forSerialization = z10;
        this._type = javaType;
        this._classDef = annotatedClass;
        this._mutatorPrefix = str == null ? SetCommand.ID : str;
        if (mapperConfig.isAnnotationProcessingEnabled()) {
            this._useAnnotations = true;
            this._annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        } else {
            this._useAnnotations = false;
            this._annotationIntrospector = AnnotationIntrospector.nopInstance();
        }
        this._visibilityChecker = mapperConfig.getDefaultVisibilityChecker(javaType.getRawClass(), annotatedClass);
    }

    public void _addCreatorParam(Map<String, POJOPropertyBuilder> map, AnnotatedParameter annotatedParameter) {
        JsonCreator.Mode modeFindCreatorAnnotation;
        String strFindImplicitPropertyName = this._annotationIntrospector.findImplicitPropertyName(annotatedParameter);
        if (strFindImplicitPropertyName == null) {
            strFindImplicitPropertyName = "";
        }
        PropertyName propertyNameFindNameForDeserialization = this._annotationIntrospector.findNameForDeserialization(annotatedParameter);
        boolean z10 = (propertyNameFindNameForDeserialization == null || propertyNameFindNameForDeserialization.isEmpty()) ? false : true;
        if (!z10) {
            if (strFindImplicitPropertyName.isEmpty() || (modeFindCreatorAnnotation = this._annotationIntrospector.findCreatorAnnotation(this._config, annotatedParameter.getOwner())) == null || modeFindCreatorAnnotation == JsonCreator.Mode.DISABLED) {
                return;
            } else {
                propertyNameFindNameForDeserialization = PropertyName.construct(strFindImplicitPropertyName);
            }
        }
        PropertyName propertyName = propertyNameFindNameForDeserialization;
        POJOPropertyBuilder pOJOPropertyBuilder_property = (z10 && strFindImplicitPropertyName.isEmpty()) ? _property(map, propertyName) : _property(map, strFindImplicitPropertyName);
        pOJOPropertyBuilder_property.addCtor(annotatedParameter, propertyName, z10, true, false);
        this._creatorProperties.add(pOJOPropertyBuilder_property);
    }

    public void _addCreators(Map<String, POJOPropertyBuilder> map) {
        if (this._useAnnotations) {
            Iterator<AnnotatedConstructor> it = this._classDef.getConstructors().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnnotatedConstructor next = it.next();
                if (this._creatorProperties == null) {
                    this._creatorProperties = new LinkedList<>();
                }
                int parameterCount = next.getParameterCount();
                for (int i10 = 0; i10 < parameterCount; i10++) {
                    _addCreatorParam(map, next.getParameter(i10));
                }
            }
            for (AnnotatedMethod annotatedMethod : this._classDef.getFactoryMethods()) {
                if (this._creatorProperties == null) {
                    this._creatorProperties = new LinkedList<>();
                }
                int parameterCount2 = annotatedMethod.getParameterCount();
                for (int i11 = 0; i11 < parameterCount2; i11++) {
                    _addCreatorParam(map, annotatedMethod.getParameter(i11));
                }
            }
        }
    }

    public void _addFields(Map<String, POJOPropertyBuilder> map) {
        PropertyName propertyNameConstruct;
        boolean z10;
        boolean z11;
        boolean z12;
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        boolean z13 = (this._forSerialization || this._config.isEnabled(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS)) ? false : true;
        boolean zIsEnabled = this._config.isEnabled(MapperFeature.PROPAGATE_TRANSIENT_MARKER);
        for (AnnotatedField annotatedField : this._classDef.fields()) {
            String strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedField);
            Boolean bool = Boolean.TRUE;
            if (bool.equals(annotationIntrospector.hasAsValue(annotatedField))) {
                if (this._jsonValueAccessors == null) {
                    this._jsonValueAccessors = new LinkedList<>();
                }
                this._jsonValueAccessors.add(annotatedField);
            } else if (bool.equals(annotationIntrospector.hasAnySetter(annotatedField))) {
                if (this._anySetterField == null) {
                    this._anySetterField = new LinkedList<>();
                }
                this._anySetterField.add(annotatedField);
            } else {
                if (strFindImplicitPropertyName == null) {
                    strFindImplicitPropertyName = annotatedField.getName();
                }
                PropertyName propertyNameFindNameForSerialization = this._forSerialization ? annotationIntrospector.findNameForSerialization(annotatedField) : annotationIntrospector.findNameForDeserialization(annotatedField);
                boolean z14 = propertyNameFindNameForSerialization != null;
                if (z14 && propertyNameFindNameForSerialization.isEmpty()) {
                    z10 = false;
                    propertyNameConstruct = PropertyName.construct(strFindImplicitPropertyName, null);
                } else {
                    propertyNameConstruct = propertyNameFindNameForSerialization;
                    z10 = z14;
                }
                boolean zIsFieldVisible = propertyNameConstruct != null;
                if (!zIsFieldVisible) {
                    zIsFieldVisible = this._visibilityChecker.isFieldVisible(annotatedField);
                }
                boolean zHasIgnoreMarker = annotationIntrospector.hasIgnoreMarker(annotatedField);
                if (!annotatedField.isTransient() || z14) {
                    z11 = zHasIgnoreMarker;
                    z12 = zIsFieldVisible;
                } else {
                    z11 = zIsEnabled ? true : zHasIgnoreMarker;
                    z12 = false;
                }
                if (!z13 || propertyNameConstruct != null || z11 || !Modifier.isFinal(annotatedField.getModifiers())) {
                    _property(map, strFindImplicitPropertyName).addField(annotatedField, propertyNameConstruct, z10, z12, z11);
                }
            }
        }
    }

    public void _addGetterMethod(Map<String, POJOPropertyBuilder> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        PropertyName propertyName;
        boolean z10;
        boolean z11;
        String strFindImplicitPropertyName;
        boolean zIsGetterVisible;
        if (annotatedMethod.hasReturnType()) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(annotationIntrospector.hasAnyGetter(annotatedMethod))) {
                if (this._anyGetters == null) {
                    this._anyGetters = new LinkedList<>();
                }
                this._anyGetters.add(annotatedMethod);
                return;
            }
            if (bool.equals(annotationIntrospector.hasAsValue(annotatedMethod))) {
                if (this._jsonValueAccessors == null) {
                    this._jsonValueAccessors = new LinkedList<>();
                }
                this._jsonValueAccessors.add(annotatedMethod);
                return;
            }
            PropertyName propertyNameFindNameForSerialization = annotationIntrospector.findNameForSerialization(annotatedMethod);
            boolean z12 = false;
            boolean z13 = propertyNameFindNameForSerialization != null;
            if (z13) {
                String strFindImplicitPropertyName2 = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
                if (strFindImplicitPropertyName2 == null) {
                    strFindImplicitPropertyName2 = BeanUtil.okNameForGetter(annotatedMethod, this._stdBeanNaming);
                }
                if (strFindImplicitPropertyName2 == null) {
                    strFindImplicitPropertyName2 = annotatedMethod.getName();
                }
                if (propertyNameFindNameForSerialization.isEmpty()) {
                    propertyNameFindNameForSerialization = PropertyName.construct(strFindImplicitPropertyName2, null);
                } else {
                    z12 = z13;
                }
                propertyName = propertyNameFindNameForSerialization;
                z10 = z12;
                z11 = true;
                strFindImplicitPropertyName = strFindImplicitPropertyName2;
            } else {
                strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
                if (strFindImplicitPropertyName == null) {
                    strFindImplicitPropertyName = BeanUtil.okNameForRegularGetter(annotatedMethod, annotatedMethod.getName(), this._stdBeanNaming);
                }
                if (strFindImplicitPropertyName == null) {
                    strFindImplicitPropertyName = BeanUtil.okNameForIsGetter(annotatedMethod, annotatedMethod.getName(), this._stdBeanNaming);
                    if (strFindImplicitPropertyName == null) {
                        return;
                    } else {
                        zIsGetterVisible = this._visibilityChecker.isIsGetterVisible(annotatedMethod);
                    }
                } else {
                    zIsGetterVisible = this._visibilityChecker.isGetterVisible(annotatedMethod);
                }
                propertyName = propertyNameFindNameForSerialization;
                z11 = zIsGetterVisible;
                z10 = z13;
            }
            _property(map, strFindImplicitPropertyName).addGetter(annotatedMethod, propertyName, z10, z11, annotationIntrospector.hasIgnoreMarker(annotatedMethod));
        }
    }

    public void _addInjectables(Map<String, POJOPropertyBuilder> map) {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        for (AnnotatedMember annotatedMember : this._classDef.fields()) {
            _doAddInjectable(annotationIntrospector.findInjectableValue(annotatedMember), annotatedMember);
        }
        for (AnnotatedMethod annotatedMethod : this._classDef.memberMethods()) {
            if (annotatedMethod.getParameterCount() == 1) {
                _doAddInjectable(annotationIntrospector.findInjectableValue(annotatedMethod), annotatedMethod);
            }
        }
    }

    public void _addMethods(Map<String, POJOPropertyBuilder> map) {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        for (AnnotatedMethod annotatedMethod : this._classDef.memberMethods()) {
            int parameterCount = annotatedMethod.getParameterCount();
            if (parameterCount == 0) {
                _addGetterMethod(map, annotatedMethod, annotationIntrospector);
            } else if (parameterCount == 1) {
                _addSetterMethod(map, annotatedMethod, annotationIntrospector);
            } else if (parameterCount == 2 && annotationIntrospector != null && Boolean.TRUE.equals(annotationIntrospector.hasAnySetter(annotatedMethod))) {
                if (this._anySetters == null) {
                    this._anySetters = new LinkedList<>();
                }
                this._anySetters.add(annotatedMethod);
            }
        }
    }

    public void _addSetterMethod(Map<String, POJOPropertyBuilder> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        PropertyName propertyName;
        boolean zIsSetterVisible;
        boolean z10;
        String strFindImplicitPropertyName;
        PropertyName propertyNameFindNameForDeserialization = annotationIntrospector == null ? null : annotationIntrospector.findNameForDeserialization(annotatedMethod);
        boolean z11 = propertyNameFindNameForDeserialization != null;
        if (z11) {
            String strFindImplicitPropertyName2 = annotationIntrospector == null ? null : annotationIntrospector.findImplicitPropertyName(annotatedMethod);
            if (strFindImplicitPropertyName2 == null) {
                strFindImplicitPropertyName2 = BeanUtil.okNameForMutator(annotatedMethod, this._mutatorPrefix, this._stdBeanNaming);
            }
            if (strFindImplicitPropertyName2 == null) {
                strFindImplicitPropertyName2 = annotatedMethod.getName();
            }
            if (propertyNameFindNameForDeserialization.isEmpty()) {
                propertyNameFindNameForDeserialization = PropertyName.construct(strFindImplicitPropertyName2, null);
                z11 = false;
            }
            propertyName = propertyNameFindNameForDeserialization;
            zIsSetterVisible = true;
            z10 = z11;
            strFindImplicitPropertyName = strFindImplicitPropertyName2;
        } else {
            strFindImplicitPropertyName = annotationIntrospector != null ? annotationIntrospector.findImplicitPropertyName(annotatedMethod) : null;
            if (strFindImplicitPropertyName == null) {
                strFindImplicitPropertyName = BeanUtil.okNameForMutator(annotatedMethod, this._mutatorPrefix, this._stdBeanNaming);
            }
            if (strFindImplicitPropertyName == null) {
                return;
            }
            propertyName = propertyNameFindNameForDeserialization;
            zIsSetterVisible = this._visibilityChecker.isSetterVisible(annotatedMethod);
            z10 = z11;
        }
        _property(map, strFindImplicitPropertyName).addSetter(annotatedMethod, propertyName, z10, zIsSetterVisible, annotationIntrospector != null ? annotationIntrospector.hasIgnoreMarker(annotatedMethod) : false);
    }

    public void _doAddInjectable(JacksonInject.Value value, AnnotatedMember annotatedMember) {
        if (value == null) {
            return;
        }
        Object id = value.getId();
        if (this._injectables == null) {
            this._injectables = new LinkedHashMap<>();
        }
        AnnotatedMember annotatedMemberPut = this._injectables.put(id, annotatedMember);
        if (annotatedMemberPut == null || annotatedMemberPut.getClass() != annotatedMember.getClass()) {
            return;
        }
        throw new IllegalArgumentException("Duplicate injectable value with id '" + String.valueOf(id) + "' (of type " + id.getClass().getName() + ")");
    }

    public POJOPropertyBuilder _property(Map<String, POJOPropertyBuilder> map, PropertyName propertyName) {
        String simpleName = propertyName.getSimpleName();
        POJOPropertyBuilder pOJOPropertyBuilder = map.get(simpleName);
        if (pOJOPropertyBuilder != null) {
            return pOJOPropertyBuilder;
        }
        POJOPropertyBuilder pOJOPropertyBuilder2 = new POJOPropertyBuilder(this._config, this._annotationIntrospector, this._forSerialization, propertyName);
        map.put(simpleName, pOJOPropertyBuilder2);
        return pOJOPropertyBuilder2;
    }

    public void _removeUnwantedAccessor(Map<String, POJOPropertyBuilder> map) {
        boolean zIsEnabled = this._config.isEnabled(MapperFeature.INFER_PROPERTY_MUTATORS);
        for (POJOPropertyBuilder pOJOPropertyBuilder : map.values()) {
            if (pOJOPropertyBuilder.removeNonVisible(zIsEnabled) == JsonProperty.Access.READ_ONLY) {
                a(pOJOPropertyBuilder.getName());
            }
        }
    }

    public void _removeUnwantedProperties(Map<String, POJOPropertyBuilder> map) {
        Iterator<POJOPropertyBuilder> it = map.values().iterator();
        while (it.hasNext()) {
            POJOPropertyBuilder next = it.next();
            if (!next.anyVisible()) {
                it.remove();
            } else if (next.anyIgnorals()) {
                if (next.isExplicitlyIncluded()) {
                    next.removeIgnored();
                    if (!next.couldDeserialize()) {
                        a(next.getName());
                    }
                } else {
                    it.remove();
                    a(next.getName());
                }
            }
        }
    }

    public void _renameProperties(Map<String, POJOPropertyBuilder> map) {
        Iterator<Map.Entry<String, POJOPropertyBuilder>> it = map.entrySet().iterator();
        LinkedList<POJOPropertyBuilder> linkedList = null;
        while (it.hasNext()) {
            POJOPropertyBuilder value = it.next().getValue();
            Set<PropertyName> setFindExplicitNames = value.findExplicitNames();
            if (!setFindExplicitNames.isEmpty()) {
                it.remove();
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                if (setFindExplicitNames.size() == 1) {
                    linkedList.add(value.withName(setFindExplicitNames.iterator().next()));
                } else {
                    linkedList.addAll(value.explode(setFindExplicitNames));
                }
            }
        }
        if (linkedList != null) {
            for (POJOPropertyBuilder pOJOPropertyBuilder : linkedList) {
                String name = pOJOPropertyBuilder.getName();
                POJOPropertyBuilder pOJOPropertyBuilder2 = map.get(name);
                if (pOJOPropertyBuilder2 == null) {
                    map.put(name, pOJOPropertyBuilder);
                } else {
                    pOJOPropertyBuilder2.addAll(pOJOPropertyBuilder);
                }
                _updateCreatorProperty(pOJOPropertyBuilder, this._creatorProperties);
                HashSet<String> hashSet = this._ignoredPropertyNames;
                if (hashSet != null) {
                    hashSet.remove(name);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    public void _renameUsing(Map<String, POJOPropertyBuilder> map, PropertyNamingStrategy propertyNamingStrategy) {
        String strNameForGetterMethod;
        POJOPropertyBuilder[] pOJOPropertyBuilderArr = (POJOPropertyBuilder[]) map.values().toArray(new POJOPropertyBuilder[map.size()]);
        map.clear();
        for (POJOPropertyBuilder pOJOPropertyBuilderWithSimpleName : pOJOPropertyBuilderArr) {
            PropertyName fullName = pOJOPropertyBuilderWithSimpleName.getFullName();
            if (pOJOPropertyBuilderWithSimpleName.isExplicitlyNamed() && !this._config.isEnabled(MapperFeature.ALLOW_EXPLICIT_PROPERTY_RENAMING)) {
                strNameForGetterMethod = null;
            } else if (this._forSerialization) {
                if (pOJOPropertyBuilderWithSimpleName.hasGetter()) {
                    strNameForGetterMethod = propertyNamingStrategy.nameForGetterMethod(this._config, pOJOPropertyBuilderWithSimpleName.getGetter(), fullName.getSimpleName());
                } else if (pOJOPropertyBuilderWithSimpleName.hasField()) {
                    strNameForGetterMethod = propertyNamingStrategy.nameForField(this._config, pOJOPropertyBuilderWithSimpleName.getField(), fullName.getSimpleName());
                } else {
                    strNameForGetterMethod = null;
                }
            } else if (pOJOPropertyBuilderWithSimpleName.hasSetter()) {
                strNameForGetterMethod = propertyNamingStrategy.nameForSetterMethod(this._config, pOJOPropertyBuilderWithSimpleName.getSetter(), fullName.getSimpleName());
            } else if (pOJOPropertyBuilderWithSimpleName.hasConstructorParameter()) {
                strNameForGetterMethod = propertyNamingStrategy.nameForConstructorParameter(this._config, pOJOPropertyBuilderWithSimpleName.getConstructorParameter(), fullName.getSimpleName());
            } else if (pOJOPropertyBuilderWithSimpleName.hasField()) {
                strNameForGetterMethod = propertyNamingStrategy.nameForField(this._config, pOJOPropertyBuilderWithSimpleName.getField(), fullName.getSimpleName());
            } else if (pOJOPropertyBuilderWithSimpleName.hasGetter()) {
                strNameForGetterMethod = propertyNamingStrategy.nameForGetterMethod(this._config, pOJOPropertyBuilderWithSimpleName.getGetter(), fullName.getSimpleName());
            } else {
                strNameForGetterMethod = null;
            }
            if (strNameForGetterMethod == null || fullName.hasSimpleName(strNameForGetterMethod)) {
                strNameForGetterMethod = fullName.getSimpleName();
            } else {
                pOJOPropertyBuilderWithSimpleName = pOJOPropertyBuilderWithSimpleName.withSimpleName(strNameForGetterMethod);
            }
            POJOPropertyBuilder pOJOPropertyBuilder = map.get(strNameForGetterMethod);
            if (pOJOPropertyBuilder == null) {
                map.put(strNameForGetterMethod, pOJOPropertyBuilderWithSimpleName);
            } else {
                pOJOPropertyBuilder.addAll(pOJOPropertyBuilderWithSimpleName);
            }
            _updateCreatorProperty(pOJOPropertyBuilderWithSimpleName, this._creatorProperties);
        }
    }

    public void _renameWithWrappers(Map<String, POJOPropertyBuilder> map) {
        PropertyName propertyNameFindWrapperName;
        Iterator<Map.Entry<String, POJOPropertyBuilder>> it = map.entrySet().iterator();
        LinkedList<POJOPropertyBuilder> linkedList = null;
        while (it.hasNext()) {
            POJOPropertyBuilder value = it.next().getValue();
            AnnotatedMember primaryMember = value.getPrimaryMember();
            if (primaryMember != null && (propertyNameFindWrapperName = this._annotationIntrospector.findWrapperName(primaryMember)) != null && propertyNameFindWrapperName.hasSimpleName() && !propertyNameFindWrapperName.equals(value.getFullName())) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(value.withName(propertyNameFindWrapperName));
                it.remove();
            }
        }
        if (linkedList != null) {
            for (POJOPropertyBuilder pOJOPropertyBuilder : linkedList) {
                String name = pOJOPropertyBuilder.getName();
                POJOPropertyBuilder pOJOPropertyBuilder2 = map.get(name);
                if (pOJOPropertyBuilder2 == null) {
                    map.put(name, pOJOPropertyBuilder);
                } else {
                    pOJOPropertyBuilder2.addAll(pOJOPropertyBuilder);
                }
            }
        }
    }

    public void _sortProperties(Map<String, POJOPropertyBuilder> map) {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        Boolean boolFindSerializationSortAlphabetically = annotationIntrospector.findSerializationSortAlphabetically(this._classDef);
        boolean zShouldSortPropertiesAlphabetically = boolFindSerializationSortAlphabetically == null ? this._config.shouldSortPropertiesAlphabetically() : boolFindSerializationSortAlphabetically.booleanValue();
        String[] strArrFindSerializationPropertyOrder = annotationIntrospector.findSerializationPropertyOrder(this._classDef);
        if (!zShouldSortPropertiesAlphabetically && this._creatorProperties == null && strArrFindSerializationPropertyOrder == null) {
            return;
        }
        int size = map.size();
        Map<? extends Object, ? extends Object> treeMap = zShouldSortPropertiesAlphabetically ? new TreeMap<>() : new LinkedHashMap<>(size + size);
        for (POJOPropertyBuilder pOJOPropertyBuilder : map.values()) {
            treeMap.put(pOJOPropertyBuilder.getName(), pOJOPropertyBuilder);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(size + size);
        if (strArrFindSerializationPropertyOrder != null) {
            for (String name : strArrFindSerializationPropertyOrder) {
                POJOPropertyBuilder pOJOPropertyBuilder2 = (POJOPropertyBuilder) treeMap.get(name);
                if (pOJOPropertyBuilder2 == null) {
                    for (POJOPropertyBuilder pOJOPropertyBuilder3 : map.values()) {
                        if (name.equals(pOJOPropertyBuilder3.getInternalName())) {
                            name = pOJOPropertyBuilder3.getName();
                            pOJOPropertyBuilder2 = pOJOPropertyBuilder3;
                            break;
                        }
                    }
                }
                if (pOJOPropertyBuilder2 != null) {
                    linkedHashMap.put(name, pOJOPropertyBuilder2);
                }
            }
        }
        Collection<POJOPropertyBuilder> collectionValues = this._creatorProperties;
        if (collectionValues != null) {
            if (zShouldSortPropertiesAlphabetically) {
                TreeMap treeMap2 = new TreeMap();
                for (POJOPropertyBuilder pOJOPropertyBuilder4 : this._creatorProperties) {
                    treeMap2.put(pOJOPropertyBuilder4.getName(), pOJOPropertyBuilder4);
                }
                collectionValues = treeMap2.values();
            }
            for (POJOPropertyBuilder pOJOPropertyBuilder5 : collectionValues) {
                String name2 = pOJOPropertyBuilder5.getName();
                if (treeMap.containsKey(name2)) {
                    linkedHashMap.put(name2, pOJOPropertyBuilder5);
                }
            }
        }
        linkedHashMap.putAll(treeMap);
        map.clear();
        map.putAll(linkedHashMap);
    }

    public void _updateCreatorProperty(POJOPropertyBuilder pOJOPropertyBuilder, List<POJOPropertyBuilder> list) {
        if (list != null) {
            String internalName = pOJOPropertyBuilder.getInternalName();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (list.get(i10).getInternalName().equals(internalName)) {
                    list.set(i10, pOJOPropertyBuilder);
                    return;
                }
            }
        }
    }

    public final void a(String str) {
        if (this._forSerialization) {
            return;
        }
        if (this._ignoredPropertyNames == null) {
            this._ignoredPropertyNames = new HashSet<>();
        }
        this._ignoredPropertyNames.add(str);
    }

    public void collectAll() {
        PropertyNamingStrategy propertyNamingStrategy;
        PropertyNamingStrategy propertyNamingStrategyNamingStrategyInstance;
        LinkedHashMap<String, POJOPropertyBuilder> linkedHashMap = new LinkedHashMap<>();
        _addFields(linkedHashMap);
        _addMethods(linkedHashMap);
        if (!this._classDef.isNonStaticInnerClass()) {
            _addCreators(linkedHashMap);
        }
        _addInjectables(linkedHashMap);
        _removeUnwantedProperties(linkedHashMap);
        _removeUnwantedAccessor(linkedHashMap);
        _renameProperties(linkedHashMap);
        Iterator<POJOPropertyBuilder> it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            it.next().mergeAnnotations(this._forSerialization);
        }
        Object objFindNamingStrategy = this._annotationIntrospector.findNamingStrategy(this._classDef);
        if (objFindNamingStrategy == null) {
            propertyNamingStrategy = this._config.getPropertyNamingStrategy();
        } else if (objFindNamingStrategy instanceof PropertyNamingStrategy) {
            propertyNamingStrategy = (PropertyNamingStrategy) objFindNamingStrategy;
        } else {
            if (!(objFindNamingStrategy instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned PropertyNamingStrategy definition of type " + objFindNamingStrategy.getClass().getName() + "; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead");
            }
            Class<?> cls = (Class) objFindNamingStrategy;
            if (cls == PropertyNamingStrategy.class) {
                propertyNamingStrategy = null;
            } else {
                if (!PropertyNamingStrategy.class.isAssignableFrom(cls)) {
                    throw new IllegalStateException(e.e(cls, new StringBuilder("AnnotationIntrospector returned Class "), "; expected Class<PropertyNamingStrategy>"));
                }
                HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
                propertyNamingStrategy = (handlerInstantiator == null || (propertyNamingStrategyNamingStrategyInstance = handlerInstantiator.namingStrategyInstance(this._config, this._classDef, cls)) == null) ? (PropertyNamingStrategy) ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers()) : propertyNamingStrategyNamingStrategyInstance;
            }
        }
        if (propertyNamingStrategy != null) {
            _renameUsing(linkedHashMap, propertyNamingStrategy);
        }
        Iterator<POJOPropertyBuilder> it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            it2.next().trimByVisibility();
        }
        if (this._config.isEnabled(MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) {
            _renameWithWrappers(linkedHashMap);
        }
        _sortProperties(linkedHashMap);
        this._properties = linkedHashMap;
        this._collected = true;
    }

    public Class<?> findPOJOBuilderClass() {
        return this._annotationIntrospector.findPOJOBuilder(this._classDef);
    }

    public AnnotationIntrospector getAnnotationIntrospector() {
        return this._annotationIntrospector;
    }

    public AnnotatedMember getAnyGetter() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._anyGetters;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'any-getters' defined (%s vs %s)", this._anyGetters.get(0), this._anyGetters.get(1));
        }
        return this._anyGetters.getFirst();
    }

    public AnnotatedMember getAnySetterField() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._anySetterField;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'any-setter' fields defined (%s vs %s)", this._anySetterField.get(0), this._anySetterField.get(1));
        }
        return this._anySetterField.getFirst();
    }

    public AnnotatedMethod getAnySetterMethod() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMethod> linkedList = this._anySetters;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'any-setter' methods defined (%s vs %s)", this._anySetters.get(0), this._anySetters.get(1));
        }
        return this._anySetters.getFirst();
    }

    public AnnotatedClass getClassDef() {
        return this._classDef;
    }

    public MapperConfig<?> getConfig() {
        return this._config;
    }

    public Set<String> getIgnoredPropertyNames() {
        return this._ignoredPropertyNames;
    }

    public Map<Object, AnnotatedMember> getInjectables() {
        if (!this._collected) {
            collectAll();
        }
        return this._injectables;
    }

    public AnnotatedMember getJsonValueAccessor() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._jsonValueAccessors;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'as-value' properties defined (%s vs %s)", this._jsonValueAccessors.get(0), this._jsonValueAccessors.get(1));
        }
        return this._jsonValueAccessors.get(0);
    }

    @Deprecated
    public AnnotatedMethod getJsonValueMethod() {
        AnnotatedMember jsonValueAccessor = getJsonValueAccessor();
        if (jsonValueAccessor instanceof AnnotatedMethod) {
            return (AnnotatedMethod) jsonValueAccessor;
        }
        return null;
    }

    public ObjectIdInfo getObjectIdInfo() {
        ObjectIdInfo objectIdInfoFindObjectIdInfo = this._annotationIntrospector.findObjectIdInfo(this._classDef);
        return objectIdInfoFindObjectIdInfo != null ? this._annotationIntrospector.findObjectReferenceInfo(this._classDef, objectIdInfoFindObjectIdInfo) : objectIdInfoFindObjectIdInfo;
    }

    public List<BeanPropertyDefinition> getProperties() {
        return new ArrayList(getPropertyMap().values());
    }

    public Map<String, POJOPropertyBuilder> getPropertyMap() {
        if (!this._collected) {
            collectAll();
        }
        return this._properties;
    }

    public JavaType getType() {
        return this._type;
    }

    public void reportProblem(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new IllegalArgumentException("Problem with definition of " + this._classDef + ": " + str);
    }

    public POJOPropertyBuilder _property(Map<String, POJOPropertyBuilder> map, String str) {
        POJOPropertyBuilder pOJOPropertyBuilder = map.get(str);
        if (pOJOPropertyBuilder != null) {
            return pOJOPropertyBuilder;
        }
        POJOPropertyBuilder pOJOPropertyBuilder2 = new POJOPropertyBuilder(this._config, this._annotationIntrospector, this._forSerialization, PropertyName.construct(str));
        map.put(str, pOJOPropertyBuilder2);
        return pOJOPropertyBuilder2;
    }
}
