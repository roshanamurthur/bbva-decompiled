package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class tw {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f61203d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f61204e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f61205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f61206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f61207c;

    public tw(int i10, int i11, int i12) {
        this.f61205a = i10;
        this.f61206b = i11;
        this.f61207c = i12;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i15;
        int i17 = ~i12;
        int i18 = (((~(i10 | i14 | i12)) | (~(i11 | i13)) | (~(i13 | i17))) * 168) + ((~(i15 | i12)) * 168) + ((i16 | (~(i14 | i17))) * 168) + (i11 * (-167)) + (i10 * (-167));
        if (i18 == 1) {
            tw twVar = (tw) objArr[0];
            int i19 = f61203d;
            int i20 = i19 ^ 109;
            int i21 = (((i19 & 109) | i20) << 1) - i20;
            int i22 = i21 % 128;
            f61204e = i22;
            int i23 = i21 % 2;
            int i24 = twVar.f61207c;
            if (i23 == 0) {
                throw null;
            }
            int i25 = i22 + 47;
            f61203d = i25 % 128;
            int i26 = i25 % 2;
            return Integer.valueOf(i24);
        }
        if (i18 != 2) {
            tw twVar2 = (tw) objArr[0];
            int i27 = f61203d;
            int i28 = (i27 ^ 7) + ((i27 & 7) << 1);
            f61204e = i28 % 128;
            int i29 = i28 % 2;
            int i30 = twVar2.f61206b;
            int i31 = (i27 ^ 82) + ((i27 & 82) << 1);
            int i32 = (i31 ^ (-1)) + (i31 << 1);
            f61204e = i32 % 128;
            int i33 = i32 % 2;
            return Integer.valueOf(i30);
        }
        tw twVar3 = (tw) objArr[0];
        int i34 = f61204e;
        int i35 = (i34 ^ 9) + ((i34 & 9) << 1);
        f61203d = i35 % 128;
        int i36 = i35 % 2;
        int i37 = twVar3.f61205a;
        int i38 = i34 & 21;
        int i39 = ((i34 ^ 21) | i38) << 1;
        int i40 = -((i34 | 21) & (~i38));
        int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
        f61203d = i41 % 128;
        if (i41 % 2 == 0) {
            return Integer.valueOf(i37);
        }
        throw null;
    }

    public final int setDividerPadding() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -126271106, 126271106, System.identityHashCode(this))).intValue();
    }

    public final int setY() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -1722216703, 1722216705, System.identityHashCode(this))).intValue();
    }

    public final int setOnFocusChangeListener() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -1307839193, 1307839194, System.identityHashCode(this))).intValue();
    }
}
