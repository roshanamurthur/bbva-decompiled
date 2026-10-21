package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableAmb extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource[] f74230p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Iterable<? extends CompletableSource> f74231q0;

    public static final class a implements CompletableObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicBoolean f74232p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final CompositeDisposable f74233q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final CompletableObserver f74234r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f74235s0;

        public a(CompletableObserver completableObserver, CompositeDisposable compositeDisposable, AtomicBoolean atomicBoolean) {
            this.f74232p0 = atomicBoolean;
            this.f74233q0 = compositeDisposable;
            this.f74234r0 = completableObserver;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (this.f74232p0.compareAndSet(false, true)) {
                Disposable disposable = this.f74235s0;
                CompositeDisposable compositeDisposable = this.f74233q0;
                compositeDisposable.delete(disposable);
                compositeDisposable.dispose();
                this.f74234r0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            if (!this.f74232p0.compareAndSet(false, true)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            Disposable disposable = this.f74235s0;
            CompositeDisposable compositeDisposable = this.f74233q0;
            compositeDisposable.delete(disposable);
            compositeDisposable.dispose();
            this.f74234r0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f74235s0 = disposable;
            this.f74233q0.add(disposable);
        }
    }

    public CompletableAmb(CompletableSource[] completableSourceArr, Iterable<? extends CompletableSource> iterable) {
        this.f74230p0 = completableSourceArr;
        this.f74231q0 = iterable;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        int length;
        CompletableSource[] completableSourceArr = this.f74230p0;
        if (completableSourceArr == null) {
            completableSourceArr = new CompletableSource[8];
            try {
                length = 0;
                for (CompletableSource completableSource : this.f74231q0) {
                    if (completableSource == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), completableObserver);
                        return;
                    }
                    if (length == completableSourceArr.length) {
                        CompletableSource[] completableSourceArr2 = new CompletableSource[(length >> 2) + length];
                        System.arraycopy(completableSourceArr, 0, completableSourceArr2, 0, length);
                        completableSourceArr = completableSourceArr2;
                    }
                    int i10 = length + 1;
                    completableSourceArr[length] = completableSource;
                    length = i10;
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptyDisposable.error(th2, completableObserver);
                return;
            }
        } else {
            length = completableSourceArr.length;
        }
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        for (int i11 = 0; i11 < length; i11++) {
            CompletableSource completableSource2 = completableSourceArr[i11];
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (completableSource2 == null) {
                Throwable nullPointerException = new NullPointerException("One of the sources is null");
                if (!atomicBoolean.compareAndSet(false, true)) {
                    RxJavaPlugins.onError(nullPointerException);
                    return;
                } else {
                    compositeDisposable.dispose();
                    completableObserver.onError(nullPointerException);
                    return;
                }
            }
            completableSource2.subscribe(new a(completableObserver, compositeDisposable, atomicBoolean));
        }
        if (length == 0) {
            completableObserver.onComplete();
        }
    }
}
