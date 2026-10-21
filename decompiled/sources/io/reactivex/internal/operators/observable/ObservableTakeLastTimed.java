package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableTakeLastTimed<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f72945p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f72946q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f72947r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f72948s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f72949t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final boolean f72950u0;

    public static final class a<T> extends AtomicBoolean implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72951p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f72952q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f72953r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final TimeUnit f72954s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Scheduler f72955t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<Object> f72956u0;
        public final boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Disposable f72957w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f72958x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public Throwable f72959y0;

        public a(int i10, long j10, long j11, Observer observer, Scheduler scheduler, TimeUnit timeUnit, boolean z10) {
            this.f72951p0 = observer;
            this.f72952q0 = j10;
            this.f72953r0 = j11;
            this.f72954s0 = timeUnit;
            this.f72955t0 = scheduler;
            this.f72956u0 = new SpscLinkedArrayQueue<>(i10);
            this.v0 = z10;
        }

        public final void a() {
            Throwable th2;
            if (compareAndSet(false, true)) {
                Observer<? super T> observer = this.f72951p0;
                SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f72956u0;
                boolean z10 = this.v0;
                long jNow = this.f72955t0.now(this.f72954s0) - this.f72953r0;
                while (!this.f72958x0) {
                    if (!z10 && (th2 = this.f72959y0) != null) {
                        spscLinkedArrayQueue.clear();
                        observer.onError(th2);
                        return;
                    }
                    Object objPoll = spscLinkedArrayQueue.poll();
                    if (objPoll == null) {
                        Throwable th3 = this.f72959y0;
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

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f72958x0) {
                return;
            }
            this.f72958x0 = true;
            this.f72957w0.dispose();
            if (compareAndSet(false, true)) {
                this.f72956u0.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72958x0;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72959y0 = th2;
            a();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            long jNow = this.f72955t0.now(this.f72954s0);
            long j10 = this.f72952q0;
            boolean z10 = j10 == Long.MAX_VALUE;
            Long lValueOf = Long.valueOf(jNow);
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f72956u0;
            spscLinkedArrayQueue.offer(lValueOf, t10);
            while (!spscLinkedArrayQueue.isEmpty()) {
                if (((Long) spscLinkedArrayQueue.peek()).longValue() > jNow - this.f72953r0 && (z10 || (spscLinkedArrayQueue.size() >> 1) <= j10)) {
                    return;
                }
                spscLinkedArrayQueue.poll();
                spscLinkedArrayQueue.poll();
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72957w0, disposable)) {
                this.f72957w0 = disposable;
                this.f72951p0.onSubscribe(this);
            }
        }
    }

    public ObservableTakeLastTimed(ObservableSource<T> observableSource, long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z10) {
        super(observableSource);
        this.f72945p0 = j10;
        this.f72946q0 = j11;
        this.f72947r0 = timeUnit;
        this.f72948s0 = scheduler;
        this.f72949t0 = i10;
        this.f72950u0 = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        ObservableSource<T> observableSource = this.source;
        long j10 = this.f72945p0;
        long j11 = this.f72946q0;
        TimeUnit timeUnit = this.f72947r0;
        observableSource.subscribe(new a(this.f72949t0, j10, j11, observer, this.f72948s0, timeUnit, this.f72950u0));
    }
}
