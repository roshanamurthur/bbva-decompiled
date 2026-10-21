package io.reactivex.plugins;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.schedulers.ComputationScheduler;
import io.reactivex.internal.schedulers.IoScheduler;
import io.reactivex.internal.schedulers.NewThreadScheduler;
import io.reactivex.internal.schedulers.SingleScheduler;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.parallel.ParallelFlowable;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class RxJavaPlugins {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static volatile Consumer<? super Throwable> f73830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Runnable, ? extends Runnable> f73831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Callable<Scheduler>, ? extends Scheduler> f73832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Callable<Scheduler>, ? extends Scheduler> f73833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Callable<Scheduler>, ? extends Scheduler> f73834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Callable<Scheduler>, ? extends Scheduler> f73835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Scheduler, ? extends Scheduler> f73836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Scheduler, ? extends Scheduler> f73837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Scheduler, ? extends Scheduler> f73838i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Scheduler, ? extends Scheduler> f73839j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Flowable, ? extends Flowable> f73840k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super ConnectableFlowable, ? extends ConnectableFlowable> f73841l;

    @Nullable
    public static volatile Function<? super Observable, ? extends Observable> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super ConnectableObservable, ? extends ConnectableObservable> f73842n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Maybe, ? extends Maybe> f73843o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Single, ? extends Single> f73844p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Completable, ? extends Completable> f73845q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super ParallelFlowable, ? extends ParallelFlowable> f73846r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public static volatile BiFunction<? super Flowable, ? super Subscriber, ? extends Subscriber> f73847s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public static volatile BiFunction<? super Maybe, ? super MaybeObserver, ? extends MaybeObserver> f73848t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public static volatile BiFunction<? super Observable, ? super Observer, ? extends Observer> f73849u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public static volatile BiFunction<? super Single, ? super SingleObserver, ? extends SingleObserver> f73850v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public static volatile BiFunction<? super Completable, ? super CompletableObserver, ? extends CompletableObserver> f73851w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public static volatile BooleanSupplier f73852x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static volatile boolean f73853y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static volatile boolean f73854z;

    public RxJavaPlugins() {
        throw new IllegalStateException("No instances!");
    }

    @NonNull
    public static Object a(@NonNull Object obj, @NonNull Function function) {
        try {
            return function.apply(obj);
        } catch (Throwable th2) {
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @NonNull
    public static Scheduler b(@NonNull Callable<Scheduler> callable) {
        try {
            return (Scheduler) ObjectHelper.requireNonNull(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th2) {
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @NonNull
    public static Scheduler createComputationScheduler(@NonNull ThreadFactory threadFactory) {
        return new ComputationScheduler((ThreadFactory) ObjectHelper.requireNonNull(threadFactory, "threadFactory is null"));
    }

    @NonNull
    public static Scheduler createIoScheduler(@NonNull ThreadFactory threadFactory) {
        return new IoScheduler((ThreadFactory) ObjectHelper.requireNonNull(threadFactory, "threadFactory is null"));
    }

    @NonNull
    public static Scheduler createNewThreadScheduler(@NonNull ThreadFactory threadFactory) {
        return new NewThreadScheduler((ThreadFactory) ObjectHelper.requireNonNull(threadFactory, "threadFactory is null"));
    }

    @NonNull
    public static Scheduler createSingleScheduler(@NonNull ThreadFactory threadFactory) {
        return new SingleScheduler((ThreadFactory) ObjectHelper.requireNonNull(threadFactory, "threadFactory is null"));
    }

    @Nullable
    public static Function<? super Scheduler, ? extends Scheduler> getComputationSchedulerHandler() {
        return f73836g;
    }

    @Nullable
    public static Consumer<? super Throwable> getErrorHandler() {
        return f73830a;
    }

    @Nullable
    public static Function<? super Callable<Scheduler>, ? extends Scheduler> getInitComputationSchedulerHandler() {
        return f73832c;
    }

    @Nullable
    public static Function<? super Callable<Scheduler>, ? extends Scheduler> getInitIoSchedulerHandler() {
        return f73834e;
    }

    @Nullable
    public static Function<? super Callable<Scheduler>, ? extends Scheduler> getInitNewThreadSchedulerHandler() {
        return f73835f;
    }

    @Nullable
    public static Function<? super Callable<Scheduler>, ? extends Scheduler> getInitSingleSchedulerHandler() {
        return f73833d;
    }

    @Nullable
    public static Function<? super Scheduler, ? extends Scheduler> getIoSchedulerHandler() {
        return f73838i;
    }

    @Nullable
    public static Function<? super Scheduler, ? extends Scheduler> getNewThreadSchedulerHandler() {
        return f73839j;
    }

    @Nullable
    public static BooleanSupplier getOnBeforeBlocking() {
        return f73852x;
    }

    @Nullable
    public static Function<? super Completable, ? extends Completable> getOnCompletableAssembly() {
        return f73845q;
    }

    @Nullable
    public static BiFunction<? super Completable, ? super CompletableObserver, ? extends CompletableObserver> getOnCompletableSubscribe() {
        return f73851w;
    }

    @Nullable
    public static Function<? super ConnectableFlowable, ? extends ConnectableFlowable> getOnConnectableFlowableAssembly() {
        return f73841l;
    }

    @Nullable
    public static Function<? super ConnectableObservable, ? extends ConnectableObservable> getOnConnectableObservableAssembly() {
        return f73842n;
    }

    @Nullable
    public static Function<? super Flowable, ? extends Flowable> getOnFlowableAssembly() {
        return f73840k;
    }

    @Nullable
    public static BiFunction<? super Flowable, ? super Subscriber, ? extends Subscriber> getOnFlowableSubscribe() {
        return f73847s;
    }

    @Nullable
    public static Function<? super Maybe, ? extends Maybe> getOnMaybeAssembly() {
        return f73843o;
    }

    @Nullable
    public static BiFunction<? super Maybe, ? super MaybeObserver, ? extends MaybeObserver> getOnMaybeSubscribe() {
        return f73848t;
    }

    @Nullable
    public static Function<? super Observable, ? extends Observable> getOnObservableAssembly() {
        return m;
    }

    @Nullable
    public static BiFunction<? super Observable, ? super Observer, ? extends Observer> getOnObservableSubscribe() {
        return f73849u;
    }

    @Nullable
    public static Function<? super ParallelFlowable, ? extends ParallelFlowable> getOnParallelAssembly() {
        return f73846r;
    }

    @Nullable
    public static Function<? super Single, ? extends Single> getOnSingleAssembly() {
        return f73844p;
    }

    @Nullable
    public static BiFunction<? super Single, ? super SingleObserver, ? extends SingleObserver> getOnSingleSubscribe() {
        return f73850v;
    }

    @Nullable
    public static Function<? super Runnable, ? extends Runnable> getScheduleHandler() {
        return f73831b;
    }

    @Nullable
    public static Function<? super Scheduler, ? extends Scheduler> getSingleSchedulerHandler() {
        return f73837h;
    }

    @NonNull
    public static Scheduler initComputationScheduler(@NonNull Callable<Scheduler> callable) {
        ObjectHelper.requireNonNull(callable, "Scheduler Callable can't be null");
        Function<? super Callable<Scheduler>, ? extends Scheduler> function = f73832c;
        return function == null ? b(callable) : (Scheduler) ObjectHelper.requireNonNull(a(callable, function), "Scheduler Callable result can't be null");
    }

    @NonNull
    public static Scheduler initIoScheduler(@NonNull Callable<Scheduler> callable) {
        ObjectHelper.requireNonNull(callable, "Scheduler Callable can't be null");
        Function<? super Callable<Scheduler>, ? extends Scheduler> function = f73834e;
        return function == null ? b(callable) : (Scheduler) ObjectHelper.requireNonNull(a(callable, function), "Scheduler Callable result can't be null");
    }

    @NonNull
    public static Scheduler initNewThreadScheduler(@NonNull Callable<Scheduler> callable) {
        ObjectHelper.requireNonNull(callable, "Scheduler Callable can't be null");
        Function<? super Callable<Scheduler>, ? extends Scheduler> function = f73835f;
        return function == null ? b(callable) : (Scheduler) ObjectHelper.requireNonNull(a(callable, function), "Scheduler Callable result can't be null");
    }

    @NonNull
    public static Scheduler initSingleScheduler(@NonNull Callable<Scheduler> callable) {
        ObjectHelper.requireNonNull(callable, "Scheduler Callable can't be null");
        Function<? super Callable<Scheduler>, ? extends Scheduler> function = f73833d;
        return function == null ? b(callable) : (Scheduler) ObjectHelper.requireNonNull(a(callable, function), "Scheduler Callable result can't be null");
    }

    public static boolean isFailOnNonBlockingScheduler() {
        return f73854z;
    }

    public static boolean isLockdown() {
        return f73853y;
    }

    public static void lockdown() {
        f73853y = true;
    }

    @NonNull
    public static <T> Maybe<T> onAssembly(@NonNull Maybe<T> maybe) {
        Function<? super Maybe, ? extends Maybe> function = f73843o;
        return function != null ? (Maybe) a(maybe, function) : maybe;
    }

    public static boolean onBeforeBlocking() {
        BooleanSupplier booleanSupplier = f73852x;
        if (booleanSupplier == null) {
            return false;
        }
        try {
            return booleanSupplier.getAsBoolean();
        } catch (Throwable th2) {
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @NonNull
    public static Scheduler onComputationScheduler(@NonNull Scheduler scheduler) {
        Function<? super Scheduler, ? extends Scheduler> function = f73836g;
        return function == null ? scheduler : (Scheduler) a(scheduler, function);
    }

    public static void onError(@NonNull Throwable th2) {
        Consumer<? super Throwable> consumer = f73830a;
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th2 instanceof OnErrorNotImplementedException) && !(th2 instanceof MissingBackpressureException) && !(th2 instanceof IllegalStateException) && !(th2 instanceof NullPointerException) && !(th2 instanceof IllegalArgumentException) && !(th2 instanceof CompositeException)) {
            th2 = new UndeliverableException(th2);
        }
        if (consumer != null) {
            try {
                consumer.accept(th2);
                return;
            } catch (Throwable th3) {
                th3.printStackTrace();
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th3);
            }
        }
        th2.printStackTrace();
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
    }

    @NonNull
    public static Scheduler onIoScheduler(@NonNull Scheduler scheduler) {
        Function<? super Scheduler, ? extends Scheduler> function = f73838i;
        return function == null ? scheduler : (Scheduler) a(scheduler, function);
    }

    @NonNull
    public static Scheduler onNewThreadScheduler(@NonNull Scheduler scheduler) {
        Function<? super Scheduler, ? extends Scheduler> function = f73839j;
        return function == null ? scheduler : (Scheduler) a(scheduler, function);
    }

    @NonNull
    public static Runnable onSchedule(@NonNull Runnable runnable) {
        ObjectHelper.requireNonNull(runnable, "run is null");
        Function<? super Runnable, ? extends Runnable> function = f73831b;
        return function == null ? runnable : (Runnable) a(runnable, function);
    }

    @NonNull
    public static Scheduler onSingleScheduler(@NonNull Scheduler scheduler) {
        Function<? super Scheduler, ? extends Scheduler> function = f73837h;
        return function == null ? scheduler : (Scheduler) a(scheduler, function);
    }

    @NonNull
    public static <T> Subscriber<? super T> onSubscribe(@NonNull Flowable<T> flowable, @NonNull Subscriber<? super T> subscriber) {
        BiFunction<? super Flowable, ? super Subscriber, ? extends Subscriber> biFunction = f73847s;
        if (biFunction == null) {
            return subscriber;
        }
        try {
            return biFunction.apply(flowable, subscriber);
        } catch (Throwable th2) {
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    public static void reset() {
        setErrorHandler(null);
        setScheduleHandler(null);
        setComputationSchedulerHandler(null);
        setInitComputationSchedulerHandler(null);
        setIoSchedulerHandler(null);
        setInitIoSchedulerHandler(null);
        setSingleSchedulerHandler(null);
        setInitSingleSchedulerHandler(null);
        setNewThreadSchedulerHandler(null);
        setInitNewThreadSchedulerHandler(null);
        setOnFlowableAssembly(null);
        setOnFlowableSubscribe(null);
        setOnObservableAssembly(null);
        setOnObservableSubscribe(null);
        setOnSingleAssembly(null);
        setOnSingleSubscribe(null);
        setOnCompletableAssembly(null);
        setOnCompletableSubscribe(null);
        setOnConnectableFlowableAssembly(null);
        setOnConnectableObservableAssembly(null);
        setOnMaybeAssembly(null);
        setOnMaybeSubscribe(null);
        setOnParallelAssembly(null);
        setFailOnNonBlockingScheduler(false);
        setOnBeforeBlocking(null);
    }

    public static void setComputationSchedulerHandler(@Nullable Function<? super Scheduler, ? extends Scheduler> function) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73836g = function;
    }

    public static void setErrorHandler(@Nullable Consumer<? super Throwable> consumer) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73830a = consumer;
    }

    public static void setFailOnNonBlockingScheduler(boolean z10) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73854z = z10;
    }

    public static void setInitComputationSchedulerHandler(@Nullable Function<? super Callable<Scheduler>, ? extends Scheduler> function) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73832c = function;
    }

    public static void setInitIoSchedulerHandler(@Nullable Function<? super Callable<Scheduler>, ? extends Scheduler> function) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73834e = function;
    }

    public static void setInitNewThreadSchedulerHandler(@Nullable Function<? super Callable<Scheduler>, ? extends Scheduler> function) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73835f = function;
    }

    public static void setInitSingleSchedulerHandler(@Nullable Function<? super Callable<Scheduler>, ? extends Scheduler> function) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73833d = function;
    }

    public static void setIoSchedulerHandler(@Nullable Function<? super Scheduler, ? extends Scheduler> function) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73838i = function;
    }

    public static void setNewThreadSchedulerHandler(@Nullable Function<? super Scheduler, ? extends Scheduler> function) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73839j = function;
    }

    public static void setOnBeforeBlocking(@Nullable BooleanSupplier booleanSupplier) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73852x = booleanSupplier;
    }

    public static void setOnCompletableAssembly(@Nullable Function<? super Completable, ? extends Completable> function) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73845q = function;
    }

    public static void setOnCompletableSubscribe(@Nullable BiFunction<? super Completable, ? super CompletableObserver, ? extends CompletableObserver> biFunction) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73851w = biFunction;
    }

    public static void setOnConnectableFlowableAssembly(@Nullable Function<? super ConnectableFlowable, ? extends ConnectableFlowable> function) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73841l = function;
    }

    public static void setOnConnectableObservableAssembly(@Nullable Function<? super ConnectableObservable, ? extends ConnectableObservable> function) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73842n = function;
    }

    public static void setOnFlowableAssembly(@Nullable Function<? super Flowable, ? extends Flowable> function) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73840k = function;
    }

    public static void setOnFlowableSubscribe(@Nullable BiFunction<? super Flowable, ? super Subscriber, ? extends Subscriber> biFunction) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73847s = biFunction;
    }

    public static void setOnMaybeAssembly(@Nullable Function<? super Maybe, ? extends Maybe> function) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73843o = function;
    }

    public static void setOnMaybeSubscribe(@Nullable BiFunction<? super Maybe, MaybeObserver, ? extends MaybeObserver> biFunction) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73848t = biFunction;
    }

    public static void setOnObservableAssembly(@Nullable Function<? super Observable, ? extends Observable> function) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        m = function;
    }

    public static void setOnObservableSubscribe(@Nullable BiFunction<? super Observable, ? super Observer, ? extends Observer> biFunction) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73849u = biFunction;
    }

    public static void setOnParallelAssembly(@Nullable Function<? super ParallelFlowable, ? extends ParallelFlowable> function) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73846r = function;
    }

    public static void setOnSingleAssembly(@Nullable Function<? super Single, ? extends Single> function) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73844p = function;
    }

    public static void setOnSingleSubscribe(@Nullable BiFunction<? super Single, ? super SingleObserver, ? extends SingleObserver> biFunction) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73850v = biFunction;
    }

    public static void setScheduleHandler(@Nullable Function<? super Runnable, ? extends Runnable> function) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73831b = function;
    }

    public static void setSingleSchedulerHandler(@Nullable Function<? super Scheduler, ? extends Scheduler> function) {
        if (f73853y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f73837h = function;
    }

    @NonNull
    public static <T> Flowable<T> onAssembly(@NonNull Flowable<T> flowable) {
        Function<? super Flowable, ? extends Flowable> function = f73840k;
        return function != null ? (Flowable) a(flowable, function) : flowable;
    }

    @NonNull
    public static <T> ConnectableFlowable<T> onAssembly(@NonNull ConnectableFlowable<T> connectableFlowable) {
        Function<? super ConnectableFlowable, ? extends ConnectableFlowable> function = f73841l;
        return function != null ? (ConnectableFlowable) a(connectableFlowable, function) : connectableFlowable;
    }

    @NonNull
    public static <T> Observer<? super T> onSubscribe(@NonNull Observable<T> observable, @NonNull Observer<? super T> observer) {
        BiFunction<? super Observable, ? super Observer, ? extends Observer> biFunction = f73849u;
        if (biFunction == null) {
            return observer;
        }
        try {
            return biFunction.apply(observable, observer);
        } catch (Throwable th2) {
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @NonNull
    public static <T> Observable<T> onAssembly(@NonNull Observable<T> observable) {
        Function<? super Observable, ? extends Observable> function = m;
        return function != null ? (Observable) a(observable, function) : observable;
    }

    @NonNull
    public static <T> ConnectableObservable<T> onAssembly(@NonNull ConnectableObservable<T> connectableObservable) {
        Function<? super ConnectableObservable, ? extends ConnectableObservable> function = f73842n;
        return function != null ? (ConnectableObservable) a(connectableObservable, function) : connectableObservable;
    }

    @NonNull
    public static <T> SingleObserver<? super T> onSubscribe(@NonNull Single<T> single, @NonNull SingleObserver<? super T> singleObserver) {
        BiFunction<? super Single, ? super SingleObserver, ? extends SingleObserver> biFunction = f73850v;
        if (biFunction == null) {
            return singleObserver;
        }
        try {
            return biFunction.apply(single, singleObserver);
        } catch (Throwable th2) {
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @NonNull
    public static <T> Single<T> onAssembly(@NonNull Single<T> single) {
        Function<? super Single, ? extends Single> function = f73844p;
        return function != null ? (Single) a(single, function) : single;
    }

    @NonNull
    public static Completable onAssembly(@NonNull Completable completable) {
        Function<? super Completable, ? extends Completable> function = f73845q;
        return function != null ? (Completable) a(completable, function) : completable;
    }

    @NonNull
    public static CompletableObserver onSubscribe(@NonNull Completable completable, @NonNull CompletableObserver completableObserver) {
        BiFunction<? super Completable, ? super CompletableObserver, ? extends CompletableObserver> biFunction = f73851w;
        if (biFunction == null) {
            return completableObserver;
        }
        try {
            return biFunction.apply(completable, completableObserver);
        } catch (Throwable th2) {
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @NonNull
    public static <T> ParallelFlowable<T> onAssembly(@NonNull ParallelFlowable<T> parallelFlowable) {
        Function<? super ParallelFlowable, ? extends ParallelFlowable> function = f73846r;
        return function != null ? (ParallelFlowable) a(parallelFlowable, function) : parallelFlowable;
    }

    @NonNull
    public static <T> MaybeObserver<? super T> onSubscribe(@NonNull Maybe<T> maybe, @NonNull MaybeObserver<? super T> maybeObserver) {
        BiFunction<? super Maybe, ? super MaybeObserver, ? extends MaybeObserver> biFunction = f73848t;
        if (biFunction == null) {
            return maybeObserver;
        }
        try {
            return biFunction.apply(maybe, maybeObserver);
        } catch (Throwable th2) {
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }
}
