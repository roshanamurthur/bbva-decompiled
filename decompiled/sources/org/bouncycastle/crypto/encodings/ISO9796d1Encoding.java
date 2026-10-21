package org.bouncycastle.crypto.encodings;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;

/* JADX INFO: loaded from: classes2.dex */
public class ISO9796d1Encoding implements AsymmetricBlockCipher {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final BigInteger f88242f = BigInteger.valueOf(16);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f88243g = BigInteger.valueOf(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f88244h = {Constants.CVR_B1b41_1110_ONLINE_PIN, 3, 5, 8, 9, 4, 2, 15, 0, 13, 11, 6, 7, 10, 12, 1};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f88245i = {8, 15, 6, 1, 5, 2, 11, 12, 3, 4, 13, 10, Constants.CVR_B1b41_1110_ONLINE_PIN, 9, 0, 7};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsymmetricBlockCipher f88246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f88247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88249d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BigInteger f88250e;

    public ISO9796d1Encoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.f88246a = asymmetricBlockCipher;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.f88246a.getInputBlockSize();
        return this.f88247b ? (inputBlockSize + 1) / 2 : inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.f88246a.getOutputBlockSize();
        return this.f88247b ? outputBlockSize : (outputBlockSize + 1) / 2;
    }

    public int getPadBits() {
        return this.f88249d;
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.f88246a;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters = cipherParameters instanceof ParametersWithRandom ? (RSAKeyParameters) ((ParametersWithRandom) cipherParameters).getParameters() : (RSAKeyParameters) cipherParameters;
        this.f88246a.init(z10, cipherParameters);
        BigInteger modulus = rSAKeyParameters.getModulus();
        this.f88250e = modulus;
        this.f88248c = modulus.bitLength();
        this.f88247b = z10;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        int i12;
        boolean z10 = this.f88247b;
        AsymmetricBlockCipher asymmetricBlockCipher = this.f88246a;
        byte[] bArr2 = f88244h;
        if (z10) {
            int i13 = this.f88248c;
            int i14 = (i13 + 7) / 8;
            byte[] bArr3 = new byte[i14];
            int i15 = this.f88249d + 1;
            int i16 = (i13 + 13) / 16;
            int i17 = 0;
            while (i17 < i16) {
                if (i17 > i16 - i11) {
                    int i18 = i16 - i17;
                    System.arraycopy(bArr, (i10 + i11) - i18, bArr3, i14 - i16, i18);
                } else {
                    System.arraycopy(bArr, i10, bArr3, i14 - (i17 + i11), i11);
                }
                i17 += i11;
            }
            for (int i19 = i14 - (i16 * 2); i19 != i14; i19 += 2) {
                byte b10 = bArr3[(i19 / 2) + (i14 - i16)];
                bArr3[i19] = (byte) ((bArr2[(b10 & 255) >>> 4] << 4) | bArr2[b10 & 15]);
                bArr3[i19 + 1] = b10;
            }
            int i20 = i14 - (i11 * 2);
            bArr3[i20] = (byte) (bArr3[i20] ^ i15);
            int i21 = i14 - 1;
            bArr3[i21] = (byte) ((bArr3[i21] << 4) | 6);
            int i22 = 8 - ((this.f88248c - 1) % 8);
            if (i22 != 8) {
                byte b11 = (byte) (bArr3[0] & (255 >>> i22));
                bArr3[0] = b11;
                bArr3[0] = (byte) ((128 >>> i22) | b11);
                i12 = 0;
            } else {
                bArr3[0] = 0;
                bArr3[1] = (byte) (128 | bArr3[1]);
                i12 = 1;
            }
            return asymmetricBlockCipher.processBlock(bArr3, i12, i14 - i12);
        }
        byte[] bArrProcessBlock = asymmetricBlockCipher.processBlock(bArr, i10, i11);
        int i23 = (this.f88248c + 13) / 16;
        BigInteger bigInteger = new BigInteger(1, bArrProcessBlock);
        BigInteger bigInteger2 = f88242f;
        BigInteger bigIntegerMod = bigInteger.mod(bigInteger2);
        BigInteger bigInteger3 = f88243g;
        if (!bigIntegerMod.equals(bigInteger3)) {
            if (!this.f88250e.subtract(bigInteger).mod(bigInteger2).equals(bigInteger3)) {
                throw new InvalidCipherTextException("resulting integer iS or (modulus - iS) is not congruent to 6 mod 16");
            }
            bigInteger = this.f88250e.subtract(bigInteger);
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            int length = byteArray.length - 1;
            byte[] bArr4 = new byte[length];
            System.arraycopy(byteArray, 1, bArr4, 0, length);
            byteArray = bArr4;
        }
        if ((byteArray[byteArray.length - 1] & 15) != 6) {
            throw new InvalidCipherTextException("invalid forcing byte in block");
        }
        byteArray[byteArray.length - 1] = (byte) (((byteArray[byteArray.length - 1] & 255) >>> 4) | (f88245i[(byteArray[byteArray.length - 2] & 255) >> 4] << 4));
        byte b12 = byteArray[1];
        byteArray[0] = (byte) (bArr2[b12 & 15] | (bArr2[(b12 & 255) >>> 4] << 4));
        int i24 = 1;
        int i25 = 0;
        boolean z11 = false;
        for (int length2 = byteArray.length - 1; length2 >= byteArray.length - (i23 * 2); length2 -= 2) {
            byte b13 = byteArray[length2];
            int i26 = length2 - 1;
            int i27 = ((bArr2[b13 & 15] | (bArr2[(b13 & 255) >>> 4] << 4)) ^ byteArray[i26]) & 255;
            if (i27 != 0) {
                if (z11) {
                    throw new InvalidCipherTextException("invalid tsums in block");
                }
                i24 = i27;
                i25 = i26;
                z11 = true;
            }
        }
        byteArray[i25] = 0;
        int length3 = (byteArray.length - i25) / 2;
        byte[] bArr5 = new byte[length3];
        for (int i28 = 0; i28 < length3; i28++) {
            bArr5[i28] = byteArray[u.b(i28, 2, i25, 1)];
        }
        this.f88249d = i24 - 1;
        return bArr5;
    }

    public void setPadBits(int i10) {
        if (i10 > 7) {
            throw new IllegalArgumentException("padBits > 7");
        }
        this.f88249d = i10;
    }
}
