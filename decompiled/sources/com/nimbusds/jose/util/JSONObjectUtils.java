package com.nimbusds.jose.util;

import androidx.camera.camera2.internal.h0;
import ci.a;
import com.nimbusds.jose.shaded.json.JSONObject;
import com.nimbusds.jose.shaded.json.parser.JSONParser;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class JSONObjectUtils {
    public static <T> T a(Map<String, Object> map, String str, Class<T> cls) throws ParseException {
        if (map.get(str) == null) {
            return null;
        }
        T t10 = (T) map.get(str);
        if (cls.isAssignableFrom(t10.getClass())) {
            return t10;
        }
        throw new ParseException(h0.b("Unexpected type of JSON object member with key \"", str, "\""), 0);
    }

    public static Base64URL getBase64URL(Map<String, Object> map, String str) throws ParseException {
        String string = getString(map, str);
        if (string == null) {
            return null;
        }
        return new Base64URL(string);
    }

    public static boolean getBoolean(Map<String, Object> map, String str) throws ParseException {
        Boolean bool = (Boolean) a(map, str, Boolean.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new ParseException(h0.b("JSON object member with key \"", str, "\" is missing or null"), 0);
    }

    public static double getDouble(Map<String, Object> map, String str) throws ParseException {
        Number number = (Number) a(map, str, Number.class);
        if (number != null) {
            return number.doubleValue();
        }
        throw new ParseException(h0.b("JSON object member with key \"", str, "\" is missing or null"), 0);
    }

    public static float getFloat(Map<String, Object> map, String str) throws ParseException {
        Number number = (Number) a(map, str, Number.class);
        if (number != null) {
            return number.floatValue();
        }
        throw new ParseException(h0.b("JSON object member with key \"", str, "\" is missing or null"), 0);
    }

    public static int getInt(Map<String, Object> map, String str) throws ParseException {
        Number number = (Number) a(map, str, Number.class);
        if (number != null) {
            return number.intValue();
        }
        throw new ParseException(h0.b("JSON object member with key \"", str, "\" is missing or null"), 0);
    }

    public static List<Object> getJSONArray(Map<String, Object> map, String str) throws ParseException {
        return (List) a(map, str, List.class);
    }

    public static Map<String, Object> getJSONObject(Map<String, Object> map, String str) throws ParseException {
        return (Map) a(map, str, JSONObject.class);
    }

    public static long getLong(Map<String, Object> map, String str) throws ParseException {
        Number number = (Number) a(map, str, Number.class);
        if (number != null) {
            return number.longValue();
        }
        throw new ParseException(h0.b("JSON object member with key \"", str, "\" is missing or null"), 0);
    }

    public static String getString(Map<String, Object> map, String str) throws ParseException {
        return (String) a(map, str, String.class);
    }

    public static String[] getStringArray(Map<String, Object> map, String str) throws ParseException {
        List<Object> jSONArray = getJSONArray(map, str);
        if (jSONArray == null) {
            return null;
        }
        try {
            return (String[]) jSONArray.toArray(new String[0]);
        } catch (ArrayStoreException unused) {
            throw new ParseException(h0.b("JSON object member with key \"", str, "\" is not an array of strings"), 0);
        }
    }

    public static List<String> getStringList(Map<String, Object> map, String str) throws ParseException {
        String[] stringArray = getStringArray(map, str);
        if (stringArray == null) {
            return null;
        }
        return Arrays.asList(stringArray);
    }

    public static URI getURI(Map<String, Object> map, String str) throws ParseException {
        String string = getString(map, str);
        if (string == null) {
            return null;
        }
        try {
            return new URI(string);
        } catch (URISyntaxException e5) {
            throw new ParseException(e5.getMessage(), 0);
        }
    }

    public static Map<String, Object> newJSONObject() {
        return new HashMap();
    }

    public static Map<String, Object> parse(String str) throws ParseException {
        try {
            Object obj = new JSONParser(640).parse(str);
            if (obj instanceof JSONObject) {
                return (JSONObject) obj;
            }
            throw new ParseException("JSON entity is not an object", 0);
        } catch (com.nimbusds.jose.shaded.json.parser.ParseException e5) {
            throw new ParseException("Invalid JSON: " + e5.getMessage(), 0);
        } catch (Exception e7) {
            throw new ParseException(a.b(e7, new StringBuilder("Unexpected exception: ")), 0);
        }
    }

    @Deprecated
    public static Map<String, Object> parseJSONObject(String str) throws ParseException {
        return parse(str);
    }

    public static String toJSONString(Map<String, ?> map) {
        return JSONObject.toJSONString((Map<String, ? extends Object>) map);
    }
}
