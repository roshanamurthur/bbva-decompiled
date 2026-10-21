package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.observers.BasicFuseableObserver;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFilter<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Predicate<? super T> f76650p0;

    public static final class a<T> extends BasicFuseableObserver<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Predicate<? super T> f76651p0;

        public a(Observer<? super T> observer, Predicate<? super T> predicate) {
            super(observer);
            this.f76651p0 = predicate;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                if (this.f76651p0.test(t10)) {
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
            do {
                tPoll = this.f74180qd.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f76651p0.test(tPoll));
            return tPoll;
        }
    }

    public ObservableFilter(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f76650p0 = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f76650p0));
    }
}
