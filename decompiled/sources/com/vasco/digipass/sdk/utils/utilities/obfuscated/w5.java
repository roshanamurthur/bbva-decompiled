package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class w5 extends o implements y5 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private p f66421p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private u f66422q0;

    public w5(BigInteger bigInteger) {
        this.f66421p0 = y5.f66465c;
        this.f66422q0 = new m(bigInteger);
    }

    public static w5 a(Object obj) {
        if (obj instanceof w5) {
            return (w5) obj;
        }
        if (obj != null) {
            return new w5(v.a(obj));
        }
        return null;
    }

    public p c() {
        return this.f66421p0;
    }

    public u d() {
        return this.f66422q0;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o, com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        h hVar = new h();
        hVar.a(this.f66421p0);
        hVar.a(this.f66422q0);
        return new i1(hVar);
    }

    public w5(int i10, int i11) {
        this(i10, i11, 0, 0);
    }

    public w5(int i10, int i11, int i12, int i13) {
        this.f66421p0 = y5.f66467d;
        h hVar = new h();
        hVar.a(new m(i10));
        if (i12 == 0) {
            if (i13 == 0) {
                hVar.a(y5.f66471f);
                hVar.a(new m(i11));
            } else {
                throw new IllegalArgumentException("inconsistent k values");
            }
        } else if (i12 > i11 && i13 > i12) {
            hVar.a(y5.f66473g);
            h hVar2 = new h();
            hVar2.a(new m(i11));
            hVar2.a(new m(i12));
            hVar2.a(new m(i13));
            hVar.a(new i1(hVar2));
        } else {
            throw new IllegalArgumentException("inconsistent k values");
        }
        this.f66422q0 = new i1(hVar);
    }

    private w5(v vVar) {
        this.f66421p0 = p.a(vVar.a(0));
        this.f66422q0 = vVar.a(1).toASN1Primitive();
    }
}
