package io.reactivex.internal.operators.observable;

import a.e;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableMergeWithMaybe<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<? extends T> f72596p0;

    public static final class a<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72597p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Disposable> f72598q0 = new AtomicReference<>();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final C0348a<T> f72599r0 = new C0348a<>(this);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f72600s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile SpscLinkedArrayQueue f72601t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public T f72602u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f72603w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile int f72604x0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.ObservableMergeWithMaybe$a$a, reason: collision with other inner class name */
        public static final class C0348a<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<T> f72605p0;

            public C0348a(a<T> aVar) {
                this.f72605p0 = aVar;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                a<T> aVar = this.f72605p0;
                aVar.f72604x0 = 2;
                if (aVar.getAndIncrement() == 0) {
                    aVar.a();
                }
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th2) {
                a<T> aVar = this.f72605p0;
                if (!aVar.f72600s0.addThrowable(th2)) {
                    RxJavaPlugins.onError(th2);
                    return;
                }
                DisposableHelper.dispose(aVar.f72598q0);
                if (aVar.getAndIncrement() == 0) {
                    aVar.a();
                }
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(T t10) {
                a<T> aVar = this.f72605p0;
                if (aVar.compareAndSet(0, 1)) {
                    aVar.f72597p0.onNext(t10);
                    aVar.f72604x0 = 2;
                } else {
                    aVar.f72602u0 = t10;
                    aVar.f72604x0 = 1;
                    if (aVar.getAndIncrement() != 0) {
                        return;
                    }
                }
                aVar.a();
            }
        }

        public a(Observer<? super T> observer) {
            this.f72597p0 = observer;
        }

        public final void a() {
            Observer<? super T> observer = this.f72597p0;
            int iAddAndGet = 1;
            while (!this.v0) {
                if (this.f72600s0.get() != null) {
                    this.f72602u0 = null;
                    this.f72601t0 = null;
                    observer.onError(this.f72600s0.terminate());
                    return;
                }
                int i10 = this.f72604x0;
                if (i10 == 1) {
                    T t10 = this.f72602u0;
                    this.f72602u0 = null;
                    this.f72604x0 = 2;
                    observer.onNext(t10);
                    i10 = 2;
                }
                boolean z10 = this.f72603w0;
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f72601t0;
                e eVarPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                boolean z11 = eVarPoll == null;
                if (z10 && z11 && i10 == 2) {
                    this.f72601t0 = null;
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
            this.f72602u0 = null;
            this.f72601t0 = null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.v0 = true;
            DisposableHelper.dispose(this.f72598q0);
            DisposableHelper.dispose(this.f72599r0);
            if (getAndIncrement() == 0) {
                this.f72601t0 = null;
                this.f72602u0 = null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f72598q0.get());
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72603w0 = true;
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (!this.f72600s0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            DisposableHelper.dispose(this.f72599r0);
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (compareAndSet(0, 1)) {
                this.f72597p0.onNext(t10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f72601t0;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new SpscLinkedArrayQueue(Observable.bufferSize());
                    this.f72601t0 = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(t10);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            a();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f72598q0, disposable);
        }
    }

    public ObservableMergeWithMaybe(Observable<T> observable, MaybeSource<? extends T> maybeSource) {
        super(observable);
        this.f72596p0 = maybeSource;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a aVar = new a(observer);
        observer.onSubscribe(aVar);
        this.source.subscribe(aVar);
        this.f72596p0.subscribe(aVar.f72599r0);
    }
}
