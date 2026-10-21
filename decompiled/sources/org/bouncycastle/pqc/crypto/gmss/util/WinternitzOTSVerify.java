package org.bouncycastle.pqc.crypto.gmss.util;

import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes13.dex */
public class WinternitzOTSVerify {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f91066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91067b;

    public WinternitzOTSVerify(Digest digest, int i10) {
        this.f91067b = i10;
        this.f91066a = digest;
    }

    public byte[] Verify(byte[] bArr, byte[] bArr2) {
        int i10;
        int i11;
        Digest digest = this.f91066a;
        int digestSize = digest.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        int i12 = 0;
        digest.update(bArr, 0, bArr.length);
        int digestSize2 = digest.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        digest.doFinal(bArr4, 0);
        int i13 = digestSize << 3;
        int i14 = this.f91067b;
        int i15 = ((i14 - 1) + i13) / i14;
        int log = getLog((i15 << i14) + 1);
        int i16 = ((((log + i14) - 1) / i14) + i15) * digestSize;
        if (i16 != bArr2.length) {
            return null;
        }
        byte[] bArr5 = new byte[i16];
        int i17 = 8;
        if (8 % i14 == 0) {
            int i18 = 8 / i14;
            int i19 = (1 << i14) - 1;
            byte[] bArr6 = new byte[digestSize];
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (i20 < digestSize2) {
                while (i12 < i18) {
                    int i23 = bArr4[i20] & i19;
                    i21 += i23;
                    int i24 = i22 * digestSize;
                    int i25 = digestSize2;
                    System.arraycopy(bArr2, i24, bArr6, 0, digestSize);
                    int i26 = i23;
                    while (i26 < i19) {
                        digest.update(bArr6, 0, bArr6.length);
                        bArr6 = new byte[digest.getDigestSize()];
                        digest.doFinal(bArr6, 0);
                        i26++;
                        i18 = i18;
                        i16 = i16;
                    }
                    System.arraycopy(bArr6, 0, bArr5, i24, digestSize);
                    bArr4[i20] = (byte) (bArr4[i20] >>> i14);
                    i22++;
                    i12++;
                    digestSize2 = i25;
                    i16 = i16;
                }
                i20++;
                i12 = 0;
            }
            i10 = i16;
            int i27 = (i15 << i14) - i21;
            for (int i28 = 0; i28 < log; i28 += i14) {
                int i29 = i22 * digestSize;
                System.arraycopy(bArr2, i29, bArr6, 0, digestSize);
                for (int i30 = i27 & i19; i30 < i19; i30++) {
                    digest.update(bArr6, 0, bArr6.length);
                    bArr6 = new byte[digest.getDigestSize()];
                    digest.doFinal(bArr6, 0);
                }
                System.arraycopy(bArr6, 0, bArr5, i29, digestSize);
                i27 >>>= i14;
                i22++;
            }
        } else {
            i10 = i16;
            if (i14 < 8) {
                int i31 = digestSize / i14;
                int i32 = (1 << i14) - 1;
                byte[] bArr7 = new byte[digestSize];
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                while (i33 < i31) {
                    int i37 = 0;
                    long j10 = 0;
                    while (i37 < i14) {
                        j10 ^= (long) ((bArr4[i34] & 255) << (i37 << 3));
                        i34++;
                        i37++;
                        bArr7 = bArr7;
                    }
                    int i38 = 0;
                    while (i38 < i17) {
                        int i39 = i33;
                        int i40 = (int) (j10 & ((long) i32));
                        i35 += i40;
                        int i41 = i36 * digestSize;
                        System.arraycopy(bArr2, i41, bArr7, 0, digestSize);
                        while (true) {
                            int i42 = i31;
                            if (i40 < i32) {
                                digest.update(bArr7, 0, bArr7.length);
                                bArr7 = new byte[digest.getDigestSize()];
                                digest.doFinal(bArr7, 0);
                                i40++;
                                i31 = i42;
                            }
                        }
                        System.arraycopy(bArr7, 0, bArr5, i41, digestSize);
                        j10 >>>= i14;
                        i36++;
                        i38++;
                        i33 = i39;
                        i17 = 8;
                    }
                    i33++;
                    i17 = 8;
                }
                byte[] bArr8 = bArr7;
                int i43 = digestSize % i14;
                long j11 = 0;
                for (int i44 = 0; i44 < i43; i44++) {
                    j11 ^= (long) ((bArr4[i34] & 255) << (i44 << 3));
                    i34++;
                }
                int i45 = i43 << 3;
                byte[] bArr9 = bArr8;
                for (int i46 = 0; i46 < i45; i46 += i14) {
                    int i47 = (int) (j11 & ((long) i32));
                    i35 += i47;
                    int i48 = i36 * digestSize;
                    System.arraycopy(bArr2, i48, bArr9, 0, digestSize);
                    while (i47 < i32) {
                        digest.update(bArr9, 0, bArr9.length);
                        bArr9 = new byte[digest.getDigestSize()];
                        digest.doFinal(bArr9, 0);
                        i47++;
                    }
                    System.arraycopy(bArr9, 0, bArr5, i48, digestSize);
                    j11 >>>= i14;
                    i36++;
                }
                int i49 = (i15 << i14) - i35;
                for (int i50 = 0; i50 < log; i50 += i14) {
                    int i51 = i36 * digestSize;
                    System.arraycopy(bArr2, i51, bArr9, 0, digestSize);
                    for (int i52 = i49 & i32; i52 < i32; i52++) {
                        digest.update(bArr9, 0, bArr9.length);
                        bArr9 = new byte[digest.getDigestSize()];
                        digest.doFinal(bArr9, 0);
                    }
                    System.arraycopy(bArr9, 0, bArr5, i51, digestSize);
                    i49 >>>= i14;
                    i36++;
                }
            } else if (i14 < 57) {
                int i53 = i13 - i14;
                int i54 = (1 << i14) - 1;
                byte[] bArr10 = new byte[digestSize];
                int i55 = 0;
                int i56 = 0;
                int i57 = 0;
                while (i57 <= i53) {
                    int i58 = i57 >>> 3;
                    int i59 = i57 % 8;
                    i57 += i14;
                    int i60 = (i57 + 7) >>> 3;
                    int i61 = i58;
                    int i62 = 0;
                    long j12 = 0;
                    while (true) {
                        i11 = i53;
                        if (i61 >= i60) {
                            break;
                        }
                        j12 ^= (long) ((bArr4[i61] & 255) << (i62 << 3));
                        i62++;
                        i61++;
                        i53 = i11;
                        i14 = i14;
                    }
                    int i63 = i14;
                    long j13 = i54;
                    long j14 = (j12 >>> i59) & j13;
                    int i64 = i15;
                    int i65 = log;
                    i55 = (int) (((long) i55) + j14);
                    int i66 = i56 * digestSize;
                    System.arraycopy(bArr2, i66, bArr10, 0, digestSize);
                    while (true) {
                        int i67 = i55;
                        if (j14 < j13) {
                            digest.update(bArr10, 0, bArr10.length);
                            bArr10 = new byte[digest.getDigestSize()];
                            digest.doFinal(bArr10, 0);
                            j14++;
                            i55 = i67;
                        }
                    }
                    System.arraycopy(bArr10, 0, bArr5, i66, digestSize);
                    i56++;
                    log = i65;
                    i15 = i64;
                    i53 = i11;
                    i14 = i63;
                }
                int i68 = i14;
                int i69 = i15;
                int i70 = log;
                int i71 = i57 >>> 3;
                if (i71 < digestSize) {
                    int i72 = i57 % 8;
                    int i73 = 0;
                    long j15 = 0;
                    while (i71 < digestSize) {
                        j15 ^= (long) ((bArr4[i71] & 255) << (i73 << 3));
                        i73++;
                        i71++;
                    }
                    long j16 = i54;
                    long j17 = (j15 >>> i72) & j16;
                    i55 = (int) (((long) i55) + j17);
                    int i74 = i56 * digestSize;
                    System.arraycopy(bArr2, i74, bArr10, 0, digestSize);
                    while (j17 < j16) {
                        digest.update(bArr10, 0, bArr10.length);
                        bArr10 = new byte[digest.getDigestSize()];
                        digest.doFinal(bArr10, 0);
                        j17++;
                    }
                    System.arraycopy(bArr10, 0, bArr5, i74, digestSize);
                    i56++;
                }
                int i75 = (i69 << i68) - i55;
                for (int i76 = 0; i76 < i70; i76 += i68) {
                    int i77 = i56 * digestSize;
                    System.arraycopy(bArr2, i77, bArr10, 0, digestSize);
                    for (long j18 = i75 & i54; j18 < i54; j18++) {
                        digest.update(bArr10, 0, bArr10.length);
                        bArr10 = new byte[digest.getDigestSize()];
                        digest.doFinal(bArr10, 0);
                    }
                    System.arraycopy(bArr10, 0, bArr5, i77, digestSize);
                    i75 >>>= i68;
                    i56++;
                }
            }
        }
        byte[] bArr11 = new byte[digestSize];
        digest.update(bArr5, 0, i10);
        byte[] bArr12 = new byte[digest.getDigestSize()];
        digest.doFinal(bArr12, 0);
        return bArr12;
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

    public int getSignatureLength() {
        int digestSize = this.f91066a.getDigestSize();
        int i10 = this.f91067b;
        int i11 = ((i10 - 1) + (digestSize << 3)) / i10;
        return ((((getLog((i11 << i10) + 1) + i10) - 1) / i10) + i11) * digestSize;
    }
}
