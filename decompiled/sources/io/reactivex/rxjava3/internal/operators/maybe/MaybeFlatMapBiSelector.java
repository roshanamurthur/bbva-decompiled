package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFlatMapBiSelector<T, U, R> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends MaybeSource<? extends U>> f75865p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BiFunction<? super T, ? super U, ? extends R> f75866q0;

    public static final class a<T, U, R> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, ? extends MaybeSource<? extends U>> f75867p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final C0381a<T, U, R> f75868q0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapBiSelector$a$a, reason: collision with other inner class name */
        public static final class C0381a<T, U, R> extends AtomicReference<Disposable> implements MaybeObserver<U> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final MaybeObserver<? super R> f75869p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final BiFunction<? super T, ? super U, ? extends R> f75870q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public T f75871r0;

            public C0381a(MaybeObserver<? super R> maybeObserver, BiFunction<? super T, ? super U, ? extends R> biFunction) {
                this.f75869p0 = maybeObserver;
                this.f75870q0 = biFunction;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                this.f75869p0.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                this.f75869p0.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(U u2) {
                MaybeObserver<? super R> maybeObserver = this.f75869p0;
                T t10 = this.f75871r0;
                this.f75871r0 = null;
                try {
                    R rApply = this.f75870q0.apply(t10, u2);
                    Objects.requireNonNull(rApply, "The resultSelector returned a null value");
                    maybeObserver.onSuccess(rApply);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    maybeObserver.onError(th2);
                }
            }
        }

        public a(MaybeObserver<? super R> maybeObserver, Function<? super T, ? extends MaybeSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
            this.f75868q0 = new C0381a<>(maybeObserver, biFunction);
            this.f75867p0 = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f75868q0);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f75868q0.get());
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f75868q0.f75869p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f75868q0.f75869p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            C0381a<T, U, R> c0381a = this.f75868q0;
            if (DisposableHelper.setOnce(c0381a, disposable)) {
                c0381a.f75869p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            C0381a<T, U, R> c0381a = this.f75868q0;
            try {
                MaybeSource<? extends U> maybeSourceApply = this.f75867p0.apply(t10);
                Objects.requireNonNull(maybeSourceApply, "The mapper returned a null MaybeSource");
                MaybeSource<? extends U> maybeSource = maybeSourceApply;
                if (DisposableHelper.replace(c0381a, null)) {
                    c0381a.f75871r0 = t10;
                    maybeSource.subscribe(c0381a);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                c0381a.f75869p0.onError(th2);
            }
        }
    }

    public MaybeFlatMapBiSelector(MaybeSource<T> maybeSource, Function<? super T, ? extends MaybeSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        super(maybeSource);
        this.f75865p0 = function;
        this.f75866q0 = biFunction;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f75865p0, this.f75866q0));
    }
}
