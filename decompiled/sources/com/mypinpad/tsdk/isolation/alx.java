package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class alx extends all implements alf {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53106h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f53107i = 1;

    public alx() {
        this(128);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x023e  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        akl aklVarA;
        int i13 = ~i10;
        int i14 = (((~(i13 | i11)) | (~(i13 | i12))) * (-566)) + (i11 * (-565)) + (i10 * 567);
        int i15 = ~i11;
        switch (((~(i15 | i13 | i12)) * 566) + ((~(i10 | i15)) * 566) + i14) {
            case 1:
                alx alxVar = (alx) objArr[0];
                int i16 = f53107i;
                int i17 = i16 ^ 63;
                int i18 = (i16 & 63) << 1;
                int i19 = (i17 & i18) + (i18 | i17);
                f53106h = i19 % 128;
                if (i19 % 2 != 0) {
                    aklVarA = y0.a(new Object[]{alxVar, alxVar.setOnFocusChangeListener}, -295614129, 295614130, (int) System.currentTimeMillis());
                    int i20 = 21 / 0;
                } else {
                    aklVarA = y0.a(new Object[]{alxVar, alxVar.setOnFocusChangeListener}, -295614129, 295614130, (int) System.currentTimeMillis());
                }
                int i21 = f53106h;
                int i22 = i21 & 57;
                int i23 = ((i21 | 57) & (~i22)) + (i22 << 1);
                f53107i = i23 % 128;
                if (i23 % 2 != 0) {
                    return aklVarA;
                }
                throw null;
            case 2:
                alx alxVar2 = (alx) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int iIntValue2 = ((Number) objArr[3]).intValue();
                int i24 = ~iIntValue;
                int i25 = ((-1076855473) & i24) | (1076855472 & iIntValue);
                int i26 = (-1076855473) & iIntValue;
                int i27 = (i25 & i26) | (i25 ^ i26);
                int i28 = ~i27;
                int i29 = (i27 | i28) & i28;
                int i30 = (-247241524) ^ i29;
                int i31 = i29 & (-247241524);
                int i32 = ((i31 & i30) | (i30 ^ i31)) * 262;
                int i33 = (2002019196 | i32) << 1;
                int i34 = -(i32 ^ 2002019196);
                int i35 = (i33 & i34) + (i34 | i33);
                int i36 = i35 & 1992849152;
                int i37 = i36 + ((1992849152 ^ i35) | i36);
                int i38 = i24 & (i24 | iIntValue);
                int i39 = (-1076855473) & i38;
                int i40 = (i38 | (-1076855473)) & (~i39);
                int i41 = ~((i40 & i39) | (i40 ^ i39));
                int i42 = i41 & (-1321180084);
                int i43 = (i41 | (-1321180084)) & (~i42);
                int i44 = (i43 & i42) | (i43 ^ i42);
                int i45 = ((-1073938561) & i44) | ((~i44) & 1073938560);
                int i46 = i44 & 1073938560;
                int i47 = -(~(-(-(((i46 & i45) | (i45 ^ i46)) * 262))));
                if (-376485520 > ((i37 ^ i47) + ((i47 & i37) << 1)) - 1) {
                    int i48 = 92 / 0;
                    if (!alxVar2.setCompoundDrawableTintBlendMode) {
                        alxVar2.setX(15, 4);
                        int i49 = f53107i + 37;
                        f53106h = i49 % 128;
                        int i50 = i49 % 2;
                    }
                } else if (!alxVar2.setCompoundDrawableTintBlendMode) {
                    alxVar2.setX(15, 4);
                    int i410 = f53107i + 37;
                    f53106h = i410 % 128;
                    int i51 = i410 % 2;
                }
                alxVar2.setDividerPadding(bArr, iIntValue, ((long) iIntValue2) << 3);
                int i52 = f53107i + 32;
                int i53 = (i52 ^ (-1)) + (i52 << 1);
                f53106h = i53 % 128;
                if (i53 % 2 != 0) {
                    int i54 = 5 / 0;
                }
                return Integer.valueOf(iIntValue2);
            case 3:
                alx alxVar3 = (alx) objArr[0];
                StringBuilder sb2 = new StringBuilder("SHAKE");
                sb2.append(alxVar3.setDividerPadding);
                String string = sb2.toString();
                int i55 = f53107i;
                int i56 = (i55 & 19) + (i55 | 19);
                f53106h = i56 % 128;
                int i57 = i56 % 2;
                return string;
            case 4:
                alx alxVar4 = (alx) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int iIntValue3 = ((Number) objArr[2]).intValue();
                int i58 = f53106h;
                int i59 = i58 & 119;
                int i60 = ((i58 ^ 119) | i59) << 1;
                int i61 = -((i58 | 119) & (~i59));
                int i62 = (i60 & i61) + (i61 | i60);
                f53107i = i62 % 128;
                if (i62 % 2 == 0) {
                    ((Integer) setOnFocusChangeListener(new Object[]{alxVar4, bArr2, Integer.valueOf(iIntValue3), Integer.valueOf(alxVar4.setY())}, -828464298, 828464303, iIntValue3)).intValue();
                    throw null;
                }
                int iIntValue4 = ((Integer) setOnFocusChangeListener(new Object[]{alxVar4, bArr2, Integer.valueOf(iIntValue3), Integer.valueOf(alxVar4.setY())}, -828464298, 828464303, iIntValue3)).intValue();
                int i63 = f53107i;
                int i64 = (i63 ^ 61) + ((i63 & 61) << 1);
                f53106h = i64 % 128;
                if (i64 % 2 != 0) {
                    int i65 = 28 / 0;
                }
                return Integer.valueOf(iIntValue4);
            case 5:
                alx alxVar5 = (alx) objArr[0];
                byte[] bArr3 = (byte[]) objArr[1];
                int iIntValue5 = ((Number) objArr[2]).intValue();
                int iIntValue6 = ((Number) objArr[3]).intValue();
                int i66 = f53106h;
                int i67 = i66 & 93;
                int i68 = (i66 ^ 93) | i67;
                int i69 = (i67 & i68) + (i68 | i67);
                f53107i = i69 % 128;
                int i70 = i69 % 2;
                int iIntValue7 = ((Integer) setOnFocusChangeListener(new Object[]{alxVar5, bArr3, Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue6)}, -111909461, 111909463, iIntValue5)).intValue();
                alxVar5.setOnFocusChangeListener();
                int i71 = f53106h;
                int i72 = ((i71 | 29) << 1) - (i71 ^ 29);
                f53107i = i72 % 128;
                if (i72 % 2 != 0) {
                    return Integer.valueOf(iIntValue7);
                }
                throw null;
            case 6:
                int iIntValue8 = ((Number) objArr[0]).intValue();
                int i73 = f53106h;
                int i74 = (-2) - ((((i73 | 102) << 1) - (i73 ^ 102)) ^ (-1));
                f53107i = i74 % 128;
                if (i74 % 2 == 0) {
                    throw null;
                }
                if (iIntValue8 != 128 && iIntValue8 != 256) {
                    StringBuilder sb3 = new StringBuilder("'bitStrength' ");
                    sb3.append(iIntValue8);
                    sb3.append(" not supported for SHAKE");
                    throw new IllegalArgumentException(sb3.toString());
                }
                int i75 = i73 ^ 55;
                int i76 = (i73 & 55) << 1;
                int i77 = (i75 & i76) + (i76 | i75);
                f53107i = i77 % 128;
                if (i77 % 2 != 0) {
                    return Integer.valueOf(iIntValue8);
                }
                throw null;
            default:
                alx alxVar6 = (alx) objArr[0];
                int i78 = f53107i;
                int i79 = i78 & 101;
                int i80 = (i79 - (~((i78 ^ 101) | i79))) - 1;
                int i81 = i80 % 128;
                f53106h = i81;
                int i82 = i80 % 2;
                int i83 = alxVar6.setDividerPadding / 4;
                int i84 = i81 + 27;
                f53107i = i84 % 128;
                if (i84 % 2 == 0) {
                    int i85 = 25 / 0;
                }
                return Integer.valueOf(i83);
        }
    }

    @Override // com.mypinpad.tsdk.isolation.all
    public final akl setCompoundDrawableTintBlendMode() {
        return (akl) setOnFocusChangeListener(new Object[]{this}, -12530555, 12530556, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.alf
    public final int setDividerPadding(byte[] bArr, int i10, int i11) {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, -828464298, 828464303, i10)).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.all, com.mypinpad.tsdk.isolation.aky
    public final String setX() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -1991850131, 1991850134, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.all, com.mypinpad.tsdk.isolation.aky
    public final int setY() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -1552759841, 1552759841, System.identityHashCode(this))).intValue();
    }

    public alx(int i10) {
        super(((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10)}, 111699403, -111699397, i10)).intValue(), akp.getNavBarTitleString);
    }

    @Override // com.mypinpad.tsdk.isolation.all, com.mypinpad.tsdk.isolation.aky
    public final int setCompoundDrawableTintBlendMode(byte[] bArr, int i10) {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, bArr, Integer.valueOf(i10)}, 455418286, -455418282, i10)).intValue();
    }
}
