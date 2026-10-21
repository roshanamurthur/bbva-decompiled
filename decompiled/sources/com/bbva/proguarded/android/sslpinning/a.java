package com.bbva.proguarded.android.sslpinning;

import java.util.Properties;

/* JADX INFO: loaded from: classes8.dex */
public class a extends Properties {
    public final int a(String str, int i10) {
        try {
            String property = getProperty(str);
            return property != null ? Integer.parseInt(property) : i10;
        } catch (NumberFormatException | Exception unused) {
            return i10;
        }
    }

    public final long a(String str) {
        try {
            String property = getProperty(str);
            if (property != null) {
                return Long.parseLong(property);
            }
            return 86000L;
        } catch (NumberFormatException | Exception unused) {
            return 86000L;
        }
    }

    public final Boolean a(String str, Boolean bool) {
        try {
            String property = getProperty(str);
            return property != null ? new Boolean(property) : bool;
        } catch (Exception unused) {
            return bool;
        }
    }
}
