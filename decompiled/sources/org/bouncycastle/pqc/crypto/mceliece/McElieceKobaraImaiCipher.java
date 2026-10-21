package org.bouncycastle.pqc.crypto.mceliece;

import af.c;
import af.d;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.prng.DigestRandomGenerator;
import org.bouncycastle.pqc.crypto.MessageEncryptor;
import org.bouncycastle.pqc.math.linearalgebra.BigIntUtils;
import org.bouncycastle.pqc.math.linearalgebra.ByteUtils;
import org.bouncycastle.pqc.math.linearalgebra.GF2Vector;
import org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions;
import vm.a;

/* JADX INFO: loaded from: classes13.dex */
public class McElieceKobaraImaiCipher implements MessageEncryptor {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2.3";
    public static final byte[] PUBLIC_CONSTANT = "a predetermined public constant".getBytes();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Digest f91164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecureRandom f91165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public McElieceCCA2KeyParameters f91166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f91167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f91168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f91169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f91170g;

    public int getKeySize(McElieceCCA2KeyParameters mcElieceCCA2KeyParameters) {
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PublicKeyParameters) {
            return ((McElieceCCA2PublicKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PrivateKeyParameters) {
            return ((McElieceCCA2PrivateKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        throw new IllegalArgumentException("unsupported type");
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public void init(boolean z10, CipherParameters cipherParameters) {
        int t10;
        this.f91170g = z10;
        if (!z10) {
            McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters = (McElieceCCA2PrivateKeyParameters) cipherParameters;
            this.f91166c = mcElieceCCA2PrivateKeyParameters;
            this.f91164a = d.a(mcElieceCCA2PrivateKeyParameters.getDigest());
            this.f91167d = mcElieceCCA2PrivateKeyParameters.getN();
            this.f91168e = mcElieceCCA2PrivateKeyParameters.getK();
            this.f91169f = mcElieceCCA2PrivateKeyParameters.getT();
            return;
        }
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.f91165b = parametersWithRandom.getRandom();
            McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = (McElieceCCA2PublicKeyParameters) parametersWithRandom.getParameters();
            this.f91166c = mcElieceCCA2PublicKeyParameters;
            this.f91164a = d.a(mcElieceCCA2PublicKeyParameters.getDigest());
            this.f91167d = mcElieceCCA2PublicKeyParameters.getN();
            this.f91168e = mcElieceCCA2PublicKeyParameters.getK();
            t10 = mcElieceCCA2PublicKeyParameters.getT();
        } else {
            this.f91165b = CryptoServicesRegistrar.getSecureRandom();
            McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters2 = (McElieceCCA2PublicKeyParameters) cipherParameters;
            this.f91166c = mcElieceCCA2PublicKeyParameters2;
            this.f91164a = d.a(mcElieceCCA2PublicKeyParameters2.getDigest());
            this.f91167d = mcElieceCCA2PublicKeyParameters2.getN();
            this.f91168e = mcElieceCCA2PublicKeyParameters2.getK();
            t10 = mcElieceCCA2PublicKeyParameters2.getT();
        }
        this.f91169f = t10;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageDecrypt(byte[] bArr) throws InvalidCipherTextException {
        byte[] bArr2;
        if (this.f91170g) {
            throw new IllegalStateException("cipher initialised for decryption");
        }
        int i10 = this.f91167d >> 3;
        if (bArr.length < i10) {
            throw new InvalidCipherTextException("Bad Padding: Ciphertext too short.");
        }
        int digestSize = this.f91164a.getDigestSize();
        int i11 = this.f91168e >> 3;
        int length = bArr.length - i10;
        if (length > 0) {
            byte[][] bArrSplit = ByteUtils.split(bArr, length);
            bArr2 = bArrSplit[0];
            bArr = bArrSplit[1];
        } else {
            bArr2 = new byte[0];
        }
        GF2Vector[] gF2VectorArrA = c.a((McElieceCCA2PrivateKeyParameters) this.f91166c, GF2Vector.OS2VP(this.f91167d, bArr));
        byte[] encoded = gF2VectorArrA[0].getEncoded();
        GF2Vector gF2Vector = gF2VectorArrA[1];
        if (encoded.length > i11) {
            encoded = ByteUtils.subArray(encoded, 0, i11);
        }
        int i12 = this.f91167d;
        int i13 = this.f91169f;
        BigInteger bigInteger = a.f94105a;
        if (gF2Vector.getLength() != i12 || gF2Vector.getHammingWeight() != i13) {
            throw new IllegalArgumentException("vector has wrong length or hamming weight");
        }
        int[] vecArray = gF2Vector.getVecArray();
        BigInteger bigIntegerBinomial = IntegerFunctions.binomial(i12, i13);
        BigInteger bigIntegerAdd = a.f94105a;
        int i14 = i12;
        for (int i15 = 0; i15 < i12; i15++) {
            bigIntegerBinomial = bigIntegerBinomial.multiply(BigInteger.valueOf(i14 - i13)).divide(BigInteger.valueOf(i14));
            i14--;
            if ((vecArray[i15 >> 5] & (1 << (i15 & 31))) != 0) {
                bigIntegerAdd = bigIntegerAdd.add(bigIntegerBinomial);
                int i16 = i13 - 1;
                bigIntegerBinomial = i14 == i16 ? a.f94106b : bigIntegerBinomial.multiply(BigInteger.valueOf(i13)).divide(BigInteger.valueOf(i14 - i16));
                i13 = i16;
            }
        }
        byte[] bArrConcatenate = ByteUtils.concatenate(ByteUtils.concatenate(bArr2, BigIntUtils.toMinimalByteArray(bigIntegerAdd)), encoded);
        int length2 = bArrConcatenate.length - digestSize;
        byte[][] bArrSplit2 = ByteUtils.split(bArrConcatenate, digestSize);
        byte[] bArr3 = bArrSplit2[0];
        byte[] bArr4 = bArrSplit2[1];
        byte[] bArr5 = new byte[this.f91164a.getDigestSize()];
        this.f91164a.update(bArr4, 0, bArr4.length);
        this.f91164a.doFinal(bArr5, 0);
        for (int i17 = digestSize - 1; i17 >= 0; i17--) {
            bArr5[i17] = (byte) (bArr5[i17] ^ bArr3[i17]);
        }
        DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
        digestRandomGenerator.addSeedMaterial(bArr5);
        byte[] bArr6 = new byte[length2];
        digestRandomGenerator.nextBytes(bArr6);
        for (int i18 = length2 - 1; i18 >= 0; i18--) {
            bArr6[i18] = (byte) (bArr6[i18] ^ bArr4[i18]);
        }
        byte[] bArr7 = PUBLIC_CONSTANT;
        byte[][] bArrSplit3 = ByteUtils.split(bArr6, length2 - bArr7.length);
        byte[] bArr8 = bArrSplit3[0];
        if (ByteUtils.equals(bArrSplit3[1], bArr7)) {
            return bArr8;
        }
        throw new InvalidCipherTextException("Bad Padding: invalid ciphertext");
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageEncrypt(byte[] bArr) {
        if (!this.f91170g) {
            throw new IllegalStateException("cipher initialised for decryption");
        }
        int digestSize = this.f91164a.getDigestSize();
        int i10 = this.f91168e >> 3;
        int iBitLength = (IntegerFunctions.binomial(this.f91167d, this.f91169f).bitLength() - 1) >> 3;
        byte[] bArr2 = PUBLIC_CONSTANT;
        int length = ((i10 + iBitLength) - digestSize) - bArr2.length;
        if (bArr.length > length) {
            length = bArr.length;
        }
        int length2 = bArr2.length + length;
        int i11 = ((length2 + digestSize) - i10) - iBitLength;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, length, bArr2.length);
        byte[] bArr4 = new byte[digestSize];
        this.f91165b.nextBytes(bArr4);
        DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
        digestRandomGenerator.addSeedMaterial(bArr4);
        byte[] bArr5 = new byte[length2];
        digestRandomGenerator.nextBytes(bArr5);
        for (int i12 = length2 - 1; i12 >= 0; i12--) {
            bArr5[i12] = (byte) (bArr5[i12] ^ bArr3[i12]);
        }
        byte[] bArr6 = new byte[this.f91164a.getDigestSize()];
        this.f91164a.update(bArr5, 0, length2);
        this.f91164a.doFinal(bArr6, 0);
        for (int i13 = digestSize - 1; i13 >= 0; i13--) {
            bArr6[i13] = (byte) (bArr6[i13] ^ bArr4[i13]);
        }
        byte[] bArrConcatenate = ByteUtils.concatenate(bArr6, bArr5);
        byte[] bArr7 = new byte[0];
        if (i11 > 0) {
            bArr7 = new byte[i11];
            System.arraycopy(bArrConcatenate, 0, bArr7, 0, i11);
        }
        byte[] bArr8 = new byte[iBitLength];
        System.arraycopy(bArrConcatenate, i11, bArr8, 0, iBitLength);
        byte[] bArr9 = new byte[i10];
        System.arraycopy(bArrConcatenate, iBitLength + i11, bArr9, 0, i10);
        byte[] encoded = ((GF2Vector) ((McElieceCCA2PublicKeyParameters) this.f91166c).getG().leftMultiplyLeftCompactForm(GF2Vector.OS2VP(this.f91168e, bArr9)).add(a.a(this.f91167d, this.f91169f, bArr8))).getEncoded();
        return i11 > 0 ? ByteUtils.concatenate(bArr7, encoded) : encoded;
    }
}
