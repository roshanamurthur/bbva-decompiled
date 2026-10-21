package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class apz extends apk.setDividerPadding {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53557d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f53558e = 1;
    protected int[] setNavigationOnClickListener;
    public static final BigInteger setOnLongClickListener = (BigInteger) avf.setX(new Object[]{apw.f53542a}, -651651242, 651651245, (int) System.currentTimeMillis());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f53556c = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};

    static {
        int i10 = f53557d;
        int i11 = i10 & 47;
        int i12 = ((i10 | 47) & (~i11)) + (i11 << 1);
        f53558e = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 59 / 0;
        }
    }

    public apz(int[] iArr) {
        this.setNavigationOnClickListener = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x02c6  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        apz apzVar;
        int i13;
        int iHashCode;
        Object onFocusChangeListener;
        int i14 = ~i10;
        int i15 = ~(i14 | i11);
        int i16 = ~i12;
        int i17 = ((i15 | (~(i16 | i11))) * (-108)) + (i11 * (-107)) + (i10 * 55);
        int i18 = ~(i14 | i12);
        int i19 = ~((~i11) | i10);
        switch (((i19 | i12) * 54) + (((~(i10 | i16)) | i18 | i19) * 54) + i17) {
            case 1:
                apz apzVar2 = (apz) objArr[0];
                apk apkVar = (apk) objArr[1];
                int[] iArr = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                apw.setOnFocusChangeListener(new Object[]{apzVar2.setNavigationOnClickListener, ((apz) apkVar).setNavigationOnClickListener, iArr}, 275338608, -275338593, (int) System.currentTimeMillis());
                apz apzVar3 = new apz(iArr);
                int i20 = f53558e + 23;
                f53557d = i20 % 128;
                if (i20 % 2 == 0) {
                    return apzVar3;
                }
                throw null;
            case 2:
                apz apzVar4 = (apz) objArr[0];
                int i21 = f53557d;
                int i22 = i21 & 59;
                int i23 = (i21 ^ 59) | i22;
                int i24 = (i22 & i23) + (i23 | i22);
                f53558e = i24 % 128;
                int i25 = i24 % 2;
                if (((Integer) avf.setX(new Object[]{apzVar4.setNavigationOnClickListener}, 1932638258, -1932638241, (int) System.currentTimeMillis())).intValue() != 1) {
                    int i26 = f53558e;
                    int i27 = (i26 ^ 83) + ((i26 & 83) << 1);
                    f53557d = i27 % 128;
                    if (i27 % 2 != 0) {
                        int i28 = 39 / 0;
                    }
                    return Boolean.FALSE;
                }
                int i29 = f53557d;
                int i30 = i29 & 91;
                int i31 = (i29 | 91) & (~i30);
                int i32 = -(-(i30 << 1));
                int i33 = (i31 & i32) + (i31 | i32);
                int i34 = i33 % 128;
                f53558e = i34;
                int i35 = i33 % 2;
                int i36 = i34 & 97;
                int i37 = i36 + ((i34 ^ 97) | i36);
                f53557d = i37 % 128;
                if (i37 % 2 == 0) {
                    return Boolean.TRUE;
                }
                throw null;
            case 3:
                apz apzVar5 = (apz) objArr[0];
                int[] iArr2 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                apw.setOnFocusChangeListener(new Object[]{apzVar5.setNavigationOnClickListener, iArr2}, -836784304, 836784304, (int) System.currentTimeMillis());
                apz apzVar6 = new apz(iArr2);
                int i38 = f53558e + 13;
                f53557d = i38 % 128;
                int i39 = i38 % 2;
                return apzVar6;
            case 4:
                apz apzVar7 = (apz) objArr[0];
                int i40 = f53558e;
                int i41 = i40 & 79;
                int i42 = ((i40 ^ 79) | i41) << 1;
                int i43 = -((i40 | 79) & (~i41));
                int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                f53557d = i44 % 128;
                int i45 = i44 % 2;
                boolean zBooleanValue = ((Boolean) avf.setX(new Object[]{apzVar7.setNavigationOnClickListener}, -1194902711, 1194902743, (int) System.currentTimeMillis())).booleanValue();
                int i46 = f53557d;
                int i47 = i46 & 73;
                int i48 = (i46 ^ 73) | i47;
                int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                f53558e = i49 % 128;
                int i50 = i49 % 2;
                return Boolean.valueOf(zBooleanValue);
            case 5:
                apz apzVar8 = (apz) objArr[0];
                int i51 = f53557d;
                int i52 = i51 & 17;
                int i53 = i52 + ((i51 ^ 17) | i52);
                f53558e = i53 % 128;
                int i54 = i53 % 2;
                int[] iArr3 = apzVar8.setNavigationOnClickListener;
                if (i54 != 0) {
                    return (BigInteger) avf.setX(new Object[]{iArr3}, -651651242, 651651245, (int) System.currentTimeMillis());
                }
                throw null;
            case 6:
                apz apzVar9 = (apz) objArr[0];
                apk apkVar2 = (apk) objArr[1];
                int[] iArr4 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                apw.setOnFocusChangeListener(new Object[]{((apz) apkVar2).setNavigationOnClickListener, iArr4}, -836784304, 836784304, (int) System.currentTimeMillis());
                apw.setOnFocusChangeListener(new Object[]{iArr4, apzVar9.setNavigationOnClickListener, iArr4}, -1896380356, 1896380367, (int) System.currentTimeMillis());
                apz apzVar10 = new apz(iArr4);
                int i55 = f53558e + 107;
                f53557d = i55 % 128;
                if (i55 % 2 == 0) {
                    return apzVar10;
                }
                int i56 = 76 / 0;
                return apzVar10;
            case 7:
                apz apzVar11 = (apz) objArr[0];
                int[] iArr5 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                apw.setOnFocusChangeListener(new Object[]{apzVar11.setNavigationOnClickListener, iArr5}, -650561249, 650561261, (int) System.currentTimeMillis());
                apz apzVar12 = new apz(iArr5);
                int i57 = f53558e;
                int i58 = ((i57 ^ 123) | (i57 & 123)) << 1;
                int i59 = -(((~i57) & 123) | (i57 & (-124)));
                int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                f53557d = i60 % 128;
                int i61 = i60 % 2;
                return apzVar12;
            case 8:
                apz apzVar13 = (apz) objArr[0];
                apk apkVar3 = (apk) objArr[1];
                int[] iArr6 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                apw.setOnFocusChangeListener(new Object[]{apzVar13.setNavigationOnClickListener, ((apz) apkVar3).setNavigationOnClickListener, iArr6}, 1022739355, -1022739350, (int) System.currentTimeMillis());
                apz apzVar14 = new apz(iArr6);
                int i62 = f53557d + 55;
                f53558e = i62 % 128;
                int i63 = i62 % 2;
                return apzVar14;
            case 9:
                apz apzVar15 = (apz) objArr[0];
                int i64 = f53557d;
                int i65 = i64 & 19;
                int i66 = -(-((i64 ^ 19) | i65));
                int i67 = ((i65 | i66) << 1) - (i66 ^ i65);
                f53558e = i67 % 128;
                int i68 = i67 % 2;
                int[] iArr7 = apzVar15.setNavigationOnClickListener;
                if (((Boolean) avf.setX(new Object[]{iArr7}, -362565938, 362565959, (int) System.currentTimeMillis())).booleanValue()) {
                    int i69 = f53557d;
                    int i70 = i69 & 117;
                    int i71 = (i69 ^ 117) | i70;
                    int i72 = ((i70 | i71) << 1) - (i71 ^ i70);
                    f53558e = i72 % 128;
                    int i73 = i72 % 2;
                    apzVar = apzVar15;
                } else {
                    int i74 = f53557d;
                    int i75 = i74 & 109;
                    int i76 = ((i74 | 109) & (~i75)) + (i75 << 1);
                    f53558e = i76 % 128;
                    int i77 = i76 % 2;
                    if (((Boolean) avf.setX(new Object[]{iArr7}, -1194902711, 1194902743, (int) System.currentTimeMillis())).booleanValue()) {
                        int i610 = f53557d;
                        int i78 = i610 & 117;
                        int i79 = (i610 ^ 117) | i78;
                        int i710 = ((i78 | i79) << 1) - (i79 ^ i78);
                        f53558e = i710 % 128;
                        int i711 = i710 % 2;
                        apzVar = apzVar15;
                    } else {
                        int[] iArr8 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                        apw.setOnFocusChangeListener(new Object[]{iArr7, iArr8}, -650561249, 650561261, (int) System.currentTimeMillis());
                        apw.setOnFocusChangeListener(new Object[]{iArr8, iArr7, iArr8}, -1896380356, 1896380367, (int) System.currentTimeMillis());
                        apw.setOnFocusChangeListener(new Object[]{iArr8, iArr8}, -650561249, 650561261, (int) System.currentTimeMillis());
                        apw.setOnFocusChangeListener(new Object[]{iArr8, iArr7, iArr8}, -1896380356, 1896380367, (int) System.currentTimeMillis());
                        int[] iArr9 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                        apw.setOnFocusChangeListener(new Object[]{iArr8, iArr9}, -650561249, 650561261, (int) System.currentTimeMillis());
                        apw.setOnFocusChangeListener(new Object[]{iArr9, iArr7, iArr9}, -1896380356, 1896380367, (int) System.currentTimeMillis());
                        int[] iArr10 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                        apw.setOnFocusChangeListener(new Object[]{iArr9, 3, iArr10}, -1060570579, 1060570581, 3);
                        apw.setOnFocusChangeListener(new Object[]{iArr10, iArr8, iArr10}, -1896380356, 1896380367, (int) System.currentTimeMillis());
                        apw.setOnFocusChangeListener(new Object[]{iArr10, 4, iArr8}, -1060570579, 1060570581, 4);
                        apw.setOnFocusChangeListener(new Object[]{iArr8, iArr9, iArr8}, -1896380356, 1896380367, (int) System.currentTimeMillis());
                        apw.setOnFocusChangeListener(new Object[]{iArr8, 4, iArr10}, -1060570579, 1060570581, 4);
                        apw.setOnFocusChangeListener(new Object[]{iArr10, iArr9, iArr10}, -1896380356, 1896380367, (int) System.currentTimeMillis());
                        apw.setOnFocusChangeListener(new Object[]{iArr10, 15, iArr9}, -1060570579, 1060570581, 15);
                        apw.setOnFocusChangeListener(new Object[]{iArr9, iArr10, iArr9}, -1896380356, 1896380367, (int) System.currentTimeMillis());
                        apw.setOnFocusChangeListener(new Object[]{iArr9, 30, iArr10}, -1060570579, 1060570581, 30);
                        apw.setOnFocusChangeListener(new Object[]{iArr10, iArr9, iArr10}, -1896380356, 1896380367, (int) System.currentTimeMillis());
                        apw.setOnFocusChangeListener(new Object[]{iArr10, 60, iArr9}, -1060570579, 1060570581, 60);
                        apw.setOnFocusChangeListener(new Object[]{iArr9, iArr10, iArr9}, -1896380356, 1896380367, (int) System.currentTimeMillis());
                        apw.setOnFocusChangeListener(new Object[]{iArr9, 11, iArr10}, -1060570579, 1060570581, 11);
                        apw.setOnFocusChangeListener(new Object[]{iArr10, iArr8, iArr10}, -1896380356, 1896380367, (int) System.currentTimeMillis());
                        apw.setOnFocusChangeListener(new Object[]{iArr10, 120, iArr8}, -1060570579, 1060570581, 120);
                        apw.setOnFocusChangeListener(new Object[]{iArr8, iArr9, iArr8}, -1896380356, 1896380367, (int) System.currentTimeMillis());
                        apw.setOnFocusChangeListener(new Object[]{iArr8, iArr8}, -650561249, 650561261, (int) System.currentTimeMillis());
                        apw.setOnFocusChangeListener(new Object[]{iArr8, iArr9}, -650561249, 650561261, (int) System.currentTimeMillis());
                        if (((Boolean) avf.setX(new Object[]{iArr7, iArr9}, -434699419, 434699434, (int) System.currentTimeMillis())).booleanValue()) {
                            apzVar = new apz(iArr8);
                            int i80 = f53558e;
                            i13 = ((i80 & (-110)) | ((~i80) & 109)) + ((i80 & 109) << 1);
                        } else {
                            apw.setOnFocusChangeListener(new Object[]{iArr8, f53556c, iArr8}, -1896380356, 1896380367, (int) System.currentTimeMillis());
                            apw.setOnFocusChangeListener(new Object[]{iArr8, iArr9}, -650561249, 650561261, (int) System.currentTimeMillis());
                            if (((Boolean) avf.setX(new Object[]{iArr7, iArr9}, -434699419, 434699434, (int) System.currentTimeMillis())).booleanValue()) {
                                apzVar = new apz(iArr8);
                                int i81 = f53558e;
                                i13 = ((i81 ^ 22) + ((i81 & 22) << 1)) - 1;
                            } else {
                                int i82 = f53557d;
                                int i83 = i82 & 117;
                                int i84 = i82 | 117;
                                int i85 = ((i83 | i84) << 1) - (i84 ^ i83);
                                f53558e = i85 % 128;
                                if (i85 % 2 == 0) {
                                    throw null;
                                }
                                apzVar = null;
                            }
                        }
                        f53557d = i13 % 128;
                        int i86 = i13 % 2;
                    }
                }
                return apzVar;
            case 10:
                apz apzVar16 = (apz) objArr[0];
                int[] iArr11 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                apw.setOnFocusChangeListener(new Object[]{apzVar16.setNavigationOnClickListener, iArr11}, -1179246970, 1179246978, (int) System.currentTimeMillis());
                apz apzVar17 = new apz(iArr11);
                int i87 = f53557d;
                int i88 = i87 & 103;
                int i89 = -(-((i87 ^ 103) | i88));
                int i90 = (i88 ^ i89) + ((i89 & i88) << 1);
                f53558e = i90 % 128;
                if (i90 % 2 != 0) {
                    return apzVar17;
                }
                throw null;
            case 11:
                apz apzVar18 = (apz) objArr[0];
                apk apkVar4 = (apk) objArr[1];
                int[] iArr12 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                apw.setOnFocusChangeListener(new Object[]{apzVar18.setNavigationOnClickListener, ((apz) apkVar4).setNavigationOnClickListener, iArr12}, -1896380356, 1896380367, (int) System.currentTimeMillis());
                apz apzVar19 = new apz(iArr12);
                int i91 = f53558e;
                int i92 = i91 ^ 61;
                int i93 = -(-((i91 & 61) << 1));
                int i94 = (i92 & i93) + (i93 | i92);
                f53557d = i94 % 128;
                if (i94 % 2 == 0) {
                    return apzVar19;
                }
                int i95 = 27 / 0;
                return apzVar19;
            case 12:
                int i96 = f53557d;
                int i97 = i96 & 81;
                int i98 = ((((i96 ^ 81) | i97) << 1) - (~(-((i96 | 81) & (~i97))))) - 1;
                f53558e = i98 % 128;
                int i99 = i98 % 2;
                int iBitLength = setOnLongClickListener.bitLength();
                int i100 = f53557d + 87;
                f53558e = i100 % 128;
                int i101 = i100 % 2;
                return Integer.valueOf(iBitLength);
            case 13:
                apz apzVar20 = (apz) objArr[0];
                int i102 = f53558e + 21;
                f53557d = i102 % 128;
                if (i102 % 2 != 0) {
                    iHashCode = setOnLongClickListener.hashCode();
                    onFocusChangeListener = bek.setOnFocusChangeListener(new Object[]{apzVar20.setNavigationOnClickListener, 122}, 1613127163, -1613127143, 122);
                } else {
                    iHashCode = setOnLongClickListener.hashCode();
                    onFocusChangeListener = bek.setOnFocusChangeListener(new Object[]{apzVar20.setNavigationOnClickListener, 8}, 1613127163, -1613127143, 8);
                }
                int iIntValue = ((Integer) onFocusChangeListener).intValue();
                int i103 = (~iIntValue) & iHashCode;
                int i104 = iIntValue & (~iHashCode);
                int i105 = (i104 & i103) | (i103 ^ i104);
                int i106 = f53558e;
                int i107 = i106 & 23;
                int i108 = ((i106 | 23) & (~i107)) + (i107 << 1);
                f53557d = i108 % 128;
                int i109 = i108 % 2;
                return Integer.valueOf(i105);
            case 14:
                apz apzVar21 = (apz) objArr[0];
                int i110 = f53558e;
                int i111 = (i110 & 123) + (123 | i110);
                f53557d = i111 % 128;
                int i112 = i111 % 2;
                boolean zBooleanValue2 = ((Boolean) avf.setX(new Object[]{apzVar21.setNavigationOnClickListener}, -362565938, 362565959, (int) System.currentTimeMillis())).booleanValue();
                int i113 = f53558e;
                int i114 = i113 & 35;
                int i115 = ((i113 ^ 35) | i114) << 1;
                int i116 = -((i113 | 35) & (~i114));
                int i117 = (i115 ^ i116) + ((i116 & i115) << 1);
                f53557d = i117 % 128;
                int i118 = i117 % 2;
                return Boolean.valueOf(zBooleanValue2);
            case 15:
                apz apzVar22 = (apz) objArr[0];
                Object obj = objArr[1];
                int i119 = f53557d;
                int i120 = (((i119 ^ 85) | (i119 & 85)) << 1) - ((i119 & (-86)) | ((~i119) & 85));
                int i121 = i120 % 128;
                f53558e = i121;
                if (i120 % 2 == 0) {
                    throw null;
                }
                if (obj == apzVar22) {
                    int i122 = ((i121 ^ 36) + ((i121 & 36) << 1)) - 1;
                    f53557d = i122 % 128;
                    int i123 = i122 % 2;
                    return Boolean.TRUE;
                }
                if (!(!(obj instanceof apz))) {
                    boolean zBooleanValue3 = ((Boolean) avf.setX(new Object[]{apzVar22.setNavigationOnClickListener, ((apz) obj).setNavigationOnClickListener}, -434699419, 434699434, (int) System.currentTimeMillis())).booleanValue();
                    int i124 = f53558e;
                    int i125 = (i124 & 7) + (i124 | 7);
                    f53557d = i125 % 128;
                    if (i125 % 2 == 0) {
                        return Boolean.valueOf(zBooleanValue3);
                    }
                    throw null;
                }
                int i126 = i119 + 13;
                int i127 = i126 % 128;
                f53558e = i127;
                int i128 = i126 % 2;
                int i129 = (i127 & 107) + (i127 | 107);
                f53557d = i129 % 128;
                int i130 = i129 % 2;
                return Boolean.FALSE;
            default:
                apz apzVar23 = (apz) objArr[0];
                int[] iArr13 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                apw.setOnFocusChangeListener(new Object[]{apzVar23.setNavigationOnClickListener, iArr13}, 1538062715, -1538062702, (int) System.currentTimeMillis());
                apz apzVar24 = new apz(iArr13);
                int i131 = f53558e + 77;
                f53557d = i131 % 128;
                if (i131 % 2 == 0) {
                    return apzVar24;
                }
                int i132 = 50 / 0;
                return apzVar24;
        }
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, 779490557, -779490542, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean getNavBarTitleString() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 1439742241, -1439742237, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -1936502958, 1936502971, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -1708327253, 1708327255, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, 1085022737, -1085022726, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setNavigationOnClickListener() {
        return (apk) setDividerPadding(new Object[]{this}, 1080491304, -1080491301, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setOnDragListener() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -1552773822, 1552773836, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnFocusChangeListener(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, -1838160430, 1838160431, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnLongClickListener() {
        return (apk) setDividerPadding(new Object[]{this}, -804029906, 804029915, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setX() {
        return (apk) setDividerPadding(new Object[]{this}, 822386068, -822386061, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY() {
        return (apk) setDividerPadding(new Object[]{this}, -1363293064, 1363293074, System.identityHashCode(this));
    }

    public apz() {
        this.setNavigationOnClickListener = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setDividerPadding(new Object[]{this}, 1762218893, -1762218888, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final int setOnFocusChangeListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, 1160703357, -1160703345, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, -95273769, 95273777, System.identityHashCode(this));
    }

    public apz(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(setOnLongClickListener) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        this.setNavigationOnClickListener = (int[]) apw.setOnFocusChangeListener(new Object[]{bigInteger}, 1791299722, -1791299704, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, 750983465, -750983459, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding() {
        return (apk) setDividerPadding(new Object[]{this}, 1656583437, -1656583437, System.identityHashCode(this));
    }
}
