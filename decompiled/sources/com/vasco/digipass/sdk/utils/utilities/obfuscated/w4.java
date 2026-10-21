package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes9.dex */
public class w4 extends o {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private BigInteger f66419p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private BigInteger f66420q0;

    private w4(v vVar) {
        if (vVar.h() != 2) {
            throw new IllegalArgumentException("Bad sequence size: " + vVar.h());
        }
        Enumeration enumerationG = vVar.g();
        this.f66419p0 = m.a(enumerationG.nextElement()).g();
        this.f66420q0 = m.a(enumerationG.nextElement()).g();
    }

    public static w4 a(Object obj) {
        if (obj instanceof w4) {
            return (w4) obj;
        }
        if (obj != null) {
            return new w4(v.a(obj));
        }
        return null;
    }

    public BigInteger c() {
        return this.f66419p0;
    }

    public BigInteger d() {
        return this.f66420q0;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o, com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        h hVar = new h();
        hVar.a(new m(c()));
        hVar.a(new m(d()));
        return new i1(hVar);
    }
}
