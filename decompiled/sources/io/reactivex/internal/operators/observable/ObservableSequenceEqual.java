package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSequenceEqual<T> extends Observable<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<? extends T> f72822p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ObservableSource<? extends T> f72823q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiPredicate<? super T, ? super T> f72824r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f72825s0;

    public static final class a<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Boolean> f72826p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiPredicate<? super T, ? super T> f72827q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ArrayCompositeDisposable f72828r0 = new ArrayCompositeDisposable(2);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final ObservableSource<? extends T> f72829s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final ObservableSource<? extends T> f72830t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final b<T>[] f72831u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public T f72832w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public T f72833x0;

        public a(Observer<? super Boolean> observer, int i10, ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate) {
            this.f72826p0 = observer;
            this.f72829s0 = observableSource;
            this.f72830t0 = observableSource2;
            this.f72827q0 = biPredicate;
            this.f72831u0 = new b[]{new b<>(this, 0, i10), new b<>(this, 1, i10)};
        }

        public final void a() {
            Throwable th2;
            Throwable th3;
            if (getAndIncrement() != 0) {
                return;
            }
            b<T>[] bVarArr = this.f72831u0;
            b<T> bVar = bVarArr[0];
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = bVar.f72835q0;
            b<T> bVar2 = bVarArr[1];
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = bVar2.f72835q0;
            int iAddAndGet = 1;
            while (!this.v0) {
                boolean z10 = bVar.f72837s0;
                if (z10 && (th3 = bVar.f72838t0) != null) {
                    this.v0 = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f72826p0.onError(th3);
                    return;
                }
                boolean z11 = bVar2.f72837s0;
                if (z11 && (th2 = bVar2.f72838t0) != null) {
                    this.v0 = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f72826p0.onError(th2);
                    return;
                }
                if (this.f72832w0 == null) {
                    this.f72832w0 = spscLinkedArrayQueue.poll();
                }
                boolean z12 = this.f72832w0 == null;
                if (this.f72833x0 == null) {
                    this.f72833x0 = spscLinkedArrayQueue2.poll();
                }
                T t10 = this.f72833x0;
                boolean z13 = t10 == null;
                if (z10 && z11 && z12 && z13) {
                    this.f72826p0.onNext(Boolean.TRUE);
                    this.f72826p0.onComplete();
                    return;
                }
                if (z10 && z11 && z12 != z13) {
                    this.v0 = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f72826p0.onNext(Boolean.FALSE);
                    this.f72826p0.onComplete();
                    return;
                }
                if (!z12 && !z13) {
                    try {
                        if (!this.f72827q0.test(this.f72832w0, t10)) {
                            this.v0 = true;
                            spscLinkedArrayQueue.clear();
                            spscLinkedArrayQueue2.clear();
                            this.f72826p0.onNext(Boolean.FALSE);
                            this.f72826p0.onComplete();
                            return;
                        }
                        this.f72832w0 = null;
                        this.f72833x0 = null;
                    } catch (Throwable th4) {
                        Exceptions.throwIfFatal(th4);
                        this.v0 = true;
                        spscLinkedArrayQueue.clear();
                        spscLinkedArrayQueue2.clear();
                        this.f72826p0.onError(th4);
                        return;
                    }
                }
                if (z12 || z13) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            spscLinkedArrayQueue.clear();
            spscLinkedArrayQueue2.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            this.f72828r0.dispose();
            if (getAndIncrement() == 0) {
                b<T>[] bVarArr = this.f72831u0;
                bVarArr[0].f72835q0.clear();
                bVarArr[1].f72835q0.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.v0;
        }
    }

    public static final class b<T> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T> f72834p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<T> f72835q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f72836r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f72837s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Throwable f72838t0;

        public b(a<T> aVar, int i10, int i11) {
            this.f72834p0 = aVar;
            this.f72836r0 = i10;
            this.f72835q0 = new SpscLinkedArrayQueue<>(i11);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72837s0 = true;
            this.f72834p0.a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72838t0 = th2;
            this.f72837s0 = true;
            this.f72834p0.a();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72835q0.offer(t10);
            this.f72834p0.a();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f72834p0.f72828r0.setResource(this.f72836r0, disposable);
        }
    }

    public ObservableSequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate, int i10) {
        this.f72822p0 = observableSource;
        this.f72823q0 = observableSource2;
        this.f72824r0 = biPredicate;
        this.f72825s0 = i10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Boolean> observer) {
        a aVar = new a(observer, this.f72825s0, this.f72822p0, this.f72823q0, this.f72824r0);
        observer.onSubscribe(aVar);
        b<T>[] bVarArr = aVar.f72831u0;
        aVar.f72829s0.subscribe(bVarArr[0]);
        aVar.f72830t0.subscribe(bVarArr[1]);
    }
}
