package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.math.ec.ECMultiplier;
import bc.org.bouncycastle.math.ec.ECPoint;
import bc.org.bouncycastle.math.ec.WTauNafMultiplier;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecT163K1Curve extends ECCurve.AbstractF2m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected SecT163K1Point f25145j;

    public SecT163K1Curve() {
        super(163, 3, 6, 7);
        this.f25145j = new SecT163K1Point(this, null, null);
        ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(BigInteger.valueOf(1L));
        this.f25005b = eCFieldElementFromBigInteger;
        this.f25006c = eCFieldElementFromBigInteger;
        this.f25007d = new BigInteger(1, e3.a("04000000000000000000020108A2E0CC0D99F8A5EF"));
        this.f25008e = BigInteger.valueOf(2L);
        this.f25009f = 6;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECCurve a() {
        return new SecT163K1Curve();
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECMultiplier b() {
        return new WTauNafMultiplier();
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
        return this.f25145j;
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
        return true;
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
        return new SecT163K1Point(this, eCFieldElement, eCFieldElement2, z10);
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECPoint a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
        return new SecT163K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z10);
    }
}
