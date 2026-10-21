package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class dw {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f55264h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f55265i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f55266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f55267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f55268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public byte[] f55269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public byte[] f55270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public byte[] f55271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f55272g;

    public dw(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        ((Integer) setX(new Object[]{this, bArr}, -899990250, 899990255, (int) System.currentTimeMillis())).intValue();
    }

    public static /* synthetic */ Byte a(Object[] objArr) {
        dw dwVar = (dw) objArr[0];
        int i10 = f55264h;
        int i11 = ((i10 & (-54)) | ((~i10) & 53)) + ((i10 & 53) << 1);
        f55265i = i11 % 128;
        int i12 = i11 % 2;
        byte b10 = dwVar.f55268c;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i10 + 57;
        f55265i = i13 % 128;
        if (i13 % 2 != 0) {
            return Byte.valueOf(b10);
        }
        int i14 = 83 / 0;
        return Byte.valueOf(b10);
    }

    public static /* synthetic */ Object b(Object[] objArr) {
        dw dwVar = (dw) objArr[0];
        int i10 = f55264h;
        int i11 = ((i10 | 111) << 1) - (i10 ^ 111);
        int i12 = i11 % 128;
        f55265i = i12;
        int i13 = i11 % 2;
        byte[] bArr = dwVar.f55271f;
        if (i13 == 0) {
            int i14 = 6 / 0;
        }
        int i15 = i12 & 37;
        int i16 = ((((i12 ^ 37) | i15) << 1) - (~(-((i12 | 37) & (~i15))))) - 1;
        f55264h = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 52 / 0;
        }
        return bArr;
    }

    public static /* synthetic */ Byte c(Object[] objArr) {
        dw dwVar = (dw) objArr[0];
        int iIdentityHashCode = System.identityHashCode(dwVar);
        int i10 = ~iIdentityHashCode;
        int i11 = (iIdentityHashCode | i10) & i10;
        int i12 = i11 | 530047426;
        int i13 = i12 ^ 469748026;
        int i14 = i12 & 469748026;
        int i15 = (~((i14 & i13) | (i13 ^ i14))) * 52;
        int i16 = ((~i15) & (-2135773348)) | (2135773347 & i15);
        int i17 = (i15 & (-2135773348)) << 1;
        int i18 = (i16 & i17) + (i17 | i16);
        int i19 = (i11 & (-469748027)) | ((~i11) & (-469748027)) | (469748026 & i11);
        int i20 = ~i19;
        int i21 = (i19 | i20) & i20;
        int i22 = (i21 & 6817848) | (i21 ^ 6817848);
        int i23 = ~((530047426 & i10) | (i10 ^ 530047426));
        int i24 = ((~i23) & i22) | ((~i22) & i23);
        int i25 = i22 & i23;
        int i26 = -(-(((i25 & i24) | (i24 ^ i25)) * (-52)));
        int i27 = (i18 & i26) + (i26 | i18);
        int i28 = (-530047427) & i10;
        int i29 = ~((((-530047427) | i10) & (~i28)) | i28);
        int i30 = i29 ^ 67117248;
        int i31 = i29 & 67117248;
        int i32 = -(~(-(-(((i31 & i30) | (i30 ^ i31)) * 52))));
        int i33 = (i27 & i32) + (i32 | i27);
        int i34 = (i33 ^ (-1)) + (i33 << 1);
        int iIdentityHashCode2 = System.identityHashCode(dwVar);
        int i35 = (2139883534 ^ iIdentityHashCode2) | (2139883534 & iIdentityHashCode2);
        int i36 = ~i35;
        int i37 = (i35 | i36) & i36;
        int i38 = ~iIdentityHashCode2;
        int i39 = i38 & (-1008506499);
        int i40 = ~i38;
        int i41 = (1008506498 & i40) | i39;
        int i42 = 1008506498 & i38;
        int i43 = ~((i41 & i42) | (i41 ^ i42));
        int i44 = ((~i43) & i37) | ((~i37) & i43);
        int i45 = i37 & i43;
        int i46 = (i45 & i44) | (i44 ^ i45);
        int i47 = (i38 | iIdentityHashCode2) & i38;
        int i48 = ~((i47 & (-2139883535)) | (i47 ^ (-2139883535)));
        int i49 = ((~i48) & i46) | ((~i46) & i48);
        int i50 = i46 & i48;
        int i51 = -(-(((i50 & i49) | (i49 ^ i50)) * (-516)));
        int i52 = 2091971119 & i51;
        int i53 = i52 + ((i51 ^ 2091971119) | i52);
        int i54 = (-1087105) ^ iIdentityHashCode2;
        int i55 = iIdentityHashCode2 & (-1087105);
        int i56 = (i55 & i54) | (i54 ^ i55);
        int i57 = ~i56;
        int i58 = (i56 | i57) & i57;
        int i59 = ((-1008506499) & i40) | i42 | i39;
        int i60 = (2139883534 & i59) | ((~i59) & (-2139883535));
        int i61 = i59 & (-2139883535);
        int i62 = ~((i60 & i61) | (i60 ^ i61));
        int i63 = i58 & i62;
        int i64 = (i58 | i62) & (~i63);
        int i65 = (-2) - ((i53 - (~(-(-(((i64 & i63) | (i64 ^ i63)) * LibMCryptConstants.IND_HEX_SEGMENTO2))))) ^ (-1));
        int i66 = (i38 ^ (-2139883535)) | (i38 & (-2139883535));
        int i67 = ~i66;
        int i68 = (i66 | i67) & i67;
        int i69 = -(-(((i68 & 1007419394) | (1007419394 ^ i68)) * LibMCryptConstants.IND_HEX_SEGMENTO2));
        int i70 = (i65 & i69) + (i65 | i69);
        byte b10 = dwVar.f55267b;
        if (i34 <= i70) {
            int i71 = 72 / 0;
        }
        return Byte.valueOf(b10);
    }

    public static /* synthetic */ Object d(Object[] objArr) {
        dw dwVar = (dw) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i10 = f55264h;
        int i11 = i10 & 75;
        int i12 = i11 + ((i10 ^ 75) | i11);
        f55265i = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        byte[] bArr2 = (byte[]) setInputExtras.setDividerPadding(new Object[]{CollectionsKt__CollectionsKt.listOf((Object[]) new byte[][]{new byte[]{dwVar.f55267b, dwVar.f55268c}, dwVar.f55269d, dwVar.f55270e, bArr})}, -822524174, 822524177, (int) System.currentTimeMillis());
        int i14 = f55265i;
        int i15 = (((i14 ^ 65) | (i14 & 65)) << 1) - (((~i14) & 65) | (i14 & (-66)));
        f55264h = i15 % 128;
        if (i15 % 2 == 0) {
            return bArr2;
        }
        throw null;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~((~i10) | i11);
        int i14 = ((i12 | i13) * 988) + (i11 * 989) + (i10 * (-1975));
        int i15 = ~i11;
        int i16 = ~(i15 | i10);
        int i17 = ~i12;
        switch ((((~(i11 | i17)) | (~(i12 | i15)) | i13) * 988) + (((~(i10 | i17)) | i16) * (-1976)) + i14) {
            case 1:
                return a(objArr);
            case 2:
                dw dwVar = (dw) objArr[0];
                int i18 = f55265i;
                int i19 = i18 & 101;
                int i20 = i19 + ((i18 ^ 101) | i19);
                int i21 = i20 % 128;
                f55264h = i21;
                int i22 = i20 % 2;
                byte b10 = dwVar.f55266a;
                int i23 = i21 & 39;
                int i24 = -(-((i21 ^ 39) | i23));
                int i25 = (i23 & i24) + (i24 | i23);
                f55265i = i25 % 128;
                int i26 = i25 % 2;
                return Byte.valueOf(b10);
            case 3:
                dw dwVar2 = (dw) objArr[0];
                int i27 = f55264h;
                int i28 = (i27 | 79) << 1;
                int i29 = -(i27 ^ 79);
                int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                int i31 = i30 % 128;
                f55265i = i31;
                int i32 = i30 % 2;
                byte[] bArr = dwVar2.f55269d;
                int i33 = ((i31 ^ 125) - (~((i31 & 125) << 1))) - 1;
                f55264h = i33 % 128;
                int i34 = i33 % 2;
                return bArr;
            case 4:
                dw dwVar3 = (dw) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i35 = f55265i + 39;
                f55264h = i35 % 128;
                int i36 = i35 % 2;
                Intrinsics.checkNotNullParameter(bArr2, "");
                dwVar3.f55266a = bArr2[0];
                dwVar3.f55267b = bArr2[1];
                dwVar3.f55268c = bArr2[2];
                dwVar3.f55269d = ArraysKt___ArraysKt.sliceArray(bArr2, c.until(3, 5));
                int length = bArr2.length;
                int i37 = ((length ^ (-25)) + ((length & (-25)) << 1)) - 1;
                int i38 = ~i37;
                int i39 = (i38 | i37) & i38;
                int i40 = ~((i39 & 5) | ((~i39) & (-6)) | (i39 & (-6)));
                int i41 = ~iIntValue;
                int i42 = ~i41;
                int i43 = (i41 ^ i37) | (i41 & i37);
                int i44 = i43 & 5;
                int i45 = (i43 | 5) & (~i44);
                int i46 = ~((i45 & i44) | (i45 ^ i44));
                int i47 = i40 & i46;
                int i48 = (i40 | i46) & (~i47);
                int i49 = ((i37 * 829) + 4145) - (~(((i48 & i47) | (i48 ^ i47)) * (-828)));
                int i50 = (i49 ^ (-1)) + (i49 << 1);
                int i51 = (i37 & (-6)) | (i38 & 5);
                int i52 = i37 & 5;
                int i53 = (i51 & i52) | (i51 ^ i52);
                int i54 = (i41 | iIntValue) & i41;
                int i55 = ((~i54) & i53) | ((~i53) & i54);
                int i56 = i53 & i54;
                int i57 = ((i56 & i55) | (i55 ^ i56)) * (-828);
                int i58 = (((i50 ^ i57) | (i50 & i57)) << 1) - ((i57 & (~i50)) | ((~i57) & i50));
                int i59 = (i37 ^ 5) | i52;
                int i60 = ~i59;
                int i61 = ((i59 | i60) & i60) * 828;
                int i62 = ((i58 ^ i61) | (i58 & i61)) << 1;
                int i63 = -((i61 & (~i58)) | ((~i61) & i58));
                dwVar3.f55270e = ArraysKt___ArraysKt.sliceArray(bArr2, c.until(5, (i62 ^ i63) + ((i63 & i62) << 1)));
                int i64 = i37 * 306;
                int i65 = 2140 & i64;
                int i66 = (((2140 ^ i64) | i65) << 1) - ((i64 | 2140) & (~i65));
                int i67 = (~i52) & (5 | i37);
                int i68 = (i67 & i52) | (i67 ^ i52);
                int i69 = ~i68;
                int i70 = (i68 | i69) & i69;
                int i71 = iIntValue & 5;
                int i72 = i71 | ((~i71) & (iIntValue | 5));
                int i73 = ~i72;
                int i74 = (i72 | i73) & i73;
                int i75 = i70 & i74;
                int i76 = (i70 | i74) & (~i75);
                int i77 = ((i76 & i75) | (i76 ^ i75)) * 305;
                int i78 = i66 & i77;
                int i79 = (i77 ^ i66) | i78;
                int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
                int i81 = i41 ^ 5;
                int i82 = i41 & 5;
                int i83 = (i81 & i82) | (i81 ^ i82);
                int i84 = ~i83;
                int i85 = (i83 | i84) & i84;
                int i86 = -(-(((i85 & i39) | (i39 ^ i85)) * 305));
                int i87 = i80 & i86;
                int i88 = (i86 | i80) & (~i87);
                int i89 = i87 << 1;
                int i90 = ((i88 | i89) << 1) - (i88 ^ i89);
                int i91 = i90 * (-209);
                int i92 = (((((-4180) ^ i91) | ((-4180) & i91)) << 1) - (~(-((i91 & 4179) | ((-4180) & (~i91)))))) - 1;
                int i93 = ~i90;
                int i94 = (-21) & i93;
                int i95 = (~i94) & ((-21) | i93);
                int i96 = -(-((~((i94 & i95) | (i95 ^ i94))) * ErrorCodes.ERR_CRY_IO_PROPERTIES));
                int i97 = ((i92 ^ i96) | (i92 & i96)) << 1;
                int i98 = -(((~i92) & i96) | ((~i96) & i92));
                int i99 = ((i97 | i98) << 1) - (i98 ^ i97);
                int i100 = (i93 & i42) | ((~i93) & i41) | (i93 & i41);
                int i101 = ~i100;
                int i102 = (i100 | i101) & i101;
                int i103 = ~(((-21) ^ iIntValue) | ((-21) & iIntValue));
                int i104 = i102 ^ i103;
                int i105 = i102 & i103;
                int i106 = ((i105 & i104) | (i104 ^ i105)) * ErrorCodes.ERR_CRY_IO_PROPERTIES;
                int i107 = i99 | i106;
                int i108 = ((i107 << 1) - (~(-((~(i106 & i99)) & i107)))) - 1;
                int i109 = (-21) ^ i54;
                int i110 = (-21) & i54;
                int i111 = (i110 & i109) | (i109 ^ i110) | i90;
                int i112 = ~i111;
                int i113 = (i111 | i112) & i112;
                int i114 = i93 & 20;
                int i115 = (i93 | 20) & (~i114);
                int i116 = (i115 & i114) | (i115 ^ i114);
                int i117 = i116 & iIntValue;
                int i118 = (i116 | iIntValue) & (~i117);
                int i119 = ~((i118 & i117) | (i118 ^ i117));
                dwVar3.f55271f = ArraysKt___ArraysKt.sliceArray(bArr2, c.until(i90, (((i119 & i113) | (i113 ^ i119)) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + i108));
                int i120 = i90 & 20;
                int i121 = i120 + ((i90 ^ 20) | i120);
                dwVar3.f55272g = bArr2[i121];
                int i122 = -(-(i121 * (-661)));
                int i123 = (((-661) | i122) << 1) - (i122 ^ (-661));
                int i124 = ~i121;
                int i125 = (i124 | i121) & i124;
                int i126 = i125 & 1;
                int i127 = ((~i125) & (-2)) | i126 | ((-2) & i125);
                int i128 = ~i127;
                int i129 = (i127 | i128) & i128;
                int i130 = i41 & i129;
                int i131 = (((i129 | i41) & (~i130)) | i130) * 1324;
                int i132 = (((~i131) & i123) | ((~i123) & i131)) + ((i123 & i131) << 1);
                int i133 = ~((i41 & 1) | (iIntValue & (-2)) | (iIntValue & 1));
                int i134 = (i124 & iIntValue) | (i121 & i41);
                int i135 = iIntValue & i121;
                int i136 = (i135 & i134) | (i134 ^ i135);
                int i137 = ~i136;
                int i138 = (i136 | i137) & i137;
                int i139 = i133 & i138;
                int i140 = -(-((((i138 | i133) & (~i139)) | i139) * (-1324)));
                int i141 = (i132 & i140) + (i140 | i132);
                int i142 = ~((-2) | i121);
                int i143 = i125 ^ 1;
                int i144 = ~((i143 & i126) | (i143 ^ i126));
                int i145 = i142 ^ i144;
                int i146 = i142 & i144;
                int i147 = -(-(((i146 & i145) | (i145 ^ i146)) * 662));
                int i148 = ((i141 | i147) << 1) - (i147 ^ i141);
                int i149 = f55265i + 125;
                f55264h = i149 % 128;
                int i150 = i149 % 2;
                return Integer.valueOf(i148);
            case 5:
                dw dwVar4 = (dw) objArr[0];
                byte[] bArr3 = (byte[]) objArr[1];
                int i151 = f55265i;
                int i152 = (i151 ^ 100) + ((i151 & 100) << 1);
                int i153 = (i152 ^ (-1)) + (i152 << 1);
                f55264h = i153 % 128;
                int i154 = i153 % 2;
                int iIntValue2 = ((Integer) setX(new Object[]{dwVar4, bArr3, 0}, 1565883428, -1565883424, 0)).intValue();
                int i155 = f55265i + 39;
                f55264h = i155 % 128;
                int i156 = i155 % 2;
                return Integer.valueOf(iIntValue2);
            case 6:
                return b(objArr);
            case 7:
                dw dwVar5 = (dw) objArr[0];
                int i157 = f55265i;
                int i158 = i157 & 51;
                int i159 = (((i157 ^ 51) | i158) << 1) - ((i157 | 51) & (~i158));
                f55264h = i159 % 128;
                int i160 = i159 % 2;
                byte b11 = dwVar5.f55272g;
                System.identityHashCode(dwVar5);
                System.identityHashCode(dwVar5);
                return Byte.valueOf(b11);
            case 8:
                return d(objArr);
            default:
                return c(objArr);
        }
    }

    public final byte setCompoundDrawableTintBlendMode() {
        return ((Byte) setX(new Object[]{this}, 1316271760, -1316271760, System.identityHashCode(this))).byteValue();
    }

    public final byte setDividerPadding() {
        return ((Byte) setX(new Object[]{this}, 1856901440, -1856901438, System.identityHashCode(this))).byteValue();
    }

    public final byte setOnDragListener() {
        return ((Byte) setX(new Object[]{this}, -1659590139, 1659590146, System.identityHashCode(this))).byteValue();
    }

    @Nullable
    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setX(new Object[]{this}, 1681307825, -1681307822, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setY(@NotNull byte[] bArr) {
        return (byte[]) setX(new Object[]{this, bArr}, 556876150, -556876142, System.identityHashCode(this));
    }

    public final byte setY() {
        return ((Byte) setX(new Object[]{this}, 520091065, -520091064, System.identityHashCode(this))).byteValue();
    }

    @Nullable
    public final byte[] setX() {
        return (byte[]) setX(new Object[]{this}, 184917073, -184917067, System.identityHashCode(this));
    }
}
