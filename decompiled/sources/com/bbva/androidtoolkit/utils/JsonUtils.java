package com.bbva.androidtoolkit.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JsonUtils {
    @Nullable
    public static JSONObject convertMapToJsonObject(Map<String, String> map) {
        JSONObject jSONObject = null;
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                for (String str : map.keySet()) {
                    String str2 = map.get(str);
                    if (StringUtils.isNotNullOrEmpty(str2)) {
                        jSONObject2.put(str, str2);
                    }
                }
                return jSONObject2;
            } catch (JSONException unused) {
                jSONObject = jSONObject2;
                Tracer.e("Convert to JSON: JSON exception");
                return jSONObject;
            }
        } catch (JSONException unused2) {
        }
    }

    @Nullable
    public static String getJsonArrayFromArrayPosition(JSONArray jSONArray, int i10) {
        if (jSONArray != null) {
            try {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
                if (jSONArray2 != null) {
                    return jSONArray2.toString();
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Nullable
    public static String getJsonFromArrayPosition(JSONArray jSONArray, int i10) {
        if (jSONArray != null) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if (jSONObject != null) {
                    return jSONObject.toString();
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Map<String, String> getMapFromJSONObject(@NonNull JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, jSONObject.optString(next));
        }
        return linkedHashMap;
    }
}
