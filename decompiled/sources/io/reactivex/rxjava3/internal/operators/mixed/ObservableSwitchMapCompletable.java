package io.reactivex.rxjava3.internal.operators.mixed;

import com.google.android.play.core.splitinstall.internal.k;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSwitchMapCompletable<T> extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observable<T> f76232p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends CompletableSource> f76233q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f76234r0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static final C0398a f76235w0 = new C0398a(null);

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f76236p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends CompletableSource> f76237q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f76238r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f76239s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<C0398a> f76240t0 = new AtomicReference<>();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f76241u0;
        public Disposable v0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.mixed.ObservableSwitchMapCompletable$a$a, reason: collision with other inner class name */
        public static final class C0398a extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?> f76242p0;

            public C0398a(a<?> aVar) {
                this.f76242p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                a<?> aVar = this.f76242p0;
                AtomicReference<C0398a> atomicReference = aVar.f76240t0;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                if (aVar.f76241u0) {
                    aVar.f76239s0.tryTerminateConsumer(aVar.f76236p0);
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a<?> aVar = this.f76242p0;
                AtomicReference<C0398a> atomicReference = aVar.f76240t0;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        RxJavaPlugins.onError(th2);
                        return;
                    }
                }
                if (aVar.f76239s0.tryAddThrowableOrReport(th2)) {
                    if (aVar.f76238r0) {
                        if (aVar.f76241u0) {
                            aVar.f76239s0.tryTerminateConsumer(aVar.f76236p0);
                        }
                    } else {
                        aVar.v0.dispose();
                        aVar.a();
                        aVar.f76239s0.tryTerminateConsumer(aVar.f76236p0);
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z10) {
            this.f76236p0 = completableObserver;
            this.f76237q0 = function;
            this.f76238r0 = z10;
        }

        public final void a() {
            AtomicReference<C0398a> atomicReference = this.f76240t0;
            C0398a c0398a = f76235w0;
            C0398a andSet = atomicReference.getAndSet(c0398a);
            if (andSet == null || andSet == c0398a) {
                return;
            }
            DisposableHelper.dispose(andSet);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.v0.dispose();
            a();
            this.f76239s0.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76240t0.get() == f76235w0;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76241u0 = true;
            if (this.f76240t0.get() == null) {
                this.f76239s0.tryTerminateConsumer(this.f76236p0);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            AtomicThrowable atomicThrowable = this.f76239s0;
            if (atomicThrowable.tryAddThrowableOrReport(th2)) {
                if (this.f76238r0) {
                    onComplete();
                } else {
                    a();
                    atomicThrowable.tryTerminateConsumer(this.f76236p0);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            try {
                CompletableSource completableSourceApply = this.f76237q0.apply(t10);
                Objects.requireNonNull(completableSourceApply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = completableSourceApply;
                C0398a c0398a = new C0398a(this);
                while (true) {
                    AtomicReference<C0398a> atomicReference = this.f76240t0;
                    C0398a c0398a2 = atomicReference.get();
                    if (c0398a2 == f76235w0) {
                        return;
                    }
                    do {
                        if (atomicReference.compareAndSet(c0398a2, c0398a)) {
                            if (c0398a2 != null) {
                                DisposableHelper.dispose(c0398a2);
                            }
                            completableSource.subscribe(c0398a);
                            return;
                        }
                    } while (atomicReference.get() == c0398a2);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.v0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.v0, disposable)) {
                this.v0 = disposable;
                this.f76236p0.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMapCompletable(Observable<T> observable, Function<? super T, ? extends CompletableSource> function, boolean z10) {
        this.f76232p0 = observable;
        this.f76233q0 = function;
        this.f76234r0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        Observable<T> observable = this.f76232p0;
        Function<? super T, ? extends CompletableSource> function = this.f76233q0;
        if (k.b(observable, function, completableObserver)) {
            return;
        }
        observable.subscribe(new a(completableObserver, function, this.f76234r0));
    }
}
