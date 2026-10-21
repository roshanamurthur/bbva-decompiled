package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableConcat extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<? extends CompletableSource> f74250p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f74251q0;

    public static final class a extends AtomicInteger implements FlowableSubscriber<CompletableSource>, Disposable {
        public volatile boolean E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74252p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f74253q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f74254r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final C0360a f74255s0 = new C0360a(this);

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicBoolean f74256t0 = new AtomicBoolean();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f74257u0;
        public int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public SimpleQueue<CompletableSource> f74258w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Subscription f74259x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f74260y0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.completable.CompletableConcat$a$a, reason: collision with other inner class name */
        public static final class C0360a extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a f74261p0;

            public C0360a(a aVar) {
                this.f74261p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                a aVar = this.f74261p0;
                aVar.E0 = false;
                aVar.a();
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a aVar = this.f74261p0;
                if (!aVar.f74256t0.compareAndSet(false, true)) {
                    RxJavaPlugins.onError(th2);
                } else {
                    aVar.f74259x0.cancel();
                    aVar.f74252p0.onError(th2);
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }
        }

        public a(CompletableObserver completableObserver, int i10) {
            this.f74252p0 = completableObserver;
            this.f74253q0 = i10;
            this.f74254r0 = i10 - (i10 >> 2);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!isDisposed()) {
                if (!this.E0) {
                    boolean z10 = this.f74260y0;
                    try {
                        CompletableSource completableSourcePoll = this.f74258w0.poll();
                        boolean z11 = completableSourcePoll == null;
                        if (z10 && z11) {
                            this.f74252p0.onComplete();
                            return;
                        }
                        if (!z11) {
                            this.E0 = true;
                            completableSourcePoll.subscribe(this.f74255s0);
                            if (this.f74257u0 != 1) {
                                int i10 = this.v0 + 1;
                                if (i10 == this.f74254r0) {
                                    this.v0 = 0;
                                    this.f74259x0.request(i10);
                                } else {
                                    this.v0 = i10;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        if (!this.f74256t0.compareAndSet(false, true)) {
                            RxJavaPlugins.onError(th2);
                            return;
                        } else {
                            this.f74259x0.cancel();
                            this.f74252p0.onError(th2);
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74259x0.cancel();
            DisposableHelper.dispose(this.f74255s0);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f74255s0.get());
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f74260y0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (!this.f74256t0.compareAndSet(false, true)) {
                RxJavaPlugins.onError(th2);
            } else {
                DisposableHelper.dispose(this.f74255s0);
                this.f74252p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            CompletableSource completableSource = (CompletableSource) obj;
            if (this.f74257u0 != 0 || this.f74258w0.offer(completableSource)) {
                a();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74259x0, subscription)) {
                this.f74259x0 = subscription;
                int i10 = this.f74253q0;
                long j10 = i10 == Integer.MAX_VALUE ? Long.MAX_VALUE : i10;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f74257u0 = iRequestFusion;
                        this.f74258w0 = queueSubscription;
                        this.f74260y0 = true;
                        this.f74252p0.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f74257u0 = iRequestFusion;
                        this.f74258w0 = queueSubscription;
                        this.f74252p0.onSubscribe(this);
                        subscription.request(j10);
                        return;
                    }
                }
                if (this.f74253q0 == Integer.MAX_VALUE) {
                    this.f74258w0 = new SpscLinkedArrayQueue(Flowable.bufferSize());
                } else {
                    this.f74258w0 = new SpscArrayQueue(this.f74253q0);
                }
                this.f74252p0.onSubscribe(this);
                subscription.request(j10);
            }
        }
    }

    public CompletableConcat(Publisher<? extends CompletableSource> publisher, int i10) {
        this.f74250p0 = publisher;
        this.f74251q0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f74250p0.subscribe(new a(completableObserver, this.f74251q0));
    }
}
