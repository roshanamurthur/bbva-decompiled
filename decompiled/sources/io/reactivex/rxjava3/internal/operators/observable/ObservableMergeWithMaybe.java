package io.reactivex.rxjava3.internal.operators.observable;

import a.e;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableMergeWithMaybe<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<? extends T> f76882p0;

    public static final class a<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76883p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Disposable> f76884q0 = new AtomicReference<>();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final C0413a<T> f76885r0 = new C0413a<>(this);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f76886s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile SpscLinkedArrayQueue f76887t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public T f76888u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f76889w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile int f76890x0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.ObservableMergeWithMaybe$a$a, reason: collision with other inner class name */
        public static final class C0413a<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<T> f76891p0;

            public C0413a(a<T> aVar) {
                this.f76891p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                a<T> aVar = this.f76891p0;
                aVar.f76890x0 = 2;
                if (aVar.getAndIncrement() == 0) {
                    aVar.a();
                }
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a<T> aVar = this.f76891p0;
                if (aVar.f76886s0.tryAddThrowableOrReport(th2)) {
                    DisposableHelper.dispose(aVar.f76884q0);
                    if (aVar.getAndIncrement() == 0) {
                        aVar.a();
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(T t10) {
                a<T> aVar = this.f76891p0;
                if (aVar.compareAndSet(0, 1)) {
                    aVar.f76883p0.onNext(t10);
                    aVar.f76890x0 = 2;
                } else {
                    aVar.f76888u0 = t10;
                    aVar.f76890x0 = 1;
                    if (aVar.getAndIncrement() != 0) {
                        return;
                    }
                }
                aVar.a();
            }
        }

        public a(Observer<? super T> observer) {
            this.f76883p0 = observer;
        }

        public final void a() {
            Observer<? super T> observer = this.f76883p0;
            int iAddAndGet = 1;
            while (!this.v0) {
                if (this.f76886s0.get() != null) {
                    this.f76888u0 = null;
                    this.f76887t0 = null;
                    this.f76886s0.tryTerminateConsumer(observer);
                    return;
                }
                int i10 = this.f76890x0;
                if (i10 == 1) {
                    T t10 = this.f76888u0;
                    this.f76888u0 = null;
                    this.f76890x0 = 2;
                    observer.onNext(t10);
                    i10 = 2;
                }
                boolean z10 = this.f76889w0;
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f76887t0;
                e eVarPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                boolean z11 = eVarPoll == null;
                if (z10 && z11 && i10 == 2) {
                    this.f76887t0 = null;
                    observer.onComplete();
                    return;
                } else if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    observer.onNext(eVarPoll);
                }
            }
            this.f76888u0 = null;
            this.f76887t0 = null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.v0 = true;
            DisposableHelper.dispose(this.f76884q0);
            DisposableHelper.dispose(this.f76885r0);
            this.f76886s0.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                this.f76887t0 = null;
                this.f76888u0 = null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f76884q0.get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76889w0 = true;
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76886s0.tryAddThrowableOrReport(th2)) {
                DisposableHelper.dispose(this.f76885r0);
                if (getAndIncrement() == 0) {
                    a();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (compareAndSet(0, 1)) {
                this.f76883p0.onNext(t10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f76887t0;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new SpscLinkedArrayQueue(Observable.bufferSize());
                    this.f76887t0 = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(t10);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f76884q0, disposable);
        }
    }

    public ObservableMergeWithMaybe(Observable<T> observable, MaybeSource<? extends T> maybeSource) {
        super(observable);
        this.f76882p0 = maybeSource;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a aVar = new a(observer);
        observer.onSubscribe(aVar);
        this.source.subscribe(aVar);
        this.f76882p0.subscribe(aVar.f76885r0);
    }
}
