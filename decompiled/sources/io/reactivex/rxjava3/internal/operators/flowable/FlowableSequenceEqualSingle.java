package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSequenceEqualSingle<T> extends Single<Boolean> implements FuseToFlowable<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<? extends T> f75387p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<? extends T> f75388q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiPredicate<? super T, ? super T> f75389r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f75390s0;

    public static final class a<T> extends AtomicInteger implements Disposable, FlowableSequenceEqual.b {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Boolean> f75391p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiPredicate<? super T, ? super T> f75392q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final FlowableSequenceEqual.c<T> f75393r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final FlowableSequenceEqual.c<T> f75394s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicThrowable f75395t0 = new AtomicThrowable();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public T f75396u0;
        public T v0;

        public a(SingleObserver<? super Boolean> singleObserver, int i10, BiPredicate<? super T, ? super T> biPredicate) {
            this.f75391p0 = singleObserver;
            this.f75392q0 = biPredicate;
            this.f75393r0 = new FlowableSequenceEqual.c<>(this, i10);
            this.f75394s0 = new FlowableSequenceEqual.c<>(this, i10);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSequenceEqual.b
        public final void a(Throwable th2) {
            if (this.f75395t0.tryAddThrowableOrReport(th2)) {
                drain();
            }
        }

        public final void b() {
            FlowableSequenceEqual.c<T> cVar = this.f75393r0;
            cVar.getClass();
            SubscriptionHelper.cancel(cVar);
            cVar.a();
            FlowableSequenceEqual.c<T> cVar2 = this.f75394s0;
            cVar2.getClass();
            SubscriptionHelper.cancel(cVar2);
            cVar2.a();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            FlowableSequenceEqual.c<T> cVar = this.f75393r0;
            cVar.getClass();
            SubscriptionHelper.cancel(cVar);
            FlowableSequenceEqual.c<T> cVar2 = this.f75394s0;
            cVar2.getClass();
            SubscriptionHelper.cancel(cVar2);
            this.f75395t0.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                cVar.a();
                cVar2.a();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSequenceEqual.b
        public final void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                SimpleQueue<T> simpleQueue = this.f75393r0.f75385t0;
                SimpleQueue<T> simpleQueue2 = this.f75394s0.f75385t0;
                if (simpleQueue != null && simpleQueue2 != null) {
                    while (true) {
                        if (isDisposed()) {
                            this.f75393r0.a();
                            this.f75394s0.a();
                            return;
                        }
                        if (this.f75395t0.get() != null) {
                            b();
                            this.f75395t0.tryTerminateConsumer(this.f75391p0);
                            return;
                        }
                        boolean z10 = this.f75393r0.f75386u0;
                        T tPoll = this.f75396u0;
                        if (tPoll == null) {
                            try {
                                tPoll = simpleQueue.poll();
                                this.f75396u0 = tPoll;
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                b();
                                this.f75395t0.tryAddThrowableOrReport(th2);
                                this.f75395t0.tryTerminateConsumer(this.f75391p0);
                                return;
                            }
                        }
                        boolean z11 = tPoll == null;
                        boolean z12 = this.f75394s0.f75386u0;
                        T tPoll2 = this.v0;
                        if (tPoll2 == null) {
                            try {
                                tPoll2 = simpleQueue2.poll();
                                this.v0 = tPoll2;
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                b();
                                this.f75395t0.tryAddThrowableOrReport(th3);
                                this.f75395t0.tryTerminateConsumer(this.f75391p0);
                                return;
                            }
                        }
                        boolean z13 = tPoll2 == null;
                        if (z10 && z12 && z11 && z13) {
                            this.f75391p0.onSuccess(Boolean.TRUE);
                            return;
                        }
                        if (z10 && z12 && z11 != z13) {
                            b();
                            this.f75391p0.onSuccess(Boolean.FALSE);
                            return;
                        }
                        if (z11 || z13) {
                            break;
                        }
                        try {
                            if (!this.f75392q0.test(tPoll, tPoll2)) {
                                b();
                                this.f75391p0.onSuccess(Boolean.FALSE);
                                return;
                            } else {
                                this.f75396u0 = null;
                                this.v0 = null;
                                this.f75393r0.b();
                                this.f75394s0.b();
                            }
                        } catch (Throwable th4) {
                            Exceptions.throwIfFatal(th4);
                            b();
                            this.f75395t0.tryAddThrowableOrReport(th4);
                            this.f75395t0.tryTerminateConsumer(this.f75391p0);
                            return;
                        }
                    }
                } else if (isDisposed()) {
                    this.f75393r0.a();
                    this.f75394s0.a();
                    return;
                } else if (this.f75395t0.get() != null) {
                    b();
                    this.f75395t0.tryTerminateConsumer(this.f75391p0);
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75393r0.get() == SubscriptionHelper.CANCELLED;
        }
    }

    public FlowableSequenceEqualSingle(Publisher<? extends T> publisher, Publisher<? extends T> publisher2, BiPredicate<? super T, ? super T> biPredicate, int i10) {
        this.f75387p0 = publisher;
        this.f75388q0 = publisher2;
        this.f75389r0 = biPredicate;
        this.f75390s0 = i10;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToFlowable
    public Flowable<Boolean> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableSequenceEqual(this.f75387p0, this.f75388q0, this.f75389r0, this.f75390s0));
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        a aVar = new a(singleObserver, this.f75390s0, this.f75389r0);
        singleObserver.onSubscribe(aVar);
        this.f75387p0.subscribe(aVar.f75393r0);
        this.f75388q0.subscribe(aVar.f75394s0);
    }
}
