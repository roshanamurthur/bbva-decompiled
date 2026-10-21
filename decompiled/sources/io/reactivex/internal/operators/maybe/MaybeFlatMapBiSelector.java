package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFlatMapBiSelector<T, U, R> extends io.reactivex.internal.operators.maybe.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends MaybeSource<? extends U>> f71620p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BiFunction<? super T, ? super U, ? extends R> f71621q0;

    public static final class a<T, U, R> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, ? extends MaybeSource<? extends U>> f71622p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final C0317a<T, U, R> f71623q0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector$a$a, reason: collision with other inner class name */
        public static final class C0317a<T, U, R> extends AtomicReference<Disposable> implements MaybeObserver<U> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final MaybeObserver<? super R> f71624p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final BiFunction<? super T, ? super U, ? extends R> f71625q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public T f71626r0;

            public C0317a(MaybeObserver<? super R> maybeObserver, BiFunction<? super T, ? super U, ? extends R> biFunction) {
                this.f71624p0 = maybeObserver;
                this.f71625q0 = biFunction;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                this.f71624p0.onComplete();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th2) {
                this.f71624p0.onError(th2);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(U u2) {
                MaybeObserver<? super R> maybeObserver = this.f71624p0;
                T t10 = this.f71626r0;
                this.f71626r0 = null;
                try {
                    maybeObserver.onSuccess((Object) ObjectHelper.requireNonNull(this.f71625q0.apply(t10, u2), "The resultSelector returned a null value"));
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    maybeObserver.onError(th2);
                }
            }
        }

        public a(MaybeObserver<? super R> maybeObserver, Function<? super T, ? extends MaybeSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
            this.f71623q0 = new C0317a<>(maybeObserver, biFunction);
            this.f71622p0 = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f71623q0);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f71623q0.get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71623q0.f71624p0.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71623q0.f71624p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            C0317a<T, U, R> c0317a = this.f71623q0;
            if (DisposableHelper.setOnce(c0317a, disposable)) {
                c0317a.f71624p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            C0317a<T, U, R> c0317a = this.f71623q0;
            try {
                MaybeSource maybeSource = (MaybeSource) ObjectHelper.requireNonNull(this.f71622p0.apply(t10), "The mapper returned a null MaybeSource");
                if (DisposableHelper.replace(c0317a, null)) {
                    c0317a.f71626r0 = t10;
                    maybeSource.subscribe(c0317a);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                c0317a.f71624p0.onError(th2);
            }
        }
    }

    public MaybeFlatMapBiSelector(MaybeSource<T> maybeSource, Function<? super T, ? extends MaybeSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        super(maybeSource);
        this.f71620p0 = function;
        this.f71621q0 = biFunction;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f71620p0, this.f71621q0));
    }
}
