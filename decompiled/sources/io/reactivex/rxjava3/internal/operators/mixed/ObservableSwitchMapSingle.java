package io.reactivex.rxjava3.internal.operators.mixed;

import com.google.android.play.core.splitinstall.internal.k;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
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
public final class ObservableSwitchMapSingle<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observable<T> f76256p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends SingleSource<? extends R>> f76257q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f76258r0;

    public static final class a<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final C0400a<Object> f76259x0 = new C0400a<>(null);

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f76260p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends SingleSource<? extends R>> f76261q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f76262r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f76263s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<C0400a<R>> f76264t0 = new AtomicReference<>();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f76265u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f76266w0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.mixed.ObservableSwitchMapSingle$a$a, reason: collision with other inner class name */
        public static final class C0400a<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, R> f76267p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public volatile R f76268q0;

            public C0400a(a<?, R> aVar) {
                this.f76267p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f76267p0;
                AtomicReference<C0400a<R>> atomicReference = aVar.f76264t0;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        RxJavaPlugins.onError(th2);
                        return;
                    }
                }
                if (aVar.f76263s0.tryAddThrowableOrReport(th2)) {
                    if (!aVar.f76262r0) {
                        aVar.f76265u0.dispose();
                        aVar.a();
                    }
                    aVar.b();
                }
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(R r3) {
                this.f76268q0 = r3;
                this.f76267p0.b();
            }
        }

        public a(Observer<? super R> observer, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10) {
            this.f76260p0 = observer;
            this.f76261q0 = function;
            this.f76262r0 = z10;
        }

        public final void a() {
            AtomicReference<C0400a<R>> atomicReference = this.f76264t0;
            C0400a<Object> c0400a = f76259x0;
            C0400a<R> andSet = atomicReference.getAndSet((C0400a<R>) c0400a);
            if (andSet == null || andSet == c0400a) {
                return;
            }
            DisposableHelper.dispose(andSet);
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.f76260p0;
            AtomicThrowable atomicThrowable = this.f76263s0;
            AtomicReference<C0400a<R>> atomicReference = this.f76264t0;
            int iAddAndGet = 1;
            while (!this.f76266w0) {
                if (atomicThrowable.get() != null && !this.f76262r0) {
                    atomicThrowable.tryTerminateConsumer(observer);
                    return;
                }
                boolean z10 = this.v0;
                C0400a<R> c0400a = atomicReference.get();
                boolean z11 = c0400a == null;
                if (z10 && z11) {
                    atomicThrowable.tryTerminateConsumer(observer);
                    return;
                }
                if (z11 || c0400a.f76268q0 == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(c0400a, null) && atomicReference.get() == c0400a) {
                    }
                    observer.onNext(c0400a.f76268q0);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76266w0 = true;
            this.f76265u0.dispose();
            a();
            this.f76263s0.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76266w0;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.v0 = true;
            b();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76263s0.tryAddThrowableOrReport(th2)) {
                if (!this.f76262r0) {
                    a();
                }
                this.v0 = true;
                b();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            C0400a<Object> c0400a = f76259x0;
            AtomicReference<C0400a<R>> atomicReference = this.f76264t0;
            C0400a<R> c0400a2 = atomicReference.get();
            if (c0400a2 != null) {
                DisposableHelper.dispose(c0400a2);
            }
            try {
                SingleSource<? extends R> singleSourceApply = this.f76261q0.apply(t10);
                Objects.requireNonNull(singleSourceApply, "The mapper returned a null SingleSource");
                SingleSource<? extends R> singleSource = singleSourceApply;
                C0400a<R> c0400a3 = new C0400a<>(this);
                while (true) {
                    C0400a<R> c0400a4 = atomicReference.get();
                    if (c0400a4 == c0400a) {
                        return;
                    }
                    do {
                        if (atomicReference.compareAndSet(c0400a4, c0400a3)) {
                            singleSource.subscribe(c0400a3);
                            return;
                        }
                    } while (atomicReference.get() == c0400a4);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f76265u0.dispose();
                atomicReference.getAndSet((C0400a<R>) c0400a);
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76265u0, disposable)) {
                this.f76265u0 = disposable;
                this.f76260p0.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMapSingle(Observable<T> observable, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10) {
        this.f76256p0 = observable;
        this.f76257q0 = function;
        this.f76258r0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        Observable<T> observable = this.f76256p0;
        Function<? super T, ? extends SingleSource<? extends R>> function = this.f76257q0;
        if (k.d(observable, function, observer)) {
            return;
        }
        observable.subscribe(new a(observer, function, this.f76258r0));
    }
}
