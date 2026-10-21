package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;

/* JADX INFO: loaded from: classes9.dex */
public class PropertyBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Boolean f43399a = Boolean.FALSE;
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final BeanDescription _beanDesc;
    protected final SerializationConfig _config;
    protected Object _defaultBean;
    protected final JsonInclude.Value _defaultInclusion;
    protected final boolean _useRealPropertyDefaults;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43400a;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f43400a = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43400a[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43400a[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43400a[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43400a[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43400a[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public PropertyBuilder(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        this._config = serializationConfig;
        this._beanDesc = beanDescription;
        JsonInclude.Value valueMerge = JsonInclude.Value.merge(beanDescription.findPropertyInclusion(JsonInclude.Value.empty()), serializationConfig.getDefaultPropertyInclusion(beanDescription.getBeanClass(), JsonInclude.Value.empty()));
        this._defaultInclusion = JsonInclude.Value.merge(serializationConfig.getDefaultPropertyInclusion(), valueMerge);
        this._useRealPropertyDefaults = valueMerge.getValueInclusion() == JsonInclude.Include.NON_DEFAULT;
        this._annotationIntrospector = serializationConfig.getAnnotationIntrospector();
    }

    public Object _throwWrapped(Exception exc, String str, Object obj) {
        Throwable cause = exc;
        while (cause.getCause() != null) {
            cause = cause.getCause();
        }
        ClassUtil.throwIfError(cause);
        ClassUtil.throwIfRTE(cause);
        StringBuilder sbD = ci.a.d("Failed to get property '", str, "' of default ");
        sbD.append(obj.getClass().getName());
        sbD.append(" instance");
        throw new IllegalArgumentException(sbD.toString());
    }

    public BeanPropertyWriter buildWriter(SerializerProvider serializerProvider, BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, JsonSerializer<?> jsonSerializer, TypeSerializer typeSerializer, TypeSerializer typeSerializer2, AnnotatedMember annotatedMember, boolean z10) throws JsonMappingException {
        JavaType javaType2;
        Object arrayComparator;
        Object defaultBean;
        boolean z11;
        Object obj;
        boolean zIncludeFilterSuppressNulls = false;
        try {
            JavaType javaTypeFindSerializationType = findSerializationType(annotatedMember, z10, javaType);
            if (typeSerializer2 != null) {
                if (javaTypeFindSerializationType == null) {
                    javaTypeFindSerializationType = javaType;
                }
                if (javaTypeFindSerializationType.getContentType() == null) {
                    serializerProvider.reportBadPropertyDefinition(this._beanDesc, beanPropertyDefinition, "serialization type " + javaTypeFindSerializationType + " has no content", new Object[0]);
                }
                JavaType javaTypeWithContentTypeHandler = javaTypeFindSerializationType.withContentTypeHandler(typeSerializer2);
                javaTypeWithContentTypeHandler.getContentType();
                javaType2 = javaTypeWithContentTypeHandler;
            } else {
                javaType2 = javaTypeFindSerializationType;
            }
            JavaType javaType3 = javaType2 == null ? javaType : javaType2;
            AnnotatedMember accessor = beanPropertyDefinition.getAccessor();
            if (accessor == null) {
                return (BeanPropertyWriter) serializerProvider.reportBadPropertyDefinition(this._beanDesc, beanPropertyDefinition, "could not determine property type", new Object[0]);
            }
            JsonInclude.Value valueWithOverrides = this._config.getDefaultInclusion(javaType3.getRawClass(), accessor.getRawType(), this._defaultInclusion).withOverrides(beanPropertyDefinition.findInclusion());
            JsonInclude.Include valueInclusion = valueWithOverrides.getValueInclusion();
            if (valueInclusion == JsonInclude.Include.USE_DEFAULTS) {
                valueInclusion = JsonInclude.Include.ALWAYS;
            }
            int i10 = a.f43400a[valueInclusion.ordinal()];
            Object defaultValue = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    if (javaType3.isReferenceType()) {
                        arrayComparator = BeanPropertyWriter.MARKER_FOR_EMPTY;
                    }
                    z11 = true;
                    obj = defaultValue;
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        zIncludeFilterSuppressNulls = i10 == 5;
                        if (javaType3.isContainerType() && !this._config.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS)) {
                            arrayComparator = BeanPropertyWriter.MARKER_FOR_EMPTY;
                        }
                        z11 = zIncludeFilterSuppressNulls;
                        obj = defaultValue;
                    } else {
                        arrayComparator = serializerProvider.includeFilterInstance(beanPropertyDefinition, valueWithOverrides.getValueFilter());
                        if (arrayComparator != null) {
                            zIncludeFilterSuppressNulls = serializerProvider.includeFilterSuppressNulls(arrayComparator);
                        }
                    }
                    obj = arrayComparator;
                    z11 = zIncludeFilterSuppressNulls;
                } else {
                    arrayComparator = BeanPropertyWriter.MARKER_FOR_EMPTY;
                }
                obj = arrayComparator;
                z11 = true;
            } else {
                if (!this._useRealPropertyDefaults || (defaultBean = getDefaultBean()) == null) {
                    defaultValue = BeanUtil.getDefaultValue(javaType3);
                    zIncludeFilterSuppressNulls = true;
                } else {
                    if (serializerProvider.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                        annotatedMember.fixAccess(this._config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    try {
                        defaultValue = annotatedMember.getValue(defaultBean);
                    } catch (Exception e5) {
                        _throwWrapped(e5, beanPropertyDefinition.getName(), defaultBean);
                    }
                }
                if (defaultValue == null) {
                    z11 = true;
                } else {
                    if (defaultValue.getClass().isArray()) {
                        arrayComparator = ArrayBuilders.getArrayComparator(defaultValue);
                        obj = arrayComparator;
                        z11 = zIncludeFilterSuppressNulls;
                    }
                    z11 = zIncludeFilterSuppressNulls;
                }
                obj = defaultValue;
            }
            Class<?>[] clsArrFindViews = beanPropertyDefinition.findViews();
            if (clsArrFindViews == null) {
                clsArrFindViews = this._beanDesc.findDefaultViews();
            }
            BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter(beanPropertyDefinition, annotatedMember, this._beanDesc.getClassAnnotations(), javaType, jsonSerializer, typeSerializer, javaType2, z11, obj, clsArrFindViews);
            Object objFindNullSerializer = this._annotationIntrospector.findNullSerializer(annotatedMember);
            if (objFindNullSerializer != null) {
                beanPropertyWriter.assignNullSerializer(serializerProvider.serializerInstance(annotatedMember, objFindNullSerializer));
            }
            NameTransformer nameTransformerFindUnwrappingNameTransformer = this._annotationIntrospector.findUnwrappingNameTransformer(annotatedMember);
            return nameTransformerFindUnwrappingNameTransformer != null ? beanPropertyWriter.unwrappingWriter(nameTransformerFindUnwrappingNameTransformer) : beanPropertyWriter;
        } catch (JsonMappingException e7) {
            return beanPropertyDefinition == null ? (BeanPropertyWriter) serializerProvider.reportBadDefinition(javaType, ClassUtil.exceptionMessage(e7)) : (BeanPropertyWriter) serializerProvider.reportBadPropertyDefinition(this._beanDesc, beanPropertyDefinition, ClassUtil.exceptionMessage(e7), new Object[0]);
        }
    }

    public JavaType findSerializationType(Annotated annotated, boolean z10, JavaType javaType) throws JsonMappingException {
        JavaType javaTypeRefineSerializationType = this._annotationIntrospector.refineSerializationType(this._config, annotated, javaType);
        if (javaTypeRefineSerializationType != javaType) {
            Class<?> rawClass = javaTypeRefineSerializationType.getRawClass();
            Class<?> rawClass2 = javaType.getRawClass();
            if (!rawClass.isAssignableFrom(rawClass2) && !rawClass2.isAssignableFrom(rawClass)) {
                throw new IllegalArgumentException("Illegal concrete-type annotation for method '" + annotated.getName() + "': class " + rawClass.getName() + " not a super-type of (declared) class " + rawClass2.getName());
            }
            z10 = true;
            javaType = javaTypeRefineSerializationType;
        }
        JsonSerialize.Typing typingFindSerializationTyping = this._annotationIntrospector.findSerializationTyping(annotated);
        if (typingFindSerializationTyping == null || typingFindSerializationTyping == JsonSerialize.Typing.DEFAULT_TYPING) {
            if (!z10) {
                return null;
            }
        } else if (typingFindSerializationTyping != JsonSerialize.Typing.STATIC) {
            return null;
        }
        return javaType.withStaticTyping();
    }

    public Annotations getClassAnnotations() {
        return this._beanDesc.getClassAnnotations();
    }

    public Object getDefaultBean() {
        Object objInstantiateBean = this._defaultBean;
        Boolean bool = f43399a;
        if (objInstantiateBean == null) {
            objInstantiateBean = this._beanDesc.instantiateBean(this._config.canOverrideAccessModifiers());
            if (objInstantiateBean == null) {
                objInstantiateBean = bool;
            }
            this._defaultBean = objInstantiateBean;
        }
        if (objInstantiateBean == bool) {
            return null;
        }
        return this._defaultBean;
    }

    @Deprecated
    public Object getDefaultValue(JavaType javaType) {
        return BeanUtil.getDefaultValue(javaType);
    }

    @Deprecated
    public Object getPropertyDefaultValue(String str, AnnotatedMember annotatedMember, JavaType javaType) {
        Object defaultBean = getDefaultBean();
        if (defaultBean == null) {
            return getDefaultValue(javaType);
        }
        try {
            return annotatedMember.getValue(defaultBean);
        } catch (Exception e5) {
            return _throwWrapped(e5, str, defaultBean);
        }
    }
}
