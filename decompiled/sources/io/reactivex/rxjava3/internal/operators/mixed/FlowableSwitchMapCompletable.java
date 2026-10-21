package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSwitchMapCompletable<T> extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f76130p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends CompletableSource> f76131q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f76132r0;

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static final C0392a f76133w0 = new C0392a(null);

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f76134p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends CompletableSource> f76135q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f76136r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f76137s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<C0392a> f76138t0 = new AtomicReference<>();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f76139u0;
        public Subscription v0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.mixed.FlowableSwitchMapCompletable$a$a, reason: collision with other inner class name */
        public static final class C0392a extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?> f76140p0;

            public C0392a(a<?> aVar) {
                this.f76140p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                a<?> aVar = this.f76140p0;
                AtomicReference<C0392a> atomicReference = aVar.f76138t0;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                if (aVar.f76139u0) {
                    aVar.f76137s0.tryTerminateConsumer(aVar.f76134p0);
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a<?> aVar = this.f76140p0;
                AtomicReference<C0392a> atomicReference = aVar.f76138t0;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        RxJavaPlugins.onError(th2);
                        return;
                    }
                }
                if (aVar.f76137s0.tryAddThrowableOrReport(th2)) {
                    if (aVar.f76136r0) {
                        if (aVar.f76139u0) {
                            aVar.f76137s0.tryTerminateConsumer(aVar.f76134p0);
                        }
                    } else {
                        aVar.v0.cancel();
                        aVar.a();
                        aVar.f76137s0.tryTerminateConsumer(aVar.f76134p0);
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z10) {
            this.f76134p0 = completableObserver;
            this.f76135q0 = function;
            this.f76136r0 = z10;
        }

        public final void a() {
            AtomicReference<C0392a> atomicReference = this.f76138t0;
            C0392a c0392a = f76133w0;
            C0392a andSet = atomicReference.getAndSet(c0392a);
            if (andSet == null || andSet == c0392a) {
                return;
            }
            DisposableHelper.dispose(andSet);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.v0.cancel();
            a();
            this.f76137s0.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76138t0.get() == f76133w0;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f76139u0 = true;
            if (this.f76138t0.get() == null) {
                this.f76137s0.tryTerminateConsumer(this.f76134p0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            AtomicThrowable atomicThrowable = this.f76137s0;
            if (atomicThrowable.tryAddThrowableOrReport(th2)) {
                if (this.f76136r0) {
                    onComplete();
                } else {
                    a();
                    atomicThrowable.tryTerminateConsumer(this.f76134p0);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            try {
                CompletableSource completableSourceApply = this.f76135q0.apply(t10);
                Objects.requireNonNull(completableSourceApply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = completableSourceApply;
                C0392a c0392a = new C0392a(this);
                while (true) {
                    AtomicReference<C0392a> atomicReference = this.f76138t0;
                    C0392a c0392a2 = atomicReference.get();
                    if (c0392a2 == f76133w0) {
                        return;
                    }
                    do {
                        if (atomicReference.compareAndSet(c0392a2, c0392a)) {
                            if (c0392a2 != null) {
                                DisposableHelper.dispose(c0392a2);
                            }
                            completableSource.subscribe(c0392a);
                            return;
                        }
                    } while (atomicReference.get() == c0392a2);
                }
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
                this.f76134p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSwitchMapCompletable(Flowable<T> flowable, Function<? super T, ? extends CompletableSource> function, boolean z10) {
        this.f76130p0 = flowable;
        this.f76131q0 = function;
        this.f76132r0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f76130p0.subscribe((FlowableSubscriber) new a(completableObserver, this.f76131q0, this.f76132r0));
    }
}
