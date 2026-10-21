package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes9.dex */
public class p4 extends o {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private q f66251p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private b0 f66252q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private x f66253r0;

    public p4(v vVar) {
        Enumeration enumerationG = vVar.g();
        if (((m) enumerationG.nextElement()).h().intValue() != 0) {
            throw new IllegalArgumentException("wrong version for private key info");
        }
        this.f66252q0 = b0.a(enumerationG.nextElement());
        this.f66251p0 = q.a(enumerationG.nextElement());
        if (enumerationG.hasMoreElements()) {
            this.f66253r0 = x.a((z) enumerationG.nextElement(), false);
        }
    }

    public static p4 a(Object obj) {
        if (obj instanceof p4) {
            return (p4) obj;
        }
        if (obj != null) {
            return new p4(v.a(obj));
        }
        return null;
    }

    public b0 c() {
        return this.f66252q0;
    }

    public g d() throws IOException {
        return u.a(this.f66251p0.g());
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o, com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        h hVar = new h();
        hVar.a(new m(0L));
        hVar.a(this.f66252q0);
        hVar.a(this.f66251p0);
        x xVar = this.f66253r0;
        if (xVar != null) {
            hVar.a(new n1(false, 0, xVar));
        }
        return new i1(hVar);
    }
}
