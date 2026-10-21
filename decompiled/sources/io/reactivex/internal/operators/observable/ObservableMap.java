package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableMap<T, U> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends U> f72576p0;

    public static final class a<T, U> extends BasicFuseableObserver<T, U> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, ? extends U> f72577p0;

        public a(Observer<? super U> observer, Function<? super T, ? extends U> function) {
            super(observer);
            this.f72577p0 = function;
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
                this.downstream.onNext((Object) ObjectHelper.requireNonNull(this.f72577p0.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final U poll() throws Exception {
            T tPoll = this.f69930qd.poll();
            if (tPoll != null) {
                return (U) ObjectHelper.requireNonNull(this.f72577p0.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    public ObservableMap(ObservableSource<T> observableSource, Function<? super T, ? extends U> function) {
        super(observableSource);
        this.f72576p0 = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        this.source.subscribe(new a(observer, this.f72576p0));
    }
}
