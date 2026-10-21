package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public abstract class alm implements akv, beu {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53045d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f53046e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f53047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f53049c;
    protected final akp setCompoundDrawableTintBlendMode;

    public alm(alm almVar) {
        this.f53047a = new byte[4];
        this.setCompoundDrawableTintBlendMode = almVar.setCompoundDrawableTintBlendMode;
        setY(new Object[]{this, almVar}, -141122684, 141122686, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x012d A[PHI: r8
      0x012d: PHI (r8v18 int) = (r8v16 int), (r8v31 int) binds: [B:28:0x0138, B:24:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x013d  */
    /* JADX WARN: Code duplicated, block: B:34:0x026b A[LOOP:1: B:30:0x013b->B:34:0x026b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0278 A[SYNTHETIC] */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int iMax;
        alm almVar;
        int i13;
        int i14;
        byte[] bArr;
        int i15;
        int i16;
        int i17;
        alm almVar2;
        long j10;
        int i18 = ~((~i10) | i11);
        int i19 = ~((~i11) | i10);
        int i20 = ~(i10 | i12);
        int i21 = ((i20 | i19) * 658) + (i19 * 658) + ((i18 | i19 | i20) * (-658)) + (i11 * (-657)) + (i10 * 659);
        int i22 = 0;
        int i23 = 2;
        int i24 = 1;
        if (i21 == 1) {
            obj = null;
            alm almVar3 = (alm) objArr[0];
            byte bByteValue = ((Byte) objArr[1]).byteValue();
            System.identityHashCode(almVar3);
            System.identityHashCode(almVar3);
            byte[] bArr2 = almVar3.f53047a;
            int i25 = almVar3.f53048b;
            int iIdentityHashCode = System.identityHashCode(almVar3);
            int i26 = i25 * (-107);
            int i27 = ((55 & i26) - (~(-(-(i26 | 55))))) - 1;
            int i28 = (-2) ^ i25;
            int i29 = ~i25;
            int i30 = (-2) & i25;
            int i31 = (i28 ^ i30) | (i28 & i30);
            int i32 = ~i31;
            int i33 = (i31 | i32) & i32;
            int i34 = ~iIdentityHashCode;
            int i35 = (i34 | iIdentityHashCode) & i34;
            int i36 = (i35 & i25) | (i35 ^ i25);
            int i37 = ~i36;
            int i38 = (i36 | i37) & i37;
            int i39 = i33 & i38;
            int i40 = (i33 | i38) & (~i39);
            int i41 = ((i40 & i39) | (i40 ^ i39)) * (-108);
            int i42 = i27 ^ i41;
            int i43 = ((i41 & i27) | i42) << 1;
            int i44 = -i42;
            int i45 = (i43 & i44) + (i43 | i44);
            int i46 = ~(((-2) ^ iIdentityHashCode) | ((-2) & iIdentityHashCode));
            int i47 = i29 & 1;
            int i48 = (~i47) & (i29 | 1);
            int i49 = ~((i47 & i48) | (i48 ^ i47));
            int i50 = ((~i49) & i46) | ((~i46) & i49);
            int i51 = i46 & i49;
            int i52 = i34 ^ 1;
            int i53 = i34 & 1;
            int i54 = (i53 & i52) | (i52 ^ i53);
            int i55 = ~i54;
            int i56 = ((i51 & i50) | (i50 ^ i51) | ((i54 | i55) & i55)) * 54;
            int i57 = (i45 ^ i56) + ((i56 & i45) << 1);
            int i58 = (i29 | i25) & i29;
            int i59 = i58 ^ 1;
            int i60 = i58 & 1;
            int i61 = -(-((iIdentityHashCode | (~((i60 & i59) | (i59 ^ i60)))) * 54));
            int i62 = (((~i61) & i57) | ((~i57) & i61)) + ((i61 & i57) << 1);
            almVar3.f53048b = i62;
            bArr2[i25] = bByteValue;
            byte[] bArr3 = almVar3.f53047a;
            if (i62 == bArr3.length) {
                int i63 = f53046e;
                int i64 = (i63 ^ 82) + ((i63 & 82) << 1);
                int i65 = (i64 ^ (-1)) + (i64 << 1);
                f53045d = i65 % 128;
                int i66 = i65 % 2;
                almVar3.setOnFocusChangeListener(bArr3, 0);
                almVar3.f53048b = 0;
                int i67 = f53045d;
                int i68 = (i67 | 115) << 1;
                int i69 = -(i67 ^ 115);
                int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
                f53046e = i70 % 128;
                int i71 = i70 % 2;
            }
            almVar3.f53049c++;
            int i72 = f53045d;
            int i73 = (-2) - (((i72 & 8) + (i72 | 8)) ^ (-1));
            f53046e = i73 % 128;
            if (i73 % 2 == 0) {
                int i74 = 19 / 0;
            }
        } else {
            if (i21 != 2) {
                if (i21 != 3) {
                    if (i21 != 4) {
                        int i75 = f53045d;
                        int i76 = ((i75 ^ 68) + ((i75 & 68) << 1)) - 1;
                        f53046e = i76 % 128;
                        int i77 = i76 % 2;
                        int i78 = i75 & 43;
                        int i79 = ((i75 ^ 43) | i78) << 1;
                        int i80 = -((i75 | 43) & (~i78));
                        int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
                        f53046e = i81 % 128;
                        if (i81 % 2 != 0) {
                            return 64;
                        }
                        throw null;
                    }
                    alm almVar4 = (alm) objArr[0];
                    int i82 = f53045d + 17;
                    f53046e = i82 % 128;
                    if (i82 % 2 == 0) {
                        j10 = almVar4.f53049c << 5;
                        setY(new Object[]{almVar4, (byte) 54}, 1546065273, -1546065272, System.identityHashCode(almVar4));
                    } else {
                        j10 = almVar4.f53049c << 3;
                        setY(new Object[]{almVar4, (byte) -128}, 1546065273, -1546065272, System.identityHashCode(almVar4));
                    }
                    int i83 = f53045d;
                    int i84 = ((i83 | 51) << 1) - (i83 ^ 51);
                    f53046e = i84 % 128;
                    int i85 = i84 % 2;
                    while (almVar4.f53048b != 0) {
                        int i86 = f53046e;
                        int i87 = i86 & 49;
                        int i88 = (((i86 ^ 49) | i87) << 1) - ((i86 | 49) & (~i87));
                        f53045d = i88 % 128;
                        int i89 = i88 % 2;
                        setY(new Object[]{almVar4, (byte) 0}, 1546065273, -1546065272, System.identityHashCode(almVar4));
                        int i90 = f53046e;
                        int i91 = (i90 ^ 24) + ((i90 & 24) << 1);
                        int i92 = (i91 ^ (-1)) + (i91 << 1);
                        f53045d = i92 % 128;
                        int i93 = i92 % 2;
                    }
                    almVar4.setOnFocusChangeListener(j10);
                    almVar4.setLayoutAnimation();
                    int i94 = f53045d;
                    int i95 = ((i94 | 101) << 1) - (i94 ^ 101);
                    f53046e = i95 % 128;
                    int i96 = i95 % 2;
                    return null;
                }
                alm almVar5 = (alm) objArr[0];
                byte[] bArr4 = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int iIntValue2 = ((Number) objArr[3]).intValue();
                int i97 = f53046e;
                int i98 = i97 & 95;
                int i99 = i98 + ((i97 ^ 95) | i98);
                f53045d = i99 % 128;
                if (i99 % 2 != 0) {
                    iMax = Math.max(1, iIntValue2);
                    if (almVar5.f53048b != 0) {
                        i13 = 0;
                        while (true) {
                            if (i13 < iMax) {
                                almVar = almVar5;
                                i22 = i13;
                                break;
                            }
                            int i100 = f53045d;
                            int i101 = (i100 & (-2)) | ((~i100) & i24);
                            int i102 = (i100 & i24) << i24;
                            int i103 = (i101 & i102) + (i102 | i101);
                            i14 = i103 % 128;
                            f53046e = i14;
                            int i104 = i103 % i23;
                            bArr = almVar5.f53047a;
                            int i105 = almVar5.f53048b;
                            int i106 = (i105 * (-55)) - 55;
                            int i107 = ~iIntValue;
                            int i108 = (i107 & 1) | (iIntValue & (-2));
                            int i109 = iIntValue & 1;
                            int i110 = ~((i108 ^ i109) | (i108 & i109));
                            int i111 = (~i110) & i105;
                            int i112 = ~i105;
                            int i113 = -(-((i111 | (i110 & i112) | (i110 & i105)) * 56));
                            int i114 = i106 & i113;
                            int i115 = (i114 - (~(-(-((i113 ^ i106) | i114))))) - i24;
                            int i116 = i105 & 1;
                            int i117 = (~i116) & (i105 | 1);
                            int i118 = (~((i117 ^ i116) | (i116 & i117))) * (-56);
                            int i119 = ((i115 | i118) << i24) - (i118 ^ i115);
                            int i120 = ~i107;
                            int i121 = ~((i107 & i112) | (i105 & i120) | (i107 & i105));
                            int i122 = i121 & 1;
                            int i123 = (i121 | i24) & (~i122);
                            int i124 = (i119 - (~(-(~(((i123 & i122) | (i123 ^ i122)) * 56))))) - i24;
                            i15 = (i124 ^ (-1)) + (i124 << 1);
                            almVar5.f53048b = i15;
                            i16 = i13 + 1;
                            int i125 = i13 ^ iIntValue;
                            int i126 = i13 & iIntValue;
                            int i127 = (((iIntValue * 503) + (i13 * 503)) - (~(((i125 ^ i126) | (i125 & i126)) * (-502)))) - i24;
                            int i128 = ~i13;
                            int i129 = ~((i128 & (i128 | i13)) | i107);
                            int i130 = i128 & i107;
                            int i131 = (~i130) & (i128 | i107);
                            int i132 = (i131 ^ i130) | (i131 & i130);
                            i17 = iMax;
                            int i133 = ~i132;
                            int i134 = (i132 | i133) & i133;
                            int i135 = (i134 & i129) | (i129 ^ i134);
                            int i136 = (i13 & i107) | (iIntValue & i128);
                            int i137 = i136 | i126;
                            int i138 = i137 ^ iIntValue;
                            int i139 = i137 & iIntValue;
                            int i140 = ~((i138 ^ i139) | (i139 & i138));
                            almVar2 = almVar5;
                            int i141 = -(~(-(-((((~i135) & i140) | ((~i140) & i135) | (i135 & i140)) * (-502)))));
                            int i142 = ((i127 ^ i141) + ((i141 & i127) << 1)) - 1;
                            int i143 = (i128 & i120) | ((~i128) & i107);
                            int i144 = (i143 & i130) | (i143 ^ i130);
                            int i145 = ~((i144 & iIntValue) | (i144 ^ iIntValue));
                            int i146 = (i136 ^ i126) | (i136 & i126);
                            int i147 = i146 & iIntValue;
                            int i148 = ~(((i146 | iIntValue) & (~i147)) | i147);
                            int i149 = i145 & i148;
                            int i150 = -(~(-(-((((i145 | i148) & (~i149)) | i149) * 502))));
                            bArr[i105] = bArr4[(((i142 | i150) << 1) - (i150 ^ i142)) - 1];
                            if (i15 == 4) {
                                int i151 = i14 + 95;
                                f53045d = i151 % 128;
                                int i152 = i151 % 2;
                                almVar = almVar2;
                                almVar.setOnFocusChangeListener(bArr, 0);
                                almVar.f53048b = 0;
                                int i153 = f53046e;
                                int i154 = i153 & 101;
                                int i155 = (i153 | 101) & (~i154);
                                int i156 = i154 << 1;
                                int i157 = (i155 & i156) + (i155 | i156);
                                f53045d = i157 % 128;
                                int i158 = i157 % 2;
                                i22 = i16;
                                iMax = i17;
                                break;
                            }
                            i13 = i16;
                            iMax = i17;
                            almVar5 = almVar2;
                            i23 = 2;
                            i24 = 1;
                        }
                    } else {
                        almVar = almVar5;
                    }
                } else {
                    iMax = Math.max(0, iIntValue2);
                    if (almVar5.f53048b != 0) {
                        i13 = 0;
                        while (true) {
                            if (i13 < iMax) {
                                almVar = almVar5;
                                i22 = i13;
                                break;
                            }
                            int i1010 = f53045d;
                            int i1011 = (i1010 & (-2)) | ((~i1010) & i24);
                            int i1012 = (i1010 & i24) << i24;
                            int i1013 = (i1011 & i1012) + (i1012 | i1011);
                            i14 = i1013 % 128;
                            f53046e = i14;
                            int i1014 = i1013 % i23;
                            bArr = almVar5.f53047a;
                            int i1015 = almVar5.f53048b;
                            int i1016 = (i1015 * (-55)) - 55;
                            int i1017 = ~iIntValue;
                            int i1018 = (i1017 & 1) | (iIntValue & (-2));
                            int i1019 = iIntValue & 1;
                            int i1110 = ~((i1018 ^ i1019) | (i1018 & i1019));
                            int i1111 = (~i1110) & i1015;
                            int i1112 = ~i1015;
                            int i1113 = -(-((i1111 | (i1110 & i1112) | (i1110 & i1015)) * 56));
                            int i1114 = i1016 & i1113;
                            int i1115 = (i1114 - (~(-(-((i1113 ^ i1016) | i1114))))) - i24;
                            int i1116 = i1015 & 1;
                            int i1117 = (~i1116) & (i1015 | 1);
                            int i1118 = (~((i1117 ^ i1116) | (i1116 & i1117))) * (-56);
                            int i1119 = ((i1115 | i1118) << i24) - (i1118 ^ i1115);
                            int i1210 = ~i1017;
                            int i1211 = ~((i1017 & i1112) | (i1015 & i1210) | (i1017 & i1015));
                            int i1212 = i1211 & 1;
                            int i1213 = (i1211 | i24) & (~i1212);
                            int i1214 = (i1119 - (~(-(~(((i1213 & i1212) | (i1213 ^ i1212)) * 56))))) - i24;
                            i15 = (i1214 ^ (-1)) + (i1214 << 1);
                            almVar5.f53048b = i15;
                            i16 = i13 + 1;
                            int i1215 = i13 ^ iIntValue;
                            int i1216 = i13 & iIntValue;
                            int i1217 = (((iIntValue * 503) + (i13 * 503)) - (~(((i1215 ^ i1216) | (i1215 & i1216)) * (-502)))) - i24;
                            int i1218 = ~i13;
                            int i1219 = ~((i1218 & (i1218 | i13)) | i1017);
                            int i1310 = i1218 & i1017;
                            int i1311 = (~i1310) & (i1218 | i1017);
                            int i1312 = (i1311 ^ i1310) | (i1311 & i1310);
                            i17 = iMax;
                            int i1313 = ~i1312;
                            int i1314 = (i1312 | i1313) & i1313;
                            int i1315 = (i1314 & i1219) | (i1219 ^ i1314);
                            int i1316 = (i13 & i1017) | (iIntValue & i1218);
                            int i1317 = i1316 | i1216;
                            int i1318 = i1317 ^ iIntValue;
                            int i1319 = i1317 & iIntValue;
                            int i1410 = ~((i1318 ^ i1319) | (i1319 & i1318));
                            almVar2 = almVar5;
                            int i1411 = -(~(-(-((((~i1315) & i1410) | ((~i1410) & i1315) | (i1315 & i1410)) * (-502)))));
                            int i1412 = ((i1217 ^ i1411) + ((i1411 & i1217) << 1)) - 1;
                            int i1413 = (i1218 & i1210) | ((~i1218) & i1017);
                            int i1414 = (i1413 & i1310) | (i1413 ^ i1310);
                            int i1415 = ~((i1414 & iIntValue) | (i1414 ^ iIntValue));
                            int i1416 = (i1316 ^ i1216) | (i1316 & i1216);
                            int i1417 = i1416 & iIntValue;
                            int i1418 = ~(((i1416 | iIntValue) & (~i1417)) | i1417);
                            int i1419 = i1415 & i1418;
                            int i159 = -(~(-(-((((i1415 | i1418) & (~i1419)) | i1419) * 502))));
                            bArr[i1015] = bArr4[(((i1412 | i159) << 1) - (i159 ^ i1412)) - 1];
                            if (i15 == 4) {
                                int i1510 = i14 + 95;
                                f53045d = i1510 % 128;
                                int i1511 = i1510 % 2;
                                almVar = almVar2;
                                almVar.setOnFocusChangeListener(bArr, 0);
                                almVar.f53048b = 0;
                                int i1512 = f53046e;
                                int i1513 = i1512 & 101;
                                int i1514 = (i1512 | 101) & (~i1513);
                                int i1515 = i1513 << 1;
                                int i1516 = (i1514 & i1515) + (i1514 | i1515);
                                f53045d = i1516 % 128;
                                int i1517 = i1516 % 2;
                                i22 = i16;
                                iMax = i17;
                                break;
                            }
                            i13 = i16;
                            iMax = i17;
                            almVar5 = almVar2;
                            i23 = 2;
                            i24 = 1;
                        }
                    } else {
                        almVar = almVar5;
                        i22 = 0;
                    }
                }
                int i160 = iMax * (-282);
                int i161 = (((-852) ^ i160) | ((-852) & i160)) << 1;
                int i162 = -((i160 & 851) | ((-852) & (~i160)));
                int i163 = ((i161 | i162) << 1) - (i162 ^ i161);
                int i164 = ~iMax;
                int i165 = (2 & i164) | (iMax & (-3));
                int i166 = 2 & iMax;
                int i167 = ~((i165 & i166) | (i165 ^ i166));
                int i168 = ~((2 ^ iIntValue) | (2 & iIntValue));
                int i169 = -(-(((i168 & i167) | (i167 ^ i168)) * (-283)));
                int i170 = i163 & i169;
                int i171 = i163 | i169;
                int i172 = (i170 ^ i171) + ((i171 & i170) << 1);
                int i173 = -(-((~((i164 ^ (-3)) | (i164 & (-3)))) * 283));
                int i174 = ((i172 | i173) << 1) - (i173 ^ i172);
                int i175 = i164 | 2;
                int i176 = ((~iIntValue) & i175) | ((~i175) & iIntValue);
                int i177 = i175 & iIntValue;
                int i178 = (i174 - (~(-(-((~((i177 & i176) | (i176 ^ i177))) * 283))))) - 1;
                int i179 = f53046e;
                int i180 = ((i179 ^ 51) | (i179 & 51)) << 1;
                int i181 = -(((~i179) & 51) | (i179 & (-52)));
                int i182 = ((i180 | i181) << 1) - (i180 ^ i181);
                f53045d = i182 % 128;
                int i183 = i182 % 2;
                while (i22 < i178) {
                    int i184 = f53046e;
                    int i185 = i184 & 107;
                    int i186 = (i184 ^ 107) | i185;
                    int i187 = (i185 & i186) + (i186 | i185);
                    f53045d = i187 % 128;
                    int i188 = i187 % 2;
                    int i189 = iIntValue | i22;
                    almVar.setOnFocusChangeListener(bArr4, ((i189 << 1) - (~(-(i189 & (~(iIntValue & i22)))))) - 1);
                    i22 = (((i22 & (-5)) | ((~i22) & 4)) - (~((i22 & 4) << 1))) - 1;
                    int i190 = f53045d;
                    int i191 = i190 ^ 21;
                    int i192 = -(-((i190 & 21) << 1));
                    int i193 = ((i191 | i192) << 1) - (i191 ^ i192);
                    f53046e = i193 % 128;
                    int i194 = i193 % 2;
                }
                while (i22 < iMax) {
                    int i195 = f53045d;
                    int i196 = (((i195 | 40) << 1) - (i195 ^ 40)) - 1;
                    int i197 = i196 % 128;
                    f53046e = i197;
                    int i198 = i196 % 2;
                    byte[] bArr5 = almVar.f53047a;
                    int i199 = almVar.f53048b;
                    int i200 = i199 * (-628);
                    int i201 = ((((630 ^ i200) | (630 & i200)) << 1) - (~(-((i200 & (-631)) | (630 & (~i200)))))) - 1;
                    int i202 = ~i199;
                    int i203 = i202 * (-629);
                    int i204 = i201 ^ i203;
                    int i205 = -(-((i203 & i201) << 1));
                    int i206 = (i204 & i205) + (i205 | i204);
                    int i207 = (i202 | i199) & i202;
                    int i208 = ((~i207) & (-2)) | (i207 & 1);
                    int i209 = i207 & (-2);
                    int i210 = (i209 & i208) | (i208 ^ i209);
                    int i211 = ~i210;
                    int i212 = -(-(((i210 | i211) & i211) * (-629)));
                    int i213 = i206 & i212;
                    int i214 = -(-((i212 ^ i206) | i213));
                    int i215 = (i213 & i214) + (i214 | i213);
                    int i216 = (i202 & (-2)) | (i199 & 1);
                    int i217 = i199 & (-2);
                    int i218 = -(-(((i216 & i217) | (i216 ^ i217)) * 629));
                    int i219 = i215 & i218;
                    almVar.f53048b = (i219 - (~(-(-((i218 ^ i215) | i219))))) - 1;
                    int i220 = i22 ^ 1;
                    int i221 = (i22 & 1) << 1;
                    bArr5[i199] = bArr4[(iIntValue - (~(-(-i22)))) - 1];
                    int i222 = i197 & 29;
                    int i223 = (i222 - (~((i197 ^ 29) | i222))) - 1;
                    f53045d = i223 % 128;
                    int i224 = i223 % 2;
                    i22 = (i220 | i221) + (i220 & i221);
                }
                almVar.f53049c += (long) iMax;
                int i225 = f53045d;
                int i226 = i225 & 59;
                int i227 = (i225 | 59) & (~i226);
                int i228 = -(-(i226 << 1));
                int i229 = (i227 ^ i228) + ((i227 & i228) << 1);
                f53046e = i229 % 128;
                if (i229 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            obj = null;
            alm almVar6 = (alm) objArr[0];
            alm almVar7 = (alm) objArr[1];
            int i230 = f53045d;
            int i231 = i230 ^ 109;
            int i232 = (((i230 & 109) | i231) << 1) - i231;
            f53046e = i232 % 128;
            if (i232 % 2 == 0) {
                byte[] bArr6 = almVar7.f53047a;
                System.arraycopy(bArr6, 1, almVar6.f53047a, 1, bArr6.length);
            } else {
                byte[] bArr7 = almVar7.f53047a;
                System.arraycopy(bArr7, 0, almVar6.f53047a, 0, bArr7.length);
            }
            almVar6.f53048b = almVar7.f53048b;
            almVar6.f53049c = almVar7.f53049c;
            int i233 = f53045d;
            int i234 = i233 & 97;
            int i235 = (i233 ^ 97) | i234;
            int i236 = ((i234 | i235) << 1) - (i235 ^ i234);
            f53046e = i236 % 128;
            if (i236 % 2 == 0) {
                int i237 = 27 / 0;
            }
        }
        return obj;
    }

    public final void setCompoundDrawableTintBlendMode() {
        setY(new Object[]{this}, -1214461356, 1214461360, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.akv
    public final int setDividerPadding() {
        return ((Integer) setY(new Object[]{this}, 1703043165, -1703043165, System.identityHashCode(this))).intValue();
    }

    public abstract void setLayoutAnimation();

    public abstract akl setNavigationOnClickListener();

    @Override // com.mypinpad.tsdk.isolation.aky
    public void setOnFocusChangeListener() {
        int i10 = f53045d + 43;
        int i11 = i10 % 128;
        f53046e = i11;
        int i12 = i10 % 2;
        this.f53049c = 0L;
        if (i12 == 0) {
            this.f53048b = 1;
        } else {
            this.f53048b = 0;
        }
        int i13 = (i11 & 55) + (i11 | 55);
        f53045d = i13 % 128;
        int i14 = i13 % 2;
        int i15 = 0;
        while (true) {
            byte[] bArr = this.f53047a;
            if (i15 >= bArr.length) {
                break;
            }
            int i16 = f53046e;
            int i17 = ((i16 | 113) << 1) - (i16 ^ 113);
            f53045d = i17 % 128;
            int i18 = i17 % 2;
            bArr[i15] = 0;
            int i19 = (i15 & (-2)) | ((~i15) & 1);
            int i20 = -(-((i15 & 1) << 1));
            i15 = (i20 | i19) + (i19 & i20);
            int i21 = i16 + 31;
            f53045d = i21 % 128;
            int i22 = i21 % 2;
        }
        int iIdentityHashCode = System.identityHashCode(this);
        int i23 = ~iIdentityHashCode;
        int i24 = ~iIdentityHashCode;
        int i25 = i23 & (i24 | iIdentityHashCode);
        int i26 = ((i25 & 411849748) | (i25 ^ 411849748)) * (-192);
        int i27 = ((~i26) & 991455114) | ((-991455115) & i26);
        int i28 = (i26 & 991455114) << 1;
        int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
        int i30 = ((~i24) & 2061366292) | (i24 & (-2061366293)) | (2061366292 & i24);
        int i31 = (i30 | (~i30)) & (~i30);
        int i32 = (-2128478197) ^ i31;
        int i33 = i31 & (-2128478197);
        int i34 = ((i33 & i32) | (i32 ^ i33)) * (-384);
        int i35 = i29 & i34;
        int i36 = -(-((i34 ^ i29) | i35));
        int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
        int i38 = 2128478196 & iIdentityHashCode;
        int i39 = (2128478196 | iIdentityHashCode) & (~i38);
        int i40 = ~((i39 & i38) | (i39 ^ i38));
        int i41 = ~iIdentityHashCode;
        int i42 = ((-2061366293) & i41) | ((~i41) & 2061366292);
        int i43 = 2061366292 & i41;
        int i44 = (i43 & i42) | (i42 ^ i43);
        int i45 = ~((i44 & (-1716628449)) | (i44 ^ (-1716628449)));
        int i46 = (i40 & i45) | (i40 ^ i45);
        int i47 = ~((iIdentityHashCode & (-1649516545)) | (i24 & (-1649516545)) | (1649516544 & iIdentityHashCode));
        int i48 = ((~i47) & i46) | ((~i46) & i47);
        int i49 = i47 & i46;
        int i50 = ((i49 & i48) | (i48 ^ i49)) * 192;
        int i51 = ((i37 | i50) << 1) - ((i50 & (~i37)) | ((~i50) & i37));
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i52 = ~iIdentityHashCode2;
        int i53 = 1505443614 ^ i52;
        int i54 = i52 & 1505443614;
        int i55 = (i54 & i53) | (i53 ^ i54);
        int i56 = (i55 | (~i55)) & (~i55);
        int i57 = ((i56 & 642039808) | (642039808 ^ i56)) * (-241);
        int i58 = ((67074895 | i57) << 1) - (i57 ^ 67074895);
        int i59 = i58 & 1044324594;
        int i60 = (1044324594 | i58) & (~i59);
        int i61 = i59 << 1;
        int i62 = ((i60 | i61) << 1) - (i60 ^ i61);
        int i63 = (iIdentityHashCode2 | (~iIdentityHashCode2)) & (~iIdentityHashCode2);
        int i64 = 1505443614 ^ i63;
        int i65 = i63 & 1505443614;
        int i66 = (i65 & i64) | (i64 ^ i65);
        int i67 = i66 & 1869084438;
        int i68 = (i66 | 1869084438) & (~i67);
        int i69 = ~((i68 & i67) | (i68 ^ i67));
        int i70 = 1227044630 & i69;
        if (i51 <= ((((i69 | 1227044630) & (~i70)) | i70) * 241) + i62) {
            throw null;
        }
    }

    public abstract void setOnFocusChangeListener(long j10);

    public abstract void setOnFocusChangeListener(byte[] bArr, int i10);

    @Override // com.mypinpad.tsdk.isolation.aky
    public final void setX(byte b10) {
        setY(new Object[]{this, Byte.valueOf(b10)}, 1546065273, -1546065272, System.identityHashCode(this));
    }

    public alm(akp akpVar) {
        this.f53047a = new byte[4];
        this.setCompoundDrawableTintBlendMode = akpVar;
        this.f53048b = 0;
    }

    @Override // com.mypinpad.tsdk.isolation.aky
    public final void setCompoundDrawableTintBlendMode(byte[] bArr, int i10, int i11) {
        setY(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, 1533057357, -1533057354, i10);
    }

    public alm() {
        this(akp.getNavBarTitleString);
    }

    public final void setY(alm almVar) {
        setY(new Object[]{this, almVar}, -141122684, 141122686, System.identityHashCode(this));
    }
}
