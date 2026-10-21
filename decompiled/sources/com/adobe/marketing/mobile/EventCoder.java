package com.adobe.marketing.mobile;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class EventCoder {
    private static final String DATA = "data";
    private static final String NAME = "name";
    private static final String NUMBER = "number";
    private static final String PAIR_ID = "pairId";
    private static final String RESPONSE_PAIR_ID = "responsePairId";
    private static final String SOURCE = "source";
    private static final String TIMESTAMP = "timestamp";
    private static final String TYPE = "type";
    private static final String UUID = "uuid";

    public static Event decode(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new Event.Builder(jSONObject.optString("name", null), jSONObject.getString("type"), jSONObject.getString("source")).setUniqueIdentifier(jSONObject.getString("uuid")).setEventNumber(jSONObject.getInt("number")).setPairID(jSONObject.optString(PAIR_ID, null)).setResponsePairID(jSONObject.optString(RESPONSE_PAIR_ID, null)).setTimestamp(jSONObject.getLong("timestamp")).setEventData(toMap(jSONObject.getJSONObject("data"))).build();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String encode(Event event) {
        if (event == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", event.getEventType().getName());
            jSONObject.put("source", event.getEventSource().getName());
            jSONObject.put("number", event.getEventNumber());
            jSONObject.put("name", event.getName());
            jSONObject.put("timestamp", event.getTimestamp());
            jSONObject.put(PAIR_ID, event.getPairID());
            jSONObject.put(RESPONSE_PAIR_ID, event.getResponsePairID());
            jSONObject.put("data", wrap(event.getEventData()));
            jSONObject.put("uuid", event.getUniqueIdentifier());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    private static Object fromJson(Object obj) throws JSONException {
        if (obj == null || obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return toMap((JSONObject) obj);
        }
        return obj instanceof JSONArray ? toList((JSONArray) obj) : obj;
    }

    private static List<Object> toList(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(fromJson(jSONArray.get(i10)));
        }
        return arrayList;
    }

    private static Map<String, Object> toMap(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        if (jSONObject == null) {
            return map;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, fromJson(jSONObject.get(next)));
        }
        return map;
    }

    private static Object wrap(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                return new JSONArray((Collection) obj);
            }
            if (obj.getClass().isArray()) {
                return wrapArray(obj);
            }
            if (obj instanceof Map) {
                return new JSONObject((Map) obj);
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
                if (obj.getClass().getPackage().getName().startsWith("java.")) {
                    return obj.toString();
                }
                return null;
            }
            return obj;
        } catch (Exception unused) {
        }
    }

    private static JSONArray wrapArray(Object obj) throws JSONException {
        if (!obj.getClass().isArray()) {
            throw new JSONException("Not a primitive array: " + obj.getClass());
        }
        JSONArray jSONArray = new JSONArray();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            jSONArray.put(wrap(Array.get(obj, i10)));
        }
        return jSONArray;
    }
}
