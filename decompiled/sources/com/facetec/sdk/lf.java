package com.facetec.sdk;

import com.bbva.component.dm.headers.EtagInterceptor;
import java.util.Date;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class lf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final kr f42278c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final kq f42279e;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final kq f42280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f42281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Date f42282c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f42283d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final kr f42284e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f42285f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f42286g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Date f42287h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Date f42288i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        String f42289j;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f42290n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        String f42291o;

        public b(long j10, kr krVar, kq kqVar) {
            this.f42290n = -1;
            this.f42281b = j10;
            this.f42284e = krVar;
            this.f42280a = kqVar;
            if (kqVar != null) {
                this.f42285f = kqVar.g();
                this.f42286g = kqVar.i();
                kj kjVarC = kqVar.c();
                int iA = kjVarC.a();
                for (int i10 = 0; i10 < iA; i10++) {
                    String strE = kjVarC.e(i10);
                    String strC = kjVarC.c(i10);
                    if ("Date".equalsIgnoreCase(strE)) {
                        this.f42282c = lq.d(strC);
                        this.f42283d = strC;
                    } else if ("Expires".equalsIgnoreCase(strE)) {
                        this.f42287h = lq.d(strC);
                    } else if ("Last-Modified".equalsIgnoreCase(strE)) {
                        this.f42288i = lq.d(strC);
                        this.f42289j = strC;
                    } else if ("ETag".equalsIgnoreCase(strE)) {
                        this.f42291o = strC;
                    } else if ("Age".equalsIgnoreCase(strE)) {
                        this.f42290n = lp.d(strC, -1);
                    }
                }
            }
        }

        public final boolean b() {
            return this.f42280a.h().d() == -1 && this.f42287h == null;
        }

        public static boolean b(kr krVar) {
            return (krVar.d("If-Modified-Since") == null && krVar.d(EtagInterceptor.HEADER_IF_NONE_MATCH) == null) ? false : true;
        }
    }

    public lf(kr krVar, kq kqVar) {
        this.f42278c = krVar;
        this.f42279e = kqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.h().c() == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(com.facetec.sdk.kq r3, com.facetec.sdk.kr r4) {
        /*
            int r0 = r3.e()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L59
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L59
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L59
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L59
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L59
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L59
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L59
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L59
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L59
            switch(r0) {
                case 300: goto L59;
                case 301: goto L59;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L58
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.d(r0)
            if (r0 != 0) goto L59
            com.facetec.sdk.jx r0 = r3.h()
            int r0 = r0.d()
            r1 = -1
            if (r0 != r1) goto L59
            com.facetec.sdk.jx r0 = r3.h()
            boolean r0 = r0.b()
            if (r0 != 0) goto L59
            com.facetec.sdk.jx r0 = r3.h()
            boolean r0 = r0.c()
            if (r0 != 0) goto L59
        L58:
            return r2
        L59:
            com.facetec.sdk.jx r3 = r3.h()
            boolean r3 = r3.a()
            if (r3 != 0) goto L6f
            com.facetec.sdk.jx r3 = r4.j()
            boolean r3 = r3.a()
            if (r3 != 0) goto L6f
            r3 = 1
            return r3
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.lf.d(com.facetec.sdk.kq, com.facetec.sdk.kr):boolean");
    }
}
