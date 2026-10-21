package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public abstract class bar {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f54345e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f54346f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f54348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f54350d;

    public static abstract class setOnFocusChangeListener<T extends setOnFocusChangeListener> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f54351e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f54352f = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f54353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f54354b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f54355c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f54356d = 0;

        public setOnFocusChangeListener(int i10) {
            this.f54353a = i10;
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            long j10;
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = (((~(i14 | i12)) | (~(i13 | i14)) | (~(i13 | i12))) * (-880)) + (i11 * 881) + (i10 * 881);
            int i16 = i11 | (~(i13 | (~i12)));
            int i17 = ~(i10 | i12);
            switch ((i17 * 880) + ((i16 | i17) * (-880)) + i15) {
                case 1:
                    setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
                    int i18 = f54352f;
                    int i19 = i18 & 77;
                    int i20 = (i18 ^ 77) | i19;
                    int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                    int i22 = i21 % 128;
                    f54351e = i22;
                    int i23 = i21 % 2;
                    int i24 = setonfocuschangelistener.f54356d;
                    if (i23 != 0) {
                        int i25 = 80 / 0;
                    }
                    int i26 = i22 & 119;
                    int i27 = (i22 ^ 119) | i26;
                    int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                    f54352f = i28 % 128;
                    if (i28 % 2 != 0) {
                        return Integer.valueOf(i24);
                    }
                    throw null;
                case 2:
                    setOnFocusChangeListener setonfocuschangelistener2 = (setOnFocusChangeListener) objArr[0];
                    int i29 = f54352f;
                    int i30 = i29 & 97;
                    int i31 = (i30 - (~(-(-((i29 ^ 97) | i30))))) - 1;
                    f54351e = i31 % 128;
                    int i32 = i31 % 2;
                    int i33 = setonfocuschangelistener2.f54353a;
                    int i34 = i29 + 83;
                    f54351e = i34 % 128;
                    int i35 = i34 % 2;
                    return Integer.valueOf(i33);
                case 3:
                    setOnFocusChangeListener setonfocuschangelistener3 = (setOnFocusChangeListener) objArr[0];
                    int i36 = f54352f;
                    int i37 = i36 & 7;
                    int i38 = (((i36 | 7) & (~i37)) - (~(-(-(i37 << 1))))) - 1;
                    f54351e = i38 % 128;
                    if (i38 % 2 != 0) {
                        j10 = setonfocuschangelistener3.f54355c;
                        int i39 = 82 / 0;
                    } else {
                        j10 = setonfocuschangelistener3.f54355c;
                    }
                    return Long.valueOf(j10);
                case 4:
                    setOnFocusChangeListener setonfocuschangelistener4 = (setOnFocusChangeListener) objArr[0];
                    int i40 = f54352f;
                    int i41 = i40 & 33;
                    int i42 = ((~i41) & (i40 | 33)) + (i41 << 1);
                    f54351e = i42 % 128;
                    int i43 = i42 % 2;
                    int i44 = setonfocuschangelistener4.f54354b;
                    if (i43 != 0) {
                        int i45 = 90 / 0;
                    }
                    int i46 = i40 + 53;
                    f54351e = i46 % 128;
                    int i47 = i46 % 2;
                    return Integer.valueOf(i44);
                case 5:
                    setOnFocusChangeListener setonfocuschangelistener5 = (setOnFocusChangeListener) objArr[0];
                    long jLongValue = ((Number) objArr[1]).longValue();
                    int i48 = f54352f;
                    int i49 = ((i48 | 23) << 1) - (i48 ^ 23);
                    f54351e = i49 % 128;
                    int i50 = i49 % 2;
                    setonfocuschangelistener5.f54355c = jLongValue;
                    setOnFocusChangeListener compoundDrawableTintBlendMode = setonfocuschangelistener5.setCompoundDrawableTintBlendMode();
                    int i51 = f54352f;
                    int i52 = ((i51 ^ 25) | (i51 & 25)) << 1;
                    int i53 = -(((~i51) & 25) | (i51 & (-26)));
                    int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
                    f54351e = i54 % 128;
                    int i55 = i54 % 2;
                    return compoundDrawableTintBlendMode;
                case 6:
                    setOnFocusChangeListener setonfocuschangelistener6 = (setOnFocusChangeListener) objArr[0];
                    int iIntValue = ((Number) objArr[1]).intValue();
                    int i56 = f54351e;
                    int i57 = i56 & 9;
                    int i58 = (i56 | 9) & (~i57);
                    int i59 = i57 << 1;
                    int i60 = (i58 ^ i59) + ((i58 & i59) << 1);
                    f54352f = i60 % 128;
                    int i61 = i60 % 2;
                    setonfocuschangelistener6.f54356d = iIntValue;
                    setOnFocusChangeListener compoundDrawableTintBlendMode2 = setonfocuschangelistener6.setCompoundDrawableTintBlendMode();
                    int i62 = ((-1) << 1) - ((f54351e + 74) ^ (-1));
                    f54352f = i62 % 128;
                    int i63 = i62 % 2;
                    return compoundDrawableTintBlendMode2;
                default:
                    setOnFocusChangeListener setonfocuschangelistener7 = (setOnFocusChangeListener) objArr[0];
                    int iIntValue2 = ((Number) objArr[1]).intValue();
                    int i64 = f54351e;
                    int i65 = i64 ^ 99;
                    int i66 = (i64 & 99) << 1;
                    int i67 = ((i65 | i66) << 1) - (i66 ^ i65);
                    f54352f = i67 % 128;
                    int i68 = i67 % 2;
                    setonfocuschangelistener7.f54354b = iIntValue2;
                    setOnFocusChangeListener compoundDrawableTintBlendMode3 = setonfocuschangelistener7.setCompoundDrawableTintBlendMode();
                    int i69 = f54351e;
                    int i70 = i69 & 59;
                    int i71 = (i69 ^ 59) | i70;
                    int i72 = ((i70 | i71) << 1) - (i71 ^ i70);
                    f54352f = i72 % 128;
                    if (i72 % 2 != 0) {
                        return compoundDrawableTintBlendMode3;
                    }
                    throw null;
            }
        }

        public abstract T setCompoundDrawableTintBlendMode();

        public final T setOnDragListener(int i10) {
            return (T) setY(new Object[]{this, Integer.valueOf(i10)}, 1127697955, -1127697949, i10);
        }

        public final T setOnFocusChangeListener(long j10) {
            return (T) setY(new Object[]{this, Long.valueOf(j10)}, -1011452391, 1011452396, System.identityHashCode(this));
        }

        public abstract bar setY();

        public final T setOnFocusChangeListener(int i10) {
            return (T) setY(new Object[]{this, Integer.valueOf(i10)}, 575278009, -575278009, i10);
        }
    }

    public bar(setOnFocusChangeListener setonfocuschangelistener) {
        this.f54347a = ((Integer) setOnFocusChangeListener.setY(new Object[]{setonfocuschangelistener}, 1350957588, -1350957584, (int) System.currentTimeMillis())).intValue();
        this.f54348b = ((Long) setOnFocusChangeListener.setY(new Object[]{setonfocuschangelistener}, 455705501, -455705498, (int) System.currentTimeMillis())).longValue();
        this.f54349c = ((Integer) setOnFocusChangeListener.setY(new Object[]{setonfocuschangelistener}, -498708141, 498708143, (int) System.currentTimeMillis())).intValue();
        this.f54350d = ((Integer) setOnFocusChangeListener.setY(new Object[]{setonfocuschangelistener}, -30367960, 30367961, (int) System.currentTimeMillis())).intValue();
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = ((~(i10 | i11)) * 933) + (((~(i15 | i13)) | (~(i13 | i10))) * 933) + (((~(i14 | i15)) | i13) * (-933)) + (i11 * (-932)) + (i10 * 934);
        if (i16 == 1) {
            bar barVar = (bar) objArr[0];
            int i17 = f54345e;
            int i18 = i17 & 33;
            int i19 = -(-((i17 ^ 33) | i18));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            int i21 = i20 % 128;
            f54346f = i21;
            int i22 = i20 % 2;
            long j10 = barVar.f54348b;
            int i23 = i21 + 43;
            f54345e = i23 % 128;
            if (i23 % 2 == 0) {
                return Long.valueOf(j10);
            }
            throw null;
        }
        if (i16 == 2) {
            bar barVar2 = (bar) objArr[0];
            int i24 = ((-1) << 1) - ((f54346f + 30) ^ (-1));
            int i25 = i24 % 128;
            f54345e = i25;
            int i26 = i24 % 2;
            int i27 = barVar2.f54347a;
            int i28 = i25 & 73;
            int i29 = (i25 ^ 73) | i28;
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            f54346f = i30 % 128;
            int i31 = i30 % 2;
            return Integer.valueOf(i27);
        }
        bar barVar3 = (bar) objArr[0];
        int i32 = f54346f;
        int i33 = ((i32 & 126) + (i32 | 126)) - 1;
        int i34 = i33 % 128;
        f54345e = i34;
        int i35 = i33 % 2;
        int i36 = barVar3.f54350d;
        int i37 = (i34 & (-106)) | ((~i34) & 105);
        int i38 = (i34 & 105) << 1;
        int i39 = (i37 & i38) + (i38 | i37);
        f54346f = i39 % 128;
        int i40 = i39 % 2;
        return Integer.valueOf(i36);
    }

    public final int getNavBarTitleString() {
        return ((Integer) setY(new Object[]{this}, -322813125, 322813127, System.identityHashCode(this))).intValue();
    }

    public byte[] setCompoundDrawableTintBlendMode() {
        int i10 = f54346f + 123;
        f54345e = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArr = new byte[32];
        int i12 = this.f54347a;
        ber.setDividerPadding(new Object[]{Integer.valueOf(i12), bArr, 0}, -2092293587, 2092293591, i12);
        ber.setDividerPadding(new Object[]{Long.valueOf(this.f54348b), bArr, 4}, 108647497, -108647488, 4);
        int i13 = this.f54349c;
        ber.setDividerPadding(new Object[]{Integer.valueOf(i13), bArr, 12}, -2092293587, 2092293591, i13);
        int i14 = this.f54350d;
        ber.setDividerPadding(new Object[]{Integer.valueOf(i14), bArr, 28}, -2092293587, 2092293591, i14);
        int i15 = f54345e;
        int i16 = ((i15 ^ 65) | (i15 & 65)) << 1;
        int i17 = -(((~i15) & 65) | (i15 & (-66)));
        int i18 = (i16 & i17) + (i17 | i16);
        f54346f = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 3 / 0;
        }
        return bArr;
    }

    public final long setLayoutAnimation() {
        return ((Long) setY(new Object[]{this}, 482931428, -482931427, System.identityHashCode(this))).longValue();
    }

    public final int setNavigationOnClickListener() {
        return ((Integer) setY(new Object[]{this}, -1433420492, 1433420492, System.identityHashCode(this))).intValue();
    }
}
