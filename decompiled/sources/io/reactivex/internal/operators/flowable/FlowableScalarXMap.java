package io.reactivex.internal.operators.flowable;

import a.d;
import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableScalarXMap {

    public static final class a<T, R> extends Flowable<R> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f71094q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super T, ? extends Publisher<? extends R>> f71095r0;

        public a(T t10, Function<? super T, ? extends Publisher<? extends R>> function) {
            this.f71094q0 = t10;
            this.f71095r0 = function;
        }

        @Override // io.reactivex.Flowable
        public final void subscribeActual(Subscriber<? super R> subscriber) {
            try {
                Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.f71095r0.apply(this.f71094q0), "The mapper returned a null Publisher");
                if (!(publisher instanceof Callable)) {
                    publisher.subscribe(subscriber);
                    return;
                }
                try {
                    Object objCall = ((Callable) publisher).call();
                    if (objCall == null) {
                        EmptySubscription.complete(subscriber);
                    } else {
                        subscriber.onSubscribe(new ScalarSubscription(subscriber, objCall));
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    EmptySubscription.error(th2, subscriber);
                }
            } catch (Throwable th3) {
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
        if (!(publisher instanceof Callable)) {
            return false;
        }
        try {
            d dVar = (Object) ((Callable) publisher).call();
            if (dVar == null) {
                EmptySubscription.complete(subscriber);
                return true;
            }
            try {
                Publisher publisher2 = (Publisher) ObjectHelper.requireNonNull(function.apply(dVar), "The mapper returned a null Publisher");
                if (publisher2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) publisher2).call();
                        if (objCall == null) {
                            EmptySubscription.complete(subscriber);
                            return true;
                        }
                        subscriber.onSubscribe(new ScalarSubscription(subscriber, objCall));
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
