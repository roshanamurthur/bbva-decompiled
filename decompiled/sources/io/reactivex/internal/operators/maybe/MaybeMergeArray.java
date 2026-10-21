package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeMergeArray<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MaybeSource<? extends T>[] f71704q0;

    public static final class a<T> extends ConcurrentLinkedQueue<T> implements d<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f71705p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicInteger f71706q0 = new AtomicInteger();

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.d
        public final void b() {
            poll();
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.d
        public final int c() {
            return this.f71705p0;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.d
        public final int d() {
            return this.f71706q0.get();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean offer(T t10, T t11) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            T t10 = (T) super.poll();
            if (t10 != null) {
                this.f71705p0++;
            }
            return t10;
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.internal.fuseable.SimpleQueue
        public final boolean offer(T t10) {
            this.f71706q0.getAndIncrement();
            return super.offer(t10);
        }
    }

    public static final class b<T> extends BasicIntQueueSubscription<T> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71707p0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final d<Object> f71710s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f71712u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f71713w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public long f71714x0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final CompositeDisposable f71708q0 = new CompositeDisposable();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicLong f71709r0 = new AtomicLong();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicThrowable f71711t0 = new AtomicThrowable();

        public b(Subscriber<? super T> subscriber, int i10, d<Object> dVar) {
            this.f71707p0 = subscriber;
            this.f71712u0 = i10;
            this.f71710s0 = dVar;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            this.f71708q0.dispose();
            if (getAndIncrement() == 0) {
                this.f71710s0.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f71710s0.clear();
        }

        public final void drain() throws Exception {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            if (this.f71713w0) {
                Subscriber<? super T> subscriber = this.f71707p0;
                d<Object> dVar = this.f71710s0;
                int iAddAndGet2 = 1;
                while (!this.v0) {
                    Throwable th2 = this.f71711t0.get();
                    if (th2 != null) {
                        dVar.clear();
                        subscriber.onError(th2);
                        return;
                    }
                    boolean z10 = dVar.d() == this.f71712u0;
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
            Subscriber<? super T> subscriber2 = this.f71707p0;
            d<Object> dVar2 = this.f71710s0;
            long j10 = this.f71714x0;
            do {
                long j11 = this.f71709r0.get();
                while (j10 != j11) {
                    if (this.v0) {
                        dVar2.clear();
                        return;
                    }
                    if (this.f71711t0.get() != null) {
                        dVar2.clear();
                        subscriber2.onError(this.f71711t0.terminate());
                        return;
                    } else {
                        if (dVar2.c() == this.f71712u0) {
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
                    if (this.f71711t0.get() != null) {
                        dVar2.clear();
                        subscriber2.onError(this.f71711t0.terminate());
                        return;
                    } else {
                        while (dVar2.peek() == NotificationLite.COMPLETE) {
                            dVar2.b();
                        }
                        if (dVar2.c() == this.f71712u0) {
                            subscriber2.onComplete();
                            return;
                        }
                    }
                }
                this.f71714x0 = j10;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f71710s0.isEmpty();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() throws Exception {
            this.f71710s0.offer(NotificationLite.COMPLETE);
            drain();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) throws Exception {
            if (!this.f71711t0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f71708q0.dispose();
            this.f71710s0.offer(NotificationLite.COMPLETE);
            drain();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            this.f71708q0.add(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) throws Exception {
            this.f71710s0.offer(t10);
            drain();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Exception {
            T t10;
            do {
                t10 = (T) this.f71710s0.poll();
            } while (t10 == NotificationLite.COMPLETE);
            return t10;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) throws Exception {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f71709r0, j10);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f71713w0 = true;
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
        this.f71704q0 = maybeSourceArr;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        MaybeSource[] maybeSourceArr = this.f71704q0;
        int length = maybeSourceArr.length;
        b bVar = new b(subscriber, length, length <= Flowable.bufferSize() ? new c(length) : new a());
        subscriber.onSubscribe(bVar);
        AtomicThrowable atomicThrowable = bVar.f71711t0;
        for (MaybeSource maybeSource : maybeSourceArr) {
            if (bVar.v0 || atomicThrowable.get() != null) {
                return;
            }
            maybeSource.subscribe(bVar);
        }
    }

    public static final class c<T> extends AtomicReferenceArray<T> implements d<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicInteger f71715p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f71716q0;

        public c(int i10) {
            super(i10);
            this.f71715p0 = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.d
        public final void b() {
            int i10 = this.f71716q0;
            lazySet(i10, null);
            this.f71716q0 = i10 + 1;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.d
        public final int c() {
            return this.f71716q0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            while (poll() != null && !isEmpty()) {
            }
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.d
        public final int d() {
            return this.f71715p0.get();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f71716q0 == this.f71715p0.get();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean offer(T t10) {
            ObjectHelper.requireNonNull(t10, "value is null");
            int andIncrement = this.f71715p0.getAndIncrement();
            if (andIncrement >= length()) {
                return false;
            }
            lazySet(andIncrement, t10);
            return true;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.d
        public final T peek() {
            int i10 = this.f71716q0;
            if (i10 == length()) {
                return null;
            }
            return get(i10);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            int i10 = this.f71716q0;
            if (i10 == length()) {
                return null;
            }
            AtomicInteger atomicInteger = this.f71715p0;
            do {
                T t10 = get(i10);
                if (t10 != null) {
                    this.f71716q0 = i10 + 1;
                    lazySet(i10, null);
                    return t10;
                }
            } while (atomicInteger.get() != i10);
            return null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean offer(T t10, T t11) {
            throw new UnsupportedOperationException();
        }
    }
}
