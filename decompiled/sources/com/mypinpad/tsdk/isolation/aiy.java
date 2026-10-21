package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class aiy extends adw {
    public static int v0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f52837w0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public aed f52838r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ajm f52839s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public aiw f52840t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public acz f52841u0;

    /* JADX WARN: Code duplicated, block: B:36:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:38:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:40:0x01fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0200  */
    /* JADX WARN: Code duplicated, block: B:43:0x0212  */
    /* JADX WARN: Code duplicated, block: B:45:0x0275  */
    /* JADX WARN: Code duplicated, block: B:46:0x0277  */
    /* JADX WARN: Code duplicated, block: B:47:0x0278  */
    /* JADX WARN: Code duplicated, block: B:49:0x0280  */
    /* JADX WARN: Code duplicated, block: B:51:0x028c  */
    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        aiy aiyVar;
        aed compoundDrawableTintBlendMode;
        int i15;
        int i16 = (i11 * 971) + (i10 * (-1939));
        int i17 = ~i11;
        int i18 = ~(i17 | i10);
        int i19 = ~((~i12) | i11);
        int i20 = ~i10;
        int i21 = (~(i11 | i20)) * 1940;
        int i22 = ((~(i20 | i17)) | i19) * 970;
        aiy aiyVar2 = null;
        switch (i22 + i21 + ((i18 | i19) * (-970)) + i16) {
            case 1:
                aiy aiyVar3 = (aiy) objArr[0];
                int i23 = v0;
                int i24 = i23 & 55;
                int i25 = -(-((i23 ^ 55) | i24));
                int i26 = (i24 & i25) + (i25 | i24);
                f52837w0 = i26 % 128;
                int i27 = i26 % 2;
                ajm ajmVar = aiyVar3.f52839s0;
                ain ainVar = (ain) ajm.setOnFocusChangeListener(new Object[]{ajmVar}, -1888906596, 1888906600, System.identityHashCode(ajmVar));
                int i28 = f52837w0;
                int i29 = ((i28 | 97) << 1) - (i28 ^ 97);
                v0 = i29 % 128;
                int i30 = i29 % 2;
                return ainVar;
            case 2:
                aiy aiyVar4 = (aiy) objArr[0];
                int i31 = v0;
                int i32 = ((i31 & 98) + (i31 | 98)) - 1;
                f52837w0 = i32 % 128;
                int i33 = i32 % 2;
                aed aedVar = aiyVar4.f52838r0;
                if (i33 != 0) {
                    return aedVar;
                }
                throw null;
            case 3:
                aiy aiyVar5 = (aiy) objArr[0];
                int i34 = v0;
                int i35 = (i34 & (-100)) | ((~i34) & 99);
                int i36 = (i34 & 99) << 1;
                int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                f52837w0 = i37 % 128;
                int i38 = i37 % 2;
                ajm ajmVar2 = aiyVar5.f52839s0;
                if (i38 == 0) {
                    ((Integer) ajm.setOnFocusChangeListener(new Object[]{ajmVar2}, 351515074, -351515064, System.identityHashCode(ajmVar2))).intValue();
                    throw null;
                }
                int iIntValue = ((Integer) ajm.setOnFocusChangeListener(new Object[]{ajmVar2}, 351515074, -351515064, System.identityHashCode(ajmVar2))).intValue();
                int i39 = v0 + 65;
                f52837w0 = i39 % 128;
                if (i39 % 2 == 0) {
                    int i40 = 40 / 0;
                }
                return Integer.valueOf(iIntValue);
            case 4:
                aiy aiyVar6 = (aiy) objArr[0];
                int i41 = f52837w0;
                int i42 = i41 & 31;
                int i43 = (i41 ^ 31) | i42;
                int i44 = (i42 & i43) + (i43 | i42);
                v0 = i44 % 128;
                int i45 = i44 % 2;
                acz aczVar = aiyVar6.f52841u0;
                if (i45 == 0) {
                    return aczVar;
                }
                throw null;
            case 5:
                Object obj = objArr[0];
                int i46 = v0;
                int i47 = ((i46 ^ 116) + ((i46 & 116) << 1)) - 1;
                int i48 = i47 % 128;
                f52837w0 = i48;
                if (i47 % 2 == 0) {
                    int i49 = 97 / 0;
                    if (obj instanceof aiy) {
                        int i50 = (i48 & (-8)) | ((~i48) & 7);
                        int i51 = (i48 & 7) << 1;
                        i13 = ((i50 | i51) << 1) - (i50 ^ i51);
                        v0 = i13 % 128;
                        aiy aiyVar7 = (aiy) obj;
                        if (i13 % 2 != 0) {
                            int i52 = 58 / 0;
                        }
                        aiyVar2 = aiyVar7;
                    } else if (obj != null) {
                        compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
                        aiyVar = new aiy();
                        aiyVar.f52838r0 = compoundDrawableTintBlendMode;
                        if (compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode() == 3) {
                            throw new IllegalArgumentException("sequence wrong size for a certificate");
                        }
                        aiyVar.f52839s0 = (ajm) ajm.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode.setX(0)}, -1192293909, 1192293912, (int) System.currentTimeMillis());
                        aiyVar.f52840t0 = (aiw) aiw.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode.setX(1)}, 866360717, -866360713, (int) System.currentTimeMillis());
                        aiyVar.f52841u0 = (acz) acz.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(2)}, 1095238957, -1095238954, (int) System.currentTimeMillis());
                        int i53 = f52837w0;
                        i15 = ((i53 & (-6)) | ((~i53) & 5)) + ((i53 & 5) << 1);
                        v0 = i15 % 128;
                        if (i15 % 2 == 0) {
                            throw null;
                        }
                        aiyVar2 = aiyVar;
                    } else {
                        i14 = (i46 & 87) + (i46 | 87);
                        f52837w0 = i14 % 128;
                        if (i14 % 2 == 0) {
                            int i54 = 15 / 0;
                        }
                    }
                } else if (obj instanceof aiy) {
                    int i55 = (i48 & (-8)) | ((~i48) & 7);
                    int i56 = (i48 & 7) << 1;
                    i13 = ((i55 | i56) << 1) - (i55 ^ i56);
                    v0 = i13 % 128;
                    aiy aiyVar8 = (aiy) obj;
                    if (i13 % 2 != 0) {
                        int i57 = 58 / 0;
                    }
                    aiyVar2 = aiyVar8;
                } else if (obj != null) {
                    compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
                    aiyVar = new aiy();
                    aiyVar.f52838r0 = compoundDrawableTintBlendMode;
                    if (compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode() == 3) {
                        throw new IllegalArgumentException("sequence wrong size for a certificate");
                    }
                    aiyVar.f52839s0 = (ajm) ajm.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode.setX(0)}, -1192293909, 1192293912, (int) System.currentTimeMillis());
                    aiyVar.f52840t0 = (aiw) aiw.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode.setX(1)}, 866360717, -866360713, (int) System.currentTimeMillis());
                    aiyVar.f52841u0 = (acz) acz.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(2)}, 1095238957, -1095238954, (int) System.currentTimeMillis());
                    int i58 = f52837w0;
                    i15 = ((i58 & (-6)) | ((~i58) & 5)) + ((i58 & 5) << 1);
                    v0 = i15 % 128;
                    if (i15 % 2 == 0) {
                        throw null;
                    }
                    aiyVar2 = aiyVar;
                } else {
                    i14 = (i46 & 87) + (i46 | 87);
                    f52837w0 = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i59 = 15 / 0;
                    }
                }
                return aiyVar2;
            case 6:
                aiy aiyVar9 = (aiy) objArr[0];
                int i60 = f52837w0;
                int i61 = i60 & 119;
                int i62 = i60 | 119;
                int i63 = (i61 & i62) + (i62 | i61);
                v0 = i63 % 128;
                int i64 = i63 % 2;
                ajm ajmVar3 = aiyVar9.f52839s0;
                ajo ajoVar = (ajo) ajm.setOnFocusChangeListener(new Object[]{ajmVar3}, 428405520, -428405512, System.identityHashCode(ajmVar3));
                int i65 = f52837w0;
                int i66 = i65 & 85;
                int i67 = -(-((i65 ^ 85) | i66));
                int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
                v0 = i68 % 128;
                int i69 = i68 % 2;
                return ajoVar;
            case 7:
                aiy aiyVar10 = (aiy) objArr[0];
                int i70 = v0;
                int i71 = ((i70 ^ 104) + ((i70 & 104) << 1)) - 1;
                int i72 = i71 % 128;
                f52837w0 = i72;
                int i73 = i71 % 2;
                aiw aiwVar = aiyVar10.f52840t0;
                if (i73 == 0) {
                    throw null;
                }
                int i74 = (i72 ^ 47) + ((i72 & 47) << 1);
                v0 = i74 % 128;
                int i75 = i74 % 2;
                return aiwVar;
            case 8:
                aiy aiyVar11 = (aiy) objArr[0];
                int i76 = v0;
                int i77 = ((i76 | 73) << 1) - (i76 ^ 73);
                int i78 = i77 % 128;
                f52837w0 = i78;
                int i79 = i77 % 2;
                ajm ajmVar4 = aiyVar11.f52839s0;
                int i80 = i78 & 109;
                int i81 = i80 + ((i78 ^ 109) | i80);
                v0 = i81 % 128;
                if (i81 % 2 == 0) {
                    return ajmVar4;
                }
                int i82 = 85 / 0;
                return ajmVar4;
            case 9:
                aiy aiyVar12 = (aiy) objArr[0];
                int i83 = f52837w0;
                int i84 = (((i83 ^ 21) | (i83 & 21)) << 1) - (((~i83) & 21) | (i83 & (-22)));
                v0 = i84 % 128;
                int i85 = i84 % 2;
                ajm ajmVar5 = aiyVar12.f52839s0;
                if (i85 == 0) {
                    return (ajj) ajm.setOnFocusChangeListener(new Object[]{ajmVar5}, -1128225074, 1128225074, System.identityHashCode(ajmVar5));
                }
                int i86 = 48 / 0;
                return (ajj) ajm.setOnFocusChangeListener(new Object[]{ajmVar5}, -1128225074, 1128225074, System.identityHashCode(ajmVar5));
            case 10:
                aiy aiyVar13 = (aiy) objArr[0];
                int i87 = v0;
                int i88 = (i87 ^ 93) + ((i87 & 93) << 1);
                f52837w0 = i88 % 128;
                int i89 = i88 % 2;
                ajm ajmVar6 = aiyVar13.f52839s0;
                if (i89 == 0) {
                    throw null;
                }
                adp adpVar = (adp) ajm.setOnFocusChangeListener(new Object[]{ajmVar6}, 126303901, -126303895, System.identityHashCode(ajmVar6));
                int i90 = f52837w0;
                int i91 = i90 & 103;
                int i92 = i91 + ((i90 ^ 103) | i91);
                v0 = i92 % 128;
                if (i92 % 2 == 0) {
                    return adpVar;
                }
                throw null;
            case 11:
                aiy aiyVar14 = (aiy) objArr[0];
                int i93 = f52837w0;
                int i94 = ((i93 & 87) - (~(i93 | 87))) - 1;
                v0 = i94 % 128;
                int i95 = i94 % 2;
                ajm ajmVar7 = aiyVar14.f52839s0;
                ain ainVar2 = (ain) ajm.setOnFocusChangeListener(new Object[]{ajmVar7}, -452619431, 452619433, System.identityHashCode(ajmVar7));
                int i96 = f52837w0;
                int i97 = i96 & 35;
                int i98 = (i97 - (~(-(-((i96 ^ 35) | i97))))) - 1;
                v0 = i98 % 128;
                if (i98 % 2 == 0) {
                    return ainVar2;
                }
                throw null;
            default:
                aiy aiyVar15 = (aiy) objArr[0];
                int i99 = f52837w0;
                int i100 = ((i99 ^ 35) | (i99 & 35)) << 1;
                int i101 = -(((~i99) & 35) | (i99 & (-36)));
                int i102 = ((i100 | i101) << 1) - (i101 ^ i100);
                v0 = i102 % 128;
                int i103 = i102 % 2;
                ajm ajmVar8 = aiyVar15.f52839s0;
                ajo ajoVar2 = (ajo) ajm.setOnFocusChangeListener(new Object[]{ajmVar8}, -1665781041, 1665781046, System.identityHashCode(ajmVar8));
                int i104 = f52837w0;
                int i105 = i104 | 27;
                int i106 = i105 << 1;
                int i107 = -((~(i104 & 27)) & i105);
                int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
                v0 = i108 % 128;
                int i109 = i108 % 2;
                return ajoVar2;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setDividerPadding(new Object[]{this}, 1459121927, -1459121925, System.identityHashCode(this));
    }

    public final ajo getNavBarTitleString() {
        return (ajo) setDividerPadding(new Object[]{this}, -664066555, 664066561, System.identityHashCode(this));
    }

    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -411877937, 411877940, System.identityHashCode(this))).intValue();
    }

    public final ain setLayoutAnimation() {
        return (ain) setDividerPadding(new Object[]{this}, 1424751201, -1424751200, System.identityHashCode(this));
    }

    public final ajj setNavigationOnClickListener() {
        return (ajj) setDividerPadding(new Object[]{this}, 639043811, -639043802, System.identityHashCode(this));
    }

    public final acz setOnDragListener() {
        return (acz) setDividerPadding(new Object[]{this}, -1548652488, 1548652492, System.identityHashCode(this));
    }

    public final adp setOnFocusChangeListener() {
        return (adp) setDividerPadding(new Object[]{this}, -1898177481, 1898177491, System.identityHashCode(this));
    }

    public final aiw setOnLongClickListener() {
        return (aiw) setDividerPadding(new Object[]{this}, -434839086, 434839093, System.identityHashCode(this));
    }

    public final ain setX() {
        return (ain) setDividerPadding(new Object[]{this}, 405204446, -405204435, System.identityHashCode(this));
    }

    public final ajo setY() {
        return (ajo) setDividerPadding(new Object[]{this}, -125844688, 125844688, System.identityHashCode(this));
    }

    public static aiy setY(Object obj) {
        return (aiy) setDividerPadding(new Object[]{obj}, 1670345764, -1670345759, (int) System.currentTimeMillis());
    }

    public final ajm setDividerPadding() {
        return (ajm) setDividerPadding(new Object[]{this}, -1226305897, 1226305905, System.identityHashCode(this));
    }
}
