package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableUsing<R> extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Supplier<R> f74411p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super R, ? extends CompletableSource> f74412q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Consumer<? super R> f74413r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f74414s0;

    public static final class a<R> extends AtomicReference<Object> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74415p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super R> f74416q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f74417r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f74418s0;

        public a(CompletableObserver completableObserver, R r3, Consumer<? super R> consumer, boolean z10) {
            super(r3);
            this.f74415p0 = completableObserver;
            this.f74416q0 = consumer;
            this.f74417r0 = z10;
        }

        public final void a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f74416q0.accept(andSet);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f74417r0) {
                a();
                this.f74418s0.dispose();
                this.f74418s0 = DisposableHelper.DISPOSED;
            } else {
                this.f74418s0.dispose();
                this.f74418s0 = DisposableHelper.DISPOSED;
                a();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74418s0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f74418s0 = DisposableHelper.DISPOSED;
            CompletableObserver completableObserver = this.f74415p0;
            boolean z10 = this.f74417r0;
            if (z10) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f74416q0.accept(andSet);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    completableObserver.onError(th2);
                    return;
                }
            }
            completableObserver.onComplete();
            if (z10) {
                return;
            }
            a();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f74418s0 = DisposableHelper.DISPOSED;
            boolean z10 = this.f74417r0;
            if (z10) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f74416q0.accept(andSet);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    th2 = new CompositeException(th2, th3);
                }
            }
            this.f74415p0.onError(th2);
            if (z10) {
                return;
            }
            a();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f74418s0, disposable)) {
                this.f74418s0 = disposable;
                this.f74415p0.onSubscribe(this);
            }
        }
    }

    public CompletableUsing(Supplier<R> supplier, Function<? super R, ? extends CompletableSource> function, Consumer<? super R> consumer, boolean z10) {
        this.f74411p0 = supplier;
        this.f74412q0 = function;
        this.f74413r0 = consumer;
        this.f74414s0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        boolean z10 = this.f74414s0;
        Consumer<? super R> consumer = this.f74413r0;
        try {
            R r3 = this.f74411p0.get();
            try {
                CompletableSource completableSourceApply = this.f74412q0.apply(r3);
                Objects.requireNonNull(completableSourceApply, "The completableFunction returned a null CompletableSource");
                completableSourceApply.subscribe(new a(completableObserver, r3, consumer, z10));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                if (z10) {
                    try {
                        consumer.accept(r3);
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        EmptyDisposable.error(new CompositeException(th2, th3), completableObserver);
                        return;
                    }
                }
                EmptyDisposable.error(th2, completableObserver);
                if (z10) {
                    return;
                }
                try {
                    consumer.accept(r3);
                } catch (Throwable th4) {
                    Exceptions.throwIfFatal(th4);
                    RxJavaPlugins.onError(th4);
                }
            }
        } catch (Throwable th5) {
            Exceptions.throwIfFatal(th5);
            EmptyDisposable.error(th5, completableObserver);
        }
    }
}
