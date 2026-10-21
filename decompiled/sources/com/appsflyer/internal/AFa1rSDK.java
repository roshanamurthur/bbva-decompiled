package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFa1rSDK {

    @Nullable
    public AFd1vSDK AFInAppEventParameterName;
    private byte[] AFInAppEventType;
    public String AFKeystoreWrapper;
    String valueOf;
    public String values;

    public AFa1rSDK() {
    }

    public AFa1rSDK(String str, byte[] bArr, String str2, AFd1vSDK aFd1vSDK) {
        this.values = str;
        this.AFInAppEventType = bArr;
        this.valueOf = str2;
        this.AFInAppEventParameterName = aFd1vSDK;
    }

    private static Object AFInAppEventParameterName(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(AFInAppEventParameterName(it.next()));
                }
                return jSONArray;
            }
            if (!obj.getClass().isArray()) {
                if (obj instanceof Map) {
                    return values((Map<String, ?>) obj);
                }
                return ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
            }
            int length = Array.getLength(obj);
            JSONArray jSONArray2 = new JSONArray();
            for (int i10 = 0; i10 < length; i10++) {
                jSONArray2.put(AFInAppEventParameterName(Array.get(obj, i10)));
            }
            return jSONArray2;
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }

    public static AFe1oSDK AFKeystoreWrapper(Context context) {
        if (context instanceof Activity) {
            return AFe1oSDK.activity;
        }
        return context instanceof Application ? AFe1oSDK.application : AFe1oSDK.other;
    }

    @Nullable
    public static JSONObject valueOf(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static JSONObject values(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), AFInAppEventParameterName(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFa1rSDK.class == obj.getClass()) {
            AFa1rSDK aFa1rSDK = (AFa1rSDK) obj;
            String str = this.valueOf;
            if (str == null ? aFa1rSDK.valueOf != null : !str.equals(aFa1rSDK.valueOf)) {
                return false;
            }
            if (!Arrays.equals(this.AFInAppEventType, aFa1rSDK.AFInAppEventType)) {
                return false;
            }
            String str2 = this.values;
            if (str2 == null ? aFa1rSDK.values != null : !str2.equals(aFa1rSDK.values)) {
                return false;
            }
            String str3 = this.AFKeystoreWrapper;
            if (str3 == null ? aFa1rSDK.AFKeystoreWrapper != null : !str3.equals(aFa1rSDK.AFKeystoreWrapper)) {
                return false;
            }
            if (this.AFInAppEventParameterName == aFa1rSDK.AFInAppEventParameterName) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.valueOf;
        int iHashCode = (Arrays.hashCode(this.AFInAppEventType) + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.values;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.AFKeystoreWrapper;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFd1vSDK aFd1vSDK = this.AFInAppEventParameterName;
        return iHashCode3 + (aFd1vSDK != null ? aFd1vSDK.hashCode() : 0);
    }

    public final byte[] valueOf() {
        return this.AFInAppEventType;
    }

    public static Map<String, Object> values(@NonNull JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objValues = jSONObject.get(next);
            if (objValues instanceof JSONArray) {
                objValues = AFInAppEventParameterName((JSONArray) objValues);
            } else if (objValues instanceof JSONObject) {
                objValues = values((JSONObject) objValues);
            }
            map.put(next, objValues);
        }
        return map;
    }

    public AFa1rSDK(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i10 = 0;
        int i11 = 0;
        while (scanner.hasNextLine()) {
            String strNextLine = scanner.nextLine();
            if (strNextLine.startsWith("url=")) {
                this.values = strNextLine.substring(4).trim();
            } else if (strNextLine.startsWith("version=")) {
                this.valueOf = strNextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.valueOf);
                if (matcher.matches()) {
                    i10 = Integer.parseInt(matcher.group(1));
                    i11 = Integer.parseInt(matcher.group(2));
                }
            } else if (strNextLine.startsWith("data=")) {
                String strTrim = strNextLine.substring(5).trim();
                this.AFInAppEventType = (i10 > 4 || i11 >= 11) ? Base64.decode(strTrim, 2) : strTrim.getBytes(Charset.defaultCharset());
            } else if (strNextLine.startsWith("type=")) {
                String strTrim2 = strNextLine.substring(5).trim();
                try {
                    this.AFInAppEventParameterName = AFd1vSDK.valueOf(strTrim2);
                } catch (Exception e5) {
                    AFLogger.afErrorLog("CACHE: Unknown task type: ".concat(String.valueOf(strTrim2)), e5);
                }
            }
        }
        scanner.close();
    }

    private static List<Object> AFInAppEventParameterName(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object objValues = jSONArray.get(i10);
            if (objValues instanceof JSONArray) {
                objValues = AFInAppEventParameterName((JSONArray) objValues);
            } else if (objValues instanceof JSONObject) {
                objValues = values((JSONObject) objValues);
            }
            arrayList.add(objValues);
        }
        return arrayList;
    }
}
