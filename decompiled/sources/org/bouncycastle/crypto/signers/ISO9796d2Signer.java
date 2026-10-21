package org.bouncycastle.crypto.signers;

import androidx.appcompat.widget.g0;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SignerWithRecovery;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ISO9796d2Signer implements SignerWithRecovery {
    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_WHIRLPOOL = 14284;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f89565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsymmetricBlockCipher f89566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f89567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f89568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f89569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f89570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f89571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f89572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f89573i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f89574j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f89575k;

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this(asymmetricBlockCipher, digest, false);
    }

    public static void a(byte[] bArr) {
        for (int i10 = 0; i10 != bArr.length; i10++) {
            bArr[i10] = 0;
        }
    }

    public final void b(byte[] bArr) {
        this.f89571g = 0;
        a(this.f89570f);
        a(bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws CryptoException {
        int i10;
        int length;
        int i11;
        int i12;
        Digest digest = this.f89565a;
        int digestSize = digest.getDigestSize();
        int i13 = this.f89567c;
        if (i13 == 188) {
            byte[] bArr = this.f89569e;
            length = (bArr.length - digestSize) - 1;
            digest.doFinal(bArr, length);
            byte[] bArr2 = this.f89569e;
            bArr2[bArr2.length - 1] = -68;
            i10 = 8;
        } else {
            byte[] bArr3 = this.f89569e;
            int length2 = (bArr3.length - digestSize) - 2;
            digest.doFinal(bArr3, length2);
            byte[] bArr4 = this.f89569e;
            bArr4[bArr4.length - 2] = (byte) (i13 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i13;
            i10 = 16;
            length = length2;
        }
        int i14 = this.f89571g;
        int i15 = ((((digestSize + i14) * 8) + i10) + 4) - this.f89568d;
        if (i15 > 0) {
            int i16 = i14 - ((i15 + 7) / 8);
            i11 = length - i16;
            System.arraycopy(this.f89570f, 0, this.f89569e, i11, i16);
            this.f89573i = new byte[i16];
            i12 = 96;
        } else {
            i11 = length - i14;
            System.arraycopy(this.f89570f, 0, this.f89569e, i11, i14);
            this.f89573i = new byte[this.f89571g];
            i12 = 64;
        }
        int i17 = i11 - 1;
        if (i17 > 0) {
            for (int i18 = i17; i18 != 0; i18--) {
                this.f89569e[i18] = -69;
            }
            byte[] bArr5 = this.f89569e;
            bArr5[i17] = (byte) (bArr5[i17] ^ 1);
            bArr5[0] = 11;
            bArr5[0] = (byte) (11 | i12);
        } else {
            byte[] bArr6 = this.f89569e;
            bArr6[0] = 10;
            bArr6[0] = (byte) (10 | i12);
        }
        byte[] bArr7 = this.f89569e;
        byte[] bArrProcessBlock = this.f89566b.processBlock(bArr7, 0, bArr7.length);
        this.f89572h = (i12 & 32) == 0;
        byte[] bArr8 = this.f89570f;
        byte[] bArr9 = this.f89573i;
        System.arraycopy(bArr8, 0, bArr9, 0, bArr9.length);
        this.f89571g = 0;
        a(this.f89570f);
        a(this.f89569e);
        return bArrProcessBlock;
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public byte[] getRecoveredMessage() {
        return this.f89573i;
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public boolean hasFullMessage() {
        return this.f89572h;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z10, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) cipherParameters;
        this.f89566b.init(z10, rSAKeyParameters);
        int iBitLength = rSAKeyParameters.getModulus().bitLength();
        this.f89568d = iBitLength;
        byte[] bArr = new byte[(iBitLength + 7) / 8];
        this.f89569e = bArr;
        int i10 = this.f89567c;
        Digest digest = this.f89565a;
        int length = bArr.length;
        if (i10 == 188) {
            this.f89570f = new byte[(length - digest.getDigestSize()) - 2];
        } else {
            this.f89570f = new byte[(length - digest.getDigestSize()) - 3];
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.f89565a.reset();
        this.f89571g = 0;
        a(this.f89570f);
        byte[] bArr = this.f89573i;
        if (bArr != null) {
            a(bArr);
        }
        this.f89573i = null;
        this.f89572h = false;
        if (this.f89574j != null) {
            this.f89574j = null;
            a(this.f89575k);
            this.f89575k = null;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b10) {
        this.f89565a.update(b10);
        int i10 = this.f89571g;
        byte[] bArr = this.f89570f;
        if (i10 < bArr.length) {
            bArr[i10] = b10;
        }
        this.f89571g = i10 + 1;
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public void updateWithRecoveredMessage(byte[] bArr) throws InvalidCipherTextException {
        int i10;
        byte[] bArrProcessBlock = this.f89566b.processBlock(bArr, 0, bArr.length);
        if (((bArrProcessBlock[0] & Constants.CVR_B2b87_11_RFU) ^ 64) != 0) {
            throw new InvalidCipherTextException("malformed signature");
        }
        if (((bArrProcessBlock[bArrProcessBlock.length - 1] & 15) ^ 12) != 0) {
            throw new InvalidCipherTextException("malformed signature");
        }
        int i11 = (bArrProcessBlock[bArrProcessBlock.length - 1] & 255) ^ 188;
        Digest digest = this.f89565a;
        if (i11 == 0) {
            i10 = 1;
        } else {
            i10 = 2;
            int i12 = ((bArrProcessBlock[bArrProcessBlock.length - 2] & 255) << 8) | (bArrProcessBlock[bArrProcessBlock.length - 1] & 255);
            Integer trailer = ISOTrailers.getTrailer(digest);
            if (trailer == null) {
                throw new IllegalArgumentException("unrecognised hash in signature");
            }
            int iIntValue = trailer.intValue();
            if (i12 != iIntValue && (iIntValue != 15052 || i12 != 16588)) {
                throw new IllegalStateException(g0.c("signer initialised with wrong digest for trailer ", i12));
            }
        }
        int i13 = 0;
        while (i13 != bArrProcessBlock.length && ((bArrProcessBlock[i13] & 15) ^ 10) != 0) {
            i13++;
        }
        int i14 = i13 + 1;
        int length = ((bArrProcessBlock.length - i10) - digest.getDigestSize()) - i14;
        if (length <= 0) {
            throw new InvalidCipherTextException("malformed block");
        }
        if ((bArrProcessBlock[0] & 32) == 0) {
            this.f89572h = true;
            byte[] bArr2 = new byte[length];
            this.f89573i = bArr2;
            System.arraycopy(bArrProcessBlock, i14, bArr2, 0, bArr2.length);
        } else {
            this.f89572h = false;
            byte[] bArr3 = new byte[length];
            this.f89573i = bArr3;
            System.arraycopy(bArrProcessBlock, i14, bArr3, 0, bArr3.length);
        }
        this.f89574j = bArr;
        this.f89575k = bArrProcessBlock;
        byte[] bArr4 = this.f89573i;
        digest.update(bArr4, 0, bArr4.length);
        byte[] bArr5 = this.f89573i;
        this.f89571g = bArr5.length;
        System.arraycopy(bArr5, 0, this.f89570f, 0, bArr5.length);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        byte[] bArrProcessBlock;
        int i10;
        boolean z10;
        byte[] bArr2 = this.f89574j;
        if (bArr2 == null) {
            try {
                bArrProcessBlock = this.f89566b.processBlock(bArr, 0, bArr.length);
            } catch (Exception unused) {
                return false;
            }
        } else {
            if (!Arrays.areEqual(bArr2, bArr)) {
                throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
            }
            bArrProcessBlock = this.f89575k;
            this.f89574j = null;
            this.f89575k = null;
        }
        if (((bArrProcessBlock[0] & Constants.CVR_B2b87_11_RFU) ^ 64) != 0) {
            b(bArrProcessBlock);
            return false;
        }
        if (((bArrProcessBlock[bArrProcessBlock.length - 1] & 15) ^ 12) != 0) {
            b(bArrProcessBlock);
            return false;
        }
        int i11 = (bArrProcessBlock[bArrProcessBlock.length - 1] & 255) ^ 188;
        Digest digest = this.f89565a;
        if (i11 == 0) {
            i10 = 1;
        } else {
            i10 = 2;
            int i12 = ((bArrProcessBlock[bArrProcessBlock.length - 2] & 255) << 8) | (bArrProcessBlock[bArrProcessBlock.length - 1] & 255);
            Integer trailer = ISOTrailers.getTrailer(digest);
            if (trailer == null) {
                throw new IllegalArgumentException("unrecognised hash in signature");
            }
            int iIntValue = trailer.intValue();
            if (i12 != iIntValue && (iIntValue != 15052 || i12 != 16588)) {
                throw new IllegalStateException(g0.c("signer initialised with wrong digest for trailer ", i12));
            }
        }
        int i13 = 0;
        while (i13 != bArrProcessBlock.length && ((bArrProcessBlock[i13] & 15) ^ 10) != 0) {
            i13++;
        }
        int i14 = i13 + 1;
        int digestSize = digest.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        int length = (bArrProcessBlock.length - i10) - digestSize;
        int i15 = length - i14;
        if (i15 <= 0) {
            b(bArrProcessBlock);
            return false;
        }
        if ((bArrProcessBlock[0] & 32) == 0) {
            this.f89572h = true;
            if (this.f89571g > i15) {
                b(bArrProcessBlock);
                return false;
            }
            digest.reset();
            digest.update(bArrProcessBlock, i14, i15);
            digest.doFinal(bArr3, 0);
            boolean z11 = true;
            for (int i16 = 0; i16 != digestSize; i16++) {
                int i17 = length + i16;
                byte b10 = (byte) (bArrProcessBlock[i17] ^ bArr3[i16]);
                bArrProcessBlock[i17] = b10;
                if (b10 != 0) {
                    z11 = false;
                }
            }
            if (!z11) {
                b(bArrProcessBlock);
                return false;
            }
            byte[] bArr4 = new byte[i15];
            this.f89573i = bArr4;
            System.arraycopy(bArrProcessBlock, i14, bArr4, 0, i15);
        } else {
            this.f89572h = false;
            digest.doFinal(bArr3, 0);
            boolean z12 = true;
            for (int i18 = 0; i18 != digestSize; i18++) {
                int i19 = length + i18;
                byte b11 = (byte) (bArrProcessBlock[i19] ^ bArr3[i18]);
                bArrProcessBlock[i19] = b11;
                if (b11 != 0) {
                    z12 = false;
                }
            }
            if (!z12) {
                b(bArrProcessBlock);
                return false;
            }
            byte[] bArr5 = new byte[i15];
            this.f89573i = bArr5;
            System.arraycopy(bArrProcessBlock, i14, bArr5, 0, i15);
        }
        int i20 = this.f89571g;
        if (i20 != 0) {
            byte[] bArr6 = this.f89570f;
            byte[] bArr7 = this.f89573i;
            if (i20 > bArr6.length) {
                z10 = bArr6.length <= bArr7.length;
                for (int i21 = 0; i21 != this.f89570f.length; i21++) {
                    if (bArr6[i21] != bArr7[i21]) {
                        z10 = false;
                    }
                }
            } else {
                z10 = i20 == bArr7.length;
                for (int i22 = 0; i22 != bArr7.length; i22++) {
                    if (bArr6[i22] != bArr7[i22]) {
                        z10 = false;
                    }
                }
            }
            if (!z10) {
                b(bArrProcessBlock);
                return false;
            }
        }
        a(this.f89570f);
        a(bArrProcessBlock);
        this.f89571g = 0;
        return true;
    }

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, boolean z10) {
        int iIntValue;
        this.f89566b = asymmetricBlockCipher;
        this.f89565a = digest;
        if (z10) {
            iIntValue = 188;
        } else {
            Integer trailer = ISOTrailers.getTrailer(digest);
            if (trailer == null) {
                throw new IllegalArgumentException("no valid trailer for digest: " + digest.getAlgorithmName());
            }
            iIntValue = trailer.intValue();
        }
        this.f89567c = iIntValue;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i10, int i11) {
        while (i11 > 0 && this.f89571g < this.f89570f.length) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
        this.f89565a.update(bArr, i10, i11);
        this.f89571g += i11;
    }
}
