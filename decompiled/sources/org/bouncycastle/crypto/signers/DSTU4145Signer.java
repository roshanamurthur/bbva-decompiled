package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes5.dex */
public class DSTU4145Signer implements DSAExt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigInteger f89502c = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ECKeyParameters f89503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecureRandom f89504b;

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        ECDomainParameters parameters = this.f89503a.getParameters();
        ECCurve curve = parameters.getCurve();
        BigInteger bigInteger = new BigInteger(1, Arrays.reverse(bArr));
        int fieldSize = curve.getFieldSize();
        int iBitLength = bigInteger.bitLength();
        BigInteger bigInteger2 = f89502c;
        if (iBitLength > fieldSize) {
            bigInteger = bigInteger.mod(bigInteger2.shiftLeft(fieldSize));
        }
        ECFieldElement eCFieldElementFromBigInteger = curve.fromBigInteger(bigInteger);
        if (eCFieldElementFromBigInteger.isZero()) {
            eCFieldElementFromBigInteger = curve.fromBigInteger(bigInteger2);
        }
        BigInteger n7 = parameters.getN();
        BigInteger d2 = ((ECPrivateKeyParameters) this.f89503a).getD();
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            BigInteger bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(n7.bitLength() - 1, this.f89504b);
            ECFieldElement affineXCoord = eCMultiplierCreateBasePointMultiplier.multiply(parameters.getG(), bigIntegerCreateRandomBigInteger).normalize().getAffineXCoord();
            if (!affineXCoord.isZero()) {
                BigInteger bigInteger3 = eCFieldElementFromBigInteger.multiply(affineXCoord).toBigInteger();
                int iBitLength2 = n7.bitLength() - 1;
                if (bigInteger3.bitLength() > iBitLength2) {
                    bigInteger3 = bigInteger3.mod(bigInteger2.shiftLeft(iBitLength2));
                }
                if (bigInteger3.signum() != 0) {
                    BigInteger bigIntegerMod = bigInteger3.multiply(d2).add(bigIntegerCreateRandomBigInteger).mod(n7);
                    if (bigIntegerMod.signum() != 0) {
                        return new BigInteger[]{bigInteger3, bigIntegerMod};
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public BigInteger getOrder() {
        return this.f89503a.getParameters().getN();
    }

    @Override // org.bouncycastle.crypto.DSA
    public void init(boolean z10, CipherParameters cipherParameters) {
        ECKeyParameters eCKeyParameters;
        if (z10) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.f89504b = parametersWithRandom.getRandom();
                cipherParameters = parametersWithRandom.getParameters();
            } else {
                this.f89504b = CryptoServicesRegistrar.getSecureRandom();
            }
            eCKeyParameters = (ECPrivateKeyParameters) cipherParameters;
        } else {
            eCKeyParameters = (ECPublicKeyParameters) cipherParameters;
        }
        this.f89503a = eCKeyParameters;
    }

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.signum() <= 0 || bigInteger2.signum() <= 0) {
            return false;
        }
        ECDomainParameters parameters = this.f89503a.getParameters();
        BigInteger n7 = parameters.getN();
        if (bigInteger.compareTo(n7) >= 0 || bigInteger2.compareTo(n7) >= 0) {
            return false;
        }
        ECCurve curve = parameters.getCurve();
        BigInteger bigInteger3 = new BigInteger(1, Arrays.reverse(bArr));
        int fieldSize = curve.getFieldSize();
        int iBitLength = bigInteger3.bitLength();
        BigInteger bigInteger4 = f89502c;
        if (iBitLength > fieldSize) {
            bigInteger3 = bigInteger3.mod(bigInteger4.shiftLeft(fieldSize));
        }
        ECFieldElement eCFieldElementFromBigInteger = curve.fromBigInteger(bigInteger3);
        if (eCFieldElementFromBigInteger.isZero()) {
            eCFieldElementFromBigInteger = curve.fromBigInteger(bigInteger4);
        }
        ECPoint eCPointNormalize = ECAlgorithms.sumOfTwoMultiplies(parameters.getG(), bigInteger2, ((ECPublicKeyParameters) this.f89503a).getQ(), bigInteger).normalize();
        if (eCPointNormalize.isInfinity()) {
            return false;
        }
        BigInteger bigInteger5 = eCFieldElementFromBigInteger.multiply(eCPointNormalize.getAffineXCoord()).toBigInteger();
        int iBitLength2 = n7.bitLength() - 1;
        if (bigInteger5.bitLength() > iBitLength2) {
            bigInteger5 = bigInteger5.mod(bigInteger4.shiftLeft(iBitLength2));
        }
        return bigInteger5.compareTo(bigInteger) == 0;
    }
}
