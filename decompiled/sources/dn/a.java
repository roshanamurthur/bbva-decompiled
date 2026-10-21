package dn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.junit.runners.model.RunnerScheduler;

/* JADX INFO: compiled from: ParallelComputer.java */
/* JADX INFO: loaded from: classes13.dex */
public final class a implements RunnerScheduler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f68208a = Executors.newCachedThreadPool();

    @Override // org.junit.runners.model.RunnerScheduler
    public final void finished() {
        ExecutorService executorService = this.f68208a;
        try {
            executorService.shutdown();
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e5) {
            e5.printStackTrace(System.err);
        }
    }

    @Override // org.junit.runners.model.RunnerScheduler
    public final void schedule(Runnable runnable) {
        this.f68208a.submit(runnable);
    }
}
