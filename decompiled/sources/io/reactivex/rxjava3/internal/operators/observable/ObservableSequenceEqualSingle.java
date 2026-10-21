package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSequenceEqualSingle<T> extends Single<Boolean> implements FuseToObservable<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<? extends T> f77116p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ObservableSource<? extends T> f77117q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiPredicate<? super T, ? super T> f77118r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f77119s0;

    public static final class a<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Boolean> f77120p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiPredicate<? super T, ? super T> f77121q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ArrayCompositeDisposable f77122r0 = new ArrayCompositeDisposable(2);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final ObservableSource<? extends T> f77123s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final ObservableSource<? extends T> f77124t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final b<T>[] f77125u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public T f77126w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public T f77127x0;

        public a(SingleObserver<? super Boolean> singleObserver, int i10, ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate) {
            this.f77120p0 = singleObserver;
            this.f77123s0 = observableSource;
            this.f77124t0 = observableSource2;
            this.f77121q0 = biPredicate;
            this.f77125u0 = new b[]{new b<>(this, 0, i10), new b<>(this, 1, i10)};
        }

        public final void a() {
            Throwable th2;
            Throwable th3;
            if (getAndIncrement() != 0) {
                return;
            }
            b<T>[] bVarArr = this.f77125u0;
            b<T> bVar = bVarArr[0];
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = bVar.f77129q0;
            b<T> bVar2 = bVarArr[1];
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = bVar2.f77129q0;
            int iAddAndGet = 1;
            while (!this.v0) {
                boolean z10 = bVar.f77131s0;
                if (z10 && (th3 = bVar.f77132t0) != null) {
                    this.v0 = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f77120p0.onError(th3);
                    return;
                }
                boolean z11 = bVar2.f77131s0;
                if (z11 && (th2 = bVar2.f77132t0) != null) {
                    this.v0 = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f77120p0.onError(th2);
                    return;
                }
                if (this.f77126w0 == null) {
                    this.f77126w0 = spscLinkedArrayQueue.poll();
                }
                boolean z12 = this.f77126w0 == null;
                if (this.f77127x0 == null) {
                    this.f77127x0 = spscLinkedArrayQueue2.poll();
                }
                T t10 = this.f77127x0;
                boolean z13 = t10 == null;
                if (z10 && z11 && z12 && z13) {
                    this.f77120p0.onSuccess(Boolean.TRUE);
                    return;
                }
                if (z10 && z11 && z12 != z13) {
                    this.v0 = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f77120p0.onSuccess(Boolean.FALSE);
                    return;
                }
                if (!z12 && !z13) {
                    try {
                        if (!this.f77121q0.test(this.f77126w0, t10)) {
                            this.v0 = true;
                            spscLinkedArrayQueue.clear();
                            spscLinkedArrayQueue2.clear();
                            this.f77120p0.onSuccess(Boolean.FALSE);
                            return;
                        }
                        this.f77126w0 = null;
                        this.f77127x0 = null;
                    } catch (Throwable th4) {
                        Exceptions.throwIfFatal(th4);
                        this.v0 = true;
                        spscLinkedArrayQueue.clear();
                        spscLinkedArrayQueue2.clear();
                        this.f77120p0.onError(th4);
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
            this.f77122r0.dispose();
            if (getAndIncrement() == 0) {
                b<T>[] bVarArr = this.f77125u0;
                bVarArr[0].f77129q0.clear();
                bVarArr[1].f77129q0.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.v0;
        }
    }

    public static final class b<T> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T> f77128p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<T> f77129q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f77130r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f77131s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Throwable f77132t0;

        public b(a<T> aVar, int i10, int i11) {
            this.f77128p0 = aVar;
            this.f77130r0 = i10;
            this.f77129q0 = new SpscLinkedArrayQueue<>(i11);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f77131s0 = true;
            this.f77128p0.a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f77132t0 = th2;
            this.f77131s0 = true;
            this.f77128p0.a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f77129q0.offer(t10);
            this.f77128p0.a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f77128p0.f77122r0.setResource(this.f77130r0, disposable);
        }
    }

    public ObservableSequenceEqualSingle(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate, int i10) {
        this.f77116p0 = observableSource;
        this.f77117q0 = observableSource2;
        this.f77118r0 = biPredicate;
        this.f77119s0 = i10;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToObservable
    public Observable<Boolean> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableSequenceEqual(this.f77116p0, this.f77117q0, this.f77118r0, this.f77119s0));
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        a aVar = new a(singleObserver, this.f77119s0, this.f77116p0, this.f77117q0, this.f77118r0);
        singleObserver.onSubscribe(aVar);
        b<T>[] bVarArr = aVar.f77125u0;
        aVar.f77123s0.subscribe(bVarArr[0]);
        aVar.f77124t0.subscribe(bVarArr[1]);
    }
}
