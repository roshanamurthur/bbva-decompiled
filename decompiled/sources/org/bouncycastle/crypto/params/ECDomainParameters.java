package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ECDomainParameters implements ECConstants {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECCurve f89269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f89270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ECPoint f89271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BigInteger f89272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BigInteger f89273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BigInteger f89274f;

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this(eCCurve, eCPoint, bigInteger, ECConstants.ONE, null);
    }

    public static ECPoint a(ECCurve eCCurve, ECPoint eCPoint) {
        if (eCPoint == null) {
            throw new NullPointerException("Point cannot be null");
        }
        ECPoint eCPointNormalize = ECAlgorithms.importPoint(eCCurve, eCPoint).normalize();
        if (eCPointNormalize.isInfinity()) {
            throw new IllegalArgumentException("Point at infinity");
        }
        if (eCPointNormalize.isValid()) {
            return eCPointNormalize;
        }
        throw new IllegalArgumentException("Point not on curve");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECDomainParameters)) {
            return false;
        }
        ECDomainParameters eCDomainParameters = (ECDomainParameters) obj;
        return this.f89269a.equals(eCDomainParameters.f89269a) && this.f89271c.equals(eCDomainParameters.f89271c) && this.f89272d.equals(eCDomainParameters.f89272d);
    }

    public ECCurve getCurve() {
        return this.f89269a;
    }

    public ECPoint getG() {
        return this.f89271c;
    }

    public BigInteger getH() {
        return this.f89273e;
    }

    public synchronized BigInteger getHInv() {
        try {
            if (this.f89274f == null) {
                this.f89274f = this.f89273e.modInverse(this.f89272d);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f89274f;
    }

    public BigInteger getN() {
        return this.f89272d;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f89270b);
    }

    public int hashCode() {
        return ((((this.f89269a.hashCode() ^ 1028) * 257) ^ this.f89271c.hashCode()) * 257) ^ this.f89272d.hashCode();
    }

    public BigInteger validatePrivateScalar(BigInteger bigInteger) {
        if (bigInteger == null) {
            throw new NullPointerException("Scalar cannot be null");
        }
        if (bigInteger.compareTo(ECConstants.ONE) < 0 || bigInteger.compareTo(getN()) >= 0) {
            throw new IllegalArgumentException("Scalar is not in the interval [1, n - 1]");
        }
        return bigInteger;
    }

    public ECPoint validatePublicPoint(ECPoint eCPoint) {
        return a(getCurve(), eCPoint);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eCCurve, eCPoint, bigInteger, bigInteger2, null);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f89274f = null;
        if (eCCurve == null) {
            throw new NullPointerException("curve");
        }
        if (bigInteger == null) {
            throw new NullPointerException("n");
        }
        this.f89269a = eCCurve;
        this.f89271c = a(eCCurve, eCPoint);
        this.f89272d = bigInteger;
        this.f89273e = bigInteger2;
        this.f89270b = Arrays.clone(bArr);
    }
}
