package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class awa implements awd {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f54039p0;
    public static final awa setY = new awa(12323, 142);
    public static final awa setDividerPadding = new awa(24659, 206);
    public static final awa setX = new awa(40973, 274);

    public awa(int i10, int i11) {
        this.f54039p0 = i10;
        int i12 = i11 / 2;
        new x1(i10);
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((awa) objArr[0]).f54039p0;
        int i14 = i13 & 7;
        int i15 = -(-((i13 ^ 7) | i14));
        return Integer.valueOf(((i14 & i15) + (i15 | i14)) / 8);
    }

    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -2033182290, 2033182290, System.identityHashCode(this))).intValue();
    }
}
