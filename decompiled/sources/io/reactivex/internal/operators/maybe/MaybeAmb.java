package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeAmb<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<? extends T>[] f71506p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Iterable<? extends MaybeSource<? extends T>> f71507q0;

    public static final class a<T> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71508p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicBoolean f71509q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final CompositeDisposable f71510r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f71511s0;

        public a(MaybeObserver<? super T> maybeObserver, CompositeDisposable compositeDisposable, AtomicBoolean atomicBoolean) {
            this.f71508p0 = maybeObserver;
            this.f71510r0 = compositeDisposable;
            this.f71509q0 = atomicBoolean;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            if (this.f71509q0.compareAndSet(false, true)) {
                Disposable disposable = this.f71511s0;
                CompositeDisposable compositeDisposable = this.f71510r0;
                compositeDisposable.delete(disposable);
                compositeDisposable.dispose();
                this.f71508p0.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            if (!this.f71509q0.compareAndSet(false, true)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            Disposable disposable = this.f71511s0;
            CompositeDisposable compositeDisposable = this.f71510r0;
            compositeDisposable.delete(disposable);
            compositeDisposable.dispose();
            this.f71508p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            this.f71511s0 = disposable;
            this.f71510r0.add(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            if (this.f71509q0.compareAndSet(false, true)) {
                Disposable disposable = this.f71511s0;
                CompositeDisposable compositeDisposable = this.f71510r0;
                compositeDisposable.delete(disposable);
                compositeDisposable.dispose();
                this.f71508p0.onSuccess(t10);
            }
        }
    }

    public MaybeAmb(MaybeSource<? extends T>[] maybeSourceArr, Iterable<? extends MaybeSource<? extends T>> iterable) {
        this.f71506p0 = maybeSourceArr;
        this.f71507q0 = iterable;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        int length;
        MaybeSource<? extends T>[] maybeSourceArr = this.f71506p0;
        if (maybeSourceArr == null) {
            maybeSourceArr = new MaybeSource[8];
            try {
                length = 0;
                for (MaybeSource<? extends T> maybeSource : this.f71507q0) {
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
