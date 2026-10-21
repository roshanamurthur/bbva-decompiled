package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECConstants;
import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.math.ec.ECPoint;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP224K1Curve extends ECCurve.AbstractFp {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final BigInteger f25102q = new BigInteger(1, e3.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected SecP224K1Point f25103i;

    public SecP224K1Curve() {
        super(f25102q);
        this.f25103i = new SecP224K1Point(this, null, null);
        this.f25005b = fromBigInteger(ECConstants.ZERO);
        this.f25006c = fromBigInteger(BigInteger.valueOf(5L));
        this.f25007d = new BigInteger(1, e3.a("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.f25008e = BigInteger.valueOf(1L);
        this.f25009f = 2;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECCurve a() {
        return new SecP224K1Curve();
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP224K1FieldElement(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f25102q.bitLength();
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.f25103i;
    }

    public BigInteger getQ() {
        return f25102q;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 2;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECPoint a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
        return new SecP224K1Point(this, eCFieldElement, eCFieldElement2, z10);
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECPoint a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
        return new SecP224K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z10);
    }
}
