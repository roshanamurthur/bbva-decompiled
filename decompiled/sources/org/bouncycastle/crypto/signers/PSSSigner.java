package org.bouncycastle.crypto.signers;

import androidx.camera.camera2.internal.compat.u;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSABlindingParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class PSSSigner implements Signer {
    public static final byte TRAILER_IMPLICIT = -68;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f89577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Digest f89578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AsymmetricBlockCipher f89579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SecureRandom f89580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f89581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f89582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f89583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f89584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f89585i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f89586j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f89587k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f89588l;
    public final byte m;

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i10) {
        this(asymmetricBlockCipher, digest, i10, (byte) -68);
    }

    public static void a(int i10, byte[] bArr) {
        bArr[0] = (byte) (i10 >>> 24);
        bArr[1] = (byte) (i10 >>> 16);
        bArr[2] = (byte) (i10 >>> 8);
        bArr[3] = (byte) i10;
    }

    public static void b(byte[] bArr) {
        for (int i10 = 0; i10 != bArr.length; i10++) {
            bArr[i10] = 0;
        }
    }

    public final byte[] c(int i10, int i11, byte[] bArr, int i12) {
        byte[] bArr2 = new byte[i12];
        int i13 = this.f89582f;
        byte[] bArr3 = new byte[i13];
        byte[] bArr4 = new byte[4];
        Digest digest = this.f89578b;
        digest.reset();
        int i14 = 0;
        while (i14 < i12 / i13) {
            a(i14, bArr4);
            digest.update(bArr, i10, i11);
            digest.update(bArr4, 0, 4);
            digest.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i14 * i13, i13);
            i14++;
        }
        int i15 = i13 * i14;
        if (i15 < i12) {
            a(i14, bArr4);
            digest.update(bArr, i10, i11);
            digest.update(bArr4, 0, 4);
            digest.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i15, i12 - i15);
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws DataLengthException, CryptoException {
        byte[] bArr = this.f89587k;
        int length = bArr.length;
        int i10 = this.f89581e;
        int i11 = this.f89584h;
        Digest digest = this.f89577a;
        digest.doFinal(bArr, (length - i10) - i11);
        byte[] bArr2 = this.f89586j;
        if (i11 != 0) {
            if (!this.f89583g) {
                this.f89580d.nextBytes(bArr2);
            }
            System.arraycopy(bArr2, 0, bArr, bArr.length - i11, i11);
        }
        byte[] bArr3 = new byte[i10];
        digest.update(bArr, 0, bArr.length);
        digest.doFinal(bArr3, 0);
        byte[] bArr4 = this.f89588l;
        bArr4[(((bArr4.length - i11) - 1) - i10) - 1] = 1;
        System.arraycopy(bArr2, 0, bArr4, ((bArr4.length - i11) - i10) - 1, i11);
        byte[] bArrC = c(0, i10, bArr3, (this.f89588l.length - i10) - 1);
        for (int i12 = 0; i12 != bArrC.length; i12++) {
            byte[] bArr5 = this.f89588l;
            bArr5[i12] = (byte) (bArr5[i12] ^ bArrC[i12]);
        }
        byte[] bArr6 = this.f89588l;
        System.arraycopy(bArr3, 0, bArr6, (bArr6.length - i10) - 1, i10);
        byte[] bArr7 = this.f89588l;
        bArr7[0] = (byte) ((255 >>> ((bArr7.length * 8) - this.f89585i)) & bArr7[0]);
        bArr7[bArr7.length - 1] = this.m;
        byte[] bArrProcessBlock = this.f89579c.processBlock(bArr7, 0, bArr7.length);
        b(this.f89588l);
        return bArrProcessBlock;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z10, CipherParameters cipherParameters) {
        CipherParameters parameters;
        RSAKeyParameters publicKey;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            parameters = parametersWithRandom.getParameters();
            this.f89580d = parametersWithRandom.getRandom();
        } else {
            if (z10) {
                this.f89580d = CryptoServicesRegistrar.getSecureRandom();
            }
            parameters = cipherParameters;
        }
        boolean z11 = parameters instanceof RSABlindingParameters;
        AsymmetricBlockCipher asymmetricBlockCipher = this.f89579c;
        if (z11) {
            publicKey = ((RSABlindingParameters) parameters).getPublicKey();
            asymmetricBlockCipher.init(z10, cipherParameters);
        } else {
            publicKey = (RSAKeyParameters) parameters;
            asymmetricBlockCipher.init(z10, parameters);
        }
        int iBitLength = publicKey.getModulus().bitLength();
        int i10 = iBitLength - 1;
        this.f89585i = i10;
        if (i10 < u.b(this.f89584h, 8, this.f89581e * 8, 9)) {
            throw new IllegalArgumentException("key too small for specified hash and salt lengths");
        }
        this.f89588l = new byte[(iBitLength + 6) / 8];
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.f89577a.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b10) {
        this.f89577a.update(b10);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        byte[] bArr2 = this.f89587k;
        int length = bArr2.length;
        int i10 = this.f89581e;
        int i11 = this.f89584h;
        Digest digest = this.f89577a;
        digest.doFinal(bArr2, (length - i10) - i11);
        try {
            byte[] bArrProcessBlock = this.f89579c.processBlock(bArr, 0, bArr.length);
            byte[] bArr3 = this.f89588l;
            Arrays.fill(bArr3, 0, bArr3.length - bArrProcessBlock.length, (byte) 0);
            byte[] bArr4 = this.f89588l;
            System.arraycopy(bArrProcessBlock, 0, bArr4, bArr4.length - bArrProcessBlock.length, bArrProcessBlock.length);
            byte[] bArr5 = this.f89588l;
            int length2 = 255 >>> ((bArr5.length * 8) - this.f89585i);
            byte b10 = bArr5[0];
            if ((b10 & 255) != (b10 & length2) || bArr5[bArr5.length - 1] != this.m) {
                b(bArr5);
                return false;
            }
            byte[] bArrC = c((bArr5.length - i10) - 1, i10, bArr5, (bArr5.length - i10) - 1);
            for (int i12 = 0; i12 != bArrC.length; i12++) {
                byte[] bArr6 = this.f89588l;
                bArr6[i12] = (byte) (bArr6[i12] ^ bArrC[i12]);
            }
            byte[] bArr7 = this.f89588l;
            bArr7[0] = (byte) (length2 & bArr7[0]);
            int i13 = 0;
            while (true) {
                byte[] bArr8 = this.f89588l;
                if (i13 == ((bArr8.length - i10) - i11) - 2) {
                    if (bArr8[((bArr8.length - i10) - i11) - 2] != 1) {
                        b(bArr8);
                        return false;
                    }
                    if (this.f89583g) {
                        System.arraycopy(this.f89586j, 0, bArr2, bArr2.length - i11, i11);
                    } else {
                        System.arraycopy(bArr8, ((bArr8.length - i11) - i10) - 1, bArr2, bArr2.length - i11, i11);
                    }
                    digest.update(bArr2, 0, bArr2.length);
                    digest.doFinal(bArr2, bArr2.length - i10);
                    int length3 = (this.f89588l.length - i10) - 1;
                    for (int length4 = bArr2.length - i10; length4 != bArr2.length; length4++) {
                        if ((this.f89588l[length3] ^ bArr2[length4]) != 0) {
                            b(bArr2);
                            b(this.f89588l);
                            return false;
                        }
                        length3++;
                    }
                    b(bArr2);
                    b(this.f89588l);
                    return true;
                }
                if (bArr8[i13] != 0) {
                    b(bArr8);
                    return false;
                }
                i13++;
            }
        } catch (Exception unused) {
        }
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i10, byte b10) {
        this(asymmetricBlockCipher, digest, digest, i10, b10);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i10, int i11) {
        this.f89577a.update(bArr, i10, i11);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i10) {
        this(asymmetricBlockCipher, digest, digest2, i10, (byte) -68);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i10, byte b10) {
        this.f89579c = asymmetricBlockCipher;
        this.f89577a = digest;
        this.f89578b = digest2;
        int digestSize = digest.getDigestSize();
        this.f89581e = digestSize;
        this.f89582f = digest2.getDigestSize();
        this.f89583g = false;
        this.f89584h = i10;
        this.f89586j = new byte[i10];
        this.f89587k = new byte[i10 + 8 + digestSize];
        this.m = b10;
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest2, bArr, (byte) -68);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr, byte b10) {
        this.f89579c = asymmetricBlockCipher;
        this.f89577a = digest;
        this.f89578b = digest2;
        int digestSize = digest.getDigestSize();
        this.f89581e = digestSize;
        this.f89582f = digest2.getDigestSize();
        this.f89583g = true;
        int length = bArr.length;
        this.f89584h = length;
        this.f89586j = bArr;
        this.f89587k = new byte[length + 8 + digestSize];
        this.m = b10;
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest, bArr, (byte) -68);
    }
}
