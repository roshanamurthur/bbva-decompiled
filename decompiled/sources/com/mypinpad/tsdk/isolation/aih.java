package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;

/* JADX INFO: loaded from: classes10.dex */
public final class aih extends adw {
    public static int v0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f52780w0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f52781r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f52782s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f52783t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f52784u0;

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 263) + (i10 * (-523));
        int i14 = ~((~i10) | i11);
        int i15 = ~i11;
        int i16 = ~(i10 | i15);
        int i17 = ((i16 | (~(i15 | (~i12))) | i14) * 262) + (i16 * (-786)) + ((i14 | i16 | (~(i15 | i12))) * 262) + i13;
        aih aihVar = null;
        if (i17 == 1) {
            aih aihVar2 = (aih) objArr[0];
            int i18 = f52780w0;
            int i19 = i18 & 85;
            int i20 = (i19 - (~(-(-((i18 ^ 85) | i19))))) - 1;
            v0 = i20 % 128;
            int i21 = i20 % 2;
            int i22 = aihVar2.f52782s0;
            int i23 = i18 & 17;
            int i24 = (i18 | 17) & (~i23);
            int i25 = i23 << 1;
            int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
            v0 = i26 % 128;
            if (i26 % 2 == 0) {
                return Integer.valueOf(i22);
            }
            throw null;
        }
        if (i17 == 2) {
            aih aihVar3 = (aih) objArr[0];
            adh adhVar = new adh(2);
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(aihVar3.f52781r0)}, 240298319, -240298315, System.identityHashCode(adhVar));
            int i27 = aihVar3.f52782s0;
            int i28 = aihVar3.f52783t0;
            if (i28 == 0) {
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(i27)}, 240298319, -240298315, System.identityHashCode(adhVar));
                int i29 = f52780w0;
                int i30 = i29 ^ 91;
                int i31 = ((i29 & 91) | i30) << 1;
                int i32 = -i30;
                int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
                v0 = i33 % 128;
                int i34 = i33 % 2;
            } else {
                adh adhVar2 = new adh(3);
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, new adp(i27)}, 240298319, -240298315, System.identityHashCode(adhVar2));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, new adp(i28)}, 240298319, -240298315, System.identityHashCode(adhVar2));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, c.a(adhVar2, new Object[]{adhVar2, new adp(aihVar3.f52784u0)}, 240298319, -240298315, adhVar2)}, 240298319, -240298315, System.identityHashCode(adhVar));
                int i35 = f52780w0;
                int i36 = ((i35 | 11) << 1) - (i35 ^ 11);
                v0 = i36 % 128;
                int i37 = i36 % 2;
            }
            afv afvVar = new afv(adhVar);
            int i38 = v0;
            int i39 = i38 & 3;
            int i40 = -(-((i38 ^ 3) | i39));
            int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
            f52780w0 = i41 % 128;
            if (i41 % 2 != 0) {
                return afvVar;
            }
            int i42 = 54 / 0;
            return afvVar;
        }
        if (i17 == 3) {
            aih aihVar4 = (aih) objArr[0];
            int i43 = v0;
            int i44 = i43 & 93;
            int i45 = ((i43 | 93) & (~i44)) + (i44 << 1);
            f52780w0 = i45 % 128;
            int i46 = i45 % 2;
            int i47 = aihVar4.f52781r0;
            if (i46 == 0) {
                int i48 = 19 / 0;
            }
            return Integer.valueOf(i47);
        }
        if (i17 != 4) {
            if (i17 == 5) {
                aih aihVar5 = (aih) objArr[0];
                int i49 = f52780w0;
                int i50 = ((i49 | 33) << 1) - (i49 ^ 33);
                v0 = i50 % 128;
                int i51 = i50 % 2;
                int i52 = aihVar5.f52784u0;
                int i53 = i49 ^ 109;
                int i54 = (i49 & 109) << 1;
                int i55 = (i53 & i54) + (i54 | i53);
                v0 = i55 % 128;
                if (i55 % 2 == 0) {
                    return Integer.valueOf(i52);
                }
                throw null;
            }
            aih aihVar6 = (aih) objArr[0];
            int i56 = f52780w0;
            int i57 = i56 & 15;
            int i58 = ((i56 ^ 15) | i57) << 1;
            int i59 = -((i56 | 15) & (~i57));
            int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
            int i61 = i60 % 128;
            v0 = i61;
            int i62 = i60 % 2;
            int i63 = aihVar6.f52783t0;
            if (i62 != 0) {
                throw null;
            }
            int i64 = i61 + 89;
            f52780w0 = i64 % 128;
            if (i64 % 2 != 0) {
                return Integer.valueOf(i63);
            }
            throw null;
        }
        Object obj = objArr[0];
        int i65 = f52780w0;
        int i66 = (i65 ^ 45) + ((i65 & 45) << 1);
        v0 = i66 % 128;
        int i67 = i66 % 2;
        if (obj instanceof aih) {
            int i68 = ((i65 ^ 21) | (i65 & 21)) << 1;
            int i69 = -(((~i65) & 21) | (i65 & (-22)));
            int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
            int i71 = i70 % 128;
            v0 = i71;
            aih aihVar7 = (aih) obj;
            if (i70 % 2 != 0) {
                int i72 = 24 / 0;
            }
            aihVar = aihVar7;
            int i73 = i71 & 111;
            int i74 = (i71 | 111) & (~i73);
            int i75 = -(-(i73 << 1));
            int i76 = ((i74 | i75) << 1) - (i75 ^ i74);
            f52780w0 = i76 % 128;
            if (i76 % 2 == 0) {
                int i77 = 6 / 0;
            }
        } else if (obj != null) {
            aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
            aih aihVar8 = new aih();
            adp adpVar = (adp) adp.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode.setX(0)}, -837021952, 837021958, (int) System.currentTimeMillis());
            aihVar8.f52781r0 = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar}, -910726606, 910726613, System.identityHashCode(adpVar))).intValue();
            if (compoundDrawableTintBlendMode.setX(1) instanceof adp) {
                adp adpVar2 = (adp) compoundDrawableTintBlendMode.setX(1);
                aihVar8.f52782s0 = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar2}, -910726606, 910726613, System.identityHashCode(adpVar2))).intValue();
            } else {
                if (!(compoundDrawableTintBlendMode.setX(1) instanceof aed)) {
                    throw new IllegalArgumentException("object parse error");
                }
                aed aedVar = (aed) aed.setY(new Object[]{compoundDrawableTintBlendMode.setX(1)}, 691787085, -691787084, (int) System.currentTimeMillis());
                adp adpVar3 = (adp) adp.setOnFocusChangeListener(new Object[]{aedVar.setX(0)}, -837021952, 837021958, (int) System.currentTimeMillis());
                aihVar8.f52782s0 = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar3}, -910726606, 910726613, System.identityHashCode(adpVar3))).intValue();
                adp adpVar4 = (adp) adp.setOnFocusChangeListener(new Object[]{aedVar.setX(1)}, -837021952, 837021958, (int) System.currentTimeMillis());
                aihVar8.f52783t0 = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar4}, -910726606, 910726613, System.identityHashCode(adpVar4))).intValue();
                adp adpVar5 = (adp) adp.setOnFocusChangeListener(new Object[]{aedVar.setX(2)}, -837021952, 837021958, (int) System.currentTimeMillis());
                aihVar8.f52784u0 = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar5}, -910726606, 910726613, System.identityHashCode(adpVar5))).intValue();
            }
            int i78 = v0 + 123;
            f52780w0 = i78 % 128;
            if (i78 % 2 == 0) {
                throw null;
            }
            aihVar = aihVar8;
        } else {
            int i79 = i65 ^ 95;
            int i80 = ((((i65 & 95) | i79) << 1) - (~(-i79))) - 1;
            v0 = i80 % 128;
            if (i80 % 2 != 0) {
                throw null;
            }
        }
        return aihVar;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setY(new Object[]{this}, 828024725, -828024723, System.identityHashCode(this));
    }

    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setY(new Object[]{this}, -782909305, 782909306, System.identityHashCode(this))).intValue();
    }

    public final int setDividerPadding() {
        return ((Integer) setY(new Object[]{this}, -217190719, 217190719, System.identityHashCode(this))).intValue();
    }

    public final int setOnFocusChangeListener() {
        return ((Integer) setY(new Object[]{this}, 661001106, -661001103, System.identityHashCode(this))).intValue();
    }

    public final int setX() {
        return ((Integer) setY(new Object[]{this}, -1412912864, 1412912869, System.identityHashCode(this))).intValue();
    }

    public static aih setY(Object obj) {
        return (aih) setY(new Object[]{obj}, 917412038, -917412034, (int) System.currentTimeMillis());
    }
}
