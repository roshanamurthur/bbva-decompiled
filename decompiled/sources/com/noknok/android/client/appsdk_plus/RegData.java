package com.noknok.android.client.appsdk_plus;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/* JADX INFO: loaded from: classes11.dex */
public class RegData {
    public String authenticatorName;

    public JsonArray toJsonArray() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", AppSDKPlus.AUTHENTICATOR_NAME);
        jsonObject.addProperty("value", this.authenticatorName);
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(jsonObject);
        return jsonArray;
    }
}
