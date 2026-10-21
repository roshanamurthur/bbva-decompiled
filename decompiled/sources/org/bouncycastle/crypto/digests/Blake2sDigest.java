package org.bouncycastle.crypto.digests;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class Blake2sDigest implements ExtendedDigest {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f87990s = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[][] f87991t = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, Constants.CVR_B1b41_1110_ONLINE_PIN, 15}, new byte[]{Constants.CVR_B1b41_1110_ONLINE_PIN, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, Constants.CVR_B1b41_1110_ONLINE_PIN, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, Constants.CVR_B1b41_1110_ONLINE_PIN, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, Constants.CVR_B1b41_1110_ONLINE_PIN, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, Constants.CVR_B1b41_1110_ONLINE_PIN, 1, 9}, new byte[]{12, 5, 1, 15, Constants.CVR_B1b41_1110_ONLINE_PIN, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, Constants.CVR_B1b41_1110_ONLINE_PIN, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, Constants.CVR_B1b41_1110_ONLINE_PIN, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, Constants.CVR_B1b41_1110_ONLINE_PIN, 3, 12, 13, 0}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f87992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f87993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f87994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f87995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f87996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f87997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f87998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f87999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f88000i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f88001j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f88002k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f88003l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f88004n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f88005o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f88006p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f88007q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f88008r;

    public Blake2sDigest() {
        this(256);
    }

    public final void a(int i10, int i11, int i12, int i13, int i14, int i15) {
        int[] iArr = this.f88004n;
        int i16 = iArr[i12] + iArr[i13] + i10;
        iArr[i12] = i16;
        int i17 = iArr[i15] ^ i16;
        int i18 = (i17 << 16) | (i17 >>> 16);
        iArr[i15] = i18;
        int i19 = iArr[i14] + i18;
        iArr[i14] = i19;
        int i20 = iArr[i13] ^ i19;
        int i21 = (i20 << 20) | (i20 >>> 12);
        iArr[i13] = i21;
        int i22 = iArr[i12] + i21 + i11;
        iArr[i12] = i22;
        int i23 = iArr[i15] ^ i22;
        int i24 = (i23 << 24) | (i23 >>> 8);
        iArr[i15] = i24;
        int i25 = iArr[i14] + i24;
        iArr[i14] = i25;
        int i26 = iArr[i13] ^ i25;
        iArr[i13] = (i26 << 25) | (i26 >>> 7);
    }

    public final void b(int i10, byte[] bArr) {
        int[] iArr = this.f88005o;
        int length = iArr.length;
        int i11 = 0;
        int[] iArr2 = this.f88004n;
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArr3 = f87990s;
        System.arraycopy(iArr3, 0, iArr2, this.f88005o.length, 4);
        iArr2[12] = this.f88006p ^ iArr3[4];
        iArr2[13] = this.f88007q ^ iArr3[5];
        iArr2[14] = this.f88008r ^ iArr3[6];
        iArr2[15] = iArr3[7];
        int[] iArr4 = new int[16];
        for (int i12 = 0; i12 < 16; i12++) {
            iArr4[i12] = Pack.littleEndianToInt(bArr, (i12 * 4) + i10);
        }
        int i13 = 0;
        while (i13 < 10) {
            byte[][] bArr2 = f87991t;
            byte[] bArr3 = bArr2[i13];
            int i14 = i13;
            int[] iArr5 = iArr4;
            a(iArr4[bArr3[0]], iArr4[bArr3[1]], 0, 4, 8, 12);
            byte[] bArr4 = bArr2[i14];
            a(iArr5[bArr4[2]], iArr5[bArr4[3]], 1, 5, 9, 13);
            byte[] bArr5 = bArr2[i14];
            a(iArr5[bArr5[4]], iArr5[bArr5[5]], 2, 6, 10, 14);
            byte[] bArr6 = bArr2[i14];
            a(iArr5[bArr6[6]], iArr5[bArr6[7]], 3, 7, 11, 15);
            byte[] bArr7 = bArr2[i14];
            a(iArr5[bArr7[8]], iArr5[bArr7[9]], 0, 5, 10, 15);
            byte[] bArr8 = bArr2[i14];
            a(iArr5[bArr8[10]], iArr5[bArr8[11]], 1, 6, 11, 12);
            byte[] bArr9 = bArr2[i14];
            a(iArr5[bArr9[12]], iArr5[bArr9[13]], 2, 7, 8, 13);
            byte[] bArr10 = bArr2[i14];
            a(iArr5[bArr10[14]], iArr5[bArr10[15]], 3, 4, 9, 14);
            i13 = i14 + 1;
            iArr4 = iArr5;
        }
        while (true) {
            int[] iArr6 = this.f88005o;
            if (i11 >= iArr6.length) {
                return;
            }
            iArr6[i11] = (iArr6[i11] ^ iArr2[i11]) ^ iArr2[i11 + 8];
            i11++;
        }
    }

    public final void c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f88003l = new byte[64];
        if (bArr3 != null && bArr3.length > 0) {
            if (bArr3.length > 32) {
                throw new IllegalArgumentException("Keys > 32 bytes are not supported");
            }
            byte[] bArr4 = new byte[bArr3.length];
            this.f87996e = bArr4;
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            this.f87993b = bArr3.length;
            System.arraycopy(bArr3, 0, this.f88003l, 0, bArr3.length);
            this.m = 64;
        }
        if (this.f88005o == null) {
            this.f88005o = new int[]{iArr[0] ^ (((this.f87993b << 8) | this.f87992a) | ((this.f87997f << 16) | (this.f87998g << 24))), iArr[1] ^ this.f87999h, ((int) j) ^ iArr[2], ((i | (this.f88001j << 16)) | (this.f88002k << 24)) ^ i, iArr[4], iArr[5], 0, 0};
            int[] iArr = f87990s;
            long j10 = this.f88000i;
            int i10 = (int) (j10 >> 32);
            int i11 = iArr[3];
            if (bArr != null) {
                if (bArr.length != 8) {
                    throw new IllegalArgumentException("Salt length must be exactly 8 bytes");
                }
                byte[] bArr5 = new byte[8];
                this.f87994c = bArr5;
                System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
                int[] iArr2 = this.f88005o;
                iArr2[4] = iArr2[4] ^ Pack.littleEndianToInt(bArr, 0);
                int[] iArr3 = this.f88005o;
                iArr3[5] = Pack.littleEndianToInt(bArr, 4) ^ iArr3[5];
            }
            int[] iArr4 = this.f88005o;
            iArr4[6] = iArr[6];
            iArr4[7] = iArr[7];
            if (bArr2 != null) {
                if (bArr2.length != 8) {
                    throw new IllegalArgumentException("Personalization length must be exactly 8 bytes");
                }
                byte[] bArr6 = new byte[8];
                this.f87995d = bArr6;
                System.arraycopy(bArr2, 0, bArr6, 0, bArr2.length);
                int[] iArr5 = this.f88005o;
                iArr5[6] = iArr5[6] ^ Pack.littleEndianToInt(bArr2, 0);
                int[] iArr6 = this.f88005o;
                iArr6[7] = Pack.littleEndianToInt(bArr2, 4) ^ iArr6[7];
            }
        }
    }

    public void clearKey() {
        byte[] bArr = this.f87996e;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            Arrays.fill(this.f88003l, (byte) 0);
        }
    }

    public void clearSalt() {
        byte[] bArr = this.f87994c;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        int[] iArr;
        int i11;
        int i12;
        this.f88008r = -1;
        int i13 = this.f88006p;
        int i14 = this.m;
        int i15 = i13 + i14;
        this.f88006p = i15;
        if (i15 < 0 && i14 > (-i15)) {
            this.f88007q++;
        }
        b(0, this.f88003l);
        Arrays.fill(this.f88003l, (byte) 0);
        Arrays.fill(this.f88004n, 0);
        int i16 = 0;
        while (true) {
            iArr = this.f88005o;
            int length = iArr.length;
            i11 = this.f87992a;
            if (i16 >= length || (i12 = i16 * 4) >= i11) {
                break;
            }
            byte[] bArrIntToLittleEndian = Pack.intToLittleEndian(iArr[i16]);
            if (i12 < i11 - 4) {
                System.arraycopy(bArrIntToLittleEndian, 0, bArr, i12 + i10, 4);
            } else {
                System.arraycopy(bArrIntToLittleEndian, 0, bArr, i10 + i12, i11 - i12);
            }
            i16++;
        }
        Arrays.fill(iArr, 0);
        reset();
        return i11;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "BLAKE2s";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.f87992a;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.m = 0;
        this.f88008r = 0;
        this.f88006p = 0;
        this.f88007q = 0;
        this.f88005o = null;
        Arrays.fill(this.f88003l, (byte) 0);
        byte[] bArr = this.f87996e;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.f88003l, 0, bArr.length);
            this.m = 64;
        }
        c(this.f87994c, this.f87995d, this.f87996e);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        int i10 = this.m;
        if (64 - i10 != 0) {
            this.f88003l[i10] = b10;
            this.m = i10 + 1;
            return;
        }
        int i11 = this.f88006p + 64;
        this.f88006p = i11;
        if (i11 == 0) {
            this.f88007q++;
        }
        b(0, this.f88003l);
        Arrays.fill(this.f88003l, (byte) 0);
        this.f88003l[0] = b10;
        this.m = 1;
    }

    public Blake2sDigest(int i10) {
        this.f87992a = 32;
        this.f87993b = 0;
        this.f87994c = null;
        this.f87995d = null;
        this.f87996e = null;
        this.f87997f = 1;
        this.f87998g = 1;
        this.f87999h = 0;
        this.f88000i = 0L;
        this.f88001j = 0;
        this.f88002k = 0;
        this.f88003l = null;
        this.m = 0;
        this.f88004n = new int[16];
        this.f88005o = null;
        this.f88006p = 0;
        this.f88007q = 0;
        this.f88008r = 0;
        if (i10 < 8 || i10 > 256 || i10 % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2s digest bit length must be a multiple of 8 and not greater than 256");
        }
        this.f87992a = i10 / 8;
        c(null, null, null);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        int i12;
        if (bArr == null || i11 == 0) {
            return;
        }
        int i13 = this.m;
        if (i13 != 0) {
            i12 = 64 - i13;
            if (i12 < i11) {
                System.arraycopy(bArr, i10, this.f88003l, i13, i12);
                int i14 = this.f88006p + 64;
                this.f88006p = i14;
                if (i14 == 0) {
                    this.f88007q++;
                }
                b(0, this.f88003l);
                this.m = 0;
                Arrays.fill(this.f88003l, (byte) 0);
            } else {
                System.arraycopy(bArr, i10, this.f88003l, i13, i11);
            }
            this.m += i11;
        }
        i12 = 0;
        int i15 = i11 + i10;
        int i16 = i15 - 64;
        int i17 = i10 + i12;
        while (i17 < i16) {
            int i18 = this.f88006p + 64;
            this.f88006p = i18;
            if (i18 == 0) {
                this.f88007q++;
            }
            b(i17, bArr);
            i17 += 64;
        }
        i11 = i15 - i17;
        System.arraycopy(bArr, i17, this.f88003l, 0, i11);
        this.m += i11;
    }

    public Blake2sDigest(Blake2sDigest blake2sDigest) {
        this.f87992a = 32;
        this.f87993b = 0;
        this.f87994c = null;
        this.f87995d = null;
        this.f87996e = null;
        this.f87997f = 1;
        this.f87998g = 1;
        this.f87999h = 0;
        this.f88000i = 0L;
        this.f88001j = 0;
        this.f88002k = 0;
        this.f88003l = null;
        this.m = 0;
        int[] iArr = new int[16];
        this.f88004n = iArr;
        this.f88005o = null;
        this.f88006p = 0;
        this.f88007q = 0;
        this.f88008r = 0;
        this.m = blake2sDigest.m;
        this.f88003l = Arrays.clone(blake2sDigest.f88003l);
        this.f87993b = blake2sDigest.f87993b;
        this.f87996e = Arrays.clone(blake2sDigest.f87996e);
        this.f87992a = blake2sDigest.f87992a;
        this.f88004n = Arrays.clone(iArr);
        this.f88005o = Arrays.clone(blake2sDigest.f88005o);
        this.f88006p = blake2sDigest.f88006p;
        this.f88007q = blake2sDigest.f88007q;
        this.f88008r = blake2sDigest.f88008r;
        this.f87994c = Arrays.clone(blake2sDigest.f87994c);
        this.f87995d = Arrays.clone(blake2sDigest.f87995d);
        this.f87997f = blake2sDigest.f87997f;
        this.f87998g = blake2sDigest.f87998g;
        this.f87999h = blake2sDigest.f87999h;
        this.f88000i = blake2sDigest.f88000i;
        this.f88001j = blake2sDigest.f88001j;
        this.f88002k = blake2sDigest.f88002k;
    }

    public Blake2sDigest(byte[] bArr) {
        this.f87992a = 32;
        this.f87993b = 0;
        this.f87994c = null;
        this.f87995d = null;
        this.f87996e = null;
        this.f87997f = 1;
        this.f87998g = 1;
        this.f87999h = 0;
        this.f88000i = 0L;
        this.f88001j = 0;
        this.f88002k = 0;
        this.f88003l = null;
        this.m = 0;
        this.f88004n = new int[16];
        this.f88005o = null;
        this.f88006p = 0;
        this.f88007q = 0;
        this.f88008r = 0;
        c(null, null, bArr);
    }

    public Blake2sDigest(byte[] bArr, int i10, byte[] bArr2, byte[] bArr3) {
        this.f87992a = 32;
        this.f87993b = 0;
        this.f87994c = null;
        this.f87995d = null;
        this.f87996e = null;
        this.f87997f = 1;
        this.f87998g = 1;
        this.f87999h = 0;
        this.f88000i = 0L;
        this.f88001j = 0;
        this.f88002k = 0;
        this.f88003l = null;
        this.m = 0;
        this.f88004n = new int[16];
        this.f88005o = null;
        this.f88006p = 0;
        this.f88007q = 0;
        this.f88008r = 0;
        if (i10 < 1 || i10 > 32) {
            throw new IllegalArgumentException("Invalid digest length (required: 1 - 32)");
        }
        this.f87992a = i10;
        c(bArr2, bArr3, bArr);
    }
}
