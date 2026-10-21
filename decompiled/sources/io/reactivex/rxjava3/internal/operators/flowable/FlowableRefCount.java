package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.flowables.ConnectableFlowable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableRefCount<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ConnectableFlowable<T> f75239q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f75240r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final long f75241s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final TimeUnit f75242t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Scheduler f75243u0;
    public a v0;

    public static final class a extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final FlowableRefCount<?> f75244p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public SequentialDisposable f75245q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f75246r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f75247s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f75248t0;

        public a(FlowableRefCount<?> flowableRefCount) {
            this.f75244p0 = flowableRefCount;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Disposable disposable) throws Throwable {
            DisposableHelper.replace(this, disposable);
            synchronized (this.f75244p0) {
                try {
                    if (this.f75248t0) {
                        this.f75244p0.f75239q0.reset();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f75244p0.f(this);
        }
    }

    public static final class b<T> extends AtomicBoolean implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75249p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final FlowableRefCount<T> f75250q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final a f75251r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f75252s0;

        public b(Subscriber<? super T> subscriber, FlowableRefCount<T> flowableRefCount, a aVar) {
            this.f75249p0 = subscriber;
            this.f75250q0 = flowableRefCount;
            this.f75251r0 = aVar;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f75252s0.cancel();
            if (compareAndSet(false, true)) {
                FlowableRefCount<T> flowableRefCount = this.f75250q0;
                a aVar = this.f75251r0;
                synchronized (flowableRefCount) {
                    try {
                        a aVar2 = flowableRefCount.v0;
                        if (aVar2 != null && aVar2 == aVar) {
                            long j10 = aVar.f75246r0 - 1;
                            aVar.f75246r0 = j10;
                            if (j10 == 0 && aVar.f75247s0) {
                                if (flowableRefCount.f75241s0 == 0) {
                                    flowableRefCount.f(aVar);
                                } else {
                                    SequentialDisposable sequentialDisposable = new SequentialDisposable();
                                    aVar.f75245q0 = sequentialDisposable;
                                    sequentialDisposable.replace(flowableRefCount.f75243u0.scheduleDirect(aVar, flowableRefCount.f75241s0, flowableRefCount.f75242t0));
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
                this.f75250q0.e(this.f75251r0);
                this.f75249p0.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f75250q0.e(this.f75251r0);
                this.f75249p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f75249p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75252s0, subscription)) {
                this.f75252s0 = subscription;
                this.f75249p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f75252s0.request(j10);
        }
    }

    public FlowableRefCount(ConnectableFlowable<T> connectableFlowable) {
        this(connectableFlowable, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    public final void e(a aVar) {
        synchronized (this) {
            try {
                if (this.v0 == aVar) {
                    SequentialDisposable sequentialDisposable = aVar.f75245q0;
                    if (sequentialDisposable != null) {
                        sequentialDisposable.dispose();
                        aVar.f75245q0 = null;
                    }
                    long j10 = aVar.f75246r0 - 1;
                    aVar.f75246r0 = j10;
                    if (j10 == 0) {
                        this.v0 = null;
                        this.f75239q0.reset();
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
                if (aVar.f75246r0 == 0 && aVar == this.v0) {
                    this.v0 = null;
                    Disposable disposable = aVar.get();
                    DisposableHelper.dispose(aVar);
                    if (disposable == null) {
                        aVar.f75248t0 = true;
                    } else {
                        this.f75239q0.reset();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
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
                long j10 = aVar.f75246r0;
                if (j10 == 0 && (sequentialDisposable = aVar.f75245q0) != null) {
                    sequentialDisposable.dispose();
                }
                long j11 = j10 + 1;
                aVar.f75246r0 = j11;
                if (aVar.f75247s0 || j11 != this.f75240r0) {
                    z10 = false;
                } else {
                    z10 = true;
                    aVar.f75247s0 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f75239q0.subscribe((FlowableSubscriber) new b(subscriber, this, aVar));
        if (z10) {
            this.f75239q0.connect(aVar);
        }
    }

    public FlowableRefCount(ConnectableFlowable<T> connectableFlowable, int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        this.f75239q0 = connectableFlowable;
        this.f75240r0 = i10;
        this.f75241s0 = j10;
        this.f75242t0 = timeUnit;
        this.f75243u0 = scheduler;
    }
}
