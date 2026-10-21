package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeSubject<T> extends Maybe<T> implements MaybeObserver<T> {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final a[] f78393t0 = new a[0];

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final a[] f78394u0 = new a[0];

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public T f78397r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Throwable f78398s0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicBoolean f78396q0 = new AtomicBoolean();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f78395p0 = new AtomicReference<>(f78393t0);

    public static final class a<T> extends AtomicReference<MaybeSubject<T>> implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f78399p0;

        public a(MaybeObserver<? super T> maybeObserver, MaybeSubject<T> maybeSubject) {
            this.f78399p0 = maybeObserver;
            lazySet(maybeSubject);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            MaybeSubject<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.a(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return get() == null;
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> MaybeSubject<T> create() {
        return new MaybeSubject<>();
    }

    public final void a(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f78395p0;
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
                } else if (aVarArr2[i10] == aVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                aVarArr = f78393t0;
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

    @Nullable
    public Throwable getThrowable() {
        if (this.f78395p0.get() == f78394u0) {
            return this.f78398s0;
        }
        return null;
    }

    @Nullable
    public T getValue() {
        if (this.f78395p0.get() == f78394u0) {
            return this.f78397r0;
        }
        return null;
    }

    public boolean hasComplete() {
        return this.f78395p0.get() == f78394u0 && this.f78397r0 == null && this.f78398s0 == null;
    }

    public boolean hasObservers() {
        return this.f78395p0.get().length != 0;
    }

    public boolean hasThrowable() {
        return this.f78395p0.get() == f78394u0 && this.f78398s0 != null;
    }

    public boolean hasValue() {
        return this.f78395p0.get() == f78394u0 && this.f78397r0 != null;
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onComplete() {
        if (this.f78396q0.compareAndSet(false, true)) {
            for (a<T> aVar : this.f78395p0.getAndSet(f78394u0)) {
                aVar.f78399p0.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onError(Throwable th2) {
        ExceptionHelper.nullCheck(th2, "onError called with a null Throwable.");
        if (!this.f78396q0.compareAndSet(false, true)) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f78398s0 = th2;
        for (a<T> aVar : this.f78395p0.getAndSet(f78394u0)) {
            aVar.f78399p0.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        if (this.f78395p0.get() == f78394u0) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public void onSuccess(T t10) {
        ExceptionHelper.nullCheck(t10, "onSuccess called with a null value.");
        if (this.f78396q0.compareAndSet(false, true)) {
            this.f78397r0 = t10;
            for (a<T> aVar : this.f78395p0.getAndSet(f78394u0)) {
                aVar.f78399p0.onSuccess(t10);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        a<T> aVar = new a<>(maybeObserver, this);
        maybeObserver.onSubscribe(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f78395p0;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == f78394u0) {
                Throwable th2 = this.f78398s0;
                if (th2 != null) {
                    maybeObserver.onError(th2);
                    return;
                }
                T t10 = this.f78397r0;
                if (t10 == null) {
                    maybeObserver.onComplete();
                    return;
                } else {
                    maybeObserver.onSuccess(t10);
                    return;
                }
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            do {
                if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (aVar.isDisposed()) {
                        a(aVar);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == aVarArr);
        }
    }
}
