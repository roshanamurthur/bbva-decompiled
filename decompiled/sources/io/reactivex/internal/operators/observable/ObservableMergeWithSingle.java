package io.reactivex.internal.operators.observable;

import a.e;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableMergeWithSingle<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T> f72606p0;

    public static final class a<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72607p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Disposable> f72608q0 = new AtomicReference<>();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final C0349a<T> f72609r0 = new C0349a<>(this);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f72610s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile SpscLinkedArrayQueue f72611t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public T f72612u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f72613w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile int f72614x0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.ObservableMergeWithSingle$a$a, reason: collision with other inner class name */
        public static final class C0349a<T> extends AtomicReference<Disposable> implements SingleObserver<T> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<T> f72615p0;

            public C0349a(a<T> aVar) {
                this.f72615p0 = aVar;
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th2) {
                a<T> aVar = this.f72615p0;
                if (!aVar.f72610s0.addThrowable(th2)) {
                    RxJavaPlugins.onError(th2);
                    return;
                }
                DisposableHelper.dispose(aVar.f72608q0);
                if (aVar.getAndIncrement() == 0) {
                    aVar.a();
                }
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(T t10) {
                a<T> aVar = this.f72615p0;
                if (aVar.compareAndSet(0, 1)) {
                    aVar.f72607p0.onNext(t10);
                    aVar.f72614x0 = 2;
                } else {
                    aVar.f72612u0 = t10;
                    aVar.f72614x0 = 1;
                    if (aVar.getAndIncrement() != 0) {
                        return;
                    }
                }
                aVar.a();
            }
        }

        public a(Observer<? super T> observer) {
            this.f72607p0 = observer;
        }

        public final void a() {
            Observer<? super T> observer = this.f72607p0;
            int iAddAndGet = 1;
            while (!this.v0) {
                if (this.f72610s0.get() != null) {
                    this.f72612u0 = null;
                    this.f72611t0 = null;
                    observer.onError(this.f72610s0.terminate());
                    return;
                }
                int i10 = this.f72614x0;
                if (i10 == 1) {
                    T t10 = this.f72612u0;
                    this.f72612u0 = null;
                    this.f72614x0 = 2;
                    observer.onNext(t10);
                    i10 = 2;
                }
                boolean z10 = this.f72613w0;
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f72611t0;
                e eVarPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                boolean z11 = eVarPoll == null;
                if (z10 && z11 && i10 == 2) {
                    this.f72611t0 = null;
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
            this.f72612u0 = null;
            this.f72611t0 = null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.v0 = true;
            DisposableHelper.dispose(this.f72608q0);
            DisposableHelper.dispose(this.f72609r0);
            if (getAndIncrement() == 0) {
                this.f72611t0 = null;
                this.f72612u0 = null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f72608q0.get());
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72613w0 = true;
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (!this.f72610s0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            DisposableHelper.dispose(this.f72609r0);
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (compareAndSet(0, 1)) {
                this.f72607p0.onNext(t10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f72611t0;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new SpscLinkedArrayQueue(Observable.bufferSize());
                    this.f72611t0 = spscLinkedArrayQueue;
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
            DisposableHelper.setOnce(this.f72608q0, disposable);
        }
    }

    public ObservableMergeWithSingle(Observable<T> observable, SingleSource<? extends T> singleSource) {
        super(observable);
        this.f72606p0 = singleSource;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a aVar = new a(observer);
        observer.onSubscribe(aVar);
        this.source.subscribe(aVar);
        this.f72606p0.subscribe(aVar.f72609r0);
    }
}
