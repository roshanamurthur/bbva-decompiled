package io.reactivex.rxjava3.internal.operators.observable;

import a.e;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableMergeWithSingle<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T> f76892p0;

    public static final class a<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76893p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Disposable> f76894q0 = new AtomicReference<>();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final C0414a<T> f76895r0 = new C0414a<>(this);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f76896s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile SpscLinkedArrayQueue f76897t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public T f76898u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f76899w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile int f76900x0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.ObservableMergeWithSingle$a$a, reason: collision with other inner class name */
        public static final class C0414a<T> extends AtomicReference<Disposable> implements SingleObserver<T> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<T> f76901p0;

            public C0414a(a<T> aVar) {
                this.f76901p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a<T> aVar = this.f76901p0;
                if (aVar.f76896s0.tryAddThrowableOrReport(th2)) {
                    DisposableHelper.dispose(aVar.f76894q0);
                    if (aVar.getAndIncrement() == 0) {
                        aVar.a();
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(T t10) {
                a<T> aVar = this.f76901p0;
                if (aVar.compareAndSet(0, 1)) {
                    aVar.f76893p0.onNext(t10);
                    aVar.f76900x0 = 2;
                } else {
                    aVar.f76898u0 = t10;
                    aVar.f76900x0 = 1;
                    if (aVar.getAndIncrement() != 0) {
                        return;
                    }
                }
                aVar.a();
            }
        }

        public a(Observer<? super T> observer) {
            this.f76893p0 = observer;
        }

        public final void a() {
            Observer<? super T> observer = this.f76893p0;
            int iAddAndGet = 1;
            while (!this.v0) {
                if (this.f76896s0.get() != null) {
                    this.f76898u0 = null;
                    this.f76897t0 = null;
                    this.f76896s0.tryTerminateConsumer(observer);
                    return;
                }
                int i10 = this.f76900x0;
                if (i10 == 1) {
                    T t10 = this.f76898u0;
                    this.f76898u0 = null;
                    this.f76900x0 = 2;
                    observer.onNext(t10);
                    i10 = 2;
                }
                boolean z10 = this.f76899w0;
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f76897t0;
                e eVarPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                boolean z11 = eVarPoll == null;
                if (z10 && z11 && i10 == 2) {
                    this.f76897t0 = null;
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
            this.f76898u0 = null;
            this.f76897t0 = null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.v0 = true;
            DisposableHelper.dispose(this.f76894q0);
            DisposableHelper.dispose(this.f76895r0);
            this.f76896s0.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                this.f76897t0 = null;
                this.f76898u0 = null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f76894q0.get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76899w0 = true;
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76896s0.tryAddThrowableOrReport(th2)) {
                DisposableHelper.dispose(this.f76895r0);
                if (getAndIncrement() == 0) {
                    a();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (compareAndSet(0, 1)) {
                this.f76893p0.onNext(t10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f76897t0;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new SpscLinkedArrayQueue(Observable.bufferSize());
                    this.f76897t0 = spscLinkedArrayQueue;
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
            DisposableHelper.setOnce(this.f76894q0, disposable);
        }
    }

    public ObservableMergeWithSingle(Observable<T> observable, SingleSource<? extends T> singleSource) {
        super(observable);
        this.f76892p0 = singleSource;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a aVar = new a(observer);
        observer.onSubscribe(aVar);
        this.source.subscribe(aVar);
        this.f76892p0.subscribe(aVar.f76895r0);
    }
}
