package org.reactivestreams;

import androidx.core.content.pm.b0;
import androidx.core.view.g0;
import androidx.core.view.h0;
import androidx.core.view.i0;
import androidx.core.view.j0;
import androidx.core.view.k0;
import java.util.Objects;
import java.util.concurrent.Flow;

/* JADX INFO: loaded from: classes13.dex */
public final class FlowAdapters {

    public static final class a<T> implements Flow.Publisher<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Publisher<? extends T> f92538a;

        public a(Publisher<? extends T> publisher) {
            this.f92538a = publisher;
        }

        @Override // java.util.concurrent.Flow.Publisher
        public final void subscribe(Flow.Subscriber<? super T> subscriber) {
            this.f92538a.subscribe(subscriber == null ? null : new g(subscriber));
        }
    }

    public static final class b<T, U> implements Flow.Processor<T, U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Processor<? super T, ? extends U> f92539a;

        public b(Processor<? super T, ? extends U> processor) {
            this.f92539a = processor;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onComplete() {
            this.f92539a.onComplete();
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onError(Throwable th2) {
            this.f92539a.onError(th2);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onNext(T t10) {
            this.f92539a.onNext(t10);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onSubscribe(Flow.Subscription subscription) {
            this.f92539a.onSubscribe(subscription == null ? null : new h(subscription));
        }

        @Override // java.util.concurrent.Flow.Publisher
        public final void subscribe(Flow.Subscriber<? super U> subscriber) {
            this.f92539a.subscribe(subscriber == null ? null : new g(subscriber));
        }
    }

    public static final class c<T> implements Flow.Subscriber<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subscriber<? super T> f92540a;

        public c(Subscriber<? super T> subscriber) {
            this.f92540a = subscriber;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onComplete() {
            this.f92540a.onComplete();
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onError(Throwable th2) {
            this.f92540a.onError(th2);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onNext(T t10) {
            this.f92540a.onNext(t10);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onSubscribe(Flow.Subscription subscription) {
            this.f92540a.onSubscribe(subscription == null ? null : new h(subscription));
        }
    }

    public static final class d implements Flow.Subscription {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subscription f92541a;

        public d(Subscription subscription) {
            this.f92541a = subscription;
        }

        @Override // java.util.concurrent.Flow.Subscription
        public final void cancel() {
            this.f92541a.cancel();
        }

        @Override // java.util.concurrent.Flow.Subscription
        public final void request(long j10) {
            this.f92541a.request(j10);
        }
    }

    public static final class e<T> implements Publisher<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Flow.Publisher<? extends T> f92542p0;

        public e(Flow.Publisher<? extends T> publisher) {
            this.f92542p0 = publisher;
        }

        @Override // org.reactivestreams.Publisher
        public final void subscribe(Subscriber<? super T> subscriber) {
            this.f92542p0.subscribe(subscriber == null ? null : new c(subscriber));
        }
    }

    public static final class f<T, U> implements Processor<T, U> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Flow.Processor<? super T, ? extends U> f92543p0;

        public f(Flow.Processor<? super T, ? extends U> processor) {
            this.f92543p0 = processor;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f92543p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f92543p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f92543p0.onNext(t10);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            this.f92543p0.onSubscribe(subscription == null ? null : new d(subscription));
        }

        @Override // org.reactivestreams.Publisher
        public final void subscribe(Subscriber<? super U> subscriber) {
            this.f92543p0.subscribe(subscriber == null ? null : new c(subscriber));
        }
    }

    public static final class g<T> implements Subscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Flow.Subscriber<? super T> f92544p0;

        public g(Flow.Subscriber<? super T> subscriber) {
            this.f92544p0 = subscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f92544p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f92544p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f92544p0.onNext(t10);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            this.f92544p0.onSubscribe(subscription == null ? null : new d(subscription));
        }
    }

    public static final class h implements Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Flow.Subscription f92545p0;

        public h(Flow.Subscription subscription) {
            this.f92545p0 = subscription;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f92545p0.cancel();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f92545p0.request(j10);
        }
    }

    public FlowAdapters() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Flow.Processor<T, U> toFlowProcessor(Processor<? super T, ? extends U> processor) {
        Objects.requireNonNull(processor, "reactiveStreamsProcessor");
        if (processor instanceof f) {
            return ((f) processor).f92543p0;
        }
        return g0.h(processor) ? h0.d(processor) : new b(processor);
    }

    public static <T> Flow.Publisher<T> toFlowPublisher(Publisher<? extends T> publisher) {
        Objects.requireNonNull(publisher, "reactiveStreamsPublisher");
        if (publisher instanceof e) {
            return ((e) publisher).f92542p0;
        }
        return j0.d(publisher) ? k0.b(publisher) : new a(publisher);
    }

    public static <T> Flow.Subscriber<T> toFlowSubscriber(Subscriber<T> subscriber) {
        Objects.requireNonNull(subscriber, "reactiveStreamsSubscriber");
        if (subscriber instanceof g) {
            return ((g) subscriber).f92544p0;
        }
        return i0.e(subscriber) ? b0.a(subscriber) : new c(subscriber);
    }

    public static <T, U> Processor<T, U> toProcessor(Flow.Processor<? super T, ? extends U> processor) {
        Objects.requireNonNull(processor, "flowProcessor");
        if (processor instanceof b) {
            return ((b) processor).f92539a;
        }
        return processor instanceof Processor ? (Processor) processor : new f(processor);
    }

    public static <T> Publisher<T> toPublisher(Flow.Publisher<? extends T> publisher) {
        Objects.requireNonNull(publisher, "flowPublisher");
        if (publisher instanceof a) {
            return ((a) publisher).f92538a;
        }
        return publisher instanceof Publisher ? (Publisher) publisher : new e(publisher);
    }

    public static <T> Subscriber<T> toSubscriber(Flow.Subscriber<T> subscriber) {
        Objects.requireNonNull(subscriber, "flowSubscriber");
        if (subscriber instanceof c) {
            return ((c) subscriber).f92540a;
        }
        return subscriber instanceof Subscriber ? (Subscriber) subscriber : new g(subscriber);
    }
}
