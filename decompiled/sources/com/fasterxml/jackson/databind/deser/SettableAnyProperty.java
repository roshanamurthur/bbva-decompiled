package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class SettableAnyProperty implements Serializable {
    protected final KeyDeserializer _keyDeserializer;
    protected final BeanProperty _property;
    protected final AnnotatedMember _setter;
    protected final JavaType _type;
    protected JsonDeserializer<Object> _valueDeserializer;
    protected final TypeDeserializer _valueTypeDeserializer;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f43198p0;

    public static class a extends ReadableObjectId.Referring {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SettableAnyProperty f43199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f43200d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f43201e;

        public a(SettableAnyProperty settableAnyProperty, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj, String str) {
            super(unresolvedForwardReference, cls);
            this.f43199c = settableAnyProperty;
            this.f43200d = obj;
            this.f43201e = str;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public final void handleResolvedForwardReference(Object obj, Object obj2) throws IOException {
            if (hasId(obj)) {
                this.f43199c.set(this.f43200d, this.f43201e, obj2);
            } else {
                throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj.toString() + "] that wasn't previously registered.");
            }
        }
    }

    public SettableAnyProperty(BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        this._property = beanProperty;
        this._setter = annotatedMember;
        this._type = javaType;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._keyDeserializer = keyDeserializer;
        this.f43198p0 = annotatedMember instanceof AnnotatedField;
    }

    public void _throwAsIOE(Exception exc, Object obj, Object obj2) throws IOException {
        if (!(exc instanceof IllegalArgumentException)) {
            ClassUtil.throwIfIOE(exc);
            ClassUtil.throwIfRTE(exc);
            Throwable rootCause = ClassUtil.getRootCause(exc);
            throw new JsonMappingException((Closeable) null, ClassUtil.exceptionMessage(rootCause), rootCause);
        }
        String strClassNameOf = ClassUtil.classNameOf(obj2);
        StringBuilder sb2 = new StringBuilder("Problem deserializing \"any\" property '");
        sb2.append(obj);
        sb2.append("' of class " + this._setter.getDeclaringClass().getName() + " (expected type: ");
        sb2.append(this._type);
        sb2.append("; actual type: ");
        sb2.append(strClassNameOf);
        sb2.append(")");
        String strExceptionMessage = ClassUtil.exceptionMessage(exc);
        if (strExceptionMessage != null) {
            sb2.append(", problem: ");
            sb2.append(strExceptionMessage);
        } else {
            sb2.append(" (no error message provided)");
        }
        throw new JsonMappingException((Closeable) null, sb2.toString(), exc);
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return this._valueDeserializer.getNullValue(deserializationContext);
        }
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        return typeDeserializer != null ? this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer) : this._valueDeserializer.deserialize(jsonParser, deserializationContext);
    }

    public final void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        try {
            KeyDeserializer keyDeserializer = this._keyDeserializer;
            set(obj, keyDeserializer == null ? str : keyDeserializer.deserializeKey(str, deserializationContext), deserialize(jsonParser, deserializationContext));
        } catch (UnresolvedForwardReference e5) {
            if (this._valueDeserializer.getObjectIdReader() == null) {
                throw JsonMappingException.from(jsonParser, "Unresolved forward reference but no identity info.", e5);
            }
            e5.getRoid().appendReferring(new a(this, e5, this._type.getRawClass(), obj, str));
        }
    }

    public void fixAccess(DeserializationConfig deserializationConfig) {
        this._setter.fixAccess(deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public BeanProperty getProperty() {
        return this._property;
    }

    public JavaType getType() {
        return this._type;
    }

    public boolean hasValueDeserializer() {
        return this._valueDeserializer != null;
    }

    public Object readResolve() {
        AnnotatedMember annotatedMember = this._setter;
        if (annotatedMember == null || annotatedMember.getAnnotated() == null) {
            throw new IllegalArgumentException("Missing method (broken JDK (de)serialization?)");
        }
        return this;
    }

    public void set(Object obj, Object obj2, Object obj3) throws IOException {
        try {
            if (this.f43198p0) {
                Map map = (Map) ((AnnotatedField) this._setter).getValue(obj);
                if (map != null) {
                    map.put(obj2, obj3);
                }
            } else {
                ((AnnotatedMethod) this._setter).callOnWith(obj, obj2, obj3);
            }
        } catch (Exception e5) {
            _throwAsIOE(e5, obj2, obj3);
        }
    }

    public String toString() {
        return "[any property on class " + this._setter.getDeclaringClass().getName() + Constant.BRACKET_CLOSE;
    }

    public SettableAnyProperty withValueDeserializer(JsonDeserializer<Object> jsonDeserializer) {
        return new SettableAnyProperty(this._property, this._setter, this._type, this._keyDeserializer, jsonDeserializer, this._valueTypeDeserializer);
    }

    @Deprecated
    public SettableAnyProperty(BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        this(beanProperty, annotatedMember, javaType, null, jsonDeserializer, typeDeserializer);
    }
}
