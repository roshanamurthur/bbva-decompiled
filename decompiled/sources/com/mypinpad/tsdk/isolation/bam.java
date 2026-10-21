package com.mypinpad.tsdk.isolation;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class bam extends bar {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f54327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f54328h;

    public static class setX extends bar.setOnFocusChangeListener<setX> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static int f54329i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static int f54330j = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f54331g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f54332h;

        public setX() {
            super(2);
            this.f54331g = 0;
            this.f54332h = 0;
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            setX setx;
            int i13 = ~i10;
            switch ((((~(i10 | i12)) | i11) * 272) + (((~(i13 | i12)) | (~(i13 | i11))) * (-272)) + (((~((~i11) | i13 | (~i12))) | (~(i10 | i11 | i12))) * (-272)) + (i11 * (-271)) + (i10 * 273)) {
                case 1:
                    setX setx2 = (setX) objArr[0];
                    int iIdentityHashCode = System.identityHashCode(setx2);
                    int i14 = ~iIdentityHashCode;
                    int i15 = (i14 | iIdentityHashCode) & i14;
                    int i16 = ((~i15) & (-69740613)) | (69740612 & i15);
                    int i17 = i15 & (-69740613);
                    int i18 = -(-(((i17 & i16) | (i16 ^ i17)) * (-369)));
                    int i19 = (((-838859702) | i18) << 1) - (i18 ^ (-838859702));
                    int i20 = (-986748732) & i14;
                    int i21 = (~i20) & ((-986748732) | i14);
                    int i22 = -(-(((~((i21 & i20) | (i21 ^ i20))) | (-385398894)) * (-369)));
                    int i23 = ((~i22) & i19) | ((~i19) & i22);
                    int i24 = (i19 & i22) << 1;
                    int i25 = (i23 & i24) + (i24 | i23);
                    int i26 = (iIdentityHashCode & 986748731) | (986748731 ^ iIdentityHashCode);
                    int i27 = ~i26;
                    int i28 = (i26 | i27) & i27;
                    int i29 = (i14 & 986748731) | ((-986748732) & (~i14));
                    int i30 = (i29 & i20) | (i29 ^ i20);
                    int i31 = (i30 & (-385398894)) | (i30 ^ (-385398894));
                    int i32 = ~i31;
                    int i33 = -(-(((i28 & (-1056489344)) | ((-1056489344) ^ i28) | ((i31 | i32) & i32)) * 369));
                    int i34 = i25 & i33;
                    int i35 = (i33 | i25) & (~i34);
                    int i36 = -(-(i34 << 1));
                    int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
                    System.identityHashCode(setx2);
                    if (i37 <= -1897627247) {
                        setx = (setX) setX(new Object[]{setx2}, -20642104, 20642110, System.identityHashCode(setx2));
                        int i38 = 97 / 0;
                    } else {
                        setx = (setX) setX(new Object[]{setx2}, -20642104, 20642110, System.identityHashCode(setx2));
                    }
                    setX setx3 = setx;
                    int i39 = f54330j + 51;
                    f54329i = i39 % 128;
                    int i40 = i39 % 2;
                    return setx3;
                case 2:
                    setX setx4 = (setX) objArr[0];
                    int iIntValue = ((Number) objArr[1]).intValue();
                    int i41 = f54330j;
                    int i42 = (i41 & 24) + (i41 | 24);
                    int i43 = (i42 ^ (-1)) + (i42 << 1);
                    f54329i = i43 % 128;
                    int i44 = i43 % 2;
                    setx4.f54332h = iIntValue;
                    if (i44 == 0) {
                        return setx4;
                    }
                    throw null;
                case 3:
                    setX setx5 = (setX) objArr[0];
                    int i45 = f54330j + 45;
                    f54329i = i45 % 128;
                    int i46 = i45 % 2;
                    int i47 = setx5.f54332h;
                    if (i46 == 0) {
                        return Integer.valueOf(i47);
                    }
                    throw null;
                case 4:
                    setX setx6 = (setX) objArr[0];
                    int iIntValue2 = ((Number) objArr[1]).intValue();
                    int i48 = f54330j;
                    int i49 = (i48 | 61) << 1;
                    int i50 = -((i48 & (-62)) | ((~i48) & 61));
                    int i51 = ((i49 | i50) << 1) - (i49 ^ i50);
                    f54329i = i51 % 128;
                    int i52 = i51 % 2;
                    setx6.f54331g = iIntValue2;
                    int i53 = (-2) - (((i48 ^ 74) + ((i48 & 74) << 1)) ^ (-1));
                    f54329i = i53 % 128;
                    int i54 = i53 % 2;
                    return setx6;
                case 5:
                    setX setx7 = (setX) objArr[0];
                    int i55 = f54329i;
                    int i56 = i55 | 65;
                    int i57 = i56 << 1;
                    int i58 = -((~(i55 & 65)) & i56);
                    int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                    int i60 = i59 % 128;
                    f54330j = i60;
                    int i61 = i59 % 2;
                    int i62 = setx7.f54331g;
                    if (i61 == 0) {
                        throw null;
                    }
                    int i63 = i60 ^ 111;
                    int i64 = (i60 & 111) << 1;
                    int i65 = ((i63 | i64) << 1) - (i64 ^ i63);
                    f54329i = i65 % 128;
                    int i66 = i65 % 2;
                    return Integer.valueOf(i62);
                case 6:
                    setX setx8 = (setX) objArr[0];
                    int i67 = f54329i;
                    int i68 = i67 & 111;
                    int i69 = (i67 ^ 111) | i68;
                    int i70 = (i68 ^ i69) + ((i68 & i69) << 1);
                    f54330j = i70 % 128;
                    int i71 = i70 % 2;
                    int i72 = i67 & 33;
                    int i73 = (i67 ^ 33) | i72;
                    int i74 = (i72 ^ i73) + ((i73 & i72) << 1);
                    f54330j = i74 % 128;
                    if (i74 % 2 != 0) {
                        return setx8;
                    }
                    throw null;
                default:
                    bam bamVar = new bam((setX) objArr[0]);
                    int i75 = f54330j;
                    int i76 = i75 & 75;
                    int i77 = (i76 - (~(-(-((i75 ^ 75) | i76))))) - 1;
                    f54329i = i77 % 128;
                    if (i77 % 2 == 0) {
                        return bamVar;
                    }
                    int i78 = 60 / 0;
                    return bamVar;
            }
        }

        @Override // com.mypinpad.tsdk.i.bar.setOnFocusChangeListener
        public final /* synthetic */ bar.setOnFocusChangeListener setCompoundDrawableTintBlendMode() {
            return (bar.setOnFocusChangeListener) setX(new Object[]{this}, -1676266926, 1676266927, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.i.bar.setOnFocusChangeListener
        public final bar setY() {
            return (bar) setX(new Object[]{this}, -1826442849, 1826442849, System.identityHashCode(this));
        }

        public final setX setCompoundDrawableTintBlendMode(int i10) {
            return (setX) setX(new Object[]{this, Integer.valueOf(i10)}, 849744138, -849744134, i10);
        }

        public final setX setX(int i10) {
            return (setX) setX(new Object[]{this, Integer.valueOf(i10)}, -2130967129, 2130967131, i10);
        }
    }

    public bam(setX setx) {
        super(setx);
        this.f54327g = ((Integer) setX.setX(new Object[]{setx}, -1959811660, 1959811665, (int) System.currentTimeMillis())).intValue();
        this.f54328h = ((Integer) setX.setX(new Object[]{setx}, 1213256495, -1213256492, (int) System.currentTimeMillis())).intValue();
    }

    public static /* synthetic */ Serializable b(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13 = ~i11;
        int i14 = i13 | i10;
        int i15 = (((~(i10 | i12)) | (~(i13 | i12)) | (~i14)) * 623) + (((~(i11 | (~i10))) | (~i12)) * (-623)) + ((~(i14 | i12)) * 623) + (i11 * (-622)) + (i10 * 624);
        if (i15 != 1) {
            objValueOf = i15 != 2 ? Integer.valueOf(((bam) objArr[0]).f54327g) : Integer.valueOf(((bam) objArr[0]).f54328h);
        } else {
            bam bamVar = (bam) objArr[0];
            Object compoundDrawableTintBlendMode = super.setCompoundDrawableTintBlendMode();
            ber.setDividerPadding(new Object[]{0, compoundDrawableTintBlendMode, 16}, -2092293587, 2092293591, 0);
            int i16 = bamVar.f54327g;
            ber.setDividerPadding(new Object[]{Integer.valueOf(i16), compoundDrawableTintBlendMode, 20}, -2092293587, 2092293591, i16);
            int i17 = bamVar.f54328h;
            ber.setDividerPadding(new Object[]{Integer.valueOf(i17), compoundDrawableTintBlendMode, 24}, -2092293587, 2092293591, i17);
            objValueOf = compoundDrawableTintBlendMode;
        }
        return (Serializable) objValueOf;
    }

    public final int a() {
        return ((Integer) b(new Object[]{this}, -844564495, 844564497, System.identityHashCode(this))).intValue();
    }

    public final int c() {
        return ((Integer) b(new Object[]{this}, -75806786, 75806786, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.bar
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) b(new Object[]{this}, -1613534921, 1613534922, System.identityHashCode(this));
    }
}
