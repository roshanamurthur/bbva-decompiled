package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public class ank extends ang {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final adu f53330h;

    public ank(adu aduVar, ajz ajzVar) {
        super(ajzVar);
        this.f53330h = aduVar;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        return ((ank) objArr[0]).f53330h;
    }

    public final adu setLayoutAnimation() {
        return (adu) setDividerPadding(new Object[]{this}, -1737123400, 1737123400, System.identityHashCode(this));
    }

    public ank(adu aduVar, ang angVar) {
        super(angVar.setDividerPadding(), angVar.setCompoundDrawableTintBlendMode(), angVar.setY(), angVar.setOnFocusChangeListener(), angVar.setX());
        this.f53330h = aduVar;
    }
}
