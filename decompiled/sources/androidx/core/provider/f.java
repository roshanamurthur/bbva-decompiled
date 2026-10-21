package androidx.core.provider;

import androidx.core.util.Consumer;

/* JADX INFO: compiled from: FontRequestWorker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements Consumer<i.a> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ c f20057p0;

    public f(c cVar) {
        this.f20057p0 = cVar;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(i.a aVar) {
        i.a aVar2 = aVar;
        if (aVar2 == null) {
            aVar2 = new i.a(-3);
        }
        this.f20057p0.a(aVar2);
    }
}
