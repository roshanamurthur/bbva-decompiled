package com.fasterxml.jackson.databind.deser.impl;

import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class CreatorCollector {
    protected static final int C_ARRAY_DELEGATE = 8;
    protected static final int C_BOOLEAN = 5;
    protected static final int C_DEFAULT = 0;
    protected static final int C_DELEGATE = 6;
    protected static final int C_DOUBLE = 4;
    protected static final int C_INT = 2;
    protected static final int C_LONG = 3;
    protected static final int C_PROPS = 7;
    protected static final int C_STRING = 1;
    protected static final String[] TYPE_DESCS = {"default", "from-String", "from-int", "from-long", "from-double", "from-boolean", "delegate", "property-based"};
    protected SettableBeanProperty[] _arrayDelegateArgs;
    protected final BeanDescription _beanDesc;
    protected final boolean _canFixAccess;
    protected SettableBeanProperty[] _delegateArgs;
    protected final boolean _forceAccess;
    protected SettableBeanProperty[] _propertyBasedArgs;
    protected final AnnotatedWithParams[] _creators = new AnnotatedWithParams[9];
    protected int _explicitCreators = 0;
    protected boolean _hasNonDefaultCreator = false;

    public static final class StdTypeConstructor extends AnnotatedWithParams {
        public static final int TYPE_ARRAY_LIST = 1;
        public static final int TYPE_HASH_MAP = 2;
        public static final int TYPE_LINKED_HASH_MAP = 3;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AnnotatedWithParams f43213p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f43214q0;

        public StdTypeConstructor(AnnotatedWithParams annotatedWithParams, int i10) {
            super(annotatedWithParams, null);
            this.f43213p0 = annotatedWithParams;
            this.f43214q0 = i10;
        }

        public static AnnotatedWithParams tryToOptimize(AnnotatedWithParams annotatedWithParams) {
            if (annotatedWithParams != null) {
                Class<?> declaringClass = annotatedWithParams.getDeclaringClass();
                if (declaringClass == List.class || declaringClass == ArrayList.class) {
                    return new StdTypeConstructor(annotatedWithParams, 1);
                }
                if (declaringClass == LinkedHashMap.class) {
                    return new StdTypeConstructor(annotatedWithParams, 3);
                }
                if (declaringClass == HashMap.class) {
                    return new StdTypeConstructor(annotatedWithParams, 2);
                }
            }
            return annotatedWithParams;
        }

        public final Object _construct() {
            int i10 = this.f43214q0;
            if (i10 == 1) {
                return new ArrayList();
            }
            if (i10 == 2) {
                return new HashMap();
            }
            if (i10 == 3) {
                return new LinkedHashMap();
            }
            throw new IllegalStateException("Unknown type " + i10);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public Object call() throws Exception {
            return _construct();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public Object call1(Object obj) throws Exception {
            return _construct();
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated
        public AnnotatedElement getAnnotated() {
            return this.f43213p0.getAnnotated();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
        public Class<?> getDeclaringClass() {
            return this.f43213p0.getDeclaringClass();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        @Deprecated
        public Type getGenericParameterType(int i10) {
            return this.f43213p0.getGenericParameterType(i10);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
        public Member getMember() {
            return this.f43213p0.getMember();
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated
        public int getModifiers() {
            return this.f43213p0.getMember().getModifiers();
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated
        public String getName() {
            return this.f43213p0.getName();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public int getParameterCount() {
            return this.f43213p0.getParameterCount();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public JavaType getParameterType(int i10) {
            return this.f43213p0.getParameterType(i10);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public Class<?> getRawParameterType(int i10) {
            return this.f43213p0.getRawParameterType(i10);
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated
        public Class<?> getRawType() {
            return this.f43213p0.getRawType();
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated
        public JavaType getType() {
            return this.f43213p0.getType();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
        public Object getValue(Object obj) throws UnsupportedOperationException, IllegalArgumentException {
            throw new UnsupportedOperationException();
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated
        public int hashCode() {
            return this.f43213p0.hashCode();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
        public void setValue(Object obj, Object obj2) throws UnsupportedOperationException, IllegalArgumentException {
            throw new UnsupportedOperationException();
        }

        @Override // com.fasterxml.jackson.databind.introspect.Annotated
        public String toString() {
            return this.f43213p0.toString();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
        public Annotated withAnnotations(AnnotationMap annotationMap) {
            throw new UnsupportedOperationException();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public Object call(Object[] objArr) throws Exception {
            return _construct();
        }
    }

    public CreatorCollector(BeanDescription beanDescription, MapperConfig<?> mapperConfig) {
        this._beanDesc = beanDescription;
        this._canFixAccess = mapperConfig.canOverrideAccessModifiers();
        this._forceAccess = mapperConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    public boolean _isEnumValueOf(AnnotatedWithParams annotatedWithParams) {
        return annotatedWithParams.getDeclaringClass().isEnum() && DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF.equals(annotatedWithParams.getName());
    }

    public final JavaType a(DeserializationContext deserializationContext, AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr) throws JsonMappingException {
        if (!this._hasNonDefaultCreator || annotatedWithParams == null) {
            return null;
        }
        int i10 = 0;
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (settableBeanPropertyArr[i11] == null) {
                    i10 = i11;
                    break;
                }
            }
        }
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType parameterType = annotatedWithParams.getParameterType(i10);
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return parameterType;
        }
        AnnotatedParameter parameter = annotatedWithParams.getParameter(i10);
        Object objFindDeserializer = annotationIntrospector.findDeserializer(parameter);
        return objFindDeserializer != null ? parameterType.withValueHandler(deserializationContext.deserializerInstance(parameter, objFindDeserializer)) : annotationIntrospector.refineDeserializationType(config, parameter, parameterType);
    }

    public void addBooleanCreator(AnnotatedWithParams annotatedWithParams, boolean z10) {
        verifyNonDup(annotatedWithParams, 5, z10);
    }

    public void addDelegatingCreator(AnnotatedWithParams annotatedWithParams, boolean z10, SettableBeanProperty[] settableBeanPropertyArr, int i10) {
        if (annotatedWithParams.getParameterType(i10).isCollectionLikeType()) {
            if (verifyNonDup(annotatedWithParams, 8, z10)) {
                this._arrayDelegateArgs = settableBeanPropertyArr;
            }
        } else if (verifyNonDup(annotatedWithParams, 6, z10)) {
            this._delegateArgs = settableBeanPropertyArr;
        }
    }

    public void addDoubleCreator(AnnotatedWithParams annotatedWithParams, boolean z10) {
        verifyNonDup(annotatedWithParams, 4, z10);
    }

    public void addIntCreator(AnnotatedWithParams annotatedWithParams, boolean z10) {
        verifyNonDup(annotatedWithParams, 2, z10);
    }

    public void addLongCreator(AnnotatedWithParams annotatedWithParams, boolean z10) {
        verifyNonDup(annotatedWithParams, 3, z10);
    }

    public void addPropertyCreator(AnnotatedWithParams annotatedWithParams, boolean z10, SettableBeanProperty[] settableBeanPropertyArr) {
        Integer num;
        if (verifyNonDup(annotatedWithParams, 7, z10)) {
            if (settableBeanPropertyArr.length > 1) {
                HashMap map = new HashMap();
                int length = settableBeanPropertyArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    String name = settableBeanPropertyArr[i10].getName();
                    if ((!name.isEmpty() || settableBeanPropertyArr[i10].getInjectableValueId() == null) && (num = (Integer) map.put(name, Integer.valueOf(i10))) != null) {
                        throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", name, num, Integer.valueOf(i10), ClassUtil.nameOf(this._beanDesc.getBeanClass())));
                    }
                }
            }
            this._propertyBasedArgs = settableBeanPropertyArr;
        }
    }

    public void addStringCreator(AnnotatedWithParams annotatedWithParams, boolean z10) {
        verifyNonDup(annotatedWithParams, 1, z10);
    }

    public ValueInstantiator constructValueInstantiator(DeserializationContext deserializationContext) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType javaTypeA = a(deserializationContext, this._creators[6], this._delegateArgs);
        JavaType javaTypeA2 = a(deserializationContext, this._creators[8], this._arrayDelegateArgs);
        JavaType type = this._beanDesc.getType();
        AnnotatedWithParams annotatedWithParamsTryToOptimize = StdTypeConstructor.tryToOptimize(this._creators[0]);
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(config, type);
        AnnotatedWithParams[] annotatedWithParamsArr = this._creators;
        stdValueInstantiator.configureFromObjectSettings(annotatedWithParamsTryToOptimize, annotatedWithParamsArr[6], javaTypeA, this._delegateArgs, annotatedWithParamsArr[7], this._propertyBasedArgs);
        stdValueInstantiator.configureFromArraySettings(this._creators[8], javaTypeA2, this._arrayDelegateArgs);
        stdValueInstantiator.configureFromStringCreator(this._creators[1]);
        stdValueInstantiator.configureFromIntCreator(this._creators[2]);
        stdValueInstantiator.configureFromLongCreator(this._creators[3]);
        stdValueInstantiator.configureFromDoubleCreator(this._creators[4]);
        stdValueInstantiator.configureFromBooleanCreator(this._creators[5]);
        return stdValueInstantiator;
    }

    public boolean hasDefaultCreator() {
        return this._creators[0] != null;
    }

    public boolean hasDelegatingCreator() {
        return this._creators[6] != null;
    }

    public boolean hasPropertyBasedCreator() {
        return this._creators[7] != null;
    }

    public void setDefaultCreator(AnnotatedWithParams annotatedWithParams) {
        AnnotatedWithParams[] annotatedWithParamsArr = this._creators;
        if (annotatedWithParams != null && this._canFixAccess) {
            ClassUtil.checkAndFixAccess((Member) annotatedWithParams.getAnnotated(), this._forceAccess);
        }
        annotatedWithParamsArr[0] = annotatedWithParams;
    }

    public boolean verifyNonDup(AnnotatedWithParams annotatedWithParams, int i10, boolean z10) {
        int i11 = 1 << i10;
        this._hasNonDefaultCreator = true;
        AnnotatedWithParams annotatedWithParams2 = this._creators[i10];
        if (annotatedWithParams2 != null) {
            if ((this._explicitCreators & i11) != 0) {
                if (!z10) {
                    return false;
                }
            } else if (!z10) {
            }
            if (annotatedWithParams2.getClass() == annotatedWithParams.getClass()) {
                Class<?> rawParameterType = annotatedWithParams2.getRawParameterType(0);
                Class<?> rawParameterType2 = annotatedWithParams.getRawParameterType(0);
                if (rawParameterType == rawParameterType2) {
                    if (_isEnumValueOf(annotatedWithParams)) {
                        return false;
                    }
                    if (!_isEnumValueOf(annotatedWithParams2)) {
                        Object[] objArr = new Object[4];
                        objArr[0] = TYPE_DESCS[i10];
                        objArr[1] = z10 ? "explicitly marked" : "implicitly discovered";
                        objArr[2] = annotatedWithParams2;
                        objArr[3] = annotatedWithParams;
                        throw new IllegalArgumentException(String.format("Conflicting %s creators: already had %s creator %s, encountered another: %s", objArr));
                    }
                } else if (rawParameterType2.isAssignableFrom(rawParameterType)) {
                    return false;
                }
            }
        }
        if (z10) {
            this._explicitCreators |= i11;
        }
        AnnotatedWithParams[] annotatedWithParamsArr = this._creators;
        if (annotatedWithParams != null && this._canFixAccess) {
            ClassUtil.checkAndFixAccess((Member) annotatedWithParams.getAnnotated(), this._forceAccess);
        }
        annotatedWithParamsArr[i10] = annotatedWithParams;
        return true;
    }
}
