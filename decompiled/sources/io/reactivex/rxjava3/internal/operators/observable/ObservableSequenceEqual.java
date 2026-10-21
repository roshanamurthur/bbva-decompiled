package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSequenceEqual<T> extends Observable<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<? extends T> f77099p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ObservableSource<? extends T> f77100q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiPredicate<? super T, ? super T> f77101r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f77102s0;

    public static final class a<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Boolean> f77103p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiPredicate<? super T, ? super T> f77104q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ArrayCompositeDisposable f77105r0 = new ArrayCompositeDisposable(2);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final ObservableSource<? extends T> f77106s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final ObservableSource<? extends T> f77107t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final b<T>[] f77108u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public T f77109w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public T f77110x0;

        public a(Observer<? super Boolean> observer, int i10, ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate) {
            this.f77103p0 = observer;
            this.f77106s0 = observableSource;
            this.f77107t0 = observableSource2;
            this.f77104q0 = biPredicate;
            this.f77108u0 = new b[]{new b<>(this, 0, i10), new b<>(this, 1, i10)};
        }

        public final void a() {
            Throwable th2;
            Throwable th3;
            if (getAndIncrement() != 0) {
                return;
            }
            b<T>[] bVarArr = this.f77108u0;
            b<T> bVar = bVarArr[0];
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = bVar.f77112q0;
            b<T> bVar2 = bVarArr[1];
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = bVar2.f77112q0;
            int iAddAndGet = 1;
            while (!this.v0) {
                boolean z10 = bVar.f77114s0;
                if (z10 && (th3 = bVar.f77115t0) != null) {
                    this.v0 = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f77103p0.onError(th3);
                    return;
                }
                boolean z11 = bVar2.f77114s0;
                if (z11 && (th2 = bVar2.f77115t0) != null) {
                    this.v0 = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f77103p0.onError(th2);
                    return;
                }
                if (this.f77109w0 == null) {
                    this.f77109w0 = spscLinkedArrayQueue.poll();
                }
                boolean z12 = this.f77109w0 == null;
                if (this.f77110x0 == null) {
                    this.f77110x0 = spscLinkedArrayQueue2.poll();
                }
                T t10 = this.f77110x0;
                boolean z13 = t10 == null;
                if (z10 && z11 && z12 && z13) {
                    this.f77103p0.onNext(Boolean.TRUE);
                    this.f77103p0.onComplete();
                    return;
                }
                if (z10 && z11 && z12 != z13) {
                    this.v0 = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f77103p0.onNext(Boolean.FALSE);
                    this.f77103p0.onComplete();
                    return;
                }
                if (!z12 && !z13) {
                    try {
                        if (!this.f77104q0.test(this.f77109w0, t10)) {
                            this.v0 = true;
                            spscLinkedArrayQueue.clear();
                            spscLinkedArrayQueue2.clear();
                            this.f77103p0.onNext(Boolean.FALSE);
                            this.f77103p0.onComplete();
                            return;
                        }
                        this.f77109w0 = null;
                        this.f77110x0 = null;
                    } catch (Throwable th4) {
                        Exceptions.throwIfFatal(th4);
                        this.v0 = true;
                        spscLinkedArrayQueue.clear();
                        spscLinkedArrayQueue2.clear();
                        this.f77103p0.onError(th4);
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

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            this.f77105r0.dispose();
            if (getAndIncrement() == 0) {
                b<T>[] bVarArr = this.f77108u0;
                bVarArr[0].f77112q0.clear();
                bVarArr[1].f77112q0.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.v0;
        }
    }

    public static final class b<T> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T> f77111p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<T> f77112q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f77113r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f77114s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Throwable f77115t0;

        public b(a<T> aVar, int i10, int i11) {
            this.f77111p0 = aVar;
            this.f77113r0 = i10;
            this.f77112q0 = new SpscLinkedArrayQueue<>(i11);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f77114s0 = true;
            this.f77111p0.a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f77115t0 = th2;
            this.f77114s0 = true;
            this.f77111p0.a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f77112q0.offer(t10);
            this.f77111p0.a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f77111p0.f77105r0.setResource(this.f77113r0, disposable);
        }
    }

    public ObservableSequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate, int i10) {
        this.f77099p0 = observableSource;
        this.f77100q0 = observableSource2;
        this.f77101r0 = biPredicate;
        this.f77102s0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super Boolean> observer) {
        a aVar = new a(observer, this.f77102s0, this.f77099p0, this.f77100q0, this.f77101r0);
        observer.onSubscribe(aVar);
        b<T>[] bVarArr = aVar.f77108u0;
        aVar.f77106s0.subscribe(bVarArr[0]);
        aVar.f77107t0.subscribe(bVarArr[1]);
    }
}
