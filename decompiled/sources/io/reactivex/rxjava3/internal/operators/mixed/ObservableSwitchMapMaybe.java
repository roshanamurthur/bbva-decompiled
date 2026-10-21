package io.reactivex.rxjava3.internal.operators.mixed;

import com.google.android.play.core.splitinstall.internal.k;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSwitchMapMaybe<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observable<T> f76243p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends MaybeSource<? extends R>> f76244q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f76245r0;

    public static final class a<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final C0399a<Object> f76246x0 = new C0399a<>(null);

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f76247p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends MaybeSource<? extends R>> f76248q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f76249r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f76250s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<C0399a<R>> f76251t0 = new AtomicReference<>();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f76252u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f76253w0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.mixed.ObservableSwitchMapMaybe$a$a, reason: collision with other inner class name */
        public static final class C0399a<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, R> f76254p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public volatile R f76255q0;

            public C0399a(a<?, R> aVar) {
                this.f76254p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                a<?, R> aVar = this.f76254p0;
                AtomicReference<C0399a<R>> atomicReference = aVar.f76251t0;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                aVar.b();
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f76254p0;
                AtomicReference<C0399a<R>> atomicReference = aVar.f76251t0;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        RxJavaPlugins.onError(th2);
                        return;
                    }
                }
                if (aVar.f76250s0.tryAddThrowableOrReport(th2)) {
                    if (!aVar.f76249r0) {
                        aVar.f76252u0.dispose();
                        aVar.a();
                    }
                    aVar.b();
                }
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(R r3) {
                this.f76255q0 = r3;
                this.f76254p0.b();
            }
        }

        public a(Observer<? super R> observer, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z10) {
            this.f76247p0 = observer;
            this.f76248q0 = function;
            this.f76249r0 = z10;
        }

        public final void a() {
            AtomicReference<C0399a<R>> atomicReference = this.f76251t0;
            C0399a<Object> c0399a = f76246x0;
            C0399a<R> andSet = atomicReference.getAndSet((C0399a<R>) c0399a);
            if (andSet == null || andSet == c0399a) {
                return;
            }
            DisposableHelper.dispose(andSet);
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.f76247p0;
            AtomicThrowable atomicThrowable = this.f76250s0;
            AtomicReference<C0399a<R>> atomicReference = this.f76251t0;
            int iAddAndGet = 1;
            while (!this.f76253w0) {
                if (atomicThrowable.get() != null && !this.f76249r0) {
                    atomicThrowable.tryTerminateConsumer(observer);
                    return;
                }
                boolean z10 = this.v0;
                C0399a<R> c0399a = atomicReference.get();
                boolean z11 = c0399a == null;
                if (z10 && z11) {
                    atomicThrowable.tryTerminateConsumer(observer);
                    return;
                }
                if (z11 || c0399a.f76255q0 == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(c0399a, null) && atomicReference.get() == c0399a) {
                    }
                    observer.onNext(c0399a.f76255q0);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76253w0 = true;
            this.f76252u0.dispose();
            a();
            this.f76250s0.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76253w0;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.v0 = true;
            b();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76250s0.tryAddThrowableOrReport(th2)) {
                if (!this.f76249r0) {
                    a();
                }
                this.v0 = true;
                b();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            C0399a<Object> c0399a = f76246x0;
            AtomicReference<C0399a<R>> atomicReference = this.f76251t0;
            C0399a<R> c0399a2 = atomicReference.get();
            if (c0399a2 != null) {
                DisposableHelper.dispose(c0399a2);
            }
            try {
                MaybeSource<? extends R> maybeSourceApply = this.f76248q0.apply(t10);
                Objects.requireNonNull(maybeSourceApply, "The mapper returned a null MaybeSource");
                MaybeSource<? extends R> maybeSource = maybeSourceApply;
                C0399a<R> c0399a3 = new C0399a<>(this);
                while (true) {
                    C0399a<R> c0399a4 = atomicReference.get();
                    if (c0399a4 == c0399a) {
                        return;
                    }
                    do {
                        if (atomicReference.compareAndSet(c0399a4, c0399a3)) {
                            maybeSource.subscribe(c0399a3);
                            return;
                        }
                    } while (atomicReference.get() == c0399a4);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f76252u0.dispose();
                atomicReference.getAndSet((C0399a<R>) c0399a);
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76252u0, disposable)) {
                this.f76252u0 = disposable;
                this.f76247p0.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMapMaybe(Observable<T> observable, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z10) {
        this.f76243p0 = observable;
        this.f76244q0 = function;
        this.f76245r0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        Observable<T> observable = this.f76243p0;
        Function<? super T, ? extends MaybeSource<? extends R>> function = this.f76244q0;
        if (k.c(observable, function, observer)) {
            return;
        }
        observable.subscribe(new a(observer, function, this.f76245r0));
    }
}
