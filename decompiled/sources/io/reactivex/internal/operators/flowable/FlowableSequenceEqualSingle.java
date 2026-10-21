package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableSequenceEqualSingle<T> extends Single<Boolean> implements FuseToFlowable<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Publisher<? extends T> f71129p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<? extends T> f71130q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiPredicate<? super T, ? super T> f71131r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f71132s0;

    public static final class a<T> extends AtomicInteger implements Disposable, FlowableSequenceEqual.b {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Boolean> f71133p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiPredicate<? super T, ? super T> f71134q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final FlowableSequenceEqual.c<T> f71135r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final FlowableSequenceEqual.c<T> f71136s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicThrowable f71137t0 = new AtomicThrowable();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public T f71138u0;
        public T v0;

        public a(SingleObserver<? super Boolean> singleObserver, int i10, BiPredicate<? super T, ? super T> biPredicate) {
            this.f71133p0 = singleObserver;
            this.f71134q0 = biPredicate;
            this.f71135r0 = new FlowableSequenceEqual.c<>(this, i10);
            this.f71136s0 = new FlowableSequenceEqual.c<>(this, i10);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.b
        public final void a(Throwable th2) {
            if (this.f71137t0.addThrowable(th2)) {
                drain();
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        public final void b() {
            FlowableSequenceEqual.c<T> cVar = this.f71135r0;
            cVar.getClass();
            SubscriptionHelper.cancel(cVar);
            cVar.a();
            FlowableSequenceEqual.c<T> cVar2 = this.f71136s0;
            cVar2.getClass();
            SubscriptionHelper.cancel(cVar2);
            cVar2.a();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            FlowableSequenceEqual.c<T> cVar = this.f71135r0;
            cVar.getClass();
            SubscriptionHelper.cancel(cVar);
            FlowableSequenceEqual.c<T> cVar2 = this.f71136s0;
            cVar2.getClass();
            SubscriptionHelper.cancel(cVar2);
            if (getAndIncrement() == 0) {
                cVar.a();
                cVar2.a();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.b
        public final void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                SimpleQueue<T> simpleQueue = this.f71135r0.f71127t0;
                SimpleQueue<T> simpleQueue2 = this.f71136s0.f71127t0;
                if (simpleQueue != null && simpleQueue2 != null) {
                    while (true) {
                        if (isDisposed()) {
                            this.f71135r0.a();
                            this.f71136s0.a();
                            return;
                        }
                        if (this.f71137t0.get() != null) {
                            b();
                            this.f71133p0.onError(this.f71137t0.terminate());
                            return;
                        }
                        boolean z10 = this.f71135r0.f71128u0;
                        T tPoll = this.f71138u0;
                        if (tPoll == null) {
                            try {
                                tPoll = simpleQueue.poll();
                                this.f71138u0 = tPoll;
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                b();
                                this.f71137t0.addThrowable(th2);
                                this.f71133p0.onError(this.f71137t0.terminate());
                                return;
                            }
                        }
                        boolean z11 = tPoll == null;
                        boolean z12 = this.f71136s0.f71128u0;
                        T tPoll2 = this.v0;
                        if (tPoll2 == null) {
                            try {
                                tPoll2 = simpleQueue2.poll();
                                this.v0 = tPoll2;
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                b();
                                this.f71137t0.addThrowable(th3);
                                this.f71133p0.onError(this.f71137t0.terminate());
                                return;
                            }
                        }
                        boolean z13 = tPoll2 == null;
                        if (z10 && z12 && z11 && z13) {
                            this.f71133p0.onSuccess(Boolean.TRUE);
                            return;
                        }
                        if (z10 && z12 && z11 != z13) {
                            b();
                            this.f71133p0.onSuccess(Boolean.FALSE);
                            return;
                        }
                        if (z11 || z13) {
                            break;
                        }
                        try {
                            if (!this.f71134q0.test(tPoll, tPoll2)) {
                                b();
                                this.f71133p0.onSuccess(Boolean.FALSE);
                                return;
                            } else {
                                this.f71138u0 = null;
                                this.v0 = null;
                                this.f71135r0.b();
                                this.f71136s0.b();
                            }
                        } catch (Throwable th4) {
                            Exceptions.throwIfFatal(th4);
                            b();
                            this.f71137t0.addThrowable(th4);
                            this.f71133p0.onError(this.f71137t0.terminate());
                            return;
                        }
                    }
                } else if (isDisposed()) {
                    this.f71135r0.a();
                    this.f71136s0.a();
                    return;
                } else if (this.f71137t0.get() != null) {
                    b();
                    this.f71133p0.onError(this.f71137t0.terminate());
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71135r0.get() == SubscriptionHelper.CANCELLED;
        }
    }

    public FlowableSequenceEqualSingle(Publisher<? extends T> publisher, Publisher<? extends T> publisher2, BiPredicate<? super T, ? super T> biPredicate, int i10) {
        this.f71129p0 = publisher;
        this.f71130q0 = publisher2;
        this.f71131r0 = biPredicate;
        this.f71132s0 = i10;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<Boolean> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableSequenceEqual(this.f71129p0, this.f71130q0, this.f71131r0, this.f71132s0));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        a aVar = new a(singleObserver, this.f71132s0, this.f71131r0);
        singleObserver.onSubscribe(aVar);
        this.f71129p0.subscribe(aVar.f71135r0);
        this.f71130q0.subscribe(aVar.f71136s0);
    }
}
