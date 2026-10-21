package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybePeek<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Consumer<? super Disposable> f71737p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super T> f71738q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Consumer<? super Throwable> f71739r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Action f71740s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Action f71741t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Action f71742u0;

    public static final class a<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71743p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final MaybePeek<T> f71744q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f71745r0;

        public a(MaybeObserver<? super T> maybeObserver, MaybePeek<T> maybePeek) {
            this.f71743p0 = maybeObserver;
            this.f71744q0 = maybePeek;
        }

        public final void a() {
            try {
                this.f71744q0.f71741t0.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }

        public final void b(Throwable th2) {
            try {
                this.f71744q0.f71739r0.accept(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f71745r0 = DisposableHelper.DISPOSED;
            this.f71743p0.onError(th2);
            a();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            try {
                this.f71744q0.f71742u0.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f71745r0.dispose();
            this.f71745r0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71745r0.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            Disposable disposable = this.f71745r0;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                return;
            }
            try {
                this.f71744q0.f71740s0.run();
                this.f71745r0 = disposableHelper;
                this.f71743p0.onComplete();
                a();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                b(th2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            if (this.f71745r0 == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(th2);
            } else {
                b(th2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            MaybeObserver<? super T> maybeObserver = this.f71743p0;
            if (DisposableHelper.validate(this.f71745r0, disposable)) {
                try {
                    this.f71744q0.f71737p0.accept(disposable);
                    this.f71745r0 = disposable;
                    maybeObserver.onSubscribe(this);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    disposable.dispose();
                    this.f71745r0 = DisposableHelper.DISPOSED;
                    EmptyDisposable.error(th2, maybeObserver);
                }
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            Disposable disposable = this.f71745r0;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                return;
            }
            try {
                this.f71744q0.f71738q0.accept(t10);
                this.f71745r0 = disposableHelper;
                this.f71743p0.onSuccess(t10);
                a();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                b(th2);
            }
        }
    }

    public MaybePeek(MaybeSource<T> maybeSource, Consumer<? super Disposable> consumer, Consumer<? super T> consumer2, Consumer<? super Throwable> consumer3, Action action, Action action2, Action action3) {
        super(maybeSource);
        this.f71737p0 = consumer;
        this.f71738q0 = consumer2;
        this.f71739r0 = consumer3;
        this.f71740s0 = action;
        this.f71741t0 = action2;
        this.f71742u0 = action3;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this));
    }
}
