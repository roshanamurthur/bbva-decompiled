package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.observers.BasicFuseableObserver;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDistinct<T, K> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, K> f76594p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Supplier<? extends Collection<? super K>> f76595q0;

    public static final class a<T, K> extends BasicFuseableObserver<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Collection<? super K> f76596p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, K> f76597q0;

        public a(Observer<? super T> observer, Function<? super T, K> function, Collection<? super K> collection) {
            super(observer);
            this.f76597q0 = function;
            this.f76596p0 = collection;
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicFuseableObserver, io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f76596p0.clear();
            super.clear();
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicFuseableObserver, io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.f76596p0.clear();
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicFuseableObserver, io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            this.f76596p0.clear();
            this.downstream.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                K kApply = this.f76597q0.apply(t10);
                Objects.requireNonNull(kApply, "The keySelector returned a null key");
                if (this.f76596p0.add(kApply)) {
                    this.downstream.onNext((Object) t10);
                }
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Throwable {
            T tPoll;
            K kApply;
            do {
                tPoll = this.f74180qd.poll();
                if (tPoll == null) {
                    break;
                }
                kApply = this.f76597q0.apply(tPoll);
                Objects.requireNonNull(kApply, "The keySelector returned a null key");
            } while (!this.f76596p0.add(kApply));
            return tPoll;
        }
    }

    public ObservableDistinct(ObservableSource<T> observableSource, Function<? super T, K> function, Supplier<? extends Collection<? super K>> supplier) {
        super(observableSource);
        this.f76594p0 = function;
        this.f76595q0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        try {
            this.source.subscribe(new a(observer, this.f76594p0, (Collection) ExceptionHelper.nullCheck(this.f76595q0.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }
}
