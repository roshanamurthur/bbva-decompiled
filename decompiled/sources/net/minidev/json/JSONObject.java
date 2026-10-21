package net.minidev.json;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.minidev.json.reader.JsonWriter;

/* JADX INFO: loaded from: classes12.dex */
public class JSONObject extends HashMap<String, Object> implements JSONAware, JSONAwareEx, JSONStreamAwareEx {
    public JSONObject() {
    }

    public static String escape(String str) {
        return JSONValue.escape(str);
    }

    public static String toJSONString(Map<String, ? extends Object> map) {
        return toJSONString(map, JSONValue.COMPRESSION);
    }

    public static void writeJSON(Map<String, Object> map, Appendable appendable) throws IOException {
        writeJSON(map, appendable, JSONValue.COMPRESSION);
    }

    public void merge(Object obj) {
        merge(this, obj);
    }

    public String toString(JSONStyle jSONStyle) {
        return toJSONString(this, jSONStyle);
    }

    @Override // net.minidev.json.JSONStreamAware
    public void writeJSONString(Appendable appendable) throws IOException {
        writeJSON(this, appendable, JSONValue.COMPRESSION);
    }

    public JSONObject(Map<String, ?> map) {
        super(map);
    }

    public static JSONObject merge(JSONObject jSONObject, Object obj) {
        if (obj == null) {
            return jSONObject;
        }
        if (!(obj instanceof JSONObject)) {
            throw new RuntimeException("JSON megre can not merge JSONObject with " + obj.getClass());
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        for (String str : jSONObject.keySet()) {
            Object obj2 = jSONObject.get(str);
            Object obj3 = jSONObject2.get(str);
            if (obj3 != null) {
                if (obj2 instanceof JSONArray) {
                    jSONObject.put(str, merge((JSONArray) obj2, obj3));
                } else if (obj2 instanceof JSONObject) {
                    jSONObject.put(str, merge((JSONObject) obj2, obj3));
                } else if (!obj2.equals(obj3)) {
                    if (obj2.getClass().equals(obj3.getClass())) {
                        throw new RuntimeException("JSON merge can not merge two " + obj2.getClass().getName() + " Object together");
                    }
                    throw new RuntimeException("JSON merge can not merge " + obj2.getClass().getName() + " with " + obj3.getClass().getName());
                }
            }
        }
        for (String str2 : jSONObject2.keySet()) {
            if (!jSONObject.containsKey(str2)) {
                jSONObject.put(str2, jSONObject2.get(str2));
            }
        }
        return jSONObject;
    }

    public static String toJSONString(Map<String, ? extends Object> map, JSONStyle jSONStyle) {
        StringBuilder sb2 = new StringBuilder();
        try {
            writeJSON(map, sb2, jSONStyle);
        } catch (IOException unused) {
        }
        return sb2.toString();
    }

    public static void writeJSON(Map<String, ? extends Object> map, Appendable appendable, JSONStyle jSONStyle) throws IOException {
        if (map == null) {
            appendable.append(AbstractJsonLexerKt.NULL);
        } else {
            JsonWriter.JSONMapWriter.writeJSONString(map, appendable, jSONStyle);
        }
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return toJSONString(this, JSONValue.COMPRESSION);
    }

    @Override // net.minidev.json.JSONStreamAwareEx
    public void writeJSONString(Appendable appendable, JSONStyle jSONStyle) throws IOException {
        writeJSON(this, appendable, jSONStyle);
    }

    @Override // net.minidev.json.JSONAware
    public String toJSONString() {
        return toJSONString(this, JSONValue.COMPRESSION);
    }

    @Override // net.minidev.json.JSONAwareEx
    public String toJSONString(JSONStyle jSONStyle) {
        return toJSONString(this, jSONStyle);
    }

    public static JSONArray merge(JSONArray jSONArray, Object obj) {
        if (obj == null) {
            return jSONArray;
        }
        if (jSONArray instanceof JSONArray) {
            jSONArray.addAll((JSONArray) obj);
            return jSONArray;
        }
        jSONArray.add(obj);
        return jSONArray;
    }
}
