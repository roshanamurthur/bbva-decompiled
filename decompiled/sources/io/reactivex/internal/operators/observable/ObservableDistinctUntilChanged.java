package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDistinctUntilChanged<T, K> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, K> f72317p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BiPredicate<? super K, ? super K> f72318q0;

    public static final class a<T, K> extends BasicFuseableObserver<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, K> f72319p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiPredicate<? super K, ? super K> f72320q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public K f72321r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f72322s0;

        public a(Observer<? super T> observer, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(observer);
            this.f72319p0 = function;
            this.f72320q0 = biPredicate;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext((Object) t10);
                return;
            }
            try {
                K kApply = this.f72319p0.apply(t10);
                if (this.f72322s0) {
                    boolean zTest = this.f72320q0.test(this.f72321r0, kApply);
                    this.f72321r0 = kApply;
                    if (zTest) {
                        return;
                    }
                } else {
                    this.f72322s0 = true;
                    this.f72321r0 = kApply;
                }
                this.downstream.onNext((Object) t10);
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Exception {
            while (true) {
                T tPoll = this.f69930qd.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f72319p0.apply(tPoll);
                if (!this.f72322s0) {
                    this.f72322s0 = true;
                    this.f72321r0 = kApply;
                    return tPoll;
                }
                if (!this.f72320q0.test(this.f72321r0, kApply)) {
                    this.f72321r0 = kApply;
                    return tPoll;
                }
                this.f72321r0 = kApply;
            }
        }
    }

    public ObservableDistinctUntilChanged(ObservableSource<T> observableSource, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
        super(observableSource);
        this.f72317p0 = function;
        this.f72318q0 = biPredicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f72317p0, this.f72318q0));
    }
}
