package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.ElGamalKeyParameters;
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes3.dex */
public class ElGamalEngine implements AsymmetricBlockCipher {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BigInteger f88402e = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final BigInteger f88403f = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f88404g = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ElGamalKeyParameters f88405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecureRandom f88406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88408d;

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.f88407c ? (this.f88408d - 1) / 8 : ((this.f88408d + 7) / 8) * 2;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        return this.f88407c ? ((this.f88408d + 7) / 8) * 2 : (this.f88408d - 1) / 8;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.f88405a = (ElGamalKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            this.f88405a = (ElGamalKeyParameters) cipherParameters;
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        this.f88406b = secureRandom;
        this.f88407c = z10;
        this.f88408d = this.f88405a.getParameters().getP().bitLength();
        if (z10) {
            if (!(this.f88405a instanceof ElGamalPublicKeyParameters)) {
                throw new IllegalArgumentException("ElGamalPublicKeyParameters are required for encryption.");
            }
        } else if (!(this.f88405a instanceof ElGamalPrivateKeyParameters)) {
            throw new IllegalArgumentException("ElGamalPrivateKeyParameters are required for decryption.");
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i10, int i11) {
        BigInteger bigIntegerCreateRandomBigInteger;
        if (this.f88405a == null) {
            throw new IllegalStateException("ElGamal engine not initialised");
        }
        if (i11 > (this.f88407c ? (this.f88408d + 6) / 8 : getInputBlockSize())) {
            throw new DataLengthException("input too large for ElGamal cipher.\n");
        }
        BigInteger p4 = this.f88405a.getParameters().getP();
        if (this.f88405a instanceof ElGamalPrivateKeyParameters) {
            int i12 = i11 / 2;
            byte[] bArr2 = new byte[i12];
            byte[] bArr3 = new byte[i12];
            System.arraycopy(bArr, i10, bArr2, 0, i12);
            System.arraycopy(bArr, i10 + i12, bArr3, 0, i12);
            return BigIntegers.asUnsignedByteArray(new BigInteger(1, bArr2).modPow(p4.subtract(f88403f).subtract(((ElGamalPrivateKeyParameters) this.f88405a).getX()), p4).multiply(new BigInteger(1, bArr3)).mod(p4));
        }
        if (i10 != 0 || i11 != bArr.length) {
            byte[] bArr4 = new byte[i11];
            System.arraycopy(bArr, i10, bArr4, 0, i11);
            bArr = bArr4;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(p4) >= 0) {
            throw new DataLengthException("input too large for ElGamal cipher.\n");
        }
        ElGamalPublicKeyParameters elGamalPublicKeyParameters = (ElGamalPublicKeyParameters) this.f88405a;
        int iBitLength = p4.bitLength();
        while (true) {
            bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(iBitLength, this.f88406b);
            if (!bigIntegerCreateRandomBigInteger.equals(f88402e) && bigIntegerCreateRandomBigInteger.compareTo(p4.subtract(f88404g)) <= 0) {
                break;
            }
        }
        BigInteger bigIntegerModPow = this.f88405a.getParameters().getG().modPow(bigIntegerCreateRandomBigInteger, p4);
        BigInteger bigIntegerMod = bigInteger.multiply(elGamalPublicKeyParameters.getY().modPow(bigIntegerCreateRandomBigInteger, p4)).mod(p4);
        byte[] byteArray = bigIntegerModPow.toByteArray();
        byte[] byteArray2 = bigIntegerMod.toByteArray();
        int outputBlockSize = getOutputBlockSize();
        byte[] bArr5 = new byte[outputBlockSize];
        int i13 = outputBlockSize / 2;
        if (byteArray.length > i13) {
            System.arraycopy(byteArray, 1, bArr5, i13 - (byteArray.length - 1), byteArray.length - 1);
        } else {
            System.arraycopy(byteArray, 0, bArr5, i13 - byteArray.length, byteArray.length);
        }
        if (byteArray2.length > i13) {
            System.arraycopy(byteArray2, 1, bArr5, outputBlockSize - (byteArray2.length - 1), byteArray2.length - 1);
        } else {
            System.arraycopy(byteArray2, 0, bArr5, outputBlockSize - byteArray2.length, byteArray2.length);
        }
        return bArr5;
    }
}
