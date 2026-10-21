package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public class anm extends amw {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ang f53332r0;

    public anm(ang angVar) {
        super(false);
        if (angVar == null) {
            throw new NullPointerException("'parameters' cannot be null");
        }
        this.f53332r0 = angVar;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        anm anmVar = (anm) objArr[0];
        ang angVar = anmVar.f53332r0;
        System.identityHashCode(anmVar);
        System.identityHashCode(anmVar);
        return angVar;
    }

    public final ang setCompoundDrawableTintBlendMode() {
        return (ang) setY(new Object[]{this}, 393614266, -393614266, System.identityHashCode(this));
    }
}
