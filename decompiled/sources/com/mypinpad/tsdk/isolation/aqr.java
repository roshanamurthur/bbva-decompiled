package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class aqr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f53612a = {-4553, -2, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f53613b = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f53614c = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53615d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f53616e = 1;

    static {
        int i10 = 23 & (~0);
        int i11 = -(-0);
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        f53616e = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00a3  */
    public static /* synthetic */ void a(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53616e + 111;
        f53615d = i10 % 128;
        if (i10 % 2 != 0) {
            ((Integer) auv.setDividerPadding(new Object[]{Long.valueOf(((Long) auv.setDividerPadding(new Object[]{iArr, iArr, iArr2}, -1651870142, 1651870144, (int) System.currentTimeMillis())).longValue()), iArr2}, -1057481709, 1057481719, (int) System.currentTimeMillis())).intValue();
            throw null;
        }
        if (((Integer) auv.setDividerPadding(new Object[]{Long.valueOf(((Long) auv.setDividerPadding(new Object[]{iArr, iArr, iArr2}, -1651870142, 1651870144, (int) System.currentTimeMillis())).longValue()), iArr2}, -1057481709, 1057481719, (int) System.currentTimeMillis())).intValue() != 0) {
            ((Integer) auy.setOnFocusChangeListener(new Object[]{6, 4553, iArr2}, 1777683852, -1777683835, 6)).intValue();
            System.currentTimeMillis();
            System.currentTimeMillis();
        } else if (iArr2[5] == -1) {
            int i11 = f53615d;
            int i12 = i11 & 95;
            int i13 = (i12 - (~((i11 ^ 95) | i12))) - 1;
            f53616e = i13 % 128;
            int i14 = i13 % 2;
            int[] iArr3 = f53612a;
            if (i14 == 0) {
                ((Boolean) auv.setDividerPadding(new Object[]{iArr2, iArr3}, 2072990853, -2072990839, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            }
            if (!(!((Boolean) auv.setDividerPadding(new Object[]{iArr2, iArr3}, 2072990853, -2072990839, (int) System.currentTimeMillis())).booleanValue())) {
                ((Integer) auy.setOnFocusChangeListener(new Object[]{6, 4553, iArr2}, 1777683852, -1777683835, 6)).intValue();
                System.currentTimeMillis();
                System.currentTimeMillis();
            }
        }
        int i15 = f53616e;
        int i16 = i15 & 55;
        int i17 = (i16 - (~(-(-((i15 ^ 55) | i16))))) - 1;
        f53615d = i17 % 128;
        int i18 = i17 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0099  */
    public static /* synthetic */ void b(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53616e;
        int i11 = (((i10 & (-102)) | ((~i10) & 101)) - (~(-(-((i10 & 101) << 1))))) - 1;
        f53615d = i11 % 128;
        if (i11 % 2 == 0 ? ((Integer) auy.setOnFocusChangeListener(new Object[]{6, iArr, 0, iArr2}, -1008052683, 1008052691, 6)).intValue() != 0 : ((Integer) auy.setOnFocusChangeListener(new Object[]{73, iArr, 0, iArr2}, -1008052683, 1008052691, 73)).intValue() != 0) {
            ((Integer) auy.setOnFocusChangeListener(new Object[]{6, 4553, iArr2}, 1777683852, -1777683835, 6)).intValue();
            int i12 = f53615d;
            int i13 = i12 ^ 47;
            int i14 = ((((i12 & 47) | i13) << 1) - (~(-i13))) - 1;
            f53616e = i14 % 128;
            int i15 = i14 % 2;
        } else if (iArr2[5] == -1) {
            int i16 = f53616e;
            int i17 = ((i16 ^ 70) + ((i16 & 70) << 1)) - 1;
            f53615d = i17 % 128;
            int i18 = i17 % 2;
            if (((Boolean) auv.setDividerPadding(new Object[]{iArr2, f53612a}, 2072990853, -2072990839, (int) System.currentTimeMillis())).booleanValue()) {
                ((Integer) auy.setOnFocusChangeListener(new Object[]{6, 4553, iArr2}, 1777683852, -1777683835, 6)).intValue();
                int i19 = f53615d;
                int i110 = i19 ^ 47;
                int i111 = ((((i19 & 47) | i110) << 1) - (~(-i110))) - 1;
                f53616e = i111 % 128;
                int i112 = i111 % 2;
            }
        }
        int i20 = f53616e;
        int i21 = i20 & 53;
        int i22 = -(-((i20 ^ 53) | i21));
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        f53615d = i23 % 128;
        if (i23 % 2 != 0) {
            int i24 = 64 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00a0  */
    public static /* synthetic */ void c(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53615d;
        int i11 = (i10 & (-116)) | ((~i10) & 115);
        int i12 = -(-((i10 & 115) << 1));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53616e = i13 % 128;
        int i14 = i13 % 2;
        if (((Integer) auy.setOnFocusChangeListener(new Object[]{6, iArr, iArr2}, 1108035559, -1108035515, 6)).intValue() == 0) {
            int i15 = f53616e;
            int i16 = i15 ^ 99;
            int i17 = ((i15 & 99) | i16) << 1;
            int i18 = -i16;
            int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
            int i20 = i19 % 128;
            f53615d = i20;
            int i21 = i19 % 2;
            if (iArr2[5] == -1) {
                int i22 = ((i20 & (-4)) | ((~i20) & 3)) + ((i20 & 3) << 1);
                f53616e = i22 % 128;
                int i23 = i22 % 2;
                int[] iArr3 = f53612a;
                if (i23 == 0) {
                    ((Boolean) auv.setDividerPadding(new Object[]{iArr2, iArr3}, 2072990853, -2072990839, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                if (((Boolean) auv.setDividerPadding(new Object[]{iArr2, iArr3}, 2072990853, -2072990839, (int) System.currentTimeMillis())).booleanValue()) {
                    ((Integer) auy.setOnFocusChangeListener(new Object[]{6, 4553, iArr2}, 1777683852, -1777683835, 6)).intValue();
                    int i24 = f53615d + 37;
                    f53616e = i24 % 128;
                    int i25 = i24 % 2;
                }
            }
        } else {
            ((Integer) auy.setOnFocusChangeListener(new Object[]{6, 4553, iArr2}, 1777683852, -1777683835, 6)).intValue();
            int i26 = f53615d + 37;
            f53616e = i26 % 128;
            int i27 = i26 % 2;
        }
        int i28 = f53616e;
        int i29 = i28 & 79;
        int i30 = (((i28 | 79) & (~i29)) - (~(-(-(i29 << 1))))) - 1;
        f53615d = i30 % 128;
        int i31 = i30 % 2;
    }

    public static /* synthetic */ void d(Object[] objArr) {
        int[] iArr;
        int[] iArr2 = (int[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53616e;
        int i11 = i10 & 125;
        int i12 = ((i10 | 125) & (~i11)) + (i11 << 1);
        f53615d = i12 % 128;
        if (i12 % 2 != 0) {
            iArr = (int[]) auv.setDividerPadding(new Object[0], -59948977, 59948985, (int) System.currentTimeMillis());
            auv.setDividerPadding(new Object[]{iArr2, iArr}, 955273017, -955272992, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr3}, -1276704570, 1276704575, (int) System.currentTimeMillis());
            int i13 = 11 / 0;
        } else {
            iArr = (int[]) auv.setDividerPadding(new Object[0], -59948977, 59948985, (int) System.currentTimeMillis());
            auv.setDividerPadding(new Object[]{iArr2, iArr}, 955273017, -955272992, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr3}, -1276704570, 1276704575, (int) System.currentTimeMillis());
        }
        while (true) {
            int i14 = ((iIntValue ^ (-21)) | (iIntValue & (-21))) << 1;
            int i15 = -(((~iIntValue) & (-21)) | (iIntValue & 20));
            int i16 = (i14 & i15) + (i14 | i15);
            int i17 = i16 | 20;
            int i18 = i17 << 1;
            int i19 = -(i17 & (~(i16 & 20)));
            iIntValue = (i18 ^ i19) + ((i19 & i18) << 1);
            if (iIntValue <= 0) {
                break;
            }
            int i20 = f53615d;
            int i21 = i20 ^ 29;
            int i22 = (i20 & 29) << 1;
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            f53616e = i23 % 128;
            int i24 = i23 % 2;
            auv.setDividerPadding(new Object[]{iArr3, iArr}, 955273017, -955272992, (int) System.currentTimeMillis());
            setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr3}, -1276704570, 1276704575, (int) System.currentTimeMillis());
            int i25 = f53615d;
            int i26 = i25 & 71;
            int i27 = (i25 | 71) & (~i26);
            int i28 = -(-(i26 << 1));
            int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
            f53616e = i29 % 128;
            int i30 = i29 % 2;
        }
        int i31 = f53615d;
        int i32 = i31 & 107;
        int i33 = (i31 | 107) & (~i32);
        int i34 = -(-(i32 << 1));
        int i35 = (i33 & i34) + (i33 | i34);
        f53616e = i35 % 128;
        if (i35 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x009a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0078  */
    public static /* synthetic */ void e(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53615d;
        int i11 = (i10 & 103) + (i10 | 103);
        f53616e = i11 % 128;
        int i12 = i11 % 2;
        if (((Integer) auv.setDividerPadding(new Object[]{iArr, iArr2, iArr3}, -275346568, 275346590, (int) System.currentTimeMillis())).intValue() == 0) {
            int i13 = f53615d;
            int i14 = i13 & 39;
            int i15 = i14 + ((i13 ^ 39) | i14);
            int i16 = i15 % 128;
            f53616e = i16;
            int i17 = i15 % 2;
            if (iArr3[11] == -1) {
                int i18 = i16 + 29;
                f53615d = i18 % 128;
                int i19 = i18 % 2;
                if (((Boolean) auy.setOnFocusChangeListener(new Object[]{12, iArr3, f53613b}, 280624047, -280624046, 12)).booleanValue()) {
                    if (((Integer) auy.setOnFocusChangeListener(new Object[]{8, f53614c, iArr3}, -1807856331, 1807856377, 8)).intValue() != 0) {
                        int i20 = f53615d;
                        int i21 = i20 & 109;
                        int i22 = i20 | 109;
                        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                        f53616e = i23 % 128;
                        int i24 = i23 % 2;
                        ((Integer) auy.setOnFocusChangeListener(new Object[]{12, iArr3, 8}, -668114120, 668114158, 12)).intValue();
                        int i25 = f53616e;
                        int i26 = (((i25 & (-90)) | ((~i25) & 89)) - (~(-(-((i25 & 89) << 1))))) - 1;
                        f53615d = i26 % 128;
                        int i27 = i26 % 2;
                    }
                }
            }
        } else if (((Integer) auy.setOnFocusChangeListener(new Object[]{8, f53614c, iArr3}, -1807856331, 1807856377, 8)).intValue() != 0) {
            int i28 = f53615d;
            int i29 = i28 & 109;
            int i210 = i28 | 109;
            int i211 = (i29 ^ i210) + ((i210 & i29) << 1);
            f53616e = i211 % 128;
            int i212 = i211 % 2;
            ((Integer) auy.setOnFocusChangeListener(new Object[]{12, iArr3, 8}, -668114120, 668114158, 12)).intValue();
            int i213 = f53616e;
            int i214 = (((i213 & (-90)) | ((~i213) & 89)) - (~(-(-((i213 & 89) << 1))))) - 1;
            f53615d = i214 % 128;
            int i215 = i214 % 2;
        }
        int i30 = f53615d;
        int i31 = (i30 ^ 119) + ((i30 & 119) << 1);
        f53616e = i31 % 128;
        if (i31 % 2 == 0) {
            int i32 = 46 / 0;
        }
    }

    public static /* synthetic */ void f(Object[] objArr) {
        SecureRandom secureRandom = (SecureRandom) objArr[0];
        int[] iArr = (int[]) objArr[1];
        do {
            setCompoundDrawableTintBlendMode(new Object[]{secureRandom, iArr}, -1544465097, 1544465109, (int) System.currentTimeMillis());
        } while (((Integer) setCompoundDrawableTintBlendMode(new Object[]{iArr}, 1244338453, -1244338453, (int) System.currentTimeMillis())).intValue() != 0);
        int i10 = f53616e;
        int i11 = i10 | 31;
        int i12 = i11 << 1;
        int i13 = -((~(i10 & 31)) & i11);
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        f53615d = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void g(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53615d;
        int i11 = ((i10 ^ 126) + ((i10 & 126) << 1)) - 1;
        f53616e = i11 % 128;
        int i12 = i11 % 2;
        int[] iArr3 = f53612a;
        if (i12 != 0) {
            ava.setOnFocusChangeListener(new Object[]{iArr3, iArr, iArr2}, 1200653283, -1200653275, (int) System.currentTimeMillis());
        } else {
            ava.setOnFocusChangeListener(new Object[]{iArr3, iArr, iArr2}, 1200653283, -1200653275, (int) System.currentTimeMillis());
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0176  */
    /* JADX WARN: Code duplicated, block: B:25:0x018c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0190  */
    /* JADX WARN: Code duplicated, block: B:29:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:32:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:46:0x027b  */
    /* JADX WARN: Code duplicated, block: B:89:0x056a  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0600, code lost:
    
        if (((java.lang.Integer) setCompoundDrawableTintBlendMode(r3, 1244338453, -1244338453, (int) java.lang.System.currentTimeMillis())).intValue() != 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0602, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.aqr.f53616e;
        r4 = r0 & 57;
        r3 = ((r0 ^ 57) | r4) << 1;
        r0 = -((r0 | 57) & (~r4));
        r4 = (r3 ^ r0) + ((r0 & r3) << 1);
        com.mypinpad.tsdk.isolation.aqr.f53615d = r4 % 128;
        r4 = r4 % 2;
        ((java.lang.Integer) com.mypinpad.tsdk.isolation.auv.setDividerPadding(new java.lang.Object[]{r2, r2, r1}, 1996833703, -1996833684, (int) java.lang.System.currentTimeMillis())).intValue();
        r0 = com.mypinpad.tsdk.isolation.aqr.f53616e;
        r2 = r0 & 95;
        r1 = ((r0 ^ 95) | r2) << 1;
        r0 = -((r0 | 95) & (~r2));
        r2 = ((r1 | r0) << 1) - (r0 ^ r1);
        com.mypinpad.tsdk.isolation.aqr.f53615d = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x064e, code lost:
    
        ((java.lang.Integer) com.mypinpad.tsdk.isolation.auv.setDividerPadding(new java.lang.Object[]{r2, r0, r1}, 1996833703, -1996833684, (int) java.lang.System.currentTimeMillis())).intValue();
        r0 = com.mypinpad.tsdk.isolation.aqr.f53615d;
        r1 = ((r0 | 29) << 1) - (r0 ^ 29);
        com.mypinpad.tsdk.isolation.aqr.f53616e = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0677, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x05e4, code lost:
    
        if (1 != ((java.lang.Integer) setCompoundDrawableTintBlendMode(r3, 1244338453, -1244338453, (int) java.lang.System.currentTimeMillis())).intValue()) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 1694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aqr.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static void setDividerPadding(int[] iArr, int i10, int[] iArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{iArr, Integer.valueOf(i10), iArr2}, 2126003926, -2126003916, i10);
    }

    public static void setNavigationOnClickListener(int[] iArr, int[] iArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2}, 786843980, -786843971, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2, int[] iArr3) {
        setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2, iArr3}, 2077221675, -2077221664, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2, int[] iArr3) {
        setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2, iArr3}, -429793923, 429793931, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int[] iArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2}, -1052434624, 1052434630, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int i10, int[] iArr) {
        setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i10), iArr}, 448806955, -448806940, i10);
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2}, -1276704570, 1276704575, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2}, 1580055306, -1580055302, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(SecureRandom secureRandom, int[] iArr) {
        setCompoundDrawableTintBlendMode(new Object[]{secureRandom, iArr}, -882904101, 882904104, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2}, -939934994, 939935001, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2, int[] iArr3) {
        setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2, iArr3}, -686706983, 686706985, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2}, -164590307, 164590308, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2, int[] iArr3) {
        setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2, iArr3}, 414135046, -414135033, (int) System.currentTimeMillis());
    }

    public static int[] setCompoundDrawableTintBlendMode(BigInteger bigInteger) {
        return (int[]) setCompoundDrawableTintBlendMode(new Object[]{bigInteger}, 1280384229, -1280384215, (int) System.currentTimeMillis());
    }
}
