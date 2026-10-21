package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BigInteger f89217r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final BigInteger f89218s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final BigInteger f89219t0;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f89217r0 = bigInteger;
        this.f89218s0 = bigInteger2;
        this.f89219t0 = bigInteger3;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPublicKeyParameters)) {
            return false;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
        return cramerShoupPublicKeyParameters.getC().equals(this.f89217r0) && cramerShoupPublicKeyParameters.getD().equals(this.f89218s0) && cramerShoupPublicKeyParameters.getH().equals(this.f89219t0) && super.equals(obj);
    }

    public BigInteger getC() {
        return this.f89217r0;
    }

    public BigInteger getD() {
        return this.f89218s0;
    }

    public BigInteger getH() {
        return this.f89219t0;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((this.f89217r0.hashCode() ^ this.f89218s0.hashCode()) ^ this.f89219t0.hashCode()) ^ super.hashCode();
    }
}
