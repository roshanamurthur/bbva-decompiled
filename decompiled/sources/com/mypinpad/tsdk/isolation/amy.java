package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public class amy extends amw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f53276s0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final anh f53277r0;

    public amy(anh anhVar) {
        super(false);
        this.f53277r0 = anhVar;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        amy amyVar = (amy) objArr[0];
        int i13 = f53276s0;
        int i14 = i13 & 81;
        int i15 = (i13 | 81) & (~i14);
        int i16 = -(-(i14 << 1));
        int i17 = (i15 & i16) + (i15 | i16);
        int i18 = i17 % 128;
        int i19 = i17 % 2;
        anh anhVar = amyVar.f53277r0;
        int i20 = i18 & 17;
        int i21 = -(-((i18 ^ 17) | i20));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        f53276s0 = i22 % 128;
        int i23 = i22 % 2;
        return anhVar;
    }

    public final anh setY() {
        return (anh) setX(new Object[]{this}, -1790706632, 1790706632, System.identityHashCode(this));
    }
}
