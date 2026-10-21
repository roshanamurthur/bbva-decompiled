package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeAmb<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<? extends T>[] f75740p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Iterable<? extends MaybeSource<? extends T>> f75741q0;

    public static final class a<T> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f75742p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicBoolean f75743q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final CompositeDisposable f75744r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f75745s0;

        public a(MaybeObserver<? super T> maybeObserver, CompositeDisposable compositeDisposable, AtomicBoolean atomicBoolean) {
            this.f75742p0 = maybeObserver;
            this.f75744r0 = compositeDisposable;
            this.f75743q0 = atomicBoolean;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (this.f75743q0.compareAndSet(false, true)) {
                Disposable disposable = this.f75745s0;
                CompositeDisposable compositeDisposable = this.f75744r0;
                compositeDisposable.delete(disposable);
                compositeDisposable.dispose();
                this.f75742p0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            if (!this.f75743q0.compareAndSet(false, true)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            Disposable disposable = this.f75745s0;
            CompositeDisposable compositeDisposable = this.f75744r0;
            compositeDisposable.delete(disposable);
            compositeDisposable.dispose();
            this.f75742p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f75745s0 = disposable;
            this.f75744r0.add(disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            if (this.f75743q0.compareAndSet(false, true)) {
                Disposable disposable = this.f75745s0;
                CompositeDisposable compositeDisposable = this.f75744r0;
                compositeDisposable.delete(disposable);
                compositeDisposable.dispose();
                this.f75742p0.onSuccess(t10);
            }
        }
    }

    public MaybeAmb(MaybeSource<? extends T>[] maybeSourceArr, Iterable<? extends MaybeSource<? extends T>> iterable) {
        this.f75740p0 = maybeSourceArr;
        this.f75741q0 = iterable;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        int length;
        MaybeSource<? extends T>[] maybeSourceArr = this.f75740p0;
        if (maybeSourceArr == null) {
            maybeSourceArr = new MaybeSource[8];
            try {
                length = 0;
                for (MaybeSource<? extends T> maybeSource : this.f75741q0) {
                    if (maybeSource == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), maybeObserver);
                        return;
                    }
                    if (length == maybeSourceArr.length) {
                        MaybeSource<? extends T>[] maybeSourceArr2 = new MaybeSource[(length >> 2) + length];
                        System.arraycopy(maybeSourceArr, 0, maybeSourceArr2, 0, length);
                        maybeSourceArr = maybeSourceArr2;
                    }
                    int i10 = length + 1;
                    maybeSourceArr[length] = maybeSource;
                    length = i10;
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptyDisposable.error(th2, maybeObserver);
                return;
            }
        } else {
            length = maybeSourceArr.length;
        }
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        maybeObserver.onSubscribe(compositeDisposable);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        for (int i11 = 0; i11 < length; i11++) {
            MaybeSource<? extends T> maybeSource2 = maybeSourceArr[i11];
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (maybeSource2 == null) {
                compositeDisposable.dispose();
                NullPointerException nullPointerException = new NullPointerException("One of the MaybeSources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    maybeObserver.onError(nullPointerException);
                    return;
                } else {
                    RxJavaPlugins.onError(nullPointerException);
                    return;
                }
            }
            maybeSource2.subscribe(new a(maybeObserver, compositeDisposable, atomicBoolean));
        }
        if (length == 0) {
            maybeObserver.onComplete();
        }
    }
}
