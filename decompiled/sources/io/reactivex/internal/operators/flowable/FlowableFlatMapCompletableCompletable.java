package io.reactivex.internal.operators.flowable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableFlatMapCompletableCompletable<T> extends Completable implements FuseToFlowable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f70593p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends CompletableSource> f70594q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f70595r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f70596s0;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70597p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super T, ? extends CompletableSource> f70599r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f70600s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f70602u0;
        public Subscription v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f70603w0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicThrowable f70598q0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final CompositeDisposable f70601t0 = new CompositeDisposable();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableFlatMapCompletableCompletable$a$a, reason: collision with other inner class name */
        public final class C0306a extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            public C0306a() {
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                a aVar = a.this;
                aVar.f70601t0.delete(this);
                aVar.onComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th2) {
                a aVar = a.this;
                aVar.f70601t0.delete(this);
                aVar.onError(th2);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z10, int i10) {
            this.f70597p0 = completableObserver;
            this.f70599r0 = function;
            this.f70600s0 = z10;
            this.f70602u0 = i10;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f70603w0 = true;
            this.v0.cancel();
            this.f70601t0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70601t0.isDisposed();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (decrementAndGet() != 0) {
                if (this.f70602u0 != Integer.MAX_VALUE) {
                    this.v0.request(1L);
                }
            } else {
                Throwable thTerminate = this.f70598q0.terminate();
                CompletableObserver completableObserver = this.f70597p0;
                if (thTerminate != null) {
                    completableObserver.onError(thTerminate);
                } else {
                    completableObserver.onComplete();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            AtomicThrowable atomicThrowable = this.f70598q0;
            if (!atomicThrowable.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            boolean z10 = this.f70600s0;
            CompletableObserver completableObserver = this.f70597p0;
            if (!z10) {
                dispose();
                if (getAndSet(0) > 0) {
                    completableObserver.onError(atomicThrowable.terminate());
                    return;
                }
                return;
            }
            if (decrementAndGet() == 0) {
                completableObserver.onError(atomicThrowable.terminate());
            } else if (this.f70602u0 != Integer.MAX_VALUE) {
                this.v0.request(1L);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            try {
                CompletableSource completableSource = (CompletableSource) ObjectHelper.requireNonNull(this.f70599r0.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C0306a c0306a = new C0306a();
                if (this.f70603w0 || !this.f70601t0.add(c0306a)) {
                    return;
                }
                completableSource.subscribe(c0306a);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.v0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.v0, subscription)) {
                this.v0 = subscription;
                this.f70597p0.onSubscribe(this);
                int i10 = this.f70602u0;
                if (i10 == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i10);
                }
            }
        }
    }

    public FlowableFlatMapCompletableCompletable(Flowable<T> flowable, Function<? super T, ? extends CompletableSource> function, boolean z10, int i10) {
        this.f70593p0 = flowable;
        this.f70594q0 = function;
        this.f70596s0 = z10;
        this.f70595r0 = i10;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableFlatMapCompletable(this.f70593p0, this.f70594q0, this.f70596s0, this.f70595r0));
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f70593p0.subscribe((FlowableSubscriber) new a(completableObserver, this.f70594q0, this.f70596s0, this.f70595r0));
    }
}
