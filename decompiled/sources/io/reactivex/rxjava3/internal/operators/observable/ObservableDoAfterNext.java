package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.observers.BasicFuseableObserver;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDoAfterNext<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Consumer<? super T> f76604p0;

    public static final class a<T> extends BasicFuseableObserver<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Consumer<? super T> f76605p0;

        public a(Observer<? super T> observer, Consumer<? super T> consumer) {
            super(observer);
            this.f76605p0 = consumer;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.downstream.onNext((Object) t10);
            if (this.sourceMode == 0) {
                try {
                    this.f76605p0.accept(t10);
                } catch (Throwable th2) {
                    fail(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Throwable {
            T tPoll = this.f74180qd.poll();
            if (tPoll != null) {
                this.f76605p0.accept(tPoll);
            }
            return tPoll;
        }
    }

    public ObservableDoAfterNext(ObservableSource<T> observableSource, Consumer<? super T> consumer) {
        super(observableSource);
        this.f76604p0 = consumer;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f76604p0));
    }
}
