package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes9.dex */
public class f2 extends o {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    m f66031p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    m f66032q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    m f66033r0;

    private f2(v vVar) {
        if (vVar.h() != 3) {
            throw new IllegalArgumentException("Bad sequence size: " + vVar.h());
        }
        Enumeration enumerationG = vVar.g();
        this.f66031p0 = m.a(enumerationG.nextElement());
        this.f66032q0 = m.a(enumerationG.nextElement());
        this.f66033r0 = m.a(enumerationG.nextElement());
    }

    public static f2 a(Object obj) {
        if (obj instanceof f2) {
            return (f2) obj;
        }
        if (obj != null) {
            return new f2(v.a(obj));
        }
        return null;
    }

    public BigInteger c() {
        return this.f66033r0.g();
    }

    public BigInteger d() {
        return this.f66031p0.g();
    }

    public BigInteger e() {
        return this.f66032q0.g();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o, com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        h hVar = new h();
        hVar.a(this.f66031p0);
        hVar.a(this.f66032q0);
        hVar.a(this.f66033r0);
        return new i1(hVar);
    }
}
