package com.facetec.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public enum kw {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f42202a;

    kw(String str) {
        this.f42202a = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public static kw b(String str) {
        byte b10;
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (!str.equals("TLSv1.1")) {
                            b10 = -1;
                        } else {
                            b10 = 2;
                        }
                        break;
                    case -503070502:
                        if (!str.equals("TLSv1.2")) {
                            b10 = -1;
                        } else {
                            b10 = 1;
                        }
                        break;
                    case -503070501:
                        if (!str.equals("TLSv1.3")) {
                            b10 = -1;
                        } else {
                            b10 = 0;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
            } else if (str.equals("TLSv1")) {
                b10 = 3;
            } else {
                b10 = -1;
            }
        } else if (str.equals("SSLv3")) {
            b10 = 4;
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            return TLS_1_3;
        }
        if (b10 == 1) {
            return TLS_1_2;
        }
        if (b10 == 2) {
            return TLS_1_1;
        }
        if (b10 == 3) {
            return TLS_1_0;
        }
        if (b10 == 4) {
            return SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static List<kw> d(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(b(str));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
