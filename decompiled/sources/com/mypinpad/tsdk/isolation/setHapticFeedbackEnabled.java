package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class setHapticFeedbackEnabled implements onPinPadLaunchRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59769b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f59770a;

    public setHapticFeedbackEnabled(boolean z10) {
        this.f59770a = z10;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        setHapticFeedbackEnabled sethapticfeedbackenabled = (setHapticFeedbackEnabled) objArr[0];
        int i13 = f59769b;
        int i14 = (-2) - (((i13 & 40) + (i13 | 40)) ^ (-1));
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        boolean z10 = sethapticfeedbackenabled.f59770a;
        int i17 = (((i15 ^ 43) | (i15 & 43)) << 1) - (((~i15) & 43) | (i15 & (-44)));
        f59769b = i17 % 128;
        int i18 = i17 % 2;
        return Boolean.valueOf(z10);
    }

    public final boolean setDividerPadding() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 1689880744, -1689880744, System.identityHashCode(this))).booleanValue();
    }
}
