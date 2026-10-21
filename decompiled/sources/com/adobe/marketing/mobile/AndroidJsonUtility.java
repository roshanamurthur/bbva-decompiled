package com.adobe.marketing.mobile;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class AndroidJsonUtility implements JsonUtilityService {
    private static final String LOG_TAG = "AndroidJsonUtility";

    private JSONArray createNativeJsonArray(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            jSONArray.put(wrap(Array.get(obj, i10)));
        }
        return jSONArray;
    }

    private JSONObject createNativeJsonObject(Map<?, ?> map) {
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (entry.getKey() != null) {
                map2.put(entry.getKey().toString(), wrap(value));
            }
        }
        return new JSONObject(map2);
    }

    private Object wrap(Object obj) {
        if (obj == null || (obj instanceof JsonUtilityService.JSONArray) || (obj instanceof JsonUtilityService.JSONObject) || (obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Collection) {
            return new JSONArray((Collection) obj);
        }
        if (obj.getClass().isArray()) {
            return createNativeJsonArray(obj);
        }
        if (obj instanceof Map) {
            return createNativeJsonObject((Map) obj);
        }
        return null;
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService
    public JsonUtilityService.JSONArray createJSONArray(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new AndroidJsonArray(new JSONArray(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService
    public JsonUtilityService.JSONObject createJSONObject(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new AndroidJsonObject(new JSONObject(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService
    public Map<String, String> mapFromJsonObject(JsonUtilityService.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        HashMap map = new HashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                map.put(next, jSONObject.getString(next));
            } catch (JsonException e5) {
                Log.warning(LOG_TAG, "Unable to convert jsonObject key %s into map, %s", next, e5);
            }
        }
        return map;
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService
    public JsonUtilityService.JSONObject createJSONObject(Map map) {
        if (map == null) {
            return null;
        }
        return new AndroidJsonObject(new JSONObject(map));
    }
}
