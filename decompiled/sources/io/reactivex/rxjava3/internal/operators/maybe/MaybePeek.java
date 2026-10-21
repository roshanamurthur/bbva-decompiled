package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybePeek<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Consumer<? super Disposable> f75975p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super T> f75976q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Consumer<? super Throwable> f75977r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Action f75978s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Action f75979t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Action f75980u0;

    public static final class a<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f75981p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final MaybePeek<T> f75982q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f75983r0;

        public a(MaybeObserver<? super T> maybeObserver, MaybePeek<T> maybePeek) {
            this.f75981p0 = maybeObserver;
            this.f75982q0 = maybePeek;
        }

        public final void a() {
            try {
                this.f75982q0.f75979t0.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }

        public final void b(Throwable th2) {
            try {
                this.f75982q0.f75977r0.accept(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f75983r0 = DisposableHelper.DISPOSED;
            this.f75981p0.onError(th2);
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            try {
                this.f75982q0.f75980u0.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f75983r0.dispose();
            this.f75983r0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75983r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            Disposable disposable = this.f75983r0;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                return;
            }
            try {
                this.f75982q0.f75978s0.run();
                this.f75983r0 = disposableHelper;
                this.f75981p0.onComplete();
                a();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                b(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            if (this.f75983r0 == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(th2);
            } else {
                b(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            MaybeObserver<? super T> maybeObserver = this.f75981p0;
            if (DisposableHelper.validate(this.f75983r0, disposable)) {
                try {
                    this.f75982q0.f75975p0.accept(disposable);
                    this.f75983r0 = disposable;
                    maybeObserver.onSubscribe(this);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    disposable.dispose();
                    this.f75983r0 = DisposableHelper.DISPOSED;
                    EmptyDisposable.error(th2, maybeObserver);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            Disposable disposable = this.f75983r0;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                return;
            }
            try {
                this.f75982q0.f75976q0.accept(t10);
                this.f75983r0 = disposableHelper;
                this.f75981p0.onSuccess(t10);
                a();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                b(th2);
            }
        }
    }

    public MaybePeek(MaybeSource<T> maybeSource, Consumer<? super Disposable> consumer, Consumer<? super T> consumer2, Consumer<? super Throwable> consumer3, Action action, Action action2, Action action3) {
        super(maybeSource);
        this.f75975p0 = consumer;
        this.f75976q0 = consumer2;
        this.f75977r0 = consumer3;
        this.f75978s0 = action;
        this.f75979t0 = action2;
        this.f75980u0 = action3;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this));
    }
}
