package bc.org.bouncycastle.crypto.params;

import bc.org.bouncycastle.math.ec.ECConstants;
import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECPoint;
import bc.org.bouncycastle.util.Arrays;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class ECDomainParameters implements ECConstants {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ECCurve f24987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f24988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ECPoint f24989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BigInteger f24990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BigInteger f24991e;

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this(eCCurve, eCPoint, bigInteger, ECConstants.ONE, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECDomainParameters)) {
            return false;
        }
        ECDomainParameters eCDomainParameters = (ECDomainParameters) obj;
        return this.f24987a.equals(eCDomainParameters.f24987a) && this.f24989c.equals(eCDomainParameters.f24989c) && this.f24990d.equals(eCDomainParameters.f24990d) && this.f24991e.equals(eCDomainParameters.f24991e);
    }

    public ECCurve getCurve() {
        return this.f24987a;
    }

    public ECPoint getG() {
        return this.f24989c;
    }

    public BigInteger getH() {
        return this.f24991e;
    }

    public BigInteger getN() {
        return this.f24990d;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f24988b);
    }

    public int hashCode() {
        return (((((this.f24987a.hashCode() * 37) ^ this.f24989c.hashCode()) * 37) ^ this.f24990d.hashCode()) * 37) ^ this.f24991e.hashCode();
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eCCurve, eCPoint, bigInteger, bigInteger2, null);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f24987a = eCCurve;
        this.f24989c = eCPoint.normalize();
        this.f24990d = bigInteger;
        this.f24991e = bigInteger2;
        this.f24988b = bArr;
    }
}
