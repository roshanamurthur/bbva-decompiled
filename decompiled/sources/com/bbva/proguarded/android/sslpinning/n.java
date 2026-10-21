package com.bbva.proguarded.android.sslpinning;

/* JADX INFO: loaded from: classes8.dex */
public final class n {
    public static int a(String str, String str2) {
        if (str.equalsIgnoreCase(str2)) {
            return 100;
        }
        String strSubstring = str;
        int length = 0;
        for (String str3 : str2.split("\\*")) {
            int iIndexOf = strSubstring.indexOf(str3);
            if (iIndexOf == -1) {
                return -1;
            }
            length += str3.length();
            strSubstring = strSubstring.substring(str3.length() + iIndexOf);
        }
        return (length * 100) / str.length();
    }
}
