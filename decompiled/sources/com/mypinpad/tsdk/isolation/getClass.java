package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class getClass extends component9 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f55721g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f55722h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f55726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f55727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f55728f;

    public getClass(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(null);
        this.f55723a = i10;
        this.f55724b = z10;
        this.f55725c = z11;
        this.f55726d = z12;
        this.f55727e = z13;
        this.f55728f = z14;
        component2.setX(new Object[]{Integer.valueOf(i10)}, 1676983008, -1676983003, i10);
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ((~(i11 | i13)) * 381) + (((~(i10 | i11)) | (~((~i12) | i11)) | (~((~i11) | i13))) * 381) + ((i11 | i12 | i13) * (-381)) + (i11 * 382) + (i10 * (-380));
        if (i14 == 1) {
            getClass getclass = (getClass) objArr[0];
            int i15 = f55722h;
            int i16 = i15 & 85;
            int i17 = -(-(i15 | 85));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            int i19 = i18 % 128;
            f55721g = i19;
            int i20 = i18 % 2;
            boolean z10 = getclass.f55726d;
            int i21 = ((-1) << 1) - ((-1) ^ ((i19 & 74) + (i19 | 74)));
            f55722h = i21 % 128;
            int i22 = i21 % 2;
            return Boolean.valueOf(z10);
        }
        if (i14 == 2) {
            getClass getclass2 = (getClass) objArr[0];
            int i23 = f55722h;
            int i24 = i23 ^ 105;
            int i25 = (i23 & 105) << 1;
            int i26 = (i24 & i25) + (i24 | i25);
            f55721g = i26 % 128;
            int i27 = i26 % 2;
            int i28 = getclass2.f55723a;
            int i29 = i23 + 77;
            f55721g = i29 % 128;
            if (i29 % 2 == 0) {
                return Integer.valueOf(i28);
            }
            throw null;
        }
        if (i14 == 3) {
            getClass getclass3 = (getClass) objArr[0];
            int i30 = f55722h + 53;
            int i31 = i30 % 128;
            f55721g = i31;
            int i32 = i30 % 2;
            boolean z11 = getclass3.f55728f;
            int i33 = i31 & 115;
            int i34 = (((i31 | 115) & (~i33)) - (~(-(-(i33 << 1))))) - 1;
            f55722h = i34 % 128;
            if (i34 % 2 != 0) {
                return Boolean.valueOf(z11);
            }
            throw null;
        }
        if (i14 == 4) {
            getClass getclass4 = (getClass) objArr[0];
            int i35 = f55722h;
            int i36 = i35 & 103;
            int i37 = (((i35 ^ 103) | i36) << 1) - ((i35 | 103) & (~i36));
            int i38 = i37 % 128;
            f55721g = i38;
            int i39 = i37 % 2;
            boolean z12 = getclass4.f55724b;
            int i40 = ((i38 | 111) << 1) - (i38 ^ 111);
            f55722h = i40 % 128;
            if (i40 % 2 != 0) {
                return Boolean.valueOf(z12);
            }
            throw null;
        }
        if (i14 != 5) {
            getClass getclass5 = (getClass) objArr[0];
            int i41 = f55721g;
            int i42 = i41 | 97;
            int i43 = (i42 << 1) - ((~(i41 & 97)) & i42);
            f55722h = i43 % 128;
            int i44 = i43 % 2;
            boolean z13 = getclass5.f55725c;
            if (i44 != 0) {
                return Boolean.valueOf(z13);
            }
            throw null;
        }
        getClass getclass6 = (getClass) objArr[0];
        int i45 = f55721g;
        int i46 = (((i45 ^ 91) | (i45 & 91)) << 1) - ((i45 & (-92)) | ((~i45) & 91));
        f55722h = i46 % 128;
        int i47 = i46 % 2;
        boolean z14 = getclass6.f55727e;
        int i48 = (i45 | 91) << 1;
        int i49 = -(i45 ^ 91);
        int i50 = (i48 & i49) + (i49 | i48);
        f55722h = i50 % 128;
        int i51 = i50 % 2;
        return Boolean.valueOf(z14);
    }

    public final boolean getNavBarTitleString() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 1858361531, -1858361528, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setDividerPadding() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 508147586, -508147586, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 678208067, -678208062, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setX() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -432862421, 432862422, System.identityHashCode(this))).booleanValue();
    }

    public final int setY() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 151746280, -151746278, System.identityHashCode(this))).intValue();
    }

    public final boolean setCompoundDrawableTintBlendMode() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 1048143719, -1048143715, System.identityHashCode(this))).booleanValue();
    }
}
