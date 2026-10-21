package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
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
public final class FlowableSwitchMapSingle<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Flowable<T> f76161q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends SingleSource<? extends R>> f76162r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f76163s0;

    public static final class a<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public static final C0394a<Object> E0 = new C0394a<>(null);

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f76164p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends SingleSource<? extends R>> f76165q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f76166r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f76167s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicLong f76168t0 = new AtomicLong();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicReference<C0394a<R>> f76169u0 = new AtomicReference<>();
        public Subscription v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f76170w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f76171x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public long f76172y0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.mixed.FlowableSwitchMapSingle$a$a, reason: collision with other inner class name */
        public static final class C0394a<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, R> f76173p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public volatile R f76174q0;

            public C0394a(a<?, R> aVar) {
                this.f76173p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f76173p0;
                AtomicReference<C0394a<R>> atomicReference = aVar.f76169u0;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        RxJavaPlugins.onError(th2);
                        return;
                    }
                }
                if (aVar.f76167s0.tryAddThrowableOrReport(th2)) {
                    if (!aVar.f76166r0) {
                        aVar.v0.cancel();
                        aVar.a();
                    }
                    aVar.b();
                }
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(R r3) {
                this.f76174q0 = r3;
                this.f76173p0.b();
            }
        }

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10) {
            this.f76164p0 = subscriber;
            this.f76165q0 = function;
            this.f76166r0 = z10;
        }

        public final void a() {
            AtomicReference<C0394a<R>> atomicReference = this.f76169u0;
            C0394a<Object> c0394a = E0;
            C0394a<R> andSet = atomicReference.getAndSet((C0394a<R>) c0394a);
            if (andSet == null || andSet == c0394a) {
                return;
            }
            DisposableHelper.dispose(andSet);
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f76164p0;
            AtomicThrowable atomicThrowable = this.f76167s0;
            AtomicReference<C0394a<R>> atomicReference = this.f76169u0;
            AtomicLong atomicLong = this.f76168t0;
            long j10 = this.f76172y0;
            int iAddAndGet = 1;
            while (!this.f76171x0) {
                if (atomicThrowable.get() != null && !this.f76166r0) {
                    atomicThrowable.tryTerminateConsumer(subscriber);
                    return;
                }
                boolean z10 = this.f76170w0;
                C0394a<R> c0394a = atomicReference.get();
                boolean z11 = c0394a == null;
                if (z10 && z11) {
                    atomicThrowable.tryTerminateConsumer(subscriber);
                    return;
                }
                if (z11 || c0394a.f76174q0 == null || j10 == atomicLong.get()) {
                    this.f76172y0 = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(c0394a, null) && atomicReference.get() == c0394a) {
                    }
                    subscriber.onNext(c0394a.f76174q0);
                    j10++;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f76171x0 = true;
            this.v0.cancel();
            a();
            this.f76167s0.tryTerminateAndReport();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f76170w0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f76167s0.tryAddThrowableOrReport(th2)) {
                if (!this.f76166r0) {
                    a();
                }
                this.f76170w0 = true;
                b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            C0394a<Object> c0394a = E0;
            AtomicReference<C0394a<R>> atomicReference = this.f76169u0;
            C0394a<R> c0394a2 = atomicReference.get();
            if (c0394a2 != null) {
                DisposableHelper.dispose(c0394a2);
            }
            try {
                SingleSource<? extends R> singleSourceApply = this.f76165q0.apply(t10);
                Objects.requireNonNull(singleSourceApply, "The mapper returned a null SingleSource");
                SingleSource<? extends R> singleSource = singleSourceApply;
                C0394a<R> c0394a3 = new C0394a<>(this);
                while (true) {
                    C0394a<R> c0394a4 = atomicReference.get();
                    if (c0394a4 == c0394a) {
                        return;
                    }
                    do {
                        if (atomicReference.compareAndSet(c0394a4, c0394a3)) {
                            singleSource.subscribe(c0394a3);
                            return;
                        }
                    } while (atomicReference.get() == c0394a4);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.v0.cancel();
                atomicReference.getAndSet((C0394a<R>) c0394a);
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.v0, subscription)) {
                this.v0 = subscription;
                this.f76164p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            BackpressureHelper.add(this.f76168t0, j10);
            b();
        }
    }

    public FlowableSwitchMapSingle(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10) {
        this.f76161q0 = flowable;
        this.f76162r0 = function;
        this.f76163s0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f76161q0.subscribe((FlowableSubscriber) new a(subscriber, this.f76162r0, this.f76163s0));
    }
}
