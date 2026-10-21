package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes10.dex */
public final class ahu extends adw {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52683u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public adp f52684r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public adp f52685s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public adp f52686t0;

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-448)) + (i10 * 450);
        int i14 = ~((~i10) | i11);
        int i15 = ~i11;
        int i16 = (((~(i10 | i15 | (~i12))) | i14) * 449) + (i14 * (-1347)) + (((~(i15 | i10 | i12)) | i14) * 449) + i13;
        Object obj = null;
        if (i16 == 1) {
            ahu ahuVar = (ahu) objArr[0];
            int i17 = f52683u0;
            int i18 = ((i17 & (-62)) | ((~i17) & 61)) + ((i17 & 61) << 1);
            int i19 = i18 % 128;
            v0 = i19;
            int i20 = i18 % 2;
            adp adpVar = ahuVar.f52686t0;
            if (i20 == 0) {
                throw null;
            }
            if (adpVar == null) {
                int i21 = i19 + 115;
                f52683u0 = i21 % 128;
                if (i21 % 2 != 0) {
                    throw null;
                }
            } else {
                obj = (BigInteger) adp.setOnFocusChangeListener(new Object[]{adpVar}, 446421226, -446421218, System.identityHashCode(adpVar));
                int i22 = v0;
                int i23 = ((i22 ^ 65) | (i22 & 65)) << 1;
                int i24 = -(((~i22) & 65) | (i22 & (-66)));
                int i25 = (i23 & i24) + (i24 | i23);
                f52683u0 = i25 % 128;
                int i26 = i25 % 2;
            }
        } else {
            if (i16 == 2) {
                ahu ahuVar2 = (ahu) objArr[0];
                int i27 = f52683u0;
                int i28 = i27 ^ 105;
                int i29 = -(-((i27 & 105) << 1));
                int i30 = (i28 & i29) + (i29 | i28);
                v0 = i30 % 128;
                int i31 = i30 % 2;
                adp adpVar2 = ahuVar2.f52685s0;
                BigInteger bigInteger = (BigInteger) adp.setOnFocusChangeListener(new Object[]{adpVar2}, 446421226, -446421218, System.identityHashCode(adpVar2));
                int i32 = f52683u0;
                int i33 = ((i32 | 21) << 1) - (i32 ^ 21);
                v0 = i33 % 128;
                if (i33 % 2 != 0) {
                    return bigInteger;
                }
                throw null;
            }
            if (i16 == 3) {
                ahu ahuVar3 = (ahu) objArr[0];
                adh adhVar = new adh(3);
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ahuVar3.f52684r0}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ahuVar3.f52685s0}, 240298319, -240298315, System.identityHashCode(adhVar));
                if (((BigInteger) setCompoundDrawableTintBlendMode(new Object[]{ahuVar3}, -552555373, 552555374, System.identityHashCode(ahuVar3))) != null) {
                    int i34 = v0;
                    int i35 = (((i34 | 103) << 1) - (~(-(i34 ^ 103)))) - 1;
                    f52683u0 = i35 % 128;
                    int i36 = i35 % 2;
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ahuVar3.f52686t0}, 240298319, -240298315, System.identityHashCode(adhVar));
                    int i37 = f52683u0;
                    int i38 = i37 & 51;
                    int i39 = (i37 ^ 51) | i38;
                    int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                    v0 = i40 % 128;
                    int i41 = i40 % 2;
                }
                afv afvVar = new afv(adhVar);
                int i42 = v0;
                int i43 = i42 & 111;
                int i44 = ((((i42 ^ 111) | i43) << 1) - (~(-((i42 | 111) & (~i43))))) - 1;
                f52683u0 = i44 % 128;
                if (i44 % 2 == 0) {
                    return afvVar;
                }
                throw null;
            }
            if (i16 != 4) {
                ahu ahuVar4 = (ahu) objArr[0];
                int i45 = v0;
                int i46 = ((i45 ^ 2) + ((i45 & 2) << 1)) - 1;
                f52683u0 = i46 % 128;
                int i47 = i46 % 2;
                adp adpVar3 = ahuVar4.f52684r0;
                BigInteger bigInteger2 = (BigInteger) adp.setOnFocusChangeListener(new Object[]{adpVar3}, 446421226, -446421218, System.identityHashCode(adpVar3));
                int i48 = f52683u0 + 93;
                v0 = i48 % 128;
                int i49 = i48 % 2;
                return bigInteger2;
            }
            Object obj2 = objArr[0];
            int i50 = v0;
            int i51 = i50 | 125;
            int i52 = i51 << 1;
            int i53 = -(i51 & (~(i50 & 125)));
            int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
            int i55 = i54 % 128;
            f52683u0 = i55;
            if (i54 % 2 != 0) {
                boolean z10 = obj2 instanceof ahu;
                throw null;
            }
            if (obj2 instanceof ahu) {
                int i56 = i55 ^ 5;
                int i57 = (i55 & 5) << 1;
                int i58 = ((i56 | i57) << 1) - (i56 ^ i57);
                int i59 = i58 % 128;
                v0 = i59;
                Object obj3 = (ahu) obj2;
                if (i58 % 2 == 0) {
                    int i60 = 26 / 0;
                }
                obj = obj3;
                int i61 = ((i59 & (-2)) | ((~i59) & 1)) + ((i59 & 1) << 1);
                f52683u0 = i61 % 128;
                if (i61 % 2 != 0) {
                    int i62 = 61 / 0;
                }
            } else if (obj2 != null) {
                aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj2);
                ahu ahuVar5 = new ahu();
                Enumeration dividerPadding = compoundDrawableTintBlendMode.setDividerPadding();
                ahuVar5.f52684r0 = (adp) adp.setOnFocusChangeListener(new Object[]{dividerPadding.nextElement()}, -837021952, 837021958, (int) System.currentTimeMillis());
                ahuVar5.f52685s0 = (adp) adp.setOnFocusChangeListener(new Object[]{dividerPadding.nextElement()}, -837021952, 837021958, (int) System.currentTimeMillis());
                if (dividerPadding.hasMoreElements()) {
                    ahuVar5.f52686t0 = (adp) dividerPadding.nextElement();
                } else {
                    ahuVar5.f52686t0 = null;
                }
                int i63 = f52683u0;
                int i64 = i63 & 23;
                int i65 = ((i63 | 23) & (~i64)) + (i64 << 1);
                v0 = i65 % 128;
                if (i65 % 2 == 0) {
                    int i66 = 44 / 0;
                }
                obj = ahuVar5;
            } else {
                int i67 = i50 + 71;
                f52683u0 = i67 % 128;
                if (i67 % 2 != 0) {
                    int i68 = 68 / 0;
                }
            }
        }
        return obj;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, -443927117, 443927120, System.identityHashCode(this));
    }

    public final BigInteger setDividerPadding() {
        return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, 1830990349, -1830990349, System.identityHashCode(this));
    }

    public final BigInteger setOnFocusChangeListener() {
        return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, -552555373, 552555374, System.identityHashCode(this));
    }

    public final BigInteger setY() {
        return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, -416179928, 416179930, System.identityHashCode(this));
    }

    public static ahu setOnFocusChangeListener(Object obj) {
        return (ahu) setCompoundDrawableTintBlendMode(new Object[]{obj}, 1605013944, -1605013940, (int) System.currentTimeMillis());
    }
}
