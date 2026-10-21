package xf;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: CrashlyticsBackgroundWorker.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f implements Callable<Void> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Runnable f94614p0;

    public f(l lVar) {
        this.f94614p0 = lVar;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        this.f94614p0.run();
        return null;
    }
}
