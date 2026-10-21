package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class agi extends aed {
    public static int E0 = 1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f52616y0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f52617x0;

    public agi(add[] addVarArr) {
        super(addVarArr, 0);
        this.f52617x0 = -1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0072 A[PHI: r5 r8
      0x0072: PHI (r5v6 com.mypinpad.tsdk.i.q0) = (r5v5 com.mypinpad.tsdk.i.q0), (r5v25 com.mypinpad.tsdk.i.q0) binds: [B:9:0x0070, B:5:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r8v6 int A[IMMUTABLE_TYPE]) = (r8v5 int), (r8v10 int) binds: [B:9:0x0070, B:5:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0077  */
    /* JADX WARN: Code duplicated, block: B:15:0x008f A[LOOP:1: B:14:0x008d->B:15:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0195  */
    /* JADX WARN: Code duplicated, block: B:20:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:21:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:25:0x01ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x01ed  */
    public static /* synthetic */ void l(Object[] objArr) throws IOException {
        q0 q0VarH;
        int length;
        ady[] adyVarArr;
        int i10;
        int i11;
        q0 q0Var;
        ady[] adyVarArr2;
        int i12;
        int i13;
        int i14;
        int i15;
        q0 q0Var2;
        agi agiVar = (agi) objArr[0];
        boolean z10 = true;
        aeb aebVar = (aeb) objArr[1];
        int i16 = 2;
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i17 = f52616y0;
        int i18 = i17 & 55;
        int i19 = -(-(i17 | 55));
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        E0 = i20 % 128;
        if (i20 % 2 == 0) {
            aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 41}, 1303469841, -1303469839, 41);
            q0VarH = aebVar.h();
            length = agiVar.f52530t0.length;
            if (agiVar.f52617x0 < 0) {
                if (length <= 16) {
                    adyVarArr = new ady[length];
                    int i21 = f52616y0;
                    int i22 = i21 & 41;
                    int i23 = -(-((41 ^ i21) | i22));
                    int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                    E0 = i24 % 128;
                    int i25 = i24 % 2;
                    i10 = 0;
                    i11 = 0;
                    while (i10 < length) {
                        System.identityHashCode(agiVar);
                        System.identityHashCode(agiVar);
                        ady adyVarA = agiVar.f52530t0[i10].UiMessageCallbackKtWhenMappings().a();
                        adyVarArr[i10] = adyVarA;
                        int iB = adyVarA.b(z10);
                        int iIdentityHashCode = System.identityHashCode(agiVar);
                        int i26 = iB * 319;
                        int i27 = -(-(i11 * (-317)));
                        int i28 = (i26 & i27) + (i27 | i26);
                        int i29 = ~i11;
                        int i30 = (i29 | i11) & i29;
                        int i31 = ~iB;
                        int i32 = i31 & iIdentityHashCode;
                        int i33 = (~i32) & (i31 | iIdentityHashCode);
                        int i34 = ~iIdentityHashCode;
                        int i35 = ~(i33 | i32);
                        int i36 = i30 & i35;
                        int i37 = -(~((((i35 | i30) & (~i36)) | i36) * (-318)));
                        int i38 = ((i28 & i37) + (i28 | i37)) - 1;
                        int i39 = i29 & iIdentityHashCode;
                        int i40 = (~i39) & (i29 | iIdentityHashCode);
                        int i41 = ~((i40 ^ i39) | (i39 & i40));
                        int i42 = (i34 | iIdentityHashCode) & i34;
                        int i43 = (i42 ^ iB) | (i42 & iB);
                        q0 q0Var3 = q0VarH;
                        int i44 = i43 & i11;
                        int i45 = (i43 | i11) & (~i44);
                        int i46 = ~((i44 & i45) | (i45 ^ i44));
                        int i47 = ((~i46) & i41) | ((~i41) & i46);
                        int i48 = i41 & i46;
                        int i49 = ((i48 & i47) | (i47 ^ i48)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                        int i50 = ((((i38 ^ i49) | (i38 & i49)) << 1) - (~(-((i49 & (~i38)) | ((~i49) & i38))))) - 1;
                        int i51 = i30 & i34;
                        int i52 = (~i51) & (i30 | i34);
                        int i53 = (i51 & i52) | (i52 ^ i51);
                        int i54 = (i53 & i31) | ((~i53) & iB);
                        int i55 = i53 & iB;
                        int i56 = ~((i55 & i54) | (i54 ^ i55));
                        int i57 = (iB & i29) | (i31 & i11);
                        int i58 = iB & i11;
                        int i59 = (i57 & i58) | (i57 ^ i58);
                        int i60 = (i34 & i59) | ((~i59) & iIdentityHashCode);
                        int i61 = i59 & iIdentityHashCode;
                        int i62 = ~((i61 & i60) | (i60 ^ i61));
                        int i63 = i56 & i62;
                        int i64 = (i56 | i62) & (~i63);
                        i11 = (((i64 & i63) | (i64 ^ i63)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + i50;
                        i10 = ((i10 ^ 1) - (~((i10 & 1) << 1))) - 1;
                        int i65 = E0 + 23;
                        f52616y0 = i65 % 128;
                        int i66 = i65 % 2;
                        i16 = 2;
                        q0VarH = q0Var3;
                        adyVarArr = adyVarArr;
                        z10 = true;
                    }
                    q0Var = q0VarH;
                    adyVarArr2 = adyVarArr;
                    agiVar.f52617x0 = i11;
                    Object[] objArr2 = new Object[i16];
                    objArr2[0] = aebVar;
                    objArr2[1] = Integer.valueOf(i11);
                    aeb.setX(objArr2, 1357165778, -1357165764, i11);
                    int i67 = f52616y0;
                    int i68 = (i67 ^ 13) + ((i67 & 13) << 1);
                    E0 = i68 % 128;
                    i12 = 2;
                    int i69 = i68 % 2;
                    i13 = 0;
                    while (i13 < length) {
                        i15 = f52616y0 + 101;
                        E0 = i15 % 128;
                        if (i15 % i12 == 0) {
                            q0Var2 = q0Var;
                            q0Var2.m(adyVarArr2[i13]);
                            int i70 = i13 & 59;
                            int i71 = (i13 | 59) & (~i70);
                            int i72 = i70 << 1;
                            i13 = ((i71 | i72) << 1) - (i72 ^ i71);
                        } else {
                            q0Var2 = q0Var;
                            q0Var2.m(adyVarArr2[i13]);
                            i13 = ((i13 & 2) + (i13 | 2)) - 1;
                        }
                        int i73 = f52616y0;
                        int i74 = (i73 & (-112)) | ((~i73) & 111);
                        int i75 = -(-((i73 & 111) << 1));
                        int i76 = ((i74 | i75) << 1) - (i75 ^ i74);
                        E0 = i76 % 128;
                        i12 = 2;
                        int i77 = i76 % 2;
                        q0Var = q0Var2;
                    }
                    i14 = E0 + 113;
                    f52616y0 = i14 % 128;
                    if (i14 % i12 == 0) {
                        throw null;
                    }
                    return;
                }
            }
        } else {
            aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 48}, 1303469841, -1303469839, 48);
            q0VarH = aebVar.h();
            length = agiVar.f52530t0.length;
            if (agiVar.f52617x0 < 0) {
                if (length <= 16) {
                    adyVarArr = new ady[length];
                    int i210 = f52616y0;
                    int i211 = i210 & 41;
                    int i212 = -(-((41 ^ i210) | i211));
                    int i213 = (i211 ^ i212) + ((i212 & i211) << 1);
                    E0 = i213 % 128;
                    int i214 = i213 % 2;
                    i10 = 0;
                    i11 = 0;
                    while (i10 < length) {
                        System.identityHashCode(agiVar);
                        System.identityHashCode(agiVar);
                        ady adyVarA2 = agiVar.f52530t0[i10].UiMessageCallbackKtWhenMappings().a();
                        adyVarArr[i10] = adyVarA2;
                        int iB2 = adyVarA2.b(z10);
                        int iIdentityHashCode2 = System.identityHashCode(agiVar);
                        int i215 = iB2 * 319;
                        int i216 = -(-(i11 * (-317)));
                        int i217 = (i215 & i216) + (i216 | i215);
                        int i218 = ~i11;
                        int i310 = (i218 | i11) & i218;
                        int i311 = ~iB2;
                        int i312 = i311 & iIdentityHashCode2;
                        int i313 = (~i312) & (i311 | iIdentityHashCode2);
                        int i314 = ~iIdentityHashCode2;
                        int i315 = ~(i313 | i312);
                        int i316 = i310 & i315;
                        int i317 = -(~((((i315 | i310) & (~i316)) | i316) * (-318)));
                        int i318 = ((i217 & i317) + (i217 | i317)) - 1;
                        int i319 = i218 & iIdentityHashCode2;
                        int i410 = (~i319) & (i218 | iIdentityHashCode2);
                        int i411 = ~((i410 ^ i319) | (i319 & i410));
                        int i412 = (i314 | iIdentityHashCode2) & i314;
                        int i413 = (i412 ^ iB2) | (i412 & iB2);
                        q0 q0Var4 = q0VarH;
                        int i414 = i413 & i11;
                        int i415 = (i413 | i11) & (~i414);
                        int i416 = ~((i414 & i415) | (i415 ^ i414));
                        int i417 = ((~i416) & i411) | ((~i411) & i416);
                        int i418 = i411 & i416;
                        int i419 = ((i418 & i417) | (i417 ^ i418)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                        int i510 = ((((i318 ^ i419) | (i318 & i419)) << 1) - (~(-((i419 & (~i318)) | ((~i419) & i318))))) - 1;
                        int i511 = i310 & i314;
                        int i512 = (~i511) & (i310 | i314);
                        int i513 = (i511 & i512) | (i512 ^ i511);
                        int i514 = (i513 & i311) | ((~i513) & iB2);
                        int i515 = i513 & iB2;
                        int i516 = ~((i515 & i514) | (i514 ^ i515));
                        int i517 = (iB2 & i218) | (i311 & i11);
                        int i518 = iB2 & i11;
                        int i519 = (i517 & i518) | (i517 ^ i518);
                        int i610 = (i314 & i519) | ((~i519) & iIdentityHashCode2);
                        int i611 = i519 & iIdentityHashCode2;
                        int i612 = ~((i611 & i610) | (i610 ^ i611));
                        int i613 = i516 & i612;
                        int i614 = (i516 | i612) & (~i613);
                        i11 = (((i614 & i613) | (i614 ^ i613)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + i510;
                        i10 = ((i10 ^ 1) - (~((i10 & 1) << 1))) - 1;
                        int i615 = E0 + 23;
                        f52616y0 = i615 % 128;
                        int i616 = i615 % 2;
                        i16 = 2;
                        q0VarH = q0Var4;
                        adyVarArr = adyVarArr;
                        z10 = true;
                    }
                    q0Var = q0VarH;
                    adyVarArr2 = adyVarArr;
                    agiVar.f52617x0 = i11;
                    Object[] objArr3 = new Object[i16];
                    objArr3[0] = aebVar;
                    objArr3[1] = Integer.valueOf(i11);
                    aeb.setX(objArr3, 1357165778, -1357165764, i11);
                    int i617 = f52616y0;
                    int i618 = (i617 ^ 13) + ((i617 & 13) << 1);
                    E0 = i618 % 128;
                    i12 = 2;
                    int i619 = i618 % 2;
                    i13 = 0;
                    while (i13 < length) {
                        i15 = f52616y0 + 101;
                        E0 = i15 % 128;
                        if (i15 % i12 == 0) {
                            q0Var2 = q0Var;
                            q0Var2.m(adyVarArr2[i13]);
                            int i78 = i13 & 59;
                            int i79 = (i13 | 59) & (~i78);
                            int i710 = i78 << 1;
                            i13 = ((i79 | i710) << 1) - (i710 ^ i79);
                        } else {
                            q0Var2 = q0Var;
                            q0Var2.m(adyVarArr2[i13]);
                            i13 = ((i13 & 2) + (i13 | 2)) - 1;
                        }
                        int i711 = f52616y0;
                        int i712 = (i711 & (-112)) | ((~i711) & 111);
                        int i713 = -(-((i711 & 111) << 1));
                        int i714 = ((i712 | i713) << 1) - (i713 ^ i712);
                        E0 = i714 % 128;
                        i12 = 2;
                        int i715 = i714 % 2;
                        q0Var = q0Var2;
                    }
                    i14 = E0 + 113;
                    f52616y0 = i14 % 128;
                    if (i14 % i12 == 0) {
                        throw null;
                    }
                    return;
                }
            }
        }
        int iIntValue = ((Integer) setDividerPadding(new Object[]{agiVar}, -1094089410, 1094089414, System.identityHashCode(agiVar))).intValue();
        aeb.setX(new Object[]{aebVar, Integer.valueOf(iIntValue)}, 1357165778, -1357165764, iIntValue);
        int i80 = f52616y0;
        int i81 = i80 & 93;
        int i82 = (i80 | 93) & (~i81);
        int i83 = i81 << 1;
        int i84 = (i82 ^ i83) + ((i82 & i83) << 1);
        E0 = i84 % 128;
        int i85 = i84 % 2;
        int i86 = 0;
        while (i86 < length) {
            int i87 = E0;
            int i88 = ((i87 & (-94)) | ((~i87) & 93)) + ((i87 & 93) << 1);
            f52616y0 = i88 % 128;
            int i89 = i88 % 2;
            q0VarH.m(agiVar.f52530t0[i86].UiMessageCallbackKtWhenMappings());
            int i90 = (-2) - (((i86 & 16) + (i86 | 16)) ^ (-1));
            int i91 = i90 & (-14);
            int i92 = (i90 ^ (-14)) | i91;
            i86 = (i92 | i91) + (i91 & i92);
            int i93 = E0;
            int i94 = i93 ^ 19;
            int i95 = (((i93 & 19) | i94) << 1) - i94;
            f52616y0 = i95 % 128;
            int i96 = i95 % 2;
        }
        int i97 = f52616y0 + 107;
        E0 = i97 % 128;
        if (i97 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Integer m(Object[] objArr) {
        agi agiVar = (agi) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i10 = f52616y0;
        int i11 = (i10 | 57) << 1;
        int i12 = -(((~i10) & 57) | (i10 & (-58)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        E0 = i13 % 128;
        int i14 = i13 % 2;
        int iIntValue = ((Integer) setDividerPadding(new Object[]{agiVar}, -1094089410, 1094089414, System.identityHashCode(agiVar))).intValue();
        int iIntValue2 = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue), Integer.valueOf(iIntValue)}, 1150803379, -1150803367, iIntValue)).intValue();
        int i15 = f52616y0;
        int i16 = (i15 & 95) + (i15 | 95);
        E0 = i16 % 128;
        if (i16 % 2 != 0) {
            return Integer.valueOf(iIntValue2);
        }
        throw null;
    }

    public static /* synthetic */ agj n(Object[] objArr) {
        agj agjVar = new agj((agi) objArr[0]);
        int i10 = f52616y0 + 123;
        E0 = i10 % 128;
        if (i10 % 2 != 0) {
            return agjVar;
        }
        throw null;
    }

    public static /* synthetic */ agi o(Object[] objArr) {
        agi agiVar = (agi) objArr[0];
        int i10 = E0;
        int i11 = ((i10 & (-62)) | ((~i10) & 61)) + ((i10 & 61) << 1);
        int i12 = i11 % 128;
        f52616y0 = i12;
        if (i11 % 2 != 0) {
            int i13 = 94 / 0;
        }
        int i14 = (((i12 | 38) << 1) - (i12 ^ 38)) - 1;
        E0 = i14 % 128;
        int i15 = i14 % 2;
        return agiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean, int] */
    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object aftVar;
        int i13 = ((~(i10 | i11)) * (-495)) + (i11 * (-494)) + (i10 * (-494));
        int i14 = (~i12) | i10;
        int i15 = (((~((~i10) | (~i11))) | (~i14)) * 495) + (i14 * 495) + i13;
        int i16 = 0;
        ?? r3 = 1;
        switch (i15) {
            case 1:
                l(objArr);
                return null;
            case 2:
                agi agiVar = (agi) objArr[0];
                aftVar = new aft((byte[]) aex.setCompoundDrawableTintBlendMode(new Object[]{agiVar.j()}, 1752883718, -1752883715, (int) System.currentTimeMillis()));
                System.identityHashCode(agiVar);
                System.identityHashCode(agiVar);
                break;
            case 3:
                aftVar = new ago(((agi) objArr[0]).k());
                int i17 = f52616y0 + 61;
                E0 = i17 % 128;
                int i18 = i17 % 2;
                break;
            case 4:
                agi agiVar2 = (agi) objArr[0];
                int i19 = f52616y0;
                int i20 = i19 & 59;
                int i21 = (i19 ^ 59) | i20;
                int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                E0 = i22 % 128;
                int i23 = i22 % 2;
                if (agiVar2.f52617x0 < 0) {
                    int i24 = i19 & 123;
                    int i25 = (~i24) & (i19 | 123);
                    int i26 = -(-(i24 << 1));
                    int i27 = (i25 & i26) + (i26 | i25);
                    E0 = i27 % 128;
                    int i28 = i27 % 2;
                    add[] addVarArr = agiVar2.f52530t0;
                    int length = i28 == 0 ? addVarArr.length : addVarArr.length;
                    int i29 = i19 & 109;
                    int i30 = ((i19 ^ 109) | i29) << 1;
                    int i31 = -((i19 | 109) & (~i29));
                    int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                    E0 = i32 % 128;
                    int i33 = i32 % 2;
                    int i34 = 0;
                    while (i16 < length) {
                        int i35 = f52616y0;
                        int i36 = i35 & 123;
                        int i37 = -(-(i35 | 123));
                        int i38 = (i36 ^ i37) + ((i37 & i36) << r3);
                        E0 = i38 % 128;
                        int i39 = i38 % 2;
                        int iB = agiVar2.f52530t0[i16].UiMessageCallbackKtWhenMappings().a().b(r3);
                        int iIdentityHashCode = System.identityHashCode(agiVar2);
                        int i40 = iB * 569;
                        int i41 = i34 * 569;
                        int i42 = ((i40 | i41) << r3) - (i40 ^ i41);
                        int i43 = ~iB;
                        int i44 = ~i34;
                        int i45 = (i44 | i34) & i44;
                        int i46 = i43 & i45;
                        int i47 = (~i46) & (i43 | i45);
                        int i48 = ~((i47 & i46) | (i47 ^ i46));
                        int i49 = (i43 | iB) & i43;
                        int i50 = ~iIdentityHashCode;
                        int i51 = i49 ^ i50;
                        int i52 = i49 & i50;
                        int i53 = ~((i51 ^ i52) | (i51 & i52));
                        int i54 = i48 & i53;
                        int i55 = i54 | ((~i54) & (i48 | i53));
                        int i56 = (i50 | iIdentityHashCode) & i50;
                        int i57 = i45 ^ i56;
                        int i58 = ~i56;
                        int i59 = i45 & i56;
                        int i60 = ~((i57 ^ i59) | (i57 & i59));
                        int i61 = length;
                        agi agiVar3 = agiVar2;
                        int i62 = ((~i55) & i60) | ((~i60) & i55);
                        int i63 = i55 & i60;
                        int i64 = (((i62 & i63) | (i62 ^ i63)) * (-1136)) + i42;
                        int i65 = ~((i43 ^ iIdentityHashCode) | (i43 & iIdentityHashCode));
                        int i66 = i44 ^ iIdentityHashCode;
                        int i67 = i44 & iIdentityHashCode;
                        int i68 = (i66 & i67) | (i66 ^ i67);
                        int i69 = ~i68;
                        int i70 = (i68 | i69) & i69;
                        int i71 = i65 & i70;
                        int i72 = (i65 | i70) & (~i71);
                        int i73 = i50 & iB;
                        int i74 = -(~(-(-(((i72 & i71) | (i72 ^ i71) | (~(i73 | ((~i73) & (i50 | iB)) | i34))) * (-568)))));
                        int i75 = ((i64 ^ i74) + ((i64 & i74) << 1)) - 1;
                        int i76 = (i56 & i43) | (iB & i58);
                        int i77 = i56 & iB;
                        int i78 = ~((i76 & i77) | (i76 ^ i77));
                        int i79 = (i50 ^ i34) | (i50 & i34);
                        int i80 = ~i79;
                        int i81 = (i79 | i80) & i80;
                        int i82 = (i78 & i81) | (i78 ^ i81);
                        int i83 = ((~i45) & i43) | ((~i43) & i45);
                        int i84 = (i83 & i46) | (i83 ^ i46);
                        int i85 = ~((i84 & iIdentityHashCode) | (i84 ^ iIdentityHashCode));
                        int i86 = -(-(((i82 & i85) | (i82 ^ i85)) * 568));
                        int i87 = i75 & i86;
                        i34 = ((i86 | i75) & (~i87)) + (i87 << 1);
                        int i88 = (((i16 | 54) << 1) - (i16 ^ 54)) - 1;
                        i16 = (i88 & (-52)) + (i88 | (-52));
                        int i89 = E0;
                        int i90 = ((((i89 ^ 99) | (i89 & 99)) << 1) - (~(-(((~i89) & 99) | (i89 & (-100)))))) - 1;
                        f52616y0 = i90 % 128;
                        int i91 = i90 % 2;
                        r3 = 1;
                        agiVar2 = agiVar3;
                        length = i61;
                    }
                    agiVar2.f52617x0 = i34;
                    int i92 = E0;
                    int i93 = (((i92 | 14) << 1) - (i92 ^ 14)) - 1;
                    f52616y0 = i93 % 128;
                    int i94 = i93 % 2;
                }
                int i95 = agiVar2.f52617x0;
                int i96 = (-2) - ((E0 + 96) ^ (-1));
                f52616y0 = i96 % 128;
                int i97 = i96 % 2;
                return Integer.valueOf(i95);
            case 5:
                agd agdVar = new agd((byte[]) aev.setX(new Object[]{((agi) objArr[0]).f()}, 573205290, -573205287, (int) System.currentTimeMillis()));
                int i98 = f52616y0;
                int i99 = i98 & 99;
                int i100 = -(-((i98 ^ 99) | i99));
                int i101 = (i99 & i100) + (i100 | i99);
                E0 = i101 % 128;
                int i102 = i101 % 2;
                return agdVar;
            case 6:
                return o(objArr);
            case 7:
                return m(objArr);
            default:
                return n(objArr);
        }
        return aftVar;
    }

    @Override // com.mypinpad.tsdk.isolation.aed, com.mypinpad.tsdk.isolation.ady
    public final ady a() {
        return (ady) setDividerPadding(new Object[]{this}, -2017061365, 2017061371, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) throws IOException {
        return ((Integer) setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, 591847264, -591847257, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setDividerPadding(new Object[]{this, aebVar, Boolean.valueOf(z10)}, 1969087940, -1969087939, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aed
    public final aee g() {
        return (aee) setDividerPadding(new Object[]{this}, -1597453922, 1597453925, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aed
    public final ads h() {
        return (ads) setDividerPadding(new Object[]{this}, 1967507667, -1967507665, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aed
    public final adl i() {
        return (adl) setDividerPadding(new Object[]{this}, -97294246, 97294246, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aed
    public final acz setOnFocusChangeListener() {
        return (acz) setDividerPadding(new Object[]{this}, -189764567, 189764572, System.identityHashCode(this));
    }

    public agi(adh adhVar) {
        super(adhVar);
        this.f52617x0 = -1;
    }

    public agi(add addVar) {
        super(addVar);
        this.f52617x0 = -1;
    }

    public agi() {
        this.f52617x0 = -1;
    }
}
