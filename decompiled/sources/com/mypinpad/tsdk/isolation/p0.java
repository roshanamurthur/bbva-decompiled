package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final agi f57611a = new agi();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ago f57612b = new ago();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f57613c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f57614d = 1;

    static {
        int i10 = f57613c + 29;
        f57614d = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ ady a(Object[] objArr, int i10, int i11, int i12) {
        ago agoVar;
        int i13 = (i11 * 334) + (i10 * (-665));
        int i14 = ~i10;
        int i15 = (i14 * (-333)) + i13;
        int i16 = ~i12;
        if ((((~(i14 | i12)) | (~(i11 | i16))) * 333) + (((~(i14 | i16)) | (~(i11 | i12))) * 333) + i15 != 1) {
            adh adhVar = (adh) objArr[0];
            int i17 = f57613c;
            int i18 = ((i17 & (-84)) | ((~i17) & 83)) + ((i17 & 83) << 1);
            f57614d = i18 % 128;
            if (i18 % 2 == 0) {
                ((Integer) adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar}, -186238093, 186238095, System.identityHashCode(adhVar))).intValue();
                throw null;
            }
            if (((Integer) adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar}, -186238093, 186238095, System.identityHashCode(adhVar))).intValue() <= 0) {
                int i19 = f57614d + 16;
                int i20 = (i19 ^ (-1)) + (i19 << 1);
                f57613c = i20 % 128;
                int i21 = i20 % 2;
                return f57611a;
            }
            agi agiVar = new agi(adhVar);
            int i22 = f57613c;
            int i23 = i22 & 103;
            int i24 = i23 + ((i22 ^ 103) | i23);
            f57614d = i24 % 128;
            if (i24 % 2 != 0) {
                return agiVar;
            }
            throw null;
        }
        adh adhVar2 = (adh) objArr[0];
        int i25 = f57613c;
        int i26 = (i25 | 107) << 1;
        int i27 = -(i25 ^ 107);
        int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
        f57614d = i28 % 128;
        int i29 = i28 % 2;
        if (((Integer) adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2}, -186238093, 186238095, System.identityHashCode(adhVar2))).intValue() <= 0) {
            int i30 = f57614d;
            int i31 = i30 & 69;
            int i32 = -(-(i30 | 69));
            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
            int i34 = i33 % 128;
            f57613c = i34;
            int i35 = i33 % 2;
            int i36 = (-2) - ((i34 + 88) ^ (-1));
            f57614d = i36 % 128;
            int i37 = i36 % 2;
            agoVar = f57612b;
            if (i37 == 0) {
                int i38 = 73 / 0;
            }
        } else {
            agoVar = new ago(adhVar2);
            int i39 = f57614d;
            int i40 = ((i39 | 111) << 1) - (i39 ^ 111);
            f57613c = i40 % 128;
            int i41 = i40 % 2;
        }
        return agoVar;
    }
}
