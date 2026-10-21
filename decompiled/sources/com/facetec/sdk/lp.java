package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
public final class lp {
    static {
        nj.c("\"\\");
        nj.c("\t ,=");
    }

    private static long a(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static long c(kq kqVar) {
        return a(kqVar.c().b("Content-Length"));
    }

    public static boolean d(kq kqVar) {
        if (kqVar.b().c().equals("HEAD")) {
            return false;
        }
        int iE = kqVar.e();
        return (((iE >= 100 && iE < 200) || iE == 204 || iE == 304) && c(kqVar) == -1 && !"chunked".equalsIgnoreCase(kqVar.d("Transfer-Encoding"))) ? false : true;
    }

    public static void e(ka kaVar, kk kkVar, kj kjVar) {
        if (kaVar == ka.f41980d) {
            return;
        }
        kc.a(kkVar, kjVar).isEmpty();
    }

    public static int a(String str, int i10) {
        char cCharAt;
        while (i10 < str.length() && ((cCharAt = str.charAt(i10)) == ' ' || cCharAt == '\t')) {
            i10++;
        }
        return i10;
    }

    public static int e(String str, int i10, String str2) {
        while (i10 < str.length() && str2.indexOf(str.charAt(i10)) == -1) {
            i10++;
        }
        return i10;
    }

    public static int d(String str, int i10) {
        try {
            long j10 = Long.parseLong(str);
            if (j10 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j10 < 0) {
                return 0;
            }
            return (int) j10;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }
}
