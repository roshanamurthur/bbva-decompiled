package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableOperator;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableLift<R, T> extends a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final FlowableOperator<? extends R, ? super T> f75069q0;

    public FlowableLift(Flowable<T> flowable, FlowableOperator<? extends R, ? super T> flowableOperator) {
        super(flowable);
        this.f75069q0 = flowableOperator;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        FlowableOperator<? extends R, ? super T> flowableOperator = this.f75069q0;
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
