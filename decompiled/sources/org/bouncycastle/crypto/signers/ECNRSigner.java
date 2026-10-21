package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes5.dex */
public class ECNRSigner implements DSAExt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f89512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ECKeyParameters f89513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecureRandom f89514c;

    public static BigInteger a(ECPublicKeyParameters eCPublicKeyParameters, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger n7 = eCPublicKeyParameters.getParameters().getN();
        if (bigInteger.compareTo(ECConstants.ONE) < 0 || bigInteger.compareTo(n7) >= 0 || bigInteger2.compareTo(ECConstants.ZERO) < 0 || bigInteger2.compareTo(n7) >= 0) {
            return null;
        }
        ECPoint eCPointNormalize = ECAlgorithms.sumOfTwoMultiplies(eCPublicKeyParameters.getParameters().getG(), bigInteger2, eCPublicKeyParameters.getQ(), bigInteger).normalize();
        if (eCPointNormalize.isInfinity()) {
            return null;
        }
        return bigInteger.subtract(eCPointNormalize.getAffineXCoord().toBigInteger()).mod(n7);
    }

    @Override // org.bouncycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair;
        BigInteger bigIntegerMod;
        if (!this.f89512a) {
            throw new IllegalStateException("not initialised for signing");
        }
        BigInteger order = getOrder();
        BigInteger bigInteger = new BigInteger(1, bArr);
        ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters) this.f89513b;
        if (bigInteger.compareTo(order) >= 0) {
            throw new DataLengthException("input too large for ECNR key");
        }
        do {
            ECKeyPairGenerator eCKeyPairGenerator = new ECKeyPairGenerator();
            eCKeyPairGenerator.init(new ECKeyGenerationParameters(eCPrivateKeyParameters.getParameters(), this.f89514c));
            asymmetricCipherKeyPairGenerateKeyPair = eCKeyPairGenerator.generateKeyPair();
            bigIntegerMod = ((ECPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()).getQ().getAffineXCoord().toBigInteger().add(bigInteger).mod(order);
        } while (bigIntegerMod.equals(ECConstants.ZERO));
        return new BigInteger[]{bigIntegerMod, ((ECPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()).getD().subtract(bigIntegerMod.multiply(eCPrivateKeyParameters.getD())).mod(order)};
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public BigInteger getOrder() {
        return this.f89513b.getParameters().getN();
    }

    public byte[] getRecoveredMessage(BigInteger bigInteger, BigInteger bigInteger2) {
        if (this.f89512a) {
            throw new IllegalStateException("not initialised for verifying/recovery");
        }
        BigInteger bigIntegerA = a((ECPublicKeyParameters) this.f89513b, bigInteger, bigInteger2);
        if (bigIntegerA != null) {
            return BigIntegers.asUnsignedByteArray(bigIntegerA);
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.DSA
    public void init(boolean z10, CipherParameters cipherParameters) {
        ECKeyParameters eCKeyParameters;
        this.f89512a = z10;
        if (!z10) {
            eCKeyParameters = (ECPublicKeyParameters) cipherParameters;
        } else {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.f89514c = parametersWithRandom.getRandom();
                this.f89513b = (ECPrivateKeyParameters) parametersWithRandom.getParameters();
                return;
            }
            this.f89514c = CryptoServicesRegistrar.getSecureRandom();
            eCKeyParameters = (ECPrivateKeyParameters) cipherParameters;
        }
        this.f89513b = eCKeyParameters;
    }

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (this.f89512a) {
            throw new IllegalStateException("not initialised for verifying");
        }
        ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) this.f89513b;
        BigInteger n7 = eCPublicKeyParameters.getParameters().getN();
        int iBitLength = n7.bitLength();
        BigInteger bigInteger3 = new BigInteger(1, bArr);
        if (bigInteger3.bitLength() > iBitLength) {
            throw new DataLengthException("input too large for ECNR key.");
        }
        BigInteger bigIntegerA = a(eCPublicKeyParameters, bigInteger, bigInteger2);
        return bigIntegerA != null && bigIntegerA.equals(bigInteger3.mod(n7));
    }
}
