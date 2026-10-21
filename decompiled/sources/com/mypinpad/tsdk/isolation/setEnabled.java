package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class setEnabled {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f59649e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f59650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f59651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f59652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f59653d;

    public setEnabled(float f6, float f10, float f11, float f12) {
        this.f59650a = f6;
        this.f59651b = f10;
        this.f59652c = f11;
        this.f59653d = f12;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-755)) + (i10 * (-755));
        int i14 = ~((~i10) | (~i11));
        int i15 = i10 | i11;
        int i16 = ((~(i15 | i12)) | i14) * (-756);
        int i17 = ((i15 | (~i12)) * 756) + i16 + (i14 * 1512) + i13;
        if (i17 == 1) {
            setEnabled setenabled = (setEnabled) objArr[0];
            int i18 = f59649e;
            int i19 = ((i18 | 35) << 1) - (i18 ^ 35);
            int i20 = i19 % 128;
            int i21 = i19 % 2;
            float f6 = setenabled.f59651b;
            if (i21 == 0) {
                throw null;
            }
            int i22 = i20 + 95;
            f59649e = i22 % 128;
            int i23 = i22 % 2;
            return Float.valueOf(f6);
        }
        if (i17 == 2) {
            setEnabled setenabled2 = (setEnabled) objArr[0];
            int i24 = f59649e;
            int i25 = (i24 ^ 113) + ((i24 & 113) << 1);
            int i26 = i25 % 128;
            int i27 = i25 % 2;
            int i28 = i24 + 35;
            int i29 = i28 % 128;
            int i30 = i28 % 2;
            return Float.valueOf(setenabled2.f59653d);
        }
        if (i17 != 3) {
            setEnabled setenabled3 = (setEnabled) objArr[0];
            int i31 = f59649e;
            int i32 = (((i31 & (-46)) | ((~i31) & 45)) - (~(-(-((i31 & 45) << 1))))) - 1;
            int i33 = i32 % 128;
            int i34 = i32 % 2;
            float f10 = setenabled3.f59652c;
            if (i34 == 0) {
                int i35 = 31 / 0;
            }
            return Float.valueOf(f10);
        }
        setEnabled setenabled4 = (setEnabled) objArr[0];
        int i36 = f59649e;
        int i37 = i36 ^ 25;
        int i38 = (i36 & 25) << 1;
        int i39 = (i37 & i38) + (i37 | i38);
        int i40 = i39 % 128;
        int i41 = i39 % 2;
        int i42 = (i36 ^ 121) + ((i36 & 121) << 1);
        int i43 = i42 % 128;
        int i44 = i42 % 2;
        return Float.valueOf(setenabled4.f59650a);
    }

    public final float setDividerPadding() {
        return ((Float) setOnFocusChangeListener(new Object[]{this}, -1092152098, 1092152099, System.identityHashCode(this))).floatValue();
    }

    public final float setX() {
        return ((Float) setOnFocusChangeListener(new Object[]{this}, -333010703, 333010706, System.identityHashCode(this))).floatValue();
    }

    public final float setY() {
        return ((Float) setOnFocusChangeListener(new Object[]{this}, -119010684, 119010686, System.identityHashCode(this))).floatValue();
    }

    public final float setOnFocusChangeListener() {
        return ((Float) setOnFocusChangeListener(new Object[]{this}, -2145506247, 2145506247, System.identityHashCode(this))).floatValue();
    }
}
