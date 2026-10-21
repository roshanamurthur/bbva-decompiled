package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableZip<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<? extends T>[] f77433p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Iterable<? extends ObservableSource<? extends T>> f77434q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super Object[], ? extends R> f77435r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f77436s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f77437t0;

    public static final class a<T, R> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f77438p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Object[], ? extends R> f77439q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final b<T, R>[] f77440r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final T[] f77441s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f77442t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f77443u0;

        public a(Observer<? super R> observer, Function<? super Object[], ? extends R> function, int i10, boolean z10) {
            this.f77438p0 = observer;
            this.f77439q0 = function;
            this.f77440r0 = new b[i10];
            this.f77441s0 = (T[]) new Object[i10];
            this.f77442t0 = z10;
        }

        public final void a() {
            b<T, R>[] bVarArr = this.f77440r0;
            for (b<T, R> bVar : bVarArr) {
                bVar.f77445q0.clear();
            }
            for (b<T, R> bVar2 : bVarArr) {
                DisposableHelper.dispose(bVar2.f77448t0);
            }
        }

        public final void b() {
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            b<T, R>[] bVarArr = this.f77440r0;
            Observer<? super R> observer = this.f77438p0;
            T[] tArr = this.f77441s0;
            boolean z10 = this.f77442t0;
            int iAddAndGet = 1;
            while (true) {
                int i10 = 0;
                int i11 = 0;
                for (b<T, R> bVar : bVarArr) {
                    if (tArr[i11] == null) {
                        boolean z11 = bVar.f77446r0;
                        T tPoll = bVar.f77445q0.poll();
                        boolean z12 = tPoll == null;
                        if (this.f77443u0) {
                            a();
                            return;
                        }
                        if (z11) {
                            if (!z10) {
                                Throwable th3 = bVar.f77447s0;
                                if (th3 != null) {
                                    this.f77443u0 = true;
                                    a();
                                    observer.onError(th3);
                                    return;
                                } else if (z12) {
                                    this.f77443u0 = true;
                                    a();
                                    observer.onComplete();
                                    return;
                                }
                            } else if (z12) {
                                Throwable th4 = bVar.f77447s0;
                                this.f77443u0 = true;
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
                    } else if (bVar.f77446r0 && !z10 && (th2 = bVar.f77447s0) != null) {
                        this.f77443u0 = true;
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
                        R rApply = this.f77439q0.apply(tArr.clone());
                        Objects.requireNonNull(rApply, "The zipper returned a null value");
                        observer.onNext(rApply);
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

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f77443u0) {
                return;
            }
            this.f77443u0 = true;
            for (b<T, R> bVar : this.f77440r0) {
                DisposableHelper.dispose(bVar.f77448t0);
            }
            if (getAndIncrement() == 0) {
                for (b<T, R> bVar2 : this.f77440r0) {
                    bVar2.f77445q0.clear();
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77443u0;
        }
    }

    public static final class b<T, R> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T, R> f77444p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<T> f77445q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile boolean f77446r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Throwable f77447s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<Disposable> f77448t0 = new AtomicReference<>();

        public b(a<T, R> aVar, int i10) {
            this.f77444p0 = aVar;
            this.f77445q0 = new SpscLinkedArrayQueue<>(i10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f77446r0 = true;
            this.f77444p0.b();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f77447s0 = th2;
            this.f77446r0 = true;
            this.f77444p0.b();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f77445q0.offer(t10);
            this.f77444p0.b();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f77448t0, disposable);
        }
    }

    public ObservableZip(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i10, boolean z10) {
        this.f77433p0 = observableSourceArr;
        this.f77434q0 = iterable;
        this.f77435r0 = function;
        this.f77436s0 = i10;
        this.f77437t0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        int length;
        ObservableSource<? extends T>[] observableSourceArr = this.f77433p0;
        if (observableSourceArr == null) {
            observableSourceArr = new ObservableSource[8];
            length = 0;
            for (ObservableSource<? extends T> observableSource : this.f77434q0) {
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
        a aVar = new a(observer, this.f77435r0, length, this.f77437t0);
        int i10 = this.f77436s0;
        b<T, R>[] bVarArr = aVar.f77440r0;
        int length2 = bVarArr.length;
        for (int i11 = 0; i11 < length2; i11++) {
            bVarArr[i11] = new b<>(aVar, i10);
        }
        aVar.lazySet(0);
        aVar.f77438p0.onSubscribe(aVar);
        for (int i12 = 0; i12 < length2 && !aVar.f77443u0; i12++) {
            observableSourceArr[i12].subscribe(bVarArr[i12]);
        }
    }
}
