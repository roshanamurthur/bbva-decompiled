package hg;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Executor {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c f69427p0 = new c();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
