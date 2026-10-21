package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableZip<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<? extends T>[] f73184p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Iterable<? extends ObservableSource<? extends T>> f73185q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super Object[], ? extends R> f73186r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f73187s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f73188t0;

    public static final class a<T, R> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f73189p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Object[], ? extends R> f73190q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final b<T, R>[] f73191r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final T[] f73192s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f73193t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f73194u0;

        public a(Observer<? super R> observer, Function<? super Object[], ? extends R> function, int i10, boolean z10) {
            this.f73189p0 = observer;
            this.f73190q0 = function;
            this.f73191r0 = new b[i10];
            this.f73192s0 = (T[]) new Object[i10];
            this.f73193t0 = z10;
        }

        public final void a() {
            b<T, R>[] bVarArr = this.f73191r0;
            for (b<T, R> bVar : bVarArr) {
                bVar.f73196q0.clear();
            }
            for (b<T, R> bVar2 : bVarArr) {
                DisposableHelper.dispose(bVar2.f73199t0);
            }
        }

        public final void b() {
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            b<T, R>[] bVarArr = this.f73191r0;
            Observer<? super R> observer = this.f73189p0;
            T[] tArr = this.f73192s0;
            boolean z10 = this.f73193t0;
            int iAddAndGet = 1;
            while (true) {
                int i10 = 0;
                int i11 = 0;
                for (b<T, R> bVar : bVarArr) {
                    if (tArr[i11] == null) {
                        boolean z11 = bVar.f73197r0;
                        T tPoll = bVar.f73196q0.poll();
                        boolean z12 = tPoll == null;
                        if (this.f73194u0) {
                            a();
                            return;
                        }
                        if (z11) {
                            if (!z10) {
                                Throwable th3 = bVar.f73198s0;
                                if (th3 != null) {
                                    this.f73194u0 = true;
                                    a();
                                    observer.onError(th3);
                                    return;
                                } else if (z12) {
                                    this.f73194u0 = true;
                                    a();
                                    observer.onComplete();
                                    return;
                                }
                            } else if (z12) {
                                Throwable th4 = bVar.f73198s0;
                                this.f73194u0 = true;
                                a();
                                if (th4 != null) {
                                    observer.onError(th4);
                                    return;
                                } else {
                                    observer.onComplete();
                                    return;
                                }
                            }
                        }
                        if (z12) {
                            i10++;
                        } else {
                            tArr[i11] = tPoll;
                        }
                    } else if (bVar.f73197r0 && !z10 && (th2 = bVar.f73198s0) != null) {
                        this.f73194u0 = true;
                        a();
                        observer.onError(th2);
                        return;
                    }
                    i11++;
                }
                if (i10 != 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        observer.onNext((Object) ObjectHelper.requireNonNull(this.f73190q0.apply(tArr.clone()), "The zipper returned a null value"));
                        Arrays.fill(tArr, (Object) null);
                    } catch (Throwable th5) {
                        Exceptions.throwIfFatal(th5);
                        a();
                        observer.onError(th5);
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f73194u0) {
                return;
            }
            this.f73194u0 = true;
            for (b<T, R> bVar : this.f73191r0) {
                DisposableHelper.dispose(bVar.f73199t0);
            }
            if (getAndIncrement() == 0) {
                for (b<T, R> bVar2 : this.f73191r0) {
                    bVar2.f73196q0.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f73194u0;
        }
    }

    public static final class b<T, R> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T, R> f73195p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<T> f73196q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile boolean f73197r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Throwable f73198s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<Disposable> f73199t0 = new AtomicReference<>();

        public b(a<T, R> aVar, int i10) {
            this.f73195p0 = aVar;
            this.f73196q0 = new SpscLinkedArrayQueue<>(i10);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f73197r0 = true;
            this.f73195p0.b();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f73198s0 = th2;
            this.f73197r0 = true;
            this.f73195p0.b();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f73196q0.offer(t10);
            this.f73195p0.b();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f73199t0, disposable);
        }
    }

    public ObservableZip(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i10, boolean z10) {
        this.f73184p0 = observableSourceArr;
        this.f73185q0 = iterable;
        this.f73186r0 = function;
        this.f73187s0 = i10;
        this.f73188t0 = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        int length;
        ObservableSource<? extends T>[] observableSourceArr = this.f73184p0;
        if (observableSourceArr == null) {
            observableSourceArr = new ObservableSource[8];
            length = 0;
            for (ObservableSource<? extends T> observableSource : this.f73185q0) {
                if (length == observableSourceArr.length) {
                    ObservableSource<? extends T>[] observableSourceArr2 = new ObservableSource[(length >> 2) + length];
                    System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, length);
                    observableSourceArr = observableSourceArr2;
                }
                observableSourceArr[length] = observableSource;
                length++;
            }
        } else {
            length = observableSourceArr.length;
        }
        if (length == 0) {
            EmptyDisposable.complete(observer);
            return;
        }
        a aVar = new a(observer, this.f73186r0, length, this.f73188t0);
        int i10 = this.f73187s0;
        b<T, R>[] bVarArr = aVar.f73191r0;
        int length2 = bVarArr.length;
        for (int i11 = 0; i11 < length2; i11++) {
            bVarArr[i11] = new b<>(aVar, i10);
        }
        aVar.lazySet(0);
        aVar.f73189p0.onSubscribe(aVar);
        for (int i12 = 0; i12 < length2 && !aVar.f73194u0; i12++) {
            observableSourceArr[i12].subscribe(bVarArr[i12]);
        }
    }
}
