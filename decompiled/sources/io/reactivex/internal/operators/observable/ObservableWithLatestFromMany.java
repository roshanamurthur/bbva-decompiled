package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableWithLatestFromMany<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public final ObservableSource<?>[] f73171p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public final Iterable<? extends ObservableSource<?>> f73172q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NonNull
    public final Function<? super Object[], R> f73173r0;

    public final class a implements Function<T, R> {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // io.reactivex.functions.Function
        public final R apply(T t10) throws Exception {
            return (R) ObjectHelper.requireNonNull(ObservableWithLatestFromMany.this.f73173r0.apply(new Object[]{t10}), "The combiner returned a null value");
        }
    }

    public static final class b<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f73175p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Object[], R> f73176q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final c[] f73177r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReferenceArray<Object> f73178s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<Disposable> f73179t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicThrowable f73180u0;
        public volatile boolean v0;

        public b(Observer<? super R> observer, Function<? super Object[], R> function, int i10) {
            this.f73175p0 = observer;
            this.f73176q0 = function;
            c[] cVarArr = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11] = new c(this, i11);
            }
            this.f73177r0 = cVarArr;
            this.f73178s0 = new AtomicReferenceArray<>(i10);
            this.f73179t0 = new AtomicReference<>();
            this.f73180u0 = new AtomicThrowable();
        }

        public final void a(int i10) {
            int i11 = 0;
            while (true) {
                c[] cVarArr = this.f73177r0;
                if (i11 >= cVarArr.length) {
                    return;
                }
                if (i11 != i10) {
                    c cVar = cVarArr[i11];
                    cVar.getClass();
                    DisposableHelper.dispose(cVar);
                }
                i11++;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f73179t0);
            for (c cVar : this.f73177r0) {
                cVar.getClass();
                DisposableHelper.dispose(cVar);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f73179t0.get());
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            a(-1);
            HalfSerializer.onComplete(this.f73175p0, this, this.f73180u0);
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.v0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.v0 = true;
            a(-1);
            HalfSerializer.onError(this.f73175p0, th2, this, this.f73180u0);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.v0) {
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f73178s0;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            int i10 = 0;
            objArr[0] = t10;
            while (i10 < length) {
                Object obj = atomicReferenceArray.get(i10);
                if (obj == null) {
                    return;
                }
                i10++;
                objArr[i10] = obj;
            }
            try {
                HalfSerializer.onNext(this.f73175p0, ObjectHelper.requireNonNull(this.f73176q0.apply(objArr), "combiner returned a null value"), this, this.f73180u0);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f73179t0, disposable);
        }
    }

    public static final class c extends AtomicReference<Disposable> implements Observer<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<?, ?> f73181p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f73182q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f73183r0;

        public c(b<?, ?> bVar, int i10) {
            this.f73181p0 = bVar;
            this.f73182q0 = i10;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            b<?, ?> bVar = this.f73181p0;
            int i10 = this.f73182q0;
            if (this.f73183r0) {
                bVar.getClass();
                return;
            }
            bVar.v0 = true;
            bVar.a(i10);
            HalfSerializer.onComplete(bVar.f73175p0, bVar, bVar.f73180u0);
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            b<?, ?> bVar = this.f73181p0;
            int i10 = this.f73182q0;
            bVar.v0 = true;
            DisposableHelper.dispose(bVar.f73179t0);
            bVar.a(i10);
            HalfSerializer.onError(bVar.f73175p0, th2, bVar, bVar.f73180u0);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (!this.f73183r0) {
                this.f73183r0 = true;
            }
            this.f73181p0.f73178s0.set(this.f73182q0, obj);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public ObservableWithLatestFromMany(@NonNull ObservableSource<T> observableSource, @NonNull ObservableSource<?>[] observableSourceArr, @NonNull Function<? super Object[], R> function) {
        super(observableSource);
        this.f73171p0 = observableSourceArr;
        this.f73172q0 = null;
        this.f73173r0 = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        int length;
        ObservableSource<?>[] observableSourceArr = this.f73171p0;
        if (observableSourceArr == null) {
            observableSourceArr = new ObservableSource[8];
            try {
                length = 0;
                for (ObservableSource<?> observableSource : this.f73172q0) {
                    if (length == observableSourceArr.length) {
                        observableSourceArr = (ObservableSource[]) Arrays.copyOf(observableSourceArr, (length >> 1) + length);
                    }
                    int i10 = length + 1;
                    observableSourceArr[length] = observableSource;
                    length = i10;
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptyDisposable.error(th2, observer);
                return;
            }
        } else {
            length = observableSourceArr.length;
        }
        if (length == 0) {
            new ObservableMap(this.source, new a()).subscribeActual(observer);
            return;
        }
        b bVar = new b(observer, this.f73173r0, length);
        observer.onSubscribe(bVar);
        c[] cVarArr = bVar.f73177r0;
        AtomicReference<Disposable> atomicReference = bVar.f73179t0;
        for (int i11 = 0; i11 < length && !DisposableHelper.isDisposed(atomicReference.get()) && !bVar.v0; i11++) {
            observableSourceArr[i11].subscribe(cVarArr[i11]);
        }
        this.source.subscribe(bVar);
    }

    public ObservableWithLatestFromMany(@NonNull ObservableSource<T> observableSource, @NonNull Iterable<? extends ObservableSource<?>> iterable, @NonNull Function<? super Object[], R> function) {
        super(observableSource);
        this.f73171p0 = null;
        this.f73172q0 = iterable;
        this.f73173r0 = function;
    }
}
