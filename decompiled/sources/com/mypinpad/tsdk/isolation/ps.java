package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class ps extends px {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57736b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Throwable f57737a;

    public ps(@Nullable Throwable th2) {
        super(null);
        this.f57737a = th2;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        ps psVar = (ps) objArr[0];
        int i13 = f57736b;
        int i14 = ((i13 ^ 91) | (i13 & 91)) << 1;
        int i15 = -(((~i13) & 91) | (i13 & (-92)));
        int i16 = (i14 & i15) + (i15 | i14);
        int i17 = i16 % 128;
        int i18 = i16 % 2;
        Throwable th2 = psVar.f57737a;
        int i19 = i17 + 57;
        f57736b = i19 % 128;
        int i20 = i19 % 2;
        return th2;
    }

    @Nullable
    public final Throwable setDividerPadding() {
        return (Throwable) setY(new Object[]{this}, 971954812, -971954812, System.identityHashCode(this));
    }
}
