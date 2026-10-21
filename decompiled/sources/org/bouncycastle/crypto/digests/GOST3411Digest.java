package org.bouncycastle.crypto.digests;

import androidx.core.view.MotionEventCompat;
import java.lang.reflect.Array;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.engines.GOST28147Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class GOST3411Digest implements ExtendedDigest, Memoable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f88032s = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f88033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f88034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f88035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f88036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[][] f88037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f88038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f88039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f88040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GOST28147Engine f88041i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f88042j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f88043k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f88044l;
    public final short[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final short[] f88045n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f88046o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f88047p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f88048q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final byte[] f88049r;

    public GOST3411Digest() {
        this.f88033a = new byte[32];
        this.f88034b = new byte[32];
        this.f88035c = new byte[32];
        this.f88036d = new byte[32];
        this.f88037e = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.f88038f = new byte[32];
        GOST28147Engine gOST28147Engine = new GOST28147Engine();
        this.f88041i = gOST28147Engine;
        this.f88043k = new byte[32];
        this.f88044l = new byte[8];
        this.m = new short[16];
        this.f88045n = new short[16];
        this.f88046o = new byte[32];
        this.f88047p = new byte[32];
        this.f88048q = new byte[32];
        this.f88049r = new byte[32];
        byte[] sBox = GOST28147Engine.getSBox("D-A");
        this.f88042j = sBox;
        gOST28147Engine.init(true, new ParametersWithSBox(null, sBox));
        reset();
    }

    public final void a(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = this.f88044l;
            if (i10 >= 8) {
                System.arraycopy(bArr, 8, bArr, 0, 24);
                System.arraycopy(bArr2, 0, bArr, 24, 8);
                return;
            } else {
                bArr2[i10] = (byte) (bArr[i10] ^ bArr[i10 + 8]);
                i10++;
            }
        }
    }

    public final byte[] b(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = this.f88043k;
            if (i10 >= 8) {
                return bArr2;
            }
            int i11 = i10 * 4;
            bArr2[i11] = bArr[i10];
            bArr2[i11 + 1] = bArr[i10 + 8];
            bArr2[i11 + 2] = bArr[i10 + 16];
            bArr2[i11 + 3] = bArr[i10 + 24];
            i10++;
        }
    }

    public final void c(byte[] bArr) {
        short[] sArr;
        int i10 = 0;
        while (true) {
            int length = bArr.length / 2;
            sArr = this.m;
            if (i10 >= length) {
                break;
            }
            int i11 = i10 * 2;
            sArr[i10] = (short) ((bArr[i11] & 255) | ((bArr[i11 + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK));
            i10++;
        }
        short s4 = (short) (((((sArr[0] ^ sArr[1]) ^ sArr[2]) ^ sArr[3]) ^ sArr[12]) ^ sArr[15]);
        short[] sArr2 = this.f88045n;
        sArr2[15] = s4;
        System.arraycopy(sArr, 1, sArr2, 0, 15);
        for (int i12 = 0; i12 < bArr.length / 2; i12++) {
            int i13 = i12 * 2;
            short s7 = sArr2[i12];
            bArr[i13 + 1] = (byte) (s7 >> 8);
            bArr[i13] = (byte) s7;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new GOST3411Digest(this);
    }

    public final void d(byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = this.f88036d;
            if (i10 == bArr2.length) {
                return;
            }
            int i12 = (bArr2[i10] & 255) + (bArr[i10] & 255) + i11;
            bArr2[i10] = (byte) i12;
            i11 = i12 >>> 8;
            i10++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        long j10 = this.f88040h * 8;
        byte[] bArr2 = this.f88034b;
        Pack.longToLittleEndian(j10, bArr2, 0);
        while (this.f88039g != 0) {
            update((byte) 0);
        }
        processBlock(bArr2, 0);
        processBlock(this.f88036d, 0);
        byte[] bArr3 = this.f88033a;
        System.arraycopy(bArr3, 0, bArr, i10, bArr3.length);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "GOST3411";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    public void processBlock(byte[] bArr, int i10) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4 = this.f88035c;
        System.arraycopy(bArr, i10, bArr4, 0, 32);
        byte[] bArr5 = this.f88033a;
        byte[] bArr6 = this.f88047p;
        System.arraycopy(bArr5, 0, bArr6, 0, 32);
        System.arraycopy(bArr4, 0, this.f88048q, 0, 32);
        int i11 = 0;
        while (true) {
            bArr2 = this.f88049r;
            if (i11 >= 32) {
                break;
            }
            bArr2[i11] = (byte) (bArr6[i11] ^ this.f88048q[i11]);
            i11++;
        }
        byte[] bArrB = b(bArr2);
        byte[] bArr7 = this.f88046o;
        byte[] bArr8 = this.f88033a;
        KeyParameter keyParameter = new KeyParameter(bArrB);
        GOST28147Engine gOST28147Engine = this.f88041i;
        gOST28147Engine.init(true, keyParameter);
        gOST28147Engine.processBlock(bArr8, 0, bArr7, 0);
        for (int i12 = 1; i12 < 4; i12++) {
            a(bArr6);
            for (int i13 = 0; i13 < 32; i13++) {
                bArr6[i13] = (byte) (bArr6[i13] ^ this.f88037e[i12][i13]);
            }
            byte[] bArr9 = this.f88048q;
            a(bArr9);
            a(bArr9);
            this.f88048q = bArr9;
            for (int i14 = 0; i14 < 32; i14++) {
                bArr2[i14] = (byte) (bArr6[i14] ^ this.f88048q[i14]);
            }
            byte[] bArrB2 = b(bArr2);
            byte[] bArr10 = this.f88046o;
            int i15 = i12 * 8;
            byte[] bArr11 = this.f88033a;
            KeyParameter keyParameter2 = new KeyParameter(bArrB2);
            GOST28147Engine gOST28147Engine2 = this.f88041i;
            gOST28147Engine2.init(true, keyParameter2);
            gOST28147Engine2.processBlock(bArr11, i15, bArr10, i15);
        }
        int i16 = 0;
        while (true) {
            bArr3 = this.f88046o;
            if (i16 >= 12) {
                break;
            }
            c(bArr3);
            i16++;
        }
        for (int i17 = 0; i17 < 32; i17++) {
            bArr3[i17] = (byte) (bArr3[i17] ^ bArr4[i17]);
        }
        c(bArr3);
        for (int i18 = 0; i18 < 32; i18++) {
            bArr3[i18] = (byte) (bArr5[i18] ^ bArr3[i18]);
        }
        for (int i19 = 0; i19 < 61; i19++) {
            c(bArr3);
        }
        System.arraycopy(bArr3, 0, bArr5, 0, bArr5.length);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        byte[][] bArr;
        this.f88040h = 0L;
        this.f88039g = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr2 = this.f88033a;
            if (i10 >= bArr2.length) {
                break;
            }
            bArr2[i10] = 0;
            i10++;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr3 = this.f88034b;
            if (i11 >= bArr3.length) {
                break;
            }
            bArr3[i11] = 0;
            i11++;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr4 = this.f88035c;
            if (i12 >= bArr4.length) {
                break;
            }
            bArr4[i12] = 0;
            i12++;
        }
        int i13 = 0;
        while (true) {
            bArr = this.f88037e;
            byte[] bArr5 = bArr[1];
            if (i13 >= bArr5.length) {
                break;
            }
            bArr5[i13] = 0;
            i13++;
        }
        int i14 = 0;
        while (true) {
            byte[] bArr6 = bArr[3];
            if (i14 >= bArr6.length) {
                break;
            }
            bArr6[i14] = 0;
            i14++;
        }
        int i15 = 0;
        while (true) {
            byte[] bArr7 = this.f88036d;
            if (i15 >= bArr7.length) {
                break;
            }
            bArr7[i15] = 0;
            i15++;
        }
        int i16 = 0;
        while (true) {
            byte[] bArr8 = this.f88038f;
            if (i16 >= bArr8.length) {
                System.arraycopy(f88032s, 0, bArr[2], 0, 32);
                return;
            } else {
                bArr8[i16] = 0;
                i16++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        int i10 = this.f88039g;
        int i11 = i10 + 1;
        this.f88039g = i11;
        byte[] bArr = this.f88038f;
        bArr[i10] = b10;
        if (i11 == bArr.length) {
            d(bArr);
            processBlock(bArr, 0);
            this.f88039g = 0;
        }
        this.f88040h++;
    }

    public GOST3411Digest(GOST3411Digest gOST3411Digest) {
        this.f88033a = new byte[32];
        this.f88034b = new byte[32];
        this.f88035c = new byte[32];
        this.f88036d = new byte[32];
        this.f88037e = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.f88038f = new byte[32];
        this.f88041i = new GOST28147Engine();
        this.f88043k = new byte[32];
        this.f88044l = new byte[8];
        this.m = new short[16];
        this.f88045n = new short[16];
        this.f88046o = new byte[32];
        this.f88047p = new byte[32];
        this.f88048q = new byte[32];
        this.f88049r = new byte[32];
        reset(gOST3411Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        GOST3411Digest gOST3411Digest = (GOST3411Digest) memoable;
        byte[] bArr = gOST3411Digest.f88042j;
        this.f88042j = bArr;
        this.f88041i.init(true, new ParametersWithSBox(null, bArr));
        reset();
        byte[] bArr2 = this.f88033a;
        byte[] bArr3 = gOST3411Digest.f88033a;
        System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        byte[] bArr4 = this.f88034b;
        byte[] bArr5 = gOST3411Digest.f88034b;
        System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
        byte[] bArr6 = this.f88035c;
        byte[] bArr7 = gOST3411Digest.f88035c;
        System.arraycopy(bArr7, 0, bArr6, 0, bArr7.length);
        byte[] bArr8 = this.f88036d;
        byte[] bArr9 = gOST3411Digest.f88036d;
        System.arraycopy(bArr9, 0, bArr8, 0, bArr9.length);
        byte[][] bArr10 = gOST3411Digest.f88037e;
        byte[] bArr11 = bArr10[1];
        byte[][] bArr12 = this.f88037e;
        System.arraycopy(bArr11, 0, bArr12[1], 0, bArr11.length);
        byte[] bArr13 = bArr10[2];
        System.arraycopy(bArr13, 0, bArr12[2], 0, bArr13.length);
        byte[] bArr14 = bArr10[3];
        System.arraycopy(bArr14, 0, bArr12[3], 0, bArr14.length);
        byte[] bArr15 = this.f88038f;
        byte[] bArr16 = gOST3411Digest.f88038f;
        System.arraycopy(bArr16, 0, bArr15, 0, bArr16.length);
        this.f88039g = gOST3411Digest.f88039g;
        this.f88040h = gOST3411Digest.f88040h;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        while (this.f88039g != 0 && i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
        while (true) {
            byte[] bArr2 = this.f88038f;
            if (i11 <= bArr2.length) {
                break;
            }
            System.arraycopy(bArr, i10, bArr2, 0, bArr2.length);
            d(bArr2);
            processBlock(bArr2, 0);
            i10 += bArr2.length;
            i11 -= bArr2.length;
            this.f88040h += (long) bArr2.length;
        }
        while (i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
    }

    public GOST3411Digest(byte[] bArr) {
        this.f88033a = new byte[32];
        this.f88034b = new byte[32];
        this.f88035c = new byte[32];
        this.f88036d = new byte[32];
        this.f88037e = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.f88038f = new byte[32];
        GOST28147Engine gOST28147Engine = new GOST28147Engine();
        this.f88041i = gOST28147Engine;
        this.f88043k = new byte[32];
        this.f88044l = new byte[8];
        this.m = new short[16];
        this.f88045n = new short[16];
        this.f88046o = new byte[32];
        this.f88047p = new byte[32];
        this.f88048q = new byte[32];
        this.f88049r = new byte[32];
        byte[] bArrClone = Arrays.clone(bArr);
        this.f88042j = bArrClone;
        gOST28147Engine.init(true, new ParametersWithSBox(null, bArrClone));
        reset();
    }
}
