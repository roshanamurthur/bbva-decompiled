package io.reactivex.rxjava3.internal.jdk8;

import androidx.window.layout.h;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFromCompletionStage<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CompletionStage<T> f74040q0;

    public static final class a<T> extends AtomicReference<BiConsumer<T, Throwable>> implements BiConsumer<T, Throwable> {
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th2) {
            Throwable th3 = th2;
            BiConsumer biConsumerF = h.f(get());
            if (biConsumerF != null) {
                biConsumerF.accept(obj, th3);
            }
        }
    }

    public static final class b<T> extends DeferredScalarSubscription<T> implements BiConsumer<T, Throwable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T> f74041p0;

        public b(Subscriber<? super T> subscriber, a<T> aVar) {
            super(subscriber);
            this.f74041p0 = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th2) {
            Throwable th3 = th2;
            if (th3 != null) {
                this.downstream.onError(th3);
            } else if (obj != 0) {
                complete(obj);
            } else {
                this.downstream.onError(new NullPointerException("The CompletionStage terminated with null."));
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f74041p0.set(null);
        }
    }

    public FlowableFromCompletionStage(CompletionStage<T> completionStage) {
        this.f74040q0 = completionStage;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        a aVar = new a();
        b bVar = new b(subscriber, aVar);
        aVar.lazySet(bVar);
        subscriber.onSubscribe(bVar);
        this.f74040q0.whenComplete(aVar);
    }
}
