package org.bouncycastle.crypto.prng.drbg;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.util.Hashtable;
import km.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes5.dex */
public class CTRSP800DRBG implements SP80090DRBG {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f89454j = Hex.decodeStrict("000102030405060708090A0B0C0D0E0F101112131415161718191A1B1C1D1E1F");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EntropySource f89455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockCipher f89456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f89457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f89458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f89459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f89460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f89461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f89462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f89463i;

    public CTRSP800DRBG(BlockCipher blockCipher, int i10, int i11, EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        this.f89462h = 0L;
        this.f89463i = false;
        this.f89455a = entropySource;
        this.f89456b = blockCipher;
        this.f89457c = i10;
        this.f89459e = i11;
        int blockSize = (blockCipher.getBlockSize() * 8) + i10;
        this.f89458d = blockSize;
        this.f89463i = blockCipher.getAlgorithmName().equals("DESede") || blockCipher.getAlgorithmName().equals("TDEA");
        if (i11 > 256) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if ((((blockCipher.getAlgorithmName().equals("DESede") || blockCipher.getAlgorithmName().equals("TDEA")) && i10 == 168) ? 112 : blockCipher.getAlgorithmName().equals("AES") ? i10 : -1) < i11) {
            throw new IllegalArgumentException("Requested security strength is not supported by block cipher and key size");
        }
        if (entropySource.entropySize() < i11) {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        byte[] entropy = this.f89455a.getEntropy();
        if (entropy.length < (this.f89459e + 7) / 8) {
            throw new IllegalStateException("Insufficient entropy provided by entropy source");
        }
        byte[] bArrA = a(blockSize, Arrays.concatenate(entropy, bArr2, bArr));
        int blockSize2 = blockCipher.getBlockSize();
        byte[] bArr3 = new byte[(i10 + 7) / 8];
        this.f89460f = bArr3;
        byte[] bArr4 = new byte[blockSize2];
        this.f89461g = bArr4;
        b(bArrA, bArr3, bArr4);
        this.f89462h = 1L;
    }

    public static void c(byte[] bArr) {
        int i10 = 1;
        for (int i11 = 1; i11 <= bArr.length; i11++) {
            int i12 = (bArr[bArr.length - i11] & 255) + i10;
            i10 = i12 > 255 ? 1 : 0;
            bArr[bArr.length - i11] = (byte) i12;
        }
    }

    public static void d(int i10, int i11, byte[] bArr) {
        bArr[i11] = (byte) (i10 >> 24);
        bArr[i11 + 1] = (byte) (i10 >> 16);
        bArr[i11 + 2] = (byte) (i10 >> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    public static void f(byte[] bArr, int i10, int i11, byte[] bArr2) {
        bArr2[i11] = (byte) (bArr[i10] & 254);
        int i12 = i10 + 1;
        bArr2[i11 + 1] = (byte) ((bArr[i10] << 7) | ((bArr[i12] & 252) >>> 1));
        int i13 = bArr[i12] << 6;
        int i14 = i10 + 2;
        bArr2[i11 + 2] = (byte) (i13 | ((bArr[i14] & 248) >>> 2));
        int i15 = bArr[i14] << 5;
        int i16 = i10 + 3;
        bArr2[i11 + 3] = (byte) (i15 | ((bArr[i16] & Constants.CVR_B2b8765_1111_APP_DISABLED) >>> 3));
        int i17 = bArr[i16] << 4;
        int i18 = i10 + 4;
        bArr2[i11 + 4] = (byte) (i17 | ((bArr[i18] & 224) >>> 4));
        int i19 = bArr[i18] << 3;
        int i20 = i10 + 5;
        bArr2[i11 + 5] = (byte) (i19 | ((bArr[i20] & Constants.CVR_B2b87_11_RFU) >>> 5));
        int i21 = i10 + 6;
        bArr2[i11 + 6] = (byte) ((bArr[i20] << 2) | ((bArr[i21] & 128) >>> 6));
        int i22 = i11 + 7;
        bArr2[i22] = (byte) (bArr[i21] << 1);
        while (i11 <= i22) {
            byte b10 = bArr2[i11];
            bArr2[i11] = (byte) (((((b10 >> 7) ^ ((((((b10 >> 1) ^ (b10 >> 2)) ^ (b10 >> 3)) ^ (b10 >> 4)) ^ (b10 >> 5)) ^ (b10 >> 6))) ^ 1) & 1) | (b10 & 254));
            i11++;
        }
    }

    public final byte[] a(int i10, byte[] bArr) {
        int i11;
        BlockCipher blockCipher = this.f89456b;
        int blockSize = blockCipher.getBlockSize();
        int length = bArr.length;
        int i12 = i10 / 8;
        int i13 = ((((length + 9) + blockSize) - 1) / blockSize) * blockSize;
        byte[] bArr2 = new byte[i13];
        d(length, 0, bArr2);
        d(i12, 4, bArr2);
        System.arraycopy(bArr, 0, bArr2, 8, length);
        bArr2[length + 8] = -128;
        int i14 = this.f89457c;
        int i15 = i14 / 8;
        int i16 = i15 + blockSize;
        byte[] bArr3 = new byte[i16];
        byte[] bArr4 = new byte[blockSize];
        byte[] bArr5 = new byte[blockSize];
        byte[] bArr6 = new byte[i15];
        System.arraycopy(f89454j, 0, bArr6, 0, i15);
        int i17 = 0;
        while (true) {
            int i18 = i17 * blockSize;
            i11 = i12;
            if (i18 * 8 >= (blockSize * 8) + i14) {
                break;
            }
            d(i17, 0, bArr5);
            int blockSize2 = blockCipher.getBlockSize();
            byte[] bArr7 = new byte[blockSize2];
            int i19 = i14;
            int i20 = i13 / blockSize2;
            int i21 = i13;
            byte[] bArr8 = new byte[blockSize2];
            int i22 = i15;
            int i23 = i17;
            blockCipher.init(true, new KeyParameter(e(bArr6)));
            blockCipher.processBlock(bArr5, 0, bArr7, 0);
            int i24 = 0;
            while (i24 < i20) {
                int i25 = i24 * blockSize2;
                int i26 = i20;
                int i27 = 0;
                while (i27 < blockSize2) {
                    bArr8[i27] = (byte) (bArr7[i27] ^ bArr2[i27 + i25]);
                    i27++;
                    bArr2 = bArr2;
                }
                blockCipher.processBlock(bArr8, 0, bArr7, 0);
                i24++;
                i20 = i26;
            }
            byte[] bArr9 = bArr2;
            System.arraycopy(bArr7, 0, bArr4, 0, blockSize);
            int i28 = i16 - i18;
            if (i28 > blockSize) {
                i28 = blockSize;
            }
            System.arraycopy(bArr4, 0, bArr3, i18, i28);
            i17 = i23 + 1;
            i15 = i22;
            i14 = i19;
            i12 = i11;
            i13 = i21;
            bArr2 = bArr9;
        }
        int i29 = i15;
        byte[] bArr10 = new byte[blockSize];
        System.arraycopy(bArr3, 0, bArr6, 0, i29);
        System.arraycopy(bArr3, i29, bArr10, 0, blockSize);
        byte[] bArr11 = new byte[i11];
        blockCipher.init(true, new KeyParameter(e(bArr6)));
        int i30 = 0;
        while (true) {
            int i31 = i30 * blockSize;
            if (i31 >= i11) {
                return bArr11;
            }
            blockCipher.processBlock(bArr10, 0, bArr10, 0);
            int i32 = i11 - i31;
            if (i32 > blockSize) {
                i32 = blockSize;
            }
            System.arraycopy(bArr10, 0, bArr11, i31, i32);
            i30++;
        }
    }

    public final void b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int length = bArr.length;
        byte[] bArr4 = new byte[length];
        BlockCipher blockCipher = this.f89456b;
        byte[] bArr5 = new byte[blockCipher.getBlockSize()];
        int blockSize = blockCipher.getBlockSize();
        blockCipher.init(true, new KeyParameter(e(bArr2)));
        int i10 = 0;
        while (true) {
            int i11 = i10 * blockSize;
            if (i11 >= bArr.length) {
                break;
            }
            c(bArr3);
            blockCipher.processBlock(bArr3, 0, bArr5, 0);
            int i12 = length - i11;
            if (i12 > blockSize) {
                i12 = blockSize;
            }
            System.arraycopy(bArr5, 0, bArr4, i11, i12);
            i10++;
        }
        for (int i13 = 0; i13 < length; i13++) {
            bArr4[i13] = (byte) (bArr[i13] ^ bArr4[i13]);
        }
        System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
        System.arraycopy(bArr4, bArr2.length, bArr3, 0, bArr3.length);
    }

    public final byte[] e(byte[] bArr) {
        if (!this.f89463i) {
            return bArr;
        }
        byte[] bArr2 = new byte[24];
        f(bArr, 0, 0, bArr2);
        f(bArr, 7, 8, bArr2);
        f(bArr, 14, 16, bArr2);
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int generate(byte[] bArr, byte[] bArr2, boolean z10) {
        byte[] bArrA;
        if (this.f89463i) {
            if (this.f89462h > SvgConstantsKt.SPECIFIED_SOLID_COLOR) {
                return -1;
            }
            Hashtable hashtable = a.f79375a;
            if (bArr != null && bArr.length > 512) {
                throw new IllegalArgumentException("Number of bits per request limited to 4096");
            }
        } else {
            if (this.f89462h > 140737488355328L) {
                return -1;
            }
            Hashtable hashtable2 = a.f79375a;
            if (bArr != null && bArr.length > 32768) {
                throw new IllegalArgumentException("Number of bits per request limited to 262144");
            }
        }
        if (z10) {
            byte[] entropy = this.f89455a.getEntropy();
            if (entropy.length < (this.f89459e + 7) / 8) {
                throw new IllegalStateException("Insufficient entropy provided by entropy source");
            }
            b(a(this.f89458d, Arrays.concatenate(entropy, bArr2)), this.f89460f, this.f89461g);
            this.f89462h = 1L;
            bArr2 = null;
        }
        int i10 = this.f89458d;
        if (bArr2 != null) {
            bArrA = a(i10, bArr2);
            b(bArrA, this.f89460f, this.f89461g);
        } else {
            bArrA = new byte[i10 / 8];
        }
        int length = this.f89461g.length;
        byte[] bArr3 = new byte[length];
        KeyParameter keyParameter = new KeyParameter(e(this.f89460f));
        BlockCipher blockCipher = this.f89456b;
        blockCipher.init(true, keyParameter);
        for (int i11 = 0; i11 <= bArr.length / length; i11++) {
            int i12 = i11 * length;
            int length2 = bArr.length - i12 > length ? length : bArr.length - (this.f89461g.length * i11);
            if (length2 != 0) {
                c(this.f89461g);
                blockCipher.processBlock(this.f89461g, 0, bArr3, 0);
                System.arraycopy(bArr3, 0, bArr, i12, length2);
            }
        }
        b(bArrA, this.f89460f, this.f89461g);
        this.f89462h++;
        return bArr.length * 8;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int getBlockSize() {
        return this.f89461g.length * 8;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public void reseed(byte[] bArr) throws CloneNotSupportedException {
        byte[] entropy = this.f89455a.getEntropy();
        if (entropy.length < (this.f89459e + 7) / 8) {
            throw new IllegalStateException("Insufficient entropy provided by entropy source");
        }
        b(a(this.f89458d, Arrays.concatenate(entropy, bArr)), this.f89460f, this.f89461g);
        this.f89462h = 1L;
    }
}
