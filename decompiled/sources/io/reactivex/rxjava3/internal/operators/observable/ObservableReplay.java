package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Timed;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableReplay<T> extends ConnectableObservable<T> implements HasUpstreamObservableSource<T> {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final n f77005t0 = new n();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f77006p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<i<T>> f77007q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final b<T> f77008r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ObservableSource<T> f77009s0;

    public interface b<T> {
        g<T> call();
    }

    public static final class c<R> implements Consumer<Disposable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ObserverResourceWrapper<R> f77013p0;

        public c(ObserverResourceWrapper<R> observerResourceWrapper) {
            this.f77013p0 = observerResourceWrapper;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Disposable disposable) throws Throwable {
            this.f77013p0.setResource(disposable);
        }
    }

    public static final class d<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final i<T> f77014p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Observer<? super T> f77015q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Serializable f77016r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f77017s0;

        public d(i<T> iVar, Observer<? super T> observer) {
            this.f77014p0 = iVar;
            this.f77015q0 = observer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f77017s0) {
                return;
            }
            this.f77017s0 = true;
            this.f77014p0.a(this);
            this.f77016r0 = null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77017s0;
        }
    }

    public static final class e<R, U> extends Observable<R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Supplier<? extends ConnectableObservable<U>> f77018p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Observable<U>, ? extends ObservableSource<R>> f77019q0;

        public e(Function function, Supplier supplier) {
            this.f77018p0 = supplier;
            this.f77019q0 = function;
        }

        @Override // io.reactivex.rxjava3.core.Observable
        public final void subscribeActual(Observer<? super R> observer) {
            try {
                ConnectableObservable<U> connectableObservable = this.f77018p0.get();
                Objects.requireNonNull(connectableObservable, "The connectableFactory returned a null ConnectableObservable");
                ConnectableObservable<U> connectableObservable2 = connectableObservable;
                ObservableSource<R> observableSourceApply = this.f77019q0.apply(connectableObservable2);
                Objects.requireNonNull(observableSourceApply, "The selector returned a null ObservableSource");
                ObservableSource<R> observableSource = observableSourceApply;
                ObserverResourceWrapper observerResourceWrapper = new ObserverResourceWrapper(observer);
                observableSource.subscribe(observerResourceWrapper);
                connectableObservable2.connect(new c(observerResourceWrapper));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptyDisposable.error(th2, observer);
            }
        }
    }

    public static final class f extends AtomicReference<f> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Object f77020p0;

        public f(Object obj) {
            this.f77020p0 = obj;
        }
    }

    public interface g<T> {
        void a(T t10);

        void b(d<T> dVar);

        void complete();

        void error(Throwable th2);
    }

    public static final class h<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f77021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f77022b;

        public h(int i10, boolean z10) {
            this.f77021a = i10;
            this.f77022b = z10;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.b
        public final g<T> call() {
            return new m(this.f77021a, this.f77022b);
        }
    }

    public static final class i<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final d[] f77023u0 = new d[0];
        public static final d[] v0 = new d[0];

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final g<T> f77024p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f77025q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<d[]> f77026r0 = new AtomicReference<>(f77023u0);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicBoolean f77027s0 = new AtomicBoolean();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<i<T>> f77028t0;

        public i(g<T> gVar, AtomicReference<i<T>> atomicReference) {
            this.f77024p0 = gVar;
            this.f77028t0 = atomicReference;
        }

        public final void a(d<T> dVar) {
            d[] dVarArr;
            while (true) {
                AtomicReference<d[]> atomicReference = this.f77026r0;
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
                    dVarArr = f77023u0;
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

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            AtomicReference<i<T>> atomicReference;
            this.f77026r0.set(v0);
            do {
                atomicReference = this.f77028t0;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77026r0.get() == v0;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f77025q0) {
                return;
            }
            this.f77025q0 = true;
            g<T> gVar = this.f77024p0;
            gVar.complete();
            for (d<T> dVar : this.f77026r0.getAndSet(v0)) {
                gVar.b(dVar);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f77025q0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f77025q0 = true;
            g<T> gVar = this.f77024p0;
            gVar.error(th2);
            for (d<T> dVar : this.f77026r0.getAndSet(v0)) {
                gVar.b(dVar);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f77025q0) {
                return;
            }
            g<T> gVar = this.f77024p0;
            gVar.a(t10);
            for (d<T> dVar : this.f77026r0.get()) {
                gVar.b(dVar);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                for (d<T> dVar : this.f77026r0.get()) {
                    this.f77024p0.b(dVar);
                }
            }
        }
    }

    public static final class j<T> implements ObservableSource<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicReference<i<T>> f77029p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T> f77030q0;

        public j(AtomicReference<i<T>> atomicReference, b<T> bVar) {
            this.f77029p0 = atomicReference;
            this.f77030q0 = bVar;
        }

        @Override // io.reactivex.rxjava3.core.ObservableSource
        public final void subscribe(Observer<? super T> observer) {
            i<T> iVar;
            loop0: while (true) {
                iVar = this.f77029p0.get();
                if (iVar != null) {
                    break;
                }
                i<T> iVar2 = new i<>(this.f77030q0.call(), this.f77029p0);
                AtomicReference<i<T>> atomicReference = this.f77029p0;
                do {
                    if (atomicReference.compareAndSet(null, iVar2)) {
                        iVar = iVar2;
                        break loop0;
                    }
                } while (atomicReference.get() == null);
            }
            d<T> dVar = new d<>(iVar, observer);
            observer.onSubscribe(dVar);
            loop2: while (true) {
                AtomicReference<d[]> atomicReference2 = iVar.f77026r0;
                d[] dVarArr = atomicReference2.get();
                if (dVarArr == i.v0) {
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
            if (dVar.f77017s0) {
                iVar.a(dVar);
            } else {
                iVar.f77024p0.b(dVar);
            }
        }
    }

    public static final class k<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f77031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f77032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f77033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Scheduler f77034d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f77035e;

        public k(int i10, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
            this.f77031a = i10;
            this.f77032b = j10;
            this.f77033c = timeUnit;
            this.f77034d = scheduler;
            this.f77035e = z10;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.b
        public final g<T> call() {
            return new l(this.f77031a, this.f77032b, this.f77033c, this.f77034d, this.f77035e);
        }
    }

    public static final class l<T> extends a<T> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f77036s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final long f77037t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final TimeUnit f77038u0;
        public final int v0;

        public l(int i10, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
            super(z10);
            this.f77036s0 = scheduler;
            this.v0 = i10;
            this.f77037t0 = j10;
            this.f77038u0 = timeUnit;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.a
        public final Object c(Object obj) {
            Scheduler scheduler = this.f77036s0;
            TimeUnit timeUnit = this.f77038u0;
            return new Timed(obj, scheduler.now(timeUnit), timeUnit);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.a
        public final f d() {
            f fVar;
            long jNow = this.f77036s0.now(this.f77038u0) - this.f77037t0;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null) {
                    break;
                }
                Timed timed = (Timed) fVar2.f77020p0;
                if (NotificationLite.isComplete(timed.value()) || NotificationLite.isError(timed.value()) || timed.time() > jNow) {
                    break;
                }
                fVar3 = fVar2.get();
            }
            return fVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.a
        public final Object e(Object obj) {
            return ((Timed) obj).value();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.a
        public final void g() {
            f fVar;
            long jNow = this.f77036s0.now(this.f77038u0) - this.f77037t0;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            int i10 = 0;
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                int i11 = this.f77011q0;
                if (i11 > 1) {
                    if (i11 <= this.v0) {
                        if (((Timed) fVar2.f77020p0).time() > jNow) {
                            break;
                        }
                        i10++;
                        this.f77011q0--;
                        fVar3 = fVar2.get();
                    } else {
                        i10++;
                        this.f77011q0 = i11 - 1;
                        fVar3 = fVar2.get();
                    }
                } else {
                    break;
                }
            }
            if (i10 != 0) {
                f(fVar);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.a
        public final void h() {
            f fVar;
            long jNow = this.f77036s0.now(this.f77038u0) - this.f77037t0;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            int i10 = 0;
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (this.f77011q0 <= 1 || ((Timed) fVar2.f77020p0).time() > jNow) {
                    break;
                }
                i10++;
                this.f77011q0--;
                fVar3 = fVar2.get();
            }
            if (i10 != 0) {
                f(fVar);
            }
        }
    }

    public static final class m<T> extends a<T> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f77039s0;

        public m(int i10, boolean z10) {
            super(z10);
            this.f77039s0 = i10;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.a
        public final void g() {
            if (this.f77011q0 > this.f77039s0) {
                f fVar = get().get();
                this.f77011q0--;
                f(fVar);
            }
        }
    }

    public static final class n implements b<Object> {
        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.b
        public final g<Object> call() {
            return new o(16);
        }
    }

    public static final class o<T> extends ArrayList<Object> implements g<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public volatile int f77040p0;

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.g
        public final void a(T t10) {
            add(NotificationLite.next(t10));
            this.f77040p0++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.g
        public final void b(d<T> dVar) {
            if (dVar.getAndIncrement() != 0) {
                return;
            }
            Observer<? super T> observer = dVar.f77015q0;
            int iAddAndGet = 1;
            while (!dVar.f77017s0) {
                int i10 = this.f77040p0;
                Integer num = (Integer) dVar.f77016r0;
                int iIntValue = num != null ? num.intValue() : 0;
                while (iIntValue < i10) {
                    if (NotificationLite.accept(get(iIntValue), observer) || dVar.f77017s0) {
                        return;
                    } else {
                        iIntValue++;
                    }
                }
                dVar.f77016r0 = Integer.valueOf(iIntValue);
                iAddAndGet = dVar.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.g
        public final void complete() {
            add(NotificationLite.complete());
            this.f77040p0++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.g
        public final void error(Throwable th2) {
            add(NotificationLite.error(th2));
            this.f77040p0++;
        }
    }

    public ObservableReplay(j jVar, ObservableSource observableSource, AtomicReference atomicReference, b bVar) {
        this.f77009s0 = jVar;
        this.f77006p0 = observableSource;
        this.f77007q0 = atomicReference;
        this.f77008r0 = bVar;
    }

    public static <T> ConnectableObservable<T> create(ObservableSource<T> observableSource, int i10, boolean z10) {
        return i10 == Integer.MAX_VALUE ? createFrom(observableSource) : d(observableSource, new h(i10, z10));
    }

    public static <T> ConnectableObservable<T> createFrom(ObservableSource<? extends T> observableSource) {
        return d(observableSource, f77005t0);
    }

    public static <T> ConnectableObservable<T> d(ObservableSource<T> observableSource, b<T> bVar) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((ConnectableObservable) new ObservableReplay(new j(atomicReference, bVar), observableSource, atomicReference, bVar));
    }

    public static <U, R> Observable<R> multicastSelector(Supplier<? extends ConnectableObservable<U>> supplier, Function<? super Observable<U>, ? extends ObservableSource<R>> function) {
        return RxJavaPlugins.onAssembly(new e(function, supplier));
    }

    @Override // io.reactivex.rxjava3.observables.ConnectableObservable
    public void connect(Consumer<? super Disposable> consumer) {
        i<T> iVar;
        loop0: while (true) {
            AtomicReference<i<T>> atomicReference = this.f77007q0;
            iVar = atomicReference.get();
            if (iVar != null && !iVar.isDisposed()) {
                break;
            }
            i<T> iVar2 = new i<>(this.f77008r0.call(), atomicReference);
            do {
                if (atomicReference.compareAndSet(iVar, iVar2)) {
                    iVar = iVar2;
                    break loop0;
                }
            } while (atomicReference.get() == iVar);
        }
        AtomicBoolean atomicBoolean = iVar.f77027s0;
        boolean z10 = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
        try {
            consumer.accept(iVar);
            if (z10) {
                this.f77006p0.subscribe(iVar);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (z10) {
                atomicBoolean.compareAndSet(true, false);
            }
            Exceptions.throwIfFatal(th2);
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @Override // io.reactivex.rxjava3.observables.ConnectableObservable
    public void reset() {
        AtomicReference<i<T>> atomicReference = this.f77007q0;
        i<T> iVar = atomicReference.get();
        if (iVar == null || !iVar.isDisposed()) {
            return;
        }
        while (!atomicReference.compareAndSet(iVar, null) && atomicReference.get() == iVar) {
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.HasUpstreamObservableSource
    public ObservableSource<T> source() {
        return this.f77006p0;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f77009s0.subscribe(observer);
    }

    public static <T> ConnectableObservable<T> create(ObservableSource<T> observableSource, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        return create(observableSource, j10, timeUnit, scheduler, Integer.MAX_VALUE, z10);
    }

    public static <T> ConnectableObservable<T> create(ObservableSource<T> observableSource, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z10) {
        return d(observableSource, new k(i10, j10, timeUnit, scheduler, z10));
    }

    public static abstract class a<T> extends AtomicReference<f> implements g<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public f f77010p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f77011q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f77012r0;

        public a(boolean z10) {
            this.f77012r0 = z10;
            f fVar = new f(null);
            this.f77010p0 = fVar;
            set(fVar);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.g
        public final void a(T t10) {
            f fVar = new f(c(NotificationLite.next(t10)));
            this.f77010p0.set(fVar);
            this.f77010p0 = fVar;
            this.f77011q0++;
            g();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.g
        public final void b(d<T> dVar) {
            if (dVar.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                f fVarD = (f) dVar.f77016r0;
                if (fVarD == null) {
                    fVarD = d();
                    dVar.f77016r0 = fVarD;
                }
                while (true) {
                    if (dVar.f77017s0) {
                        dVar.f77016r0 = null;
                        return;
                    }
                    f fVar = fVarD.get();
                    if (fVar != null) {
                        if (NotificationLite.accept(e(fVar.f77020p0), dVar.f77015q0)) {
                            dVar.f77016r0 = null;
                            return;
                        }
                        fVarD = fVar;
                    }
                }
                dVar.f77016r0 = fVarD;
                iAddAndGet = dVar.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.g
        public final void complete() {
            f fVar = new f(c(NotificationLite.complete()));
            this.f77010p0.set(fVar);
            this.f77010p0 = fVar;
            this.f77011q0++;
            h();
        }

        public f d() {
            return get();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.g
        public final void error(Throwable th2) {
            f fVar = new f(c(NotificationLite.error(th2)));
            this.f77010p0.set(fVar);
            this.f77010p0 = fVar;
            this.f77011q0++;
            h();
        }

        public final void f(f fVar) {
            if (this.f77012r0) {
                f fVar2 = new f(null);
                fVar2.lazySet(fVar.get());
                fVar = fVar2;
            }
            set(fVar);
        }

        public abstract void g();

        public void h() {
            f fVar = get();
            if (fVar.f77020p0 != null) {
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
