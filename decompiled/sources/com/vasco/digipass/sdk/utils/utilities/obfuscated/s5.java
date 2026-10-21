package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.math.ec.ECAlgorithms;
import bc.org.bouncycastle.math.ec.ECCurve;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class s5 extends o implements y5 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private ECCurve f66369p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private byte[] f66370q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private p f66371r0;

    public s5(ECCurve eCCurve, byte[] bArr) {
        this.f66371r0 = null;
        this.f66369p0 = eCCurve;
        this.f66370q0 = bArr;
        c();
    }

    private void c() {
        if (ECAlgorithms.isFpCurve(this.f66369p0)) {
            this.f66371r0 = y5.f66465c;
        } else {
            if (!ECAlgorithms.isF2mCurve(this.f66369p0)) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            this.f66371r0 = y5.f66467d;
        }
    }

    public ECCurve getCurve() {
        return this.f66369p0;
    }

    public byte[] getSeed() {
        return this.f66370q0;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o, com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        h hVar = new h();
        if (this.f66371r0.equals(y5.f66465c) || this.f66371r0.equals(y5.f66467d)) {
            hVar.a(new v5(this.f66369p0.getA()).toASN1Primitive());
            hVar.a(new v5(this.f66369p0.getB()).toASN1Primitive());
        }
        byte[] bArr = this.f66370q0;
        if (bArr != null) {
            hVar.a(new v0(bArr));
        }
        return new i1(hVar);
    }

    public s5(w5 w5Var, v vVar) {
        int iIntValue;
        int iIntValue2;
        int i10;
        this.f66371r0 = null;
        p pVarC = w5Var.c();
        this.f66371r0 = pVarC;
        if (pVarC.equals(y5.f66465c)) {
            BigInteger bigIntegerH = ((m) w5Var.d()).h();
            this.f66369p0 = new ECCurve.Fp(bigIntegerH, new v5(bigIntegerH, (q) vVar.a(0)).c().toBigInteger(), new v5(bigIntegerH, (q) vVar.a(1)).c().toBigInteger());
        } else if (this.f66371r0.equals(y5.f66467d)) {
            v vVarA = v.a((Object) w5Var.d());
            int iIntValue3 = ((m) vVarA.a(0)).h().intValue();
            p pVar = (p) vVarA.a(1);
            if (pVar.equals(y5.f66471f)) {
                iIntValue2 = m.a(vVarA.a(2)).h().intValue();
                i10 = 0;
                iIntValue = 0;
            } else if (pVar.equals(y5.f66473g)) {
                v vVarA2 = v.a(vVarA.a(2));
                int iIntValue4 = m.a(vVarA2.a(0)).h().intValue();
                int iIntValue5 = m.a(vVarA2.a(1)).h().intValue();
                iIntValue = m.a(vVarA2.a(2)).h().intValue();
                iIntValue2 = iIntValue4;
                i10 = iIntValue5;
            } else {
                throw new IllegalArgumentException("This type of EC basis is not implemented");
            }
            int i11 = iIntValue2;
            int i12 = i10;
            int i13 = iIntValue;
            this.f66369p0 = new ECCurve.F2m(iIntValue3, i11, i12, i13, new v5(iIntValue3, i11, i12, i13, (q) vVar.a(0)).c().toBigInteger(), new v5(iIntValue3, i11, i12, i13, (q) vVar.a(1)).c().toBigInteger());
        } else {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        }
        if (vVar.h() == 3) {
            this.f66370q0 = ((v0) vVar.a(2)).g();
        }
    }
}
