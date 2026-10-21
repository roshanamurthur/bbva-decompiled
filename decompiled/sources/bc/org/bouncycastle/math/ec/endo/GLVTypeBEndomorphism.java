package bc.org.bouncycastle.math.ec.endo;

import bc.org.bouncycastle.math.ec.ECConstants;
import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECPointMap;
import bc.org.bouncycastle.math.ec.ScaleXPointMap;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class GLVTypeBEndomorphism implements GLVEndomorphism {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ECCurve f25176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final GLVTypeBParameters f25177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final ECPointMap f25178c;

    public GLVTypeBEndomorphism(ECCurve eCCurve, GLVTypeBParameters gLVTypeBParameters) {
        this.f25176a = eCCurve;
        this.f25177b = gLVTypeBParameters;
        this.f25178c = new ScaleXPointMap(eCCurve.fromBigInteger(gLVTypeBParameters.getBeta()));
    }

    public BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        boolean z10 = bigInteger2.signum() < 0;
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger2.abs());
        boolean zTestBit = bigIntegerMultiply.testBit(i10 - 1);
        BigInteger bigIntegerShiftRight = bigIntegerMultiply.shiftRight(i10);
        if (zTestBit) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(ECConstants.ONE);
        }
        return z10 ? bigIntegerShiftRight.negate() : bigIntegerShiftRight;
    }

    @Override // bc.org.bouncycastle.math.ec.endo.GLVEndomorphism
    public BigInteger[] decomposeScalar(BigInteger bigInteger) {
        int bits = this.f25177b.getBits();
        BigInteger bigIntegerA = a(bigInteger, this.f25177b.getG1(), bits);
        BigInteger bigIntegerA2 = a(bigInteger, this.f25177b.getG2(), bits);
        GLVTypeBParameters gLVTypeBParameters = this.f25177b;
        return new BigInteger[]{bigInteger.subtract(bigIntegerA.multiply(gLVTypeBParameters.getV1A()).add(bigIntegerA2.multiply(gLVTypeBParameters.getV2A()))), bigIntegerA.multiply(gLVTypeBParameters.getV1B()).add(bigIntegerA2.multiply(gLVTypeBParameters.getV2B())).negate()};
    }

    @Override // bc.org.bouncycastle.math.ec.endo.ECEndomorphism
    public ECPointMap getPointMap() {
        return this.f25178c;
    }

    @Override // bc.org.bouncycastle.math.ec.endo.ECEndomorphism
    public boolean hasEfficientPointMap() {
        return true;
    }
}
