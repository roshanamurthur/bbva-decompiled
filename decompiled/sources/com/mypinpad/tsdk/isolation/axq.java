package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class axq extends axm {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54098t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54099u0 = 1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54100s0;

    public axq(axp axpVar, byte[] bArr) {
        super(axpVar);
        this.f54100s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        int i13 = ~i11;
        int i14 = ~i10;
        int i15 = ~i12;
        if (((~(i10 | i11)) * 933) + (((~(i15 | i13)) | (~(i13 | i10))) * 933) + (((~(i14 | i15)) | i13) * (-933)) + (i11 * (-932)) + (i10 * 934) != 1) {
            axq axqVar = (axq) objArr[0];
            int i16 = f54098t0;
            int i17 = (i16 ^ 83) + ((i16 & 83) << 1);
            f54099u0 = i17 % 128;
            int i18 = i17 % 2;
            bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{axqVar.f54100s0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i19 = f54099u0;
            int i20 = (i19 ^ 112) + ((i19 & 112) << 1);
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            f54098t0 = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 32 / 0;
            }
        } else {
            axq axqVar2 = (axq) objArr[0];
            int i23 = f54098t0;
            int i24 = (i23 ^ 67) + ((i23 & 67) << 1);
            f54099u0 = i24 % 128;
            if (i24 % 2 == 0) {
                throw null;
            }
            bArr = (byte[]) setDividerPadding(new Object[]{axqVar2}, 796919525, -796919525, System.identityHashCode(axqVar2));
            int i25 = f54099u0;
            int i26 = (i25 & (-48)) | ((~i25) & 47);
            int i27 = (i25 & 47) << 1;
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            f54098t0 = i28 % 128;
            if (i28 % 2 != 0) {
                throw null;
            }
        }
        return bArr;
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setDividerPadding(new Object[]{this}, 1321634915, -1321634914, System.identityHashCode(this));
    }
}
