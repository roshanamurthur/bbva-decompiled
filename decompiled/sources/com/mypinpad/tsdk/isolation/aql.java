package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class aql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f53594a = {-21389, -2, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f53595b = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f53596c = {-457489321, -42779, -2, -1, -1, 42777, 2};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53597d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f53598e = 1;

    static {
        int i10 = 1 & 47;
        int i11 = i10 + ((1 ^ 47) | i10);
        f53597d = i11 % 128;
        int i12 = i11 % 2;
    }

    public static /* synthetic */ void a(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53598e;
        int i11 = ((i10 ^ 115) | (i10 & 115)) << 1;
        int i12 = -(((~i10) & 115) | (i10 & (-116)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f53597d = i13 % 128;
        int i14 = i13 % 2;
        int[] iArr3 = f53594a;
        if (i14 == 0) {
            ava.setOnFocusChangeListener(new Object[]{iArr3, iArr, iArr2}, 1200653283, -1200653275, (int) System.currentTimeMillis());
        } else {
            ava.setOnFocusChangeListener(new Object[]{iArr3, iArr, iArr2}, 1200653283, -1200653275, (int) System.currentTimeMillis());
            int i15 = 80 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x009c  */
    /* JADX WARN: Code duplicated, block: B:17:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:19:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ee  */
    public static /* synthetic */ void b(Object[] objArr) {
        int i10;
        Object onFocusChangeListener;
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i11 = f53597d;
        int i12 = i11 & 45;
        int i13 = (i11 | 45) & (~i12);
        int i14 = -(-(i12 << 1));
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        f53598e = i15 % 128;
        if (i15 % 2 == 0) {
            ((Integer) auz.setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 1133382827, -1133382827, (int) System.currentTimeMillis())).intValue();
            throw null;
        }
        if (((Integer) auz.setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 1133382827, -1133382827, (int) System.currentTimeMillis())).intValue() != 0) {
            if (((Integer) auy.setOnFocusChangeListener(new Object[]{7, f53596c, iArr3}, -1807856331, 1807856377, 7)).intValue() != 0) {
                int i16 = f53598e;
                i10 = (i16 ^ 17) + ((i16 & 17) << 1);
                f53597d = i10 % 128;
                if (i10 % 2 != 0) {
                    onFocusChangeListener = auy.setOnFocusChangeListener(new Object[]{115, iArr3, 7}, -668114120, 668114158, 115);
                } else {
                    onFocusChangeListener = auy.setOnFocusChangeListener(new Object[]{10, iArr3, 7}, -668114120, 668114158, 10);
                }
                ((Integer) onFocusChangeListener).intValue();
            }
        } else if (iArr3[9] == -1) {
            int i17 = f53598e;
            int i18 = i17 & 75;
            int i19 = ((i17 | 75) & (~i18)) + (i18 << 1);
            f53597d = i19 % 128;
            int i20 = i19 % 2;
            int[] iArr4 = f53595b;
            if (i20 == 0 ? ((Boolean) auy.setOnFocusChangeListener(new Object[]{10, iArr3, iArr4}, 280624047, -280624046, 10)).booleanValue() : ((Boolean) auy.setOnFocusChangeListener(new Object[]{25, iArr3, iArr4}, 280624047, -280624046, 25)).booleanValue()) {
                if (((Integer) auy.setOnFocusChangeListener(new Object[]{7, f53596c, iArr3}, -1807856331, 1807856377, 7)).intValue() != 0) {
                    int i110 = f53598e;
                    i10 = (i110 ^ 17) + ((i110 & 17) << 1);
                    f53597d = i10 % 128;
                    if (i10 % 2 != 0) {
                        onFocusChangeListener = auy.setOnFocusChangeListener(new Object[]{115, iArr3, 7}, -668114120, 668114158, 115);
                    } else {
                        onFocusChangeListener = auy.setOnFocusChangeListener(new Object[]{10, iArr3, 7}, -668114120, 668114158, 10);
                    }
                    ((Integer) onFocusChangeListener).intValue();
                }
            }
        }
        int i21 = f53597d;
        int i22 = (i21 ^ 73) + ((i21 & 73) << 1);
        f53598e = i22 % 128;
        if (i22 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0058  */
    /* JADX WARN: Code duplicated, block: B:13:0x005e  */
    /* JADX WARN: Code duplicated, block: B:16:0x008b  */
    public static /* synthetic */ void c(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int i10 = f53598e;
        int i11 = (i10 & 79) + (i10 | 79);
        int i12 = i11 % 128;
        f53597d = i12;
        int i13 = i11 % 2;
        if (iIntValue != 0) {
            int i14 = i12 + 15;
            f53598e = i14 % 128;
            if (i14 % 2 == 0) {
                ((Integer) auz.setDividerPadding(new Object[]{Integer.valueOf(iIntValue), iArr}, -1106364933, 1106364943, iIntValue)).intValue();
                throw null;
            }
            if (((Integer) auz.setDividerPadding(new Object[]{Integer.valueOf(iIntValue), iArr}, -1106364933, 1106364943, iIntValue)).intValue() != 0) {
                ((Integer) auy.setOnFocusChangeListener(new Object[]{5, 21389, iArr}, 1777683852, -1777683835, 5)).intValue();
                int i15 = f53597d + 33;
                f53598e = i15 % 128;
                int i16 = i15 % 2;
            } else if (iArr[4] == -1) {
                int i17 = f53598e;
                int i18 = ((i17 | 35) << 1) - (i17 ^ 35);
                f53597d = i18 % 128;
                int i19 = i18 % 2;
                if (((Boolean) auz.setDividerPadding(new Object[]{iArr, f53594a}, 705102965, -705102950, (int) System.currentTimeMillis())).booleanValue()) {
                    ((Integer) auy.setOnFocusChangeListener(new Object[]{5, 21389, iArr}, 1777683852, -1777683835, 5)).intValue();
                    int i110 = f53597d + 33;
                    f53598e = i110 % 128;
                    int i111 = i110 % 2;
                }
            }
        } else if (iArr[4] == -1) {
            int i112 = f53598e;
            int i113 = ((i112 | 35) << 1) - (i112 ^ 35);
            f53597d = i113 % 128;
            int i114 = i113 % 2;
            if (((Boolean) auz.setDividerPadding(new Object[]{iArr, f53594a}, 705102965, -705102950, (int) System.currentTimeMillis())).booleanValue()) {
                ((Integer) auy.setOnFocusChangeListener(new Object[]{5, 21389, iArr}, 1777683852, -1777683835, 5)).intValue();
                int i115 = f53597d + 33;
                f53598e = i115 % 128;
                int i116 = i115 % 2;
            }
        }
        int i20 = f53597d;
        int i21 = (((i20 & (-102)) | ((~i20) & 101)) - (~(-(-((i20 & 101) << 1))))) - 1;
        f53598e = i21 % 128;
        int i22 = i21 % 2;
    }

    public static /* synthetic */ void d(Object[] objArr) {
        SecureRandom secureRandom = (SecureRandom) objArr[0];
        int[] iArr = (int[]) objArr[1];
        int i10 = f53598e + 43;
        f53597d = i10 % 128;
        byte[] bArr = new byte[i10 % 2 != 0 ? 121 : 20];
        do {
            secureRandom.nextBytes(bArr);
            ber.setDividerPadding(new Object[]{bArr, 0, iArr, 5}, 1570947064, -1570947056, 0);
        } while (((Integer) auy.setOnFocusChangeListener(new Object[]{5, iArr, f53594a}, -188447753, 188447787, 5)).intValue() == 0);
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i11 = ~iCurrentTimeMillis;
        int i12 = (i11 & 1710829888) | (1710829888 ^ i11);
        int i13 = -(-((~((i12 & (-1695324301)) | (i12 ^ (-1695324301)))) * 433));
        int i14 = ((((~i13) & (-987201882)) | (987201881 & i13)) - (~(-(-((i13 & (-987201882)) << 1))))) - 1;
        int i15 = 1695324300 & iCurrentTimeMillis;
        int i16 = ~(((1695324300 | iCurrentTimeMillis) & (~i15)) | i15);
        int i17 = 1710829888 & i16;
        int i18 = (i16 | 1710829888) & (~i17);
        int i19 = -(-(((i18 & i17) | (i18 ^ i17)) * (-433)));
        int i20 = ((i14 | i19) << 1) - (i19 ^ i14);
        int i21 = 1710829888 & iCurrentTimeMillis;
        int i22 = (iCurrentTimeMillis | 1710829888) & (~i21);
        int i23 = ~((i22 & i21) | (i22 ^ i21));
        int i24 = i23 ^ 1695027200;
        int i25 = i23 & 1695027200;
        int i26 = ((i25 & i24) | (i24 ^ i25)) * 433;
        int i27 = i20 & i26;
        int i28 = i27 + ((i26 ^ i20) | i27);
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i29 = ~iCurrentTimeMillis2;
        int i30 = (i29 | iCurrentTimeMillis2) & i29;
        int i31 = ~((i30 & (-1514650048)) | ((-1514650048) ^ i30));
        int i32 = 33763724 & i31;
        int i33 = (i31 | 33763724) & (~i32);
        int i34 = (i33 & i32) | (i33 ^ i32);
        int i35 = ((-606076929) & i29) | (606076928 & iCurrentTimeMillis2);
        int i36 = (-606076929) & iCurrentTimeMillis2;
        int i37 = ~((i35 & i36) | (i35 ^ i36));
        int i38 = ((~i37) & i34) | ((~i34) & i37);
        int i39 = i34 & i37;
        int i40 = -(-(((i39 & i38) | (i38 ^ i39)) * (-502)));
        int i41 = (-802792941) & i40;
        int i42 = (i40 | (-802792941)) & (~i41);
        int i43 = i41 << 1;
        int i44 = (i42 & i43) + (i43 | i42);
        int i45 = (-1514650048) & i29;
        int i46 = (i29 | (-1514650048)) & (~i45);
        int i47 = (i46 & i45) | (i46 ^ i45);
        int i48 = (2086963251 & i47) | ((~i47) & (-2086963252));
        int i49 = i47 & (-2086963252);
        int i50 = (i49 & i48) | (i48 ^ i49);
        int i51 = ~i50;
        int i52 = (i50 | i51) & i51;
        int i53 = (iCurrentTimeMillis2 | (-606076929)) & (~i36);
        int i54 = (i53 & i36) | (i53 ^ i36);
        int i55 = ~i54;
        int i56 = (i54 | i55) & i55;
        int i57 = ((~i56) & i52) | ((~i52) & i56);
        int i58 = i56 & i52;
        if (i28 <= (((i58 & i57) | (i57 ^ i58)) * 502) + i44) {
            throw null;
        }
    }

    public static /* synthetic */ void e(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53598e;
        int i11 = i10 & 101;
        int i12 = i11 + ((i10 ^ 101) | i11);
        f53597d = i12 % 128;
        int i13 = i12 % 2;
        int iIntValue = ((Integer) setOnFocusChangeListener(new Object[]{iArr}, 503232730, -503232723, (int) System.currentTimeMillis())).intValue();
        int[] iArr3 = f53594a;
        if (iIntValue == 0) {
            ((Integer) auz.setDividerPadding(new Object[]{iArr3, iArr, iArr2}, 1886561196, -1886561189, (int) System.currentTimeMillis())).intValue();
            int i14 = f53597d;
            int i15 = i14 ^ 3;
            int i16 = ((((i14 & 3) | i15) << 1) - (~(-i15))) - 1;
            f53598e = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 77 / 0;
                return;
            }
            return;
        }
        int i18 = f53597d;
        int i19 = ((i18 | 109) << 1) - (((~i18) & 109) | (i18 & (-110)));
        f53598e = i19 % 128;
        Object[] objArr2 = new Object[3];
        if (i19 % 2 != 0) {
            objArr2[0] = iArr3;
            objArr2[1] = iArr3;
            objArr2[2] = iArr2;
            ((Integer) auz.setDividerPadding(objArr2, 1886561196, -1886561189, (int) System.currentTimeMillis())).intValue();
            return;
        }
        objArr2[0] = iArr3;
        objArr2[1] = iArr3;
        objArr2[2] = iArr2;
        ((Integer) auz.setDividerPadding(objArr2, 1886561196, -1886561189, (int) System.currentTimeMillis())).intValue();
        int i20 = 44 / 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00c6  */
    public static /* synthetic */ void f(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53598e;
        int i11 = i10 & 63;
        int i12 = -(-((i10 ^ 63) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        f53597d = i13 % 128;
        if (i13 % 2 == 0 ? ((Integer) auy.setOnFocusChangeListener(new Object[]{5, iArr, 0, iArr2}, -1008052683, 1008052691, 5)).intValue() != 0 : ((Integer) auy.setOnFocusChangeListener(new Object[]{5, iArr, 1, iArr2}, -1008052683, 1008052691, 5)).intValue() != 0) {
            ((Integer) auy.setOnFocusChangeListener(new Object[]{5, 21389, iArr2}, 1777683852, -1777683835, 5)).intValue();
            int i14 = f53597d;
            int i15 = i14 & 69;
            int i16 = (i14 ^ 69) | i15;
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            f53598e = i17 % 128;
            int i18 = i17 % 2;
        } else {
            int i19 = f53598e;
            int i20 = (((i19 | 48) << 1) - (i19 ^ 48)) - 1;
            f53597d = i20 % 128;
            int i21 = i20 % 2;
            if (iArr2[4] == -1) {
                int i22 = ((i19 | 93) << 1) - (((~i19) & 93) | (i19 & (-94)));
                f53597d = i22 % 128;
                int i23 = i22 % 2;
                int[] iArr3 = f53594a;
                if (i23 != 0) {
                    int i24 = 28 / 0;
                    if (((Boolean) auz.setDividerPadding(new Object[]{iArr2, iArr3}, 705102965, -705102950, (int) System.currentTimeMillis())).booleanValue()) {
                        ((Integer) auy.setOnFocusChangeListener(new Object[]{5, 21389, iArr2}, 1777683852, -1777683835, 5)).intValue();
                        int i110 = f53597d;
                        int i111 = i110 & 69;
                        int i112 = (i110 ^ 69) | i111;
                        int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
                        f53598e = i113 % 128;
                        int i114 = i113 % 2;
                    }
                } else if (!(!((Boolean) auz.setDividerPadding(new Object[]{iArr2, iArr3}, 705102965, -705102950, (int) System.currentTimeMillis())).booleanValue())) {
                    ((Integer) auy.setOnFocusChangeListener(new Object[]{5, 21389, iArr2}, 1777683852, -1777683835, 5)).intValue();
                    int i115 = f53597d;
                    int i116 = i115 & 69;
                    int i117 = (i115 ^ 69) | i116;
                    int i118 = ((i116 | i117) << 1) - (i117 ^ i116);
                    f53598e = i118 % 128;
                    int i119 = i118 % 2;
                }
            }
        }
        int i25 = f53598e;
        int i26 = i25 & 87;
        int i27 = ((i25 | 87) & (~i26)) + (i26 << 1);
        f53597d = i27 % 128;
        int i28 = i27 % 2;
    }

    public static /* synthetic */ Integer g(Object[] objArr) {
        int i10 = 0;
        int[] iArr = (int[]) objArr[0];
        int i11 = f53597d;
        int i12 = ((i11 ^ 95) | (i11 & 95)) << 1;
        int i13 = -(((~i11) & 95) | (i11 & (-96)));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        int i15 = i14 % 128;
        f53598e = i15;
        int i16 = i14 % 2;
        int i17 = i15 + 47;
        f53597d = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 0;
        while (i10 < 5) {
            int i20 = f53597d;
            int i21 = (i20 & (-94)) | ((~i20) & 93);
            int i22 = (i20 & 93) << 1;
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            f53598e = i23 % 128;
            if (i23 % 2 == 0) {
                int i24 = iArr[i10];
                int i25 = ((~i24) & i19) | ((~i19) & i24);
                int i26 = i19 & i24;
                i19 = (i26 & i25) | (i25 ^ i26);
                int i27 = (((i10 ^ 33) | (i10 & 33)) << 1) - (((~i10) & 33) | (i10 & (-34)));
                int i28 = (i27 & (-7)) + (i27 | (-7));
                i10 = (i28 ^ (-1)) + (i28 << 1);
            } else {
                int i29 = iArr[i10];
                int i30 = i19 ^ i29;
                int i31 = i19 & i29;
                i19 = (i31 & i30) | (i30 ^ i31);
                i10++;
            }
        }
        int i32 = i19 >>> 1;
        int i33 = i19 & 1;
        int i34 = i32 & i33;
        int i35 = ((i32 | i33) & (~i34)) | i34;
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i36 = (-3) - (~(-(~(-(-(i35 * 965))))));
        int i37 = ~i35;
        int i38 = i37 & iCurrentTimeMillis;
        int i39 = (~i38) & (i37 | iCurrentTimeMillis);
        int i40 = -(-((~((i38 & i39) | (i39 ^ i38))) * (-964)));
        int i41 = i36 & i40;
        int i42 = ((i36 ^ i40) | i41) << 1;
        int i43 = -((i36 | i40) & (~i41));
        int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
        int i45 = ~iCurrentTimeMillis;
        int i46 = ((~i45) & i37) | ((~i37) & i45);
        int i47 = i45 & i37;
        int i48 = (i47 & i46) | (i46 ^ i47);
        int i49 = ~i48;
        int i50 = (i48 | i49) & i49;
        int i51 = (i35 | i37) & i37;
        int i52 = ~i51;
        int i53 = ~((i51 & i52) | (i52 ^ i51));
        int i54 = ((~i53) & i50) | ((~i50) & i53);
        int i55 = i53 & i50;
        int i56 = ((i44 - (~(((i55 & i54) | (i54 ^ i55)) * (-964)))) - 1) >> 31;
        int i57 = f53597d;
        int i58 = (i57 & 53) + (i57 | 53);
        f53598e = i58 % 128;
        if (i58 % 2 != 0) {
            return Integer.valueOf(i56);
        }
        throw null;
    }

    public static void getNavBarTitleString(int[] iArr, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2}, -646817109, 646817112, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ void h(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53597d;
        int i11 = (i10 & 28) + (i10 | 28);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f53598e = i12 % 128;
        int i13 = i12 % 2;
        int[] iArr3 = (int[]) auz.setDividerPadding(new Object[0], -529696917, 529696919, (int) System.currentTimeMillis());
        auz.setDividerPadding(new Object[]{iArr, iArr3}, 1612100803, -1612100784, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{iArr3, iArr2}, -733608766, 733608780, (int) System.currentTimeMillis());
        int i14 = f53597d;
        int i15 = ((i14 | 43) << 1) - (((~i14) & 43) | (i14 & (-44)));
        f53598e = i15 % 128;
        if (i15 % 2 == 0) {
            throw null;
        }
    }

    public static void setCompoundDrawableTintBlendMode(int i10, int[] iArr) {
        setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), iArr}, -1349954837, 1349954842, i10);
    }

    public static void setDividerPadding(int[] iArr, int i10, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, Integer.valueOf(i10), iArr2}, 901392631, -901392616, i10);
    }

    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x022b  */
    /* JADX WARN: Code duplicated, block: B:45:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:97:0x0688  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x01e2, code lost:
    
        if ((!((java.lang.Boolean) com.mypinpad.tsdk.isolation.auz.setDividerPadding(new java.lang.Object[]{r8, r2}, 705102965, -705102950, (int) java.lang.System.currentTimeMillis())).booleanValue()) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setOnFocusChangeListener(java.lang.Object[] r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 1896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aql.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static void setX(int[] iArr, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2}, -1629487094, 1629487098, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int[] iArr2, int[] iArr3) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2, iArr3}, -491159146, 491159155, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2}, -2117483957, 2117483969, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2, int[] iArr3) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2, iArr3}, -257166289, 257166290, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2}, -733608766, 733608780, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2, int[] iArr3) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2, iArr3}, -1138809815, 1138809821, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2}, -172458355, 172458365, (int) System.currentTimeMillis());
    }

    public static int[] setCompoundDrawableTintBlendMode(BigInteger bigInteger) {
        return (int[]) setOnFocusChangeListener(new Object[]{bigInteger}, 229114002, -229114000, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(SecureRandom secureRandom, int[] iArr) {
        setOnFocusChangeListener(new Object[]{secureRandom, iArr}, 1406394007, -1406393994, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2}, -1319149099, 1319149099, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2, int[] iArr3) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2, iArr3}, 123777680, -123777669, (int) System.currentTimeMillis());
    }
}
