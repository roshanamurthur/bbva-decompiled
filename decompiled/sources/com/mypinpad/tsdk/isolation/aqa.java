package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class aqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f53559a = {-1, -1, 0, -1, -1, -1, -1, -2};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f53560b = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53561c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53562d = 1;

    static {
        int i10 = 10 - 1;
        f53562d = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void a(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53561c;
        int i11 = ((i10 & 62) + (i10 | 62)) - 1;
        f53562d = i11 % 128;
        if (i11 % 2 == 0) {
            int[] iArr3 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
            avf.setX(new Object[]{iArr, iArr3}, -44054691, 44054719, (int) System.currentTimeMillis());
            setX(new Object[]{iArr3, iArr2}, -1800460062, 1800460064, (int) System.currentTimeMillis());
            throw null;
        }
        int[] iArr4 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
        avf.setX(new Object[]{iArr, iArr4}, -44054691, 44054719, (int) System.currentTimeMillis());
        setX(new Object[]{iArr4, iArr2}, -1800460062, 1800460064, (int) System.currentTimeMillis());
        int i12 = f53561c;
        int i13 = i12 & 45;
        int i14 = (i12 ^ 45) | i13;
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        f53562d = i15 % 128;
        int i16 = i15 % 2;
    }

    public static /* synthetic */ void b(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53561c + 33;
        f53562d = i10 % 128;
        int i11 = i10 % 2;
        int[] iArr3 = f53559a;
        if (i11 == 0) {
            ava.setOnFocusChangeListener(new Object[]{iArr3, iArr, iArr2}, 1200653283, -1200653275, (int) System.currentTimeMillis());
            throw null;
        }
        ava.setOnFocusChangeListener(new Object[]{iArr3, iArr, iArr2}, 1200653283, -1200653275, (int) System.currentTimeMillis());
        int i12 = f53561c + 83;
        f53562d = i12 % 128;
        int i13 = i12 % 2;
    }

    public static /* synthetic */ void c(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53562d;
        int i11 = (i10 & 85) + (i10 | 85);
        f53561c = i11 % 128;
        if (i11 % 2 != 0) {
            int[] iArr4 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
            avf.setX(new Object[]{iArr, iArr2, iArr4}, -701222223, 701222256, (int) System.currentTimeMillis());
            setX(new Object[]{iArr4, iArr3}, -1800460062, 1800460064, (int) System.currentTimeMillis());
            int i12 = 43 / 0;
        } else {
            int[] iArr5 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
            avf.setX(new Object[]{iArr, iArr2, iArr5}, -701222223, 701222256, (int) System.currentTimeMillis());
            setX(new Object[]{iArr5, iArr3}, -1800460062, 1800460064, (int) System.currentTimeMillis());
        }
        int i13 = f53562d;
        int i14 = (i13 & 67) + (i13 | 67);
        f53561c = i14 % 128;
        int i15 = i14 % 2;
    }

    public static /* synthetic */ void d(Object[] objArr) {
        SecureRandom secureRandom = (SecureRandom) objArr[0];
        int[] iArr = (int[]) objArr[1];
        int i10 = f53561c;
        int i11 = (i10 & (-100)) | ((~i10) & 99);
        int i12 = (i10 & 99) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        f53562d = i14;
        byte[] bArr = new byte[i13 % 2 == 0 ? 57 : 32];
        int i15 = (i14 & 107) + (i14 | 107);
        f53561c = i15 % 128;
        int i16 = i15 % 2;
        do {
            secureRandom.nextBytes(bArr);
            ber.setDividerPadding(new Object[]{bArr, 0, iArr, 8}, 1570947064, -1570947056, 0);
        } while (((Integer) auy.setOnFocusChangeListener(new Object[]{8, iArr, f53559a}, -188447753, 188447787, 8)).intValue() == 0);
        int i17 = f53561c + 85;
        f53562d = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 20 / 0;
        }
    }

    public static /* synthetic */ void e(Object[] objArr) {
        int[] iArr;
        int[] iArr2 = (int[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53562d;
        int i11 = ((i10 | 1) << 1) - (i10 ^ 1);
        f53561c = i11 % 128;
        if (i11 % 2 != 0) {
            iArr = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
            avf.setX(new Object[]{iArr2, iArr}, -44054691, 44054719, (int) System.currentTimeMillis());
            setX(new Object[]{iArr, iArr3}, -1800460062, 1800460064, (int) System.currentTimeMillis());
            int i12 = 12 / 0;
        } else {
            iArr = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
            avf.setX(new Object[]{iArr2, iArr}, -44054691, 44054719, (int) System.currentTimeMillis());
            setX(new Object[]{iArr, iArr3}, -1800460062, 1800460064, (int) System.currentTimeMillis());
        }
        int i13 = iIntValue;
        while (true) {
            i13--;
            if (i13 <= 0) {
                break;
            }
            int i14 = f53561c;
            int i15 = i14 ^ 33;
            int i16 = -(-((i14 & 33) << 1));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            f53562d = i17 % 128;
            Object[] objArr2 = new Object[2];
            if (i17 % 2 == 0) {
                objArr2[0] = iArr3;
                objArr2[1] = iArr;
                avf.setX(objArr2, -44054691, 44054719, (int) System.currentTimeMillis());
                setX(new Object[]{iArr, iArr3}, -1800460062, 1800460064, (int) System.currentTimeMillis());
                int i18 = 3 / 0;
            } else {
                objArr2[0] = iArr3;
                objArr2[1] = iArr;
                avf.setX(objArr2, -44054691, 44054719, (int) System.currentTimeMillis());
                setX(new Object[]{iArr, iArr3}, -1800460062, 1800460064, (int) System.currentTimeMillis());
            }
            int i19 = f53561c;
            int i20 = i19 ^ 121;
            int i21 = (((i19 & 121) | i20) << 1) - i20;
            f53562d = i21 % 128;
            int i22 = i21 % 2;
        }
        int i23 = ~iIntValue;
        int i24 = (i23 | iIntValue) & i23;
        int i25 = ((~i24) & (-542163930)) | (i24 & 542163929);
        int i26 = (-542163930) & i24;
        int i27 = ~((i25 & i26) | (i25 ^ i26));
        int i28 = iIntValue & (-454435705);
        int i29 = (454435704 & i23) | i28;
        int i30 = 454435704 & iIntValue;
        int i31 = (i30 & i29) | (i29 ^ i30);
        int i32 = ~i31;
        int i33 = (i31 | i32) & i32;
        int i34 = ((~i33) & i27) | ((~i27) & i33);
        int i35 = i27 & i33;
        int i36 = (((i35 & i34) | (i34 ^ i35)) * ReturnCode.ERR_REPOSITORY) - 1649705952;
        int i37 = i24 ^ (-454435705);
        int i38 = i24 & (-454435705);
        int i39 = ~((i38 & i37) | (i37 ^ i38));
        int i40 = ~((542163929 ^ iIntValue) | (542163929 & iIntValue));
        int i41 = -(-(((i39 & i40) | (i39 ^ i40)) * (-950)));
        int i42 = ((i36 | i41) << 1) - (i41 ^ i36);
        int i43 = ~((i23 ^ 542163929) | (i23 & 542163929));
        int i44 = ~(((-454435705) ^ iIntValue) | i28);
        int i45 = i43 & i44;
        int i46 = (i43 | i44) & (~i45);
        int i47 = -(-(((i46 & i45) | (i46 ^ i45)) * 950));
        int i48 = (i42 ^ i47) + ((i47 & i42) << 1);
        int i49 = ~((809992931 ^ i23) | (809992931 & i23));
        int i50 = i49 & 110628888;
        int i51 = (i49 | 110628888) & (~i50);
        int i52 = (i51 & i50) | (i51 ^ i50);
        int i53 = i23 ^ (-379327228);
        int i54 = i23 & (-379327228);
        int i55 = ~((i54 & i53) | (i53 ^ i54));
        int i56 = ((~i55) & i52) | ((~i52) & i55);
        int i57 = i55 & i52;
        int i58 = ((i57 & i56) | (i56 ^ i57)) * 464;
        int i59 = (1071070880 & i58) + (i58 | 1071070880);
        int i60 = iIntValue & 379327227;
        int i61 = (379327227 | iIntValue) & (~i60);
        int i62 = (i61 & i60) | (i61 ^ i60);
        int i63 = -(-(((i62 & 809992931) | ((-809992932) & i62) | ((~i62) & 809992931)) * (-464)));
        int i64 = i59 & i63;
        int i65 = (((i59 ^ i63) | i64) << 1) - ((i63 | i59) & (~i64));
        int i66 = ((-379327228) ^ iIntValue) | ((-379327228) & iIntValue);
        int i67 = ~i66;
        int i68 = (i66 | i67) & i67;
        if (i48 <= (((i68 & 110628888) | ((~i68) & 110628888) | ((-110628889) & i68)) * 464) + i65) {
            int i69 = 89 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x012c  */
    /* JADX WARN: Code duplicated, block: B:14:0x013b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0142  */
    /* JADX WARN: Code duplicated, block: B:21:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    public static /* synthetic */ void f(Object[] objArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i16 = f53561c + 25;
        f53562d = i16 % 128;
        int i17 = i16 % 2;
        int[] iArr4 = f53560b;
        if (i17 != 0) {
            if (((Integer) avf.setX(new Object[]{iArr, iArr2, iArr3}, 340994627, -340994605, (int) System.currentTimeMillis())).intValue() == 0) {
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i18 = ~iCurrentTimeMillis;
                int i19 = (i18 | iCurrentTimeMillis) & i18;
                int i20 = 425149984 & i19;
                int i21 = (i19 | 425149984) & (~i20);
                int i22 = ~((i21 & i20) | (i21 ^ i20));
                int i23 = 326105601 ^ i22;
                int i24 = i22 & 326105601;
                int i25 = (i24 & i23) | (i23 ^ i24);
                int i26 = ~((-425149985) | iCurrentTimeMillis);
                int i27 = -(-(((i25 & i26) | (i25 ^ i26)) * (-564)));
                int i28 = (-777712751) & i27;
                int i29 = (i27 ^ (-777712751)) | i28;
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                int i31 = -(~((~((iCurrentTimeMillis & (-135267361)) | ((-135267361) ^ iCurrentTimeMillis))) * 1128));
                int i32 = ((i30 ^ i31) + ((i31 & i30) << 1)) - 1;
                int i33 = 326105601 & i18;
                int i34 = (i18 | 326105601) & (~i33);
                int i35 = ~((i33 & i34) | (i34 ^ i33));
                int i36 = i35 & 289882624;
                int i37 = (i35 | 289882624) & (~i36);
                int i38 = ((i37 & i36) | (i37 ^ i36)) * 564;
                i10 = (i32 & i38) + (i38 | i32);
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i39 = ~iCurrentTimeMillis2;
                int i40 = i39 & (-495998422);
                int i41 = i40 | ((~i40) & (i39 | (-495998422)));
                int i42 = ~i41;
                int i43 = (i41 | i42) & i42;
                int i44 = ((-26219793) & i43) | ((~i43) & 26219792);
                int i45 = i43 & 26219792;
                int i46 = (i45 & i44) | (i44 ^ i45);
                int i47 = (-1612775945) ^ iCurrentTimeMillis2;
                int i48 = (-1612775945) & iCurrentTimeMillis2;
                int i49 = ~((i47 ^ i48) | (i47 & i48));
                int i50 = ((~i46) & i49) | ((~i49) & i46);
                int i51 = i46 & i49;
                i11 = (-195897043) - (~(((i50 & i51) | (i50 ^ i51)) * 717));
                int i52 = (i39 | iCurrentTimeMillis2) & i39;
                int i53 = (-1612775945) & i52;
                int i54 = ~(((i52 | (-1612775945)) & (~i53)) | i53);
                int i55 = i54 ^ 26219792;
                int i56 = i54 & 26219792;
                int i57 = (i56 & i55) | (i55 ^ i56);
                int i58 = ~((iCurrentTimeMillis2 & (-495998422)) | ((-495998422) ^ iCurrentTimeMillis2));
                i12 = i57 ^ i58;
                i13 = i58 & i57;
                if (i10 > (i11 - (~(-(-(((i13 & i12) | (i12 ^ i13)) * 717))))) - 1) {
                    i14 = iArr3[23];
                    if (((i14 & (-2)) | ((~i14) & 1)) + ((i14 & 1) << 1) >= Integer.MAX_VALUE) {
                        if (((Boolean) auy.setOnFocusChangeListener(new Object[]{16, iArr3, iArr4}, 280624047, -280624046, 16)).booleanValue()) {
                        }
                    }
                } else if ((iArr3[15] >>> 1) >= Integer.MAX_VALUE) {
                    if (((Boolean) auy.setOnFocusChangeListener(new Object[]{16, iArr3, iArr4}, 280624047, -280624046, 16)).booleanValue()) {
                    }
                }
            }
            int i59 = f53562d;
            i15 = ((i59 ^ 115) - (~((i59 & 115) << 1))) - 1;
            f53561c = i15 % 128;
            if (i15 % 2 != 0) {
                int i60 = 80 / 0;
            }
        }
        Object[] objArr2 = {iArr, iArr2, iArr3};
        int i61 = 27 / 0;
        if (((Integer) avf.setX(objArr2, 340994627, -340994605, (int) System.currentTimeMillis())).intValue() == 0) {
            int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
            int i110 = ~iCurrentTimeMillis3;
            int i111 = (i110 | iCurrentTimeMillis3) & i110;
            int i210 = 425149984 & i111;
            int i211 = (i111 | 425149984) & (~i210);
            int i212 = ~((i211 & i210) | (i211 ^ i210));
            int i213 = 326105601 ^ i212;
            int i214 = i212 & 326105601;
            int i215 = (i214 & i213) | (i213 ^ i214);
            int i216 = ~((-425149985) | iCurrentTimeMillis3);
            int i217 = -(-(((i215 & i216) | (i215 ^ i216)) * (-564)));
            int i218 = (-777712751) & i217;
            int i219 = (i217 ^ (-777712751)) | i218;
            int i310 = ((i218 | i219) << 1) - (i219 ^ i218);
            int i311 = -(~((~((iCurrentTimeMillis3 & (-135267361)) | ((-135267361) ^ iCurrentTimeMillis3))) * 1128));
            int i312 = ((i310 ^ i311) + ((i311 & i310) << 1)) - 1;
            int i313 = 326105601 & i110;
            int i314 = (i110 | 326105601) & (~i313);
            int i315 = ~((i313 & i314) | (i314 ^ i313));
            int i316 = i315 & 289882624;
            int i317 = (i315 | 289882624) & (~i316);
            int i318 = ((i317 & i316) | (i317 ^ i316)) * 564;
            i10 = (i312 & i318) + (i318 | i312);
            int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
            int i319 = ~iCurrentTimeMillis4;
            int i410 = i319 & (-495998422);
            int i411 = i410 | ((~i410) & (i319 | (-495998422)));
            int i412 = ~i411;
            int i413 = (i411 | i412) & i412;
            int i414 = ((-26219793) & i413) | ((~i413) & 26219792);
            int i415 = i413 & 26219792;
            int i416 = (i415 & i414) | (i414 ^ i415);
            int i417 = (-1612775945) ^ iCurrentTimeMillis4;
            int i418 = (-1612775945) & iCurrentTimeMillis4;
            int i419 = ~((i417 ^ i418) | (i417 & i418));
            int i510 = ((~i416) & i419) | ((~i419) & i416);
            int i511 = i416 & i419;
            i11 = (-195897043) - (~(((i510 & i511) | (i510 ^ i511)) * 717));
            int i512 = (i319 | iCurrentTimeMillis4) & i319;
            int i513 = (-1612775945) & i512;
            int i514 = ~(((i512 | (-1612775945)) & (~i513)) | i513);
            int i515 = i514 ^ 26219792;
            int i516 = i514 & 26219792;
            int i517 = (i516 & i515) | (i515 ^ i516);
            int i518 = ~((iCurrentTimeMillis4 & (-495998422)) | ((-495998422) ^ iCurrentTimeMillis4));
            i12 = i517 ^ i518;
            i13 = i518 & i517;
            if (i10 > (i11 - (~(-(-(((i13 & i12) | (i12 ^ i13)) * 717))))) - 1) {
                i14 = iArr3[23];
                if (((i14 & (-2)) | ((~i14) & 1)) + ((i14 & 1) << 1) >= Integer.MAX_VALUE) {
                    if (((Boolean) auy.setOnFocusChangeListener(new Object[]{16, iArr3, iArr4}, 280624047, -280624046, 16)).booleanValue()) {
                    }
                }
            } else if ((iArr3[15] >>> 1) >= Integer.MAX_VALUE) {
                if (((Boolean) auy.setOnFocusChangeListener(new Object[]{16, iArr3, iArr4}, 280624047, -280624046, 16)).booleanValue()) {
                }
            }
        }
        int i519 = f53562d;
        i15 = ((i519 ^ 115) - (~((i519 & 115) << 1))) - 1;
        f53561c = i15 % 128;
        if (i15 % 2 != 0) {
            int i62 = 80 / 0;
        }
        ((Integer) auy.setOnFocusChangeListener(new Object[]{16, iArr4, iArr3}, 562472640, -562472619, 16)).intValue();
        int i63 = f53561c;
        int i64 = ((i63 ^ 9) | (i63 & 9)) << 1;
        int i65 = -(((~i63) & 9) | (i63 & (-10)));
        int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
        f53562d = i66 % 128;
        int i67 = i66 % 2;
        int i5110 = f53562d;
        i15 = ((i5110 ^ 115) - (~((i5110 & 115) << 1))) - 1;
        f53561c = i15 % 128;
        if (i15 % 2 != 0) {
            int i68 = 80 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0090  */
    public static /* synthetic */ void g(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53562d + 109;
        f53561c = i10 % 128;
        if (i10 % 2 != 0) {
            ((Integer) avf.setX(new Object[]{iArr, iArr2, iArr3}, -993304868, 993304870, (int) System.currentTimeMillis())).intValue();
            throw null;
        }
        if (((Integer) avf.setX(new Object[]{iArr, iArr2, iArr3}, -993304868, 993304870, (int) System.currentTimeMillis())).intValue() != 0) {
            setX(new Object[]{iArr3}, -1375864721, 1375864733, (int) System.currentTimeMillis());
            int i11 = f53561c + 73;
            f53562d = i11 % 128;
            int i12 = i11 % 2;
        } else if ((iArr3[7] >>> 1) >= Integer.MAX_VALUE) {
            int i13 = f53562d;
            int i14 = i13 & 45;
            int i15 = (i13 | 45) & (~i14);
            int i16 = -(-(i14 << 1));
            int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
            f53561c = i17 % 128;
            int i18 = i17 % 2;
            int[] iArr4 = f53559a;
            if (i18 != 0) {
                ((Boolean) avf.setX(new Object[]{iArr3, iArr4}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            }
            if (((Boolean) avf.setX(new Object[]{iArr3, iArr4}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue()) {
                setX(new Object[]{iArr3}, -1375864721, 1375864733, (int) System.currentTimeMillis());
                int i19 = f53561c + 73;
                f53562d = i19 % 128;
                int i110 = i19 % 2;
            }
        }
        int i20 = f53561c + 119;
        f53562d = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = 93 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0041 A[PHI: r13
      0x0041: PHI (r13v4 long) = (r13v3 long), (r13v15 long) binds: [B:8:0x003f, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ void h(Object[] objArr) {
        long j10;
        int[] iArr = (int[]) objArr[0];
        int i10 = f53562d;
        int i11 = ((i10 & (-108)) | ((~i10) & 107)) + ((i10 & 107) << 1);
        int i12 = i11 % 128;
        f53561c = i12;
        if (i11 % 2 != 0) {
            long j11 = ((long) iArr[1]) - 4294967295L;
            iArr[0] = (int) j11;
            j10 = j11 >> 44;
            if (j10 != 0) {
                long j12 = j10 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j12;
                j10 = j12 >> 32;
                int i13 = ((i12 & 107) - (~(-(-(i12 | 107))))) - 1;
                f53562d = i13 % 128;
                int i14 = i13 % 2;
            }
        } else {
            long j13 = (((long) iArr[0]) & 4294967295L) - 1;
            iArr[0] = (int) j13;
            j10 = j13 >> 32;
            if (j10 != 0) {
                long j14 = j10 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j14;
                j10 = j14 >> 32;
                int i15 = ((i12 & 107) - (~(-(-(i12 | 107))))) - 1;
                f53562d = i15 % 128;
                int i16 = i15 % 2;
            }
        }
        long j15 = (((long) iArr[2]) & 4294967295L) + 1 + j10;
        iArr[2] = (int) j15;
        long j16 = ((((long) iArr[3]) & 4294967295L) - 1) + (j15 >> 32);
        iArr[3] = (int) j16;
        long j17 = j16 >> 32;
        if (j17 != 0) {
            int i17 = (((i12 & (-68)) | ((~i12) & 67)) - (~(-(-((i12 & 67) << 1))))) - 1;
            f53562d = i17 % 128;
            int i18 = i17 % 2;
            long j18 = j17 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j18;
            long j19 = (j18 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j19;
            long j20 = (j19 >> 32) + (((long) iArr[6]) & 4294967295L);
            iArr[6] = (int) j20;
            j17 = j20 >> 32;
            int i19 = i12 + 5;
            f53562d = i19 % 128;
            int i20 = i19 % 2;
        }
        iArr[7] = (int) (((((long) iArr[7]) & 4294967295L) - 1) + j17);
        int i21 = i12 + 19;
        f53562d = i21 % 128;
        if (i21 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void i(Object[] objArr) {
        SecureRandom secureRandom = (SecureRandom) objArr[0];
        int[] iArr = (int[]) objArr[1];
        do {
            setX(new Object[]{secureRandom, iArr}, -2055810373, 2055810376, (int) System.currentTimeMillis());
        } while (((Integer) setX(new Object[]{iArr}, 1470739958, -1470739942, (int) System.currentTimeMillis())).intValue() != 0);
        int i10 = f53561c;
        int i11 = (i10 & (-38)) | ((~i10) & 37);
        int i12 = (i10 & 37) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53562d = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 22 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00bd  */
    public static /* synthetic */ void j(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53561c;
        int i11 = ((i10 | 99) << 1) - (i10 ^ 99);
        f53562d = i11 % 128;
        if (i11 % 2 != 0 ? ((Integer) auy.setOnFocusChangeListener(new Object[]{8, iArr, iArr2}, 1108035559, -1108035515, 8)).intValue() != 0 : ((Integer) auy.setOnFocusChangeListener(new Object[]{0, iArr, iArr2}, 1108035559, -1108035515, 0)).intValue() != 0) {
            setX(new Object[]{iArr2}, -1375864721, 1375864733, (int) System.currentTimeMillis());
            System.currentTimeMillis();
            System.currentTimeMillis();
        } else {
            int i12 = f53562d;
            int i13 = i12 & 61;
            int i14 = (i12 ^ 61) | i13;
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            f53561c = i15 % 128;
            int i16 = i15 % 2;
            if ((iArr2[7] >>> 1) >= Integer.MAX_VALUE) {
                int i17 = i12 & 97;
                int i18 = -(-((i12 ^ 97) | i17));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                f53561c = i19 % 128;
                int i20 = i19 % 2;
                int[] iArr3 = f53559a;
                if (i20 != 0) {
                    int i21 = 74 / 0;
                    if (((Boolean) avf.setX(new Object[]{iArr2, iArr3}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue()) {
                        setX(new Object[]{iArr2}, -1375864721, 1375864733, (int) System.currentTimeMillis());
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                    }
                } else if (!(!((Boolean) avf.setX(new Object[]{iArr2, iArr3}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue())) {
                    setX(new Object[]{iArr2}, -1375864721, 1375864733, (int) System.currentTimeMillis());
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                }
            }
        }
        int i22 = f53561c;
        int i23 = i22 & 77;
        int i24 = (i23 - (~((i22 ^ 77) | i23))) - 1;
        f53562d = i24 % 128;
        if (i24 % 2 == 0) {
            int i25 = 87 / 0;
        }
    }

    public static /* synthetic */ void k(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53562d + 29;
        f53561c = i10 % 128;
        if (i10 % 2 != 0) {
            ((Integer) avf.setX(new Object[]{iArr, iArr2, iArr3}, -854306397, 854306423, (int) System.currentTimeMillis())).intValue();
            throw null;
        }
        if (((Integer) avf.setX(new Object[]{iArr, iArr2, iArr3}, -854306397, 854306423, (int) System.currentTimeMillis())).intValue() != 0) {
            int i11 = f53562d;
            int i12 = (-2) - (((i11 & 82) + (i11 | 82)) ^ (-1));
            f53561c = i12 % 128;
            int i13 = i12 % 2;
            setX(new Object[]{iArr3}, -2064143946, 2064143952, (int) System.currentTimeMillis());
            int i14 = f53561c;
            int i15 = ((i14 ^ 61) - (~((i14 & 61) << 1))) - 1;
            f53562d = i15 % 128;
            int i16 = i15 % 2;
        }
        int i17 = f53562d;
        int i18 = (i17 ^ 19) + ((i17 & 19) << 1);
        f53561c = i18 % 128;
        int i19 = i18 % 2;
    }

    public static void setCompoundDrawableTintBlendMode(int i10, int[] iArr) {
        setX(new Object[]{Integer.valueOf(i10), iArr}, 878708821, -878708813, i10);
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2, int[] iArr3) {
        setX(new Object[]{iArr, iArr2, iArr3}, 1561294226, -1561294226, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(SecureRandom secureRandom, int[] iArr) {
        setX(new Object[]{secureRandom, iArr}, 641649766, -641649752, (int) System.currentTimeMillis());
    }

    public static void setOnLongClickListener(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, 170840950, -170840941, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:43:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:56:0x034e A[PHI: r4 r11
      0x034e: PHI (r4v43 long) = (r4v38 long), (r4v45 long) binds: [B:58:0x0360, B:54:0x034b] A[DONT_GENERATE, DONT_INLINE]
      0x034e: PHI (r11v39 long) = (r11v36 long), (r11v41 long) binds: [B:58:0x0360, B:54:0x034b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0362 A[PHI: r4 r11
      0x0362: PHI (r4v39 long) = (r4v38 long), (r4v45 long) binds: [B:58:0x0360, B:54:0x034b] A[DONT_GENERATE, DONT_INLINE]
      0x0362: PHI (r11v37 long) = (r11v36 long), (r11v41 long) binds: [B:58:0x0360, B:54:0x034b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0434  */
    /* JADX WARN: Code duplicated, block: B:88:0x05d6 A[PHI: r0
      0x05d6: PHI (r0v17 int[]) = (r0v10 int[]), (r0v20 int[]) binds: [B:91:0x05f7, B:87:0x05d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0618  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int[] iArr;
        long j10;
        long j11;
        char c10;
        long j12;
        int i13;
        int i14 = ~i10;
        int i15 = ~(i11 | i12);
        int i16 = (((~(i10 | (~i11))) | (~(i14 | i11))) * 110) + (((~(i10 | i11)) | i15) * 220) + ((i14 | i15) * (-220)) + (i11 * 111) + (i10 * (-109));
        int[] iArr2 = f53559a;
        int i17 = 0;
        switch (i16) {
            case 1:
                BigInteger bigInteger = (BigInteger) objArr[0];
                int i18 = f53561c;
                int i19 = i18 & 77;
                int i20 = (i19 - (~(-(-((i18 ^ 77) | i19))))) - 1;
                f53562d = i20 % 128;
                if (i20 % 2 == 0) {
                    iArr = (int[]) avf.setX(new Object[]{bigInteger}, -1818387099, 1818387099, (int) System.currentTimeMillis());
                    if (iArr[90] % 1 >= Integer.MAX_VALUE) {
                        if (((Boolean) avf.setX(new Object[]{iArr, iArr2}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue()) {
                            int i21 = f53561c;
                            int i22 = (-2) - (((i21 ^ 98) + ((i21 & 98) << 1)) ^ (-1));
                            f53562d = i22 % 128;
                            int i23 = i22 % 2;
                            ((Integer) avf.setX(new Object[]{iArr2, iArr}, 1877956622, -1877956593, (int) System.currentTimeMillis())).intValue();
                            int i24 = f53562d;
                            int i25 = (i24 & 35) + (i24 | 35);
                            f53561c = i25 % 128;
                            int i26 = i25 % 2;
                        }
                    }
                } else {
                    iArr = (int[]) avf.setX(new Object[]{bigInteger}, -1818387099, 1818387099, (int) System.currentTimeMillis());
                    if ((iArr[7] >>> 1) >= Integer.MAX_VALUE) {
                        if (((Boolean) avf.setX(new Object[]{iArr, iArr2}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue()) {
                            int i27 = f53561c;
                            int i28 = (-2) - (((i27 ^ 98) + ((i27 & 98) << 1)) ^ (-1));
                            f53562d = i28 % 128;
                            int i29 = i28 % 2;
                            ((Integer) avf.setX(new Object[]{iArr2, iArr}, 1877956622, -1877956593, (int) System.currentTimeMillis())).intValue();
                            int i210 = f53562d;
                            int i211 = (i210 & 35) + (i210 | 35);
                            f53561c = i211 % 128;
                            int i212 = i211 % 2;
                        }
                    }
                }
                int[] iArr3 = iArr;
                int i30 = f53562d;
                int i31 = ((i30 | 78) << 1) - (i30 ^ 78);
                int i32 = (i31 ^ (-1)) + (i31 << 1);
                f53561c = i32 % 128;
                int i33 = i32 % 2;
                return iArr3;
            case 2:
                int[] iArr4 = (int[]) objArr[0];
                int[] iArr5 = (int[]) objArr[1];
                int i34 = f53561c;
                int i35 = i34 & 35;
                int i36 = (i35 - (~(-(-((i34 ^ 35) | i35))))) - 1;
                f53562d = i36 % 128;
                int i37 = i36 % 2;
                long j13 = ((long) iArr4[8]) & 4294967295L;
                long j14 = ((long) iArr4[9]) & 4294967295L;
                long j15 = ((long) iArr4[10]) & 4294967295L;
                long j16 = ((long) iArr4[11]) & 4294967295L;
                long j17 = ((long) iArr4[12]) & 4294967295L;
                long j18 = ((long) iArr4[13]) & 4294967295L;
                long j19 = ((long) iArr4[14]) & 4294967295L;
                long j20 = ((long) iArr4[15]) & 4294967295L;
                long j21 = j15 + j16;
                long j22 = j18 + j19;
                long j23 = j22 + (j20 << 1);
                long j24 = j13 + j14 + j22;
                long j25 = j21 + j17 + j20 + j24;
                long j26 = (((long) iArr4[0]) & 4294967295L) + j25 + j18 + j19 + j20;
                iArr5[0] = (int) j26;
                long j27 = (((((long) iArr4[1]) & 4294967295L) + j25) - j13) + j19 + j20 + (j26 >> 32);
                iArr5[1] = (int) j27;
                long j28 = ((((long) iArr4[2]) & 4294967295L) - j24) + (j27 >> 32);
                iArr5[2] = (int) j28;
                long j29 = ((((((long) iArr4[3]) & 4294967295L) + j25) - j14) - j15) + j18 + (j28 >> 32);
                iArr5[3] = (int) j29;
                long j30 = ((((((long) iArr4[4]) & 4294967295L) + j25) - j21) - j13) + j19 + (j29 >> 32);
                iArr5[4] = (int) j30;
                long j31 = (((long) iArr4[5]) & 4294967295L) + j23 + j15 + (j30 >> 32);
                iArr5[5] = (int) j31;
                long j32 = (((long) iArr4[6]) & 4294967295L) + j16 + j19 + j20 + (j31 >> 32);
                iArr5[6] = (int) j32;
                long j33 = (((long) iArr4[7]) & 4294967295L) + j25 + j23 + j17 + (j32 >> 32);
                iArr5[7] = (int) j33;
                int i38 = (int) (j33 >> 32);
                setX(new Object[]{Integer.valueOf(i38), iArr5}, 878708821, -878708813, i38);
                int i39 = f53561c;
                int i40 = i39 & 51;
                int i41 = ((i39 | 51) & (~i40)) + (i40 << 1);
                f53562d = i41 % 128;
                int i42 = i41 % 2;
                return null;
            case 3:
                d(objArr);
                return null;
            case 4:
                j(objArr);
                return null;
            case 5:
                c(objArr);
                return null;
            case 6:
                h(objArr);
                return null;
            case 7:
                f(objArr);
                return null;
            case 8:
                int iIntValue = ((Number) objArr[0]).intValue();
                int[] iArr6 = (int[]) objArr[1];
                int i43 = f53561c;
                int i44 = i43 & 119;
                int i45 = (i43 ^ 119) | i44;
                int i46 = ((i44 | i45) << 1) - (i44 ^ i45);
                f53562d = i46 % 128;
                if (i46 % 2 != 0 ? iIntValue == 0 : iIntValue == 0) {
                    j12 = 0;
                } else {
                    int i47 = ((i43 & 54) + (i43 | 54)) - 1;
                    int i48 = i47 % 128;
                    f53562d = i48;
                    if (i47 % 2 == 0) {
                        j10 = ((long) iIntValue) ^ 4294967295L;
                        long j34 = 0 / ((((long) iArr6[1]) * 4294967295L) + j10);
                        iArr6[0] = (int) j34;
                        j11 = j34 >>> 122;
                        if (j11 != 1) {
                            long j35 = j11 + (((long) iArr6[1]) & 4294967295L);
                            iArr6[1] = (int) j35;
                            j11 = j35 >> 32;
                            int i49 = (i48 & (-50)) | ((~i48) & 49);
                            int i50 = -(-((i48 & 49) << 1));
                            int i51 = (i49 ^ i50) + ((i49 & i50) << 1);
                            f53561c = i51 % 128;
                            c10 = 2;
                            int i52 = i51 % 2;
                        } else {
                            c10 = 2;
                        }
                    } else {
                        j10 = ((long) iIntValue) & 4294967295L;
                        long j36 = (((long) iArr6[0]) & 4294967295L) + j10;
                        iArr6[0] = (int) j36;
                        j11 = j36 >> 32;
                        if (j11 != 0) {
                            long j37 = j11 + (((long) iArr6[1]) & 4294967295L);
                            iArr6[1] = (int) j37;
                            j11 = j37 >> 32;
                            int i410 = (i48 & (-50)) | ((~i48) & 49);
                            int i53 = -(-((i48 & 49) << 1));
                            int i54 = (i410 ^ i53) + ((i410 & i53) << 1);
                            f53561c = i54 % 128;
                            c10 = 2;
                            int i55 = i54 % 2;
                        } else {
                            c10 = 2;
                        }
                    }
                    long j38 = ((((long) iArr6[c10]) & 4294967295L) - j10) + j11;
                    iArr6[c10] = (int) j38;
                    long j39 = (((long) iArr6[3]) & 4294967295L) + j10 + (j38 >> 32);
                    iArr6[3] = (int) j39;
                    long j40 = j39 >> 32;
                    if (j40 != 0) {
                        int i56 = f53561c;
                        int i57 = (i56 & 77) + (i56 | 77);
                        int i58 = i57 % 128;
                        f53562d = i58;
                        int i59 = i57 % 2;
                        long j41 = j40 + (((long) iArr6[4]) & 4294967295L);
                        iArr6[4] = (int) j41;
                        long j42 = (j41 >> 32) + (((long) iArr6[5]) & 4294967295L);
                        iArr6[5] = (int) j42;
                        long j43 = (j42 >> 32) + (((long) iArr6[6]) & 4294967295L);
                        iArr6[6] = (int) j43;
                        j40 = j43 >> 32;
                        int i60 = ((i58 | 91) << 1) - (i58 ^ 91);
                        f53561c = i60 % 128;
                        int i61 = i60 % 2;
                    }
                    long j44 = (((long) iArr6[7]) & 4294967295L) + j10 + j40;
                    iArr6[7] = (int) j44;
                    j12 = j44 >> 32;
                    int i62 = f53561c + 21;
                    f53562d = i62 % 128;
                    int i63 = i62 % 2;
                }
                if (j12 == 0) {
                    int i64 = f53562d;
                    int i65 = i64 ^ 59;
                    int i66 = (i64 & 59) << 1;
                    int i67 = (i65 & i66) + (i65 | i66);
                    f53561c = i67 % 128;
                    int i68 = i67 % 2;
                    if ((iArr6[7] >>> 1) >= Integer.MAX_VALUE) {
                        int i69 = i64 + 47;
                        f53561c = i69 % 128;
                        int i70 = i69 % 2;
                        if (((Boolean) avf.setX(new Object[]{iArr6, iArr2}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue()) {
                            setX(new Object[]{iArr6}, -1375864721, 1375864733, (int) System.currentTimeMillis());
                            int i71 = f53561c;
                            int i72 = ((i71 | 111) << 1) - (i71 ^ 111);
                            f53562d = i72 % 128;
                            int i73 = i72 % 2;
                        }
                    }
                } else {
                    setX(new Object[]{iArr6}, -1375864721, 1375864733, (int) System.currentTimeMillis());
                    int i74 = f53561c;
                    int i75 = ((i74 | 111) << 1) - (i74 ^ 111);
                    f53562d = i75 % 128;
                    int i76 = i75 % 2;
                }
                int i77 = f53561c;
                int i78 = i77 & 7;
                int i79 = -(-((i77 ^ 7) | i78));
                int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
                f53562d = i80 % 128;
                int i81 = i80 % 2;
                return null;
            case 9:
                int[] iArr7 = (int[]) objArr[0];
                int[] iArr8 = (int[]) objArr[1];
                int i82 = f53561c;
                int i83 = (((i82 | 34) << 1) - (i82 ^ 34)) - 1;
                f53562d = i83 % 128;
                int i84 = i83 % 2;
                if (((Integer) auy.setOnFocusChangeListener(new Object[]{8, iArr7, 0, iArr8}, -1008052683, 1008052691, 8)).intValue() == 0) {
                    int i85 = f53561c;
                    int i86 = ((i85 ^ 117) - (~(-(-((i85 & 117) << 1))))) - 1;
                    f53562d = i86 % 128;
                    if (i86 % 2 != 0 ? (iArr8[7] >>> 1) >= Integer.MAX_VALUE : iArr8[103] >= Integer.MAX_VALUE) {
                        if (!(!((Boolean) avf.setX(new Object[]{iArr8, iArr2}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue())) {
                            setX(new Object[]{iArr8}, -1375864721, 1375864733, (int) System.currentTimeMillis());
                            int i87 = f53562d + 117;
                            f53561c = i87 % 128;
                            int i88 = i87 % 2;
                        }
                    }
                } else {
                    setX(new Object[]{iArr8}, -1375864721, 1375864733, (int) System.currentTimeMillis());
                    int i89 = f53562d + 117;
                    f53561c = i89 % 128;
                    int i810 = i89 % 2;
                }
                int i90 = f53561c;
                int i91 = i90 & 25;
                int i92 = ((i90 | 25) & (~i91)) + (i91 << 1);
                f53562d = i92 % 128;
                int i93 = i92 % 2;
                return null;
            case 10:
                g(objArr);
                return null;
            case 11:
                e(objArr);
                return null;
            case 12:
                int[] iArr9 = (int[]) objArr[0];
                int i94 = f53561c;
                int i95 = i94 & 9;
                int i96 = -(-(i94 | 9));
                int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
                int i98 = i97 % 128;
                f53562d = i98;
                int i99 = i97 % 2;
                long j45 = (((long) iArr9[0]) & 4294967295L) + 1;
                iArr9[0] = (int) j45;
                long j46 = j45 >> 32;
                if (j46 != 0) {
                    int i100 = i98 & 97;
                    int i101 = i100 + ((i98 ^ 97) | i100);
                    int i102 = i101 % 128;
                    f53561c = i102;
                    int i103 = i101 % 2;
                    long j47 = j46 + (((long) iArr9[1]) & 4294967295L);
                    iArr9[1] = (int) j47;
                    j46 = j47 >> 32;
                    int i104 = i102 & 1;
                    int i105 = (i102 ^ 1) | i104;
                    int i106 = ((i104 | i105) << 1) - (i105 ^ i104);
                    f53562d = i106 % 128;
                    int i107 = i106 % 2;
                }
                long j48 = ((((long) iArr9[2]) & 4294967295L) - 1) + j46;
                iArr9[2] = (int) j48;
                long j49 = (((long) iArr9[3]) & 4294967295L) + 1 + (j48 >> 32);
                iArr9[3] = (int) j49;
                long j50 = j49 >> 32;
                if (j50 != 0) {
                    int i108 = f53561c;
                    int i109 = i108 & 59;
                    int i110 = -(-((i108 ^ 59) | i109));
                    int i111 = (i109 & i110) + (i110 | i109);
                    int i112 = i111 % 128;
                    f53562d = i112;
                    int i113 = i111 % 2;
                    long j51 = j50 + (((long) iArr9[4]) & 4294967295L);
                    iArr9[4] = (int) j51;
                    long j52 = (j51 >> 32) + (((long) iArr9[5]) & 4294967295L);
                    iArr9[5] = (int) j52;
                    long j53 = (j52 >> 32) + (((long) iArr9[6]) & 4294967295L);
                    iArr9[6] = (int) j53;
                    j50 = j53 >> 32;
                    int i114 = i112 & 11;
                    int i115 = -(-((i112 ^ 11) | i114));
                    int i116 = ((i114 | i115) << 1) - (i115 ^ i114);
                    f53561c = i116 % 128;
                    int i117 = i116 % 2;
                }
                iArr9[7] = (int) ((((long) iArr9[7]) & 4294967295L) + 1 + j50);
                int i118 = f53561c;
                int i119 = (i118 ^ 65) + ((i118 & 65) << 1);
                f53562d = i119 % 128;
                int i120 = i119 % 2;
                return null;
            case 13:
                int[] iArr10 = (int[]) objArr[0];
                int[] iArr11 = (int[]) objArr[1];
                int i121 = f53561c;
                int i122 = ((i121 | 45) << 1) - (i121 ^ 45);
                f53562d = i122 % 128;
                if (i122 % 2 != 0 ? ((Integer) setX(new Object[]{iArr10}, 1470739958, -1470739942, (int) System.currentTimeMillis())).intValue() == 0 : ((Integer) setX(new Object[]{iArr10}, 1470739958, -1470739942, (int) System.currentTimeMillis())).intValue() == 0) {
                    ((Integer) avf.setX(new Object[]{iArr2, iArr10, iArr11}, -854306397, 854306423, (int) System.currentTimeMillis())).intValue();
                    int i123 = f53562d;
                    int i124 = ((i123 ^ 7) | (i123 & 7)) << 1;
                    int i125 = -((7 & (~i123)) | (i123 & (-8)));
                    i13 = (i124 & i125) + (i125 | i124);
                    f53561c = i13 % 128;
                } else {
                    int i126 = f53561c;
                    int i127 = i126 & 75;
                    int i128 = (i127 - (~((i126 ^ 75) | i127))) - 1;
                    f53562d = i128 % 128;
                    int i129 = i128 % 2;
                    ((Integer) avf.setX(new Object[]{iArr2, iArr2, iArr11}, -854306397, 854306423, (int) System.currentTimeMillis())).intValue();
                    int i130 = f53561c;
                    int i131 = (i130 & (-16)) | ((~i130) & 15);
                    int i132 = -(-((i130 & 15) << 1));
                    i13 = (i131 & i132) + (i132 | i131);
                    f53562d = i13 % 128;
                }
                int i133 = i13 % 2;
                return null;
            case 14:
                i(objArr);
                return null;
            case 15:
                a(objArr);
                return null;
            case 16:
                int[] iArr12 = (int[]) objArr[0];
                int i134 = f53562d;
                int i135 = i134 + 53;
                f53561c = i135 % 128;
                int i136 = i135 % 2;
                int i137 = (i134 ^ 65) + ((i134 & 65) << 1);
                f53561c = i137 % 128;
                int i138 = i137 % 2;
                int i139 = 0;
                while (i139 < 8) {
                    int i140 = f53561c;
                    int i141 = (((i140 & (-76)) | ((~i140) & 75)) - (~(-(-((i140 & 75) << 1))))) - 1;
                    f53562d = i141 % 128;
                    int i142 = i141 % 2;
                    int i143 = iArr12[i139];
                    int i144 = i17 & i143;
                    i17 = ((i17 | i143) & (~i144)) | i144;
                    int i145 = ((i139 ^ (-19)) | (i139 & (-19))) << 1;
                    int i146 = -(((~i139) & (-19)) | (i139 & 18));
                    int i147 = ((i145 | i146) << 1) - (i146 ^ i145);
                    int i148 = i147 & 20;
                    i139 = (i148 << 1) + ((~i148) & (i147 | 20));
                    int i149 = (i140 & 73) + (i140 | 73);
                    f53562d = i149 % 128;
                    int i150 = i149 % 2;
                }
                int i151 = i17 >>> 1;
                int i152 = i17 & 1;
                int i153 = (((i151 & i152) | (i151 ^ i152)) - 1) >> 31;
                int i154 = f53562d;
                int i155 = i154 ^ 109;
                int i156 = (((i154 & 109) | i155) << 1) - i155;
                f53561c = i156 % 128;
                int i157 = i156 % 2;
                return Integer.valueOf(i153);
            case 17:
                b(objArr);
                return null;
            default:
                k(objArr);
                return null;
        }
    }

    public static void setY(int[] iArr, int i10, int[] iArr2) {
        setX(new Object[]{iArr, Integer.valueOf(i10), iArr2}, -453831595, 453831606, i10);
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2, int[] iArr3) {
        setX(new Object[]{iArr, iArr2, iArr3}, -148253694, 148253701, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, 171882311, -171882296, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, -1165991312, 1165991325, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, -1800460062, 1800460064, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, -1984289514, 1984289531, (int) System.currentTimeMillis());
    }

    public static void setY(int[] iArr, int[] iArr2, int[] iArr3) {
        setX(new Object[]{iArr, iArr2, iArr3}, -1040559401, 1040559406, (int) System.currentTimeMillis());
    }

    public static int[] setCompoundDrawableTintBlendMode(BigInteger bigInteger) {
        return (int[]) setX(new Object[]{bigInteger}, 1792036173, -1792036172, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, -2065004979, 2065004983, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2, int[] iArr3) {
        setX(new Object[]{iArr, iArr2, iArr3}, 1656767316, -1656767306, (int) System.currentTimeMillis());
    }
}
