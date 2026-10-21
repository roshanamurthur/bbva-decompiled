package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class aye extends amw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54149s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54150t0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final short[] f54151r0;

    public aye(short[] sArr) {
        super(true);
        this.f54151r0 = (short[]) bek.setOnFocusChangeListener(new Object[]{sArr}, -54945966, 54945974, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        aye ayeVar = (aye) objArr[0];
        int i13 = f54150t0;
        int i14 = (((i13 | 44) << 1) - (i13 ^ 44)) - 1;
        f54149s0 = i14 % 128;
        int i15 = i14 % 2;
        short[] sArr = (short[]) bek.setOnFocusChangeListener(new Object[]{ayeVar.f54151r0}, -54945966, 54945974, (int) System.currentTimeMillis());
        int i16 = f54149s0 + 99;
        f54150t0 = i16 % 128;
        int i17 = i16 % 2;
        return sArr;
    }

    public final short[] setY() {
        return (short[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 2124642337, -2124642337, System.identityHashCode(this));
    }
}
