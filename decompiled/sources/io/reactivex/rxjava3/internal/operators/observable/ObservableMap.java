package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.observers.BasicFuseableObserver;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableMap<T, U> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends U> f76862p0;

    public static final class a<T, U> extends BasicFuseableObserver<T, U> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, ? extends U> f76863p0;

        public a(Observer<? super U> observer, Function<? super T, ? extends U> function) {
            super(observer);
            this.f76863p0 = function;
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
                U uApply = this.f76863p0.apply(t10);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                this.downstream.onNext((Object) uApply);
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final U poll() throws Throwable {
            T tPoll = this.f74180qd.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f76863p0.apply(tPoll);
            Objects.requireNonNull(uApply, "The mapper function returned a null value.");
            return uApply;
        }
    }

    public ObservableMap(ObservableSource<T> observableSource, Function<? super T, ? extends U> function) {
        super(observableSource);
        this.f76862p0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super U> observer) {
        this.source.subscribe(new a(observer, this.f76862p0));
    }
}
