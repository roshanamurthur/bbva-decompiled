package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.math.ec.ECMultiplier;
import bc.org.bouncycastle.math.ec.ECPoint;
import bc.org.bouncycastle.math.ec.WTauNafMultiplier;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecT571K1Curve extends ECCurve.AbstractF2m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected SecT571K1Point f25165j;

    public SecT571K1Curve() {
        super(571, 2, 5, 10);
        this.f25165j = new SecT571K1Point(this, null, null);
        this.f25005b = fromBigInteger(BigInteger.valueOf(0L));
        this.f25006c = fromBigInteger(BigInteger.valueOf(1L));
        this.f25007d = new BigInteger(1, e3.a("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        this.f25008e = BigInteger.valueOf(4L);
        this.f25009f = 6;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECCurve a() {
        return new SecT571K1Curve();
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECMultiplier b() {
        return new WTauNafMultiplier();
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT571FieldElement(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return 571;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.f25165j;
    }

    public int getK1() {
        return 2;
    }

    public int getK2() {
        return 5;
    }

    public int getK3() {
        return 10;
    }

    public int getM() {
        return 571;
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
        return new SecT571K1Point(this, eCFieldElement, eCFieldElement2, z10);
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECPoint a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
        return new SecT571K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z10);
    }
}
