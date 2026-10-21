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
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableCombineLatest<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<? extends T>[] f72178p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Iterable<? extends ObservableSource<? extends T>> f72179q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super Object[], ? extends R> f72180r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f72181s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f72182t0;

    public static final class a<T, R> extends AtomicReference<Disposable> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T, R> f72183p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f72184q0;

        public a(b<T, R> bVar, int i10) {
            this.f72183p0 = bVar;
            this.f72184q0 = i10;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x001f A[Catch: all -> 0x000b, TryCatch #0 {all -> 0x000b, blocks: (B:4:0x0005, B:6:0x0009, B:10:0x000d, B:15:0x0017, B:18:0x0021, B:17:0x001f), top: B:25:0x0005 }] */
        @Override // io.reactivex.Observer
        public final void onComplete() {
            b<T, R> bVar = this.f72183p0;
            int i10 = this.f72184q0;
            synchronized (bVar) {
                try {
                    Object[] objArr = bVar.f72188s0;
                    if (objArr == null) {
                        return;
                    }
                    boolean z10 = objArr[i10] == null;
                    if (z10) {
                        bVar.f72191w0 = true;
                    } else {
                        int i11 = bVar.E0 + 1;
                        bVar.E0 = i11;
                        if (i11 == objArr.length) {
                            bVar.f72191w0 = true;
                        }
                    }
                    if (z10) {
                        bVar.a();
                    }
                    bVar.c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x002b A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0011, B:9:0x0015, B:13:0x0019, B:18:0x0023, B:21:0x002d, B:20:0x002b), top: B:30:0x0011 }] */
        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            b<T, R> bVar = this.f72183p0;
            int i10 = this.f72184q0;
            if (!bVar.f72192x0.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (bVar.f72190u0) {
                synchronized (bVar) {
                    try {
                        Object[] objArr = bVar.f72188s0;
                        if (objArr == null) {
                            return;
                        }
                        boolean z10 = objArr[i10] == null;
                        if (z10) {
                            bVar.f72191w0 = true;
                        } else {
                            int i11 = bVar.E0 + 1;
                            bVar.E0 = i11;
                            if (i11 == objArr.length) {
                                bVar.f72191w0 = true;
                            }
                        }
                        if (z10) {
                            bVar.a();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } else {
                bVar.a();
            }
            bVar.c();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            boolean z10;
            b<T, R> bVar = this.f72183p0;
            int i10 = this.f72184q0;
            synchronized (bVar) {
                try {
                    Object[] objArr = bVar.f72188s0;
                    if (objArr == null) {
                        return;
                    }
                    Object obj = objArr[i10];
                    int i11 = bVar.f72193y0;
                    if (obj == null) {
                        i11++;
                        bVar.f72193y0 = i11;
                    }
                    objArr[i10] = t10;
                    if (i11 == objArr.length) {
                        bVar.f72189t0.offer((Object[]) objArr.clone());
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        bVar.c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public static final class b<T, R> extends AtomicInteger implements Disposable {
        public int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f72185p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Object[], ? extends R> f72186q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final a<T, R>[] f72187r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Object[] f72188s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<Object[]> f72189t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f72190u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f72191w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicThrowable f72192x0 = new AtomicThrowable();

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public int f72193y0;

        public b(int i10, int i11, Observer observer, Function function, boolean z10) {
            this.f72185p0 = observer;
            this.f72186q0 = function;
            this.f72190u0 = z10;
            this.f72188s0 = new Object[i10];
            a<T, R>[] aVarArr = new a[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                aVarArr[i12] = new a<>(this, i12);
            }
            this.f72187r0 = aVarArr;
            this.f72189t0 = new SpscLinkedArrayQueue<>(i11);
        }

        public final void a() {
            for (a<T, R> aVar : this.f72187r0) {
                aVar.getClass();
                DisposableHelper.dispose(aVar);
            }
        }

        public final void b(SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            synchronized (this) {
                this.f72188s0 = null;
            }
            spscLinkedArrayQueue.clear();
        }

        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<Object[]> spscLinkedArrayQueue = this.f72189t0;
            Observer<? super R> observer = this.f72185p0;
            boolean z10 = this.f72190u0;
            int iAddAndGet = 1;
            while (!this.v0) {
                if (!z10 && this.f72192x0.get() != null) {
                    a();
                    b(spscLinkedArrayQueue);
                    observer.onError(this.f72192x0.terminate());
                    return;
                }
                boolean z11 = this.f72191w0;
                Object[] objArrPoll = spscLinkedArrayQueue.poll();
                boolean z12 = objArrPoll == null;
                if (z11 && z12) {
                    b(spscLinkedArrayQueue);
                    Throwable thTerminate = this.f72192x0.terminate();
                    if (thTerminate == null) {
                        observer.onComplete();
                        return;
                    } else {
                        observer.onError(thTerminate);
                        return;
                    }
                }
                if (z12) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        observer.onNext((Object) ObjectHelper.requireNonNull(this.f72186q0.apply(objArrPoll), "The combiner returned a null value"));
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.f72192x0.addThrowable(th2);
                        a();
                        b(spscLinkedArrayQueue);
                        observer.onError(this.f72192x0.terminate());
                        return;
                    }
                }
            }
            b(spscLinkedArrayQueue);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            a();
            if (getAndIncrement() == 0) {
                b(this.f72189t0);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.v0;
        }
    }

    public ObservableCombineLatest(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i10, boolean z10) {
        this.f72178p0 = observableSourceArr;
        this.f72179q0 = iterable;
        this.f72180r0 = function;
        this.f72181s0 = i10;
        this.f72182t0 = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        int length;
        ObservableSource<? extends T>[] observableSourceArr = this.f72178p0;
        if (observableSourceArr == null) {
            observableSourceArr = new ObservableSource[8];
            length = 0;
            for (ObservableSource<? extends T> observableSource : this.f72179q0) {
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
        b bVar = new b(length, this.f72181s0, observer, this.f72180r0, this.f72182t0);
        a<T, R>[] aVarArr = bVar.f72187r0;
        int length2 = aVarArr.length;
        bVar.f72185p0.onSubscribe(bVar);
        for (int i10 = 0; i10 < length2 && !bVar.f72191w0 && !bVar.v0; i10++) {
            observableSourceArr[i10].subscribe(aVarArr[i10]);
        }
    }
}
