package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.observers.DisposableObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableWindowBoundary<T, B> extends io.reactivex.rxjava3.internal.operators.observable.a<T, Observable<T>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<B> f77362p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f77363q0;

    public static final class a<T, B> extends DisposableObserver<B> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T, B> f77364q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f77365r0;

        public a(b<T, B> bVar) {
            this.f77364q0 = bVar;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f77365r0) {
                return;
            }
            this.f77365r0 = true;
            b<T, B> bVar = this.f77364q0;
            DisposableHelper.dispose(bVar.f77369s0);
            bVar.f77373x0 = true;
            bVar.a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f77365r0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f77365r0 = true;
            b<T, B> bVar = this.f77364q0;
            DisposableHelper.dispose(bVar.f77369s0);
            if (bVar.v0.tryAddThrowableOrReport(th2)) {
                bVar.f77373x0 = true;
                bVar.a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(B b10) {
            if (this.f77365r0) {
                return;
            }
            Object obj = b.E0;
            b<T, B> bVar = this.f77364q0;
            bVar.f77371u0.offer(obj);
            bVar.a();
        }
    }

    public static final class b<T, B> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        public static final Object E0 = new Object();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Observable<T>> f77366p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f77367q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final a<T, B> f77368r0 = new a<>(this);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReference<Disposable> f77369s0 = new AtomicReference<>();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicInteger f77370t0 = new AtomicInteger(1);

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final MpscLinkedQueue<Object> f77371u0 = new MpscLinkedQueue<>();
        public final AtomicThrowable v0 = new AtomicThrowable();

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicBoolean f77372w0 = new AtomicBoolean();

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f77373x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public UnicastSubject<T> f77374y0;

        public b(Observer<? super Observable<T>> observer, int i10) {
            this.f77366p0 = observer;
            this.f77367q0 = i10;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super Observable<T>> observer = this.f77366p0;
            MpscLinkedQueue<Object> mpscLinkedQueue = this.f77371u0;
            AtomicThrowable atomicThrowable = this.v0;
            int iAddAndGet = 1;
            while (this.f77370t0.get() != 0) {
                UnicastSubject<T> unicastSubject = this.f77374y0;
                boolean z10 = this.f77373x0;
                if (z10 && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable thTerminate = atomicThrowable.terminate();
                    if (unicastSubject != null) {
                        this.f77374y0 = null;
                        unicastSubject.onError(thTerminate);
                    }
                    observer.onError(thTerminate);
                    return;
                }
                Object objPoll = mpscLinkedQueue.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    Throwable thTerminate2 = atomicThrowable.terminate();
                    if (thTerminate2 == null) {
                        if (unicastSubject != null) {
                            this.f77374y0 = null;
                            unicastSubject.onComplete();
                        }
                        observer.onComplete();
                        return;
                    }
                    if (unicastSubject != null) {
                        this.f77374y0 = null;
                        unicastSubject.onError(thTerminate2);
                    }
                    observer.onError(thTerminate2);
                    return;
                }
                if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != E0) {
                    unicastSubject.onNext((T) objPoll);
                } else {
                    if (unicastSubject != null) {
                        this.f77374y0 = null;
                        unicastSubject.onComplete();
                    }
                    if (!this.f77372w0.get()) {
                        UnicastSubject<T> unicastSubjectCreate = UnicastSubject.create(this.f77367q0, this);
                        this.f77374y0 = unicastSubjectCreate;
                        this.f77370t0.getAndIncrement();
                        io.reactivex.rxjava3.internal.operators.observable.b bVar = new io.reactivex.rxjava3.internal.operators.observable.b(unicastSubjectCreate);
                        observer.onNext(bVar);
                        if (bVar.d()) {
                            unicastSubjectCreate.onComplete();
                        }
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.f77374y0 = null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f77372w0.compareAndSet(false, true)) {
                this.f77368r0.dispose();
                if (this.f77370t0.decrementAndGet() == 0) {
                    DisposableHelper.dispose(this.f77369s0);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77372w0.get();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f77368r0.dispose();
            this.f77373x0 = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f77368r0.dispose();
            if (this.v0.tryAddThrowableOrReport(th2)) {
                this.f77373x0 = true;
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f77371u0.offer(t10);
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this.f77369s0, disposable)) {
                this.f77371u0.offer(E0);
                a();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f77370t0.decrementAndGet() == 0) {
                DisposableHelper.dispose(this.f77369s0);
            }
        }
    }

    public ObservableWindowBoundary(ObservableSource<T> observableSource, ObservableSource<B> observableSource2, int i10) {
        super(observableSource);
        this.f77362p0 = observableSource2;
        this.f77363q0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        b bVar = new b(observer, this.f77363q0);
        observer.onSubscribe(bVar);
        this.f77362p0.subscribe(bVar.f77368r0);
        this.source.subscribe(bVar);
    }
}
