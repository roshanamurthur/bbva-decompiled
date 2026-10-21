package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableResumeNext extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f74371p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends CompletableSource> f74372q0;

    public static final class a extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74373p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Throwable, ? extends CompletableSource> f74374q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f74375r0;

        public a(CompletableObserver completableObserver, Function<? super Throwable, ? extends CompletableSource> function) {
            this.f74373p0 = completableObserver;
            this.f74374q0 = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f74373p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            boolean z10 = this.f74375r0;
            CompletableObserver completableObserver = this.f74373p0;
            if (z10) {
                completableObserver.onError(th2);
                return;
            }
            this.f74375r0 = true;
            try {
                CompletableSource completableSourceApply = this.f74374q0.apply(th2);
                Objects.requireNonNull(completableSourceApply, "The errorMapper returned a null CompletableSource");
                completableSourceApply.subscribe(this);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                completableObserver.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }
    }

    public CompletableResumeNext(CompletableSource completableSource, Function<? super Throwable, ? extends CompletableSource> function) {
        this.f74371p0 = completableSource;
        this.f74372q0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        a aVar = new a(completableObserver, this.f74372q0);
        completableObserver.onSubscribe(aVar);
        this.f74371p0.subscribe(aVar);
    }
}
