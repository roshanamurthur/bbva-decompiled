package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class RSAPrivateCrtKeyParameters extends RSAKeyParameters {
    public final BigInteger E0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final BigInteger f89370u0;
    public final BigInteger v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final BigInteger f89371w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final BigInteger f89372x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final BigInteger f89373y0;

    public RSAPrivateCrtKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        super(true, bigInteger, bigInteger3);
        this.f89370u0 = bigInteger2;
        this.v0 = bigInteger4;
        this.f89371w0 = bigInteger5;
        this.f89372x0 = bigInteger6;
        this.f89373y0 = bigInteger7;
        this.E0 = bigInteger8;
    }

    public BigInteger getDP() {
        return this.f89372x0;
    }

    public BigInteger getDQ() {
        return this.f89373y0;
    }

    public BigInteger getP() {
        return this.v0;
    }

    public BigInteger getPublicExponent() {
        return this.f89370u0;
    }

    public BigInteger getQ() {
        return this.f89371w0;
    }

    public BigInteger getQInv() {
        return this.E0;
    }
}
