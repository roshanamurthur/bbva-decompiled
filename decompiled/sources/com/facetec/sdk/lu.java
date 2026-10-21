package com.facetec.sdk;

import java.net.Proxy;

/* JADX INFO: loaded from: classes9.dex */
public final class lu {
    public static boolean a(kr krVar, Proxy.Type type) {
        return !krVar.h() && type == Proxy.Type.HTTP;
    }

    public static String d(kk kkVar) {
        String strH = kkVar.h();
        String strG = kkVar.g();
        if (strG == null) {
            return strH;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strH);
        sb2.append('?');
        sb2.append(strG);
        return sb2.toString();
    }
}
