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
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableConcatMapSingle<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observable<T> f71954p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends SingleSource<? extends R>> f71955q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ErrorMode f71956r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f71957s0;

    public static final class a<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public volatile int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f71958p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends SingleSource<? extends R>> f71959q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicThrowable f71960r0 = new AtomicThrowable();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final C0333a<R> f71961s0 = new C0333a<>(this);

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final SpscLinkedArrayQueue f71962t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final ErrorMode f71963u0;
        public Disposable v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f71964w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f71965x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public R f71966y0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.ObservableConcatMapSingle$a$a, reason: collision with other inner class name */
        public static final class C0333a<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, R> f71967p0;

            public C0333a(a<?, R> aVar) {
                this.f71967p0 = aVar;
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f71967p0;
                if (!aVar.f71960r0.addThrowable(th2)) {
                    RxJavaPlugins.onError(th2);
                    return;
                }
                if (aVar.f71963u0 != ErrorMode.END) {
                    aVar.v0.dispose();
                }
                aVar.E0 = 0;
                aVar.a();
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(R r3) {
                a<?, R> aVar = this.f71967p0;
                aVar.f71966y0 = r3;
                aVar.E0 = 2;
                aVar.a();
            }
        }

        public a(Observer<? super R> observer, Function<? super T, ? extends SingleSource<? extends R>> function, int i10, ErrorMode errorMode) {
            this.f71958p0 = observer;
            this.f71959q0 = function;
            this.f71963u0 = errorMode;
            this.f71962t0 = new SpscLinkedArrayQueue(i10);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.f71958p0;
            ErrorMode errorMode = this.f71963u0;
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f71962t0;
            AtomicThrowable atomicThrowable = this.f71960r0;
            int iAddAndGet = 1;
            while (true) {
                if (!this.f71965x0) {
                    int i10 = this.E0;
                    if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i10 == 0))) {
                        break;
                    }
                    if (i10 == 0) {
                        boolean z10 = this.f71964w0;
                        T tPoll = spscLinkedArrayQueue.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            Throwable thTerminate = atomicThrowable.terminate();
                            if (thTerminate == null) {
                                observer.onComplete();
                                return;
                            } else {
                                observer.onError(thTerminate);
                                return;
                            }
                        }
                        if (!z11) {
                            try {
                                SingleSource singleSource = (SingleSource) ObjectHelper.requireNonNull(this.f71959q0.apply(tPoll), "The mapper returned a null SingleSource");
                                this.E0 = 1;
                                singleSource.subscribe(this.f71961s0);
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.v0.dispose();
                                spscLinkedArrayQueue.clear();
                                atomicThrowable.addThrowable(th2);
                                observer.onError(atomicThrowable.terminate());
                                return;
                            }
                        }
                    } else if (i10 == 2) {
                        R r3 = this.f71966y0;
                        this.f71966y0 = null;
                        observer.onNext(r3);
                        this.E0 = 0;
                    }
                } else {
                    spscLinkedArrayQueue.clear();
                    this.f71966y0 = null;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            spscLinkedArrayQueue.clear();
            this.f71966y0 = null;
            observer.onError(atomicThrowable.terminate());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71965x0 = true;
            this.v0.dispose();
            C0333a<R> c0333a = this.f71961s0;
            c0333a.getClass();
            DisposableHelper.dispose(c0333a);
            if (getAndIncrement() == 0) {
                this.f71962t0.clear();
                this.f71966y0 = null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71965x0;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f71964w0 = true;
            a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (!this.f71960r0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (this.f71963u0 == ErrorMode.IMMEDIATE) {
                C0333a<R> c0333a = this.f71961s0;
                c0333a.getClass();
                DisposableHelper.dispose(c0333a);
            }
            this.f71964w0 = true;
            a();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f71962t0.offer(t10);
            a();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.v0, disposable)) {
                this.v0 = disposable;
                this.f71958p0.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMapSingle(Observable<T> observable, Function<? super T, ? extends SingleSource<? extends R>> function, ErrorMode errorMode, int i10) {
        this.f71954p0 = observable;
        this.f71955q0 = function;
        this.f71956r0 = errorMode;
        this.f71957s0 = i10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        Observable<T> observable = this.f71954p0;
        Function<? super T, ? extends SingleSource<? extends R>> function = this.f71955q0;
        if (bn.a.j(observable, function, observer)) {
            return;
        }
        observable.subscribe(new a(observer, function, this.f71957s0, this.f71956r0));
    }
}
