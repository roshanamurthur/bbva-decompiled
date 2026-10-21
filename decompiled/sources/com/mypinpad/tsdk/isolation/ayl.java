package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ayl extends amw {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ayk f54156r0;

    public ayl(boolean z10, ayk aykVar) {
        super(z10);
        this.f54156r0 = aykVar;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        return ((ayl) objArr[0]).f54156r0;
    }

    public final ayk setY() {
        return (ayk) setY(new Object[]{this}, -1691811461, 1691811461, System.identityHashCode(this));
    }
}
