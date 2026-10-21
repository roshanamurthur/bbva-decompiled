package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class aqm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f53599a = {Integer.MAX_VALUE, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f53600b = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f53601c = {-1, -1073741826, -1, -1, -1, 1, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53602d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f53603e = 1;

    static {
        int i10 = ((49 & (~0)) - (~(-(-0)))) - 1;
        f53603e = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0073  */
    public static /* synthetic */ void a(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53602d + 71;
        f53603e = i10 % 128;
        int i11 = i10 % 2;
        if (((Integer) auz.setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 140455191, -140455183, (int) System.currentTimeMillis())).intValue() == 0) {
            int i12 = (-2) - ((f53603e + 8) ^ (-1));
            int i13 = i12 % 128;
            f53602d = i13;
            int i14 = i12 % 2;
            if (iArr3[4] == -1) {
                int i15 = (i13 & 99) + (i13 | 99);
                f53603e = i15 % 128;
                int i16 = i15 % 2;
                if (((Boolean) auz.setDividerPadding(new Object[]{iArr3, f53599a}, 705102965, -705102950, (int) System.currentTimeMillis())).booleanValue()) {
                    ((Integer) auy.setOnFocusChangeListener(new Object[]{5, -2147483647, iArr3}, -675302000, 675302004, 5)).intValue();
                    int i17 = f53602d;
                    int i18 = i17 & 125;
                    int i19 = ((i17 ^ 125) | i18) << 1;
                    int i20 = -((i17 | 125) & (~i18));
                    int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                    f53603e = i21 % 128;
                    int i22 = i21 % 2;
                }
            }
        } else {
            ((Integer) auy.setOnFocusChangeListener(new Object[]{5, -2147483647, iArr3}, -675302000, 675302004, 5)).intValue();
            int i110 = f53602d;
            int i111 = i110 & 125;
            int i112 = ((i110 ^ 125) | i111) << 1;
            int i23 = -((i110 | 125) & (~i111));
            int i24 = ((i112 | i23) << 1) - (i23 ^ i112);
            f53603e = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = f53602d + 51;
        f53603e = i26 % 128;
        if (i26 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0098  */
    /* JADX WARN: Code duplicated, block: B:15:0x00b9  */
    public static /* synthetic */ void b(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53602d;
        int i11 = (i10 & (-44)) | ((~i10) & 43);
        int i12 = -(-((i10 & 43) << 1));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53603e = i13 % 128;
        int i14 = i13 % 2;
        if (((Integer) auz.setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 1133382827, -1133382827, (int) System.currentTimeMillis())).intValue() == 0) {
            int i15 = f53603e;
            int i16 = ((i15 ^ 112) + ((i15 & 112) << 1)) - 1;
            int i17 = i16 % 128;
            f53602d = i17;
            if (i16 % 2 == 0 ? iArr3[9] == -1 : iArr3[107] == -1) {
                int i18 = i17 & 11;
                int i19 = -(-((i17 ^ 11) | i18));
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                f53603e = i20 % 128;
                int i21 = i20 % 2;
                if (!(!((Boolean) auy.setOnFocusChangeListener(new Object[]{10, iArr3, f53600b}, 280624047, -280624046, 10)).booleanValue())) {
                    if (((Integer) auy.setOnFocusChangeListener(new Object[]{7, f53601c, iArr3}, -1807856331, 1807856377, 7)).intValue() != 0) {
                        int i22 = f53603e;
                        int i23 = ((i22 ^ 110) + ((i22 & 110) << 1)) - 1;
                        f53602d = i23 % 128;
                        int i24 = i23 % 2;
                        ((Integer) auy.setOnFocusChangeListener(new Object[]{10, iArr3, 7}, -668114120, 668114158, 10)).intValue();
                        int i25 = f53602d;
                        int i26 = ((i25 & (-8)) | ((~i25) & 7)) + ((i25 & 7) << 1);
                        f53603e = i26 % 128;
                        int i27 = i26 % 2;
                    }
                }
            }
        } else if (((Integer) auy.setOnFocusChangeListener(new Object[]{7, f53601c, iArr3}, -1807856331, 1807856377, 7)).intValue() != 0) {
            int i28 = f53603e;
            int i29 = ((i28 ^ 110) + ((i28 & 110) << 1)) - 1;
            f53602d = i29 % 128;
            int i210 = i29 % 2;
            ((Integer) auy.setOnFocusChangeListener(new Object[]{10, iArr3, 7}, -668114120, 668114158, 10)).intValue();
            int i211 = f53602d;
            int i212 = ((i211 & (-8)) | ((~i211) & 7)) + ((i211 & 7) << 1);
            f53603e = i212 % 128;
            int i213 = i212 % 2;
        }
        int i30 = f53602d;
        int i31 = i30 & 21;
        int i32 = (i30 | 21) & (~i31);
        int i33 = -(-(i31 << 1));
        int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
        f53603e = i34 % 128;
        if (i34 % 2 == 0) {
            int i35 = 92 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0063  */
    /* JADX WARN: Code duplicated, block: B:15:0x0090  */
    public static /* synthetic */ void c(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int i10 = f53603e;
        int i11 = (i10 ^ 33) + ((i10 & 33) << 1);
        f53602d = i11 % 128;
        int i12 = i11 % 2;
        if (iIntValue != 0) {
            int i13 = i10 & 89;
            int i14 = i13 + ((i10 ^ 89) | i13);
            f53602d = i14 % 128;
            if (i14 % 2 != 0) {
                ((Integer) auz.setDividerPadding(new Object[]{Integer.valueOf(iIntValue), iArr}, -1617472533, 1617472538, iIntValue)).intValue();
                throw null;
            }
            if (((Integer) auz.setDividerPadding(new Object[]{Integer.valueOf(iIntValue), iArr}, -1617472533, 1617472538, iIntValue)).intValue() != 0) {
                ((Integer) auy.setOnFocusChangeListener(new Object[]{5, -2147483647, iArr}, -675302000, 675302004, 5)).intValue();
                int i15 = f53603e + 105;
                f53602d = i15 % 128;
                int i16 = i15 % 2;
            } else if (iArr[4] == -1) {
                int i17 = f53602d;
                int i18 = (((i17 | 52) << 1) - (i17 ^ 52)) - 1;
                f53603e = i18 % 128;
                int i19 = i18 % 2;
                if (((Boolean) auz.setDividerPadding(new Object[]{iArr, f53599a}, 705102965, -705102950, (int) System.currentTimeMillis())).booleanValue()) {
                    ((Integer) auy.setOnFocusChangeListener(new Object[]{5, -2147483647, iArr}, -675302000, 675302004, 5)).intValue();
                    int i110 = f53603e + 105;
                    f53602d = i110 % 128;
                    int i111 = i110 % 2;
                }
            }
        } else if (iArr[4] == -1) {
            int i112 = f53602d;
            int i113 = (((i112 | 52) << 1) - (i112 ^ 52)) - 1;
            f53603e = i113 % 128;
            int i114 = i113 % 2;
            if (((Boolean) auz.setDividerPadding(new Object[]{iArr, f53599a}, 705102965, -705102950, (int) System.currentTimeMillis())).booleanValue()) {
                ((Integer) auy.setOnFocusChangeListener(new Object[]{5, -2147483647, iArr}, -675302000, 675302004, 5)).intValue();
                int i115 = f53603e + 105;
                f53602d = i115 % 128;
                int i116 = i115 % 2;
            }
        }
        int i20 = f53603e;
        int i21 = i20 & 93;
        int i22 = -(-((i20 ^ 93) | i21));
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        f53602d = i23 % 128;
        int i24 = i23 % 2;
    }

    public static /* synthetic */ void d(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int[] iArr2 = (int[]) objArr[2];
        int i10 = f53602d;
        int i11 = (((i10 | 50) << 1) - (i10 ^ 50)) - 1;
        f53603e = i11 % 128;
        int i12 = i11 % 2;
        int[] iArr3 = (int[]) auz.setDividerPadding(new Object[0], -529696917, 529696919, (int) System.currentTimeMillis());
        auz.setDividerPadding(new Object[]{iArr, iArr3}, 1612100803, -1612100784, (int) System.currentTimeMillis());
        setDividerPadding(new Object[]{iArr3, iArr2}, -1148753475, 1148753489, (int) System.currentTimeMillis());
        int i13 = f53602d;
        int i14 = (-2) - (((i13 & 98) + (i13 | 98)) ^ (-1));
        f53603e = i14 % 128;
        int i15 = i14 % 2;
        while (true) {
            iIntValue = (-2) - (iIntValue ^ (-1));
            if (iIntValue <= 0) {
                int i16 = f53602d;
                int i17 = i16 & 113;
                int i18 = ((i16 ^ 113) | i17) << 1;
                int i19 = -((i16 | 113) & (~i17));
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                f53603e = i20 % 128;
                int i21 = i20 % 2;
                return;
            }
            int i22 = f53603e + 72;
            int i23 = (i22 ^ (-1)) + (i22 << 1);
            f53602d = i23 % 128;
            Object[] objArr2 = new Object[2];
            if (i23 % 2 != 0) {
                objArr2[0] = iArr2;
                objArr2[1] = iArr3;
                auz.setDividerPadding(objArr2, 1612100803, -1612100784, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{iArr3, iArr2}, -1148753475, 1148753489, (int) System.currentTimeMillis());
                int i24 = 80 / 0;
            } else {
                objArr2[0] = iArr2;
                objArr2[1] = iArr3;
                auz.setDividerPadding(objArr2, 1612100803, -1612100784, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{iArr3, iArr2}, -1148753475, 1148753489, (int) System.currentTimeMillis());
            }
            int i25 = f53602d;
            int i26 = (((i25 ^ 19) | (i25 & 19)) << 1) - (((~i25) & 19) | (i25 & (-20)));
            f53603e = i26 % 128;
            int i27 = i26 % 2;
        }
    }

    public static /* synthetic */ void e(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53603e;
        int i11 = ((i10 ^ 45) | (i10 & 45)) << 1;
        int i12 = -(((~i10) & 45) | (i10 & (-46)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53602d = i13 % 128;
        int i14 = i13 % 2;
        if (((Integer) auz.setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 1886561196, -1886561189, (int) System.currentTimeMillis())).intValue() != 0) {
            int i15 = f53603e;
            int i16 = ((i15 & (-44)) | ((~i15) & 43)) + ((i15 & 43) << 1);
            f53602d = i16 % 128;
            if (i16 % 2 != 0) {
                ((Integer) auy.setOnFocusChangeListener(new Object[]{iArr3}, -41416356, 41416368, (int) System.currentTimeMillis())).intValue();
                throw null;
            }
            ((Integer) auy.setOnFocusChangeListener(new Object[]{iArr3}, -41416356, 41416368, (int) System.currentTimeMillis())).intValue();
        }
        int i17 = f53603e;
        int i18 = (i17 ^ 83) + ((i17 & 83) << 1);
        f53602d = i18 % 128;
        int i19 = i18 % 2;
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, -420062112, 420062117, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0353  */
    /* JADX WARN: Code restructure failed: missing block: B:115:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0286, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.auz.setDividerPadding(new java.lang.Object[]{r6, r1}, 705102965, -705102950, (int) java.lang.System.currentTimeMillis())).booleanValue() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x049a, code lost:
    
        if (((java.lang.Integer) setDividerPadding(new java.lang.Object[]{r2}, -441250435, 441250450, (int) java.lang.System.currentTimeMillis())).intValue() != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x04bb, code lost:
    
        if (((java.lang.Integer) setDividerPadding(new java.lang.Object[]{r2}, -441250435, 441250450, (int) java.lang.System.currentTimeMillis())).intValue() != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x04be, code lost:
    
        r2 = new java.lang.Object[3];
        r2[r5] = r1;
        r2[1] = r1;
        r2[2] = r3;
        ((java.lang.Integer) com.mypinpad.tsdk.isolation.auz.setDividerPadding(r2, 1886561196, -1886561189, (int) java.lang.System.currentTimeMillis())).intValue();
        r0 = com.mypinpad.tsdk.isolation.aqm.f53602d;
        r1 = r0 & 125;
        r0 = -(-((r0 ^ 125) | r1));
        r2 = ((r1 | r0) << 1) - (r0 ^ r1);
        com.mypinpad.tsdk.isolation.aqm.f53603e = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x04f2, code lost:
    
        ((java.lang.Integer) com.mypinpad.tsdk.isolation.auz.setDividerPadding(new java.lang.Object[]{r1, r2, r3}, 1886561196, -1886561189, (int) java.lang.System.currentTimeMillis())).intValue();
        r0 = (-2) - ((com.mypinpad.tsdk.isolation.aqm.f53602d + 60) ^ (-1));
        com.mypinpad.tsdk.isolation.aqm.f53603e = r0 % 128;
        r0 = r0 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setDividerPadding(java.lang.Object[] r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 1722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aqm.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static void setNavigationOnClickListener(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, -1312640771, 1312640784, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, -1148753475, 1148753489, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, 113776561, -113776554, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, -990119338, 990119342, (int) System.currentTimeMillis());
    }

    public static int[] setCompoundDrawableTintBlendMode(BigInteger bigInteger) {
        return (int[]) setDividerPadding(new Object[]{bigInteger}, -1316932494, 1316932500, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, -1442327241, 1442327242, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 1881006800, -1881006800, (int) System.currentTimeMillis());
    }

    public static void setY(SecureRandom secureRandom, int[] iArr) {
        setDividerPadding(new Object[]{secureRandom, iArr}, 1147428156, -1147428154, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, -1058820036, 1058820048, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 404134666, -404134655, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int i10, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, Integer.valueOf(i10), iArr2}, 1187512982, -1187512972, i10);
    }

    public static void setDividerPadding(int i10, int[] iArr) {
        setDividerPadding(new Object[]{Integer.valueOf(i10), iArr}, -1829539249, 1829539252, i10);
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, 2048711234, -2048711226, (int) System.currentTimeMillis());
    }
}
