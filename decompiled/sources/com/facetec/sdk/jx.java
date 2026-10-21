package com.facetec.sdk;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class jx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f41920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f41921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f41923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f41924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f41925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f41926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f41927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f41928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f41929j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f41930l;
    private final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private String f41931n;

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f41933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f41934c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f41937f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f41938g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f41939h;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f41935d = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41932a = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f41936e = -1;

        public final jx b() {
            return new jx(this);
        }
    }

    static {
        b bVar = new b();
        bVar.f41933b = true;
        bVar.b();
        b bVar2 = new b();
        bVar2.f41938g = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        bVar2.f41932a = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
        bVar2.b();
    }

    private jx(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, @Nullable String str) {
        this.f41921b = z10;
        this.f41920a = z11;
        this.f41922c = i10;
        this.f41924e = i11;
        this.f41923d = z12;
        this.f41929j = z13;
        this.f41928i = z14;
        this.f41926g = i12;
        this.f41927h = i13;
        this.f41925f = z15;
        this.f41930l = z16;
        this.m = z17;
        this.f41931n = str;
    }

    public final boolean a() {
        return this.f41920a;
    }

    public final boolean b() {
        return this.f41929j;
    }

    public final boolean c() {
        return this.f41923d;
    }

    public final int d() {
        return this.f41922c;
    }

    public final boolean e() {
        return this.f41921b;
    }

    public final boolean f() {
        return this.f41928i;
    }

    public final int h() {
        return this.f41926g;
    }

    public final int i() {
        return this.f41927h;
    }

    public final boolean j() {
        return this.f41925f;
    }

    public final String toString() {
        String string;
        String str = this.f41931n;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f41921b) {
            sb2.append("no-cache, ");
        }
        if (this.f41920a) {
            sb2.append("no-store, ");
        }
        if (this.f41922c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f41922c);
            sb2.append(", ");
        }
        if (this.f41924e != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f41924e);
            sb2.append(", ");
        }
        if (this.f41923d) {
            sb2.append("private, ");
        }
        if (this.f41929j) {
            sb2.append("public, ");
        }
        if (this.f41928i) {
            sb2.append("must-revalidate, ");
        }
        if (this.f41926g != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f41926g);
            sb2.append(", ");
        }
        if (this.f41927h != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f41927h);
            sb2.append(", ");
        }
        if (this.f41925f) {
            sb2.append("only-if-cached, ");
        }
        if (this.f41930l) {
            sb2.append("no-transform, ");
        }
        if (this.m) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            string = "";
        } else {
            sb2.delete(sb2.length() - 2, sb2.length());
            string = sb2.toString();
        }
        this.f41931n = string;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    /* JADX WARN: Code duplicated, block: B:57:0x010d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0116  */
    /* JADX WARN: Code duplicated, block: B:60:0x0119  */
    /* JADX WARN: Code duplicated, block: B:62:0x0121  */
    /* JADX WARN: Code duplicated, block: B:63:0x0124  */
    /* JADX WARN: Code duplicated, block: B:65:0x012c  */
    /* JADX WARN: Code duplicated, block: B:86:0x00a7 A[SYNTHETIC] */
    public static jx c(kj kjVar) {
        int i10;
        int iE;
        String strTrim;
        int iE2;
        String strTrim2;
        int iA = kjVar.a();
        boolean z10 = true;
        String str = null;
        boolean z11 = false;
        boolean z12 = false;
        int iD = -1;
        int iD2 = -1;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int iD3 = -1;
        int iD4 = -1;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        for (int i11 = 0; i11 < iA; i11++) {
            String strE = kjVar.e(i11);
            String strC = kjVar.c(i11);
            if (strE.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strC;
                }
                for (i10 = 0; i10 < strC.length(); i10 = iE2) {
                    iE = lp.e(strC, i10, "=,;");
                    strTrim = strC.substring(i10, iE).trim();
                    if (iE != strC.length() || strC.charAt(iE) == ',' || strC.charAt(iE) == ';') {
                        iE2 = iE + 1;
                        strTrim2 = null;
                    } else {
                        int iA2 = lp.a(strC, iE + 1);
                        if (iA2 >= strC.length() || strC.charAt(iA2) != '\"') {
                            iE2 = lp.e(strC, iA2, ",;");
                            strTrim2 = strC.substring(iA2, iE2).trim();
                        } else {
                            int i12 = iA2 + 1;
                            int iE3 = lp.e(strC, i12, "\"");
                            strTrim2 = strC.substring(i12, iE3);
                            iE2 = iE3 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(strTrim)) {
                        z11 = true;
                    } else if ("no-store".equalsIgnoreCase(strTrim)) {
                        z12 = true;
                    } else if ("max-age".equalsIgnoreCase(strTrim)) {
                        iD = lp.d(strTrim2, -1);
                    } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                        iD2 = lp.d(strTrim2, -1);
                    } else if ("private".equalsIgnoreCase(strTrim)) {
                        z13 = true;
                    } else if ("public".equalsIgnoreCase(strTrim)) {
                        z14 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                        z15 = true;
                    } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                        iD3 = lp.d(strTrim2, Integer.MAX_VALUE);
                    } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                        iD4 = lp.d(strTrim2, -1);
                    } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                        z16 = true;
                    } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                        z17 = true;
                    } else if ("immutable".equalsIgnoreCase(strTrim)) {
                        z18 = true;
                    }
                }
            } else {
                if (strE.equalsIgnoreCase("Pragma")) {
                }
            }
            z10 = false;
            while (i10 < strC.length()) {
                iE = lp.e(strC, i10, "=,;");
                strTrim = strC.substring(i10, iE).trim();
                if (iE != strC.length()) {
                    iE2 = iE + 1;
                    strTrim2 = null;
                } else {
                    iE2 = iE + 1;
                    strTrim2 = null;
                }
                if ("no-cache".equalsIgnoreCase(strTrim)) {
                    z11 = true;
                } else if ("no-store".equalsIgnoreCase(strTrim)) {
                    z12 = true;
                } else if ("max-age".equalsIgnoreCase(strTrim)) {
                    iD = lp.d(strTrim2, -1);
                } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                    iD2 = lp.d(strTrim2, -1);
                } else if ("private".equalsIgnoreCase(strTrim)) {
                    z13 = true;
                } else if ("public".equalsIgnoreCase(strTrim)) {
                    z14 = true;
                } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                    z15 = true;
                } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                    iD3 = lp.d(strTrim2, Integer.MAX_VALUE);
                } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                    iD4 = lp.d(strTrim2, -1);
                } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                    z16 = true;
                } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                    z17 = true;
                } else if ("immutable".equalsIgnoreCase(strTrim)) {
                    z18 = true;
                }
            }
        }
        return new jx(z11, z12, iD, iD2, z13, z14, z15, iD3, iD4, z16, z17, z18, !z10 ? null : str);
    }

    public jx(b bVar) {
        this.f41921b = bVar.f41933b;
        this.f41920a = bVar.f41934c;
        this.f41922c = bVar.f41935d;
        this.f41924e = -1;
        this.f41923d = false;
        this.f41929j = false;
        this.f41928i = false;
        this.f41926g = bVar.f41932a;
        this.f41927h = bVar.f41936e;
        this.f41925f = bVar.f41938g;
        this.f41930l = bVar.f41937f;
        this.m = bVar.f41939h;
    }
}
