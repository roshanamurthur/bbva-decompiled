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
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableConcatMapMaybe<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observable<T> f76204p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends MaybeSource<? extends R>> f76205q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ErrorMode f76206r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f76207s0;

    public static final class a<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public volatile int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f76208p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends MaybeSource<? extends R>> f76209q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicThrowable f76210r0 = new AtomicThrowable();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final C0396a<R> f76211s0 = new C0396a<>(this);

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final SpscLinkedArrayQueue f76212t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final ErrorMode f76213u0;
        public Disposable v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f76214w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f76215x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public R f76216y0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.mixed.ObservableConcatMapMaybe$a$a, reason: collision with other inner class name */
        public static final class C0396a<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, R> f76217p0;

            public C0396a(a<?, R> aVar) {
                this.f76217p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                a<?, R> aVar = this.f76217p0;
                aVar.E0 = 0;
                aVar.a();
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f76217p0;
                if (aVar.f76210r0.tryAddThrowableOrReport(th2)) {
                    if (aVar.f76213u0 != ErrorMode.END) {
                        aVar.v0.dispose();
                    }
                    aVar.E0 = 0;
                    aVar.a();
                }
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(R r3) {
                a<?, R> aVar = this.f76217p0;
                aVar.f76216y0 = r3;
                aVar.E0 = 2;
                aVar.a();
            }
        }

        public a(Observer<? super R> observer, Function<? super T, ? extends MaybeSource<? extends R>> function, int i10, ErrorMode errorMode) {
            this.f76208p0 = observer;
            this.f76209q0 = function;
            this.f76213u0 = errorMode;
            this.f76212t0 = new SpscLinkedArrayQueue(i10);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.f76208p0;
            ErrorMode errorMode = this.f76213u0;
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f76212t0;
            AtomicThrowable atomicThrowable = this.f76210r0;
            int iAddAndGet = 1;
            while (true) {
                if (!this.f76215x0) {
                    int i10 = this.E0;
                    if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i10 == 0))) {
                        break;
                    }
                    if (i10 == 0) {
                        boolean z10 = this.f76214w0;
                        T tPoll = spscLinkedArrayQueue.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            atomicThrowable.tryTerminateConsumer(observer);
                            return;
                        }
                        if (!z11) {
                            try {
                                MaybeSource<? extends R> maybeSourceApply = this.f76209q0.apply(tPoll);
                                Objects.requireNonNull(maybeSourceApply, "The mapper returned a null MaybeSource");
                                MaybeSource<? extends R> maybeSource = maybeSourceApply;
                                this.E0 = 1;
                                maybeSource.subscribe(this.f76211s0);
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
                        R r3 = this.f76216y0;
                        this.f76216y0 = null;
                        observer.onNext(r3);
                        this.E0 = 0;
                    }
                } else {
                    spscLinkedArrayQueue.clear();
                    this.f76216y0 = null;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            spscLinkedArrayQueue.clear();
            this.f76216y0 = null;
            atomicThrowable.tryTerminateConsumer(observer);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76215x0 = true;
            this.v0.dispose();
            C0396a<R> c0396a = this.f76211s0;
            c0396a.getClass();
            DisposableHelper.dispose(c0396a);
            this.f76210r0.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                this.f76212t0.clear();
                this.f76216y0 = null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76215x0;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76214w0 = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76210r0.tryAddThrowableOrReport(th2)) {
                if (this.f76213u0 == ErrorMode.IMMEDIATE) {
                    C0396a<R> c0396a = this.f76211s0;
                    c0396a.getClass();
                    DisposableHelper.dispose(c0396a);
                }
                this.f76214w0 = true;
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f76212t0.offer(t10);
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.v0, disposable)) {
                this.v0 = disposable;
                this.f76208p0.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMapMaybe(Observable<T> observable, Function<? super T, ? extends MaybeSource<? extends R>> function, ErrorMode errorMode, int i10) {
        this.f76204p0 = observable;
        this.f76205q0 = function;
        this.f76206r0 = errorMode;
        this.f76207s0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        Observable<T> observable = this.f76204p0;
        Function<? super T, ? extends MaybeSource<? extends R>> function = this.f76205q0;
        if (k.c(observable, function, observer)) {
            return;
        }
        observable.subscribe(new a(observer, function, this.f76207s0, this.f76206r0));
    }
}
