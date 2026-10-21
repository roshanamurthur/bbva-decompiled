package com.bbva.proguarded.android.sslpinning;

import com.bbva.sl.ar.android.sslpinning.exception.InitializationException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f36173a = Logger.getLogger(u.class.getName());

    public static Object a(String str) throws InitializationException {
        try {
            return Class.forName(str).newInstance();
        } catch (Exception e5) {
            throw new InitializationException(101, ci.a.b(e5, ci.a.d("Could not initialize object of class [", str, "]: ")), e5);
        }
    }

    public static String a(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("{");
        int length = objArr.length;
        boolean z10 = true;
        int i10 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(obj);
            i10++;
            z10 = false;
        }
        sb2.append("}");
        return sb2.toString();
    }
}
