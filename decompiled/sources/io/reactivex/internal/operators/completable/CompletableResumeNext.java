package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableResumeNext extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f70107p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends CompletableSource> f70108q0;

    public static final class a extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70109p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Throwable, ? extends CompletableSource> f70110q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f70111r0;

        public a(CompletableObserver completableObserver, Function<? super Throwable, ? extends CompletableSource> function) {
            this.f70109p0 = completableObserver;
            this.f70110q0 = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f70109p0.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            boolean z10 = this.f70111r0;
            CompletableObserver completableObserver = this.f70109p0;
            if (z10) {
                completableObserver.onError(th2);
                return;
            }
            this.f70111r0 = true;
            try {
                ((CompletableSource) ObjectHelper.requireNonNull(this.f70110q0.apply(th2), "The errorMapper returned a null CompletableSource")).subscribe(this);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                completableObserver.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }
    }

    public CompletableResumeNext(CompletableSource completableSource, Function<? super Throwable, ? extends CompletableSource> function) {
        this.f70107p0 = completableSource;
        this.f70108q0 = function;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        a aVar = new a(completableObserver, this.f70108q0);
        completableObserver.onSubscribe(aVar);
        this.f70107p0.subscribe(aVar);
    }
}
