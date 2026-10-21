package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.flowables.ConnectableFlowable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableInternalHelper {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RequestMax implements Consumer<Subscription> {
        private static final /* synthetic */ RequestMax[] $VALUES;
        public static final RequestMax INSTANCE;

        static {
            RequestMax requestMax = new RequestMax("INSTANCE", 0);
            INSTANCE = requestMax;
            $VALUES = new RequestMax[]{requestMax};
        }

        public RequestMax() {
            throw null;
        }

        public static RequestMax valueOf(String str) {
            return (RequestMax) Enum.valueOf(RequestMax.class, str);
        }

        public static RequestMax[] values() {
            return (RequestMax[]) $VALUES.clone();
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public void accept(Subscription subscription) {
            subscription.request(Long.MAX_VALUE);
        }
    }

    public static final class a<T> implements Supplier<ConnectableFlowable<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Flowable<T> f75003p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f75004q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f75005r0;

        public a(Flowable<T> flowable, int i10, boolean z10) {
            this.f75003p0 = flowable;
            this.f75004q0 = i10;
            this.f75005r0 = z10;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() throws Throwable {
            return this.f75003p0.replay(this.f75004q0, this.f75005r0);
        }
    }

    public static final class b<T> implements Supplier<ConnectableFlowable<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Flowable<T> f75006p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f75007q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f75008r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final TimeUnit f75009s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Scheduler f75010t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f75011u0;

        public b(Flowable<T> flowable, int i10, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
            this.f75006p0 = flowable;
            this.f75007q0 = i10;
            this.f75008r0 = j10;
            this.f75009s0 = timeUnit;
            this.f75010t0 = scheduler;
            this.f75011u0 = z10;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() throws Throwable {
            return this.f75006p0.replay(this.f75007q0, this.f75008r0, this.f75009s0, this.f75010t0, this.f75011u0);
        }
    }

    public static final class c<T, U> implements Function<T, Publisher<U>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, ? extends Iterable<? extends U>> f75012p0;

        public c(Function<? super T, ? extends Iterable<? extends U>> function) {
            this.f75012p0 = function;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) throws Throwable {
            Iterable<? extends U> iterableApply = this.f75012p0.apply(obj);
            Objects.requireNonNull(iterableApply, "The mapper returned a null Iterable");
            return new FlowableFromIterable(iterableApply);
        }
    }

    public static final class d<U, R, T> implements Function<U, R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiFunction<? super T, ? super U, ? extends R> f75013p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f75014q0;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Object obj, BiFunction biFunction) {
            this.f75013p0 = biFunction;
            this.f75014q0 = obj;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final R apply(U u2) throws Throwable {
            return this.f75013p0.apply(this.f75014q0, u2);
        }
    }

    public static final class e<T, R, U> implements Function<T, Publisher<R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiFunction<? super T, ? super U, ? extends R> f75015p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Publisher<? extends U>> f75016q0;

        public e(Function function, BiFunction biFunction) {
            this.f75015p0 = biFunction;
            this.f75016q0 = function;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) throws Throwable {
            Publisher<? extends U> publisherApply = this.f75016q0.apply(obj);
            Objects.requireNonNull(publisherApply, "The mapper returned a null Publisher");
            return new FlowableMapPublisher(publisherApply, new d(obj, this.f75015p0));
        }
    }

    public static final class f<T, U> implements Function<T, Publisher<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, ? extends Publisher<U>> f75017p0;

        public f(Function<? super T, ? extends Publisher<U>> function) {
            this.f75017p0 = function;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) throws Throwable {
            Publisher<U> publisherApply = this.f75017p0.apply(obj);
            Objects.requireNonNull(publisherApply, "The itemDelay returned a null Publisher");
            return new FlowableTakePublisher(publisherApply, 1L).map(Functions.justFunction(obj)).defaultIfEmpty(obj);
        }
    }

    public static final class g<T> implements Supplier<ConnectableFlowable<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Flowable<T> f75018p0;

        public g(Flowable<T> flowable) {
            this.f75018p0 = flowable;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() throws Throwable {
            return this.f75018p0.replay();
        }
    }

    public static final class h<T, S> implements BiFunction<S, Emitter<T>, S> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiConsumer<S, Emitter<T>> f75019p0;

        public h(BiConsumer<S, Emitter<T>> biConsumer) {
            this.f75019p0 = biConsumer;
        }

        @Override // io.reactivex.rxjava3.functions.BiFunction
        public final Object apply(Object obj, Object obj2) throws Throwable {
            this.f75019p0.accept(obj, (Emitter) obj2);
            return obj;
        }
    }

    public static final class i<T, S> implements BiFunction<S, Emitter<T>, S> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Consumer<Emitter<T>> f75020p0;

        public i(Consumer<Emitter<T>> consumer) {
            this.f75020p0 = consumer;
        }

        @Override // io.reactivex.rxjava3.functions.BiFunction
        public final Object apply(Object obj, Object obj2) throws Throwable {
            this.f75020p0.accept((Emitter) obj2);
            return obj;
        }
    }

    public static final class j<T> implements Action {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<T> f75021p0;

        public j(Subscriber<T> subscriber) {
            this.f75021p0 = subscriber;
        }

        @Override // io.reactivex.rxjava3.functions.Action
        public final void run() {
            this.f75021p0.onComplete();
        }
    }

    public static final class k<T> implements Consumer<Throwable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<T> f75022p0;

        public k(Subscriber<T> subscriber) {
            this.f75022p0 = subscriber;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Throwable th2) throws Throwable {
            this.f75022p0.onError(th2);
        }
    }

    public static final class l<T> implements Consumer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<T> f75023p0;

        public l(Subscriber<T> subscriber) {
            this.f75023p0 = subscriber;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(T t10) {
            this.f75023p0.onNext(t10);
        }
    }

    public static final class m<T> implements Supplier<ConnectableFlowable<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Flowable<T> f75024p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f75025q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f75026r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f75027s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f75028t0;

        public m(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
            this.f75024p0 = flowable;
            this.f75025q0 = j10;
            this.f75026r0 = timeUnit;
            this.f75027s0 = scheduler;
            this.f75028t0 = z10;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() throws Throwable {
            return this.f75024p0.replay(this.f75025q0, this.f75026r0, this.f75027s0, this.f75028t0);
        }
    }

    public FlowableInternalHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Function<T, Publisher<U>> flatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        return new c(function);
    }

    public static <T, U, R> Function<T, Publisher<R>> flatMapWithCombiner(Function<? super T, ? extends Publisher<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new e(function, biFunction);
    }

    public static <T, U> Function<T, Publisher<T>> itemDelay(Function<? super T, ? extends Publisher<U>> function) {
        return new f(function);
    }

    public static <T> Supplier<ConnectableFlowable<T>> replaySupplier(Flowable<T> flowable) {
        return new g(flowable);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
        return new h(biConsumer);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleGenerator(Consumer<Emitter<T>> consumer) {
        return new i(consumer);
    }

    public static <T> Action subscriberOnComplete(Subscriber<T> subscriber) {
        return new j(subscriber);
    }

    public static <T> Consumer<Throwable> subscriberOnError(Subscriber<T> subscriber) {
        return new k(subscriber);
    }

    public static <T> Consumer<T> subscriberOnNext(Subscriber<T> subscriber) {
        return new l(subscriber);
    }

    public static <T> Supplier<ConnectableFlowable<T>> replaySupplier(Flowable<T> flowable, int i10, boolean z10) {
        return new a(flowable, i10, z10);
    }

    public static <T> Supplier<ConnectableFlowable<T>> replaySupplier(Flowable<T> flowable, int i10, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        return new b(flowable, i10, j10, timeUnit, scheduler, z10);
    }

    public static <T> Supplier<ConnectableFlowable<T>> replaySupplier(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        return new m(flowable, j10, timeUnit, scheduler, z10);
    }
}
