package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECConstants;
import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.math.ec.ECPoint;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP256K1Curve extends ECCurve.AbstractFp {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final BigInteger f25115q = new BigInteger(1, e3.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected SecP256K1Point f25116i;

    public SecP256K1Curve() {
        super(f25115q);
        this.f25116i = new SecP256K1Point(this, null, null);
        this.f25005b = fromBigInteger(ECConstants.ZERO);
        this.f25006c = fromBigInteger(BigInteger.valueOf(7L));
        this.f25007d = new BigInteger(1, e3.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141"));
        this.f25008e = BigInteger.valueOf(1L);
        this.f25009f = 2;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECCurve a() {
        return new SecP256K1Curve();
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP256K1FieldElement(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f25115q.bitLength();
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.f25116i;
    }

    public BigInteger getQ() {
        return f25115q;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 2;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECPoint a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
        return new SecP256K1Point(this, eCFieldElement, eCFieldElement2, z10);
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECPoint a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
        return new SecP256K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z10);
    }
}
