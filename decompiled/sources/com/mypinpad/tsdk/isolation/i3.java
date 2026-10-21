package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f56329a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56330b = 1;

    public static /* synthetic */ adu a(Object[] objArr) {
        String str = (String) objArr[0];
        int i10 = f56329a;
        int i11 = i10 & 97;
        int i12 = (((i10 | 97) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
        f56330b = i12 % 128;
        if (i12 % 2 == 0) {
            str.equals("SHA-256");
            throw null;
        }
        if (str.equals("SHA-256")) {
            adu aduVar = ahp.setDividerPadding;
            int i13 = f56330b;
            int i14 = (i13 ^ 105) + ((i13 & 105) << 1);
            f56329a = i14 % 128;
            int i15 = i14 % 2;
            return aduVar;
        }
        if (str.equals("SHA-512")) {
            int i16 = f56330b;
            int i17 = i16 ^ 97;
            int i18 = ((i16 & 97) | i17) << 1;
            int i19 = -i17;
            int i20 = (i18 & i19) + (i18 | i19);
            f56329a = i20 % 128;
            int i21 = i20 % 2;
            adu aduVar2 = ahp.setOnFocusChangeListener;
            int i22 = f56329a;
            int i23 = (-2) - ((((i22 | 28) << 1) - (i22 ^ 28)) ^ (-1));
            f56330b = i23 % 128;
            if (i23 % 2 != 0) {
                return aduVar2;
            }
            throw null;
        }
        if (!str.equals("SHAKE128")) {
            if (!str.equals("SHAKE256")) {
                throw new IllegalArgumentException("unrecognized digest: ".concat(str));
            }
            int i24 = f56329a;
            int i25 = i24 | 13;
            int i26 = i25 << 1;
            int i27 = -((~(i24 & 13)) & i25);
            int i28 = (i26 & i27) + (i27 | i26);
            f56330b = i28 % 128;
            int i29 = i28 % 2;
            adu aduVar3 = ahp.setZ;
            int i30 = f56329a;
            int i31 = (i30 & 59) + (i30 | 59);
            f56330b = i31 % 128;
            if (i31 % 2 != 0) {
                return aduVar3;
            }
            throw null;
        }
        int i32 = f56329a;
        int i33 = (i32 & 67) + (i32 | 67);
        f56330b = i33 % 128;
        if (i33 % 2 == 0) {
            adu aduVar4 = ahp.setY;
            throw null;
        }
        adu aduVar5 = ahp.setIncludeFontPadding;
        int i34 = f56329a;
        int i35 = i34 & 25;
        int i36 = (i34 | 25) & (~i35);
        int i37 = -(-(i35 << 1));
        int i38 = (i36 & i37) + (i36 | i37);
        f56330b = i38 % 128;
        if (i38 % 2 != 0) {
            return aduVar5;
        }
        throw null;
    }
}
