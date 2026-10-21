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
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;

/* JADX INFO: loaded from: classes5.dex */
public class ECDSASigner implements ECConstants, DSAExt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DSAKCalculator f89505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ECKeyParameters f89506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecureRandom f89507c;

    public ECDSASigner() {
        this.f89505a = new RandomDSAKCalculator();
    }

    public BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        int iBitLength = bigInteger.bitLength();
        int length = bArr.length * 8;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        return iBitLength < length ? bigInteger2.shiftRight(length - iBitLength) : bigInteger2;
    }

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        ECDomainParameters parameters = this.f89506b.getParameters();
        BigInteger n7 = parameters.getN();
        BigInteger bigIntegerCalculateE = calculateE(n7, bArr);
        BigInteger d2 = ((ECPrivateKeyParameters) this.f89506b).getD();
        DSAKCalculator dSAKCalculator = this.f89505a;
        if (dSAKCalculator.isDeterministic()) {
            dSAKCalculator.init(n7, d2, bArr);
        } else {
            dSAKCalculator.init(n7, this.f89507c);
        }
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            BigInteger bigIntegerNextK = dSAKCalculator.nextK();
            BigInteger bigIntegerMod = eCMultiplierCreateBasePointMultiplier.multiply(parameters.getG(), bigIntegerNextK).normalize().getAffineXCoord().toBigInteger().mod(n7);
            BigInteger bigInteger = ECConstants.ZERO;
            if (!bigIntegerMod.equals(bigInteger)) {
                BigInteger bigIntegerMod2 = bigIntegerNextK.modInverse(n7).multiply(bigIntegerCalculateE.add(d2.multiply(bigIntegerMod))).mod(n7);
                if (!bigIntegerMod2.equals(bigInteger)) {
                    return new BigInteger[]{bigIntegerMod, bigIntegerMod2};
                }
            }
        }
    }

    public ECFieldElement getDenominator(int i10, ECPoint eCPoint) {
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3 || i10 == 4) {
                return eCPoint.getZCoord(0).square();
            }
            if (i10 != 6 && i10 != 7) {
                return null;
            }
        }
        return eCPoint.getZCoord(0);
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public BigInteger getOrder() {
        return this.f89506b.getParameters().getN();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    @Override // org.bouncycastle.crypto.DSA
    public void init(boolean z10, CipherParameters cipherParameters) {
        ECKeyParameters eCKeyParameters;
        SecureRandom random;
        boolean z11;
        if (z10) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.f89506b = (ECPrivateKeyParameters) parametersWithRandom.getParameters();
                random = parametersWithRandom.getRandom();
            } else {
                eCKeyParameters = (ECPrivateKeyParameters) cipherParameters;
            }
            if (z10 || this.f89505a.isDeterministic()) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f89507c = initSecureRandom(z11, random);
        }
        eCKeyParameters = (ECPublicKeyParameters) cipherParameters;
        this.f89506b = eCKeyParameters;
        random = null;
        if (z10) {
            z11 = false;
        } else {
            z11 = false;
        }
        this.f89507c = initSecureRandom(z11, random);
    }

    public SecureRandom initSecureRandom(boolean z10, SecureRandom secureRandom) {
        if (z10) {
            return secureRandom != null ? secureRandom : CryptoServicesRegistrar.getSecureRandom();
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger cofactor;
        ECFieldElement denominator;
        ECDomainParameters parameters = this.f89506b.getParameters();
        BigInteger n7 = parameters.getN();
        BigInteger bigIntegerCalculateE = calculateE(n7, bArr);
        BigInteger bigInteger3 = ECConstants.ONE;
        if (bigInteger.compareTo(bigInteger3) < 0 || bigInteger.compareTo(n7) >= 0 || bigInteger2.compareTo(bigInteger3) < 0 || bigInteger2.compareTo(n7) >= 0) {
            return false;
        }
        BigInteger bigIntegerModInverse = bigInteger2.modInverse(n7);
        ECPoint eCPointSumOfTwoMultiplies = ECAlgorithms.sumOfTwoMultiplies(parameters.getG(), bigIntegerCalculateE.multiply(bigIntegerModInverse).mod(n7), ((ECPublicKeyParameters) this.f89506b).getQ(), bigInteger.multiply(bigIntegerModInverse).mod(n7));
        if (eCPointSumOfTwoMultiplies.isInfinity()) {
            return false;
        }
        ECCurve curve = eCPointSumOfTwoMultiplies.getCurve();
        if (curve == null || (cofactor = curve.getCofactor()) == null || cofactor.compareTo(ECConstants.EIGHT) > 0 || (denominator = getDenominator(curve.getCoordinateSystem(), eCPointSumOfTwoMultiplies)) == null || denominator.isZero()) {
            return eCPointSumOfTwoMultiplies.normalize().getAffineXCoord().toBigInteger().mod(n7).equals(bigInteger);
        }
        ECFieldElement xCoord = eCPointSumOfTwoMultiplies.getXCoord();
        while (curve.isValidFieldElement(bigInteger)) {
            if (curve.fromBigInteger(bigInteger).multiply(denominator).equals(xCoord)) {
                return true;
            }
            bigInteger = bigInteger.add(n7);
        }
        return false;
    }

    public ECDSASigner(DSAKCalculator dSAKCalculator) {
        this.f89505a = dSAKCalculator;
    }
}
