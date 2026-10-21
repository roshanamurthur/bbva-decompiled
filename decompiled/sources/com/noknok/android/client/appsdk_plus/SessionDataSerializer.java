package com.noknok.android.client.appsdk_plus;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class SessionDataSerializer implements JsonSerializer<SessionData> {
    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(SessionData sessionData, Type type, JsonSerializationContext jsonSerializationContext) {
        return new Gson().toJsonTree(sessionData.getMap(), HashMap.class);
    }
}
