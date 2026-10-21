package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class aqc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f53567a = {-1, -1, -1, -3};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f53568b = {1, 0, 0, 4, -2, -1, 3, -4};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f53569c = {-1, -1, -1, -5, 1, 0, -4, 3};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53570d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f53571e = 1;

    static {
        int i10 = (((1 ^ 43) | (1 & 43)) << 1) - ((43 & (~1)) | (1 & (-44)));
        f53570d = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 67 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0086  */
    /* JADX WARN: Code duplicated, block: B:16:0x009d  */
    /* JADX WARN: Code duplicated, block: B:9:0x004c A[PHI: r9
      0x004c: PHI (r9v6 int[]) = (r9v5 int[]), (r9v10 int[]) binds: [B:8:0x004a, B:5:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object a(Object[] objArr) {
        int[] iArr;
        int i10;
        int[] iArr2;
        BigInteger bigInteger = (BigInteger) objArr[0];
        int i11 = f53571e;
        int i12 = ((i11 ^ 85) - (~((i11 & 85) << 1))) - 1;
        f53570d = i12 % 128;
        if (i12 % 2 != 0) {
            iArr = (int[]) auw.setOnFocusChangeListener(new Object[]{bigInteger}, 1614305678, -1614305676, (int) System.currentTimeMillis());
            if ((iArr[5] << 1) >= 2147483646) {
                int i13 = f53571e;
                int i14 = (((i13 & (-48)) | ((~i13) & 47)) - (~(-(-((i13 & 47) << 1))))) - 1;
                f53570d = i14 % 128;
                i10 = i14 % 2;
                iArr2 = f53567a;
                if (i10 != 0) {
                    int i15 = 91 / 0;
                    if (((Boolean) auw.setOnFocusChangeListener(new Object[]{iArr, iArr2}, -1034679762, 1034679783, (int) System.currentTimeMillis())).booleanValue()) {
                        ((Integer) auw.setOnFocusChangeListener(new Object[]{iArr2, iArr}, -425085130, 425085144, (int) System.currentTimeMillis())).intValue();
                        int i16 = f53570d;
                        int i17 = i16 & 95;
                        int i18 = (i16 | 95) & (~i17);
                        int i19 = -(-(i17 << 1));
                        int i20 = (i18 & i19) + (i18 | i19);
                        f53571e = i20 % 128;
                        int i21 = i20 % 2;
                    }
                } else if (((Boolean) auw.setOnFocusChangeListener(new Object[]{iArr, iArr2}, -1034679762, 1034679783, (int) System.currentTimeMillis())).booleanValue()) {
                    ((Integer) auw.setOnFocusChangeListener(new Object[]{iArr2, iArr}, -425085130, 425085144, (int) System.currentTimeMillis())).intValue();
                    int i110 = f53570d;
                    int i111 = i110 & 95;
                    int i112 = (i110 | 95) & (~i111);
                    int i113 = -(-(i111 << 1));
                    int i22 = (i112 & i113) + (i112 | i113);
                    f53571e = i22 % 128;
                    int i23 = i22 % 2;
                }
            }
        } else {
            iArr = (int[]) auw.setOnFocusChangeListener(new Object[]{bigInteger}, 1614305678, -1614305676, (int) System.currentTimeMillis());
            if ((iArr[3] >>> 1) >= 2147483646) {
                int i114 = f53571e;
                int i115 = (((i114 & (-48)) | ((~i114) & 47)) - (~(-(-((i114 & 47) << 1))))) - 1;
                f53570d = i115 % 128;
                i10 = i115 % 2;
                iArr2 = f53567a;
                if (i10 != 0) {
                    int i116 = 91 / 0;
                    if (((Boolean) auw.setOnFocusChangeListener(new Object[]{iArr, iArr2}, -1034679762, 1034679783, (int) System.currentTimeMillis())).booleanValue()) {
                        ((Integer) auw.setOnFocusChangeListener(new Object[]{iArr2, iArr}, -425085130, 425085144, (int) System.currentTimeMillis())).intValue();
                        int i117 = f53570d;
                        int i118 = i117 & 95;
                        int i119 = (i117 | 95) & (~i118);
                        int i1110 = -(-(i118 << 1));
                        int i24 = (i119 & i1110) + (i119 | i1110);
                        f53571e = i24 % 128;
                        int i25 = i24 % 2;
                    }
                } else if (((Boolean) auw.setOnFocusChangeListener(new Object[]{iArr, iArr2}, -1034679762, 1034679783, (int) System.currentTimeMillis())).booleanValue()) {
                    ((Integer) auw.setOnFocusChangeListener(new Object[]{iArr2, iArr}, -425085130, 425085144, (int) System.currentTimeMillis())).intValue();
                    int i1111 = f53570d;
                    int i1112 = i1111 & 95;
                    int i1113 = (i1111 | 95) & (~i1112);
                    int i1114 = -(-(i1112 << 1));
                    int i26 = (i1113 & i1114) + (i1113 | i1114);
                    f53571e = i26 % 128;
                    int i27 = i26 % 2;
                }
            }
        }
        int i28 = f53571e;
        int i29 = ((i28 | 51) << 1) - (i28 ^ 51);
        f53570d = i29 % 128;
        int i30 = i29 % 2;
        return iArr;
    }

    public static /* synthetic */ void b(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int[] iArr2 = (int[]) objArr[2];
        int i10 = f53570d + 101;
        f53571e = i10 % 128;
        if (i10 % 2 == 0) {
            int[] iArr3 = (int[]) auw.setOnFocusChangeListener(new Object[0], -1845968634, 1845968651, (int) System.currentTimeMillis());
            auw.setOnFocusChangeListener(new Object[]{iArr, iArr3}, -239632748, 239632761, (int) System.currentTimeMillis());
            setX(new Object[]{iArr3, iArr2}, -719831553, 719831564, (int) System.currentTimeMillis());
            throw null;
        }
        int[] iArr4 = (int[]) auw.setOnFocusChangeListener(new Object[0], -1845968634, 1845968651, (int) System.currentTimeMillis());
        auw.setOnFocusChangeListener(new Object[]{iArr, iArr4}, -239632748, 239632761, (int) System.currentTimeMillis());
        setX(new Object[]{iArr4, iArr2}, -719831553, 719831564, (int) System.currentTimeMillis());
        int i11 = f53571e + 2;
        int i12 = i11 ^ (-1);
        int i13 = i11 << 1;
        while (true) {
            int i14 = i12 + i13;
            f53570d = i14 % 128;
            int i15 = i14 % 2;
            iIntValue = (-2) - (iIntValue ^ (-1));
            if (iIntValue <= 0) {
                int i16 = f53571e;
                int i17 = i16 & 35;
                int i18 = (i17 - (~(-(-((i16 ^ 35) | i17))))) - 1;
                f53570d = i18 % 128;
                int i19 = i18 % 2;
                return;
            }
            int i20 = f53570d;
            int i21 = ((i20 ^ 91) | (i20 & 91)) << 1;
            int i22 = -(((~i20) & 91) | (i20 & (-92)));
            int i23 = (i21 & i22) + (i22 | i21);
            f53571e = i23 % 128;
            int i24 = i23 % 2;
            auw.setOnFocusChangeListener(new Object[]{iArr2, iArr4}, -239632748, 239632761, (int) System.currentTimeMillis());
            setX(new Object[]{iArr4, iArr2}, -719831553, 719831564, (int) System.currentTimeMillis());
            int i25 = f53571e;
            i12 = i25 & 89;
            i13 = i25 | 89;
        }
    }

    public static /* synthetic */ void c(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int i10 = iIntValue;
        while (i10 != 0) {
            int i11 = f53571e;
            int i12 = (((i11 | 64) << 1) - (i11 ^ 64)) - 1;
            f53570d = i12 % 128;
            int i13 = i12 % 2;
            long j10 = ((long) i10) & 4294967295L;
            long j11 = (((long) iArr[0]) & 4294967295L) + j10;
            iArr[0] = (int) j11;
            long j12 = j11 >> 32;
            if (j12 != 0) {
                int i14 = i11 & 101;
                int i15 = (i11 ^ 101) | i14;
                int i16 = (i14 & i15) + (i15 | i14);
                int i17 = i16 % 128;
                f53570d = i17;
                if (i16 % 2 != 0) {
                    long j13 = j12 & (((long) iArr[1]) * 4294967295L);
                    iArr[1] = (int) j13;
                    long j14 = (j13 << 18) / (((long) iArr[2]) / 4294967295L);
                    iArr[4] = (int) j14;
                    j12 = j14 >>> 92;
                } else {
                    long j15 = j12 + (((long) iArr[1]) & 4294967295L);
                    iArr[1] = (int) j15;
                    long j16 = (j15 >> 32) + (((long) iArr[2]) & 4294967295L);
                    iArr[2] = (int) j16;
                    j12 = j16 >> 32;
                }
                int i18 = i17 + 13;
                f53571e = i18 % 128;
                int i19 = i18 % 2;
            }
            long j17 = (4294967295L & ((long) iArr[3])) + (j10 << 1) + j12;
            iArr[3] = (int) j17;
            i10 = (int) (j17 >> 32);
            int i20 = f53570d + 105;
            f53571e = i20 % 128;
            int i21 = i20 % 2;
        }
        if ((iArr[3] >>> 1) >= 2147483646) {
            int i22 = f53571e + 103;
            f53570d = i22 % 128;
            int i23 = i22 % 2;
            int[] iArr2 = f53567a;
            if (i23 != 0) {
                ((Boolean) auw.setOnFocusChangeListener(new Object[]{iArr, iArr2}, -1034679762, 1034679783, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            }
            if (((Boolean) auw.setOnFocusChangeListener(new Object[]{iArr, iArr2}, -1034679762, 1034679783, (int) System.currentTimeMillis())).booleanValue()) {
                setX(new Object[]{iArr}, -1558103457, 1558103465, (int) System.currentTimeMillis());
                int i24 = f53570d;
                int i25 = (i24 & 99) + (i24 | 99);
                f53571e = i25 % 128;
                int i26 = i25 % 2;
            }
        }
        int i27 = ~iIntValue;
        int i28 = (i27 | iIntValue) & i27;
        int i29 = ~(i28 | 859118570);
        int i30 = 1287668753 & i29;
        int i31 = (i29 | 1287668753) & (~i30);
        int i32 = (-2) - ((1001322277 - (~(-(-(((i31 & i30) | (i31 ^ i30)) * (-1188)))))) ^ (-1));
        int i33 = (-859118571) & iIntValue;
        int i34 = ~(((iIntValue | (-859118571)) & (~i33)) | i33);
        int i35 = 1287668753 & i34;
        int i36 = (i34 | 1287668753) & (~i35);
        int i37 = (i36 & i35) | (i36 ^ i35);
        int i38 = i27 ^ 1592874993;
        int i39 = i27 & 1592874993;
        int i40 = ~((i38 & i39) | (i38 ^ i39));
        int i41 = (((i37 & i40) | ((~i40) & i37) | ((~i37) & i40)) * 594) + i32;
        int i42 = (859118570 & i28) | ((~i28) & (-859118571));
        int i43 = (-859118571) & i28;
        int i44 = ~((i42 & i43) | (i42 ^ i43));
        int i45 = (i44 & 553912330) | (i44 ^ 553912330);
        int i46 = i28 & 1592874993;
        int i47 = (1592874993 | i28) & (~i46);
        int i48 = ~((i46 & i47) | (i47 ^ i46));
        int i49 = i45 ^ i48;
        int i50 = i45 & i48;
        int i51 = -(-(((i50 & i49) | (i49 ^ i50)) * 594));
        int i52 = (i41 ^ i51) + ((i41 & i51) << 1);
        int i53 = ((~i27) & (-733304013)) | (733304012 & i27);
        int i54 = i27 & (-733304013);
        int i55 = (i54 & i53) | (i53 ^ i54);
        int i56 = (1280139205 & i55) | ((~i55) & (-1280139206));
        int i57 = i55 & (-1280139206);
        int i58 = -(~((~((i57 & i56) | (i56 ^ i57))) * (-783)));
        int i59 = (((-1895410679) | i58) << 1) - (i58 ^ (-1895410679));
        int i60 = (i59 ^ (-1)) + (i59 << 1);
        int i61 = i28 & (-1280139206);
        int i62 = (i28 | (-1280139206)) & (~i61);
        int i63 = (i61 & i62) | (i62 ^ i61);
        int i64 = ~i63;
        int i65 = (i63 | i64) & i64;
        int i66 = (-733304013) & i65;
        int i67 = (i65 | (-733304013)) & (~i66);
        int i68 = -(~(((i67 & i66) | (i67 ^ i66)) * 783));
        int i69 = (i60 & i68) + (i60 | i68);
        if (i52 > (i69 ^ (-1)) + (i69 << 1)) {
            int i70 = 64 / 0;
        }
    }

    public static /* synthetic */ void d(Object[] objArr) {
        long j10;
        int[] iArr = (int[]) objArr[0];
        int i10 = f53571e;
        int i11 = i10 & 115;
        int i12 = i11 + ((i10 ^ 115) | i11);
        int i13 = i12 % 128;
        f53570d = i13;
        int i14 = i12 % 2;
        long j11 = (((long) iArr[0]) & 4294967295L) + 1;
        int i15 = (int) j11;
        iArr[0] = i15;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            int i16 = ((i13 & 14) + (i13 | 14)) - 1;
            f53571e = i16 % 128;
            if (i16 % 2 == 0) {
                long j13 = (((long) i15) - 4294967295L) | j12;
                iArr[0] = (int) j13;
                long j14 = (((long) iArr[2]) / 4294967295L) * (j13 << 110);
                iArr[5] = (int) j14;
                j10 = j14 >> 94;
            } else {
                long j15 = j12 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j15;
                long j16 = (j15 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j16;
                j10 = j16 >> 32;
            }
            j12 = j10;
        }
        iArr[3] = (int) ((((long) iArr[3]) & 4294967295L) + 2 + j12);
        int i17 = f53571e;
        int i18 = i17 & 111;
        int i19 = (i17 | 111) & (~i18);
        int i20 = i18 << 1;
        int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
        f53570d = i21 % 128;
        if (i21 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Integer e(Object[] objArr) {
        int i10 = 0;
        int[] iArr = (int[]) objArr[0];
        int i11 = f53570d;
        int i12 = i11 + 25;
        f53571e = i12 % 128;
        int i13 = i12 % 2;
        int i14 = ((i11 ^ 81) - (~((i11 & 81) << 1))) - 1;
        f53571e = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 0;
        while (i10 < 4) {
            int i17 = f53570d + 73;
            f53571e = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = iArr[i10];
                int i19 = ((~i18) & i16) | ((~i16) & i18);
                int i20 = i16 & i18;
                i16 = (i20 & i19) | (i19 ^ i20);
                int i21 = (i10 & 114) + (i10 | 114);
                int i22 = (i21 ^ (-1)) + (i21 << 1);
                int i23 = i22 ^ (-75);
                int i24 = ((i22 & (-75)) | i23) << 1;
                int i25 = -i23;
                i10 = (i24 ^ i25) + ((i24 & i25) << 1);
            } else {
                int i26 = iArr[i10];
                int i27 = i16 & i26;
                int i28 = (i16 | i26) & (~i27);
                i16 = (i28 & i27) | (i28 ^ i27);
                i10 = (-2) - (((i10 & 2) + (i10 | 2)) ^ (-1));
            }
        }
        int i29 = i16 >>> 1;
        int i30 = i16 & 1;
        int i31 = (((i29 & i30) | (i29 ^ i30)) - 1) >> 31;
        int i32 = f53571e;
        int i33 = i32 & 17;
        int i34 = (((i32 ^ 17) | i33) << 1) - ((i32 | 17) & (~i33));
        f53570d = i34 % 128;
        if (i34 % 2 == 0) {
            return Integer.valueOf(i31);
        }
        throw null;
    }

    public static /* synthetic */ void f(Object[] objArr) {
        SecureRandom secureRandom = (SecureRandom) objArr[0];
        int[] iArr = (int[]) objArr[1];
        int i10 = f53571e;
        int i11 = (-2) - ((i10 + 52) ^ (-1));
        f53570d = i11 % 128;
        int i12 = i11 % 2;
        byte[] bArr = new byte[16];
        int i13 = i10 + 48;
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        f53570d = i14 % 128;
        int i15 = i14 % 2;
        do {
            secureRandom.nextBytes(bArr);
            ber.setDividerPadding(new Object[]{bArr, 0, iArr, 4}, 1570947064, -1570947056, 0);
        } while (((Integer) auy.setOnFocusChangeListener(new Object[]{4, iArr, f53567a}, -188447753, 188447787, 4)).intValue() == 0);
        int i16 = (-2) - ((f53570d + 84) ^ (-1));
        f53571e = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void g(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53571e;
        int i11 = ((i10 & 1) - (~(-(-(i10 | 1))))) - 1;
        f53570d = i11 % 128;
        int i12 = i11 % 2;
        int[] iArr3 = (int[]) auw.setOnFocusChangeListener(new Object[0], -1845968634, 1845968651, (int) System.currentTimeMillis());
        auw.setOnFocusChangeListener(new Object[]{iArr, iArr3}, -239632748, 239632761, (int) System.currentTimeMillis());
        setX(new Object[]{iArr3, iArr2}, -719831553, 719831564, (int) System.currentTimeMillis());
        int i13 = f53571e + 83;
        f53570d = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 3 / 0;
        }
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2, int[] iArr3) {
        setX(new Object[]{iArr, iArr2, iArr3}, 1933393358, -1933393343, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, 1627570594, -1627570594, (int) System.currentTimeMillis());
    }

    public static void setNavigationOnClickListener(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, -530007090, 530007100, (int) System.currentTimeMillis());
    }

    public static int[] setOnFocusChangeListener(BigInteger bigInteger) {
        return (int[]) setX(new Object[]{bigInteger}, 482491134, -482491125, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0671  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x016b  */
    /* JADX WARN: Code duplicated, block: B:34:0x01f4 A[PHI: r5
      0x01f4: PHI (r5v36 long) = (r5v35 long), (r5v44 long) binds: [B:33:0x01f2, B:30:0x01e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x027c  */
    /* JADX WARN: Code duplicated, block: B:62:0x044c A[PHI: r11
      0x044c: PHI (r11v2 char) = (r11v1 char), (r11v3 char) binds: [B:61:0x044a, B:58:0x0431] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0451  */
    /* JADX WARN: Code duplicated, block: B:70:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:87:0x0588  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        char c10;
        int i13;
        long j10;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~(i14 | i15);
        int i17 = i14 | (~i12);
        int i18 = (((~(i10 | i15)) | (~(i11 | i17))) * 241) + ((i10 | i11) * (-482)) + ((i16 | (~i17)) * (-241)) + (i11 * 242) + (i10 * 483);
        int[] iArr = f53567a;
        switch (i18) {
            case 1:
                f(objArr);
                return null;
            case 2:
                int[] iArr2 = (int[]) objArr[0];
                int[] iArr3 = (int[]) objArr[1];
                int i19 = f53570d;
                int i20 = (((i19 | 58) << 1) - (i19 ^ 58)) - 1;
                f53571e = i20 % 128;
                if (i20 % 2 != 0 ? ((Integer) auy.setOnFocusChangeListener(new Object[]{4, iArr2, iArr3}, 1108035559, -1108035515, 4)).intValue() != 0 : ((Integer) auy.setOnFocusChangeListener(new Object[]{5, iArr2, iArr3}, 1108035559, -1108035515, 5)).intValue() != 0) {
                    setX(new Object[]{iArr3}, -1558103457, 1558103465, (int) System.currentTimeMillis());
                    int i21 = f53571e;
                    int i22 = i21 & 19;
                    int i23 = ((i21 ^ 19) | i22) << 1;
                    int i24 = -((i21 | 19) & (~i22));
                    int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                    f53570d = i25 % 128;
                    int i26 = i25 % 2;
                } else {
                    int i27 = f53570d;
                    int i28 = i27 | 77;
                    int i29 = (i28 << 1) - ((~(i27 & 77)) & i28);
                    int i30 = i29 % 128;
                    f53571e = i30;
                    int i31 = i29 % 2;
                    if ((iArr3[3] >>> 1) >= 2147483646) {
                        int i32 = i30 & 39;
                        int i33 = (i30 | 39) & (~i32);
                        int i34 = i32 << 1;
                        int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
                        f53570d = i35 % 128;
                        int i36 = i35 % 2;
                        if (((Boolean) auw.setOnFocusChangeListener(new Object[]{iArr3, iArr}, -1034679762, 1034679783, (int) System.currentTimeMillis())).booleanValue()) {
                            setX(new Object[]{iArr3}, -1558103457, 1558103465, (int) System.currentTimeMillis());
                            int i210 = f53571e;
                            int i211 = i210 & 19;
                            int i212 = ((i210 ^ 19) | i211) << 1;
                            int i213 = -((i210 | 19) & (~i211));
                            int i214 = ((i212 | i213) << 1) - (i213 ^ i212);
                            f53570d = i214 % 128;
                            int i215 = i214 % 2;
                        }
                    }
                }
                int i37 = f53570d;
                int i38 = i37 & 41;
                int i39 = (i37 ^ 41) | i38;
                int i40 = (i38 & i39) + (i39 | i38);
                f53571e = i40 % 128;
                int i41 = i40 % 2;
                return null;
            case 3:
                g(objArr);
                return null;
            case 4:
                int[] iArr4 = (int[]) objArr[0];
                int[] iArr5 = (int[]) objArr[1];
                int[] iArr6 = (int[]) objArr[2];
                int i42 = f53570d + 19;
                f53571e = i42 % 128;
                int i43 = i42 % 2;
                if (((Integer) auw.setOnFocusChangeListener(new Object[]{iArr4, iArr5, iArr6}, -563398411, 563398427, (int) System.currentTimeMillis())).intValue() == 0) {
                    int i44 = f53571e;
                    int i45 = i44 & 53;
                    int i46 = i45 + ((i44 ^ 53) | i45);
                    f53570d = i46 % 128;
                    if (i46 % 2 == 0 ? (iArr6[3] >>> 1) >= 2147483646 : (iArr6[4] >> 1) >= 2147483646) {
                        int i47 = i44 & 5;
                        int i48 = (i44 | 5) & (~i47);
                        int i49 = i47 << 1;
                        int i50 = (i48 & i49) + (i48 | i49);
                        f53570d = i50 % 128;
                        int i51 = i50 % 2;
                        if (((Boolean) auw.setOnFocusChangeListener(new Object[]{iArr6, iArr}, -1034679762, 1034679783, (int) System.currentTimeMillis())).booleanValue()) {
                            setX(new Object[]{iArr6}, -1558103457, 1558103465, (int) System.currentTimeMillis());
                            int i52 = f53570d;
                            int i53 = (i52 & (-88)) | ((~i52) & 87);
                            int i54 = -(-((i52 & 87) << 1));
                            int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
                            f53571e = i55 % 128;
                            int i56 = i55 % 2;
                        }
                    }
                } else {
                    setX(new Object[]{iArr6}, -1558103457, 1558103465, (int) System.currentTimeMillis());
                    int i57 = f53570d;
                    int i58 = (i57 & (-88)) | ((~i57) & 87);
                    int i59 = -(-((i57 & 87) << 1));
                    int i510 = (i58 ^ i59) + ((i59 & i58) << 1);
                    f53571e = i510 % 128;
                    int i511 = i510 % 2;
                }
                int i60 = f53571e;
                int i61 = (i60 & (-52)) | ((~i60) & 51);
                int i62 = -(-((i60 & 51) << 1));
                int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                f53570d = i63 % 128;
                int i64 = i63 % 2;
                return null;
            case 5:
                c(objArr);
                return null;
            case 6:
                b(objArr);
                return null;
            case 7:
                int[] iArr7 = (int[]) objArr[0];
                int[] iArr8 = (int[]) objArr[1];
                int i65 = f53570d;
                int i66 = i65 ^ 49;
                int i67 = ((((i65 & 49) | i66) << 1) - (~(-i66))) - 1;
                f53571e = i67 % 128;
                int i68 = i67 % 2;
                ava.setOnFocusChangeListener(new Object[]{iArr, iArr7, iArr8}, 1200653283, -1200653275, (int) System.currentTimeMillis());
                int i69 = f53571e;
                int i70 = ((i69 | 49) << 1) - (((~i69) & 49) | (i69 & (-50)));
                f53570d = i70 % 128;
                int i71 = i70 % 2;
                return null;
            case 8:
                d(objArr);
                return null;
            case 9:
                return a(objArr);
            case 10:
                int[] iArr9 = (int[]) objArr[0];
                int[] iArr10 = (int[]) objArr[1];
                int i72 = f53570d;
                int i73 = (i72 & 105) + (i72 | 105);
                f53571e = i73 % 128;
                if (i73 % 2 == 0) {
                    c10 = 3;
                    if (((Integer) auy.setOnFocusChangeListener(new Object[]{4, iArr9, 0, iArr10}, -1008052683, 1008052691, 4)).intValue() == 0) {
                        if ((iArr10[c10] >>> 1) >= 2147483646) {
                            System.currentTimeMillis();
                            System.currentTimeMillis();
                            if (((Boolean) auw.setOnFocusChangeListener(new Object[]{iArr10, iArr}, -1034679762, 1034679783, (int) System.currentTimeMillis())).booleanValue()) {
                            }
                        }
                    }
                    int i74 = f53571e;
                    i13 = ((i74 & 50) + (i74 | 50)) - 1;
                    f53570d = i13 % 128;
                    if (i13 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                c10 = 3;
                if (((Integer) auy.setOnFocusChangeListener(new Object[]{4, iArr9, 0, iArr10}, -1008052683, 1008052691, 4)).intValue() == 0) {
                    if ((iArr10[c10] >>> 1) >= 2147483646) {
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                        if (((Boolean) auw.setOnFocusChangeListener(new Object[]{iArr10, iArr}, -1034679762, 1034679783, (int) System.currentTimeMillis())).booleanValue()) {
                        }
                    }
                }
                int i75 = f53571e;
                i13 = ((i75 & 50) + (i75 | 50)) - 1;
                f53570d = i13 % 128;
                if (i13 % 2 == 0) {
                    return null;
                }
                throw null;
                setX(new Object[]{iArr10}, -1558103457, 1558103465, (int) System.currentTimeMillis());
                int i76 = f53570d;
                int i77 = (i76 & 85) + (i76 | 85);
                f53571e = i77 % 128;
                int i78 = i77 % 2;
                int i79 = f53571e;
                i13 = ((i79 & 50) + (i79 | 50)) - 1;
                f53570d = i13 % 128;
                if (i13 % 2 == 0) {
                    return null;
                }
                throw null;
            case 11:
                int[] iArr11 = (int[]) objArr[0];
                int[] iArr12 = (int[]) objArr[1];
                int i80 = f53571e + 91;
                f53570d = i80 % 128;
                int i81 = i80 % 2;
                long j11 = ((long) iArr11[0]) & 4294967295L;
                long j12 = ((long) iArr11[1]) & 4294967295L;
                long j13 = ((long) iArr11[2]) & 4294967295L;
                long j14 = ((long) iArr11[3]) & 4294967295L;
                long j15 = ((long) iArr11[4]) & 4294967295L;
                long j16 = ((long) iArr11[5]) & 4294967295L;
                long j17 = ((long) iArr11[6]) & 4294967295L;
                long j18 = ((long) iArr11[7]) & 4294967295L;
                long j19 = j14 + j18;
                long j20 = j17 + (j18 << 1);
                long j21 = j16 + (j20 << 1);
                long j22 = j12 + j21;
                long j23 = j15 + (j21 << 1);
                long j24 = j11 + j23;
                iArr12[0] = (int) j24;
                long j25 = j22 + (j24 >>> 32);
                iArr12[1] = (int) j25;
                long j26 = j13 + j20 + (j25 >>> 32);
                iArr12[2] = (int) j26;
                long j27 = j19 + (j23 << 1) + (j26 >>> 32);
                iArr12[3] = (int) j27;
                int i82 = (int) (j27 >>> 32);
                setX(new Object[]{Integer.valueOf(i82), iArr12}, -1452770434, 1452770439, i82);
                int i83 = f53571e;
                int i84 = i83 & 65;
                int i85 = i83 | 65;
                int i86 = ((i84 | i85) << 1) - (i85 ^ i84);
                f53570d = i86 % 128;
                int i87 = i86 % 2;
                return null;
            case 12:
                SecureRandom secureRandom = (SecureRandom) objArr[0];
                int[] iArr13 = (int[]) objArr[1];
                do {
                    setX(new Object[]{secureRandom, iArr13}, 1581718484, -1581718483, (int) System.currentTimeMillis());
                } while (((Integer) setX(new Object[]{iArr13}, 4453404, -4453391, (int) System.currentTimeMillis())).intValue() != 0);
                int i88 = f53571e + 93;
                f53570d = i88 % 128;
                int i89 = i88 % 2;
                return null;
            case 13:
                return e(objArr);
            case 14:
                int[] iArr14 = (int[]) objArr[0];
                int[] iArr15 = (int[]) objArr[1];
                int[] iArr16 = (int[]) objArr[2];
                int i90 = f53571e;
                int i91 = i90 & 117;
                int i92 = -(-((i90 ^ 117) | i91));
                int i93 = (i91 & i92) + (i92 | i91);
                f53570d = i93 % 128;
                int i94 = i93 % 2;
                int[] iArr17 = (int[]) auw.setOnFocusChangeListener(new Object[0], -1845968634, 1845968651, (int) System.currentTimeMillis());
                auw.setOnFocusChangeListener(new Object[]{iArr14, iArr15, iArr17}, 1496073495, -1496073494, (int) System.currentTimeMillis());
                setX(new Object[]{iArr17, iArr16}, -719831553, 719831564, (int) System.currentTimeMillis());
                int i95 = f53570d;
                int i96 = (-2) - ((((i95 | 22) << 1) - (i95 ^ 22)) ^ (-1));
                f53571e = i96 % 128;
                int i97 = i96 % 2;
                return null;
            case 15:
                int[] iArr18 = (int[]) objArr[0];
                int[] iArr19 = (int[]) objArr[1];
                int[] iArr20 = (int[]) objArr[2];
                int i98 = f53571e;
                int i99 = i98 & 115;
                int i100 = -(-((i98 ^ 115) | i99));
                int i101 = (i99 & i100) + (i100 | i99);
                f53570d = i101 % 128;
                Object[] objArr2 = new Object[3];
                if (i101 % 2 != 0) {
                    objArr2[0] = iArr18;
                    objArr2[1] = iArr19;
                    objArr2[2] = iArr20;
                    int i102 = 77 / 0;
                    if (((Integer) auw.setOnFocusChangeListener(objArr2, 1043272735, -1043272717, (int) System.currentTimeMillis())).intValue() != 0) {
                        int i103 = f53571e;
                        int i104 = i103 ^ 99;
                        int i105 = ((((i103 & 99) | i104) << 1) - (~(-i104))) - 1;
                        f53570d = i105 % 128;
                        int i106 = i105 % 2;
                        setX(new Object[]{iArr20}, -1628226845, 1628226861, (int) System.currentTimeMillis());
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                    }
                } else {
                    objArr2[0] = iArr18;
                    objArr2[1] = iArr19;
                    objArr2[2] = iArr20;
                    if (((Integer) auw.setOnFocusChangeListener(objArr2, 1043272735, -1043272717, (int) System.currentTimeMillis())).intValue() != 0) {
                        int i107 = f53571e;
                        int i108 = i107 ^ 99;
                        int i109 = ((((i107 & 99) | i108) << 1) - (~(-i108))) - 1;
                        f53570d = i109 % 128;
                        int i1010 = i109 % 2;
                        setX(new Object[]{iArr20}, -1628226845, 1628226861, (int) System.currentTimeMillis());
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                    }
                }
                int i110 = f53570d;
                int i111 = (((i110 | 48) << 1) - (i110 ^ 48)) - 1;
                f53571e = i111 % 128;
                if (i111 % 2 != 0) {
                    return null;
                }
                throw null;
            case 16:
                int[] iArr21 = (int[]) objArr[0];
                int i112 = f53571e + 3;
                int i113 = i112 % 128;
                f53570d = i113;
                if (i112 % 2 != 0) {
                    long j28 = ((long) iArr21[1]) & 4294967295L;
                    iArr21[1] = (int) j28;
                    j10 = j28 >> 107;
                    if (j10 != 1) {
                        long j29 = j10 + (((long) iArr21[1]) & 4294967295L);
                        iArr21[1] = (int) j29;
                        long j30 = (j29 >> 32) + (((long) iArr21[2]) & 4294967295L);
                        iArr21[2] = (int) j30;
                        j10 = j30 >> 32;
                        int i114 = i113 + 111;
                        f53571e = i114 % 128;
                        int i115 = i114 % 2;
                    }
                } else {
                    long j31 = (((long) iArr21[0]) & 4294967295L) - 1;
                    iArr21[0] = (int) j31;
                    j10 = j31 >> 32;
                    if (j10 != 0) {
                        long j210 = j10 + (((long) iArr21[1]) & 4294967295L);
                        iArr21[1] = (int) j210;
                        long j32 = (j210 >> 32) + (((long) iArr21[2]) & 4294967295L);
                        iArr21[2] = (int) j32;
                        j10 = j32 >> 32;
                        int i116 = i113 + 111;
                        f53571e = i116 % 128;
                        int i117 = i116 % 2;
                    }
                }
                iArr21[3] = (int) (((((long) iArr21[3]) & 4294967295L) - 2) + j10);
                int i118 = f53571e + 105;
                f53570d = i118 % 128;
                int i119 = i118 % 2;
                return null;
            case 17:
                int[] iArr22 = (int[]) objArr[0];
                int[] iArr23 = (int[]) objArr[1];
                int[] iArr24 = (int[]) objArr[2];
                int i120 = f53570d + 31;
                f53571e = i120 % 128;
                if (i120 % 2 == 0) {
                    ((Integer) auw.setOnFocusChangeListener(new Object[]{iArr22, iArr23, iArr24}, 2023888423, -2023888411, (int) System.currentTimeMillis())).intValue();
                    throw null;
                }
                if (((Integer) auw.setOnFocusChangeListener(new Object[]{iArr22, iArr23, iArr24}, 2023888423, -2023888411, (int) System.currentTimeMillis())).intValue() == 0) {
                    int i121 = f53571e + 57;
                    int i122 = i121 % 128;
                    f53570d = i122;
                    int i123 = i121 % 2;
                    if ((iArr24[7] >>> 1) >= 2147483646) {
                        int i124 = i122 & 109;
                        int i125 = i124 + ((i122 ^ 109) | i124);
                        f53571e = i125 % 128;
                        int i126 = i125 % 2;
                        if (((Boolean) avf.setX(new Object[]{iArr24, f53568b}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue()) {
                            ((Integer) auy.setOnFocusChangeListener(new Object[]{8, f53569c, iArr24}, -1807856331, 1807856377, 8)).intValue();
                            int i127 = f53570d + 77;
                            f53571e = i127 % 128;
                            int i128 = i127 % 2;
                        }
                    }
                } else {
                    ((Integer) auy.setOnFocusChangeListener(new Object[]{8, f53569c, iArr24}, -1807856331, 1807856377, 8)).intValue();
                    int i129 = f53570d + 77;
                    f53571e = i129 % 128;
                    int i1210 = i129 % 2;
                }
                int i130 = f53570d;
                int i131 = i130 | 79;
                int i132 = i131 << 1;
                int i133 = -((~(i130 & 79)) & i131);
                int i134 = ((i132 | i133) << 1) - (i133 ^ i132);
                f53571e = i134 % 128;
                if (i134 % 2 != 0) {
                    return null;
                }
                throw null;
            default:
                int[] iArr25 = (int[]) objArr[0];
                int[] iArr26 = (int[]) objArr[1];
                int i135 = f53570d;
                int i136 = i135 & 65;
                int i137 = ((i135 ^ 65) | i136) << 1;
                int i138 = -((i135 | 65) & (~i136));
                int i139 = (i137 & i138) + (i138 | i137);
                f53571e = i139 % 128;
                int i140 = i139 % 2;
                if (((Integer) setX(new Object[]{iArr25}, 4453404, -4453391, (int) System.currentTimeMillis())).intValue() == 0) {
                    ((Integer) auw.setOnFocusChangeListener(new Object[]{iArr, iArr25, iArr26}, 1043272735, -1043272717, (int) System.currentTimeMillis())).intValue();
                    int i141 = f53571e;
                    int i142 = ((i141 | 114) << 1) - (i141 ^ 114);
                    int i143 = (i142 ^ (-1)) + (i142 << 1);
                    f53570d = i143 % 128;
                    int i144 = i143 % 2;
                    return null;
                }
                int i145 = f53571e;
                int i146 = i145 & 21;
                int i147 = i145 | 21;
                int i148 = (i146 & i147) + (i147 | i146);
                f53570d = i148 % 128;
                Object[] objArr3 = new Object[3];
                if (i148 % 2 != 0) {
                    objArr3[0] = iArr;
                    objArr3[1] = iArr;
                    objArr3[2] = iArr26;
                    ((Integer) auw.setOnFocusChangeListener(objArr3, 1043272735, -1043272717, (int) System.currentTimeMillis())).intValue();
                    throw null;
                }
                objArr3[0] = iArr;
                objArr3[1] = iArr;
                objArr3[2] = iArr26;
                ((Integer) auw.setOnFocusChangeListener(objArr3, 1043272735, -1043272717, (int) System.currentTimeMillis())).intValue();
                int i149 = f53571e;
                int i150 = ((((i149 ^ 55) | (i149 & 55)) << 1) - (~(-(((~i149) & 55) | (i149 & (-56)))))) - 1;
                f53570d = i150 % 128;
                int i151 = i150 % 2;
                return null;
        }
    }

    public static void setY(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, -719831553, 719831564, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int i10, int[] iArr2) {
        setX(new Object[]{iArr, Integer.valueOf(i10), iArr2}, 1085234364, -1085234358, i10);
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2, int[] iArr3) {
        setX(new Object[]{iArr, iArr2, iArr3}, -2084538997, 2084539014, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, -36556295, 36556297, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int[] iArr2, int[] iArr3) {
        setX(new Object[]{iArr, iArr2, iArr3}, -918821368, 918821372, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(int i10, int[] iArr) {
        setX(new Object[]{Integer.valueOf(i10), iArr}, -1452770434, 1452770439, i10);
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, 1344855103, -1344855096, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, -975657781, 975657784, (int) System.currentTimeMillis());
    }

    public static void setX(SecureRandom secureRandom, int[] iArr) {
        setX(new Object[]{secureRandom, iArr}, 762479969, -762479957, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2, int[] iArr3) {
        setX(new Object[]{iArr, iArr2, iArr3}, 1790962205, -1790962191, (int) System.currentTimeMillis());
    }
}
