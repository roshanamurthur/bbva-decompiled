package com.fasterxml.jackson.databind;

import ci.a;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public abstract class JsonDeserializer<T> implements NullValueProvider {

    public static abstract class None extends JsonDeserializer<Object> {
    }

    public abstract T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t10) throws IOException {
        if (deserializationContext.isEnabled(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            return deserialize(jsonParser, deserializationContext);
        }
        throw new UnsupportedOperationException("Cannot update object of type " + t10.getClass().getName() + " (by deserializer of type " + getClass().getName() + ")");
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public SettableBeanProperty findBackReference(String str) {
        StringBuilder sbD = a.d("Cannot handle managed/back reference '", str, "': type: value deserializer of type ");
        sbD.append(getClass().getName());
        sbD.append(" does not support them");
        throw new IllegalArgumentException(sbD.toString());
    }

    public JsonDeserializer<?> getDelegatee() {
        return null;
    }

    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }

    public Collection<Object> getKnownPropertyNames() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public AccessPattern getNullAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Deprecated
    public T getNullValue() {
        return null;
    }

    public ObjectIdReader getObjectIdReader() {
        return null;
    }

    public Class<?> handledType() {
        return null;
    }

    public boolean isCachable() {
        return false;
    }

    public JsonDeserializer<?> replaceDelegatee(JsonDeserializer<?> jsonDeserializer) {
        throw new UnsupportedOperationException();
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return null;
    }

    @Deprecated
    public Object getEmptyValue() {
        return getNullValue();
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue();
    }

    public JsonDeserializer<T> unwrappingDeserializer(NameTransformer nameTransformer) {
        return this;
    }
}
