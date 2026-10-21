package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableOperator;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableLift<R, T> extends a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableOperator<? extends R, ? super T> f76861p0;

    public ObservableLift(ObservableSource<T> observableSource, ObservableOperator<? extends R, ? super T> observableOperator) {
        super(observableSource);
        this.f76861p0 = observableOperator;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        ObservableOperator<? extends R, ? super T> observableOperator = this.f76861p0;
        try {
            Observer<? super Object> observerApply = observableOperator.apply(observer);
            Objects.requireNonNull(observerApply, "Operator " + observableOperator + " returned a null Observer");
            this.source.subscribe(observerApply);
        } catch (NullPointerException e5) {
            throw e5;
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }
}
