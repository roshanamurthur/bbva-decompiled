package com.mypinpad.tsdk.isolation;

import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class dt extends dp {
    public static int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f55248n = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f55249h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f55250i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f55251j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f55252k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f55253l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt(@Nullable byte[] bArr, @NotNull dk dkVar) {
        super(bArr);
        Intrinsics.checkNotNullParameter(dkVar, "");
        if (Intrinsics.areEqual(dkVar, dq.INSTANCE)) {
            Intrinsics.checkNotNull(bArr);
            int x4 = setX();
            setDividerPadding(new Object[]{this, bArr, Integer.valueOf(x4)}, 1863441809, -1863441801, x4);
        }
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        int i13 = ~i11;
        int i14 = ~i12;
        switch ((((~(i10 | i14)) | (~(i13 | i12))) * 979) + ((i10 | i12) * (-979)) + ((~(i13 | i14)) * 979) + (i11 * (-978)) + (i10 * 980)) {
            case 1:
                dt dtVar = (dt) objArr[0];
                int i15 = f55248n;
                int i16 = i15 + 99;
                m = i16 % 128;
                int i17 = i16 % 2;
                bArr = dtVar.f55249h;
                if (bArr == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i18 = f55248n;
                    int i19 = ((i18 | 11) << 1) - (i18 ^ 11);
                    m = i19 % 128;
                    if (i19 % 2 != 0) {
                        throw null;
                    }
                    return null;
                }
                int i20 = i15 & 79;
                int i21 = -(-((i15 ^ 79) | i20));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                int i23 = i22 % 128;
                m = i23;
                if (i22 % 2 != 0) {
                    throw null;
                }
                int i24 = i23 ^ 53;
                int i25 = ((i23 & 53) | i24) << 1;
                int i26 = -i24;
                int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                f55248n = i27 % 128;
                int i28 = i27 % 2;
                return bArr;
            case 2:
                dt dtVar2 = (dt) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int i29 = m + 87;
                f55248n = i29 % 128;
                if (i29 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(bArr2, "");
                    dtVar2.f55250i = bArr2;
                    return null;
                }
                Intrinsics.checkNotNullParameter(bArr2, "");
                dtVar2.f55250i = bArr2;
                throw null;
            case 3:
                dt dtVar3 = (dt) objArr[0];
                byte[] bArr3 = (byte[]) objArr[1];
                int i30 = m;
                int i31 = ((i30 ^ 79) - (~(-(-((i30 & 79) << 1))))) - 1;
                f55248n = i31 % 128;
                int i32 = i31 % 2;
                Intrinsics.checkNotNullParameter(bArr3, "");
                dtVar3.f55253l = bArr3;
                int i33 = m;
                int i34 = ((i33 ^ 59) - (~((i33 & 59) << 1))) - 1;
                f55248n = i34 % 128;
                if (i34 % 2 == 0) {
                    int i35 = 90 / 0;
                }
                return null;
            case 4:
                dt dtVar4 = (dt) objArr[0];
                byte[] bArr4 = (byte[]) objArr[1];
                int i36 = f55248n;
                int i37 = i36 & 81;
                int i38 = (((i36 ^ 81) | i37) << 1) - ((~i37) & (i36 | 81));
                m = i38 % 128;
                int i39 = i38 % 2;
                Intrinsics.checkNotNullParameter(bArr4, "");
                dtVar4.f55252k = bArr4;
                int i40 = ((-1) << 1) - ((m + 122) ^ (-1));
                f55248n = i40 % 128;
                int i41 = i40 % 2;
                return null;
            case 5:
                dt dtVar5 = (dt) objArr[0];
                int i42 = f55248n + 39;
                int i43 = i42 % 128;
                m = i43;
                int i44 = i42 % 2;
                bArr = dtVar5.f55252k;
                if (bArr == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i45 = m;
                    int i46 = i45 & 61;
                    int i47 = (i45 | 61) & (~i46);
                    int i48 = i46 << 1;
                    int i49 = (i47 & i48) + (i47 | i48);
                    f55248n = i49 % 128;
                    int i50 = i49 % 2;
                    return null;
                }
                int i51 = i43 + 77;
                f55248n = i51 % 128;
                int i52 = i51 % 2;
                int i53 = i43 & 7;
                int i54 = ((i43 ^ 7) | i53) << 1;
                int i55 = -((i43 | 7) & (~i53));
                int i56 = ((i54 | i55) << 1) - (i54 ^ i55);
                f55248n = i56 % 128;
                if (i56 % 2 == 0) {
                    throw null;
                }
                return bArr;
            case 6:
                dt dtVar6 = (dt) objArr[0];
                int i57 = m;
                int i58 = i57 ^ 73;
                int i59 = ((i57 & 73) | i58) << 1;
                int i60 = -i58;
                int i61 = ((i59 | i60) << 1) - (i59 ^ i60);
                int i62 = i61 % 128;
                f55248n = i62;
                int i63 = i61 % 2;
                bArr = dtVar6.f55250i;
                if (bArr == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i64 = f55248n;
                    int i65 = i64 ^ 37;
                    int i66 = (((i64 & 37) | i65) << 1) - i65;
                    m = i66 % 128;
                    int i67 = i66 % 2;
                    return null;
                }
                int i68 = (((73 & (~i62)) | (i62 & (-74))) - (~((i62 & 73) << 1))) - 1;
                m = i68 % 128;
                int i69 = i68 % 2;
                int i70 = (i62 ^ 63) + ((i62 & 63) << 1);
                m = i70 % 128;
                if (i70 % 2 != 0) {
                    int i71 = 64 / 0;
                }
                return bArr;
            case 7:
                dt dtVar7 = (dt) objArr[0];
                byte[] bArr5 = (byte[]) objArr[1];
                int i72 = m;
                int i73 = i72 & 57;
                int i74 = ((i72 | 57) & (~i73)) + (i73 << 1);
                f55248n = i74 % 128;
                int i75 = i74 % 2;
                Intrinsics.checkNotNullParameter(bArr5, "");
                dtVar7.f55251j = bArr5;
                int i76 = m;
                int i77 = ((i76 | 45) << 1) - (i76 ^ 45);
                f55248n = i77 % 128;
                if (i77 % 2 == 0) {
                    int i78 = 39 / 0;
                }
                return null;
            case 8:
                dt dtVar8 = (dt) objArr[0];
                byte[] bArr6 = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i79 = m;
                int i80 = i79 & 65;
                int i81 = ((i79 | 65) & (~i80)) + (i80 << 1);
                f55248n = i81 % 128;
                int i82 = i81 % 2;
                int i83 = (-437) - (~(iIntValue * 111));
                int i84 = ~iIntValue;
                int i85 = iIntValue & i84;
                int i86 = i85 | i85;
                int i87 = iIntValue & iIntValue;
                int i88 = (i86 & i87) | (i86 ^ i87);
                int i89 = ~i88;
                int i90 = (i88 | i89) & i89;
                int i91 = ((~i90) & (-5)) | (i90 & 4);
                int i92 = i90 & (-5);
                int i93 = -(~(-(-(((i92 & i91) | (i91 ^ i92)) * (-220)))));
                int i94 = ((i83 & i93) + (i83 | i93)) - 1;
                int i95 = i84 & 4;
                int i96 = iIntValue & (-5);
                int i97 = i95 | i96;
                int i98 = iIntValue & 4;
                int i99 = ~((i97 ^ i98) | (i97 & i98));
                int i100 = iIntValue ^ iIntValue;
                int i101 = ~((i100 ^ i87) | (i100 & i87));
                int i102 = i99 & i101;
                int i103 = (~i102) & (i101 | i99);
                int i104 = -(~(-(-(((i103 & i102) | (i103 ^ i102)) * 220))));
                int i105 = (((i94 | i104) << 1) - (i104 ^ i94)) - 1;
                int i106 = (-5) & i84;
                int i107 = i106 | i98;
                int i108 = (i96 & i107) | (i107 ^ i96);
                int i109 = ~i108;
                int i110 = (i108 | i109) & i109;
                int i111 = i84 ^ 4;
                int i112 = ~((i111 ^ i95) | (i111 & i95));
                int i113 = i110 ^ i112;
                int i114 = i110 & i112;
                int i115 = ((i114 & i113) | (i113 ^ i114)) * 110;
                int i116 = i105 & i115;
                setDividerPadding(new Object[]{dtVar8, ArraysKt___ArraysKt.sliceArray(bArr6, c.until(iIntValue, (((i105 | i115) & (~i116)) - (~(i116 << 1))) - 1))}, -1259173696, 1259173696, System.identityHashCode(dtVar8));
                int i117 = i98 - (~(iIntValue | 4));
                int i118 = i117 - 1;
                int i119 = i118 * 53;
                int i120 = (-204) & i119;
                int i121 = (((-204) ^ i119) | i120) << 1;
                int i122 = -((~i120) & (i119 | (-204)));
                int i123 = (i121 ^ i122) + ((i122 & i121) << 1);
                int i124 = (i84 | iIntValue) & i84;
                int i125 = i124 ^ 4;
                int i126 = i124 & 4;
                int i127 = (i125 ^ i126) | (i125 & i126);
                int i128 = (i127 & i118) | (i127 ^ i118);
                int i129 = ~i128;
                int i130 = ((i128 | i129) & i129) * 52;
                int i131 = ((i123 ^ i130) | (i123 & i130)) << 1;
                int i132 = -(((~i130) & i123) | ((~i123) & i130));
                int i133 = (i131 & i132) + (i132 | i131);
                int i134 = ~i118;
                int i135 = i134 & i124;
                int i136 = (~i135) & (i134 | i124);
                int i137 = ~((i136 ^ i135) | (i135 & i136));
                int i138 = i134 & 4;
                int i139 = (~i138) & (i134 | 4);
                int i140 = ~((i139 ^ i138) | (i139 & i138));
                int i141 = i137 & i140;
                int i142 = (~i141) & (i137 | i140);
                int i143 = (i142 & i141) | (i142 ^ i141);
                int i144 = ~(i95 | i111);
                int i145 = i143 ^ i144;
                int i146 = i143 & i144;
                int i147 = i133 - (~(((i146 & i145) | (i145 ^ i146)) * (-52)));
                int i148 = (i147 ^ (-1)) + (i147 << 1);
                int i149 = i106 | ((-5) ^ i84);
                int i150 = ~i149;
                int i151 = (i149 | i150) & i150;
                int i152 = (i134 & (-5)) | (i118 & 4);
                int i153 = (-5) & i118;
                int i154 = ~((i152 & i153) | (i152 ^ i153));
                int i155 = i151 & i154;
                int i156 = (i151 | i154) & (~i155);
                int i157 = ((i156 & i155) | (i156 ^ i155)) * 52;
                setDividerPadding(new Object[]{dtVar8, ArraysKt___ArraysKt.sliceArray(bArr6, c.until(i118, ((i148 ^ i157) - (~((i157 & i148) << 1))) - 1))}, -1710228917, 1710228919, System.identityHashCode(dtVar8));
                int i158 = (-2) - ((-1) ^ (i117 + 99));
                int i159 = i158 & (-95);
                int i160 = (i158 ^ (-95)) | i159;
                int i161 = ((i159 | i160) << 1) - (i160 ^ i159);
                int i162 = -(~(i161 * (-755)));
                int i163 = (((-1510) ^ i162) + ((i162 & (-1510)) << 1)) - 1;
                int i164 = ~i161;
                int i165 = (-3) ^ i164;
                int i166 = i164 & (-3);
                int i167 = (i163 - (~(-(-((~(i165 | i166)) * 1512))))) - 1;
                int i168 = (i166 & i165) | (i165 ^ i166);
                int i169 = ~i168;
                int i170 = (i168 | i169) & i169;
                int i171 = (i161 ^ 2) | (i161 & 2);
                int i172 = i171 ^ iIntValue;
                int i173 = i171 & iIntValue;
                int i174 = (i172 & i173) | (i172 ^ i173);
                int i175 = ~i174;
                int i176 = (i174 | i175) & i175;
                int i177 = i170 & i176;
                int i178 = (i170 | i176) & (~i177);
                int i179 = -(-(((i178 & i177) | (i178 ^ i177)) * (-756)));
                int i180 = i167 & i179;
                int i181 = (((i167 ^ i179) | i180) << 1) - ((i179 | i167) & (~i180));
                int i182 = i171 & i124;
                int i183 = (((i124 | i171) & (~i182)) | i182) * 756;
                int i184 = i181 & i183;
                setDividerPadding(new Object[]{dtVar8, ArraysKt___ArraysKt.sliceArray(bArr6, c.until(i161, (i184 - (~(-(-((i183 ^ i181) | i184))))) - 1))}, 80723173, -80723166, System.identityHashCode(dtVar8));
                int i185 = i161 + 2;
                setDividerPadding(new Object[]{dtVar8, ArraysKt___ArraysKt.sliceArray(bArr6, c.until(i185, i161 + 4))}, 144458468, -144458464, System.identityHashCode(dtVar8));
                int i186 = (i185 & 24) + (i185 | 24);
                int i187 = (i186 ^ (-22)) + ((i186 & (-22)) << 1);
                int i188 = i187 * 246;
                int i189 = (-488) ^ i188;
                int i190 = ((i188 & (-488)) | i189) << 1;
                int i191 = -i189;
                int i192 = (i190 ^ i191) + ((i190 & i191) << 1);
                int i193 = ~i187;
                int i194 = (i193 | i187) & i193;
                int i195 = ~((i194 & i84) | (i194 ^ i84));
                int i196 = ~((i193 ^ 2) | (i193 & 2));
                int i197 = i195 & i196;
                int i198 = (i195 | i196) & (~i197);
                int i199 = -(~(((i198 & i197) | (i198 ^ i197)) * (-245)));
                int i200 = ((i192 & i199) + (i199 | i192)) - 1;
                int i201 = i193 ^ iIntValue;
                int i202 = iIntValue & i193;
                int i203 = (i201 ^ i202) | (i201 & i202);
                int i204 = ~i203;
                int i205 = (i200 - (~(-(-(((i203 | i204) & i204) * (-245)))))) - 1;
                int i206 = ~(i202 | i201);
                int i207 = ((i206 & 2) | ((~i206) & 2) | (i206 & (-3))) * 245;
                int i208 = i205 & i207;
                int i209 = (i207 ^ i205) | i208;
                setDividerPadding(new Object[]{dtVar8, ArraysKt___ArraysKt.sliceArray(bArr6, c.until(i187, (i208 & i209) + (i209 | i208)))}, -1587201907, 1587201910, System.identityHashCode(dtVar8));
                int i210 = f55248n;
                int i211 = i210 ^ 89;
                int i212 = ((i210 & 89) | i211) << 1;
                int i213 = -i211;
                int i214 = (i212 & i213) + (i212 | i213);
                m = i214 % 128;
                if (i214 % 2 != 0) {
                    throw null;
                }
                return null;
            case 9:
                dt dtVar9 = (dt) objArr[0];
                int i215 = m;
                int i216 = i215 + 52;
                int i217 = (i216 ^ (-1)) + (i216 << 1);
                f55248n = i217 % 128;
                int i218 = i217 % 2;
                bArr = dtVar9.f55253l;
                if (bArr == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i219 = m;
                    int i220 = i219 & 71;
                    int i221 = -(-((i219 ^ 71) | i220));
                    int i222 = (i220 ^ i221) + ((i221 & i220) << 1);
                    f55248n = i222 % 128;
                    int i223 = i222 % 2;
                    return null;
                }
                int i224 = i215 | 57;
                int i225 = i224 << 1;
                int i226 = -(i224 & (~(i215 & 57)));
                int i227 = (i225 ^ i226) + ((i226 & i225) << 1);
                f55248n = i227 % 128;
                int i228 = i227 % 2;
                int i229 = i215 + 121;
                f55248n = i229 % 128;
                if (i229 % 2 == 0) {
                    int i230 = 1 / 0;
                }
                return bArr;
            case 10:
                dt dtVar10 = (dt) objArr[0];
                int i231 = m;
                int i232 = i231 & 63;
                int i233 = (~i232) & (i231 | 63);
                int i234 = -(-(i232 << 1));
                int i235 = (i233 & i234) + (i234 | i233);
                f55248n = i235 % 128;
                int i236 = i235 % 2;
                bArr = dtVar10.f55251j;
                if (bArr == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i237 = m + 75;
                    f55248n = i237 % 128;
                    if (i237 % 2 != 0) {
                        return null;
                    }
                    int i238 = 73 / 0;
                    return null;
                }
                int i239 = i231 & 9;
                int i240 = i239 + ((i231 ^ 9) | i239);
                int i241 = i240 % 128;
                f55248n = i241;
                int i242 = i240 % 2;
                int i243 = i241 + 77;
                m = i243 % 128;
                int i244 = i243 % 2;
                return bArr;
            default:
                dt dtVar11 = (dt) objArr[0];
                byte[] bArr7 = (byte[]) objArr[1];
                int i245 = f55248n;
                int i246 = i245 & 59;
                int i247 = -(-((i245 ^ 59) | i246));
                int i248 = (i246 ^ i247) + ((i247 & i246) << 1);
                m = i248 % 128;
                if (i248 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(bArr7, "");
                    dtVar11.f55249h = bArr7;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(bArr7, "");
                dtVar11.f55249h = bArr7;
                int i249 = m;
                int i250 = ((i249 | 61) << 1) - (i249 ^ 61);
                f55248n = i250 % 128;
                int i251 = i250 % 2;
                return null;
        }
    }

    @NotNull
    public final byte[] getNavBarTitleString() {
        return (byte[]) setDividerPadding(new Object[]{this}, 127809680, -127809670, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setLayoutAnimation() {
        return (byte[]) setDividerPadding(new Object[]{this}, -759643170, 759643171, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setNavigationOnClickListener() {
        return (byte[]) setDividerPadding(new Object[]{this}, 1311464631, -1311464625, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setOnDragListener() {
        return (byte[]) setDividerPadding(new Object[]{this}, -1735412988, 1735412997, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setOnLongClickListener() {
        return (byte[]) setDividerPadding(new Object[]{this}, -1448073891, 1448073896, System.identityHashCode(this));
    }
}
