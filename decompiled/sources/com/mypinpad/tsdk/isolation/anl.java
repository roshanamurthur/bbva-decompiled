package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class anl extends anm {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final apl f53331s0;

    public anl(apl aplVar, ang angVar) {
        super(angVar);
        this.f53331s0 = (apl) ang.setOnFocusChangeListener(new Object[]{angVar, aplVar}, 54804998, -54804995, System.identityHashCode(angVar));
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        return ((anl) objArr[0]).f53331s0;
    }

    public final apl setY() {
        return (apl) setX(new Object[]{this}, -504564904, 504564904, System.identityHashCode(this));
    }
}
