package uf;

import androidx.annotation.VisibleForTesting;
import com.google.firebase.concurrent.PausableExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: PausableExecutorImpl.java */
/* JADX INFO: loaded from: classes10.dex */
public final class u implements PausableExecutor {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Executor f93838q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @VisibleForTesting
    public final LinkedBlockingQueue<Runnable> f93839r0 = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public volatile boolean f93837p0 = false;

    public u(Executor executor) {
        this.f93838q0 = executor;
    }

    public final void a() {
        if (this.f93837p0) {
            return;
        }
        Runnable runnablePoll = this.f93839r0.poll();
        while (runnablePoll != null) {
            this.f93838q0.execute(runnablePoll);
            runnablePoll = !this.f93837p0 ? this.f93839r0.poll() : null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f93839r0.offer(runnable);
        a();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public final boolean isPaused() {
        return this.f93837p0;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public final void pause() {
        this.f93837p0 = true;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public final void resume() {
        this.f93837p0 = false;
        a();
    }
}
