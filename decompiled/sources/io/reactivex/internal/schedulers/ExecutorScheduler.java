package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ExecutorScheduler extends Scheduler {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Scheduler f73639t0 = Schedulers.single();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f73640r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NonNull
    public final Executor f73641s0;

    public final class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b f73655p0;

        public a(b bVar) {
            this.f73655p0 = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = this.f73655p0;
            bVar.f73658q0.replace(ExecutorScheduler.this.scheduleDirect(bVar));
        }
    }

    public static final class b extends AtomicReference<Runnable> implements Runnable, Disposable, SchedulerRunnableIntrospection {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SequentialDisposable f73657p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SequentialDisposable f73658q0;

        public b(Runnable runnable) {
            super(runnable);
            this.f73657p0 = new SequentialDisposable();
            this.f73658q0 = new SequentialDisposable();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(null) != null) {
                this.f73657p0.dispose();
                this.f73658q0.dispose();
            }
        }

        @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
        public final Runnable getWrappedRunnable() {
            Runnable runnable = get();
            return runnable != null ? runnable : Functions.EMPTY_RUNNABLE;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SequentialDisposable sequentialDisposable = this.f73658q0;
            SequentialDisposable sequentialDisposable2 = this.f73657p0;
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                    lazySet(null);
                    sequentialDisposable2.lazySet(DisposableHelper.DISPOSED);
                } finally {
                    lazySet(null);
                    sequentialDisposable2.lazySet(DisposableHelper.DISPOSED);
                    sequentialDisposable.lazySet(DisposableHelper.DISPOSED);
                }
            }
        }
    }

    public ExecutorScheduler(@NonNull Executor executor, boolean z10) {
        this.f73641s0 = executor;
        this.f73640r0 = z10;
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new ExecutorWorker(this.f73641s0, this.f73640r0);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable) {
        Executor executor = this.f73641s0;
        Runnable runnableOnSchedule = RxJavaPlugins.onSchedule(runnable);
        try {
            if (executor instanceof ExecutorService) {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnableOnSchedule);
                scheduledDirectTask.setFuture(((ExecutorService) executor).submit(scheduledDirectTask));
                return scheduledDirectTask;
            }
            if (this.f73640r0) {
                ExecutorWorker.b bVar = new ExecutorWorker.b(runnableOnSchedule, null);
                executor.execute(bVar);
                return bVar;
            }
            ExecutorWorker.a aVar = new ExecutorWorker.a(runnableOnSchedule);
            executor.execute(aVar);
            return aVar;
        } catch (RejectedExecutionException e5) {
            RxJavaPlugins.onError(e5);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Executor executor = this.f73641s0;
        if (!(executor instanceof ScheduledExecutorService)) {
            return super.schedulePeriodicallyDirect(runnable, j10, j11, timeUnit);
        }
        try {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(RxJavaPlugins.onSchedule(runnable));
            scheduledDirectPeriodicTask.setFuture(((ScheduledExecutorService) executor).scheduleAtFixedRate(scheduledDirectPeriodicTask, j10, j11, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e5) {
            RxJavaPlugins.onError(e5);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable, long j10, TimeUnit timeUnit) {
        Runnable runnableOnSchedule = RxJavaPlugins.onSchedule(runnable);
        Executor executor = this.f73641s0;
        if (executor instanceof ScheduledExecutorService) {
            try {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnableOnSchedule);
                scheduledDirectTask.setFuture(((ScheduledExecutorService) executor).schedule(scheduledDirectTask, j10, timeUnit));
                return scheduledDirectTask;
            } catch (RejectedExecutionException e5) {
                RxJavaPlugins.onError(e5);
                return EmptyDisposable.INSTANCE;
            }
        }
        b bVar = new b(runnableOnSchedule);
        bVar.f73657p0.replace(f73639t0.scheduleDirect(new a(bVar), j10, timeUnit));
        return bVar;
    }

    public static final class ExecutorWorker extends Scheduler.Worker implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final boolean f73642p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Executor f73643q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f73645s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicInteger f73646t0 = new AtomicInteger();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final CompositeDisposable f73647u0 = new CompositeDisposable();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final MpscLinkedQueue<Runnable> f73644r0 = new MpscLinkedQueue<>();

        public static final class a extends AtomicBoolean implements Runnable, Disposable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Runnable f73648p0;

            public a(Runnable runnable) {
                this.f73648p0 = runnable;
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                lazySet(true);
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean isDisposed() {
                return get();
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get()) {
                    return;
                }
                try {
                    this.f73648p0.run();
                } finally {
                    lazySet(true);
                }
            }
        }

        public static final class b extends AtomicInteger implements Runnable, Disposable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Runnable f73649p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final DisposableContainer f73650q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public volatile Thread f73651r0;

            public b(Runnable runnable, CompositeDisposable compositeDisposable) {
                this.f73649p0 = runnable;
                this.f73650q0 = compositeDisposable;
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                while (true) {
                    int i10 = get();
                    if (i10 >= 2) {
                        return;
                    }
                    if (i10 == 0) {
                        if (compareAndSet(0, 4)) {
                            DisposableContainer disposableContainer = this.f73650q0;
                            if (disposableContainer != null) {
                                disposableContainer.delete(this);
                                return;
                            }
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.f73651r0;
                        if (thread != null) {
                            thread.interrupt();
                            this.f73651r0 = null;
                        }
                        set(4);
                        DisposableContainer disposableContainer2 = this.f73650q0;
                        if (disposableContainer2 != null) {
                            disposableContainer2.delete(this);
                            return;
                        }
                        return;
                    }
                }
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean isDisposed() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get() == 0) {
                    this.f73651r0 = Thread.currentThread();
                    if (!compareAndSet(0, 1)) {
                        this.f73651r0 = null;
                        return;
                    }
                    try {
                        this.f73649p0.run();
                        this.f73651r0 = null;
                        if (compareAndSet(1, 2)) {
                        } else {
                            while (i == i) {
                                Thread.yield();
                            }
                        }
                    } finally {
                        this.f73651r0 = null;
                        if (compareAndSet(1, 2)) {
                            DisposableContainer disposableContainer = this.f73650q0;
                            if (disposableContainer != null) {
                                disposableContainer.delete(this);
                            }
                        } else {
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        }
                    }
                }
            }
        }

        public final class c implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final SequentialDisposable f73652p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final Runnable f73653q0;

            public c(SequentialDisposable sequentialDisposable, Runnable runnable) {
                this.f73652p0 = sequentialDisposable;
                this.f73653q0 = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f73652p0.replace(ExecutorWorker.this.schedule(this.f73653q0));
            }
        }

        public ExecutorWorker(Executor executor, boolean z10) {
            this.f73643q0 = executor;
            this.f73642p0 = z10;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.f73645s0) {
                return;
            }
            this.f73645s0 = true;
            this.f73647u0.dispose();
            if (this.f73646t0.getAndIncrement() == 0) {
                this.f73644r0.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f73645s0;
        }

        @Override // java.lang.Runnable
        public void run() {
            MpscLinkedQueue<Runnable> mpscLinkedQueue = this.f73644r0;
            int iAddAndGet = 1;
            while (!this.f73645s0) {
                while (true) {
                    Runnable runnablePoll = mpscLinkedQueue.poll();
                    if (runnablePoll == null) {
                        break;
                    }
                    runnablePoll.run();
                    if (this.f73645s0) {
                        mpscLinkedQueue.clear();
                        return;
                    }
                }
                if (this.f73645s0) {
                    mpscLinkedQueue.clear();
                    return;
                } else {
                    iAddAndGet = this.f73646t0.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            mpscLinkedQueue.clear();
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable) {
            Disposable aVar;
            if (this.f73645s0) {
                return EmptyDisposable.INSTANCE;
            }
            Runnable runnableOnSchedule = RxJavaPlugins.onSchedule(runnable);
            if (this.f73642p0) {
                aVar = new b(runnableOnSchedule, this.f73647u0);
                this.f73647u0.add(aVar);
            } else {
                aVar = new a(runnableOnSchedule);
            }
            this.f73644r0.offer(aVar);
            if (this.f73646t0.getAndIncrement() == 0) {
                try {
                    this.f73643q0.execute(this);
                } catch (RejectedExecutionException e5) {
                    this.f73645s0 = true;
                    this.f73644r0.clear();
                    RxJavaPlugins.onError(e5);
                    return EmptyDisposable.INSTANCE;
                }
            }
            return aVar;
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
            if (j10 <= 0) {
                return schedule(runnable);
            }
            if (this.f73645s0) {
                return EmptyDisposable.INSTANCE;
            }
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(new c(sequentialDisposable2, RxJavaPlugins.onSchedule(runnable)), this.f73647u0);
            this.f73647u0.add(scheduledRunnable);
            Executor executor = this.f73643q0;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    scheduledRunnable.setFuture(((ScheduledExecutorService) executor).schedule((Callable) scheduledRunnable, j10, timeUnit));
                } catch (RejectedExecutionException e5) {
                    this.f73645s0 = true;
                    RxJavaPlugins.onError(e5);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                scheduledRunnable.setFuture(new io.reactivex.internal.schedulers.b(ExecutorScheduler.f73639t0.scheduleDirect(scheduledRunnable, j10, timeUnit)));
            }
            sequentialDisposable.replace(scheduledRunnable);
            return sequentialDisposable2;
        }
    }
}
