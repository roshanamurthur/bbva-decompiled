package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class q1 implements apu {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f57799d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f57800e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f57801a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f57802b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f57803c = false;

    public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~((~i10) | i11);
        int i14 = ~i12;
        int i15 = (((~(i14 | i11)) | i13) * (-1188)) + (i11 * (-1187)) + (i10 * 595);
        int i16 = ~i11;
        int i17 = (~(i12 | i16)) | i13;
        int i18 = ~(i14 | i10);
        int i19 = (((~(i10 | i16)) | (~(i16 | i14)) | i18) * 594) + ((i17 | i18) * 594) + i15;
        if (i19 == 1) {
            q1 q1Var = (q1) objArr[0];
            int i20 = f57799d + 81;
            int i21 = i20 % 128;
            f57800e = i21;
            int i22 = i20 % 2;
            q1Var.f57802b = true;
            int i23 = i21 & 77;
            int i24 = (((~i23) & (i21 | 77)) - (~(-(-(i23 << 1))))) - 1;
            f57799d = i24 % 128;
            int i25 = i24 % 2;
            return null;
        }
        if (i19 == 2) {
            q1 q1Var2 = (q1) objArr[0];
            int i26 = f57799d;
            int i27 = ((i26 | 39) << 1) - (i26 ^ 39);
            f57800e = i27 % 128;
            int i28 = i27 % 2;
            q1Var2.f57801a = true;
            int i29 = i26 + 13;
            f57800e = i29 % 128;
            if (i29 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (i19 == 3) {
            q1 q1Var3 = (q1) objArr[0];
            int i30 = f57799d;
            int i31 = (i30 ^ 65) + ((i30 & 65) << 1);
            int i32 = i31 % 128;
            f57800e = i32;
            int i33 = i31 % 2;
            boolean z10 = q1Var3.f57803c;
            int i34 = (((i32 | 125) << 1) - (~(-(i32 ^ 125)))) - 1;
            f57799d = i34 % 128;
            int i35 = i34 % 2;
            return Boolean.valueOf(z10);
        }
        if (i19 == 4) {
            q1 q1Var4 = (q1) objArr[0];
            int i36 = f57800e;
            int i37 = ((i36 ^ 3) | (i36 & 3)) << 1;
            int i38 = -(((~i36) & 3) | (i36 & (-4)));
            int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
            f57799d = i39 % 128;
            int i40 = i39 % 2;
            boolean z11 = q1Var4.f57801a;
            if (i40 == 0) {
                return Boolean.valueOf(z11);
            }
            throw null;
        }
        if (i19 != 5) {
            q1 q1Var5 = (q1) objArr[0];
            int i41 = f57800e;
            int i42 = (-2) - ((i41 + 28) ^ (-1));
            f57799d = i42 % 128;
            int i43 = i42 % 2;
            q1Var5.f57803c = true;
            int i44 = i41 ^ 75;
            int i45 = (i41 & 75) << 1;
            int i46 = (i44 & i45) + (i44 | i45);
            f57799d = i46 % 128;
            if (i46 % 2 == 0) {
                return null;
            }
            throw null;
        }
        q1 q1Var6 = (q1) objArr[0];
        int i47 = f57799d;
        int i48 = i47 & 63;
        int i49 = -(-((i47 ^ 63) | i48));
        int i50 = (i48 & i49) + (i49 | i48);
        int i51 = i50 % 128;
        f57800e = i51;
        int i52 = i50 % 2;
        boolean z12 = q1Var6.f57802b;
        int i53 = i51 & 99;
        int i54 = i53 + ((i51 ^ 99) | i53);
        f57799d = i54 % 128;
        if (i54 % 2 != 0) {
            int i55 = 49 / 0;
        }
        return Boolean.valueOf(z12);
    }
}
