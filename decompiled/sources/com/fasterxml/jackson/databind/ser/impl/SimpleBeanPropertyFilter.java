package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class SimpleBeanPropertyFilter implements BeanPropertyFilter, PropertyFilter {

    public static class FilterExceptFilter extends SimpleBeanPropertyFilter implements Serializable {
        protected final Set<String> _propertiesToInclude;

        public FilterExceptFilter(Set<String> set) {
            this._propertiesToInclude = set;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter
        public boolean include(BeanPropertyWriter beanPropertyWriter) {
            return this._propertiesToInclude.contains(beanPropertyWriter.getName());
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter
        public boolean include(PropertyWriter propertyWriter) {
            return this._propertiesToInclude.contains(propertyWriter.getName());
        }
    }

    public static class SerializeExceptFilter extends SimpleBeanPropertyFilter implements Serializable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final SerializeExceptFilter f43427p0 = new SerializeExceptFilter();
        protected final Set<String> _propertiesToExclude;

        public SerializeExceptFilter() {
            this._propertiesToExclude = Collections.emptySet();
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter
        public boolean include(BeanPropertyWriter beanPropertyWriter) {
            return !this._propertiesToExclude.contains(beanPropertyWriter.getName());
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter
        public boolean include(PropertyWriter propertyWriter) {
            return !this._propertiesToExclude.contains(propertyWriter.getName());
        }

        public SerializeExceptFilter(Set<String> set) {
            this._propertiesToExclude = set;
        }
    }

    public static class a implements PropertyFilter {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ BeanPropertyFilter f43428p0;

        public a(BeanPropertyFilter beanPropertyFilter) {
            this.f43428p0 = beanPropertyFilter;
        }

        @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
        public final void depositSchemaProperty(PropertyWriter propertyWriter, ObjectNode objectNode, SerializerProvider serializerProvider) throws JsonMappingException {
            this.f43428p0.depositSchemaProperty((BeanPropertyWriter) propertyWriter, objectNode, serializerProvider);
        }

        @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
        public final void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, PropertyWriter propertyWriter) throws Exception {
            throw new UnsupportedOperationException();
        }

        @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
        public final void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, PropertyWriter propertyWriter) throws Exception {
            this.f43428p0.serializeAsField(obj, jsonGenerator, serializerProvider, (BeanPropertyWriter) propertyWriter);
        }

        @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
        public final void depositSchemaProperty(PropertyWriter propertyWriter, JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws JsonMappingException {
            this.f43428p0.depositSchemaProperty((BeanPropertyWriter) propertyWriter, jsonObjectFormatVisitor, serializerProvider);
        }
    }

    public static SimpleBeanPropertyFilter filterOutAllExcept(Set<String> set) {
        return new FilterExceptFilter(set);
    }

    public static PropertyFilter from(BeanPropertyFilter beanPropertyFilter) {
        return new a(beanPropertyFilter);
    }

    public static SimpleBeanPropertyFilter serializeAll() {
        return SerializeExceptFilter.f43427p0;
    }

    public static SimpleBeanPropertyFilter serializeAllExcept(Set<String> set) {
        return new SerializeExceptFilter(set);
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyFilter
    @Deprecated
    public void depositSchemaProperty(BeanPropertyWriter beanPropertyWriter, ObjectNode objectNode, SerializerProvider serializerProvider) throws JsonMappingException {
        if (include(beanPropertyWriter)) {
            beanPropertyWriter.depositSchemaProperty(objectNode, serializerProvider);
        }
    }

    public boolean include(BeanPropertyWriter beanPropertyWriter) {
        return true;
    }

    public boolean includeElement(Object obj) {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, PropertyWriter propertyWriter) throws Exception {
        if (includeElement(obj)) {
            propertyWriter.serializeAsElement(obj, jsonGenerator, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyFilter
    @Deprecated
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, BeanPropertyWriter beanPropertyWriter) throws Exception {
        if (include(beanPropertyWriter)) {
            beanPropertyWriter.serializeAsField(obj, jsonGenerator, serializerProvider);
        } else {
            if (jsonGenerator.canOmitFields()) {
                return;
            }
            beanPropertyWriter.serializeAsOmittedField(obj, jsonGenerator, serializerProvider);
        }
    }

    public static SimpleBeanPropertyFilter filterOutAllExcept(String... strArr) {
        HashSet hashSet = new HashSet(strArr.length);
        Collections.addAll(hashSet, strArr);
        return new FilterExceptFilter(hashSet);
    }

    @Deprecated
    public static SimpleBeanPropertyFilter serializeAll(Set<String> set) {
        return new FilterExceptFilter(set);
    }

    public static SimpleBeanPropertyFilter serializeAllExcept(String... strArr) {
        HashSet hashSet = new HashSet(strArr.length);
        Collections.addAll(hashSet, strArr);
        return new SerializeExceptFilter(hashSet);
    }

    public boolean include(PropertyWriter propertyWriter) {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyFilter
    @Deprecated
    public void depositSchemaProperty(BeanPropertyWriter beanPropertyWriter, JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws JsonMappingException {
        if (include(beanPropertyWriter)) {
            beanPropertyWriter.depositSchemaProperty(jsonObjectFormatVisitor, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
    @Deprecated
    public void depositSchemaProperty(PropertyWriter propertyWriter, ObjectNode objectNode, SerializerProvider serializerProvider) throws JsonMappingException {
        if (include(propertyWriter)) {
            propertyWriter.depositSchemaProperty(objectNode, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, PropertyWriter propertyWriter) throws Exception {
        if (include(propertyWriter)) {
            propertyWriter.serializeAsField(obj, jsonGenerator, serializerProvider);
        } else {
            if (jsonGenerator.canOmitFields()) {
                return;
            }
            propertyWriter.serializeAsOmittedField(obj, jsonGenerator, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyFilter
    public void depositSchemaProperty(PropertyWriter propertyWriter, JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws JsonMappingException {
        if (include(propertyWriter)) {
            propertyWriter.depositSchemaProperty(jsonObjectFormatVisitor, serializerProvider);
        }
    }
}
