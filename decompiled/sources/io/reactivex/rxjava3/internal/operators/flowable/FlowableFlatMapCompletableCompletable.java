package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFlatMapCompletableCompletable<T> extends Completable implements FuseToFlowable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f74860p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends CompletableSource> f74861q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f74862r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f74863s0;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74864p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super T, ? extends CompletableSource> f74866r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f74867s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f74869u0;
        public Subscription v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f74870w0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicThrowable f74865q0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final CompositeDisposable f74868t0 = new CompositeDisposable();

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMapCompletableCompletable$a$a, reason: collision with other inner class name */
        public final class C0370a extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            public C0370a() {
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                a aVar = a.this;
                aVar.f74868t0.delete(this);
                aVar.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a aVar = a.this;
                aVar.f74868t0.delete(this);
                aVar.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z10, int i10) {
            this.f74864p0 = completableObserver;
            this.f74866r0 = function;
            this.f74867s0 = z10;
            this.f74869u0 = i10;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74870w0 = true;
            this.v0.cancel();
            this.f74868t0.dispose();
            this.f74865q0.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74868t0.isDisposed();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.f74865q0.tryTerminateConsumer(this.f74864p0);
            } else if (this.f74869u0 != Integer.MAX_VALUE) {
                this.v0.request(1L);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74865q0.tryAddThrowableOrReport(th2)) {
                if (!this.f74867s0) {
                    this.f74870w0 = true;
                    this.v0.cancel();
                    this.f74868t0.dispose();
                    this.f74865q0.tryTerminateConsumer(this.f74864p0);
                    return;
                }
                if (decrementAndGet() == 0) {
                    this.f74865q0.tryTerminateConsumer(this.f74864p0);
                } else if (this.f74869u0 != Integer.MAX_VALUE) {
                    this.v0.request(1L);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            try {
                CompletableSource completableSourceApply = this.f74866r0.apply(t10);
                Objects.requireNonNull(completableSourceApply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = completableSourceApply;
                getAndIncrement();
                C0370a c0370a = new C0370a();
                if (this.f74870w0 || !this.f74868t0.add(c0370a)) {
                    return;
                }
                completableSource.subscribe(c0370a);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.v0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.v0, subscription)) {
                this.v0 = subscription;
                this.f74864p0.onSubscribe(this);
                int i10 = this.f74869u0;
                if (i10 == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i10);
                }
            }
        }
    }

    public FlowableFlatMapCompletableCompletable(Flowable<T> flowable, Function<? super T, ? extends CompletableSource> function, boolean z10, int i10) {
        this.f74860p0 = flowable;
        this.f74861q0 = function;
        this.f74863s0 = z10;
        this.f74862r0 = i10;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableFlatMapCompletable(this.f74860p0, this.f74861q0, this.f74863s0, this.f74862r0));
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f74860p0.subscribe((FlowableSubscriber) new a(completableObserver, this.f74861q0, this.f74863s0, this.f74862r0));
    }
}
