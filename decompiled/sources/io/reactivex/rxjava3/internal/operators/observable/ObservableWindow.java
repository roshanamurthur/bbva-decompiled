package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.subjects.UnicastSubject;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableWindow<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, Observable<T>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f77345p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f77346q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f77347r0;

    public static final class a<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Observable<T>> f77348p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f77349q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f77350r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicBoolean f77351s0 = new AtomicBoolean();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public long f77352t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f77353u0;
        public UnicastSubject<T> v0;

        public a(Observer<? super Observable<T>> observer, long j10, int i10) {
            this.f77348p0 = observer;
            this.f77349q0 = j10;
            this.f77350r0 = i10;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f77351s0.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77351s0.get();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            UnicastSubject<T> unicastSubject = this.v0;
            if (unicastSubject != null) {
                this.v0 = null;
                unicastSubject.onComplete();
            }
            this.f77348p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            UnicastSubject<T> unicastSubject = this.v0;
            if (unicastSubject != null) {
                this.v0 = null;
                unicastSubject.onError(th2);
            }
            this.f77348p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            io.reactivex.rxjava3.internal.operators.observable.b bVar;
            UnicastSubject<T> unicastSubjectCreate = this.v0;
            if (unicastSubjectCreate != null || this.f77351s0.get()) {
                bVar = null;
            } else {
                getAndIncrement();
                unicastSubjectCreate = UnicastSubject.create(this.f77350r0, this);
                this.v0 = unicastSubjectCreate;
                bVar = new io.reactivex.rxjava3.internal.operators.observable.b(unicastSubjectCreate);
                this.f77348p0.onNext(bVar);
            }
            if (unicastSubjectCreate != null) {
                unicastSubjectCreate.onNext(t10);
                long j10 = this.f77352t0 + 1;
                this.f77352t0 = j10;
                if (j10 >= this.f77349q0) {
                    this.f77352t0 = 0L;
                    this.v0 = null;
                    unicastSubjectCreate.onComplete();
                }
                if (bVar == null || !bVar.d()) {
                    return;
                }
                this.v0 = null;
                unicastSubjectCreate.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77353u0, disposable)) {
                this.f77353u0 = disposable;
                this.f77348p0.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.f77353u0.dispose();
            }
        }
    }

    public static final class b<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Observable<T>> f77354p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f77355q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f77356r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f77357s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final ArrayDeque<UnicastSubject<T>> f77358t0 = new ArrayDeque<>();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicBoolean f77359u0 = new AtomicBoolean();
        public long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public long f77360w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Disposable f77361x0;

        public b(Observer<? super Observable<T>> observer, long j10, long j11, int i10) {
            this.f77354p0 = observer;
            this.f77355q0 = j10;
            this.f77356r0 = j11;
            this.f77357s0 = i10;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f77359u0.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77359u0.get();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.f77358t0;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.f77354p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.f77358t0;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th2);
            }
            this.f77354p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            io.reactivex.rxjava3.internal.operators.observable.b bVar;
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.f77358t0;
            long j10 = this.v0;
            long j11 = this.f77356r0;
            long j12 = j10 % j11;
            AtomicBoolean atomicBoolean = this.f77359u0;
            if (j12 != 0 || atomicBoolean.get()) {
                bVar = null;
            } else {
                getAndIncrement();
                UnicastSubject<T> unicastSubjectCreate = UnicastSubject.create(this.f77357s0, this);
                bVar = new io.reactivex.rxjava3.internal.operators.observable.b(unicastSubjectCreate);
                arrayDeque.offer(unicastSubjectCreate);
                this.f77354p0.onNext(bVar);
            }
            long j13 = this.f77360w0 + 1;
            Iterator<UnicastSubject<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t10);
            }
            if (j13 >= this.f77355q0) {
                arrayDeque.poll().onComplete();
                if (arrayDeque.isEmpty() && atomicBoolean.get()) {
                    return;
                } else {
                    this.f77360w0 = j13 - j11;
                }
            } else {
                this.f77360w0 = j13;
            }
            this.v0 = j10 + 1;
            if (bVar == null || !bVar.d()) {
                return;
            }
            bVar.f77459p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77361x0, disposable)) {
                this.f77361x0 = disposable;
                this.f77354p0.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.f77361x0.dispose();
            }
        }
    }

    public ObservableWindow(ObservableSource<T> observableSource, long j10, long j11, int i10) {
        super(observableSource);
        this.f77345p0 = j10;
        this.f77346q0 = j11;
        this.f77347r0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        long j10 = this.f77346q0;
        long j11 = this.f77345p0;
        if (j11 == j10) {
            this.source.subscribe(new a(observer, j11, this.f77347r0));
        } else {
            this.source.subscribe(new b(observer, this.f77345p0, this.f77346q0, this.f77347r0));
        }
    }
}
