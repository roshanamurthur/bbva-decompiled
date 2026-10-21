package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicFuseableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDistinct<T, K> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, K> f72313p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Callable<? extends Collection<? super K>> f72314q0;

    public static final class a<T, K> extends BasicFuseableObserver<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Collection<? super K> f72315p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, K> f72316q0;

        public a(Observer<? super T> observer, Function<? super T, K> function, Collection<? super K> collection) {
            super(observer);
            this.f72316q0 = function;
            this.f72315p0 = collection;
        }

        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f72315p0.clear();
            super.clear();
        }

        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.Observer
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.f72315p0.clear();
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            this.f72315p0.clear();
            this.downstream.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                if (this.f72315p0.add(ObjectHelper.requireNonNull(this.f72316q0.apply(t10), "The keySelector returned a null key"))) {
                    this.downstream.onNext((Object) t10);
                }
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Exception {
            T tPoll;
            do {
                tPoll = this.f69930qd.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f72315p0.add(ObjectHelper.requireNonNull(this.f72316q0.apply(tPoll), "The keySelector returned a null key")));
            return tPoll;
        }
    }

    public ObservableDistinct(ObservableSource<T> observableSource, Function<? super T, K> function, Callable<? extends Collection<? super K>> callable) {
        super(observableSource);
        this.f72313p0 = function;
        this.f72314q0 = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        try {
            this.source.subscribe(new a(observer, this.f72313p0, (Collection) ObjectHelper.requireNonNull(this.f72314q0.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }
}
