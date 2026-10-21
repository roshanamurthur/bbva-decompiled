package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Timed;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableReplay<T> extends ConnectableObservable<T> implements HasUpstreamObservableSource<T>, ResettableConnectable {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final o f72728t0 = new o();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f72729p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<j<T>> f72730q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final b<T> f72731r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ObservableSource<T> f72732s0;

    public interface b<T> {
        h<T> call();
    }

    public static final class c<R> implements Consumer<Disposable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ObserverResourceWrapper<R> f72735p0;

        public c(ObserverResourceWrapper<R> observerResourceWrapper) {
            this.f72735p0 = observerResourceWrapper;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) throws Exception {
            this.f72735p0.setResource(disposable);
        }
    }

    public static final class d<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final j<T> f72736p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Observer<? super T> f72737q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Serializable f72738r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f72739s0;

        public d(j<T> jVar, Observer<? super T> observer) {
            this.f72736p0 = jVar;
            this.f72737q0 = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f72739s0) {
                return;
            }
            this.f72739s0 = true;
            this.f72736p0.a(this);
            this.f72738r0 = null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72739s0;
        }
    }

    public static final class e<R, U> extends Observable<R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Callable<? extends ConnectableObservable<U>> f72740p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Observable<U>, ? extends ObservableSource<R>> f72741q0;

        public e(Function function, Callable callable) {
            this.f72740p0 = callable;
            this.f72741q0 = function;
        }

        @Override // io.reactivex.Observable
        public final void subscribeActual(Observer<? super R> observer) {
            try {
                ConnectableObservable connectableObservable = (ConnectableObservable) ObjectHelper.requireNonNull(this.f72740p0.call(), "The connectableFactory returned a null ConnectableObservable");
                ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f72741q0.apply(connectableObservable), "The selector returned a null ObservableSource");
                ObserverResourceWrapper observerResourceWrapper = new ObserverResourceWrapper(observer);
                observableSource.subscribe(observerResourceWrapper);
                connectableObservable.connect(new c(observerResourceWrapper));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptyDisposable.error(th2, observer);
            }
        }
    }

    public static final class f extends AtomicReference<f> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Object f72742p0;

        public f(Object obj) {
            this.f72742p0 = obj;
        }
    }

    public static final class g<T> extends ConnectableObservable<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ConnectableObservable<T> f72743p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Observable<T> f72744q0;

        public g(ConnectableObservable<T> connectableObservable, Observable<T> observable) {
            this.f72743p0 = connectableObservable;
            this.f72744q0 = observable;
        }

        @Override // io.reactivex.observables.ConnectableObservable
        public final void connect(Consumer<? super Disposable> consumer) {
            this.f72743p0.connect(consumer);
        }

        @Override // io.reactivex.Observable
        public final void subscribeActual(Observer<? super T> observer) {
            this.f72744q0.subscribe(observer);
        }
    }

    public interface h<T> {
        void a(T t10);

        void b(d<T> dVar);

        void complete();

        void error(Throwable th2);
    }

    public static final class i<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f72745a;

        public i(int i10) {
            this.f72745a = i10;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.b
        public final h<T> call() {
            return new n(this.f72745a);
        }
    }

    public static final class j<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final d[] f72746t0 = new d[0];

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final d[] f72747u0 = new d[0];

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final h<T> f72748p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f72749q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<d[]> f72750r0 = new AtomicReference<>(f72746t0);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicBoolean f72751s0 = new AtomicBoolean();

        public j(h<T> hVar) {
            this.f72748p0 = hVar;
        }

        public final void a(d<T> dVar) {
            d[] dVarArr;
            while (true) {
                AtomicReference<d[]> atomicReference = this.f72750r0;
                d[] dVarArr2 = atomicReference.get();
                int length = dVarArr2.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (dVarArr2[i10].equals(dVar)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    dVarArr = f72746t0;
                } else {
                    d[] dVarArr3 = new d[length - 1];
                    System.arraycopy(dVarArr2, 0, dVarArr3, 0, i10);
                    System.arraycopy(dVarArr2, i10 + 1, dVarArr3, i10, (length - i10) - 1);
                    dVarArr = dVarArr3;
                }
                while (!atomicReference.compareAndSet(dVarArr2, dVarArr)) {
                    if (atomicReference.get() != dVarArr2) {
                    }
                }
                return;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72750r0.set(f72747u0);
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72750r0.get() == f72747u0;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72749q0) {
                return;
            }
            this.f72749q0 = true;
            h<T> hVar = this.f72748p0;
            hVar.complete();
            for (d<T> dVar : this.f72750r0.getAndSet(f72747u0)) {
                hVar.b(dVar);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72749q0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f72749q0 = true;
            h<T> hVar = this.f72748p0;
            hVar.error(th2);
            for (d<T> dVar : this.f72750r0.getAndSet(f72747u0)) {
                hVar.b(dVar);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72749q0) {
                return;
            }
            h<T> hVar = this.f72748p0;
            hVar.a(t10);
            for (d<T> dVar : this.f72750r0.get()) {
                hVar.b(dVar);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                for (d<T> dVar : this.f72750r0.get()) {
                    this.f72748p0.b(dVar);
                }
            }
        }
    }

    public static final class k<T> implements ObservableSource<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicReference<j<T>> f72752p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T> f72753q0;

        public k(AtomicReference<j<T>> atomicReference, b<T> bVar) {
            this.f72752p0 = atomicReference;
            this.f72753q0 = bVar;
        }

        @Override // io.reactivex.ObservableSource
        public final void subscribe(Observer<? super T> observer) {
            j<T> jVar;
            loop0: while (true) {
                jVar = this.f72752p0.get();
                if (jVar != null) {
                    break;
                }
                j<T> jVar2 = new j<>(this.f72753q0.call());
                AtomicReference<j<T>> atomicReference = this.f72752p0;
                do {
                    if (atomicReference.compareAndSet(null, jVar2)) {
                        jVar = jVar2;
                        break loop0;
                    }
                } while (atomicReference.get() == null);
            }
            d<T> dVar = new d<>(jVar, observer);
            observer.onSubscribe(dVar);
            loop2: while (true) {
                AtomicReference<d[]> atomicReference2 = jVar.f72750r0;
                d[] dVarArr = atomicReference2.get();
                if (dVarArr == j.f72747u0) {
                    break;
                }
                int length = dVarArr.length;
                d[] dVarArr2 = new d[length + 1];
                System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                dVarArr2[length] = dVar;
                do {
                    if (atomicReference2.compareAndSet(dVarArr, dVarArr2)) {
                        break loop2;
                    }
                } while (atomicReference2.get() == dVarArr);
            }
            if (dVar.f72739s0) {
                jVar.a(dVar);
            } else {
                jVar.f72748p0.b(dVar);
            }
        }
    }

    public static final class l<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f72754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f72755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f72756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Scheduler f72757d;

        public l(int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.f72754a = i10;
            this.f72755b = j10;
            this.f72756c = timeUnit;
            this.f72757d = scheduler;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.b
        public final h<T> call() {
            return new m(this.f72754a, this.f72755b, this.f72756c, this.f72757d);
        }
    }

    public static final class m<T> extends a<T> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Scheduler f72758r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final long f72759s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final TimeUnit f72760t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f72761u0;

        public m(int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.f72758r0 = scheduler;
            this.f72761u0 = i10;
            this.f72759s0 = j10;
            this.f72760t0 = timeUnit;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public final Object c(Object obj) {
            Scheduler scheduler = this.f72758r0;
            TimeUnit timeUnit = this.f72760t0;
            return new Timed(obj, scheduler.now(timeUnit), timeUnit);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public final f d() {
            f fVar;
            long jNow = this.f72758r0.now(this.f72760t0) - this.f72759s0;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null) {
                    break;
                }
                Timed timed = (Timed) fVar2.f72742p0;
                if (NotificationLite.isComplete(timed.value()) || NotificationLite.isError(timed.value()) || timed.time() > jNow) {
                    break;
                }
                fVar3 = fVar2.get();
            }
            return fVar;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public final Object e(Object obj) {
            return ((Timed) obj).value();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public final void f() {
            f fVar;
            long jNow = this.f72758r0.now(this.f72760t0) - this.f72759s0;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            int i10 = 0;
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null) {
                    break;
                }
                int i11 = this.f72734q0;
                if (i11 > this.f72761u0 && i11 > 1) {
                    i10++;
                    this.f72734q0 = i11 - 1;
                    fVar3 = fVar2.get();
                } else {
                    if (((Timed) fVar2.f72742p0).time() > jNow) {
                        break;
                    }
                    i10++;
                    this.f72734q0--;
                    fVar3 = fVar2.get();
                }
            }
            if (i10 != 0) {
                set(fVar);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public final void g() {
            f fVar;
            long jNow = this.f72758r0.now(this.f72760t0) - this.f72759s0;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            int i10 = 0;
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null || this.f72734q0 <= 1 || ((Timed) fVar2.f72742p0).time() > jNow) {
                    break;
                }
                i10++;
                this.f72734q0--;
                fVar3 = fVar2.get();
            }
            if (i10 != 0) {
                set(fVar);
            }
        }
    }

    public static final class n<T> extends a<T> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f72762r0;

        public n(int i10) {
            this.f72762r0 = i10;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public final void f() {
            if (this.f72734q0 > this.f72762r0) {
                f fVar = get().get();
                this.f72734q0--;
                set(fVar);
            }
        }
    }

    public static final class o implements b<Object> {
        @Override // io.reactivex.internal.operators.observable.ObservableReplay.b
        public final h<Object> call() {
            return new p(16);
        }
    }

    public static final class p<T> extends ArrayList<Object> implements h<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public volatile int f72763p0;

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.h
        public final void a(T t10) {
            add(NotificationLite.next(t10));
            this.f72763p0++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.h
        public final void b(d<T> dVar) {
            if (dVar.getAndIncrement() != 0) {
                return;
            }
            Observer<? super T> observer = dVar.f72737q0;
            int iAddAndGet = 1;
            while (!dVar.f72739s0) {
                int i10 = this.f72763p0;
                Integer num = (Integer) dVar.f72738r0;
                int iIntValue = num != null ? num.intValue() : 0;
                while (iIntValue < i10) {
                    if (NotificationLite.accept(get(iIntValue), observer) || dVar.f72739s0) {
                        return;
                    } else {
                        iIntValue++;
                    }
                }
                dVar.f72738r0 = Integer.valueOf(iIntValue);
                iAddAndGet = dVar.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.h
        public final void complete() {
            add(NotificationLite.complete());
            this.f72763p0++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.h
        public final void error(Throwable th2) {
            add(NotificationLite.error(th2));
            this.f72763p0++;
        }
    }

    public ObservableReplay(k kVar, ObservableSource observableSource, AtomicReference atomicReference, b bVar) {
        this.f72732s0 = kVar;
        this.f72729p0 = observableSource;
        this.f72730q0 = atomicReference;
        this.f72731r0 = bVar;
    }

    public static <T> ConnectableObservable<T> create(ObservableSource<T> observableSource, int i10) {
        return i10 == Integer.MAX_VALUE ? createFrom(observableSource) : d(observableSource, new i(i10));
    }

    public static <T> ConnectableObservable<T> createFrom(ObservableSource<? extends T> observableSource) {
        return d(observableSource, f72728t0);
    }

    public static <T> ConnectableObservable<T> d(ObservableSource<T> observableSource, b<T> bVar) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((ConnectableObservable) new ObservableReplay(new k(atomicReference, bVar), observableSource, atomicReference, bVar));
    }

    public static <U, R> Observable<R> multicastSelector(Callable<? extends ConnectableObservable<U>> callable, Function<? super Observable<U>, ? extends ObservableSource<R>> function) {
        return RxJavaPlugins.onAssembly(new e(function, callable));
    }

    public static <T> ConnectableObservable<T> observeOn(ConnectableObservable<T> connectableObservable, Scheduler scheduler) {
        return RxJavaPlugins.onAssembly((ConnectableObservable) new g(connectableObservable, connectableObservable.observeOn(scheduler)));
    }

    @Override // io.reactivex.observables.ConnectableObservable
    public void connect(Consumer<? super Disposable> consumer) {
        j<T> jVar;
        loop0: while (true) {
            AtomicReference<j<T>> atomicReference = this.f72730q0;
            jVar = atomicReference.get();
            if (jVar != null && !jVar.isDisposed()) {
                break;
            }
            j<T> jVar2 = new j<>(this.f72731r0.call());
            do {
                if (atomicReference.compareAndSet(jVar, jVar2)) {
                    jVar = jVar2;
                    break loop0;
                }
            } while (atomicReference.get() == jVar);
        }
        AtomicBoolean atomicBoolean = jVar.f72751s0;
        boolean z10 = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
        try {
            consumer.accept(jVar);
            if (z10) {
                this.f72729p0.subscribe(jVar);
            }
        } catch (Throwable th2) {
            if (z10) {
                atomicBoolean.compareAndSet(true, false);
            }
            Exceptions.throwIfFatal(th2);
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @Override // io.reactivex.internal.disposables.ResettableConnectable
    public void resetIf(Disposable disposable) {
        AtomicReference<j<T>> atomicReference;
        j<T> jVar = (j) disposable;
        do {
            atomicReference = this.f72730q0;
            if (atomicReference.compareAndSet(jVar, null)) {
                return;
            }
        } while (atomicReference.get() == jVar);
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamObservableSource
    public ObservableSource<T> source() {
        return this.f72729p0;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f72732s0.subscribe(observer);
    }

    public static <T> ConnectableObservable<T> create(ObservableSource<T> observableSource, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return create(observableSource, j10, timeUnit, scheduler, Integer.MAX_VALUE);
    }

    public static <T> ConnectableObservable<T> create(ObservableSource<T> observableSource, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10) {
        return d(observableSource, new l(i10, j10, timeUnit, scheduler));
    }

    public static abstract class a<T> extends AtomicReference<f> implements h<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public f f72733p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f72734q0;

        public a() {
            f fVar = new f(null);
            this.f72733p0 = fVar;
            set(fVar);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.h
        public final void a(T t10) {
            f fVar = new f(c(NotificationLite.next(t10)));
            this.f72733p0.set(fVar);
            this.f72733p0 = fVar;
            this.f72734q0++;
            f();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.h
        public final void b(d<T> dVar) {
            if (dVar.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                f fVarD = (f) dVar.f72738r0;
                if (fVarD == null) {
                    fVarD = d();
                    dVar.f72738r0 = fVarD;
                }
                while (true) {
                    if (dVar.f72739s0) {
                        dVar.f72738r0 = null;
                        return;
                    }
                    f fVar = fVarD.get();
                    if (fVar != null) {
                        if (NotificationLite.accept(e(fVar.f72742p0), dVar.f72737q0)) {
                            dVar.f72738r0 = null;
                            return;
                        }
                        fVarD = fVar;
                    }
                }
                dVar.f72738r0 = fVarD;
                iAddAndGet = dVar.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.h
        public final void complete() {
            f fVar = new f(c(NotificationLite.complete()));
            this.f72733p0.set(fVar);
            this.f72733p0 = fVar;
            this.f72734q0++;
            g();
        }

        public f d() {
            return get();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.h
        public final void error(Throwable th2) {
            f fVar = new f(c(NotificationLite.error(th2)));
            this.f72733p0.set(fVar);
            this.f72733p0 = fVar;
            this.f72734q0++;
            g();
        }

        public abstract void f();

        public void g() {
            f fVar = get();
            if (fVar.f72742p0 != null) {
                f fVar2 = new f(null);
                fVar2.lazySet(fVar.get());
                set(fVar2);
            }
        }

        public Object c(Object obj) {
            return obj;
        }

        public Object e(Object obj) {
            return obj;
        }
    }
}
