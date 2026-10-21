package io.reactivex.internal.operators.mixed;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSwitchMapCompletable<T> extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f71875p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends CompletableSource> f71876q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f71877r0;

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static final C0328a f71878w0 = new C0328a(null);

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f71879p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends CompletableSource> f71880q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f71881r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f71882s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<C0328a> f71883t0 = new AtomicReference<>();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f71884u0;
        public Subscription v0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable$a$a, reason: collision with other inner class name */
        public static final class C0328a extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?> f71885p0;

            public C0328a(a<?> aVar) {
                this.f71885p0 = aVar;
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                a<?> aVar = this.f71885p0;
                AtomicReference<C0328a> atomicReference = aVar.f71883t0;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                if (aVar.f71884u0) {
                    Throwable thTerminate = aVar.f71882s0.terminate();
                    if (thTerminate == null) {
                        aVar.f71879p0.onComplete();
                    } else {
                        aVar.f71879p0.onError(thTerminate);
                    }
                }
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th2) {
                a<?> aVar = this.f71885p0;
                AtomicReference<C0328a> atomicReference = aVar.f71883t0;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        RxJavaPlugins.onError(th2);
                    }
                }
                if (aVar.f71882s0.addThrowable(th2)) {
                    if (aVar.f71881r0) {
                        if (aVar.f71884u0) {
                            aVar.f71879p0.onError(aVar.f71882s0.terminate());
                            return;
                        }
                        return;
                    }
                    aVar.dispose();
                    Throwable thTerminate = aVar.f71882s0.terminate();
                    if (thTerminate != ExceptionHelper.TERMINATED) {
                        aVar.f71879p0.onError(thTerminate);
                        return;
                    }
                    return;
                }
                RxJavaPlugins.onError(th2);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z10) {
            this.f71879p0 = completableObserver;
            this.f71880q0 = function;
            this.f71881r0 = z10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.v0.cancel();
            AtomicReference<C0328a> atomicReference = this.f71883t0;
            C0328a c0328a = f71878w0;
            C0328a andSet = atomicReference.getAndSet(c0328a);
            if (andSet == null || andSet == c0328a) {
                return;
            }
            DisposableHelper.dispose(andSet);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71883t0.get() == f71878w0;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71884u0 = true;
            if (this.f71883t0.get() == null) {
                Throwable thTerminate = this.f71882s0.terminate();
                if (thTerminate == null) {
                    this.f71879p0.onComplete();
                } else {
                    this.f71879p0.onError(thTerminate);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            AtomicThrowable atomicThrowable = this.f71882s0;
            if (!atomicThrowable.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (this.f71881r0) {
                onComplete();
                return;
            }
            AtomicReference<C0328a> atomicReference = this.f71883t0;
            C0328a c0328a = f71878w0;
            C0328a andSet = atomicReference.getAndSet(c0328a);
            if (andSet != null && andSet != c0328a) {
                DisposableHelper.dispose(andSet);
            }
            Throwable thTerminate = atomicThrowable.terminate();
            if (thTerminate != ExceptionHelper.TERMINATED) {
                this.f71879p0.onError(thTerminate);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            try {
                CompletableSource completableSource = (CompletableSource) ObjectHelper.requireNonNull(this.f71880q0.apply(t10), "The mapper returned a null CompletableSource");
                C0328a c0328a = new C0328a(this);
                while (true) {
                    AtomicReference<C0328a> atomicReference = this.f71883t0;
                    C0328a c0328a2 = atomicReference.get();
                    if (c0328a2 == f71878w0) {
                        return;
                    }
                    do {
                        if (atomicReference.compareAndSet(c0328a2, c0328a)) {
                            if (c0328a2 != null) {
                                DisposableHelper.dispose(c0328a2);
                            }
                            completableSource.subscribe(c0328a);
                            return;
                        }
                    } while (atomicReference.get() == c0328a2);
                }
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
                this.f71879p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSwitchMapCompletable(Flowable<T> flowable, Function<? super T, ? extends CompletableSource> function, boolean z10) {
        this.f71875p0 = flowable;
        this.f71876q0 = function;
        this.f71877r0 = z10;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f71875p0.subscribe((FlowableSubscriber) new a(completableObserver, this.f71876q0, this.f71877r0));
    }
}
