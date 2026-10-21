package com.noknok.android.client.utils;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes11.dex */
public class JsonObjectAdapter {
    public static GsonBuilder GsonBuilder() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(JsonObject.class, new i());
        gsonBuilder.registerTypeAdapter(JsonObject.class, new j());
        gsonBuilder.disableHtmlEscaping();
        gsonBuilder.excludeFieldsWithoutExposeAnnotation();
        return gsonBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JsonElement a(JsonObject jsonObject, Type type, JsonSerializationContext jsonSerializationContext) {
        return jsonObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JsonObject a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return (JsonObject) jsonElement;
    }
}
