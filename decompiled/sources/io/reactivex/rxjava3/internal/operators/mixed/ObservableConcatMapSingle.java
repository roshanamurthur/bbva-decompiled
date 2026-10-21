package io.reactivex.rxjava3.internal.operators.mixed;

import com.google.android.play.core.splitinstall.internal.k;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableConcatMapSingle<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f76218p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends SingleSource<? extends R>> f76219q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ErrorMode f76220r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f76221s0;

    public static final class a<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public volatile int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f76222p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends SingleSource<? extends R>> f76223q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicThrowable f76224r0 = new AtomicThrowable();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final C0397a<R> f76225s0 = new C0397a<>(this);

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final SpscLinkedArrayQueue f76226t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final ErrorMode f76227u0;
        public Disposable v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f76228w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f76229x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public R f76230y0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.mixed.ObservableConcatMapSingle$a$a, reason: collision with other inner class name */
        public static final class C0397a<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, R> f76231p0;

            public C0397a(a<?, R> aVar) {
                this.f76231p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f76231p0;
                if (aVar.f76224r0.tryAddThrowableOrReport(th2)) {
                    if (aVar.f76227u0 != ErrorMode.END) {
                        aVar.v0.dispose();
                    }
                    aVar.E0 = 0;
                    aVar.a();
                }
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(R r3) {
                a<?, R> aVar = this.f76231p0;
                aVar.f76230y0 = r3;
                aVar.E0 = 2;
                aVar.a();
            }
        }

        public a(Observer<? super R> observer, Function<? super T, ? extends SingleSource<? extends R>> function, int i10, ErrorMode errorMode) {
            this.f76222p0 = observer;
            this.f76223q0 = function;
            this.f76227u0 = errorMode;
            this.f76226t0 = new SpscLinkedArrayQueue(i10);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.f76222p0;
            ErrorMode errorMode = this.f76227u0;
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f76226t0;
            AtomicThrowable atomicThrowable = this.f76224r0;
            int iAddAndGet = 1;
            while (true) {
                if (!this.f76229x0) {
                    int i10 = this.E0;
                    if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i10 == 0))) {
                        break;
                    }
                    if (i10 == 0) {
                        boolean z10 = this.f76228w0;
                        T tPoll = spscLinkedArrayQueue.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            atomicThrowable.tryTerminateConsumer(observer);
                            return;
                        }
                        if (!z11) {
                            try {
                                SingleSource<? extends R> singleSourceApply = this.f76223q0.apply(tPoll);
                                Objects.requireNonNull(singleSourceApply, "The mapper returned a null SingleSource");
                                SingleSource<? extends R> singleSource = singleSourceApply;
                                this.E0 = 1;
                                singleSource.subscribe(this.f76225s0);
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.v0.dispose();
                                spscLinkedArrayQueue.clear();
                                atomicThrowable.tryAddThrowableOrReport(th2);
                                atomicThrowable.tryTerminateConsumer(observer);
                                return;
                            }
                        }
                    } else if (i10 == 2) {
                        R r3 = this.f76230y0;
                        this.f76230y0 = null;
                        observer.onNext(r3);
                        this.E0 = 0;
                    }
                } else {
                    spscLinkedArrayQueue.clear();
                    this.f76230y0 = null;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            spscLinkedArrayQueue.clear();
            this.f76230y0 = null;
            atomicThrowable.tryTerminateConsumer(observer);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76229x0 = true;
            this.v0.dispose();
            C0397a<R> c0397a = this.f76225s0;
            c0397a.getClass();
            DisposableHelper.dispose(c0397a);
            this.f76224r0.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                this.f76226t0.clear();
                this.f76230y0 = null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76229x0;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76228w0 = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76224r0.tryAddThrowableOrReport(th2)) {
                if (this.f76227u0 == ErrorMode.IMMEDIATE) {
                    C0397a<R> c0397a = this.f76225s0;
                    c0397a.getClass();
                    DisposableHelper.dispose(c0397a);
                }
                this.f76228w0 = true;
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f76226t0.offer(t10);
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.v0, disposable)) {
                this.v0 = disposable;
                this.f76222p0.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMapSingle(ObservableSource<T> observableSource, Function<? super T, ? extends SingleSource<? extends R>> function, ErrorMode errorMode, int i10) {
        this.f76218p0 = observableSource;
        this.f76219q0 = function;
        this.f76220r0 = errorMode;
        this.f76221s0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        ObservableSource<T> observableSource = this.f76218p0;
        Function<? super T, ? extends SingleSource<? extends R>> function = this.f76219q0;
        if (k.d(observableSource, function, observer)) {
            return;
        }
        observableSource.subscribe(new a(observer, function, this.f76221s0, this.f76220r0));
    }
}
