package org.bouncycastle.crypto.kems;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.KeyEncapsulation;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes4.dex */
public class RSAKeyEncapsulation implements KeyEncapsulation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BigInteger f88815d = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BigInteger f88816e = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DerivationFunction f88817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecureRandom f88818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RSAKeyParameters f88819c;

    public RSAKeyEncapsulation(DerivationFunction derivationFunction, SecureRandom secureRandom) {
        this.f88817a = derivationFunction;
        this.f88818b = secureRandom;
    }

    public CipherParameters decrypt(byte[] bArr, int i10) {
        return decrypt(bArr, 0, bArr.length, i10);
    }

    public CipherParameters encrypt(byte[] bArr, int i10) {
        return encrypt(bArr, 0, i10);
    }

    public KeyParameter generateKey(BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        KDFParameters kDFParameters = new KDFParameters(BigIntegers.asUnsignedByteArray((bigInteger.bitLength() + 7) / 8, bigInteger2), null);
        DerivationFunction derivationFunction = this.f88817a;
        derivationFunction.init(kDFParameters);
        byte[] bArr = new byte[i10];
        derivationFunction.generateBytes(bArr, 0, i10);
        return new KeyParameter(bArr);
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof RSAKeyParameters)) {
            throw new IllegalArgumentException("RSA key required");
        }
        this.f88819c = (RSAKeyParameters) cipherParameters;
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public CipherParameters decrypt(byte[] bArr, int i10, int i11, int i12) throws IllegalArgumentException {
        if (!this.f88819c.isPrivate()) {
            throw new IllegalArgumentException("Private key required for decryption");
        }
        BigInteger modulus = this.f88819c.getModulus();
        BigInteger exponent = this.f88819c.getExponent();
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return generateKey(modulus, new BigInteger(1, bArr2).modPow(exponent, modulus), i12);
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public CipherParameters encrypt(byte[] bArr, int i10, int i11) throws IllegalArgumentException {
        if (this.f88819c.isPrivate()) {
            throw new IllegalArgumentException("Public key required for encryption");
        }
        BigInteger modulus = this.f88819c.getModulus();
        BigInteger exponent = this.f88819c.getExponent();
        BigInteger bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(f88815d, modulus.subtract(f88816e), this.f88818b);
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray((modulus.bitLength() + 7) / 8, bigIntegerCreateRandomInRange.modPow(exponent, modulus));
        System.arraycopy(bArrAsUnsignedByteArray, 0, bArr, i10, bArrAsUnsignedByteArray.length);
        return generateKey(modulus, bigIntegerCreateRandomInRange, i11);
    }
}
