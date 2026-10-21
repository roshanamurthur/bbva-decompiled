package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes9.dex */
public class r2 extends o {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    m f66293p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    m f66294q0;

    private r2(v vVar) {
        Enumeration enumerationG = vVar.g();
        this.f66293p0 = (m) enumerationG.nextElement();
        this.f66294q0 = (m) enumerationG.nextElement();
    }

    public static r2 a(Object obj) {
        if (obj instanceof r2) {
            return (r2) obj;
        }
        if (obj != null) {
            return new r2(v.a(obj));
        }
        return null;
    }

    public BigInteger c() {
        return this.f66294q0.g();
    }

    public BigInteger d() {
        return this.f66293p0.g();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o, com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        h hVar = new h();
        hVar.a(this.f66293p0);
        hVar.a(this.f66294q0);
        return new i1(hVar);
    }
}
