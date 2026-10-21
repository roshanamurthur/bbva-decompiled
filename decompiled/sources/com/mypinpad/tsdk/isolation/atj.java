package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class atj extends apk.setOnFocusChangeListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53824f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53825g = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f53826e;

    public atj(long[] jArr) {
        this.f53826e = jArr;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        boolean zBooleanValue;
        Object obj;
        Boolean bool;
        int i13 = ~i10;
        switch (((i10 | i11) * 624) + ((i13 | i11) * 624) + (i13 * (-624)) + (i11 * (-623)) + (i10 * (-623))) {
            case 1:
                atj atjVar = (atj) objArr[0];
                long[] jArr = (long[]) avc.setDividerPadding(new Object[0], 961547691, -961547687, (int) System.currentTimeMillis());
                atl.setDividerPadding(new Object[]{atjVar.f53826e, jArr}, 2062523667, -2062523659, (int) System.currentTimeMillis());
                atj atjVar2 = new atj(jArr);
                int i14 = f53825g;
                int i15 = i14 & 91;
                int i16 = (i14 ^ 91) | i15;
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                f53824f = i17 % 128;
                if (i17 % 2 == 0) {
                    return atjVar2;
                }
                int i18 = 85 / 0;
                return atjVar2;
            case 2:
                atj atjVar3 = (atj) objArr[0];
                int i19 = f53825g + 67;
                f53824f = i19 % 128;
                int i20 = i19 % 2;
                long[] jArr2 = atjVar3.f53826e;
                if (i20 != 0) {
                    zBooleanValue = ((Boolean) avc.setDividerPadding(new Object[]{jArr2}, 263394784, -263394778, (int) System.currentTimeMillis())).booleanValue();
                    int i21 = 81 / 0;
                } else {
                    zBooleanValue = ((Boolean) avc.setDividerPadding(new Object[]{jArr2}, 263394784, -263394778, (int) System.currentTimeMillis())).booleanValue();
                }
                int i22 = f53825g;
                int i23 = i22 & 121;
                int i24 = (i22 | 121) & (~i23);
                int i25 = i23 << 1;
                int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
                f53824f = i26 % 128;
                if (i26 % 2 == 0) {
                    return Boolean.valueOf(zBooleanValue);
                }
                throw null;
            case 3:
                int i27 = f53825g;
                int i28 = i27 & 15;
                int i29 = -(-((i27 ^ 15) | i28));
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                int i31 = i30 % 128;
                f53824f = i31;
                int i32 = i30 % 2;
                int i33 = i31 & 67;
                int i34 = ((i31 ^ 67) | i33) << 1;
                int i35 = -((i31 | 67) & (~i33));
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                f53825g = i36 % 128;
                if (i36 % 2 != 0) {
                    return 283;
                }
                throw null;
            case 4:
                atj atjVar4 = (atj) objArr[0];
                apk apkVar = (apk) objArr[1];
                apk apkVar2 = (apk) objArr[2];
                apk apkVar3 = (apk) objArr[3];
                long[] jArr3 = atjVar4.f53826e;
                long[] jArr4 = ((atj) apkVar).f53826e;
                long[] jArr5 = ((atj) apkVar2).f53826e;
                long[] jArr6 = ((atj) apkVar3).f53826e;
                long[] jArr7 = (long[]) auy.setOnFocusChangeListener(new Object[]{9}, 1783230509, -1783230493, 9);
                atl.setDividerPadding(new Object[]{jArr3, jArr4, jArr7}, -467707813, 467707820, (int) System.currentTimeMillis());
                atl.setDividerPadding(new Object[]{jArr5, jArr6, jArr7}, -467707813, 467707820, (int) System.currentTimeMillis());
                long[] jArr8 = (long[]) avc.setDividerPadding(new Object[0], 961547691, -961547687, (int) System.currentTimeMillis());
                atl.setDividerPadding(new Object[]{jArr7, jArr8}, -1362515053, 1362515072, (int) System.currentTimeMillis());
                atj atjVar5 = new atj(jArr8);
                int i37 = f53825g;
                int i38 = i37 ^ 13;
                int i39 = ((((i37 & 13) | i38) << 1) - (~(-i38))) - 1;
                f53824f = i39 % 128;
                obj = atjVar5;
                if (i39 % 2 != 0) {
                    throw null;
                }
                break;
            case 5:
                atj atjVar6 = (atj) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i40 = f53824f + 24;
                int i41 = (i40 ^ (-1)) + (i40 << 1);
                int i42 = i41 % 128;
                f53825g = i42;
                int i43 = i41 % 2;
                if (iIntValue > 0) {
                    long[] jArr9 = (long[]) avc.setDividerPadding(new Object[0], 961547691, -961547687, (int) System.currentTimeMillis());
                    atl.setDividerPadding(new Object[]{atjVar6.f53826e, Integer.valueOf(iIntValue), jArr9}, -607892194, 607892207, iIntValue);
                    atj atjVar7 = new atj(jArr9);
                    int i44 = f53825g;
                    int i45 = ((((i44 ^ 37) | (i44 & 37)) << 1) - (~(-(((~i44) & 37) | (i44 & (-38)))))) - 1;
                    f53824f = i45 % 128;
                    if (i45 % 2 == 0) {
                        return atjVar7;
                    }
                    int i46 = 46 / 0;
                    return atjVar7;
                }
                int i47 = (i42 & 43) + (i42 | 43);
                int i48 = i47 % 128;
                f53824f = i48;
                int i49 = i47 % 2;
                int i50 = i48 & 33;
                int i51 = (i48 ^ 33) | i50;
                int i52 = (i50 ^ i51) + ((i50 & i51) << 1);
                f53825g = i52 % 128;
                int i53 = i52 % 2;
                obj = atjVar6;
                break;
                break;
            case 6:
                atj atjVar8 = (atj) objArr[0];
                apk apkVar4 = (apk) objArr[1];
                int i54 = f53825g;
                int i55 = (i54 ^ 69) + ((i54 & 69) << 1);
                f53824f = i55 % 128;
                int i56 = i55 % 2;
                apk onFocusChangeListener = atjVar8.setOnFocusChangeListener(apkVar4);
                int i57 = f53825g;
                int i58 = ((i57 & 40) + (i57 | 40)) - 1;
                f53824f = i58 % 128;
                if (i58 % 2 == 0) {
                    return onFocusChangeListener;
                }
                throw null;
            case 7:
                atj atjVar9 = (atj) objArr[0];
                int i59 = f53824f + 1;
                f53825g = i59 % 128;
                int i60 = i59 % 2;
                long[] jArr10 = atjVar9.f53826e;
                if (i60 != 0) {
                    return Boolean.valueOf(((Boolean) avc.setDividerPadding(new Object[]{jArr10}, -102028197, 102028197, (int) System.currentTimeMillis())).booleanValue());
                }
                ((Boolean) avc.setDividerPadding(new Object[]{jArr10}, -102028197, 102028197, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            case 8:
                atj atjVar10 = (atj) objArr[0];
                long[] jArr11 = (long[]) avc.setDividerPadding(new Object[0], 961547691, -961547687, (int) System.currentTimeMillis());
                atl.setDividerPadding(new Object[]{atjVar10.f53826e, jArr11}, -31002354, 31002354, (int) System.currentTimeMillis());
                atj atjVar11 = new atj(jArr11);
                int i61 = f53825g;
                int i62 = ((i61 & 18) + (i61 | 18)) - 1;
                f53824f = i62 % 128;
                int i63 = i62 % 2;
                return atjVar11;
            case 9:
                atj atjVar12 = (atj) objArr[0];
                apk apkVar5 = (apk) objArr[1];
                apk apkVar6 = (apk) objArr[2];
                long[] jArr12 = atjVar12.f53826e;
                long[] jArr13 = ((atj) apkVar5).f53826e;
                long[] jArr14 = ((atj) apkVar6).f53826e;
                long[] jArr15 = (long[]) auy.setOnFocusChangeListener(new Object[]{9}, 1783230509, -1783230493, 9);
                atl.setDividerPadding(new Object[]{jArr12, jArr15}, -1243331134, 1243331136, (int) System.currentTimeMillis());
                atl.setDividerPadding(new Object[]{jArr13, jArr14, jArr15}, -467707813, 467707820, (int) System.currentTimeMillis());
                long[] jArr16 = (long[]) avc.setDividerPadding(new Object[0], 961547691, -961547687, (int) System.currentTimeMillis());
                atl.setDividerPadding(new Object[]{jArr15, jArr16}, -1362515053, 1362515072, (int) System.currentTimeMillis());
                atj atjVar13 = new atj(jArr16);
                int i64 = f53824f;
                int i65 = (((i64 ^ 65) | (i64 & 65)) << 1) - (((~i64) & 65) | (i64 & (-66)));
                f53825g = i65 % 128;
                int i66 = i65 % 2;
                obj = atjVar13;
                break;
            case 10:
                atj atjVar14 = (atj) objArr[0];
                apk apkVar7 = (apk) objArr[1];
                int i67 = f53824f;
                int i68 = i67 & 79;
                int i69 = -(-(i67 | 79));
                int i70 = ((i68 | i69) << 1) - (i69 ^ i68);
                f53825g = i70 % 128;
                int i71 = i70 % 2;
                apk compoundDrawableTintBlendMode = atjVar14.setCompoundDrawableTintBlendMode(apkVar7.setNavigationOnClickListener());
                if (i71 == 0) {
                    int i72 = 10 / 0;
                }
                int i73 = f53824f;
                int i74 = ((i73 | 95) << 1) - (i73 ^ 95);
                f53825g = i74 % 128;
                int i75 = i74 % 2;
                return compoundDrawableTintBlendMode;
            case 11:
                atj atjVar15 = (atj) objArr[0];
                int i76 = f53824f;
                int i77 = ((i76 | 7) << 1) - (i76 ^ 7);
                f53825g = i77 % 128;
                int i78 = i77 % 2;
                BigInteger bigInteger = (BigInteger) avc.setDividerPadding(new Object[]{atjVar15.f53826e}, -226230156, 226230158, (int) System.currentTimeMillis());
                int i79 = f53824f;
                int i80 = ((i79 & 120) + (i79 | 120)) - 1;
                f53825g = i80 % 128;
                if (i80 % 2 != 0) {
                    return bigInteger;
                }
                throw null;
            case 12:
                atj atjVar16 = (atj) objArr[0];
                apk apkVar8 = (apk) objArr[1];
                long[] jArr17 = (long[]) avc.setDividerPadding(new Object[0], 961547691, -961547687, (int) System.currentTimeMillis());
                atl.setDividerPadding(new Object[]{atjVar16.f53826e, ((atj) apkVar8).f53826e, jArr17}, 1293892445, -1293892430, (int) System.currentTimeMillis());
                atj atjVar17 = new atj(jArr17);
                int i81 = f53825g;
                int i82 = i81 & 13;
                int i83 = i82 + ((i81 ^ 13) | i82);
                f53824f = i83 % 128;
                int i84 = i83 % 2;
                return atjVar17;
            case 13:
                atj atjVar18 = (atj) objArr[0];
                apk apkVar9 = (apk) objArr[1];
                long[] jArr18 = (long[]) avc.setDividerPadding(new Object[0], 961547691, -961547687, (int) System.currentTimeMillis());
                atl.setDividerPadding(new Object[]{atjVar18.f53826e, ((atj) apkVar9).f53826e, jArr18}, 312716252, -312716243, (int) System.currentTimeMillis());
                atj atjVar19 = new atj(jArr18);
                int i85 = f53824f;
                int i86 = (i85 ^ 45) + ((i85 & 45) << 1);
                f53825g = i86 % 128;
                if (i86 % 2 != 0) {
                    return atjVar19;
                }
                throw null;
            case 14:
                atj atjVar20 = (atj) objArr[0];
                int i87 = f53824f;
                int i88 = i87 & 109;
                int i89 = (~i88) & (i87 | 109);
                int i90 = i88 << 1;
                int i91 = ((i89 | i90) << 1) - (i90 ^ i89);
                int i92 = i91 % 128;
                f53825g = i92;
                int i93 = i91 % 2;
                long[] jArr19 = atjVar20.f53826e;
                if (i93 != 0 ? (jArr19[0] & 1) != 0 : jArr19[0] / 0 != 0) {
                    int i94 = ((i92 | 37) << 1) - (i92 ^ 37);
                    f53824f = i94 % 128;
                    if (i94 % 2 == 0) {
                        return Boolean.TRUE;
                    }
                    throw null;
                }
                int i95 = i87 ^ 85;
                int i96 = (i87 & 85) << 1;
                int i97 = (i95 ^ i96) + ((i95 & i96) << 1);
                f53825g = i97 % 128;
                if (i97 % 2 == 0) {
                    int i98 = 44 / 0;
                }
                return Boolean.FALSE;
            case 15:
                atj atjVar21 = (atj) objArr[0];
                int i99 = f53825g;
                int i100 = i99 & 103;
                int i101 = ((i99 ^ 103) | i100) << 1;
                int i102 = -((i99 | 103) & (~i100));
                int i103 = ((i101 | i102) << 1) - (i102 ^ i101);
                f53824f = i103 % 128;
                int i104 = i103 % 2;
                int iIntValue2 = ((Integer) atl.setDividerPadding(new Object[]{atjVar21.f53826e}, -476509198, 476509210, (int) System.currentTimeMillis())).intValue();
                int i105 = f53824f;
                int i106 = ((i105 ^ 16) + ((i105 & 16) << 1)) - 1;
                f53825g = i106 % 128;
                if (i106 % 2 == 0) {
                    int i107 = 91 / 0;
                }
                return Integer.valueOf(iIntValue2);
            case 16:
                int i108 = f53825g;
                int i109 = (i108 & 71) + (i108 | 71);
                int i110 = i109 % 128;
                f53824f = i110;
                int i111 = i109 % 2;
                int i112 = i110 & 115;
                int i113 = i110 | 115;
                int i114 = (i112 & i113) + (i113 | i112);
                f53825g = i114 % 128;
                if (i114 % 2 != 0) {
                    return Boolean.TRUE;
                }
                throw null;
            case 17:
                atj atjVar22 = (atj) objArr[0];
                long[] jArr20 = (long[]) avc.setDividerPadding(new Object[0], 961547691, -961547687, (int) System.currentTimeMillis());
                atl.setDividerPadding(new Object[]{atjVar22.f53826e, jArr20}, -2111260361, 2111260378, (int) System.currentTimeMillis());
                atj atjVar23 = new atj(jArr20);
                int i115 = f53824f + 69;
                f53825g = i115 % 128;
                if (i115 % 2 != 0) {
                    return atjVar23;
                }
                int i116 = 50 / 0;
                return atjVar23;
            case 18:
                bool = Boolean.FALSE;
                atj atjVar24 = (atj) objArr[0];
                Object obj2 = objArr[1];
                int i117 = f53825g;
                int i118 = i117 + 9;
                int i119 = i118 % 128;
                f53824f = i119;
                int i120 = i118 % 2;
                if (obj2 == atjVar24) {
                    int i121 = i117 & 125;
                    int i122 = i117 | 125;
                    int i123 = (i121 & i122) + (i121 | i122);
                    int i124 = i123 % 128;
                    f53824f = i124;
                    boolean z10 = i123 % 2 == 0;
                    int i125 = i124 ^ 77;
                    int i126 = (((i124 & 77) | i125) << 1) - i125;
                    f53825g = i126 % 128;
                    int i127 = i126 % 2;
                    return Boolean.valueOf(z10);
                }
                if (!(!(obj2 instanceof atj))) {
                    boolean zBooleanValue2 = ((Boolean) avc.setDividerPadding(new Object[]{atjVar24.f53826e, ((atj) obj2).f53826e}, 502156939, -502156934, (int) System.currentTimeMillis())).booleanValue();
                    int i128 = f53825g;
                    int i129 = (i128 & (-120)) | ((~i128) & 119);
                    int i130 = (i128 & 119) << 1;
                    int i131 = (i129 & i130) + (i130 | i129);
                    f53824f = i131 % 128;
                    int i132 = i131 % 2;
                    return Boolean.valueOf(zBooleanValue2);
                }
                int i133 = i119 & 79;
                int i134 = i133 + ((i119 ^ 79) | i133);
                f53825g = i134 % 128;
                int i135 = i134 % 2;
                int i136 = i119 + 99;
                f53825g = i136 % 128;
                if (i136 % 2 == 0) {
                    obj = bool;
                    int i137 = 56 / 0;
                    obj = bool;
                }
                break;
            case 19:
                atj atjVar25 = (atj) objArr[0];
                long[] jArr21 = (long[]) avc.setDividerPadding(new Object[0], 961547691, -961547687, (int) System.currentTimeMillis());
                atl.setDividerPadding(new Object[]{atjVar25.f53826e, jArr21}, 438276371, -438276368, (int) System.currentTimeMillis());
                atj atjVar26 = new atj(jArr21);
                int i138 = f53824f;
                int i139 = ((-1) << 1) - (((i138 ^ 50) + ((i138 & 50) << 1)) ^ (-1));
                f53825g = i139 % 128;
                int i140 = i139 % 2;
                return atjVar26;
            case 20:
                atj atjVar27 = (atj) objArr[0];
                apk apkVar10 = (apk) objArr[1];
                apk apkVar11 = (apk) objArr[2];
                apk apkVar12 = (apk) objArr[3];
                int i141 = f53824f;
                int i142 = (i141 & 38) + (i141 | 38);
                int i143 = (i142 ^ (-1)) + (i142 << 1);
                f53825g = i143 % 128;
                if (i143 % 2 == 0) {
                    atjVar27.setCompoundDrawableTintBlendMode(apkVar10, apkVar11, apkVar12);
                    throw null;
                }
                apk compoundDrawableTintBlendMode2 = atjVar27.setCompoundDrawableTintBlendMode(apkVar10, apkVar11, apkVar12);
                int i144 = f53825g;
                int i145 = i144 & 119;
                int i146 = (i144 ^ 119) | i145;
                int i147 = (i145 ^ i146) + ((i146 & i145) << 1);
                f53824f = i147 % 128;
                if (i147 % 2 == 0) {
                    return compoundDrawableTintBlendMode2;
                }
                throw null;
            case 21:
                atj atjVar28 = (atj) objArr[0];
                int i148 = f53825g;
                int i149 = (i148 & (-46)) | ((~i148) & 45);
                int i150 = -(-((i148 & 45) << 1));
                int i151 = (i149 ^ i150) + ((i150 & i149) << 1);
                f53824f = i151 % 128;
                int i152 = i151 % 2;
                int iIntValue3 = ((Integer) bek.setOnFocusChangeListener(new Object[]{atjVar28.f53826e, 5}, -1971094880, 1971094881, 5)).intValue() ^ 2831275;
                int i153 = f53825g + 97;
                f53824f = i153 % 128;
                int i154 = i153 % 2;
                return Integer.valueOf(iIntValue3);
            case 22:
                atj atjVar29 = (atj) objArr[0];
                long[] jArr22 = (long[]) avc.setDividerPadding(new Object[0], 961547691, -961547687, (int) System.currentTimeMillis());
                atl.setDividerPadding(new Object[]{atjVar29.f53826e, jArr22}, -1235691421, 1235691435, (int) System.currentTimeMillis());
                atj atjVar30 = new atj(jArr22);
                int i155 = f53825g;
                int i156 = i155 & 41;
                int i157 = i156 + ((i155 ^ 41) | i156);
                f53824f = i157 % 128;
                int i158 = i157 % 2;
                return atjVar30;
            default:
                atj atjVar31 = (atj) objArr[0];
                int i159 = f53825g;
                int i160 = ((i159 & (-122)) | ((~i159) & 121)) + ((i159 & 121) << 1);
                int i161 = i160 % 128;
                f53824f = i161;
                int i162 = i160 % 2;
                int i163 = (i161 ^ 47) + ((i161 & 47) << 1);
                f53825g = i163 % 128;
                int i164 = i163 % 2;
                return atjVar31;
        }
        obj = bool;
        return obj;
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final int UiMessageCallbackKtWhenMappings() {
        return ((Integer) setDividerPadding(new Object[]{this}, 762377644, -762377629, System.identityHashCode(this))).intValue();
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, 1119556346, -1119556328, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean getNavBarTitleString() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 63406534, -63406527, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, 1549116091, -1549116070, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -1010115138, 1010115152, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(int i10) {
        return (apk) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, -668945579, 668945584, i10);
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final apk setIncludeFontPadding() {
        return (apk) setDividerPadding(new Object[]{this}, 425853699, -425853680, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setNavigationOnClickListener() {
        return (apk) setDividerPadding(new Object[]{this}, -2019867526, 2019867527, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setOnDragListener() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -772608258, 772608260, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnFocusChangeListener(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, 1734635300, -1734635287, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnLongClickListener() {
        return (apk) setDividerPadding(new Object[]{this}, -222650888, 222650896, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setX() {
        return (apk) setDividerPadding(new Object[]{this}, 198209007, -198208985, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar, apk apkVar2) {
        return (apk) setDividerPadding(new Object[]{this, apkVar, apkVar2}, 1494144690, -1494144681, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final boolean setZ() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -563981017, 563981033, System.identityHashCode(this))).booleanValue();
    }

    public atj() {
        this.f53826e = (long[]) avc.setDividerPadding(new Object[0], 961547691, -961547687, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar, apk apkVar2, apk apkVar3) {
        return (apk) setDividerPadding(new Object[]{this, apkVar, apkVar2, apkVar3}, -324615289, 324615293, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final int setOnFocusChangeListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, 244361775, -244361772, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY() {
        return (apk) setDividerPadding(new Object[]{this}, 247079436, -247079436, System.identityHashCode(this));
    }

    public atj(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.f53826e = (long[]) atl.setDividerPadding(new Object[]{bigInteger}, 32757687, -32757676, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, 1255964626, -1255964614, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar, apk apkVar2, apk apkVar3) {
        return (apk) setDividerPadding(new Object[]{this, apkVar, apkVar2, apkVar3}, -279561525, 279561545, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setDividerPadding(new Object[]{this}, -25063322, 25063333, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, -536089243, 536089249, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, -314524459, 314524469, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding() {
        return (apk) setDividerPadding(new Object[]{this}, -1227284576, 1227284593, System.identityHashCode(this));
    }
}
