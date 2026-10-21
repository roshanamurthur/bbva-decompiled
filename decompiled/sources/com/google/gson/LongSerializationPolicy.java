package com.google.gson;

/* JADX INFO: loaded from: classes10.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l6) {
            return new JsonPrimitive(l6);
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l6) {
            return new JsonPrimitive(String.valueOf(l6));
        }
    };

    public abstract JsonElement serialize(Long l6);
}
