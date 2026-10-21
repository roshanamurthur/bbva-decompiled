package com.bbva.proguarded.android.sslpinning;

import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes8.dex */
public final class t {
    public static String a(String str) {
        try {
            return a(new URL(str));
        } catch (MalformedURLException unused) {
            return "<hidden>/***";
        }
    }

    public static String a(URL url) {
        Object[] objArr = new Object[3];
        objArr[0] = url.getProtocol();
        objArr[1] = url.getHost();
        String path = url.getPath();
        if (path.startsWith("/")) {
            path = path.replaceFirst("/", "");
        }
        int iCeil = (int) Math.ceil(path.length() / 2.0f);
        objArr[2] = iCeil > 3 ? String.format("%s%s", path.substring(0, 3), "***") : String.format("%s%s", path.substring(0, iCeil), "***");
        return String.format("%s://%s/%s", objArr);
    }
}
