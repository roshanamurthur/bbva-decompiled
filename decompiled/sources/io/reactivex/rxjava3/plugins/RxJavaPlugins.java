package io.reactivex.rxjava3.plugins;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import io.reactivex.rxjava3.flowables.ConnectableFlowable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.schedulers.ComputationScheduler;
import io.reactivex.rxjava3.internal.schedulers.IoScheduler;
import io.reactivex.rxjava3.internal.schedulers.NewThreadScheduler;
import io.reactivex.rxjava3.internal.schedulers.SingleScheduler;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class RxJavaPlugins {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static volatile Consumer<? super Throwable> f78239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Runnable, ? extends Runnable> f78240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Supplier<Scheduler>, ? extends Scheduler> f78241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Supplier<Scheduler>, ? extends Scheduler> f78242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Supplier<Scheduler>, ? extends Scheduler> f78243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Supplier<Scheduler>, ? extends Scheduler> f78244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Scheduler, ? extends Scheduler> f78245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Scheduler, ? extends Scheduler> f78246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Scheduler, ? extends Scheduler> f78247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Scheduler, ? extends Scheduler> f78248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Flowable, ? extends Flowable> f78249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super ConnectableFlowable, ? extends ConnectableFlowable> f78250l;

    @Nullable
    public static volatile Function<? super Observable, ? extends Observable> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super ConnectableObservable, ? extends ConnectableObservable> f78251n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Maybe, ? extends Maybe> f78252o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Single, ? extends Single> f78253p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super Completable, ? extends Completable> f78254q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public static volatile Function<? super ParallelFlowable, ? extends ParallelFlowable> f78255r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public static volatile BiFunction<? super Flowable, ? super Subscriber, ? extends Subscriber> f78256s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public static volatile BiFunction<? super Maybe, ? super MaybeObserver, ? extends MaybeObserver> f78257t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public static volatile BiFunction<? super Observable, ? super Observer, ? extends Observer> f78258u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public static volatile BiFunction<? super Single, ? super SingleObserver, ? extends SingleObserver> f78259v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public static volatile BiFunction<? super Completable, ? super CompletableObserver, ? extends CompletableObserver> f78260w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public static volatile BooleanSupplier f78261x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static volatile boolean f78262y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static volatile boolean f78263z;

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
    public static Scheduler b(@NonNull Supplier<Scheduler> supplier) {
        try {
            Scheduler scheduler = supplier.get();
            Objects.requireNonNull(scheduler, "Scheduler Supplier result can't be null");
            return scheduler;
        } catch (Throwable th2) {
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @NonNull
    public static Scheduler createComputationScheduler(@NonNull ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new ComputationScheduler(threadFactory);
    }

    @NonNull
    public static Scheduler createIoScheduler(@NonNull ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new IoScheduler(threadFactory);
    }

    @NonNull
    public static Scheduler createNewThreadScheduler(@NonNull ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new NewThreadScheduler(threadFactory);
    }

    @NonNull
    public static Scheduler createSingleScheduler(@NonNull ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new SingleScheduler(threadFactory);
    }

    @Nullable
    public static Function<? super Scheduler, ? extends Scheduler> getComputationSchedulerHandler() {
        return f78245g;
    }

    @Nullable
    public static Consumer<? super Throwable> getErrorHandler() {
        return f78239a;
    }

    @Nullable
    public static Function<? super Supplier<Scheduler>, ? extends Scheduler> getInitComputationSchedulerHandler() {
        return f78241c;
    }

    @Nullable
    public static Function<? super Supplier<Scheduler>, ? extends Scheduler> getInitIoSchedulerHandler() {
        return f78243e;
    }

    @Nullable
    public static Function<? super Supplier<Scheduler>, ? extends Scheduler> getInitNewThreadSchedulerHandler() {
        return f78244f;
    }

    @Nullable
    public static Function<? super Supplier<Scheduler>, ? extends Scheduler> getInitSingleSchedulerHandler() {
        return f78242d;
    }

    @Nullable
    public static Function<? super Scheduler, ? extends Scheduler> getIoSchedulerHandler() {
        return f78247i;
    }

    @Nullable
    public static Function<? super Scheduler, ? extends Scheduler> getNewThreadSchedulerHandler() {
        return f78248j;
    }

    @Nullable
    public static BooleanSupplier getOnBeforeBlocking() {
        return f78261x;
    }

    @Nullable
    public static Function<? super Completable, ? extends Completable> getOnCompletableAssembly() {
        return f78254q;
    }

    @Nullable
    public static BiFunction<? super Completable, ? super CompletableObserver, ? extends CompletableObserver> getOnCompletableSubscribe() {
        return f78260w;
    }

    @Nullable
    public static Function<? super ConnectableFlowable, ? extends ConnectableFlowable> getOnConnectableFlowableAssembly() {
        return f78250l;
    }

    @Nullable
    public static Function<? super ConnectableObservable, ? extends ConnectableObservable> getOnConnectableObservableAssembly() {
        return f78251n;
    }

    @Nullable
    public static Function<? super Flowable, ? extends Flowable> getOnFlowableAssembly() {
        return f78249k;
    }

    @Nullable
    public static BiFunction<? super Flowable, ? super Subscriber, ? extends Subscriber> getOnFlowableSubscribe() {
        return f78256s;
    }

    @Nullable
    public static Function<? super Maybe, ? extends Maybe> getOnMaybeAssembly() {
        return f78252o;
    }

    @Nullable
    public static BiFunction<? super Maybe, ? super MaybeObserver, ? extends MaybeObserver> getOnMaybeSubscribe() {
        return f78257t;
    }

    @Nullable
    public static Function<? super Observable, ? extends Observable> getOnObservableAssembly() {
        return m;
    }

    @Nullable
    public static BiFunction<? super Observable, ? super Observer, ? extends Observer> getOnObservableSubscribe() {
        return f78258u;
    }

    @Nullable
    public static Function<? super ParallelFlowable, ? extends ParallelFlowable> getOnParallelAssembly() {
        return f78255r;
    }

    @Nullable
    public static Function<? super Single, ? extends Single> getOnSingleAssembly() {
        return f78253p;
    }

    @Nullable
    public static BiFunction<? super Single, ? super SingleObserver, ? extends SingleObserver> getOnSingleSubscribe() {
        return f78259v;
    }

    @Nullable
    public static Function<? super Runnable, ? extends Runnable> getScheduleHandler() {
        return f78240b;
    }

    @Nullable
    public static Function<? super Scheduler, ? extends Scheduler> getSingleSchedulerHandler() {
        return f78246h;
    }

    @NonNull
    public static Scheduler initComputationScheduler(@NonNull Supplier<Scheduler> supplier) {
        Objects.requireNonNull(supplier, "Scheduler Supplier can't be null");
        Function<? super Supplier<Scheduler>, ? extends Scheduler> function = f78241c;
        if (function == null) {
            return b(supplier);
        }
        Object objA = a(supplier, function);
        Objects.requireNonNull(objA, "Scheduler Supplier result can't be null");
        return (Scheduler) objA;
    }

    @NonNull
    public static Scheduler initIoScheduler(@NonNull Supplier<Scheduler> supplier) {
        Objects.requireNonNull(supplier, "Scheduler Supplier can't be null");
        Function<? super Supplier<Scheduler>, ? extends Scheduler> function = f78243e;
        if (function == null) {
            return b(supplier);
        }
        Object objA = a(supplier, function);
        Objects.requireNonNull(objA, "Scheduler Supplier result can't be null");
        return (Scheduler) objA;
    }

    @NonNull
    public static Scheduler initNewThreadScheduler(@NonNull Supplier<Scheduler> supplier) {
        Objects.requireNonNull(supplier, "Scheduler Supplier can't be null");
        Function<? super Supplier<Scheduler>, ? extends Scheduler> function = f78244f;
        if (function == null) {
            return b(supplier);
        }
        Object objA = a(supplier, function);
        Objects.requireNonNull(objA, "Scheduler Supplier result can't be null");
        return (Scheduler) objA;
    }

    @NonNull
    public static Scheduler initSingleScheduler(@NonNull Supplier<Scheduler> supplier) {
        Objects.requireNonNull(supplier, "Scheduler Supplier can't be null");
        Function<? super Supplier<Scheduler>, ? extends Scheduler> function = f78242d;
        if (function == null) {
            return b(supplier);
        }
        Object objA = a(supplier, function);
        Objects.requireNonNull(objA, "Scheduler Supplier result can't be null");
        return (Scheduler) objA;
    }

    public static boolean isFailOnNonBlockingScheduler() {
        return f78263z;
    }

    public static boolean isLockdown() {
        return f78262y;
    }

    public static void lockdown() {
        f78262y = true;
    }

    @NonNull
    public static <T> Maybe<T> onAssembly(@NonNull Maybe<T> maybe) {
        Function<? super Maybe, ? extends Maybe> function = f78252o;
        return function != null ? (Maybe) a(maybe, function) : maybe;
    }

    public static boolean onBeforeBlocking() {
        BooleanSupplier booleanSupplier = f78261x;
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
        Function<? super Scheduler, ? extends Scheduler> function = f78245g;
        return function == null ? scheduler : (Scheduler) a(scheduler, function);
    }

    public static void onError(@NonNull Throwable th2) {
        Consumer<? super Throwable> consumer = f78239a;
        if (th2 == null) {
            th2 = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
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
        Function<? super Scheduler, ? extends Scheduler> function = f78247i;
        return function == null ? scheduler : (Scheduler) a(scheduler, function);
    }

    @NonNull
    public static Scheduler onNewThreadScheduler(@NonNull Scheduler scheduler) {
        Function<? super Scheduler, ? extends Scheduler> function = f78248j;
        return function == null ? scheduler : (Scheduler) a(scheduler, function);
    }

    @NonNull
    public static Runnable onSchedule(@NonNull Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        Function<? super Runnable, ? extends Runnable> function = f78240b;
        return function == null ? runnable : (Runnable) a(runnable, function);
    }

    @NonNull
    public static Scheduler onSingleScheduler(@NonNull Scheduler scheduler) {
        Function<? super Scheduler, ? extends Scheduler> function = f78246h;
        return function == null ? scheduler : (Scheduler) a(scheduler, function);
    }

    @NonNull
    public static <T> Subscriber<? super T> onSubscribe(@NonNull Flowable<T> flowable, @NonNull Subscriber<? super T> subscriber) {
        BiFunction<? super Flowable, ? super Subscriber, ? extends Subscriber> biFunction = f78256s;
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
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78245g = function;
    }

    public static void setErrorHandler(@Nullable Consumer<? super Throwable> consumer) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78239a = consumer;
    }

    public static void setFailOnNonBlockingScheduler(boolean z10) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78263z = z10;
    }

    public static void setInitComputationSchedulerHandler(@Nullable Function<? super Supplier<Scheduler>, ? extends Scheduler> function) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78241c = function;
    }

    public static void setInitIoSchedulerHandler(@Nullable Function<? super Supplier<Scheduler>, ? extends Scheduler> function) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78243e = function;
    }

    public static void setInitNewThreadSchedulerHandler(@Nullable Function<? super Supplier<Scheduler>, ? extends Scheduler> function) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78244f = function;
    }

    public static void setInitSingleSchedulerHandler(@Nullable Function<? super Supplier<Scheduler>, ? extends Scheduler> function) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78242d = function;
    }

    public static void setIoSchedulerHandler(@Nullable Function<? super Scheduler, ? extends Scheduler> function) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78247i = function;
    }

    public static void setNewThreadSchedulerHandler(@Nullable Function<? super Scheduler, ? extends Scheduler> function) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78248j = function;
    }

    public static void setOnBeforeBlocking(@Nullable BooleanSupplier booleanSupplier) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78261x = booleanSupplier;
    }

    public static void setOnCompletableAssembly(@Nullable Function<? super Completable, ? extends Completable> function) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78254q = function;
    }

    public static void setOnCompletableSubscribe(@Nullable BiFunction<? super Completable, ? super CompletableObserver, ? extends CompletableObserver> biFunction) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78260w = biFunction;
    }

    public static void setOnConnectableFlowableAssembly(@Nullable Function<? super ConnectableFlowable, ? extends ConnectableFlowable> function) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78250l = function;
    }

    public static void setOnConnectableObservableAssembly(@Nullable Function<? super ConnectableObservable, ? extends ConnectableObservable> function) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78251n = function;
    }

    public static void setOnFlowableAssembly(@Nullable Function<? super Flowable, ? extends Flowable> function) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78249k = function;
    }

    public static void setOnFlowableSubscribe(@Nullable BiFunction<? super Flowable, ? super Subscriber, ? extends Subscriber> biFunction) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78256s = biFunction;
    }

    public static void setOnMaybeAssembly(@Nullable Function<? super Maybe, ? extends Maybe> function) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78252o = function;
    }

    public static void setOnMaybeSubscribe(@Nullable BiFunction<? super Maybe, MaybeObserver, ? extends MaybeObserver> biFunction) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78257t = biFunction;
    }

    public static void setOnObservableAssembly(@Nullable Function<? super Observable, ? extends Observable> function) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        m = function;
    }

    public static void setOnObservableSubscribe(@Nullable BiFunction<? super Observable, ? super Observer, ? extends Observer> biFunction) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78258u = biFunction;
    }

    public static void setOnParallelAssembly(@Nullable Function<? super ParallelFlowable, ? extends ParallelFlowable> function) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78255r = function;
    }

    public static void setOnSingleAssembly(@Nullable Function<? super Single, ? extends Single> function) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78253p = function;
    }

    public static void setOnSingleSubscribe(@Nullable BiFunction<? super Single, ? super SingleObserver, ? extends SingleObserver> biFunction) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78259v = biFunction;
    }

    public static void setScheduleHandler(@Nullable Function<? super Runnable, ? extends Runnable> function) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78240b = function;
    }

    public static void setSingleSchedulerHandler(@Nullable Function<? super Scheduler, ? extends Scheduler> function) {
        if (f78262y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f78246h = function;
    }

    @NonNull
    public static <T> Flowable<T> onAssembly(@NonNull Flowable<T> flowable) {
        Function<? super Flowable, ? extends Flowable> function = f78249k;
        return function != null ? (Flowable) a(flowable, function) : flowable;
    }

    @NonNull
    public static <T> ConnectableFlowable<T> onAssembly(@NonNull ConnectableFlowable<T> connectableFlowable) {
        Function<? super ConnectableFlowable, ? extends ConnectableFlowable> function = f78250l;
        return function != null ? (ConnectableFlowable) a(connectableFlowable, function) : connectableFlowable;
    }

    @NonNull
    public static <T> Observer<? super T> onSubscribe(@NonNull Observable<T> observable, @NonNull Observer<? super T> observer) {
        BiFunction<? super Observable, ? super Observer, ? extends Observer> biFunction = f78258u;
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
        Function<? super ConnectableObservable, ? extends ConnectableObservable> function = f78251n;
        return function != null ? (ConnectableObservable) a(connectableObservable, function) : connectableObservable;
    }

    @NonNull
    public static <T> SingleObserver<? super T> onSubscribe(@NonNull Single<T> single, @NonNull SingleObserver<? super T> singleObserver) {
        BiFunction<? super Single, ? super SingleObserver, ? extends SingleObserver> biFunction = f78259v;
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
        Function<? super Single, ? extends Single> function = f78253p;
        return function != null ? (Single) a(single, function) : single;
    }

    @NonNull
    public static Completable onAssembly(@NonNull Completable completable) {
        Function<? super Completable, ? extends Completable> function = f78254q;
        return function != null ? (Completable) a(completable, function) : completable;
    }

    @NonNull
    public static CompletableObserver onSubscribe(@NonNull Completable completable, @NonNull CompletableObserver completableObserver) {
        BiFunction<? super Completable, ? super CompletableObserver, ? extends CompletableObserver> biFunction = f78260w;
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
        Function<? super ParallelFlowable, ? extends ParallelFlowable> function = f78255r;
        return function != null ? (ParallelFlowable) a(parallelFlowable, function) : parallelFlowable;
    }

    @NonNull
    public static <T> MaybeObserver<? super T> onSubscribe(@NonNull Maybe<T> maybe, @NonNull MaybeObserver<? super T> maybeObserver) {
        BiFunction<? super Maybe, ? super MaybeObserver, ? extends MaybeObserver> biFunction = f78257t;
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
