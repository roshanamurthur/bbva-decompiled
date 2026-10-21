package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class azn extends azl {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54207t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54208u0 = 1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54209s0;

    public azn(azk azkVar, byte[] bArr) {
        super(false, azkVar);
        this.f54209s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        int i16 = ~i12;
        int i17 = (~(i13 | i16)) | i15 | (~(i14 | i16));
        int i18 = i10 | i11;
        int i19 = ((i17 | (~(i18 | i12))) * (-84)) + (i11 * 85) + (i10 * 85);
        int i20 = i10 | (~(i12 | i14));
        int i21 = ~(i11 | i16);
        if (((i21 | (~i18)) * 84) + ((i20 | i21) * (-84)) + i19 != 1) {
            azn aznVar = (azn) objArr[0];
            int i22 = f54208u0;
            int i23 = i22 & 43;
            int i24 = (((i22 ^ 43) | i23) << 1) - ((i22 | 43) & (~i23));
            f54207t0 = i24 % 128;
            if (i24 % 2 != 0) {
                bArr = (byte[]) setDividerPadding(new Object[]{aznVar}, 1969517592, -1969517591, System.identityHashCode(aznVar));
                int i25 = 84 / 0;
            } else {
                bArr = (byte[]) setDividerPadding(new Object[]{aznVar}, 1969517592, -1969517591, System.identityHashCode(aznVar));
            }
            int i26 = f54208u0;
            int i27 = (i26 & 51) + (i26 | 51);
            f54207t0 = i27 % 128;
            int i28 = i27 % 2;
        } else {
            azn aznVar2 = (azn) objArr[0];
            int i29 = f54207t0;
            int i30 = ((i29 ^ 5) | (i29 & 5)) << 1;
            int i31 = -(((~i29) & 5) | (i29 & (-6)));
            int i32 = (i30 & i31) + (i31 | i30);
            f54208u0 = i32 % 128;
            int i33 = i32 % 2;
            byte[] bArr2 = aznVar2.f54209s0;
            if (i33 == 0) {
                bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i34 = 77 / 0;
            } else {
                bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
            }
            int i35 = f54208u0;
            int i36 = (i35 & (-46)) | ((~i35) & 45);
            int i37 = -(-((i35 & 45) << 1));
            int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
            f54207t0 = i38 % 128;
            if (i38 % 2 != 0) {
                throw null;
            }
        }
        return bArr;
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setDividerPadding(new Object[]{this}, 2106142597, -2106142597, System.identityHashCode(this));
    }
}
