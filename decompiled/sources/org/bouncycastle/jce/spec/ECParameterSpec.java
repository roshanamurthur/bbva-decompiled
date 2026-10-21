package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes8.dex */
public class ECParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECCurve f90521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f90522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ECPoint f90523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BigInteger f90524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BigInteger f90525e;

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this.f90521a = eCCurve;
        this.f90523c = eCPoint.normalize();
        this.f90524d = bigInteger;
        this.f90525e = BigInteger.valueOf(1L);
        this.f90522b = null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ECParameterSpec)) {
            return false;
        }
        ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
        return getCurve().equals(eCParameterSpec.getCurve()) && getG().equals(eCParameterSpec.getG());
    }

    public ECCurve getCurve() {
        return this.f90521a;
    }

    public ECPoint getG() {
        return this.f90523c;
    }

    public BigInteger getH() {
        return this.f90525e;
    }

    public BigInteger getN() {
        return this.f90524d;
    }

    public byte[] getSeed() {
        return this.f90522b;
    }

    public int hashCode() {
        return getCurve().hashCode() ^ getG().hashCode();
    }

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this.f90521a = eCCurve;
        this.f90523c = eCPoint.normalize();
        this.f90524d = bigInteger;
        this.f90525e = bigInteger2;
        this.f90522b = null;
    }

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f90521a = eCCurve;
        this.f90523c = eCPoint.normalize();
        this.f90524d = bigInteger;
        this.f90525e = bigInteger2;
        this.f90522b = bArr;
    }
}
