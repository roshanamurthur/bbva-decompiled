package org.bouncycastle.math.ec;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements PreCompCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECPoint.AbstractF2m f90844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte f90845b;

    public e(ECPoint.AbstractF2m abstractF2m, byte b10) {
        this.f90844a = abstractF2m;
        this.f90845b = b10;
    }

    @Override // org.bouncycastle.math.ec.PreCompCallback
    public final PreCompInfo precompute(PreCompInfo preCompInfo) {
        if (preCompInfo instanceof WTauNafPreCompInfo) {
            return preCompInfo;
        }
        WTauNafPreCompInfo wTauNafPreCompInfo = new WTauNafPreCompInfo();
        byte[][] bArr = this.f90845b == 0 ? c.f90630d : c.f90632f;
        ECPoint.AbstractF2m[] abstractF2mArr = new ECPoint.AbstractF2m[(bArr.length + 1) >>> 1];
        ECPoint.AbstractF2m abstractF2m = this.f90844a;
        abstractF2mArr[0] = abstractF2m;
        int length = bArr.length;
        for (int i10 = 3; i10 < length; i10 += 2) {
            int i11 = i10 >>> 1;
            byte[] bArr2 = bArr[i10];
            ECPoint.AbstractF2m abstractF2mTauPow = (ECPoint.AbstractF2m) abstractF2m.getCurve().getInfinity();
            ECPoint.AbstractF2m abstractF2m2 = (ECPoint.AbstractF2m) abstractF2m.negate();
            int i12 = 0;
            for (int length2 = bArr2.length - 1; length2 >= 0; length2--) {
                i12++;
                byte b10 = bArr2[length2];
                if (b10 != 0) {
                    abstractF2mTauPow = (ECPoint.AbstractF2m) abstractF2mTauPow.tauPow(i12).add(b10 > 0 ? abstractF2m : abstractF2m2);
                    i12 = 0;
                }
            }
            if (i12 > 0) {
                abstractF2mTauPow = abstractF2mTauPow.tauPow(i12);
            }
            abstractF2mArr[i11] = abstractF2mTauPow;
        }
        abstractF2m.getCurve().normalizeAll(abstractF2mArr);
        wTauNafPreCompInfo.setPreComp(abstractF2mArr);
        return wTauNafPreCompInfo;
    }
}
