package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableMerge extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<? extends CompletableSource> f74323p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f74324q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f74325r0;

    public static final class a extends AtomicInteger implements FlowableSubscriber<CompletableSource>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74326p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f74327q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f74328r0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Subscription f74331u0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final CompositeDisposable f74330t0 = new CompositeDisposable();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f74329s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.completable.CompletableMerge$a$a, reason: collision with other inner class name */
        public final class C0361a extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            public C0361a() {
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
                aVar.f74330t0.delete(this);
                if (aVar.decrementAndGet() == 0) {
                    aVar.f74329s0.tryTerminateConsumer(aVar.f74326p0);
                } else if (aVar.f74327q0 != Integer.MAX_VALUE) {
                    aVar.f74331u0.request(1L);
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a aVar = a.this;
                CompositeDisposable compositeDisposable = aVar.f74330t0;
                compositeDisposable.delete(this);
                boolean z10 = aVar.f74328r0;
                CompletableObserver completableObserver = aVar.f74326p0;
                AtomicThrowable atomicThrowable = aVar.f74329s0;
                if (!z10) {
                    aVar.f74331u0.cancel();
                    compositeDisposable.dispose();
                    if (!atomicThrowable.tryAddThrowableOrReport(th2) || aVar.getAndSet(0) <= 0) {
                        return;
                    }
                    atomicThrowable.tryTerminateConsumer(completableObserver);
                    return;
                }
                if (atomicThrowable.tryAddThrowableOrReport(th2)) {
                    if (aVar.decrementAndGet() == 0) {
                        atomicThrowable.tryTerminateConsumer(completableObserver);
                    } else if (aVar.f74327q0 != Integer.MAX_VALUE) {
                        aVar.f74331u0.request(1L);
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(CompletableObserver completableObserver, int i10, boolean z10) {
            this.f74326p0 = completableObserver;
            this.f74327q0 = i10;
            this.f74328r0 = z10;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74331u0.cancel();
            this.f74330t0.dispose();
            this.f74329s0.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74330t0.isDisposed();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.f74329s0.tryTerminateConsumer(this.f74326p0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            boolean z10 = this.f74328r0;
            CompletableObserver completableObserver = this.f74326p0;
            AtomicThrowable atomicThrowable = this.f74329s0;
            if (z10) {
                if (atomicThrowable.tryAddThrowableOrReport(th2) && decrementAndGet() == 0) {
                    atomicThrowable.tryTerminateConsumer(completableObserver);
                    return;
                }
                return;
            }
            this.f74330t0.dispose();
            if (!atomicThrowable.tryAddThrowableOrReport(th2) || getAndSet(0) <= 0) {
                return;
            }
            atomicThrowable.tryTerminateConsumer(completableObserver);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            getAndIncrement();
            C0361a c0361a = new C0361a();
            this.f74330t0.add(c0361a);
            ((CompletableSource) obj).subscribe(c0361a);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74331u0, subscription)) {
                this.f74331u0 = subscription;
                this.f74326p0.onSubscribe(this);
                int i10 = this.f74327q0;
                if (i10 == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i10);
                }
            }
        }
    }

    public CompletableMerge(Publisher<? extends CompletableSource> publisher, int i10, boolean z10) {
        this.f74323p0 = publisher;
        this.f74324q0 = i10;
        this.f74325r0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f74323p0.subscribe(new a(completableObserver, this.f74324q0, this.f74325r0));
    }
}
