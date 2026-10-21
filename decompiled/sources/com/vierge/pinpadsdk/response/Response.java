package com.vierge.pinpadsdk.response;

import androidx.core.app.NotificationCompat;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class Response {
    protected int codResponse;
    protected String status;
    protected int RESPONSE_SUCCESS = 0;
    protected int RESPONSE_ERROR = -1;
    protected String msg = "";

    public JsonObject _mergeResponse(JsonObject jsonObject, JsonObject jsonObject2) {
        JsonObject jsonObject3 = new JsonObject();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            jsonObject3.add(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, JsonElement> entry2 : jsonObject2.entrySet()) {
            jsonObject3.add(entry2.getKey(), entry2.getValue());
        }
        return jsonObject3;
    }

    public JsonObject getResponse() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("codResponse", Integer.valueOf(this.codResponse));
        jsonObject.addProperty("status", this.status);
        jsonObject.addProperty(NotificationCompat.CATEGORY_MESSAGE, this.msg);
        return jsonObject;
    }

    public JsonObject getResponse(JsonObject jsonObject) {
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("codResponse", Integer.valueOf(this.codResponse));
        jsonObject2.addProperty("status", this.status);
        jsonObject2.addProperty(NotificationCompat.CATEGORY_MESSAGE, this.msg);
        return _mergeResponse(jsonObject2, jsonObject);
    }
}
