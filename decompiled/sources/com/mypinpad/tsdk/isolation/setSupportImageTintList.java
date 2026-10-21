package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class setSupportImageTintList {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60611c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60612d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f60613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60614b;

    public setSupportImageTintList(int i10, int i11) {
        this.f60613a = i10;
        this.f60614b = i11;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 949) + (i10 * (-947));
        int i14 = ~i10;
        int i15 = ~i11;
        if (((i10 | i15) * 948) + ((~((~i12) | i14 | i15)) * (-948)) + (((~(i15 | i12)) | i14) * (-948)) + i13 == 1) {
            setSupportImageTintList setsupportimagetintlist = (setSupportImageTintList) objArr[0];
            int i16 = f60611c;
            int i17 = i16 & 83;
            int i18 = (i16 ^ 83) | i17;
            int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
            f60612d = i19 % 128;
            int i20 = i19 % 2;
            int i21 = setsupportimagetintlist.f60614b;
            int i22 = i16 + 107;
            f60612d = i22 % 128;
            if (i22 % 2 != 0) {
                return Integer.valueOf(i21);
            }
            throw null;
        }
        setSupportImageTintList setsupportimagetintlist2 = (setSupportImageTintList) objArr[0];
        int i23 = f60612d;
        int i24 = (i23 & (-50)) | ((~i23) & 49);
        int i25 = (i23 & 49) << 1;
        int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
        f60611c = i26 % 128;
        int i27 = i26 % 2;
        int i28 = setsupportimagetintlist2.f60613a;
        if (i27 != 0) {
            throw null;
        }
        int i29 = (i23 ^ 3) + ((i23 & 3) << 1);
        f60611c = i29 % 128;
        int i30 = i29 % 2;
        return Integer.valueOf(i28);
    }

    public final int setOnFocusChangeListener() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 1397292818, -1397292817, System.identityHashCode(this))).intValue();
    }

    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -425827594, 425827594, System.identityHashCode(this))).intValue();
    }
}
