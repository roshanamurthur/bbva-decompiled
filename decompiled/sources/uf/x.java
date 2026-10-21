package uf;

import com.google.firebase.concurrent.PausableExecutorService;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PausableExecutorServiceImpl.java */
/* JADX INFO: loaded from: classes10.dex */
public final class x implements PausableExecutorService {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ExecutorService f93843p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final u f93844q0;

    public x(ExecutorService executorService) {
        this.f93843p0 = executorService;
        this.f93844q0 = new u(executorService);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f93843p0.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f93844q0.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f93843p0.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f93843p0.invokeAny(collection);
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public final boolean isPaused() {
        return this.f93844q0.f93837p0;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f93843p0.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f93843p0.isTerminated();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public final void pause() {
        this.f93844q0.f93837p0 = true;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public final void resume() {
        this.f93844q0.resume();
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
        FutureTask futureTask = new FutureTask(callable);
        execute(futureTask);
        return futureTask;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f93843p0.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f93843p0.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(final Runnable runnable, final T t10) {
        return submit(new Callable() { // from class: uf.v
            @Override // java.util.concurrent.Callable
            public final Object call() {
                runnable.run();
                return t10;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(final Runnable runnable) {
        return submit(new Callable() { // from class: uf.w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                runnable.run();
                return null;
            }
        });
    }
}
