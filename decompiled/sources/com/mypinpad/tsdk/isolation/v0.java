package com.mypinpad.tsdk.isolation;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class v0 extends x0 {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f61439x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f61440y0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f61441t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f61442u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f61443w0;

    public v0(InputStream inputStream, int i10) throws IOException {
        super(inputStream, i10);
        this.v0 = false;
        this.f61443w0 = true;
        this.f61441t0 = inputStream.read();
        int i11 = inputStream.read();
        this.f61442u0 = i11;
        if (i11 < 0) {
            throw new EOFException();
        }
        ((Boolean) b(new Object[]{this}, -1325635819, 1325635820, System.identityHashCode(this))).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:38:0x0187  */
    /* JADX WARN: Code duplicated, block: B:40:0x0200  */
    /* JADX WARN: Code duplicated, block: B:41:0x0219  */
    /* JADX WARN: Code duplicated, block: B:43:0x021f  */
    public static /* synthetic */ Object b(Object[] objArr, int i10, int i11, int i12) throws IOException {
        int iValueOf;
        int i13;
        int i14;
        int i15;
        InputStream inputStream;
        int i16;
        int i17;
        int i18;
        int i19 = ((~(i10 | i11 | i12)) * (-301)) + (i11 * 302) + (i10 * (-300));
        int i20 = ~i11;
        int i21 = (((~((~i10) | i12)) | i20) * 301) + (((~(i20 | i12)) | (~((~i12) | i10))) * (-301)) + i19;
        int i22 = -1;
        if (i21 == 1) {
            v0 v0Var = (v0) objArr[0];
            int i23 = f61440y0;
            int i24 = i23 & 97;
            int i25 = ((((i23 ^ 97) | i24) << 1) - (~(-((~i24) & (i23 | 97))))) - 1;
            f61439x0 = i25 % 128;
            if (i25 % 2 != 0) {
                boolean z10 = v0Var.v0;
                throw null;
            }
            if (!v0Var.v0 && !(!v0Var.f61443w0)) {
                int i26 = (i23 ^ 21) + ((i23 & 21) << 1);
                f61439x0 = i26 % 128;
                int i27 = i26 % 2;
                if (v0Var.f61441t0 == 0) {
                    int i28 = i23 & 41;
                    int i29 = ((i23 | 41) & (~i28)) + (i28 << 1);
                    int i30 = i29 % 128;
                    f61439x0 = i30;
                    int i31 = i29 % 2;
                    if (v0Var.f61442u0 == 0) {
                        int i32 = i30 - (-1);
                        f61440y0 = i32 % 128;
                        int i33 = i32 % 2;
                        v0Var.v0 = true;
                        if (i33 == 0) {
                            x0.a(new Object[]{v0Var}, 105926738, -105926738, System.identityHashCode(v0Var));
                        } else {
                            x0.a(new Object[]{v0Var}, 105926738, -105926738, System.identityHashCode(v0Var));
                        }
                    }
                }
            }
            boolean z11 = v0Var.v0;
            int i34 = f61439x0;
            int i35 = ((i34 & 36) + (i34 | 36)) - 1;
            f61440y0 = i35 % 128;
            int i36 = i35 % 2;
            return Boolean.valueOf(z11);
        }
        if (i21 == 2) {
            v0 v0Var2 = (v0) objArr[0];
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            int i37 = f61439x0 + 47;
            f61440y0 = i37 % 128;
            int i38 = i37 % 2;
            v0Var2.f61443w0 = zBooleanValue;
            ((Boolean) b(new Object[]{v0Var2}, -1325635819, 1325635820, System.identityHashCode(v0Var2))).booleanValue();
            int i39 = f61440y0;
            int i40 = (i39 | 73) << 1;
            int i41 = -(((~i39) & 73) | (i39 & (-74)));
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            f61439x0 = i42 % 128;
            if (i42 % 2 == 0) {
                return null;
            }
            int i43 = 6 / 0;
            return null;
        }
        if (i21 != 3) {
            v0 v0Var3 = (v0) objArr[0];
            int i44 = f61440y0;
            int i45 = i44 & 31;
            int i46 = ((i44 | 31) & (~i45)) + (i45 << 1);
            f61439x0 = i46 % 128;
            int i47 = i46 % 2;
            if (((Boolean) b(new Object[]{v0Var3}, -1325635819, 1325635820, System.identityHashCode(v0Var3))).booleanValue()) {
                int i48 = f61440y0 + 96;
                int i49 = (i48 ^ (-1)) + (i48 << 1);
                f61439x0 = i49 % 128;
                if (i49 % 2 != 0) {
                    throw null;
                }
            } else {
                int i50 = v0Var3.f61704p0.read();
                if (i50 < 0) {
                    throw new EOFException();
                }
                i22 = v0Var3.f61441t0;
                v0Var3.f61441t0 = v0Var3.f61442u0;
                v0Var3.f61442u0 = i50;
                int i51 = f61439x0 + 67;
                f61440y0 = i51 % 128;
                if (i51 % 2 == 0) {
                    int i52 = 34 / 0;
                }
            }
            iValueOf = Integer.valueOf(i22);
        } else {
            v0 v0Var4 = (v0) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            int iIntValue = ((Number) objArr[2]).intValue();
            int iIntValue2 = ((Number) objArr[3]).intValue();
            int i53 = f61439x0;
            int i54 = i53 ^ 9;
            int i55 = -(-((i53 & 9) << 1));
            int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
            int i57 = i56 % 128;
            f61440y0 = i57;
            int i58 = i56 % 2;
            boolean z12 = v0Var4.f61443w0;
            if (i58 == 0) {
                int i59 = 4 / 0;
                if (!z12) {
                    if (iIntValue2 < 3) {
                        if (v0Var4.v0) {
                            int i60 = (-2) - ((i57 + 122) ^ (-1));
                            int i61 = i60 % 128;
                            f61439x0 = i61;
                            int i62 = i60 % 2;
                            int i63 = i61 & 95;
                            int i64 = ((i61 ^ 95) | i63) << 1;
                            int i65 = -((i61 | 95) & (~i63));
                            i18 = ((i64 | i65) << 1) - (i65 ^ i64);
                            f61440y0 = i18 % 128;
                            if (i18 % 2 != 0) {
                                throw null;
                            }
                            iValueOf = -1;
                        } else {
                            int i66 = iIntValue * (-675);
                            int i67 = (1354 ^ i66) + ((i66 & 1354) << 1);
                            int i68 = iIntValue & 2;
                            int i69 = ((~i68) & (iIntValue | 2)) | i68;
                            i13 = ~iIntValue;
                            int i70 = i69 & i13;
                            int i71 = (i69 | i13) & (~i70);
                            int i72 = ((i71 & i70) | (i71 ^ i70)) * (-676);
                            int i73 = (i67 ^ i72) + ((i72 & i67) << 1);
                            int i74 = (i13 | iIntValue) & i13;
                            int i75 = (i74 ^ 2) | (i74 & 2);
                            int i76 = ~i75;
                            int i77 = (i75 | i76) & i76;
                            int i78 = ~((i13 ^ 2) | (i13 & 2));
                            int i79 = i77 ^ i78;
                            int i80 = i77 & i78;
                            int i81 = ((i80 & i79) | (i79 ^ i80)) * 676;
                            int i82 = i73 & i81;
                            int i83 = i81 | i73;
                            int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                            int i85 = ~((-3) | i13);
                            i14 = i74 & i13;
                            i15 = (i74 | i13) & (~i14);
                            int i86 = i15 | i14;
                            int i87 = ~i86;
                            int i88 = (i86 | i87) & i87;
                            int i89 = (i85 & i88) | (i85 ^ i88);
                            int i90 = iIntValue ^ 2;
                            int i91 = (i68 & i90) | (i90 ^ i68);
                            int i92 = (i91 & i13) | ((~i91) & iIntValue);
                            int i93 = i91 & iIntValue;
                            int i94 = ~((i93 & i92) | (i92 ^ i93));
                            int i95 = i89 & i94;
                            int i96 = -(-((((i94 | i89) & (~i95)) | i95) * 676));
                            int i97 = i84 ^ i96;
                            int i98 = -(-((i96 & i84) << 1));
                            int i99 = ((i97 | i98) << 1) - (i98 ^ i97);
                            int i100 = iIntValue2 ^ (-2);
                            int i101 = (iIntValue2 & (-2)) << 1;
                            int i102 = (i100 & i101) + (i101 | i100);
                            inputStream = v0Var4.f61704p0;
                            i16 = inputStream.read(bArr, i99, i102);
                            if (i16 >= 0) {
                                throw new EOFException();
                            }
                            bArr[iIntValue] = (byte) v0Var4.f61441t0;
                            int i103 = iIntValue * (-858);
                            int i104 = 860 & i103;
                            int i105 = (i103 | 860) & (~i104);
                            int i106 = i104 << 1;
                            int i107 = (i105 & i106) + (i105 | i106);
                            int i108 = iIntValue & 1;
                            int i109 = (~i108) & (iIntValue | 1);
                            int i110 = -(~(((i108 & i109) | (i109 ^ i108)) * (-859)));
                            int i111 = ((i107 ^ i110) + ((i110 & i107) << 1)) - 1;
                            int i112 = i13 & 1;
                            int i113 = ~((i13 ^ 1) | i112);
                            int i114 = (-2) | i13;
                            int i115 = i114 & iIntValue;
                            int i116 = ((iIntValue | i114) & (~i115)) | i115;
                            int i117 = ~i116;
                            int i118 = (i116 | i117) & i117;
                            int i119 = i113 & i118;
                            int i120 = (i113 | i118) & (~i119);
                            int i121 = ((i120 & i119) | (i120 ^ i119)) * 859;
                            int i122 = i111 & i121;
                            int i123 = (i121 | i111) & (~i122);
                            int i124 = i122 << 1;
                            int i125 = ((i123 | i124) << 1) - (i123 ^ i124);
                            int i126 = ~((i15 ^ i14) | (i15 & i14));
                            int i127 = ~(((~i112) & (i13 | 1)) | i112);
                            int i128 = i126 ^ i127;
                            int i129 = i126 & i127;
                            int i130 = ((i129 & i128) | (i128 ^ i129)) * 859;
                            bArr[(i125 & i130) + (i130 | i125)] = (byte) v0Var4.f61442u0;
                            v0Var4.f61441t0 = inputStream.read();
                            i17 = inputStream.read();
                            v0Var4.f61442u0 = i17;
                            if (i17 >= 0) {
                                throw new EOFException();
                            }
                            int i131 = f61439x0;
                            int i132 = i131 ^ 123;
                            int i133 = ((i131 & 123) | i132) << 1;
                            int i134 = -i132;
                            int i135 = (i133 & i134) + (i133 | i134);
                            f61440y0 = i135 % 128;
                            int i136 = i135 % 2;
                            iValueOf = Integer.valueOf(i16 + 2);
                        }
                    }
                }
            } else if (!z12) {
                if (iIntValue2 < 3) {
                    if (v0Var4.v0) {
                        int i610 = (-2) - ((i57 + 122) ^ (-1));
                        int i611 = i610 % 128;
                        f61439x0 = i611;
                        int i612 = i610 % 2;
                        int i613 = i611 & 95;
                        int i614 = ((i611 ^ 95) | i613) << 1;
                        int i615 = -((i611 | 95) & (~i613));
                        i18 = ((i614 | i615) << 1) - (i615 ^ i614);
                        f61440y0 = i18 % 128;
                        if (i18 % 2 != 0) {
                            throw null;
                        }
                        iValueOf = -1;
                    } else {
                        int i616 = iIntValue * (-675);
                        int i617 = (1354 ^ i616) + ((i616 & 1354) << 1);
                        int i618 = iIntValue & 2;
                        int i619 = ((~i618) & (iIntValue | 2)) | i618;
                        i13 = ~iIntValue;
                        int i710 = i619 & i13;
                        int i711 = (i619 | i13) & (~i710);
                        int i712 = ((i711 & i710) | (i711 ^ i710)) * (-676);
                        int i713 = (i617 ^ i712) + ((i712 & i617) << 1);
                        int i714 = (i13 | iIntValue) & i13;
                        int i715 = (i714 ^ 2) | (i714 & 2);
                        int i716 = ~i715;
                        int i717 = (i715 | i716) & i716;
                        int i718 = ~((i13 ^ 2) | (i13 & 2));
                        int i719 = i717 ^ i718;
                        int i810 = i717 & i718;
                        int i811 = ((i810 & i719) | (i719 ^ i810)) * 676;
                        int i812 = i713 & i811;
                        int i813 = i811 | i713;
                        int i814 = (i812 ^ i813) + ((i813 & i812) << 1);
                        int i815 = ~((-3) | i13);
                        i14 = i714 & i13;
                        i15 = (i714 | i13) & (~i14);
                        int i816 = i15 | i14;
                        int i817 = ~i816;
                        int i818 = (i816 | i817) & i817;
                        int i819 = (i815 & i818) | (i815 ^ i818);
                        int i910 = iIntValue ^ 2;
                        int i911 = (i618 & i910) | (i910 ^ i618);
                        int i912 = (i911 & i13) | ((~i911) & iIntValue);
                        int i913 = i911 & iIntValue;
                        int i914 = ~((i913 & i912) | (i912 ^ i913));
                        int i915 = i819 & i914;
                        int i916 = -(-((((i914 | i819) & (~i915)) | i915) * 676));
                        int i917 = i814 ^ i916;
                        int i918 = -(-((i916 & i814) << 1));
                        int i919 = ((i917 | i918) << 1) - (i918 ^ i917);
                        int i1010 = iIntValue2 ^ (-2);
                        int i1011 = (iIntValue2 & (-2)) << 1;
                        int i1012 = (i1010 & i1011) + (i1011 | i1010);
                        inputStream = v0Var4.f61704p0;
                        i16 = inputStream.read(bArr, i919, i1012);
                        if (i16 >= 0) {
                            throw new EOFException();
                        }
                        bArr[iIntValue] = (byte) v0Var4.f61441t0;
                        int i1013 = iIntValue * (-858);
                        int i1014 = 860 & i1013;
                        int i1015 = (i1013 | 860) & (~i1014);
                        int i1016 = i1014 << 1;
                        int i1017 = (i1015 & i1016) + (i1015 | i1016);
                        int i1018 = iIntValue & 1;
                        int i1019 = (~i1018) & (iIntValue | 1);
                        int i1110 = -(~(((i1018 & i1019) | (i1019 ^ i1018)) * (-859)));
                        int i1111 = ((i1017 ^ i1110) + ((i1110 & i1017) << 1)) - 1;
                        int i1112 = i13 & 1;
                        int i1113 = ~((i13 ^ 1) | i1112);
                        int i1114 = (-2) | i13;
                        int i1115 = i1114 & iIntValue;
                        int i1116 = ((iIntValue | i1114) & (~i1115)) | i1115;
                        int i1117 = ~i1116;
                        int i1118 = (i1116 | i1117) & i1117;
                        int i1119 = i1113 & i1118;
                        int i1210 = (i1113 | i1118) & (~i1119);
                        int i1211 = ((i1210 & i1119) | (i1210 ^ i1119)) * 859;
                        int i1212 = i1111 & i1211;
                        int i1213 = (i1211 | i1111) & (~i1212);
                        int i1214 = i1212 << 1;
                        int i1215 = ((i1213 | i1214) << 1) - (i1213 ^ i1214);
                        int i1216 = ~((i15 ^ i14) | (i15 & i14));
                        int i1217 = ~(((~i1112) & (i13 | 1)) | i1112);
                        int i1218 = i1216 ^ i1217;
                        int i1219 = i1216 & i1217;
                        int i137 = ((i1219 & i1218) | (i1218 ^ i1219)) * 859;
                        bArr[(i1215 & i137) + (i137 | i1215)] = (byte) v0Var4.f61442u0;
                        v0Var4.f61441t0 = inputStream.read();
                        i17 = inputStream.read();
                        v0Var4.f61442u0 = i17;
                        if (i17 >= 0) {
                            throw new EOFException();
                        }
                        int i138 = f61439x0;
                        int i139 = i138 ^ 123;
                        int i1310 = ((i138 & 123) | i139) << 1;
                        int i1311 = -i139;
                        int i1312 = (i1310 & i1311) + (i1310 | i1311);
                        f61440y0 = i1312 % 128;
                        int i1313 = i1312 % 2;
                        iValueOf = Integer.valueOf(i16 + 2);
                    }
                }
            }
            int i140 = super.read(bArr, iIntValue, iIntValue2);
            int i141 = f61439x0;
            int i142 = i141 ^ 25;
            int i143 = -(-((i141 & 25) << 1));
            int i144 = (i142 & i143) + (i143 | i142);
            f61440y0 = i144 % 128;
            if (i144 % 2 == 0) {
                int i145 = 34 / 0;
            }
            iValueOf = Integer.valueOf(i140);
        }
        return iValueOf;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return ((Integer) b(new Object[]{this}, -515821081, 515821081, System.identityHashCode(this))).intValue();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        return ((Integer) b(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, 268485831, -268485828, i10)).intValue();
    }
}
