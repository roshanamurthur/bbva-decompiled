package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class atq extends apk.setOnFocusChangeListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53841f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53842g = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f53843e;

    public atq(long[] jArr) {
        this.f53843e = jArr;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        atq atqVar;
        int i13 = ((i11 | i12) * 140) + (i11 * (-279)) + (i10 * 141);
        int i14 = (~i10) | i11;
        int i15 = ~i14;
        int i16 = ~i12;
        switch ((((~(i10 | i16)) | (~((~i11) | i10)) | (~(i14 | i12))) * 140) + ((i15 | (~(i16 | i11))) * (-280)) + i13) {
            case 1:
                atqVar = (atq) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i17 = f53842g + 89;
                int i18 = i17 % 128;
                f53841f = i18;
                if (i17 % 2 != 0) {
                    throw null;
                }
                if (iIntValue > 0) {
                    long[] jArr = (long[]) ave.setX(new Object[0], 1520214409, -1520214407, (int) System.currentTimeMillis());
                    ato.setY(new Object[]{atqVar.f53843e, Integer.valueOf(iIntValue), jArr}, 1815178923, -1815178917, iIntValue);
                    atq atqVar2 = new atq(jArr);
                    int i19 = f53842g;
                    int i20 = ((i19 ^ 7) | (i19 & 7)) << 1;
                    int i21 = -(((~i19) & 7) | (i19 & (-8)));
                    int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                    f53841f = i22 % 128;
                    int i23 = i22 % 2;
                    return atqVar2;
                }
                int i24 = i18 & 105;
                int i25 = i18 | 105;
                int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
                f53842g = i26 % 128;
                if (i26 % 2 == 0) {
                    throw null;
                }
                break;
            case 2:
                atq atqVar3 = (atq) objArr[0];
                long[] jArr2 = (long[]) ave.setX(new Object[0], 1520214409, -1520214407, (int) System.currentTimeMillis());
                ato.setY(new Object[]{atqVar3.f53843e, jArr2}, 749935379, -749935370, (int) System.currentTimeMillis());
                atq atqVar4 = new atq(jArr2);
                int i27 = f53842g;
                int i28 = i27 & 51;
                int i29 = -(-((i27 ^ 51) | i28));
                int i30 = (i28 & i29) + (i29 | i28);
                f53841f = i30 % 128;
                if (i30 % 2 == 0) {
                    return atqVar4;
                }
                throw null;
            case 3:
                atq atqVar5 = (atq) objArr[0];
                int i31 = f53841f;
                int i32 = i31 & 91;
                int i33 = (((i31 | 91) & (~i32)) - (~(-(-(i32 << 1))))) - 1;
                f53842g = i33 % 128;
                if (i33 % 2 != 0) {
                    return atqVar5;
                }
                int i34 = 16 / 0;
                return atqVar5;
            case 4:
                atq atqVar6 = (atq) objArr[0];
                int i35 = f53842g;
                int i36 = (i35 ^ 111) + ((i35 & 111) << 1);
                f53841f = i36 % 128;
                int i37 = i36 % 2;
                int iIntValue2 = ((Integer) ato.setY(new Object[]{atqVar6.f53843e}, 1232052216, -1232052206, (int) System.currentTimeMillis())).intValue();
                int i38 = f53841f;
                int i39 = i38 & 45;
                int i40 = i38 | 45;
                int i41 = (i39 & i40) + (i40 | i39);
                f53842g = i41 % 128;
                int i42 = i41 % 2;
                return Integer.valueOf(iIntValue2);
            case 5:
                atq atqVar7 = (atq) objArr[0];
                Object obj = objArr[1];
                int i43 = f53841f;
                int i44 = i43 & 5;
                int i45 = (~i44) & (i43 | 5);
                int i46 = i44 << 1;
                int i47 = (i45 & i46) + (i46 | i45);
                f53842g = i47 % 128;
                int i48 = i47 % 2;
                if (obj == atqVar7) {
                    int i49 = i43 | 45;
                    int i50 = (i49 << 1) - (i49 & (~(i43 & 45)));
                    int i51 = i50 % 128;
                    f53842g = i51;
                    int i52 = i50 % 2;
                    int i53 = i51 & 53;
                    int i54 = (i51 | 53) & (~i53);
                    int i55 = i53 << 1;
                    int i56 = ((i54 | i55) << 1) - (i54 ^ i55);
                    f53841f = i56 % 128;
                    int i57 = i56 % 2;
                    return Boolean.TRUE;
                }
                if (obj instanceof atq) {
                    boolean zBooleanValue = ((Boolean) ave.setX(new Object[]{atqVar7.f53843e, ((atq) obj).f53843e}, 1841458189, -1841458189, (int) System.currentTimeMillis())).booleanValue();
                    int i58 = f53841f;
                    int i59 = i58 ^ 97;
                    int i60 = (i58 & 97) << 1;
                    int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
                    f53842g = i61 % 128;
                    int i62 = i61 % 2;
                    return Boolean.valueOf(zBooleanValue);
                }
                int i63 = (((i43 | 52) << 1) - (i43 ^ 52)) - 1;
                int i64 = i63 % 128;
                f53842g = i64;
                boolean z10 = i63 % 2 == 0;
                int i65 = i64 ^ 7;
                int i66 = ((i64 & 7) | i65) << 1;
                int i67 = -i65;
                int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
                f53841f = i68 % 128;
                int i69 = i68 % 2;
                return Boolean.valueOf(z10);
            case 6:
                atq atqVar8 = (atq) objArr[0];
                apk apkVar = (apk) objArr[1];
                apk apkVar2 = (apk) objArr[2];
                long[] jArr3 = atqVar8.f53843e;
                long[] jArr4 = ((atq) apkVar).f53843e;
                long[] jArr5 = ((atq) apkVar2).f53843e;
                long[] jArr6 = (long[]) auy.setOnFocusChangeListener(new Object[]{13}, 1783230509, -1783230493, 13);
                ato.setY(new Object[]{jArr3, jArr6}, -506185616, 506185635, (int) System.currentTimeMillis());
                ato.setY(new Object[]{jArr4, jArr5, jArr6}, 234880743, -234880738, (int) System.currentTimeMillis());
                long[] jArr7 = (long[]) ave.setX(new Object[0], 1520214409, -1520214407, (int) System.currentTimeMillis());
                ato.setY(new Object[]{jArr6, jArr7}, -323449892, 323449909, (int) System.currentTimeMillis());
                atqVar = new atq(jArr7);
                int i70 = f53841f;
                int i71 = (i70 & (-112)) | ((~i70) & 111);
                int i72 = (i70 & 111) << 1;
                int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                f53842g = i73 % 128;
                int i74 = i73 % 2;
                break;
            case 7:
                atq atqVar9 = (atq) objArr[0];
                apk apkVar3 = (apk) objArr[1];
                int i75 = f53841f;
                int i76 = i75 & 87;
                int i77 = (i75 ^ 87) | i76;
                int i78 = (i76 & i77) + (i77 | i76);
                f53842g = i78 % 128;
                int i79 = i78 % 2;
                apk compoundDrawableTintBlendMode = atqVar9.setCompoundDrawableTintBlendMode(apkVar3.setNavigationOnClickListener());
                int i80 = f53842g;
                int i81 = (((i80 | 12) << 1) - (i80 ^ 12)) - 1;
                f53841f = i81 % 128;
                if (i81 % 2 == 0) {
                    return compoundDrawableTintBlendMode;
                }
                throw null;
            case 8:
                int i82 = f53842g;
                int i83 = i82 & 9;
                int i84 = i83 + ((i82 ^ 9) | i83);
                f53841f = i84 % 128;
                int i85 = i84 % 2;
                int i86 = ((i82 & (-32)) | ((~i82) & 31)) + ((i82 & 31) << 1);
                f53841f = i86 % 128;
                if (i86 % 2 != 0) {
                    int i87 = 21 / 0;
                }
                return 409;
            case 9:
                atq atqVar10 = (atq) objArr[0];
                apk apkVar4 = (apk) objArr[1];
                apk apkVar5 = (apk) objArr[2];
                apk apkVar6 = (apk) objArr[3];
                int i88 = f53842g;
                int i89 = (((i88 & (-98)) | ((~i88) & 97)) - (~((i88 & 97) << 1))) - 1;
                f53841f = i89 % 128;
                int i90 = i89 % 2;
                apk compoundDrawableTintBlendMode2 = atqVar10.setCompoundDrawableTintBlendMode(apkVar4, apkVar5, apkVar6);
                if (i90 == 0) {
                    return compoundDrawableTintBlendMode2;
                }
                int i91 = 83 / 0;
                return compoundDrawableTintBlendMode2;
            case 10:
                atq atqVar11 = (atq) objArr[0];
                long[] jArr8 = (long[]) ave.setX(new Object[0], 1520214409, -1520214407, (int) System.currentTimeMillis());
                ato.setY(new Object[]{atqVar11.f53843e, jArr8}, 864873324, -864873323, (int) System.currentTimeMillis());
                atq atqVar12 = new atq(jArr8);
                int i92 = f53842g;
                int i93 = i92 ^ 107;
                int i94 = ((i92 & 107) | i93) << 1;
                int i95 = -i93;
                int i96 = ((i94 | i95) << 1) - (i94 ^ i95);
                f53841f = i96 % 128;
                if (i96 % 2 == 0) {
                    return atqVar12;
                }
                throw null;
            case 11:
                atq atqVar13 = (atq) objArr[0];
                int i97 = f53841f + 41;
                f53842g = i97 % 128;
                int i98 = i97 % 2;
                long[] jArr9 = atqVar13.f53843e;
                if (i98 == 0) {
                    ((Boolean) ave.setX(new Object[]{jArr9}, 13321272, -13321271, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                boolean zBooleanValue2 = ((Boolean) ave.setX(new Object[]{jArr9}, 13321272, -13321271, (int) System.currentTimeMillis())).booleanValue();
                int i99 = f53842g;
                int i100 = i99 ^ 33;
                int i101 = ((i99 & 33) | i100) << 1;
                int i102 = -i100;
                int i103 = (i101 ^ i102) + ((i101 & i102) << 1);
                f53841f = i103 % 128;
                if (i103 % 2 == 0) {
                    return Boolean.valueOf(zBooleanValue2);
                }
                throw null;
            case 12:
                atq atqVar14 = (atq) objArr[0];
                int i104 = f53842g;
                int i105 = i104 & 37;
                int i106 = -(-((i104 ^ 37) | i105));
                int i107 = (i105 ^ i106) + ((i106 & i105) << 1);
                f53841f = i107 % 128;
                int i108 = i107 % 2;
                long[] jArr10 = atqVar14.f53843e;
                if (i108 != 0) {
                    throw null;
                }
                BigInteger bigInteger = (BigInteger) ave.setX(new Object[]{jArr10}, -1987896608, 1987896613, (int) System.currentTimeMillis());
                int i109 = f53841f;
                int i110 = ((i109 | 47) << 1) - (i109 ^ 47);
                f53842g = i110 % 128;
                int i111 = i110 % 2;
                return bigInteger;
            case 13:
                atq atqVar15 = (atq) objArr[0];
                apk apkVar7 = (apk) objArr[1];
                int i112 = f53841f + 27;
                f53842g = i112 % 128;
                if (i112 % 2 == 0) {
                    atqVar15.setOnFocusChangeListener(apkVar7);
                    throw null;
                }
                apk onFocusChangeListener = atqVar15.setOnFocusChangeListener(apkVar7);
                int i113 = f53841f;
                int i114 = i113 & 93;
                int i115 = i114 + ((i113 ^ 93) | i114);
                f53842g = i115 % 128;
                if (i115 % 2 != 0) {
                    return onFocusChangeListener;
                }
                int i116 = 57 / 0;
                return onFocusChangeListener;
            case 14:
                atq atqVar16 = (atq) objArr[0];
                apk apkVar8 = (apk) objArr[1];
                apk apkVar9 = (apk) objArr[2];
                apk apkVar10 = (apk) objArr[3];
                long[] jArr11 = atqVar16.f53843e;
                long[] jArr12 = ((atq) apkVar8).f53843e;
                long[] jArr13 = ((atq) apkVar9).f53843e;
                long[] jArr14 = ((atq) apkVar10).f53843e;
                long[] jArr15 = (long[]) auy.setOnFocusChangeListener(new Object[]{13}, 1783230509, -1783230493, 13);
                ato.setY(new Object[]{jArr11, jArr12, jArr15}, 234880743, -234880738, (int) System.currentTimeMillis());
                ato.setY(new Object[]{jArr13, jArr14, jArr15}, 234880743, -234880738, (int) System.currentTimeMillis());
                long[] jArr16 = (long[]) ave.setX(new Object[0], 1520214409, -1520214407, (int) System.currentTimeMillis());
                ato.setY(new Object[]{jArr15, jArr16}, -323449892, 323449909, (int) System.currentTimeMillis());
                atqVar = new atq(jArr16);
                int i117 = f53842g;
                int i118 = i117 & 73;
                int i119 = (i117 | 73) & (~i118);
                int i120 = i118 << 1;
                int i121 = ((i119 | i120) << 1) - (i119 ^ i120);
                f53841f = i121 % 128;
                if (i121 % 2 != 0) {
                    throw null;
                }
                break;
            case 15:
                atq atqVar17 = (atq) objArr[0];
                int i122 = f53842g;
                int i123 = (i122 & 76) + (i122 | 76);
                int i124 = (i123 ^ (-1)) + (i123 << 1);
                f53841f = i124 % 128;
                int i125 = i124 % 2;
                long[] jArr17 = atqVar17.f53843e;
                if (i125 != 0) {
                    ((Boolean) ave.setX(new Object[]{jArr17}, -1712005618, 1712005622, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                boolean zBooleanValue3 = ((Boolean) ave.setX(new Object[]{jArr17}, -1712005618, 1712005622, (int) System.currentTimeMillis())).booleanValue();
                int i126 = f53841f + 47;
                f53842g = i126 % 128;
                if (i126 % 2 != 0) {
                    return Boolean.valueOf(zBooleanValue3);
                }
                throw null;
            case 16:
                int i127 = f53841f;
                int i128 = i127 & 5;
                int i129 = (((i127 | 5) & (~i128)) - (~(i128 << 1))) - 1;
                int i130 = i129 % 128;
                f53842g = i130;
                int i131 = i129 % 2;
                int i132 = ((i130 | 17) << 1) - (i130 ^ 17);
                f53841f = i132 % 128;
                int i133 = i132 % 2;
                return Boolean.TRUE;
            case 17:
                atq atqVar18 = (atq) objArr[0];
                long[] jArr18 = (long[]) ave.setX(new Object[0], 1520214409, -1520214407, (int) System.currentTimeMillis());
                ato.setY(new Object[]{atqVar18.f53843e, jArr18}, 339830776, -339830761, (int) System.currentTimeMillis());
                atq atqVar19 = new atq(jArr18);
                int i134 = f53841f;
                int i135 = i134 & 59;
                int i136 = i134 | 59;
                int i137 = ((i135 | i136) << 1) - (i136 ^ i135);
                f53842g = i137 % 128;
                if (i137 % 2 != 0) {
                    return atqVar19;
                }
                int i138 = 71 / 0;
                return atqVar19;
            case 18:
                atq atqVar20 = (atq) objArr[0];
                int i139 = f53841f;
                int i140 = (((i139 ^ 63) | (i139 & 63)) << 1) - ((i139 & (-64)) | (63 & (~i139)));
                f53842g = i140 % 128;
                int i141 = i140 % 2;
                long[] jArr19 = atqVar20.f53843e;
                if (i141 == 0) {
                    long j10 = jArr19[1];
                } else if ((jArr19[0] & 1) == 0) {
                    int i142 = i139 + 77;
                    f53842g = i142 % 128;
                    if (i142 % 2 == 0) {
                        int i143 = 88 / 0;
                    }
                    return Boolean.FALSE;
                }
                int i144 = i139 & 105;
                int i145 = (i144 - (~((i139 ^ 105) | i144))) - 1;
                f53842g = i145 % 128;
                if (i145 % 2 != 0) {
                    return Boolean.TRUE;
                }
                throw null;
            case 19:
                atq atqVar21 = (atq) objArr[0];
                apk apkVar11 = (apk) objArr[1];
                long[] jArr20 = (long[]) ave.setX(new Object[0], 1520214409, -1520214407, (int) System.currentTimeMillis());
                ato.setY(new Object[]{atqVar21.f53843e, ((atq) apkVar11).f53843e, jArr20}, 266129494, -266129490, (int) System.currentTimeMillis());
                atq atqVar22 = new atq(jArr20);
                int i146 = f53842g + 63;
                f53841f = i146 % 128;
                if (i146 % 2 == 0) {
                    return atqVar22;
                }
                throw null;
            case 20:
                atq atqVar23 = (atq) objArr[0];
                long[] jArr21 = (long[]) ave.setX(new Object[0], 1520214409, -1520214407, (int) System.currentTimeMillis());
                ato.setY(new Object[]{atqVar23.f53843e, jArr21}, 1725909959, -1725909951, (int) System.currentTimeMillis());
                atq atqVar24 = new atq(jArr21);
                int i147 = f53841f;
                int i148 = ((i147 ^ 81) | (i147 & 81)) << 1;
                int i149 = -(((~i147) & 81) | (i147 & (-82)));
                int i150 = ((i148 | i149) << 1) - (i149 ^ i148);
                f53842g = i150 % 128;
                if (i150 % 2 != 0) {
                    return atqVar24;
                }
                throw null;
            case 21:
                atq atqVar25 = (atq) objArr[0];
                long[] jArr22 = (long[]) ave.setX(new Object[0], 1520214409, -1520214407, (int) System.currentTimeMillis());
                ato.setY(new Object[]{atqVar25.f53843e, jArr22}, -663813650, 663813668, (int) System.currentTimeMillis());
                atq atqVar26 = new atq(jArr22);
                int i151 = f53842g;
                int i152 = (i151 ^ 27) + ((i151 & 27) << 1);
                f53841f = i152 % 128;
                if (i152 % 2 == 0) {
                    return atqVar26;
                }
                int i153 = 13 / 0;
                return atqVar26;
            case 22:
                atq atqVar27 = (atq) objArr[0];
                int i154 = f53841f;
                int i155 = (i154 & 89) + (i154 | 89);
                f53842g = i155 % 128;
                int i156 = i155 % 2;
                long[] jArr23 = atqVar27.f53843e;
                int iIntValue3 = ((Integer) (i156 == 0 ? bek.setOnFocusChangeListener(new Object[]{jArr23, 77}, -1971094880, 1971094881, 77) : bek.setOnFocusChangeListener(new Object[]{jArr23, 7}, -1971094880, 1971094881, 7))).intValue();
                int i157 = iIntValue3 & 4090087;
                int i158 = ((iIntValue3 ^ 4090087) | i157) & (~i157);
                int i159 = f53842g;
                int i160 = i159 & 33;
                int i161 = ((i159 ^ 33) | i160) << 1;
                int i162 = -((i159 | 33) & (~i160));
                int i163 = ((i161 | i162) << 1) - (i162 ^ i161);
                f53841f = i163 % 128;
                if (i163 % 2 == 0) {
                    return Integer.valueOf(i158);
                }
                throw null;
            default:
                atq atqVar28 = (atq) objArr[0];
                apk apkVar12 = (apk) objArr[1];
                long[] jArr24 = (long[]) ave.setX(new Object[0], 1520214409, -1520214407, (int) System.currentTimeMillis());
                ato.setY(new Object[]{atqVar28.f53843e, ((atq) apkVar12).f53843e, jArr24}, -1226536224, 1226536227, (int) System.currentTimeMillis());
                atq atqVar29 = new atq(jArr24);
                int i164 = f53841f + 79;
                f53842g = i164 % 128;
                if (i164 % 2 != 0) {
                    return atqVar29;
                }
                throw null;
        }
        return atqVar;
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final int UiMessageCallbackKtWhenMappings() {
        return ((Integer) setY(new Object[]{this}, -919595341, 919595345, System.identityHashCode(this))).intValue();
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setY(new Object[]{this, obj}, 1603824641, -1603824636, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean getNavBarTitleString() {
        return ((Boolean) setY(new Object[]{this}, -1144806395, 1144806410, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setY(new Object[]{this}, -397520854, 397520876, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setY(new Object[]{this}, -256991883, 256991901, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(int i10) {
        return (apk) setY(new Object[]{this, Integer.valueOf(i10)}, -1107756160, 1107756161, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, 847261883, -847261876, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final apk setIncludeFontPadding() {
        return (apk) setY(new Object[]{this}, -1416009738, 1416009755, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setNavigationOnClickListener() {
        return (apk) setY(new Object[]{this}, 1147720403, -1147720401, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setOnDragListener() {
        return ((Boolean) setY(new Object[]{this}, -1442604609, 1442604620, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnFocusChangeListener(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, 209053113, -209053094, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnLongClickListener() {
        return (apk) setY(new Object[]{this}, 662788594, -662788573, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setX() {
        return (apk) setY(new Object[]{this}, 468450485, -468450475, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final boolean setZ() {
        return ((Boolean) setY(new Object[]{this}, 456987484, -456987468, System.identityHashCode(this))).booleanValue();
    }

    public atq() {
        this.f53843e = (long[]) ave.setX(new Object[0], 1520214409, -1520214407, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar, apk apkVar2, apk apkVar3) {
        return (apk) setY(new Object[]{this, apkVar, apkVar2, apkVar3}, -445358640, 445358654, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding() {
        return (apk) setY(new Object[]{this}, 527629404, -527629384, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final int setOnFocusChangeListener() {
        return ((Integer) setY(new Object[]{this}, -1820417650, 1820417658, System.identityHashCode(this))).intValue();
    }

    public atq(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.f53843e = (long[]) ato.setY(new Object[]{bigInteger}, -1455580171, 1455580184, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, -2124545320, 2124545320, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setY(new Object[]{this}, 1016826150, -1016826138, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar, apk apkVar2) {
        return (apk) setY(new Object[]{this, apkVar, apkVar2}, 399329147, -399329141, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY() {
        return (apk) setY(new Object[]{this}, -622895406, 622895409, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar, apk apkVar2, apk apkVar3) {
        return (apk) setY(new Object[]{this, apkVar, apkVar2, apkVar3}, 12574109, -12574100, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, -698884661, 698884674, System.identityHashCode(this));
    }
}
