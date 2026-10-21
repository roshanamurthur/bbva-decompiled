package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableRefCount<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ConnectableFlowable<T> f70982q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f70983r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final long f70984s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final TimeUnit f70985t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Scheduler f70986u0;
    public a v0;

    public static final class a extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final FlowableRefCount<?> f70987p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public SequentialDisposable f70988q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f70989r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f70990s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f70991t0;

        public a(FlowableRefCount<?> flowableRefCount) {
            this.f70987p0 = flowableRefCount;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) throws Exception {
            Disposable disposable2 = disposable;
            DisposableHelper.replace(this, disposable2);
            synchronized (this.f70987p0) {
                try {
                    if (this.f70991t0) {
                        ((ResettableConnectable) this.f70987p0.f70982q0).resetIf(disposable2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f70987p0.f(this);
        }
    }

    public static final class b<T> extends AtomicBoolean implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f70992p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final FlowableRefCount<T> f70993q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final a f70994r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f70995s0;

        public b(Subscriber<? super T> subscriber, FlowableRefCount<T> flowableRefCount, a aVar) {
            this.f70992p0 = subscriber;
            this.f70993q0 = flowableRefCount;
            this.f70994r0 = aVar;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70995s0.cancel();
            if (compareAndSet(false, true)) {
                FlowableRefCount<T> flowableRefCount = this.f70993q0;
                a aVar = this.f70994r0;
                synchronized (flowableRefCount) {
                    try {
                        a aVar2 = flowableRefCount.v0;
                        if (aVar2 != null && aVar2 == aVar) {
                            long j10 = aVar.f70989r0 - 1;
                            aVar.f70989r0 = j10;
                            if (j10 == 0 && aVar.f70990s0) {
                                if (flowableRefCount.f70984s0 == 0) {
                                    flowableRefCount.f(aVar);
                                } else {
                                    SequentialDisposable sequentialDisposable = new SequentialDisposable();
                                    aVar.f70988q0 = sequentialDisposable;
                                    sequentialDisposable.replace(flowableRefCount.f70986u0.scheduleDirect(aVar, flowableRefCount.f70984s0, flowableRefCount.f70985t0));
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.f70993q0.e(this.f70994r0);
                this.f70992p0.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f70993q0.e(this.f70994r0);
                this.f70992p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f70992p0.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70995s0, subscription)) {
                this.f70995s0 = subscription;
                this.f70992p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f70995s0.request(j10);
        }
    }

    public FlowableRefCount(ConnectableFlowable<T> connectableFlowable) {
        this(connectableFlowable, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    public final void e(a aVar) {
        synchronized (this) {
            try {
                if (this.f70982q0 instanceof FlowablePublishClassic) {
                    a aVar2 = this.v0;
                    if (aVar2 != null && aVar2 == aVar) {
                        this.v0 = null;
                        SequentialDisposable sequentialDisposable = aVar.f70988q0;
                        if (sequentialDisposable != null) {
                            sequentialDisposable.dispose();
                            aVar.f70988q0 = null;
                        }
                    }
                    long j10 = aVar.f70989r0 - 1;
                    aVar.f70989r0 = j10;
                    if (j10 == 0) {
                        ConnectableFlowable<T> connectableFlowable = this.f70982q0;
                        if (connectableFlowable instanceof Disposable) {
                            ((Disposable) connectableFlowable).dispose();
                        } else if (connectableFlowable instanceof ResettableConnectable) {
                            ((ResettableConnectable) connectableFlowable).resetIf(aVar.get());
                        }
                    }
                } else {
                    a aVar3 = this.v0;
                    if (aVar3 != null && aVar3 == aVar) {
                        SequentialDisposable sequentialDisposable2 = aVar.f70988q0;
                        if (sequentialDisposable2 != null) {
                            sequentialDisposable2.dispose();
                            aVar.f70988q0 = null;
                        }
                        long j11 = aVar.f70989r0 - 1;
                        aVar.f70989r0 = j11;
                        if (j11 == 0) {
                            this.v0 = null;
                            ConnectableFlowable<T> connectableFlowable2 = this.f70982q0;
                            if (connectableFlowable2 instanceof Disposable) {
                                ((Disposable) connectableFlowable2).dispose();
                            } else if (connectableFlowable2 instanceof ResettableConnectable) {
                                ((ResettableConnectable) connectableFlowable2).resetIf(aVar.get());
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(a aVar) {
        synchronized (this) {
            try {
                if (aVar.f70989r0 == 0 && aVar == this.v0) {
                    this.v0 = null;
                    Disposable disposable = aVar.get();
                    DisposableHelper.dispose(aVar);
                    ConnectableFlowable<T> connectableFlowable = this.f70982q0;
                    if (connectableFlowable instanceof Disposable) {
                        ((Disposable) connectableFlowable).dispose();
                    } else if (connectableFlowable instanceof ResettableConnectable) {
                        if (disposable == null) {
                            aVar.f70991t0 = true;
                        } else {
                            ((ResettableConnectable) connectableFlowable).resetIf(disposable);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        a aVar;
        boolean z10;
        SequentialDisposable sequentialDisposable;
        synchronized (this) {
            try {
                aVar = this.v0;
                if (aVar == null) {
                    aVar = new a(this);
                    this.v0 = aVar;
                }
                long j10 = aVar.f70989r0;
                if (j10 == 0 && (sequentialDisposable = aVar.f70988q0) != null) {
                    sequentialDisposable.dispose();
                }
                long j11 = j10 + 1;
                aVar.f70989r0 = j11;
                if (aVar.f70990s0 || j11 != this.f70983r0) {
                    z10 = false;
                } else {
                    z10 = true;
                    aVar.f70990s0 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f70982q0.subscribe((FlowableSubscriber) new b(subscriber, this, aVar));
        if (z10) {
            this.f70982q0.connect(aVar);
        }
    }

    public FlowableRefCount(ConnectableFlowable<T> connectableFlowable, int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        this.f70982q0 = connectableFlowable;
        this.f70983r0 = i10;
        this.f70984s0 = j10;
        this.f70985t0 = timeUnit;
        this.f70986u0 = scheduler;
    }
}
