package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.params.DSAKeyParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes5.dex */
public class DSASigner implements DSAExt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DSAKCalculator f89499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DSAKeyParameters f89500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecureRandom f89501c;

    public DSASigner() {
        this.f89499a = new RandomDSAKCalculator();
    }

    public static BigInteger a(BigInteger bigInteger, byte[] bArr) {
        if (bigInteger.bitLength() >= bArr.length * 8) {
            return new BigInteger(1, bArr);
        }
        int iBitLength = bigInteger.bitLength() / 8;
        byte[] bArr2 = new byte[iBitLength];
        System.arraycopy(bArr, 0, bArr2, 0, iBitLength);
        return new BigInteger(1, bArr2);
    }

    @Override // org.bouncycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        DSAParameters parameters = this.f89500b.getParameters();
        BigInteger q10 = parameters.getQ();
        BigInteger bigIntegerA = a(q10, bArr);
        BigInteger x4 = ((DSAPrivateKeyParameters) this.f89500b).getX();
        DSAKCalculator dSAKCalculator = this.f89499a;
        if (dSAKCalculator.isDeterministic()) {
            dSAKCalculator.init(q10, x4, bArr);
        } else {
            dSAKCalculator.init(q10, this.f89501c);
        }
        BigInteger bigIntegerNextK = dSAKCalculator.nextK();
        BigInteger g6 = parameters.getG();
        SecureRandom secureRandom = this.f89501c;
        if (secureRandom == null) {
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        BigInteger bigIntegerMod = g6.modPow(bigIntegerNextK.add(BigIntegers.createRandomBigInteger(7, secureRandom).add(BigInteger.valueOf(128L)).multiply(q10)), parameters.getP()).mod(q10);
        return new BigInteger[]{bigIntegerMod, bigIntegerNextK.modInverse(q10).multiply(bigIntegerA.add(x4.multiply(bigIntegerMod))).mod(q10)};
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public BigInteger getOrder() {
        return this.f89500b.getParameters().getQ();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    @Override // org.bouncycastle.crypto.DSA
    public void init(boolean z10, CipherParameters cipherParameters) {
        DSAKeyParameters dSAKeyParameters;
        SecureRandom random;
        boolean z11;
        if (z10) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.f89500b = (DSAPrivateKeyParameters) parametersWithRandom.getParameters();
                random = parametersWithRandom.getRandom();
            } else {
                dSAKeyParameters = (DSAPrivateKeyParameters) cipherParameters;
            }
            if (z10 || this.f89499a.isDeterministic()) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f89501c = initSecureRandom(z11, random);
        }
        dSAKeyParameters = (DSAPublicKeyParameters) cipherParameters;
        this.f89500b = dSAKeyParameters;
        random = null;
        if (z10) {
            z11 = false;
        } else {
            z11 = false;
        }
        this.f89501c = initSecureRandom(z11, random);
    }

    public SecureRandom initSecureRandom(boolean z10, SecureRandom secureRandom) {
        if (z10) {
            return secureRandom != null ? secureRandom : CryptoServicesRegistrar.getSecureRandom();
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        DSAParameters parameters = this.f89500b.getParameters();
        BigInteger q10 = parameters.getQ();
        BigInteger bigIntegerA = a(q10, bArr);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        if (bigIntegerValueOf.compareTo(bigInteger) >= 0 || q10.compareTo(bigInteger) <= 0 || bigIntegerValueOf.compareTo(bigInteger2) >= 0 || q10.compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger bigIntegerModInverse = bigInteger2.modInverse(q10);
        BigInteger bigIntegerMod = bigIntegerA.multiply(bigIntegerModInverse).mod(q10);
        BigInteger bigIntegerMod2 = bigInteger.multiply(bigIntegerModInverse).mod(q10);
        BigInteger p4 = parameters.getP();
        return parameters.getG().modPow(bigIntegerMod, p4).multiply(((DSAPublicKeyParameters) this.f89500b).getY().modPow(bigIntegerMod2, p4)).mod(p4).mod(q10).equals(bigInteger);
    }

    public DSASigner(DSAKCalculator dSAKCalculator) {
        this.f89499a = dSAKCalculator;
    }
}
