package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class setOutlineProvider implements onPinPadLaunchRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60269b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f60270a;

    public setOutlineProvider(boolean z10) {
        this.f60270a = z10;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        setOutlineProvider setoutlineprovider = (setOutlineProvider) objArr[0];
        int i13 = f60269b;
        int i14 = ((i13 & (-82)) | ((~i13) & 81)) + ((i13 & 81) << 1);
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        boolean z10 = setoutlineprovider.f60270a;
        int i17 = (i15 | 123) << 1;
        int i18 = -(((~i15) & 123) | (i15 & (-124)));
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        f60269b = i19 % 128;
        int i20 = i19 % 2;
        return Boolean.valueOf(z10);
    }

    public final boolean setCompoundDrawableTintBlendMode() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 1815248043, -1815248043, System.identityHashCode(this))).booleanValue();
    }
}
