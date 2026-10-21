package com.mypinpad.tsdk.isolation;

import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class dr {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f55238i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f55239j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f55240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f55241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f55242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public byte[] f55244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public byte[] f55245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f55246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f55247h;

    public dr(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        ((Integer) setX(new Object[]{this, bArr}, 24940858, -24940855, (int) System.currentTimeMillis())).intValue();
    }

    public static /* synthetic */ Byte a(Object[] objArr) {
        dr drVar = (dr) objArr[0];
        int i10 = f55239j + 55;
        int i11 = i10 % 128;
        f55238i = i11;
        int i12 = i10 % 2;
        byte b10 = drVar.f55241b;
        if (i12 != 0) {
            throw null;
        }
        int i13 = i11 & 89;
        int i14 = (((i11 | 89) & (~i13)) - (~(i13 << 1))) - 1;
        f55239j = i14 % 128;
        int i15 = i14 % 2;
        return Byte.valueOf(b10);
    }

    public static /* synthetic */ Byte b(Object[] objArr) {
        dr drVar = (dr) objArr[0];
        int i10 = f55239j;
        int i11 = i10 & 79;
        int i12 = i10 | 79;
        int i13 = (i11 & i12) + (i11 | i12);
        f55238i = i13 % 128;
        int i14 = i13 % 2;
        byte b10 = drVar.f55247h;
        if (i14 != 0) {
            throw null;
        }
        int i15 = i10 + 67;
        f55238i = i15 % 128;
        if (i15 % 2 == 0) {
            return Byte.valueOf(b10);
        }
        throw null;
    }

    public static /* synthetic */ Object c(Object[] objArr) {
        dr drVar = (dr) objArr[0];
        int i10 = f55239j;
        int i11 = ((i10 ^ 56) + ((i10 & 56) << 1)) - 1;
        f55238i = i11 % 128;
        int i12 = i11 % 2;
        byte[] bArr = drVar.f55246g;
        if (bArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i13 = f55239j + 60;
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            f55238i = i14 % 128;
            int i15 = i14 % 2;
            return null;
        }
        int i16 = i10 & 57;
        int i17 = (~i16) & (i10 | 57);
        int i18 = i16 << 1;
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        f55238i = i19 % 128;
        if (i19 % 2 != 0) {
            throw null;
        }
        int i20 = i10 ^ 31;
        int i21 = (i10 & 31) << 1;
        int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
        f55238i = i22 % 128;
        if (i22 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    public static /* synthetic */ Byte d(Object[] objArr) {
        dr drVar = (dr) objArr[0];
        int i10 = f55239j;
        int i11 = i10 & 19;
        int i12 = (i10 ^ 19) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        f55238i = i14;
        int i15 = i13 % 2;
        byte b10 = drVar.f55240a;
        if (i15 != 0) {
            throw null;
        }
        int i16 = i14 & 13;
        int i17 = (i16 - (~((i14 ^ 13) | i16))) - 1;
        f55239j = i17 % 128;
        int i18 = i17 % 2;
        return Byte.valueOf(b10);
    }

    public static /* synthetic */ Byte e(Object[] objArr) {
        dr drVar = (dr) objArr[0];
        int i10 = f55238i;
        int i11 = (((i10 & (-22)) | ((~i10) & 21)) - (~(-(-((i10 & 21) << 1))))) - 1;
        f55239j = i11 % 128;
        int i12 = i11 % 2;
        byte b10 = drVar.f55242c;
        if (i12 == 0) {
            int i13 = 17 / 0;
        }
        int i14 = ((i10 | 63) << 1) - (i10 ^ 63);
        f55239j = i14 % 128;
        if (i14 % 2 != 0) {
            return Byte.valueOf(b10);
        }
        int i15 = 5 / 0;
        return Byte.valueOf(b10);
    }

    public static /* synthetic */ void f(Object[] objArr) {
        dr drVar = (dr) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i10 = f55238i;
        int i11 = (i10 | 105) << 1;
        int i12 = -(i10 ^ 105);
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f55239j = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        drVar.f55246g = bArr;
        int i15 = f55238i;
        int i16 = (i15 & (-26)) | ((~i15) & 25);
        int i17 = -(-((i15 & 25) << 1));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        f55239j = i18 % 128;
        if (i18 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((~i11) * (-783)) + (i11 * (-782)) + (i10 * 784);
        int i14 = ~i10;
        int i15 = ~i12;
        switch (((i14 | (~(i11 | i15))) * 783) + ((~(i14 | i15 | i11)) * (-783)) + i13) {
            case 1:
                return e(objArr);
            case 2:
                dr drVar = (dr) objArr[0];
                int i16 = f55239j;
                int i17 = i16 & 105;
                int i18 = i16 | 105;
                int i19 = (i17 & i18) + (i18 | i17);
                int i20 = i19 % 128;
                f55238i = i20;
                int i21 = i19 % 2;
                byte[] bArr = drVar.f55244e;
                int i22 = i20 & 21;
                int i23 = -(-((i20 ^ 21) | i22));
                int i24 = (i22 & i23) + (i23 | i22);
                f55239j = i24 % 128;
                int i25 = i24 % 2;
                return bArr;
            case 3:
                dr drVar2 = (dr) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                System.currentTimeMillis();
                System.currentTimeMillis();
                int iIntValue = ((Integer) setX(new Object[]{drVar2, bArr2, 0}, 425315120, -425315120, 0)).intValue();
                int i26 = f55238i;
                int i27 = (i26 ^ 63) + ((i26 & 63) << 1);
                f55239j = i27 % 128;
                int i28 = i27 % 2;
                return Integer.valueOf(iIntValue);
            case 4:
                f(objArr);
                return null;
            case 5:
                return d(objArr);
            case 6:
                return b(objArr);
            case 7:
                return c(objArr);
            case 8:
                dr drVar3 = (dr) objArr[0];
                byte[] bArr3 = (byte[]) objArr[1];
                int i29 = (-2) - ((f55238i + 118) ^ (-1));
                f55239j = i29 % 128;
                int i30 = i29 % 2;
                Intrinsics.checkNotNullParameter(bArr3, "");
                byte[] bArr4 = (byte[]) setInputExtras.setDividerPadding(new Object[]{CollectionsKt__CollectionsKt.listOf((Object[]) new byte[][]{new byte[]{drVar3.f55241b, drVar3.f55242c, (byte) drVar3.f55243d}, drVar3.f55244e, drVar3.f55245f, bArr3})}, -822524174, 822524177, (int) System.currentTimeMillis());
                int i31 = f55239j;
                int i32 = ((i31 & 19) - (~(-(-(i31 | 19))))) - 1;
                f55238i = i32 % 128;
                int i33 = i32 % 2;
                return bArr4;
            case 9:
                return a(objArr);
            default:
                dr drVar4 = (dr) objArr[0];
                byte[] bArr5 = (byte[]) objArr[1];
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int i34 = f55239j;
                int i35 = ((i34 ^ 75) | (i34 & 75)) << 1;
                int i36 = -(((~i34) & 75) | (i34 & (-76)));
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                f55238i = i37 % 128;
                int i38 = i37 % 2;
                Intrinsics.checkNotNullParameter(bArr5, "");
                drVar4.f55240a = bArr5[0];
                drVar4.f55241b = bArr5[1];
                drVar4.f55242c = bArr5[2];
                byte bM5545constructorimpl = UByte.m5545constructorimpl(bArr5[3]);
                int i39 = bM5545constructorimpl & 255;
                drVar4.f55243d = i39;
                int i40 = ~i39;
                int i41 = (i40 | i39) & i40;
                int i42 = i41 ^ 4;
                int i43 = i41 & 4;
                int i44 = (((i39 * (-1831)) + 3668) - (~((~((i42 & i43) | (i42 ^ i43))) * 2748))) - 1;
                int i45 = i41 ^ (-5);
                int i46 = i41 & (-5);
                int i47 = -(-(((i46 & i45) | (i45 ^ i46)) * (-916)));
                int i48 = i44 & i47;
                int i49 = (((i44 ^ i47) | i48) << 1) - ((i44 | i47) & (~i48));
                int i50 = i40 & (-5);
                int i51 = i50 | ((i40 | (-5)) & (~i50));
                int i52 = ~i51;
                int i53 = (i51 | i52) & i52;
                int i54 = bM5545constructorimpl & 4;
                int i55 = (i39 | 4) & (~i54);
                int i56 = ~((i54 & i55) | (i55 ^ i54));
                int i57 = i53 & i56;
                int i58 = (i56 | i53) & (~i57);
                int i59 = ((i58 & i57) | (i58 ^ i57)) * 916;
                drVar4.f55244e = ArraysKt___ArraysKt.sliceArray(bArr5, c.until(4, ((i49 | i59) << 1) - (i59 ^ i49)));
                int i60 = -drVar4.f55243d;
                int i61 = -i60;
                int i62 = (((i61 ^ 4) | (i61 & 4)) << 1) - ((i61 & (-5)) | (4 & (~i61)));
                int length = bArr5.length;
                int i63 = length & i60;
                int i64 = (i63 - (~((i60 ^ length) | i63))) - 1;
                int i65 = ((i64 & 24) | ((~i64) & (-25))) + ((i64 & (-25)) << 1);
                int i66 = i65 * (-574);
                int i67 = i62 * (-574);
                int i68 = i66 & i67;
                int i69 = -(-((i66 ^ i67) | i68));
                int i70 = ((i68 | i69) << 1) - (i69 ^ i68);
                int i71 = ~i65;
                int i72 = ~iIntValue2;
                int i73 = (i72 | iIntValue2) & i72;
                int i74 = ((~i73) & i71) | ((~i71) & i73);
                int i75 = i73 & i71;
                int i76 = ~((i75 & i74) | (i74 ^ i75));
                int i77 = ~i62;
                int i78 = i77 & iIntValue2;
                int i79 = (~i78) & (i77 | iIntValue2);
                int i80 = (i79 & i78) | (i79 ^ i78);
                int i81 = ~i80;
                int i82 = -(~(-(-((i76 | ((i80 | i81) & i81)) * 1150))));
                int i83 = (((i70 | i82) << 1) - (i70 ^ i82)) - 1;
                int i84 = (i77 & i72) | ((~i77) & iIntValue2);
                int i85 = ~((i84 & i78) | (i84 ^ i78));
                int i86 = i72 & i62;
                int i87 = (~i86) & (i72 | i62);
                int i88 = (i86 & i87) | (i87 ^ i86);
                int i89 = ~i88;
                int i90 = (i85 | ((i88 | i89) & i89)) * (-575);
                int i91 = ((i83 | i90) << 1) - (i90 ^ i83);
                int i92 = i71 & (i71 | i65);
                int i93 = i92 & iIntValue2;
                int i94 = ((i92 | iIntValue2) & (~i93)) | i93;
                int i95 = ~i94;
                int i96 = (i94 | i95) & i95;
                int i97 = i72 & i65;
                int i98 = (~i97) & (i72 | i65);
                int i99 = ~((i97 & i98) | (i98 ^ i97));
                int i100 = i96 & i99;
                int i101 = (i96 | i99) & (~i100);
                int i102 = ((i101 & i100) | (i101 ^ i100)) * 575;
                drVar4.f55245f = ArraysKt___ArraysKt.sliceArray(bArr5, c.until(i62, (i91 & i102) + (i102 | i91)));
                int i103 = (i62 & i65) + (i65 | i62);
                int i104 = i103 & 20;
                int i105 = (~i104) & (i103 | 20);
                int i106 = -(-(i104 << 1));
                setX(new Object[]{drVar4, ArraysKt___ArraysKt.sliceArray(bArr5, c.until(i103, (i105 ^ i106) + ((i106 & i105) << 1)))}, 117381082, -117381078, System.identityHashCode(drVar4));
                int length2 = ((byte[]) setX(new Object[]{drVar4}, -845228896, 845228903, System.identityHashCode(drVar4))).length;
                int i107 = length2 * (-300);
                int i108 = i103 * 302;
                int i109 = ((i107 & i108) - (~(-(-(i107 | i108))))) - 1;
                int i110 = (length2 ^ i103) | (length2 & i103);
                int i111 = (i110 & i72) | ((~i110) & iIntValue2);
                int i112 = i110 & iIntValue2;
                int i113 = -(-((~((i112 & i111) | (i111 ^ i112))) * (-301)));
                int i114 = i109 & i113;
                int i115 = (i113 ^ i109) | i114;
                int i116 = (i114 ^ i115) + ((i115 & i114) << 1);
                int i117 = ~i103;
                int i118 = i117 & iIntValue2;
                int i119 = (~i118) & (i117 | iIntValue2);
                int i120 = ~((i118 & i119) | (i119 ^ i118));
                int i121 = ~length2;
                int i122 = (i72 & i121) | ((~i72) & length2);
                int i123 = length2 & i72;
                int i124 = (i123 & i122) | (i122 ^ i123);
                int i125 = ~i124;
                int i126 = (i124 | i125) & i125;
                int i127 = -(-(((i126 & i120) | (i120 ^ i126)) * (-301)));
                int i128 = ((~i127) & i116) | ((~i116) & i127);
                int i129 = -(-((i127 & i116) << 1));
                int i130 = (i128 ^ i129) + ((i129 & i128) << 1);
                int i131 = (iIntValue2 & i121) | (i121 ^ iIntValue2);
                int i132 = ~i131;
                int i133 = (i131 | i132) & i132;
                int i134 = i117 ^ i133;
                int i135 = i133 & i117;
                int i136 = -(-(((i135 & i134) | (i134 ^ i135)) * 301));
                int i137 = ((i130 | i136) << 1) - (i136 ^ i130);
                drVar4.f55247h = bArr5[i137];
                int i138 = i137 & 1;
                int i139 = -(-((i137 ^ 1) | i138));
                int i140 = (i138 & i139) + (i138 | i139);
                int i141 = f55238i;
                int i142 = i141 ^ 57;
                int i143 = (i141 & 57) << 1;
                int i144 = (i142 & i143) + (i143 | i142);
                f55239j = i144 % 128;
                int i145 = i144 % 2;
                return Integer.valueOf(i140);
        }
    }

    public final byte setCompoundDrawableTintBlendMode() {
        return ((Byte) setX(new Object[]{this}, 640139105, -640139096, System.identityHashCode(this))).byteValue();
    }

    @Nullable
    public final byte[] setDividerPadding() {
        return (byte[]) setX(new Object[]{this}, 1936783142, -1936783140, System.identityHashCode(this));
    }

    public final byte setOnDragListener() {
        return ((Byte) setX(new Object[]{this}, 562516893, -562516887, System.identityHashCode(this))).byteValue();
    }

    @NotNull
    public final byte[] setOnFocusChangeListener(@NotNull byte[] bArr) {
        return (byte[]) setX(new Object[]{this, bArr}, -1014006140, 1014006148, System.identityHashCode(this));
    }

    public final byte setY() {
        return ((Byte) setX(new Object[]{this}, -477940013, 477940014, System.identityHashCode(this))).byteValue();
    }

    @NotNull
    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setX(new Object[]{this}, -845228896, 845228903, System.identityHashCode(this));
    }

    public final byte setX() {
        return ((Byte) setX(new Object[]{this}, -1465781391, 1465781396, System.identityHashCode(this))).byteValue();
    }
}
