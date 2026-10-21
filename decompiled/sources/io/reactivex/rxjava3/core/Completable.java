package io.reactivex.rxjava3.core;

import com.adobe.marketing.mobile.EventDataKeys;
import com.mypinpad.tsdk.isolation.j4;
import io.reactivex.rxjava3.annotations.BackpressureKind;
import io.reactivex.rxjava3.annotations.BackpressureSupport;
import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.fuseable.FuseToMaybe;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.internal.jdk8.CompletableFromCompletionStage;
import io.reactivex.rxjava3.internal.jdk8.CompletionStageConsumer;
import io.reactivex.rxjava3.internal.observers.BlockingDisposableMultiObserver;
import io.reactivex.rxjava3.internal.observers.BlockingMultiObserver;
import io.reactivex.rxjava3.internal.observers.CallbackCompletableObserver;
import io.reactivex.rxjava3.internal.observers.EmptyCompletableObserver;
import io.reactivex.rxjava3.internal.observers.FutureMultiObserver;
import io.reactivex.rxjava3.internal.observers.SafeCompletableObserver;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAmb;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCache;
import io.reactivex.rxjava3.internal.operators.completable.CompletableConcat;
import io.reactivex.rxjava3.internal.operators.completable.CompletableConcatArray;
import io.reactivex.rxjava3.internal.operators.completable.CompletableConcatIterable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDefer;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDelay;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDetach;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDisposeOn;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDoFinally;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDoOnEvent;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableError;
import io.reactivex.rxjava3.internal.operators.completable.CompletableErrorSupplier;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromCallable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromObservable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromPublisher;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromRunnable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromSingle;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromSupplier;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromUnsafeSource;
import io.reactivex.rxjava3.internal.operators.completable.CompletableHide;
import io.reactivex.rxjava3.internal.operators.completable.CompletableLift;
import io.reactivex.rxjava3.internal.operators.completable.CompletableMaterialize;
import io.reactivex.rxjava3.internal.operators.completable.CompletableMerge;
import io.reactivex.rxjava3.internal.operators.completable.CompletableMergeArray;
import io.reactivex.rxjava3.internal.operators.completable.CompletableMergeArrayDelayError;
import io.reactivex.rxjava3.internal.operators.completable.CompletableMergeDelayErrorIterable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableMergeIterable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableNever;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorReturn;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import io.reactivex.rxjava3.internal.operators.completable.CompletableResumeNext;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.rxjava3.internal.operators.completable.CompletableTakeUntilCompletable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableTimeout;
import io.reactivex.rxjava3.internal.operators.completable.CompletableTimer;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToFlowable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToObservable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToSingle;
import io.reactivex.rxjava3.internal.operators.completable.CompletableUsing;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeDelayWithCompletable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFromCompletable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeIgnoreElementCompletable;
import io.reactivex.rxjava3.internal.operators.mixed.CompletableAndThenObservable;
import io.reactivex.rxjava3.internal.operators.mixed.CompletableAndThenPublisher;
import io.reactivex.rxjava3.internal.operators.mixed.FlowableSwitchMapCompletablePublisher;
import io.reactivex.rxjava3.internal.operators.single.SingleDelayWithCompletable;
import io.reactivex.rxjava3.observers.TestObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Completable implements CompletableSource {
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable amb(@NonNull Iterable<? extends CompletableSource> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new CompletableAmb(null, iterable));
    }

    @CheckReturnValue
    @NonNull
    @SafeVarargs
    @SchedulerSupport("none")
    public static Completable ambArray(@NonNull CompletableSource... completableSourceArr) {
        Objects.requireNonNull(completableSourceArr, "sources is null");
        if (completableSourceArr.length == 0) {
            return complete();
        }
        return completableSourceArr.length == 1 ? wrap(completableSourceArr[0]) : RxJavaPlugins.onAssembly(new CompletableAmb(completableSourceArr, null));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static Completable b(@NonNull Publisher<? extends CompletableSource> publisher, int i10, boolean z10) {
        Objects.requireNonNull(publisher, "sources is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new CompletableMerge(publisher, i10, z10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable complete() {
        return RxJavaPlugins.onAssembly(CompletableEmpty.INSTANCE);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable concat(@NonNull Iterable<? extends CompletableSource> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new CompletableConcatIterable(iterable));
    }

    @CheckReturnValue
    @NonNull
    @SafeVarargs
    @SchedulerSupport("none")
    public static Completable concatArray(@NonNull CompletableSource... completableSourceArr) {
        Objects.requireNonNull(completableSourceArr, "sources is null");
        if (completableSourceArr.length == 0) {
            return complete();
        }
        return completableSourceArr.length == 1 ? wrap(completableSourceArr[0]) : RxJavaPlugins.onAssembly(new CompletableConcatArray(completableSourceArr));
    }

    @CheckReturnValue
    @NonNull
    @SafeVarargs
    @SchedulerSupport("none")
    public static Completable concatArrayDelayError(@NonNull CompletableSource... completableSourceArr) {
        return Flowable.fromArray(completableSourceArr).concatMapCompletableDelayError(Functions.identity(), true, 2);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable concatDelayError(@NonNull Iterable<? extends CompletableSource> iterable) {
        return Flowable.fromIterable(iterable).concatMapCompletableDelayError(Functions.identity());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable create(@NonNull CompletableOnSubscribe completableOnSubscribe) {
        Objects.requireNonNull(completableOnSubscribe, "source is null");
        return RxJavaPlugins.onAssembly(new CompletableCreate(completableOnSubscribe));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable defer(@NonNull Supplier<? extends CompletableSource> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return RxJavaPlugins.onAssembly(new CompletableDefer(supplier));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable error(@NonNull Supplier<? extends Throwable> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return RxJavaPlugins.onAssembly(new CompletableErrorSupplier(supplier));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable fromAction(@NonNull Action action) {
        Objects.requireNonNull(action, "action is null");
        return RxJavaPlugins.onAssembly(new CompletableFromAction(action));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable fromCallable(@NonNull Callable<?> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return RxJavaPlugins.onAssembly(new CompletableFromCallable(callable));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable fromCompletionStage(@NonNull CompletionStage<?> completionStage) {
        Objects.requireNonNull(completionStage, "stage is null");
        return RxJavaPlugins.onAssembly(new CompletableFromCompletionStage(completionStage));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable fromFuture(@NonNull Future<?> future) {
        Objects.requireNonNull(future, "future is null");
        return fromAction(Functions.futureAction(future));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Completable fromMaybe(@NonNull MaybeSource<T> maybeSource) {
        Objects.requireNonNull(maybeSource, "maybe is null");
        return RxJavaPlugins.onAssembly(new MaybeIgnoreElementCompletable(maybeSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Completable fromObservable(@NonNull ObservableSource<T> observableSource) {
        Objects.requireNonNull(observableSource, "observable is null");
        return RxJavaPlugins.onAssembly(new CompletableFromObservable(observableSource));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public static <T> Completable fromPublisher(@NonNull Publisher<T> publisher) {
        Objects.requireNonNull(publisher, "publisher is null");
        return RxJavaPlugins.onAssembly(new CompletableFromPublisher(publisher));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable fromRunnable(@NonNull Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        return RxJavaPlugins.onAssembly(new CompletableFromRunnable(runnable));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Completable fromSingle(@NonNull SingleSource<T> singleSource) {
        Objects.requireNonNull(singleSource, "single is null");
        return RxJavaPlugins.onAssembly(new CompletableFromSingle(singleSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable fromSupplier(@NonNull Supplier<?> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return RxJavaPlugins.onAssembly(new CompletableFromSupplier(supplier));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable merge(@NonNull Iterable<? extends CompletableSource> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new CompletableMergeIterable(iterable));
    }

    @CheckReturnValue
    @NonNull
    @SafeVarargs
    @SchedulerSupport("none")
    public static Completable mergeArray(@NonNull CompletableSource... completableSourceArr) {
        Objects.requireNonNull(completableSourceArr, "sources is null");
        if (completableSourceArr.length == 0) {
            return complete();
        }
        return completableSourceArr.length == 1 ? wrap(completableSourceArr[0]) : RxJavaPlugins.onAssembly(new CompletableMergeArray(completableSourceArr));
    }

    @CheckReturnValue
    @NonNull
    @SafeVarargs
    @SchedulerSupport("none")
    public static Completable mergeArrayDelayError(@NonNull CompletableSource... completableSourceArr) {
        Objects.requireNonNull(completableSourceArr, "sources is null");
        return RxJavaPlugins.onAssembly(new CompletableMergeArrayDelayError(completableSourceArr));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable mergeDelayError(@NonNull Iterable<? extends CompletableSource> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new CompletableMergeDelayErrorIterable(iterable));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable never() {
        return RxJavaPlugins.onAssembly(CompletableNever.INSTANCE);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Single<Boolean> sequenceEqual(@NonNull CompletableSource completableSource, @NonNull CompletableSource completableSource2) {
        Objects.requireNonNull(completableSource, "source1 is null");
        Objects.requireNonNull(completableSource2, "source2 is null");
        return mergeArrayDelayError(completableSource, completableSource2).andThen(Single.just(Boolean.TRUE));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public static Completable switchOnNext(@NonNull Publisher<? extends CompletableSource> publisher) {
        Objects.requireNonNull(publisher, "sources is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchMapCompletablePublisher(publisher, Functions.identity(), false));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public static Completable switchOnNextDelayError(@NonNull Publisher<? extends CompletableSource> publisher) {
        Objects.requireNonNull(publisher, "sources is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchMapCompletablePublisher(publisher, Functions.identity(), true));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public static Completable timer(long j10, @NonNull TimeUnit timeUnit) {
        return timer(j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable unsafeCreate(@NonNull CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "onSubscribe is null");
        if (completableSource instanceof Completable) {
            throw new IllegalArgumentException("Use of unsafeCreate(Completable)!");
        }
        return RxJavaPlugins.onAssembly(new CompletableFromUnsafeSource(completableSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <R> Completable using(@NonNull Supplier<R> supplier, @NonNull Function<? super R, ? extends CompletableSource> function, @NonNull Consumer<? super R> consumer) {
        return using(supplier, function, consumer, true);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable wrap(@NonNull CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "source is null");
        return completableSource instanceof Completable ? RxJavaPlugins.onAssembly((Completable) completableSource) : RxJavaPlugins.onAssembly(new CompletableFromUnsafeSource(completableSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable a(Consumer<? super Disposable> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2, Action action3, Action action4) {
        Objects.requireNonNull(consumer, "onSubscribe is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        Objects.requireNonNull(action2, "onTerminate is null");
        Objects.requireNonNull(action3, "onAfterTerminate is null");
        Objects.requireNonNull(action4, "onDispose is null");
        return RxJavaPlugins.onAssembly(new CompletablePeek(this, consumer, consumer2, action, action2, action3, action4));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable ambWith(@NonNull CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return ambArray(this, completableSource);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <T> Observable<T> andThen(@NonNull ObservableSource<T> observableSource) {
        Objects.requireNonNull(observableSource, "next is null");
        return RxJavaPlugins.onAssembly(new CompletableAndThenObservable(this, observableSource));
    }

    @SchedulerSupport("none")
    public final void blockingAwait() {
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        subscribe(blockingMultiObserver);
        blockingMultiObserver.blockingGet();
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe() {
        blockingSubscribe(Functions.EMPTY_ACTION, Functions.ERROR_CONSUMER);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Completable c(long j10, TimeUnit timeUnit, Scheduler scheduler, CompletableSource completableSource) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableTimeout(this, j10, timeUnit, scheduler, completableSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable cache() {
        return RxJavaPlugins.onAssembly(new CompletableCache(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable compose(@NonNull CompletableTransformer completableTransformer) {
        Objects.requireNonNull(completableTransformer, "transformer is null");
        return wrap(completableTransformer.apply(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable concatWith(@NonNull CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return RxJavaPlugins.onAssembly(new CompletableAndThenCompletable(this, completableSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Completable delay(long j10, @NonNull TimeUnit timeUnit) {
        return delay(j10, timeUnit, Schedulers.computation(), false);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Completable delaySubscription(long j10, @NonNull TimeUnit timeUnit) {
        return delaySubscription(j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable doAfterTerminate(@NonNull Action action) {
        Consumer<? super Disposable> consumerEmptyConsumer = Functions.emptyConsumer();
        Consumer<? super Throwable> consumerEmptyConsumer2 = Functions.emptyConsumer();
        Action action2 = Functions.EMPTY_ACTION;
        return a(consumerEmptyConsumer, consumerEmptyConsumer2, action2, action2, action, action2);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable doFinally(@NonNull Action action) {
        Objects.requireNonNull(action, "onFinally is null");
        return RxJavaPlugins.onAssembly(new CompletableDoFinally(this, action));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable doOnComplete(@NonNull Action action) {
        Consumer<? super Disposable> consumerEmptyConsumer = Functions.emptyConsumer();
        Consumer<? super Throwable> consumerEmptyConsumer2 = Functions.emptyConsumer();
        Action action2 = Functions.EMPTY_ACTION;
        return a(consumerEmptyConsumer, consumerEmptyConsumer2, action, action2, action2, action2);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable doOnDispose(@NonNull Action action) {
        Consumer<? super Disposable> consumerEmptyConsumer = Functions.emptyConsumer();
        Consumer<? super Throwable> consumerEmptyConsumer2 = Functions.emptyConsumer();
        Action action2 = Functions.EMPTY_ACTION;
        return a(consumerEmptyConsumer, consumerEmptyConsumer2, action2, action2, action2, action);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable doOnError(@NonNull Consumer<? super Throwable> consumer) {
        Consumer<? super Disposable> consumerEmptyConsumer = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        return a(consumerEmptyConsumer, consumer, action, action, action, action);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable doOnEvent(@NonNull Consumer<? super Throwable> consumer) {
        Objects.requireNonNull(consumer, "onEvent is null");
        return RxJavaPlugins.onAssembly(new CompletableDoOnEvent(this, consumer));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable doOnLifecycle(@NonNull Consumer<? super Disposable> consumer, @NonNull Action action) {
        Consumer<? super Throwable> consumerEmptyConsumer = Functions.emptyConsumer();
        Action action2 = Functions.EMPTY_ACTION;
        return a(consumer, consumerEmptyConsumer, action2, action2, action2, action);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable doOnSubscribe(@NonNull Consumer<? super Disposable> consumer) {
        Consumer<? super Throwable> consumerEmptyConsumer = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        return a(consumer, consumerEmptyConsumer, action, action, action, action);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable doOnTerminate(@NonNull Action action) {
        Consumer<? super Disposable> consumerEmptyConsumer = Functions.emptyConsumer();
        Consumer<? super Throwable> consumerEmptyConsumer2 = Functions.emptyConsumer();
        Action action2 = Functions.EMPTY_ACTION;
        return a(consumerEmptyConsumer, consumerEmptyConsumer2, action2, action, action2, action2);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable hide() {
        return RxJavaPlugins.onAssembly(new CompletableHide(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable lift(@NonNull CompletableOperator completableOperator) {
        Objects.requireNonNull(completableOperator, "onLift is null");
        return RxJavaPlugins.onAssembly(new CompletableLift(this, completableOperator));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <T> Single<Notification<T>> materialize() {
        return RxJavaPlugins.onAssembly(new CompletableMaterialize(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable mergeWith(@NonNull CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return mergeArray(this, completableSource);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Completable observeOn(@NonNull Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableObserveOn(this, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable onErrorComplete() {
        return onErrorComplete(Functions.alwaysTrue());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable onErrorResumeNext(@NonNull Function<? super Throwable, ? extends CompletableSource> function) {
        Objects.requireNonNull(function, "fallbackSupplier is null");
        return RxJavaPlugins.onAssembly(new CompletableResumeNext(this, function));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable onErrorResumeWith(@NonNull CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "fallback is null");
        return onErrorResumeNext(Functions.justFunction(completableSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <T> Maybe<T> onErrorReturn(@NonNull Function<? super Throwable, ? extends T> function) {
        Objects.requireNonNull(function, "itemSupplier is null");
        return RxJavaPlugins.onAssembly(new CompletableOnErrorReturn(this, function));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <T> Maybe<T> onErrorReturnItem(@NonNull T t10) {
        Objects.requireNonNull(t10, "item is null");
        return onErrorReturn(Functions.justFunction(t10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable onTerminateDetach() {
        return RxJavaPlugins.onAssembly(new CompletableDetach(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable repeat() {
        return fromPublisher(toFlowable().repeat());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable repeatUntil(@NonNull BooleanSupplier booleanSupplier) {
        return fromPublisher(toFlowable().repeatUntil(booleanSupplier));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable repeatWhen(@NonNull Function<? super Flowable<Object>, ? extends Publisher<?>> function) {
        return fromPublisher(toFlowable().repeatWhen(function));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable retry() {
        return fromPublisher(toFlowable().retry());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable retryUntil(@NonNull BooleanSupplier booleanSupplier) {
        Objects.requireNonNull(booleanSupplier, "stop is null");
        return retry(Long.MAX_VALUE, Functions.predicateReverseFor(booleanSupplier));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable retryWhen(@NonNull Function<? super Flowable<Throwable>, ? extends Publisher<?>> function) {
        return fromPublisher(toFlowable().retryWhen(function));
    }

    @SchedulerSupport("none")
    public final void safeSubscribe(@NonNull CompletableObserver completableObserver) {
        Objects.requireNonNull(completableObserver, "observer is null");
        subscribe(new SafeCompletableObserver(completableObserver));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable startWith(@NonNull CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return concatArray(completableSource, this);
    }

    @NonNull
    @SchedulerSupport("none")
    public final Disposable subscribe() {
        EmptyCompletableObserver emptyCompletableObserver = new EmptyCompletableObserver();
        subscribe(emptyCompletableObserver);
        return emptyCompletableObserver;
    }

    public abstract void subscribeActual(@NonNull CompletableObserver completableObserver);

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Completable subscribeOn(@NonNull Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableSubscribeOn(this, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <E extends CompletableObserver> E subscribeWith(E e5) {
        subscribe(e5);
        return e5;
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable takeUntil(@NonNull CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return RxJavaPlugins.onAssembly(new CompletableTakeUntilCompletable(this, completableSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final TestObserver<Void> test() {
        TestObserver<Void> testObserver = new TestObserver<>();
        subscribe(testObserver);
        return testObserver;
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Completable timeout(long j10, @NonNull TimeUnit timeUnit) {
        return c(j10, timeUnit, Schedulers.computation(), null);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> R to(@NonNull CompletableConverter<? extends R> completableConverter) {
        Objects.requireNonNull(completableConverter, "converter is null");
        return completableConverter.apply(this);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <T> CompletionStage<T> toCompletionStage(@Nullable T t10) {
        return j4.c(subscribeWith(new CompletionStageConsumer(true, t10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <T> Flowable<T> toFlowable() {
        return this instanceof FuseToFlowable ? ((FuseToFlowable) this).fuseToFlowable() : RxJavaPlugins.onAssembly(new CompletableToFlowable(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Future<Void> toFuture() {
        return (Future) subscribeWith(new FutureMultiObserver());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <T> Maybe<T> toMaybe() {
        return this instanceof FuseToMaybe ? ((FuseToMaybe) this).fuseToMaybe() : RxJavaPlugins.onAssembly(new MaybeFromCompletable(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <T> Observable<T> toObservable() {
        return this instanceof FuseToObservable ? ((FuseToObservable) this).fuseToObservable() : RxJavaPlugins.onAssembly(new CompletableToObservable(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <T> Single<T> toSingle(@NonNull Supplier<? extends T> supplier) {
        Objects.requireNonNull(supplier, "completionValueSupplier is null");
        return RxJavaPlugins.onAssembly(new CompletableToSingle(this, supplier, null));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <T> Single<T> toSingleDefault(T t10) {
        Objects.requireNonNull(t10, "completionValue is null");
        return RxJavaPlugins.onAssembly(new CompletableToSingle(this, null, t10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Completable unsubscribeOn(@NonNull Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableDisposeOn(this, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static Completable concatDelayError(@NonNull Publisher<? extends CompletableSource> publisher) {
        return concatDelayError(publisher, 2);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public static Completable timer(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableTimer(j10, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <R> Completable using(@NonNull Supplier<R> supplier, @NonNull Function<? super R, ? extends CompletableSource> function, @NonNull Consumer<? super R> consumer, boolean z10) {
        Objects.requireNonNull(supplier, "resourceSupplier is null");
        Objects.requireNonNull(function, "sourceSupplier is null");
        Objects.requireNonNull(consumer, "resourceCleanup is null");
        return RxJavaPlugins.onAssembly(new CompletableUsing(supplier, function, consumer, z10));
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(@NonNull Action action) {
        blockingSubscribe(action, Functions.ERROR_CONSUMER);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Completable delay(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return delay(j10, timeUnit, scheduler, false);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Completable delaySubscription(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return timer(j10, timeUnit, scheduler).andThen(this);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable onErrorComplete(@NonNull Predicate<? super Throwable> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new CompletableOnErrorComplete(this, predicate));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable repeat(long j10) {
        return fromPublisher(toFlowable().repeat(j10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable retry(@NonNull BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        return fromPublisher(toFlowable().retry(biPredicate));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Completable timeout(long j10, @NonNull TimeUnit timeUnit, @NonNull CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "fallback is null");
        return c(j10, timeUnit, Schedulers.computation(), completableSource);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static Completable concat(@NonNull Publisher<? extends CompletableSource> publisher) {
        return concat(publisher, 2);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static Completable concatDelayError(@NonNull Publisher<? extends CompletableSource> publisher, int i10) {
        return Flowable.fromPublisher(publisher).concatMapCompletableDelayError(Functions.identity(), true, i10);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Completable error(@NonNull Throwable th2) {
        Objects.requireNonNull(th2, "throwable is null");
        return RxJavaPlugins.onAssembly(new CompletableError(th2));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public static Completable merge(@NonNull Publisher<? extends CompletableSource> publisher) {
        return b(publisher, Integer.MAX_VALUE, false);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public static Completable mergeDelayError(@NonNull Publisher<? extends CompletableSource> publisher) {
        return b(publisher, Integer.MAX_VALUE, true);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <T> Flowable<T> andThen(@NonNull Publisher<T> publisher) {
        Objects.requireNonNull(publisher, "next is null");
        return RxJavaPlugins.onAssembly(new CompletableAndThenPublisher(this, publisher));
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(@NonNull Action action, @NonNull Consumer<? super Throwable> consumer) {
        Objects.requireNonNull(action, "onComplete is null");
        Objects.requireNonNull(consumer, "onError is null");
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        subscribe(blockingMultiObserver);
        blockingMultiObserver.blockingConsume(Functions.emptyConsumer(), consumer, action);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Completable delay(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableDelay(this, j10, timeUnit, scheduler, z10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable retry(long j10) {
        return fromPublisher(toFlowable().retry(j10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <T> Flowable<T> startWith(@NonNull SingleSource<T> singleSource) {
        Objects.requireNonNull(singleSource, "other is null");
        return Flowable.concat(Single.wrap(singleSource).toFlowable(), toFlowable());
    }

    @Override // io.reactivex.rxjava3.core.CompletableSource
    @SchedulerSupport("none")
    public final void subscribe(@NonNull CompletableObserver completableObserver) {
        Objects.requireNonNull(completableObserver, "observer is null");
        try {
            CompletableObserver completableObserverOnSubscribe = RxJavaPlugins.onSubscribe(this, completableObserver);
            Objects.requireNonNull(completableObserverOnSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(completableObserverOnSubscribe);
        } catch (NullPointerException e5) {
            throw e5;
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final TestObserver<Void> test(boolean z10) {
        TestObserver<Void> testObserver = new TestObserver<>();
        if (z10) {
            testObserver.dispose();
        }
        subscribe(testObserver);
        return testObserver;
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static Completable concat(@NonNull Publisher<? extends CompletableSource> publisher, int i10) {
        Objects.requireNonNull(publisher, "sources is null");
        ObjectHelper.verifyPositive(i10, EventDataKeys.Target.PREFETCH_REQUESTS);
        return RxJavaPlugins.onAssembly(new CompletableConcat(publisher, i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static Completable merge(@NonNull Publisher<? extends CompletableSource> publisher, int i10) {
        return b(publisher, i10, false);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static Completable mergeDelayError(@NonNull Publisher<? extends CompletableSource> publisher, int i10) {
        return b(publisher, i10, true);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final boolean blockingAwait(long j10, @NonNull TimeUnit timeUnit) {
        Objects.requireNonNull(timeUnit, "unit is null");
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        subscribe(blockingMultiObserver);
        return blockingMultiObserver.blockingAwait(j10, timeUnit);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable retry(long j10, @NonNull Predicate<? super Throwable> predicate) {
        return fromPublisher(toFlowable().retry(j10, predicate));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Completable timeout(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return c(j10, timeUnit, scheduler, null);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <T> Single<T> andThen(@NonNull SingleSource<T> singleSource) {
        Objects.requireNonNull(singleSource, "next is null");
        return RxJavaPlugins.onAssembly(new SingleDelayWithCompletable(singleSource, this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable retry(@NonNull Predicate<? super Throwable> predicate) {
        return fromPublisher(toFlowable().retry(predicate));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <T> Flowable<T> startWith(@NonNull MaybeSource<T> maybeSource) {
        Objects.requireNonNull(maybeSource, "other is null");
        return Flowable.concat(Maybe.wrap(maybeSource).toFlowable(), toFlowable());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Completable timeout(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, @NonNull CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "fallback is null");
        return c(j10, timeUnit, scheduler, completableSource);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <T> Maybe<T> andThen(@NonNull MaybeSource<T> maybeSource) {
        Objects.requireNonNull(maybeSource, "next is null");
        return RxJavaPlugins.onAssembly(new MaybeDelayWithCompletable(maybeSource, this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <T> Observable<T> startWith(@NonNull ObservableSource<T> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return Observable.wrap(observableSource).concatWith(toObservable());
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(@NonNull CompletableObserver completableObserver) {
        Objects.requireNonNull(completableObserver, "observer is null");
        BlockingDisposableMultiObserver blockingDisposableMultiObserver = new BlockingDisposableMultiObserver();
        completableObserver.onSubscribe(blockingDisposableMultiObserver);
        subscribe(blockingDisposableMultiObserver);
        blockingDisposableMultiObserver.blockingConsume(completableObserver);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable andThen(@NonNull CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "next is null");
        return RxJavaPlugins.onAssembly(new CompletableAndThenCompletable(this, completableSource));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <T> Flowable<T> startWith(@NonNull Publisher<T> publisher) {
        Objects.requireNonNull(publisher, "other is null");
        return toFlowable().startWith(publisher);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Disposable subscribe(@NonNull Action action, @NonNull Consumer<? super Throwable> consumer) {
        Objects.requireNonNull(consumer, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(consumer, action);
        subscribe(callbackCompletableObserver);
        return callbackCompletableObserver;
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Disposable subscribe(@NonNull Action action) {
        Objects.requireNonNull(action, "onComplete is null");
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(action);
        subscribe(callbackCompletableObserver);
        return callbackCompletableObserver;
    }
}
