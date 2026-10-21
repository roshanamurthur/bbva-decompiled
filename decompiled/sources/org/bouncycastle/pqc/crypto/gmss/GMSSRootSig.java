package org.bouncycastle.pqc.crypto.gmss;

import ad.d;
import androidx.appcompat.widget.a;
import androidx.camera.core.impl.utils.c;
import androidx.collection.h;
import java.lang.reflect.Array;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes13.dex */
public class GMSSRootSig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f91018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f91020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f91021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f91022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f91023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f91024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GMSSRandom f91025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f91026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f91027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f91028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f91029l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f91030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f91031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f91032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f91033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f91034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f91035s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte[] f91036t;

    public GMSSRootSig(Digest digest, int i10, int i11) {
        this.f91018a = digest;
        this.f91025h = new GMSSRandom(digest);
        int digestSize = digest.getDigestSize();
        this.f91019b = digestSize;
        this.f91024g = i10;
        this.f91035s = i11;
        this.f91027j = (1 << i10) - 1;
        this.f91026i = (int) Math.ceil(((double) (digestSize << 3)) / ((double) i10));
    }

    public int getLog(int i10) {
        int i11 = 1;
        int i12 = 2;
        while (i12 < i10) {
            i12 <<= 1;
            i11++;
        }
        return i11;
    }

    public byte[] getSig() {
        return this.f91023f;
    }

    public byte[][] getStatByte() {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 5, this.f91019b);
        bArr[0] = this.f91021d;
        bArr[1] = this.f91036t;
        bArr[2] = this.f91022e;
        bArr[3] = this.f91023f;
        bArr[4] = getStatLong();
        return bArr;
    }

    public int[] getStatInt() {
        return new int[]{this.m, this.f91029l, this.f91030n, this.f91028k, this.f91033q, this.f91020c, this.f91035s, this.f91024g, this.f91034r};
    }

    public byte[] getStatLong() {
        long j10 = this.f91031o;
        long j11 = this.f91032p;
        return new byte[]{(byte) (j10 & 255), (byte) ((j10 >> 8) & 255), (byte) ((j10 >> 16) & 255), (byte) ((j10 >> 24) & 255), (byte) ((j10 >> 32) & 255), (byte) ((j10 >> 40) & 255), (byte) ((j10 >> 48) & 255), (byte) ((j10 >> 56) & 255), (byte) (j11 & 255), (byte) ((j11 >> 8) & 255), (byte) ((j11 >> 16) & 255), (byte) ((j11 >> 24) & 255), (byte) ((j11 >> 32) & 255), (byte) ((j11 >> 40) & 255), (byte) ((j11 >> 48) & 255), (byte) ((j11 >> 56) & 255)};
    }

    public void initSign(byte[] bArr, byte[] bArr2) {
        int i10;
        int i11;
        int i12 = this.f91019b;
        this.f91022e = new byte[i12];
        int length = bArr2.length;
        Digest digest = this.f91018a;
        int i13 = 0;
        digest.update(bArr2, 0, length);
        byte[] bArr3 = new byte[digest.getDigestSize()];
        this.f91022e = bArr3;
        digest.doFinal(bArr3, 0);
        byte[] bArr4 = new byte[i12];
        System.arraycopy(this.f91022e, 0, bArr4, 0, i12);
        int i14 = this.f91026i;
        int i15 = this.f91024g;
        int log = getLog((i14 << i15) + 1);
        int i16 = 8 % i15;
        int i17 = this.f91027j;
        if (i16 == 0) {
            int i18 = 8 / i15;
            i11 = 0;
            for (int i19 = 0; i19 < i12; i19++) {
                for (int i20 = 0; i20 < i18; i20++) {
                    int i21 = bArr4[i19];
                    i11 += i21 & i17;
                    bArr4[i19] = (byte) (i21 >>> i15);
                }
            }
            int i22 = (i14 << i15) - i11;
            this.f91034r = i22;
            for (int i23 = 0; i23 < log; i23 += i15) {
                i11 += i22 & i17;
                i22 >>>= i15;
            }
            i10 = log;
        } else if (i15 < 8) {
            int i24 = i12 / i15;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            while (i25 < i24) {
                int i28 = i13;
                long j10 = 0;
                while (i28 < i15) {
                    j10 ^= (long) ((bArr4[i26] & 255) << (i28 << 3));
                    i26++;
                    i28++;
                    log = log;
                }
                int i29 = log;
                for (int i30 = 0; i30 < 8; i30++) {
                    i27 += (int) (j10 & ((long) i17));
                    j10 >>>= i15;
                }
                i25++;
                log = i29;
                i13 = 0;
            }
            int i31 = log;
            int i32 = i12 % i15;
            long j11 = 0;
            for (int i33 = 0; i33 < i32; i33++) {
                j11 ^= (long) ((bArr4[i26] & 255) << (i33 << 3));
                i26++;
            }
            int i34 = i32 << 3;
            for (int i35 = 0; i35 < i34; i35 += i15) {
                i27 += (int) (((long) i17) & j11);
                j11 >>>= i15;
            }
            int i36 = (i14 << i15) - i27;
            this.f91034r = i36;
            i10 = i31;
            i11 = i27;
            for (int i37 = 0; i37 < i10; i37 += i15) {
                i11 += i36 & i17;
                i36 >>>= i15;
            }
        } else {
            i10 = log;
            if (i15 < 57) {
                int i38 = 0;
                int i39 = 0;
                while (i38 <= (i12 << 3) - i15) {
                    int i40 = i38 >>> 3;
                    int i41 = i38 % 8;
                    int i42 = i38 + i15;
                    int i43 = (i42 + 7) >>> 3;
                    long j12 = 0;
                    int i44 = 0;
                    while (i40 < i43) {
                        j12 ^= (long) ((bArr4[i40] & 255) << (i44 << 3));
                        i44++;
                        i40++;
                        i10 = i10;
                        i42 = i42;
                    }
                    i39 = (int) (((long) i39) + ((j12 >>> i41) & ((long) i17)));
                    i10 = i10;
                    i38 = i42;
                }
                int i45 = i10;
                int i46 = i38 >>> 3;
                if (i46 < i12) {
                    int i47 = i38 % 8;
                    int i48 = 0;
                    long j13 = 0;
                    while (i46 < i12) {
                        j13 ^= (long) ((bArr4[i46] & 255) << (i48 << 3));
                        i48++;
                        i46++;
                    }
                    i39 = (int) (((long) i39) + ((j13 >>> i47) & ((long) i17)));
                }
                int i49 = (i14 << i15) - i39;
                this.f91034r = i49;
                i11 = i39;
                i10 = i45;
                for (int i50 = 0; i50 < i10; i50 += i15) {
                    i11 += i49 & i17;
                    i49 >>>= i15;
                }
            } else {
                i11 = 0;
            }
        }
        int iCeil = i14 + ((int) Math.ceil(((double) i10) / ((double) i15)));
        this.f91020c = iCeil;
        this.f91033q = (int) Math.ceil(((double) (iCeil + i11)) / ((double) (1 << this.f91035s)));
        this.f91023f = new byte[this.f91020c * i12];
        this.m = 0;
        this.f91029l = 0;
        this.f91030n = 0;
        this.f91031o = 0L;
        this.f91028k = 0;
        this.f91021d = new byte[i12];
        byte[] bArr5 = new byte[i12];
        this.f91036t = bArr5;
        System.arraycopy(bArr, 0, bArr5, 0, i12);
    }

    public String toString() {
        String strD = h.d(new StringBuilder(""), this.f91032p, "  ");
        int[] statInt = getStatInt();
        byte[][] statByte = getStatByte();
        for (int i10 = 0; i10 < 9; i10++) {
            strD = a.c(c.d(strD), statInt[i10], " ");
        }
        for (int i11 = 0; i11 < 5; i11++) {
            strD = d.f(c.d(strD), new String(Hex.encode(statByte[i11])), " ");
        }
        return strD;
    }

    public boolean updateSign() {
        int i10;
        for (int i11 = 0; i11 < this.f91033q; i11++) {
            int i12 = this.m;
            if (i12 < this.f91020c) {
                int i13 = this.f91024g;
                int i14 = 8 % i13;
                GMSSRandom gMSSRandom = this.f91025h;
                int i15 = this.f91027j;
                int i16 = this.f91019b;
                Digest digest = this.f91018a;
                if (i14 == 0) {
                    int i17 = this.f91029l;
                    if (i17 == 0) {
                        this.f91021d = gMSSRandom.nextSeed(this.f91036t);
                        int i18 = this.f91030n;
                        if (i18 < i16) {
                            byte[] bArr = this.f91022e;
                            byte b10 = bArr[i18];
                            this.f91029l = i15 & b10;
                            bArr[i18] = (byte) (b10 >>> i13);
                        } else {
                            int i19 = this.f91034r;
                            this.f91029l = i19 & i15;
                            this.f91034r = i19 >>> i13;
                        }
                    } else if (i17 > 0) {
                        byte[] bArr2 = this.f91021d;
                        digest.update(bArr2, 0, bArr2.length);
                        byte[] bArr3 = new byte[digest.getDigestSize()];
                        this.f91021d = bArr3;
                        digest.doFinal(bArr3, 0);
                        this.f91029l--;
                    }
                    if (this.f91029l == 0) {
                        System.arraycopy(this.f91021d, 0, this.f91023f, this.m * i16, i16);
                        int i20 = this.m + 1;
                        this.m = i20;
                        if (i20 % (8 / i13) == 0) {
                            this.f91030n++;
                        }
                    }
                } else if (i13 < 8) {
                    int i21 = this.f91029l;
                    if (i21 == 0) {
                        if (i12 % 8 == 0 && this.f91030n < i16) {
                            this.f91032p = 0L;
                            if (i12 < ((i16 / i13) << 3)) {
                                for (int i22 = 0; i22 < i13; i22++) {
                                    long j10 = this.f91032p;
                                    byte[] bArr4 = this.f91022e;
                                    int i23 = this.f91030n;
                                    this.f91032p = j10 ^ ((long) ((bArr4[i23] & 255) << (i22 << 3)));
                                    this.f91030n = i23 + 1;
                                }
                            } else {
                                for (int i24 = 0; i24 < i16 % i13; i24++) {
                                    long j11 = this.f91032p;
                                    byte[] bArr5 = this.f91022e;
                                    int i25 = this.f91030n;
                                    this.f91032p = j11 ^ ((long) ((bArr5[i25] & 255) << (i24 << 3)));
                                    this.f91030n = i25 + 1;
                                }
                            }
                        }
                        if (this.m == this.f91026i) {
                            this.f91032p = this.f91034r;
                        }
                        this.f91029l = (int) (this.f91032p & ((long) i15));
                        this.f91021d = gMSSRandom.nextSeed(this.f91036t);
                    } else if (i21 > 0) {
                        byte[] bArr6 = this.f91021d;
                        digest.update(bArr6, 0, bArr6.length);
                        byte[] bArr7 = new byte[digest.getDigestSize()];
                        this.f91021d = bArr7;
                        digest.doFinal(bArr7, 0);
                        this.f91029l--;
                    }
                    if (this.f91029l == 0) {
                        System.arraycopy(this.f91021d, 0, this.f91023f, this.m * i16, i16);
                        this.f91032p >>>= i13;
                        this.m++;
                    }
                } else if (i13 < 57) {
                    long j12 = this.f91031o;
                    if (j12 == 0) {
                        this.f91032p = 0L;
                        this.f91030n = 0;
                        int i26 = this.f91028k;
                        int i27 = i26 % 8;
                        int i28 = i26 >>> 3;
                        if (i28 < i16) {
                            if (i26 <= (i16 << 3) - i13) {
                                int i29 = i26 + i13;
                                this.f91028k = i29;
                                i10 = (i29 + 7) >>> 3;
                            } else {
                                this.f91028k = i26 + i13;
                                i10 = i16;
                            }
                            while (i28 < i10) {
                                long j13 = this.f91032p;
                                int i30 = this.f91022e[i28] & 255;
                                int i31 = this.f91030n;
                                this.f91032p = ((long) (i30 << (i31 << 3))) ^ j13;
                                this.f91030n = i31 + 1;
                                i28++;
                            }
                            long j14 = this.f91032p >>> i27;
                            this.f91032p = j14;
                            this.f91031o = j14 & ((long) i15);
                        } else {
                            int i32 = this.f91034r;
                            this.f91031o = i32 & i15;
                            this.f91034r = i32 >>> i13;
                        }
                        this.f91021d = gMSSRandom.nextSeed(this.f91036t);
                    } else if (j12 > 0) {
                        byte[] bArr8 = this.f91021d;
                        digest.update(bArr8, 0, bArr8.length);
                        byte[] bArr9 = new byte[digest.getDigestSize()];
                        this.f91021d = bArr9;
                        digest.doFinal(bArr9, 0);
                        this.f91031o--;
                    }
                    if (this.f91031o == 0) {
                        System.arraycopy(this.f91021d, 0, this.f91023f, this.m * i16, i16);
                        this.m++;
                    }
                }
            }
            if (this.m == this.f91020c) {
                return true;
            }
        }
        return false;
    }

    public GMSSRootSig(Digest digest, byte[][] bArr, int[] iArr) {
        this.f91018a = digest;
        this.f91025h = new GMSSRandom(digest);
        this.m = iArr[0];
        this.f91029l = iArr[1];
        this.f91030n = iArr[2];
        this.f91028k = iArr[3];
        this.f91033q = iArr[4];
        this.f91020c = iArr[5];
        this.f91035s = iArr[6];
        int i10 = iArr[7];
        this.f91024g = i10;
        this.f91034r = iArr[8];
        int digestSize = digest.getDigestSize();
        this.f91019b = digestSize;
        this.f91027j = (1 << i10) - 1;
        this.f91026i = (int) Math.ceil(((double) (digestSize << 3)) / ((double) i10));
        this.f91021d = bArr[0];
        this.f91036t = bArr[1];
        this.f91022e = bArr[2];
        this.f91023f = bArr[3];
        byte[] bArr2 = bArr[4];
        this.f91031o = (((long) (bArr2[1] & 255)) << 8) | ((long) (bArr2[0] & 255)) | (((long) (bArr2[2] & 255)) << 16) | (((long) (bArr2[3] & 255)) << 24) | (((long) (bArr2[4] & 255)) << 32) | (((long) (bArr2[5] & 255)) << 40) | (((long) (bArr2[6] & 255)) << 48) | (((long) (bArr2[7] & 255)) << 56);
        this.f91032p = ((long) (bArr2[8] & 255)) | (((long) (bArr2[9] & 255)) << 8) | (((long) (bArr2[10] & 255)) << 16) | (((long) (bArr2[11] & 255)) << 24) | (((long) (bArr2[12] & 255)) << 32) | (((long) (bArr2[13] & 255)) << 40) | (((long) (bArr2[14] & 255)) << 48) | (((long) (bArr2[15] & 255)) << 56);
    }
}
