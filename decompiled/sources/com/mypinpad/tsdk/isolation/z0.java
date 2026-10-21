package com.mypinpad.tsdk.isolation;

import c2.b;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f62256c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f62257d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public anw f62258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f62259b;

    /* JADX WARN: Code duplicated, block: B:20:0x01c0  */
    public static /* synthetic */ BigInteger a(Object[] objArr) {
        z0 z0Var = (z0) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i10 = f62256c;
        int i11 = (-2) - (((i10 ^ 66) + ((i10 & 66) << 1)) ^ (-1));
        f62257d = i11 % 128;
        int i12 = i11 % 2;
        int iIntValue3 = ((Integer) c(new Object[]{z0Var}, -2125679086, 2125679088, System.identityHashCode(z0Var))).intValue();
        int i13 = -(-(iIntValue3 * 517));
        int i14 = (((-515) ^ i13) - (~((i13 & (-515)) << 1))) - 1;
        int i15 = ~iIntValue3;
        int i16 = ~iIntValue;
        int i17 = i15 & i16;
        int i18 = ~i15;
        int i19 = i17 | (iIntValue & i18);
        int i20 = i15 & iIntValue;
        int i21 = ~((i19 ^ i20) | (i19 & i20));
        int i22 = i16 & (i16 | iIntValue);
        int i23 = i22 & 1;
        int i24 = (~i23) & (i22 | 1);
        int i25 = ~((i24 ^ i23) | (i24 & i23));
        int i26 = (i21 ^ i25) | (i25 & i21);
        int i27 = ~(i16 | iIntValue3);
        int i28 = -(-(((i26 ^ i27) | (i26 & i27)) * (-516)));
        int i29 = (i14 ^ i28) + ((i28 & i14) << 1);
        int i30 = ((-2) & i18) | (i15 & 1);
        int i31 = i15 & (-2);
        int i32 = (i30 & i31) | (i30 ^ i31);
        int i33 = i32 ^ iIntValue;
        int i34 = i32 & iIntValue;
        int i35 = ~((i34 & i33) | (i33 ^ i34));
        int i36 = ((~i22) & (-2)) | i23;
        int i37 = i22 & (-2);
        int i38 = (i36 & i37) | (i36 ^ i37);
        int i39 = i38 & iIntValue3;
        int i40 = (i38 | iIntValue3) & (~i39);
        int i41 = ~((i40 & i39) | (i40 ^ i39));
        int i42 = -(-(((i35 & i41) | (i35 ^ i41)) * LibMCryptConstants.IND_HEX_SEGMENTO2));
        int i43 = ((~i42) & i29) | ((~i29) & i42);
        int i44 = -(-((i42 & i29) << 1));
        int i45 = (i43 & i44) + (i44 | i43);
        int i46 = (-2) & iIntValue3;
        int i47 = (~i46) & ((-2) | iIntValue3);
        int i48 = ~((i46 & i47) | (i47 ^ i46));
        int i49 = ~i16;
        int i50 = (iIntValue3 & i49) | i17;
        int i51 = iIntValue3 & i16;
        int i52 = ~((i51 & i50) | (i50 ^ i51));
        int i53 = i48 & i52;
        int i54 = (i48 | i52) & (~i53);
        int i55 = -(-(((i54 & i53) | (i54 ^ i53)) * LibMCryptConstants.IND_HEX_SEGMENTO2));
        int i56 = i45 ^ i55;
        int i57 = ((i55 & i45) | i56) << 1;
        int i58 = -i56;
        if (iIntValue2 > ((i57 | i58) << 1) - (i57 ^ i58)) {
            throw new akr("input too large for RSA cipher.");
        }
        int iIntValue4 = ((Integer) c(new Object[]{z0Var}, -2125679086, 2125679088, System.identityHashCode(z0Var))).intValue();
        int i59 = -(-(iIntValue4 * (-1917)));
        int i60 = 960 & i59;
        int i61 = (i59 ^ 960) | i60;
        int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
        int i63 = ~iIntValue4;
        int i64 = (iIntValue4 | i63) & i63;
        int i65 = (i49 & i64) | ((~i64) & i16);
        int i66 = i64 & i16;
        int i67 = ~((i65 & i66) | (i65 ^ i66));
        int i68 = iIntValue & 1;
        int i69 = (~i68) & (iIntValue | 1);
        int i70 = (i68 & i69) | (i69 ^ i68);
        int i71 = ~i70;
        int i72 = (i67 | ((i70 | i71) & i71)) * 959;
        int i73 = i62 | i72;
        int i74 = ((i73 << 1) - (~(-((~(i72 & i62)) & i73)))) - 1;
        int i75 = -(-(i64 * (-959)));
        int i76 = ((i74 ^ i75) | (i74 & i75)) << 1;
        int i77 = -((i75 & (~i74)) | ((~i75) & i74));
        int i78 = (i76 & i77) + (i77 | i76);
        int i79 = ~(i63 | iIntValue);
        int i80 = i16 ^ 1;
        int i81 = i16 & 1;
        int i82 = (i80 & i81) | (i80 ^ i81);
        int i83 = ~i82;
        int i84 = (i82 | i83) & i83;
        int i85 = -(~(-(-(((i79 & i84) | (i79 ^ i84)) * 959))));
        if (iIntValue2 == ((i78 & i85) + (i85 | i78)) - 1) {
            int i86 = f62257d;
            int i87 = (i86 ^ 101) + ((i86 & 101) << 1);
            f62256c = i87 % 128;
            if (i87 % 2 != 0) {
                boolean z10 = z0Var.f62259b;
                throw null;
            }
            if (!z0Var.f62259b) {
                throw new akr("input too large for RSA cipher.");
            }
        }
        if (iIntValue == 0) {
            int i88 = f62257d;
            int i89 = i88 & 67;
            int i90 = (i88 ^ 67) | i89;
            int i91 = (i89 & i90) + (i90 | i89);
            int i92 = i91 % 128;
            f62256c = i92;
            int i93 = i91 % 2;
            if (iIntValue2 != bArr.length) {
                byte[] bArr2 = new byte[iIntValue2];
                System.arraycopy(bArr, iIntValue, bArr2, 0, iIntValue2);
                int i94 = f62257d;
                int i95 = i94 & 45;
                int i96 = -(-((i94 ^ 45) | i95));
                int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
                f62256c = i97 % 128;
                int i98 = i97 % 2;
                bArr = bArr2;
            } else {
                int i99 = (-2) - (((i92 ^ 24) + ((i92 & 24) << 1)) ^ (-1));
                f62257d = i99 % 128;
                int i100 = i99 % 2;
            }
        } else {
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            int i910 = f62257d;
            int i911 = i910 & 45;
            int i912 = -(-((i910 ^ 45) | i911));
            int i913 = ((i911 | i912) << 1) - (i912 ^ i911);
            f62256c = i913 % 128;
            int i914 = i913 % 2;
            bArr = bArr3;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        anw anwVar = z0Var.f62258a;
        if (bigInteger.compareTo((BigInteger) anw.setX(new Object[]{anwVar}, -674276868, 674276871, System.identityHashCode(anwVar))) >= 0) {
            throw new akr("input too large for RSA cipher.");
        }
        int i101 = f62256c;
        int i102 = ((((i101 ^ 61) | (i101 & 61)) << 1) - (~(-(((~i101) & 61) | (i101 & (-62)))))) - 1;
        f62257d = i102 % 128;
        int i103 = i102 % 2;
        return bigInteger;
    }

    public static /* synthetic */ void b(Object[] objArr) {
        z0 z0Var = (z0) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        akk akkVar = (akk) objArr[2];
        int i10 = f62256c;
        int i11 = i10 & 21;
        int i12 = ((i10 | 21) & (~i11)) + (i11 << 1);
        int i13 = i12 % 128;
        f62257d = i13;
        int i14 = i12 % 2;
        if (akkVar instanceof ant) {
            int i15 = i13 ^ 17;
            int i16 = ((((i13 & 17) | i15) << 1) - (~(-i15))) - 1;
            f62256c = i16 % 128;
            ant antVar = (ant) akkVar;
            if (i16 % 2 != 0) {
                z0Var.f62258a = (anw) ((akk) ant.setOnFocusChangeListener(new Object[]{antVar}, -310755770, 310755770, System.identityHashCode(antVar)));
                int i17 = 32 / 0;
            } else {
                z0Var.f62258a = (anw) ((akk) ant.setOnFocusChangeListener(new Object[]{antVar}, -310755770, 310755770, System.identityHashCode(antVar)));
            }
            int i18 = f62256c;
            int i19 = ((i18 & (-96)) | ((~i18) & 95)) + ((i18 & 95) << 1);
            f62257d = i19 % 128;
            int i20 = i19 % 2;
        } else {
            z0Var.f62258a = (anw) akkVar;
            int i21 = i13 & 21;
            int i22 = (i13 ^ 21) | i21;
            int i23 = (i21 & i22) + (i21 | i22);
            f62256c = i23 % 128;
            int i24 = i23 % 2;
        }
        z0Var.f62259b = zBooleanValue;
        anw anwVar = z0Var.f62258a;
        int y7 = alk.setY((BigInteger) anw.setX(new Object[]{anwVar}, -674276868, 674276871, System.identityHashCode(anwVar)));
        anw anwVar2 = z0Var.f62258a;
        new alo("RSA", y7, anwVar2, (akp) c(new Object[]{Boolean.valueOf(((Boolean) amw.setOnFocusChangeListener(new Object[]{anwVar2}, 1283892343, -1283892343, System.identityHashCode(anwVar2))).booleanValue()), Boolean.valueOf(zBooleanValue)}, -1952565230, 1952565233, (int) System.currentTimeMillis()));
        aku.setCompoundDrawableTintBlendMode(new Object[0], -825950727, 825950727, (int) System.currentTimeMillis());
        int i25 = f62257d + 27;
        f62256c = i25 % 128;
        int i26 = i25 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0078 A[PHI: r13
      0x0078: PHI (r13v95 int) = (r13v94 int), (r13v122 int) binds: [B:10:0x0076, B:7:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x012c  */
    /* JADX WARN: Code duplicated, block: B:16:0x012d A[PHI: r13
      0x012d: PHI (r13v114 int) = (r13v94 int), (r13v122 int) binds: [B:10:0x0076, B:7:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x049c  */
    /* JADX WARN: Code duplicated, block: B:83:0x04db  */
    public static /* synthetic */ Object c(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        boolean z10;
        boolean z11;
        boolean z12;
        akp akpVar;
        akp akpVar2;
        BigInteger bigIntegerModPow;
        BigInteger bigIntegerAdd;
        byte[] byteArray;
        byte[] bArr;
        int i14;
        int i15;
        Object objValueOf;
        int iBitLength;
        int iA;
        int i16;
        int i17 = (i11 * 965) + ((i10 * (-963)) - 964);
        int i18 = ~i10;
        int i19 = ~i11;
        switch ((((~(i10 | i19)) | (~((~i12) | i19))) * (-964)) + ((i18 | (~(i19 | i12))) * (-964)) + i17) {
            case 1:
                return a(objArr);
            case 2:
                z0 z0Var = (z0) objArr[0];
                int i20 = f62256c;
                int i21 = ((i20 ^ 87) | (i20 & 87)) << 1;
                int i22 = -(((~i20) & 87) | (i20 & (-88)));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                f62257d = i23 % 128;
                int i24 = i23 % 2;
                anw anwVar = z0Var.f62258a;
                int iBitLength2 = ((BigInteger) anw.setX(new Object[]{anwVar}, -674276868, 674276871, System.identityHashCode(anwVar))).bitLength();
                if (z0Var.f62259b) {
                    int i25 = f62256c;
                    int i26 = ((i25 ^ 35) | (i25 & 35)) << 1;
                    int i27 = -((i25 & (-36)) | (35 & (~i25)));
                    int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                    f62257d = i28 % 128;
                    int i29 = i28 % 2;
                    int i30 = (iBitLength2 & (-8)) | ((~iBitLength2) & 7);
                    int i31 = -(-((iBitLength2 & 7) << 1));
                    int i32 = ((i30 & i31) + (i31 | i30)) / 8;
                    int i33 = ~i32;
                    int i34 = i32 << 1;
                    i13 = (i33 & i34) + (i33 | i34);
                    int i35 = i25 ^ 29;
                    int i36 = -(-((i25 & 29) << 1));
                    int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                    f62257d = i37 % 128;
                    if (i37 % 2 == 0) {
                        throw null;
                    }
                } else {
                    int i38 = iBitLength2 & 7;
                    int i39 = (iBitLength2 ^ 7) | i38;
                    i13 = ((i38 ^ i39) + ((i38 & i39) << 1)) / 8;
                    int i40 = (-2) - ((f62257d + 64) ^ (-1));
                    f62256c = i40 % 128;
                    int i41 = i40 % 2;
                }
                objValueOf = Integer.valueOf(i13);
                break;
            case 3:
                boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                int i42 = f62256c;
                int i43 = (i42 ^ 93) + ((i42 & 93) << 1);
                f62257d = i43 % 128;
                if (i43 % 2 == 0) {
                    throw null;
                }
                if (!(!zBooleanValue) && zBooleanValue2) {
                    int i44 = i42 + 47;
                    int i45 = i44 % 128;
                    f62257d = i45;
                    int i46 = i44 % 2;
                    int i47 = ((i45 | 81) << 1) - (i45 ^ 81);
                    f62256c = i47 % 128;
                    int i48 = i47 % 2;
                    z10 = true;
                } else {
                    int i49 = (i42 & 77) + (i42 | 77);
                    f62257d = i49 % 128;
                    int i50 = i49 % 2;
                    z10 = false;
                }
                if (zBooleanValue) {
                    int i51 = f62256c;
                    int i52 = (i51 & (-48)) | ((~i51) & 47);
                    int i53 = (i51 & 47) << 1;
                    int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
                    f62257d = i54 % 128;
                    int i55 = i54 % 2;
                    z11 = false;
                } else {
                    int i56 = f62256c;
                    int i57 = i56 & 7;
                    int i58 = ((((i56 ^ 7) | i57) << 1) - (~(-((i56 | 7) & (~i57))))) - 1;
                    int i59 = i58 % 128;
                    f62257d = i59;
                    if (i58 % 2 == 0) {
                        throw null;
                    }
                    if (!(!zBooleanValue2)) {
                        int i60 = i59 ^ 117;
                        int i61 = ((i59 & 117) | i60) << 1;
                        int i62 = -i60;
                        int i63 = ((i61 | i62) << 1) - (i61 ^ i62);
                        f62256c = i63 % 128;
                        z11 = !(i63 % 2 != 0);
                    } else {
                        int i510 = f62256c;
                        int i511 = (i510 & (-48)) | ((~i510) & 47);
                        int i512 = (i510 & 47) << 1;
                        int i513 = ((i511 | i512) << 1) - (i512 ^ i511);
                        f62257d = i513 % 128;
                        int i514 = i513 % 2;
                        z11 = false;
                    }
                }
                if (zBooleanValue) {
                    int i64 = f62257d;
                    int i65 = i64 & 125;
                    int i66 = (i65 - (~((i64 ^ 125) | i65))) - 1;
                    f62256c = i66 % 128;
                    int i67 = i66 % 2;
                    z12 = false;
                } else {
                    int i68 = f62256c;
                    int i69 = i68 | 65;
                    int i70 = ((i69 << 1) - (~(-(i69 & (~(i68 & 65)))))) - 1;
                    f62257d = i70 % 128;
                    int i71 = i70 % 2;
                    if (!zBooleanValue2) {
                        int i72 = (i68 & 123) + (i68 | 123);
                        f62257d = i72 % 128;
                        if (i72 % 2 != 0) {
                            z12 = true;
                        }
                    } else {
                        int i610 = f62257d;
                        int i611 = i610 & 125;
                        int i612 = (i611 - (~((i610 ^ 125) | i611))) - 1;
                        f62256c = i612 % 128;
                        int i613 = i612 % 2;
                    }
                    z12 = false;
                }
                if (z10) {
                    int i73 = f62256c;
                    int i74 = (((i73 & (-38)) | ((~i73) & 37)) - (~(-(-((i73 & 37) << 1))))) - 1;
                    f62257d = i74 % 128;
                    int i75 = i74 % 2;
                    akpVar2 = akp.setCompoundDrawableTintBlendMode;
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i76 = ~iCurrentTimeMillis;
                    int i77 = i76 & 95178599;
                    int i78 = (i76 | 95178599) & (~i77);
                    int i79 = (i78 & i77) | (i78 ^ i77);
                    int i80 = ~i79;
                    int i81 = (i79 | i80) & i80;
                    int i82 = i81 & (-1035816960);
                    int i83 = (i81 | (-1035816960)) & (~i82);
                    int i84 = (-2) - ((721981592 - (~(((i83 & i82) | (i83 ^ i82)) * 529))) ^ (-1));
                    int i85 = 95178599 ^ iCurrentTimeMillis;
                    int i86 = iCurrentTimeMillis & 95178599;
                    int i87 = ~((i86 & i85) | (i85 ^ i86));
                    int i88 = (-1008288445) & i87;
                    int i89 = -(-((((i87 | (-1008288445)) & (~i88)) | i88) * 529));
                    int i90 = i84 & i89;
                    int i91 = i90 + ((i89 ^ i84) | i90);
                    int i92 = ~((int) System.currentTimeMillis());
                    int i93 = ((~i92) & 1239796742) | ((-1239796743) & i92);
                    int i94 = 1239796742 & i92;
                    int i95 = ~((i93 & i94) | (i93 ^ i94));
                    int i96 = 570556464 ^ i95;
                    int i97 = i95 & 570556464;
                    int i98 = -(~(-(-(((i97 & i96) | (i96 ^ i97)) * (-241)))));
                    int i99 = ((-502622705) & i98) + (i98 | (-502622705));
                    int i100 = (i99 ^ (-1)) + (i99 << 1);
                    int i101 = (((i100 ^ (-494892694)) | (i100 & (-494892694))) << 1) - (((~i100) & (-494892694)) | (494892693 & i100));
                    int i102 = (i92 | 1239796742) & (~i94);
                    int i103 = (i102 & i94) | (i102 ^ i94);
                    int i104 = ((-715361331) & i103) | ((~i103) & 715361330);
                    int i105 = i103 & 715361330;
                    int i106 = ~((i105 & i104) | (i104 ^ i105));
                    int i107 = 144804866 ^ i106;
                    int i108 = i106 & 144804866;
                    int i109 = ((i108 & i107) | (i107 ^ i108)) * 241;
                    int i110 = i101 ^ i109;
                    if (i91 <= (((i109 & i101) | i110) << 1) - i110) {
                        objValueOf = akpVar2;
                        throw null;
                    }
                } else if (z11) {
                    int i111 = f62257d + 25;
                    f62256c = i111 % 128;
                    if (i111 % 2 != 0) {
                        akp akpVar3 = akp.setX;
                        throw null;
                    }
                    objValueOf = akp.setY;
                } else if (!z12) {
                    akp akpVar4 = akp.setDividerPadding;
                    int i112 = f62256c;
                    int i113 = (i112 | 3) << 1;
                    int i114 = -(i112 ^ 3);
                    int i115 = (i113 ^ i114) + ((i114 & i113) << 1);
                    f62257d = i115 % 128;
                    int i116 = i115 % 2;
                    objValueOf = akpVar4;
                } else {
                    int i117 = f62257d;
                    int i118 = i117 & 27;
                    int i119 = -(-(i117 | 27));
                    int i120 = (i118 & i119) + (i119 | i118);
                    f62256c = i120 % 128;
                    int i121 = i120 % 2;
                    akpVar = akp.setOnLongClickListener;
                    if (i121 != 0) {
                        objValueOf = akpVar;
                        int i122 = 69 / 0;
                        objValueOf = akpVar;
                    }
                }
                break;
                break;
            case 4:
                z0 z0Var2 = (z0) objArr[0];
                BigInteger bigInteger = (BigInteger) objArr[1];
                int i123 = f62257d;
                int i124 = i123 & 101;
                int i125 = (i123 | 101) & (~i124);
                int i126 = -(-(i124 << 1));
                int i127 = ((i125 | i126) << 1) - (i125 ^ i126);
                f62256c = i127 % 128;
                if (i127 % 2 != 0) {
                    boolean z13 = z0Var2.f62258a instanceof anu;
                    throw null;
                }
                anw anwVar2 = z0Var2.f62258a;
                if (!(anwVar2 instanceof anu)) {
                    BigInteger bigInteger2 = (BigInteger) anw.setX(new Object[]{anwVar2}, -782811276, 782811278, System.identityHashCode(anwVar2));
                    anw anwVar3 = z0Var2.f62258a;
                    bigIntegerModPow = bigInteger.modPow(bigInteger2, (BigInteger) anw.setX(new Object[]{anwVar3}, -674276868, 674276871, System.identityHashCode(anwVar3)));
                    int i128 = f62257d;
                    int i129 = (((i128 | 126) << 1) - (i128 ^ 126)) - 1;
                    f62256c = i129 % 128;
                    if (i129 % 2 != 0) {
                        objValueOf = bigIntegerModPow;
                        int i130 = 28 / 0;
                        objValueOf = bigIntegerModPow;
                    }
                } else {
                    anu anuVar = (anu) anwVar2;
                    BigInteger bigInteger3 = (BigInteger) anu.setCompoundDrawableTintBlendMode(new Object[]{anuVar}, -120054056, 120054061, System.identityHashCode(anuVar));
                    BigInteger bigInteger4 = (BigInteger) anu.setCompoundDrawableTintBlendMode(new Object[]{anuVar}, 1257776024, -1257776023, System.identityHashCode(anuVar));
                    BigInteger bigInteger5 = (BigInteger) anu.setCompoundDrawableTintBlendMode(new Object[]{anuVar}, -1306966966, 1306966970, System.identityHashCode(anuVar));
                    BigInteger bigInteger6 = (BigInteger) anu.setCompoundDrawableTintBlendMode(new Object[]{anuVar}, 591889547, -591889545, System.identityHashCode(anuVar));
                    BigInteger bigInteger7 = (BigInteger) anu.setCompoundDrawableTintBlendMode(new Object[]{anuVar}, -677268415, 677268415, System.identityHashCode(anuVar));
                    BigInteger bigIntegerModPow2 = bigInteger.remainder(bigInteger3).modPow(bigInteger5, bigInteger3);
                    BigInteger bigIntegerModPow3 = bigInteger.remainder(bigInteger4).modPow(bigInteger6, bigInteger4);
                    bigIntegerAdd = bigIntegerModPow2.subtract(bigIntegerModPow3).multiply(bigInteger7).mod(bigInteger3).multiply(bigInteger4).add(bigIntegerModPow3);
                    int i131 = f62256c;
                    int i132 = i131 ^ 37;
                    int i133 = (((i131 & 37) | i132) << 1) - i132;
                    f62257d = i133 % 128;
                    if (i133 % 2 == 0) {
                        objValueOf = bigIntegerAdd;
                        throw null;
                    }
                }
                break;
                break;
            case 5:
                b(objArr);
                return null;
            case 6:
                z0 z0Var3 = (z0) objArr[0];
                BigInteger bigInteger8 = (BigInteger) objArr[1];
                int i134 = f62256c + 59;
                f62257d = i134 % 128;
                int i135 = i134 % 2;
                byteArray = bigInteger8.toByteArray();
                if (z0Var3.f62259b) {
                    int i136 = f62257d;
                    int i137 = i136 & 87;
                    int i138 = (i136 | 87) & (~i137);
                    int i139 = -(-(i137 << 1));
                    int i140 = (i138 & i139) + (i138 | i139);
                    int i141 = i140 % 128;
                    f62256c = i141;
                    int i142 = i140 % 2;
                    if (byteArray[0] == 0) {
                        int i143 = i141 & 103;
                        int i144 = -(-((i141 ^ 103) | i143));
                        int i145 = ((i143 | i144) << 1) - (i144 ^ i143);
                        f62257d = i145 % 128;
                        if (i145 % 2 == 0) {
                            ((Integer) c(new Object[]{z0Var3}, 1747311238, -1747311238, System.identityHashCode(z0Var3))).intValue();
                            throw null;
                        }
                        if (byteArray.length > ((Integer) c(new Object[]{z0Var3}, 1747311238, -1747311238, System.identityHashCode(z0Var3))).intValue()) {
                            int length = byteArray.length;
                            int i146 = ~length;
                            int i147 = -(-(length << 1));
                            int i148 = (i146 & i147) + (i147 | i146);
                            byte[] bArr2 = new byte[i148];
                            System.arraycopy(byteArray, 1, bArr2, 0, i148);
                            int i149 = f62256c;
                            int i150 = i149 ^ 85;
                            int i151 = ((((i149 & 85) | i150) << 1) - (~(-i150))) - 1;
                            f62257d = i151 % 128;
                            int i152 = i151 % 2;
                            return bArr2;
                        }
                    }
                    if (byteArray.length < ((Integer) c(new Object[]{z0Var3}, 1747311238, -1747311238, System.identityHashCode(z0Var3))).intValue()) {
                        int i153 = f62257d;
                        int i154 = (((i153 ^ 37) | (i153 & 37)) << 1) - (((~i153) & 37) | (i153 & (-38)));
                        f62256c = i154 % 128;
                        int i155 = i154 % 2;
                        int iIntValue = ((Integer) c(new Object[]{z0Var3}, 1747311238, -1747311238, System.identityHashCode(z0Var3))).intValue();
                        bArr = new byte[iIntValue];
                        int i156 = -byteArray.length;
                        System.arraycopy(byteArray, 0, bArr, ((iIntValue | i156) << 1) - (iIntValue ^ i156), byteArray.length);
                        int i157 = f62257d;
                        int i158 = i157 ^ 9;
                        i15 = (((i157 & 9) | i158) << 1) - i158;
                    } else {
                        int i159 = f62256c;
                        int i160 = (i159 ^ 35) + ((i159 & 35) << 1);
                        f62257d = i160 % 128;
                        if (i160 % 2 == 0) {
                            objValueOf = byteArray;
                            throw null;
                        }
                    }
                } else {
                    if (byteArray[0] == 0) {
                        int i161 = f62256c;
                        int i162 = ((i161 & (-96)) | ((~i161) & 95)) + ((i161 & 95) << 1);
                        f62257d = i162 % 128;
                        int i163 = i162 % 2;
                        int length2 = (-2) - (byteArray.length ^ (-1));
                        bArr = new byte[length2];
                        System.arraycopy(byteArray, 1, bArr, 0, length2);
                        int i164 = f62256c;
                        int i165 = i164 ^ 5;
                        int i166 = (i164 & 5) << 1;
                        i14 = ((i165 | i166) << 1) - (i166 ^ i165);
                        f62257d = i14 % 128;
                    } else {
                        int length3 = byteArray.length;
                        bArr = new byte[length3];
                        System.arraycopy(byteArray, 0, bArr, 0, length3);
                        int i167 = f62257d;
                        int i168 = (i167 & (-110)) | ((~i167) & 109);
                        int i169 = -(-((i167 & 109) << 1));
                        i14 = ((i168 | i169) << 1) - (i169 ^ i168);
                        f62256c = i14 % 128;
                    }
                    int i170 = i14 % 2;
                    bek.setOnFocusChangeListener(new Object[]{byteArray}, -949833373, 949833375, (int) System.currentTimeMillis());
                    i15 = f62257d + 55;
                }
                f62256c = i15 % 128;
                int i171 = i15 % 2;
                return bArr;
            default:
                z0 z0Var4 = (z0) objArr[0];
                int i172 = f62256c;
                int i173 = (((i172 | 56) << 1) - (i172 ^ 56)) - 1;
                f62257d = i173 % 128;
                if (i173 % 2 == 0) {
                    anw anwVar4 = z0Var4.f62258a;
                    iBitLength = ((BigInteger) anw.setX(new Object[]{anwVar4}, -674276868, 674276871, System.identityHashCode(anwVar4))).bitLength();
                    int i174 = 93 / 0;
                    if (z0Var4.f62259b) {
                        int i175 = f62256c;
                        int i176 = i175 & 59;
                        int i177 = -(-((i175 ^ 59) | i176));
                        int i178 = (i176 ^ i177) + ((i177 & i176) << 1);
                        f62257d = i178 % 128;
                        int i179 = i178 % 2;
                        int iIdentityHashCode = System.identityHashCode(z0Var4);
                        int i180 = -(-(iBitLength * (-112)));
                        int i181 = (-784) ^ i180;
                        int i182 = (((i180 & (-784)) | i181) << 1) - i181;
                        int i183 = ~iBitLength;
                        int i184 = (i183 | iBitLength) & i183;
                        int i185 = ~iIdentityHashCode;
                        int i186 = (i185 | iIdentityHashCode) & i185;
                        int i187 = i184 & i186;
                        int i188 = (i184 | i186) & (~i187);
                        int i189 = (i188 & i187) | (i188 ^ i187);
                        int i190 = ~i189;
                        int i191 = (i189 | i190) & i190;
                        int i192 = i191 & 7;
                        int i193 = -(~(-(-((((i191 | 7) & (~i192)) | i192) * 226))));
                        int i194 = (((i182 | i193) << 1) - (i182 ^ i193)) - 1;
                        int i195 = (iBitLength & (-8)) | ((-8) ^ iBitLength);
                        int i196 = ~i195;
                        int i197 = (i195 | i196) & i196;
                        int i198 = ~(((-8) & iIdentityHashCode) | ((-8) ^ iIdentityHashCode));
                        int i199 = i197 ^ i198;
                        int i200 = i198 & i197;
                        int i201 = (i200 & i199) | (i199 ^ i200);
                        int i202 = i183 & i185;
                        int i203 = (i183 ^ i185) | i202;
                        int i204 = i203 & 7;
                        int i205 = (i203 | 7) & (~i204);
                        int i206 = ~((i205 & i204) | (i205 ^ i204));
                        int i207 = ((~i206) & i201) | ((~i201) & i206);
                        int i208 = i201 & i206;
                        int i209 = -(-(((i208 & i207) | (i207 ^ i208)) * (-113)));
                        int i210 = i194 ^ i209;
                        int i211 = (i209 & i194) << 1;
                        int i212 = (i210 ^ i211) + ((i211 & i210) << 1);
                        int i213 = ((~i183) & iIdentityHashCode) | i202;
                        int i214 = iIdentityHashCode & i183;
                        int i215 = -(~((~((i214 & i213) | (i213 ^ i214))) * 113));
                        iA = b.a(i212 & i215, i215 | i212, 1, 8);
                        int i216 = f62256c;
                        int i217 = i216 ^ 23;
                        int i218 = -(-((i216 & 23) << 1));
                        i16 = (i217 & i218) + (i218 | i217);
                        f62257d = i16 % 128;
                        if (i16 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        int iIdentityHashCode2 = System.identityHashCode(z0Var4);
                        int i219 = -(-(iBitLength * (-195)));
                        int i220 = (-2737) ^ i219;
                        int i221 = -(-((i219 & (-2737)) << 1));
                        int i222 = (i220 & i221) + (i221 | i220);
                        int i223 = ~iBitLength;
                        int i224 = i223 & (-8);
                        int i225 = ((~i223) & 7) | i224;
                        int i226 = i223 & 7;
                        int i227 = ~((i225 & i226) | (i225 ^ i226));
                        int i228 = iBitLength & iIdentityHashCode2;
                        int i229 = ~((iBitLength ^ iIdentityHashCode2) | i228);
                        int i230 = -(-(((i227 & i229) | ((~i229) & i227) | ((~i227) & i229)) * (-196)));
                        int i231 = i222 & i230;
                        int i232 = ((i222 | i230) & (~i231)) + (i231 << 1);
                        int i233 = iBitLength ^ 7;
                        int i234 = iBitLength & 7;
                        int i235 = ((i233 & i234) | (i233 ^ i234)) * 392;
                        int i236 = i232 & i235;
                        int i237 = (i236 - (~((i232 ^ i235) | i236))) - 1;
                        int i238 = ~(((-8) ^ i223) | i224);
                        int i239 = (iIdentityHashCode2 | iBitLength) & (~i228);
                        int i240 = ~((i239 & i228) | (i239 ^ i228));
                        int i241 = ((i237 - (~(-(~(((i240 & i238) | (i238 ^ i240)) * 196))))) - 2) / 8;
                        iA = ((i241 << 1) - i241) - 1;
                        int i242 = f62257d;
                        int i243 = i242 & 97;
                        int i244 = (i242 ^ 97) | i243;
                        int i245 = (i243 & i244) + (i244 | i243);
                        f62256c = i245 % 128;
                        int i246 = i245 % 2;
                    }
                } else {
                    anw anwVar5 = z0Var4.f62258a;
                    iBitLength = ((BigInteger) anw.setX(new Object[]{anwVar5}, -674276868, 674276871, System.identityHashCode(anwVar5))).bitLength();
                    if (z0Var4.f62259b) {
                        int i1710 = f62256c;
                        int i1711 = i1710 & 59;
                        int i1712 = -(-((i1710 ^ 59) | i1711));
                        int i1713 = (i1711 ^ i1712) + ((i1712 & i1711) << 1);
                        f62257d = i1713 % 128;
                        int i1714 = i1713 % 2;
                        int iIdentityHashCode3 = System.identityHashCode(z0Var4);
                        int i1810 = -(-(iBitLength * (-112)));
                        int i1811 = (-784) ^ i1810;
                        int i1812 = (((i1810 & (-784)) | i1811) << 1) - i1811;
                        int i1813 = ~iBitLength;
                        int i1814 = (i1813 | iBitLength) & i1813;
                        int i1815 = ~iIdentityHashCode3;
                        int i1816 = (i1815 | iIdentityHashCode3) & i1815;
                        int i1817 = i1814 & i1816;
                        int i1818 = (i1814 | i1816) & (~i1817);
                        int i1819 = (i1818 & i1817) | (i1818 ^ i1817);
                        int i1910 = ~i1819;
                        int i1911 = (i1819 | i1910) & i1910;
                        int i1912 = i1911 & 7;
                        int i1913 = -(~(-(-((((i1911 | 7) & (~i1912)) | i1912) * 226))));
                        int i1914 = (((i1812 | i1913) << 1) - (i1812 ^ i1913)) - 1;
                        int i1915 = (iBitLength & (-8)) | ((-8) ^ iBitLength);
                        int i1916 = ~i1915;
                        int i1917 = (i1915 | i1916) & i1916;
                        int i1918 = ~(((-8) & iIdentityHashCode3) | ((-8) ^ iIdentityHashCode3));
                        int i1919 = i1917 ^ i1918;
                        int i2010 = i1918 & i1917;
                        int i2011 = (i2010 & i1919) | (i1919 ^ i2010);
                        int i2012 = i1813 & i1815;
                        int i2013 = (i1813 ^ i1815) | i2012;
                        int i2014 = i2013 & 7;
                        int i2015 = (i2013 | 7) & (~i2014);
                        int i2016 = ~((i2015 & i2014) | (i2015 ^ i2014));
                        int i2017 = ((~i2016) & i2011) | ((~i2011) & i2016);
                        int i2018 = i2011 & i2016;
                        int i2019 = -(-(((i2018 & i2017) | (i2017 ^ i2018)) * (-113)));
                        int i2110 = i1914 ^ i2019;
                        int i2111 = (i2019 & i1914) << 1;
                        int i2112 = (i2110 ^ i2111) + ((i2111 & i2110) << 1);
                        int i2113 = ((~i1813) & iIdentityHashCode3) | i2012;
                        int i2114 = iIdentityHashCode3 & i1813;
                        int i2115 = -(~((~((i2114 & i2113) | (i2113 ^ i2114))) * 113));
                        iA = b.a(i2112 & i2115, i2115 | i2112, 1, 8);
                        int i2116 = f62256c;
                        int i2117 = i2116 ^ 23;
                        int i2118 = -(-((i2116 & 23) << 1));
                        i16 = (i2117 & i2118) + (i2118 | i2117);
                        f62257d = i16 % 128;
                        if (i16 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        int iIdentityHashCode4 = System.identityHashCode(z0Var4);
                        int i2119 = -(-(iBitLength * (-195)));
                        int i2210 = (-2737) ^ i2119;
                        int i2211 = -(-((i2119 & (-2737)) << 1));
                        int i2212 = (i2210 & i2211) + (i2211 | i2210);
                        int i2213 = ~iBitLength;
                        int i2214 = i2213 & (-8);
                        int i2215 = ((~i2213) & 7) | i2214;
                        int i2216 = i2213 & 7;
                        int i2217 = ~((i2215 & i2216) | (i2215 ^ i2216));
                        int i2218 = iBitLength & iIdentityHashCode4;
                        int i2219 = ~((iBitLength ^ iIdentityHashCode4) | i2218);
                        int i2310 = -(-(((i2217 & i2219) | ((~i2219) & i2217) | ((~i2217) & i2219)) * (-196)));
                        int i2311 = i2212 & i2310;
                        int i2312 = ((i2212 | i2310) & (~i2311)) + (i2311 << 1);
                        int i2313 = iBitLength ^ 7;
                        int i2314 = iBitLength & 7;
                        int i2315 = ((i2313 & i2314) | (i2313 ^ i2314)) * 392;
                        int i2316 = i2312 & i2315;
                        int i2317 = (i2316 - (~((i2312 ^ i2315) | i2316))) - 1;
                        int i2318 = ~(((-8) ^ i2213) | i2214);
                        int i2319 = (iIdentityHashCode4 | iBitLength) & (~i2218);
                        int i247 = ~((i2319 & i2218) | (i2319 ^ i2218));
                        int i248 = ((i2317 - (~(-(~(((i247 & i2318) | (i2318 ^ i247)) * 196))))) - 2) / 8;
                        iA = ((i248 << 1) - i248) - 1;
                        int i249 = f62257d;
                        int i2410 = i249 & 97;
                        int i2411 = (i249 ^ 97) | i2410;
                        int i2412 = (i2410 & i2411) + (i2411 | i2410);
                        f62256c = i2412 % 128;
                        int i2413 = i2412 % 2;
                    }
                }
                objValueOf = Integer.valueOf(iA);
                break;
        }
        objValueOf = akpVar;
        objValueOf = akpVar2;
        objValueOf = bigIntegerModPow;
        objValueOf = bigIntegerAdd;
        objValueOf = byteArray;
        return objValueOf;
    }
}
