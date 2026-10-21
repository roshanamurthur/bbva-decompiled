package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class arh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f53669a = {-977, -2, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f53670b = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f53671c = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53672d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f53673e = 1;

    static {
        int i10 = (1 & 87) + (1 | 87);
        f53672d = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 53 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0065  */
    /* JADX WARN: Code duplicated, block: B:13:0x007d  */
    /* JADX WARN: Code duplicated, block: B:14:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:9:0x004c A[PHI: r10
      0x004c: PHI (r10v6 int[]) = (r10v5 int[]), (r10v14 int[]) binds: [B:8:0x004a, B:5:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object a(Object[] objArr) {
        int[] iArr;
        int i10;
        int[] iArr2;
        BigInteger bigInteger = (BigInteger) objArr[0];
        int i11 = f53673e;
        int i12 = i11 & 53;
        int i13 = -(-(i11 | 53));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        f53672d = i14 % 128;
        if (i14 % 2 != 0) {
            iArr = (int[]) avf.setX(new Object[]{bigInteger}, -1818387099, 1818387099, (int) System.currentTimeMillis());
            if (iArr[51] == -1) {
                int i15 = f53672d;
                int i16 = i15 & 97;
                int i17 = ((i15 | 97) & (~i16)) + (i16 << 1);
                f53673e = i17 % 128;
                i10 = i17 % 2;
                iArr2 = f53669a;
                if (i10 != 0) {
                    ((Boolean) avf.setX(new Object[]{iArr, iArr2}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                if (!(!((Boolean) avf.setX(new Object[]{iArr, iArr2}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue())) {
                    ((Integer) avf.setX(new Object[]{iArr2, iArr}, 1877956622, -1877956593, (int) System.currentTimeMillis())).intValue();
                    int i18 = f53673e;
                    int i19 = (i18 & 23) + (i18 | 23);
                    f53672d = i19 % 128;
                    int i20 = i19 % 2;
                }
            }
        } else {
            iArr = (int[]) avf.setX(new Object[]{bigInteger}, -1818387099, 1818387099, (int) System.currentTimeMillis());
            if (iArr[7] == -1) {
                int i110 = f53672d;
                int i111 = i110 & 97;
                int i112 = ((i110 | 97) & (~i111)) + (i111 << 1);
                f53673e = i112 % 128;
                i10 = i112 % 2;
                iArr2 = f53669a;
                if (i10 != 0) {
                    ((Boolean) avf.setX(new Object[]{iArr, iArr2}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                if (!(!((Boolean) avf.setX(new Object[]{iArr, iArr2}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue())) {
                    ((Integer) avf.setX(new Object[]{iArr2, iArr}, 1877956622, -1877956593, (int) System.currentTimeMillis())).intValue();
                    int i113 = f53673e;
                    int i114 = (i113 & 23) + (i113 | 23);
                    f53672d = i114 % 128;
                    int i21 = i114 % 2;
                }
            }
        }
        int i22 = f53673e;
        int i23 = ((i22 ^ 51) | (i22 & 51)) << 1;
        int i24 = -(((~i22) & 51) | (i22 & (-52)));
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        f53672d = i25 % 128;
        int i26 = i25 % 2;
        return iArr;
    }

    public static /* synthetic */ void b(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53672d + 101;
        f53673e = i10 % 128;
        int i11 = i10 % 2;
        int[] iArr3 = f53669a;
        if (i11 != 0) {
            ava.setOnFocusChangeListener(new Object[]{iArr3, iArr, iArr2}, 1200653283, -1200653275, (int) System.currentTimeMillis());
        } else {
            ava.setOnFocusChangeListener(new Object[]{iArr3, iArr, iArr2}, 1200653283, -1200653275, (int) System.currentTimeMillis());
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0070  */
    public static /* synthetic */ void c(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int i10 = f53672d;
        int i11 = i10 & 125;
        int i12 = (i11 - (~(-(-((i10 ^ 125) | i11))))) - 1;
        f53673e = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        if (iIntValue != 0 && ((Integer) avf.setX(new Object[]{Integer.valueOf(iIntValue), iArr}, -1491946461, 1491946479, iIntValue)).intValue() != 0) {
            ((Integer) auy.setOnFocusChangeListener(new Object[]{8, 977, iArr}, 1777683852, -1777683835, 8)).intValue();
            int i13 = f53673e;
            int i14 = i13 & 19;
            int i15 = i13 | 19;
            int i16 = (i14 & i15) + (i15 | i14);
            f53672d = i16 % 128;
            int i17 = i16 % 2;
        } else if (iArr[7] == -1) {
            int i18 = f53672d + 37;
            f53673e = i18 % 128;
            int i19 = i18 % 2;
            if (((Boolean) avf.setX(new Object[]{iArr, f53669a}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue()) {
                ((Integer) auy.setOnFocusChangeListener(new Object[]{8, 977, iArr}, 1777683852, -1777683835, 8)).intValue();
                int i110 = f53673e;
                int i111 = i110 & 19;
                int i112 = i110 | 19;
                int i113 = (i111 & i112) + (i112 | i111);
                f53672d = i113 % 128;
                int i114 = i113 % 2;
            }
        }
        int i20 = f53673e;
        int i21 = i20 & 31;
        int i22 = ((i20 ^ 31) | i21) << 1;
        int i23 = -((i20 | 31) & (~i21));
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        f53672d = i24 % 128;
        if (i24 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x005d  */
    public static /* synthetic */ void d(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53673e;
        int i11 = i10 | 1;
        int i12 = (i11 << 1) - ((~(i10 & 1)) & i11);
        f53672d = i12 % 128;
        if (i12 % 2 != 0) {
            Object[] objArr2 = {iArr, iArr2, iArr3};
            int i13 = 88 / 0;
            if (((Integer) avf.setX(objArr2, -854306397, 854306423, (int) System.currentTimeMillis())).intValue() != 0) {
                ((Integer) auy.setOnFocusChangeListener(new Object[]{8, 977, iArr3}, -380025688, 380025712, 8)).intValue();
                int i14 = f53672d;
                int i15 = (i14 & (-108)) | ((~i14) & 107);
                int i16 = -(-((i14 & 107) << 1));
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                f53673e = i17 % 128;
                int i18 = i17 % 2;
            }
        } else if (((Integer) avf.setX(new Object[]{iArr, iArr2, iArr3}, -854306397, 854306423, (int) System.currentTimeMillis())).intValue() != 0) {
            ((Integer) auy.setOnFocusChangeListener(new Object[]{8, 977, iArr3}, -380025688, 380025712, 8)).intValue();
            int i19 = f53672d;
            int i110 = (i19 & (-108)) | ((~i19) & 107);
            int i111 = -(-((i19 & 107) << 1));
            int i112 = (i110 ^ i111) + ((i111 & i110) << 1);
            f53673e = i112 % 128;
            int i113 = i112 % 2;
        }
        int i20 = f53673e;
        int i21 = i20 & 105;
        int i22 = i21 + ((i20 ^ 105) | i21);
        f53672d = i22 % 128;
        if (i22 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void e(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int[] iArr2 = (int[]) objArr[2];
        int[] iArr3 = (int[]) objArr[3];
        int i10 = f53673e;
        int i11 = i10 & 101;
        int i12 = (((i10 ^ 101) | i11) << 1) - ((i10 | 101) & (~i11));
        f53672d = i12 % 128;
        int i13 = i12 % 2;
        avf.setX(new Object[]{iArr, iArr3}, -44054691, 44054719, (int) System.currentTimeMillis());
        setY(new Object[]{iArr3, iArr2}, -232433780, 232433783, (int) System.currentTimeMillis());
        int i14 = f53672d;
        int i15 = ((i14 ^ 89) | (i14 & 89)) << 1;
        int i16 = -(((~i14) & 89) | (i14 & (-90)));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        f53673e = i17 % 128;
        int i18 = i17 % 2;
        while (true) {
            int i19 = ~iIntValue;
            int i20 = -(-(iIntValue << 1));
            iIntValue = (i19 & i20) + (i19 | i20);
            if (iIntValue <= 0) {
                break;
            }
            int i21 = f53672d + 21;
            f53673e = i21 % 128;
            int i22 = i21 % 2;
            avf.setX(new Object[]{iArr2, iArr3}, -44054691, 44054719, (int) System.currentTimeMillis());
            setY(new Object[]{iArr3, iArr2}, -232433780, 232433783, (int) System.currentTimeMillis());
            int i23 = f53672d;
            int i24 = (((i23 | 100) << 1) - (i23 ^ 100)) - 1;
            f53673e = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = f53673e + 61;
        f53672d = i26 % 128;
        if (i26 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00a0  */
    public static /* synthetic */ void f(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53673e;
        int i11 = ((i10 ^ 99) | (i10 & 99)) << 1;
        int i12 = -(((~i10) & 99) | (i10 & (-100)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f53672d = i13 % 128;
        int i14 = i13 % 2;
        if (((Integer) auy.setOnFocusChangeListener(new Object[]{8, iArr, iArr2}, 1108035559, -1108035515, 8)).intValue() == 0) {
            int i15 = f53673e;
            int i16 = i15 & 113;
            int i17 = (i15 ^ 113) | i16;
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            f53672d = i18 % 128;
            int i19 = i18 % 2;
            if (iArr2[7] == -1) {
                int i20 = i15 & 17;
                int i21 = i20 + ((i15 ^ 17) | i20);
                f53672d = i21 % 128;
                int i22 = i21 % 2;
                int[] iArr3 = f53669a;
                if (i22 != 0) {
                    ((Boolean) avf.setX(new Object[]{iArr2, iArr3}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                if (((Boolean) avf.setX(new Object[]{iArr2, iArr3}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue()) {
                    ((Integer) auy.setOnFocusChangeListener(new Object[]{8, 977, iArr2}, 1777683852, -1777683835, 8)).intValue();
                    int i23 = f53672d;
                    int i24 = i23 & 15;
                    int i25 = (((i23 ^ 15) | i24) << 1) - ((i23 | 15) & (~i24));
                    f53673e = i25 % 128;
                    int i26 = i25 % 2;
                }
            }
        } else {
            ((Integer) auy.setOnFocusChangeListener(new Object[]{8, 977, iArr2}, 1777683852, -1777683835, 8)).intValue();
            int i27 = f53672d;
            int i28 = i27 & 15;
            int i29 = (((i27 ^ 15) | i28) << 1) - ((i27 | 15) & (~i28));
            f53673e = i29 % 128;
            int i210 = i29 % 2;
        }
        int i30 = f53672d;
        int i31 = i30 & 63;
        int i32 = -(-((i30 ^ 63) | i31));
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        f53673e = i33 % 128;
        int i34 = i33 % 2;
    }

    public static /* synthetic */ void g(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53673e;
        int i11 = (i10 & 111) + (i10 | 111);
        f53672d = i11 % 128;
        if (i11 % 2 != 0) {
            avf.setX(new Object[]{iArr, iArr3}, -44054691, 44054719, (int) System.currentTimeMillis());
            setY(new Object[]{iArr3, iArr2}, -232433780, 232433783, (int) System.currentTimeMillis());
            int i12 = 98 / 0;
        } else {
            avf.setX(new Object[]{iArr, iArr3}, -44054691, 44054719, (int) System.currentTimeMillis());
            setY(new Object[]{iArr3, iArr2}, -232433780, 232433783, (int) System.currentTimeMillis());
        }
        int i13 = f53673e;
        int i14 = ((i13 | 13) << 1) - (((~i13) & 13) | (i13 & (-14)));
        f53672d = i14 % 128;
        int i15 = i14 % 2;
    }

    public static /* synthetic */ void h(Object[] objArr) {
        SecureRandom secureRandom = (SecureRandom) objArr[0];
        int[] iArr = (int[]) objArr[1];
        int i10 = f53673e;
        int i11 = i10 & 87;
        int i12 = -(-(i10 | 87));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        f53672d = i14;
        byte[] bArr = new byte[i13 % 2 != 0 ? 89 : 32];
        int i15 = (i14 & 101) + (i14 | 101);
        f53673e = i15 % 128;
        int i16 = i15 % 2;
        do {
            secureRandom.nextBytes(bArr);
            ber.setDividerPadding(new Object[]{bArr, 0, iArr, 8}, 1570947064, -1570947056, 0);
        } while (((Integer) auy.setOnFocusChangeListener(new Object[]{8, iArr, f53669a}, -188447753, 188447787, 8)).intValue() == 0);
        int i17 = f53672d;
        int i18 = i17 ^ 59;
        int i19 = ((((i17 & 59) | i18) << 1) - (~(-i18))) - 1;
        f53673e = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = 61 / 0;
        }
    }

    public static /* synthetic */ void i(Object[] objArr) {
        SecureRandom secureRandom = (SecureRandom) objArr[0];
        int[] iArr = (int[]) objArr[1];
        do {
            setY(new Object[]{secureRandom, iArr}, -1282949814, 1282949823, (int) System.currentTimeMillis());
        } while (((Integer) setY(new Object[]{iArr}, 1295973883, -1295973882, (int) System.currentTimeMillis())).intValue() != 0);
        int i10 = f53672d;
        int i11 = i10 & 105;
        int i12 = (i10 | 105) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        f53673e = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0178  */
    public static /* synthetic */ void j(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53672d;
        int i11 = (((i10 | 48) << 1) - (i10 ^ 48)) - 1;
        f53673e = i11 % 128;
        if (i11 % 2 != 0 ? ((Integer) auy.setOnFocusChangeListener(new Object[]{8, iArr, 0, iArr2}, -1008052683, 1008052691, 8)).intValue() != 0 : ((Integer) auy.setOnFocusChangeListener(new Object[]{102, iArr, 0, iArr2}, -1008052683, 1008052691, 102)).intValue() != 0) {
            ((Integer) auy.setOnFocusChangeListener(new Object[]{8, 977, iArr2}, 1777683852, -1777683835, 8)).intValue();
            int i12 = f53673e;
            int i13 = i12 & 33;
            int i14 = ((i12 ^ 33) | i13) << 1;
            int i15 = -((i12 | 33) & (~i13));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            f53672d = i16 % 128;
            int i17 = i16 % 2;
        } else if (iArr2[7] == -1) {
            int i18 = ~((int) System.currentTimeMillis());
            int i19 = i18 & 30285842;
            int i20 = (30285842 | i18) & (~i19);
            int i21 = (i20 & i19) | (i20 ^ i19);
            int i22 = i21 & (-405109392);
            int i23 = (i21 | (-405109392)) & (~i22);
            int i24 = ~((i23 & i22) | (i23 ^ i22));
            int i25 = 30015504 & i24;
            int i26 = (i24 | 30015504) & (~i25);
            int i27 = -(~(-(-(((i26 & i25) | (i26 ^ i25)) * (-828)))));
            int i28 = ((((-1491077638) | i27) << 1) - (i27 ^ (-1491077638))) - 1;
            int i29 = ((i18 & (-404839054)) | ((~i18) & (-404839054)) | (404839053 & i18)) * (-828);
            int i30 = i28 & i29;
            int i31 = i30 + ((i29 ^ i28) | i30);
            int i32 = i31 & 199286796;
            int i33 = i32 + ((199286796 ^ i31) | i32);
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i34 = ~iCurrentTimeMillis;
            int i35 = (i34 | iCurrentTimeMillis) & i34;
            int i36 = (-1615758830) ^ i35;
            int i37 = i35 & (-1615758830);
            int i38 = ~((i37 & i36) | (i36 ^ i37));
            int i39 = -(-(((i38 & 1074135360) | (1074135360 ^ i38)) * 168));
            int i40 = (-182473819) & i39;
            int i41 = (i39 ^ (-182473819)) | i40;
            int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
            int i43 = (-1074135361) & iCurrentTimeMillis;
            int i44 = ((-1074135361) | iCurrentTimeMillis) & (~i43);
            int i45 = -(-((~((i44 & i43) | (i44 ^ i43))) * 168));
            int i46 = ((((i42 ^ i45) | (i42 & i45)) << 1) - (~(-((i45 & (~i42)) | ((~i45) & i42))))) - 1;
            int i47 = ~(((~i34) & (-1085762369)) | (1085762368 & i34) | ((-1085762369) & i34));
            int i48 = ((-11627009) & i47) | ((~i47) & 11627008);
            int i49 = i47 & 11627008;
            int i50 = (i49 & i48) | (i48 ^ i49);
            int i51 = ~((iCurrentTimeMillis & (-541623470)) | (i34 & (-541623470)) | (541623469 & iCurrentTimeMillis));
            int i52 = i50 ^ i51;
            int i53 = i51 & i50;
            int i54 = ((i53 & i52) | (i52 ^ i53)) * 168;
            int i55 = (((~i54) & i46) | ((~i46) & i54)) + ((i54 & i46) << 1);
            int[] iArr3 = f53669a;
            if (i33 <= i55) {
                ((Boolean) avf.setX(new Object[]{iArr2, iArr3}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            }
            if (!(!((Boolean) avf.setX(new Object[]{iArr2, iArr3}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue())) {
                ((Integer) auy.setOnFocusChangeListener(new Object[]{8, 977, iArr2}, 1777683852, -1777683835, 8)).intValue();
                int i110 = f53673e;
                int i111 = i110 & 33;
                int i112 = ((i110 ^ 33) | i111) << 1;
                int i113 = -((i110 | 33) & (~i111));
                int i114 = ((i112 | i113) << 1) - (i113 ^ i112);
                f53672d = i114 % 128;
                int i115 = i114 % 2;
            }
        }
        int i56 = f53673e;
        int i57 = i56 & 59;
        int i58 = (i56 | 59) & (~i57);
        int i59 = -(-(i57 << 1));
        int i60 = ((i58 | i59) << 1) - (i58 ^ i59);
        f53672d = i60 % 128;
        if (i60 % 2 != 0) {
            int i61 = 28 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00a7  */
    public static /* synthetic */ void k(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53673e;
        int i11 = i10 & 37;
        int i12 = i11 + ((i10 ^ 37) | i11);
        f53672d = i12 % 128;
        int i13 = i12 % 2;
        if (((Integer) avf.setX(new Object[]{Long.valueOf(((Long) avf.setX(new Object[]{iArr, iArr, iArr2}, 812976775, -812976744, (int) System.currentTimeMillis())).longValue()), iArr2}, 1440394292, -1440394291, (int) System.currentTimeMillis())).intValue() == 0) {
            int i14 = f53673e;
            int i15 = i14 & 109;
            int i16 = (((i14 | 109) & (~i15)) - (~(i15 << 1))) - 1;
            int i17 = i16 % 128;
            f53672d = i17;
            if (i16 % 2 == 0 ? iArr2[7] == -1 : iArr2[74] == -1) {
                int i18 = i17 ^ 97;
                int i19 = ((i17 & 97) | i18) << 1;
                int i20 = -i18;
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                f53673e = i21 % 128;
                int i22 = i21 % 2;
                if (((Boolean) avf.setX(new Object[]{iArr2, f53669a}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue()) {
                    ((Integer) auy.setOnFocusChangeListener(new Object[]{8, 977, iArr2}, 1777683852, -1777683835, 8)).intValue();
                    int i23 = f53672d + 14;
                    int i24 = (i23 ^ (-1)) + (i23 << 1);
                    f53673e = i24 % 128;
                    int i25 = i24 % 2;
                }
            }
        } else {
            ((Integer) auy.setOnFocusChangeListener(new Object[]{8, 977, iArr2}, 1777683852, -1777683835, 8)).intValue();
            int i26 = f53672d + 14;
            int i27 = (i26 ^ (-1)) + (i26 << 1);
            f53673e = i27 % 128;
            int i28 = i27 % 2;
        }
        int i29 = f53673e;
        int i30 = i29 & 115;
        int i31 = -(-((i29 ^ 115) | i30));
        int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
        f53672d = i32 % 128;
        if (i32 % 2 != 0) {
            int i33 = 52 / 0;
        }
    }

    public static /* synthetic */ Integer l(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int i10 = f53673e;
        int i11 = (((i10 & (-70)) | ((~i10) & 69)) - (~(-(-((i10 & 69) << 1))))) - 1;
        int i12 = i11 % 128;
        f53672d = i12;
        int i13 = i11 % 2 != 0 ? 1 : 0;
        int i14 = i13;
        int i15 = i12 & 39;
        int i16 = -(-((i12 ^ 39) | i15));
        int i17 = (i15 & i16) + (i16 | i15);
        f53673e = i17 % 128;
        while (true) {
            int i18 = i17 % 2;
            if (i14 >= 8) {
                break;
            }
            int i19 = f53672d + 97;
            int i20 = i19 % 128;
            f53673e = i20;
            int i21 = i19 % 2;
            int i22 = iArr[i14];
            int i23 = i13 ^ i22;
            int i24 = i13 & i22;
            i13 = (i24 & i23) | (i23 ^ i24);
            i14 = (i14 | 1) + (i14 & 1);
            int i25 = i20 | 87;
            i17 = ((i25 << 1) - (~(-(i25 & (~(i20 & 87)))))) - 1;
            f53672d = i17 % 128;
        }
        int i26 = i13 >>> 1;
        int i27 = i13 & 1;
        int i28 = (i26 & i27) | ((~i27) & i26) | ((~i26) & i27);
        int i29 = (i28 + ((i28 ^ (-1)) | i28)) >> 31;
        int i30 = f53672d;
        int i31 = ((i30 ^ 81) | (i30 & 81)) << 1;
        int i32 = -(((~i30) & 81) | (i30 & (-82)));
        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
        f53673e = i33 % 128;
        if (i33 % 2 != 0) {
            return Integer.valueOf(i29);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0074  */
    public static /* synthetic */ void m(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53673e;
        int i11 = ((i10 & (-90)) | ((~i10) & 89)) + ((i10 & 89) << 1);
        f53672d = i11 % 128;
        if (i11 % 2 != 0) {
            ((Integer) avf.setX(new Object[]{iArr, iArr2, iArr3}, -993304868, 993304870, (int) System.currentTimeMillis())).intValue();
            throw null;
        }
        if (((Integer) avf.setX(new Object[]{iArr, iArr2, iArr3}, -993304868, 993304870, (int) System.currentTimeMillis())).intValue() != 0) {
            ((Integer) auy.setOnFocusChangeListener(new Object[]{8, 977, iArr3}, 1777683852, -1777683835, 8)).intValue();
            int i12 = f53673e;
            int i13 = i12 & 87;
            int i14 = (i13 - (~(-(-((i12 ^ 87) | i13))))) - 1;
            f53672d = i14 % 128;
            int i15 = i14 % 2;
        } else if (iArr3[7] == -1) {
            int i16 = f53672d;
            int i17 = ((i16 | 101) << 1) - (i16 ^ 101);
            f53673e = i17 % 128;
            int i18 = i17 % 2;
            if (((Boolean) avf.setX(new Object[]{iArr3, f53669a}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue()) {
                ((Integer) auy.setOnFocusChangeListener(new Object[]{8, 977, iArr3}, 1777683852, -1777683835, 8)).intValue();
                int i19 = f53673e;
                int i110 = i19 & 87;
                int i111 = (i110 - (~(-(-((i19 ^ 87) | i110))))) - 1;
                f53672d = i111 % 128;
                int i112 = i111 % 2;
            }
        }
        int i20 = f53672d + 11;
        f53673e = i20 % 128;
        int i21 = i20 % 2;
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2) {
        setY(new Object[]{iArr, iArr2}, -232433780, 232433783, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2) {
        setY(new Object[]{iArr, iArr2}, -1404396491, 1404396499, (int) System.currentTimeMillis());
    }

    public static void setNavigationOnClickListener(int[] iArr, int[] iArr2) {
        setY(new Object[]{iArr, iArr2}, -1100424883, 1100424895, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2, int[] iArr3) {
        setY(new Object[]{iArr, iArr2, iArr3}, -141739096, 141739100, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int i10, int[] iArr2, int[] iArr3) {
        setY(new Object[]{iArr, Integer.valueOf(i10), iArr2, iArr3}, -1968232547, 1968232561, i10);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:19:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:21:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:23:0x020e  */
    /* JADX WARN: Code duplicated, block: B:45:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:47:0x03ef  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        Object onFocusChangeListener;
        int i15 = ~((~i10) | i11);
        int i16 = ~((~i11) | i10);
        int i17 = ~(i10 | i12);
        switch (((i17 | i16) * 658) + (i16 * 658) + ((i15 | i16 | i17) * (-658)) + (i11 * (-657)) + (i10 * 659)) {
            case 1:
                return l(objArr);
            case 2:
                i(objArr);
                return null;
            case 3:
                k(objArr);
                return null;
            case 4:
                d(objArr);
                return null;
            case 5:
                int[] iArr = (int[]) objArr[0];
                int[] iArr2 = (int[]) objArr[1];
                int i18 = f53672d;
                int i19 = i18 & 31;
                int i20 = -(-((i18 ^ 31) | i19));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                f53673e = i21 % 128;
                int i22 = i21 % 2;
                int[] iArr3 = f53669a;
                if (i22 == 0) {
                    if (((Integer) setY(new Object[]{iArr}, 1295973883, -1295973882, (int) System.currentTimeMillis())).intValue() != 0) {
                        int i23 = f53672d;
                        int i24 = ((((i23 ^ 1) | (i23 & 1)) << 1) - (~(-(((~i23) & 1) | (i23 & (-2)))))) - 1;
                        f53673e = i24 % 128;
                        int i25 = i24 % 2;
                        ((Integer) avf.setX(new Object[]{iArr3, iArr3, iArr2}, -854306397, 854306423, (int) System.currentTimeMillis())).intValue();
                        int i26 = f53672d;
                        i13 = ((i26 | 49) << 1) - (i26 ^ 49);
                    } else {
                        ((Integer) avf.setX(new Object[]{iArr3, iArr, iArr2}, -854306397, 854306423, (int) System.currentTimeMillis())).intValue();
                        int i27 = f53672d;
                        i13 = ((i27 ^ 96) + ((i27 & 96) << 1)) - 1;
                    }
                } else if (((Integer) setY(new Object[]{iArr}, 1295973883, -1295973882, (int) System.currentTimeMillis())).intValue() != 0) {
                    int i28 = f53672d;
                    int i29 = ((((i28 ^ 1) | (i28 & 1)) << 1) - (~(-(((~i28) & 1) | (i28 & (-2)))))) - 1;
                    f53673e = i29 % 128;
                    int i210 = i29 % 2;
                    ((Integer) avf.setX(new Object[]{iArr3, iArr3, iArr2}, -854306397, 854306423, (int) System.currentTimeMillis())).intValue();
                    int i211 = f53672d;
                    i13 = ((i211 | 49) << 1) - (i211 ^ 49);
                } else {
                    ((Integer) avf.setX(new Object[]{iArr3, iArr, iArr2}, -854306397, 854306423, (int) System.currentTimeMillis())).intValue();
                    int i212 = f53672d;
                    i13 = ((i212 ^ 96) + ((i212 & 96) << 1)) - 1;
                }
                f53673e = i13 % 128;
                int i30 = i13 % 2;
                return null;
            case 6:
                int[] iArr4 = (int[]) objArr[0];
                int[] iArr5 = (int[]) objArr[1];
                int i31 = f53673e;
                int i32 = ((i31 & 13) - (~(-(-(i31 | 13))))) - 1;
                f53672d = i32 % 128;
                int i33 = i32 % 2;
                int[] iArr6 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
                avf.setX(new Object[]{iArr4, iArr6}, -44054691, 44054719, (int) System.currentTimeMillis());
                setY(new Object[]{iArr6, iArr5}, -232433780, 232433783, (int) System.currentTimeMillis());
                int i34 = f53672d;
                int i35 = (i34 ^ 81) + ((i34 & 81) << 1);
                f53673e = i35 % 128;
                int i36 = i35 % 2;
                return null;
            case 7:
                int[] iArr7 = (int[]) objArr[0];
                int[] iArr8 = (int[]) objArr[1];
                int[] iArr9 = (int[]) objArr[2];
                int i37 = f53673e;
                int i38 = i37 ^ 55;
                int i39 = ((i37 & 55) | i38) << 1;
                int i40 = -i38;
                int i41 = ((i39 | i40) << 1) - (i39 ^ i40);
                f53672d = i41 % 128;
                int i42 = i41 % 2;
                int[] iArr10 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
                avf.setX(new Object[]{iArr7, iArr8, iArr10}, -701222223, 701222256, (int) System.currentTimeMillis());
                setY(new Object[]{iArr10, iArr9}, -232433780, 232433783, (int) System.currentTimeMillis());
                int i43 = f53673e;
                int i44 = ((i43 | 121) << 1) - (i43 ^ 121);
                f53672d = i44 % 128;
                int i45 = i44 % 2;
                return null;
            case 8:
                f(objArr);
                return null;
            case 9:
                h(objArr);
                return null;
            case 10:
                int[] iArr11 = (int[]) objArr[0];
                int[] iArr12 = (int[]) objArr[1];
                int[] iArr13 = (int[]) objArr[2];
                int[] iArr14 = (int[]) objArr[3];
                int i46 = f53672d;
                int i47 = (i46 ^ 3) + ((i46 & 3) << 1);
                f53673e = i47 % 128;
                int i48 = i47 % 2;
                avf.setX(new Object[]{iArr11, iArr12, iArr14}, -701222223, 701222256, (int) System.currentTimeMillis());
                setY(new Object[]{iArr14, iArr13}, -232433780, 232433783, (int) System.currentTimeMillis());
                int i49 = f53673e;
                int i50 = i49 & 73;
                int i51 = (i49 ^ 73) | i50;
                int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                f53672d = i52 % 128;
                int i53 = i52 % 2;
                return null;
            case 11:
                g(objArr);
                return null;
            case 12:
                j(objArr);
                return null;
            case 13:
                return a(objArr);
            case 14:
                e(objArr);
                return null;
            case 15:
                m(objArr);
                return null;
            case 16:
                int[] iArr15 = (int[]) objArr[0];
                int[] iArr16 = (int[]) objArr[1];
                int[] iArr17 = (int[]) objArr[2];
                int i54 = f53672d;
                int i55 = i54 & 117;
                int i56 = (i54 | 117) & (~i55);
                int i57 = i55 << 1;
                int i58 = ((i56 | i57) << 1) - (i56 ^ i57);
                f53673e = i58 % 128;
                int i59 = i58 % 2;
                if (((Integer) avf.setX(new Object[]{iArr15, iArr16, iArr17}, 340994627, -340994605, (int) System.currentTimeMillis())).intValue() == 0) {
                    int i60 = f53673e + 101;
                    f53672d = i60 % 128;
                    int i61 = i60 % 2;
                    if (iArr17[15] == -1) {
                        int iCurrentTimeMillis = (int) System.currentTimeMillis();
                        int i62 = ~iCurrentTimeMillis;
                        int i63 = ~(((~i62) & (-1602744540)) | (i62 & 1602744539) | ((-1602744540) & i62));
                        int i64 = (1604320511 & i62) | ((-1604320512) & iCurrentTimeMillis);
                        int i65 = 1604320511 & iCurrentTimeMillis;
                        int i66 = (i65 & i64) | (i64 ^ i65);
                        int i67 = ~i66;
                        int i68 = (i66 | i67) & i67;
                        int i69 = i63 & i68;
                        int i70 = (i63 | i68) & (~i69);
                        int i71 = -(-(((i70 & i69) | (i70 ^ i69)) * (-831)));
                        int i72 = 1413500378 & i71;
                        int i73 = (i71 | 1413500378) & (~i72);
                        int i74 = i72 << 1;
                        int i75 = ((i73 | i74) << 1) - (i73 ^ i74);
                        int i76 = (-335769811) & iCurrentTimeMillis;
                        int i77 = ((-335769811) | iCurrentTimeMillis) & (~i76);
                        int i78 = (i75 - (~(-(-((~((i77 & i76) | (i77 ^ i76))) * (-1662)))))) - 1;
                        int i79 = (i62 | iCurrentTimeMillis) & i62;
                        int i80 = ~((i79 & (-1268550702)) | ((-1268550702) ^ i79));
                        int i81 = (i62 & 1268550701) | ((-1268550702) & iCurrentTimeMillis);
                        int i82 = 1268550701 & iCurrentTimeMillis;
                        int i83 = ~((i81 & i82) | (i81 ^ i82));
                        int i84 = ((~i83) & i80) | ((~i80) & i83);
                        int i85 = i83 & i80;
                        int i86 = (i85 & i84) | (i84 ^ i85);
                        int i87 = ~(iCurrentTimeMillis | 1602744539);
                        int i88 = i86 & i87;
                        int i89 = (i87 | i86) & (~i88);
                        int i90 = -(~(-(-(((i89 & i88) | (i89 ^ i88)) * 831))));
                        int i91 = ((i78 | i90) << 1) - (i90 ^ i78);
                        int i92 = (i91 ^ (-1)) + (i91 << 1);
                        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                        int i93 = ~iCurrentTimeMillis2;
                        int i94 = (-528489367) & i93;
                        int i95 = (~i94) & ((-528489367) | i93);
                        int i96 = ~((i94 & i95) | (i95 ^ i94));
                        int i97 = (-1650503722) & iCurrentTimeMillis2;
                        int i98 = ~(i97 | ((~i97) & ((-1650503722) | iCurrentTimeMillis2)));
                        int i99 = ((i96 & i98) | (i96 ^ i98)) * 333;
                        int i100 = (-877239303) & i99;
                        int i101 = (i99 | (-877239303)) & (~i100);
                        int i102 = -(-(i100 << 1));
                        int i103 = ((i101 | i102) << 1) - (i101 ^ i102);
                        int i104 = ~((iCurrentTimeMillis2 & (-528489367)) | ((-528489367) ^ iCurrentTimeMillis2));
                        int i105 = i93 ^ (-1650503722);
                        int i106 = i93 & (-1650503722);
                        int i107 = ~((i106 & i105) | (i105 ^ i106));
                        int i108 = i104 ^ i107;
                        int i109 = i104 & i107;
                        int i110 = -(~(((i109 & i108) | (i108 ^ i109)) * 333));
                        int i111 = ((i103 ^ i110) + ((i110 & i103) << 1)) - 1;
                        int[] iArr18 = f53670b;
                        if (i92 <= i111 ? !(!((Boolean) auy.setOnFocusChangeListener(new Object[]{16, iArr17, iArr18}, 280624047, -280624046, 16)).booleanValue()) : !(!((Boolean) auy.setOnFocusChangeListener(new Object[]{52, iArr17, iArr18}, 280624047, -280624046, 52)).booleanValue())) {
                            if (((Integer) auy.setOnFocusChangeListener(new Object[]{10, f53671c, iArr17}, -1807856331, 1807856377, 10)).intValue() != 0) {
                                int i112 = f53672d;
                                i14 = ((i112 & (-46)) | ((~i112) & 45)) + ((i112 & 45) << 1);
                                f53673e = i14 % 128;
                                if (i14 % 2 == 0) {
                                    onFocusChangeListener = auy.setOnFocusChangeListener(new Object[]{20, iArr17, 10}, -668114120, 668114158, 20);
                                } else {
                                    onFocusChangeListener = auy.setOnFocusChangeListener(new Object[]{16, iArr17, 10}, -668114120, 668114158, 16);
                                }
                                ((Integer) onFocusChangeListener).intValue();
                                System.currentTimeMillis();
                                System.currentTimeMillis();
                            }
                        }
                    }
                } else if (((Integer) auy.setOnFocusChangeListener(new Object[]{10, f53671c, iArr17}, -1807856331, 1807856377, 10)).intValue() != 0) {
                    int i113 = f53672d;
                    i14 = ((i113 & (-46)) | ((~i113) & 45)) + ((i113 & 45) << 1);
                    f53673e = i14 % 128;
                    if (i14 % 2 == 0) {
                        onFocusChangeListener = auy.setOnFocusChangeListener(new Object[]{20, iArr17, 10}, -668114120, 668114158, 20);
                    } else {
                        onFocusChangeListener = auy.setOnFocusChangeListener(new Object[]{16, iArr17, 10}, -668114120, 668114158, 16);
                    }
                    ((Integer) onFocusChangeListener).intValue();
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                }
                System.currentTimeMillis();
                System.currentTimeMillis();
                return null;
            case 17:
                b(objArr);
                return null;
            default:
                c(objArr);
                return null;
        }
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2, int[] iArr3) {
        setY(new Object[]{iArr, iArr2, iArr3}, 1298842424, -1298842417, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2, int[] iArr3) {
        setY(new Object[]{iArr, iArr2, iArr3}, 980686848, -980686833, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2) {
        setY(new Object[]{iArr, iArr2}, -556356765, 556356770, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2, int[] iArr3) {
        setY(new Object[]{iArr, iArr2, iArr3}, 312842810, -312842799, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        setY(new Object[]{iArr, iArr2, iArr3, iArr4}, 126810060, -126810050, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2) {
        setY(new Object[]{iArr, iArr2}, 2126596357, -2126596351, (int) System.currentTimeMillis());
    }

    public static int[] setOnFocusChangeListener(BigInteger bigInteger) {
        return (int[]) setY(new Object[]{bigInteger}, -1675741413, 1675741426, (int) System.currentTimeMillis());
    }

    public static void setX(int i10, int[] iArr) {
        setY(new Object[]{Integer.valueOf(i10), iArr}, 655116825, -655116825, i10);
    }

    public static void setX(SecureRandom secureRandom, int[] iArr) {
        setY(new Object[]{secureRandom, iArr}, -366531067, 366531069, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int[] iArr2, int[] iArr3) {
        setY(new Object[]{iArr, iArr2, iArr3}, -635217836, 635217852, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int[] iArr2) {
        setY(new Object[]{iArr, iArr2}, 450232347, -450232330, (int) System.currentTimeMillis());
    }
}
