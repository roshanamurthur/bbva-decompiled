package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.subjects.UnicastSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableWindowBoundarySelector<T, B, V> extends io.reactivex.rxjava3.internal.operators.observable.a<T, Observable<T>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<B> f77375p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super B, ? extends ObservableSource<V>> f77376q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f77377r0;

    public static final class a<T, B, V> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        public volatile boolean E0;
        public volatile boolean F0;
        public volatile boolean G0;
        public Disposable I0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Observable<T>> f77378p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ObservableSource<B> f77379q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super B, ? extends ObservableSource<V>> f77380r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f77381s0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final MpscLinkedQueue f77384w0 = new MpscLinkedQueue();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final CompositeDisposable f77382t0 = new CompositeDisposable();
        public final ArrayList v0 = new ArrayList();

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicLong f77385x0 = new AtomicLong(1);

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final AtomicBoolean f77386y0 = new AtomicBoolean();
        public final AtomicThrowable H0 = new AtomicThrowable();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final c<B> f77383u0 = new c<>(this);

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.ObservableWindowBoundarySelector$a$a, reason: collision with other inner class name */
        public static final class C0419a<T, V> extends Observable<T> implements Observer<V>, Disposable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<T, ?, V> f77387p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final UnicastSubject<T> f77388q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final AtomicReference<Disposable> f77389r0 = new AtomicReference<>();

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final AtomicBoolean f77390s0 = new AtomicBoolean();

            public C0419a(a<T, ?, V> aVar, UnicastSubject<T> unicastSubject) {
                this.f77387p0 = aVar;
                this.f77388q0 = unicastSubject;
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final void dispose() {
                DisposableHelper.dispose(this.f77389r0);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final boolean isDisposed() {
                return this.f77389r0.get() == DisposableHelper.DISPOSED;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onComplete() {
                a<T, ?, V> aVar = this.f77387p0;
                aVar.f77384w0.offer(this);
                aVar.a();
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onError(Throwable th2) {
                if (isDisposed()) {
                    RxJavaPlugins.onError(th2);
                    return;
                }
                a<T, ?, V> aVar = this.f77387p0;
                aVar.I0.dispose();
                c<?> cVar = aVar.f77383u0;
                cVar.getClass();
                DisposableHelper.dispose(cVar);
                aVar.f77382t0.dispose();
                if (aVar.H0.tryAddThrowableOrReport(th2)) {
                    aVar.F0 = true;
                    aVar.a();
                }
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(V v3) {
                if (DisposableHelper.dispose(this.f77389r0)) {
                    a<T, ?, V> aVar = this.f77387p0;
                    aVar.f77384w0.offer(this);
                    aVar.a();
                }
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this.f77389r0, disposable);
            }

            @Override // io.reactivex.rxjava3.core.Observable
            public final void subscribeActual(Observer<? super T> observer) {
                this.f77388q0.subscribe(observer);
                this.f77390s0.set(true);
            }
        }

        public static final class b<B> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final B f77391a;

            public b(B b10) {
                this.f77391a = b10;
            }
        }

        public static final class c<B> extends AtomicReference<Disposable> implements Observer<B> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, B, ?> f77392p0;

            public c(a<?, B, ?> aVar) {
                this.f77392p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onComplete() {
                a<?, B, ?> aVar = this.f77392p0;
                aVar.G0 = true;
                aVar.a();
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onError(Throwable th2) {
                a<?, B, ?> aVar = this.f77392p0;
                aVar.I0.dispose();
                aVar.f77382t0.dispose();
                if (aVar.H0.tryAddThrowableOrReport(th2)) {
                    aVar.F0 = true;
                    aVar.a();
                }
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(B b10) {
                a<?, B, ?> aVar = this.f77392p0;
                aVar.f77384w0.offer(new b(b10));
                aVar.a();
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(Observer<? super Observable<T>> observer, ObservableSource<B> observableSource, Function<? super B, ? extends ObservableSource<V>> function, int i10) {
            this.f77378p0 = observer;
            this.f77379q0 = observableSource;
            this.f77380r0 = function;
            this.f77381s0 = i10;
            new AtomicLong();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super Observable<T>> observer = this.f77378p0;
            MpscLinkedQueue mpscLinkedQueue = this.f77384w0;
            ArrayList arrayList = this.v0;
            int iAddAndGet = 1;
            while (true) {
                if (this.E0) {
                    mpscLinkedQueue.clear();
                    arrayList.clear();
                } else {
                    boolean z10 = this.F0;
                    T tPoll = mpscLinkedQueue.poll();
                    boolean z11 = tPoll == null;
                    if (z10 && (z11 || this.H0.get() != null)) {
                        b(observer);
                        this.E0 = true;
                    } else if (z11) {
                        if (this.G0 && arrayList.size() == 0) {
                            this.I0.dispose();
                            c<B> cVar = this.f77383u0;
                            cVar.getClass();
                            DisposableHelper.dispose(cVar);
                            this.f77382t0.dispose();
                            b(observer);
                            this.E0 = true;
                        }
                    } else if (tPoll instanceof b) {
                        if (!this.f77386y0.get()) {
                            try {
                                ObservableSource<V> observableSourceApply = this.f77380r0.apply(((b) tPoll).f77391a);
                                Objects.requireNonNull(observableSourceApply, "The closingIndicator returned a null ObservableSource");
                                ObservableSource<V> observableSource = observableSourceApply;
                                this.f77385x0.getAndIncrement();
                                UnicastSubject unicastSubjectCreate = UnicastSubject.create(this.f77381s0, this);
                                C0419a c0419a = new C0419a(this, unicastSubjectCreate);
                                observer.onNext(c0419a);
                                AtomicBoolean atomicBoolean = c0419a.f77390s0;
                                if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
                                    arrayList.add(unicastSubjectCreate);
                                    this.f77382t0.add(c0419a);
                                    observableSource.subscribe(c0419a);
                                } else {
                                    unicastSubjectCreate.onComplete();
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.I0.dispose();
                                c<B> cVar2 = this.f77383u0;
                                cVar2.getClass();
                                DisposableHelper.dispose(cVar2);
                                this.f77382t0.dispose();
                                Exceptions.throwIfFatal(th2);
                                this.H0.tryAddThrowableOrReport(th2);
                                this.F0 = true;
                            }
                        }
                    } else if (tPoll instanceof C0419a) {
                        UnicastSubject<T> unicastSubject = ((C0419a) tPoll).f77388q0;
                        arrayList.remove(unicastSubject);
                        this.f77382t0.delete((Disposable) tPoll);
                        unicastSubject.onComplete();
                    } else {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((UnicastSubject) it.next()).onNext(tPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        public final void b(Observer<?> observer) {
            Throwable thTerminate = this.H0.terminate();
            ArrayList arrayList = this.v0;
            if (thTerminate == null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((UnicastSubject) it.next()).onComplete();
                }
                observer.onComplete();
                return;
            }
            if (thTerminate != ExceptionHelper.TERMINATED) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((UnicastSubject) it2.next()).onError(thTerminate);
                }
                observer.onError(thTerminate);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f77386y0.compareAndSet(false, true)) {
                if (this.f77385x0.decrementAndGet() != 0) {
                    c<B> cVar = this.f77383u0;
                    cVar.getClass();
                    DisposableHelper.dispose(cVar);
                    return;
                }
                this.I0.dispose();
                c<B> cVar2 = this.f77383u0;
                cVar2.getClass();
                DisposableHelper.dispose(cVar2);
                this.f77382t0.dispose();
                this.H0.tryTerminateAndReport();
                this.E0 = true;
                a();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77386y0.get();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            c<B> cVar = this.f77383u0;
            cVar.getClass();
            DisposableHelper.dispose(cVar);
            this.f77382t0.dispose();
            this.F0 = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            c<B> cVar = this.f77383u0;
            cVar.getClass();
            DisposableHelper.dispose(cVar);
            this.f77382t0.dispose();
            if (this.H0.tryAddThrowableOrReport(th2)) {
                this.F0 = true;
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f77384w0.offer(t10);
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.I0, disposable)) {
                this.I0 = disposable;
                this.f77378p0.onSubscribe(this);
                this.f77379q0.subscribe(this.f77383u0);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f77385x0.decrementAndGet() == 0) {
                this.I0.dispose();
                c<B> cVar = this.f77383u0;
                cVar.getClass();
                DisposableHelper.dispose(cVar);
                this.f77382t0.dispose();
                this.H0.tryTerminateAndReport();
                this.E0 = true;
                a();
            }
        }
    }

    public ObservableWindowBoundarySelector(ObservableSource<T> observableSource, ObservableSource<B> observableSource2, Function<? super B, ? extends ObservableSource<V>> function, int i10) {
        super(observableSource);
        this.f77375p0 = observableSource2;
        this.f77376q0 = function;
        this.f77377r0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        this.source.subscribe(new a(observer, this.f77375p0, this.f77376q0, this.f77377r0));
    }
}
