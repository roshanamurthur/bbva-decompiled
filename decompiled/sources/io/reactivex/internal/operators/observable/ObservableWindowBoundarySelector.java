package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableWindowBoundarySelector<T, B, V> extends io.reactivex.internal.operators.observable.a<T, Observable<T>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<B> f73099p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super B, ? extends ObservableSource<V>> f73100q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f73101r0;

    public static final class a<T, V> extends DisposableObserver<V> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final c<T, ?, V> f73102q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final UnicastSubject<T> f73103r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f73104s0;

        public a(c<T, ?, V> cVar, UnicastSubject<T> unicastSubject) {
            this.f73102q0 = cVar;
            this.f73103r0 = unicastSubject;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f73104s0) {
                return;
            }
            this.f73104s0 = true;
            this.f73102q0.a(this);
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f73104s0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f73104s0 = true;
            c<T, ?, V> cVar = this.f73102q0;
            cVar.f73110u0.dispose();
            cVar.f73109t0.dispose();
            cVar.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(V v3) {
            dispose();
            onComplete();
        }
    }

    public static final class b<T, B> extends DisposableObserver<B> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final c<T, B, ?> f73105q0;

        public b(c<T, B, ?> cVar) {
            this.f73105q0 = cVar;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f73105q0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            c<T, B, ?> cVar = this.f73105q0;
            cVar.f73110u0.dispose();
            cVar.f73109t0.dispose();
            cVar.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(B b10) {
            this.f73105q0.c(b10);
        }
    }

    public static final class d<T, B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnicastSubject<T> f73114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final B f73115b;

        public d(UnicastSubject<T> unicastSubject, B b10) {
            this.f73114a = unicastSubject;
            this.f73115b = b10;
        }
    }

    public ObservableWindowBoundarySelector(ObservableSource<T> observableSource, ObservableSource<B> observableSource2, Function<? super B, ? extends ObservableSource<V>> function, int i10) {
        super(observableSource);
        this.f73099p0 = observableSource2;
        this.f73100q0 = function;
        this.f73101r0 = i10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        this.source.subscribe(new c(new SerializedObserver(observer), this.f73099p0, this.f73100q0, this.f73101r0));
    }

    public static final class c<T, B, V> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ObservableSource<B> f73106q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super B, ? extends ObservableSource<V>> f73107r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f73108s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final CompositeDisposable f73109t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f73110u0;
        public final AtomicReference<Disposable> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final ArrayList f73111w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicLong f73112x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final AtomicBoolean f73113y0;

        public c(SerializedObserver serializedObserver, ObservableSource observableSource, Function function, int i10) {
            super(serializedObserver, new MpscLinkedQueue());
            this.v0 = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.f73112x0 = atomicLong;
            this.f73113y0 = new AtomicBoolean();
            this.f73106q0 = observableSource;
            this.f73107r0 = function;
            this.f73108s0 = i10;
            this.f73109t0 = new CompositeDisposable();
            this.f73111w0 = new ArrayList();
            atomicLong.lazySet(1L);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void a(a<T, V> aVar) {
            this.f73109t0.delete(aVar);
            this.queue.offer((U) new d(aVar.f73103r0, null));
            if (enter()) {
                b();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            ArrayList arrayList = this.f73111w0;
            int iLeave = 1;
            while (true) {
                boolean z10 = this.done;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    this.f73109t0.dispose();
                    DisposableHelper.dispose(this.v0);
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((UnicastSubject) it.next()).onError(th2);
                        }
                    } else {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((UnicastSubject) it2.next()).onComplete();
                        }
                    }
                    arrayList.clear();
                    return;
                }
                if (z11) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (objPoll instanceof d) {
                    d dVar = (d) objPoll;
                    UnicastSubject<T> unicastSubject = dVar.f73114a;
                    if (unicastSubject != null) {
                        if (arrayList.remove(unicastSubject)) {
                            dVar.f73114a.onComplete();
                            if (this.f73112x0.decrementAndGet() == 0) {
                                this.f73109t0.dispose();
                                DisposableHelper.dispose(this.v0);
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f73113y0.get()) {
                        UnicastSubject unicastSubjectCreate = UnicastSubject.create(this.f73108s0);
                        arrayList.add(unicastSubjectCreate);
                        observer.onNext(unicastSubjectCreate);
                        try {
                            ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f73107r0.apply(dVar.f73115b), "The ObservableSource supplied is null");
                            a aVar = new a(this, unicastSubjectCreate);
                            if (this.f73109t0.add(aVar)) {
                                this.f73112x0.getAndIncrement();
                                observableSource.subscribe(aVar);
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            this.f73113y0.set(true);
                            observer.onError(th3);
                        }
                    }
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        ((UnicastSubject) it3.next()).onNext(NotificationLite.getValue(objPoll));
                    }
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void c(B b10) {
            this.queue.offer((U) new d(null, b10));
            if (enter()) {
                b();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f73113y0.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.v0);
                if (this.f73112x0.decrementAndGet() == 0) {
                    this.f73110u0.dispose();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f73113y0.get();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            if (enter()) {
                b();
            }
            if (this.f73112x0.decrementAndGet() == 0) {
                this.f73109t0.dispose();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.error = th2;
            this.done = true;
            if (enter()) {
                b();
            }
            if (this.f73112x0.decrementAndGet() == 0) {
                this.f73109t0.dispose();
            }
            this.downstream.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (fastEnter()) {
                Iterator it = this.f73111w0.iterator();
                while (it.hasNext()) {
                    ((UnicastSubject) it.next()).onNext(t10);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) NotificationLite.next(t10));
                if (!enter()) {
                    return;
                }
            }
            b();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73110u0, disposable)) {
                this.f73110u0 = disposable;
                this.downstream.onSubscribe(this);
                if (this.f73113y0.get()) {
                    return;
                }
                b bVar = new b(this);
                AtomicReference<Disposable> atomicReference = this.v0;
                while (!atomicReference.compareAndSet(null, bVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                this.f73106q0.subscribe(bVar);
            }
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public final void accept(Observer<? super Observable<T>> observer, Object obj) {
        }
    }
}
