package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableObserveOn<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Scheduler f72616p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f72617q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f72618r0;

    public static final class a<T> extends BasicIntQueueDisposable<T> implements Observer<T>, Runnable {
        public boolean E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72619p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Scheduler.Worker f72620q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f72621r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f72622s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public SimpleQueue<T> f72623t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f72624u0;
        public Throwable v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f72625w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f72626x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public int f72627y0;

        public a(Observer<? super T> observer, Scheduler.Worker worker, boolean z10, int i10) {
            this.f72619p0 = observer;
            this.f72620q0 = worker;
            this.f72621r0 = z10;
            this.f72622s0 = i10;
        }

        public final boolean a(boolean z10, boolean z11, Observer<? super T> observer) {
            if (this.f72626x0) {
                this.f72623t0.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th2 = this.v0;
            if (this.f72621r0) {
                if (!z11) {
                    return false;
                }
                this.f72626x0 = true;
                if (th2 != null) {
                    observer.onError(th2);
                } else {
                    observer.onComplete();
                }
                this.f72620q0.dispose();
                return true;
            }
            if (th2 != null) {
                this.f72626x0 = true;
                this.f72623t0.clear();
                observer.onError(th2);
                this.f72620q0.dispose();
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f72626x0 = true;
            observer.onComplete();
            this.f72620q0.dispose();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f72623t0.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f72626x0) {
                return;
            }
            this.f72626x0 = true;
            this.f72624u0.dispose();
            this.f72620q0.dispose();
            if (this.E0 || getAndIncrement() != 0) {
                return;
            }
            this.f72623t0.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72626x0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f72623t0.isEmpty();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72625w0) {
                return;
            }
            this.f72625w0 = true;
            if (getAndIncrement() == 0) {
                this.f72620q0.schedule(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72625w0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.v0 = th2;
            this.f72625w0 = true;
            if (getAndIncrement() == 0) {
                this.f72620q0.schedule(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72625w0) {
                return;
            }
            if (this.f72627y0 != 2) {
                this.f72623t0.offer(t10);
            }
            if (getAndIncrement() == 0) {
                this.f72620q0.schedule(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72624u0, disposable)) {
                this.f72624u0 = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f72627y0 = iRequestFusion;
                        this.f72623t0 = queueDisposable;
                        this.f72625w0 = true;
                        this.f72619p0.onSubscribe(this);
                        if (getAndIncrement() == 0) {
                            this.f72620q0.schedule(this);
                            return;
                        }
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f72627y0 = iRequestFusion;
                        this.f72623t0 = queueDisposable;
                        this.f72619p0.onSubscribe(this);
                        return;
                    }
                }
                this.f72623t0 = new SpscLinkedArrayQueue(this.f72622s0);
                this.f72619p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Exception {
            return this.f72623t0.poll();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.E0 = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.E0) {
                int iAddAndGet = 1;
                while (!this.f72626x0) {
                    boolean z10 = this.f72625w0;
                    Throwable th2 = this.v0;
                    if (!this.f72621r0 && z10 && th2 != null) {
                        this.f72626x0 = true;
                        this.f72619p0.onError(this.v0);
                        this.f72620q0.dispose();
                        return;
                    }
                    this.f72619p0.onNext(null);
                    if (z10) {
                        this.f72626x0 = true;
                        Throwable th3 = this.v0;
                        if (th3 != null) {
                            this.f72619p0.onError(th3);
                        } else {
                            this.f72619p0.onComplete();
                        }
                        this.f72620q0.dispose();
                        return;
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                return;
            }
            SimpleQueue<T> simpleQueue = this.f72623t0;
            Observer<? super T> observer = this.f72619p0;
            int iAddAndGet2 = 1;
            while (!a(this.f72625w0, simpleQueue.isEmpty(), observer)) {
                while (true) {
                    boolean z11 = this.f72625w0;
                    try {
                        T tPoll = simpleQueue.poll();
                        boolean z12 = tPoll == null;
                        if (a(z11, z12, observer)) {
                            return;
                        }
                        if (z12) {
                            break;
                        } else {
                            observer.onNext(tPoll);
                        }
                    } catch (Throwable th4) {
                        Exceptions.throwIfFatal(th4);
                        this.f72626x0 = true;
                        this.f72624u0.dispose();
                        simpleQueue.clear();
                        observer.onError(th4);
                        this.f72620q0.dispose();
                        return;
                    }
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
                if (iAddAndGet2 == 0) {
                    return;
                }
            }
        }
    }

    public ObservableObserveOn(ObservableSource<T> observableSource, Scheduler scheduler, boolean z10, int i10) {
        super(observableSource);
        this.f72616p0 = scheduler;
        this.f72617q0 = z10;
        this.f72618r0 = i10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        Scheduler scheduler = this.f72616p0;
        if (scheduler instanceof TrampolineScheduler) {
            this.source.subscribe(observer);
        } else {
            this.source.subscribe(new a(observer, scheduler.createWorker(), this.f72617q0, this.f72618r0));
        }
    }
}
