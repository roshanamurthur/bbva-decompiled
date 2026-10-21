package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.math.ec.ECPoint;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecT163R1Curve extends ECCurve.AbstractF2m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected SecT163R1Point f25146j;

    public SecT163R1Curve() {
        super(163, 3, 6, 7);
        this.f25146j = new SecT163R1Point(this, null, null);
        this.f25005b = fromBigInteger(new BigInteger(1, e3.a("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2")));
        this.f25006c = fromBigInteger(new BigInteger(1, e3.a("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9")));
        this.f25007d = new BigInteger(1, e3.a("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B"));
        this.f25008e = BigInteger.valueOf(2L);
        this.f25009f = 6;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECCurve a() {
        return new SecT163R1Curve();
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT163FieldElement(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return 163;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.f25146j;
    }

    public int getK1() {
        return 3;
    }

    public int getK2() {
        return 6;
    }

    public int getK3() {
        return 7;
    }

    public int getM() {
        return 163;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return false;
    }

    public boolean isTrinomial() {
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 6;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECPoint a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
        return new SecT163R1Point(this, eCFieldElement, eCFieldElement2, z10);
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECPoint a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
        return new SecT163R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z10);
    }
}
