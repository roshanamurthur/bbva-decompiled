package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;

/* JADX INFO: loaded from: classes10.dex */
public final class aii extends adw {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52785t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52786u0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public adu f52787r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public add f52788s0;

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (((~(i14 | i15)) | i13) * 68) + ((~(i11 | i13 | i15)) * (-68)) + (((~(i10 | i11)) | (~(i13 | i14 | i15)) | (~(i12 | i11))) * (-68)) + (i11 * (-67)) + (i10 * 69);
        if (i16 == 1) {
            aii aiiVar = (aii) objArr[0];
            int i17 = f52785t0;
            int i18 = (i17 & 79) + (i17 | 79);
            f52786u0 = i18 % 128;
            int i19 = i18 % 2;
            add addVar = aiiVar.f52788s0;
            int i20 = (i17 & (-96)) | ((~i17) & 95);
            int i21 = (i17 & 95) << 1;
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f52786u0 = i22 % 128;
            if (i22 % 2 != 0) {
                return addVar;
            }
            int i23 = 43 / 0;
            return addVar;
        }
        if (i16 == 2) {
            Object obj = objArr[0];
            int i24 = f52786u0;
            int i25 = (i24 ^ 9) + ((i24 & 9) << 1);
            f52785t0 = i25 % 128;
            if (i25 % 2 != 0) {
                boolean z10 = obj instanceof aii;
                throw null;
            }
            if (obj instanceof aii) {
                aii aiiVar2 = (aii) obj;
                int i26 = (((i24 ^ 1) | (i24 & 1)) << 1) - (((~i24) & 1) | (i24 & (-2)));
                f52785t0 = i26 % 128;
                int i27 = i26 % 2;
                return aiiVar2;
            }
            if (obj == null) {
                throw new IllegalArgumentException("null value in getInstance()");
            }
            aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
            aii aiiVar3 = new aii();
            aiiVar3.f52787r0 = (adu) compoundDrawableTintBlendMode.setX(0);
            aiiVar3.f52788s0 = compoundDrawableTintBlendMode.setX(1);
            int i28 = f52786u0 + 83;
            f52785t0 = i28 % 128;
            if (i28 % 2 == 0) {
                return aiiVar3;
            }
            throw null;
        }
        if (i16 != 3) {
            aii aiiVar4 = (aii) objArr[0];
            adh adhVar = new adh(2);
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, aiiVar4.f52787r0}, 240298319, -240298315, System.identityHashCode(adhVar));
            afv afvVarA = c.a(adhVar, new Object[]{adhVar, aiiVar4.f52788s0}, 240298319, -240298315, adhVar);
            int i29 = f52786u0;
            int i30 = i29 & 101;
            int i31 = (i29 ^ 101) | i30;
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            f52785t0 = i32 % 128;
            if (i32 % 2 == 0) {
                return afvVarA;
            }
            throw null;
        }
        aii aiiVar5 = (aii) objArr[0];
        int i33 = f52785t0;
        int i34 = i33 ^ 25;
        int i35 = ((i33 & 25) | i34) << 1;
        int i36 = -i34;
        int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
        f52786u0 = i37 % 128;
        int i38 = i37 % 2;
        adu aduVar = aiiVar5.f52787r0;
        if (i38 != 0) {
            return aduVar;
        }
        int i39 = 97 / 0;
        return aduVar;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, -1015906046, 1015906046, System.identityHashCode(this));
    }

    public final add setOnFocusChangeListener() {
        return (add) setCompoundDrawableTintBlendMode(new Object[]{this}, -1419288037, 1419288038, System.identityHashCode(this));
    }

    public final adu setX() {
        return (adu) setCompoundDrawableTintBlendMode(new Object[]{this}, 416665965, -416665962, System.identityHashCode(this));
    }

    public static aii setX(Object obj) {
        return (aii) setCompoundDrawableTintBlendMode(new Object[]{obj}, 1255857609, -1255857607, (int) System.currentTimeMillis());
    }
}
