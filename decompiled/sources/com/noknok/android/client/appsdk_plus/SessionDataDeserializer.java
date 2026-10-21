package com.noknok.android.client.appsdk_plus;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class SessionDataDeserializer implements JsonDeserializer<SessionData> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public SessionData deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        HashMap map = (HashMap) new Gson().fromJson(jsonElement, new TypeToken<HashMap<String, String>>() { // from class: com.noknok.android.client.appsdk_plus.SessionDataDeserializer.1
        }.getType());
        SessionData sessionData = new SessionData();
        sessionData.putAll(map);
        return sessionData;
    }
}
