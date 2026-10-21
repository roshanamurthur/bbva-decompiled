package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSwitchMapMaybe<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Flowable<T> f76144q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends MaybeSource<? extends R>> f76145r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f76146s0;

    public static final class a<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public static final C0393a<Object> E0 = new C0393a<>(null);

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f76147p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends MaybeSource<? extends R>> f76148q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f76149r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f76150s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicLong f76151t0 = new AtomicLong();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicReference<C0393a<R>> f76152u0 = new AtomicReference<>();
        public Subscription v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f76153w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f76154x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public long f76155y0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.mixed.FlowableSwitchMapMaybe$a$a, reason: collision with other inner class name */
        public static final class C0393a<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, R> f76156p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public volatile R f76157q0;

            public C0393a(a<?, R> aVar) {
                this.f76156p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                a<?, R> aVar = this.f76156p0;
                AtomicReference<C0393a<R>> atomicReference = aVar.f76152u0;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                aVar.b();
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f76156p0;
                AtomicReference<C0393a<R>> atomicReference = aVar.f76152u0;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        RxJavaPlugins.onError(th2);
                        return;
                    }
                }
                if (aVar.f76150s0.tryAddThrowableOrReport(th2)) {
                    if (!aVar.f76149r0) {
                        aVar.v0.cancel();
                        aVar.a();
                    }
                    aVar.b();
                }
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(R r3) {
                this.f76157q0 = r3;
                this.f76156p0.b();
            }
        }

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z10) {
            this.f76147p0 = subscriber;
            this.f76148q0 = function;
            this.f76149r0 = z10;
        }

        public final void a() {
            AtomicReference<C0393a<R>> atomicReference = this.f76152u0;
            C0393a<Object> c0393a = E0;
            C0393a<R> andSet = atomicReference.getAndSet((C0393a<R>) c0393a);
            if (andSet == null || andSet == c0393a) {
                return;
            }
            DisposableHelper.dispose(andSet);
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f76147p0;
            AtomicThrowable atomicThrowable = this.f76150s0;
            AtomicReference<C0393a<R>> atomicReference = this.f76152u0;
            AtomicLong atomicLong = this.f76151t0;
            long j10 = this.f76155y0;
            int iAddAndGet = 1;
            while (!this.f76154x0) {
                if (atomicThrowable.get() != null && !this.f76149r0) {
                    atomicThrowable.tryTerminateConsumer(subscriber);
                    return;
                }
                boolean z10 = this.f76153w0;
                C0393a<R> c0393a = atomicReference.get();
                boolean z11 = c0393a == null;
                if (z10 && z11) {
                    atomicThrowable.tryTerminateConsumer(subscriber);
                    return;
                }
                if (z11 || c0393a.f76157q0 == null || j10 == atomicLong.get()) {
                    this.f76155y0 = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(c0393a, null) && atomicReference.get() == c0393a) {
                    }
                    subscriber.onNext(c0393a.f76157q0);
                    j10++;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f76154x0 = true;
            this.v0.cancel();
            a();
            this.f76150s0.tryTerminateAndReport();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f76153w0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f76150s0.tryAddThrowableOrReport(th2)) {
                if (!this.f76149r0) {
                    a();
                }
                this.f76153w0 = true;
                b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            C0393a<Object> c0393a = E0;
            AtomicReference<C0393a<R>> atomicReference = this.f76152u0;
            C0393a<R> c0393a2 = atomicReference.get();
            if (c0393a2 != null) {
                DisposableHelper.dispose(c0393a2);
            }
            try {
                MaybeSource<? extends R> maybeSourceApply = this.f76148q0.apply(t10);
                Objects.requireNonNull(maybeSourceApply, "The mapper returned a null MaybeSource");
                MaybeSource<? extends R> maybeSource = maybeSourceApply;
                C0393a<R> c0393a3 = new C0393a<>(this);
                while (true) {
                    C0393a<R> c0393a4 = atomicReference.get();
                    if (c0393a4 == c0393a) {
                        return;
                    }
                    do {
                        if (atomicReference.compareAndSet(c0393a4, c0393a3)) {
                            maybeSource.subscribe(c0393a3);
                            return;
                        }
                    } while (atomicReference.get() == c0393a4);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.v0.cancel();
                atomicReference.getAndSet((C0393a<R>) c0393a);
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.v0, subscription)) {
                this.v0 = subscription;
                this.f76147p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            BackpressureHelper.add(this.f76151t0, j10);
            b();
        }
    }

    public FlowableSwitchMapMaybe(Flowable<T> flowable, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z10) {
        this.f76144q0 = flowable;
        this.f76145r0 = function;
        this.f76146s0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f76144q0.subscribe((FlowableSubscriber) new a(subscriber, this.f76145r0, this.f76146s0));
    }
}
