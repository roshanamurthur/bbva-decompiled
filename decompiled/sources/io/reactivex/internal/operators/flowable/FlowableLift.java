package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableOperator;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableLift<R, T> extends a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final FlowableOperator<? extends R, ? super T> f70793q0;

    public FlowableLift(Flowable<T> flowable, FlowableOperator<? extends R, ? super T> flowableOperator) {
        super(flowable);
        this.f70793q0 = flowableOperator;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        FlowableOperator<? extends R, ? super T> flowableOperator = this.f70793q0;
        try {
            Subscriber<? super Object> subscriberApply = flowableOperator.apply(subscriber);
            if (subscriberApply != null) {
                this.source.subscribe(subscriberApply);
                return;
            }
            throw new NullPointerException("Operator " + flowableOperator + " returned a null Subscriber");
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
