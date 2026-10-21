package com.facetec.sdk;

import com.salesforce.marketingcloud.sfmcsdk.components.http.Request;

/* JADX INFO: loaded from: classes9.dex */
public final class lv {
    public static boolean a(String str) {
        return !str.equals("PROPFIND");
    }

    public static boolean b(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals(Request.PUT) || str.equals("DELETE") || str.equals("MOVE");
    }

    public static boolean c(String str) {
        return str.equals("POST") || str.equals(Request.PUT) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    public static boolean d(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static boolean e(String str) {
        return str.equals("PROPFIND");
    }
}
