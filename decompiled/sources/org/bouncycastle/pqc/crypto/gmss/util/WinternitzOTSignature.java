package org.bouncycastle.pqc.crypto.gmss.util;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes13.dex */
public class WinternitzOTSignature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f91068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[][] f91071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f91072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GMSSRandom f91073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f91074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f91075h;

    public WinternitzOTSignature(byte[] bArr, Digest digest, int i10) {
        this.f91072e = i10;
        this.f91068a = digest;
        this.f91073f = new GMSSRandom(digest);
        int digestSize = digest.getDigestSize();
        this.f91069b = digestSize;
        double d2 = i10;
        int iCeil = (int) Math.ceil(((double) (digestSize << 3)) / d2);
        this.f91074g = iCeil;
        int log = getLog((iCeil << i10) + 1);
        this.f91075h = log;
        int iCeil2 = iCeil + ((int) Math.ceil(((double) log) / d2));
        this.f91070c = iCeil2;
        this.f91071d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, iCeil2, digestSize);
        byte[] bArr2 = new byte[digestSize];
        System.arraycopy(bArr, 0, bArr2, 0, digestSize);
        for (int i11 = 0; i11 < this.f91070c; i11++) {
            this.f91071d[i11] = this.f91073f.nextSeed(bArr2);
        }
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

    public byte[][] getPrivateKey() {
        return this.f91071d;
    }

    public byte[] getPublicKey() {
        int i10 = this.f91070c;
        int i11 = this.f91069b;
        int i12 = i10 * i11;
        byte[] bArr = new byte[i12];
        byte[] bArr2 = new byte[i11];
        int i13 = 1 << this.f91072e;
        int i14 = 0;
        while (true) {
            Digest digest = this.f91068a;
            if (i14 >= i10) {
                digest.update(bArr, 0, i12);
                byte[] bArr3 = new byte[digest.getDigestSize()];
                digest.doFinal(bArr3, 0);
                return bArr3;
            }
            byte[] bArr4 = this.f91071d[i14];
            digest.update(bArr4, 0, bArr4.length);
            byte[] bArr5 = new byte[digest.getDigestSize()];
            digest.doFinal(bArr5, 0);
            for (int i15 = 2; i15 < i13; i15++) {
                digest.update(bArr5, 0, bArr5.length);
                bArr5 = new byte[digest.getDigestSize()];
                digest.doFinal(bArr5, 0);
            }
            System.arraycopy(bArr5, 0, bArr, i11 * i14, i11);
            i14++;
        }
    }

    public byte[] getSignature(byte[] bArr) {
        int i10;
        int i11;
        int i12;
        int i13 = this.f91070c;
        int i14 = this.f91069b;
        byte[] bArr2 = new byte[i13 * i14];
        byte[] bArr3 = new byte[i14];
        int length = bArr.length;
        Digest digest = this.f91068a;
        int i15 = 0;
        digest.update(bArr, 0, length);
        int digestSize = digest.getDigestSize();
        byte[] bArr4 = new byte[digestSize];
        digest.doFinal(bArr4, 0);
        int i16 = 8;
        int i17 = this.f91072e;
        int i18 = 8 % i17;
        int i19 = this.f91075h;
        int i20 = this.f91074g;
        byte[][] bArr5 = this.f91071d;
        if (i18 == 0) {
            int i21 = 8 / i17;
            int i22 = (1 << i17) - 1;
            byte[] bArr6 = new byte[i14];
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            while (i23 < digestSize) {
                while (i15 < i21) {
                    int i26 = bArr4[i23] & i22;
                    i24 += i26;
                    int i27 = digestSize;
                    System.arraycopy(bArr5[i25], 0, bArr6, 0, i14);
                    while (i26 > 0) {
                        digest.update(bArr6, 0, bArr6.length);
                        bArr6 = new byte[digest.getDigestSize()];
                        digest.doFinal(bArr6, 0);
                        i26--;
                    }
                    System.arraycopy(bArr6, 0, bArr2, i25 * i14, i14);
                    bArr4[i23] = (byte) (bArr4[i23] >>> i17);
                    i25++;
                    i15++;
                    digestSize = i27;
                }
                i23++;
                i15 = 0;
            }
            int i28 = (i20 << i17) - i24;
            for (int i29 = 0; i29 < i19; i29 += i17) {
                System.arraycopy(bArr5[i25], 0, bArr6, 0, i14);
                for (int i30 = i28 & i22; i30 > 0; i30--) {
                    digest.update(bArr6, 0, bArr6.length);
                    bArr6 = new byte[digest.getDigestSize()];
                    digest.doFinal(bArr6, 0);
                }
                System.arraycopy(bArr6, 0, bArr2, i25 * i14, i14);
                i28 >>>= i17;
                i25++;
            }
        } else if (i17 < 8) {
            int i31 = i14 / i17;
            int i32 = (1 << i17) - 1;
            byte[] bArr7 = new byte[i14];
            int i33 = 0;
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            while (i33 < i31) {
                int i37 = 0;
                long j10 = 0;
                while (i37 < i17) {
                    j10 ^= (long) ((bArr4[i34] & 255) << (i37 << 3));
                    i34++;
                    i37++;
                    bArr7 = bArr7;
                }
                int i38 = 0;
                while (true) {
                    int i39 = i17;
                    if (i38 < i16) {
                        int i40 = (int) (j10 & ((long) i32));
                        i36 += i40;
                        System.arraycopy(bArr5[i35], 0, bArr7, 0, i14);
                        while (i40 > 0) {
                            digest.update(bArr7, 0, bArr7.length);
                            bArr7 = new byte[digest.getDigestSize()];
                            digest.doFinal(bArr7, 0);
                            i40--;
                        }
                        System.arraycopy(bArr7, 0, bArr2, i35 * i14, i14);
                        j10 >>>= i39;
                        i35++;
                        i38++;
                        i17 = i39;
                        i16 = 8;
                    }
                }
                i33++;
                i16 = 8;
            }
            int i41 = i17;
            byte[] bArr8 = bArr7;
            int i42 = i14 % i41;
            long j11 = 0;
            for (int i43 = 0; i43 < i42; i43++) {
                j11 ^= (long) ((bArr4[i34] & 255) << (i43 << 3));
                i34++;
            }
            int i44 = i42 << 3;
            byte[] bArr9 = bArr8;
            for (int i45 = 0; i45 < i44; i45 += i41) {
                int i46 = (int) (j11 & ((long) i32));
                i36 += i46;
                System.arraycopy(bArr5[i35], 0, bArr9, 0, i14);
                while (i46 > 0) {
                    digest.update(bArr9, 0, bArr9.length);
                    bArr9 = new byte[digest.getDigestSize()];
                    digest.doFinal(bArr9, 0);
                    i46--;
                }
                System.arraycopy(bArr9, 0, bArr2, i35 * i14, i14);
                j11 >>>= i41;
                i35++;
            }
            int i47 = (i20 << i41) - i36;
            for (int i48 = 0; i48 < i19; i48 += i41) {
                System.arraycopy(bArr5[i35], 0, bArr9, 0, i14);
                for (int i49 = i47 & i32; i49 > 0; i49--) {
                    digest.update(bArr9, 0, bArr9.length);
                    bArr9 = new byte[digest.getDigestSize()];
                    digest.doFinal(bArr9, 0);
                }
                System.arraycopy(bArr9, 0, bArr2, i35 * i14, i14);
                i47 >>>= i41;
                i35++;
            }
        } else {
            int i50 = i17;
            if (i50 < 57) {
                int i51 = (i14 << 3) - i50;
                int i52 = (1 << i50) - 1;
                byte[] bArr10 = new byte[i14];
                int i53 = 0;
                int i54 = 0;
                int i55 = 0;
                while (i55 <= i51) {
                    int i56 = i55 >>> 3;
                    int i57 = i55 % 8;
                    int i58 = i55 + i50;
                    int i59 = (i58 + 7) >>> 3;
                    int i60 = i56;
                    int i61 = 0;
                    long j12 = 0;
                    while (true) {
                        i12 = i51;
                        if (i60 >= i59) {
                            break;
                        }
                        j12 ^= (long) ((bArr4[i60] & 255) << (i61 << 3));
                        i61++;
                        i60++;
                        i51 = i12;
                        i58 = i58;
                        i59 = i59;
                    }
                    int i62 = i58;
                    int i63 = i50;
                    long j13 = ((long) i52) & (j12 >>> i57);
                    i54 = (int) (((long) i54) + j13);
                    System.arraycopy(bArr5[i53], 0, bArr10, 0, i14);
                    while (j13 > 0) {
                        digest.update(bArr10, 0, bArr10.length);
                        bArr10 = new byte[digest.getDigestSize()];
                        digest.doFinal(bArr10, 0);
                        j13--;
                    }
                    System.arraycopy(bArr10, 0, bArr2, i53 * i14, i14);
                    i53++;
                    i50 = i63;
                    i51 = i12;
                    i55 = i62;
                }
                int i64 = i50;
                int i65 = i55 >>> 3;
                if (i65 < i14) {
                    int i66 = i55 % 8;
                    int i67 = 0;
                    long j14 = 0;
                    while (i65 < i14) {
                        j14 ^= (long) ((bArr4[i65] & 255) << (i67 << 3));
                        i67++;
                        i65++;
                        i19 = i19;
                        i20 = i20;
                    }
                    i10 = i19;
                    i11 = i20;
                    long j15 = (j14 >>> i66) & ((long) i52);
                    i54 = (int) (((long) i54) + j15);
                    System.arraycopy(bArr5[i53], 0, bArr10, 0, i14);
                    while (j15 > 0) {
                        digest.update(bArr10, 0, bArr10.length);
                        bArr10 = new byte[digest.getDigestSize()];
                        digest.doFinal(bArr10, 0);
                        j15--;
                    }
                    System.arraycopy(bArr10, 0, bArr2, i53 * i14, i14);
                    i53++;
                } else {
                    i10 = i19;
                    i11 = i20;
                }
                int i68 = (i11 << i64) - i54;
                int i69 = i10;
                for (int i70 = 0; i70 < i69; i70 += i64) {
                    System.arraycopy(bArr5[i53], 0, bArr10, 0, i14);
                    for (long j16 = i68 & i52; j16 > 0; j16--) {
                        digest.update(bArr10, 0, bArr10.length);
                        bArr10 = new byte[digest.getDigestSize()];
                        digest.doFinal(bArr10, 0);
                    }
                    System.arraycopy(bArr10, 0, bArr2, i53 * i14, i14);
                    i68 >>>= i64;
                    i53++;
                }
            }
        }
        return bArr2;
    }
}
