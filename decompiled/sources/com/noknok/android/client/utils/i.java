package com.noknok.android.client.utils;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements JsonDeserializer {
    @Override // com.google.gson.JsonDeserializer
    public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return JsonObjectAdapter.a(jsonElement, type, jsonDeserializationContext);
    }
}
