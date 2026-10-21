package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class adh {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final add[] f52466d = new add[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f52467e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f52468f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public add[] f52469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f52471c;

    static {
        int i10 = 1 ^ 65;
        int i11 = -(-((1 & 65) << 1));
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        f52467e = i12 % 128;
        int i13 = i12 % 2;
    }

    public adh(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.f52469a = i10 == 0 ? f52466d : new add[i10];
        this.f52470b = 0;
        this.f52471c = false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0066  */
    /* JADX WARN: Code duplicated, block: B:13:0x0068  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        boolean z10;
        int i13;
        int i14 = (i11 * 591) + (i10 * (-589));
        int i15 = ~i11;
        int i16 = ~i12;
        int i17 = (~(i15 | i10)) | (~(i15 | i16)) | (~(i16 | i10));
        int i18 = ~i10;
        int i19 = (((~(i18 | i16)) | (~(i11 | i16))) * 590) + (i17 * (-1180)) + (((~(i12 | i18 | i11)) | i17) * 590) + i14;
        add[] addVarArr = f52466d;
        switch (i19) {
            case 1:
                adh adhVar = (adh) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i20 = f52467e;
                int i21 = i20 & 105;
                int i22 = -(-((i20 ^ 105) | i21));
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                f52468f = i23 % 128;
                int i24 = i23 % 2;
                int i25 = iIntValue >> 1;
                add[] addVarArr2 = new add[Math.max(adhVar.f52469a.length, (((~i25) & iIntValue) | ((~iIntValue) & i25)) + ((iIntValue & i25) << 1))];
                System.arraycopy(adhVar.f52469a, 0, addVarArr2, 0, adhVar.f52470b);
                adhVar.f52469a = addVarArr2;
                adhVar.f52471c = false;
                int i26 = f52468f + 123;
                f52467e = i26 % 128;
                if (i26 % 2 == 0) {
                    return null;
                }
                throw null;
            case 2:
                adh adhVar2 = (adh) objArr[0];
                int i27 = f52468f;
                int i28 = i27 & 49;
                int i29 = ((((i27 ^ 49) | i28) << 1) - (~(-((~i28) & (i27 | 49))))) - 1;
                f52467e = i29 % 128;
                int i30 = i29 % 2;
                int i31 = adhVar2.f52470b;
                int i32 = (i27 & 57) + (i27 | 57);
                f52467e = i32 % 128;
                if (i32 % 2 == 0) {
                    return Integer.valueOf(i31);
                }
                throw null;
            case 3:
                adh adhVar3 = (adh) objArr[0];
                int i33 = f52467e;
                int i34 = (i33 & 57) + (i33 | 57);
                int i35 = i34 % 128;
                f52468f = i35;
                if (i34 % 2 == 0) {
                    int i36 = adhVar3.f52470b;
                    throw null;
                }
                int i37 = adhVar3.f52470b;
                if (i37 != 0) {
                    addVarArr = adhVar3.f52469a;
                    if (addVarArr.length != i37) {
                        add[] addVarArr3 = new add[i37];
                        System.arraycopy(addVarArr, 0, addVarArr3, 0, i37);
                        int i38 = f52467e;
                        int i39 = i38 & 13;
                        int i40 = i38 | 13;
                        int i41 = (i39 & i40) + (i40 | i39);
                        f52468f = i41 % 128;
                        if (i41 % 2 == 0) {
                            int i42 = 70 / 0;
                        }
                        addVarArr = addVarArr3;
                    } else {
                        int i43 = (i35 | 75) << 1;
                        int i44 = ~i35;
                        int i45 = -((i35 & (-76)) | (i44 & 75));
                        int i46 = ((i43 | i45) << 1) - (i43 ^ i45);
                        f52467e = i46 % 128;
                        int i47 = i46 % 2;
                        adhVar3.f52471c = true;
                        int i48 = (i35 & (-2)) | (i44 & 1);
                        int i49 = -(-((i35 & 1) << 1));
                        int i50 = ((i48 | i49) << 1) - (i48 ^ i49);
                        f52467e = i50 % 128;
                        int i51 = i50 % 2;
                    }
                } else {
                    int i52 = ((i35 & 124) + (i35 | 124)) - 1;
                    f52467e = i52 % 128;
                    int i53 = i52 % 2;
                    int i54 = i35 & 115;
                    int i55 = (((i35 ^ 115) | i54) << 1) - ((i35 | 115) & (~i54));
                    f52467e = i55 % 128;
                    if (i55 % 2 != 0) {
                        int i56 = 54 / 0;
                    }
                }
                break;
                break;
            case 4:
                adh adhVar4 = (adh) objArr[0];
                add addVar = (add) objArr[1];
                int i57 = f52467e;
                int i58 = i57 & 105;
                int i59 = (i57 ^ 105) | i58;
                int i60 = ((i58 | i59) << 1) - (i58 ^ i59);
                int i61 = i60 % 128;
                f52468f = i61;
                int i62 = i60 % 2;
                if (addVar == null) {
                    throw new NullPointerException("'element' cannot be null");
                }
                int length = adhVar4.f52469a.length;
                int i63 = adhVar4.f52470b;
                int i64 = (i63 & (-2)) | ((~i63) & 1);
                int i65 = -(-((i63 & 1) << 1));
                int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
                if (i66 > length) {
                    int i67 = (i57 ^ 59) + ((i57 & 59) << 1);
                    f52468f = i67 % 128;
                    int i68 = i67 % 2;
                    z10 = true;
                } else {
                    int i69 = i61 & 19;
                    int i70 = i61 | 19;
                    int i71 = (i69 ^ i70) + ((i69 & i70) << 1);
                    f52467e = i71 % 128;
                    int i72 = i71 % 2;
                    z10 = false;
                }
                boolean z11 = adhVar4.f52471c;
                if ((z10 & z11) | (z10 ^ z11)) {
                    int i73 = f52468f;
                    int i74 = (-2) - (((i73 & 40) + (i73 | 40)) ^ (-1));
                    f52467e = i74 % 128;
                    int i75 = i74 % 2;
                    setCompoundDrawableTintBlendMode(new Object[]{adhVar4, Integer.valueOf(i66)}, -1036009494, 1036009495, i66);
                    int i76 = f52467e;
                    int i77 = ((((i76 ^ 95) | (i76 & 95)) << 1) - (~(-(((~i76) & 95) | (i76 & (-96)))))) - 1;
                    f52468f = i77 % 128;
                    int i78 = i77 % 2;
                }
                adhVar4.f52469a[adhVar4.f52470b] = addVar;
                adhVar4.f52470b = i66;
                int i79 = f52468f;
                int i80 = i79 ^ 97;
                int i81 = ((((i79 & 97) | i80) << 1) - (~(-i80))) - 1;
                f52467e = i81 % 128;
                if (i81 % 2 == 0) {
                    return null;
                }
                throw null;
            case 5:
                add[] addVarArr4 = (add[]) objArr[0];
                int i82 = f52467e;
                int i83 = ~i82;
                int i84 = (i82 & (-32)) | (i83 & 31);
                int i85 = (i82 & 31) << 1;
                int i86 = (i84 & i85) + (i84 | i85);
                f52468f = i86 % 128;
                if (i86 % 2 == 0) {
                    int length2 = addVarArr4.length;
                    throw null;
                }
                if (addVarArr4.length > 0) {
                    addVarArr = (add[]) addVarArr4.clone();
                    int i87 = f52468f;
                    int i88 = i87 ^ 15;
                    int i89 = ((i87 & 15) | i88) << 1;
                    int i90 = -i88;
                    int i91 = (i89 & i90) + (i89 | i90);
                    f52467e = i91 % 128;
                    if (i91 % 2 != 0) {
                        int i92 = 0 / 0;
                    }
                } else {
                    int i93 = i82 + 104;
                    int i94 = (i93 ^ (-1)) + (i93 << 1);
                    f52468f = i94 % 128;
                    int i95 = i94 % 2;
                    int i96 = ((i82 & (-66)) | (65 & i83)) + ((i82 & 65) << 1);
                    f52468f = i96 % 128;
                    if (i96 % 2 == 0) {
                        int i97 = 2 / 0;
                    }
                }
                break;
                break;
            case 6:
                adh adhVar5 = (adh) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i98 = f52467e;
                int i99 = (i98 | 7) << 1;
                int i100 = ~i98;
                int i101 = -((i98 & (-8)) | (7 & i100));
                int i102 = ((i99 | i101) << 1) - (i99 ^ i101);
                f52468f = i102 % 128;
                if (i102 % 2 == 0) {
                    int i103 = adhVar5.f52470b;
                    throw null;
                }
                if (iIntValue2 >= adhVar5.f52470b) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iIntValue2);
                    sb2.append(" >= ");
                    sb2.append(adhVar5.f52470b);
                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                }
                add addVar2 = adhVar5.f52469a[iIntValue2];
                int i104 = (i98 & (-118)) | (117 & i100);
                int i105 = -(-((i98 & 117) << 1));
                int i106 = (i104 & i105) + (i104 | i105);
                f52468f = i106 % 128;
                if (i106 % 2 != 0) {
                    return addVar2;
                }
                throw null;
            default:
                adh adhVar6 = (adh) objArr[0];
                int i107 = f52467e;
                int i108 = i107 + 66;
                int i109 = (i108 ^ (-1)) + (i108 << 1);
                f52468f = i109 % 128;
                int i110 = i109 % 2;
                int i111 = adhVar6.f52470b;
                if (i110 == 0) {
                    int i112 = 76 / 0;
                    if (i111 != 0) {
                        int i113 = adhVar6.f52470b;
                        addVarArr = new add[i113];
                        System.arraycopy(adhVar6.f52469a, 0, addVarArr, 0, i113);
                        int i114 = f52467e;
                        int i115 = ((i114 | 73) << 1) - (i114 ^ 73);
                        f52468f = i115 % 128;
                        int i116 = i115 % 2;
                    } else {
                        int i117 = ((i107 ^ 107) | (i107 & 107)) << 1;
                        int i118 = -(((~i107) & 107) | (i107 & (-108)));
                        i13 = ((i117 | i118) << 1) - (i117 ^ i118);
                        f52468f = i13 % 128;
                        if (i13 % 2 == 0) {
                            int i119 = 57 / 0;
                        }
                    }
                } else if (i111 != 0) {
                    int i1110 = adhVar6.f52470b;
                    addVarArr = new add[i1110];
                    System.arraycopy(adhVar6.f52469a, 0, addVarArr, 0, i1110);
                    int i1111 = f52467e;
                    int i1112 = ((i1111 | 73) << 1) - (i1111 ^ 73);
                    f52468f = i1112 % 128;
                    int i1113 = i1112 % 2;
                } else {
                    int i1114 = ((i107 ^ 107) | (i107 & 107)) << 1;
                    int i1115 = -(((~i107) & 107) | (i107 & (-108)));
                    i13 = ((i1114 | i1115) << 1) - (i1114 ^ i1115);
                    f52468f = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i1116 = 57 / 0;
                    }
                }
                break;
        }
        return addVarArr;
    }

    public final add setX(int i10) {
        return (add) setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10)}, 2076264086, -2076264080, i10);
    }

    public final int setY() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -186238093, 186238095, System.identityHashCode(this))).intValue();
    }

    public adh() {
        this(10);
    }

    public final void setY(add addVar) {
        setCompoundDrawableTintBlendMode(new Object[]{this, addVar}, 240298319, -240298315, System.identityHashCode(this));
    }
}
