package io.reactivex.internal.operators.mixed;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
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
public final class ObservableSwitchMapMaybe<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observable<T> f71979p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends MaybeSource<? extends R>> f71980q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f71981r0;

    public static final class a<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final C0335a<Object> f71982x0 = new C0335a<>(null);

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f71983p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends MaybeSource<? extends R>> f71984q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f71985r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f71986s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<C0335a<R>> f71987t0 = new AtomicReference<>();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f71988u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f71989w0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe$a$a, reason: collision with other inner class name */
        public static final class C0335a<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, R> f71990p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public volatile R f71991q0;

            public C0335a(a<?, R> aVar) {
                this.f71990p0 = aVar;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                a<?, R> aVar = this.f71990p0;
                AtomicReference<C0335a<R>> atomicReference = aVar.f71987t0;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                aVar.b();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f71990p0;
                AtomicReference<C0335a<R>> atomicReference = aVar.f71987t0;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        RxJavaPlugins.onError(th2);
                    }
                }
                if (aVar.f71986s0.addThrowable(th2)) {
                    if (!aVar.f71985r0) {
                        aVar.f71988u0.dispose();
                        aVar.a();
                    }
                    aVar.b();
                    return;
                }
                RxJavaPlugins.onError(th2);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(R r3) {
                this.f71991q0 = r3;
                this.f71990p0.b();
            }
        }

        public a(Observer<? super R> observer, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z10) {
            this.f71983p0 = observer;
            this.f71984q0 = function;
            this.f71985r0 = z10;
        }

        public final void a() {
            AtomicReference<C0335a<R>> atomicReference = this.f71987t0;
            C0335a<Object> c0335a = f71982x0;
            C0335a<R> andSet = atomicReference.getAndSet((C0335a<R>) c0335a);
            if (andSet == null || andSet == c0335a) {
                return;
            }
            DisposableHelper.dispose(andSet);
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.f71983p0;
            AtomicThrowable atomicThrowable = this.f71986s0;
            AtomicReference<C0335a<R>> atomicReference = this.f71987t0;
            int iAddAndGet = 1;
            while (!this.f71989w0) {
                if (atomicThrowable.get() != null && !this.f71985r0) {
                    observer.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z10 = this.v0;
                C0335a<R> c0335a = atomicReference.get();
                boolean z11 = c0335a == null;
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
                if (z11 || c0335a.f71991q0 == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(c0335a, null) && atomicReference.get() == c0335a) {
                    }
                    observer.onNext(c0335a.f71991q0);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71989w0 = true;
            this.f71988u0.dispose();
            a();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71989w0;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.v0 = true;
            b();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (!this.f71986s0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.f71985r0) {
                a();
            }
            this.v0 = true;
            b();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            C0335a<Object> c0335a = f71982x0;
            AtomicReference<C0335a<R>> atomicReference = this.f71987t0;
            C0335a<R> c0335a2 = atomicReference.get();
            if (c0335a2 != null) {
                DisposableHelper.dispose(c0335a2);
            }
            try {
                MaybeSource maybeSource = (MaybeSource) ObjectHelper.requireNonNull(this.f71984q0.apply(t10), "The mapper returned a null MaybeSource");
                C0335a<R> c0335a3 = new C0335a<>(this);
                while (true) {
                    C0335a<R> c0335a4 = atomicReference.get();
                    if (c0335a4 == c0335a) {
                        return;
                    }
                    do {
                        if (atomicReference.compareAndSet(c0335a4, c0335a3)) {
                            maybeSource.subscribe(c0335a3);
                            return;
                        }
                    } while (atomicReference.get() == c0335a4);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f71988u0.dispose();
                atomicReference.getAndSet((C0335a<R>) c0335a);
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71988u0, disposable)) {
                this.f71988u0 = disposable;
                this.f71983p0.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMapMaybe(Observable<T> observable, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z10) {
        this.f71979p0 = observable;
        this.f71980q0 = function;
        this.f71981r0 = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        Observable<T> observable = this.f71979p0;
        Function<? super T, ? extends MaybeSource<? extends R>> function = this.f71980q0;
        if (bn.a.i(observable, function, observer)) {
            return;
        }
        observable.subscribe(new a(observer, function, this.f71981r0));
    }
}
