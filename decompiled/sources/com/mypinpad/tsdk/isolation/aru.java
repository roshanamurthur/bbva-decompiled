package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class aru {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f53710a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53711b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53712c = 1;

    static {
        int i10 = ((1 | 11) << 1) - (1 ^ 11);
        f53711b = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void a(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53711b;
        int i11 = ((i10 & 75) - (~(-(-(i10 | 75))))) - 1;
        f53712c = i11 % 128;
        int i12 = i11 % 2;
        int[] iArr3 = f53710a;
        if (i12 == 0) {
            ava.setOnFocusChangeListener(new Object[]{iArr3, iArr, iArr2}, 1200653283, -1200653275, (int) System.currentTimeMillis());
            throw null;
        }
        ava.setOnFocusChangeListener(new Object[]{iArr3, iArr, iArr2}, 1200653283, -1200653275, (int) System.currentTimeMillis());
        int i13 = f53711b + 27;
        f53712c = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void b(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int[] iArr2 = (int[]) objArr[2];
        int[] iArr3 = (int[]) objArr[3];
        int i10 = f53712c;
        int i11 = i10 & 11;
        int i12 = (i10 | 11) & (~i11);
        int i13 = i11 << 1;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f53711b = i14 % 128;
        if (i14 % 2 != 0) {
            setDividerPadding(new Object[]{iArr, iArr3}, -1748131667, 1748131669, (int) System.currentTimeMillis());
            setDividerPadding(new Object[]{iArr3, iArr2}, -550786261, 550786266, (int) System.currentTimeMillis());
            throw null;
        }
        setDividerPadding(new Object[]{iArr, iArr3}, -1748131667, 1748131669, (int) System.currentTimeMillis());
        setDividerPadding(new Object[]{iArr3, iArr2}, -550786261, 550786266, (int) System.currentTimeMillis());
        while (true) {
            iIntValue = (iIntValue << 1) + (~iIntValue);
            if (iIntValue <= 0) {
                break;
            }
            int i15 = f53712c;
            int i16 = i15 & 115;
            int i17 = -(-((i15 ^ 115) | i16));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            f53711b = i18 % 128;
            int i19 = i18 % 2;
            setDividerPadding(new Object[]{iArr2, iArr3}, -1748131667, 1748131669, (int) System.currentTimeMillis());
            setDividerPadding(new Object[]{iArr3, iArr2}, -550786261, 550786266, (int) System.currentTimeMillis());
            int i20 = (-2) - ((f53711b + 116) ^ (-1));
            f53712c = i20 % 128;
            int i21 = i20 % 2;
        }
        int i22 = f53712c;
        int i23 = i22 & 125;
        int i24 = -(-(i22 | 125));
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        f53711b = i25 % 128;
        if (i25 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void c(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int[] iArr4 = (int[]) objArr[3];
        int i10 = f53711b;
        int i11 = (i10 ^ 85) + ((i10 & 85) << 1);
        f53712c = i11 % 128;
        int i12 = i11 % 2;
        setDividerPadding(new Object[]{iArr, iArr2, iArr4}, 137169014, -137169005, (int) System.currentTimeMillis());
        setDividerPadding(new Object[]{iArr4, iArr3}, -550786261, 550786266, (int) System.currentTimeMillis());
        int i13 = f53712c;
        int i14 = i13 & 61;
        int i15 = (((i13 ^ 61) | i14) << 1) - ((i13 | 61) & (~i14));
        f53711b = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void d(Object[] objArr) {
        SecureRandom secureRandom = (SecureRandom) objArr[0];
        int[] iArr = (int[]) objArr[1];
        do {
            setDividerPadding(new Object[]{secureRandom, iArr}, -1727764163, 1727764178, (int) System.currentTimeMillis());
        } while (((Integer) setDividerPadding(new Object[]{iArr}, 979898007, -979897996, (int) System.currentTimeMillis())).intValue() != 0);
        int i10 = f53711b;
        int i11 = ((i10 | 75) << 1) - (i10 ^ 75);
        f53712c = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object e(Object[] objArr) {
        BigInteger bigInteger = (BigInteger) objArr[0];
        int i10 = f53711b;
        int i11 = i10 & 11;
        int i12 = ((i10 ^ 11) | i11) << 1;
        int i13 = -((i10 | 11) & (~i11));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f53712c = i14 % 128;
        int i15 = i14 % 2;
        int[] iArr = (int[]) auy.setOnFocusChangeListener(new Object[]{Integer.valueOf(ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY), bigInteger}, 1842671690, -1842671680, ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY);
        if (!(!((Boolean) auy.setOnFocusChangeListener(new Object[]{17, iArr, f53710a}, -1279176983, 1279177025, 17)).booleanValue())) {
            int i16 = f53711b;
            int i17 = (i16 ^ 11) + ((i16 & 11) << 1);
            f53712c = i17 % 128;
            int i18 = i17 % 2;
            auy.setOnFocusChangeListener(new Object[]{iArr}, 202868287, -202868267, (int) System.currentTimeMillis());
            int i19 = f53712c;
            int i20 = i19 & 3;
            int i21 = (((i19 ^ 3) | i20) << 1) - ((i19 | 3) & (~i20));
            f53711b = i21 % 128;
            int i22 = i21 % 2;
        }
        int i23 = f53711b;
        int i24 = (((i23 ^ 1) | (i23 & 1)) << 1) - (((~i23) & 1) | (i23 & (-2)));
        f53712c = i24 % 128;
        if (i24 % 2 == 0) {
            int i25 = 53 / 0;
        }
        return iArr;
    }

    public static /* synthetic */ void f(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53711b;
        int i11 = i10 & 11;
        int i12 = ((i10 | 11) & (~i11)) + (i11 << 1);
        f53712c = i12 % 128;
        int i13 = i12 % 2;
        int i14 = iArr[16];
        int iIntValue = ((Integer) auy.setOnFocusChangeListener(new Object[]{16, iArr, Integer.valueOf(i14 << 23), iArr2}, -1008052683, 1008052691, 16)).intValue();
        int i15 = i14 << 1;
        int i16 = iIntValue & i15;
        iArr2[16] = (((iIntValue | i15) & (~i16)) | i16) & 511;
        int i17 = f53711b;
        int i18 = i17 & 57;
        int i19 = (i18 - (~((i17 ^ 57) | i18))) - 1;
        f53712c = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = 98 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x008b  */
    /* JADX WARN: Code duplicated, block: B:15:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0089 A[DONT_INVERT, PHI: r1
      0x0089: PHI (r1v11 int) = (r1v10 int), (r1v26 int) binds: [B:8:0x0087, B:5:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ void g(Object[] objArr) {
        int iIntValue;
        int i10;
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i11 = f53712c;
        int i12 = i11 & 9;
        int i13 = (i11 | 9) & (~i12);
        int i14 = i12 << 1;
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        f53711b = i15 % 128;
        if (i15 % 2 == 0) {
            iIntValue = ((-2) - (((((Integer) auy.setOnFocusChangeListener(new Object[]{16, iArr, iArr2, iArr3}, -729001745, 729001745, 16)).intValue() - (~(-(~(-(-iArr[16])))))) - 1) ^ (-1))) + iArr2[16];
            if (iIntValue <= 511) {
                if (iIntValue == 511) {
                    int i16 = f53711b + 69;
                    f53712c = i16 % 128;
                    int i17 = i16 % 2;
                    if (((Boolean) auy.setOnFocusChangeListener(new Object[]{16, iArr3, f53710a}, -1279176983, 1279177025, 16)).booleanValue()) {
                    }
                }
            }
            iArr3[16] = iIntValue;
            int i18 = f53711b;
            int i19 = i18 & 23;
            i10 = ((i18 | 23) & (~i19)) + (i19 << 1);
            f53712c = i10 % 128;
            if (i10 % 2 == 0) {
                int i20 = 78 / 0;
            }
        }
        int iIntValue2 = ((Integer) auy.setOnFocusChangeListener(new Object[]{38, iArr, iArr2, iArr3}, -729001745, 729001745, 38)).intValue();
        int i21 = -iArr[65];
        iIntValue = ((iIntValue2 ^ i21) + ((i21 & iIntValue2) << 1)) << iArr2[79];
        if (iIntValue <= 19948) {
            if (iIntValue == 511) {
                int i110 = f53711b + 69;
                f53712c = i110 % 128;
                int i111 = i110 % 2;
                if (((Boolean) auy.setOnFocusChangeListener(new Object[]{16, iArr3, f53710a}, -1279176983, 1279177025, 16)).booleanValue()) {
                }
            }
        }
        iArr3[16] = iIntValue;
        int i112 = f53711b;
        int i113 = i112 & 23;
        i10 = ((i112 | 23) & (~i113)) + (i113 << 1);
        f53712c = i10 % 128;
        if (i10 % 2 == 0) {
            int i22 = 78 / 0;
        }
        iIntValue = ((iIntValue - (~(-(-((Integer) auy.setOnFocusChangeListener(new Object[]{iArr3}, -826911596, 826911628, (int) System.currentTimeMillis())).intValue())))) - 1) & 511;
        int i23 = f53712c;
        int i24 = i23 & 23;
        int i25 = -(-(i23 | 23));
        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
        f53711b = i26 % 128;
        int i27 = i26 % 2;
        iArr3[16] = iIntValue;
        int i114 = f53711b;
        int i115 = i114 & 23;
        i10 = ((i114 | 23) & (~i115)) + (i115 << 1);
        f53712c = i10 % 128;
        if (i10 % 2 == 0) {
            int i28 = 78 / 0;
        }
    }

    public static /* synthetic */ void h(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53712c;
        int i11 = ((i10 | 61) << 1) - (i10 ^ 61);
        f53711b = i11 % 128;
        int i12 = i11 % 2;
        avh.setX(new Object[]{iArr, iArr2}, -451579636, 451579637, (int) System.currentTimeMillis());
        int i13 = iArr[16];
        int i14 = i13 << 1;
        int iIntValue = ((Integer) auy.setOnFocusChangeListener(new Object[]{Integer.valueOf(i14), iArr, iArr2}, 1689404169, -1689404133, i14)).intValue();
        int i15 = i13 * i13;
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i16 = (-2) - (((i15 * (-344)) - (~(iIntValue * (-344)))) ^ (-1));
        int i17 = ~i15;
        int i18 = ~iIntValue;
        int i19 = i17 ^ i18;
        int i20 = i17 & i18;
        int i21 = (i19 ^ i20) | (i19 & i20);
        int i22 = ~i21;
        int i23 = (i21 | i22) & i22;
        int i24 = ~iCurrentTimeMillis;
        int i25 = (i17 ^ iCurrentTimeMillis) | (i17 & iCurrentTimeMillis);
        int i26 = ~i25;
        int i27 = (i25 | i26) & i26;
        int i28 = ((~i27) & i23) | ((~i23) & i27);
        int i29 = i23 & i27;
        int i30 = (i16 - (~(-(~(((i29 & i28) | (i28 ^ i29)) * 345))))) - 2;
        int i31 = (i17 & i24) | (i17 ^ i24);
        int i32 = ~i31;
        int i33 = (i31 | i32) & i32;
        int i34 = (iIntValue | i18) & i18;
        int i35 = ~((i34 & i15) | (i34 ^ i15));
        int i36 = ((~i35) & i33) | ((~i33) & i35);
        int i37 = i35 & i33;
        int i38 = -(~(-(-(((i37 & i36) | (i36 ^ i37)) * 345))));
        int i39 = ((i30 & i38) + (i38 | i30)) - 1;
        int i40 = i19 | i20;
        int i41 = -(-((~((i40 & iCurrentTimeMillis) | (i40 ^ iCurrentTimeMillis))) * 345));
        int i42 = i39 & i41;
        int i43 = (i41 | i39) & (~i42);
        int i44 = -(-(i42 << 1));
        iArr2[32] = (i43 ^ i44) + ((i43 & i44) << 1);
        int i45 = f53711b;
        int i46 = i45 & 111;
        int i47 = ((i45 | 111) & (~i46)) + (i46 << 1);
        f53712c = i47 % 128;
        if (i47 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void i(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53711b + 93;
        f53712c = i10 % 128;
        int i11 = i10 % 2;
        int iIntValue = ((Integer) setDividerPadding(new Object[]{iArr}, 979898007, -979897996, (int) System.currentTimeMillis())).intValue();
        int[] iArr3 = f53710a;
        if (iIntValue == 0) {
            ((Integer) auy.setOnFocusChangeListener(new Object[]{17, iArr3, iArr, iArr2}, 324288195, -324288186, 17)).intValue();
            int i12 = f53711b + 105;
            f53712c = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 96 / 0;
                return;
            }
            return;
        }
        int i14 = f53711b;
        int i15 = i14 & 103;
        int i16 = (i15 - (~((i14 ^ 103) | i15))) - 1;
        f53712c = i16 % 128;
        int i17 = i16 % 2;
        ((Integer) auy.setOnFocusChangeListener(new Object[]{17, iArr3, iArr3, iArr2}, 324288195, -324288186, 17)).intValue();
        int i18 = f53711b;
        int i19 = i18 & 27;
        int i20 = (i18 ^ 27) | i19;
        int i21 = (i19 & i20) + (i20 | i19);
        f53712c = i21 % 128;
        if (i21 % 2 == 0) {
            int i22 = 86 / 0;
        }
    }

    public static /* synthetic */ void j(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53712c;
        int i11 = ((i10 ^ 32) + ((i10 & 32) << 1)) - 1;
        f53711b = i11 % 128;
        int i12 = i11 % 2;
        setDividerPadding(new Object[]{iArr, iArr3}, -1748131667, 1748131669, (int) System.currentTimeMillis());
        setDividerPadding(new Object[]{iArr3, iArr2}, -550786261, 550786266, (int) System.currentTimeMillis());
        int i13 = f53711b + 88;
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        f53712c = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x00f4  */
    public static /* synthetic */ void k(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53712c;
        int i11 = ((i10 & (-60)) | ((~i10) & 59)) + ((i10 & 59) << 1);
        f53711b = i11 % 128;
        int i12 = i11 % 2;
        int iIntValue = ((Integer) auy.setOnFocusChangeListener(new Object[]{16, iArr, iArr2}, 1108035559, -1108035515, 16)).intValue();
        int i13 = iArr[16];
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i14 = i13 * (-501);
        int i15 = iIntValue * 503;
        int i16 = i14 & i15;
        int i17 = -(-((i14 ^ i15) | i16));
        int i18 = (i16 & i17) + (i17 | i16);
        int i19 = ~iIntValue;
        int i20 = ~iCurrentTimeMillis;
        int i21 = ~((i19 ^ iCurrentTimeMillis) | (i19 & iCurrentTimeMillis));
        int i22 = ~i13;
        int i23 = ~((iIntValue & i13) | (i13 & i19) | (iIntValue & i22));
        int i24 = i21 ^ i23;
        int i25 = i23 & i21;
        int i26 = -(-(((i25 & i24) | (i24 ^ i25)) * (-502)));
        int i27 = ((i18 ^ i26) - (~((i26 & i18) << 1))) - 1;
        int i28 = (i20 | iCurrentTimeMillis) & i20;
        int i29 = i19 & i28;
        int i30 = (i28 | i19) & (~i29);
        int i31 = (i30 & i29) | (i30 ^ i29);
        int i32 = -(-((~((i13 & i31) | (i31 ^ i13))) * (-502)));
        int i33 = ((~i32) & i27) | ((~i27) & i32);
        int i34 = (i32 & i27) << 1;
        int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
        int i36 = ~((i22 ^ iCurrentTimeMillis) | (i22 & iCurrentTimeMillis));
        int i37 = i19 & i36;
        int i38 = (i36 | i19) & (~i37);
        int i39 = -(~(((i38 & i37) | (i38 ^ i37)) * 502));
        int i40 = ((i35 ^ i39) + ((i39 & i35) << 1)) - 1;
        if (i40 <= 511) {
            int i41 = f53712c;
            int i42 = i41 & 79;
            int i43 = ((i41 ^ 79) | i42) << 1;
            int i44 = -((~i42) & (i41 | 79));
            int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
            f53711b = i45 % 128;
            int i46 = i45 % 2;
            if (i40 == 511) {
                int i47 = i41 + 71;
                f53711b = i47 % 128;
                int i48 = i47 % 2;
                if (!(!((Boolean) auy.setOnFocusChangeListener(new Object[]{16, iArr2, f53710a}, -1279176983, 1279177025, 16)).booleanValue())) {
                    int iIntValue2 = ((Integer) auy.setOnFocusChangeListener(new Object[]{iArr2}, -826911596, 826911628, (int) System.currentTimeMillis())).intValue();
                    int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                    int i49 = (-2) - ((((iIntValue2 * 302) - (~(-(~(-(-(i40 * TypedValues.MotionType.TYPE_EASING))))))) - 1) ^ (-1));
                    int i50 = ~iIntValue2;
                    int i51 = (i50 | iIntValue2) & i50;
                    int i52 = ~iCurrentTimeMillis2;
                    int i53 = ((~i52) & i51) | ((~i51) & i52);
                    int i54 = i51 & i52;
                    int i55 = (i54 & i53) | (i53 ^ i54);
                    int i56 = ~i55;
                    int i57 = -(-((((i55 | i56) & i56) | i40) * (-602)));
                    int i58 = i49 & i57;
                    int i59 = (i58 - (~(-(-((i49 ^ i57) | i58))))) - 1;
                    int i60 = ~i40;
                    int i61 = i50 & i60;
                    int i62 = (i60 | i50) & (~i61);
                    int i63 = (i62 & i61) | (i62 ^ i61);
                    int i64 = ~i63;
                    int i65 = (i63 | i64) & i64;
                    int i66 = ~(i50 | iCurrentTimeMillis2);
                    int i67 = (i65 & i66) | (i65 ^ i66);
                    int i68 = iIntValue2 | ((iCurrentTimeMillis2 | i52) & i52);
                    int i69 = i68 ^ i40;
                    int i70 = i68 & i40;
                    int i71 = ~((i70 & i69) | (i69 ^ i70));
                    int i72 = ((i71 & i67) | ((~i71) & i67) | ((~i67) & i71)) * (-301);
                    int i73 = (i59 ^ i72) + ((i72 & i59) << 1);
                    int i74 = -(-((~(i52 | i40)) * 301));
                    int i75 = i73 & i74;
                    i40 = (((i74 | i73) & (~i75)) + (i75 << 1)) & 511;
                    int i76 = f53712c;
                    int i77 = (((i76 ^ 77) | (i76 & 77)) << 1) - (((~i76) & 77) | (i76 & (-78)));
                    f53711b = i77 % 128;
                    int i78 = i77 % 2;
                }
            }
        } else {
            int iIntValue3 = ((Integer) auy.setOnFocusChangeListener(new Object[]{iArr2}, -826911596, 826911628, (int) System.currentTimeMillis())).intValue();
            int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
            int i410 = (-2) - ((((iIntValue3 * 302) - (~(-(~(-(-(i40 * TypedValues.MotionType.TYPE_EASING))))))) - 1) ^ (-1));
            int i510 = ~iIntValue3;
            int i511 = (i510 | iIntValue3) & i510;
            int i512 = ~iCurrentTimeMillis3;
            int i513 = ((~i512) & i511) | ((~i511) & i512);
            int i514 = i511 & i512;
            int i515 = (i514 & i513) | (i513 ^ i514);
            int i516 = ~i515;
            int i517 = -(-((((i515 | i516) & i516) | i40) * (-602)));
            int i518 = i410 & i517;
            int i519 = (i518 - (~(-(-((i410 ^ i517) | i518))))) - 1;
            int i610 = ~i40;
            int i611 = i510 & i610;
            int i612 = (i610 | i510) & (~i611);
            int i613 = (i612 & i611) | (i612 ^ i611);
            int i614 = ~i613;
            int i615 = (i613 | i614) & i614;
            int i616 = ~(i510 | iCurrentTimeMillis3);
            int i617 = (i615 & i616) | (i615 ^ i616);
            int i618 = iIntValue3 | ((iCurrentTimeMillis3 | i512) & i512);
            int i619 = i618 ^ i40;
            int i79 = i618 & i40;
            int i710 = ~((i79 & i619) | (i619 ^ i79));
            int i711 = ((i710 & i617) | ((~i710) & i617) | ((~i617) & i710)) * (-301);
            int i712 = (i519 ^ i711) + ((i711 & i519) << 1);
            int i713 = -(-((~(i512 | i40)) * 301));
            int i714 = i712 & i713;
            i40 = (((i713 | i712) & (~i714)) + (i714 << 1)) & 511;
            int i715 = f53712c;
            int i716 = (((i715 ^ 77) | (i715 & 77)) << 1) - (((~i715) & 77) | (i715 & (-78)));
            f53711b = i716 % 128;
            int i717 = i716 % 2;
        }
        iArr2[16] = i40;
        int i80 = f53712c;
        int i81 = (i80 & (-10)) | ((~i80) & 9);
        int i82 = (i80 & 9) << 1;
        int i83 = (i81 & i82) + (i82 | i81);
        f53711b = i83 % 128;
        if (i83 % 2 != 0) {
            int i84 = 62 / 0;
        }
    }

    public static int[] setCompoundDrawableTintBlendMode(BigInteger bigInteger) {
        return (int[]) setDividerPadding(new Object[]{bigInteger}, 472779016, -472779004, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:62:0x0730  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = (((~((~i10) | i12)) | i13) * 502) + ((~((~i12) | i13 | i10)) * (-502)) + (((~(i11 | i10)) | (~(i13 | i12))) * (-502)) + (i11 * 503) + (i10 * (-501));
        int[] iArr = f53710a;
        switch (i14) {
            case 1:
                d(objArr);
                return null;
            case 2:
                h(objArr);
                return null;
            case 3:
                j(objArr);
                return null;
            case 4:
                c(objArr);
                return null;
            case 5:
                int[] iArr2 = (int[]) objArr[0];
                int[] iArr3 = (int[]) objArr[1];
                int i15 = f53711b;
                int i16 = (i15 ^ 33) + ((i15 & 33) << 1);
                f53712c = i16 % 128;
                int i17 = i16 % 2;
                int i18 = iArr2[32];
                int iIntValue = ((Integer) auy.setOnFocusChangeListener(new Object[]{iArr2, Integer.valueOf(i18), iArr3}, -1540922287, 1540922293, i18)).intValue() >>> 23;
                int i19 = -(-(i18 >>> 9));
                int i20 = iIntValue & i19;
                int i21 = (iIntValue | i19) & (~i20);
                int i22 = -(-(i20 << 1));
                int i23 = (i21 & i22) + (i21 | i22);
                int iIntValue2 = ((Integer) auy.setOnFocusChangeListener(new Object[]{16, iArr2, iArr3}, -1807856331, 1807856377, 16)).intValue();
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i24 = iIntValue2 * (-464);
                int i25 = -(-(i23 * (-929)));
                int i26 = ((i24 ^ i25) - (~(-(-((i24 & i25) << 1))))) - 1;
                int i27 = ~iIntValue2;
                int i28 = i23 & iCurrentTimeMillis;
                int i29 = ~((i23 ^ iCurrentTimeMillis) | i28);
                int i30 = i27 ^ i29;
                int i31 = i29 & i27;
                int i32 = -(-(((i31 & i30) | (i30 ^ i31)) * (-465)));
                int i33 = (i26 ^ i32) + ((i32 & i26) << 1);
                int i34 = i27 & iCurrentTimeMillis;
                int i35 = (~i34) & (i27 | iCurrentTimeMillis);
                int i36 = ~((i34 & i35) | (i35 ^ i34));
                int i37 = -(-(((i36 & i23) | (i23 ^ i36)) * 930));
                int i38 = ((~i37) & i33) | ((~i33) & i37);
                int i39 = -(-((i37 & i33) << 1));
                int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                int i41 = (iCurrentTimeMillis | i23) & (~i28);
                int i42 = (i41 & i28) | (i41 ^ i28);
                int i43 = ((~i27) & i42) | ((~i42) & i27);
                int i44 = i27 & i42;
                int i45 = -(-(((i44 & i43) | (i43 ^ i44)) * 465));
                int i46 = ((((~i45) & i40) | ((~i40) & i45)) - (~((i45 & i40) << 1))) - 1;
                if (i46 <= 511) {
                    int i47 = f53711b;
                    int i48 = ((i47 | 13) << 1) - (i47 ^ 13);
                    f53712c = i48 % 128;
                    if (i48 % 2 != 0 ? i46 == 511 : i46 == 31293) {
                        if (!(!((Boolean) auy.setOnFocusChangeListener(new Object[]{16, iArr3, iArr}, -1279176983, 1279177025, 16)).booleanValue())) {
                            int iIntValue3 = ((Integer) auy.setOnFocusChangeListener(new Object[]{iArr3}, -826911596, 826911628, (int) System.currentTimeMillis())).intValue();
                            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                            int i49 = iIntValue3 * 491;
                            int i50 = -(-(i46 * (-489)));
                            int i51 = ((i49 ^ i50) - (~(-(-((i49 & i50) << 1))))) - 1;
                            int i52 = ~iIntValue3;
                            int i53 = ~i46;
                            int i54 = (i52 ^ i53) | (i52 & i53);
                            int i55 = ~iCurrentTimeMillis2;
                            int i56 = i54 & i55;
                            int i57 = -(-((((i54 | i55) & (~i56)) | i56) * (-490)));
                            int i58 = ((i51 | i57) << 1) - (i57 ^ i51);
                            int i59 = i53 ^ iIntValue3;
                            int i60 = iIntValue3 & i53;
                            int i61 = (i60 & i59) | (i59 ^ i60);
                            int i62 = ~i61;
                            int i63 = (i61 | i62) & i62;
                            int i64 = i53 & iCurrentTimeMillis2;
                            int i65 = (iCurrentTimeMillis2 | i53) & (~i64);
                            int i66 = (i65 & i64) | (i65 ^ i64);
                            int i67 = ~i66;
                            int i68 = (i66 | i67) & i67;
                            int i69 = ((~i68) & i63) | ((~i63) & i68);
                            int i70 = i63 & i68;
                            int i71 = -(-(((i70 & i69) | (i69 ^ i70)) * 490));
                            int i72 = i58 ^ i71;
                            int i73 = -(-((i71 & i58) << 1));
                            int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
                            int i75 = -(~(i52 * 490));
                            i46 = ((((i74 | i75) << 1) - (i75 ^ i74)) - 1) & 511;
                            int i76 = f53712c;
                            int i77 = i76 & 49;
                            int i78 = i76 | 49;
                            int i79 = (i77 ^ i78) + ((i78 & i77) << 1);
                            f53711b = i79 % 128;
                            int i80 = i79 % 2;
                        }
                    }
                } else {
                    int iIntValue4 = ((Integer) auy.setOnFocusChangeListener(new Object[]{iArr3}, -826911596, 826911628, (int) System.currentTimeMillis())).intValue();
                    int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                    int i410 = iIntValue4 * 491;
                    int i510 = -(-(i46 * (-489)));
                    int i511 = ((i410 ^ i510) - (~(-(-((i410 & i510) << 1))))) - 1;
                    int i512 = ~iIntValue4;
                    int i513 = ~i46;
                    int i514 = (i512 ^ i513) | (i512 & i513);
                    int i515 = ~iCurrentTimeMillis3;
                    int i516 = i514 & i515;
                    int i517 = -(-((((i514 | i515) & (~i516)) | i516) * (-490)));
                    int i518 = ((i511 | i517) << 1) - (i517 ^ i511);
                    int i519 = i513 ^ iIntValue4;
                    int i610 = iIntValue4 & i513;
                    int i611 = (i610 & i519) | (i519 ^ i610);
                    int i612 = ~i611;
                    int i613 = (i611 | i612) & i612;
                    int i614 = i513 & iCurrentTimeMillis3;
                    int i615 = (iCurrentTimeMillis3 | i513) & (~i614);
                    int i616 = (i615 & i614) | (i615 ^ i614);
                    int i617 = ~i616;
                    int i618 = (i616 | i617) & i617;
                    int i619 = ((~i618) & i613) | ((~i613) & i618);
                    int i710 = i613 & i618;
                    int i711 = -(-(((i710 & i619) | (i619 ^ i710)) * 490));
                    int i712 = i518 ^ i711;
                    int i713 = -(-((i711 & i518) << 1));
                    int i714 = ((i712 | i713) << 1) - (i713 ^ i712);
                    int i715 = -(~(i512 * 490));
                    i46 = ((((i714 | i715) << 1) - (i715 ^ i714)) - 1) & 511;
                    int i716 = f53712c;
                    int i717 = i716 & 49;
                    int i718 = i716 | 49;
                    int i719 = (i717 ^ i718) + ((i718 & i717) << 1);
                    f53711b = i719 % 128;
                    int i81 = i719 % 2;
                }
                iArr3[16] = i46;
                int i82 = f53712c;
                int i83 = (i82 ^ 31) + ((i82 & 31) << 1);
                f53711b = i83 % 128;
                int i84 = i83 % 2;
                return null;
            case 6:
                f(objArr);
                return null;
            case 7:
                b(objArr);
                return null;
            case 8:
                int[] iArr4 = (int[]) objArr[0];
                int[] iArr5 = (int[]) objArr[1];
                int i85 = f53712c;
                int i86 = ((i85 ^ 57) | (i85 & 57)) << 1;
                int i87 = -(((~i85) & 57) | (i85 & (-58)));
                int i88 = (i86 & i87) + (i87 | i86);
                f53711b = i88 % 128;
                int i89 = i88 % 2;
                int[] iArr6 = (int[]) auy.setOnFocusChangeListener(new Object[]{33}, 1950542281, -1950542250, 33);
                setDividerPadding(new Object[]{iArr4, iArr6}, -1748131667, 1748131669, (int) System.currentTimeMillis());
                setDividerPadding(new Object[]{iArr6, iArr5}, -550786261, 550786266, (int) System.currentTimeMillis());
                int i90 = f53711b;
                int i91 = i90 & 17;
                int i92 = ((i90 ^ 17) | i91) << 1;
                int i93 = -((i90 | 17) & (~i91));
                int i94 = (i92 & i93) + (i93 | i92);
                f53712c = i94 % 128;
                int i95 = i94 % 2;
                return null;
            case 9:
                int[] iArr7 = (int[]) objArr[0];
                int[] iArr8 = (int[]) objArr[1];
                int[] iArr9 = (int[]) objArr[2];
                int i96 = f53711b;
                int i97 = (i96 ^ 61) + ((i96 & 61) << 1);
                f53712c = i97 % 128;
                int i98 = i97 % 2;
                avh.setX(new Object[]{iArr7, iArr8, iArr9}, -173321722, 173321722, (int) System.currentTimeMillis());
                int i99 = iArr7[16];
                int i100 = iArr8[16];
                int iIntValue5 = ((Integer) auy.setOnFocusChangeListener(new Object[]{Integer.valueOf(i99), iArr8, Integer.valueOf(i100), iArr7, iArr9}, -1222891668, 1222891707, i99)).intValue();
                int i101 = i99 * i100;
                System.currentTimeMillis();
                int i102 = i101 * 1649;
                int i103 = -(-(iIntValue5 * 825));
                int i104 = ((i102 ^ i103) | (i102 & i103)) << 1;
                int i105 = -(((~i102) & i103) | ((~i103) & i102));
                int i106 = (i104 & i105) + (i105 | i104);
                int i107 = ~iIntValue5;
                int i108 = (i107 | iIntValue5) & i107;
                int i109 = ((i108 & i101) | (i101 ^ i108)) * (-824);
                int i110 = i106 & i109;
                int i111 = -(-((i106 ^ i109) | i110));
                int i112 = (i110 & i111) + (i111 | i110);
                int i113 = -(~((iIntValue5 | i101) * (-1648)));
                int i114 = (i112 ^ i113) + ((i113 & i112) << 1);
                int i115 = (i114 ^ (-1)) + (i114 << 1);
                int i116 = ~i101;
                int i117 = ((~i107) & i116) | ((~i116) & i107);
                int i118 = i116 & i107;
                int i119 = -(-(((i118 & i117) | (i117 ^ i118)) * 824));
                int i120 = i115 & i119;
                iArr9[32] = (((i115 ^ i119) | i120) << 1) - ((i115 | i119) & (~i120));
                int i121 = f53711b;
                int i122 = (i121 & (-12)) | ((~i121) & 11);
                int i123 = (i121 & 11) << 1;
                int i124 = ((i122 | i123) << 1) - (i123 ^ i122);
                f53712c = i124 % 128;
                int i125 = i124 % 2;
                return null;
            case 10:
                g(objArr);
                return null;
            case 11:
                int[] iArr10 = (int[]) objArr[0];
                int i126 = f53712c + 93;
                int i127 = i126 % 128;
                f53711b = i127;
                int i128 = i126 % 2;
                int i129 = i127 & 71;
                int i130 = i129 + ((i127 ^ 71) | i129);
                f53712c = i130 % 128;
                int i131 = i130 % 2;
                int i132 = 0;
                int i133 = 0;
                for (int i134 = 17; i132 < i134; i134 = 17) {
                    int i135 = f53711b;
                    int i136 = (i135 ^ 63) + ((i135 & 63) << 1);
                    f53712c = i136 % 128;
                    if (i136 % 2 == 0) {
                        int i137 = iArr10[i132];
                        int i138 = i133 ^ i137;
                        int i139 = i133 & i137;
                        int i140 = (i139 & i138) | (i138 ^ i139);
                        int i141 = i132 & 73;
                        int i142 = ((i132 ^ 73) | i141) << 1;
                        int i143 = -((~i141) & (i132 | 73));
                        i133 = i140;
                        i132 = (i142 & i143) + (i142 | i143);
                    } else {
                        int i144 = iArr10[i132];
                        int i145 = i133 & i144;
                        int i146 = (i133 | i144) & (~i145);
                        i133 = (i146 & i145) | (i146 ^ i145);
                        i132 = ((i132 & (-2)) | ((~i132) & 1)) + ((i132 & 1) << 1);
                    }
                }
                int i147 = i133 >>> 1;
                int i148 = i133 & 1;
                int i149 = (i147 & i148) | (i147 ^ i148);
                int i150 = ((i149 ^ (-1)) + (i149 << 1)) >> 31;
                int i151 = f53712c;
                int i152 = ((i151 ^ 13) | (i151 & 13)) << 1;
                int i153 = -(((~i151) & 13) | (i151 & (-14)));
                int i154 = (i152 ^ i153) + ((i153 & i152) << 1);
                f53711b = i154 % 128;
                int i155 = i154 % 2;
                return Integer.valueOf(i150);
            case 12:
                return e(objArr);
            case 13:
                i(objArr);
                return null;
            case 14:
                int[] iArr11 = (int[]) objArr[0];
                int i156 = f53712c;
                int i157 = (i156 & (-46)) | ((~i156) & 45);
                int i158 = (i156 & 45) << 1;
                int i159 = ((i157 | i158) << 1) - (i158 ^ i157);
                f53711b = i159 % 128;
                int i160 = i159 % 2;
                int i161 = iArr11[16];
                int iIntValue6 = ((Integer) auy.setOnFocusChangeListener(new Object[]{16, Integer.valueOf(i161 >>> 9), iArr11}, -675302000, 675302004, 16)).intValue();
                int i162 = i161 & 511;
                int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
                int i163 = i162 * 477;
                int i164 = -(-(iIntValue6 * (-475)));
                int i165 = (i163 & i164) + (i163 | i164);
                int i166 = ~i162;
                int i167 = ~((i166 ^ iIntValue6) | (i166 & iIntValue6));
                int i168 = ~iIntValue6;
                int i169 = (i168 & i166) | ((~i168) & i162);
                int i170 = i168 & i162;
                int i171 = (i169 & i170) | (i169 ^ i170);
                int i172 = i171 & iCurrentTimeMillis4;
                int i173 = (i171 | iCurrentTimeMillis4) & (~i172);
                int i174 = ~iCurrentTimeMillis4;
                int i175 = ~(i173 | i172);
                int i176 = (i165 - (~(-(~(((i167 & i175) | (i167 ^ i175)) * (-476)))))) - 2;
                int i177 = (iIntValue6 | i168) & i168;
                int i178 = ~i177;
                int i179 = (i166 & i177) | (i162 & i178);
                int i180 = i177 & i162;
                int i181 = (i179 & i180) | (i179 ^ i180);
                int i182 = i181 ^ iCurrentTimeMillis4;
                int i183 = iCurrentTimeMillis4 & i181;
                int i184 = (~((i183 & i182) | (i182 ^ i183))) * 952;
                int i185 = i176 & i184;
                int i186 = (((i184 | i176) & (~i185)) - (~(-(-(i185 << 1))))) - 1;
                int i187 = ((~i174) & i177) | (i178 & i174);
                int i188 = i177 & i174;
                int i189 = (i188 & i187) | (i187 ^ i188);
                int i190 = ((~((i189 & i162) | (i189 ^ i162))) * 476) + i186;
                if (i190 <= 511) {
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                    if (i190 == 511) {
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                        if (!(!((Boolean) auy.setOnFocusChangeListener(new Object[]{16, iArr11, iArr}, -1279176983, 1279177025, 16)).booleanValue())) {
                            i190 = ((i190 - (~(-(~(-(-((Integer) auy.setOnFocusChangeListener(new Object[]{iArr11}, -826911596, 826911628, (int) System.currentTimeMillis())).intValue())))))) - 2) & 511;
                            int i191 = f53711b;
                            int i192 = ((i191 | 65) << 1) - (i191 ^ 65);
                            f53712c = i192 % 128;
                            int i193 = i192 % 2;
                        }
                    }
                } else {
                    i190 = ((i190 - (~(-(~(-(-((Integer) auy.setOnFocusChangeListener(new Object[]{iArr11}, -826911596, 826911628, (int) System.currentTimeMillis())).intValue())))))) - 2) & 511;
                    int i194 = f53711b;
                    int i195 = ((i194 | 65) << 1) - (i194 ^ 65);
                    f53712c = i195 % 128;
                    int i196 = i195 % 2;
                }
                iArr11[16] = i190;
                System.currentTimeMillis();
                System.currentTimeMillis();
                return null;
            case 15:
                SecureRandom secureRandom = (SecureRandom) objArr[0];
                int[] iArr12 = (int[]) objArr[1];
                int i197 = f53712c;
                int i198 = (i197 & 125) + (i197 | 125);
                f53711b = i198 % 128;
                byte[] bArr = new byte[i198 % 2 != 0 ? 100 : 68];
                do {
                    secureRandom.nextBytes(bArr);
                    ber.setDividerPadding(new Object[]{bArr, 0, iArr12, 17}, 1570947064, -1570947056, 0);
                    iArr12[16] = iArr12[16] & 511;
                } while (((Integer) auy.setOnFocusChangeListener(new Object[]{17, iArr12, iArr}, -188447753, 188447787, 17)).intValue() == 0);
                int i199 = f53711b;
                int i200 = ((i199 | 46) << 1) - (i199 ^ 46);
                int i201 = (i200 ^ (-1)) + (i200 << 1);
                f53712c = i201 % 128;
                int i202 = i201 % 2;
                return null;
            case 16:
                int[] iArr13 = (int[]) objArr[0];
                int[] iArr14 = (int[]) objArr[1];
                int[] iArr15 = (int[]) objArr[2];
                int i203 = f53712c + 59;
                f53711b = i203 % 128;
                if (i203 % 2 != 0) {
                    int[] iArr16 = (int[]) auy.setOnFocusChangeListener(new Object[]{91}, 1950542281, -1950542250, 91);
                    setDividerPadding(new Object[]{iArr13, iArr14, iArr16}, 137169014, -137169005, (int) System.currentTimeMillis());
                    setDividerPadding(new Object[]{iArr16, iArr15}, -550786261, 550786266, (int) System.currentTimeMillis());
                } else {
                    int[] iArr17 = (int[]) auy.setOnFocusChangeListener(new Object[]{33}, 1950542281, -1950542250, 33);
                    setDividerPadding(new Object[]{iArr13, iArr14, iArr17}, 137169014, -137169005, (int) System.currentTimeMillis());
                    setDividerPadding(new Object[]{iArr17, iArr15}, -550786261, 550786266, (int) System.currentTimeMillis());
                }
                int i204 = f53712c;
                int i205 = i204 & 65;
                int i206 = (i204 ^ 65) | i205;
                int i207 = (i205 ^ i206) + ((i206 & i205) << 1);
                f53711b = i207 % 128;
                int i208 = i207 % 2;
                return null;
            case 17:
                a(objArr);
                return null;
            case 18:
                int[] iArr18 = (int[]) objArr[0];
                int[] iArr19 = (int[]) objArr[1];
                int[] iArr20 = (int[]) objArr[2];
                int i209 = f53712c;
                int i210 = i209 & 53;
                int i211 = i210 + ((i209 ^ 53) | i210);
                f53711b = i211 % 128;
                int i212 = i211 % 2;
                int iIntValue7 = ((Integer) auy.setOnFocusChangeListener(new Object[]{16, iArr18, iArr19, iArr20}, 324288195, -324288186, 16)).intValue();
                int i213 = iArr18[16];
                int iCurrentTimeMillis5 = (int) System.currentTimeMillis();
                int i214 = i213 * (-344);
                int i215 = -(-(iIntValue7 * (-344)));
                int i216 = ((~i215) & i214) | ((~i214) & i215);
                int i217 = (i214 & i215) << 1;
                int i218 = ((i216 | i217) << 1) - (i217 ^ i216);
                int i219 = ~i213;
                int i220 = ~i219;
                int i221 = ~iIntValue7;
                int i222 = (iIntValue7 | i221) & i221;
                int i223 = i219 & i222;
                int i224 = (~i223) & (i219 | i222);
                int i225 = ~((i224 ^ i223) | (i223 & i224));
                int i226 = ~iCurrentTimeMillis5;
                int i227 = i219 & i226;
                int i228 = i227 | (iCurrentTimeMillis5 & i220);
                int i229 = i219 & iCurrentTimeMillis5;
                int i230 = (i228 ^ i229) | (i228 & i229);
                int i231 = ~i230;
                int i232 = (i230 | i231) & i231;
                int i233 = ((~i225) & i232) | ((~i232) & i225);
                int i234 = i232 & i225;
                int i235 = -(~(((i233 & i234) | (i233 ^ i234)) * 345));
                int i236 = (i218 & i235) + (i235 | i218);
                int i237 = (i236 ^ (-1)) + (i236 << 1);
                int i238 = ((~i226) & i219) | (i226 & i220);
                int i239 = ~((i238 & i227) | (i238 ^ i227));
                int i240 = ~((i213 & i222) | (i222 ^ i213));
                int i241 = -(-(((i240 & i239) | (i239 ^ i240)) * 345));
                int i242 = i237 & i241;
                int i243 = ((i241 | i237) & (~i242)) + (i242 << 1);
                int i244 = ((~i221) & i219) | (i221 & i220);
                int i245 = i219 & i221;
                int i246 = (i244 & i245) | (i244 ^ i245);
                int i247 = (i246 & i226) | ((~i246) & iCurrentTimeMillis5);
                int i248 = i246 & iCurrentTimeMillis5;
                int i249 = (i248 & i247) | (i247 ^ i248);
                int i250 = ~i249;
                int i251 = -(-(((i249 | i250) & i250) * 345));
                int i252 = i243 & i251;
                int i253 = i252 + ((i243 ^ i251) | i252);
                int i254 = -iArr19[16];
                int iCurrentTimeMillis6 = (int) System.currentTimeMillis();
                int i255 = i254 * 934;
                int i256 = -(-(i253 * (-932)));
                int i257 = (((~i256) & i255) | ((~i255) & i256)) + ((i255 & i256) << 1);
                int i258 = ~i253;
                int i259 = ~i254;
                int i260 = ~iCurrentTimeMillis6;
                int i261 = ~((i259 & i260) | (i259 ^ i260));
                int i262 = (i257 - (~(-(-(((i261 & i258) | (i258 ^ i261)) * (-933)))))) - 1;
                int i263 = i258 ^ i260;
                int i264 = i260 & i258;
                int i265 = ~((i264 & i263) | (i263 ^ i264));
                int i266 = (i258 & (i258 | i253)) | i254;
                int i267 = ~i266;
                int i268 = (i266 | i267) & i267;
                int i269 = i265 ^ i268;
                int i270 = i265 & i268;
                int i271 = (i262 - (~(((i270 & i269) | (i269 ^ i270)) * 933))) - 1;
                int i272 = (i254 & i253) | (i254 ^ i253);
                int i273 = ~i272;
                int i274 = i271 - (~(((i272 | i273) & i273) * 933));
                int i275 = (i274 ^ (-1)) + (i274 << 1);
                if (i275 < 0) {
                    int i276 = f53712c;
                    int i277 = i276 & 27;
                    int i278 = i277 + ((i276 ^ 27) | i277);
                    f53711b = i278 % 128;
                    int i279 = i278 % 2;
                    int iIntValue8 = ((Integer) auy.setOnFocusChangeListener(new Object[]{iArr20}, -860593134, 860593162, (int) System.currentTimeMillis())).intValue();
                    int iCurrentTimeMillis7 = (int) System.currentTimeMillis();
                    int i280 = iIntValue8 * (-129);
                    int i281 = -(-(i275 * 131));
                    int i282 = (i280 ^ i281) + ((i280 & i281) << 1);
                    int i283 = ~i275;
                    int i284 = ~iCurrentTimeMillis7;
                    int i285 = i283 & i284;
                    int i286 = (i284 | i283) & (~i285);
                    int i287 = (i286 & i285) | (i286 ^ i285);
                    int i288 = ((~((i287 & iIntValue8) | (i287 ^ iIntValue8))) * 130) + i282;
                    int i289 = (i283 & iIntValue8) | (i283 ^ iIntValue8);
                    int i290 = ~i289;
                    int i291 = (i290 & (i290 | i289)) * (-260);
                    int i292 = (i288 | i291) << 1;
                    int i293 = -(((~i288) & i291) | ((~i291) & i288));
                    int i294 = (i292 ^ i293) + ((i293 & i292) << 1);
                    int i295 = ~iIntValue8;
                    int i296 = (iIntValue8 | i295) & i295;
                    int i297 = i296 & i275;
                    int i298 = ~(((i275 | i296) & (~i297)) | i297);
                    int i299 = i289 & iCurrentTimeMillis7;
                    int i300 = (iCurrentTimeMillis7 | i289) & (~i299);
                    int i301 = ~((i299 & i300) | (i300 ^ i299));
                    int i302 = i298 & i301;
                    int i303 = (i298 | i301) & (~i302);
                    int i304 = ((i303 & i302) | (i303 ^ i302)) * 130;
                    i275 = 511 & ((i294 ^ i304) + ((i304 & i294) << 1));
                    int i305 = f53712c;
                    int i306 = i305 & 97;
                    int i307 = -(-((i305 ^ 97) | i306));
                    int i308 = ((i306 | i307) << 1) - (i307 ^ i306);
                    f53711b = i308 % 128;
                    int i309 = i308 % 2;
                }
                iArr20[16] = i275;
                System.currentTimeMillis();
                System.currentTimeMillis();
                return null;
            default:
                k(objArr);
                return null;
        }
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, -71996162, 71996165, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, -156138012, 156138018, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int i10, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, Integer.valueOf(i10), iArr2, iArr3}, 1858078901, -1858078894, i10);
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, -1381526919, 1381526919, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, 210479255, -210479238, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 1021528603, -1021528585, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, -303937494, 303937502, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr) {
        setDividerPadding(new Object[]{iArr}, 657241253, -657241239, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 258960032, -258960022, (int) System.currentTimeMillis());
    }

    public static void setX(SecureRandom secureRandom, int[] iArr) {
        setDividerPadding(new Object[]{secureRandom, iArr}, 431866319, -431866318, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, -1759345012, 1759345025, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3, iArr4}, -1397475500, 1397475504, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, -1352951593, 1352951609, (int) System.currentTimeMillis());
    }
}
