package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
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
public final class FlowableSwitchMapMaybe<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Flowable<T> f71886q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends MaybeSource<? extends R>> f71887r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f71888s0;

    public static final class a<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public static final C0329a<Object> E0 = new C0329a<>(null);

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f71889p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends MaybeSource<? extends R>> f71890q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f71891r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f71892s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicLong f71893t0 = new AtomicLong();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicReference<C0329a<R>> f71894u0 = new AtomicReference<>();
        public Subscription v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f71895w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f71896x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public long f71897y0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe$a$a, reason: collision with other inner class name */
        public static final class C0329a<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, R> f71898p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public volatile R f71899q0;

            public C0329a(a<?, R> aVar) {
                this.f71898p0 = aVar;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                a<?, R> aVar = this.f71898p0;
                AtomicReference<C0329a<R>> atomicReference = aVar.f71894u0;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                aVar.b();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f71898p0;
                AtomicReference<C0329a<R>> atomicReference = aVar.f71894u0;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        RxJavaPlugins.onError(th2);
                    }
                }
                if (aVar.f71892s0.addThrowable(th2)) {
                    if (!aVar.f71891r0) {
                        aVar.v0.cancel();
                        aVar.a();
                    }
                    aVar.b();
                    return;
                }
                RxJavaPlugins.onError(th2);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(R r3) {
                this.f71899q0 = r3;
                this.f71898p0.b();
            }
        }

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z10) {
            this.f71889p0 = subscriber;
            this.f71890q0 = function;
            this.f71891r0 = z10;
        }

        public final void a() {
            AtomicReference<C0329a<R>> atomicReference = this.f71894u0;
            C0329a<Object> c0329a = E0;
            C0329a<R> andSet = atomicReference.getAndSet((C0329a<R>) c0329a);
            if (andSet == null || andSet == c0329a) {
                return;
            }
            DisposableHelper.dispose(andSet);
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f71889p0;
            AtomicThrowable atomicThrowable = this.f71892s0;
            AtomicReference<C0329a<R>> atomicReference = this.f71894u0;
            AtomicLong atomicLong = this.f71893t0;
            long j10 = this.f71897y0;
            int iAddAndGet = 1;
            while (!this.f71896x0) {
                if (atomicThrowable.get() != null && !this.f71891r0) {
                    subscriber.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z10 = this.f71895w0;
                C0329a<R> c0329a = atomicReference.get();
                boolean z11 = c0329a == null;
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
                if (z11 || c0329a.f71899q0 == null || j10 == atomicLong.get()) {
                    this.f71897y0 = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(c0329a, null) && atomicReference.get() == c0329a) {
                    }
                    subscriber.onNext(c0329a.f71899q0);
                    j10++;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f71896x0 = true;
            this.v0.cancel();
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71895w0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (!this.f71892s0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.f71891r0) {
                a();
            }
            this.f71895w0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            C0329a<Object> c0329a = E0;
            AtomicReference<C0329a<R>> atomicReference = this.f71894u0;
            C0329a<R> c0329a2 = atomicReference.get();
            if (c0329a2 != null) {
                DisposableHelper.dispose(c0329a2);
            }
            try {
                MaybeSource maybeSource = (MaybeSource) ObjectHelper.requireNonNull(this.f71890q0.apply(t10), "The mapper returned a null MaybeSource");
                C0329a<R> c0329a3 = new C0329a<>(this);
                while (true) {
                    C0329a<R> c0329a4 = atomicReference.get();
                    if (c0329a4 == c0329a) {
                        return;
                    }
                    do {
                        if (atomicReference.compareAndSet(c0329a4, c0329a3)) {
                            maybeSource.subscribe(c0329a3);
                            return;
                        }
                    } while (atomicReference.get() == c0329a4);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.v0.cancel();
                atomicReference.getAndSet((C0329a<R>) c0329a);
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.v0, subscription)) {
                this.v0 = subscription;
                this.f71889p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            BackpressureHelper.add(this.f71893t0, j10);
            b();
        }
    }

    public FlowableSwitchMapMaybe(Flowable<T> flowable, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z10) {
        this.f71886q0 = flowable;
        this.f71887r0 = function;
        this.f71888s0 = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f71886q0.subscribe((FlowableSubscriber) new a(subscriber, this.f71887r0, this.f71888s0));
    }
}
