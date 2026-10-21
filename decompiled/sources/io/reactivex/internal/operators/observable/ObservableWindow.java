package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableWindow<T> extends io.reactivex.internal.operators.observable.a<T, Observable<T>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f73068p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f73069q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f73070r0;

    public static final class a<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Observable<T>> f73071p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f73072q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f73073r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public long f73074s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Disposable f73075t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public UnicastSubject<T> f73076u0;
        public volatile boolean v0;

        public a(Observer<? super Observable<T>> observer, long j10, int i10) {
            this.f73071p0 = observer;
            this.f73072q0 = j10;
            this.f73073r0 = i10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.v0 = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.v0;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            UnicastSubject<T> unicastSubject = this.f73076u0;
            if (unicastSubject != null) {
                this.f73076u0 = null;
                unicastSubject.onComplete();
            }
            this.f73071p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            UnicastSubject<T> unicastSubject = this.f73076u0;
            if (unicastSubject != null) {
                this.f73076u0 = null;
                unicastSubject.onError(th2);
            }
            this.f73071p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            UnicastSubject<T> unicastSubjectCreate = this.f73076u0;
            if (unicastSubjectCreate == null && !this.v0) {
                unicastSubjectCreate = UnicastSubject.create(this.f73073r0, this);
                this.f73076u0 = unicastSubjectCreate;
                this.f73071p0.onNext(unicastSubjectCreate);
            }
            if (unicastSubjectCreate != null) {
                unicastSubjectCreate.onNext(t10);
                long j10 = this.f73074s0 + 1;
                this.f73074s0 = j10;
                if (j10 >= this.f73072q0) {
                    this.f73074s0 = 0L;
                    this.f73076u0 = null;
                    unicastSubjectCreate.onComplete();
                    if (this.v0) {
                        this.f73075t0.dispose();
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73075t0, disposable)) {
                this.f73075t0 = disposable;
                this.f73071p0.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.v0) {
                this.f73075t0.dispose();
            }
        }
    }

    public static final class b<T> extends AtomicBoolean implements Observer<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Observable<T>> f73077p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f73078q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f73079r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f73080s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public long f73082u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public long f73083w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Disposable f73084x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final AtomicInteger f73085y0 = new AtomicInteger();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final ArrayDeque<UnicastSubject<T>> f73081t0 = new ArrayDeque<>();

        public b(Observer<? super Observable<T>> observer, long j10, long j11, int i10) {
            this.f73077p0 = observer;
            this.f73078q0 = j10;
            this.f73079r0 = j11;
            this.f73080s0 = i10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.v0 = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.v0;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.f73081t0;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.f73077p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.f73081t0;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th2);
            }
            this.f73077p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.f73081t0;
            long j10 = this.f73082u0;
            long j11 = this.f73079r0;
            if (j10 % j11 == 0 && !this.v0) {
                this.f73085y0.getAndIncrement();
                UnicastSubject<T> unicastSubjectCreate = UnicastSubject.create(this.f73080s0, this);
                arrayDeque.offer(unicastSubjectCreate);
                this.f73077p0.onNext(unicastSubjectCreate);
            }
            long j12 = this.f73083w0 + 1;
            Iterator<UnicastSubject<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t10);
            }
            if (j12 >= this.f73078q0) {
                arrayDeque.poll().onComplete();
                if (arrayDeque.isEmpty() && this.v0) {
                    this.f73084x0.dispose();
                    return;
                }
                this.f73083w0 = j12 - j11;
            } else {
                this.f73083w0 = j12;
            }
            this.f73082u0 = j10 + 1;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73084x0, disposable)) {
                this.f73084x0 = disposable;
                this.f73077p0.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f73085y0.decrementAndGet() == 0 && this.v0) {
                this.f73084x0.dispose();
            }
        }
    }

    public ObservableWindow(ObservableSource<T> observableSource, long j10, long j11, int i10) {
        super(observableSource);
        this.f73068p0 = j10;
        this.f73069q0 = j11;
        this.f73070r0 = i10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        long j10 = this.f73069q0;
        long j11 = this.f73068p0;
        if (j11 == j10) {
            this.source.subscribe(new a(observer, j11, this.f73070r0));
        } else {
            this.source.subscribe(new b(observer, this.f73068p0, this.f73069q0, this.f73070r0));
        }
    }
}
