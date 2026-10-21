package org.bouncycastle.crypto.prng.drbg;

import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes5.dex */
public class DualECPoints {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECPoint f89464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ECPoint f89465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f89466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f89467d;

    public DualECPoints(int i10, ECPoint eCPoint, ECPoint eCPoint2, int i11) {
        if (!eCPoint.getCurve().equals(eCPoint2.getCurve())) {
            throw new IllegalArgumentException("points need to be on the same curve");
        }
        this.f89466c = i10;
        this.f89464a = eCPoint;
        this.f89465b = eCPoint2;
        this.f89467d = i11;
    }

    public int getCofactor() {
        return this.f89467d;
    }

    public int getMaxOutlen() {
        int fieldSize = this.f89464a.getCurve().getFieldSize();
        int i10 = this.f89467d;
        int i11 = 0;
        while (true) {
            i10 >>= 1;
            if (i10 == 0) {
                return ((fieldSize - (i11 + 13)) / 8) * 8;
            }
            i11++;
        }
    }

    public ECPoint getP() {
        return this.f89464a;
    }

    public ECPoint getQ() {
        return this.f89465b;
    }

    public int getSecurityStrength() {
        return this.f89466c;
    }

    public int getSeedLen() {
        return this.f89464a.getCurve().getFieldSize();
    }
}
