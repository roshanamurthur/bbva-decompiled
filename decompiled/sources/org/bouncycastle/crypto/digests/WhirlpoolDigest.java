package org.bouncycastle.crypto.digests;

import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.esotericsoftware.asm.Opcodes;
import com.veridas.detect.ImageAnalysisKt;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes2.dex */
public final class WhirlpoolDigest implements ExtendedDigest, Memoable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f88207j = {24, 35, Opcodes.IFNULL, 232, 135, 184, 1, 79, 54, 166, ErrorCodes.ERR_CRY_IO_PROPERTIES, 245, 121, 111, 145, 82, 96, 188, 155, 142, 163, 12, 123, 53, 29, 224, ErrorCodes.ERR_CRY_BAD_REC_RSA_PRIKEY, Opcodes.MONITORENTER, 46, 75, 254, 87, 21, 119, 55, 229, 159, 240, 74, 218, 88, 201, 41, 10, 177, 160, 107, 133, 189, 93, 16, 244, 203, 62, 5, 103, 228, 39, 65, 139, 167, 125, 149, 216, 251, 238, 124, 102, 221, 23, 71, 158, 202, 45, Opcodes.ATHROW, 7, 173, 90, 131, 51, 99, 2, 170, 113, 200, 25, 73, 217, 242, 227, 91, 136, 154, 38, 50, 176, 233, 15, ErrorCodes.ERR_CRY_BAD_PIN_SIZE, 128, 190, 205, 52, 72, 255, 122, 144, 95, 32, 104, 26, 174, 180, 84, 147, 34, 100, 241, 115, 18, 64, 8, Opcodes.MONITOREXIT, 236, 219, 161, 141, 61, 151, 0, 207, 43, 118, 130, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, 27, 181, 175, 106, 80, 69, 243, 48, 239, 63, 85, 162, 234, 101, 186, 47, 192, 222, 28, 253, 77, 146, 117, 6, 138, 178, ImageAnalysisKt.OVER_EXPOSED_THRESHOLD, 14, 31, 98, ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE, 168, 150, 249, Opcodes.MULTIANEWARRAY, 37, 89, 132, 114, 57, 76, 94, 120, 56, 140, ErrorCodes.ERR_CRY_BAD_PROTO, 165, 226, 97, 179, 33, 156, 30, 67, Opcodes.IFNONNULL, 252, 4, 81, 153, 109, 13, 250, 223, 126, 36, 59, 171, 206, 17, 143, 78, 183, 235, 60, 129, 148, 247, 185, 19, 44, 211, 231, 110, 196, 3, 86, 68, 127, 169, 42, 187, Opcodes.INSTANCEOF, 83, 220, 11, 157, 108, 49, 116, 246, 70, 172, 137, 20, 225, 22, 58, 105, 9, 112, 182, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, 237, 204, 66, 152, 164, 40, 92, 248, 134};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long[] f88208k = new long[256];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long[] f88209l = new long[256];
    public static final long[] m = new long[256];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long[] f88210n = new long[256];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long[] f88211o = new long[256];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long[] f88212p = new long[256];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long[] f88213q = new long[256];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long[] f88214r = new long[256];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final short[] f88215s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f88216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f88217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short[] f88219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f88220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f88221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f88222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f88223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f88224i;

    static {
        short[] sArr = new short[32];
        f88215s = sArr;
        sArr[31] = 8;
    }

    public WhirlpoolDigest() {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long[] jArr5;
        long[] jArr6;
        long[] jArr7;
        long[] jArr8;
        this.f88216a = new long[11];
        this.f88217b = new byte[64];
        this.f88218c = 0;
        this.f88219d = new short[32];
        this.f88220e = new long[8];
        this.f88221f = new long[8];
        this.f88222g = new long[8];
        this.f88223h = new long[8];
        this.f88224i = new long[8];
        int i10 = 0;
        while (true) {
            jArr = f88214r;
            jArr2 = f88213q;
            jArr3 = f88212p;
            jArr4 = f88211o;
            jArr5 = f88210n;
            jArr6 = m;
            jArr7 = f88209l;
            jArr8 = f88208k;
            if (i10 >= 256) {
                break;
            }
            int i11 = f88207j[i10];
            int i12 = i11 << 1;
            int i13 = ((long) i12) >= 256 ? i12 ^ 285 : i12;
            int i14 = i13 << 1;
            int i15 = ((long) i14) >= 256 ? i14 ^ 285 : i14;
            int i16 = i15 ^ i11;
            int i17 = i15 << 1;
            if (i17 >= 256) {
                i17 ^= 285;
            }
            int i18 = i17;
            int i19 = i18 ^ i11;
            jArr8[i10] = a(i11, i11, i15, i11, i18, i16, i13, i19);
            jArr7[i10] = a(i19, i11, i11, i15, i11, i18, i16, i13);
            jArr6[i10] = a(i13, i19, i11, i11, i15, i11, i18, i16);
            jArr5[i10] = a(i16, i13, i19, i11, i11, i15, i11, i18);
            jArr4[i10] = a(i18, i16, i13, i19, i11, i11, i15, i11);
            jArr3[i10] = a(i11, i18, i16, i13, i19, i11, i11, i15);
            jArr2[i10] = a(i15, i11, i18, i16, i13, i19, i11, i11);
            jArr[i10] = a(i11, i15, i11, i18, i16, i13, i19, i11);
            i10++;
        }
        this.f88216a[0] = 0;
        for (int i20 = 1; i20 <= 10; i20++) {
            int i21 = (i20 - 1) * 8;
            this.f88216a[i20] = (((((((jArr8[i21] & (-72057594037927936L)) ^ (jArr7[i21 + 1] & 71776119061217280L)) ^ (jArr6[i21 + 2] & 280375465082880L)) ^ (jArr5[i21 + 3] & 1095216660480L)) ^ (jArr4[i21 + 4] & 4278190080L)) ^ (jArr3[i21 + 5] & 16711680)) ^ (jArr2[i21 + 6] & 65280)) ^ (jArr[i21 + 7] & 255);
        }
    }

    public static long a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        return (((((((((long) i11) << 48) ^ (((long) i10) << 56)) ^ (((long) i12) << 40)) ^ (((long) i13) << 32)) ^ (((long) i14) << 24)) ^ (((long) i15) << 16)) ^ (((long) i16) << 8)) ^ ((long) i17);
    }

    public final void b() {
        int i10 = 0;
        while (true) {
            int length = this.f88224i.length;
            byte[] bArr = this.f88217b;
            if (i10 >= length) {
                processBlock();
                this.f88218c = 0;
                Arrays.fill(bArr, (byte) 0);
                return;
            } else {
                int i11 = i10 * 8;
                this.f88223h[i10] = (((long) bArr[i11 + 7]) & 255) | ((((long) bArr[i11]) & 255) << 56) | ((((long) bArr[i11 + 1]) & 255) << 48) | ((((long) bArr[i11 + 2]) & 255) << 40) | ((((long) bArr[i11 + 3]) & 255) << 32) | ((((long) bArr[i11 + 4]) & 255) << 24) | ((((long) bArr[i11 + 5]) & 255) << 16) | ((((long) bArr[i11 + 6]) & 255) << 8);
                i10++;
            }
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new WhirlpoolDigest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[32];
        for (int i11 = 0; i11 < 32; i11++) {
            bArr2[i11] = (byte) (this.f88219d[i11] & 255);
        }
        int i12 = this.f88218c;
        int i13 = i12 + 1;
        this.f88218c = i13;
        byte[] bArr3 = this.f88217b;
        bArr3[i12] = (byte) (bArr3[i12] | 128);
        if (i13 == bArr3.length) {
            b();
        }
        if (this.f88218c > 32) {
            while (this.f88218c != 0) {
                update((byte) 0);
            }
        }
        while (this.f88218c <= 32) {
            update((byte) 0);
        }
        System.arraycopy(bArr2, 0, bArr3, 32, 32);
        b();
        for (int i14 = 0; i14 < 8; i14++) {
            long j10 = this.f88220e[i14];
            int i15 = (i14 * 8) + i10;
            for (int i16 = 0; i16 < 8; i16++) {
                bArr[i15 + i16] = (byte) ((j10 >> (56 - (i16 * 8))) & 255);
            }
        }
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Whirlpool";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 64;
    }

    public void processBlock() {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        int i10;
        long[] jArr5;
        long[] jArr6;
        long[] jArr7;
        char c10;
        long[] jArr8;
        long[] jArr9;
        long[] jArr10;
        int i11 = 0;
        while (true) {
            jArr = this.f88220e;
            jArr2 = this.f88223h;
            jArr3 = this.f88224i;
            jArr4 = this.f88221f;
            i10 = 8;
            if (i11 >= 8) {
                break;
            }
            long j10 = jArr2[i11];
            long j11 = jArr[i11];
            jArr4[i11] = j11;
            jArr3[i11] = j10 ^ j11;
            i11++;
        }
        int i12 = 1;
        while (i12 <= 10) {
            int i13 = 0;
            while (true) {
                jArr5 = f88211o;
                jArr6 = f88210n;
                jArr7 = m;
                c10 = '0';
                jArr8 = f88209l;
                jArr9 = f88208k;
                jArr10 = this.f88222g;
                if (i13 >= i10) {
                    break;
                }
                jArr10[i13] = 0;
                long j12 = jArr9[((int) (jArr4[i13 & 7] >>> 56)) & 255];
                jArr10[i13] = j12;
                long j13 = j12 ^ jArr8[((int) (jArr4[(i13 - 1) & 7] >>> 48)) & 255];
                jArr10[i13] = j13;
                long j14 = j13 ^ jArr7[((int) (jArr4[(i13 - 2) & 7] >>> 40)) & 255];
                jArr10[i13] = j14;
                long j15 = j14 ^ jArr6[((int) (jArr4[(i13 - 3) & 7] >>> 32)) & 255];
                jArr10[i13] = j15;
                long j16 = j15 ^ jArr5[((int) (jArr4[(i13 - 4) & 7] >>> 24)) & 255];
                jArr10[i13] = j16;
                long j17 = j16 ^ f88212p[((int) (jArr4[(i13 - 5) & 7] >>> 16)) & 255];
                jArr10[i13] = j17;
                long j18 = j17 ^ f88213q[((int) (jArr4[(i13 - 6) & 7] >>> i10)) & 255];
                jArr10[i13] = j18;
                jArr10[i13] = j18 ^ f88214r[((int) jArr4[(i13 - 7) & 7]) & 255];
                i13++;
            }
            System.arraycopy(jArr10, 0, jArr4, 0, jArr4.length);
            jArr4[0] = jArr4[0] ^ this.f88216a[i12];
            int i14 = 0;
            while (i14 < i10) {
                long j19 = jArr4[i14];
                jArr10[i14] = j19;
                long j20 = jArr9[((int) (jArr3[i14 & 7] >>> 56)) & 255] ^ j19;
                jArr10[i14] = j20;
                long j21 = j20 ^ jArr8[((int) (jArr3[(i14 - 1) & 7] >>> c10)) & 255];
                jArr10[i14] = j21;
                long j22 = j21 ^ jArr7[((int) (jArr3[(i14 - 2) & 7] >>> 40)) & 255];
                jArr10[i14] = j22;
                long j23 = j22 ^ jArr6[((int) (jArr3[(i14 - 3) & 7] >>> 32)) & 255];
                jArr10[i14] = j23;
                long j24 = j23 ^ jArr5[((int) (jArr3[(i14 - 4) & 7] >>> 24)) & 255];
                jArr10[i14] = j24;
                long j25 = j24 ^ f88212p[((int) (jArr3[(i14 - 5) & 7] >>> 16)) & 255];
                jArr10[i14] = j25;
                long j26 = j25 ^ f88213q[((int) (jArr3[(i14 - 6) & 7] >>> 8)) & 255];
                jArr10[i14] = j26;
                jArr10[i14] = j26 ^ f88214r[((int) jArr3[(i14 - 7) & 7]) & 255];
                i14++;
                i10 = 8;
                c10 = '0';
            }
            System.arraycopy(jArr10, 0, jArr3, 0, jArr3.length);
            i12++;
            i10 = 8;
        }
        int i15 = i10;
        for (int i16 = 0; i16 < i15; i16++) {
            jArr[i16] = jArr[i16] ^ (jArr3[i16] ^ jArr2[i16]);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.f88218c = 0;
        Arrays.fill(this.f88219d, (short) 0);
        Arrays.fill(this.f88217b, (byte) 0);
        Arrays.fill(this.f88220e, 0L);
        Arrays.fill(this.f88221f, 0L);
        Arrays.fill(this.f88222g, 0L);
        Arrays.fill(this.f88223h, 0L);
        Arrays.fill(this.f88224i, 0L);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        int i10 = this.f88218c;
        byte[] bArr = this.f88217b;
        bArr[i10] = b10;
        int i11 = i10 + 1;
        this.f88218c = i11;
        if (i11 == bArr.length) {
            b();
        }
        short[] sArr = this.f88219d;
        int i12 = 0;
        for (int length = sArr.length - 1; length >= 0; length--) {
            int i13 = (sArr[length] & 255) + f88215s[length] + i12;
            i12 = i13 >>> 8;
            sArr[length] = (short) (i13 & 255);
        }
    }

    public WhirlpoolDigest(WhirlpoolDigest whirlpoolDigest) {
        this.f88216a = new long[11];
        this.f88217b = new byte[64];
        this.f88218c = 0;
        this.f88219d = new short[32];
        this.f88220e = new long[8];
        this.f88221f = new long[8];
        this.f88222g = new long[8];
        this.f88223h = new long[8];
        this.f88224i = new long[8];
        reset(whirlpoolDigest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        WhirlpoolDigest whirlpoolDigest = (WhirlpoolDigest) memoable;
        long[] jArr = whirlpoolDigest.f88216a;
        long[] jArr2 = this.f88216a;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        byte[] bArr = this.f88217b;
        System.arraycopy(whirlpoolDigest.f88217b, 0, bArr, 0, bArr.length);
        this.f88218c = whirlpoolDigest.f88218c;
        short[] sArr = this.f88219d;
        System.arraycopy(whirlpoolDigest.f88219d, 0, sArr, 0, sArr.length);
        long[] jArr3 = this.f88220e;
        System.arraycopy(whirlpoolDigest.f88220e, 0, jArr3, 0, jArr3.length);
        long[] jArr4 = this.f88221f;
        System.arraycopy(whirlpoolDigest.f88221f, 0, jArr4, 0, jArr4.length);
        long[] jArr5 = this.f88222g;
        System.arraycopy(whirlpoolDigest.f88222g, 0, jArr5, 0, jArr5.length);
        long[] jArr6 = this.f88223h;
        System.arraycopy(whirlpoolDigest.f88223h, 0, jArr6, 0, jArr6.length);
        long[] jArr7 = this.f88224i;
        System.arraycopy(whirlpoolDigest.f88224i, 0, jArr7, 0, jArr7.length);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
    }
}
