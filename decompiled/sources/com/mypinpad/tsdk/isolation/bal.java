package com.mypinpad.tsdk.isolation;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class bal extends bar {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f54317j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f54318k = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f54319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f54320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f54321i;

    public static class setOnFocusChangeListener extends bar.setOnFocusChangeListener<setOnFocusChangeListener> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static int f54322j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static int f54323k = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f54324g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f54325h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f54326i;

        public setOnFocusChangeListener() {
            super(1);
            this.f54324g = 0;
            this.f54325h = 0;
            this.f54326i = 0;
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            setOnFocusChangeListener setonfocuschangelistener;
            Object obj;
            switch ((((~(i10 | i12)) | (~i11)) * 529) + (((~((~i12) | i10)) | (~(i10 | i11))) * 529) + (i11 * 530) + (i10 * 530) + 1058) {
                case 1:
                    setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
                    int iIntValue = ((Number) objArr[1]).intValue();
                    int i13 = f54323k;
                    int i14 = ((i13 ^ 60) + ((i13 & 60) << 1)) - 1;
                    f54322j = i14 % 128;
                    int i15 = i14 % 2;
                    setonfocuschangelistener.f54326i = iIntValue;
                    if (i15 != 0) {
                        throw null;
                    }
                    int i16 = ((i13 | 39) << 1) - (i13 ^ 39);
                    f54322j = i16 % 128;
                    if (i16 % 2 != 0) {
                        obj = setonfocuschangelistener;
                        throw null;
                    }
                    break;
                case 2:
                    setOnFocusChangeListener setonfocuschangelistener2 = (setOnFocusChangeListener) objArr[0];
                    int iIntValue2 = ((Number) objArr[1]).intValue();
                    int i17 = f54323k;
                    int i18 = (i17 & (-84)) | ((~i17) & 83);
                    int i19 = -(-((i17 & 83) << 1));
                    int i20 = (i18 & i19) + (i19 | i18);
                    int i21 = i20 % 128;
                    f54322j = i21;
                    int i22 = i20 % 2;
                    setonfocuschangelistener2.f54325h = iIntValue2;
                    int i23 = (((i21 ^ 93) | (i21 & 93)) << 1) - (((~i21) & 93) | (i21 & (-94)));
                    f54323k = i23 % 128;
                    obj = setonfocuschangelistener2;
                    if (i23 % 2 == 0) {
                        throw null;
                    }
                    break;
                case 3:
                    setOnFocusChangeListener setonfocuschangelistener3 = (setOnFocusChangeListener) objArr[0];
                    int i24 = f54323k;
                    int i25 = ((((i24 ^ 61) | (i24 & 61)) << 1) - (~(-(((~i24) & 61) | (i24 & (-62)))))) - 1;
                    int i26 = i25 % 128;
                    f54322j = i26;
                    int i27 = i25 % 2;
                    int i28 = setonfocuschangelistener3.f54326i;
                    int i29 = i26 + 111;
                    f54323k = i29 % 128;
                    if (i29 % 2 != 0) {
                        return Integer.valueOf(i28);
                    }
                    throw null;
                case 4:
                    setOnFocusChangeListener setonfocuschangelistener4 = (setOnFocusChangeListener) objArr[0];
                    int i30 = f54322j;
                    int i31 = (((i30 ^ 61) | (i30 & 61)) << 1) - (((~i30) & 61) | (i30 & (-62)));
                    f54323k = i31 % 128;
                    int i32 = i31 % 2;
                    int i33 = setonfocuschangelistener4.f54325h;
                    if (i32 == 0) {
                        int i34 = 57 / 0;
                    }
                    return Integer.valueOf(i33);
                case 5:
                    setOnFocusChangeListener setonfocuschangelistener5 = (setOnFocusChangeListener) objArr[0];
                    int i35 = f54323k;
                    int i36 = (i35 | 73) << 1;
                    int i37 = -(((~i35) & 73) | (i35 & (-74)));
                    int i38 = (i36 & i37) + (i37 | i36);
                    f54322j = i38 % 128;
                    if (i38 % 2 == 0) {
                        return (setOnFocusChangeListener) setDividerPadding(new Object[]{setonfocuschangelistener5}, 942956568, -942956568, System.identityHashCode(setonfocuschangelistener5));
                    }
                    throw null;
                case 6:
                    setOnFocusChangeListener setonfocuschangelistener6 = (setOnFocusChangeListener) objArr[0];
                    int iIntValue3 = ((Number) objArr[1]).intValue();
                    int i39 = f54323k + 81;
                    int i40 = i39 % 128;
                    f54322j = i40;
                    int i41 = i39 % 2;
                    setonfocuschangelistener6.f54324g = iIntValue3;
                    int i42 = ((i40 | 19) << 1) - (i40 ^ 19);
                    f54323k = i42 % 128;
                    int i43 = i42 % 2;
                    obj = setonfocuschangelistener6;
                    break;
                case 7:
                    bal balVar = new bal((setOnFocusChangeListener) objArr[0]);
                    int i44 = f54322j;
                    int i45 = i44 & 125;
                    int i46 = (i44 | 125) & (~i45);
                    int i47 = -(-(i45 << 1));
                    int i48 = (i46 ^ i47) + ((i46 & i47) << 1);
                    f54323k = i48 % 128;
                    int i49 = i48 % 2;
                    obj = balVar;
                    break;
                case 8:
                    setOnFocusChangeListener setonfocuschangelistener7 = (setOnFocusChangeListener) objArr[0];
                    int i50 = f54322j;
                    int i51 = (((i50 | 8) << 1) - (i50 ^ 8)) - 1;
                    int i52 = i51 % 128;
                    f54323k = i52;
                    int i53 = i51 % 2;
                    int i54 = setonfocuschangelistener7.f54324g;
                    int i55 = i52 + 33;
                    f54322j = i55 % 128;
                    int i56 = i55 % 2;
                    return Integer.valueOf(i54);
                default:
                    setOnFocusChangeListener setonfocuschangelistener8 = (setOnFocusChangeListener) objArr[0];
                    int i57 = f54322j;
                    int i58 = i57 & 121;
                    int i59 = -(-((i57 ^ 121) | i58));
                    int i60 = (i58 ^ i59) + ((i59 & i58) << 1);
                    int i61 = i60 % 128;
                    f54323k = i61;
                    if (i60 % 2 == 0) {
                        throw null;
                    }
                    int i62 = (i61 & 71) + (i61 | 71);
                    f54322j = i62 % 128;
                    int i63 = i62 % 2;
                    return setonfocuschangelistener8;
            }
            obj = setonfocuschangelistener;
            return obj;
        }

        @Override // com.mypinpad.tsdk.i.bar.setOnFocusChangeListener
        public final /* synthetic */ bar.setOnFocusChangeListener setCompoundDrawableTintBlendMode() {
            return (bar.setOnFocusChangeListener) setDividerPadding(new Object[]{this}, 98555456, -98555451, System.identityHashCode(this));
        }

        public final setOnFocusChangeListener setX(int i10) {
            return (setOnFocusChangeListener) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, 212799444, -212799438, i10);
        }

        @Override // com.mypinpad.tsdk.i.bar.setOnFocusChangeListener
        public final bar setY() {
            return (bar) setDividerPadding(new Object[]{this}, 2125069984, -2125069977, System.identityHashCode(this));
        }

        public final setOnFocusChangeListener setCompoundDrawableTintBlendMode(int i10) {
            return (setOnFocusChangeListener) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, -1728245301, 1728245303, i10);
        }

        public final setOnFocusChangeListener setDividerPadding(int i10) {
            return (setOnFocusChangeListener) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, 1925518320, -1925518319, i10);
        }
    }

    public bal(setOnFocusChangeListener setonfocuschangelistener) {
        super(setonfocuschangelistener);
        this.f54319g = ((Integer) setOnFocusChangeListener.setDividerPadding(new Object[]{setonfocuschangelistener}, 859902327, -859902319, (int) System.currentTimeMillis())).intValue();
        this.f54320h = ((Integer) setOnFocusChangeListener.setDividerPadding(new Object[]{setonfocuschangelistener}, 1290723681, -1290723677, (int) System.currentTimeMillis())).intValue();
        this.f54321i = ((Integer) setOnFocusChangeListener.setDividerPadding(new Object[]{setonfocuschangelistener}, -1024889379, 1024889382, (int) System.currentTimeMillis())).intValue();
    }

    public static /* synthetic */ Serializable b(Object[] objArr, int i10, int i11, int i12) {
        Object compoundDrawableTintBlendMode;
        Object objValueOf;
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = (((~(i10 | i14 | i11)) | (~(i12 | i13)) | (~((~i10) | i13))) * 988) + ((i10 | i13) * (-988)) + (((~(i13 | i14 | i10)) | (~(i10 | i11 | i12))) * 988) + (i11 * (-987)) + (i10 * 989);
        if (i15 == 1) {
            bal balVar = (bal) objArr[0];
            int i16 = f54318k;
            int i17 = i16 & 51;
            int i18 = i17 + ((i16 ^ 51) | i17);
            f54317j = i18 % 128;
            if (i18 % 2 != 0) {
                compoundDrawableTintBlendMode = super.setCompoundDrawableTintBlendMode();
                int i19 = balVar.f54319g;
                ber.setDividerPadding(new Object[]{Integer.valueOf(i19), compoundDrawableTintBlendMode, 45}, -2092293587, 2092293591, i19);
                int i20 = balVar.f54320h;
                ber.setDividerPadding(new Object[]{Integer.valueOf(i20), compoundDrawableTintBlendMode, 41}, -2092293587, 2092293591, i20);
                int i21 = balVar.f54321i;
                ber.setDividerPadding(new Object[]{Integer.valueOf(i21), compoundDrawableTintBlendMode, 125}, -2092293587, 2092293591, i21);
            } else {
                compoundDrawableTintBlendMode = super.setCompoundDrawableTintBlendMode();
                int i22 = balVar.f54319g;
                ber.setDividerPadding(new Object[]{Integer.valueOf(i22), compoundDrawableTintBlendMode, 16}, -2092293587, 2092293591, i22);
                int i23 = balVar.f54320h;
                ber.setDividerPadding(new Object[]{Integer.valueOf(i23), compoundDrawableTintBlendMode, 20}, -2092293587, 2092293591, i23);
                int i24 = balVar.f54321i;
                ber.setDividerPadding(new Object[]{Integer.valueOf(i24), compoundDrawableTintBlendMode, 24}, -2092293587, 2092293591, i24);
            }
            objValueOf = compoundDrawableTintBlendMode;
            int i25 = f54318k + 21;
            f54317j = i25 % 128;
            int i26 = i25 % 2;
        } else if (i15 == 2) {
            bal balVar2 = (bal) objArr[0];
            int i27 = f54318k + 38;
            int i28 = (i27 ^ (-1)) + (i27 << 1);
            int i29 = i28 % 128;
            f54317j = i29;
            int i30 = i28 % 2;
            int i31 = balVar2.f54319g;
            int i32 = i29 ^ 49;
            int i33 = (((i29 & 49) | i32) << 1) - i32;
            f54318k = i33 % 128;
            int i34 = i33 % 2;
            objValueOf = Integer.valueOf(i31);
        } else if (i15 != 3) {
            bal balVar3 = (bal) objArr[0];
            int i35 = f54318k;
            int i36 = (i35 & 17) + (i35 | 17);
            f54317j = i36 % 128;
            int i37 = i36 % 2;
            int i38 = balVar3.f54321i;
            int i39 = (i35 ^ 101) + ((i35 & 101) << 1);
            f54317j = i39 % 128;
            int i40 = i39 % 2;
            objValueOf = Integer.valueOf(i38);
        } else {
            bal balVar4 = (bal) objArr[0];
            int i41 = f54317j;
            int i42 = (i41 & 3) + (i41 | 3);
            f54318k = i42 % 128;
            int i43 = i42 % 2;
            int i44 = balVar4.f54320h;
            if (i43 == 0) {
                throw null;
            }
            objValueOf = Integer.valueOf(i44);
        }
        return (Serializable) objValueOf;
    }

    public final int a() {
        return ((Integer) b(new Object[]{this}, -367587425, 367587425, System.identityHashCode(this))).intValue();
    }

    public final int c() {
        return ((Integer) b(new Object[]{this}, -849523076, 849523078, System.identityHashCode(this))).intValue();
    }

    public final int d() {
        return ((Integer) b(new Object[]{this}, 153992836, -153992833, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.bar
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) b(new Object[]{this}, 844228591, -844228590, System.identityHashCode(this));
    }
}
