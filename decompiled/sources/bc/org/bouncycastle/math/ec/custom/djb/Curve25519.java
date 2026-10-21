package bc.org.bouncycastle.math.ec.custom.djb;

import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.math.ec.ECPoint;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class Curve25519 extends ECCurve.AbstractFp {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final BigInteger f25059q = y3.c(Curve25519Field.f25061a);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected Curve25519Point f25060i;

    public Curve25519() {
        super(f25059q);
        this.f25060i = new Curve25519Point(this, null, null);
        this.f25005b = fromBigInteger(new BigInteger(1, e3.a("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144")));
        this.f25006c = fromBigInteger(new BigInteger(1, e3.a("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864")));
        this.f25007d = new BigInteger(1, e3.a("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.f25008e = BigInteger.valueOf(8L);
        this.f25009f = 4;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECCurve a() {
        return new Curve25519();
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new Curve25519FieldElement(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f25059q.bitLength();
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.f25060i;
    }

    public BigInteger getQ() {
        return f25059q;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 4;
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECPoint a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
        return new Curve25519Point(this, eCFieldElement, eCFieldElement2, z10);
    }

    @Override // bc.org.bouncycastle.math.ec.ECCurve
    public ECPoint a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
        return new Curve25519Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z10);
    }
}
