package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeMergeArray<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MaybeSource<? extends T>[] f75944q0;

    public static final class a<T> extends ConcurrentLinkedQueue<T> implements d<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f75945p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicInteger f75946q0 = new AtomicInteger();

        @Override // io.reactivex.rxjava3.internal.operators.maybe.MaybeMergeArray.d
        public final void b() {
            poll();
        }

        @Override // io.reactivex.rxjava3.internal.operators.maybe.MaybeMergeArray.d
        public final int c() {
            return this.f75945p0;
        }

        @Override // io.reactivex.rxjava3.internal.operators.maybe.MaybeMergeArray.d
        public final int d() {
            return this.f75946q0.get();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean offer(T t10, T t11) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            T t10 = (T) super.poll();
            if (t10 != null) {
                this.f75945p0++;
            }
            return t10;
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean offer(T t10) {
            this.f75946q0.getAndIncrement();
            return super.offer(t10);
        }
    }

    public static final class b<T> extends BasicIntQueueSubscription<T> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75947p0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final d<Object> f75950s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f75952u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f75953w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public long f75954x0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final CompositeDisposable f75948q0 = new CompositeDisposable();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicLong f75949r0 = new AtomicLong();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicThrowable f75951t0 = new AtomicThrowable();

        public b(Subscriber<? super T> subscriber, int i10, d<Object> dVar) {
            this.f75947p0 = subscriber;
            this.f75952u0 = i10;
            this.f75950s0 = dVar;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            this.f75948q0.dispose();
            if (getAndIncrement() == 0) {
                this.f75950s0.clear();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f75950s0.clear();
        }

        public final void drain() throws Throwable {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            if (this.f75953w0) {
                Subscriber<? super T> subscriber = this.f75947p0;
                d<Object> dVar = this.f75950s0;
                int iAddAndGet2 = 1;
                while (!this.v0) {
                    Throwable th2 = this.f75951t0.get();
                    if (th2 != null) {
                        dVar.clear();
                        subscriber.onError(th2);
                        return;
                    }
                    boolean z10 = dVar.d() == this.f75952u0;
                    if (!dVar.isEmpty()) {
                        subscriber.onNext(null);
                    }
                    if (z10) {
                        subscriber.onComplete();
                        return;
                    } else {
                        iAddAndGet2 = addAndGet(-iAddAndGet2);
                        if (iAddAndGet2 == 0) {
                            return;
                        }
                    }
                }
                dVar.clear();
                return;
            }
            Subscriber<? super T> subscriber2 = this.f75947p0;
            d<Object> dVar2 = this.f75950s0;
            long j10 = this.f75954x0;
            do {
                long j11 = this.f75949r0.get();
                while (j10 != j11) {
                    if (this.v0) {
                        dVar2.clear();
                        return;
                    }
                    if (this.f75951t0.get() != null) {
                        dVar2.clear();
                        this.f75951t0.tryTerminateConsumer(this.f75947p0);
                        return;
                    } else {
                        if (dVar2.c() == this.f75952u0) {
                            subscriber2.onComplete();
                            return;
                        }
                        Object objPoll = dVar2.poll();
                        if (objPoll == null) {
                            break;
                        } else if (objPoll != NotificationLite.COMPLETE) {
                            subscriber2.onNext(objPoll);
                            j10++;
                        }
                    }
                }
                if (j10 == j11) {
                    if (this.f75951t0.get() != null) {
                        dVar2.clear();
                        this.f75951t0.tryTerminateConsumer(this.f75947p0);
                        return;
                    } else {
                        while (dVar2.peek() == NotificationLite.COMPLETE) {
                            dVar2.b();
                        }
                        if (dVar2.c() == this.f75952u0) {
                            subscriber2.onComplete();
                            return;
                        }
                    }
                }
                this.f75954x0 = j10;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f75950s0.isEmpty();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() throws Throwable {
            this.f75950s0.offer(NotificationLite.COMPLETE);
            drain();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) throws Throwable {
            if (this.f75951t0.tryAddThrowableOrReport(th2)) {
                this.f75948q0.dispose();
                this.f75950s0.offer(NotificationLite.COMPLETE);
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f75948q0.add(disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) throws Throwable {
            this.f75950s0.offer(t10);
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            T t10;
            do {
                t10 = (T) this.f75950s0.poll();
            } while (t10 == NotificationLite.COMPLETE);
            return t10;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) throws Throwable {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f75949r0, j10);
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f75953w0 = true;
            return 2;
        }
    }

    public interface d<T> extends SimpleQueue<T> {
        void b();

        int c();

        int d();

        T peek();
    }

    public MaybeMergeArray(MaybeSource<? extends T>[] maybeSourceArr) {
        this.f75944q0 = maybeSourceArr;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        MaybeSource[] maybeSourceArr = this.f75944q0;
        int length = maybeSourceArr.length;
        b bVar = new b(subscriber, length, length <= Flowable.bufferSize() ? new c(length) : new a());
        subscriber.onSubscribe(bVar);
        AtomicThrowable atomicThrowable = bVar.f75951t0;
        for (MaybeSource maybeSource : maybeSourceArr) {
            if (bVar.v0 || atomicThrowable.get() != null) {
                return;
            }
            maybeSource.subscribe(bVar);
        }
    }

    public static final class c<T> extends AtomicReferenceArray<T> implements d<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicInteger f75955p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f75956q0;

        public c(int i10) {
            super(i10);
            this.f75955p0 = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.maybe.MaybeMergeArray.d
        public final void b() {
            int i10 = this.f75956q0;
            lazySet(i10, null);
            this.f75956q0 = i10 + 1;
        }

        @Override // io.reactivex.rxjava3.internal.operators.maybe.MaybeMergeArray.d
        public final int c() {
            return this.f75956q0;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            while (poll() != null && !isEmpty()) {
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.maybe.MaybeMergeArray.d
        public final int d() {
            return this.f75955p0.get();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f75956q0 == this.f75955p0.get();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean offer(T t10) {
            Objects.requireNonNull(t10, "value is null");
            int andIncrement = this.f75955p0.getAndIncrement();
            if (andIncrement >= length()) {
                return false;
            }
            lazySet(andIncrement, t10);
            return true;
        }

        @Override // io.reactivex.rxjava3.internal.operators.maybe.MaybeMergeArray.d
        public final T peek() {
            int i10 = this.f75956q0;
            if (i10 == length()) {
                return null;
            }
            return get(i10);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            int i10 = this.f75956q0;
            if (i10 == length()) {
                return null;
            }
            AtomicInteger atomicInteger = this.f75955p0;
            do {
                T t10 = get(i10);
                if (t10 != null) {
                    this.f75956q0 = i10 + 1;
                    lazySet(i10, null);
                    return t10;
                }
            } while (atomicInteger.get() != i10);
            return null;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean offer(T t10, T t11) {
            throw new UnsupportedOperationException();
        }
    }
}
