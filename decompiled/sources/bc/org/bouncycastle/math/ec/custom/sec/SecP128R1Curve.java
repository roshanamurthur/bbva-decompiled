package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.math.ec.ECPoint;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP128R1Curve extends ECCurve.AbstractFp {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final BigInteger f25070q = new BigInteger(1, e3.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected SecP128R1Point f25071i;

    public SecP128R1Curve() {
        super(f25070q);
        this.f25071i = new SecP128R1Point(this, null, null);
        this.f25005b = fromBigInteger(new BigInteger(1, e3.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f25006c = fromBigInteger(new BigInteger(1, e3.a("E87579C11079F43DD824993C2CEE5ED3")));
        this.f25007d = new BigInteger(1, e3.a("FFFFFFFE0000000075A30D1B9038A115"));
        this.f25008e = BigInteger.valueOf(1L);
        this.f25009f = 2;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECCurve a() {
        return new SecP128R1Curve();
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP128R1FieldElement(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f25070q.bitLength();
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.f25071i;
    }

    public BigInteger getQ() {
        return f25070q;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 2;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECPoint a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
        return new SecP128R1Point(this, eCFieldElement, eCFieldElement2, z10);
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECPoint a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
        return new SecP128R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z10);
    }
}
