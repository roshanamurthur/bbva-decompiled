package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class asc extends apk.setOnFocusChangeListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53733f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53734g = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f53735e;

    public asc(long[] jArr) {
        this.f53735e = jArr;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Object ascVar;
        boolean zBooleanValue;
        int i13 = ~i12;
        int i14 = ((i10 | i11 | i13) * (-369)) + (i11 * 370) + (i10 * 370);
        int i15 = (~i10) | i13;
        switch ((((~(i10 | i12)) | (~((~i11) | i10)) | (~(i11 | i15))) * 369) + (((~i15) | i11) * (-369)) + i14) {
            case 1:
                asc ascVar2 = (asc) objArr[0];
                apk apkVar = (apk) objArr[1];
                apk apkVar2 = (apk) objArr[2];
                long[] jArr = ascVar2.f53735e;
                long[] jArr2 = ((asc) apkVar).f53735e;
                long[] jArr3 = ((asc) apkVar2).f53735e;
                long[] jArr4 = (long[]) auw.setOnFocusChangeListener(new Object[0], 687837845, -687837835, (int) System.currentTimeMillis());
                arw.setOnFocusChangeListener(new Object[]{jArr, jArr4}, 175366159, -175366151, (int) System.currentTimeMillis());
                arw.setOnFocusChangeListener(new Object[]{jArr2, jArr3, jArr4}, -1240715377, 1240715388, (int) System.currentTimeMillis());
                long[] jArr5 = (long[]) auw.setOnFocusChangeListener(new Object[0], 1120999966, -1120999959, (int) System.currentTimeMillis());
                arw.setOnFocusChangeListener(new Object[]{jArr4, jArr5}, 2114234539, -2114234525, (int) System.currentTimeMillis());
                asc ascVar3 = new asc(jArr5);
                int i16 = f53733f + 97;
                f53734g = i16 % 128;
                int i17 = i16 % 2;
                return ascVar3;
            case 2:
                asc ascVar4 = (asc) objArr[0];
                long[] jArr6 = (long[]) auw.setOnFocusChangeListener(new Object[0], 1120999966, -1120999959, (int) System.currentTimeMillis());
                arw.setOnFocusChangeListener(new Object[]{ascVar4.f53735e, jArr6}, -1215063950, 1215063967, (int) System.currentTimeMillis());
                ascVar = new asc(jArr6);
                int i18 = f53733f;
                int i19 = (i18 ^ 109) + ((i18 & 109) << 1);
                f53734g = i19 % 128;
                int i20 = i19 % 2;
                break;
            case 3:
                asc ascVar5 = (asc) objArr[0];
                int i21 = f53733f;
                int i22 = i21 & 25;
                int i23 = -(-((i21 ^ 25) | i22));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                f53734g = i24 % 128;
                int i25 = i24 % 2;
                long[] jArr7 = ascVar5.f53735e;
                if (i25 == 0) {
                    throw null;
                }
                BigInteger bigInteger = (BigInteger) auw.setOnFocusChangeListener(new Object[]{jArr7}, -54417229, 54417240, (int) System.currentTimeMillis());
                int i26 = f53734g;
                int i27 = (((i26 | 100) << 1) - (i26 ^ 100)) - 1;
                f53733f = i27 % 128;
                if (i27 % 2 == 0) {
                    return bigInteger;
                }
                int i28 = 58 / 0;
                return bigInteger;
            case 4:
                asc ascVar6 = (asc) objArr[0];
                long[] jArr8 = (long[]) auw.setOnFocusChangeListener(new Object[0], 1120999966, -1120999959, (int) System.currentTimeMillis());
                arw.setOnFocusChangeListener(new Object[]{ascVar6.f53735e, jArr8}, 1015272824, -1015272823, (int) System.currentTimeMillis());
                ascVar = new asc(jArr8);
                int i29 = f53734g;
                int i30 = ((-1) << 1) - (((i29 ^ 66) + ((i29 & 66) << 1)) ^ (-1));
                f53733f = i30 % 128;
                int i31 = i30 % 2;
                break;
            case 5:
                int i32 = f53733f + 21;
                int i33 = i32 % 128;
                f53734g = i33;
                int i34 = i32 % 2 == 0 ? 68 : 113;
                int i35 = (i33 ^ 95) + ((i33 & 95) << 1);
                f53733f = i35 % 128;
                if (i35 % 2 == 0) {
                    return Integer.valueOf(i34);
                }
                throw null;
            case 6:
                asc ascVar7 = (asc) objArr[0];
                int i36 = f53733f;
                int i37 = i36 & 93;
                int i38 = i37 + ((i36 ^ 93) | i37);
                f53734g = i38 % 128;
                int i39 = i38 % 2;
                int iIntValue = ((Integer) arw.setOnFocusChangeListener(new Object[]{ascVar7.f53735e}, 834423774, -834423772, (int) System.currentTimeMillis())).intValue();
                int i40 = f53733f;
                int i41 = i40 & 87;
                int i42 = (i40 ^ 87) | i41;
                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                f53734g = i43 % 128;
                int i44 = i43 % 2;
                return Integer.valueOf(iIntValue);
            case 7:
                asc ascVar8 = (asc) objArr[0];
                apk apkVar3 = (apk) objArr[1];
                apk apkVar4 = (apk) objArr[2];
                apk apkVar5 = (apk) objArr[3];
                int i45 = f53733f;
                int i46 = i45 & 11;
                int i47 = i45 | 11;
                int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                f53734g = i48 % 128;
                int i49 = i48 % 2;
                apk compoundDrawableTintBlendMode = ascVar8.setCompoundDrawableTintBlendMode(apkVar3, apkVar4, apkVar5);
                int i50 = f53733f;
                int i51 = i50 & 115;
                int i52 = ((i50 | 115) & (~i51)) + (i51 << 1);
                f53734g = i52 % 128;
                if (i52 % 2 != 0) {
                    return compoundDrawableTintBlendMode;
                }
                int i53 = 2 / 0;
                return compoundDrawableTintBlendMode;
            case 8:
                asc ascVar9 = (asc) objArr[0];
                int i54 = f53733f;
                int i55 = ((i54 ^ 39) | (i54 & 39)) << 1;
                int i56 = -(((~i54) & 39) | (i54 & (-40)));
                int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                f53734g = i57 % 128;
                int i58 = i57 % 2;
                int iIntValue2 = ((Integer) bek.setOnFocusChangeListener(new Object[]{ascVar9.f53735e, 2}, -1971094880, 1971094881, 2)).intValue();
                int i59 = (iIntValue2 & (-113010)) | ((~iIntValue2) & 113009);
                int i60 = f53734g;
                int i61 = i60 & 43;
                int i62 = (i60 | 43) & (~i61);
                int i63 = -(-(i61 << 1));
                int i64 = (i62 & i63) + (i62 | i63);
                f53733f = i64 % 128;
                int i65 = i64 % 2;
                return Integer.valueOf(i59);
            case 9:
                asc ascVar10 = (asc) objArr[0];
                apk apkVar6 = (apk) objArr[1];
                long[] jArr9 = (long[]) auw.setOnFocusChangeListener(new Object[0], 1120999966, -1120999959, (int) System.currentTimeMillis());
                arw.setOnFocusChangeListener(new Object[]{ascVar10.f53735e, ((asc) apkVar6).f53735e, jArr9}, -834024073, 834024089, (int) System.currentTimeMillis());
                asc ascVar11 = new asc(jArr9);
                int i66 = f53734g;
                int i67 = ((i66 ^ 85) | (i66 & 85)) << 1;
                int i68 = -(((~i66) & 85) | (i66 & (-86)));
                int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
                f53733f = i69 % 128;
                if (i69 % 2 == 0) {
                    return ascVar11;
                }
                throw null;
            case 10:
                asc ascVar12 = (asc) objArr[0];
                apk apkVar7 = (apk) objArr[1];
                long[] jArr10 = (long[]) auw.setOnFocusChangeListener(new Object[0], 1120999966, -1120999959, (int) System.currentTimeMillis());
                arw.setOnFocusChangeListener(new Object[]{ascVar12.f53735e, ((asc) apkVar7).f53735e, jArr10}, -1489277526, 1489277531, (int) System.currentTimeMillis());
                asc ascVar13 = new asc(jArr10);
                int i70 = f53734g;
                int i71 = ((i70 | 3) << 1) - (i70 ^ 3);
                f53733f = i71 % 128;
                if (i71 % 2 == 0) {
                    return ascVar13;
                }
                throw null;
            case 11:
                asc ascVar14 = (asc) objArr[0];
                long[] jArr11 = (long[]) auw.setOnFocusChangeListener(new Object[0], 1120999966, -1120999959, (int) System.currentTimeMillis());
                arw.setOnFocusChangeListener(new Object[]{ascVar14.f53735e, jArr11}, 1948026200, -1948026197, (int) System.currentTimeMillis());
                ascVar = new asc(jArr11);
                int i72 = f53733f + 11;
                f53734g = i72 % 128;
                int i73 = i72 % 2;
                break;
            case 12:
                asc ascVar15 = (asc) objArr[0];
                long[] jArr12 = (long[]) auw.setOnFocusChangeListener(new Object[0], 1120999966, -1120999959, (int) System.currentTimeMillis());
                arw.setOnFocusChangeListener(new Object[]{ascVar15.f53735e, jArr12}, -325621027, 325621040, (int) System.currentTimeMillis());
                ascVar = new asc(jArr12);
                int i74 = f53733f;
                int i75 = ((i74 | 19) << 1) - (i74 ^ 19);
                f53734g = i75 % 128;
                int i76 = i75 % 2;
                break;
            case 13:
                asc ascVar16 = (asc) objArr[0];
                int i77 = f53733f;
                int i78 = (i77 ^ 51) + ((i77 & 51) << 1);
                f53734g = i78 % 128;
                int i79 = i78 % 2;
                long[] jArr13 = ascVar16.f53735e;
                if (i79 != 0) {
                    return Boolean.valueOf(((Boolean) auw.setOnFocusChangeListener(new Object[]{jArr13}, 368740709, -368740700, (int) System.currentTimeMillis())).booleanValue());
                }
                ((Boolean) auw.setOnFocusChangeListener(new Object[]{jArr13}, 368740709, -368740700, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            case 14:
                asc ascVar17 = (asc) objArr[0];
                apk apkVar8 = (apk) objArr[1];
                apk apkVar9 = (apk) objArr[2];
                apk apkVar10 = (apk) objArr[3];
                long[] jArr14 = ascVar17.f53735e;
                long[] jArr15 = ((asc) apkVar8).f53735e;
                long[] jArr16 = ((asc) apkVar9).f53735e;
                long[] jArr17 = ((asc) apkVar10).f53735e;
                long[] jArr18 = (long[]) auw.setOnFocusChangeListener(new Object[0], 687837845, -687837835, (int) System.currentTimeMillis());
                arw.setOnFocusChangeListener(new Object[]{jArr14, jArr15, jArr18}, -1240715377, 1240715388, (int) System.currentTimeMillis());
                arw.setOnFocusChangeListener(new Object[]{jArr16, jArr17, jArr18}, -1240715377, 1240715388, (int) System.currentTimeMillis());
                long[] jArr19 = (long[]) auw.setOnFocusChangeListener(new Object[0], 1120999966, -1120999959, (int) System.currentTimeMillis());
                arw.setOnFocusChangeListener(new Object[]{jArr18, jArr19}, 2114234539, -2114234525, (int) System.currentTimeMillis());
                asc ascVar18 = new asc(jArr19);
                int i80 = f53734g + 87;
                f53733f = i80 % 128;
                if (i80 % 2 == 0) {
                    return ascVar18;
                }
                throw null;
            case 15:
                asc ascVar19 = (asc) objArr[0];
                int i81 = f53733f;
                int i82 = (((i81 ^ 107) | (i81 & 107)) << 1) - (((~i81) & 107) | (i81 & (-108)));
                int i83 = i82 % 128;
                f53734g = i83;
                int i84 = i82 % 2;
                if ((ascVar19.f53735e[0] & 1) != 0) {
                    int i85 = ((i83 & 65) - (~(i83 | 65))) - 1;
                    f53733f = i85 % 128;
                    int i86 = i85 % 2;
                    ascVar = Boolean.TRUE;
                } else {
                    int i87 = i83 + 81;
                    f53733f = i87 % 128;
                    if (i87 % 2 != 0) {
                        throw null;
                    }
                    ascVar = Boolean.FALSE;
                }
                break;
            case 16:
                asc ascVar20 = (asc) objArr[0];
                apk apkVar11 = (apk) objArr[1];
                int i88 = f53733f;
                int i89 = i88 ^ 45;
                int i90 = ((45 & i88) | i89) << 1;
                int i91 = -i89;
                int i92 = (i90 ^ i91) + ((i90 & i91) << 1);
                f53734g = i92 % 128;
                int i93 = i92 % 2;
                apk navigationOnClickListener = apkVar11.setNavigationOnClickListener();
                if (i93 == 0) {
                    ascVar20.setCompoundDrawableTintBlendMode(navigationOnClickListener);
                    throw null;
                }
                apk compoundDrawableTintBlendMode2 = ascVar20.setCompoundDrawableTintBlendMode(navigationOnClickListener);
                int i94 = f53733f;
                int i95 = (i94 | 31) << 1;
                int i96 = -(((~i94) & 31) | (i94 & (-32)));
                int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                f53734g = i97 % 128;
                int i98 = i97 % 2;
                return compoundDrawableTintBlendMode2;
            case 17:
                asc ascVar21 = (asc) objArr[0];
                int i99 = f53733f;
                int i100 = (((i99 | 56) << 1) - (i99 ^ 56)) - 1;
                f53734g = i100 % 128;
                int i101 = i100 % 2;
                int i102 = (i99 ^ 115) + ((i99 & 115) << 1);
                f53734g = i102 % 128;
                if (i102 % 2 != 0) {
                    return ascVar21;
                }
                int i103 = 45 / 0;
                return ascVar21;
            case 18:
                asc ascVar22 = (asc) objArr[0];
                long[] jArr20 = (long[]) auw.setOnFocusChangeListener(new Object[0], 1120999966, -1120999959, (int) System.currentTimeMillis());
                arw.setOnFocusChangeListener(new Object[]{ascVar22.f53735e, jArr20}, 1914883636, -1914883621, (int) System.currentTimeMillis());
                ascVar = new asc(jArr20);
                int i104 = f53733f + 36;
                int i105 = (i104 ^ (-1)) + (i104 << 1);
                f53734g = i105 % 128;
                if (i105 % 2 == 0) {
                    throw null;
                }
                break;
            case 19:
                int i106 = f53734g;
                int i107 = i106 & 21;
                int i108 = ((i106 ^ 21) | i107) << 1;
                int i109 = -((~i107) & (i106 | 21));
                int i110 = ((i108 | i109) << 1) - (i108 ^ i109);
                f53733f = i110 % 128;
                int i111 = i110 % 2;
                int i112 = ((-1) << 1) - ((i106 + 122) ^ (-1));
                f53733f = i112 % 128;
                int i113 = i112 % 2;
                return Boolean.TRUE;
            case 20:
                asc ascVar23 = (asc) objArr[0];
                apk apkVar12 = (apk) objArr[1];
                int i114 = f53734g;
                int i115 = (i114 & (-112)) | ((~i114) & 111);
                int i116 = (i114 & 111) << 1;
                int i117 = ((i115 | i116) << 1) - (i116 ^ i115);
                f53733f = i117 % 128;
                int i118 = i117 % 2;
                apk onFocusChangeListener = ascVar23.setOnFocusChangeListener(apkVar12);
                int i119 = f53734g;
                int i120 = (i119 ^ 121) + ((i119 & 121) << 1);
                f53733f = i120 % 128;
                if (i120 % 2 == 0) {
                    return onFocusChangeListener;
                }
                throw null;
            case 21:
                asc ascVar24 = (asc) objArr[0];
                Object obj = objArr[1];
                int i121 = f53733f;
                int i122 = i121 & 69;
                int i123 = (~i122) & (i121 | 69);
                int i124 = -(-(i122 << 1));
                int i125 = ((i123 | i124) << 1) - (i124 ^ i123);
                f53734g = i125 % 128;
                int i126 = i125 % 2;
                if (obj == ascVar24) {
                    int i127 = i121 & 11;
                    int i128 = (((i121 ^ 11) | i127) << 1) - ((~i127) & (i121 | 11));
                    f53734g = i128 % 128;
                    ascVar = Boolean.valueOf(i128 % 2 != 0);
                } else if (obj instanceof asc) {
                    boolean zBooleanValue2 = ((Boolean) auw.setOnFocusChangeListener(new Object[]{ascVar24.f53735e, ((asc) obj).f53735e}, -176743705, 176743725, (int) System.currentTimeMillis())).booleanValue();
                    int i129 = f53734g;
                    int i130 = ((i129 | 13) << 1) - (i129 ^ 13);
                    f53733f = i130 % 128;
                    if (i130 % 2 != 0) {
                        throw null;
                    }
                    ascVar = Boolean.valueOf(zBooleanValue2);
                } else {
                    int i131 = ((i121 | 13) << 1) - (i121 ^ 13);
                    int i132 = i131 % 128;
                    f53734g = i132;
                    int i133 = i131 % 2;
                    int i134 = i132 + 27;
                    f53733f = i134 % 128;
                    if (i134 % 2 != 0) {
                        throw null;
                    }
                    ascVar = Boolean.FALSE;
                }
                break;
            case 22:
                asc ascVar25 = (asc) objArr[0];
                int i135 = f53733f;
                int i136 = (i135 & 115) + (i135 | 115);
                f53734g = i136 % 128;
                int i137 = i136 % 2;
                long[] jArr21 = ascVar25.f53735e;
                if (i137 == 0) {
                    zBooleanValue = ((Boolean) auw.setOnFocusChangeListener(new Object[]{jArr21}, -1950202807, 1950202829, (int) System.currentTimeMillis())).booleanValue();
                    int i138 = 92 / 0;
                } else {
                    zBooleanValue = ((Boolean) auw.setOnFocusChangeListener(new Object[]{jArr21}, -1950202807, 1950202829, (int) System.currentTimeMillis())).booleanValue();
                }
                int i139 = f53734g + 107;
                f53733f = i139 % 128;
                if (i139 % 2 == 0) {
                    return Boolean.valueOf(zBooleanValue);
                }
                throw null;
            default:
                asc ascVar26 = (asc) objArr[0];
                int iIntValue3 = ((Number) objArr[1]).intValue();
                int i140 = f53733f;
                int i141 = i140 & 21;
                int i142 = -(-((i140 ^ 21) | i141));
                int i143 = ((i141 | i142) << 1) - (i141 ^ i142);
                f53734g = i143 % 128;
                int i144 = i143 % 2;
                if (iIntValue3 <= 0) {
                    int i145 = i140 & 119;
                    int i146 = i140 | 119;
                    int i147 = ((i145 | i146) << 1) - (i145 ^ i146);
                    int i148 = i147 % 128;
                    f53734g = i148;
                    int i149 = i147 % 2;
                    int i150 = i148 & 17;
                    int i151 = -(-(i148 | 17));
                    int i152 = (i150 & i151) + (i151 | i150);
                    f53733f = i152 % 128;
                    int i153 = i152 % 2;
                    return ascVar26;
                }
                long[] jArr22 = (long[]) auw.setOnFocusChangeListener(new Object[0], 1120999966, -1120999959, (int) System.currentTimeMillis());
                arw.setOnFocusChangeListener(new Object[]{ascVar26.f53735e, Integer.valueOf(iIntValue3), jArr22}, 1533568612, -1533568608, iIntValue3);
                asc ascVar27 = new asc(jArr22);
                int i154 = f53734g;
                int i155 = i154 & 117;
                int i156 = -(-((i154 ^ 117) | i155));
                int i157 = ((i155 | i156) << 1) - (i156 ^ i155);
                f53733f = i157 % 128;
                if (i157 % 2 == 0) {
                    return ascVar27;
                }
                int i158 = 99 / 0;
                return ascVar27;
        }
        return ascVar;
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final int UiMessageCallbackKtWhenMappings() {
        return ((Integer) setX(new Object[]{this}, 414092778, -414092772, System.identityHashCode(this))).intValue();
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, -765070656, 765070677, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean getNavBarTitleString() {
        return ((Boolean) setX(new Object[]{this}, -2037886830, 2037886843, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, -1626028689, 1626028697, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setX(new Object[]{this}, 319227489, -319227474, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(int i10) {
        return (apk) setX(new Object[]{this, Integer.valueOf(i10)}, 620599107, -620599107, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding(apk apkVar) {
        return (apk) setX(new Object[]{this, apkVar}, 1221898728, -1221898712, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final apk setIncludeFontPadding() {
        return (apk) setX(new Object[]{this}, -2122590470, 2122590482, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setNavigationOnClickListener() {
        return (apk) setX(new Object[]{this}, -528397204, 528397206, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setOnDragListener() {
        return ((Boolean) setX(new Object[]{this}, 1396512441, -1396512419, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnFocusChangeListener(apk apkVar) {
        return (apk) setX(new Object[]{this, apkVar}, -1589989315, 1589989325, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnLongClickListener() {
        return (apk) setX(new Object[]{this}, 1092337307, -1092337303, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar, apk apkVar2) {
        return (apk) setX(new Object[]{this, apkVar, apkVar2}, 979395061, -979395060, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final boolean setZ() {
        return ((Boolean) setX(new Object[]{this}, 1604106465, -1604106446, System.identityHashCode(this))).booleanValue();
    }

    public asc() {
        this.f53735e = (long[]) auw.setOnFocusChangeListener(new Object[0], 1120999966, -1120999959, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar, apk apkVar2, apk apkVar3) {
        return (apk) setX(new Object[]{this, apkVar, apkVar2, apkVar3}, -490442302, 490442316, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding() {
        return (apk) setX(new Object[]{this}, -1163732564, 1163732575, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final int setOnFocusChangeListener() {
        return ((Integer) setX(new Object[]{this}, 1037619321, -1037619316, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY() {
        return (apk) setX(new Object[]{this}, 1347616694, -1347616677, System.identityHashCode(this));
    }

    public asc(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.f53735e = (long[]) arw.setOnFocusChangeListener(new Object[]{bigInteger}, 1275615993, -1275615987, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar) {
        return (apk) setX(new Object[]{this, apkVar}, 1647196736, -1647196727, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar, apk apkVar2, apk apkVar3) {
        return (apk) setX(new Object[]{this, apkVar, apkVar2, apkVar3}, -1446356199, 1446356206, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setX(new Object[]{this}, 1179079730, -1179079727, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar) {
        return (apk) setX(new Object[]{this, apkVar}, -1701406539, 1701406559, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setX() {
        return (apk) setX(new Object[]{this}, -677651834, 677651852, System.identityHashCode(this));
    }
}
