package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class mv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57157b;

    public mv(int i10, int i11) {
        this.f57156a = i10;
        this.f57157b = i11;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~(i13 | i11);
        int i15 = ~i11;
        int i16 = ((i12 | i14 | (~(i15 | i10))) * 614) + (i11 * (-613)) + (i10 * 615);
        int i17 = ~i12;
        return (((~((i10 | i17) | i11)) | (~((i13 | i15) | i17))) * 614) + (((((~(i13 | i17)) | i14) | (~(i17 | i11))) * (-1228)) + i16) != 1 ? Integer.valueOf(((mv) objArr[0]).f57157b) : Integer.valueOf(((mv) objArr[0]).f57156a);
    }

    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setDividerPadding(new Object[]{this}, 94375366, -94375366, System.identityHashCode(this))).intValue();
    }

    public final int setY() {
        return ((Integer) setDividerPadding(new Object[]{this}, 509932451, -509932450, System.identityHashCode(this))).intValue();
    }
}
