package com.bbva.androidtoolkit.plugin.response;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleResponse {
    @Deprecated
    public static JSONObject error(Errors errors) {
        return error(errors.getCode(), errors.getMessage());
    }

    public static JSONObject toJson(String str, Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e5) {
            e5.getMessage();
        }
        return jSONObject;
    }

    public static JSONObject error(ErrorMessage errorMessage) {
        return error(errorMessage.getCode(), errorMessage.getMessage());
    }

    public static JSONObject error(int i10, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i10);
            jSONObject.put("message", str);
        } catch (JSONException e5) {
            e5.getMessage();
        }
        return jSONObject;
    }

    public static JSONObject toJson(String str, Object obj, String str2, Object obj2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, obj);
            jSONObject.put(str2, obj2);
        } catch (JSONException e5) {
            e5.getMessage();
        }
        return jSONObject;
    }

    public static JSONObject toJson(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e5) {
            e5.getMessage();
        }
        return jSONObject;
    }
}
