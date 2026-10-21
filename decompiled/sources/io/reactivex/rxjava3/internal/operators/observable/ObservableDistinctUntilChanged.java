package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.observers.BasicFuseableObserver;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDistinctUntilChanged<T, K> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, K> f76598p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BiPredicate<? super K, ? super K> f76599q0;

    public static final class a<T, K> extends BasicFuseableObserver<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, K> f76600p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiPredicate<? super K, ? super K> f76601q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public K f76602r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f76603s0;

        public a(Observer<? super T> observer, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(observer);
            this.f76600p0 = function;
            this.f76601q0 = biPredicate;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext((Object) t10);
                return;
            }
            try {
                K kApply = this.f76600p0.apply(t10);
                if (this.f76603s0) {
                    boolean zTest = this.f76601q0.test(this.f76602r0, kApply);
                    this.f76602r0 = kApply;
                    if (zTest) {
                        return;
                    }
                } else {
                    this.f76603s0 = true;
                    this.f76602r0 = kApply;
                }
                this.downstream.onNext((Object) t10);
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Throwable {
            while (true) {
                T tPoll = this.f74180qd.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f76600p0.apply(tPoll);
                if (!this.f76603s0) {
                    this.f76603s0 = true;
                    this.f76602r0 = kApply;
                    return tPoll;
                }
                if (!this.f76601q0.test(this.f76602r0, kApply)) {
                    this.f76602r0 = kApply;
                    return tPoll;
                }
                this.f76602r0 = kApply;
            }
        }
    }

    public ObservableDistinctUntilChanged(ObservableSource<T> observableSource, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
        super(observableSource);
        this.f76598p0 = function;
        this.f76599q0 = biPredicate;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f76598p0, this.f76599q0));
    }
}
