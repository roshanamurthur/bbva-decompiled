package com.fasterxml.jackson.databind.ser.std;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes9.dex */
@JacksonStdImpl
public final class BooleanSerializer extends StdScalarSerializer<Object> implements ContextualSerializer {
    protected final boolean _forPrimitive;

    public static final class a extends StdScalarSerializer<Object> implements ContextualSerializer {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f43432q0;

        public a(boolean z10) {
            super(z10 ? Boolean.TYPE : Boolean.class, false);
            this.f43432q0 = z10;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
        public final void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws JsonMappingException {
            visitIntFormat(jsonFormatVisitorWrapper, javaType, JsonParser.NumberType.INT);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
        public final JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
            JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, Boolean.class);
            return (valueFindFormatOverrides == null || valueFindFormatOverrides.getShape().isNumeric()) ? this : new BooleanSerializer(this.f43432q0);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
        public final void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeNumber(!Boolean.FALSE.equals(obj) ? 1 : 0);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
        public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
            jsonGenerator.writeBoolean(Boolean.TRUE.equals(obj));
        }
    }

    public BooleanSerializer(boolean z10) {
        super(z10 ? Boolean.TYPE : Boolean.class, false);
        this._forPrimitive = z10;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws JsonMappingException {
        jsonFormatVisitorWrapper.expectBooleanFormat(javaType);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, Boolean.class);
        return (valueFindFormatOverrides == null || !valueFindFormatOverrides.getShape().isNumeric()) ? this : new a(this._forPrimitive);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode(TypedValues.Custom.S_BOOLEAN, !this._forPrimitive);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeBoolean(Boolean.TRUE.equals(obj));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        jsonGenerator.writeBoolean(Boolean.TRUE.equals(obj));
    }
}
