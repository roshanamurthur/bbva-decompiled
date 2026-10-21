package io.reactivex.internal.operators.observable;

import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.observables.ConnectableObservable;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableInternalHelper {

    public static final class a<T> implements Callable<ConnectableObservable<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observable<T> f72510p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f72511q0;

        public a(Observable<T> observable, int i10) {
            this.f72510p0 = observable;
            this.f72511q0 = i10;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            return this.f72510p0.replay(this.f72511q0);
        }
    }

    public static final class b<T> implements Callable<ConnectableObservable<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observable<T> f72512p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f72513q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f72514r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final TimeUnit f72515s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Scheduler f72516t0;

        public b(Observable<T> observable, int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.f72512p0 = observable;
            this.f72513q0 = i10;
            this.f72514r0 = j10;
            this.f72515s0 = timeUnit;
            this.f72516t0 = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            return this.f72512p0.replay(this.f72513q0, this.f72514r0, this.f72515s0, this.f72516t0);
        }
    }

    public static final class c<T, U> implements Function<T, ObservableSource<U>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, ? extends Iterable<? extends U>> f72517p0;

        public c(Function<? super T, ? extends Iterable<? extends U>> function) {
            this.f72517p0 = function;
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) throws Exception {
            return new ObservableFromIterable((Iterable) ObjectHelper.requireNonNull(this.f72517p0.apply(obj), "The mapper returned a null Iterable"));
        }
    }

    public static final class d<U, R, T> implements Function<U, R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiFunction<? super T, ? super U, ? extends R> f72518p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f72519q0;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Object obj, BiFunction biFunction) {
            this.f72518p0 = biFunction;
            this.f72519q0 = obj;
        }

        @Override // io.reactivex.functions.Function
        public final R apply(U u2) throws Exception {
            return this.f72518p0.apply(this.f72519q0, u2);
        }
    }

    public static final class e<T, R, U> implements Function<T, ObservableSource<R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiFunction<? super T, ? super U, ? extends R> f72520p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<? extends U>> f72521q0;

        public e(Function function, BiFunction biFunction) {
            this.f72520p0 = biFunction;
            this.f72521q0 = function;
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) throws Exception {
            return new ObservableMap((ObservableSource) ObjectHelper.requireNonNull(this.f72521q0.apply(obj), "The mapper returned a null ObservableSource"), new d(obj, this.f72520p0));
        }
    }

    public static final class f<T, U> implements Function<T, ObservableSource<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<U>> f72522p0;

        public f(Function<? super T, ? extends ObservableSource<U>> function) {
            this.f72522p0 = function;
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) throws Exception {
            return new ObservableTake((ObservableSource) ObjectHelper.requireNonNull(this.f72522p0.apply(obj), "The itemDelay returned a null ObservableSource"), 1L).map(Functions.justFunction(obj)).defaultIfEmpty(obj);
        }
    }

    public static final class g<T> implements Action {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<T> f72523p0;

        public g(Observer<T> observer) {
            this.f72523p0 = observer;
        }

        @Override // io.reactivex.functions.Action
        public final void run() throws Exception {
            this.f72523p0.onComplete();
        }
    }

    public static final class h<T> implements Consumer<Throwable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<T> f72524p0;

        public h(Observer<T> observer) {
            this.f72524p0 = observer;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Throwable th2) throws Exception {
            this.f72524p0.onError(th2);
        }
    }

    public static final class i<T> implements Consumer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<T> f72525p0;

        public i(Observer<T> observer) {
            this.f72525p0 = observer;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(T t10) throws Exception {
            this.f72525p0.onNext(t10);
        }
    }

    public static final class j<T> implements Callable<ConnectableObservable<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observable<T> f72526p0;

        public j(Observable<T> observable) {
            this.f72526p0 = observable;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            return this.f72526p0.replay();
        }
    }

    public static final class k<T, R> implements Function<Observable<T>, ObservableSource<R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super Observable<T>, ? extends ObservableSource<R>> f72527p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Scheduler f72528q0;

        public k(Function<? super Observable<T>, ? extends ObservableSource<R>> function, Scheduler scheduler) {
            this.f72527p0 = function;
            this.f72528q0 = scheduler;
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) throws Exception {
            return Observable.wrap((ObservableSource) ObjectHelper.requireNonNull(this.f72527p0.apply((Observable) obj), "The selector returned a null ObservableSource")).observeOn(this.f72528q0);
        }
    }

    public static final class l<T, S> implements BiFunction<S, Emitter<T>, S> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiConsumer<S, Emitter<T>> f72529p0;

        public l(BiConsumer<S, Emitter<T>> biConsumer) {
            this.f72529p0 = biConsumer;
        }

        @Override // io.reactivex.functions.BiFunction
        public final Object apply(Object obj, Object obj2) throws Exception {
            this.f72529p0.accept(obj, (Emitter) obj2);
            return obj;
        }
    }

    public static final class m<T, S> implements BiFunction<S, Emitter<T>, S> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Consumer<Emitter<T>> f72530p0;

        public m(Consumer<Emitter<T>> consumer) {
            this.f72530p0 = consumer;
        }

        @Override // io.reactivex.functions.BiFunction
        public final Object apply(Object obj, Object obj2) throws Exception {
            this.f72530p0.accept((Emitter) obj2);
            return obj;
        }
    }

    public static final class n<T> implements Callable<ConnectableObservable<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observable<T> f72531p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f72532q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f72533r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f72534s0;

        public n(Observable<T> observable, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.f72531p0 = observable;
            this.f72532q0 = j10;
            this.f72533r0 = timeUnit;
            this.f72534s0 = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            return this.f72531p0.replay(this.f72532q0, this.f72533r0, this.f72534s0);
        }
    }

    public static final class o<T, R> implements Function<List<ObservableSource<? extends T>>, ObservableSource<? extends R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super Object[], ? extends R> f72535p0;

        public o(Function<? super Object[], ? extends R> function) {
            this.f72535p0 = function;
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) throws Exception {
            return Observable.zipIterable((List) obj, this.f72535p0, false, Observable.bufferSize());
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

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> observable) {
        return new j(observable);
    }

    public static <T, R> Function<Observable<T>, ObservableSource<R>> replayFunction(Function<? super Observable<T>, ? extends ObservableSource<R>> function, Scheduler scheduler) {
        return new k(function, scheduler);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
        return new l(biConsumer);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleGenerator(Consumer<Emitter<T>> consumer) {
        return new m(consumer);
    }

    public static <T, R> Function<List<ObservableSource<? extends T>>, ObservableSource<? extends R>> zipIterable(Function<? super Object[], ? extends R> function) {
        return new o(function);
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> observable, int i10) {
        return new a(observable, i10);
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> observable, int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return new b(observable, i10, j10, timeUnit, scheduler);
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> observable, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return new n(observable, j10, timeUnit, scheduler);
    }
}
