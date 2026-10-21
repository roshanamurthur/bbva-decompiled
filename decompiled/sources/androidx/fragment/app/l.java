package androidx.fragment.app;

import java.util.Objects;

/* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ c.d f21729p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ b0.e f21730q0;

    public l(c.d dVar, b0.e eVar) {
        this.f21729p0 = dVar;
        this.f21730q0 = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21729p0.a();
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(this.f21730q0);
        }
    }
}
