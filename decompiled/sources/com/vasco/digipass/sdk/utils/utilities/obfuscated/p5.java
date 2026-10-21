package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class p5 extends o {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private v0 f66254p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private m f66255q0;

    private p5(v vVar) {
        if (vVar.h() == 2) {
            this.f66254p0 = v0.a(vVar.a(0));
            this.f66255q0 = m.a(vVar.a(1));
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + vVar.h());
        }
    }

    public static p5 a(Object obj) {
        if (obj instanceof p5) {
            return (p5) obj;
        }
        if (obj != null) {
            return new p5(v.a(obj));
        }
        return null;
    }

    public BigInteger c() {
        return this.f66255q0.g();
    }

    public byte[] getSeed() {
        return this.f66254p0.g();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o, com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        h hVar = new h();
        hVar.a(this.f66254p0);
        hVar.a(this.f66255q0);
        return new i1(hVar);
    }
}
