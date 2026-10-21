package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.observers.BasicFuseableObserver;
import java.util.Objects;
import java.util.Optional;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableMapOptional<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observable<T> f74121p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, Optional<? extends R>> f74122q0;

    public static final class a<T, R> extends BasicFuseableObserver<T, R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, Optional<? extends R>> f74123p0;

        public a(Observer<? super R> observer, Function<? super T, Optional<? extends R>> function) {
            super(observer);
            this.f74123p0 = function;
        }

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
                Optional<? extends R> optionalApply = this.f74123p0.apply(t10);
                Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                Optional optionalB = cm.a.b(optionalApply);
                if (optionalB.isPresent()) {
                    this.downstream.onNext((Object) optionalB.get());
                }
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final R poll() throws Throwable {
            Optional optionalB;
            do {
                T tPoll = this.f74180qd.poll();
                if (tPoll == null) {
                    return null;
                }
                Optional<? extends R> optionalApply = this.f74123p0.apply(tPoll);
                Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                optionalB = cm.a.b(optionalApply);
            } while (!optionalB.isPresent());
            return (R) optionalB.get();
        }
    }

    public ObservableMapOptional(Observable<T> observable, Function<? super T, Optional<? extends R>> function) {
        this.f74121p0 = observable;
        this.f74122q0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        this.f74121p0.subscribe(new a(observer, this.f74122q0));
    }
}
