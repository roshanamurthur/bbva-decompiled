package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableAmb extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource[] f69973p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Iterable<? extends CompletableSource> f69974q0;

    public static final class a implements CompletableObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicBoolean f69975p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final CompositeDisposable f69976q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final CompletableObserver f69977r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f69978s0;

        public a(CompletableObserver completableObserver, CompositeDisposable compositeDisposable, AtomicBoolean atomicBoolean) {
            this.f69975p0 = atomicBoolean;
            this.f69976q0 = compositeDisposable;
            this.f69977r0 = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            if (this.f69975p0.compareAndSet(false, true)) {
                Disposable disposable = this.f69978s0;
                CompositeDisposable compositeDisposable = this.f69976q0;
                compositeDisposable.delete(disposable);
                compositeDisposable.dispose();
                this.f69977r0.onComplete();
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            if (!this.f69975p0.compareAndSet(false, true)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            Disposable disposable = this.f69978s0;
            CompositeDisposable compositeDisposable = this.f69976q0;
            compositeDisposable.delete(disposable);
            compositeDisposable.dispose();
            this.f69977r0.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f69978s0 = disposable;
            this.f69976q0.add(disposable);
        }
    }

    public CompletableAmb(CompletableSource[] completableSourceArr, Iterable<? extends CompletableSource> iterable) {
        this.f69973p0 = completableSourceArr;
        this.f69974q0 = iterable;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        int length;
        CompletableSource[] completableSourceArr = this.f69973p0;
        if (completableSourceArr == null) {
            completableSourceArr = new CompletableSource[8];
            try {
                length = 0;
                for (CompletableSource completableSource : this.f69974q0) {
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
