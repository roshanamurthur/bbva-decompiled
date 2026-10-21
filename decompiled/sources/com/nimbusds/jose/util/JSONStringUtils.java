package com.nimbusds.jose.util;

import com.nimbusds.jose.shaded.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class JSONStringUtils {
    public static String toJSONString(String str) {
        return "\"" + JSONObject.escape(str) + "\"";
    }
}
