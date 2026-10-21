package v2;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements ThreadFactory {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f93952p0;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f93952p0);
        thread.setPriority(10);
        return thread;
    }
}
