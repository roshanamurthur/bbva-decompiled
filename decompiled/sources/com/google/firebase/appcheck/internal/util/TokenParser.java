package com.google.firebase.appcheck.internal.util;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class TokenParser {
    public static ArrayList a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object objB = jSONArray.get(i10);
            if (objB instanceof JSONArray) {
                objB = a((JSONArray) objB);
            } else if (objB instanceof JSONObject) {
                objB = b((JSONObject) objB);
            }
            arrayList.add(objB);
        }
        return arrayList;
    }

    public static ArrayMap b(JSONObject jSONObject) throws JSONException {
        ArrayMap arrayMap = new ArrayMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objB = jSONObject.get(next);
            if (objB instanceof JSONArray) {
                objB = a((JSONArray) objB);
            } else if (objB instanceof JSONObject) {
                objB = b((JSONObject) objB);
            } else if (objB.equals(JSONObject.NULL)) {
                objB = null;
            }
            arrayMap.put(next, objB);
        }
        return arrayMap;
    }

    @NonNull
    public static Map<String, Object> parseTokenClaims(@NonNull String str) {
        Preconditions.checkNotEmpty(str);
        String[] strArrSplit = str.split("\\.", -1);
        if (strArrSplit.length < 2) {
            Logger.getLogger().e("Invalid token (too few subsections):\n".concat(str));
            return Collections.emptyMap();
        }
        try {
            String str2 = new String(Base64.decode(strArrSplit[1], 11), "UTF-8");
            Map<String, Object> mapEmptyMap = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject != JSONObject.NULL) {
                        mapEmptyMap = b(jSONObject);
                    }
                } catch (Exception e5) {
                    Logger.getLogger().d("Failed to parse JSONObject into Map:\n" + e5);
                    mapEmptyMap = Collections.emptyMap();
                }
            }
            return mapEmptyMap == null ? Collections.emptyMap() : mapEmptyMap;
        } catch (UnsupportedEncodingException e7) {
            Logger.getLogger().e("Unable to decode token (charset unknown):\n" + e7);
            return Collections.emptyMap();
        }
    }
}
