package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class acy extends ady implements aei {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52435u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public char[] f52436t0;

    static {
        Integer num = 30;
        num.intValue();
        int i10 = f52435u0;
        int i11 = (((i10 ^ 111) | (i10 & 111)) << 1) - (((~i10) & 111) | (i10 & (-112)));
        v0 = i11 % 128;
        int i12 = i11 % 2;
    }

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int iIntValue;
        Boolean boolValueOf;
        int length;
        byte[] bArr;
        int i14;
        int i15;
        int i16 = ~i10;
        int i17 = ~i11;
        int i18 = (((~(i16 | i17)) | (~(i17 | i12))) * 104) + (i11 * (-103)) + (i10 * (-103));
        int i19 = 2;
        int i20 = 1;
        switch (((i10 | i12) * 104) + ((~(i11 | (~i12) | i10)) * (-104)) + i18) {
            case 1:
                acy acyVar = (acy) objArr[0];
                int iIdentityHashCode = System.identityHashCode(acyVar);
                int i21 = (-1631600973) & iIdentityHashCode;
                int i22 = ~((((-1631600973) | iIdentityHashCode) & (~i21)) | i21);
                int i23 = ~iIdentityHashCode;
                int i24 = i23 & 1742303052;
                int i25 = (i23 | 1742303052) & (~i24);
                int i26 = (i25 & i24) | (i25 ^ i24);
                int i27 = i26 ^ (-381271572);
                int i28 = i26 & (-381271572);
                int i29 = ~((i28 & i27) | (i27 ^ i28));
                int i30 = i22 & i29;
                int i31 = -(-((((i22 | i29) & (~i30)) | i30) * (-318)));
                int i32 = (374166520 ^ i31) + ((i31 & 374166520) << 1);
                int i33 = ~((1742303052 ^ iIdentityHashCode) | (1742303052 & iIdentityHashCode));
                int i34 = ((i33 & (-2012872544)) | ((~i33) & (-2012872544)) | (2012872543 & i33)) * (-318);
                int i35 = (((~i34) & i32) | ((~i32) & i34)) + ((i34 & i32) << 1);
                int i36 = (-1742303053) ^ iIdentityHashCode;
                int i37 = iIdentityHashCode & (-1742303053);
                int i38 = ~((i37 & i36) | (i36 ^ i37));
                int i39 = ((~i38) & 381271571) | ((-381271572) & i38);
                int i40 = i38 & 381271571;
                int i41 = -(-(((i40 & i39) | (i39 ^ i40)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                int i42 = i35 & i41;
                int i43 = ((i35 ^ i41) | i42) << 1;
                int i44 = -((i41 | i35) & (~i42));
                int i45 = (i43 & i44) + (i44 | i43);
                int iIdentityHashCode2 = System.identityHashCode(acyVar);
                int i46 = (-1589728080) & iIdentityHashCode2;
                int i47 = ((-1589728080) | iIdentityHashCode2) & (~i46);
                int i48 = ~iIdentityHashCode2;
                int i49 = ~((i47 & i46) | (i47 ^ i46));
                int i50 = ((~i49) & 1375797517) | ((-1375797518) & i49);
                int i51 = i49 & 1375797517;
                int i52 = (i51 & i50) | (i50 ^ i51);
                int i53 = ~iIdentityHashCode2;
                int i54 = i53 & 1377371421;
                int i55 = (i53 | 1377371421) & (~i54);
                int i56 = (i55 & i54) | (i55 ^ i54);
                int i57 = i56 ^ 1589728079;
                int i58 = i56 & 1589728079;
                int i59 = ~((i58 & i57) | (i57 ^ i58));
                int i60 = -(-(((i52 & i59) | (i52 ^ i59)) * (-470)));
                int i61 = 1051870794 & i60;
                int i62 = (i61 - (~(-(-((i60 ^ 1051870794) | i61))))) - 1;
                int i63 = (-213930563) & iIdentityHashCode2;
                int i64 = ~(((iIdentityHashCode2 | (-213930563)) & (~i63)) | i63);
                int i65 = (i48 ^ 1377371421) | (i48 & 1377371421);
                int i66 = ((-1589728080) & i65) | ((~i65) & 1589728079);
                int i67 = i65 & 1589728079;
                int i68 = ~((i67 & i66) | (i66 ^ i67));
                int i69 = ((i64 & i68) | (i64 ^ i68)) * 470;
                return Boolean.valueOf(i45 <= (((~i69) & i62) | ((~i62) & i69)) + ((i69 & i62) << 1));
            case 2:
                acy acyVar2 = (acy) objArr[0];
                int i70 = v0 + 111;
                f52435u0 = i70 % 128;
                if (i70 % 2 != 0) {
                    iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{acyVar2.f52436t0}, -2017054740, 2017054751, (int) System.currentTimeMillis())).intValue();
                    int i71 = 39 / 0;
                    i13 = 1;
                } else {
                    char[] cArr = acyVar2.f52436t0;
                    i13 = 1;
                    iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{cArr}, -2017054740, 2017054751, (int) System.currentTimeMillis())).intValue();
                }
                int i72 = v0;
                int i73 = i72 ^ 1;
                int i74 = (i72 & i13) << i13;
                int i75 = (i73 ^ i74) + ((i74 & i73) << 1);
                f52435u0 = i75 % 128;
                if (i75 % 2 == 0) {
                    return Integer.valueOf(iIntValue);
                }
                throw null;
            case 3:
                String str = new String(((acy) objArr[0]).f52436t0);
                int i76 = v0;
                int i77 = i76 | 125;
                int i78 = (i77 << 1) - ((~(i76 & 125)) & i77);
                f52435u0 = i78 % 128;
                int i79 = i78 % 2;
                return str;
            case 4:
                char[] cArr2 = (char[]) objArr[0];
                afh afhVar = new afh();
                if (cArr2 == null) {
                    throw new NullPointerException("'string' cannot be null");
                }
                afhVar.f52436t0 = cArr2;
                int i80 = f52435u0;
                int i81 = (((i80 | 60) << 1) - (i80 ^ 60)) - 1;
                v0 = i81 % 128;
                if (i81 % 2 != 0) {
                    return afhVar;
                }
                int i82 = 85 / 0;
                return afhVar;
            case 5:
                afh afhVar2 = new afh((byte[]) objArr[0]);
                int i83 = v0;
                int i84 = i83 & 59;
                int i85 = (i83 ^ 59) | i84;
                int i86 = (i84 & i85) + (i85 | i84);
                f52435u0 = i86 % 128;
                int i87 = i86 % 2;
                return afhVar2;
            case 6:
                acy acyVar3 = (acy) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i88 = v0;
                int i89 = i88 & 5;
                int i90 = (i89 - (~((i88 ^ 5) | i89))) - 1;
                f52435u0 = i90 % 128;
                int i91 = i90 % 2;
                int length2 = acyVar3.f52436t0.length << 1;
                int iIntValue2 = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue), Integer.valueOf(length2)}, 1150803379, -1150803367, length2)).intValue();
                int i92 = f52435u0;
                int i93 = i92 & 53;
                int i94 = (i92 | 53) & (~i93);
                int i95 = i93 << 1;
                int i96 = (i94 ^ i95) + ((i94 & i95) << 1);
                v0 = i96 % 128;
                int i97 = i96 % 2;
                return Integer.valueOf(iIntValue2);
            case 7:
                acy acyVar4 = (acy) objArr[0];
                ady adyVar = (ady) objArr[1];
                int i98 = v0;
                int i99 = ((i98 | 125) << 1) - (i98 ^ 125);
                int i100 = i99 % 128;
                f52435u0 = i100;
                if (i99 % 2 != 0) {
                    boolean z10 = adyVar instanceof acy;
                    throw null;
                }
                if (adyVar instanceof acy) {
                    boolean zBooleanValue2 = ((Boolean) bek.setOnFocusChangeListener(new Object[]{acyVar4.f52436t0, ((acy) adyVar).f52436t0}, -423504169, 423504193, (int) System.currentTimeMillis())).booleanValue();
                    int i101 = v0;
                    int i102 = i101 & 119;
                    int i103 = ((i101 ^ 119) | i102) << 1;
                    int i104 = -((i101 | 119) & (~i102));
                    int i105 = (i103 ^ i104) + ((i104 & i103) << 1);
                    f52435u0 = i105 % 128;
                    if (i105 % 2 != 0) {
                        throw null;
                    }
                    boolValueOf = Boolean.valueOf(zBooleanValue2);
                } else {
                    int i106 = ~i100;
                    int i107 = (i100 & (-96)) | (i106 & 95);
                    int i108 = -(-((i100 & 95) << 1));
                    int i109 = (i107 & i108) + (i107 | i108);
                    v0 = i109 % 128;
                    int i110 = i109 % 2;
                    int i111 = (((i100 & (-38)) | (i106 & 37)) - (~((i100 & 37) << 1))) - 1;
                    v0 = i111 % 128;
                    int i112 = i111 % 2;
                    boolValueOf = Boolean.FALSE;
                }
                return boolValueOf;
            default:
                Integer num = 0;
                acy acyVar5 = (acy) objArr[0];
                aeb aebVar = (aeb) objArr[1];
                boolean zBooleanValue3 = ((Boolean) objArr[2]).booleanValue();
                int i113 = f52435u0;
                int i114 = (i113 & 109) + (i113 | 109);
                v0 = i114 % 128;
                if (i114 % 2 == 0) {
                    length = acyVar5.f52436t0.length;
                    aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue3), 10}, 1303469841, -1303469839, 10);
                    aeb.setX(new Object[]{aebVar, Integer.valueOf(length)}, 1357165778, -1357165764, length);
                    bArr = new byte[90];
                    i14 = length & 70;
                    i15 = 1;
                } else {
                    length = acyVar5.f52436t0.length;
                    aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue3), 30}, 1303469841, -1303469839, 30);
                    int i115 = length << 1;
                    aeb.setX(new Object[]{aebVar, Integer.valueOf(i115)}, 1357165778, -1357165764, i115);
                    bArr = new byte[8];
                    i14 = length & (-4);
                    i15 = 0;
                }
                while (i15 < i14) {
                    int i116 = f52435u0;
                    int i117 = ((i116 ^ 117) - (~((i116 & 117) << 1))) - 1;
                    v0 = i117 % 128;
                    int i118 = i117 % i19;
                    char[] cArr3 = acyVar5.f52436t0;
                    char c10 = cArr3[i15];
                    int i119 = i15 & 2;
                    char c11 = cArr3[(i119 + (i15 | 2)) - 1];
                    int i120 = ~i15;
                    int i121 = (i15 & (-3)) | (i19 & i120);
                    int i122 = -(-(i119 << 1));
                    char c12 = cArr3[(i121 ^ i122) + ((i121 & i122) << i20)];
                    int iIdentityHashCode3 = System.identityHashCode(acyVar5);
                    int i123 = i15 * (-209);
                    int i124 = (-627) & i123;
                    int i125 = ((((-627) | i123) & (~i124)) - (~(i124 << 1))) - 1;
                    int i126 = -(-((~(((-4) ^ i120) | ((-4) & i120))) * ErrorCodes.ERR_CRY_IO_PROPERTIES));
                    int i127 = i125 & i126;
                    int i128 = i14;
                    int i129 = ((~i127) & (i125 | i126)) + (i127 << 1);
                    int i130 = ~iIdentityHashCode3;
                    int i131 = ~i130;
                    acy acyVar6 = acyVar5;
                    int i132 = ((~i120) & i130) | (i120 & i131);
                    int i133 = i120 & i130;
                    int i134 = ~((i132 ^ i133) | (i132 & i133));
                    int i135 = ~(((-4) ^ iIdentityHashCode3) | ((-4) & iIdentityHashCode3));
                    Integer num2 = num;
                    int i136 = (((~i134) & i135) | ((~i135) & i134) | (i134 & i135)) * ErrorCodes.ERR_CRY_IO_PROPERTIES;
                    int i137 = i129 & i136;
                    int i138 = i137 + ((i136 ^ i129) | i137);
                    int i139 = ((-4) & i131) | (i130 & 3);
                    int i140 = (-4) & i130;
                    int i141 = (i140 & i139) | (i139 ^ i140);
                    int i142 = i141 ^ i15;
                    int i143 = i141 & i15;
                    int i144 = ~((i143 & i142) | (i142 ^ i143));
                    int i145 = i120 ^ 3;
                    int i146 = i120 & 3;
                    int i147 = (i146 & i145) | (i145 ^ i146);
                    int i148 = i147 & iIdentityHashCode3;
                    int i149 = (i147 | iIdentityHashCode3) & (~i148);
                    int i150 = ~((i149 & i148) | (i149 ^ i148));
                    int i151 = i144 ^ i150;
                    int i152 = i144 & i150;
                    int i153 = ((i152 & i151) | (i151 ^ i152)) * ErrorCodes.ERR_CRY_IO_PROPERTIES;
                    int i154 = i138 ^ i153;
                    char c13 = cArr3[((((i153 & i138) | i154) << 1) - (~(-i154))) - 1];
                    int i155 = i15 & 4;
                    int i156 = -(-(i15 | 4));
                    i15 = ((i155 | i156) << 1) - (i155 ^ i156);
                    bArr[0] = (byte) (c10 >> '\b');
                    bArr[1] = (byte) c10;
                    bArr[2] = (byte) (c11 >> '\b');
                    bArr[3] = (byte) c11;
                    bArr[4] = (byte) (c12 >> '\b');
                    bArr[5] = (byte) c12;
                    bArr[6] = (byte) (c13 >> '\b');
                    bArr[7] = (byte) c13;
                    aeb.setX(new Object[]{aebVar, bArr, num2, 8}, -464690180, 464690189, 0);
                    int i157 = f52435u0;
                    int i158 = i157 ^ 13;
                    int i159 = ((i157 & 13) | i158) << 1;
                    int i160 = -i158;
                    int i161 = ((i159 | i160) << 1) - (i159 ^ i160);
                    v0 = i161 % 128;
                    int i162 = i161 % 2;
                    i14 = i128;
                    acyVar5 = acyVar6;
                    length = length;
                    num = num2;
                    i19 = 2;
                    i20 = 1;
                }
                Integer num3 = num;
                acy acyVar7 = acyVar5;
                if (i15 < length) {
                    int i163 = f52435u0;
                    int i164 = i163 & 81;
                    int i165 = -(-((i163 ^ 81) | i164));
                    int i166 = (i164 ^ i165) + ((i165 & i164) << 1);
                    int i167 = i166 % 128;
                    v0 = i167;
                    int i168 = i166 % 2 == 0 ? 1 : 0;
                    int i169 = i167 + 117;
                    f52435u0 = i169 % 128;
                    int i170 = i169 % 2;
                    do {
                        char c14 = acyVar7.f52436t0[i15];
                        i15 = ((i15 | 1) << 1) - (i15 ^ 1);
                        int i171 = (((i168 & (-55)) | ((~i168) & 54)) - (~((i168 & 54) << 1))) - 1;
                        int i172 = (i171 & (-52)) + (i171 | (-52));
                        int i173 = (i172 ^ (-1)) + (i172 << 1);
                        bArr[i168] = (byte) (c14 >> '\b');
                        int i174 = (i173 ^ (-127)) + ((i173 & (-127)) << 1);
                        i168 = ((i174 | 128) << 1) - (i174 ^ 128);
                        bArr[i173] = (byte) c14;
                    } while (i15 < length);
                    int i175 = v0;
                    int i176 = i175 & 25;
                    int i177 = ((i175 | 25) & (~i176)) + (i176 << 1);
                    f52435u0 = i177 % 128;
                    if (i177 % 2 != 0) {
                        aeb.setX(new Object[]{aebVar, bArr, num3, Integer.valueOf(i168)}, -464690180, 464690189, 0);
                    } else {
                        aeb.setX(new Object[]{aebVar, bArr, num3, Integer.valueOf(i168)}, -464690180, 464690189, 0);
                    }
                    int i178 = f52435u0;
                    int i179 = i178 & 85;
                    int i180 = -(-((i178 ^ 85) | i179));
                    int i181 = ((i179 | i180) << 1) - (i180 ^ i179);
                    v0 = i181 % 128;
                    int i182 = i181 % 2;
                }
                int i183 = f52435u0;
                int i184 = ((i183 ^ 54) + ((i183 & 54) << 1)) - 1;
                v0 = i184 % 128;
                if (i184 % 2 != 0) {
                    return null;
                }
                throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this, Boolean.valueOf(z10)}, 1347129526, -1347129520, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this, aebVar, Boolean.valueOf(z10)}, -28274800, 28274800, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, adyVar}, 245943253, -245943246, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public final int hashCode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 631371513, -631371511, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aei
    public final String setOnFocusChangeListener() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -1319976363, 1319976366, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 2077746041, -2077746040, System.identityHashCode(this))).booleanValue();
    }

    public String toString() {
        int i10 = f52435u0;
        int i11 = ((i10 & 20) + (i10 | 20)) - 1;
        v0 = i11 % 128;
        Object[] objArr = new Object[1];
        if (i11 % 2 != 0) {
            objArr[0] = this;
            return (String) setCompoundDrawableTintBlendMode(objArr, -1319976363, 1319976366, System.identityHashCode(this));
        }
        objArr[0] = this;
        throw null;
    }
}
