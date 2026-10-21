package org.bouncycastle.crypto.encodings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class OAEPEncoding implements AsymmetricBlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f88251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Digest f88252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AsymmetricBlockCipher f88253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SecureRandom f88254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f88255e;

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this(asymmetricBlockCipher, DigestFactory.createSHA1(), null);
    }

    public static void a(int i10, byte[] bArr) {
        bArr[0] = (byte) (i10 >>> 24);
        bArr[1] = (byte) (i10 >>> 16);
        bArr[2] = (byte) (i10 >>> 8);
        bArr[3] = (byte) i10;
    }

    public final byte[] b(int i10, int i11, byte[] bArr, int i12) {
        byte[] bArr2 = new byte[i12];
        Digest digest = this.f88252b;
        int digestSize = digest.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        byte[] bArr4 = new byte[4];
        digest.reset();
        int i13 = 0;
        while (i13 < i12 / digestSize) {
            a(i13, bArr4);
            digest.update(bArr, i10, i11);
            digest.update(bArr4, 0, 4);
            digest.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i13 * digestSize, digestSize);
            i13++;
        }
        int i14 = digestSize * i13;
        if (i14 < i12) {
            a(i13, bArr4);
            digest.update(bArr, i10, i11);
            digest.update(bArr4, 0, 4);
            digest.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i14, i12 - i14);
        }
        return bArr2;
    }

    public byte[] decodeBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        AsymmetricBlockCipher asymmetricBlockCipher = this.f88253c;
        byte[] bArrProcessBlock = asymmetricBlockCipher.processBlock(bArr, i10, i11);
        int outputBlockSize = asymmetricBlockCipher.getOutputBlockSize();
        byte[] bArr2 = new byte[outputBlockSize];
        byte[] bArr3 = this.f88251a;
        boolean z10 = outputBlockSize < (bArr3.length * 2) + 1;
        if (bArrProcessBlock.length <= outputBlockSize) {
            System.arraycopy(bArrProcessBlock, 0, bArr2, outputBlockSize - bArrProcessBlock.length, bArrProcessBlock.length);
        } else {
            System.arraycopy(bArrProcessBlock, 0, bArr2, 0, outputBlockSize);
            z10 = true;
        }
        byte[] bArrB = b(bArr3.length, outputBlockSize - bArr3.length, bArr2, bArr3.length);
        for (int i12 = 0; i12 != bArr3.length; i12++) {
            bArr2[i12] = (byte) (bArr2[i12] ^ bArrB[i12]);
        }
        byte[] bArrB2 = b(0, bArr3.length, bArr2, outputBlockSize - bArr3.length);
        for (int length = bArr3.length; length != outputBlockSize; length++) {
            bArr2[length] = (byte) (bArr2[length] ^ bArrB2[length - bArr3.length]);
        }
        boolean z11 = false;
        for (int i13 = 0; i13 != bArr3.length; i13++) {
            if (bArr3[i13] != bArr2[bArr3.length + i13]) {
                z11 = true;
            }
        }
        int i14 = outputBlockSize;
        for (int length2 = bArr3.length * 2; length2 != outputBlockSize; length2++) {
            if ((bArr2[length2] != 0) & (i14 == outputBlockSize)) {
                i14 = length2;
            }
        }
        boolean z12 = i14 > outputBlockSize + (-1);
        boolean z13 = bArr2[i14] != 1;
        int i15 = i14 + 1;
        if ((z12 | z13) || (z10 | z11)) {
            Arrays.fill(bArr2, (byte) 0);
            throw new InvalidCipherTextException("data wrong");
        }
        int i16 = outputBlockSize - i15;
        byte[] bArr4 = new byte[i16];
        System.arraycopy(bArr2, i15, bArr4, 0, i16);
        return bArr4;
    }

    public byte[] encodeBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        if (i11 > getInputBlockSize()) {
            throw new DataLengthException("input data too long");
        }
        int inputBlockSize = getInputBlockSize() + 1;
        byte[] bArr2 = this.f88251a;
        int length = (bArr2.length * 2) + inputBlockSize;
        byte[] bArr3 = new byte[length];
        int i12 = length - i11;
        System.arraycopy(bArr, i10, bArr3, i12, i11);
        bArr3[i12 - 1] = 1;
        System.arraycopy(bArr2, 0, bArr3, bArr2.length, bArr2.length);
        int length2 = bArr2.length;
        byte[] bArr4 = new byte[length2];
        this.f88254d.nextBytes(bArr4);
        byte[] bArrB = b(0, length2, bArr4, length - bArr2.length);
        for (int length3 = bArr2.length; length3 != length; length3++) {
            bArr3[length3] = (byte) (bArr3[length3] ^ bArrB[length3 - bArr2.length]);
        }
        System.arraycopy(bArr4, 0, bArr3, 0, bArr2.length);
        byte[] bArrB2 = b(bArr2.length, length - bArr2.length, bArr3, bArr2.length);
        for (int i13 = 0; i13 != bArr2.length; i13++) {
            bArr3[i13] = (byte) (bArr3[i13] ^ bArrB2[i13]);
        }
        return this.f88253c.processBlock(bArr3, 0, length);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.f88253c.getInputBlockSize();
        return this.f88255e ? (inputBlockSize - 1) - (this.f88251a.length * 2) : inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.f88253c.getOutputBlockSize();
        return this.f88255e ? outputBlockSize : (outputBlockSize - 1) - (this.f88251a.length * 2);
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.f88253c;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.f88254d = cipherParameters instanceof ParametersWithRandom ? ((ParametersWithRandom) cipherParameters).getRandom() : CryptoServicesRegistrar.getSecureRandom();
        this.f88253c.init(z10, cipherParameters);
        this.f88255e = z10;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        return this.f88255e ? encodeBlock(bArr, i10, i11) : decodeBlock(bArr, i10, i11);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this(asymmetricBlockCipher, digest, null);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr) {
        this.f88253c = asymmetricBlockCipher;
        this.f88252b = digest2;
        byte[] bArr2 = new byte[digest.getDigestSize()];
        this.f88251a = bArr2;
        digest.reset();
        if (bArr != null) {
            digest.update(bArr, 0, bArr.length);
        }
        digest.doFinal(bArr2, 0);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest, bArr);
    }
}
