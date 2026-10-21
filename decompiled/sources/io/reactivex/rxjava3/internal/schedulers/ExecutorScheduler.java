package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.SchedulerRunnableIntrospection;
import io.reactivex.rxjava3.schedulers.Schedulers;
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
    public static final Scheduler f77928t0 = Schedulers.single();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f77929q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f77930r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NonNull
    public final Executor f77931s0;

    public final class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b f77945p0;

        public a(b bVar) {
            this.f77945p0 = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = this.f77945p0;
            bVar.f77948q0.replace(ExecutorScheduler.this.scheduleDirect(bVar));
        }
    }

    public static final class b extends AtomicReference<Runnable> implements Runnable, Disposable, SchedulerRunnableIntrospection {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SequentialDisposable f77947p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SequentialDisposable f77948q0;

        public b(Runnable runnable) {
            super(runnable);
            this.f77947p0 = new SequentialDisposable();
            this.f77948q0 = new SequentialDisposable();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (getAndSet(null) != null) {
                this.f77947p0.dispose();
                this.f77948q0.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.schedulers.SchedulerRunnableIntrospection
        public final Runnable getWrappedRunnable() {
            Runnable runnable = get();
            return runnable != null ? runnable : Functions.EMPTY_RUNNABLE;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SequentialDisposable sequentialDisposable = this.f77948q0;
            SequentialDisposable sequentialDisposable2 = this.f77947p0;
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    try {
                        runnable.run();
                        lazySet(null);
                        sequentialDisposable2.lazySet(DisposableHelper.DISPOSED);
                    } finally {
                        lazySet(null);
                        sequentialDisposable2.lazySet(DisposableHelper.DISPOSED);
                        sequentialDisposable.lazySet(DisposableHelper.DISPOSED);
                    }
                } catch (Throwable th2) {
                    RxJavaPlugins.onError(th2);
                    throw th2;
                }
            }
        }
    }

    public ExecutorScheduler(@NonNull Executor executor, boolean z10, boolean z11) {
        this.f77931s0 = executor;
        this.f77929q0 = z10;
        this.f77930r0 = z11;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new ExecutorWorker(this.f77931s0, this.f77929q0, this.f77930r0);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable) {
        Executor executor = this.f77931s0;
        Runnable runnableOnSchedule = RxJavaPlugins.onSchedule(runnable);
        try {
            if (executor instanceof ExecutorService) {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnableOnSchedule);
                scheduledDirectTask.setFuture(((ExecutorService) executor).submit(scheduledDirectTask));
                return scheduledDirectTask;
            }
            if (this.f77929q0) {
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

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Executor executor = this.f77931s0;
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

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable, long j10, TimeUnit timeUnit) {
        Runnable runnableOnSchedule = RxJavaPlugins.onSchedule(runnable);
        Executor executor = this.f77931s0;
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
        bVar.f77947p0.replace(f77928t0.scheduleDirect(new a(bVar), j10, timeUnit));
        return bVar;
    }

    public static final class ExecutorWorker extends Scheduler.Worker implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final boolean f77932p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f77933q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Executor f77934r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f77936t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicInteger f77937u0 = new AtomicInteger();
        public final CompositeDisposable v0 = new CompositeDisposable();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final MpscLinkedQueue<Runnable> f77935s0 = new MpscLinkedQueue<>();

        public static final class a extends AtomicBoolean implements Runnable, Disposable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Runnable f77938p0;

            public a(Runnable runnable) {
                this.f77938p0 = runnable;
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final void dispose() {
                lazySet(true);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final boolean isDisposed() {
                return get();
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get()) {
                    return;
                }
                try {
                    this.f77938p0.run();
                    lazySet(true);
                } catch (Throwable th2) {
                    try {
                        RxJavaPlugins.onError(th2);
                        throw th2;
                    } catch (Throwable th3) {
                        lazySet(true);
                        throw th3;
                    }
                }
            }
        }

        public static final class b extends AtomicInteger implements Runnable, Disposable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Runnable f77939p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final DisposableContainer f77940q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public volatile Thread f77941r0;

            public b(Runnable runnable, CompositeDisposable compositeDisposable) {
                this.f77939p0 = runnable;
                this.f77940q0 = compositeDisposable;
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final void dispose() {
                while (true) {
                    int i10 = get();
                    if (i10 >= 2) {
                        return;
                    }
                    if (i10 == 0) {
                        if (compareAndSet(0, 4)) {
                            DisposableContainer disposableContainer = this.f77940q0;
                            if (disposableContainer != null) {
                                disposableContainer.delete(this);
                                return;
                            }
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.f77941r0;
                        if (thread != null) {
                            thread.interrupt();
                            this.f77941r0 = null;
                        }
                        set(4);
                        DisposableContainer disposableContainer2 = this.f77940q0;
                        if (disposableContainer2 != null) {
                            disposableContainer2.delete(this);
                            return;
                        }
                        return;
                    }
                }
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final boolean isDisposed() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get() == 0) {
                    this.f77941r0 = Thread.currentThread();
                    if (!compareAndSet(0, 1)) {
                        this.f77941r0 = null;
                        return;
                    }
                    try {
                        this.f77939p0.run();
                        this.f77941r0 = null;
                        if (!compareAndSet(1, 2)) {
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        } else {
                            DisposableContainer disposableContainer = this.f77940q0;
                            if (disposableContainer != null) {
                                disposableContainer.delete(this);
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            RxJavaPlugins.onError(th2);
                            throw th2;
                        } catch (Throwable th3) {
                            this.f77941r0 = null;
                            if (compareAndSet(1, 2)) {
                                DisposableContainer disposableContainer2 = this.f77940q0;
                                if (disposableContainer2 != null) {
                                    disposableContainer2.delete(this);
                                }
                            } else {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            }
                            throw th3;
                        }
                    }
                }
            }
        }

        public final class c implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final SequentialDisposable f77942p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final Runnable f77943q0;

            public c(SequentialDisposable sequentialDisposable, Runnable runnable) {
                this.f77942p0 = sequentialDisposable;
                this.f77943q0 = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f77942p0.replace(ExecutorWorker.this.schedule(this.f77943q0));
            }
        }

        public ExecutorWorker(Executor executor, boolean z10, boolean z11) {
            this.f77934r0 = executor;
            this.f77932p0 = z10;
            this.f77933q0 = z11;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.f77936t0) {
                return;
            }
            this.f77936t0 = true;
            this.v0.dispose();
            if (this.f77937u0.getAndIncrement() == 0) {
                this.f77935s0.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f77936t0;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f77933q0) {
                MpscLinkedQueue<Runnable> mpscLinkedQueue = this.f77935s0;
                if (this.f77936t0) {
                    mpscLinkedQueue.clear();
                    return;
                }
                mpscLinkedQueue.poll().run();
                if (this.f77936t0) {
                    mpscLinkedQueue.clear();
                    return;
                } else {
                    if (this.f77937u0.decrementAndGet() != 0) {
                        this.f77934r0.execute(this);
                        return;
                    }
                    return;
                }
            }
            MpscLinkedQueue<Runnable> mpscLinkedQueue2 = this.f77935s0;
            int iAddAndGet = 1;
            while (!this.f77936t0) {
                while (true) {
                    Runnable runnablePoll = mpscLinkedQueue2.poll();
                    if (runnablePoll == null) {
                        break;
                    }
                    runnablePoll.run();
                    if (this.f77936t0) {
                        mpscLinkedQueue2.clear();
                        return;
                    }
                }
                if (this.f77936t0) {
                    mpscLinkedQueue2.clear();
                    return;
                } else {
                    iAddAndGet = this.f77937u0.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            mpscLinkedQueue2.clear();
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable) {
            Disposable aVar;
            if (this.f77936t0) {
                return EmptyDisposable.INSTANCE;
            }
            Runnable runnableOnSchedule = RxJavaPlugins.onSchedule(runnable);
            if (this.f77932p0) {
                aVar = new b(runnableOnSchedule, this.v0);
                this.v0.add(aVar);
            } else {
                aVar = new a(runnableOnSchedule);
            }
            this.f77935s0.offer(aVar);
            if (this.f77937u0.getAndIncrement() == 0) {
                try {
                    this.f77934r0.execute(this);
                } catch (RejectedExecutionException e5) {
                    this.f77936t0 = true;
                    this.f77935s0.clear();
                    RxJavaPlugins.onError(e5);
                    return EmptyDisposable.INSTANCE;
                }
            }
            return aVar;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
            if (j10 <= 0) {
                return schedule(runnable);
            }
            if (this.f77936t0) {
                return EmptyDisposable.INSTANCE;
            }
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(new c(sequentialDisposable2, RxJavaPlugins.onSchedule(runnable)), this.v0);
            this.v0.add(scheduledRunnable);
            Executor executor = this.f77934r0;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    scheduledRunnable.setFuture(((ScheduledExecutorService) executor).schedule((Callable) scheduledRunnable, j10, timeUnit));
                } catch (RejectedExecutionException e5) {
                    this.f77936t0 = true;
                    RxJavaPlugins.onError(e5);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                scheduledRunnable.setFuture(new io.reactivex.rxjava3.internal.schedulers.b(ExecutorScheduler.f77928t0.scheduleDirect(scheduledRunnable, j10, timeUnit)));
            }
            sequentialDisposable.replace(scheduledRunnable);
            return sequentialDisposable2;
        }
    }
}
