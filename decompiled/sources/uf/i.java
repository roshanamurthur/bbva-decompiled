package uf;

import androidx.camera.core.w0;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: DelegatingScheduledExecutorService.java */
/* JADX INFO: loaded from: classes10.dex */
public class i implements ScheduledExecutorService {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ExecutorService f93828p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ScheduledExecutorService f93829q0;

    public i(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f93828p0 = executorService;
        this.f93829q0 = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f93828p0.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f93828p0.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f93828p0.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f93828p0.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f93828p0.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f93828p0.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(final Runnable runnable, final long j10, final TimeUnit timeUnit) {
        return new j(new j.c() { // from class: uf.c
            @Override // uf.j.c
            public final ScheduledFuture a(j.a aVar) {
                i iVar = this.f93804a;
                iVar.getClass();
                return iVar.f93829q0.schedule(new androidx.camera.camera2.internal.g(iVar, runnable, 3, aVar), j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new j(new j.c() { // from class: uf.e
            @Override // uf.j.c
            public final ScheduledFuture a(j.a aVar) {
                long j12 = j10;
                long j13 = j11;
                TimeUnit timeUnit2 = timeUnit;
                i iVar = this.f93813a;
                return iVar.f93829q0.scheduleAtFixedRate(new f(iVar, runnable, 0, aVar), j12, j13, timeUnit2);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new j(new j.c() { // from class: uf.d
            @Override // uf.j.c
            public final ScheduledFuture a(final j.a aVar) {
                long j12 = j10;
                long j13 = j11;
                TimeUnit timeUnit2 = timeUnit;
                final i iVar = this.f93808a;
                ScheduledExecutorService scheduledExecutorService = iVar.f93829q0;
                final Runnable runnable2 = runnable;
                return scheduledExecutorService.scheduleWithFixedDelay(new Runnable() { // from class: uf.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        i iVar2 = iVar;
                        iVar2.getClass();
                        iVar2.f93828p0.execute(new h2.m(runnable2, aVar, 1));
                    }
                }, j12, j13, timeUnit2);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f93828p0.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f93828p0.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f93828p0.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j10, final TimeUnit timeUnit) {
        return new j(new j.c() { // from class: uf.b
            @Override // uf.j.c
            public final ScheduledFuture a(final j.a aVar) {
                final i iVar = this.f93800a;
                iVar.getClass();
                final Callable callable2 = callable;
                return iVar.f93829q0.schedule(new Callable() { // from class: uf.h
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        i iVar2 = iVar;
                        iVar2.getClass();
                        return iVar2.f93828p0.submit(new w0(callable2, aVar, 1));
                    }
                }, j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f93828p0.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f93828p0.submit(runnable);
    }
}
