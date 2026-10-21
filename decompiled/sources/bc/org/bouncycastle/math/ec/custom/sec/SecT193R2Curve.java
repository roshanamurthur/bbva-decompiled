package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.math.ec.ECPoint;
import com.esotericsoftware.asm.Opcodes;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecT193R2Curve extends ECCurve.AbstractF2m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected SecT193R2Point f25150j;

    public SecT193R2Curve() {
        super(Opcodes.INSTANCEOF, 15, 0, 0);
        this.f25150j = new SecT193R2Point(this, null, null);
        this.f25005b = fromBigInteger(new BigInteger(1, e3.a("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B")));
        this.f25006c = fromBigInteger(new BigInteger(1, e3.a("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE")));
        this.f25007d = new BigInteger(1, e3.a("010000000000000000000000015AAB561B005413CCD4EE99D5"));
        this.f25008e = BigInteger.valueOf(2L);
        this.f25009f = 6;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECCurve a() {
        return new SecT193R2Curve();
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT193FieldElement(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return Opcodes.INSTANCEOF;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.f25150j;
    }

    public int getK1() {
        return 15;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return Opcodes.INSTANCEOF;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return false;
    }

    public boolean isTrinomial() {
        return true;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 6;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECPoint a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
        return new SecT193R2Point(this, eCFieldElement, eCFieldElement2, z10);
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECPoint a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
        return new SecT193R2Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z10);
    }
}
