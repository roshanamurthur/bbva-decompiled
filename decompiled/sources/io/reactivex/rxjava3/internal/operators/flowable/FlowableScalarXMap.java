package io.reactivex.rxjava3.internal.operators.flowable;

import a.d;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.ScalarSubscription;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableScalarXMap {

    public static final class a<T, R> extends Flowable<R> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f75352q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super T, ? extends Publisher<? extends R>> f75353r0;

        public a(T t10, Function<? super T, ? extends Publisher<? extends R>> function) {
            this.f75352q0 = t10;
            this.f75353r0 = function;
        }

        @Override // io.reactivex.rxjava3.core.Flowable
        public final void subscribeActual(Subscriber<? super R> subscriber) {
            try {
                Publisher<? extends R> publisherApply = this.f75353r0.apply(this.f75352q0);
                Objects.requireNonNull(publisherApply, "The mapper returned a null Publisher");
                Publisher<? extends R> publisher = publisherApply;
                if (!(publisher instanceof Supplier)) {
                    publisher.subscribe(subscriber);
                    return;
                }
                try {
                    Object obj = ((Supplier) publisher).get();
                    if (obj == null) {
                        EmptySubscription.complete(subscriber);
                    } else {
                        subscriber.onSubscribe(new ScalarSubscription(subscriber, obj));
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    EmptySubscription.error(th2, subscriber);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                EmptySubscription.error(th3, subscriber);
            }
        }
    }

    public FlowableScalarXMap() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Flowable<U> scalarXMap(T t10, Function<? super T, ? extends Publisher<? extends U>> function) {
        return RxJavaPlugins.onAssembly(new a(t10, function));
    }

    public static <T, R> boolean tryScalarXMapSubscribe(Publisher<T> publisher, Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function) {
        if (!(publisher instanceof Supplier)) {
            return false;
        }
        try {
            d dVar = (Object) ((Supplier) publisher).get();
            if (dVar == null) {
                EmptySubscription.complete(subscriber);
                return true;
            }
            try {
                Publisher<? extends R> publisherApply = function.apply(dVar);
                Objects.requireNonNull(publisherApply, "The mapper returned a null Publisher");
                Publisher<? extends R> publisher2 = publisherApply;
                if (publisher2 instanceof Supplier) {
                    try {
                        Object obj = ((Supplier) publisher2).get();
                        if (obj == null) {
                            EmptySubscription.complete(subscriber);
                            return true;
                        }
                        subscriber.onSubscribe(new ScalarSubscription(subscriber, obj));
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        EmptySubscription.error(th2, subscriber);
                        return true;
                    }
                } else {
                    publisher2.subscribe(subscriber);
                }
                return true;
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                EmptySubscription.error(th3, subscriber);
                return true;
            }
        } catch (Throwable th4) {
            Exceptions.throwIfFatal(th4);
            EmptySubscription.error(th4, subscriber);
            return true;
        }
    }
}
