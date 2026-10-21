package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableConcat extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<? extends CompletableSource> f69993p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f69994q0;

    public static final class a extends AtomicInteger implements FlowableSubscriber<CompletableSource>, Disposable {
        public volatile boolean E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f69995p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f69996q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f69997r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final C0296a f69998s0 = new C0296a(this);

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicBoolean f69999t0 = new AtomicBoolean();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f70000u0;
        public int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public SimpleQueue<CompletableSource> f70001w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Subscription f70002x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f70003y0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.completable.CompletableConcat$a$a, reason: collision with other inner class name */
        public static final class C0296a extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a f70004p0;

            public C0296a(a aVar) {
                this.f70004p0 = aVar;
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                a aVar = this.f70004p0;
                aVar.E0 = false;
                aVar.a();
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th2) {
                a aVar = this.f70004p0;
                if (!aVar.f69999t0.compareAndSet(false, true)) {
                    RxJavaPlugins.onError(th2);
                } else {
                    aVar.f70002x0.cancel();
                    aVar.f69995p0.onError(th2);
                }
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }
        }

        public a(CompletableObserver completableObserver, int i10) {
            this.f69995p0 = completableObserver;
            this.f69996q0 = i10;
            this.f69997r0 = i10 - (i10 >> 2);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!isDisposed()) {
                if (!this.E0) {
                    boolean z10 = this.f70003y0;
                    try {
                        CompletableSource completableSourcePoll = this.f70001w0.poll();
                        boolean z11 = completableSourcePoll == null;
                        if (z10 && z11) {
                            if (this.f69999t0.compareAndSet(false, true)) {
                                this.f69995p0.onComplete();
                                return;
                            }
                            return;
                        } else if (!z11) {
                            this.E0 = true;
                            completableSourcePoll.subscribe(this.f69998s0);
                            if (this.f70000u0 != 1) {
                                int i10 = this.v0 + 1;
                                if (i10 == this.f69997r0) {
                                    this.v0 = 0;
                                    this.f70002x0.request(i10);
                                } else {
                                    this.v0 = i10;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        if (!this.f69999t0.compareAndSet(false, true)) {
                            RxJavaPlugins.onError(th2);
                            return;
                        } else {
                            this.f70002x0.cancel();
                            this.f69995p0.onError(th2);
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f70002x0.cancel();
            DisposableHelper.dispose(this.f69998s0);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f69998s0.get());
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f70003y0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (!this.f69999t0.compareAndSet(false, true)) {
                RxJavaPlugins.onError(th2);
            } else {
                DisposableHelper.dispose(this.f69998s0);
                this.f69995p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            CompletableSource completableSource = (CompletableSource) obj;
            if (this.f70000u0 != 0 || this.f70001w0.offer(completableSource)) {
                a();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70002x0, subscription)) {
                this.f70002x0 = subscription;
                int i10 = this.f69996q0;
                long j10 = i10 == Integer.MAX_VALUE ? Long.MAX_VALUE : i10;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f70000u0 = iRequestFusion;
                        this.f70001w0 = queueSubscription;
                        this.f70003y0 = true;
                        this.f69995p0.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f70000u0 = iRequestFusion;
                        this.f70001w0 = queueSubscription;
                        this.f69995p0.onSubscribe(this);
                        subscription.request(j10);
                        return;
                    }
                }
                if (this.f69996q0 == Integer.MAX_VALUE) {
                    this.f70001w0 = new SpscLinkedArrayQueue(Flowable.bufferSize());
                } else {
                    this.f70001w0 = new SpscArrayQueue(this.f69996q0);
                }
                this.f69995p0.onSubscribe(this);
                subscription.request(j10);
            }
        }
    }

    public CompletableConcat(Publisher<? extends CompletableSource> publisher, int i10) {
        this.f69993p0 = publisher;
        this.f69994q0 = i10;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f69993p0.subscribe(new a(completableObserver, this.f69994q0));
    }
}
