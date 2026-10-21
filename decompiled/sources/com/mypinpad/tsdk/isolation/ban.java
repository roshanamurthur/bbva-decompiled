package com.mypinpad.tsdk.isolation;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class ban extends bar {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f54333j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f54334k = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f54335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f54336h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f54337i;

    public static class setCompoundDrawableTintBlendMode extends bar.setOnFocusChangeListener<setCompoundDrawableTintBlendMode> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static int f54338j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static int f54339k = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f54340g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f54341h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f54342i;

        public setCompoundDrawableTintBlendMode() {
            super(0);
            this.f54340g = 0;
            this.f54341h = 0;
            this.f54342i = 0;
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode;
            int i13 = ~i11;
            int i14 = i13 | i10;
            switch ((((~(i10 | i12)) | (~(i13 | i12)) | (~i14)) * 623) + (((~(i11 | (~i10))) | (~i12)) * (-623)) + ((~(i14 | i12)) * 623) + (i11 * (-622)) + (i10 * 624)) {
                case 1:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = (setCompoundDrawableTintBlendMode) objArr[0];
                    int i15 = f54338j;
                    int i16 = i15 & 103;
                    int i17 = ((i15 ^ 103) | i16) << 1;
                    int i18 = -((i15 | 103) & (~i16));
                    int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                    int i20 = i19 % 128;
                    f54339k = i20;
                    int i21 = i19 % 2;
                    int i22 = setcompounddrawabletintblendmode2.f54340g;
                    if (i21 == 0) {
                        int i23 = 34 / 0;
                    }
                    int i24 = i20 & 71;
                    int i25 = (i20 ^ 71) | i24;
                    int i26 = (i24 & i25) + (i25 | i24);
                    f54338j = i26 % 128;
                    int i27 = i26 % 2;
                    return Integer.valueOf(i22);
                case 2:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = (setCompoundDrawableTintBlendMode) objArr[0];
                    int iIntValue = ((Number) objArr[1]).intValue();
                    int i28 = f54339k;
                    int i29 = i28 & 117;
                    int i30 = (i29 - (~((i28 ^ 117) | i29))) - 1;
                    f54338j = i30 % 128;
                    int i31 = i30 % 2;
                    setcompounddrawabletintblendmode3.f54341h = iIntValue;
                    if (i31 == 0) {
                        return setcompounddrawabletintblendmode3;
                    }
                    throw null;
                case 3:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode4 = (setCompoundDrawableTintBlendMode) objArr[0];
                    int i32 = f54339k;
                    int i33 = i32 & 79;
                    int i34 = ((i32 | 79) & (~i33)) + (i33 << 1);
                    f54338j = i34 % 128;
                    if (i34 % 2 != 0) {
                        setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode4}, -1758669686, 1758669693, System.identityHashCode(setcompounddrawabletintblendmode4));
                        int i35 = 49 / 0;
                    } else {
                        setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode4}, -1758669686, 1758669693, System.identityHashCode(setcompounddrawabletintblendmode4));
                    }
                    return setcompounddrawabletintblendmode;
                case 4:
                    ban banVar = new ban((setCompoundDrawableTintBlendMode) objArr[0]);
                    int i36 = f54338j + 17;
                    f54339k = i36 % 128;
                    int i37 = i36 % 2;
                    return banVar;
                case 5:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode5 = (setCompoundDrawableTintBlendMode) objArr[0];
                    int i38 = f54338j;
                    int i39 = i38 & 45;
                    int i40 = (~i39) & (i38 | 45);
                    int i41 = -(-(i39 << 1));
                    int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
                    f54339k = i42 % 128;
                    int i43 = i42 % 2;
                    int i44 = setcompounddrawabletintblendmode5.f54342i;
                    if (i43 == 0) {
                        throw null;
                    }
                    int i45 = i38 + 59;
                    f54339k = i45 % 128;
                    if (i45 % 2 != 0) {
                        return Integer.valueOf(i44);
                    }
                    throw null;
                case 6:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode6 = (setCompoundDrawableTintBlendMode) objArr[0];
                    int iIntValue2 = ((Number) objArr[1]).intValue();
                    int i46 = f54339k;
                    int i47 = (-2) - ((i46 + 80) ^ (-1));
                    f54338j = i47 % 128;
                    int i48 = i47 % 2;
                    setcompounddrawabletintblendmode6.f54340g = iIntValue2;
                    int i49 = i46 & 91;
                    int i50 = -(-((i46 ^ 91) | i49));
                    int i51 = (i49 & i50) + (i49 | i50);
                    f54338j = i51 % 128;
                    int i52 = i51 % 2;
                    return setcompounddrawabletintblendmode6;
                case 7:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode7 = (setCompoundDrawableTintBlendMode) objArr[0];
                    int i53 = f54338j;
                    int i54 = (((i53 & (-120)) | ((~i53) & 119)) - (~((i53 & 119) << 1))) - 1;
                    int i55 = i54 % 128;
                    f54339k = i55;
                    int i56 = i54 % 2;
                    int i57 = ((i55 ^ 6) + ((i55 & 6) << 1)) - 1;
                    f54338j = i57 % 128;
                    int i58 = i57 % 2;
                    return setcompounddrawabletintblendmode7;
                case 8:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode8 = (setCompoundDrawableTintBlendMode) objArr[0];
                    int i59 = f54339k;
                    int i60 = ((i59 & 56) + (i59 | 56)) - 1;
                    f54338j = i60 % 128;
                    int i61 = i60 % 2;
                    int i62 = setcompounddrawabletintblendmode8.f54341h;
                    int i63 = ((i59 & 60) + (i59 | 60)) - 1;
                    f54338j = i63 % 128;
                    int i64 = i63 % 2;
                    return Integer.valueOf(i62);
                default:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode9 = (setCompoundDrawableTintBlendMode) objArr[0];
                    int iIntValue3 = ((Number) objArr[1]).intValue();
                    int i65 = f54338j;
                    int i66 = (i65 & (-56)) | ((~i65) & 55);
                    int i67 = (i65 & 55) << 1;
                    int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
                    f54339k = i68 % 128;
                    int i69 = i68 % 2;
                    setcompounddrawabletintblendmode9.f54342i = iIntValue3;
                    if (i69 != 0) {
                        return setcompounddrawabletintblendmode9;
                    }
                    throw null;
            }
        }

        @Override // com.mypinpad.tsdk.i.bar.setOnFocusChangeListener
        public final /* synthetic */ bar.setOnFocusChangeListener setCompoundDrawableTintBlendMode() {
            return (bar.setOnFocusChangeListener) setOnFocusChangeListener(new Object[]{this}, 777721723, -777721720, System.identityHashCode(this));
        }

        public final setCompoundDrawableTintBlendMode setDividerPadding(int i10) {
            return (setCompoundDrawableTintBlendMode) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10)}, 391211609, -391211603, i10);
        }

        public final setCompoundDrawableTintBlendMode setX(int i10) {
            return (setCompoundDrawableTintBlendMode) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10)}, -1717175544, 1717175544, i10);
        }

        @Override // com.mypinpad.tsdk.i.bar.setOnFocusChangeListener
        public final bar setY() {
            return (bar) setOnFocusChangeListener(new Object[]{this}, 1084061586, -1084061582, System.identityHashCode(this));
        }

        public final setCompoundDrawableTintBlendMode setY(int i10) {
            return (setCompoundDrawableTintBlendMode) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10)}, 874018780, -874018778, i10);
        }
    }

    public ban(setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode) {
        super(setcompounddrawabletintblendmode);
        this.f54335g = ((Integer) setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode}, 2000018939, -2000018938, (int) System.currentTimeMillis())).intValue();
        this.f54336h = ((Integer) setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode}, 709664912, -709664904, (int) System.currentTimeMillis())).intValue();
        this.f54337i = ((Integer) setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode}, -2015553923, 2015553928, (int) System.currentTimeMillis())).intValue();
    }

    public static /* synthetic */ Serializable a(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13 = ~i10;
        int i14 = i13 | i11;
        int i15 = (((~i14) | (~(i13 | i12)) | (~(i11 | i12))) * (-754)) + (i11 * (-753)) + (i10 * 755);
        int i16 = ~(i14 | i12);
        int i17 = ~i12;
        int i18 = ((i13 | i17) * 754) + (((~(i10 | i17 | i11)) | i16) * (-754)) + i15;
        if (i18 == 1) {
            ban banVar = (ban) objArr[0];
            int i19 = f54333j + 73;
            f54334k = i19 % 128;
            int i20 = i19 % 2;
            Object compoundDrawableTintBlendMode = super.setCompoundDrawableTintBlendMode();
            int i21 = banVar.f54335g;
            ber.setDividerPadding(new Object[]{Integer.valueOf(i21), compoundDrawableTintBlendMode, 16}, -2092293587, 2092293591, i21);
            int i22 = banVar.f54336h;
            ber.setDividerPadding(new Object[]{Integer.valueOf(i22), compoundDrawableTintBlendMode, 20}, -2092293587, 2092293591, i22);
            int i23 = banVar.f54337i;
            ber.setDividerPadding(new Object[]{Integer.valueOf(i23), compoundDrawableTintBlendMode, 24}, -2092293587, 2092293591, i23);
            int i24 = f54333j;
            int i25 = (i24 & 67) + (i24 | 67);
            f54334k = i25 % 128;
            if (i25 % 2 == 0) {
                throw null;
            }
            objValueOf = compoundDrawableTintBlendMode;
        } else if (i18 == 2) {
            ban banVar2 = (ban) objArr[0];
            int i26 = f54334k;
            int i27 = ((i26 ^ 100) + ((i26 & 100) << 1)) - 1;
            f54333j = i27 % 128;
            int i28 = i27 % 2;
            int i29 = banVar2.f54336h;
            int i30 = i26 & 111;
            int i31 = -(-((i26 ^ 111) | i30));
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            f54333j = i32 % 128;
            int i33 = i32 % 2;
            objValueOf = Integer.valueOf(i29);
        } else if (i18 != 3) {
            ban banVar3 = (ban) objArr[0];
            int i34 = f54333j;
            int i35 = ((i34 & 82) + (i34 | 82)) - 1;
            f54334k = i35 % 128;
            int i36 = i35 % 2;
            int i37 = banVar3.f54337i;
            int i38 = i34 & 115;
            int i39 = -(-((i34 ^ 115) | i38));
            int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
            f54334k = i40 % 128;
            int i41 = i40 % 2;
            objValueOf = Integer.valueOf(i37);
        } else {
            ban banVar4 = (ban) objArr[0];
            int i42 = f54333j + 61;
            f54334k = i42 % 128;
            int i43 = i42 % 2;
            int i44 = banVar4.f54335g;
            if (i43 == 0) {
                int i45 = 7 / 0;
            }
            objValueOf = Integer.valueOf(i44);
        }
        return (Serializable) objValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.bar
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) a(new Object[]{this}, 1306240669, -1306240668, System.identityHashCode(this));
    }
}
