package com.noknok.android.client.utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j implements JsonSerializer {
    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        return JsonObjectAdapter.a((JsonObject) obj, type, jsonSerializationContext);
    }
}
