package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class xa extends wi {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f61764s0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final float f61765r0;

    public xa(float f6) {
        super(wm.setX, null);
        this.f61765r0 = f6;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        xa xaVar = (xa) objArr[0];
        int i13 = f61764s0;
        int i14 = (i13 ^ 67) + ((i13 & 67) << 1);
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        float f6 = xaVar.f61765r0;
        int i17 = i15 + 92;
        int i18 = (i17 ^ (-1)) + (i17 << 1);
        f61764s0 = i18 % 128;
        if (i18 % 2 == 0) {
            return Float.valueOf(f6);
        }
        throw null;
    }

    public final float setY() {
        return ((Float) setX(new Object[]{this}, 952668471, -952668471, System.identityHashCode(this))).floatValue();
    }
}
