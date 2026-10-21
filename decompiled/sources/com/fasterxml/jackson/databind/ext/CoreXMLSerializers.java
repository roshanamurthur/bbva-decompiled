package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.io.IOException;
import java.util.Calendar;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

/* JADX INFO: loaded from: classes9.dex */
public class CoreXMLSerializers extends Serializers.Base {

    public static class XMLGregorianCalendarSerializer extends StdSerializer<XMLGregorianCalendar> implements ContextualSerializer {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final XMLGregorianCalendarSerializer f43305r0 = new XMLGregorianCalendarSerializer();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final JsonSerializer<Object> f43306q0;

        public XMLGregorianCalendarSerializer() {
            this(CalendarSerializer.instance);
        }

        public Calendar _convert(XMLGregorianCalendar xMLGregorianCalendar) {
            if (xMLGregorianCalendar == null) {
                return null;
            }
            return xMLGregorianCalendar.toGregorianCalendar();
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws JsonMappingException {
            this.f43306q0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper, null);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
        public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
            JsonSerializer<?> jsonSerializer = this.f43306q0;
            JsonSerializer<?> jsonSerializerHandlePrimaryContextualization = serializerProvider.handlePrimaryContextualization(jsonSerializer, beanProperty);
            return jsonSerializerHandlePrimaryContextualization != jsonSerializer ? new XMLGregorianCalendarSerializer(jsonSerializerHandlePrimaryContextualization) : this;
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public JsonSerializer<?> getDelegatee() {
            return this.f43306q0;
        }

        public XMLGregorianCalendarSerializer(JsonSerializer<?> jsonSerializer) {
            super(XMLGregorianCalendar.class);
            this.f43306q0 = jsonSerializer;
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public boolean isEmpty(SerializerProvider serializerProvider, XMLGregorianCalendar xMLGregorianCalendar) {
            return this.f43306q0.isEmpty(serializerProvider, _convert(xMLGregorianCalendar));
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
        public void serialize(XMLGregorianCalendar xMLGregorianCalendar, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            this.f43306q0.serialize(_convert(xMLGregorianCalendar), jsonGenerator, serializerProvider);
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public void serializeWithType(XMLGregorianCalendar xMLGregorianCalendar, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
            this.f43306q0.serializeWithType(_convert(xMLGregorianCalendar), jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.Serializers.Base, com.fasterxml.jackson.databind.ser.Serializers
    public JsonSerializer<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription) {
        Class<?> rawClass = javaType.getRawClass();
        if (Duration.class.isAssignableFrom(rawClass) || QName.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        if (XMLGregorianCalendar.class.isAssignableFrom(rawClass)) {
            return XMLGregorianCalendarSerializer.f43305r0;
        }
        return null;
    }
}
