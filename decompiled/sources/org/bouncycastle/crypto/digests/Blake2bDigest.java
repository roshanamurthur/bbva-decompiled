package org.bouncycastle.crypto.digests;

import android.R;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class Blake2bDigest implements ExtendedDigest {
    public static final long[] m = {7640891576956012808L, -4942790177534073029L, 4354685564936845355L, -6534734903238641935L, 5840696475078001361L, -7276294671716946913L, 2270897969802886507L, 6620516959819538809L};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[][] f87977n = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, Constants.CVR_B1b41_1110_ONLINE_PIN, 15}, new byte[]{Constants.CVR_B1b41_1110_ONLINE_PIN, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, Constants.CVR_B1b41_1110_ONLINE_PIN, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, Constants.CVR_B1b41_1110_ONLINE_PIN, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, Constants.CVR_B1b41_1110_ONLINE_PIN, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, Constants.CVR_B1b41_1110_ONLINE_PIN, 1, 9}, new byte[]{12, 5, 1, 15, Constants.CVR_B1b41_1110_ONLINE_PIN, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, Constants.CVR_B1b41_1110_ONLINE_PIN, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, Constants.CVR_B1b41_1110_ONLINE_PIN, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, Constants.CVR_B1b41_1110_ONLINE_PIN, 3, 12, 13, 0}, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, Constants.CVR_B1b41_1110_ONLINE_PIN, 15}, new byte[]{Constants.CVR_B1b41_1110_ONLINE_PIN, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f87980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f87981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f87982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f87983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f87984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f87985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long[] f87986i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f87987j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f87988k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f87989l;

    public Blake2bDigest() {
        this(512);
    }

    public final void a(long j10, long j11, int i10, int i11, int i12, int i13) {
        long[] jArr = this.f87985h;
        long j12 = jArr[i10] + jArr[i11] + j10;
        jArr[i10] = j12;
        long j13 = jArr[i13] ^ j12;
        long j14 = (j13 << 32) | (j13 >>> 32);
        jArr[i13] = j14;
        long j15 = jArr[i12] + j14;
        jArr[i12] = j15;
        long j16 = jArr[i11] ^ j15;
        long j17 = (j16 << 40) | (j16 >>> 24);
        jArr[i11] = j17;
        long j18 = jArr[i10] + j17 + j11;
        jArr[i10] = j18;
        long j19 = jArr[i13] ^ j18;
        long j20 = (j19 << 48) | (j19 >>> 16);
        jArr[i13] = j20;
        long j21 = jArr[i12] + j20;
        jArr[i12] = j21;
        long j22 = jArr[i11] ^ j21;
        jArr[i11] = (j22 << 1) | (j22 >>> 63);
    }

    public final void b(int i10, byte[] bArr) {
        long[] jArr = this.f87986i;
        int length = jArr.length;
        int i11 = 0;
        long[] jArr2 = this.f87985h;
        System.arraycopy(jArr, 0, jArr2, 0, length);
        long[] jArr3 = m;
        System.arraycopy(jArr3, 0, jArr2, this.f87986i.length, 4);
        jArr2[12] = this.f87987j ^ jArr3[4];
        jArr2[13] = this.f87988k ^ jArr3[5];
        jArr2[14] = this.f87989l ^ jArr3[6];
        jArr2[15] = jArr3[7];
        long[] jArr4 = new long[16];
        for (int i12 = 0; i12 < 16; i12++) {
            jArr4[i12] = Pack.littleEndianToLong(bArr, (i12 * 8) + i10);
        }
        int i13 = 0;
        while (i13 < 12) {
            byte[][] bArr2 = f87977n;
            byte[] bArr3 = bArr2[i13];
            int i14 = i13;
            long[] jArr5 = jArr4;
            a(jArr4[bArr3[0]], jArr4[bArr3[1]], 0, 4, 8, 12);
            byte[] bArr4 = bArr2[i14];
            a(jArr5[bArr4[2]], jArr5[bArr4[3]], 1, 5, 9, 13);
            byte[] bArr5 = bArr2[i14];
            a(jArr5[bArr5[4]], jArr5[bArr5[5]], 2, 6, 10, 14);
            byte[] bArr6 = bArr2[i14];
            a(jArr5[bArr6[6]], jArr5[bArr6[7]], 3, 7, 11, 15);
            byte[] bArr7 = bArr2[i14];
            a(jArr5[bArr7[8]], jArr5[bArr7[9]], 0, 5, 10, 15);
            byte[] bArr8 = bArr2[i14];
            a(jArr5[bArr8[10]], jArr5[bArr8[11]], 1, 6, 11, 12);
            byte[] bArr9 = bArr2[i14];
            a(jArr5[bArr9[12]], jArr5[bArr9[13]], 2, 7, 8, 13);
            byte[] bArr10 = bArr2[i14];
            a(jArr5[bArr10[14]], jArr5[bArr10[15]], 3, 4, 9, 14);
            i13 = i14 + 1;
            jArr4 = jArr5;
        }
        while (true) {
            long[] jArr6 = this.f87986i;
            if (i11 >= jArr6.length) {
                return;
            }
            jArr6[i11] = (jArr6[i11] ^ jArr2[i11]) ^ jArr2[i11 + 8];
            i11++;
        }
    }

    public final void c() {
        if (this.f87986i == null) {
            long[] jArr = {jArr[0] ^ ((long) (((this.f87979b << 8) | this.f87978a) | R.attr.theme)), jArr[1], jArr[2], jArr[3], j, jArr[5], 0, 0};
            this.f87986i = jArr;
            long[] jArr2 = m;
            long j10 = jArr2[4];
            byte[] bArr = this.f87980c;
            if (bArr != null) {
                jArr[4] = j10 ^ Pack.littleEndianToLong(bArr, 0);
                long[] jArr3 = this.f87986i;
                jArr3[5] = jArr3[5] ^ Pack.littleEndianToLong(bArr, 8);
            }
            long[] jArr4 = this.f87986i;
            long j11 = jArr2[6];
            jArr4[6] = j11;
            jArr4[7] = jArr2[7];
            byte[] bArr2 = this.f87981d;
            if (bArr2 != null) {
                jArr4[6] = j11 ^ Pack.littleEndianToLong(bArr2, 0);
                long[] jArr5 = this.f87986i;
                jArr5[7] = jArr5[7] ^ Pack.littleEndianToLong(bArr2, 8);
            }
        }
    }

    public void clearKey() {
        byte[] bArr = this.f87982e;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            Arrays.fill(this.f87983f, (byte) 0);
        }
    }

    public void clearSalt() {
        byte[] bArr = this.f87980c;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        long[] jArr;
        int i11;
        int i12;
        this.f87989l = -1L;
        long j10 = this.f87987j;
        int i13 = this.f87984g;
        long j11 = j10 + ((long) i13);
        this.f87987j = j11;
        if (i13 > 0 && j11 == 0) {
            this.f87988k++;
        }
        byte[] bArr2 = this.f87983f;
        b(0, bArr2);
        Arrays.fill(bArr2, (byte) 0);
        Arrays.fill(this.f87985h, 0L);
        int i14 = 0;
        while (true) {
            jArr = this.f87986i;
            int length = jArr.length;
            i11 = this.f87978a;
            if (i14 >= length || (i12 = i14 * 8) >= i11) {
                break;
            }
            byte[] bArrLongToLittleEndian = Pack.longToLittleEndian(jArr[i14]);
            if (i12 < i11 - 8) {
                System.arraycopy(bArrLongToLittleEndian, 0, bArr, i12 + i10, 8);
            } else {
                System.arraycopy(bArrLongToLittleEndian, 0, bArr, i10 + i12, i11 - i12);
            }
            i14++;
        }
        Arrays.fill(jArr, 0L);
        reset();
        return i11;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "BLAKE2b";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 128;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.f87978a;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.f87984g = 0;
        this.f87989l = 0L;
        this.f87987j = 0L;
        this.f87988k = 0L;
        this.f87986i = null;
        byte[] bArr = this.f87983f;
        Arrays.fill(bArr, (byte) 0);
        byte[] bArr2 = this.f87982e;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            this.f87984g = 128;
        }
        c();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        int i10 = this.f87984g;
        int i11 = 128 - i10;
        byte[] bArr = this.f87983f;
        if (i11 != 0) {
            bArr[i10] = b10;
            this.f87984g = i10 + 1;
            return;
        }
        long j10 = this.f87987j + 128;
        this.f87987j = j10;
        if (j10 == 0) {
            this.f87988k++;
        }
        b(0, bArr);
        Arrays.fill(bArr, (byte) 0);
        bArr[0] = b10;
        this.f87984g = 1;
    }

    public Blake2bDigest(int i10) {
        this.f87978a = 64;
        this.f87979b = 0;
        this.f87980c = null;
        this.f87981d = null;
        this.f87982e = null;
        this.f87983f = null;
        this.f87984g = 0;
        this.f87985h = new long[16];
        this.f87986i = null;
        this.f87987j = 0L;
        this.f87988k = 0L;
        this.f87989l = 0L;
        if (i10 < 8 || i10 > 512 || i10 % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2b digest bit length must be a multiple of 8 and not greater than 512");
        }
        this.f87983f = new byte[128];
        this.f87979b = 0;
        this.f87978a = i10 / 8;
        c();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        int i12;
        if (bArr == null || i11 == 0) {
            return;
        }
        int i13 = this.f87984g;
        byte[] bArr2 = this.f87983f;
        if (i13 != 0) {
            i12 = 128 - i13;
            if (i12 < i11) {
                System.arraycopy(bArr, i10, bArr2, i13, i12);
                long j10 = this.f87987j + 128;
                this.f87987j = j10;
                if (j10 == 0) {
                    this.f87988k++;
                }
                b(0, bArr2);
                this.f87984g = 0;
                Arrays.fill(bArr2, (byte) 0);
            } else {
                System.arraycopy(bArr, i10, bArr2, i13, i11);
            }
            this.f87984g += i11;
        }
        i12 = 0;
        int i14 = i11 + i10;
        int i15 = i14 - 128;
        int i16 = i10 + i12;
        while (i16 < i15) {
            long j11 = this.f87987j + 128;
            this.f87987j = j11;
            if (j11 == 0) {
                this.f87988k++;
            }
            b(i16, bArr);
            i16 += 128;
        }
        i11 = i14 - i16;
        System.arraycopy(bArr, i16, bArr2, 0, i11);
        this.f87984g += i11;
    }

    public Blake2bDigest(Blake2bDigest blake2bDigest) {
        this.f87978a = 64;
        this.f87979b = 0;
        this.f87980c = null;
        this.f87981d = null;
        this.f87982e = null;
        this.f87983f = null;
        this.f87984g = 0;
        this.f87985h = new long[16];
        this.f87986i = null;
        this.f87987j = 0L;
        this.f87988k = 0L;
        this.f87989l = 0L;
        this.f87984g = blake2bDigest.f87984g;
        this.f87983f = Arrays.clone(blake2bDigest.f87983f);
        this.f87979b = blake2bDigest.f87979b;
        this.f87982e = Arrays.clone(blake2bDigest.f87982e);
        this.f87978a = blake2bDigest.f87978a;
        this.f87986i = Arrays.clone(blake2bDigest.f87986i);
        this.f87981d = Arrays.clone(blake2bDigest.f87981d);
        this.f87980c = Arrays.clone(blake2bDigest.f87980c);
        this.f87987j = blake2bDigest.f87987j;
        this.f87988k = blake2bDigest.f87988k;
        this.f87989l = blake2bDigest.f87989l;
    }

    public Blake2bDigest(byte[] bArr) {
        this.f87978a = 64;
        this.f87979b = 0;
        this.f87980c = null;
        this.f87981d = null;
        this.f87982e = null;
        this.f87984g = 0;
        this.f87985h = new long[16];
        this.f87986i = null;
        this.f87987j = 0L;
        this.f87988k = 0L;
        this.f87989l = 0L;
        byte[] bArr2 = new byte[128];
        this.f87983f = bArr2;
        if (bArr != null) {
            byte[] bArr3 = new byte[bArr.length];
            this.f87982e = bArr3;
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            if (bArr.length > 64) {
                throw new IllegalArgumentException("Keys > 64 are not supported");
            }
            this.f87979b = bArr.length;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f87984g = 128;
        }
        this.f87978a = 64;
        c();
    }

    public Blake2bDigest(byte[] bArr, int i10, byte[] bArr2, byte[] bArr3) {
        this.f87978a = 64;
        this.f87979b = 0;
        this.f87980c = null;
        this.f87981d = null;
        this.f87982e = null;
        this.f87984g = 0;
        this.f87985h = new long[16];
        this.f87986i = null;
        this.f87987j = 0L;
        this.f87988k = 0L;
        this.f87989l = 0L;
        byte[] bArr4 = new byte[128];
        this.f87983f = bArr4;
        if (i10 < 1 || i10 > 64) {
            throw new IllegalArgumentException("Invalid digest length (required: 1 - 64)");
        }
        this.f87978a = i10;
        if (bArr2 != null) {
            if (bArr2.length != 16) {
                throw new IllegalArgumentException("salt length must be exactly 16 bytes");
            }
            byte[] bArr5 = new byte[16];
            this.f87980c = bArr5;
            System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        }
        if (bArr3 != null) {
            if (bArr3.length != 16) {
                throw new IllegalArgumentException("personalization length must be exactly 16 bytes");
            }
            byte[] bArr6 = new byte[16];
            this.f87981d = bArr6;
            System.arraycopy(bArr3, 0, bArr6, 0, bArr3.length);
        }
        if (bArr != null) {
            byte[] bArr7 = new byte[bArr.length];
            this.f87982e = bArr7;
            System.arraycopy(bArr, 0, bArr7, 0, bArr.length);
            if (bArr.length > 64) {
                throw new IllegalArgumentException("Keys > 64 are not supported");
            }
            this.f87979b = bArr.length;
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
            this.f87984g = 128;
        }
        c();
    }
}
