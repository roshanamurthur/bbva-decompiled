package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSwitchMapSingle<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Flowable<T> f71900q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends SingleSource<? extends R>> f71901r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f71902s0;

    public static final class a<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public static final C0330a<Object> E0 = new C0330a<>(null);

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f71903p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends SingleSource<? extends R>> f71904q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f71905r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f71906s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicLong f71907t0 = new AtomicLong();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicReference<C0330a<R>> f71908u0 = new AtomicReference<>();
        public Subscription v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f71909w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f71910x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public long f71911y0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$a$a, reason: collision with other inner class name */
        public static final class C0330a<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, R> f71912p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public volatile R f71913q0;

            public C0330a(a<?, R> aVar) {
                this.f71912p0 = aVar;
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f71912p0;
                AtomicReference<C0330a<R>> atomicReference = aVar.f71908u0;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        RxJavaPlugins.onError(th2);
                    }
                }
                if (aVar.f71906s0.addThrowable(th2)) {
                    if (!aVar.f71905r0) {
                        aVar.v0.cancel();
                        aVar.a();
                    }
                    aVar.b();
                    return;
                }
                RxJavaPlugins.onError(th2);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(R r3) {
                this.f71913q0 = r3;
                this.f71912p0.b();
            }
        }

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10) {
            this.f71903p0 = subscriber;
            this.f71904q0 = function;
            this.f71905r0 = z10;
        }

        public final void a() {
            AtomicReference<C0330a<R>> atomicReference = this.f71908u0;
            C0330a<Object> c0330a = E0;
            C0330a<R> andSet = atomicReference.getAndSet((C0330a<R>) c0330a);
            if (andSet == null || andSet == c0330a) {
                return;
            }
            DisposableHelper.dispose(andSet);
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f71903p0;
            AtomicThrowable atomicThrowable = this.f71906s0;
            AtomicReference<C0330a<R>> atomicReference = this.f71908u0;
            AtomicLong atomicLong = this.f71907t0;
            long j10 = this.f71911y0;
            int iAddAndGet = 1;
            while (!this.f71910x0) {
                if (atomicThrowable.get() != null && !this.f71905r0) {
                    subscriber.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z10 = this.f71909w0;
                C0330a<R> c0330a = atomicReference.get();
                boolean z11 = c0330a == null;
                if (z10 && z11) {
                    Throwable thTerminate = atomicThrowable.terminate();
                    if (thTerminate != null) {
                        subscriber.onError(thTerminate);
                        return;
                    } else {
                        subscriber.onComplete();
                        return;
                    }
                }
                if (z11 || c0330a.f71913q0 == null || j10 == atomicLong.get()) {
                    this.f71911y0 = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(c0330a, null) && atomicReference.get() == c0330a) {
                    }
                    subscriber.onNext(c0330a.f71913q0);
                    j10++;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f71910x0 = true;
            this.v0.cancel();
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71909w0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (!this.f71906s0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.f71905r0) {
                a();
            }
            this.f71909w0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            C0330a<Object> c0330a = E0;
            AtomicReference<C0330a<R>> atomicReference = this.f71908u0;
            C0330a<R> c0330a2 = atomicReference.get();
            if (c0330a2 != null) {
                DisposableHelper.dispose(c0330a2);
            }
            try {
                SingleSource singleSource = (SingleSource) ObjectHelper.requireNonNull(this.f71904q0.apply(t10), "The mapper returned a null SingleSource");
                C0330a<R> c0330a3 = new C0330a<>(this);
                while (true) {
                    C0330a<R> c0330a4 = atomicReference.get();
                    if (c0330a4 == c0330a) {
                        return;
                    }
                    do {
                        if (atomicReference.compareAndSet(c0330a4, c0330a3)) {
                            singleSource.subscribe(c0330a3);
                            return;
                        }
                    } while (atomicReference.get() == c0330a4);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.v0.cancel();
                atomicReference.getAndSet((C0330a<R>) c0330a);
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.v0, subscription)) {
                this.v0 = subscription;
                this.f71903p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            BackpressureHelper.add(this.f71907t0, j10);
            b();
        }
    }

    public FlowableSwitchMapSingle(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10) {
        this.f71900q0 = flowable;
        this.f71901r0 = function;
        this.f71902s0 = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f71900q0.subscribe((FlowableSubscriber) new a(subscriber, this.f71901r0, this.f71902s0));
    }
}
