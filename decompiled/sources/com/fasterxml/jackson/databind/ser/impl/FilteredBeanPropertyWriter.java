package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;

/* JADX INFO: loaded from: classes9.dex */
public abstract class FilteredBeanPropertyWriter {

    public static final class a extends BeanPropertyWriter {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BeanPropertyWriter f43403p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Class<?>[] f43404q0;

        public a(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
            super(beanPropertyWriter);
            this.f43403p0 = beanPropertyWriter;
            this.f43404q0 = clsArr;
        }

        public final boolean a(Class<?> cls) {
            if (cls == null) {
                return true;
            }
            for (Class<?> cls2 : this.f43404q0) {
                if (cls2.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public final void assignNullSerializer(JsonSerializer<Object> jsonSerializer) {
            this.f43403p0.assignNullSerializer(jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public final void assignSerializer(JsonSerializer<Object> jsonSerializer) {
            this.f43403p0.assignSerializer(jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
        public final void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws JsonMappingException {
            if (a(serializerProvider.getActiveView())) {
                super.depositSchemaProperty(jsonObjectFormatVisitor, serializerProvider);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public final BeanPropertyWriter rename(NameTransformer nameTransformer) {
            return new a(this.f43403p0.rename(nameTransformer), this.f43404q0);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
        public final void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
            boolean zA = a(serializerProvider.getActiveView());
            BeanPropertyWriter beanPropertyWriter = this.f43403p0;
            if (zA) {
                beanPropertyWriter.serializeAsElement(obj, jsonGenerator, serializerProvider);
            } else {
                beanPropertyWriter.serializeAsPlaceholder(obj, jsonGenerator, serializerProvider);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
        public final void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
            boolean zA = a(serializerProvider.getActiveView());
            BeanPropertyWriter beanPropertyWriter = this.f43403p0;
            if (zA) {
                beanPropertyWriter.serializeAsField(obj, jsonGenerator, serializerProvider);
            } else {
                beanPropertyWriter.serializeAsOmittedField(obj, jsonGenerator, serializerProvider);
            }
        }
    }

    public static final class b extends BeanPropertyWriter {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BeanPropertyWriter f43405p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Class<?> f43406q0;

        public b(Class cls, BeanPropertyWriter beanPropertyWriter) {
            super(beanPropertyWriter);
            this.f43405p0 = beanPropertyWriter;
            this.f43406q0 = cls;
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public final void assignNullSerializer(JsonSerializer<Object> jsonSerializer) {
            this.f43405p0.assignNullSerializer(jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public final void assignSerializer(JsonSerializer<Object> jsonSerializer) {
            this.f43405p0.assignSerializer(jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
        public final void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws JsonMappingException {
            Class<?> activeView = serializerProvider.getActiveView();
            if (activeView == null || this.f43406q0.isAssignableFrom(activeView)) {
                super.depositSchemaProperty(jsonObjectFormatVisitor, serializerProvider);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public final BeanPropertyWriter rename(NameTransformer nameTransformer) {
            return new b(this.f43406q0, this.f43405p0.rename(nameTransformer));
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
        public final void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
            Class<?> activeView = serializerProvider.getActiveView();
            BeanPropertyWriter beanPropertyWriter = this.f43405p0;
            if (activeView == null || this.f43406q0.isAssignableFrom(activeView)) {
                beanPropertyWriter.serializeAsElement(obj, jsonGenerator, serializerProvider);
            } else {
                beanPropertyWriter.serializeAsPlaceholder(obj, jsonGenerator, serializerProvider);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
        public final void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
            Class<?> activeView = serializerProvider.getActiveView();
            BeanPropertyWriter beanPropertyWriter = this.f43405p0;
            if (activeView == null || this.f43406q0.isAssignableFrom(activeView)) {
                beanPropertyWriter.serializeAsField(obj, jsonGenerator, serializerProvider);
            } else {
                beanPropertyWriter.serializeAsOmittedField(obj, jsonGenerator, serializerProvider);
            }
        }
    }

    public static BeanPropertyWriter constructViewBased(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
        return clsArr.length == 1 ? new b(clsArr[0], beanPropertyWriter) : new a(beanPropertyWriter, clsArr);
    }
}
