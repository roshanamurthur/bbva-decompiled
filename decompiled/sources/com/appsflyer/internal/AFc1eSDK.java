package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1eSDK implements AFc1fSDK<Map<String, String>> {
    @Override // com.appsflyer.internal.AFc1fSDK
    public final /* synthetic */ Map<String, String> values(String str) throws JSONException {
        HashMap map = new HashMap();
        if (!str.trim().isEmpty()) {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
        }
        return map;
    }
}
