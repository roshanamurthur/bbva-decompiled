package com.mypinpad.tsdk.isolation;

import kotlin.UByte;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setLogo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final byte[] f60037a = {1, 2, 4, 8, 16, 32, 64, -128};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final byte[] f60038b = {0, 1, 3, 7, 15, 31, 63, 127, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60039c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60040d = 1;

    static {
        int i10 = (99 << 1) - 99;
        f60040d = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Byte a(Object[] objArr) {
        byte bByteValue = ((Byte) objArr[0]).byteValue();
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i10 = f60040d;
        int i11 = ((i10 | 5) << 1) - (i10 ^ 5);
        f60039c = i11 % 128;
        int i12 = i11 % 2;
        int iIntValue3 = ((Integer) setY(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, -309477412, 309477422, iIntValue)).intValue();
        byte bByteValue2 = (byte) (f60038b[iIntValue2] & ((Byte) setY(new Object[]{Byte.valueOf(bByteValue), Integer.valueOf(iIntValue3)}, 1382640069, -1382640067, iIntValue3)).byteValue());
        int i13 = f60039c;
        int i14 = i13 & 105;
        int i15 = ((((i13 ^ 105) | i14) << 1) - (~(-((i13 | 105) & (~i14))))) - 1;
        f60040d = i15 % 128;
        if (i15 % 2 != 0) {
            return Byte.valueOf(bByteValue2);
        }
        throw null;
    }

    public static /* synthetic */ Byte b(Object[] objArr) {
        byte bByteValue = ((Byte) objArr[0]).byteValue();
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f60039c;
        int i11 = i10 & 81;
        int i12 = i10 | 81;
        int i13 = (i11 & i12) + (i12 | i11);
        f60040d = i13 % 128;
        byte bByteValue2 = ((Byte) (i13 % 2 == 0 ? setY(new Object[]{Byte.valueOf(bByteValue), Integer.valueOf(iIntValue), Boolean.FALSE}, -1488015476, 1488015481, iIntValue) : setY(new Object[]{Byte.valueOf(bByteValue), Integer.valueOf(iIntValue), Boolean.TRUE}, -1488015476, 1488015481, iIntValue))).byteValue();
        int i14 = f60039c;
        int i15 = i14 | 45;
        int i16 = ((i15 << 1) - (~(-((~(i14 & 45)) & i15)))) - 1;
        f60040d = i16 % 128;
        if (i16 % 2 != 0) {
            return Byte.valueOf(bByteValue2);
        }
        throw null;
    }

    public static /* synthetic */ Integer c(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        int i10 = f60039c;
        int i11 = i10 & 79;
        int i12 = -(-((i10 ^ 79) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        f60040d = i14;
        int i15 = i13 % 2;
        int i16 = -iIntValue2;
        int i17 = i16 * 881;
        int i18 = -(-(iIntValue * 881));
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        int i20 = ~i16;
        int i21 = ~iIntValue;
        int i22 = (i21 | iIntValue) & i21;
        int i23 = ~i22;
        int i24 = (i20 & i23) | ((~i20) & i22);
        int i25 = i20 & i22;
        int i26 = ~((i24 & i25) | (i24 ^ i25));
        int i27 = i20 & (i20 | i16);
        int i28 = i27 & iIntValue;
        int i29 = (~i28) & (i27 | iIntValue);
        int i30 = ~((i28 & i29) | (i29 ^ i28));
        int i31 = i26 & i30;
        int i32 = (i26 | i30) & (~i31);
        int i33 = (i32 & i31) | (i32 ^ i31);
        int i34 = (i21 & i22) | (iIntValue & i23);
        int i35 = i22 & iIntValue;
        int i36 = ~((i34 & i35) | (i34 ^ i35));
        int i37 = i33 ^ i36;
        int i38 = i36 & i33;
        int i39 = i19 - (~(((i38 & i37) | (i37 ^ i38)) * (-880)));
        int i40 = (i39 ^ (-1)) + (i39 << 1);
        int i41 = (i27 & i23) | ((~i27) & i22);
        int i42 = i27 & i22;
        int i43 = (i42 & i41) | (i41 ^ i42);
        int i44 = ~i43;
        int i45 = (i43 | i44) & i44;
        int i46 = iIntValue & i45;
        int i47 = (i45 | iIntValue) & (~i46);
        int i48 = (i47 & i46) | (i47 ^ i46);
        int i49 = i16 | iIntValue;
        int i50 = ~i49;
        int i51 = ((~i50) & i48) | ((~i48) & i50);
        int i52 = i48 & i50;
        int i53 = ((i52 & i51) | (i51 ^ i52)) * (-880);
        int i54 = (i40 & i53) + (i53 | i40);
        int i55 = i16 & iIntValue;
        int i56 = (~i55) & i49;
        int i57 = -(-((~((i55 & i56) | (i56 ^ i55))) * 880));
        int i58 = (((i54 ^ i57) | (i54 & i57)) << 1) - ((i57 & (~i54)) | ((~i57) & i54));
        int i59 = (i58 & 1) + (i58 | 1);
        int i60 = i14 & 29;
        int i61 = i14 | 29;
        int i62 = ((i60 | i61) << 1) - (i60 ^ i61);
        f60039c = i62 % 128;
        if (i62 % 2 == 0) {
            return Integer.valueOf(i59);
        }
        int i63 = 65 / 0;
        return Integer.valueOf(i59);
    }

    public static final byte setCompoundDrawableTintBlendMode(byte b10) {
        return ((Byte) setY(new Object[]{Byte.valueOf(b10)}, 251599675, -251599664, (int) System.currentTimeMillis())).byteValue();
    }

    public static final byte setDividerPadding(byte b10, int i10, int i11, byte b11) {
        return ((Byte) setY(new Object[]{Byte.valueOf(b10), Integer.valueOf(i10), Integer.valueOf(i11), Byte.valueOf(b11)}, -883253918, 883253919, i10)).byteValue();
    }

    public static final int setOnFocusChangeListener(byte b10) {
        return ((Integer) setY(new Object[]{Byte.valueOf(b10)}, 1173040333, -1173040326, (int) System.currentTimeMillis())).intValue();
    }

    @NotNull
    public static final getDetailsFieldTextSizeSp setX(byte b10) {
        return (getDetailsFieldTextSizeSp) setY(new Object[]{Byte.valueOf(b10)}, -1836464407, 1836464411, (int) System.currentTimeMillis());
    }

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        byte b10;
        int i13;
        byte b11;
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~i12;
        int i17 = ~(i16 | i10);
        int i18 = ((i14 | i17) * 712) + (((~(i10 | i11 | i12)) | (~(i14 | i16 | i10))) * (-712)) + ((i15 | i17) * (-712)) + (i11 * 713) + (i10 * (-711));
        byte[] bArr = f60037a;
        switch (i18) {
            case 1:
                byte bByteValue = ((Byte) objArr[0]).byteValue();
                int iIntValue = ((Number) objArr[1]).intValue();
                int iIntValue2 = ((Number) objArr[2]).intValue();
                byte bByteValue2 = ((Byte) objArr[3]).byteValue();
                int i19 = f60040d;
                int i20 = ((i19 ^ 9) | (i19 & 9)) << 1;
                int i21 = -(((~i19) & 9) | (i19 & (-10)));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                f60039c = i22 % 128;
                int i23 = i22 % 2;
                int iIntValue3 = ((Integer) setY(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, -309477412, 309477422, iIntValue)).intValue();
                byte bByteValue3 = ((Byte) setY(new Object[]{Byte.valueOf(f60038b[iIntValue2]), Integer.valueOf(iIntValue3)}, 310482515, -310482506, iIntValue3)).byteValue();
                byte b12 = (byte) (bByteValue & ((byte) (~bByteValue3)));
                byte bByteValue4 = (byte) (((Byte) setY(new Object[]{Byte.valueOf(bByteValue2), Integer.valueOf(iIntValue3)}, 310482515, -310482506, iIntValue3)).byteValue() & bByteValue3);
                byte b13 = (byte) ((bByteValue4 & b12) | (b12 ^ bByteValue4));
                int i24 = f60039c;
                int i25 = (i24 ^ 68) + ((i24 & 68) << 1);
                int i26 = (i25 ^ (-1)) + (i25 << 1);
                f60040d = i26 % 128;
                int i27 = i26 % 2;
                return Byte.valueOf(b13);
            case 2:
                byte bByteValue5 = ((Byte) objArr[0]).byteValue();
                int iIntValue4 = ((Number) objArr[1]).intValue();
                int i28 = f60039c;
                int i29 = (i28 ^ 41) + ((i28 & 41) << 1);
                f60040d = i29 % 128;
                int i30 = i29 % 2;
                byte bM5545constructorimpl = UByte.m5545constructorimpl(bByteValue5);
                byte b14 = (byte) (i30 == 0 ? (bM5545constructorimpl & 7386) >> iIntValue4 : (bM5545constructorimpl & 255) >>> iIntValue4);
                int i31 = f60040d;
                int i32 = ((i31 & (-62)) | ((~i31) & 61)) + ((i31 & 61) << 1);
                f60039c = i32 % 128;
                int i33 = i32 % 2;
                return Byte.valueOf(b14);
            case 3:
                return b(objArr);
            case 4:
                byte bByteValue6 = ((Byte) objArr[0]).byteValue();
                setDividerPadding setdividerpadding = new setDividerPadding();
                setdividerpadding.f60043a = bByteValue6;
                int i34 = f60040d;
                int i35 = (((i34 | 24) << 1) - (i34 ^ 24)) - 1;
                f60039c = i35 % 128;
                int i36 = i35 % 2;
                return setdividerpadding;
            case 5:
                byte bByteValue7 = ((Byte) objArr[0]).byteValue();
                int iIntValue5 = ((Number) objArr[1]).intValue();
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i37 = f60039c;
                int i38 = i37 + 41;
                int i39 = i38 % 128;
                f60040d = i39;
                int i40 = i38 % 2;
                byte b15 = bArr[iIntValue5];
                if (zBooleanValue) {
                    int i41 = (i37 ^ 7) + ((i37 & 7) << 1);
                    int i42 = i41 % 128;
                    f60040d = i42;
                    int i43 = i41 % 2;
                    int i44 = bByteValue7 & b15;
                    int i45 = (b15 | bByteValue7) & (~i44);
                    b10 = (byte) ((i44 & i45) | (i45 ^ i44));
                    int i46 = i42 & 43;
                    int i47 = (~i46) & (i42 | 43);
                    int i48 = -(-(i46 << 1));
                    i13 = ((i47 | i48) << 1) - (i48 ^ i47);
                } else {
                    int i49 = -b15;
                    int i50 = i49 & 255;
                    b10 = (byte) (((byte) ((i50 - (~((i49 ^ 255) | i50))) - 1)) & bByteValue7);
                    int i51 = i39 & 1;
                    int i52 = -(-(i39 | 1));
                    i13 = (i51 & i52) + (i51 | i52);
                }
                f60039c = i13 % 128;
                int i53 = i13 % 2;
                return Byte.valueOf(b10);
            case 6:
                return a(objArr);
            case 7:
                byte bByteValue8 = ((Byte) objArr[0]).byteValue();
                int i54 = f60039c;
                int i55 = i54 & 15;
                int i56 = (i54 | 15) & (~i55);
                int i57 = -(-(i55 << 1));
                int i58 = (i56 ^ i57) + ((i56 & i57) << 1);
                f60040d = i58 % 128;
                int i59 = i58 % 2;
                byte bByteValue9 = ((Byte) setY(new Object[]{Byte.valueOf(bByteValue8), 4}, 1382640069, -1382640067, 4)).byteValue();
                int i60 = bByteValue9 * 10;
                int i61 = ((byte) (bByteValue8 & 15)) % 10;
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i62 = i61 * 905;
                int i63 = bByteValue9 * (-9030);
                int i64 = ((i62 ^ i63) - (~((i63 & i62) << 1))) - 1;
                int i65 = ~i61;
                int i66 = (i65 | i61) & i65;
                int i67 = ~((i66 & iCurrentTimeMillis) | (i66 ^ iCurrentTimeMillis));
                int i68 = ~iCurrentTimeMillis;
                int i69 = (i68 | iCurrentTimeMillis) & i68;
                int i70 = i69 & i60;
                int i71 = (~i70) & (i69 | i60);
                int i72 = ~((i70 & i71) | (i71 ^ i70));
                int i73 = i67 ^ i72;
                int i74 = i67 & i72;
                int i75 = ((i74 & i73) | (i73 ^ i74)) * (-1808);
                int i76 = ((i64 ^ i75) | (i64 & i75)) << 1;
                int i77 = -((i75 & (~i64)) | ((~i75) & i64));
                int i78 = (i76 & i77) + (i77 | i76);
                int i79 = ~i60;
                int i80 = (i65 ^ i79) | (i65 & i79);
                int i81 = i80 & iCurrentTimeMillis;
                int i82 = (i80 | iCurrentTimeMillis) & (~i81);
                int i83 = ~((i82 & i81) | (i82 ^ i81));
                int i84 = (i69 & i65) | ((~i69) & i61);
                int i85 = i61 & i69;
                int i86 = (i85 & i84) | (i84 ^ i85);
                int i87 = -(-(((~(i86 | i60)) | i83) * 904));
                int i88 = i78 & i87;
                int i89 = (i78 ^ i87) | i88;
                int i90 = ((i88 | i89) << 1) - (i89 ^ i88);
                int i91 = i65 ^ i60;
                int i92 = i65 & i60;
                int i93 = ~((i92 & i91) | (i91 ^ i92));
                int i94 = (i79 & i68) | ((~i79) & iCurrentTimeMillis) | (iCurrentTimeMillis & i79);
                int i95 = ~i94;
                int i96 = i93 | ((i94 | i95) & i95);
                int i97 = ~i86;
                int i98 = (i86 | i97) & i97;
                int i99 = i96 ^ i98;
                int i100 = i98 & i96;
                int i101 = (i90 - (~(-(-(((i100 & i99) | (i99 ^ i100)) * 904))))) - 1;
                int i102 = f60040d;
                int i103 = (i102 ^ 5) + ((i102 & 5) << 1);
                f60039c = i103 % 128;
                int i104 = i103 % 2;
                return Integer.valueOf(i101);
            case 8:
                byte bByteValue10 = ((Byte) objArr[0]).byteValue();
                int iIntValue6 = ((Number) objArr[1]).intValue();
                int i105 = f60040d + 69;
                f60039c = i105 % 128;
                int i106 = i105 % 2;
                if (((Byte) setY(new Object[]{Byte.valueOf(bByteValue10), Integer.valueOf(iIntValue6)}, -1494339126, 1494339126, iIntValue6)).byteValue() == 0) {
                    int i107 = f60039c;
                    int i108 = i107 & 69;
                    int i109 = ((((i107 ^ 69) | i108) << 1) - (~(-((i107 | 69) & (~i108))))) - 1;
                    f60040d = i109 % 128;
                    int i110 = i109 % 2;
                    return Boolean.FALSE;
                }
                int i111 = f60039c;
                int i112 = (i111 ^ 107) + ((i111 & 107) << 1);
                int i113 = i112 % 128;
                f60040d = i113;
                int i114 = i112 % 2;
                int i115 = ((i113 | 89) << 1) - (i113 ^ 89);
                f60039c = i115 % 128;
                if (i115 % 2 == 0) {
                    return Boolean.TRUE;
                }
                throw null;
            case 9:
                byte bByteValue11 = ((Byte) objArr[0]).byteValue();
                int iIntValue7 = ((Number) objArr[1]).intValue();
                int i116 = f60040d;
                int i117 = (i116 & 79) + (i116 | 79);
                f60039c = i117 % 128;
                int i118 = i117 % 2;
                byte bM5545constructorimpl2 = (byte) ((UByte.m5545constructorimpl(bByteValue11) & 255) << iIntValue7);
                int i119 = f60040d;
                int i120 = i119 & 19;
                int i121 = (i119 ^ 19) | i120;
                int i122 = ((i120 | i121) << 1) - (i121 ^ i120);
                f60039c = i122 % 128;
                int i123 = i122 % 2;
                return Byte.valueOf(bM5545constructorimpl2);
            case 10:
                return c(objArr);
            case 11:
                byte bByteValue12 = ((Byte) objArr[0]).byteValue();
                int i124 = f60040d;
                int i125 = i124 & 17;
                int i126 = ((i124 ^ 17) | i125) << 1;
                int i127 = -((i124 | 17) & (~i125));
                int i128 = (i126 & i127) + (i127 | i126);
                f60039c = i128 % 128;
                int i129 = i128 % 2;
                int i130 = ((bByteValue12 / 10) % 10) << 4;
                int i131 = bByteValue12 % 10;
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i132 = i131 * 628;
                int i133 = -(-(i130 * 628));
                int i134 = i132 ^ i133;
                int i135 = ((i132 & i133) | i134) << 1;
                int i136 = -i134;
                int i137 = (i135 ^ i136) + ((i135 & i136) << 1);
                int i138 = ~iCurrentTimeMillis2;
                int i139 = i130 & i138;
                int i140 = ~i130;
                int i141 = iCurrentTimeMillis2 & i140;
                int i142 = i139 | i141;
                int i143 = i130 & iCurrentTimeMillis2;
                int i144 = (i142 & i143) | (i142 ^ i143);
                int i145 = ~i131;
                int i146 = i144 & i145;
                int i147 = (((i144 | i145) & (~i146)) | i146) * (-627);
                int i148 = (i137 & i147) + (i137 | i147);
                int i149 = ~((i140 & i138) | ((~i140) & iCurrentTimeMillis2) | i141);
                int i150 = -(-(((i149 & i131) | (i131 ^ i149)) * (-627)));
                int i151 = (i148 ^ i150) + ((i150 & i148) << 1);
                int i152 = (i130 | i138) & (~i139);
                int i153 = ~((i152 & i139) | (i152 ^ i139));
                int i154 = (i138 & i131) | (iCurrentTimeMillis2 & i145);
                int i155 = i131 & iCurrentTimeMillis2;
                int i156 = ~((i155 & i154) | (i154 ^ i155));
                int i157 = i153 ^ i156;
                int i158 = i156 & i153;
                int i159 = ((i158 & i157) | (i157 ^ i158)) * 627;
                int i160 = ((~i159) & i151) | ((~i151) & i159);
                int i161 = (i159 & i151) << 1;
                byte b16 = (byte) ((i160 ^ i161) + ((i161 & i160) << 1));
                int i162 = f60039c;
                int i163 = ((i162 ^ 39) | (i162 & 39)) << 1;
                int i164 = -(((~i162) & 39) | (i162 & (-40)));
                int i165 = (i163 ^ i164) + ((i164 & i163) << 1);
                f60040d = i165 % 128;
                int i166 = i165 % 2;
                return Byte.valueOf(b16);
            default:
                byte bByteValue13 = ((Byte) objArr[0]).byteValue();
                int iIntValue8 = ((Number) objArr[1]).intValue();
                int i167 = f60039c + 77;
                f60040d = i167 % 128;
                if (i167 % 2 == 0) {
                    b11 = (byte) (bArr[iIntValue8] & bByteValue13);
                    int i168 = 64 / 0;
                } else {
                    b11 = (byte) (bArr[iIntValue8] & bByteValue13);
                }
                return Byte.valueOf(b11);
        }
    }

    public static final class setDividerPadding implements getDetailsFieldTextSizeSp {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f60041b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f60042c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ byte f60043a;

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int i13 = (-2) - ((f60042c + 98) ^ (-1));
            f60041b = i13 % 128;
            int i14 = i13 % 2;
            String str = (String) getPinPadLandscape.setY(new Object[]{Byte.valueOf(setdividerpadding.f60043a)}, 1862949367, -1862949363, (int) System.currentTimeMillis());
            int i15 = f60041b;
            int i16 = ((i15 ^ 87) | (i15 & 87)) << 1;
            int i17 = -(((~i15) & 87) | (i15 & (-88)));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            f60042c = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 18 / 0;
            }
            return str;
        }

        @Override // com.mypinpad.tsdk.isolation.getDetailsFieldTextSizeSp
        @NotNull
        public final String setCompoundDrawableTintBlendMode() {
            return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 31850997, -31850997, System.identityHashCode(this));
        }
    }

    public static final byte setDividerPadding(byte b10, int i10, boolean z10) {
        return ((Byte) setY(new Object[]{Byte.valueOf(b10), Integer.valueOf(i10), Boolean.valueOf(z10)}, -1488015476, 1488015481, i10)).byteValue();
    }

    public static final boolean setOnFocusChangeListener(byte b10, int i10) {
        return ((Boolean) setY(new Object[]{Byte.valueOf(b10), Integer.valueOf(i10)}, 1812344530, -1812344522, i10)).booleanValue();
    }

    public static final byte setX(byte b10, int i10) {
        return ((Byte) setY(new Object[]{Byte.valueOf(b10), Integer.valueOf(i10)}, 310482515, -310482506, i10)).byteValue();
    }

    public static final byte setY(byte b10, int i10) {
        return ((Byte) setY(new Object[]{Byte.valueOf(b10), Integer.valueOf(i10)}, 1382640069, -1382640067, i10)).byteValue();
    }

    public static final byte setY(byte b10, int i10, int i11) {
        return ((Byte) setY(new Object[]{Byte.valueOf(b10), Integer.valueOf(i10), Integer.valueOf(i11)}, -1812187572, 1812187578, i10)).byteValue();
    }
}
