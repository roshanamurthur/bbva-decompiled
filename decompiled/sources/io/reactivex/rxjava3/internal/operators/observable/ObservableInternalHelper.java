package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableInternalHelper {

    public static final class a<T> implements Supplier<ConnectableObservable<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observable<T> f76796p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f76797q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f76798r0;

        public a(Observable<T> observable, int i10, boolean z10) {
            this.f76796p0 = observable;
            this.f76797q0 = i10;
            this.f76798r0 = z10;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() throws Throwable {
            return this.f76796p0.replay(this.f76797q0, this.f76798r0);
        }
    }

    public static final class b<T> implements Supplier<ConnectableObservable<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observable<T> f76799p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f76800q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f76801r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final TimeUnit f76802s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Scheduler f76803t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f76804u0;

        public b(Observable<T> observable, int i10, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
            this.f76799p0 = observable;
            this.f76800q0 = i10;
            this.f76801r0 = j10;
            this.f76802s0 = timeUnit;
            this.f76803t0 = scheduler;
            this.f76804u0 = z10;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() throws Throwable {
            return this.f76799p0.replay(this.f76800q0, this.f76801r0, this.f76802s0, this.f76803t0, this.f76804u0);
        }
    }

    public static final class c<T, U> implements Function<T, ObservableSource<U>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, ? extends Iterable<? extends U>> f76805p0;

        public c(Function<? super T, ? extends Iterable<? extends U>> function) {
            this.f76805p0 = function;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) throws Throwable {
            Iterable<? extends U> iterableApply = this.f76805p0.apply(obj);
            Objects.requireNonNull(iterableApply, "The mapper returned a null Iterable");
            return new ObservableFromIterable(iterableApply);
        }
    }

    public static final class d<U, R, T> implements Function<U, R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiFunction<? super T, ? super U, ? extends R> f76806p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f76807q0;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Object obj, BiFunction biFunction) {
            this.f76806p0 = biFunction;
            this.f76807q0 = obj;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final R apply(U u2) throws Throwable {
            return this.f76806p0.apply(this.f76807q0, u2);
        }
    }

    public static final class e<T, R, U> implements Function<T, ObservableSource<R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiFunction<? super T, ? super U, ? extends R> f76808p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<? extends U>> f76809q0;

        public e(Function function, BiFunction biFunction) {
            this.f76808p0 = biFunction;
            this.f76809q0 = function;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) throws Throwable {
            ObservableSource<? extends U> observableSourceApply = this.f76809q0.apply(obj);
            Objects.requireNonNull(observableSourceApply, "The mapper returned a null ObservableSource");
            return new ObservableMap(observableSourceApply, new d(obj, this.f76808p0));
        }
    }

    public static final class f<T, U> implements Function<T, ObservableSource<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<U>> f76810p0;

        public f(Function<? super T, ? extends ObservableSource<U>> function) {
            this.f76810p0 = function;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) throws Throwable {
            ObservableSource<U> observableSourceApply = this.f76810p0.apply(obj);
            Objects.requireNonNull(observableSourceApply, "The itemDelay returned a null ObservableSource");
            return new ObservableTake(observableSourceApply, 1L).map(Functions.justFunction(obj)).defaultIfEmpty(obj);
        }
    }

    public static final class g<T> implements Action {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<T> f76811p0;

        public g(Observer<T> observer) {
            this.f76811p0 = observer;
        }

        @Override // io.reactivex.rxjava3.functions.Action
        public final void run() {
            this.f76811p0.onComplete();
        }
    }

    public static final class h<T> implements Consumer<Throwable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<T> f76812p0;

        public h(Observer<T> observer) {
            this.f76812p0 = observer;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Throwable th2) throws Throwable {
            this.f76812p0.onError(th2);
        }
    }

    public static final class i<T> implements Consumer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<T> f76813p0;

        public i(Observer<T> observer) {
            this.f76813p0 = observer;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(T t10) {
            this.f76813p0.onNext(t10);
        }
    }

    public static final class j<T> implements Supplier<ConnectableObservable<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observable<T> f76814p0;

        public j(Observable<T> observable) {
            this.f76814p0 = observable;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() throws Throwable {
            return this.f76814p0.replay();
        }
    }

    public static final class k<T, S> implements BiFunction<S, Emitter<T>, S> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiConsumer<S, Emitter<T>> f76815p0;

        public k(BiConsumer<S, Emitter<T>> biConsumer) {
            this.f76815p0 = biConsumer;
        }

        @Override // io.reactivex.rxjava3.functions.BiFunction
        public final Object apply(Object obj, Object obj2) throws Throwable {
            this.f76815p0.accept(obj, (Emitter) obj2);
            return obj;
        }
    }

    public static final class l<T, S> implements BiFunction<S, Emitter<T>, S> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Consumer<Emitter<T>> f76816p0;

        public l(Consumer<Emitter<T>> consumer) {
            this.f76816p0 = consumer;
        }

        @Override // io.reactivex.rxjava3.functions.BiFunction
        public final Object apply(Object obj, Object obj2) throws Throwable {
            this.f76816p0.accept((Emitter) obj2);
            return obj;
        }
    }

    public static final class m<T> implements Supplier<ConnectableObservable<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observable<T> f76817p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f76818q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f76819r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f76820s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f76821t0;

        public m(Observable<T> observable, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
            this.f76817p0 = observable;
            this.f76818q0 = j10;
            this.f76819r0 = timeUnit;
            this.f76820s0 = scheduler;
            this.f76821t0 = z10;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() throws Throwable {
            return this.f76817p0.replay(this.f76818q0, this.f76819r0, this.f76820s0, this.f76821t0);
        }
    }

    public ObservableInternalHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Function<T, ObservableSource<U>> flatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        return new c(function);
    }

    public static <T, U, R> Function<T, ObservableSource<R>> flatMapWithCombiner(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new e(function, biFunction);
    }

    public static <T, U> Function<T, ObservableSource<T>> itemDelay(Function<? super T, ? extends ObservableSource<U>> function) {
        return new f(function);
    }

    public static <T> Action observerOnComplete(Observer<T> observer) {
        return new g(observer);
    }

    public static <T> Consumer<Throwable> observerOnError(Observer<T> observer) {
        return new h(observer);
    }

    public static <T> Consumer<T> observerOnNext(Observer<T> observer) {
        return new i(observer);
    }

    public static <T> Supplier<ConnectableObservable<T>> replaySupplier(Observable<T> observable) {
        return new j(observable);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
        return new k(biConsumer);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleGenerator(Consumer<Emitter<T>> consumer) {
        return new l(consumer);
    }

    public static <T> Supplier<ConnectableObservable<T>> replaySupplier(Observable<T> observable, int i10, boolean z10) {
        return new a(observable, i10, z10);
    }

    public static <T> Supplier<ConnectableObservable<T>> replaySupplier(Observable<T> observable, int i10, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        return new b(observable, i10, j10, timeUnit, scheduler, z10);
    }

    public static <T> Supplier<ConnectableObservable<T>> replaySupplier(Observable<T> observable, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        return new m(observable, j10, timeUnit, scheduler, z10);
    }
}
