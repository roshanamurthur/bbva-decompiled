package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class aey extends aed {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f52568x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f52569y0 = 1;

    public aey(adh adhVar) {
        super(adhVar);
    }

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws IOException {
        Object afbVar;
        int i13 = (i11 * 965) + ((i10 * (-963)) - 964);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = (((~(i10 | i15)) | (~((~i12) | i15))) * (-964)) + ((i14 | (~(i15 | i12))) * (-964)) + i13;
        int i17 = 3;
        int i18 = 0;
        if (i16 != 1) {
            if (i16 == 2) {
                afbVar = new afb(false, ((aey) objArr[0]).k());
                int i19 = f52569y0;
                int i20 = ((i19 ^ 53) - (~(-(-((i19 & 53) << 1))))) - 1;
                f52568x0 = i20 % 128;
                int i21 = i20 % 2;
            } else {
                if (i16 == 3) {
                    aey aeyVar = (aey) objArr[0];
                    aeb aebVar = (aeb) objArr[1];
                    boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                    int i22 = f52569y0;
                    int i23 = i22 & 33;
                    int i24 = ((i22 | 33) & (~i23)) + (i23 << 1);
                    f52568x0 = i24 % 128;
                    int i25 = i24 % 2;
                    add[] addVarArr = aeyVar.f52530t0;
                    Object[] objArr2 = new Object[4];
                    if (i25 != 0) {
                        objArr2[0] = aebVar;
                        objArr2[1] = Boolean.valueOf(zBooleanValue);
                        objArr2[2] = 56;
                        objArr2[3] = addVarArr;
                        aeb.setX(objArr2, -1072802770, 1072802770, 56);
                    } else {
                        objArr2[0] = aebVar;
                        objArr2[1] = Boolean.valueOf(zBooleanValue);
                        objArr2[2] = 48;
                        objArr2[3] = addVarArr;
                        aeb.setX(objArr2, -1072802770, 1072802770, 48);
                    }
                    return null;
                }
                if (i16 == 4) {
                    afbVar = new aex(((aey) objArr[0]).j());
                    int i26 = f52569y0 + 105;
                    f52568x0 = i26 % 128;
                    if (i26 % 2 != 0) {
                        int i27 = 97 / 0;
                    }
                } else {
                    if (i16 != 5) {
                        aey aeyVar2 = (aey) objArr[0];
                        int i28 = f52569y0;
                        int i29 = ((((i28 ^ 101) | (i28 & 101)) << 1) - (~(-(((~i28) & 101) | (i28 & (-102)))))) - 1;
                        f52568x0 = i29 % 128;
                        int i30 = i29 % 2;
                        adl adlVarI = ((aed) aeyVar2.a()).i();
                        if (i30 != 0) {
                            int i31 = 1 / 0;
                        }
                        int i32 = f52568x0;
                        int i33 = i32 & 121;
                        int i34 = (((i32 ^ 121) | i33) << 1) - ((i32 | 121) & (~i33));
                        f52569y0 = i34 % 128;
                        int i35 = i34 % 2;
                        return adlVarI;
                    }
                    afbVar = new aev(((aey) objArr[0]).f());
                    int i36 = f52568x0;
                    int i37 = (((i36 & (-10)) | ((~i36) & 9)) - (~((i36 & 9) << 1))) - 1;
                    f52569y0 = i37 % 128;
                    int i38 = i37 % 2;
                }
            }
            return afbVar;
        }
        aey aeyVar3 = (aey) objArr[0];
        boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
        int i39 = f52569y0;
        int i40 = i39 & 75;
        int i41 = ((~i40) & (i39 | 75)) + (i40 << 1);
        f52568x0 = i41 % 128;
        int i42 = i41 % 2;
        if (zBooleanValue2) {
            int i43 = i39 + 71;
            f52568x0 = i43 % 128;
            i17 = i43 % 2 != 0 ? 2 : 4;
        } else {
            int i44 = i39 ^ 67;
            int i45 = ((i39 & 67) | i44) << 1;
            int i46 = -i44;
            int i47 = (i45 & i46) + (i46 | i45);
            f52568x0 = i47 % 128;
            int i48 = i47 % 2;
        }
        int length = aeyVar3.f52530t0.length;
        int i49 = f52568x0;
        int i50 = i49 & 95;
        int i51 = (i49 | 95) & (~i50);
        int i52 = -(-(i50 << 1));
        int i53 = ((i51 | i52) << 1) - (i51 ^ i52);
        f52569y0 = i53 % 128;
        int i54 = i53 % 2;
        while (i18 < length) {
            int i55 = f52569y0;
            int i56 = (i55 ^ 53) + ((i55 & 53) << 1);
            f52568x0 = i56 % 128;
            int i57 = i56 % 2;
            int iB = aeyVar3.f52530t0[i18].UiMessageCallbackKtWhenMappings().b(true);
            int iIdentityHashCode = System.identityHashCode(aeyVar3);
            int i58 = iB * 866;
            int i59 = -(-(i17 * (-864)));
            int i60 = (i58 & i59) + (i58 | i59);
            int i61 = ~i17;
            int i62 = ~iB;
            int i63 = ~iIdentityHashCode;
            int i64 = ~iIdentityHashCode;
            int i65 = (i64 | iIdentityHashCode) & i63;
            int i66 = (i62 & i65) | (i62 ^ i65);
            int i67 = (i66 | (~i66)) & (~i66);
            int i68 = ((i61 & i67) | ((~i67) & i61) | ((~i61) & i67)) * (-865);
            int i69 = i60 ^ i68;
            int i70 = (((i68 & i60) | i69) << 1) - i69;
            int i71 = (iIdentityHashCode & iB) | (iB ^ iIdentityHashCode);
            int i72 = ((i71 | (~i71)) & (~i71)) * 865;
            int i73 = i70 & i72;
            int i74 = (i72 ^ i70) | i73;
            int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
            int i76 = ~i17;
            int i77 = ~((i76 & i64) | (i76 ^ i64));
            int i78 = i63 & iB;
            int i79 = ((iB | i63) & (~i78)) | i78;
            int i80 = (i79 | (~i79)) & (~i79);
            int i81 = ((~i80) & i77) | ((~i77) & i80);
            int i82 = i80 & i77;
            int i83 = ((i82 & i81) | (i81 ^ i82)) * 865;
            int i84 = i75 & i83;
            i17 = (((i83 | i75) & (~i84)) - (~(-(-(i84 << 1))))) - 1;
            i18 = (((i18 | 12) << 1) - (i18 ^ 12)) - 11;
            int i85 = f52569y0;
            int i86 = i85 & 111;
            int i87 = ((i85 | 111) & (~i86)) + (i86 << 1);
            f52568x0 = i87 % 128;
            int i88 = i87 % 2;
        }
        int i89 = f52569y0;
        int i90 = i89 & 1;
        int i91 = ((i89 ^ 1) | i90) << 1;
        int i92 = -((i89 | 1) & (~i90));
        int i93 = (i91 ^ i92) + ((i92 & i91) << 1);
        f52568x0 = i93 % 128;
        int i94 = i93 % 2;
        return Integer.valueOf(i17);
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) throws IOException {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this, Boolean.valueOf(z10)}, -2147449304, 2147449305, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this, aebVar, Boolean.valueOf(z10)}, -1472786692, 1472786695, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aed
    public final aee g() {
        return (aee) setCompoundDrawableTintBlendMode(new Object[]{this}, 2138481948, -2138481946, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aed
    public final ads h() {
        return (ads) setCompoundDrawableTintBlendMode(new Object[]{this}, -1308596497, 1308596501, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aed
    public final adl i() {
        return (adl) setCompoundDrawableTintBlendMode(new Object[]{this}, -2027456959, 2027456959, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aed
    public final acz setOnFocusChangeListener() {
        return (acz) setCompoundDrawableTintBlendMode(new Object[]{this}, 1714572459, -1714572454, System.identityHashCode(this));
    }

    public aey(add addVar) {
        super(addVar);
    }

    public aey() {
    }
}
