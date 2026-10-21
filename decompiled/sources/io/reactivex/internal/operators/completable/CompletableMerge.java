package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableMerge extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<? extends CompletableSource> f70065p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f70066q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f70067r0;

    public static final class a extends AtomicInteger implements FlowableSubscriber<CompletableSource>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70068p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f70069q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f70070r0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Subscription f70073u0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final CompositeDisposable f70072t0 = new CompositeDisposable();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f70071s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.completable.CompletableMerge$a$a, reason: collision with other inner class name */
        public final class C0297a extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            public C0297a() {
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
                aVar.f70072t0.delete(this);
                if (aVar.decrementAndGet() != 0) {
                    if (aVar.f70069q0 != Integer.MAX_VALUE) {
                        aVar.f70073u0.request(1L);
                    }
                } else {
                    Throwable th2 = aVar.f70071s0.get();
                    CompletableObserver completableObserver = aVar.f70068p0;
                    if (th2 != null) {
                        completableObserver.onError(th2);
                    } else {
                        completableObserver.onComplete();
                    }
                }
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th2) {
                a aVar = a.this;
                CompositeDisposable compositeDisposable = aVar.f70072t0;
                compositeDisposable.delete(this);
                boolean z10 = aVar.f70070r0;
                CompletableObserver completableObserver = aVar.f70068p0;
                AtomicThrowable atomicThrowable = aVar.f70071s0;
                if (!z10) {
                    aVar.f70073u0.cancel();
                    compositeDisposable.dispose();
                    if (!atomicThrowable.addThrowable(th2)) {
                        RxJavaPlugins.onError(th2);
                        return;
                    } else {
                        if (aVar.getAndSet(0) > 0) {
                            completableObserver.onError(atomicThrowable.terminate());
                            return;
                        }
                        return;
                    }
                }
                if (!atomicThrowable.addThrowable(th2)) {
                    RxJavaPlugins.onError(th2);
                } else if (aVar.decrementAndGet() == 0) {
                    completableObserver.onError(atomicThrowable.terminate());
                } else if (aVar.f70069q0 != Integer.MAX_VALUE) {
                    aVar.f70073u0.request(1L);
                }
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(CompletableObserver completableObserver, int i10, boolean z10) {
            this.f70068p0 = completableObserver;
            this.f70069q0 = i10;
            this.f70070r0 = z10;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f70073u0.cancel();
            this.f70072t0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70072t0.isDisposed();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                AtomicThrowable atomicThrowable = this.f70071s0;
                Throwable th2 = atomicThrowable.get();
                CompletableObserver completableObserver = this.f70068p0;
                if (th2 != null) {
                    completableObserver.onError(atomicThrowable.terminate());
                } else {
                    completableObserver.onComplete();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            boolean z10 = this.f70070r0;
            CompletableObserver completableObserver = this.f70068p0;
            AtomicThrowable atomicThrowable = this.f70071s0;
            if (z10) {
                if (!atomicThrowable.addThrowable(th2)) {
                    RxJavaPlugins.onError(th2);
                    return;
                } else {
                    if (decrementAndGet() == 0) {
                        completableObserver.onError(atomicThrowable.terminate());
                        return;
                    }
                    return;
                }
            }
            this.f70072t0.dispose();
            if (!atomicThrowable.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else if (getAndSet(0) > 0) {
                completableObserver.onError(atomicThrowable.terminate());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            getAndIncrement();
            C0297a c0297a = new C0297a();
            this.f70072t0.add(c0297a);
            ((CompletableSource) obj).subscribe(c0297a);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70073u0, subscription)) {
                this.f70073u0 = subscription;
                this.f70068p0.onSubscribe(this);
                int i10 = this.f70069q0;
                if (i10 == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i10);
                }
            }
        }
    }

    public CompletableMerge(Publisher<? extends CompletableSource> publisher, int i10, boolean z10) {
        this.f70065p0 = publisher;
        this.f70066q0 = i10;
        this.f70067r0 = z10;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f70065p0.subscribe(new a(completableObserver, this.f70066q0, this.f70067r0));
    }
}
