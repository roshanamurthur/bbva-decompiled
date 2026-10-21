package uf;

import com.google.firebase.concurrent.PausableExecutorService;
import com.google.firebase.concurrent.PausableScheduledExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PausableScheduledExecutorServiceImpl.java */
/* JADX INFO: loaded from: classes10.dex */
public final class y extends i implements PausableScheduledExecutorService {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final PausableExecutorService f93845r0;

    public y(PausableExecutorService pausableExecutorService, ScheduledExecutorService scheduledExecutorService) {
        super(pausableExecutorService, scheduledExecutorService);
        this.f93845r0 = pausableExecutorService;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public final boolean isPaused() {
        return this.f93845r0.isPaused();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public final void pause() {
        this.f93845r0.pause();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public final void resume() {
        this.f93845r0.resume();
    }

    @Override // uf.i, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // uf.i, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
