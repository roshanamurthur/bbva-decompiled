package com.fasterxml.jackson.databind.deser.impl;

import androidx.collection.j;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import java.io.IOException;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes9.dex */
public class ObjectIdReferenceProperty extends SettableBeanProperty {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SettableBeanProperty f43240p0;

    public static final class PropertyReferring extends ReadableObjectId.Referring {
        public final Object _pojo;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ObjectIdReferenceProperty f43241c;

        public PropertyReferring(ObjectIdReferenceProperty objectIdReferenceProperty, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj) {
            super(unresolvedForwardReference, cls);
            this.f43241c = objectIdReferenceProperty;
            this._pojo = obj;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public void handleResolvedForwardReference(Object obj, Object obj2) throws IOException {
            if (!hasId(obj)) {
                throw new IllegalArgumentException(j.b("Trying to resolve a forward reference with id [", obj, "] that wasn't previously seen as unresolved."));
            }
            this.f43241c.set(this._pojo, obj2);
        }
    }

    public ObjectIdReferenceProperty(SettableBeanProperty settableBeanProperty, ObjectIdInfo objectIdInfo) {
        super(settableBeanProperty);
        this.f43240p0 = settableBeanProperty;
        this._objectIdInfo = objectIdInfo;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        deserializeSetAndReturn(jsonParser, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        try {
            return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
        } catch (UnresolvedForwardReference e5) {
            if (this._objectIdInfo == null && this._valueDeserializer.getObjectIdReader() == null) {
                throw JsonMappingException.from(jsonParser, "Unresolved forward reference but no identity info", e5);
            }
            e5.getRoid().appendReferring(new PropertyReferring(this, e5, this._type.getRawClass(), obj));
            return null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void fixAccess(DeserializationConfig deserializationConfig) {
        SettableBeanProperty settableBeanProperty = this.f43240p0;
        if (settableBeanProperty != null) {
            settableBeanProperty.fixAccess(deserializationConfig);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f43240p0.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public int getCreatorIndex() {
        return this.f43240p0.getCreatorIndex();
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this.f43240p0.getMember();
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void set(Object obj, Object obj2) throws IOException {
        this.f43240p0.set(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        return this.f43240p0.setAndReturn(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withName(PropertyName propertyName) {
        return new ObjectIdReferenceProperty(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withNullProvider(NullValueProvider nullValueProvider) {
        return new ObjectIdReferenceProperty(this, this._valueDeserializer, nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> jsonDeserializer) {
        JsonDeserializer<?> jsonDeserializer2 = this._valueDeserializer;
        if (jsonDeserializer2 == jsonDeserializer) {
            return this;
        }
        NullValueProvider nullValueProvider = this._nullProvider;
        if (jsonDeserializer2 == nullValueProvider) {
            nullValueProvider = jsonDeserializer;
        }
        return new ObjectIdReferenceProperty(this, jsonDeserializer, nullValueProvider);
    }

    public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectIdReferenceProperty, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider) {
        super(objectIdReferenceProperty, jsonDeserializer, nullValueProvider);
        this.f43240p0 = objectIdReferenceProperty.f43240p0;
        this._objectIdInfo = objectIdReferenceProperty._objectIdInfo;
    }

    public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectIdReferenceProperty, PropertyName propertyName) {
        super(objectIdReferenceProperty, propertyName);
        this.f43240p0 = objectIdReferenceProperty.f43240p0;
        this._objectIdInfo = objectIdReferenceProperty._objectIdInfo;
    }
}
