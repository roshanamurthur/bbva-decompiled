package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes10.dex */
public final class awn implements awd {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54049r0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f54050p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final y1 f54051q0;
    public static final awn setOnFocusChangeListener = new awn(12, 3488, 64, false);
    public static final awn setCompoundDrawableTintBlendMode = new awn(12, 3488, 64, true);
    public static final awn setDividerPadding = new awn(13, 4608, 96, false);
    public static final awn setY = new awn(13, 4608, 96, true);
    public static final awn setX = new awn(13, 6688, 128, false);
    public static final awn getNavBarTitleString = new awn(13, 6688, 128, true);
    public static final awn setNavigationOnClickListener = new awn(13, 6960, 119, false);
    public static final awn setOnDragListener = new awn(13, 6960, 119, true);
    public static final awn setOnLongClickListener = new awn(13, 8192, 128, false);
    public static final awn setLayoutAnimation = new awn(13, 8192, 128, true);

    static {
        int i10 = f54049r0;
        int i11 = i10 & 59;
        int i12 = (((i10 | 59) & (~i11)) - (~(i11 << 1))) - 1;
        int i13 = i12 % 128;
        int i14 = i12 % 2;
    }

    public awn(int i10, int i11, int i12, boolean z10) {
        this.f54050p0 = i12;
        y1 y1Var = new y1();
        y1Var.f61986j = z10;
        y1Var.f61977a = i11;
        y1Var.f61978b = i12;
        y1Var.f61979c = i10;
        y1Var.f61980d = i12 << 1;
        int i13 = ~i10;
        int i14 = ~i13;
        int i15 = i12 * i10;
        y1Var.f61981e = i15;
        int i16 = -i15;
        int i17 = i16 * 302;
        int i18 = -(~(i11 * TypedValues.MotionType.TYPE_EASING));
        int i19 = ((i17 ^ i18) + ((i17 & i18) << 1)) - 1;
        int i20 = ~i16;
        int i21 = (i13 | i10) & i13;
        int i22 = ~i21;
        int i23 = ~i20;
        int i24 = (i20 & i22) | (i21 & i23);
        int i25 = i20 & i21;
        int i26 = ~((i24 ^ i25) | (i24 & i25));
        int i27 = (~i26) & i11;
        int i28 = ~i11;
        int i29 = i27 | (i26 & i28);
        int i30 = i26 & i11;
        int i31 = -(-(((i29 ^ i30) | (i29 & i30)) * (-602)));
        int i32 = (i19 & i31) + (i31 | i19);
        int i33 = ~(((~i28) & i20) | (i28 & i23) | (i20 & i28));
        int i34 = (i20 | i16) & i20;
        int i35 = i34 & i10;
        int i36 = (~i35) & (i34 | i10);
        int i37 = ~((i36 & i35) | (i36 ^ i35));
        int i38 = (i37 & i33) | (i33 ^ i37);
        int i39 = (i16 & i13) | (i20 & i13) | (i16 & i14);
        int i40 = (i39 & i28) | ((~i39) & i11);
        int i41 = i39 & i11;
        int i42 = ~((i41 & i40) | (i40 ^ i41));
        int i43 = i38 & i42;
        int i44 = (i38 | i42) & (~i43);
        int i45 = (((i44 & i43) | (i44 ^ i43)) * (-301)) + i32;
        int i46 = (i28 & i21) | (i11 & i22);
        int i47 = i11 & i21;
        int i48 = (~((i46 & i47) | (i46 ^ i47))) * 301;
        int i49 = (i45 & i48) + (i48 | i45);
        y1Var.f61982f = i49;
        int i50 = ((i49 & 7) + (i49 | 7)) / 8;
        int i51 = i15 & 7;
        int i52 = (i51 + ((i15 ^ 7) | i51)) / 8;
        int i53 = 1 << i10;
        int i54 = i53 * (-107);
        int i55 = ((((-55) ^ i54) | ((-55) & i54)) << 1) - (((~i54) & (-55)) | (i54 & 54));
        int i56 = ~i53;
        int i57 = ~((i53 & i21) | (i21 & i56) | (i53 & i22));
        int i58 = -(~(((i57 & i56) | ((~i57) & i56) | ((~i56) & i57)) * (-108)));
        int i59 = (-2) - ((((i55 | i58) << 1) - (i58 ^ i55)) ^ (-1));
        int i60 = i56 | (i56 ^ (-1));
        int i61 = ~i60;
        int i62 = (i60 | i61) & i61;
        int i63 = (i14 & i62) | ((~i62) & i13);
        int i64 = i62 & i13;
        int i65 = (i64 & i63) | (i63 ^ i64);
        int i66 = ~(i22 | i21);
        int i67 = i65 & i66;
        int i68 = -(-((((i65 | i66) & (~i67)) | i67) * 54));
        int i69 = i59 & i68;
        int i70 = i68 | i59;
        int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
        int i72 = ((~i61) & i10) | (i13 & i61);
        int i73 = i61 & i10;
        y1Var.f61983g = (i71 - (~(-(-(((i72 & i73) | (i72 ^ i73)) * 54))))) - 1;
        y1Var.f61984h = i10 == 12 ? new a2() : new d2();
        y1Var.f61985i = i12 % 8 != 0;
        this.f54051q0 = y1Var;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        if ((((~(i10 | (~i12))) | (~i11)) * 305) + (((~(i10 | i11)) | (~(i10 | i12))) * 305) + (i11 * 306) + (i10 * 306) + TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS == 1) {
            awn awnVar = (awn) objArr[0];
            int i13 = f54049r0;
            int i14 = i13 & 99;
            int i15 = ((i13 ^ 99) | i14) << 1;
            int i16 = -((i13 | 99) & (~i14));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            int i18 = i17 % 128;
            int i19 = i17 % 2;
            int i20 = awnVar.f54050p0;
            int i21 = (((i18 | 92) << 1) - (i18 ^ 92)) - 1;
            f54049r0 = i21 % 128;
            int i22 = i21 % 2;
            return Integer.valueOf(i20);
        }
        awn awnVar2 = (awn) objArr[0];
        int i23 = f54049r0;
        int i24 = i23 & 13;
        int i25 = ((i23 | 13) & (~i24)) + (i24 << 1);
        int i26 = i25 % 128;
        int i27 = i25 % 2;
        y1 y1Var = awnVar2.f54051q0;
        int i28 = i26 & 77;
        int i29 = ((i26 ^ 77) | i28) << 1;
        int i30 = -((i26 | 77) & (~i28));
        int i31 = (i29 & i30) + (i29 | i30);
        f54049r0 = i31 % 128;
        if (i31 % 2 == 0) {
            return y1Var;
        }
        throw null;
    }

    public final int setY() {
        return ((Integer) setX(new Object[]{this}, -1903363914, 1903363915, System.identityHashCode(this))).intValue();
    }
}
