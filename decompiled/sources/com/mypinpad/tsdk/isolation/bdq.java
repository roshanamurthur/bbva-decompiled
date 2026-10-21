package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class bdq extends bdn {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f54583w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f54584x0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f54585t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f54586u0;
    public final bdv v0;

    public bdq(int i10, int i11, bdv bdvVar, String str) {
        super(false, str);
        this.f54585t0 = i10;
        this.f54586u0 = i11;
        this.v0 = new bdv(bdvVar);
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ((i10 | i12 | i13) * (-676)) + (i11 * (-675)) + (i10 * 677);
        int i15 = ~(i13 | i10);
        int i16 = ~i12;
        int i17 = (((~(i10 | i11 | i12)) | (~((~i10) | i13)) | (~(i13 | i16))) * 676) + ((i15 | (~(i16 | i10))) * 676) + i14;
        if (i17 == 1) {
            bdq bdqVar = (bdq) objArr[0];
            int i18 = f54583w0;
            int i19 = i18 & 101;
            int i20 = -(-(i18 | 101));
            int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
            f54584x0 = i21 % 128;
            int i22 = i21 % 2;
            int i23 = bdqVar.f54586u0;
            int i24 = (i18 & 63) + (i18 | 63);
            f54584x0 = i24 % 128;
            if (i24 % 2 != 0) {
                return Integer.valueOf(i23);
            }
            throw null;
        }
        if (i17 == 2) {
            bdq bdqVar2 = (bdq) objArr[0];
            int i25 = f54584x0;
            int i26 = (((i25 ^ 63) | (i25 & 63)) << 1) - (((~i25) & 63) | (i25 & (-64)));
            f54583w0 = i26 % 128;
            int i27 = i26 % 2;
            int i28 = bdqVar2.f54585t0;
            if (i27 == 0) {
                return Integer.valueOf(i28);
            }
            throw null;
        }
        bdq bdqVar3 = (bdq) objArr[0];
        int i29 = f54584x0 + 115;
        int i30 = i29 % 128;
        f54583w0 = i30;
        int i31 = i29 % 2;
        bdv bdvVar = bdqVar3.v0;
        if (i31 != 0) {
            throw null;
        }
        int i32 = i30 & 93;
        int i33 = -(-(i30 | 93));
        int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
        f54584x0 = i34 % 128;
        int i35 = i34 % 2;
        return bdvVar;
    }

    public final bdv setCompoundDrawableTintBlendMode() {
        return (bdv) setX(new Object[]{this}, -1639165724, 1639165724, System.identityHashCode(this));
    }

    public final int setDividerPadding() {
        return ((Integer) setX(new Object[]{this}, -1763197588, 1763197589, System.identityHashCode(this))).intValue();
    }

    public final int setY() {
        return ((Integer) setX(new Object[]{this}, 1061510979, -1061510977, System.identityHashCode(this))).intValue();
    }
}
