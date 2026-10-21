package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class aqn extends apk.setDividerPadding {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53604c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53605d = 1;
    public static final BigInteger setNavigationOnClickListener = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"}, -666540625, 666540626, (int) System.currentTimeMillis()));
    protected int[] setLayoutAnimation;

    static {
        int i10 = f53605d;
        int i11 = ((i10 ^ 49) | (i10 & 49)) << 1;
        int i12 = -(((~i10) & 49) | (i10 & (-50)));
        int i13 = (i11 & i12) + (i12 | i11);
        f53604c = i13 % 128;
        int i14 = i13 % 2;
    }

    public aqn(int[] iArr) {
        this.setLayoutAnimation = iArr;
    }

    public static /* synthetic */ aqn a(Object[] objArr) {
        aqn aqnVar = (aqn) objArr[0];
        apk apkVar = (apk) objArr[1];
        int[] iArr = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
        aqm.setDividerPadding(new Object[]{((aqn) apkVar).setLayoutAnimation, iArr}, 2048711234, -2048711226, (int) System.currentTimeMillis());
        aqm.setDividerPadding(new Object[]{iArr, aqnVar.setLayoutAnimation, iArr}, 1881006800, -1881006800, (int) System.currentTimeMillis());
        aqn aqnVar2 = new aqn(iArr);
        int i10 = f53604c;
        int i11 = i10 & 25;
        int i12 = (i10 ^ 25) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53605d = i13 % 128;
        if (i13 % 2 != 0) {
            return aqnVar2;
        }
        throw null;
    }

    public static /* synthetic */ Boolean b(Object[] objArr) {
        aqn aqnVar = (aqn) objArr[0];
        int i10 = f53605d;
        int i11 = i10 ^ 15;
        int i12 = ((i10 & 15) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 & i13) + (i12 | i13);
        f53604c = i14 % 128;
        int i15 = i14 % 2;
        boolean zBooleanValue = ((Boolean) auz.setDividerPadding(new Object[]{aqnVar.setLayoutAnimation}, 1960671435, -1960671419, (int) System.currentTimeMillis())).booleanValue();
        int i16 = f53605d;
        int i17 = i16 & 117;
        int i18 = ((((i16 ^ 117) | i17) << 1) - (~(-((i16 | 117) & (~i17))))) - 1;
        f53604c = i18 % 128;
        if (i18 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    public static /* synthetic */ BigInteger c(Object[] objArr) {
        aqn aqnVar = (aqn) objArr[0];
        int i10 = f53604c;
        int i11 = i10 & 61;
        int i12 = (i10 ^ 61) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        f53605d = i13 % 128;
        int i14 = i13 % 2;
        BigInteger bigInteger = (BigInteger) auz.setDividerPadding(new Object[]{aqnVar.setLayoutAnimation}, -1221353937, 1221353950, (int) System.currentTimeMillis());
        int i15 = f53604c;
        int i16 = i15 & 121;
        int i17 = (i15 ^ 121) | i16;
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        f53605d = i18 % 128;
        if (i18 % 2 != 0) {
            return bigInteger;
        }
        throw null;
    }

    public static /* synthetic */ aqn d(Object[] objArr) {
        aqn aqnVar = (aqn) objArr[0];
        int[] iArr = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
        aqm.setDividerPadding(new Object[]{aqnVar.setLayoutAnimation, iArr}, -1058820036, 1058820048, (int) System.currentTimeMillis());
        aqn aqnVar2 = new aqn(iArr);
        int i10 = f53605d + 85;
        f53604c = i10 % 128;
        if (i10 % 2 == 0) {
            return aqnVar2;
        }
        throw null;
    }

    public static /* synthetic */ aqn e(Object[] objArr) {
        aqn aqnVar = (aqn) objArr[0];
        int[] iArr = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
        aqm.setDividerPadding(new Object[]{aqnVar.setLayoutAnimation, iArr}, 2048711234, -2048711226, (int) System.currentTimeMillis());
        aqn aqnVar2 = new aqn(iArr);
        int i10 = (-2) - ((f53605d + 4) ^ (-1));
        f53604c = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 33 / 0;
        }
        return aqnVar2;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:61:0x055f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0576  */
    /* JADX WARN: Code duplicated, block: B:63:0x0585  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        aqn aqnVar;
        aqn aqnVar2;
        int[] iArr;
        int[] iArr2;
        int iIntValue;
        int i13 = ~i10;
        int i14 = (((~(i13 | i11)) | (~(i13 | i12))) * (-283)) + (i11 * (-282)) + (i10 * 284);
        int i15 = ~i11;
        switch (((~(i15 | i13 | i12)) * 283) + ((~(i10 | i15)) * 283) + i14) {
            case 1:
                return e(objArr);
            case 2:
                return d(objArr);
            case 3:
                aqn aqnVar3 = (aqn) objArr[0];
                int i16 = f53605d;
                int i17 = i16 & 69;
                int i18 = (i16 | 69) & (~i17);
                int i19 = -(-(i17 << 1));
                int i20 = (i18 & i19) + (i18 | i19);
                f53604c = i20 % 128;
                int i21 = i20 % 2;
                boolean zBooleanValue = ((Boolean) auz.setDividerPadding(new Object[]{aqnVar3.setLayoutAnimation}, -1357517306, 1357517307, (int) System.currentTimeMillis())).booleanValue();
                int i22 = f53605d;
                int i23 = i22 & 87;
                int i24 = (i22 ^ 87) | i23;
                int i25 = (i23 & i24) + (i24 | i23);
                f53604c = i25 % 128;
                int i26 = i25 % 2;
                return Boolean.valueOf(zBooleanValue);
            case 4:
                return c(objArr);
            case 5:
                return a(objArr);
            case 6:
                aqn aqnVar4 = (aqn) objArr[0];
                apk apkVar = (apk) objArr[1];
                int[] iArr3 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                aqm.setDividerPadding(new Object[]{aqnVar4.setLayoutAnimation, ((aqn) apkVar).setLayoutAnimation, iArr3}, -420062112, 420062117, (int) System.currentTimeMillis());
                aqnVar = new aqn(iArr3);
                int i27 = f53605d;
                int i28 = (i27 & 83) + (i27 | 83);
                f53604c = i28 % 128;
                if (i28 % 2 != 0) {
                    throw null;
                }
                break;
            case 7:
                aqn aqnVar5 = (aqn) objArr[0];
                int[] iArr4 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                aqm.setDividerPadding(new Object[]{aqnVar5.setLayoutAnimation, iArr4}, 113776561, -113776554, (int) System.currentTimeMillis());
                aqnVar = new aqn(iArr4);
                int i29 = f53605d;
                int i30 = (i29 & (-42)) | ((~i29) & 41);
                int i31 = -(-((i29 & 41) << 1));
                int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                f53604c = i32 % 128;
                int i33 = i32 % 2;
                break;
            case 8:
                return b(objArr);
            case 9:
                aqn aqnVar6 = (aqn) objArr[0];
                int i34 = f53604c + 41;
                f53605d = i34 % 128;
                if (i34 % 2 == 0) {
                    ((Boolean) auz.setDividerPadding(new Object[]{aqnVar6.setLayoutAnimation}, 1960671435, -1960671419, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                int[] iArr5 = aqnVar6.setLayoutAnimation;
                if (((Boolean) auz.setDividerPadding(new Object[]{iArr5}, 1960671435, -1960671419, (int) System.currentTimeMillis())).booleanValue()) {
                    int i35 = f53605d + 21;
                    f53604c = i35 % 128;
                    int i36 = i35 % 2;
                    aqnVar2 = aqnVar6;
                } else {
                    int i37 = f53604c;
                    int i38 = i37 & 17;
                    int i39 = i37 | 17;
                    int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                    f53605d = i40 % 128;
                    Object[] objArr2 = new Object[1];
                    if (i40 % 2 == 0) {
                        objArr2[0] = iArr5;
                        int i41 = 67 / 0;
                        if (!((Boolean) auz.setDividerPadding(objArr2, -1357517306, 1357517307, (int) System.currentTimeMillis())).booleanValue()) {
                            iArr = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr5, iArr}, -990119338, 990119342, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr, iArr5, iArr}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                            iArr2 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr, 2, iArr2}, 1187512982, -1187512972, 2);
                            aqm.setDividerPadding(new Object[]{iArr2, iArr, iArr2}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr2, 4, iArr}, 1187512982, -1187512972, 4);
                            aqm.setDividerPadding(new Object[]{iArr, iArr2, iArr}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr, 8, iArr2}, 1187512982, -1187512972, 8);
                            aqm.setDividerPadding(new Object[]{iArr2, iArr, iArr2}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr2, 16, iArr}, 1187512982, -1187512972, 16);
                            aqm.setDividerPadding(new Object[]{iArr, iArr2, iArr}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr, 32, iArr2}, 1187512982, -1187512972, 32);
                            aqm.setDividerPadding(new Object[]{iArr2, iArr, iArr2}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr2, 64, iArr}, 1187512982, -1187512972, 64);
                            aqm.setDividerPadding(new Object[]{iArr, iArr2, iArr}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr, iArr2}, -990119338, 990119342, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr2, iArr5, iArr2}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr2, 29, iArr2}, 1187512982, -1187512972, 29);
                            aqm.setDividerPadding(new Object[]{iArr2, iArr}, -990119338, 990119342, (int) System.currentTimeMillis());
                            if (((Boolean) auz.setDividerPadding(new Object[]{iArr5, iArr}, -1508801311, 1508801320, (int) System.currentTimeMillis())).booleanValue()) {
                                aqnVar2 = new aqn(iArr2);
                                int i42 = f53604c;
                                int i43 = i42 & 111;
                                int i44 = (i43 - (~(-(-((i42 ^ 111) | i43))))) - 1;
                                f53605d = i44 % 128;
                                int i45 = i44 % 2;
                            } else {
                                int i46 = (-2) - ((f53605d + 64) ^ (-1));
                                f53604c = i46 % 128;
                                int i47 = i46 % 2;
                                aqnVar2 = null;
                            }
                        } else {
                            int i310 = f53605d + 21;
                            f53604c = i310 % 128;
                            int i311 = i310 % 2;
                            aqnVar2 = aqnVar6;
                        }
                    } else {
                        objArr2[0] = iArr5;
                        if (((Boolean) auz.setDividerPadding(objArr2, -1357517306, 1357517307, (int) System.currentTimeMillis())).booleanValue()) {
                            int i312 = f53605d + 21;
                            f53604c = i312 % 128;
                            int i313 = i312 % 2;
                            aqnVar2 = aqnVar6;
                        } else {
                            iArr = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr5, iArr}, -990119338, 990119342, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr, iArr5, iArr}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                            iArr2 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr, 2, iArr2}, 1187512982, -1187512972, 2);
                            aqm.setDividerPadding(new Object[]{iArr2, iArr, iArr2}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr2, 4, iArr}, 1187512982, -1187512972, 4);
                            aqm.setDividerPadding(new Object[]{iArr, iArr2, iArr}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr, 8, iArr2}, 1187512982, -1187512972, 8);
                            aqm.setDividerPadding(new Object[]{iArr2, iArr, iArr2}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr2, 16, iArr}, 1187512982, -1187512972, 16);
                            aqm.setDividerPadding(new Object[]{iArr, iArr2, iArr}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr, 32, iArr2}, 1187512982, -1187512972, 32);
                            aqm.setDividerPadding(new Object[]{iArr2, iArr, iArr2}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr2, 64, iArr}, 1187512982, -1187512972, 64);
                            aqm.setDividerPadding(new Object[]{iArr, iArr2, iArr}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr, iArr2}, -990119338, 990119342, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr2, iArr5, iArr2}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                            aqm.setDividerPadding(new Object[]{iArr2, 29, iArr2}, 1187512982, -1187512972, 29);
                            aqm.setDividerPadding(new Object[]{iArr2, iArr}, -990119338, 990119342, (int) System.currentTimeMillis());
                            if (((Boolean) auz.setDividerPadding(new Object[]{iArr5, iArr}, -1508801311, 1508801320, (int) System.currentTimeMillis())).booleanValue()) {
                                aqnVar2 = new aqn(iArr2);
                                int i48 = f53604c;
                                int i49 = i48 & 111;
                                int i410 = (i49 - (~(-(-((i48 ^ 111) | i49))))) - 1;
                                f53605d = i410 % 128;
                                int i411 = i410 % 2;
                            } else {
                                int i412 = (-2) - ((f53605d + 64) ^ (-1));
                                f53604c = i412 % 128;
                                int i413 = i412 % 2;
                                aqnVar2 = null;
                            }
                        }
                    }
                }
                return aqnVar2;
            case 10:
                aqn aqnVar7 = (aqn) objArr[0];
                Object obj = objArr[1];
                int i50 = f53605d;
                int i51 = ((((i50 ^ 117) | (i50 & 117)) << 1) - (~(-((i50 & (-118)) | ((~i50) & 117))))) - 1;
                int i52 = i51 % 128;
                f53604c = i52;
                if (i51 % 2 != 0) {
                    throw null;
                }
                if (obj == aqnVar7) {
                    int i53 = i52 & 89;
                    int i54 = (~i53) & (i52 | 89);
                    int i55 = i53 << 1;
                    int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                    f53605d = i56 % 128;
                    int i57 = i56 % 2;
                    return Boolean.TRUE;
                }
                if (obj instanceof aqn) {
                    boolean zBooleanValue2 = ((Boolean) auz.setDividerPadding(new Object[]{aqnVar7.setLayoutAnimation, ((aqn) obj).setLayoutAnimation}, -1508801311, 1508801320, (int) System.currentTimeMillis())).booleanValue();
                    int i58 = f53604c + 39;
                    f53605d = i58 % 128;
                    if (i58 % 2 == 0) {
                        int i59 = 23 / 0;
                    }
                    return Boolean.valueOf(zBooleanValue2);
                }
                int i60 = i50 & 1;
                int i61 = (~i60) & (i50 | 1);
                int i62 = -(-(i60 << 1));
                int i63 = (i61 & i62) + (i62 | i61);
                f53604c = i63 % 128;
                int i64 = i63 % 2;
                return Boolean.FALSE;
            case 11:
                aqn aqnVar8 = (aqn) objArr[0];
                apk apkVar2 = (apk) objArr[1];
                int[] iArr6 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                aqm.setDividerPadding(new Object[]{aqnVar8.setLayoutAnimation, ((aqn) apkVar2).setLayoutAnimation, iArr6}, 404134666, -404134655, (int) System.currentTimeMillis());
                aqnVar = new aqn(iArr6);
                int i65 = f53604c;
                int i66 = (i65 ^ 89) + ((i65 & 89) << 1);
                f53605d = i66 % 128;
                int i67 = i66 % 2;
                break;
            case 12:
                int i68 = f53604c;
                int i69 = ((i68 & 99) - (~(-(-(i68 | 99))))) - 1;
                f53605d = i69 % 128;
                if (i69 % 2 == 0) {
                    setNavigationOnClickListener.bitLength();
                    throw null;
                }
                int iBitLength = setNavigationOnClickListener.bitLength();
                int i70 = f53604c;
                int i71 = i70 & 33;
                int i72 = (i70 | 33) & (~i71);
                int i73 = i71 << 1;
                int i74 = (i72 & i73) + (i72 | i73);
                f53605d = i74 % 128;
                int i75 = i74 % 2;
                return Integer.valueOf(iBitLength);
            case 13:
                aqn aqnVar9 = (aqn) objArr[0];
                int i76 = f53604c;
                int i77 = i76 ^ 25;
                int i78 = ((i76 & 25) | i77) << 1;
                int i79 = -i77;
                int i80 = ((i78 | i79) << 1) - (i78 ^ i79);
                f53605d = i80 % 128;
                int i81 = i80 % 2;
                int[] iArr7 = aqnVar9.setLayoutAnimation;
                if (i81 != 0 ? ((Integer) auz.setDividerPadding(new Object[]{iArr7}, 1594439211, -1594439208, (int) System.currentTimeMillis())).intValue() != 1 : ((Integer) auz.setDividerPadding(new Object[]{iArr7}, 1594439211, -1594439208, (int) System.currentTimeMillis())).intValue() != 0) {
                    int i82 = f53604c;
                    int i83 = i82 & 85;
                    int i84 = -(-((i82 ^ 85) | i83));
                    int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
                    f53605d = i85 % 128;
                    if (i85 % 2 == 0) {
                        int i86 = 71 / 0;
                    }
                    return Boolean.FALSE;
                }
                int i87 = f53605d;
                int i88 = i87 & 109;
                int i89 = (i87 ^ 109) | i88;
                int i90 = ((i88 | i89) << 1) - (i89 ^ i88);
                f53604c = i90 % 128;
                if (i90 % 2 == 0) {
                    return Boolean.TRUE;
                }
                throw null;
            case 14:
                aqn aqnVar10 = (aqn) objArr[0];
                apk apkVar3 = (apk) objArr[1];
                int[] iArr8 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                aqm.setDividerPadding(new Object[]{aqnVar10.setLayoutAnimation, ((aqn) apkVar3).setLayoutAnimation, iArr8}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                aqnVar = new aqn(iArr8);
                int i91 = f53605d;
                int i92 = i91 & 61;
                int i93 = -(-((i91 ^ 61) | i92));
                int i94 = (i92 & i93) + (i93 | i92);
                f53604c = i94 % 128;
                int i95 = i94 % 2;
                break;
            case 15:
                aqn aqnVar11 = (aqn) objArr[0];
                int[] iArr9 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                aqm.setDividerPadding(new Object[]{aqnVar11.setLayoutAnimation, iArr9}, -990119338, 990119342, (int) System.currentTimeMillis());
                aqnVar = new aqn(iArr9);
                int i96 = f53605d;
                int i97 = ((i96 ^ 81) - (~((i96 & 81) << 1))) - 1;
                f53604c = i97 % 128;
                if (i97 % 2 != 0) {
                    throw null;
                }
                break;
            default:
                aqn aqnVar12 = (aqn) objArr[0];
                int iIdentityHashCode = System.identityHashCode(aqnVar12);
                int i98 = ~iIdentityHashCode;
                int i99 = i98 & (-433501908);
                int i100 = (~i99) & (i98 | (-433501908));
                int i101 = ~((i99 & i100) | (i100 ^ i99));
                int i102 = ((i101 & 135279249) | (i101 ^ 135279249)) * (-160);
                int i103 = 172078222 | i102;
                int i104 = (i103 << 1) - ((~(i102 & 172078222)) & i103);
                int i105 = (iIdentityHashCode | i98) & i98;
                int i106 = 205091773 & i105;
                int i107 = ~(((i105 | 205091773) & (~i106)) | i106);
                int i108 = ((~i107) & (-433501908)) | (433501907 & i107);
                int i109 = i107 & (-433501908);
                int i110 = -(~(-(-(((i109 & i108) | (i108 ^ i109)) * 160))));
                int i111 = ((i104 & i110) + (i110 | i104)) - 1;
                int iIdentityHashCode2 = System.identityHashCode(aqnVar12);
                int i112 = ~iIdentityHashCode2;
                int i113 = ~((i112 ^ (-412793583)) | (i112 & (-412793583)));
                int i114 = ((i113 & 1820433982) | (1820433982 ^ i113)) * (-328);
                int i115 = ((((-1710226397) ^ i114) | ((-1710226397) & i114)) << 1) - ((i114 & 1710226396) | ((-1710226397) & (~i114)));
                int i116 = 1820433982 & i112;
                int i117 = ((-1820433983) & iIdentityHashCode2) | i116;
                int i118 = 1820433982 & iIdentityHashCode2;
                int i119 = (((i117 & i118) | (i117 ^ i118)) * 164) + i115;
                int i120 = 412793582 & iIdentityHashCode2;
                int i121 = (iIdentityHashCode2 | 412793582) & (~i120);
                int i122 = ~((i121 & i120) | (i121 ^ i120));
                int i123 = (i122 & 1677788176) | (1677788176 ^ i122);
                int i124 = (i112 | 1820433982) & (~i116);
                int i125 = (i124 & i116) | (i124 ^ i116);
                int i126 = i125 ^ (-412793583);
                int i127 = i125 & (-412793583);
                int i128 = (i127 & i126) | (i126 ^ i127);
                int i129 = ~i128;
                int i130 = (i128 | i129) & i129;
                int i131 = -(-(((i123 & i130) | ((~i130) & i123) | ((~i123) & i130)) * 164));
                if (i111 > (i119 ^ i131) + ((i131 & i119) << 1)) {
                    int iHashCode = setNavigationOnClickListener.hashCode();
                    int iIntValue2 = ((Integer) bek.setOnFocusChangeListener(new Object[]{aqnVar12.setLayoutAnimation, 4}, 1613127163, -1613127143, 4)).intValue();
                    iIntValue = (iIntValue2 & (~iHashCode)) | ((~iIntValue2) & iHashCode);
                } else {
                    iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{aqnVar12.setLayoutAnimation, 5}, 1613127163, -1613127143, 5)).intValue() ^ setNavigationOnClickListener.hashCode();
                }
                int i132 = f53605d;
                int i133 = i132 & 83;
                int i134 = -(-((i132 ^ 83) | i133));
                int i135 = (i133 ^ i134) + ((i134 & i133) << 1);
                f53604c = i135 % 128;
                int i136 = i135 % 2;
                return Integer.valueOf(iIntValue);
        }
        return aqnVar;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, -541071395, 541071405, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean getNavBarTitleString() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -890848911, 890848914, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -1449611361, 1449611361, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -1940076626, 1940076639, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, -1796035172, 1796035186, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setNavigationOnClickListener() {
        return (apk) setDividerPadding(new Object[]{this}, 1324502572, -1324502571, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setOnDragListener() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -41032640, 41032648, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnFocusChangeListener(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, -1211717090, 1211717101, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnLongClickListener() {
        return (apk) setDividerPadding(new Object[]{this}, -584193138, 584193147, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setX() {
        return (apk) setDividerPadding(new Object[]{this}, -885371921, 885371936, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY() {
        return (apk) setDividerPadding(new Object[]{this}, 635683972, -635683965, System.identityHashCode(this));
    }

    public aqn() {
        this.setLayoutAnimation = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setDividerPadding(new Object[]{this}, -1295527197, 1295527201, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final int setOnFocusChangeListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, 1016923991, -1016923979, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, 1343139028, -1343139022, System.identityHashCode(this));
    }

    public aqn(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(setNavigationOnClickListener) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.setLayoutAnimation = (int[]) aqm.setDividerPadding(new Object[]{bigInteger}, -1316932494, 1316932500, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, -1721837997, 1721838002, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding() {
        return (apk) setDividerPadding(new Object[]{this}, 1992584274, -1992584272, System.identityHashCode(this));
    }
}
