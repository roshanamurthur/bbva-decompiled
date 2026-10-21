package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class CramerShoupPrivateKeyParameters extends CramerShoupKeyParameters {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BigInteger f89212r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final BigInteger f89213s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final BigInteger f89214t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final BigInteger f89215u0;
    public final BigInteger v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public CramerShoupPublicKeyParameters f89216w0;

    public CramerShoupPrivateKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(true, cramerShoupParameters);
        this.f89212r0 = bigInteger;
        this.f89213s0 = bigInteger2;
        this.f89214t0 = bigInteger3;
        this.f89215u0 = bigInteger4;
        this.v0 = bigInteger5;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPrivateKeyParameters)) {
            return false;
        }
        CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) obj;
        return cramerShoupPrivateKeyParameters.getX1().equals(this.f89212r0) && cramerShoupPrivateKeyParameters.getX2().equals(this.f89213s0) && cramerShoupPrivateKeyParameters.getY1().equals(this.f89214t0) && cramerShoupPrivateKeyParameters.getY2().equals(this.f89215u0) && cramerShoupPrivateKeyParameters.getZ().equals(this.v0) && super.equals(obj);
    }

    public CramerShoupPublicKeyParameters getPk() {
        return this.f89216w0;
    }

    public BigInteger getX1() {
        return this.f89212r0;
    }

    public BigInteger getX2() {
        return this.f89213s0;
    }

    public BigInteger getY1() {
        return this.f89214t0;
    }

    public BigInteger getY2() {
        return this.f89215u0;
    }

    public BigInteger getZ() {
        return this.v0;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((((this.f89212r0.hashCode() ^ this.f89213s0.hashCode()) ^ this.f89214t0.hashCode()) ^ this.f89215u0.hashCode()) ^ this.v0.hashCode()) ^ super.hashCode();
    }

    public void setPk(CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters) {
        this.f89216w0 = cramerShoupPublicKeyParameters;
    }
}
