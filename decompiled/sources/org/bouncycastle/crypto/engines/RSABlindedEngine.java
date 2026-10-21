package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes3.dex */
public class RSABlindedEngine implements AsymmetricBlockCipher {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BigInteger f88548d = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f88549a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RSAKeyParameters f88550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecureRandom f88551c;

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.f88549a.c();
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        return this.f88549a.d();
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        this.f88549a.e(z10, cipherParameters);
        if (!(cipherParameters instanceof ParametersWithRandom)) {
            RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) cipherParameters;
            this.f88550b = rSAKeyParameters;
            if (rSAKeyParameters instanceof RSAPrivateCrtKeyParameters) {
                secureRandom = CryptoServicesRegistrar.getSecureRandom();
                this.f88551c = secureRandom;
                return;
            }
            this.f88551c = null;
        }
        ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
        RSAKeyParameters rSAKeyParameters2 = (RSAKeyParameters) parametersWithRandom.getParameters();
        this.f88550b = rSAKeyParameters2;
        if (rSAKeyParameters2 instanceof RSAPrivateCrtKeyParameters) {
            secureRandom = parametersWithRandom.getRandom();
            this.f88551c = secureRandom;
            return;
        }
        this.f88551c = null;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i10, int i11) {
        BigInteger bigIntegerF;
        RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters;
        BigInteger publicExponent;
        if (this.f88550b == null) {
            throw new IllegalStateException("RSA engine not initialised");
        }
        a aVar = this.f88549a;
        BigInteger bigIntegerA = aVar.a(bArr, i10, i11);
        RSAKeyParameters rSAKeyParameters = this.f88550b;
        if (!(rSAKeyParameters instanceof RSAPrivateCrtKeyParameters) || (publicExponent = (rSAPrivateCrtKeyParameters = (RSAPrivateCrtKeyParameters) rSAKeyParameters).getPublicExponent()) == null) {
            bigIntegerF = aVar.f(bigIntegerA);
        } else {
            BigInteger modulus = rSAPrivateCrtKeyParameters.getModulus();
            BigInteger bigInteger = f88548d;
            BigInteger bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(bigInteger, modulus.subtract(bigInteger), this.f88551c);
            bigIntegerF = aVar.f(bigIntegerCreateRandomInRange.modPow(publicExponent, modulus).multiply(bigIntegerA).mod(modulus)).multiply(bigIntegerCreateRandomInRange.modInverse(modulus)).mod(modulus);
            if (!bigIntegerA.equals(bigIntegerF.modPow(publicExponent, modulus))) {
                throw new IllegalStateException("RSA engine faulty decryption/signing detected");
            }
        }
        return aVar.b(bigIntegerF);
    }
}
