package io.reactivex.internal.operators.mixed;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSwitchMapSingle<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observable<T> f71992p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends SingleSource<? extends R>> f71993q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f71994r0;

    public static final class a<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final C0336a<Object> f71995x0 = new C0336a<>(null);

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f71996p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends SingleSource<? extends R>> f71997q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f71998r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f71999s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<C0336a<R>> f72000t0 = new AtomicReference<>();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f72001u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f72002w0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$a$a, reason: collision with other inner class name */
        public static final class C0336a<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, R> f72003p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public volatile R f72004q0;

            public C0336a(a<?, R> aVar) {
                this.f72003p0 = aVar;
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f72003p0;
                AtomicReference<C0336a<R>> atomicReference = aVar.f72000t0;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        RxJavaPlugins.onError(th2);
                    }
                }
                if (aVar.f71999s0.addThrowable(th2)) {
                    if (!aVar.f71998r0) {
                        aVar.f72001u0.dispose();
                        aVar.a();
                    }
                    aVar.b();
                    return;
                }
                RxJavaPlugins.onError(th2);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(R r3) {
                this.f72004q0 = r3;
                this.f72003p0.b();
            }
        }

        public a(Observer<? super R> observer, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10) {
            this.f71996p0 = observer;
            this.f71997q0 = function;
            this.f71998r0 = z10;
        }

        public final void a() {
            AtomicReference<C0336a<R>> atomicReference = this.f72000t0;
            C0336a<Object> c0336a = f71995x0;
            C0336a<R> andSet = atomicReference.getAndSet((C0336a<R>) c0336a);
            if (andSet == null || andSet == c0336a) {
                return;
            }
            DisposableHelper.dispose(andSet);
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.f71996p0;
            AtomicThrowable atomicThrowable = this.f71999s0;
            AtomicReference<C0336a<R>> atomicReference = this.f72000t0;
            int iAddAndGet = 1;
            while (!this.f72002w0) {
                if (atomicThrowable.get() != null && !this.f71998r0) {
                    observer.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z10 = this.v0;
                C0336a<R> c0336a = atomicReference.get();
                boolean z11 = c0336a == null;
                if (z10 && z11) {
                    Throwable thTerminate = atomicThrowable.terminate();
                    if (thTerminate != null) {
                        observer.onError(thTerminate);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                if (z11 || c0336a.f72004q0 == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(c0336a, null) && atomicReference.get() == c0336a) {
                    }
                    observer.onNext(c0336a.f72004q0);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72002w0 = true;
            this.f72001u0.dispose();
            a();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72002w0;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.v0 = true;
            b();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (!this.f71999s0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.f71998r0) {
                a();
            }
            this.v0 = true;
            b();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            C0336a<Object> c0336a = f71995x0;
            AtomicReference<C0336a<R>> atomicReference = this.f72000t0;
            C0336a<R> c0336a2 = atomicReference.get();
            if (c0336a2 != null) {
                DisposableHelper.dispose(c0336a2);
            }
            try {
                SingleSource singleSource = (SingleSource) ObjectHelper.requireNonNull(this.f71997q0.apply(t10), "The mapper returned a null SingleSource");
                C0336a<R> c0336a3 = new C0336a<>(this);
                while (true) {
                    C0336a<R> c0336a4 = atomicReference.get();
                    if (c0336a4 == c0336a) {
                        return;
                    }
                    do {
                        if (atomicReference.compareAndSet(c0336a4, c0336a3)) {
                            singleSource.subscribe(c0336a3);
                            return;
                        }
                    } while (atomicReference.get() == c0336a4);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f72001u0.dispose();
                atomicReference.getAndSet((C0336a<R>) c0336a);
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72001u0, disposable)) {
                this.f72001u0 = disposable;
                this.f71996p0.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMapSingle(Observable<T> observable, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10) {
        this.f71992p0 = observable;
        this.f71993q0 = function;
        this.f71994r0 = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        Observable<T> observable = this.f71992p0;
        Function<? super T, ? extends SingleSource<? extends R>> function = this.f71993q0;
        if (bn.a.j(observable, function, observer)) {
            return;
        }
        observable.subscribe(new a(observer, function, this.f71994r0));
    }
}
