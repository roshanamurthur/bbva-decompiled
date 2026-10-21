package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public class amw implements akk {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f53274q0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f53275p0;

    public amw(boolean z10) {
        this.f53275p0 = z10;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        amw amwVar = (amw) objArr[0];
        int i13 = f53274q0;
        int i14 = i13 & 53;
        int i15 = (((i13 ^ 53) | i14) << 1) - ((i13 | 53) & (~i14));
        int i16 = i15 % 128;
        int i17 = i15 % 2;
        boolean z10 = amwVar.f53275p0;
        int i18 = i16 & 49;
        int i19 = -(-(i16 | 49));
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        f53274q0 = i20 % 128;
        if (i20 % 2 == 0) {
            return Boolean.valueOf(z10);
        }
        throw null;
    }

    public final boolean setX() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 1283892343, -1283892343, System.identityHashCode(this))).booleanValue();
    }
}
