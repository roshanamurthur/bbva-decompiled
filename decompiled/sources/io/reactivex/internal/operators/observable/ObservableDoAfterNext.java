package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDoAfterNext<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Consumer<? super T> f72323p0;

    public static final class a<T> extends BasicFuseableObserver<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Consumer<? super T> f72324p0;

        public a(Observer<? super T> observer, Consumer<? super T> consumer) {
            super(observer);
            this.f72324p0 = consumer;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.downstream.onNext((Object) t10);
            if (this.sourceMode == 0) {
                try {
                    this.f72324p0.accept(t10);
                } catch (Throwable th2) {
                    fail(th2);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Exception {
            T tPoll = this.f69930qd.poll();
            if (tPoll != null) {
                this.f72324p0.accept(tPoll);
            }
            return tPoll;
        }
    }

    public ObservableDoAfterNext(ObservableSource<T> observableSource, Consumer<? super T> consumer) {
        super(observableSource);
        this.f72323p0 = consumer;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f72323p0));
    }
}
