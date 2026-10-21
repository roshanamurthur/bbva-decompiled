package com.facetec.sdk;

import java.util.Arrays;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes9.dex */
public final class kb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kb f41981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kb f41982e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final jz[] f41983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final jz[] f41984h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f41985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    final String[] f41986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f41987c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    final String[] f41988f;

    static {
        jz jzVar = jz.f41951l;
        jz jzVar2 = jz.f41954q;
        jz jzVar3 = jz.f41956s;
        jz jzVar4 = jz.f41955r;
        jz jzVar5 = jz.f41957t;
        jz jzVar6 = jz.f41945f;
        jz jzVar7 = jz.f41953o;
        jz jzVar8 = jz.f41946g;
        jz jzVar9 = jz.m;
        jz jzVar10 = jz.f41950k;
        jz jzVar11 = jz.f41952n;
        jz[] jzVarArr = {jzVar, jzVar2, jzVar3, jzVar4, jzVar5, jzVar6, jzVar7, jzVar8, jzVar9, jzVar10, jzVar11};
        f41984h = jzVarArr;
        jz[] jzVarArr2 = {jzVar, jzVar2, jzVar3, jzVar4, jzVar5, jzVar6, jzVar7, jzVar8, jzVar9, jzVar10, jzVar11, jz.f41947h, jz.f41948i, jz.f41941b, jz.f41949j, jz.f41943d, jz.f41944e, jz.f41942c};
        f41983g = jzVarArr2;
        e eVarB = new e(true).b(jzVarArr);
        kw kwVar = kw.TLS_1_3;
        kw kwVar2 = kw.TLS_1_2;
        eVarB.b(kwVar, kwVar2).a().e();
        e eVarB2 = new e(true).b(jzVarArr2);
        kw kwVar3 = kw.TLS_1_0;
        f41982e = eVarB2.b(kwVar, kwVar2, kw.TLS_1_1, kwVar3).a().e();
        new e(true).b(jzVarArr2).b(kwVar3).a().e();
        f41981d = new e(false).e();
    }

    public kb(e eVar) {
        this.f41985a = eVar.f41990b;
        this.f41986b = eVar.f41992e;
        this.f41988f = eVar.f41989a;
        this.f41987c = eVar.f41991c;
    }

    public final boolean a() {
        return this.f41985a;
    }

    public final boolean b() {
        return this.f41987c;
    }

    public final boolean c(SSLSocket sSLSocket) {
        if (!this.f41985a) {
            return false;
        }
        String[] strArr = this.f41988f;
        if (strArr != null && !kz.b(kz.f42215j, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f41986b;
        return strArr2 == null || kz.b(jz.f41940a, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof kb)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        kb kbVar = (kb) obj;
        boolean z10 = this.f41985a;
        if (z10 != kbVar.f41985a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f41986b, kbVar.f41986b) && Arrays.equals(this.f41988f, kbVar.f41988f) && this.f41987c == kbVar.f41987c);
    }

    public final int hashCode() {
        if (this.f41985a) {
            return ((((Arrays.hashCode(this.f41986b) + 527) * 31) + Arrays.hashCode(this.f41988f)) * 31) + (!this.f41987c ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String string;
        if (!this.f41985a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f41986b;
        String string2 = "[all enabled]";
        if (strArr != null) {
            string = (strArr != null ? jz.e(strArr) : null).toString();
        } else {
            string = "[all enabled]";
        }
        String[] strArr2 = this.f41988f;
        if (strArr2 != null) {
            string2 = (strArr2 != null ? kw.d(strArr2) : null).toString();
        }
        StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("ConnectionSpec(cipherSuites=", string, ", tlsVersions=", string2, ", supportsTlsExtensions=");
        sbC.append(this.f41987c);
        sbC.append(")");
        return sbC.toString();
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        String[] f41989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f41990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f41991c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        String[] f41992e;

        public e(boolean z10) {
            this.f41990b = z10;
        }

        public final e a() {
            if (!this.f41990b) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f41991c = true;
            return this;
        }

        public final e b(jz... jzVarArr) {
            if (!this.f41990b) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[jzVarArr.length];
            for (int i10 = 0; i10 < jzVarArr.length; i10++) {
                strArr[i10] = jzVarArr[i10].f41959p;
            }
            return b(strArr);
        }

        public final e d(String... strArr) {
            if (!this.f41990b) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f41989a = (String[]) strArr.clone();
            return this;
        }

        public final kb e() {
            return new kb(this);
        }

        public e(kb kbVar) {
            this.f41990b = kbVar.f41985a;
            this.f41992e = kbVar.f41986b;
            this.f41989a = kbVar.f41988f;
            this.f41991c = kbVar.f41987c;
        }

        public final e b(String... strArr) {
            if (this.f41990b) {
                if (strArr.length != 0) {
                    this.f41992e = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public final e b(kw... kwVarArr) {
            if (this.f41990b) {
                String[] strArr = new String[kwVarArr.length];
                for (int i10 = 0; i10 < kwVarArr.length; i10++) {
                    strArr[i10] = kwVarArr[i10].f42202a;
                }
                return d(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }
}
