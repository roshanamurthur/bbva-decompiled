package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableTakeLastTimed<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f77222p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f77223q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f77224r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f77225s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f77226t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final boolean f77227u0;

    public static final class a<T> extends AtomicBoolean implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77228p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f77229q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f77230r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final TimeUnit f77231s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Scheduler f77232t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<Object> f77233u0;
        public final boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Disposable f77234w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f77235x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public Throwable f77236y0;

        public a(int i10, long j10, long j11, Observer observer, Scheduler scheduler, TimeUnit timeUnit, boolean z10) {
            this.f77228p0 = observer;
            this.f77229q0 = j10;
            this.f77230r0 = j11;
            this.f77231s0 = timeUnit;
            this.f77232t0 = scheduler;
            this.f77233u0 = new SpscLinkedArrayQueue<>(i10);
            this.v0 = z10;
        }

        public final void a() {
            Throwable th2;
            if (compareAndSet(false, true)) {
                Observer<? super T> observer = this.f77228p0;
                SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f77233u0;
                boolean z10 = this.v0;
                long jNow = this.f77232t0.now(this.f77231s0) - this.f77230r0;
                while (!this.f77235x0) {
                    if (!z10 && (th2 = this.f77236y0) != null) {
                        spscLinkedArrayQueue.clear();
                        observer.onError(th2);
                        return;
                    }
                    Object objPoll = spscLinkedArrayQueue.poll();
                    if (objPoll == null) {
                        Throwable th3 = this.f77236y0;
                        if (th3 != null) {
                            observer.onError(th3);
                            return;
                        } else {
                            observer.onComplete();
                            return;
                        }
                    }
                    Object objPoll2 = spscLinkedArrayQueue.poll();
                    if (((Long) objPoll).longValue() >= jNow) {
                        observer.onNext(objPoll2);
                    }
                }
                spscLinkedArrayQueue.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f77235x0) {
                return;
            }
            this.f77235x0 = true;
            this.f77234w0.dispose();
            if (compareAndSet(false, true)) {
                this.f77233u0.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77235x0;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f77236y0 = th2;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            long jNow = this.f77232t0.now(this.f77231s0);
            long j10 = this.f77229q0;
            boolean z10 = j10 == Long.MAX_VALUE;
            Long lValueOf = Long.valueOf(jNow);
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f77233u0;
            spscLinkedArrayQueue.offer(lValueOf, t10);
            while (!spscLinkedArrayQueue.isEmpty()) {
                if (((Long) spscLinkedArrayQueue.peek()).longValue() > jNow - this.f77230r0 && (z10 || (spscLinkedArrayQueue.size() >> 1) <= j10)) {
                    return;
                }
                spscLinkedArrayQueue.poll();
                spscLinkedArrayQueue.poll();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77234w0, disposable)) {
                this.f77234w0 = disposable;
                this.f77228p0.onSubscribe(this);
            }
        }
    }

    public ObservableTakeLastTimed(ObservableSource<T> observableSource, long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z10) {
        super(observableSource);
        this.f77222p0 = j10;
        this.f77223q0 = j11;
        this.f77224r0 = timeUnit;
        this.f77225s0 = scheduler;
        this.f77226t0 = i10;
        this.f77227u0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        ObservableSource<T> observableSource = this.source;
        long j10 = this.f77222p0;
        long j11 = this.f77223q0;
        TimeUnit timeUnit = this.f77224r0;
        observableSource.subscribe(new a(this.f77226t0, j10, j11, observer, this.f77225s0, timeUnit, this.f77227u0));
    }
}
