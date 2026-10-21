package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes9.dex */
@JacksonStdImpl
public class JsonValueSerializer extends StdSerializer<Object> implements ContextualSerializer {
    protected final AnnotatedMember _accessor;
    protected final boolean _forceTypeInformation;
    protected final BeanProperty _property;
    protected final JsonSerializer<Object> _valueSerializer;

    public static class a extends TypeSerializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypeSerializer f43433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f43434b;

        public a(TypeSerializer typeSerializer, Object obj) {
            this.f43433a = typeSerializer;
            this.f43434b = obj;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public final TypeSerializer forProperty(BeanProperty beanProperty) {
            throw new UnsupportedOperationException();
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public final String getPropertyName() {
            return this.f43433a.getPropertyName();
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public final TypeIdResolver getTypeIdResolver() {
            return this.f43433a.getTypeIdResolver();
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public final JsonTypeInfo.As getTypeInclusion() {
            return this.f43433a.getTypeInclusion();
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public final void writeCustomTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this.f43433a.writeCustomTypePrefixForArray(this.f43434b, jsonGenerator, str);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public final void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this.f43433a.writeCustomTypePrefixForObject(this.f43434b, jsonGenerator, str);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public final void writeCustomTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this.f43433a.writeCustomTypePrefixForScalar(this.f43434b, jsonGenerator, str);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public final void writeCustomTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this.f43433a.writeCustomTypeSuffixForArray(this.f43434b, jsonGenerator, str);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public final void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this.f43433a.writeCustomTypeSuffixForObject(this.f43434b, jsonGenerator, str);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public final void writeCustomTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this.f43433a.writeCustomTypeSuffixForScalar(this.f43434b, jsonGenerator, str);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public final WritableTypeId writeTypePrefix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
            writableTypeId.forValue = this.f43434b;
            return this.f43433a.writeTypePrefix(jsonGenerator, writableTypeId);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public final void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this.f43433a.writeTypePrefixForArray(this.f43434b, jsonGenerator);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public final void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this.f43433a.writeTypePrefixForObject(this.f43434b, jsonGenerator);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public final void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this.f43433a.writeTypePrefixForScalar(this.f43434b, jsonGenerator);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public final WritableTypeId writeTypeSuffix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
            return this.f43433a.writeTypeSuffix(jsonGenerator, writableTypeId);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public final void writeTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this.f43433a.writeTypeSuffixForArray(this.f43434b, jsonGenerator);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public final void writeTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this.f43433a.writeTypeSuffixForObject(this.f43434b, jsonGenerator);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public final void writeTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this.f43433a.writeTypeSuffixForScalar(this.f43434b, jsonGenerator);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public final void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, Class<?> cls) throws IOException {
            this.f43433a.writeTypePrefixForArray(this.f43434b, jsonGenerator, cls);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public final void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, Class<?> cls) throws IOException {
            this.f43433a.writeTypePrefixForObject(this.f43434b, jsonGenerator, cls);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        @Deprecated
        public final void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, Class<?> cls) throws IOException {
            this.f43433a.writeTypePrefixForScalar(this.f43434b, jsonGenerator, cls);
        }
    }

    public JsonValueSerializer(AnnotatedMember annotatedMember, JsonSerializer<?> jsonSerializer) {
        super(annotatedMember.getType());
        this._accessor = annotatedMember;
        this._valueSerializer = jsonSerializer;
        this._property = null;
        this._forceTypeInformation = true;
    }

    public boolean _acceptJsonFormatVisitorForEnum(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, Class<?> cls) throws JsonMappingException {
        JsonStringFormatVisitor jsonStringFormatVisitorExpectStringFormat = jsonFormatVisitorWrapper.expectStringFormat(javaType);
        if (jsonStringFormatVisitorExpectStringFormat == null) {
            return true;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : cls.getEnumConstants()) {
            try {
                linkedHashSet.add(String.valueOf(this._accessor.getValue(obj)));
            } catch (Exception e5) {
                e = e5;
                while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                    e = e.getCause();
                }
                ClassUtil.throwIfError(e);
                throw JsonMappingException.wrapWithPath(e, obj, this._accessor.getName() + "()");
            }
        }
        jsonStringFormatVisitorExpectStringFormat.enumTypes(linkedHashSet);
        return true;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws JsonMappingException {
        JavaType type = this._accessor.getType();
        Class<?> declaringClass = this._accessor.getDeclaringClass();
        if (declaringClass != null && declaringClass.isEnum() && _acceptJsonFormatVisitorForEnum(jsonFormatVisitorWrapper, javaType, declaringClass)) {
            return;
        }
        JsonSerializer<Object> jsonSerializerFindTypedValueSerializer = this._valueSerializer;
        if (jsonSerializerFindTypedValueSerializer == null && (jsonSerializerFindTypedValueSerializer = jsonFormatVisitorWrapper.getProvider().findTypedValueSerializer(type, false, this._property)) == null) {
            jsonFormatVisitorWrapper.expectAnyFormat(javaType);
        } else {
            jsonSerializerFindTypedValueSerializer.acceptJsonFormatVisitor(jsonFormatVisitorWrapper, type);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<?> jsonSerializer = this._valueSerializer;
        if (jsonSerializer != null) {
            return withResolved(beanProperty, serializerProvider.handlePrimaryContextualization(jsonSerializer, beanProperty), this._forceTypeInformation);
        }
        JavaType type = this._accessor.getType();
        if (!serializerProvider.isEnabled(MapperFeature.USE_STATIC_TYPING) && !type.isFinal()) {
            return this;
        }
        JsonSerializer<Object> jsonSerializerFindPrimaryPropertySerializer = serializerProvider.findPrimaryPropertySerializer(type, beanProperty);
        return withResolved(beanProperty, jsonSerializerFindPrimaryPropertySerializer, isNaturalTypeWithStdHandling(type.getRawClass(), jsonSerializerFindPrimaryPropertySerializer));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) throws JsonMappingException {
        JsonFormatVisitable jsonFormatVisitable = this._valueSerializer;
        return jsonFormatVisitable instanceof SchemaAware ? ((SchemaAware) jsonFormatVisitable).getSchema(serializerProvider, null) : JsonSchema.getDefaultSchemaNode();
    }

    public boolean isNaturalTypeWithStdHandling(Class<?> cls, JsonSerializer<?> jsonSerializer) {
        if (cls.isPrimitive()) {
            if (cls != Integer.TYPE && cls != Boolean.TYPE && cls != Double.TYPE) {
                return false;
            }
        } else if (cls != String.class && cls != Integer.class && cls != Boolean.class && cls != Double.class) {
            return false;
        }
        return isDefaultSerializer(jsonSerializer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        try {
            Object value = this._accessor.getValue(obj);
            if (value == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
                return;
            }
            JsonSerializer<Object> jsonSerializerFindTypedValueSerializer = this._valueSerializer;
            if (jsonSerializerFindTypedValueSerializer == null) {
                jsonSerializerFindTypedValueSerializer = serializerProvider.findTypedValueSerializer(value.getClass(), true, this._property);
            }
            jsonSerializerFindTypedValueSerializer.serialize(value, jsonGenerator, serializerProvider);
        } catch (Exception e5) {
            wrapAndThrow(serializerProvider, e5, obj, this._accessor.getName() + "()");
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        try {
            Object value = this._accessor.getValue(obj);
            if (value == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
                return;
            }
            JsonSerializer<Object> jsonSerializerFindValueSerializer = this._valueSerializer;
            if (jsonSerializerFindValueSerializer == null) {
                jsonSerializerFindValueSerializer = serializerProvider.findValueSerializer(value.getClass(), this._property);
            } else if (this._forceTypeInformation) {
                WritableTypeId writableTypeIdWriteTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(obj, JsonToken.VALUE_STRING));
                jsonSerializerFindValueSerializer.serialize(value, jsonGenerator, serializerProvider);
                typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeIdWriteTypePrefix);
                return;
            }
            jsonSerializerFindValueSerializer.serializeWithType(value, jsonGenerator, serializerProvider, new a(typeSerializer, obj));
        } catch (Exception e5) {
            wrapAndThrow(serializerProvider, e5, obj, this._accessor.getName() + "()");
        }
    }

    public String toString() {
        return "(@JsonValue serializer for method " + this._accessor.getDeclaringClass() + "#" + this._accessor.getName() + ")";
    }

    public JsonValueSerializer withResolved(BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, boolean z10) {
        return (this._property == beanProperty && this._valueSerializer == jsonSerializer && z10 == this._forceTypeInformation) ? this : new JsonValueSerializer(this, beanProperty, jsonSerializer, z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public JsonValueSerializer(JsonValueSerializer jsonValueSerializer, BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, boolean z10) {
        Class clsHandledType = jsonValueSerializer.handledType();
        super(clsHandledType == null ? Object.class : clsHandledType);
        this._accessor = jsonValueSerializer._accessor;
        this._valueSerializer = jsonSerializer;
        this._property = beanProperty;
        this._forceTypeInformation = z10;
    }
}
