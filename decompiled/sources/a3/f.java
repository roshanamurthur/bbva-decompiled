package a3;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Executor {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f187p0;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i10 = this.f187p0;
        runnable.run();
    }
}
