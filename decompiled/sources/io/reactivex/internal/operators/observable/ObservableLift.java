package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableOperator;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableLift<R, T> extends a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableOperator<? extends R, ? super T> f72575p0;

    public ObservableLift(ObservableSource<T> observableSource, ObservableOperator<? extends R, ? super T> observableOperator) {
        super(observableSource);
        this.f72575p0 = observableOperator;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        ObservableOperator<? extends R, ? super T> observableOperator = this.f72575p0;
        try {
            this.source.subscribe((Observer) ObjectHelper.requireNonNull(observableOperator.apply(observer), "Operator " + observableOperator + " returned a null Observer"));
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
