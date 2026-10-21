package com.bbva.networkplugin.utils;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class JsonUtils {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35268a;

        static {
            int[] iArr = new int[b.values().length];
            f35268a = iArr;
            try {
                iArr[b.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35268a[b.OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35268a[b.ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35268a[b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b ARRAY;
        public static final b NULL;
        public static final b OBJECT;
        public static final b STRING;

        static {
            b bVar = new b("STRING", 0);
            STRING = bVar;
            b bVar2 = new b("OBJECT", 1);
            OBJECT = bVar2;
            b bVar3 = new b("ARRAY", 2);
            ARRAY = bVar3;
            b bVar4 = new b(VDVideoSelfieConfiguration.NULL, 3);
            NULL = bVar4;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public static JSONArray toArray(JSONArray jSONArray, int i10) {
        if (jSONArray == null) {
            return null;
        }
        try {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
            if (jSONArray2 != null) {
                return jSONArray2;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @NonNull
    public static JSONObject toJson(Map<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
        }
        return jSONObject;
    }

    public static Map<String, Object> toMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject.get(next));
            } catch (JSONException e5) {
                e5.printStackTrace();
                return linkedHashMap;
            }
        }
        return linkedHashMap;
    }

    public static Map<String, List<String>> toMapList(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONArray jSONArray = jSONObject.getJSONArray(next);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(jSONArray.getString(i10));
            }
            linkedHashMap.put(next, arrayList);
        }
        return linkedHashMap;
    }

    public static Pair<String, String> toPair(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        if (!itKeys.hasNext()) {
            return null;
        }
        String next = itKeys.next();
        return new Pair<>(next, jSONObject.getString(next));
    }

    public static String toString(JSONArray jSONArray, int i10) {
        if (jSONArray != null) {
            try {
                return jSONArray.getString(i10);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static JSONObject toJson(JSONArray jSONArray, int i10) {
        if (jSONArray == null) {
            return null;
        }
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            if (jSONObject != null) {
                return jSONObject;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Map<String, ?> toMap(JSONArray jSONArray, int i10) {
        b bVar;
        String[] strArrSplit;
        JSONArray array;
        int[] iArr = a.f35268a;
        if (jSONArray.optJSONArray(i10) != null) {
            bVar = b.ARRAY;
        } else if (jSONArray.optJSONObject(i10) != null) {
            bVar = b.OBJECT;
        } else if (jSONArray.optString(i10) != null) {
            bVar = b.STRING;
        } else {
            bVar = b.NULL;
        }
        int i11 = iArr[bVar.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return toMap(toJson(jSONArray, i10));
            }
            if (i11 != 3 || (array = toArray(jSONArray, i10)) == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int length = array.length();
            for (int i12 = 0; i12 < length; i12++) {
                try {
                    Pair<String, String> pair = toPair((JSONObject) array.get(i12));
                    linkedHashMap.put((String) pair.first, (String) pair.second);
                } catch (JSONException unused) {
                    return linkedHashMap;
                }
            }
            return linkedHashMap;
        }
        String string = toString(jSONArray, i10);
        if (string == null) {
            return null;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (String str : string.split("&")) {
            if (str != null && (strArrSplit = str.split("=")) != null && strArrSplit.length >= 2) {
                linkedHashMap2.put(strArrSplit[0], strArrSplit[1]);
            }
        }
        return linkedHashMap2;
    }
}
