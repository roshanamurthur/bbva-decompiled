package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ReferenceTypeSerializer<T> extends StdSerializer<T> implements ContextualSerializer {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    protected transient PropertySerializerMap _dynamicSerializers;
    protected final BeanProperty _property;
    protected final JavaType _referredType;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected final NameTransformer _unwrapper;
    protected final JsonSerializer<Object> _valueSerializer;
    protected final TypeSerializer _valueTypeSerializer;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43442a;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f43442a = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43442a[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43442a[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43442a[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43442a[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43442a[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ReferenceTypeSerializer(ReferenceType referenceType, boolean z10, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        super(referenceType);
        this._referredType = referenceType.getReferencedType();
        this._property = null;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer;
        this._unwrapper = null;
        this._suppressableValue = null;
        this._suppressNulls = false;
        this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
    }

    public abstract Object _getReferenced(T t10);

    public abstract Object _getReferencedIfPresent(T t10);

    public abstract boolean _isValuePresent(T t10);

    public boolean _useStatic(SerializerProvider serializerProvider, BeanProperty beanProperty, JavaType javaType) {
        if (javaType.isJavaLangObject()) {
            return false;
        }
        if (javaType.isFinal() || javaType.useStaticType()) {
            return true;
        }
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        if (annotationIntrospector != null && beanProperty != null && beanProperty.getMember() != null) {
            JsonSerialize.Typing typingFindSerializationTyping = annotationIntrospector.findSerializationTyping(beanProperty.getMember());
            if (typingFindSerializationTyping == JsonSerialize.Typing.STATIC) {
                return true;
            }
            if (typingFindSerializationTyping == JsonSerialize.Typing.DYNAMIC) {
                return false;
            }
        }
        return serializerProvider.isEnabled(MapperFeature.USE_STATIC_TYPING);
    }

    public final JsonSerializer a(Class cls, SerializerProvider serializerProvider) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerSerializerFor = this._dynamicSerializers.serializerFor(cls);
        if (jsonSerializerSerializerFor != null) {
            return jsonSerializerSerializerFor;
        }
        JsonSerializer<Object> jsonSerializerFindValueSerializer = this._referredType.hasGenericTypes() ? serializerProvider.findValueSerializer(serializerProvider.constructSpecializedType(this._referredType, cls), this._property) : serializerProvider.findValueSerializer((Class<?>) cls, this._property);
        NameTransformer nameTransformer = this._unwrapper;
        if (nameTransformer != null) {
            jsonSerializerFindValueSerializer = jsonSerializerFindValueSerializer.unwrappingSerializer(nameTransformer);
        }
        JsonSerializer<Object> jsonSerializer = jsonSerializerFindValueSerializer;
        this._dynamicSerializers = this._dynamicSerializers.newWith(cls, jsonSerializer);
        return jsonSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerFindValueSerializer = this._valueSerializer;
        if (jsonSerializerFindValueSerializer == null) {
            jsonSerializerFindValueSerializer = jsonFormatVisitorWrapper.getProvider().findValueSerializer(this._referredType, this._property);
            NameTransformer nameTransformer = this._unwrapper;
            if (nameTransformer != null) {
                jsonSerializerFindValueSerializer = jsonSerializerFindValueSerializer.unwrappingSerializer(nameTransformer);
            }
        }
        jsonSerializerFindValueSerializer.acceptJsonFormatVisitor(jsonFormatVisitorWrapper, this._referredType);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonInclude.Value valueFindPropertyInclusion;
        JsonInclude.Include contentInclusion;
        Object defaultValue;
        TypeSerializer typeSerializerForProperty = this._valueTypeSerializer;
        if (typeSerializerForProperty != null) {
            typeSerializerForProperty = typeSerializerForProperty.forProperty(beanProperty);
        }
        JsonSerializer<?> jsonSerializerFindAnnotatedContentSerializer = findAnnotatedContentSerializer(serializerProvider, beanProperty);
        if (jsonSerializerFindAnnotatedContentSerializer == null) {
            jsonSerializerFindAnnotatedContentSerializer = this._valueSerializer;
            if (jsonSerializerFindAnnotatedContentSerializer != null) {
                jsonSerializerFindAnnotatedContentSerializer = serializerProvider.handlePrimaryContextualization(jsonSerializerFindAnnotatedContentSerializer, beanProperty);
            } else if (_useStatic(serializerProvider, beanProperty, this._referredType)) {
                jsonSerializerFindAnnotatedContentSerializer = serializerProvider.findValueSerializer(this._referredType, beanProperty);
            }
        }
        ReferenceTypeSerializer<T> referenceTypeSerializerWithResolved = (this._property == beanProperty && this._valueTypeSerializer == typeSerializerForProperty && this._valueSerializer == jsonSerializerFindAnnotatedContentSerializer) ? this : withResolved(beanProperty, typeSerializerForProperty, jsonSerializerFindAnnotatedContentSerializer, this._unwrapper);
        if (beanProperty == null || (valueFindPropertyInclusion = beanProperty.findPropertyInclusion(serializerProvider.getConfig(), handledType())) == null || (contentInclusion = valueFindPropertyInclusion.getContentInclusion()) == JsonInclude.Include.USE_DEFAULTS) {
            return referenceTypeSerializerWithResolved;
        }
        int i10 = a.f43442a[contentInclusion.ordinal()];
        boolean zIncludeFilterSuppressNulls = true;
        if (i10 != 1) {
            defaultValue = null;
            if (i10 != 2) {
                if (i10 == 3) {
                    defaultValue = MARKER_FOR_EMPTY;
                } else if (i10 == 4) {
                    defaultValue = serializerProvider.includeFilterInstance(null, valueFindPropertyInclusion.getContentFilter());
                    if (defaultValue != null) {
                        zIncludeFilterSuppressNulls = serializerProvider.includeFilterSuppressNulls(defaultValue);
                    }
                } else if (i10 != 5) {
                    zIncludeFilterSuppressNulls = false;
                }
            } else if (this._referredType.isReferenceType()) {
                defaultValue = MARKER_FOR_EMPTY;
            }
        } else {
            defaultValue = BeanUtil.getDefaultValue(this._referredType);
            if (defaultValue != null && defaultValue.getClass().isArray()) {
                defaultValue = ArrayBuilders.getArrayComparator(defaultValue);
            }
        }
        return (this._suppressableValue == defaultValue && this._suppressNulls == zIncludeFilterSuppressNulls) ? referenceTypeSerializerWithResolved : referenceTypeSerializerWithResolved.withContentInclusion(defaultValue, zIncludeFilterSuppressNulls);
    }

    public JavaType getReferredType() {
        return this._referredType;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, T t10) {
        if (!_isValuePresent(t10)) {
            return true;
        }
        Object obj_getReferenced = _getReferenced(t10);
        if (obj_getReferenced == null) {
            return this._suppressNulls;
        }
        if (this._suppressableValue == null) {
            return false;
        }
        JsonSerializer<Object> jsonSerializerA = this._valueSerializer;
        if (jsonSerializerA == null) {
            try {
                jsonSerializerA = a(obj_getReferenced.getClass(), serializerProvider);
            } catch (JsonMappingException e5) {
                throw new RuntimeJsonMappingException(e5);
            }
        }
        Object obj = this._suppressableValue;
        return obj == MARKER_FOR_EMPTY ? jsonSerializerA.isEmpty(serializerProvider, obj_getReferenced) : obj.equals(obj_getReferenced);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isUnwrappingSerializer() {
        return this._unwrapper != null;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(T t10, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Object obj_getReferencedIfPresent = _getReferencedIfPresent(t10);
        if (obj_getReferencedIfPresent == null) {
            if (this._unwrapper == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
                return;
            }
            return;
        }
        JsonSerializer<Object> jsonSerializerA = this._valueSerializer;
        if (jsonSerializerA == null) {
            jsonSerializerA = a(obj_getReferencedIfPresent.getClass(), serializerProvider);
        }
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        if (typeSerializer != null) {
            jsonSerializerA.serializeWithType(obj_getReferencedIfPresent, jsonGenerator, serializerProvider, typeSerializer);
        } else {
            jsonSerializerA.serialize(obj_getReferencedIfPresent, jsonGenerator, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(T t10, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        Object obj_getReferencedIfPresent = _getReferencedIfPresent(t10);
        if (obj_getReferencedIfPresent == null) {
            if (this._unwrapper == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
            }
        } else {
            JsonSerializer<Object> jsonSerializerA = this._valueSerializer;
            if (jsonSerializerA == null) {
                jsonSerializerA = a(obj_getReferencedIfPresent.getClass(), serializerProvider);
            }
            jsonSerializerA.serializeWithType(obj_getReferencedIfPresent, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public JsonSerializer<T> unwrappingSerializer(NameTransformer nameTransformer) {
        JsonSerializer<?> jsonSerializerUnwrappingSerializer = this._valueSerializer;
        if (jsonSerializerUnwrappingSerializer != null) {
            jsonSerializerUnwrappingSerializer = jsonSerializerUnwrappingSerializer.unwrappingSerializer(nameTransformer);
        }
        NameTransformer nameTransformer2 = this._unwrapper;
        if (nameTransformer2 != null) {
            nameTransformer = NameTransformer.chainedTransformer(nameTransformer, nameTransformer2);
        }
        return (this._valueSerializer == jsonSerializerUnwrappingSerializer && this._unwrapper == nameTransformer) ? this : withResolved(this._property, this._valueTypeSerializer, jsonSerializerUnwrappingSerializer, nameTransformer);
    }

    public abstract ReferenceTypeSerializer<T> withContentInclusion(Object obj, boolean z10);

    public abstract ReferenceTypeSerializer<T> withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, NameTransformer nameTransformer);

    public ReferenceTypeSerializer(ReferenceTypeSerializer<?> referenceTypeSerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, NameTransformer nameTransformer, Object obj, boolean z10) {
        super(referenceTypeSerializer);
        this._referredType = referenceTypeSerializer._referredType;
        this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
        this._property = beanProperty;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer;
        this._unwrapper = nameTransformer;
        this._suppressableValue = obj;
        this._suppressNulls = z10;
    }
}
