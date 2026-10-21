package io.reactivex.internal.operators.flowable;

import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
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

        @Override // io.reactivex.functions.Consumer
        public void accept(Subscription subscription) throws Exception {
            subscription.request(Long.MAX_VALUE);
        }
    }

    public static final class a<T> implements Callable<ConnectableFlowable<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Flowable<T> f70727p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f70728q0;

        public a(Flowable<T> flowable, int i10) {
            this.f70727p0 = flowable;
            this.f70728q0 = i10;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            return this.f70727p0.replay(this.f70728q0);
        }
    }

    public static final class b<T> implements Callable<ConnectableFlowable<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Flowable<T> f70729p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f70730q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f70731r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final TimeUnit f70732s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Scheduler f70733t0;

        public b(Flowable<T> flowable, int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.f70729p0 = flowable;
            this.f70730q0 = i10;
            this.f70731r0 = j10;
            this.f70732s0 = timeUnit;
            this.f70733t0 = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            return this.f70729p0.replay(this.f70730q0, this.f70731r0, this.f70732s0, this.f70733t0);
        }
    }

    public static final class c<T, U> implements Function<T, Publisher<U>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, ? extends Iterable<? extends U>> f70734p0;

        public c(Function<? super T, ? extends Iterable<? extends U>> function) {
            this.f70734p0 = function;
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) throws Exception {
            return new FlowableFromIterable((Iterable) ObjectHelper.requireNonNull(this.f70734p0.apply(obj), "The mapper returned a null Iterable"));
        }
    }

    public static final class d<U, R, T> implements Function<U, R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiFunction<? super T, ? super U, ? extends R> f70735p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f70736q0;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Object obj, BiFunction biFunction) {
            this.f70735p0 = biFunction;
            this.f70736q0 = obj;
        }

        @Override // io.reactivex.functions.Function
        public final R apply(U u2) throws Exception {
            return this.f70735p0.apply(this.f70736q0, u2);
        }
    }

    public static final class e<T, R, U> implements Function<T, Publisher<R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiFunction<? super T, ? super U, ? extends R> f70737p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Publisher<? extends U>> f70738q0;

        public e(Function function, BiFunction biFunction) {
            this.f70737p0 = biFunction;
            this.f70738q0 = function;
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) throws Exception {
            return new FlowableMapPublisher((Publisher) ObjectHelper.requireNonNull(this.f70738q0.apply(obj), "The mapper returned a null Publisher"), new d(obj, this.f70737p0));
        }
    }

    public static final class f<T, U> implements Function<T, Publisher<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, ? extends Publisher<U>> f70739p0;

        public f(Function<? super T, ? extends Publisher<U>> function) {
            this.f70739p0 = function;
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) throws Exception {
            return new FlowableTakePublisher((Publisher) ObjectHelper.requireNonNull(this.f70739p0.apply(obj), "The itemDelay returned a null Publisher"), 1L).map(Functions.justFunction(obj)).defaultIfEmpty(obj);
        }
    }

    public static final class g<T> implements Callable<ConnectableFlowable<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Flowable<T> f70740p0;

        public g(Flowable<T> flowable) {
            this.f70740p0 = flowable;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            return this.f70740p0.replay();
        }
    }

    public static final class h<T, R> implements Function<Flowable<T>, Publisher<R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super Flowable<T>, ? extends Publisher<R>> f70741p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Scheduler f70742q0;

        public h(Function<? super Flowable<T>, ? extends Publisher<R>> function, Scheduler scheduler) {
            this.f70741p0 = function;
            this.f70742q0 = scheduler;
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) throws Exception {
            return Flowable.fromPublisher((Publisher) ObjectHelper.requireNonNull(this.f70741p0.apply((Flowable) obj), "The selector returned a null Publisher")).observeOn(this.f70742q0);
        }
    }

    public static final class i<T, S> implements BiFunction<S, Emitter<T>, S> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiConsumer<S, Emitter<T>> f70743p0;

        public i(BiConsumer<S, Emitter<T>> biConsumer) {
            this.f70743p0 = biConsumer;
        }

        @Override // io.reactivex.functions.BiFunction
        public final Object apply(Object obj, Object obj2) throws Exception {
            this.f70743p0.accept(obj, (Emitter) obj2);
            return obj;
        }
    }

    public static final class j<T, S> implements BiFunction<S, Emitter<T>, S> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Consumer<Emitter<T>> f70744p0;

        public j(Consumer<Emitter<T>> consumer) {
            this.f70744p0 = consumer;
        }

        @Override // io.reactivex.functions.BiFunction
        public final Object apply(Object obj, Object obj2) throws Exception {
            this.f70744p0.accept((Emitter) obj2);
            return obj;
        }
    }

    public static final class k<T> implements Action {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<T> f70745p0;

        public k(Subscriber<T> subscriber) {
            this.f70745p0 = subscriber;
        }

        @Override // io.reactivex.functions.Action
        public final void run() throws Exception {
            this.f70745p0.onComplete();
        }
    }

    public static final class l<T> implements Consumer<Throwable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<T> f70746p0;

        public l(Subscriber<T> subscriber) {
            this.f70746p0 = subscriber;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Throwable th2) throws Exception {
            this.f70746p0.onError(th2);
        }
    }

    public static final class m<T> implements Consumer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<T> f70747p0;

        public m(Subscriber<T> subscriber) {
            this.f70747p0 = subscriber;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(T t10) throws Exception {
            this.f70747p0.onNext(t10);
        }
    }

    public static final class n<T> implements Callable<ConnectableFlowable<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Flowable<T> f70748p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f70749q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f70750r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f70751s0;

        public n(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.f70748p0 = flowable;
            this.f70749q0 = j10;
            this.f70750r0 = timeUnit;
            this.f70751s0 = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            return this.f70748p0.replay(this.f70749q0, this.f70750r0, this.f70751s0);
        }
    }

    public static final class o<T, R> implements Function<List<Publisher<? extends T>>, Publisher<? extends R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super Object[], ? extends R> f70752p0;

        public o(Function<? super Object[], ? extends R> function) {
            this.f70752p0 = function;
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) throws Exception {
            return Flowable.zipIterable((List) obj, this.f70752p0, false, Flowable.bufferSize());
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

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable) {
        return new g(flowable);
    }

    public static <T, R> Function<Flowable<T>, Publisher<R>> replayFunction(Function<? super Flowable<T>, ? extends Publisher<R>> function, Scheduler scheduler) {
        return new h(function, scheduler);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
        return new i(biConsumer);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleGenerator(Consumer<Emitter<T>> consumer) {
        return new j(consumer);
    }

    public static <T> Action subscriberOnComplete(Subscriber<T> subscriber) {
        return new k(subscriber);
    }

    public static <T> Consumer<Throwable> subscriberOnError(Subscriber<T> subscriber) {
        return new l(subscriber);
    }

    public static <T> Consumer<T> subscriberOnNext(Subscriber<T> subscriber) {
        return new m(subscriber);
    }

    public static <T, R> Function<List<Publisher<? extends T>>, Publisher<? extends R>> zipIterable(Function<? super Object[], ? extends R> function) {
        return new o(function);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, int i10) {
        return new a(flowable, i10);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return new b(flowable, i10, j10, timeUnit, scheduler);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return new n(flowable, j10, timeUnit, scheduler);
    }
}
