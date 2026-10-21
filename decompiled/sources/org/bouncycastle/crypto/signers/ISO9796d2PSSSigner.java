package org.bouncycastle.crypto.signers;

import androidx.appcompat.widget.g0;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SignerWithRecovery;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.ParametersWithSalt;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ISO9796d2PSSSigner implements SignerWithRecovery {
    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_WHIRLPOOL = 14284;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f89549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsymmetricBlockCipher f89550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecureRandom f89551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f89552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f89553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f89554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f89555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f89556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f89557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f89558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f89559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f89560l;
    public byte[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f89561n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f89562o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f89563p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f89564q;

    public ISO9796d2PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i10) {
        this(asymmetricBlockCipher, digest, i10, false);
    }

    public static void a(int i10, byte[] bArr) {
        bArr[0] = (byte) (i10 >>> 24);
        bArr[1] = (byte) (i10 >>> 16);
        bArr[2] = (byte) (i10 >>> 8);
        bArr[3] = (byte) i10;
    }

    public static void b(long j10, byte[] bArr) {
        bArr[0] = (byte) (j10 >>> 56);
        bArr[1] = (byte) (j10 >>> 48);
        bArr[2] = (byte) (j10 >>> 40);
        bArr[3] = (byte) (j10 >>> 32);
        bArr[4] = (byte) (j10 >>> 24);
        bArr[5] = (byte) (j10 >>> 16);
        bArr[6] = (byte) (j10 >>> 8);
        bArr[7] = (byte) j10;
    }

    public static void c(byte[] bArr) {
        for (int i10 = 0; i10 != bArr.length; i10++) {
            bArr[i10] = 0;
        }
    }

    public final byte[] d(int i10, int i11, byte[] bArr, int i12) {
        byte[] bArr2 = new byte[i12];
        int i13 = this.f89553e;
        byte[] bArr3 = new byte[i13];
        byte[] bArr4 = new byte[4];
        Digest digest = this.f89549a;
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
    public byte[] generateSignature() throws CryptoException {
        Digest digest = this.f89549a;
        int digestSize = digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        digest.doFinal(bArr, 0);
        byte[] bArr2 = new byte[8];
        b(this.f89558j * 8, bArr2);
        digest.update(bArr2, 0, 8);
        digest.update(this.f89557i, 0, this.f89558j);
        digest.update(bArr, 0, digestSize);
        byte[] bArr3 = this.f89552d;
        if (bArr3 == null) {
            bArr3 = new byte[this.f89559k];
            this.f89551c.nextBytes(bArr3);
        }
        digest.update(bArr3, 0, bArr3.length);
        int digestSize2 = digest.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        digest.doFinal(bArr4, 0);
        int i10 = this.f89554f;
        int i11 = i10 == 188 ? 1 : 2;
        byte[] bArr5 = this.f89556h;
        int length = bArr5.length;
        int i12 = this.f89558j;
        int length2 = (length - i12) - bArr3.length;
        int i13 = this.f89553e;
        int i14 = (length2 - i13) - i11;
        bArr5[i14 - 1] = 1;
        System.arraycopy(this.f89557i, 0, bArr5, i14, i12);
        System.arraycopy(bArr3, 0, this.f89556h, i14 + this.f89558j, bArr3.length);
        byte[] bArrD = d(0, digestSize2, bArr4, (this.f89556h.length - i13) - i11);
        for (int i15 = 0; i15 != bArrD.length; i15++) {
            byte[] bArr6 = this.f89556h;
            bArr6[i15] = (byte) (bArr6[i15] ^ bArrD[i15]);
        }
        byte[] bArr7 = this.f89556h;
        System.arraycopy(bArr4, 0, bArr7, (bArr7.length - i13) - i11, i13);
        if (i10 == 188) {
            byte[] bArr8 = this.f89556h;
            bArr8[bArr8.length - 1] = -68;
        } else {
            byte[] bArr9 = this.f89556h;
            bArr9[bArr9.length - 2] = (byte) (i10 >>> 8);
            bArr9[bArr9.length - 1] = (byte) i10;
        }
        byte[] bArr10 = this.f89556h;
        bArr10[0] = (byte) (bArr10[0] & 127);
        byte[] bArrProcessBlock = this.f89550b.processBlock(bArr10, 0, bArr10.length);
        int i16 = this.f89558j;
        byte[] bArr11 = new byte[i16];
        this.m = bArr11;
        byte[] bArr12 = this.f89557i;
        this.f89560l = i16 <= bArr12.length;
        System.arraycopy(bArr12, 0, bArr11, 0, i16);
        c(this.f89557i);
        c(this.f89556h);
        this.f89558j = 0;
        return bArrProcessBlock;
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public byte[] getRecoveredMessage() {
        return this.m;
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public boolean hasFullMessage() {
        return this.f89560l;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z10, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters;
        SecureRandom secureRandom;
        boolean z11 = cipherParameters instanceof ParametersWithRandom;
        int i10 = this.f89559k;
        if (z11) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            rSAKeyParameters = (RSAKeyParameters) parametersWithRandom.getParameters();
            if (z10) {
                secureRandom = parametersWithRandom.getRandom();
                this.f89551c = secureRandom;
            }
        } else if (cipherParameters instanceof ParametersWithSalt) {
            ParametersWithSalt parametersWithSalt = (ParametersWithSalt) cipherParameters;
            rSAKeyParameters = (RSAKeyParameters) parametersWithSalt.getParameters();
            byte[] salt = parametersWithSalt.getSalt();
            this.f89552d = salt;
            int length = salt.length;
            if (salt.length != i10) {
                throw new IllegalArgumentException("Fixed salt is of wrong length");
            }
            i10 = length;
        } else {
            rSAKeyParameters = (RSAKeyParameters) cipherParameters;
            if (z10) {
                secureRandom = CryptoServicesRegistrar.getSecureRandom();
                this.f89551c = secureRandom;
            }
        }
        this.f89550b.init(z10, rSAKeyParameters);
        int iBitLength = rSAKeyParameters.getModulus().bitLength();
        this.f89555g = iBitLength;
        byte[] bArr = new byte[(iBitLength + 7) / 8];
        this.f89556h = bArr;
        int i11 = this.f89554f;
        Digest digest = this.f89549a;
        int length2 = bArr.length;
        if (i11 == 188) {
            this.f89557i = new byte[((length2 - digest.getDigestSize()) - i10) - 2];
        } else {
            this.f89557i = new byte[((length2 - digest.getDigestSize()) - i10) - 3];
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.f89549a.reset();
        this.f89558j = 0;
        byte[] bArr = this.f89557i;
        if (bArr != null) {
            c(bArr);
        }
        byte[] bArr2 = this.m;
        if (bArr2 != null) {
            c(bArr2);
            this.m = null;
        }
        this.f89560l = false;
        if (this.f89561n != null) {
            this.f89561n = null;
            c(this.f89562o);
            this.f89562o = null;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b10) {
        if (this.f89561n == null) {
            int i10 = this.f89558j;
            byte[] bArr = this.f89557i;
            if (i10 < bArr.length) {
                this.f89558j = i10 + 1;
                bArr[i10] = b10;
                return;
            }
        }
        this.f89549a.update(b10);
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public void updateWithRecoveredMessage(byte[] bArr) throws InvalidCipherTextException {
        int i10;
        byte[] bArrProcessBlock = this.f89550b.processBlock(bArr, 0, bArr.length);
        int length = bArrProcessBlock.length;
        int i11 = (this.f89555g + 7) / 8;
        if (length < i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArrProcessBlock, 0, bArr2, i11 - bArrProcessBlock.length, bArrProcessBlock.length);
            c(bArrProcessBlock);
            bArrProcessBlock = bArr2;
        }
        int i12 = (bArrProcessBlock[bArrProcessBlock.length - 1] & 255) ^ 188;
        Digest digest = this.f89549a;
        if (i12 == 0) {
            i10 = 1;
        } else {
            i10 = 2;
            int i13 = ((bArrProcessBlock[bArrProcessBlock.length - 2] & 255) << 8) | (bArrProcessBlock[bArrProcessBlock.length - 1] & 255);
            Integer trailer = ISOTrailers.getTrailer(digest);
            if (trailer == null) {
                throw new IllegalArgumentException("unrecognised hash in signature");
            }
            int iIntValue = trailer.intValue();
            if (i13 != iIntValue && (iIntValue != 15052 || i13 != 16588)) {
                throw new IllegalStateException(g0.c("signer initialised with wrong digest for trailer ", i13));
            }
        }
        int i14 = this.f89553e;
        digest.doFinal(new byte[i14], 0);
        byte[] bArrD = d((bArrProcessBlock.length - i14) - i10, i14, bArrProcessBlock, (bArrProcessBlock.length - i14) - i10);
        for (int i15 = 0; i15 != bArrD.length; i15++) {
            bArrProcessBlock[i15] = (byte) (bArrProcessBlock[i15] ^ bArrD[i15]);
        }
        bArrProcessBlock[0] = (byte) (bArrProcessBlock[0] & 127);
        int i16 = 0;
        while (i16 != bArrProcessBlock.length && bArrProcessBlock[i16] != 1) {
            i16++;
        }
        int i17 = i16 + 1;
        if (i17 >= bArrProcessBlock.length) {
            c(bArrProcessBlock);
        }
        this.f89560l = i17 > 1;
        int length2 = (bArrD.length - i17) - this.f89559k;
        byte[] bArr3 = new byte[length2];
        this.m = bArr3;
        System.arraycopy(bArrProcessBlock, i17, bArr3, 0, length2);
        byte[] bArr4 = this.m;
        System.arraycopy(bArr4, 0, this.f89557i, 0, bArr4.length);
        this.f89561n = bArr;
        this.f89562o = bArrProcessBlock;
        this.f89563p = i17;
        this.f89564q = i10;
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        int i10 = this.f89553e;
        byte[] bArr2 = new byte[i10];
        Digest digest = this.f89549a;
        digest.doFinal(bArr2, 0);
        byte[] bArr3 = this.f89561n;
        if (bArr3 == null) {
            try {
                updateWithRecoveredMessage(bArr);
            } catch (Exception unused) {
                return false;
            }
        } else if (!Arrays.areEqual(bArr3, bArr)) {
            throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
        }
        byte[] bArr4 = this.f89562o;
        int i11 = this.f89563p;
        int i12 = this.f89564q;
        this.f89561n = null;
        this.f89562o = null;
        byte[] bArr5 = new byte[8];
        b(this.m.length * 8, bArr5);
        digest.update(bArr5, 0, 8);
        byte[] bArr6 = this.m;
        if (bArr6.length != 0) {
            digest.update(bArr6, 0, bArr6.length);
        }
        digest.update(bArr2, 0, i10);
        byte[] bArr7 = this.f89552d;
        if (bArr7 != null) {
            digest.update(bArr7, 0, bArr7.length);
        } else {
            digest.update(bArr4, i11 + this.m.length, this.f89559k);
        }
        int digestSize = digest.getDigestSize();
        byte[] bArr8 = new byte[digestSize];
        digest.doFinal(bArr8, 0);
        int length = (bArr4.length - i12) - digestSize;
        boolean z10 = true;
        for (int i13 = 0; i13 != digestSize; i13++) {
            if (bArr8[i13] != bArr4[length + i13]) {
                z10 = false;
            }
        }
        c(bArr4);
        c(bArr8);
        if (!z10) {
            this.f89560l = false;
            this.f89558j = 0;
            c(this.m);
            return false;
        }
        int i14 = this.f89558j;
        if (i14 != 0) {
            byte[] bArr9 = this.f89557i;
            byte[] bArr10 = this.m;
            boolean z11 = i14 == bArr10.length;
            for (int i15 = 0; i15 != bArr10.length; i15++) {
                if (bArr9[i15] != bArr10[i15]) {
                    z11 = false;
                }
            }
            if (!z11) {
                this.f89558j = 0;
                c(this.f89557i);
                return false;
            }
        }
        this.f89558j = 0;
        c(this.f89557i);
        return true;
    }

    public ISO9796d2PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i10, boolean z10) {
        int iIntValue;
        this.f89550b = asymmetricBlockCipher;
        this.f89549a = digest;
        this.f89553e = digest.getDigestSize();
        this.f89559k = i10;
        if (z10) {
            iIntValue = 188;
        } else {
            Integer trailer = ISOTrailers.getTrailer(digest);
            if (trailer == null) {
                throw new IllegalArgumentException("no valid trailer for digest: " + digest.getAlgorithmName());
            }
            iIntValue = trailer.intValue();
        }
        this.f89554f = iIntValue;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i10, int i11) {
        if (this.f89561n == null) {
            while (i11 > 0 && this.f89558j < this.f89557i.length) {
                update(bArr[i10]);
                i10++;
                i11--;
            }
        }
        if (i11 > 0) {
            this.f89549a.update(bArr, i10, i11);
        }
    }
}
