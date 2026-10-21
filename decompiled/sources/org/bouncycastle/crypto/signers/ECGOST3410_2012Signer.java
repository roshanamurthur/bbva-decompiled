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
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes5.dex */
public class ECGOST3410_2012Signer implements DSAExt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ECKeyParameters f89510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecureRandom f89511b;

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, Arrays.reverse(bArr));
        ECDomainParameters parameters = this.f89510a.getParameters();
        BigInteger n7 = parameters.getN();
        BigInteger d2 = ((ECPrivateKeyParameters) this.f89510a).getD();
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            BigInteger bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(n7.bitLength(), this.f89511b);
            BigInteger bigInteger2 = ECConstants.ZERO;
            if (!bigIntegerCreateRandomBigInteger.equals(bigInteger2)) {
                BigInteger bigIntegerMod = eCMultiplierCreateBasePointMultiplier.multiply(parameters.getG(), bigIntegerCreateRandomBigInteger).normalize().getAffineXCoord().toBigInteger().mod(n7);
                if (bigIntegerMod.equals(bigInteger2)) {
                    continue;
                } else {
                    BigInteger bigIntegerMod2 = bigIntegerCreateRandomBigInteger.multiply(bigInteger).add(d2.multiply(bigIntegerMod)).mod(n7);
                    if (!bigIntegerMod2.equals(bigInteger2)) {
                        return new BigInteger[]{bigIntegerMod, bigIntegerMod2};
                    }
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public BigInteger getOrder() {
        return this.f89510a.getParameters().getN();
    }

    @Override // org.bouncycastle.crypto.DSA
    public void init(boolean z10, CipherParameters cipherParameters) {
        ECKeyParameters eCKeyParameters;
        if (!z10) {
            eCKeyParameters = (ECPublicKeyParameters) cipherParameters;
        } else {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.f89511b = parametersWithRandom.getRandom();
                this.f89510a = (ECPrivateKeyParameters) parametersWithRandom.getParameters();
                return;
            }
            this.f89511b = CryptoServicesRegistrar.getSecureRandom();
            eCKeyParameters = (ECPrivateKeyParameters) cipherParameters;
        }
        this.f89510a = eCKeyParameters;
    }

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = new BigInteger(1, Arrays.reverse(bArr));
        BigInteger n7 = this.f89510a.getParameters().getN();
        BigInteger bigInteger4 = ECConstants.ONE;
        if (bigInteger.compareTo(bigInteger4) < 0 || bigInteger.compareTo(n7) >= 0 || bigInteger2.compareTo(bigInteger4) < 0 || bigInteger2.compareTo(n7) >= 0) {
            return false;
        }
        BigInteger bigIntegerModInverse = bigInteger3.modInverse(n7);
        ECPoint eCPointNormalize = ECAlgorithms.sumOfTwoMultiplies(this.f89510a.getParameters().getG(), bigInteger2.multiply(bigIntegerModInverse).mod(n7), ((ECPublicKeyParameters) this.f89510a).getQ(), n7.subtract(bigInteger).multiply(bigIntegerModInverse).mod(n7)).normalize();
        if (eCPointNormalize.isInfinity()) {
            return false;
        }
        return eCPointNormalize.getAffineXCoord().toBigInteger().mod(n7).equals(bigInteger);
    }
}
