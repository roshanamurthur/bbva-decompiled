package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class arb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f53648a = {-6803, -2, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f53649b = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f53650c = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53651d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f53652e = 1;

    static {
        int i10 = 1 & 105;
        int i11 = (1 ^ 105) | i10;
        int i12 = (i10 & i11) + (i10 | i11);
        f53651d = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0071  */
    /* JADX WARN: Code duplicated, block: B:13:0x0089  */
    /* JADX WARN: Code duplicated, block: B:14:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x004c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0052  */
    public static /* synthetic */ void a(Object[] objArr) {
        int i10;
        int[] iArr;
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr2 = (int[]) objArr[1];
        int i11 = f53652e;
        int i12 = (i11 ^ 39) + ((i11 & 39) << 1);
        int i13 = i12 % 128;
        f53651d = i13;
        if (i12 % 2 != 0) {
            throw null;
        }
        if (iIntValue != 0) {
            int i14 = i13 & 27;
            int i15 = (i14 - (~(-(-((i13 ^ 27) | i14))))) - 1;
            f53652e = i15 % 128;
            int i16 = i15 % 2;
            if (((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(iIntValue), iArr2}, 1238931695, -1238931676, iIntValue)).intValue() != 0) {
                ((Integer) auy.setOnFocusChangeListener(new Object[]{7, 6803, iArr2}, 1777683852, -1777683835, 7)).intValue();
                int i17 = f53652e;
                int i18 = i17 & 123;
                int i19 = (i17 | 123) & (~i18);
                int i20 = -(-(i18 << 1));
                int i21 = (i19 & i20) + (i19 | i20);
                f53651d = i21 % 128;
                int i22 = i21 % 2;
            } else if (iArr2[6] == -1) {
                int i23 = f53652e;
                int i24 = i23 & 77;
                int i25 = ((((i23 ^ 77) | i24) << 1) - (~(-((i23 | 77) & (~i24))))) - 1;
                f53651d = i25 % 128;
                i10 = i25 % 2;
                iArr = f53648a;
                if (i10 == 0) {
                    ((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                if (!(!((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue())) {
                    ((Integer) auy.setOnFocusChangeListener(new Object[]{7, 6803, iArr2}, 1777683852, -1777683835, 7)).intValue();
                    int i110 = f53652e;
                    int i111 = i110 & 123;
                    int i112 = (i110 | 123) & (~i111);
                    int i26 = -(-(i111 << 1));
                    int i27 = (i112 & i26) + (i112 | i26);
                    f53651d = i27 % 128;
                    int i28 = i27 % 2;
                }
            }
        } else if (iArr2[6] == -1) {
            int i29 = f53652e;
            int i210 = i29 & 77;
            int i211 = ((((i29 ^ 77) | i210) << 1) - (~(-((i29 | 77) & (~i210))))) - 1;
            f53651d = i211 % 128;
            i10 = i211 % 2;
            iArr = f53648a;
            if (i10 == 0) {
                ((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            }
            if (!(!((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue())) {
                ((Integer) auy.setOnFocusChangeListener(new Object[]{7, 6803, iArr2}, 1777683852, -1777683835, 7)).intValue();
                int i113 = f53652e;
                int i114 = i113 & 123;
                int i115 = (i113 | 123) & (~i114);
                int i212 = -(-(i114 << 1));
                int i213 = (i115 & i212) + (i115 | i212);
                f53651d = i213 % 128;
                int i214 = i213 % 2;
            }
        }
        int i30 = f53652e;
        int i31 = (i30 & 123) + (i30 | 123);
        f53651d = i31 % 128;
        int i32 = i31 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00b3  */
    public static /* synthetic */ void b(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53651d - (-1);
        f53652e = i10 % 128;
        if (i10 % 2 != 0 ? ((Integer) auy.setOnFocusChangeListener(new Object[]{7, iArr, 0, iArr2}, -1008052683, 1008052691, 7)).intValue() != 0 : ((Integer) auy.setOnFocusChangeListener(new Object[]{71, iArr, 0, iArr2}, -1008052683, 1008052691, 71)).intValue() != 0) {
            ((Integer) auy.setOnFocusChangeListener(new Object[]{7, 6803, iArr2}, 1777683852, -1777683835, 7)).intValue();
            int i11 = f53652e;
            int i12 = ((i11 ^ 58) + ((i11 & 58) << 1)) - 1;
            f53651d = i12 % 128;
            int i13 = i12 % 2;
        } else {
            int i14 = f53652e;
            int i15 = i14 & 69;
            int i16 = (i14 | 69) & (~i15);
            int i17 = -(-(i15 << 1));
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            int i19 = i18 % 128;
            f53651d = i19;
            int i20 = i18 % 2;
            if (iArr2[6] == -1) {
                int i21 = i19 + 85;
                f53652e = i21 % 128;
                int i22 = i21 % 2;
                int[] iArr3 = f53648a;
                if (i22 == 0) {
                    ((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr3}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                if (((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr3}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue()) {
                    ((Integer) auy.setOnFocusChangeListener(new Object[]{7, 6803, iArr2}, 1777683852, -1777683835, 7)).intValue();
                    int i110 = f53652e;
                    int i111 = ((i110 ^ 58) + ((i110 & 58) << 1)) - 1;
                    f53651d = i111 % 128;
                    int i112 = i111 % 2;
                }
            }
        }
        int i23 = f53651d;
        int i24 = i23 & 81;
        int i25 = (i23 | 81) & (~i24);
        int i26 = -(-(i24 << 1));
        int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
        f53652e = i27 % 128;
        if (i27 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0091  */
    public static /* synthetic */ void c(Object[] objArr) {
        int i10;
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i11 = f53652e;
        int i12 = i11 & 35;
        int i13 = (i12 - (~((i11 ^ 35) | i12))) - 1;
        f53651d = i13 % 128;
        if (i13 % 2 == 0) {
            if (((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(((Long) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr, iArr2}, -1380286297, 1380286301, (int) System.currentTimeMillis())).longValue()), iArr2}, 1298222076, -1298222061, (int) System.currentTimeMillis())).intValue() == 0) {
                int i14 = f53651d;
                int i15 = i14 & 35;
                int i16 = (i14 | 35) & (~i15);
                int i17 = -(-(i15 << 1));
                i10 = ((i16 | i17) << 1) - (i16 ^ i17);
                f53652e = i10 % 128;
                if (i10 % 2 == 0) {
                    if (((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, f53648a}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue()) {
                    }
                } else if (((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, f53648a}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue()) {
                }
            }
            int i18 = f53651d + 7;
            f53652e = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = 20 / 0;
        if (((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(((Long) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr, iArr2}, -1380286297, 1380286301, (int) System.currentTimeMillis())).longValue()), iArr2}, 1298222076, -1298222061, (int) System.currentTimeMillis())).intValue() == 0) {
            int i110 = f53651d;
            int i111 = i110 & 35;
            int i112 = (i110 | 35) & (~i111);
            int i113 = -(-(i111 << 1));
            i10 = ((i112 | i113) << 1) - (i112 ^ i113);
            f53652e = i10 % 128;
            if (i10 % 2 == 0 ? iArr2[6] == -1 : iArr2[49] == -1) {
                if (((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, f53648a}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue()) {
                }
            }
        }
        int i114 = f53651d + 7;
        f53652e = i114 % 128;
        int i115 = i114 % 2;
        ((Integer) auy.setOnFocusChangeListener(new Object[]{7, 6803, iArr2}, 1777683852, -1777683835, 7)).intValue();
        int i21 = f53652e;
        int i22 = i21 & 3;
        int i23 = (i21 | 3) & (~i22);
        int i24 = -(-(i22 << 1));
        int i25 = (i23 & i24) + (i23 | i24);
        f53651d = i25 % 128;
        int i26 = i25 % 2;
        int i116 = f53651d + 7;
        f53652e = i116 % 128;
        int i117 = i116 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0083  */
    public static /* synthetic */ void d(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53651d;
        int i11 = i10 & 83;
        int i12 = (i11 - (~(-(-((i10 ^ 83) | i11))))) - 1;
        f53652e = i12 % 128;
        if (i12 % 2 == 0) {
            ((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2, iArr3}, 210372306, -210372290, (int) System.currentTimeMillis())).intValue();
            throw null;
        }
        if (((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2, iArr3}, 210372306, -210372290, (int) System.currentTimeMillis())).intValue() == 0) {
            int i13 = f53652e;
            int i14 = i13 & 27;
            int i15 = -(-((i13 ^ 27) | i14));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            f53651d = i16 % 128;
            if (i16 % 2 == 0 ? iArr3[6] == -1 : iArr3[2] == -1) {
                if (((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr3, f53648a}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue()) {
                    ((Integer) auy.setOnFocusChangeListener(new Object[]{7, 6803, iArr3}, 1777683852, -1777683835, 7)).intValue();
                    int i17 = f53652e;
                    int i18 = i17 & 79;
                    int i19 = i18 + ((i17 ^ 79) | i18);
                    f53651d = i19 % 128;
                    int i20 = i19 % 2;
                }
            }
        } else {
            ((Integer) auy.setOnFocusChangeListener(new Object[]{7, 6803, iArr3}, 1777683852, -1777683835, 7)).intValue();
            int i110 = f53652e;
            int i111 = i110 & 79;
            int i112 = i111 + ((i110 ^ 79) | i111);
            f53651d = i112 % 128;
            int i21 = i112 % 2;
        }
        int i22 = f53651d;
        int i23 = i22 ^ 63;
        int i24 = ((i22 & 63) | i23) << 1;
        int i25 = -i23;
        int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
        f53652e = i26 % 128;
        if (i26 % 2 == 0) {
            throw null;
        }
    }

    public static void getNavBarTitleString(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, 107180563, -107180560, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, -796404586, 796404594, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:111:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:113:0x06df  */
    /* JADX WARN: Code duplicated, block: B:115:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:117:0x0710  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x05da  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        Object onFocusChangeListener;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~(i14 | i15);
        int i17 = ~i12;
        int i18 = (~(i14 | i17)) | i16 | (~(i15 | i17));
        int i19 = i10 | i11;
        int i20 = ((i18 | (~(i19 | i12))) * (-84)) + (i11 * 85) + (i10 * 85);
        int i21 = i10 | (~(i12 | i15));
        int i22 = ~(i11 | i17);
        int i23 = ((i22 | (~i19)) * 84) + ((i21 | i22) * (-84)) + i20;
        int[] iArr = f53648a;
        switch (i23) {
            case 1:
                int[] iArr2 = (int[]) objArr[0];
                int[] iArr3 = (int[]) objArr[1];
                int[] iArr4 = (int[]) objArr[2];
                int i24 = f53652e;
                int i25 = (((i24 & (-86)) | ((~i24) & 85)) - (~(-(-((i24 & 85) << 1))))) - 1;
                f53651d = i25 % 128;
                if (i25 % 2 == 0) {
                    int[] iArr5 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1039101633, 1039101643, (int) System.currentTimeMillis());
                    avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr3, iArr5}, 1112455082, -1112455081, (int) System.currentTimeMillis());
                    setDividerPadding(new Object[]{iArr5, iArr4}, -53995853, 53995859, (int) System.currentTimeMillis());
                    break;
                } else {
                    int[] iArr6 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1039101633, 1039101643, (int) System.currentTimeMillis());
                    avb.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr3, iArr6}, 1112455082, -1112455081, (int) System.currentTimeMillis());
                    setDividerPadding(new Object[]{iArr6, iArr4}, -53995853, 53995859, (int) System.currentTimeMillis());
                    int i26 = 52 / 0;
                }
                int i27 = f53652e;
                int i28 = ((i27 ^ 35) | (i27 & 35)) << 1;
                int i29 = -(((~i27) & 35) | (i27 & (-36)));
                int i30 = (i28 & i29) + (i29 | i28);
                f53651d = i30 % 128;
                int i31 = i30 % 2;
                return null;
            case 2:
                d(objArr);
                return null;
            case 3:
                b(objArr);
                return null;
            case 4:
                a(objArr);
                return null;
            case 5:
                SecureRandom secureRandom = (SecureRandom) objArr[0];
                int[] iArr7 = (int[]) objArr[1];
                int i32 = f53652e;
                int i33 = (i32 & (-54)) | ((~i32) & 53);
                int i34 = (i32 & 53) << 1;
                int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
                f53651d = i35 % 128;
                byte[] bArr = new byte[i35 % 2 != 0 ? 49 : 28];
                int i36 = i32 + 79;
                f53651d = i36 % 128;
                int i37 = i36 % 2;
                do {
                    secureRandom.nextBytes(bArr);
                    ber.setDividerPadding(new Object[]{bArr, 0, iArr7, 7}, 1570947064, -1570947056, 0);
                } while (((Integer) auy.setOnFocusChangeListener(new Object[]{7, iArr7, iArr}, -188447753, 188447787, 7)).intValue() == 0);
                int i38 = f53652e;
                int i39 = ((i38 | 109) << 1) - (((~i38) & 109) | (i38 & (-110)));
                f53651d = i39 % 128;
                int i40 = i39 % 2;
                return null;
            case 6:
                c(objArr);
                return null;
            case 7:
                int[] iArr8 = (int[]) objArr[0];
                int[] iArr9 = (int[]) objArr[1];
                int[] iArr10 = (int[]) objArr[2];
                int i41 = f53652e;
                int i42 = i41 & 89;
                int i43 = i41 | 89;
                int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                f53651d = i44 % 128;
                int i45 = i44 % 2;
                if (((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr8, iArr9, iArr10}, -1558441269, 1558441282, (int) System.currentTimeMillis())).intValue() == 0) {
                    int i46 = f53651d;
                    int i47 = (-2) - (((i46 & 44) + (i46 | 44)) ^ (-1));
                    f53652e = i47 % 128;
                    if (i47 % 2 != 0 ? iArr10[13] == -1 : iArr10[88] == -1) {
                        int i48 = (i46 ^ 121) + ((i46 & 121) << 1);
                        f53652e = i48 % 128;
                        int i49 = i48 % 2;
                        int[] iArr11 = f53649b;
                        if (i49 != 0 ? !(!((Boolean) auy.setOnFocusChangeListener(new Object[]{14, iArr10, iArr11}, 280624047, -280624046, 14)).booleanValue()) : !(!((Boolean) auy.setOnFocusChangeListener(new Object[]{72, iArr10, iArr11}, 280624047, -280624046, 72)).booleanValue())) {
                            if (((Integer) auy.setOnFocusChangeListener(new Object[]{9, f53650c, iArr10}, -1807856331, 1807856377, 9)).intValue() != 0) {
                                int i50 = f53651d;
                                i13 = (i50 ^ 55) + ((i50 & 55) << 1);
                                f53652e = i13 % 128;
                                if (i13 % 2 == 0) {
                                    onFocusChangeListener = auy.setOnFocusChangeListener(new Object[]{75, iArr10, 9}, -668114120, 668114158, 75);
                                } else {
                                    onFocusChangeListener = auy.setOnFocusChangeListener(new Object[]{14, iArr10, 9}, -668114120, 668114158, 14);
                                }
                                ((Integer) onFocusChangeListener).intValue();
                            }
                        }
                    }
                } else if (((Integer) auy.setOnFocusChangeListener(new Object[]{9, f53650c, iArr10}, -1807856331, 1807856377, 9)).intValue() != 0) {
                    int i51 = f53651d;
                    i13 = (i51 ^ 55) + ((i51 & 55) << 1);
                    f53652e = i13 % 128;
                    if (i13 % 2 == 0) {
                        onFocusChangeListener = auy.setOnFocusChangeListener(new Object[]{75, iArr10, 9}, -668114120, 668114158, 75);
                    } else {
                        onFocusChangeListener = auy.setOnFocusChangeListener(new Object[]{14, iArr10, 9}, -668114120, 668114158, 14);
                    }
                    ((Integer) onFocusChangeListener).intValue();
                }
                int i52 = f53651d;
                int i53 = i52 & 113;
                int i54 = (((i52 | 113) & (~i53)) - (~(-(-(i53 << 1))))) - 1;
                f53652e = i54 % 128;
                if (i54 % 2 != 0) {
                    return null;
                }
                throw null;
            case 8:
                int[] iArr12 = (int[]) objArr[0];
                int[] iArr13 = (int[]) objArr[1];
                int[] iArr14 = (int[]) objArr[2];
                int i55 = f53651d;
                int i56 = (i55 ^ 123) + ((i55 & 123) << 1);
                f53652e = i56 % 128;
                if (i56 % 2 == 0) {
                    Object[] objArr2 = {iArr12, iArr13, iArr14};
                    int i57 = 67 / 0;
                    if (((Integer) avb.setCompoundDrawableTintBlendMode(objArr2, -201684302, 201684313, (int) System.currentTimeMillis())).intValue() != 0) {
                        ((Integer) auy.setOnFocusChangeListener(new Object[]{7, 6803, iArr14}, -380025688, 380025712, 7)).intValue();
                        int i58 = f53652e;
                        int i59 = i58 & 67;
                        int i60 = (i59 - (~((i58 ^ 67) | i59))) - 1;
                        f53651d = i60 % 128;
                        int i61 = i60 % 2;
                    }
                } else if (((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr12, iArr13, iArr14}, -201684302, 201684313, (int) System.currentTimeMillis())).intValue() != 0) {
                    ((Integer) auy.setOnFocusChangeListener(new Object[]{7, 6803, iArr14}, -380025688, 380025712, 7)).intValue();
                    int i510 = f53652e;
                    int i511 = i510 & 67;
                    int i62 = (i511 - (~((i510 ^ 67) | i511))) - 1;
                    f53651d = i62 % 128;
                    int i63 = i62 % 2;
                }
                int i64 = f53652e;
                int i65 = (((i64 & (-18)) | ((~i64) & 17)) - (~(-(-((i64 & 17) << 1))))) - 1;
                f53651d = i65 % 128;
                if (i65 % 2 == 0) {
                    return null;
                }
                throw null;
            case 9:
                int[] iArr15 = (int[]) objArr[0];
                int i66 = f53651d;
                int i67 = ((i66 ^ 23) | (i66 & 23)) << 1;
                int i68 = -((i66 & (-24)) | ((~i66) & 23));
                int i69 = (i67 ^ i68) + ((i67 & i68) << 1);
                f53652e = i69 % 128;
                int i70 = i69 % 2;
                int i71 = i66 & 103;
                int i72 = ((((i66 ^ 103) | i71) << 1) - (~(-((i66 | 103) & (~i71))))) - 1;
                f53652e = i72 % 128;
                int i73 = i72 % 2;
                int i74 = 0;
                int i75 = 0;
                while (i74 < 7) {
                    int i76 = f53652e;
                    int i77 = (i76 ^ 23) + ((i76 & 23) << 1);
                    int i78 = i77 % 128;
                    f53651d = i78;
                    int i79 = i77 % 2;
                    int i80 = iArr15[i74];
                    i75 = (i75 & i80) | (i75 ^ i80);
                    int i81 = (i74 | (-78)) << 1;
                    int i82 = -(i74 ^ (-78));
                    int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
                    i74 = ((i83 & (-80)) | ((~i83) & 79)) + ((i83 & 79) << 1);
                    int i84 = ((i78 | 4) << 1) - (i78 ^ 4);
                    int i85 = (i84 ^ (-1)) + (i84 << 1);
                    f53652e = i85 % 128;
                    int i86 = i85 % 2;
                }
                int i87 = (i75 >>> 1) | (i75 & 1);
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i88 = i87 * 832;
                int i89 = ((830 | i88) << 1) - (i88 ^ 830);
                int i90 = ~i87;
                int i91 = ~iCurrentTimeMillis;
                int i92 = (i91 | iCurrentTimeMillis) & i91;
                int i93 = (~i92) & i90;
                int i94 = ~i90;
                int i95 = ~((i92 & i90) | i93 | (i92 & i94));
                int i96 = ~((i91 ^ iCurrentTimeMillis) | (i91 & iCurrentTimeMillis));
                int i97 = i95 & i96;
                int i98 = -(-((((i95 | i96) & (~i97)) | i97) * (-831)));
                int i99 = ((i89 & i98) - (~(-(-(i89 | i98))))) - 1;
                int i100 = (i94 ^ i90) | (i94 & i90);
                int i101 = i100 ^ iCurrentTimeMillis;
                int i102 = i100 & iCurrentTimeMillis;
                int i103 = -(-((~((i102 & i101) | (i101 ^ i102))) * (-1662)));
                int i104 = (i99 & i103) + (i103 | i99);
                int i105 = ~i91;
                int i106 = i105 & i96;
                int i107 = (i105 | i96) & (~i106);
                int i108 = (i107 & i106) | (i107 ^ i106);
                int i109 = (i90 & iCurrentTimeMillis) | (i91 & i87);
                int i110 = i87 & iCurrentTimeMillis;
                int i111 = (i110 & i109) | (i109 ^ i110);
                int i112 = ~i111;
                int i113 = (i111 | i112) & i112;
                int i114 = i108 & i113;
                int i115 = (i113 | i108) & (~i114);
                int i116 = -(-(((i115 & i114) | (i115 ^ i114)) * 831));
                int i117 = i104 & i116;
                int i118 = ((((i116 | i104) & (~i117)) - (~(i117 << 1))) - 1) >> 31;
                int i119 = (-2) - ((f53652e + 40) ^ (-1));
                f53651d = i119 % 128;
                if (i119 % 2 != 0) {
                    int i120 = 3 / 0;
                }
                return Integer.valueOf(i118);
            case 10:
                BigInteger bigInteger = (BigInteger) objArr[0];
                int i121 = f53652e;
                int i122 = ((i121 ^ 61) - (~(-(-((i121 & 61) << 1))))) - 1;
                f53651d = i122 % 128;
                int i123 = i122 % 2;
                int[] iArr16 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[]{bigInteger}, 1823441057, -1823441048, (int) System.currentTimeMillis());
                if (iArr16[6] == -1) {
                    int i124 = f53652e;
                    int i125 = ((i124 ^ 48) + ((i124 & 48) << 1)) - 1;
                    f53651d = i125 % 128;
                    if (i125 % 2 != 0) {
                        ((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr16, iArr}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue();
                        throw null;
                    }
                    if (((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr16, iArr}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue()) {
                        ((Integer) auy.setOnFocusChangeListener(new Object[]{7, 6803, iArr16}, 1777683852, -1777683835, 7)).intValue();
                        int i126 = f53652e + 71;
                        f53651d = i126 % 128;
                        int i127 = i126 % 2;
                    }
                }
                int i128 = f53651d;
                int i129 = ((i128 ^ 61) | (i128 & 61)) << 1;
                int i130 = -(((~i128) & 61) | (i128 & (-62)));
                int i131 = (i129 ^ i130) + ((i130 & i129) << 1);
                f53652e = i131 % 128;
                int i132 = i131 % 2;
                return iArr16;
            case 11:
                int[] iArr17 = (int[]) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int[] iArr18 = (int[]) objArr[2];
                int i133 = f53651d + 71;
                f53652e = i133 % 128;
                int i134 = i133 % 2;
                int[] iArr19 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1039101633, 1039101643, (int) System.currentTimeMillis());
                avb.setCompoundDrawableTintBlendMode(new Object[]{iArr17, iArr19}, 1407394238, -1407394231, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{iArr19, iArr18}, -53995853, 53995859, (int) System.currentTimeMillis());
                int i135 = f53652e;
                int i136 = i135 & 67;
                int i137 = -(-(i135 | 67));
                int i138 = ((i136 | i137) << 1) - (i137 ^ i136);
                f53651d = i138 % 128;
                while (true) {
                    int i139 = i138 % 2;
                    int i140 = (iIntValue & (-49)) | ((~iIntValue) & 48);
                    int i141 = -(-((iIntValue & 48) << 1));
                    int i142 = (i140 & i141) + (i140 | i141);
                    int i143 = i142 & (-49);
                    iIntValue = ((~i143) & (i142 | (-49))) + (i143 << 1);
                    int i144 = f53651d;
                    if (iIntValue <= 0) {
                        int i145 = ((i144 & 116) + (i144 | 116)) - 1;
                        f53652e = i145 % 128;
                        if (i145 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    }
                    int i146 = i144 & 77;
                    int i147 = ((((i144 ^ 77) | i146) << 1) - (~(-((i144 | 77) & (~i146))))) - 1;
                    f53652e = i147 % 128;
                    Object[] objArr3 = new Object[2];
                    if (i147 % 2 == 0) {
                        objArr3[0] = iArr18;
                        objArr3[1] = iArr19;
                        avb.setCompoundDrawableTintBlendMode(objArr3, 1407394238, -1407394231, (int) System.currentTimeMillis());
                        setDividerPadding(new Object[]{iArr19, iArr18}, -53995853, 53995859, (int) System.currentTimeMillis());
                        throw null;
                    }
                    objArr3[0] = iArr18;
                    objArr3[1] = iArr19;
                    avb.setCompoundDrawableTintBlendMode(objArr3, 1407394238, -1407394231, (int) System.currentTimeMillis());
                    setDividerPadding(new Object[]{iArr19, iArr18}, -53995853, 53995859, (int) System.currentTimeMillis());
                    int i148 = f53651d;
                    int i149 = i148 & 27;
                    int i150 = (i148 | 27) & (~i149);
                    int i151 = -(-(i149 << 1));
                    i138 = (i150 ^ i151) + ((i150 & i151) << 1);
                    f53652e = i138 % 128;
                }
                break;
            case 12:
                SecureRandom secureRandom2 = (SecureRandom) objArr[0];
                int[] iArr20 = (int[]) objArr[1];
                do {
                    setDividerPadding(new Object[]{secureRandom2, iArr20}, 430301905, -430301900, (int) System.currentTimeMillis());
                } while (((Integer) setDividerPadding(new Object[]{iArr20}, 708134973, -708134964, (int) System.currentTimeMillis())).intValue() != 0);
                int i152 = f53652e;
                int i153 = i152 | 43;
                int i154 = (i153 << 1) - ((~(i152 & 43)) & i153);
                f53651d = i154 % 128;
                if (i154 % 2 == 0) {
                    return null;
                }
                int i155 = 79 / 0;
                return null;
            case 13:
                int[] iArr21 = (int[]) objArr[0];
                int[] iArr22 = (int[]) objArr[1];
                int i156 = f53652e + 3;
                f53651d = i156 % 128;
                if (i156 % 2 == 0 ? ((Integer) setDividerPadding(new Object[]{iArr21}, 708134973, -708134964, (int) System.currentTimeMillis())).intValue() == 0 : ((Integer) setDividerPadding(new Object[]{iArr21}, 708134973, -708134964, (int) System.currentTimeMillis())).intValue() == 0) {
                    ((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr21, iArr22}, -201684302, 201684313, (int) System.currentTimeMillis())).intValue();
                    int i157 = f53652e;
                    int i158 = (((i157 | 86) << 1) - (i157 ^ 86)) - 1;
                    f53651d = i158 % 128;
                    int i159 = i158 % 2;
                    return null;
                }
                ((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr, iArr22}, -201684302, 201684313, (int) System.currentTimeMillis())).intValue();
                int i160 = f53652e;
                int i161 = i160 & 83;
                int i162 = (((i160 ^ 83) | i161) << 1) - ((i160 | 83) & (~i161));
                f53651d = i162 % 128;
                if (i162 % 2 == 0) {
                    return null;
                }
                throw null;
            case 14:
                int[] iArr23 = (int[]) objArr[0];
                int[] iArr24 = (int[]) objArr[1];
                int i163 = f53651d;
                int i164 = i163 & 113;
                int i165 = ((i163 ^ 113) | i164) << 1;
                int i166 = -((i163 | 113) & (~i164));
                int i167 = (i165 ^ i166) + ((i166 & i165) << 1);
                f53652e = i167 % 128;
                int i168 = i167 % 2;
                int[] iArr25 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1039101633, 1039101643, (int) System.currentTimeMillis());
                avb.setCompoundDrawableTintBlendMode(new Object[]{iArr23, iArr25}, 1407394238, -1407394231, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{iArr25, iArr24}, -53995853, 53995859, (int) System.currentTimeMillis());
                int i169 = f53651d;
                int i170 = (((i169 | 12) << 1) - (i169 ^ 12)) - 1;
                f53652e = i170 % 128;
                if (i170 % 2 != 0) {
                    return null;
                }
                throw null;
            case 15:
                int[] iArr26 = (int[]) objArr[0];
                int[] iArr27 = (int[]) objArr[1];
                int i171 = f53651d;
                int i172 = i171 & 57;
                int i173 = -(-((i171 ^ 57) | i172));
                int i174 = (i172 ^ i173) + ((i173 & i172) << 1);
                f53652e = i174 % 128;
                if (i174 % 2 != 0) {
                    ava.setOnFocusChangeListener(new Object[]{iArr, iArr26, iArr27}, 1200653283, -1200653275, (int) System.currentTimeMillis());
                    return null;
                }
                ava.setOnFocusChangeListener(new Object[]{iArr, iArr26, iArr27}, 1200653283, -1200653275, (int) System.currentTimeMillis());
                throw null;
            default:
                int[] iArr28 = (int[]) objArr[0];
                int[] iArr29 = (int[]) objArr[1];
                int i175 = f53651d + 51;
                f53652e = i175 % 128;
                if (i175 % 2 != 0 ? ((Integer) auy.setOnFocusChangeListener(new Object[]{7, iArr28, iArr29}, 1108035559, -1108035515, 7)).intValue() != 0 : ((Integer) auy.setOnFocusChangeListener(new Object[]{14, iArr28, iArr29}, 1108035559, -1108035515, 14)).intValue() != 0) {
                    ((Integer) auy.setOnFocusChangeListener(new Object[]{7, 6803, iArr29}, 1777683852, -1777683835, 7)).intValue();
                    int i176 = f53652e;
                    int i177 = i176 & 103;
                    int i178 = (i176 | 103) & (~i177);
                    int i179 = i177 << 1;
                    int i180 = (i178 ^ i179) + ((i178 & i179) << 1);
                    f53651d = i180 % 128;
                    int i181 = i180 % 2;
                } else {
                    int i182 = f53651d;
                    int i183 = (i182 & 27) + (i182 | 27);
                    int i184 = i183 % 128;
                    f53652e = i184;
                    int i185 = i183 % 2;
                    if (iArr29[6] == -1) {
                        int i186 = i184 & 37;
                        int i187 = -(-((i184 ^ 37) | i186));
                        int i188 = ((i186 | i187) << 1) - (i187 ^ i186);
                        f53651d = i188 % 128;
                        Object[] objArr4 = new Object[2];
                        if (i188 % 2 != 0) {
                            objArr4[0] = iArr29;
                            objArr4[1] = iArr;
                            int i189 = 35 / 0;
                            if (((Boolean) avb.setCompoundDrawableTintBlendMode(objArr4, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue()) {
                                ((Integer) auy.setOnFocusChangeListener(new Object[]{7, 6803, iArr29}, 1777683852, -1777683835, 7)).intValue();
                                int i1710 = f53652e;
                                int i1711 = i1710 & 103;
                                int i1712 = (i1710 | 103) & (~i1711);
                                int i1713 = i1711 << 1;
                                int i1810 = (i1712 ^ i1713) + ((i1712 & i1713) << 1);
                                f53651d = i1810 % 128;
                                int i1811 = i1810 % 2;
                            }
                        } else {
                            objArr4[0] = iArr29;
                            objArr4[1] = iArr;
                            if (((Boolean) avb.setCompoundDrawableTintBlendMode(objArr4, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue()) {
                                ((Integer) auy.setOnFocusChangeListener(new Object[]{7, 6803, iArr29}, 1777683852, -1777683835, 7)).intValue();
                                int i1714 = f53652e;
                                int i1715 = i1714 & 103;
                                int i1716 = (i1714 | 103) & (~i1715);
                                int i1717 = i1715 << 1;
                                int i1812 = (i1716 ^ i1717) + ((i1716 & i1717) << 1);
                                f53651d = i1812 % 128;
                                int i1813 = i1812 % 2;
                            }
                        }
                    }
                }
                int i190 = f53652e;
                int i191 = (i190 & (-68)) | ((~i190) & 67);
                int i192 = (i190 & 67) << 1;
                int i193 = (i191 ^ i192) + ((i192 & i191) << 1);
                f53651d = i193 % 128;
                if (i193 % 2 == 0) {
                    return null;
                }
                int i194 = 94 / 0;
                return null;
        }
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, -53995853, 53995859, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, 1127209560, -1127209547, (int) System.currentTimeMillis());
    }

    public static void setY(int i10, int[] iArr) {
        setDividerPadding(new Object[]{Integer.valueOf(i10), iArr}, 1276549985, -1276549981, i10);
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int i10, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, Integer.valueOf(i10), iArr2}, -271009526, 271009537, i10);
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, -2028013091, 2028013098, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 1672659068, -1672659067, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, 504268870, -504268870, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, 1037545580, -1037545565, (int) System.currentTimeMillis());
    }

    public static int[] setOnFocusChangeListener(BigInteger bigInteger) {
        return (int[]) setDividerPadding(new Object[]{bigInteger}, -1544672899, 1544672909, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, 698806222, -698806208, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(SecureRandom secureRandom, int[] iArr) {
        setDividerPadding(new Object[]{secureRandom, iArr}, -78534853, 78534865, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, -596018270, 596018272, (int) System.currentTimeMillis());
    }
}
