package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservablePublish<T> extends ConnectableObservable<T> implements HasUpstreamObservableSource<T>, ObservablePublishClassic<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f72640p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<b<T>> f72641q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ObservableSource<T> f72642r0;

    public static final class a<T> extends AtomicReference<Object> implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72643p0;

        public a(Observer<? super T> observer) {
            this.f72643p0 = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            Object andSet = getAndSet(this);
            if (andSet == null || andSet == this) {
                return;
            }
            ((b) andSet).a(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == this;
        }
    }

    public static final class b<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final a[] f72644t0 = new a[0];

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final a[] f72645u0 = new a[0];

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicReference<b<T>> f72646p0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReference<Disposable> f72649s0 = new AtomicReference<>();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<a<T>[]> f72647q0 = new AtomicReference<>(f72644t0);

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicBoolean f72648r0 = new AtomicBoolean();

        public b(AtomicReference<b<T>> atomicReference) {
            this.f72646p0 = atomicReference;
        }

        public final void a(a<T> aVar) {
            a<T>[] aVarArr;
            while (true) {
                AtomicReference<a<T>[]> atomicReference = this.f72647q0;
                a<T>[] aVarArr2 = atomicReference.get();
                int length = aVarArr2.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (aVarArr2[i10].equals(aVar)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr = f72644t0;
                } else {
                    a<T>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr2, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr2, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr = aVarArr3;
                }
                while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                    if (atomicReference.get() != aVarArr2) {
                    }
                }
                return;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            AtomicReference<b<T>> atomicReference;
            AtomicReference<a<T>[]> atomicReference2 = this.f72647q0;
            a<T>[] aVarArr = f72645u0;
            if (atomicReference2.getAndSet(aVarArr) != aVarArr) {
                do {
                    atomicReference = this.f72646p0;
                    if (atomicReference.compareAndSet(this, null)) {
                        break;
                    }
                } while (atomicReference.get() == this);
                DisposableHelper.dispose(this.f72649s0);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72647q0.get() == f72645u0;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            AtomicReference<b<T>> atomicReference;
            do {
                atomicReference = this.f72646p0;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            for (a<T> aVar : this.f72647q0.getAndSet(f72645u0)) {
                aVar.f72643p0.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            AtomicReference<b<T>> atomicReference;
            do {
                atomicReference = this.f72646p0;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            a<T>[] andSet = this.f72647q0.getAndSet(f72645u0);
            if (andSet.length == 0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            for (a<T> aVar : andSet) {
                aVar.f72643p0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            for (a<T> aVar : this.f72647q0.get()) {
                aVar.f72643p0.onNext(t10);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f72649s0, disposable);
        }
    }

    public static final class c<T> implements ObservableSource<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicReference<b<T>> f72650p0;

        public c(AtomicReference<b<T>> atomicReference) {
            this.f72650p0 = atomicReference;
        }

        @Override // io.reactivex.ObservableSource
        public final void subscribe(Observer<? super T> observer) {
            b<T> bVar;
            a<T> aVar = new a<>(observer);
            observer.onSubscribe(aVar);
            loop0: while (true) {
                AtomicReference<b<T>> atomicReference = this.f72650p0;
                b<T> bVar2 = atomicReference.get();
                if (bVar2 == null || bVar2.isDisposed()) {
                    b<T> bVar3 = new b<>(atomicReference);
                    while (true) {
                        if (atomicReference.compareAndSet(bVar2, bVar3)) {
                            bVar = bVar3;
                        } else if (atomicReference.get() != bVar2) {
                        }
                    }
                } else {
                    bVar = bVar2;
                }
                while (true) {
                    AtomicReference<a<T>[]> atomicReference2 = bVar.f72647q0;
                    a<T>[] aVarArr = atomicReference2.get();
                    if (aVarArr == b.f72645u0) {
                        break;
                    }
                    int length = aVarArr.length;
                    a<T>[] aVarArr2 = new a[length + 1];
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    aVarArr2[length] = aVar;
                    do {
                        if (atomicReference2.compareAndSet(aVarArr, aVarArr2)) {
                            break loop0;
                        }
                    } while (atomicReference2.get() == aVarArr);
                }
            }
            if (aVar.compareAndSet(null, bVar)) {
                return;
            }
            bVar.a(aVar);
        }
    }

    public ObservablePublish(c cVar, ObservableSource observableSource, AtomicReference atomicReference) {
        this.f72642r0 = cVar;
        this.f72640p0 = observableSource;
        this.f72641q0 = atomicReference;
    }

    public static <T> ConnectableObservable<T> create(ObservableSource<T> observableSource) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((ConnectableObservable) new ObservablePublish(new c(atomicReference), observableSource, atomicReference));
    }

    @Override // io.reactivex.observables.ConnectableObservable
    public void connect(Consumer<? super Disposable> consumer) {
        b<T> bVar;
        loop0: while (true) {
            AtomicReference<b<T>> atomicReference = this.f72641q0;
            bVar = atomicReference.get();
            if (bVar != null && !bVar.isDisposed()) {
                break;
            }
            b<T> bVar2 = new b<>(atomicReference);
            do {
                if (atomicReference.compareAndSet(bVar, bVar2)) {
                    bVar = bVar2;
                    break loop0;
                }
            } while (atomicReference.get() == bVar);
        }
        AtomicBoolean atomicBoolean = bVar.f72648r0;
        boolean z10 = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            consumer.accept(bVar);
            if (z10) {
                this.f72640p0.subscribe(bVar);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @Override // io.reactivex.internal.operators.observable.ObservablePublishClassic
    public ObservableSource<T> publishSource() {
        return this.f72640p0;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamObservableSource
    public ObservableSource<T> source() {
        return this.f72640p0;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f72642r0.subscribe(observer);
    }
}
