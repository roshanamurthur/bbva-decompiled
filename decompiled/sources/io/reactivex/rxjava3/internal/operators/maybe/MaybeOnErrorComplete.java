package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeOnErrorComplete<T> extends a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Predicate<? super Throwable> f75962p0;

    public static final class OnErrorCompleteMultiObserver<T> implements MaybeObserver<T>, SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f75963p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Predicate<? super Throwable> f75964q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f75965r0;

        public OnErrorCompleteMultiObserver(MaybeObserver<? super T> maybeObserver, Predicate<? super Throwable> predicate) {
            this.f75963p0 = maybeObserver;
            this.f75964q0 = predicate;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f75965r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f75965r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onComplete() {
            this.f75963p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onError(Throwable th2) {
            MaybeObserver<? super T> maybeObserver = this.f75963p0;
            try {
                if (this.f75964q0.test(th2)) {
                    maybeObserver.onComplete();
                } else {
                    maybeObserver.onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                maybeObserver.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f75965r0, disposable)) {
                this.f75965r0 = disposable;
                this.f75963p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public void onSuccess(T t10) {
            this.f75963p0.onSuccess(t10);
        }
    }

    public MaybeOnErrorComplete(MaybeSource<T> maybeSource, Predicate<? super Throwable> predicate) {
        super(maybeSource);
        this.f75962p0 = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new OnErrorCompleteMultiObserver(maybeObserver, this.f75962p0));
    }
}
