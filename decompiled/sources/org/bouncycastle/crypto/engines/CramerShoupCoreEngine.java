package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.CramerShoupKeyParameters;
import org.bouncycastle.crypto.params.CramerShoupPrivateKeyParameters;
import org.bouncycastle.crypto.params.CramerShoupPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes3.dex */
public class CramerShoupCoreEngine {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BigInteger f88351e = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CramerShoupKeyParameters f88352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecureRandom f88353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f88355d = null;

    public static class CramerShoupCiphertextException extends Exception {
        public CramerShoupCiphertextException(String str) {
            super(str);
        }
    }

    public BigInteger convertInput(byte[] bArr, int i10, int i11) {
        if (i11 > getInputBlockSize() + 1) {
            throw new DataLengthException("input too large for Cramer Shoup cipher.");
        }
        if (i11 == getInputBlockSize() + 1 && this.f88354c) {
            throw new DataLengthException("input too large for Cramer Shoup cipher.");
        }
        if (i10 != 0 || i11 != bArr.length) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            bArr = bArr2;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(this.f88352a.getParameters().getP()) < 0) {
            return bigInteger;
        }
        throw new DataLengthException("input too large for Cramer Shoup cipher.");
    }

    public byte[] convertOutput(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (this.f88354c) {
            if (byteArray[0] == 0) {
                int length = byteArray.length - 1;
                byte[] bArr = new byte[length];
                System.arraycopy(byteArray, 1, bArr, 0, length);
                return bArr;
            }
        } else {
            if (byteArray[0] == 0 && byteArray.length > getOutputBlockSize()) {
                int length2 = byteArray.length - 1;
                byte[] bArr2 = new byte[length2];
                System.arraycopy(byteArray, 1, bArr2, 0, length2);
                return bArr2;
            }
            if (byteArray.length < getOutputBlockSize()) {
                int outputBlockSize = getOutputBlockSize();
                byte[] bArr3 = new byte[outputBlockSize];
                System.arraycopy(byteArray, 0, bArr3, outputBlockSize - byteArray.length, byteArray.length);
                return bArr3;
            }
        }
        return byteArray;
    }

    public BigInteger decryptBlock(CramerShoupCiphertext cramerShoupCiphertext) throws CramerShoupCiphertextException {
        if (this.f88352a.isPrivate() && !this.f88354c) {
            CramerShoupKeyParameters cramerShoupKeyParameters = this.f88352a;
            if (cramerShoupKeyParameters instanceof CramerShoupPrivateKeyParameters) {
                CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) cramerShoupKeyParameters;
                BigInteger p4 = cramerShoupPrivateKeyParameters.getParameters().getP();
                Digest h4 = cramerShoupPrivateKeyParameters.getParameters().getH();
                byte[] byteArray = cramerShoupCiphertext.getU1().toByteArray();
                h4.update(byteArray, 0, byteArray.length);
                byte[] byteArray2 = cramerShoupCiphertext.getU2().toByteArray();
                h4.update(byteArray2, 0, byteArray2.length);
                byte[] byteArray3 = cramerShoupCiphertext.getE().toByteArray();
                h4.update(byteArray3, 0, byteArray3.length);
                byte[] bArr = this.f88355d;
                if (bArr != null) {
                    h4.update(bArr, 0, bArr.length);
                }
                byte[] bArr2 = new byte[h4.getDigestSize()];
                h4.doFinal(bArr2, 0);
                BigInteger bigInteger = new BigInteger(1, bArr2);
                if (cramerShoupCiphertext.f88350d.equals(cramerShoupCiphertext.f88347a.modPow(cramerShoupPrivateKeyParameters.getX1().add(cramerShoupPrivateKeyParameters.getY1().multiply(bigInteger)), p4).multiply(cramerShoupCiphertext.f88348b.modPow(cramerShoupPrivateKeyParameters.getX2().add(cramerShoupPrivateKeyParameters.getY2().multiply(bigInteger)), p4)).mod(p4))) {
                    return cramerShoupCiphertext.f88349c.multiply(cramerShoupCiphertext.f88347a.modPow(cramerShoupPrivateKeyParameters.getZ(), p4).modInverse(p4)).mod(p4);
                }
                throw new CramerShoupCiphertextException("Sorry, that ciphertext is not correct");
            }
        }
        return null;
    }

    public CramerShoupCiphertext encryptBlock(BigInteger bigInteger) {
        if (this.f88352a.isPrivate() || !this.f88354c) {
            return null;
        }
        CramerShoupKeyParameters cramerShoupKeyParameters = this.f88352a;
        if (!(cramerShoupKeyParameters instanceof CramerShoupPublicKeyParameters)) {
            return null;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) cramerShoupKeyParameters;
        BigInteger p4 = cramerShoupPublicKeyParameters.getParameters().getP();
        BigInteger g6 = cramerShoupPublicKeyParameters.getParameters().getG1();
        BigInteger g7 = cramerShoupPublicKeyParameters.getParameters().getG2();
        BigInteger h4 = cramerShoupPublicKeyParameters.getH();
        if (bigInteger.compareTo(p4) >= 0) {
            return null;
        }
        SecureRandom secureRandom = this.f88353b;
        BigInteger bigInteger2 = f88351e;
        BigInteger bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(bigInteger2, p4.subtract(bigInteger2), secureRandom);
        BigInteger bigIntegerModPow = g6.modPow(bigIntegerCreateRandomInRange, p4);
        BigInteger bigIntegerModPow2 = g7.modPow(bigIntegerCreateRandomInRange, p4);
        BigInteger bigIntegerMod = h4.modPow(bigIntegerCreateRandomInRange, p4).multiply(bigInteger).mod(p4);
        Digest h7 = cramerShoupPublicKeyParameters.getParameters().getH();
        byte[] byteArray = bigIntegerModPow.toByteArray();
        h7.update(byteArray, 0, byteArray.length);
        byte[] byteArray2 = bigIntegerModPow2.toByteArray();
        h7.update(byteArray2, 0, byteArray2.length);
        byte[] byteArray3 = bigIntegerMod.toByteArray();
        h7.update(byteArray3, 0, byteArray3.length);
        byte[] bArr = this.f88355d;
        if (bArr != null) {
            h7.update(bArr, 0, bArr.length);
        }
        byte[] bArr2 = new byte[h7.getDigestSize()];
        h7.doFinal(bArr2, 0);
        return new CramerShoupCiphertext(bigIntegerModPow, bigIntegerModPow2, bigIntegerMod, cramerShoupPublicKeyParameters.getC().modPow(bigIntegerCreateRandomInRange, p4).multiply(cramerShoupPublicKeyParameters.getD().modPow(bigIntegerCreateRandomInRange.multiply(new BigInteger(1, bArr2)), p4)).mod(p4));
    }

    public int getInputBlockSize() {
        int iBitLength = (this.f88352a.getParameters().getP().bitLength() + 7) / 8;
        return this.f88354c ? iBitLength - 1 : iBitLength;
    }

    public int getOutputBlockSize() {
        int iBitLength = (this.f88352a.getParameters().getP().bitLength() + 7) / 8;
        return this.f88354c ? iBitLength : iBitLength - 1;
    }

    public void init(boolean z10, CipherParameters cipherParameters) {
        SecureRandom random;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.f88352a = (CramerShoupKeyParameters) parametersWithRandom.getParameters();
            random = parametersWithRandom.getRandom();
        } else {
            this.f88352a = (CramerShoupKeyParameters) cipherParameters;
            random = null;
        }
        this.f88353b = initSecureRandom(z10, random);
        this.f88354c = z10;
    }

    public SecureRandom initSecureRandom(boolean z10, SecureRandom secureRandom) {
        if (z10) {
            return secureRandom != null ? secureRandom : CryptoServicesRegistrar.getSecureRandom();
        }
        return null;
    }

    public void init(boolean z10, CipherParameters cipherParameters, String str) {
        init(z10, cipherParameters);
        this.f88355d = Strings.toUTF8ByteArray(str);
    }
}
