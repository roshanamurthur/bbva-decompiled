package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableWindowBoundarySupplier<T, B> extends io.reactivex.internal.operators.observable.a<T, Observable<T>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Callable<? extends ObservableSource<B>> f73116p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f73117q0;

    public static final class a<T, B> extends DisposableObserver<B> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T, B> f73118q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f73119r0;

        public a(b<T, B> bVar) {
            this.f73118q0 = bVar;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f73119r0) {
                return;
            }
            this.f73119r0 = true;
            b<T, B> bVar = this.f73118q0;
            bVar.f73127x0.dispose();
            bVar.f73128y0 = true;
            bVar.b();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f73119r0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f73119r0 = true;
            b<T, B> bVar = this.f73118q0;
            bVar.f73127x0.dispose();
            if (!bVar.f73125u0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                bVar.f73128y0 = true;
                bVar.b();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(B b10) {
            if (this.f73119r0) {
                return;
            }
            this.f73119r0 = true;
            dispose();
            b<T, B> bVar = this.f73118q0;
            AtomicReference<a<T, B>> atomicReference = bVar.f73122r0;
            while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
            }
            bVar.f73124t0.offer(b.G0);
            bVar.b();
        }
    }

    public static final class b<T, B> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        public static final a<Object, Object> F0 = new a<>(null);
        public static final Object G0 = new Object();
        public UnicastSubject<T> E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Observable<T>> f73120p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f73121q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<a<T, B>> f73122r0 = new AtomicReference<>();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicInteger f73123s0 = new AtomicInteger(1);

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final MpscLinkedQueue<Object> f73124t0 = new MpscLinkedQueue<>();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicThrowable f73125u0 = new AtomicThrowable();
        public final AtomicBoolean v0 = new AtomicBoolean();

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Callable<? extends ObservableSource<B>> f73126w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Disposable f73127x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f73128y0;

        public b(Observer<? super Observable<T>> observer, int i10, Callable<? extends ObservableSource<B>> callable) {
            this.f73120p0 = observer;
            this.f73121q0 = i10;
            this.f73126w0 = callable;
        }

        public final void a() {
            AtomicReference<a<T, B>> atomicReference = this.f73122r0;
            a<Object, Object> aVar = F0;
            a<T, B> andSet = atomicReference.getAndSet((a<T, B>) aVar);
            if (andSet == null || andSet == aVar) {
                return;
            }
            andSet.dispose();
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super Observable<T>> observer = this.f73120p0;
            MpscLinkedQueue<Object> mpscLinkedQueue = this.f73124t0;
            AtomicThrowable atomicThrowable = this.f73125u0;
            int iAddAndGet = 1;
            while (this.f73123s0.get() != 0) {
                UnicastSubject<T> unicastSubject = this.E0;
                boolean z10 = this.f73128y0;
                if (z10 && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable thTerminate = atomicThrowable.terminate();
                    if (unicastSubject != null) {
                        this.E0 = null;
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
                            this.E0 = null;
                            unicastSubject.onComplete();
                        }
                        observer.onComplete();
                        return;
                    }
                    if (unicastSubject != null) {
                        this.E0 = null;
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
                } else if (objPoll != G0) {
                    unicastSubject.onNext((T) objPoll);
                } else {
                    if (unicastSubject != null) {
                        this.E0 = null;
                        unicastSubject.onComplete();
                    }
                    if (!this.v0.get()) {
                        UnicastSubject<T> unicastSubjectCreate = UnicastSubject.create(this.f73121q0, this);
                        this.E0 = unicastSubjectCreate;
                        this.f73123s0.getAndIncrement();
                        try {
                            ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f73126w0.call(), "The other Callable returned a null ObservableSource");
                            a<T, B> aVar = new a<>(this);
                            AtomicReference<a<T, B>> atomicReference = this.f73122r0;
                            do {
                                if (atomicReference.compareAndSet(null, aVar)) {
                                    observableSource.subscribe(aVar);
                                    observer.onNext(unicastSubjectCreate);
                                    break;
                                }
                            } while (atomicReference.get() == null);
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            atomicThrowable.addThrowable(th2);
                            this.f73128y0 = true;
                        }
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.E0 = null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.v0.compareAndSet(false, true)) {
                a();
                if (this.f73123s0.decrementAndGet() == 0) {
                    this.f73127x0.dispose();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.v0.get();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            a();
            this.f73128y0 = true;
            b();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            a();
            if (!this.f73125u0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f73128y0 = true;
                b();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f73124t0.offer(t10);
            b();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73127x0, disposable)) {
                this.f73127x0 = disposable;
                this.f73120p0.onSubscribe(this);
                this.f73124t0.offer(G0);
                b();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f73123s0.decrementAndGet() == 0) {
                this.f73127x0.dispose();
            }
        }
    }

    public ObservableWindowBoundarySupplier(ObservableSource<T> observableSource, Callable<? extends ObservableSource<B>> callable, int i10) {
        super(observableSource);
        this.f73116p0 = callable;
        this.f73117q0 = i10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        this.source.subscribe(new b(observer, this.f73117q0, this.f73116p0));
    }
}
