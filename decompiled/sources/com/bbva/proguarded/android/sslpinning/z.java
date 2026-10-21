package com.bbva.proguarded.android.sslpinning;

import java.util.Enumeration;
import java.util.Properties;

/* JADX INFO: loaded from: classes8.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Properties f36186a = new Properties();

    public final String a() {
        Properties properties = this.f36186a;
        Enumeration enumerationKeys = properties.keys();
        String string = "";
        while (enumerationKeys.hasMoreElements()) {
            String str = (String) enumerationKeys.nextElement();
            String property = properties.getProperty(str);
            StringBuilder sbD = androidx.camera.core.impl.utils.c.d(string);
            sbD.append(string.length() == 0 ? "" : "&");
            sbD.append(str);
            sbD.append("=");
            sbD.append(f.a(property));
            string = sbD.toString();
        }
        return f.a(string);
    }

    public final void a(String str, String str2) {
        this.f36186a.setProperty(str, str2);
    }
}
