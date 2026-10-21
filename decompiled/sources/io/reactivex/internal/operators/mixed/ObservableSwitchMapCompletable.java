package io.reactivex.internal.operators.mixed;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSwitchMapCompletable<T> extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observable<T> f71968p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends CompletableSource> f71969q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f71970r0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static final C0334a f71971w0 = new C0334a(null);

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f71972p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends CompletableSource> f71973q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f71974r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f71975s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<C0334a> f71976t0 = new AtomicReference<>();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f71977u0;
        public Disposable v0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable$a$a, reason: collision with other inner class name */
        public static final class C0334a extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?> f71978p0;

            public C0334a(a<?> aVar) {
                this.f71978p0 = aVar;
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                a<?> aVar = this.f71978p0;
                AtomicReference<C0334a> atomicReference = aVar.f71976t0;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                if (aVar.f71977u0) {
                    Throwable thTerminate = aVar.f71975s0.terminate();
                    if (thTerminate == null) {
                        aVar.f71972p0.onComplete();
                    } else {
                        aVar.f71972p0.onError(thTerminate);
                    }
                }
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th2) {
                a<?> aVar = this.f71978p0;
                AtomicReference<C0334a> atomicReference = aVar.f71976t0;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        RxJavaPlugins.onError(th2);
                    }
                }
                if (aVar.f71975s0.addThrowable(th2)) {
                    if (aVar.f71974r0) {
                        if (aVar.f71977u0) {
                            aVar.f71972p0.onError(aVar.f71975s0.terminate());
                            return;
                        }
                        return;
                    }
                    aVar.dispose();
                    Throwable thTerminate = aVar.f71975s0.terminate();
                    if (thTerminate != ExceptionHelper.TERMINATED) {
                        aVar.f71972p0.onError(thTerminate);
                        return;
                    }
                    return;
                }
                RxJavaPlugins.onError(th2);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z10) {
            this.f71972p0 = completableObserver;
            this.f71973q0 = function;
            this.f71974r0 = z10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.v0.dispose();
            AtomicReference<C0334a> atomicReference = this.f71976t0;
            C0334a c0334a = f71971w0;
            C0334a andSet = atomicReference.getAndSet(c0334a);
            if (andSet == null || andSet == c0334a) {
                return;
            }
            DisposableHelper.dispose(andSet);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71976t0.get() == f71971w0;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f71977u0 = true;
            if (this.f71976t0.get() == null) {
                Throwable thTerminate = this.f71975s0.terminate();
                if (thTerminate == null) {
                    this.f71972p0.onComplete();
                } else {
                    this.f71972p0.onError(thTerminate);
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            AtomicThrowable atomicThrowable = this.f71975s0;
            if (!atomicThrowable.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (this.f71974r0) {
                onComplete();
                return;
            }
            AtomicReference<C0334a> atomicReference = this.f71976t0;
            C0334a c0334a = f71971w0;
            C0334a andSet = atomicReference.getAndSet(c0334a);
            if (andSet != null && andSet != c0334a) {
                DisposableHelper.dispose(andSet);
            }
            Throwable thTerminate = atomicThrowable.terminate();
            if (thTerminate != ExceptionHelper.TERMINATED) {
                this.f71972p0.onError(thTerminate);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            try {
                CompletableSource completableSource = (CompletableSource) ObjectHelper.requireNonNull(this.f71973q0.apply(t10), "The mapper returned a null CompletableSource");
                C0334a c0334a = new C0334a(this);
                while (true) {
                    AtomicReference<C0334a> atomicReference = this.f71976t0;
                    C0334a c0334a2 = atomicReference.get();
                    if (c0334a2 == f71971w0) {
                        return;
                    }
                    do {
                        if (atomicReference.compareAndSet(c0334a2, c0334a)) {
                            if (c0334a2 != null) {
                                DisposableHelper.dispose(c0334a2);
                            }
                            completableSource.subscribe(c0334a);
                            return;
                        }
                    } while (atomicReference.get() == c0334a2);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.v0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.v0, disposable)) {
                this.v0 = disposable;
                this.f71972p0.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMapCompletable(Observable<T> observable, Function<? super T, ? extends CompletableSource> function, boolean z10) {
        this.f71968p0 = observable;
        this.f71969q0 = function;
        this.f71970r0 = z10;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        Observable<T> observable = this.f71968p0;
        Function<? super T, ? extends CompletableSource> function = this.f71969q0;
        if (bn.a.h(observable, function, completableObserver)) {
            return;
        }
        observable.subscribe(new a(completableObserver, function, this.f71970r0));
    }
}
