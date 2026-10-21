package com.fasterxml.jackson.databind.deser;

import androidx.datastore.preferences.protobuf.e;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers;
import com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.std.JdkDeserializers;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.ConstantValueInstantiator;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BasicDeserializerFactory extends DeserializerFactory implements Serializable {
    protected static final PropertyName UNWRAPPED_CREATOR_PARAM_NAME = new PropertyName("@JsonUnwrapped");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final HashMap<String, Class<? extends Map>> f43188p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final HashMap<String, Class<? extends Collection>> f43189q0;
    protected final DeserializerFactoryConfig _factoryConfig;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43190a;

        static {
            int[] iArr = new int[JsonCreator.Mode.values().length];
            f43190a = iArr;
            try {
                iArr[JsonCreator.Mode.DELEGATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43190a[JsonCreator.Mode.PROPERTIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43190a[JsonCreator.Mode.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap<String, Class<? extends Map>> map = new HashMap<>();
        f43188p0 = map;
        map.put(Map.class.getName(), LinkedHashMap.class);
        map.put(AbstractMap.class.getName(), LinkedHashMap.class);
        map.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
        map.put(SortedMap.class.getName(), TreeMap.class);
        map.put(NavigableMap.class.getName(), TreeMap.class);
        map.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
        HashMap<String, Class<? extends Collection>> map2 = new HashMap<>();
        f43189q0 = map2;
        map2.put(Collection.class.getName(), ArrayList.class);
        map2.put(List.class.getName(), ArrayList.class);
        map2.put(Set.class.getName(), HashSet.class);
        map2.put(SortedSet.class.getName(), TreeSet.class);
        map2.put(Queue.class.getName(), LinkedList.class);
        map2.put(AbstractList.class.getName(), ArrayList.class);
        map2.put(AbstractSet.class.getName(), HashSet.class);
        map2.put("java.util.Deque", LinkedList.class);
        map2.put("java.util.NavigableSet", TreeSet.class);
    }

    public BasicDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        this._factoryConfig = deserializerFactoryConfig;
    }

    public static boolean a(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, BeanPropertyDefinition beanPropertyDefinition) {
        String name;
        if ((beanPropertyDefinition == null || !beanPropertyDefinition.isExplicitlyNamed()) && annotationIntrospector.findInjectableValue(annotatedWithParams.getParameter(0)) == null) {
            return (beanPropertyDefinition == null || (name = beanPropertyDefinition.getName()) == null || name.isEmpty() || !beanPropertyDefinition.couldSerialize()) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x025a  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01ec  */
    /* JADX WARN: Multi-variable type inference failed */
    public void _addDeserializerConstructors(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, Map<AnnotatedWithParams, BeanPropertyDefinition[]> map) throws JsonMappingException {
        int i10;
        AnnotatedWithParams annotatedWithParams;
        AnnotatedWithParams annotatedWithParams2;
        PropertyName propertyName;
        AnnotatedWithParams annotatedWithParams3;
        Iterator it;
        char c10;
        int i11;
        int i12;
        CreatorCandidate creatorCandidate;
        int i13;
        Iterator it2;
        int i14;
        visibilityChecker = visibilityChecker;
        if (beanDescription.isNonStaticInnerClass()) {
            return;
        }
        AnnotatedConstructor annotatedConstructorFindDefaultConstructor = beanDescription.findDefaultConstructor();
        if (annotatedConstructorFindDefaultConstructor != null && (!creatorCollector.hasDefaultCreator() || _hasCreatorAnnotation(deserializationContext, annotatedConstructorFindDefaultConstructor))) {
            creatorCollector.setDefaultCreator(annotatedConstructorFindDefaultConstructor);
        }
        LinkedList linkedList = new LinkedList();
        Iterator<AnnotatedConstructor> it3 = beanDescription.getConstructors().iterator();
        int i15 = 0;
        while (true) {
            i10 = 1;
            annotatedWithParams = null;
            if (!it3.hasNext()) {
                break;
            }
            AnnotatedConstructor next = it3.next();
            JsonCreator.Mode modeFindCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(deserializationContext.getConfig(), next);
            if (JsonCreator.Mode.DISABLED != modeFindCreatorAnnotation) {
                if (modeFindCreatorAnnotation != null) {
                    int i16 = a.f43190a[modeFindCreatorAnnotation.ordinal()];
                    if (i16 == 1) {
                        _addExplicitDelegatingCreator(deserializationContext, beanDescription, creatorCollector, CreatorCandidate.construct(annotationIntrospector, next, null));
                    } else if (i16 != 2) {
                        _addExplicitAnyCreator(deserializationContext, beanDescription, creatorCollector, CreatorCandidate.construct(annotationIntrospector, next, map.get(next)));
                    } else {
                        _addExplicitPropertyCreator(deserializationContext, beanDescription, creatorCollector, CreatorCandidate.construct(annotationIntrospector, next, map.get(next)));
                    }
                    i15++;
                } else if (visibilityChecker.isCreatorVisible(next)) {
                    linkedList.add(CreatorCandidate.construct(annotationIntrospector, next, map.get(next)));
                }
            }
        }
        if (i15 > 0) {
            return;
        }
        Iterator it4 = linkedList.iterator();
        LinkedList linkedList2 = null;
        while (it4.hasNext()) {
            CreatorCandidate creatorCandidate2 = (CreatorCandidate) it4.next();
            int iParamCount = creatorCandidate2.paramCount();
            AnnotatedWithParams annotatedWithParamsCreator = creatorCandidate2.creator();
            if (iParamCount == i10) {
                BeanPropertyDefinition beanPropertyDefinitionPropertyDef = creatorCandidate2.propertyDef(0);
                if (a(annotationIntrospector, annotatedWithParamsCreator, beanPropertyDefinitionPropertyDef)) {
                    SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[i10];
                    annotatedWithParams3 = annotatedWithParams;
                    settableBeanPropertyArr[0] = constructCreatorProperty(deserializationContext, beanDescription, creatorCandidate2.paramName(0), 0, creatorCandidate2.parameter(0), creatorCandidate2.injection(0));
                    creatorCollector.addPropertyCreator(annotatedWithParamsCreator, false, settableBeanPropertyArr);
                } else {
                    annotatedWithParams3 = annotatedWithParams;
                    _handleSingleArgumentCreator(creatorCollector, annotatedWithParamsCreator, false, visibilityChecker.isCreatorVisible(annotatedWithParamsCreator));
                    if (beanPropertyDefinitionPropertyDef != null) {
                        ((POJOPropertyBuilder) beanPropertyDefinitionPropertyDef).removeConstructors();
                    }
                }
                it = it4;
            } else {
                annotatedWithParams3 = annotatedWithParams;
                SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[iParamCount];
                int i17 = -1;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                while (i18 < iParamCount) {
                    AnnotatedParameter parameter = annotatedWithParamsCreator.getParameter(i18);
                    BeanPropertyDefinition beanPropertyDefinitionPropertyDef2 = creatorCandidate2.propertyDef(i18);
                    JacksonInject.Value valueFindInjectableValue = annotationIntrospector.findInjectableValue(parameter);
                    Object fullName = beanPropertyDefinitionPropertyDef2 == null ? annotatedWithParams3 : beanPropertyDefinitionPropertyDef2.getFullName();
                    if (beanPropertyDefinitionPropertyDef2 == null || !beanPropertyDefinitionPropertyDef2.isExplicitlyNamed()) {
                        i12 = i18;
                        creatorCandidate = creatorCandidate2;
                        i13 = i17;
                        it2 = it4;
                        i14 = iParamCount;
                        if (valueFindInjectableValue != null) {
                            i20++;
                            settableBeanPropertyArr2[i12] = constructCreatorProperty(deserializationContext, beanDescription, fullName, i12, parameter, valueFindInjectableValue);
                        } else if (annotationIntrospector.findUnwrappingNameTransformer(parameter) != null) {
                            _reportUnwrappedCreatorProperty(deserializationContext, beanDescription, parameter);
                        } else {
                            if (i13 < 0) {
                                i17 = i12;
                            }
                            i18 = i12 + 1;
                            iParamCount = i14;
                            it4 = it2;
                            creatorCandidate2 = creatorCandidate;
                        }
                    } else {
                        i19++;
                        i12 = i18;
                        it2 = it4;
                        i14 = iParamCount;
                        creatorCandidate = creatorCandidate2;
                        i13 = i17;
                        settableBeanPropertyArr2[i12] = constructCreatorProperty(deserializationContext, beanDescription, fullName, i12, parameter, valueFindInjectableValue);
                    }
                    i17 = i13;
                    i18 = i12 + 1;
                    iParamCount = i14;
                    it4 = it2;
                    creatorCandidate2 = creatorCandidate;
                }
                CreatorCandidate creatorCandidate3 = creatorCandidate2;
                int i21 = i17;
                it = it4;
                int i22 = iParamCount;
                if (i19 > 0 || i20 > 0) {
                    if (i19 + i20 == i22) {
                        creatorCollector.addPropertyCreator(annotatedWithParamsCreator, false, settableBeanPropertyArr2);
                    } else if (i19 == 0 && i20 + 1 == i22) {
                        creatorCollector.addDelegatingCreator(annotatedWithParamsCreator, false, settableBeanPropertyArr2, 0);
                    } else {
                        PropertyName propertyNameFindImplicitParamName = creatorCandidate3.findImplicitParamName(i21);
                        if (propertyNameFindImplicitParamName == null || propertyNameFindImplicitParamName.isEmpty()) {
                            c10 = 2;
                            i11 = 1;
                            deserializationContext.reportBadTypeDefinition(beanDescription, "Argument #%d of constructor %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(i21), annotatedWithParamsCreator);
                        }
                        if (!creatorCollector.hasDefaultCreator()) {
                            if (linkedList2 == null) {
                                linkedList2 = new LinkedList();
                            }
                            LinkedList linkedList3 = linkedList2;
                            linkedList3.add(annotatedWithParamsCreator);
                            linkedList2 = linkedList3;
                        }
                        i10 = i11;
                        annotatedWithParams = annotatedWithParams3;
                        it4 = it;
                    }
                }
                c10 = 2;
                i11 = 1;
                if (!creatorCollector.hasDefaultCreator()) {
                    if (linkedList2 == null) {
                        linkedList2 = new LinkedList();
                    }
                    LinkedList linkedList4 = linkedList2;
                    linkedList4.add(annotatedWithParamsCreator);
                    linkedList2 = linkedList4;
                }
                i10 = i11;
                annotatedWithParams = annotatedWithParams3;
                it4 = it;
            }
            annotatedWithParams = annotatedWithParams3;
            it4 = it;
            i10 = 1;
        }
        AnnotatedWithParams annotatedWithParams4 = annotatedWithParams;
        if (linkedList2 == null || creatorCollector.hasDelegatingCreator() || creatorCollector.hasPropertyBasedCreator()) {
            return;
        }
        Iterator it5 = linkedList2.iterator();
        AnnotatedWithParams annotatedWithParams5 = annotatedWithParams4;
        SettableBeanProperty[] settableBeanPropertyArr3 = annotatedWithParams5;
        while (true) {
            if (!it5.hasNext()) {
                annotatedWithParams2 = annotatedWithParams5;
                break;
            }
            AnnotatedWithParams annotatedWithParams6 = (AnnotatedWithParams) it5.next();
            if (visibilityChecker.isCreatorVisible(annotatedWithParams6)) {
                int parameterCount = annotatedWithParams6.getParameterCount();
                SettableBeanProperty[] settableBeanPropertyArr4 = new SettableBeanProperty[parameterCount];
                int i23 = 0;
                while (true) {
                    if (i23 >= parameterCount) {
                        SettableBeanProperty[] settableBeanPropertyArr5 = settableBeanPropertyArr4;
                        if (annotatedWithParams5 != null) {
                            annotatedWithParams2 = annotatedWithParams4;
                            break;
                        } else {
                            annotatedWithParams5 = annotatedWithParams6;
                            settableBeanPropertyArr3 = settableBeanPropertyArr5;
                            break;
                        }
                    }
                    AnnotatedParameter parameter2 = annotatedWithParams6.getParameter(i23);
                    if (parameter2 == null || annotationIntrospector == null) {
                        propertyName = annotatedWithParams4;
                    } else {
                        PropertyName propertyNameFindNameForDeserialization = annotationIntrospector.findNameForDeserialization(parameter2);
                        if (propertyNameFindNameForDeserialization == null) {
                            String strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(parameter2);
                            if (strFindImplicitPropertyName == null || strFindImplicitPropertyName.isEmpty()) {
                                propertyName = annotatedWithParams4;
                            } else {
                                propertyNameFindNameForDeserialization = PropertyName.construct(strFindImplicitPropertyName);
                            }
                        }
                        propertyName = propertyNameFindNameForDeserialization;
                    }
                    if (propertyName == 0 || propertyName.isEmpty()) {
                        break;
                    }
                    int i24 = i23;
                    PropertyName propertyName2 = propertyName;
                    SettableBeanProperty[] settableBeanPropertyArr6 = settableBeanPropertyArr4;
                    settableBeanPropertyArr6[i24] = constructCreatorProperty(deserializationContext, beanDescription, propertyName2, parameter2.getIndex(), parameter2, null);
                    i23 = i24 + 1;
                    settableBeanPropertyArr4 = settableBeanPropertyArr6;
                    parameterCount = parameterCount;
                }
            }
        }
        if (annotatedWithParams2 != null) {
            creatorCollector.addPropertyCreator(annotatedWithParams2, false, settableBeanPropertyArr3);
            BasicBeanDescription basicBeanDescription = (BasicBeanDescription) beanDescription;
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr3) {
                PropertyName fullName2 = settableBeanProperty.getFullName();
                if (!basicBeanDescription.hasProperty(fullName2)) {
                    basicBeanDescription.addProperty(SimpleBeanPropertyDefinition.construct(deserializationContext.getConfig(), settableBeanProperty.getMember(), fullName2));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v1, types: [com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition] */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    public void _addDeserializerFactoryMethods(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, Map<AnnotatedWithParams, BeanPropertyDefinition[]> map) throws JsonMappingException {
        int i10;
        int i11;
        AnnotatedParameter annotatedParameter;
        int i12;
        int i13;
        SettableBeanProperty[] settableBeanPropertyArr;
        AnnotatedWithParams annotatedWithParams;
        int i14;
        AnnotatedParameter annotatedParameter2;
        Iterator it;
        int i15;
        VisibilityChecker<?> visibilityChecker2 = visibilityChecker;
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> map2 = map;
        LinkedList linkedList = new LinkedList();
        Iterator<AnnotatedMethod> it2 = beanDescription.getFactoryMethods().iterator();
        int i16 = 0;
        while (true) {
            i10 = 1;
            i11 = 2;
            annotatedParameter = null;
            if (!it2.hasNext()) {
                break;
            }
            AnnotatedMethod next = it2.next();
            JsonCreator.Mode modeFindCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(deserializationContext.getConfig(), next);
            int parameterCount = next.getParameterCount();
            if (modeFindCreatorAnnotation == null) {
                if (parameterCount == 1 && visibilityChecker2.isCreatorVisible(next)) {
                    linkedList.add(CreatorCandidate.construct(annotationIntrospector, next, null));
                }
            } else if (modeFindCreatorAnnotation != JsonCreator.Mode.DISABLED) {
                if (parameterCount == 0) {
                    creatorCollector.setDefaultCreator(next);
                } else {
                    int i17 = a.f43190a[modeFindCreatorAnnotation.ordinal()];
                    if (i17 == 1) {
                        _addExplicitDelegatingCreator(deserializationContext, beanDescription, creatorCollector, CreatorCandidate.construct(annotationIntrospector, next, null));
                    } else if (i17 != 2) {
                        _addExplicitAnyCreator(deserializationContext, beanDescription, creatorCollector, CreatorCandidate.construct(annotationIntrospector, next, map2.get(next)));
                    } else {
                        _addExplicitPropertyCreator(deserializationContext, beanDescription, creatorCollector, CreatorCandidate.construct(annotationIntrospector, next, map2.get(next)));
                    }
                    i16++;
                }
            }
        }
        if (i16 > 0) {
            return;
        }
        Iterator it3 = linkedList.iterator();
        while (it3.hasNext()) {
            CreatorCandidate creatorCandidate = (CreatorCandidate) it3.next();
            int iParamCount = creatorCandidate.paramCount();
            AnnotatedWithParams annotatedWithParamsCreator = creatorCandidate.creator();
            BeanPropertyDefinition[] beanPropertyDefinitionArr = map2.get(annotatedWithParamsCreator);
            if (iParamCount == i10) {
                BeanPropertyDefinition beanPropertyDefinitionPropertyDef = creatorCandidate.propertyDef(0);
                if (a(annotationIntrospector, annotatedWithParamsCreator, beanPropertyDefinitionPropertyDef)) {
                    SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[iParamCount];
                    AnnotatedParameter annotatedParameter3 = annotatedParameter;
                    int i18 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    while (i18 < iParamCount) {
                        AnnotatedParameter parameter = annotatedWithParamsCreator.getParameter(i18);
                        ?? r20 = beanPropertyDefinitionArr == null ? annotatedParameter : beanPropertyDefinitionArr[i18];
                        JacksonInject.Value valueFindInjectableValue = annotationIntrospector.findInjectableValue(parameter);
                        PropertyName fullName = r20 == 0 ? annotatedParameter : r20.getFullName();
                        if (r20 == 0 || !r20.isExplicitlyNamed()) {
                            i13 = i18;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            annotatedWithParams = annotatedWithParamsCreator;
                            i14 = iParamCount;
                            annotatedParameter2 = annotatedParameter;
                            it = it3;
                            i15 = i11;
                            if (valueFindInjectableValue != null) {
                                i20++;
                                settableBeanPropertyArr[i13] = constructCreatorProperty(deserializationContext, beanDescription, fullName, i13, parameter, valueFindInjectableValue);
                            } else if (annotationIntrospector.findUnwrappingNameTransformer(parameter) != null) {
                                _reportUnwrappedCreatorProperty(deserializationContext, beanDescription, parameter);
                            } else if (annotatedParameter3 == null) {
                                annotatedParameter3 = parameter;
                            }
                        } else {
                            i19++;
                            i13 = i18;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            annotatedWithParams = annotatedWithParamsCreator;
                            i14 = iParamCount;
                            annotatedParameter2 = annotatedParameter;
                            it = it3;
                            i15 = i11;
                            settableBeanPropertyArr[i13] = constructCreatorProperty(deserializationContext, beanDescription, fullName, i13, parameter, valueFindInjectableValue);
                        }
                        i18 = i13 + 1;
                        annotatedWithParamsCreator = annotatedWithParams;
                        iParamCount = i14;
                        i11 = i15;
                        settableBeanPropertyArr2 = settableBeanPropertyArr;
                        annotatedParameter = annotatedParameter2;
                        it3 = it;
                    }
                    SettableBeanProperty[] settableBeanPropertyArr3 = settableBeanPropertyArr2;
                    AnnotatedWithParams annotatedWithParams2 = annotatedWithParamsCreator;
                    int i21 = iParamCount;
                    AnnotatedParameter annotatedParameter4 = annotatedParameter;
                    Iterator it4 = it3;
                    int i22 = i11;
                    if (i19 > 0 || i20 > 0) {
                        if (i19 + i20 == i21) {
                            creatorCollector.addPropertyCreator(annotatedWithParams2, false, settableBeanPropertyArr3);
                        } else {
                            if (i19 == 0 && i20 + 1 == i21) {
                                creatorCollector.addDelegatingCreator(annotatedWithParams2, false, settableBeanPropertyArr3, 0);
                            } else {
                                Object[] objArr = new Object[i22];
                                objArr[0] = Integer.valueOf(annotatedParameter3.getIndex());
                                i12 = 1;
                                objArr[1] = annotatedWithParams2;
                                deserializationContext.reportBadTypeDefinition(beanDescription, "Argument #%d of factory method %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", objArr);
                            }
                            visibilityChecker2 = visibilityChecker;
                            map2 = map;
                            i10 = i12;
                            i11 = i22;
                            annotatedParameter = annotatedParameter4;
                            it3 = it4;
                        }
                    }
                    i12 = 1;
                    visibilityChecker2 = visibilityChecker;
                    map2 = map;
                    i10 = i12;
                    i11 = i22;
                    annotatedParameter = annotatedParameter4;
                    it3 = it4;
                } else {
                    _handleSingleArgumentCreator(creatorCollector, annotatedWithParamsCreator, false, visibilityChecker2.isCreatorVisible(annotatedWithParamsCreator));
                    if (beanPropertyDefinitionPropertyDef != null) {
                        ((POJOPropertyBuilder) beanPropertyDefinitionPropertyDef).removeConstructors();
                    }
                }
            }
        }
    }

    public void _addExplicitAnyCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) throws JsonMappingException {
        if (1 != creatorCandidate.paramCount()) {
            int iFindOnlyParamWithoutInjection = creatorCandidate.findOnlyParamWithoutInjection();
            if (iFindOnlyParamWithoutInjection < 0 || creatorCandidate.paramName(iFindOnlyParamWithoutInjection) != null) {
                _addExplicitPropertyCreator(deserializationContext, beanDescription, creatorCollector, creatorCandidate);
                return;
            } else {
                _addExplicitDelegatingCreator(deserializationContext, beanDescription, creatorCollector, creatorCandidate);
                return;
            }
        }
        AnnotatedParameter annotatedParameterParameter = creatorCandidate.parameter(0);
        JacksonInject.Value valueInjection = creatorCandidate.injection(0);
        PropertyName propertyNameExplicitParamName = creatorCandidate.explicitParamName(0);
        BeanPropertyDefinition beanPropertyDefinitionPropertyDef = creatorCandidate.propertyDef(0);
        boolean z10 = (propertyNameExplicitParamName == null && valueInjection == null) ? false : true;
        if (!z10 && beanPropertyDefinitionPropertyDef != null) {
            propertyNameExplicitParamName = creatorCandidate.paramName(0);
            z10 = propertyNameExplicitParamName != null && beanPropertyDefinitionPropertyDef.couldSerialize();
        }
        PropertyName propertyName = propertyNameExplicitParamName;
        if (z10) {
            creatorCollector.addPropertyCreator(creatorCandidate.creator(), true, new SettableBeanProperty[]{constructCreatorProperty(deserializationContext, beanDescription, propertyName, 0, annotatedParameterParameter, valueInjection)});
            return;
        }
        _handleSingleArgumentCreator(creatorCollector, creatorCandidate.creator(), true, true);
        if (beanPropertyDefinitionPropertyDef != null) {
            ((POJOPropertyBuilder) beanPropertyDefinitionPropertyDef).removeConstructors();
        }
    }

    public void _addExplicitDelegatingCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) throws JsonMappingException {
        int iParamCount = creatorCandidate.paramCount();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[iParamCount];
        int i10 = -1;
        for (int i11 = 0; i11 < iParamCount; i11++) {
            AnnotatedParameter annotatedParameterParameter = creatorCandidate.parameter(i11);
            JacksonInject.Value valueInjection = creatorCandidate.injection(i11);
            if (valueInjection != null) {
                settableBeanPropertyArr[i11] = constructCreatorProperty(deserializationContext, beanDescription, null, i11, annotatedParameterParameter, valueInjection);
            } else if (i10 < 0) {
                i10 = i11;
            } else {
                deserializationContext.reportBadTypeDefinition(beanDescription, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i10), Integer.valueOf(i11), creatorCandidate);
            }
        }
        if (i10 < 0) {
            deserializationContext.reportBadTypeDefinition(beanDescription, "No argument left as delegating for Creator %s: exactly one required", creatorCandidate);
        }
        if (iParamCount != 1) {
            creatorCollector.addDelegatingCreator(creatorCandidate.creator(), true, settableBeanPropertyArr, i10);
            return;
        }
        _handleSingleArgumentCreator(creatorCollector, creatorCandidate.creator(), true, true);
        BeanPropertyDefinition beanPropertyDefinitionPropertyDef = creatorCandidate.propertyDef(0);
        if (beanPropertyDefinitionPropertyDef != null) {
            ((POJOPropertyBuilder) beanPropertyDefinitionPropertyDef).removeConstructors();
        }
    }

    public void _addExplicitPropertyCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) throws JsonMappingException {
        int iParamCount = creatorCandidate.paramCount();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[iParamCount];
        for (int i10 = 0; i10 < iParamCount; i10++) {
            JacksonInject.Value valueInjection = creatorCandidate.injection(i10);
            AnnotatedParameter annotatedParameterParameter = creatorCandidate.parameter(i10);
            PropertyName propertyNameParamName = creatorCandidate.paramName(i10);
            if (propertyNameParamName == null) {
                if (deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(annotatedParameterParameter) != null) {
                    _reportUnwrappedCreatorProperty(deserializationContext, beanDescription, annotatedParameterParameter);
                }
                propertyNameParamName = creatorCandidate.findImplicitParamName(i10);
                if (propertyNameParamName == null && valueInjection == null) {
                    deserializationContext.reportBadTypeDefinition(beanDescription, "Argument #%d has no property name, is not Injectable: can not use as Creator %s", Integer.valueOf(i10), creatorCandidate);
                }
            }
            settableBeanPropertyArr[i10] = constructCreatorProperty(deserializationContext, beanDescription, propertyNameParamName, i10, annotatedParameterParameter, valueInjection);
        }
        creatorCollector.addPropertyCreator(creatorCandidate.creator(), true, settableBeanPropertyArr);
    }

    public ValueInstantiator _constructDefaultValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) throws JsonMappingException {
        CreatorCollector creatorCollector = new CreatorCollector(beanDescription, deserializationContext.getConfig());
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        VisibilityChecker<?> defaultVisibilityChecker = deserializationContext.getConfig().getDefaultVisibilityChecker(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> map_findCreatorsFromProperties = _findCreatorsFromProperties(deserializationContext, beanDescription);
        _addDeserializerFactoryMethods(deserializationContext, beanDescription, defaultVisibilityChecker, annotationIntrospector, creatorCollector, map_findCreatorsFromProperties);
        if (beanDescription.getType().isConcrete()) {
            _addDeserializerConstructors(deserializationContext, beanDescription, defaultVisibilityChecker, annotationIntrospector, creatorCollector, map_findCreatorsFromProperties);
        }
        return creatorCollector.constructValueInstantiator(deserializationContext);
    }

    public Map<AnnotatedWithParams, BeanPropertyDefinition[]> _findCreatorsFromProperties(DeserializationContext deserializationContext, BeanDescription beanDescription) throws JsonMappingException {
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> mapEmptyMap = Collections.emptyMap();
        for (BeanPropertyDefinition beanPropertyDefinition : beanDescription.findProperties()) {
            Iterator<AnnotatedParameter> constructorParameters = beanPropertyDefinition.getConstructorParameters();
            while (constructorParameters.hasNext()) {
                AnnotatedParameter next = constructorParameters.next();
                AnnotatedWithParams owner = next.getOwner();
                BeanPropertyDefinition[] beanPropertyDefinitionArr = mapEmptyMap.get(owner);
                int index = next.getIndex();
                if (beanPropertyDefinitionArr == null) {
                    if (mapEmptyMap.isEmpty()) {
                        mapEmptyMap = new LinkedHashMap<>();
                    }
                    beanPropertyDefinitionArr = new BeanPropertyDefinition[owner.getParameterCount()];
                    mapEmptyMap.put(owner, beanPropertyDefinitionArr);
                } else if (beanPropertyDefinitionArr[index] != null) {
                    deserializationContext.reportBadTypeDefinition(beanDescription, "Conflict: parameter #%d of %s bound to more than one property; %s vs %s", Integer.valueOf(index), owner, beanPropertyDefinitionArr[index], beanPropertyDefinition);
                }
                beanPropertyDefinitionArr[index] = beanPropertyDefinition;
            }
        }
        return mapEmptyMap;
    }

    public JsonDeserializer<?> _findCustomArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> jsonDeserializerFindArrayDeserializer = it.next().findArrayDeserializer(arrayType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (jsonDeserializerFindArrayDeserializer != null) {
                return jsonDeserializerFindArrayDeserializer;
            }
        }
        return null;
    }

    public JsonDeserializer<Object> _findCustomBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> jsonDeserializerFindBeanDeserializer = it.next().findBeanDeserializer(javaType, deserializationConfig, beanDescription);
            if (jsonDeserializerFindBeanDeserializer != null) {
                return jsonDeserializerFindBeanDeserializer;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> jsonDeserializerFindCollectionDeserializer = it.next().findCollectionDeserializer(collectionType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (jsonDeserializerFindCollectionDeserializer != null) {
                return jsonDeserializerFindCollectionDeserializer;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> jsonDeserializerFindCollectionLikeDeserializer = it.next().findCollectionLikeDeserializer(collectionLikeType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (jsonDeserializerFindCollectionLikeDeserializer != null) {
                return jsonDeserializerFindCollectionLikeDeserializer;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> jsonDeserializerFindEnumDeserializer = it.next().findEnumDeserializer(cls, deserializationConfig, beanDescription);
            if (jsonDeserializerFindEnumDeserializer != null) {
                return jsonDeserializerFindEnumDeserializer;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> jsonDeserializerFindMapDeserializer = it.next().findMapDeserializer(mapType, deserializationConfig, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
            if (jsonDeserializerFindMapDeserializer != null) {
                return jsonDeserializerFindMapDeserializer;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> jsonDeserializerFindMapLikeDeserializer = it.next().findMapLikeDeserializer(mapLikeType, deserializationConfig, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
            if (jsonDeserializerFindMapLikeDeserializer != null) {
                return jsonDeserializerFindMapLikeDeserializer;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> jsonDeserializerFindReferenceDeserializer = it.next().findReferenceDeserializer(referenceType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (jsonDeserializerFindReferenceDeserializer != null) {
                return jsonDeserializerFindReferenceDeserializer;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomTreeNodeDeserializer(Class<? extends JsonNode> cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> jsonDeserializerFindTreeNodeDeserializer = it.next().findTreeNodeDeserializer(cls, deserializationConfig, beanDescription);
            if (jsonDeserializerFindTreeNodeDeserializer != null) {
                return jsonDeserializerFindTreeNodeDeserializer;
            }
        }
        return null;
    }

    @Deprecated
    public AnnotatedMethod _findJsonValueFor(DeserializationConfig deserializationConfig, JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return deserializationConfig.introspect(javaType).findJsonValueMethod();
    }

    public JavaType _findRemappedType(DeserializationConfig deserializationConfig, Class<?> cls) throws JsonMappingException {
        JavaType javaTypeMapAbstractType = mapAbstractType(deserializationConfig, deserializationConfig.constructType(cls));
        if (javaTypeMapAbstractType == null || javaTypeMapAbstractType.hasRawClass(cls)) {
            return null;
        }
        return javaTypeMapAbstractType;
    }

    public boolean _handleSingleArgumentCreator(CreatorCollector creatorCollector, AnnotatedWithParams annotatedWithParams, boolean z10, boolean z11) {
        Class<?> rawParameterType = annotatedWithParams.getRawParameterType(0);
        if (rawParameterType == String.class || rawParameterType == CharSequence.class) {
            if (z10 || z11) {
                creatorCollector.addStringCreator(annotatedWithParams, z10);
            }
            return true;
        }
        if (rawParameterType == Integer.TYPE || rawParameterType == Integer.class) {
            if (z10 || z11) {
                creatorCollector.addIntCreator(annotatedWithParams, z10);
            }
            return true;
        }
        if (rawParameterType == Long.TYPE || rawParameterType == Long.class) {
            if (z10 || z11) {
                creatorCollector.addLongCreator(annotatedWithParams, z10);
            }
            return true;
        }
        if (rawParameterType == Double.TYPE || rawParameterType == Double.class) {
            if (z10 || z11) {
                creatorCollector.addDoubleCreator(annotatedWithParams, z10);
            }
            return true;
        }
        if (rawParameterType == Boolean.TYPE || rawParameterType == Boolean.class) {
            if (z10 || z11) {
                creatorCollector.addBooleanCreator(annotatedWithParams, z10);
            }
            return true;
        }
        if (!z10) {
            return false;
        }
        creatorCollector.addDelegatingCreator(annotatedWithParams, z10, null, 0);
        return true;
    }

    public boolean _hasCreatorAnnotation(DeserializationContext deserializationContext, Annotated annotated) {
        JsonCreator.Mode modeFindCreatorAnnotation;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        return (annotationIntrospector == null || (modeFindCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(deserializationContext.getConfig(), annotated)) == null || modeFindCreatorAnnotation == JsonCreator.Mode.DISABLED) ? false : true;
    }

    public CollectionType _mapAbstractCollectionType(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class<? extends Collection> cls = f43189q0.get(javaType.getRawClass().getName());
        if (cls == null) {
            return null;
        }
        return (CollectionType) deserializationConfig.constructSpecializedType(javaType, cls);
    }

    public void _reportUnwrappedCreatorProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, AnnotatedParameter annotatedParameter) throws JsonMappingException {
        deserializationContext.reportBadDefinition(beanDescription.getType(), String.format("Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", Integer.valueOf(annotatedParameter.getIndex())));
    }

    public ValueInstantiator _valueInstantiatorInstance(DeserializationConfig deserializationConfig, Annotated annotated, Object obj) throws JsonMappingException {
        ValueInstantiator valueInstantiatorValueInstantiatorInstance;
        if (obj == null) {
            return null;
        }
        if (obj instanceof ValueInstantiator) {
            return (ValueInstantiator) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
        }
        Class<?> cls = (Class) obj;
        if (ClassUtil.isBogusClass(cls)) {
            return null;
        }
        if (!ValueInstantiator.class.isAssignableFrom(cls)) {
            throw new IllegalStateException(e.e(cls, new StringBuilder("AnnotationIntrospector returned Class "), "; expected Class<ValueInstantiator>"));
        }
        HandlerInstantiator handlerInstantiator = deserializationConfig.getHandlerInstantiator();
        return (handlerInstantiator == null || (valueInstantiatorValueInstantiatorInstance = handlerInstantiator.valueInstantiatorInstance(deserializationConfig, annotated, cls)) == null) ? (ValueInstantiator) ClassUtil.createInstance(cls, deserializationConfig.canOverrideAccessModifiers()) : valueInstantiatorValueInstantiatorInstance;
    }

    public SettableBeanProperty constructCreatorProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, PropertyName propertyName, int i10, AnnotatedParameter annotatedParameter, JacksonInject.Value value) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        PropertyMetadata propertyMetadataConstruct = annotationIntrospector == null ? PropertyMetadata.STD_REQUIRED_OR_OPTIONAL : PropertyMetadata.construct(annotationIntrospector.hasRequiredMarker(annotatedParameter), annotationIntrospector.findPropertyDescription(annotatedParameter), annotationIntrospector.findPropertyIndex(annotatedParameter), annotationIntrospector.findPropertyDefaultValue(annotatedParameter));
        JavaType javaTypeResolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedParameter, annotatedParameter.getType());
        BeanProperty.Std std = new BeanProperty.Std(propertyName, javaTypeResolveMemberAndTypeAnnotations, annotationIntrospector.findWrapperName(annotatedParameter), annotatedParameter, propertyMetadataConstruct);
        TypeDeserializer typeDeserializerFindTypeDeserializer = (TypeDeserializer) javaTypeResolveMemberAndTypeAnnotations.getTypeHandler();
        if (typeDeserializerFindTypeDeserializer == null) {
            typeDeserializerFindTypeDeserializer = findTypeDeserializer(config, javaTypeResolveMemberAndTypeAnnotations);
        }
        CreatorProperty creatorProperty = new CreatorProperty(propertyName, javaTypeResolveMemberAndTypeAnnotations, std.getWrapperName(), typeDeserializerFindTypeDeserializer, beanDescription.getClassAnnotations(), annotatedParameter, i10, value == null ? null : value.getId(), propertyMetadataConstruct);
        JsonDeserializer<?> jsonDeserializerFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, annotatedParameter);
        if (jsonDeserializerFindDeserializerFromAnnotation == null) {
            jsonDeserializerFindDeserializerFromAnnotation = (JsonDeserializer) javaTypeResolveMemberAndTypeAnnotations.getValueHandler();
        }
        return jsonDeserializerFindDeserializerFromAnnotation != null ? creatorProperty.withValueDeserializer(deserializationContext.handlePrimaryContextualization(jsonDeserializerFindDeserializerFromAnnotation, creatorProperty, javaTypeResolveMemberAndTypeAnnotations)) : creatorProperty;
    }

    public EnumResolver constructEnumResolver(Class<?> cls, DeserializationConfig deserializationConfig, AnnotatedMember annotatedMember) {
        if (annotatedMember == null) {
            return EnumResolver.constructUnsafe(cls, deserializationConfig.getAnnotationIntrospector());
        }
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMember.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return EnumResolver.constructUnsafeUsingMethod(cls, annotatedMember, deserializationConfig.getAnnotationIntrospector());
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createArrayDeserializer(DeserializationContext deserializationContext, ArrayType arrayType, BeanDescription beanDescription) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType contentType = arrayType.getContentType();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        TypeDeserializer typeDeserializerFindTypeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializerFindTypeDeserializer == null) {
            typeDeserializerFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer = typeDeserializerFindTypeDeserializer;
        JsonDeserializer<?> jsonDeserializer_findCustomArrayDeserializer = _findCustomArrayDeserializer(arrayType, config, beanDescription, typeDeserializer, jsonDeserializer);
        if (jsonDeserializer_findCustomArrayDeserializer == null) {
            if (jsonDeserializer == null) {
                Class<?> rawClass = contentType.getRawClass();
                if (contentType.isPrimitive()) {
                    return PrimitiveArrayDeserializers.forType(rawClass);
                }
                if (rawClass == String.class) {
                    return StringArrayDeserializer.instance;
                }
            }
            jsonDeserializer_findCustomArrayDeserializer = new ObjectArrayDeserializer(arrayType, jsonDeserializer, typeDeserializer);
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                jsonDeserializer_findCustomArrayDeserializer = it.next().modifyArrayDeserializer(config, arrayType, beanDescription, jsonDeserializer_findCustomArrayDeserializer);
            }
        }
        return jsonDeserializer_findCustomArrayDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createCollectionDeserializer(DeserializationContext deserializationContext, CollectionType collectionType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType contentType = collectionType.getContentType();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializerFindTypeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializerFindTypeDeserializer == null) {
            typeDeserializerFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer = typeDeserializerFindTypeDeserializer;
        JsonDeserializer<?> jsonDeserializer_findCustomCollectionDeserializer = _findCustomCollectionDeserializer(collectionType, config, beanDescription, typeDeserializer, jsonDeserializer);
        if (jsonDeserializer_findCustomCollectionDeserializer == null) {
            Class<?> rawClass = collectionType.getRawClass();
            if (jsonDeserializer == null && EnumSet.class.isAssignableFrom(rawClass)) {
                jsonDeserializer_findCustomCollectionDeserializer = new EnumSetDeserializer(contentType, null);
            }
        }
        if (jsonDeserializer_findCustomCollectionDeserializer == null) {
            if (collectionType.isInterface() || collectionType.isAbstract()) {
                CollectionType collectionType_mapAbstractCollectionType = _mapAbstractCollectionType(collectionType, config);
                if (collectionType_mapAbstractCollectionType != null) {
                    beanDescription = config.introspectForCreation(collectionType_mapAbstractCollectionType);
                    collectionType = collectionType_mapAbstractCollectionType;
                } else {
                    if (collectionType.getTypeHandler() == null) {
                        throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Collection type " + collectionType);
                    }
                    jsonDeserializer_findCustomCollectionDeserializer = AbstractDeserializer.constructForNonPOJO(beanDescription);
                }
            }
            if (jsonDeserializer_findCustomCollectionDeserializer == null) {
                ValueInstantiator valueInstantiatorFindValueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
                if (!valueInstantiatorFindValueInstantiator.canCreateUsingDefault()) {
                    if (collectionType.hasRawClass(ArrayBlockingQueue.class)) {
                        return new ArrayBlockingQueueDeserializer(collectionType, jsonDeserializer, typeDeserializer, valueInstantiatorFindValueInstantiator);
                    }
                    JsonDeserializer<?> jsonDeserializerFindForCollection = JavaUtilCollectionsDeserializers.findForCollection(deserializationContext, collectionType);
                    if (jsonDeserializerFindForCollection != null) {
                        return jsonDeserializerFindForCollection;
                    }
                }
                jsonDeserializer_findCustomCollectionDeserializer = contentType.hasRawClass(String.class) ? new StringCollectionDeserializer(collectionType, jsonDeserializer, valueInstantiatorFindValueInstantiator) : new CollectionDeserializer(collectionType, jsonDeserializer, typeDeserializer, valueInstantiatorFindValueInstantiator);
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                jsonDeserializer_findCustomCollectionDeserializer = it.next().modifyCollectionDeserializer(config, collectionType, beanDescription, jsonDeserializer_findCustomCollectionDeserializer);
            }
        }
        return jsonDeserializer_findCustomCollectionDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createCollectionLikeDeserializer(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType contentType = collectionLikeType.getContentType();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        JsonDeserializer<?> jsonDeserializer_findCustomCollectionLikeDeserializer = _findCustomCollectionLikeDeserializer(collectionLikeType, config, beanDescription, typeDeserializer == null ? findTypeDeserializer(config, contentType) : typeDeserializer, jsonDeserializer);
        if (jsonDeserializer_findCustomCollectionLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                jsonDeserializer_findCustomCollectionLikeDeserializer = it.next().modifyCollectionLikeDeserializer(config, collectionLikeType, beanDescription, jsonDeserializer_findCustomCollectionLikeDeserializer);
            }
        }
        return jsonDeserializer_findCustomCollectionLikeDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        JsonDeserializer<?> jsonDeserializer_findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, beanDescription);
        if (jsonDeserializer_findCustomEnumDeserializer == null) {
            ValueInstantiator valueInstantiator_constructDefaultValueInstantiator = _constructDefaultValueInstantiator(deserializationContext, beanDescription);
            SettableBeanProperty[] fromObjectArguments = valueInstantiator_constructDefaultValueInstantiator == null ? null : valueInstantiator_constructDefaultValueInstantiator.getFromObjectArguments(deserializationContext.getConfig());
            for (AnnotatedMethod annotatedMethod : beanDescription.getFactoryMethods()) {
                if (_hasCreatorAnnotation(deserializationContext, annotatedMethod)) {
                    if (annotatedMethod.getParameterCount() == 0) {
                        jsonDeserializer_findCustomEnumDeserializer = EnumDeserializer.deserializerForNoArgsCreator(config, rawClass, annotatedMethod);
                        break;
                    }
                    if (annotatedMethod.getRawReturnType().isAssignableFrom(rawClass)) {
                        jsonDeserializer_findCustomEnumDeserializer = EnumDeserializer.deserializerForCreator(config, rawClass, annotatedMethod, valueInstantiator_constructDefaultValueInstantiator, fromObjectArguments);
                        break;
                    }
                }
            }
            if (jsonDeserializer_findCustomEnumDeserializer == null) {
                jsonDeserializer_findCustomEnumDeserializer = new EnumDeserializer(constructEnumResolver(rawClass, config, beanDescription.findJsonValueAccessor()), Boolean.valueOf(config.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)));
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                jsonDeserializer_findCustomEnumDeserializer = it.next().modifyEnumDeserializer(config, javaType, beanDescription, jsonDeserializer_findCustomEnumDeserializer);
            }
        }
        return jsonDeserializer_findCustomEnumDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public KeyDeserializer createKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        KeyDeserializer keyDeserializerConstructEnumKeyDeserializer;
        DeserializationConfig config = deserializationContext.getConfig();
        KeyDeserializer keyDeserializerModifyKeyDeserializer = null;
        if (this._factoryConfig.hasKeyDeserializers()) {
            BeanDescription beanDescriptionIntrospectClassAnnotations = config.introspectClassAnnotations(javaType.getRawClass());
            Iterator<KeyDeserializers> it = this._factoryConfig.keyDeserializers().iterator();
            while (it.hasNext() && (keyDeserializerModifyKeyDeserializer = it.next().findKeyDeserializer(javaType, config, beanDescriptionIntrospectClassAnnotations)) == null) {
            }
        }
        if (keyDeserializerModifyKeyDeserializer == null) {
            if (javaType.isEnumType()) {
                DeserializationConfig config2 = deserializationContext.getConfig();
                Class<?> rawClass = javaType.getRawClass();
                BeanDescription beanDescriptionIntrospect = config2.introspect(javaType);
                KeyDeserializer keyDeserializerFindKeyDeserializerFromAnnotation = findKeyDeserializerFromAnnotation(deserializationContext, beanDescriptionIntrospect.getClassInfo());
                if (keyDeserializerFindKeyDeserializerFromAnnotation != null) {
                    keyDeserializerModifyKeyDeserializer = keyDeserializerFindKeyDeserializerFromAnnotation;
                } else {
                    JsonDeserializer<?> jsonDeserializer_findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config2, beanDescriptionIntrospect);
                    if (jsonDeserializer_findCustomEnumDeserializer == null) {
                        JsonDeserializer<Object> jsonDeserializerFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, beanDescriptionIntrospect.getClassInfo());
                        if (jsonDeserializerFindDeserializerFromAnnotation == null) {
                            EnumResolver enumResolverConstructEnumResolver = constructEnumResolver(rawClass, config2, beanDescriptionIntrospect.findJsonValueAccessor());
                            Iterator<AnnotatedMethod> it2 = beanDescriptionIntrospect.getFactoryMethods().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    keyDeserializerConstructEnumKeyDeserializer = StdKeyDeserializers.constructEnumKeyDeserializer(enumResolverConstructEnumResolver);
                                    break;
                                }
                                AnnotatedMethod next = it2.next();
                                if (_hasCreatorAnnotation(deserializationContext, next)) {
                                    if (next.getParameterCount() != 1 || !next.getRawReturnType().isAssignableFrom(rawClass)) {
                                        StringBuilder sb2 = new StringBuilder("Unsuitable method (");
                                        sb2.append(next);
                                        sb2.append(") decorated with @JsonCreator (for Enum type ");
                                        throw new IllegalArgumentException(e.e(rawClass, sb2, ")"));
                                    }
                                    if (next.getRawParameterType(0) == String.class) {
                                        if (config2.canOverrideAccessModifiers()) {
                                            ClassUtil.checkAndFixAccess(next.getMember(), deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                                        }
                                        keyDeserializerConstructEnumKeyDeserializer = StdKeyDeserializers.constructEnumKeyDeserializer(enumResolverConstructEnumResolver, next);
                                        break;
                                    }
                                    throw new IllegalArgumentException("Parameter #0 type for factory method (" + next + ") not suitable, must be java.lang.String");
                                }
                            }
                        } else {
                            keyDeserializerConstructEnumKeyDeserializer = StdKeyDeserializers.constructDelegatingKeyDeserializer(config2, javaType, jsonDeserializerFindDeserializerFromAnnotation);
                        }
                    } else {
                        keyDeserializerConstructEnumKeyDeserializer = StdKeyDeserializers.constructDelegatingKeyDeserializer(config2, javaType, jsonDeserializer_findCustomEnumDeserializer);
                    }
                    keyDeserializerModifyKeyDeserializer = keyDeserializerConstructEnumKeyDeserializer;
                }
            } else {
                keyDeserializerModifyKeyDeserializer = StdKeyDeserializers.findStringBasedKeyDeserializer(config, javaType);
            }
        }
        if (keyDeserializerModifyKeyDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it3 = this._factoryConfig.deserializerModifiers().iterator();
            while (it3.hasNext()) {
                keyDeserializerModifyKeyDeserializer = it3.next().modifyKeyDeserializer(config, javaType, keyDeserializerModifyKeyDeserializer);
            }
        }
        return keyDeserializerModifyKeyDeserializer;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x010e  */
    /* JADX WARN: Code duplicated, block: B:55:0x011e A[LOOP:0: B:53:0x0118->B:55:0x011e, LOOP_END] */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createMapDeserializer(DeserializationContext deserializationContext, MapType mapType, BeanDescription beanDescription) throws JsonMappingException {
        BeanDescription beanDescriptionIntrospectForCreation;
        MapType mapType2;
        JsonDeserializer<?> jsonDeserializerModifyMapDeserializer;
        Iterator<BeanDeserializerModifier> it;
        JsonDeserializer<?> jsonDeserializerConstructForNonPOJO;
        JsonDeserializer<?> jsonDeserializer;
        ValueInstantiator valueInstantiatorFindValueInstantiator;
        EnumMapDeserializer enumMapDeserializer;
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType keyType = mapType.getKeyType();
        JavaType contentType = mapType.getContentType();
        JsonDeserializer jsonDeserializer2 = (JsonDeserializer) contentType.getValueHandler();
        KeyDeserializer keyDeserializer = (KeyDeserializer) keyType.getValueHandler();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        TypeDeserializer typeDeserializerFindTypeDeserializer = typeDeserializer == null ? findTypeDeserializer(config, contentType) : typeDeserializer;
        JsonDeserializer<?> jsonDeserializer_findCustomMapDeserializer = _findCustomMapDeserializer(mapType, config, beanDescription, keyDeserializer, typeDeserializerFindTypeDeserializer, jsonDeserializer2);
        if (jsonDeserializer_findCustomMapDeserializer == null) {
            Class<?> rawClass = mapType.getRawClass();
            if (EnumMap.class.isAssignableFrom(rawClass)) {
                if (rawClass == EnumMap.class) {
                    beanDescriptionIntrospectForCreation = beanDescription;
                    valueInstantiatorFindValueInstantiator = null;
                } else {
                    beanDescriptionIntrospectForCreation = beanDescription;
                    valueInstantiatorFindValueInstantiator = findValueInstantiator(deserializationContext, beanDescriptionIntrospectForCreation);
                }
                Class<?> rawClass2 = keyType.getRawClass();
                if (rawClass2 == null || !rawClass2.isEnum()) {
                    throw new IllegalArgumentException("Cannot construct EnumMap; generic (key) type not available");
                }
                enumMapDeserializer = new EnumMapDeserializer(mapType, valueInstantiatorFindValueInstantiator, null, jsonDeserializer2, typeDeserializerFindTypeDeserializer, null);
            } else {
                beanDescriptionIntrospectForCreation = beanDescription;
            }
            if (jsonDeserializer_findCustomMapDeserializer == null) {
                jsonDeserializer_findCustomMapDeserializer = jsonDeserializer_findCustomMapDeserializer;
                if (mapType.isInterface() || mapType.isAbstract()) {
                    jsonDeserializer_findCustomMapDeserializer = enumMapDeserializer;
                    jsonDeserializer_findCustomMapDeserializer = enumMapDeserializer;
                    Class<? extends Map> cls = f43188p0.get(rawClass.getName());
                    if (cls != null) {
                        mapType2 = (MapType) config.constructSpecializedType(mapType, cls);
                        beanDescriptionIntrospectForCreation = config.introspectForCreation(mapType2);
                        jsonDeserializerConstructForNonPOJO = jsonDeserializer_findCustomMapDeserializer;
                    } else {
                        if (mapType.getTypeHandler() == null) {
                            throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Map type " + mapType);
                        }
                        mapType2 = mapType;
                        jsonDeserializerConstructForNonPOJO = AbstractDeserializer.constructForNonPOJO(beanDescription);
                    }
                    jsonDeserializer = jsonDeserializerConstructForNonPOJO;
                } else {
                    JsonDeserializer<?> jsonDeserializerFindForMap = JavaUtilCollectionsDeserializers.findForMap(deserializationContext, mapType);
                    if (jsonDeserializerFindForMap != null) {
                        jsonDeserializer_findCustomMapDeserializer = enumMapDeserializer;
                        return jsonDeserializerFindForMap;
                    }
                    jsonDeserializer_findCustomMapDeserializer = enumMapDeserializer;
                    jsonDeserializer = jsonDeserializerFindForMap;
                    mapType2 = mapType;
                }
                BeanDescription beanDescription2 = beanDescriptionIntrospectForCreation;
                JsonDeserializer<?> jsonDeserializer3 = jsonDeserializer;
                if (jsonDeserializer == null) {
                    MapDeserializer mapDeserializer = new MapDeserializer(mapType2, findValueInstantiator(deserializationContext, beanDescription2), keyDeserializer, jsonDeserializer2, typeDeserializerFindTypeDeserializer);
                    JsonIgnoreProperties.Value defaultPropertyIgnorals = config.getDefaultPropertyIgnorals(Map.class, beanDescription2.getClassInfo());
                    mapDeserializer.setIgnorableProperties(defaultPropertyIgnorals != null ? defaultPropertyIgnorals.findIgnoredForDeserialization() : null);
                    jsonDeserializer3 = mapDeserializer;
                }
                beanDescriptionIntrospectForCreation = beanDescription2;
                jsonDeserializerModifyMapDeserializer = jsonDeserializer3;
            }
            if (this._factoryConfig.hasDeserializerModifiers()) {
                it = this._factoryConfig.deserializerModifiers().iterator();
                jsonDeserializerModifyMapDeserializer = jsonDeserializerModifyMapDeserializer;
                while (it.hasNext()) {
                    jsonDeserializerModifyMapDeserializer = it.next().modifyMapDeserializer(config, mapType2, beanDescriptionIntrospectForCreation, jsonDeserializerModifyMapDeserializer);
                }
            }
            return jsonDeserializerModifyMapDeserializer;
        }
        beanDescriptionIntrospectForCreation = beanDescription;
        jsonDeserializer_findCustomMapDeserializer = jsonDeserializer_findCustomMapDeserializer;
        jsonDeserializer_findCustomMapDeserializer = enumMapDeserializer;
        mapType2 = mapType;
        jsonDeserializerModifyMapDeserializer = jsonDeserializer_findCustomMapDeserializer;
        if (this._factoryConfig.hasDeserializerModifiers()) {
            it = this._factoryConfig.deserializerModifiers().iterator();
            jsonDeserializerModifyMapDeserializer = jsonDeserializerModifyMapDeserializer;
            while (it.hasNext()) {
                jsonDeserializerModifyMapDeserializer = it.next().modifyMapDeserializer(config, mapType2, beanDescriptionIntrospectForCreation, jsonDeserializerModifyMapDeserializer);
            }
        }
        return jsonDeserializerModifyMapDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createMapLikeDeserializer(DeserializationContext deserializationContext, MapLikeType mapLikeType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType keyType = mapLikeType.getKeyType();
        JavaType contentType = mapLikeType.getContentType();
        DeserializationConfig config = deserializationContext.getConfig();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        KeyDeserializer keyDeserializer = (KeyDeserializer) keyType.getValueHandler();
        TypeDeserializer typeDeserializerFindTypeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializerFindTypeDeserializer == null) {
            typeDeserializerFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        JsonDeserializer<?> jsonDeserializer_findCustomMapLikeDeserializer = _findCustomMapLikeDeserializer(mapLikeType, config, beanDescription, keyDeserializer, typeDeserializerFindTypeDeserializer, jsonDeserializer);
        if (jsonDeserializer_findCustomMapLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                jsonDeserializer_findCustomMapLikeDeserializer = it.next().modifyMapLikeDeserializer(config, mapLikeType, beanDescription, jsonDeserializer_findCustomMapLikeDeserializer);
            }
        }
        return jsonDeserializer_findCustomMapLikeDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createReferenceDeserializer(DeserializationContext deserializationContext, ReferenceType referenceType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType contentType = referenceType.getContentType();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializerFindTypeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializerFindTypeDeserializer == null) {
            typeDeserializerFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer = typeDeserializerFindTypeDeserializer;
        JsonDeserializer<?> jsonDeserializer_findCustomReferenceDeserializer = _findCustomReferenceDeserializer(referenceType, config, beanDescription, typeDeserializer, jsonDeserializer);
        if (jsonDeserializer_findCustomReferenceDeserializer == null && referenceType.isTypeOrSubTypeOf(AtomicReference.class)) {
            return new AtomicReferenceDeserializer(referenceType, referenceType.getRawClass() == AtomicReference.class ? null : findValueInstantiator(deserializationContext, beanDescription), typeDeserializer, jsonDeserializer);
        }
        if (jsonDeserializer_findCustomReferenceDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                jsonDeserializer_findCustomReferenceDeserializer = it.next().modifyReferenceDeserializer(config, referenceType, beanDescription, jsonDeserializer_findCustomReferenceDeserializer);
            }
        }
        return jsonDeserializer_findCustomReferenceDeserializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createTreeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        JsonDeserializer<?> jsonDeserializer_findCustomTreeNodeDeserializer = _findCustomTreeNodeDeserializer(rawClass, deserializationConfig, beanDescription);
        return jsonDeserializer_findCustomTreeNodeDeserializer != null ? jsonDeserializer_findCustomTreeNodeDeserializer : JsonNodeDeserializer.getDeserializer(rawClass);
    }

    public JsonDeserializer<Object> findContentDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws JsonMappingException {
        Object objFindContentDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (objFindContentDeserializer = annotationIntrospector.findContentDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(annotated, objFindContentDeserializer);
    }

    public JsonDeserializer<?> findDefaultDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType javaType_findRemappedType;
        JavaType javaType_findRemappedType2;
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == Object.class) {
            DeserializationConfig config = deserializationContext.getConfig();
            if (this._factoryConfig.hasAbstractTypeResolvers()) {
                javaType_findRemappedType = _findRemappedType(config, List.class);
                javaType_findRemappedType2 = _findRemappedType(config, Map.class);
            } else {
                javaType_findRemappedType = null;
                javaType_findRemappedType2 = null;
            }
            return new UntypedObjectDeserializer(javaType_findRemappedType, javaType_findRemappedType2);
        }
        if (rawClass == String.class || rawClass == CharSequence.class) {
            return StringDeserializer.instance;
        }
        if (rawClass == Iterable.class) {
            TypeFactory typeFactory = deserializationContext.getTypeFactory();
            JavaType[] javaTypeArrFindTypeParameters = typeFactory.findTypeParameters(javaType, Iterable.class);
            return createCollectionDeserializer(deserializationContext, typeFactory.constructCollectionType(Collection.class, (javaTypeArrFindTypeParameters == null || javaTypeArrFindTypeParameters.length != 1) ? TypeFactory.unknownType() : javaTypeArrFindTypeParameters[0]), beanDescription);
        }
        if (rawClass == Map.Entry.class) {
            JavaType javaTypeContainedTypeOrUnknown = javaType.containedTypeOrUnknown(0);
            JavaType javaTypeContainedTypeOrUnknown2 = javaType.containedTypeOrUnknown(1);
            TypeDeserializer typeDeserializerFindTypeDeserializer = (TypeDeserializer) javaTypeContainedTypeOrUnknown2.getTypeHandler();
            if (typeDeserializerFindTypeDeserializer == null) {
                typeDeserializerFindTypeDeserializer = findTypeDeserializer(deserializationContext.getConfig(), javaTypeContainedTypeOrUnknown2);
            }
            return new MapEntryDeserializer(javaType, (KeyDeserializer) javaTypeContainedTypeOrUnknown.getValueHandler(), (JsonDeserializer<Object>) javaTypeContainedTypeOrUnknown2.getValueHandler(), typeDeserializerFindTypeDeserializer);
        }
        String name = rawClass.getName();
        if (rawClass.isPrimitive() || name.startsWith("java.")) {
            JsonDeserializer<?> jsonDeserializerFind = NumberDeserializers.find(rawClass, name);
            if (jsonDeserializerFind == null) {
                jsonDeserializerFind = DateDeserializers.find(rawClass, name);
            }
            if (jsonDeserializerFind != null) {
                return jsonDeserializerFind;
            }
        }
        if (rawClass == TokenBuffer.class) {
            return new TokenBufferDeserializer();
        }
        JsonDeserializer<?> jsonDeserializerFindOptionalStdDeserializer = findOptionalStdDeserializer(deserializationContext, javaType, beanDescription);
        return jsonDeserializerFindOptionalStdDeserializer != null ? jsonDeserializerFindOptionalStdDeserializer : JdkDeserializers.find(rawClass, name);
    }

    public JsonDeserializer<Object> findDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws JsonMappingException {
        Object objFindDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (objFindDeserializer = annotationIntrospector.findDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(annotated, objFindDeserializer);
    }

    public KeyDeserializer findKeyDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws JsonMappingException {
        Object objFindKeyDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (objFindKeyDeserializer = annotationIntrospector.findKeyDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.keyDeserializerInstance(annotated, objFindKeyDeserializer);
    }

    public JsonDeserializer<?> findOptionalStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        return OptionalHandlerFactory.instance.findDeserializer(javaType, deserializationContext.getConfig(), beanDescription);
    }

    public TypeDeserializer findPropertyContentTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        TypeResolverBuilder<?> typeResolverBuilderFindPropertyContentTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyContentTypeResolver(deserializationConfig, annotatedMember, javaType);
        JavaType contentType = javaType.getContentType();
        return typeResolverBuilderFindPropertyContentTypeResolver == null ? findTypeDeserializer(deserializationConfig, contentType) : typeResolverBuilderFindPropertyContentTypeResolver.buildTypeDeserializer(deserializationConfig, contentType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, contentType));
    }

    public TypeDeserializer findPropertyTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        TypeResolverBuilder<?> typeResolverBuilderFindPropertyTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyTypeResolver(deserializationConfig, annotatedMember, javaType);
        return typeResolverBuilderFindPropertyTypeResolver == null ? findTypeDeserializer(deserializationConfig, javaType) : typeResolverBuilderFindPropertyTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, javaType));
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public TypeDeserializer findTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        Collection<NamedType> collectionCollectAndResolveSubtypesByTypeId;
        JavaType javaTypeMapAbstractType;
        AnnotatedClass classInfo = deserializationConfig.introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder<?> typeResolverBuilderFindTypeResolver = deserializationConfig.getAnnotationIntrospector().findTypeResolver(deserializationConfig, classInfo, javaType);
        if (typeResolverBuilderFindTypeResolver == null) {
            typeResolverBuilderFindTypeResolver = deserializationConfig.getDefaultTyper(javaType);
            if (typeResolverBuilderFindTypeResolver == null) {
                return null;
            }
            collectionCollectAndResolveSubtypesByTypeId = null;
        } else {
            collectionCollectAndResolveSubtypesByTypeId = deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, classInfo);
        }
        if (typeResolverBuilderFindTypeResolver.getDefaultImpl() == null && javaType.isAbstract() && (javaTypeMapAbstractType = mapAbstractType(deserializationConfig, javaType)) != null && !javaTypeMapAbstractType.hasRawClass(javaType.getRawClass())) {
            typeResolverBuilderFindTypeResolver = typeResolverBuilderFindTypeResolver.defaultImpl(javaTypeMapAbstractType.getRawClass());
        }
        try {
            return typeResolverBuilderFindTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, collectionCollectAndResolveSubtypesByTypeId);
        } catch (IllegalArgumentException e5) {
            InvalidDefinitionException invalidDefinitionExceptionFrom = InvalidDefinitionException.from((JsonParser) null, ClassUtil.exceptionMessage(e5), javaType);
            invalidDefinitionExceptionFrom.initCause(e5);
            throw invalidDefinitionExceptionFrom;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public ValueInstantiator findValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotatedClass classInfo = beanDescription.getClassInfo();
        Object objFindValueInstantiator = deserializationContext.getAnnotationIntrospector().findValueInstantiator(classInfo);
        ValueInstantiator constantValueInstantiator = null;
        ValueInstantiator valueInstantiator_valueInstantiatorInstance = objFindValueInstantiator != null ? _valueInstantiatorInstance(config, classInfo, objFindValueInstantiator) : null;
        if (valueInstantiator_valueInstantiatorInstance == null) {
            Class<?> beanClass = beanDescription.getBeanClass();
            if (beanClass == JsonLocation.class) {
                constantValueInstantiator = new JsonLocationInstantiator();
            } else if (Collection.class.isAssignableFrom(beanClass)) {
                Set set = Collections.EMPTY_SET;
                if (set.getClass() == beanClass) {
                    constantValueInstantiator = new ConstantValueInstantiator(set);
                } else {
                    List list = Collections.EMPTY_LIST;
                    if (list.getClass() == beanClass) {
                        constantValueInstantiator = new ConstantValueInstantiator(list);
                    }
                }
            } else if (Map.class.isAssignableFrom(beanClass)) {
                Map map = Collections.EMPTY_MAP;
                if (map.getClass() == beanClass) {
                    constantValueInstantiator = new ConstantValueInstantiator(map);
                }
            }
            valueInstantiator_valueInstantiatorInstance = constantValueInstantiator == null ? _constructDefaultValueInstantiator(deserializationContext, beanDescription) : constantValueInstantiator;
        }
        if (this._factoryConfig.hasValueInstantiators()) {
            for (ValueInstantiators valueInstantiators : this._factoryConfig.valueInstantiators()) {
                valueInstantiator_valueInstantiatorInstance = valueInstantiators.findValueInstantiator(config, beanDescription, valueInstantiator_valueInstantiatorInstance);
                if (valueInstantiator_valueInstantiatorInstance == null) {
                    deserializationContext.reportBadTypeDefinition(beanDescription, "Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator", valueInstantiators.getClass().getName());
                }
            }
        }
        if (valueInstantiator_valueInstantiatorInstance.getIncompleteParameter() == null) {
            return valueInstantiator_valueInstantiatorInstance;
        }
        AnnotatedParameter incompleteParameter = valueInstantiator_valueInstantiatorInstance.getIncompleteParameter();
        throw new IllegalArgumentException("Argument #" + incompleteParameter.getIndex() + " of constructor " + incompleteParameter.getOwner() + " has no property name annotation; must have name when multiple-parameter constructor annotated as Creator");
    }

    public DeserializerFactoryConfig getFactoryConfig() {
        return this._factoryConfig;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JavaType mapAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        JavaType javaType2;
        while (true) {
            Class<?> rawClass = javaType.getRawClass();
            if (!this._factoryConfig.hasAbstractTypeResolvers()) {
                javaType2 = null;
                break;
            }
            Iterator<AbstractTypeResolver> it = this._factoryConfig.abstractTypeResolvers().iterator();
            while (true) {
                if (!it.hasNext()) {
                    javaType2 = null;
                    break;
                }
                JavaType javaTypeFindTypeMapping = it.next().findTypeMapping(deserializationConfig, javaType);
                if (javaTypeFindTypeMapping != null && !javaTypeFindTypeMapping.hasRawClass(rawClass)) {
                    javaType2 = javaTypeFindTypeMapping;
                    break;
                }
            }
            if (javaType2 == null) {
                return javaType;
            }
            Class<?> rawClass2 = javaType.getRawClass();
            Class<?> rawClass3 = javaType2.getRawClass();
            if (rawClass2 == rawClass3 || !rawClass2.isAssignableFrom(rawClass3)) {
                throw new IllegalArgumentException("Invalid abstract type resolution from " + javaType + " to " + javaType2 + ": latter is not a subtype of former");
            }
            javaType = javaType2;
        }
    }

    @Deprecated
    public JavaType modifyTypeByAnnotation(DeserializationContext deserializationContext, Annotated annotated, JavaType javaType) throws JsonMappingException {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        return annotationIntrospector == null ? javaType : annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), annotated, javaType);
    }

    public JavaType resolveMemberAndTypeAnnotations(DeserializationContext deserializationContext, AnnotatedMember annotatedMember, JavaType javaType) throws JsonMappingException {
        KeyDeserializer keyDeserializerKeyDeserializerInstance;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        if (javaType.isMapLikeType() && javaType.getKeyType() != null && (keyDeserializerKeyDeserializerInstance = deserializationContext.keyDeserializerInstance(annotatedMember, annotationIntrospector.findKeyDeserializer(annotatedMember))) != null) {
            javaType = ((MapLikeType) javaType).withKeyValueHandler(keyDeserializerKeyDeserializerInstance);
            javaType.getKeyType();
        }
        if (javaType.hasContentType()) {
            JsonDeserializer<Object> jsonDeserializerDeserializerInstance = deserializationContext.deserializerInstance(annotatedMember, annotationIntrospector.findContentDeserializer(annotatedMember));
            if (jsonDeserializerDeserializerInstance != null) {
                javaType = javaType.withContentValueHandler(jsonDeserializerDeserializerInstance);
            }
            TypeDeserializer typeDeserializerFindPropertyContentTypeDeserializer = findPropertyContentTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
            if (typeDeserializerFindPropertyContentTypeDeserializer != null) {
                javaType = javaType.withContentTypeHandler(typeDeserializerFindPropertyContentTypeDeserializer);
            }
        }
        TypeDeserializer typeDeserializerFindPropertyTypeDeserializer = findPropertyTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
        if (typeDeserializerFindPropertyTypeDeserializer != null) {
            javaType = javaType.withTypeHandler(typeDeserializerFindPropertyTypeDeserializer);
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), annotatedMember, javaType);
    }

    @Deprecated
    public JavaType resolveType(DeserializationContext deserializationContext, BeanDescription beanDescription, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        return resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, javaType);
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final DeserializerFactory withAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver) {
        return withConfig(this._factoryConfig.withAbstractTypeResolver(abstractTypeResolver));
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final DeserializerFactory withAdditionalDeserializers(Deserializers deserializers) {
        return withConfig(this._factoryConfig.withAdditionalDeserializers(deserializers));
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final DeserializerFactory withAdditionalKeyDeserializers(KeyDeserializers keyDeserializers) {
        return withConfig(this._factoryConfig.withAdditionalKeyDeserializers(keyDeserializers));
    }

    public abstract DeserializerFactory withConfig(DeserializerFactoryConfig deserializerFactoryConfig);

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final DeserializerFactory withDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier) {
        return withConfig(this._factoryConfig.withDeserializerModifier(beanDeserializerModifier));
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final DeserializerFactory withValueInstantiators(ValueInstantiators valueInstantiators) {
        return withConfig(this._factoryConfig.withValueInstantiators(valueInstantiators));
    }
}
