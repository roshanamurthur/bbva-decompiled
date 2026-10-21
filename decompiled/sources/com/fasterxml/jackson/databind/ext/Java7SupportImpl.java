package com.fasterxml.jackson.databind.ext;

import com.esotericsoftware.kryo.serializers.f0;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.beans.ConstructorProperties;
import java.beans.Transient;

/* JADX INFO: loaded from: classes9.dex */
public class Java7SupportImpl extends Java7Support {
    @Override // com.fasterxml.jackson.databind.ext.Java7Support
    public PropertyName findConstructorName(AnnotatedParameter annotatedParameter) {
        ConstructorProperties annotation;
        AnnotatedWithParams owner = annotatedParameter.getOwner();
        if (owner == null || (annotation = owner.getAnnotation(ConstructorProperties.class)) == null) {
            return null;
        }
        String[] strArrValue = annotation.value();
        int index = annotatedParameter.getIndex();
        if (index < strArrValue.length) {
            return PropertyName.construct(strArrValue[index]);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.ext.Java7Support
    public Boolean findTransient(Annotated annotated) {
        Transient annotation = annotated.getAnnotation(Transient.class);
        if (annotation != null) {
            return Boolean.valueOf(annotation.value());
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.ext.Java7Support
    public Class<?> getClassJavaNioFilePath() {
        return f0.d();
    }

    @Override // com.fasterxml.jackson.databind.ext.Java7Support
    public JsonDeserializer<?> getDeserializerForJavaNioFilePath(Class<?> cls) {
        if (cls == f0.d()) {
            return new NioPathDeserializer();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.ext.Java7Support
    public JsonSerializer<?> getSerializerForJavaNioFilePath(Class<?> cls) {
        if (f0.d().isAssignableFrom(cls)) {
            return new NioPathSerializer();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.ext.Java7Support
    public Boolean hasCreatorAnnotation(Annotated annotated) {
        if (annotated.getAnnotation(ConstructorProperties.class) != null) {
            return Boolean.TRUE;
        }
        return null;
    }
}
