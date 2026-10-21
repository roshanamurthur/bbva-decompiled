package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class aej {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f52546d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f52547e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f52548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[][] f52550c;

    public aej(x0 x0Var, int i10, byte[][] bArr) {
        this.f52548a = x0Var;
        this.f52549b = i10;
        this.f52550c = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x014c A[DONT_INVERT, PHI: r3 r7 r8
      0x014c: PHI (r3v87 int) = (r3v86 int), (r3v99 int) binds: [B:30:0x014a, B:27:0x0122] A[DONT_GENERATE, DONT_INLINE]
      0x014c: PHI (r7v11 java.io.InputStream) = (r7v10 java.io.InputStream), (r7v16 java.io.InputStream) binds: [B:30:0x014a, B:27:0x0122] A[DONT_GENERATE, DONT_INLINE]
      0x014c: PHI (r8v13 int) = (r8v12 int), (r8v17 int) binds: [B:30:0x014a, B:27:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x014e  */
    /* JADX WARN: Code duplicated, block: B:51:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:55:0x0208  */
    /* JADX WARN: Code duplicated, block: B:58:0x0227  */
    /* JADX WARN: Code duplicated, block: B:60:0x0229  */
    /* JADX WARN: Code duplicated, block: B:62:0x024e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0253  */
    /* JADX WARN: Code duplicated, block: B:65:0x025b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0268  */
    /* JADX WARN: Code duplicated, block: B:68:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:70:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:75:0x031c  */
    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        afa afaVar;
        afm afmVar;
        agn agnVar;
        int i13;
        Object obj;
        afm afmVar2;
        aff affVar;
        int i14;
        ady adyVar;
        ady adyVar2;
        Object obj2;
        int iIntValue;
        InputStream inputStream;
        int i15;
        int i16;
        boolean z10;
        int iIntValue2;
        s0 s0Var;
        aej aejVar;
        int i17;
        int i18;
        int i19;
        aej aejVar2;
        int i20;
        add addVar;
        int i21;
        l0 l0Var;
        int i22;
        Object obj3;
        int i23 = ((~(i10 | i11 | i12)) * (-301)) + (i11 * 302) + (i10 * (-300));
        int i24 = ~i11;
        boolean z11 = false;
        switch ((((~((~i10) | i12)) | i24) * 301) + (((~(i24 | i12)) | (~((~i12) | i10))) * (-301)) + i23) {
            case 1:
                aej aejVar3 = (aej) objArr[0];
                int iIntValue3 = ((Number) objArr[1]).intValue();
                int i25 = f52546d;
                int i26 = i25 & 49;
                int i27 = (i25 ^ 49) | i26;
                int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                f52547e = i28 % 128;
                int i29 = i28 % 2;
                if (iIntValue3 == 3) {
                    afaVar = new afa(aejVar3);
                    int i30 = i25 | 15;
                    int i31 = i30 << 1;
                    int i32 = -(i30 & (~(i25 & 15)));
                    int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                    f52547e = i33 % 128;
                    if (i33 % 2 == 0) {
                        obj2 = afaVar;
                        throw null;
                    }
                } else if (iIntValue3 == 4) {
                    aez aezVar = new aez(aejVar3);
                    int i34 = i25 + 31;
                    f52547e = i34 % 128;
                    int i35 = i34 % 2;
                    obj2 = aezVar;
                } else if (iIntValue3 == 8) {
                    afmVar = new afm(aejVar3);
                    int i36 = f52547e;
                    int i37 = (i36 & (-116)) | ((~i36) & 115);
                    int i38 = -(-((i36 & 115) << 1));
                    int i39 = (i37 & i38) + (i38 | i37);
                    f52546d = i39 % 128;
                    if (i39 % 2 != 0) {
                        obj2 = afmVar;
                        throw null;
                    }
                } else if (iIntValue3 == 16) {
                    agnVar = new agn();
                    agnVar.f52623p0 = aejVar3;
                    int i40 = i25 & 87;
                    int i41 = (~i40) & (i25 | 87);
                    int i42 = -(-(i40 << 1));
                    int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                    f52547e = i43 % 128;
                    if (i43 % 2 == 0) {
                        obj2 = agnVar;
                        int i44 = 49 / 0;
                        obj2 = agnVar;
                    }
                } else {
                    if (iIntValue3 != 17) {
                        StringBuilder sb2 = new StringBuilder("unknown DL object encountered: 0x");
                        sb2.append(Integer.toHexString(iIntValue3));
                        throw new adk(sb2.toString());
                    }
                    agl aglVar = new agl();
                    aglVar.f52620p0 = aejVar3;
                    int i45 = i25 & 17;
                    int i46 = (i45 - (~((i25 ^ 17) | i45))) - 1;
                    f52547e = i46 % 128;
                    int i47 = i46 % 2;
                    obj2 = aglVar;
                }
                obj2 = afaVar;
                obj2 = afmVar;
                obj2 = agnVar;
                obj2 = afmVar2;
                obj2 = affVar;
                obj2 = l0Var;
                return obj2;
            case 2:
                aej aejVar4 = (aej) objArr[0];
                int i48 = f52546d;
                int i49 = i48 & 83;
                int i50 = (i48 ^ 83) | i49;
                int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                int i52 = i51 % 128;
                f52547e = i52;
                int i53 = i51 % 2;
                InputStream inputStream2 = aejVar4.f52548a;
                if (inputStream2 instanceof v0) {
                    int i54 = i52 & 77;
                    int i55 = ((i52 | 77) & (~i54)) + (i54 << 1);
                    f52546d = i55 % 128;
                    int i56 = i55 % 2;
                    v0 v0Var = (v0) inputStream2;
                    v0.b(new Object[]{v0Var, Boolean.FALSE}, -2023474583, 2023474585, System.identityHashCode(v0Var));
                    int i57 = f52547e;
                    int i58 = ((i57 ^ 46) + ((i57 & 46) << 1)) - 1;
                    f52546d = i58 % 128;
                    int i59 = i58 % 2;
                }
                int i60 = f52546d;
                int i61 = i60 & 21;
                int i62 = ((i60 ^ 21) | i61) << 1;
                int i63 = -((i60 | 21) & (~i61));
                int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
                f52547e = i64 % 128;
                if (i64 % 2 == 0) {
                    throw null;
                }
                return null;
            case 3:
                aej aejVar5 = (aej) objArr[0];
                int iIntValue4 = ((Number) objArr[1]).intValue();
                int i65 = f52546d;
                int i66 = (i65 & 31) + (i65 | 31);
                int i67 = i66 % 128;
                f52547e = i67;
                int i68 = i66 % 2;
                if (iIntValue4 != 3) {
                    if (iIntValue4 == 4) {
                        aez aezVar2 = new aez(aejVar5);
                        i13 = (((i65 | 38) << 1) - (i65 ^ 38)) - 1;
                        obj = aezVar2;
                    } else if (iIntValue4 == 8) {
                        afmVar2 = new afm(aejVar5);
                        int i69 = f52546d;
                        int i70 = ((i69 & 90) + (i69 | 90)) - 1;
                        f52547e = i70 % 128;
                        if (i70 % 2 == 0) {
                            obj2 = afmVar2;
                            throw null;
                        }
                    } else if (iIntValue4 == 16) {
                        afe afeVar = new afe();
                        afeVar.f52590p0 = aejVar5;
                        i13 = (((i65 | 54) << 1) - (i65 ^ 54)) - 1;
                        obj = afeVar;
                    } else {
                        if (iIntValue4 != 17) {
                            StringBuilder sb3 = new StringBuilder("unknown BER object encountered: 0x");
                            sb3.append(Integer.toHexString(iIntValue4));
                            throw new adk(sb3.toString());
                        }
                        affVar = new aff();
                        affVar.f52593p0 = aejVar5;
                        int i71 = i67 & 49;
                        int i72 = 49 | i67;
                        int i73 = ((i71 | i72) << 1) - (i71 ^ i72);
                        f52546d = i73 % 128;
                        if (i73 % 2 != 0) {
                            obj2 = affVar;
                            throw null;
                        }
                    }
                    f52547e = i13 % 128;
                    int i74 = i13 % 2;
                    obj2 = obj;
                } else {
                    afa afaVar2 = new afa(aejVar5);
                    int i75 = i65 & 111;
                    int i76 = ((i65 ^ 111) | i75) << 1;
                    int i77 = -((~i75) & (i65 | 111));
                    int i78 = (i76 ^ i77) + ((i76 & i77) << 1);
                    f52547e = i78 % 128;
                    int i79 = i78 % 2;
                    obj2 = afaVar2;
                }
                obj2 = afaVar;
                obj2 = afmVar;
                obj2 = agnVar;
                obj2 = afmVar2;
                obj2 = affVar;
                obj2 = l0Var;
                return obj2;
            case 4:
                aej aejVar6 = (aej) objArr[0];
                int i80 = f52547e;
                int i81 = (i80 & (-102)) | ((~i80) & 101);
                int i82 = -(-((i80 & 101) << 1));
                int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
                f52546d = i83 % 128;
                int i84 = i83 % 2;
                int i85 = aejVar6.f52548a.read();
                if (i85 < 0) {
                    adh adhVar = new adh(0);
                    int i86 = f52546d;
                    int i87 = (i86 & (-52)) | ((~i86) & 51);
                    int i88 = (i86 & 51) << 1;
                    int i89 = (i87 ^ i88) + ((i88 & i87) << 1);
                    f52547e = i89 % 128;
                    int i90 = i89 % 2;
                    obj3 = adhVar;
                    obj3 = adyVar;
                    obj3 = adyVar2;
                    obj3 = addVar;
                    obj3 = addVar;
                    return obj3;
                }
                adh adhVar2 = new adh();
                int i91 = f52546d;
                int i92 = i91 ^ 5;
                int i93 = (((5 & i91) | i92) << 1) - i92;
                f52547e = i93 % 128;
                int i94 = i93 % 2;
                do {
                    add addVar2 = (add) setCompoundDrawableTintBlendMode(new Object[]{aejVar6, Integer.valueOf(i85)}, -1173952752, 1173952760, i85);
                    if (!(addVar2 instanceof agt)) {
                        adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, addVar2.UiMessageCallbackKtWhenMappings()}, 240298319, -240298315, System.identityHashCode(adhVar2));
                        int i95 = f52546d;
                        int i96 = i95 & 65;
                        i14 = (i96 - (~(-(-((i95 ^ 65) | i96))))) - 1;
                    } else {
                        int i97 = f52547e;
                        int i98 = (i97 & 24) + (i97 | 24);
                        int i99 = (i98 ^ (-1)) + (i98 << 1);
                        f52546d = i99 % 128;
                        int i100 = i99 % 2;
                        ady layoutAnimation = ((agt) addVar2).setLayoutAnimation();
                        if (i100 != 0) {
                            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, layoutAnimation}, 240298319, -240298315, System.identityHashCode(adhVar2));
                            int i101 = 11 / 0;
                        } else {
                            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, layoutAnimation}, 240298319, -240298315, System.identityHashCode(adhVar2));
                        }
                        int i102 = f52546d;
                        i14 = ((i102 & (-34)) | ((~i102) & 33)) + ((i102 & 33) << 1);
                    }
                    f52547e = i14 % 128;
                    int i103 = i14 % 2;
                    i85 = aejVar6.f52548a.read();
                } while (i85 >= 0);
                int i104 = f52547e;
                int i105 = i104 & 81;
                int i106 = (i104 ^ 81) | i105;
                int i107 = (i105 & i106) + (i106 | i105);
                f52546d = i107 % 128;
                if (i107 % 2 != 0) {
                    int i108 = 7 / 0;
                }
                return adhVar2;
            case 5:
                aej aejVar7 = (aej) objArr[0];
                int iIntValue5 = ((Number) objArr[1]).intValue();
                int iIntValue6 = ((Number) objArr[2]).intValue();
                boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
                int i109 = f52547e;
                int i110 = i109 & 91;
                int i111 = (i110 - (~((i109 ^ 91) | i110))) - 1;
                int i112 = i111 % 128;
                f52546d = i112;
                if (i111 % 2 != 0) {
                    throw null;
                }
                if (zBooleanValue) {
                    adyVar = (ady) aeh.setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue6), (adh) setCompoundDrawableTintBlendMode(new Object[]{aejVar7}, 2021899958, -2021899954, System.identityHashCode(aejVar7))}, -2009735039, 2009735042, iIntValue5);
                    int i113 = f52546d;
                    int i114 = i113 ^ 57;
                    int i115 = (i113 & 57) << 1;
                    int i116 = ((i114 | i115) << 1) - (i115 ^ i114);
                    f52547e = i116 % 128;
                    if (i116 % 2 == 0) {
                        obj3 = adyVar;
                        throw null;
                    }
                } else {
                    int i117 = ((((i112 ^ 119) | (i112 & 119)) << 1) - (~(-(((~i112) & 119) | (i112 & (-120)))))) - 1;
                    f52547e = i117 % 128;
                    int i118 = i117 % 2;
                    s0 s0Var2 = (s0) aejVar7.f52548a;
                    if (i118 == 0) {
                        throw null;
                    }
                    adyVar2 = (ady) aeh.setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue6), (byte[]) s0.b(new Object[]{s0Var2}, 1552872941, -1552872940, System.identityHashCode(s0Var2))}, -660329960, 660329967, iIntValue5);
                    int i119 = f52546d;
                    int i120 = ((i119 ^ 94) + ((i119 & 94) << 1)) - 1;
                    f52547e = i120 % 128;
                    if (i120 % 2 == 0) {
                        obj3 = adyVar2;
                        int i121 = 30 / 0;
                        obj3 = adyVar2;
                    }
                }
                obj3 = adyVar;
                obj3 = adyVar2;
                obj3 = addVar;
                obj3 = addVar;
                return obj3;
            case 6:
                aej aejVar8 = (aej) objArr[0];
                int iIntValue7 = ((Number) objArr[1]).intValue();
                int iIntValue8 = ((Number) objArr[2]).intValue();
                int i122 = f52547e;
                int i123 = (i122 & (-112)) | ((~i122) & 111);
                int i124 = (i122 & 111) << 1;
                int i125 = (i123 & i124) + (i124 | i123);
                f52546d = i125 % 128;
                if (i125 % 2 == 0) {
                    return (ady) aeh.setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue7), Integer.valueOf(iIntValue8), (adh) setCompoundDrawableTintBlendMode(new Object[]{aejVar8}, 2021899958, -2021899954, System.identityHashCode(aejVar8))}, -1379436516, 1379436517, iIntValue7);
                }
                throw null;
            case 7:
                aej aejVar9 = (aej) objArr[0];
                int i126 = f52546d;
                int i127 = i126 & 9;
                int i128 = (i126 | 9) & (~i127);
                int i129 = -(-(i127 << 1));
                int i130 = (i128 & i129) + (i128 | i129);
                f52547e = i130 % 128;
                if (i130 % 2 == 0) {
                    aejVar9.f52548a.read();
                    throw null;
                }
                int i131 = aejVar9.f52548a.read();
                if (i131 < 0) {
                    int i132 = f52546d;
                    int i133 = i132 & 91;
                    int i134 = -(-((i132 ^ 91) | i133));
                    int i135 = ((i133 | i134) << 1) - (i134 ^ i133);
                    f52547e = i135 % 128;
                    int i136 = i135 % 2;
                    return null;
                }
                add addVar3 = (add) setCompoundDrawableTintBlendMode(new Object[]{aejVar9, Integer.valueOf(i131)}, -1173952752, 1173952760, i131);
                int i137 = f52546d;
                int i138 = (i137 & (-20)) | ((~i137) & 19);
                int i139 = -(-((i137 & 19) << 1));
                int i140 = ((i138 | i139) << 1) - (i139 ^ i138);
                f52547e = i140 % 128;
                if (i140 % 2 == 0) {
                    obj3 = addVar3;
                    throw null;
                }
                obj3 = adyVar;
                obj3 = adyVar2;
                obj3 = addVar3;
                obj3 = addVar;
                return obj3;
            case 8:
                aej aejVar10 = (aej) objArr[0];
                int iIntValue9 = ((Number) objArr[1]).intValue();
                int i141 = f52546d;
                int i142 = (-2) - (((i141 ^ 24) + ((i141 & 24) << 1)) ^ (-1));
                f52547e = i142 % 128;
                if (i142 % 2 != 0) {
                    setCompoundDrawableTintBlendMode(new Object[]{aejVar10}, 921582392, -921582390, System.identityHashCode(aejVar10));
                    iIntValue = ((Integer) adq.setOnFocusChangeListener(new Object[]{aejVar10.f52548a, Integer.valueOf(iIntValue9)}, 1744808146, -1744808145, iIntValue9)).intValue();
                    inputStream = aejVar10.f52548a;
                    i15 = aejVar10.f52549b;
                    if (iIntValue != 3) {
                        if (iIntValue != 4) {
                            int i143 = f52546d;
                            int i144 = i143 ^ 71;
                            i16 = (((i143 & 71) | i144) << 1) - i144;
                            f52547e = i16 % 128;
                            if (i16 % 2 == 0) {
                            }
                        }
                    }
                    iIntValue2 = ((Integer) adq.setOnFocusChangeListener(new Object[]{inputStream, Integer.valueOf(i15), Boolean.valueOf(z10)}, 838309649, -838309643, i15)).intValue();
                    if (iIntValue2 < 0) {
                        int i145 = f52546d + 76;
                        int i146 = (i145 ^ (-1)) + (i145 << 1);
                        f52547e = i146 % 128;
                        int i147 = i146 % 2;
                        if ((iIntValue9 & 32) == 0) {
                            throw new IOException("indefinite-length primitive encoding encountered");
                        }
                        InputStream inputStream3 = aejVar10.f52548a;
                        int i148 = aejVar10.f52549b;
                        aejVar2 = new aej(new v0(inputStream3, i148), i148, aejVar10.f52550c);
                        i20 = iIntValue9 & 192;
                        if (i20 != 0) {
                            l0Var = new l0(i20, iIntValue, aejVar2);
                            int i149 = f52546d;
                            int i150 = i149 & 103;
                            i22 = ((((i149 ^ 103) | i150) << 1) - (~(-((i149 | 103) & (~i150))))) - 1;
                            f52547e = i22 % 128;
                            if (i22 % 2 == 0) {
                                obj2 = l0Var;
                                throw null;
                            }
                            obj2 = afaVar;
                            obj2 = afmVar;
                            obj2 = agnVar;
                            obj2 = afmVar2;
                            obj2 = affVar;
                            obj2 = l0Var;
                            return obj2;
                        }
                        addVar = (add) setCompoundDrawableTintBlendMode(new Object[]{aejVar2, Integer.valueOf(iIntValue)}, 901823817, -901823814, iIntValue);
                        int i151 = f52546d;
                        i21 = (i151 ^ 87) + ((i151 & 87) << 1);
                        f52547e = i21 % 128;
                        if (i21 % 2 == 0) {
                            obj3 = addVar;
                            int i152 = 42 / 0;
                            obj3 = addVar;
                        }
                    } else {
                        s0Var = new s0(aejVar10.f52548a, iIntValue2, aejVar10.f52549b);
                        if ((iIntValue9 & 224) == 0) {
                            int i153 = f52547e;
                            int i154 = i153 & 77;
                            int i155 = (i154 - (~((i153 ^ 77) | i154))) - 1;
                            f52546d = i155 % 128;
                            int i156 = i155 % 2;
                            add addVar4 = (add) setCompoundDrawableTintBlendMode(new Object[]{aejVar10, Integer.valueOf(iIntValue), s0Var}, 151783266, -151783266, iIntValue);
                            int i157 = f52547e;
                            int i158 = ((i157 ^ 118) + ((i157 & 118) << 1)) - 1;
                            f52546d = i158 % 128;
                            int i159 = i158 % 2;
                            obj3 = addVar4;
                        } else {
                            aejVar = new aej(s0Var, x0.a(new Object[]{s0Var}, -54208317, 54208318, System.identityHashCode(s0Var)).intValue(), aejVar10.f52550c);
                            i17 = iIntValue9 & 192;
                            if (i17 != 0) {
                                i18 = f52547e;
                                int i160 = i18 + 105;
                                i19 = i160 % 128;
                                f52546d = i19;
                                int i161 = i160 % 2;
                                if ((iIntValue9 & 32) != 0) {
                                    int i162 = i18 & 25;
                                    int i163 = (i18 | 25) & (~i162);
                                    int i164 = i162 << 1;
                                    int i165 = (i163 & i164) + (i163 | i164);
                                    int i166 = i165 % 128;
                                    f52546d = i166;
                                    int i167 = i165 % 2;
                                    int i168 = i166 & 45;
                                    int i169 = (i166 | 45) & (~i168);
                                    int i170 = i168 << 1;
                                    int i171 = (i169 ^ i170) + ((i169 & i170) << 1);
                                    f52547e = i171 % 128;
                                    int i172 = i171 % 2;
                                    z11 = true;
                                } else {
                                    int i173 = ((i19 & 118) + (i19 | 118)) - 1;
                                    f52547e = i173 % 128;
                                    int i174 = i173 % 2;
                                }
                                r0 r0Var = new r0(i17, iIntValue, z11, aejVar);
                                int i175 = f52547e;
                                int i176 = ((((i175 ^ 49) | (i175 & 49)) << 1) - (~(-(((~i175) & 49) | (i175 & (-50)))))) - 1;
                                f52546d = i176 % 128;
                                int i177 = i176 % 2;
                                return r0Var;
                            }
                            add addVar5 = (add) setCompoundDrawableTintBlendMode(new Object[]{aejVar, Integer.valueOf(iIntValue)}, -807733698, 807733699, iIntValue);
                            int i178 = f52546d;
                            int i179 = ((i178 | 12) << 1) - (i178 ^ 12);
                            int i180 = (i179 ^ (-1)) + (i179 << 1);
                            f52547e = i180 % 128;
                            int i181 = i180 % 2;
                            obj3 = addVar5;
                        }
                    }
                    obj3 = adyVar;
                    obj3 = adyVar2;
                    obj3 = addVar3;
                    obj3 = addVar;
                    return obj3;
                }
                setCompoundDrawableTintBlendMode(new Object[]{aejVar10}, 921582392, -921582390, System.identityHashCode(aejVar10));
                iIntValue = ((Integer) adq.setOnFocusChangeListener(new Object[]{aejVar10.f52548a, Integer.valueOf(iIntValue9)}, 1744808146, -1744808145, iIntValue9)).intValue();
                inputStream = aejVar10.f52548a;
                i15 = aejVar10.f52549b;
                if (iIntValue != 5) {
                    if (iIntValue != 4) {
                        int i1410 = f52546d;
                        int i1411 = i1410 ^ 71;
                        i16 = (((i1410 & 71) | i1411) << 1) - i1411;
                        f52547e = i16 % 128;
                        if (i16 % 2 == 0 ? iIntValue != 16 : iIntValue != 14) {
                            int i182 = i1410 & 51;
                            int i183 = (~i182) & (i1410 | 51);
                            int i184 = -(-(i182 << 1));
                            int i185 = ((i183 | i184) << 1) - (i184 ^ i183);
                            f52547e = i185 % 128;
                            if (i185 % 2 != 0 ? iIntValue != 17 : iIntValue != 13) {
                                int i186 = i1410 & 33;
                                int i187 = ((i1410 ^ 33) | i186) << 1;
                                int i188 = -((i1410 | 33) & (~i186));
                                int i189 = (i187 ^ i188) + ((i188 & i187) << 1);
                                int i190 = i189 % 128;
                                f52547e = i190;
                                int i191 = i189 % 2;
                                if (iIntValue != 8) {
                                    int i192 = ((((i190 ^ 125) | (i190 & 125)) << 1) - (~(-(((~i190) & 125) | (i190 & (-126)))))) - 1;
                                    f52546d = i192 % 128;
                                    int i193 = i192 % 2;
                                    z10 = false;
                                }
                            }
                        }
                    }
                }
                iIntValue2 = ((Integer) adq.setOnFocusChangeListener(new Object[]{inputStream, Integer.valueOf(i15), Boolean.valueOf(z10)}, 838309649, -838309643, i15)).intValue();
                if (iIntValue2 < 0) {
                    int i1412 = f52546d + 76;
                    int i1413 = (i1412 ^ (-1)) + (i1412 << 1);
                    f52547e = i1413 % 128;
                    int i1414 = i1413 % 2;
                    if ((iIntValue9 & 32) == 0) {
                        throw new IOException("indefinite-length primitive encoding encountered");
                    }
                    InputStream inputStream4 = aejVar10.f52548a;
                    int i1415 = aejVar10.f52549b;
                    aejVar2 = new aej(new v0(inputStream4, i1415), i1415, aejVar10.f52550c);
                    i20 = iIntValue9 & 192;
                    if (i20 != 0) {
                        l0Var = new l0(i20, iIntValue, aejVar2);
                        int i1416 = f52546d;
                        int i1510 = i1416 & 103;
                        i22 = ((((i1416 ^ 103) | i1510) << 1) - (~(-((i1416 | 103) & (~i1510))))) - 1;
                        f52547e = i22 % 128;
                        if (i22 % 2 == 0) {
                            obj2 = l0Var;
                            throw null;
                        }
                        obj2 = afaVar;
                        obj2 = afmVar;
                        obj2 = agnVar;
                        obj2 = afmVar2;
                        obj2 = affVar;
                        obj2 = l0Var;
                        return obj2;
                    }
                    addVar = (add) setCompoundDrawableTintBlendMode(new Object[]{aejVar2, Integer.valueOf(iIntValue)}, 901823817, -901823814, iIntValue);
                    int i1511 = f52546d;
                    i21 = (i1511 ^ 87) + ((i1511 & 87) << 1);
                    f52547e = i21 % 128;
                    if (i21 % 2 == 0) {
                        obj3 = addVar;
                        int i1512 = 42 / 0;
                        obj3 = addVar;
                    }
                } else {
                    s0Var = new s0(aejVar10.f52548a, iIntValue2, aejVar10.f52549b);
                    if ((iIntValue9 & 224) == 0) {
                        int i1513 = f52547e;
                        int i1514 = i1513 & 77;
                        int i1515 = (i1514 - (~((i1513 ^ 77) | i1514))) - 1;
                        f52546d = i1515 % 128;
                        int i1516 = i1515 % 2;
                        add addVar6 = (add) setCompoundDrawableTintBlendMode(new Object[]{aejVar10, Integer.valueOf(iIntValue), s0Var}, 151783266, -151783266, iIntValue);
                        int i1517 = f52547e;
                        int i1518 = ((i1517 ^ 118) + ((i1517 & 118) << 1)) - 1;
                        f52546d = i1518 % 128;
                        int i1519 = i1518 % 2;
                        obj3 = addVar6;
                    } else {
                        aejVar = new aej(s0Var, x0.a(new Object[]{s0Var}, -54208317, 54208318, System.identityHashCode(s0Var)).intValue(), aejVar10.f52550c);
                        i17 = iIntValue9 & 192;
                        if (i17 != 0) {
                            i18 = f52547e;
                            int i1610 = i18 + 105;
                            i19 = i1610 % 128;
                            f52546d = i19;
                            int i1611 = i1610 % 2;
                            if ((iIntValue9 & 32) != 0) {
                                int i1612 = i18 & 25;
                                int i1613 = (i18 | 25) & (~i1612);
                                int i1614 = i1612 << 1;
                                int i1615 = (i1613 & i1614) + (i1613 | i1614);
                                int i1616 = i1615 % 128;
                                f52546d = i1616;
                                int i1617 = i1615 % 2;
                                int i1618 = i1616 & 45;
                                int i1619 = (i1616 | 45) & (~i1618);
                                int i1710 = i1618 << 1;
                                int i1711 = (i1619 ^ i1710) + ((i1619 & i1710) << 1);
                                f52547e = i1711 % 128;
                                int i1712 = i1711 % 2;
                                z11 = true;
                            } else {
                                int i1713 = ((i19 & 118) + (i19 | 118)) - 1;
                                f52547e = i1713 % 128;
                                int i1714 = i1713 % 2;
                            }
                            r0 r0Var2 = new r0(i17, iIntValue, z11, aejVar);
                            int i1715 = f52547e;
                            int i1716 = ((((i1715 ^ 49) | (i1715 & 49)) << 1) - (~(-(((~i1715) & 49) | (i1715 & (-50)))))) - 1;
                            f52546d = i1716 % 128;
                            int i1717 = i1716 % 2;
                            return r0Var2;
                        }
                        add addVar7 = (add) setCompoundDrawableTintBlendMode(new Object[]{aejVar, Integer.valueOf(iIntValue)}, -807733698, 807733699, iIntValue);
                        int i1718 = f52546d;
                        int i1719 = ((i1718 | 12) << 1) - (i1718 ^ 12);
                        int i1810 = (i1719 ^ (-1)) + (i1719 << 1);
                        f52547e = i1810 % 128;
                        int i1811 = i1810 % 2;
                        obj3 = addVar7;
                    }
                }
                obj3 = adyVar;
                obj3 = adyVar2;
                obj3 = addVar3;
                obj3 = addVar;
                return obj3;
                int i194 = (-2) - ((f52546d + 120) ^ (-1));
                f52547e = i194 % 128;
                int i195 = i194 % 2;
                z10 = true;
                iIntValue2 = ((Integer) adq.setOnFocusChangeListener(new Object[]{inputStream, Integer.valueOf(i15), Boolean.valueOf(z10)}, 838309649, -838309643, i15)).intValue();
                if (iIntValue2 < 0) {
                    int i1417 = f52546d + 76;
                    int i1418 = (i1417 ^ (-1)) + (i1417 << 1);
                    f52547e = i1418 % 128;
                    int i1419 = i1418 % 2;
                    if ((iIntValue9 & 32) == 0) {
                        throw new IOException("indefinite-length primitive encoding encountered");
                    }
                    InputStream inputStream5 = aejVar10.f52548a;
                    int i14110 = aejVar10.f52549b;
                    aejVar2 = new aej(new v0(inputStream5, i14110), i14110, aejVar10.f52550c);
                    i20 = iIntValue9 & 192;
                    if (i20 != 0) {
                        l0Var = new l0(i20, iIntValue, aejVar2);
                        int i14111 = f52546d;
                        int i15110 = i14111 & 103;
                        i22 = ((((i14111 ^ 103) | i15110) << 1) - (~(-((i14111 | 103) & (~i15110))))) - 1;
                        f52547e = i22 % 128;
                        if (i22 % 2 == 0) {
                            obj2 = l0Var;
                            throw null;
                        }
                        obj2 = afaVar;
                        obj2 = afmVar;
                        obj2 = agnVar;
                        obj2 = afmVar2;
                        obj2 = affVar;
                        obj2 = l0Var;
                        return obj2;
                    }
                    addVar = (add) setCompoundDrawableTintBlendMode(new Object[]{aejVar2, Integer.valueOf(iIntValue)}, 901823817, -901823814, iIntValue);
                    int i15111 = f52546d;
                    i21 = (i15111 ^ 87) + ((i15111 & 87) << 1);
                    f52547e = i21 % 128;
                    if (i21 % 2 == 0) {
                        obj3 = addVar;
                        int i15112 = 42 / 0;
                        obj3 = addVar;
                    }
                } else {
                    s0Var = new s0(aejVar10.f52548a, iIntValue2, aejVar10.f52549b);
                    if ((iIntValue9 & 224) == 0) {
                        int i15113 = f52547e;
                        int i15114 = i15113 & 77;
                        int i15115 = (i15114 - (~((i15113 ^ 77) | i15114))) - 1;
                        f52546d = i15115 % 128;
                        int i15116 = i15115 % 2;
                        add addVar8 = (add) setCompoundDrawableTintBlendMode(new Object[]{aejVar10, Integer.valueOf(iIntValue), s0Var}, 151783266, -151783266, iIntValue);
                        int i15117 = f52547e;
                        int i15118 = ((i15117 ^ 118) + ((i15117 & 118) << 1)) - 1;
                        f52546d = i15118 % 128;
                        int i15119 = i15118 % 2;
                        obj3 = addVar8;
                    } else {
                        aejVar = new aej(s0Var, x0.a(new Object[]{s0Var}, -54208317, 54208318, System.identityHashCode(s0Var)).intValue(), aejVar10.f52550c);
                        i17 = iIntValue9 & 192;
                        if (i17 != 0) {
                            i18 = f52547e;
                            int i16110 = i18 + 105;
                            i19 = i16110 % 128;
                            f52546d = i19;
                            int i16111 = i16110 % 2;
                            if ((iIntValue9 & 32) != 0) {
                                int i16112 = i18 & 25;
                                int i16113 = (i18 | 25) & (~i16112);
                                int i16114 = i16112 << 1;
                                int i16115 = (i16113 & i16114) + (i16113 | i16114);
                                int i16116 = i16115 % 128;
                                f52546d = i16116;
                                int i16117 = i16115 % 2;
                                int i16118 = i16116 & 45;
                                int i16119 = (i16116 | 45) & (~i16118);
                                int i17110 = i16118 << 1;
                                int i17111 = (i16119 ^ i17110) + ((i16119 & i17110) << 1);
                                f52547e = i17111 % 128;
                                int i17112 = i17111 % 2;
                                z11 = true;
                            } else {
                                int i17113 = ((i19 & 118) + (i19 | 118)) - 1;
                                f52547e = i17113 % 128;
                                int i17114 = i17113 % 2;
                            }
                            r0 r0Var3 = new r0(i17, iIntValue, z11, aejVar);
                            int i17115 = f52547e;
                            int i17116 = ((((i17115 ^ 49) | (i17115 & 49)) << 1) - (~(-(((~i17115) & 49) | (i17115 & (-50)))))) - 1;
                            f52546d = i17116 % 128;
                            int i17117 = i17116 % 2;
                            return r0Var3;
                        }
                        add addVar9 = (add) setCompoundDrawableTintBlendMode(new Object[]{aejVar, Integer.valueOf(iIntValue)}, -807733698, 807733699, iIntValue);
                        int i17118 = f52546d;
                        int i17119 = ((i17118 | 12) << 1) - (i17118 ^ 12);
                        int i1812 = (i17119 ^ (-1)) + (i17119 << 1);
                        f52547e = i1812 % 128;
                        int i1813 = i1812 % 2;
                        obj3 = addVar9;
                    }
                }
                obj3 = adyVar;
                obj3 = adyVar2;
                obj3 = addVar3;
                obj3 = addVar;
                return obj3;
            default:
                aej aejVar11 = (aej) objArr[0];
                int iIntValue10 = ((Number) objArr[1]).intValue();
                s0 s0Var3 = (s0) objArr[2];
                int i196 = f52546d;
                int i197 = ((((i196 ^ 61) | (i196 & 61)) << 1) - (~(-((i196 & (-62)) | ((~i196) & 61))))) - 1;
                f52547e = i197 % 128;
                int i198 = i197 % 2;
                if (iIntValue10 == 3) {
                    agh aghVar = new agh(s0Var3);
                    int i199 = i196 & 1;
                    int i200 = i196 | 1;
                    int i201 = (i199 ^ i200) + ((i199 & i200) << 1);
                    f52547e = i201 % 128;
                    int i202 = i201 % 2;
                    obj3 = aghVar;
                } else if (iIntValue10 == 4) {
                    afu afuVar = new afu();
                    afuVar.f52605p0 = s0Var3;
                    int i203 = i196 + 125;
                    f52547e = i203 % 128;
                    int i204 = i203 % 2;
                    obj3 = afuVar;
                } else {
                    if (iIntValue10 == 8) {
                        throw new adk("externals must use constructed encoding (see X.690 8.18)");
                    }
                    if (iIntValue10 == 16) {
                        throw new adk("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
                    }
                    if (iIntValue10 == 17) {
                        throw new adk("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
                    }
                    try {
                        ady adyVar3 = (ady) adq.setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue10), s0Var3, aejVar11.f52550c}, 738499635, -738499630, iIntValue10);
                        int i205 = f52547e;
                        int i206 = ((i205 | 109) << 1) - (i205 ^ 109);
                        f52546d = i206 % 128;
                        int i207 = i206 % 2;
                        obj3 = adyVar3;
                    } catch (IllegalArgumentException e5) {
                        throw new adk("corrupted stream detected", e5);
                    }
                }
                obj3 = adyVar;
                obj3 = adyVar2;
                obj3 = addVar3;
                obj3 = addVar;
                return obj3;
        }
    }

    public final add setCompoundDrawableTintBlendMode() throws IOException {
        return (add) setCompoundDrawableTintBlendMode(new Object[]{this}, -2132690708, 2132690715, System.identityHashCode(this));
    }
}
