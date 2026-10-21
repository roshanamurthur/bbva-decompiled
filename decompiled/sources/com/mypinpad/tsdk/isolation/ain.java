package com.mypinpad.tsdk.isolation;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes10.dex */
public final class ain extends adw implements adg {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final aiq f52796w0 = aio.setY;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f52797x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f52798y0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f52799r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f52800s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public aiq f52801t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public aim[] f52802u0;
    public afv v0;

    static {
        int i10 = f52798y0 + 89;
        f52797x0 = i10 % 128;
        int i11 = i10 % 2;
    }

    public ain(aiq aiqVar, aed aedVar) {
        this.f52801t0 = aiqVar;
        this.f52802u0 = new aim[aedVar.setCompoundDrawableTintBlendMode()];
        Enumeration dividerPadding = aedVar.setDividerPadding();
        boolean z10 = true;
        int i10 = 0;
        while (dividerPadding.hasMoreElements()) {
            Object objNextElement = dividerPadding.nextElement();
            aim aimVar = (aim) aim.setCompoundDrawableTintBlendMode(new Object[]{objNextElement}, -1233003478, 1233003480, (int) System.currentTimeMillis());
            z10 &= aimVar == objNextElement;
            this.f52802u0[i10] = aimVar;
            i10 = (i10 ^ 1) + ((i10 & 1) << 1);
        }
        this.v0 = z10 ? (afv) afv.setDividerPadding(new Object[]{aedVar}, -1887470030, 1887470036, (int) System.currentTimeMillis()) : new afv(this.f52802u0);
    }

    public static ain setCompoundDrawableTintBlendMode(Object obj) {
        return (ain) setX(new Object[]{obj}, -1785046337, 1785046344, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0315 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0317  */
    /* JADX WARN: Code duplicated, block: B:104:0x0330  */
    /* JADX WARN: Code duplicated, block: B:105:0x0331  */
    /* JADX WARN: Code duplicated, block: B:107:0x0341  */
    /* JADX WARN: Code duplicated, block: B:109:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:10:0x004a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0058  */
    /* JADX WARN: Code duplicated, block: B:17:0x0073  */
    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x008c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0099  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:39:0x0107  */
    /* JADX WARN: Code duplicated, block: B:44:0x0138  */
    /* JADX WARN: Code duplicated, block: B:45:0x013e  */
    /* JADX WARN: Code duplicated, block: B:96:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:99:0x0314  */
    public static Object setX(Object[] objArr, int i10, int i11, int i12) {
        ain ainVar;
        int i13;
        int i14;
        int i15;
        String dividerPadding;
        boolean z10;
        int i16;
        ady adyVarUiMessageCallbackKtWhenMappings;
        ady adyVarUiMessageCallbackKtWhenMappings2;
        boolean y7;
        int i17;
        int i18;
        boolean z11;
        int i19;
        int i20;
        int i21;
        int i22 = (i11 * (-978)) + (i10 * 980);
        int i23 = ~i11;
        int i24 = ~i12;
        int i25 = (((~(i10 | i24)) | (~(i23 | i12))) * 979) + ((i10 | i12) * (-979)) + ((~(i23 | i24)) * 979) + i22;
        ain ainVar2 = null;
        switch (i25) {
            case 1:
                aiq aiqVar = (aiq) objArr[0];
                Object obj = objArr[1];
                int i26 = f52797x0;
                int i27 = i26 + 73;
                f52798y0 = i27 % 128;
                if (i27 % 2 != 0) {
                    if (obj instanceof ain) {
                        ain ainVar3 = (ain) obj;
                        ainVar = new ain();
                        ainVar.f52801t0 = aiqVar;
                        ainVar.f52802u0 = ainVar3.f52802u0;
                        ainVar.v0 = ainVar3.v0;
                        int i28 = f52798y0;
                        int i29 = (i28 & (-110)) | ((~i28) & 109);
                        int i30 = -(-((i28 & 109) << 1));
                        i13 = ((i29 | i30) << 1) - (i30 ^ i29);
                        f52797x0 = i13 % 128;
                        if (i13 % 2 != 0) {
                            throw null;
                        }
                    } else if (obj != null) {
                        int i31 = i26 & 55;
                        int i32 = (i26 ^ 55) | i31;
                        i14 = (i31 & i32) + (i31 | i32);
                        f52798y0 = i14 % 128;
                        if (i14 % 2 == 0) {
                            int i33 = 20 / 0;
                        }
                    } else {
                        ainVar = new ain(aiqVar, aed.setCompoundDrawableTintBlendMode(obj));
                        int i34 = f52797x0;
                        i15 = (i34 ^ 41) + ((i34 & 41) << 1);
                        f52798y0 = i15 % 128;
                        if (i15 % 2 == 0) {
                            throw null;
                        }
                    }
                    ainVar2 = ainVar;
                } else {
                    int i35 = 83 / 0;
                    if (obj instanceof ain) {
                        ain ainVar4 = (ain) obj;
                        ainVar = new ain();
                        ainVar.f52801t0 = aiqVar;
                        ainVar.f52802u0 = ainVar4.f52802u0;
                        ainVar.v0 = ainVar4.v0;
                        int i210 = f52798y0;
                        int i211 = (i210 & (-110)) | ((~i210) & 109);
                        int i36 = -(-((i210 & 109) << 1));
                        i13 = ((i211 | i36) << 1) - (i36 ^ i211);
                        f52797x0 = i13 % 128;
                        if (i13 % 2 != 0) {
                            throw null;
                        }
                    } else if (obj != null) {
                        int i37 = i26 & 55;
                        int i38 = (i26 ^ 55) | i37;
                        i14 = (i37 & i38) + (i37 | i38);
                        f52798y0 = i14 % 128;
                        if (i14 % 2 == 0) {
                            int i39 = 20 / 0;
                        }
                    } else {
                        ainVar = new ain(aiqVar, aed.setCompoundDrawableTintBlendMode(obj));
                        int i310 = f52797x0;
                        i15 = (i310 ^ 41) + ((i310 & 41) << 1);
                        f52798y0 = i15 % 128;
                        if (i15 % 2 == 0) {
                            throw null;
                        }
                    }
                    ainVar2 = ainVar;
                }
                break;
            case 2:
                ain ainVar5 = (ain) objArr[0];
                int i40 = f52798y0;
                int i41 = i40 & 3;
                int i42 = ((i40 | 3) & (~i41)) + (i41 << 1);
                int i43 = i42 % 128;
                f52797x0 = i43;
                if (i42 % 2 != 0) {
                    boolean z12 = ainVar5.f52799r0;
                    throw null;
                }
                if (ainVar5.f52799r0) {
                    int i44 = i43 + 103;
                    f52798y0 = i44 % 128;
                    int i45 = i44 % 2;
                    int i46 = ainVar5.f52800s0;
                    int i47 = ((i43 ^ 77) - (~((i43 & 77) << 1))) - 1;
                    f52798y0 = i47 % 128;
                    int i48 = i47 % 2;
                    return Integer.valueOf(i46);
                }
                ainVar5.f52799r0 = true;
                int y10 = ainVar5.f52801t0.setY(ainVar5);
                ainVar5.f52800s0 = y10;
                int i49 = f52798y0;
                int i50 = i49 & 69;
                int i51 = (i50 - (~((i49 ^ 69) | i50))) - 1;
                f52797x0 = i51 % 128;
                if (i51 % 2 == 0) {
                    return Integer.valueOf(y10);
                }
                throw null;
            case 3:
                aeh aehVar = (aeh) objArr[0];
                int i52 = f52797x0;
                int i53 = i52 & 107;
                int i54 = -(-((i52 ^ 107) | i53));
                int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
                f52798y0 = i55 % 128;
                int i56 = i55 % 2;
                ain ainVar6 = (ain) setX(new Object[]{(aed) aed.setY(new Object[]{aehVar, Boolean.TRUE}, 113370947, -113370947, (int) System.currentTimeMillis())}, -1785046337, 1785046344, (int) System.currentTimeMillis());
                int i57 = f52798y0;
                int i58 = (i57 & (-114)) | ((~i57) & 113);
                int i59 = (i57 & 113) << 1;
                int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                f52797x0 = i60 % 128;
                int i61 = i60 % 2;
                return ainVar6;
            case 4:
                ain ainVar7 = (ain) objArr[0];
                int i62 = f52797x0 + 93;
                f52798y0 = i62 % 128;
                if (i62 % 2 == 0) {
                    dividerPadding = ainVar7.f52801t0.setDividerPadding(ainVar7);
                    int i63 = 73 / 0;
                } else {
                    dividerPadding = ainVar7.f52801t0.setDividerPadding(ainVar7);
                }
                int i64 = f52797x0;
                int i65 = (i64 ^ 37) + ((i64 & 37) << 1);
                f52798y0 = i65 % 128;
                int i66 = i65 % 2;
                return dividerPadding;
            case 5:
                ain ainVar8 = (ain) objArr[0];
                int i67 = f52798y0;
                int i68 = i67 & 9;
                int i69 = (i67 | 9) & (~i68);
                int i70 = i68 << 1;
                int i71 = ((i69 | i70) << 1) - (i69 ^ i70);
                int i72 = i71 % 128;
                f52797x0 = i72;
                int i73 = i71 % 2;
                afv afvVar = ainVar8.v0;
                if (i73 != 0) {
                    int i74 = 2 / 0;
                }
                int i75 = i72 + 121;
                f52798y0 = i75 % 128;
                if (i75 % 2 != 0) {
                    return afvVar;
                }
                throw null;
            case 6:
                ain ainVar9 = (ain) objArr[0];
                int i76 = f52798y0;
                int i77 = (i76 & 15) + (i76 | 15);
                f52797x0 = i77 % 128;
                int i78 = i77 % 2;
                aim[] aimVarArr = (aim[]) ainVar9.f52802u0.clone();
                int i79 = f52797x0 + 51;
                f52798y0 = i79 % 128;
                int i80 = i79 % 2;
                return aimVarArr;
            case 7:
                Object obj2 = objArr[0];
                int i81 = f52797x0;
                int i82 = i81 & 17;
                int i83 = (i82 - (~((i81 ^ 17) | i82))) - 1;
                f52798y0 = i83 % 128;
                if (i83 % 2 == 0) {
                    boolean z13 = obj2 instanceof ain;
                    throw null;
                }
                if (!(!(obj2 instanceof ain))) {
                    int i84 = ((i81 ^ 20) + ((i81 & 20) << 1)) - 1;
                    f52798y0 = i84 % 128;
                    if (i84 % 2 == 0) {
                        throw null;
                    }
                    ainVar2 = (ain) obj2;
                } else if (obj2 != null) {
                    ainVar2 = new ain(aed.setCompoundDrawableTintBlendMode(obj2));
                    int i85 = f52798y0 + 43;
                    f52797x0 = i85 % 128;
                    int i86 = i85 % 2;
                } else {
                    int i87 = i81 & 3;
                    int i88 = (i81 ^ 3) | i87;
                    int i89 = (i87 ^ i88) + ((i87 & i88) << 1);
                    f52798y0 = i89 % 128;
                    if (i89 % 2 == 0) {
                        throw null;
                    }
                }
                break;
                break;
            default:
                ain ainVar10 = (ain) objArr[0];
                Object obj3 = objArr[1];
                int i90 = f52797x0;
                int i91 = i90 & 75;
                int i92 = (~i91) & (i90 | 75);
                int i93 = i91 << 1;
                int i94 = (i92 ^ i93) + ((i93 & i92) << 1);
                int i95 = i94 % 128;
                f52798y0 = i95;
                if (i94 % 2 == 0) {
                    int i96 = 18 / 0;
                    if (obj3 != ainVar10) {
                        if (!(obj3 instanceof ain)) {
                            i20 = ((i95 & 49) - (~(i95 | 49))) - 1;
                            i21 = i20 % 128;
                            f52797x0 = i21;
                            if (i20 % 2 == 0) {
                                boolean z14 = obj3 instanceof aed;
                                throw null;
                            }
                            if (!(obj3 instanceof aed)) {
                                int i97 = (i21 ^ 87) + ((i21 & 87) << 1);
                                f52798y0 = i97 % 128;
                                z10 = i97 % 2 == 0;
                                int i98 = i21 & 109;
                                int i99 = (~i98) & (i21 | 109);
                                int i100 = -(-(i98 << 1));
                                int i101 = (i99 & i100) + (i100 | i99);
                                f52798y0 = i101 % 128;
                                int i102 = i101 % 2;
                            }
                        }
                        adyVarUiMessageCallbackKtWhenMappings = ((add) obj3).UiMessageCallbackKtWhenMappings();
                        adyVarUiMessageCallbackKtWhenMappings2 = ainVar10.UiMessageCallbackKtWhenMappings();
                        if (((Boolean) ady.setNavigationOnClickListener(new Object[]{adyVarUiMessageCallbackKtWhenMappings2, adyVarUiMessageCallbackKtWhenMappings}, -109201153, 109201153, System.identityHashCode(adyVarUiMessageCallbackKtWhenMappings2))).booleanValue()) {
                            try {
                                y7 = ainVar10.f52801t0.setY(ainVar10, new ain(aed.setCompoundDrawableTintBlendMode((Object) ((add) obj3).UiMessageCallbackKtWhenMappings())));
                                int i103 = f52797x0;
                                int i104 = i103 & 121;
                                int i105 = (i103 ^ 121) | i104;
                                i17 = (i104 ^ i105) + ((i105 & i104) << 1);
                                f52798y0 = i17 % 128;
                                if (i17 % 2 != 0) {
                                    return Boolean.valueOf(y7);
                                }
                                throw null;
                            } catch (Exception unused) {
                                return Boolean.FALSE;
                            }
                        }
                        int i106 = f52798y0;
                        int i107 = ~i106;
                        int i108 = (i106 & (-54)) | (i107 & 53);
                        int i109 = -(-((i106 & 53) << 1));
                        i18 = ((i108 | i109) << 1) - (i108 ^ i109);
                        f52797x0 = i18 % 128;
                        if (i18 % 2 != 0) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        int i110 = (i107 & 99) | (i106 & (-100));
                        int i111 = (i106 & 99) << 1;
                        i19 = ((i110 | i111) << 1) - (i111 ^ i110);
                        f52797x0 = i19 % 128;
                        if (i19 % 2 != 0) {
                            int i112 = 52 / 0;
                        }
                        return Boolean.valueOf(z11);
                    }
                    int i113 = (i90 ^ 65) + ((i90 & 65) << 1);
                    f52798y0 = i113 % 128;
                    z10 = i113 % 2 != 0;
                    i16 = (((i90 & (-56)) | ((~i90) & 55)) - (~(-(-((i90 & 55) << 1))))) - 1;
                    f52798y0 = i16 % 128;
                    if (i16 % 2 == 0) {
                        throw null;
                    }
                } else {
                    if (obj3 != ainVar10) {
                        if (!(obj3 instanceof ain)) {
                            i20 = ((i95 & 49) - (~(i95 | 49))) - 1;
                            i21 = i20 % 128;
                            f52797x0 = i21;
                            if (i20 % 2 == 0) {
                                boolean z15 = obj3 instanceof aed;
                                throw null;
                            }
                            if (!(obj3 instanceof aed)) {
                                int i910 = (i21 ^ 87) + ((i21 & 87) << 1);
                                f52798y0 = i910 % 128;
                                if (i910 % 2 == 0) {
                                }
                                int i911 = i21 & 109;
                                int i912 = (~i911) & (i21 | 109);
                                int i1010 = -(-(i911 << 1));
                                int i1011 = (i912 & i1010) + (i1010 | i912);
                                f52798y0 = i1011 % 128;
                                int i1012 = i1011 % 2;
                            }
                        }
                        adyVarUiMessageCallbackKtWhenMappings = ((add) obj3).UiMessageCallbackKtWhenMappings();
                        adyVarUiMessageCallbackKtWhenMappings2 = ainVar10.UiMessageCallbackKtWhenMappings();
                        if (((Boolean) ady.setNavigationOnClickListener(new Object[]{adyVarUiMessageCallbackKtWhenMappings2, adyVarUiMessageCallbackKtWhenMappings}, -109201153, 109201153, System.identityHashCode(adyVarUiMessageCallbackKtWhenMappings2))).booleanValue()) {
                            y7 = ainVar10.f52801t0.setY(ainVar10, new ain(aed.setCompoundDrawableTintBlendMode((Object) ((add) obj3).UiMessageCallbackKtWhenMappings())));
                            int i1013 = f52797x0;
                            int i1014 = i1013 & 121;
                            int i1015 = (i1013 ^ 121) | i1014;
                            i17 = (i1014 ^ i1015) + ((i1015 & i1014) << 1);
                            f52798y0 = i17 % 128;
                            if (i17 % 2 != 0) {
                                return Boolean.valueOf(y7);
                            }
                            throw null;
                        }
                        int i1016 = f52798y0;
                        int i1017 = ~i1016;
                        int i1018 = (i1016 & (-54)) | (i1017 & 53);
                        int i1019 = -(-((i1016 & 53) << 1));
                        i18 = ((i1018 | i1019) << 1) - (i1018 ^ i1019);
                        f52797x0 = i18 % 128;
                        if (i18 % 2 != 0) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        int i114 = (i1017 & 99) | (i1016 & (-100));
                        int i115 = (i1016 & 99) << 1;
                        i19 = ((i114 | i115) << 1) - (i115 ^ i114);
                        f52797x0 = i19 % 128;
                        if (i19 % 2 != 0) {
                            int i116 = 52 / 0;
                        }
                        return Boolean.valueOf(z11);
                    }
                    int i117 = (i90 ^ 65) + ((i90 & 65) << 1);
                    f52798y0 = i117 % 128;
                    if (i117 % 2 != 0) {
                    }
                    i16 = (((i90 & (-56)) | ((~i90) & 55)) - (~(-(-((i90 & 55) << 1))))) - 1;
                    f52798y0 = i16 % 128;
                    if (i16 % 2 == 0) {
                        throw null;
                    }
                }
                return Boolean.valueOf(z10);
        }
        return ainVar2;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setX(new Object[]{this}, 1057545879, -1057545874, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public final boolean equals(Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, -1971444126, 1971444126, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, -1766269234, 1766269236, System.identityHashCode(this))).intValue();
    }

    public final aim[] setDividerPadding() {
        return (aim[]) setX(new Object[]{this}, -1671577030, 1671577036, System.identityHashCode(this));
    }

    public final String toString() {
        return (String) setX(new Object[]{this}, 34705292, -34705288, System.identityHashCode(this));
    }

    public ain(aed aedVar) {
        this(f52796w0, aedVar);
    }

    public static ain setX(aiq aiqVar, Object obj) {
        return (ain) setX(new Object[]{aiqVar, obj}, -908164263, 908164264, (int) System.currentTimeMillis());
    }

    public static ain setX(aeh aehVar) {
        return (ain) setX(new Object[]{aehVar}, 259001450, -259001447, (int) System.currentTimeMillis());
    }
}
