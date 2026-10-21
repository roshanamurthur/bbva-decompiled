package io.reactivex.rxjava3.core;

import androidx.activity.f;
import androidx.appcompat.app.r;
import androidx.appcompat.widget.g0;
import androidx.camera.core.impl.v;
import com.mypinpad.tsdk.isolation.p4;
import ie.b;
import io.reactivex.rxjava3.annotations.BackpressureKind;
import io.reactivex.rxjava3.annotations.BackpressureSupport;
import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.functions.Function6;
import io.reactivex.rxjava3.functions.Function7;
import io.reactivex.rxjava3.functions.Function8;
import io.reactivex.rxjava3.functions.Function9;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.fuseable.ScalarSupplier;
import io.reactivex.rxjava3.internal.jdk8.ObservableCollectWithCollectorSingle;
import io.reactivex.rxjava3.internal.jdk8.ObservableFirstStageObserver;
import io.reactivex.rxjava3.internal.jdk8.ObservableFlatMapStream;
import io.reactivex.rxjava3.internal.jdk8.ObservableFromCompletionStage;
import io.reactivex.rxjava3.internal.jdk8.ObservableFromStream;
import io.reactivex.rxjava3.internal.jdk8.ObservableLastStageObserver;
import io.reactivex.rxjava3.internal.jdk8.ObservableMapOptional;
import io.reactivex.rxjava3.internal.jdk8.ObservableSingleStageObserver;
import io.reactivex.rxjava3.internal.observers.BlockingFirstObserver;
import io.reactivex.rxjava3.internal.observers.BlockingLastObserver;
import io.reactivex.rxjava3.internal.observers.ForEachWhileObserver;
import io.reactivex.rxjava3.internal.observers.FutureObserver;
import io.reactivex.rxjava3.internal.observers.LambdaObserver;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromObservable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureError;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToObservable;
import io.reactivex.rxjava3.internal.operators.mixed.ObservableConcatMapCompletable;
import io.reactivex.rxjava3.internal.operators.mixed.ObservableConcatMapMaybe;
import io.reactivex.rxjava3.internal.operators.mixed.ObservableConcatMapSingle;
import io.reactivex.rxjava3.internal.operators.mixed.ObservableSwitchMapCompletable;
import io.reactivex.rxjava3.internal.operators.mixed.ObservableSwitchMapMaybe;
import io.reactivex.rxjava3.internal.operators.mixed.ObservableSwitchMapSingle;
import io.reactivex.rxjava3.internal.operators.observable.BlockingObservableIterable;
import io.reactivex.rxjava3.internal.operators.observable.BlockingObservableLatest;
import io.reactivex.rxjava3.internal.operators.observable.BlockingObservableMostRecent;
import io.reactivex.rxjava3.internal.operators.observable.BlockingObservableNext;
import io.reactivex.rxjava3.internal.operators.observable.ObservableAllSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableAmb;
import io.reactivex.rxjava3.internal.operators.observable.ObservableAnySingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableBlockingSubscribe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableBuffer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableBufferBoundary;
import io.reactivex.rxjava3.internal.operators.observable.ObservableBufferExactBoundary;
import io.reactivex.rxjava3.internal.operators.observable.ObservableBufferTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCache;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCollectSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCombineLatest;
import io.reactivex.rxjava3.internal.operators.observable.ObservableConcatMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableConcatMapEager;
import io.reactivex.rxjava3.internal.operators.observable.ObservableConcatMapScheduler;
import io.reactivex.rxjava3.internal.operators.observable.ObservableConcatWithCompletable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableConcatWithMaybe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableConcatWithSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCountSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCreate;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDebounce;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDebounceTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDefer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDelay;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDelaySubscriptionOther;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDematerialize;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDetach;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDistinct;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDoAfterNext;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDoFinally;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDoOnEach;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDoOnLifecycle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableElementAtMaybe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableElementAtSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableEmpty;
import io.reactivex.rxjava3.internal.operators.observable.ObservableError;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFilter;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFlatMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFlatMapMaybe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFlatMapSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFlattenIterable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromAction;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromArray;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromCallable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromCompletable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromFuture;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromIterable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromRunnable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromSupplier;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromUnsafeSource;
import io.reactivex.rxjava3.internal.operators.observable.ObservableGenerate;
import io.reactivex.rxjava3.internal.operators.observable.ObservableGroupBy;
import io.reactivex.rxjava3.internal.operators.observable.ObservableGroupJoin;
import io.reactivex.rxjava3.internal.operators.observable.ObservableHide;
import io.reactivex.rxjava3.internal.operators.observable.ObservableIgnoreElements;
import io.reactivex.rxjava3.internal.operators.observable.ObservableIgnoreElementsCompletable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableInternalHelper;
import io.reactivex.rxjava3.internal.operators.observable.ObservableInterval;
import io.reactivex.rxjava3.internal.operators.observable.ObservableIntervalRange;
import io.reactivex.rxjava3.internal.operators.observable.ObservableJoin;
import io.reactivex.rxjava3.internal.operators.observable.ObservableJust;
import io.reactivex.rxjava3.internal.operators.observable.ObservableLastMaybe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableLastSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableLift;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMapNotification;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMaterialize;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMergeWithCompletable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMergeWithMaybe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMergeWithSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableNever;
import io.reactivex.rxjava3.internal.operators.observable.ObservableObserveOn;
import io.reactivex.rxjava3.internal.operators.observable.ObservableOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.observable.ObservableOnErrorNext;
import io.reactivex.rxjava3.internal.operators.observable.ObservableOnErrorReturn;
import io.reactivex.rxjava3.internal.operators.observable.ObservablePublish;
import io.reactivex.rxjava3.internal.operators.observable.ObservablePublishSelector;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRange;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRangeLong;
import io.reactivex.rxjava3.internal.operators.observable.ObservableReduceMaybe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableReduceSeedSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableReduceWithSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRepeat;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRepeatUntil;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRepeatWhen;
import io.reactivex.rxjava3.internal.operators.observable.ObservableReplay;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRetryBiPredicate;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRetryPredicate;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRetryWhen;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSampleTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableScan;
import io.reactivex.rxjava3.internal.operators.observable.ObservableScanSeed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSequenceEqualSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSerialized;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSingleMaybe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSingleSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSkip;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSkipLast;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSkipLastTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSkipUntil;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSkipWhile;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSwitchIfEmpty;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSwitchMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTake;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTakeLast;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTakeLastOne;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTakeLastTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTakeUntil;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTakeUntilPredicate;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTakeWhile;
import io.reactivex.rxjava3.internal.operators.observable.ObservableThrottleFirstTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableThrottleLatest;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTimeInterval;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTimeout;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTimeoutTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTimer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableToListSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableUnsubscribeOn;
import io.reactivex.rxjava3.internal.operators.observable.ObservableUsing;
import io.reactivex.rxjava3.internal.operators.observable.ObservableWindow;
import io.reactivex.rxjava3.internal.operators.observable.ObservableWindowBoundary;
import io.reactivex.rxjava3.internal.operators.observable.ObservableWindowBoundarySelector;
import io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableWithLatestFrom;
import io.reactivex.rxjava3.internal.operators.observable.ObservableWithLatestFromMany;
import io.reactivex.rxjava3.internal.operators.observable.ObservableZip;
import io.reactivex.rxjava3.internal.operators.observable.ObservableZipIterable;
import io.reactivex.rxjava3.internal.operators.single.SingleToObservable;
import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.HashMapSupplier;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.observables.GroupedObservable;
import io.reactivex.rxjava3.observers.SafeObserver;
import io.reactivex.rxjava3.observers.TestObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.Spliterators;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.reactivestreams.Publisher;
import qj.c;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Observable<T> implements ObservableSource<T> {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73944a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            f73944a = iArr;
            try {
                iArr[BackpressureStrategy.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73944a[BackpressureStrategy.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73944a[BackpressureStrategy.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f73944a[BackpressureStrategy.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> amb(@NonNull Iterable<? extends ObservableSource<? extends T>> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new ObservableAmb(null, iterable));
    }

    @CheckReturnValue
    @NonNull
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> ambArray(@NonNull ObservableSource<? extends T>... observableSourceArr) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        int length = observableSourceArr.length;
        if (length == 0) {
            return empty();
        }
        return length == 1 ? wrap(observableSourceArr[0]) : RxJavaPlugins.onAssembly(new ObservableAmb(observableSourceArr, null));
    }

    @CheckReturnValue
    public static int bufferSize() {
        return Flowable.bufferSize();
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T, R> Observable<R> combineLatest(@NonNull Iterable<? extends ObservableSource<? extends T>> iterable, @NonNull Function<? super Object[], ? extends R> function) {
        return combineLatest(iterable, function, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T, R> Observable<R> combineLatestArray(@NonNull ObservableSource<? extends T>[] observableSourceArr, @NonNull Function<? super Object[], ? extends R> function) {
        return combineLatestArray(observableSourceArr, function, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T, R> Observable<R> combineLatestArrayDelayError(@NonNull ObservableSource<? extends T>[] observableSourceArr, @NonNull Function<? super Object[], ? extends R> function) {
        return combineLatestArrayDelayError(observableSourceArr, function, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T, R> Observable<R> combineLatestDelayError(@NonNull Iterable<? extends ObservableSource<? extends T>> iterable, @NonNull Function<? super Object[], ? extends R> function) {
        return combineLatestDelayError(iterable, function, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> concat(@NonNull Iterable<? extends ObservableSource<? extends T>> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(Functions.identity(), false, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> concatArray(@NonNull ObservableSource<? extends T>... observableSourceArr) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        if (observableSourceArr.length == 0) {
            return empty();
        }
        return observableSourceArr.length == 1 ? wrap(observableSourceArr[0]) : RxJavaPlugins.onAssembly(new ObservableConcatMap(fromArray(observableSourceArr), Functions.identity(), bufferSize(), ErrorMode.BOUNDARY));
    }

    @CheckReturnValue
    @NonNull
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> concatArrayDelayError(@NonNull ObservableSource<? extends T>... observableSourceArr) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        if (observableSourceArr.length == 0) {
            return empty();
        }
        return observableSourceArr.length == 1 ? wrap(observableSourceArr[0]) : concatDelayError(fromArray(observableSourceArr));
    }

    @CheckReturnValue
    @NonNull
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> concatArrayEager(@NonNull ObservableSource<? extends T>... observableSourceArr) {
        return concatArrayEager(bufferSize(), bufferSize(), observableSourceArr);
    }

    @CheckReturnValue
    @NonNull
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> concatArrayEagerDelayError(@NonNull ObservableSource<? extends T>... observableSourceArr) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), observableSourceArr);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> concatDelayError(@NonNull Iterable<? extends ObservableSource<? extends T>> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return concatDelayError(fromIterable(iterable));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> concatEager(@NonNull Iterable<? extends ObservableSource<? extends T>> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> concatEagerDelayError(@NonNull Iterable<? extends ObservableSource<? extends T>> iterable) {
        return concatEagerDelayError(iterable, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> create(@NonNull ObservableOnSubscribe<T> observableOnSubscribe) {
        Objects.requireNonNull(observableOnSubscribe, "source is null");
        return RxJavaPlugins.onAssembly(new ObservableCreate(observableOnSubscribe));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> defer(@NonNull Supplier<? extends ObservableSource<? extends T>> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return RxJavaPlugins.onAssembly(new ObservableDefer(supplier));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> empty() {
        return RxJavaPlugins.onAssembly(ObservableEmpty.INSTANCE);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> error(@NonNull Supplier<? extends Throwable> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return RxJavaPlugins.onAssembly(new ObservableError(supplier));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> fromAction(@NonNull Action action) {
        Objects.requireNonNull(action, "action is null");
        return RxJavaPlugins.onAssembly(new ObservableFromAction(action));
    }

    @CheckReturnValue
    @NonNull
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> fromArray(@NonNull T... tArr) {
        Objects.requireNonNull(tArr, "items is null");
        if (tArr.length == 0) {
            return empty();
        }
        return tArr.length == 1 ? just(tArr[0]) : RxJavaPlugins.onAssembly(new ObservableFromArray(tArr));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> fromCallable(@NonNull Callable<? extends T> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return RxJavaPlugins.onAssembly(new ObservableFromCallable(callable));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> fromCompletable(@NonNull CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "completableSource is null");
        return RxJavaPlugins.onAssembly(new ObservableFromCompletable(completableSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> fromCompletionStage(@NonNull CompletionStage<T> completionStage) {
        Objects.requireNonNull(completionStage, "stage is null");
        return RxJavaPlugins.onAssembly(new ObservableFromCompletionStage(completionStage));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> fromFuture(@NonNull Future<? extends T> future) {
        Objects.requireNonNull(future, "future is null");
        return RxJavaPlugins.onAssembly(new ObservableFromFuture(future, 0L, null));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> fromIterable(@NonNull Iterable<? extends T> iterable) {
        Objects.requireNonNull(iterable, "source is null");
        return RxJavaPlugins.onAssembly(new ObservableFromIterable(iterable));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> fromMaybe(@NonNull MaybeSource<T> maybeSource) {
        Objects.requireNonNull(maybeSource, "maybe is null");
        return RxJavaPlugins.onAssembly(new MaybeToObservable(maybeSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> fromOptional(@NonNull Optional<T> optional) {
        Objects.requireNonNull(optional, "optional is null");
        return (Observable) optional.map(new b(6)).orElseGet(new c());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public static <T> Observable<T> fromPublisher(@NonNull Publisher<? extends T> publisher) {
        Objects.requireNonNull(publisher, "publisher is null");
        return RxJavaPlugins.onAssembly(new ObservableFromPublisher(publisher));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> fromRunnable(@NonNull Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        return RxJavaPlugins.onAssembly(new ObservableFromRunnable(runnable));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> fromSingle(@NonNull SingleSource<T> singleSource) {
        Objects.requireNonNull(singleSource, "source is null");
        return RxJavaPlugins.onAssembly(new SingleToObservable(singleSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> fromStream(@NonNull Stream<T> stream) {
        Objects.requireNonNull(stream, "stream is null");
        return RxJavaPlugins.onAssembly(new ObservableFromStream(stream));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> fromSupplier(@NonNull Supplier<? extends T> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return RxJavaPlugins.onAssembly(new ObservableFromSupplier(supplier));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> generate(@NonNull Consumer<Emitter<T>> consumer) {
        Objects.requireNonNull(consumer, "generator is null");
        return generate(Functions.nullSupplier(), ObservableInternalHelper.simpleGenerator(consumer), Functions.emptyConsumer());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public static Observable<Long> interval(long j10, long j11, @NonNull TimeUnit timeUnit) {
        return interval(j10, j11, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public static Observable<Long> intervalRange(long j10, long j11, long j12, long j13, @NonNull TimeUnit timeUnit) {
        return intervalRange(j10, j11, j12, j13, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> just(@NonNull T t10) {
        Objects.requireNonNull(t10, "item is null");
        return RxJavaPlugins.onAssembly(new ObservableJust(t10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> merge(@NonNull Iterable<? extends ObservableSource<? extends T>> iterable, int i10, int i11) {
        return fromIterable(iterable).flatMap(Functions.identity(), false, i10, i11);
    }

    @CheckReturnValue
    @NonNull
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeArray(int i10, int i11, @NonNull ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap(Functions.identity(), false, i10, i11);
    }

    @CheckReturnValue
    @NonNull
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeArrayDelayError(int i10, int i11, @NonNull ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap(Functions.identity(), true, i10, i11);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeDelayError(@NonNull Iterable<? extends ObservableSource<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Functions.identity(), true);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> never() {
        return RxJavaPlugins.onAssembly(ObservableNever.INSTANCE);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable<Integer> range(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException(g0.c("count >= 0 required but it was ", i11));
        }
        if (i11 == 0) {
            return empty();
        }
        if (i11 == 1) {
            return just(Integer.valueOf(i10));
        }
        if (((long) i10) + ((long) (i11 - 1)) <= 2147483647L) {
            return RxJavaPlugins.onAssembly(new ObservableRange(i10, i11));
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static Observable<Long> rangeLong(long j10, long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException(v.c("count >= 0 required but it was ", j11));
        }
        if (j11 == 0) {
            return empty();
        }
        if (j11 == 1) {
            return just(Long.valueOf(j10));
        }
        long j12 = (j11 - 1) + j10;
        if (j10 <= 0 || j12 >= 0) {
            return RxJavaPlugins.onAssembly(new ObservableRangeLong(j10, j11));
        }
        throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Single<Boolean> sequenceEqual(@NonNull ObservableSource<? extends T> observableSource, @NonNull ObservableSource<? extends T> observableSource2) {
        return sequenceEqual(observableSource, observableSource2, ObjectHelper.equalsPredicate(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> switchOnNext(@NonNull ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i10) {
        Objects.requireNonNull(observableSource, "sources is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMap(observableSource, Functions.identity(), i10, false));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> switchOnNextDelayError(@NonNull ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return switchOnNextDelayError(observableSource, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public static Observable<Long> timer(long j10, @NonNull TimeUnit timeUnit) {
        return timer(j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> unsafeCreate(@NonNull ObservableSource<T> observableSource) {
        Objects.requireNonNull(observableSource, "onSubscribe is null");
        if (observableSource instanceof Observable) {
            throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
        }
        return RxJavaPlugins.onAssembly(new ObservableFromUnsafeSource(observableSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T, D> Observable<T> using(@NonNull Supplier<? extends D> supplier, @NonNull Function<? super D, ? extends ObservableSource<? extends T>> function, @NonNull Consumer<? super D> consumer) {
        return using(supplier, function, consumer, true);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> wrap(@NonNull ObservableSource<T> observableSource) {
        Objects.requireNonNull(observableSource, "source is null");
        return observableSource instanceof Observable ? RxJavaPlugins.onAssembly((Observable) observableSource) : RxJavaPlugins.onAssembly(new ObservableFromUnsafeSource(observableSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T, R> Observable<R> zip(@NonNull Iterable<? extends ObservableSource<? extends T>> iterable, @NonNull Function<? super Object[], ? extends R> function) {
        Objects.requireNonNull(function, "zipper is null");
        Objects.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new ObservableZip(null, iterable, function, bufferSize(), false));
    }

    @CheckReturnValue
    @NonNull
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T, R> Observable<R> zipArray(@NonNull Function<? super Object[], ? extends R> function, boolean z10, int i10, @NonNull ObservableSource<? extends T>... observableSourceArr) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        if (observableSourceArr.length == 0) {
            return empty();
        }
        Objects.requireNonNull(function, "zipper is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableZip(observableSourceArr, null, function, i10, z10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> a(@NonNull Consumer<? super T> consumer, @NonNull Consumer<? super Throwable> consumer2, @NonNull Action action, @NonNull Action action2) {
        Objects.requireNonNull(consumer, "onNext is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        Objects.requireNonNull(action2, "onAfterTerminate is null");
        return RxJavaPlugins.onAssembly(new ObservableDoOnEach(this, consumer, consumer2, action, action2));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single<Boolean> all(@NonNull Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableAllSingle(this, predicate));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> ambWith(@NonNull ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return ambArray(this, observableSource);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single<Boolean> any(@NonNull Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableAnySingle(this, predicate));
    }

    @NonNull
    public final Observable b(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, @Nullable ObservableSource observableSource) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableTimeoutTimed(this, j10, timeUnit, scheduler, observableSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final T blockingFirst() {
        BlockingFirstObserver blockingFirstObserver = new BlockingFirstObserver();
        subscribe(blockingFirstObserver);
        T tBlockingGet = blockingFirstObserver.blockingGet();
        if (tBlockingGet != null) {
            return tBlockingGet;
        }
        throw new NoSuchElementException();
    }

    @NonNull
    @SchedulerSupport("none")
    public final void blockingForEach(@NonNull Consumer<? super T> consumer) {
        blockingForEach(consumer, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Iterable<T> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final T blockingLast() {
        BlockingLastObserver blockingLastObserver = new BlockingLastObserver();
        subscribe(blockingLastObserver);
        T tBlockingGet = blockingLastObserver.blockingGet();
        if (tBlockingGet != null) {
            return tBlockingGet;
        }
        throw new NoSuchElementException();
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Iterable<T> blockingLatest() {
        return new BlockingObservableLatest(this);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Iterable<T> blockingMostRecent(@NonNull T t10) {
        Objects.requireNonNull(t10, "initialItem is null");
        return new BlockingObservableMostRecent(this, t10);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Iterable<T> blockingNext() {
        return new BlockingObservableNext(this);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final T blockingSingle() {
        T tBlockingGet = singleElement().blockingGet();
        if (tBlockingGet != null) {
            return tBlockingGet;
        }
        throw new NoSuchElementException();
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Stream<T> blockingStream() {
        return blockingStream(bufferSize());
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe() {
        ObservableBlockingSubscribe.subscribe(this);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<List<T>> buffer(int i10) {
        return buffer(i10, i10);
    }

    @NonNull
    public final <U, V> Observable<T> c(@NonNull ObservableSource<U> observableSource, @NonNull Function<? super T, ? extends ObservableSource<V>> function, @Nullable ObservableSource<? extends T> observableSource2) {
        Objects.requireNonNull(function, "itemTimeoutIndicator is null");
        return RxJavaPlugins.onAssembly(new ObservableTimeout(this, observableSource, function, observableSource2));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> cache() {
        return cacheWithInitialCapacity(16);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> cacheWithInitialCapacity(int i10) {
        ObjectHelper.verifyPositive(i10, "initialCapacity");
        return RxJavaPlugins.onAssembly(new ObservableCache(this, i10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U> Observable<U> cast(@NonNull Class<U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return (Observable<U>) map(Functions.castFunction(cls));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U> Single<U> collect(@NonNull Supplier<? extends U> supplier, @NonNull BiConsumer<? super U, ? super T> biConsumer) {
        Objects.requireNonNull(supplier, "initialItemSupplier is null");
        Objects.requireNonNull(biConsumer, "collector is null");
        return RxJavaPlugins.onAssembly(new ObservableCollectSingle(this, supplier, biConsumer));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U> Single<U> collectInto(@NonNull U u2, @NonNull BiConsumer<? super U, ? super T> biConsumer) {
        Objects.requireNonNull(u2, "initialItem is null");
        return collect(Functions.justSupplier(u2), biConsumer);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> compose(@NonNull ObservableTransformer<? super T, ? extends R> observableTransformer) {
        Objects.requireNonNull(observableTransformer, "composer is null");
        return wrap(observableTransformer.apply(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMap(@NonNull Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return concatMap(function, 2);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable concatMapCompletable(@NonNull Function<? super T, ? extends CompletableSource> function) {
        return concatMapCompletable(function, 2);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable concatMapCompletableDelayError(@NonNull Function<? super T, ? extends CompletableSource> function) {
        return concatMapCompletableDelayError(function, true, 2);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapDelayError(@NonNull Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return concatMapDelayError(function, true, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapEager(@NonNull Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return concatMapEager(function, Integer.MAX_VALUE, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapEagerDelayError(@NonNull Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z10) {
        return concatMapEagerDelayError(function, z10, Integer.MAX_VALUE, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U> Observable<U> concatMapIterable(@NonNull Function<? super T, ? extends Iterable<? extends U>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlattenIterable(this, function));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapMaybe(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return concatMapMaybe(function, 2);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapMaybeDelayError(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return concatMapMaybeDelayError(function, true, 2);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapSingle(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function) {
        return concatMapSingle(function, 2);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapSingleDelayError(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function) {
        return concatMapSingleDelayError(function, true, 2);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapStream(@NonNull Function<? super T, ? extends Stream<? extends R>> function) {
        return flatMapStream(function);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> concatWith(@NonNull ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return concat(this, observableSource);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single<Boolean> contains(@NonNull Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return any(Functions.equalsWith(obj));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single<Long> count() {
        return RxJavaPlugins.onAssembly(new ObservableCountSingle(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U> Observable<T> debounce(@NonNull Function<? super T, ? extends ObservableSource<U>> function) {
        Objects.requireNonNull(function, "debounceIndicator is null");
        return RxJavaPlugins.onAssembly(new ObservableDebounce(this, function));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> defaultIfEmpty(@NonNull T t10) {
        Objects.requireNonNull(t10, "defaultItem is null");
        return switchIfEmpty(just(t10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U> Observable<T> delay(@NonNull Function<? super T, ? extends ObservableSource<U>> function) {
        Objects.requireNonNull(function, "itemDelayIndicator is null");
        return (Observable<T>) flatMap(ObservableInternalHelper.itemDelay(function));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U> Observable<T> delaySubscription(@NonNull ObservableSource<U> observableSource) {
        Objects.requireNonNull(observableSource, "subscriptionIndicator is null");
        return RxJavaPlugins.onAssembly(new ObservableDelaySubscriptionOther(this, observableSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> dematerialize(@NonNull Function<? super T, Notification<R>> function) {
        Objects.requireNonNull(function, "selector is null");
        return RxJavaPlugins.onAssembly(new ObservableDematerialize(this, function));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> distinct() {
        return distinct(Functions.identity(), Functions.createHashSet());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> distinctUntilChanged() {
        return distinctUntilChanged(Functions.identity());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> doAfterNext(@NonNull Consumer<? super T> consumer) {
        Objects.requireNonNull(consumer, "onAfterNext is null");
        return RxJavaPlugins.onAssembly(new ObservableDoAfterNext(this, consumer));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> doAfterTerminate(@NonNull Action action) {
        Objects.requireNonNull(action, "onAfterTerminate is null");
        return a(Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, action);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> doFinally(@NonNull Action action) {
        Objects.requireNonNull(action, "onFinally is null");
        return RxJavaPlugins.onAssembly(new ObservableDoFinally(this, action));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> doOnComplete(@NonNull Action action) {
        return a(Functions.emptyConsumer(), Functions.emptyConsumer(), action, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> doOnDispose(@NonNull Action action) {
        return doOnLifecycle(Functions.emptyConsumer(), action);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> doOnEach(@NonNull Consumer<? super Notification<T>> consumer) {
        Objects.requireNonNull(consumer, "onNotification is null");
        return a(Functions.notificationOnNext(consumer), Functions.notificationOnError(consumer), Functions.notificationOnComplete(consumer), Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> doOnError(@NonNull Consumer<? super Throwable> consumer) {
        Consumer<? super T> consumerEmptyConsumer = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        return a(consumerEmptyConsumer, consumer, action, action);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> doOnLifecycle(@NonNull Consumer<? super Disposable> consumer, @NonNull Action action) {
        Objects.requireNonNull(consumer, "onSubscribe is null");
        Objects.requireNonNull(action, "onDispose is null");
        return RxJavaPlugins.onAssembly(new ObservableDoOnLifecycle(this, consumer, action));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> doOnNext(@NonNull Consumer<? super T> consumer) {
        Consumer<? super Throwable> consumerEmptyConsumer = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        return a(consumer, consumerEmptyConsumer, action, action);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> doOnSubscribe(@NonNull Consumer<? super Disposable> consumer) {
        return doOnLifecycle(consumer, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> doOnTerminate(@NonNull Action action) {
        Objects.requireNonNull(action, "onTerminate is null");
        return a(Functions.emptyConsumer(), Functions.actionConsumer(action), action, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe<T> elementAt(long j10) {
        if (j10 >= 0) {
            return RxJavaPlugins.onAssembly(new ObservableElementAtMaybe(this, j10));
        }
        throw new IndexOutOfBoundsException(v.c("index >= 0 required but it was ", j10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single<T> elementAtOrError(long j10) {
        if (j10 >= 0) {
            return RxJavaPlugins.onAssembly(new ObservableElementAtSingle(this, j10, null));
        }
        throw new IndexOutOfBoundsException(v.c("index >= 0 required but it was ", j10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> filter(@NonNull Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableFilter(this, predicate));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single<T> first(@NonNull T t10) {
        return elementAt(0L, t10);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe<T> firstElement() {
        return elementAt(0L);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single<T> firstOrError() {
        return elementAtOrError(0L);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final CompletionStage<T> firstOrErrorStage() {
        return p4.c(subscribeWith(new ObservableFirstStageObserver(false, null)));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final CompletionStage<T> firstStage(@Nullable T t10) {
        return p4.c(subscribeWith(new ObservableFirstStageObserver(true, t10)));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMap(@NonNull Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return flatMap((Function) function, false);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable flatMapCompletable(@NonNull Function<? super T, ? extends CompletableSource> function) {
        return flatMapCompletable(function, false);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U> Observable<U> flatMapIterable(@NonNull Function<? super T, ? extends Iterable<? extends U>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlattenIterable(this, function));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMapMaybe(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return flatMapMaybe(function, false);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMapSingle(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function) {
        return flatMapSingle(function, false);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMapStream(@NonNull Function<? super T, ? extends Stream<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMapStream(this, function));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Disposable forEach(@NonNull Consumer<? super T> consumer) {
        return subscribe(consumer);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Disposable forEachWhile(@NonNull Predicate<? super T> predicate) {
        return forEachWhile(predicate, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <K> Observable<GroupedObservable<K, T>> groupBy(@NonNull Function<? super T, ? extends K> function) {
        return (Observable<GroupedObservable<K, T>>) groupBy(function, Functions.identity(), false, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <TRight, TLeftEnd, TRightEnd, R> Observable<R> groupJoin(@NonNull ObservableSource<? extends TRight> observableSource, @NonNull Function<? super T, ? extends ObservableSource<TLeftEnd>> function, @NonNull Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, @NonNull BiFunction<? super T, ? super Observable<TRight>, ? extends R> biFunction) {
        Objects.requireNonNull(observableSource, "other is null");
        Objects.requireNonNull(function, "leftEnd is null");
        Objects.requireNonNull(function2, "rightEnd is null");
        Objects.requireNonNull(biFunction, "resultSelector is null");
        return RxJavaPlugins.onAssembly(new ObservableGroupJoin(this, observableSource, function, function2, biFunction));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> hide() {
        return RxJavaPlugins.onAssembly(new ObservableHide(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable ignoreElements() {
        return RxJavaPlugins.onAssembly(new ObservableIgnoreElementsCompletable(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single<Boolean> isEmpty() {
        return all(Functions.alwaysFalse());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <TRight, TLeftEnd, TRightEnd, R> Observable<R> join(@NonNull ObservableSource<? extends TRight> observableSource, @NonNull Function<? super T, ? extends ObservableSource<TLeftEnd>> function, @NonNull Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, @NonNull BiFunction<? super T, ? super TRight, ? extends R> biFunction) {
        Objects.requireNonNull(observableSource, "other is null");
        Objects.requireNonNull(function, "leftEnd is null");
        Objects.requireNonNull(function2, "rightEnd is null");
        Objects.requireNonNull(biFunction, "resultSelector is null");
        return RxJavaPlugins.onAssembly(new ObservableJoin(this, observableSource, function, function2, biFunction));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single<T> last(@NonNull T t10) {
        Objects.requireNonNull(t10, "defaultItem is null");
        return RxJavaPlugins.onAssembly(new ObservableLastSingle(this, t10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe<T> lastElement() {
        return RxJavaPlugins.onAssembly(new ObservableLastMaybe(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single<T> lastOrError() {
        return RxJavaPlugins.onAssembly(new ObservableLastSingle(this, null));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final CompletionStage<T> lastOrErrorStage() {
        return p4.c(subscribeWith(new ObservableLastStageObserver(false, null)));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final CompletionStage<T> lastStage(@Nullable T t10) {
        return p4.c(subscribeWith(new ObservableLastStageObserver(true, t10)));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> lift(@NonNull ObservableOperator<? extends R, ? super T> observableOperator) {
        Objects.requireNonNull(observableOperator, "lifter is null");
        return RxJavaPlugins.onAssembly(new ObservableLift(this, observableOperator));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> map(@NonNull Function<? super T, ? extends R> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableMap(this, function));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> mapOptional(@NonNull Function<? super T, Optional<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableMapOptional(this, function));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<Notification<T>> materialize() {
        return RxJavaPlugins.onAssembly(new ObservableMaterialize(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> mergeWith(@NonNull ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return merge(this, observableSource);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> observeOn(@NonNull Scheduler scheduler) {
        return observeOn(scheduler, false, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U> Observable<U> ofType(@NonNull Class<U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return filter(Functions.isInstanceOf(cls)).cast(cls);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> onErrorComplete() {
        return onErrorComplete(Functions.alwaysTrue());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> onErrorResumeNext(@NonNull Function<? super Throwable, ? extends ObservableSource<? extends T>> function) {
        Objects.requireNonNull(function, "fallbackSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableOnErrorNext(this, function));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> onErrorResumeWith(@NonNull ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "fallback is null");
        return onErrorResumeNext(Functions.justFunction(observableSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> onErrorReturn(@NonNull Function<? super Throwable, ? extends T> function) {
        Objects.requireNonNull(function, "itemSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableOnErrorReturn(this, function));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> onErrorReturnItem(@NonNull T t10) {
        Objects.requireNonNull(t10, "item is null");
        return onErrorReturn(Functions.justFunction(t10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> onTerminateDetach() {
        return RxJavaPlugins.onAssembly(new ObservableDetach(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final ConnectableObservable<T> publish() {
        return RxJavaPlugins.onAssembly((ConnectableObservable) new ObservablePublish(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe<T> reduce(@NonNull BiFunction<T, T, T> biFunction) {
        Objects.requireNonNull(biFunction, "reducer is null");
        return RxJavaPlugins.onAssembly(new ObservableReduceMaybe(this, biFunction));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Single<R> reduceWith(@NonNull Supplier<R> supplier, @NonNull BiFunction<R, ? super T, R> biFunction) {
        Objects.requireNonNull(supplier, "seedSupplier is null");
        Objects.requireNonNull(biFunction, "reducer is null");
        return RxJavaPlugins.onAssembly(new ObservableReduceWithSingle(this, supplier, biFunction));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> repeat() {
        return repeat(Long.MAX_VALUE);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> repeatUntil(@NonNull BooleanSupplier booleanSupplier) {
        Objects.requireNonNull(booleanSupplier, "stop is null");
        return RxJavaPlugins.onAssembly(new ObservableRepeatUntil(this, booleanSupplier));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> repeatWhen(@NonNull Function<? super Observable<Object>, ? extends ObservableSource<?>> function) {
        Objects.requireNonNull(function, "handler is null");
        return RxJavaPlugins.onAssembly(new ObservableRepeatWhen(this, function));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final ConnectableObservable<T> replay() {
        return ObservableReplay.createFrom(this);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> retry() {
        return retry(Long.MAX_VALUE, Functions.alwaysTrue());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> retryUntil(@NonNull BooleanSupplier booleanSupplier) {
        Objects.requireNonNull(booleanSupplier, "stop is null");
        return retry(Long.MAX_VALUE, Functions.predicateReverseFor(booleanSupplier));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> retryWhen(@NonNull Function<? super Observable<Throwable>, ? extends ObservableSource<?>> function) {
        Objects.requireNonNull(function, "handler is null");
        return RxJavaPlugins.onAssembly(new ObservableRetryWhen(this, function));
    }

    @NonNull
    @SchedulerSupport("none")
    public final void safeSubscribe(@NonNull Observer<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        if (observer instanceof SafeObserver) {
            subscribe(observer);
        } else {
            subscribe(new SafeObserver(observer));
        }
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> sample(long j10, @NonNull TimeUnit timeUnit) {
        return sample(j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> scan(@NonNull BiFunction<T, T, T> biFunction) {
        Objects.requireNonNull(biFunction, "accumulator is null");
        return RxJavaPlugins.onAssembly(new ObservableScan(this, biFunction));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> scanWith(@NonNull Supplier<R> supplier, @NonNull BiFunction<R, ? super T, R> biFunction) {
        Objects.requireNonNull(supplier, "seedSupplier is null");
        Objects.requireNonNull(biFunction, "accumulator is null");
        return RxJavaPlugins.onAssembly(new ObservableScanSeed(this, supplier, biFunction));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> serialize() {
        return RxJavaPlugins.onAssembly(new ObservableSerialized(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> share() {
        return publish().refCount();
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single<T> single(@NonNull T t10) {
        Objects.requireNonNull(t10, "defaultItem is null");
        return RxJavaPlugins.onAssembly(new ObservableSingleSingle(this, t10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Maybe<T> singleElement() {
        return RxJavaPlugins.onAssembly(new ObservableSingleMaybe(this));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single<T> singleOrError() {
        return RxJavaPlugins.onAssembly(new ObservableSingleSingle(this, null));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final CompletionStage<T> singleOrErrorStage() {
        return p4.c(subscribeWith(new ObservableSingleStageObserver(false, null)));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final CompletionStage<T> singleStage(@Nullable T t10) {
        return p4.c(subscribeWith(new ObservableSingleStageObserver(true, t10)));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> skip(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? RxJavaPlugins.onAssembly(this) : RxJavaPlugins.onAssembly(new ObservableSkip(this, j10));
        }
        throw new IllegalArgumentException(v.c("count >= 0 expected but it was ", j10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> skipLast(int i10) {
        if (i10 >= 0) {
            return i10 == 0 ? RxJavaPlugins.onAssembly(this) : RxJavaPlugins.onAssembly(new ObservableSkipLast(this, i10));
        }
        throw new IllegalArgumentException(g0.c("count >= 0 required but it was ", i10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U> Observable<T> skipUntil(@NonNull ObservableSource<U> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableSkipUntil(this, observableSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> skipWhile(@NonNull Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableSkipWhile(this, predicate));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> sorted() {
        return toList().toObservable().map(Functions.listSorter(Functions.naturalComparator())).flatMapIterable(Functions.identity());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> startWith(@NonNull CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return concat(Completable.wrap(completableSource).toObservable(), this);
    }

    @CheckReturnValue
    @NonNull
    @SafeVarargs
    @SchedulerSupport("none")
    public final Observable<T> startWithArray(@NonNull T... tArr) {
        Observable observableFromArray = fromArray(tArr);
        return observableFromArray == empty() ? RxJavaPlugins.onAssembly(this) : concatArray(observableFromArray, this);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> startWithItem(@NonNull T t10) {
        return concatArray(just(t10), this);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> startWithIterable(@NonNull Iterable<? extends T> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    @NonNull
    @SchedulerSupport("none")
    public final Disposable subscribe() {
        return subscribe(Functions.emptyConsumer(), Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    public abstract void subscribeActual(@NonNull Observer<? super T> observer);

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> subscribeOn(@NonNull Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableSubscribeOn(this, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <E extends Observer<? super T>> E subscribeWith(E e5) {
        subscribe(e5);
        return e5;
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> switchIfEmpty(@NonNull ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchIfEmpty(this, observableSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> switchMap(@NonNull Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return switchMap(function, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable switchMapCompletable(@NonNull Function<? super T, ? extends CompletableSource> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapCompletable(this, function, false));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable switchMapCompletableDelayError(@NonNull Function<? super T, ? extends CompletableSource> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapCompletable(this, function, true));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> switchMapDelayError(@NonNull Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return switchMapDelayError(function, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> switchMapMaybe(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapMaybe(this, function, false));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> switchMapMaybeDelayError(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapMaybe(this, function, true));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> switchMapSingle(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapSingle(this, function, false));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> switchMapSingleDelayError(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMapSingle(this, function, true));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> take(long j10) {
        if (j10 >= 0) {
            return RxJavaPlugins.onAssembly(new ObservableTake(this, j10));
        }
        throw new IllegalArgumentException(v.c("count >= 0 required but it was ", j10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> takeLast(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(g0.c("count >= 0 required but it was ", i10));
        }
        if (i10 == 0) {
            return RxJavaPlugins.onAssembly(new ObservableIgnoreElements(this));
        }
        return i10 == 1 ? RxJavaPlugins.onAssembly(new ObservableTakeLastOne(this)) : RxJavaPlugins.onAssembly(new ObservableTakeLast(this, i10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U> Observable<T> takeUntil(@NonNull ObservableSource<U> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableTakeUntil(this, observableSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> takeWhile(@NonNull Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableTakeWhile(this, predicate));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final TestObserver<T> test() {
        TestObserver<T> testObserver = new TestObserver<>();
        subscribe(testObserver);
        return testObserver;
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> throttleFirst(long j10, @NonNull TimeUnit timeUnit) {
        return throttleFirst(j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> throttleLast(long j10, @NonNull TimeUnit timeUnit) {
        return sample(j10, timeUnit);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> throttleLatest(long j10, @NonNull TimeUnit timeUnit) {
        return throttleLatest(j10, timeUnit, Schedulers.computation(), false);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> throttleWithTimeout(long j10, @NonNull TimeUnit timeUnit) {
        return debounce(j10, timeUnit);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<Timed<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <V> Observable<T> timeout(@NonNull Function<? super T, ? extends ObservableSource<V>> function) {
        return c(null, function, null);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<Timed<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> R to(@NonNull ObservableConverter<T, ? extends R> observableConverter) {
        Objects.requireNonNull(observableConverter, "converter is null");
        return observableConverter.apply(this);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public final Flowable<T> toFlowable(@NonNull BackpressureStrategy backpressureStrategy) {
        Objects.requireNonNull(backpressureStrategy, "strategy is null");
        FlowableFromObservable flowableFromObservable = new FlowableFromObservable(this);
        int i10 = a.f73944a[backpressureStrategy.ordinal()];
        if (i10 == 1) {
            return flowableFromObservable.onBackpressureDrop();
        }
        if (i10 == 2) {
            return flowableFromObservable.onBackpressureLatest();
        }
        if (i10 != 3) {
            return i10 != 4 ? flowableFromObservable.onBackpressureBuffer() : RxJavaPlugins.onAssembly(new FlowableOnBackpressureError(flowableFromObservable));
        }
        return flowableFromObservable;
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Future<T> toFuture() {
        return (Future) subscribeWith(new FutureObserver());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single<List<T>> toList() {
        return toList(16);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <K> Single<Map<K, T>> toMap(@NonNull Function<? super T, ? extends K> function) {
        Objects.requireNonNull(function, "keySelector is null");
        return (Single<Map<K, T>>) collect(HashMapSupplier.asSupplier(), Functions.toMapKeySelector(function));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <K> Single<Map<K, Collection<T>>> toMultimap(@NonNull Function<? super T, ? extends K> function) {
        return (Single<Map<K, Collection<T>>>) toMultimap(function, Functions.identity(), HashMapSupplier.asSupplier(), ArrayListSupplier.asFunction());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single<List<T>> toSortedList() {
        return toSortedList(Functions.naturalComparator());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> unsubscribeOn(@NonNull Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableUnsubscribeOn(this, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<Observable<T>> window(long j10) {
        return window(j10, j10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U, R> Observable<R> withLatestFrom(@NonNull ObservableSource<? extends U> observableSource, @NonNull BiFunction<? super T, ? super U, ? extends R> biFunction) {
        Objects.requireNonNull(observableSource, "other is null");
        Objects.requireNonNull(biFunction, "combiner is null");
        return RxJavaPlugins.onAssembly(new ObservableWithLatestFrom(this, biFunction, observableSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U, R> Observable<R> zipWith(@NonNull Iterable<U> iterable, @NonNull BiFunction<? super T, ? super U, ? extends R> biFunction) {
        Objects.requireNonNull(iterable, "other is null");
        Objects.requireNonNull(biFunction, "zipper is null");
        return RxJavaPlugins.onAssembly(new ObservableZipIterable(this, iterable, biFunction));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T, R> Observable<R> combineLatest(@NonNull Iterable<? extends ObservableSource<? extends T>> iterable, @NonNull Function<? super Object[], ? extends R> function, int i10) {
        Objects.requireNonNull(iterable, "sources is null");
        Objects.requireNonNull(function, "combiner is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableCombineLatest(null, iterable, function, i10 << 1, false));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T, R> Observable<R> combineLatestArray(@NonNull ObservableSource<? extends T>[] observableSourceArr, @NonNull Function<? super Object[], ? extends R> function, int i10) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        if (observableSourceArr.length == 0) {
            return empty();
        }
        Objects.requireNonNull(function, "combiner is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableCombineLatest(observableSourceArr, null, function, i10 << 1, false));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T, R> Observable<R> combineLatestArrayDelayError(@NonNull ObservableSource<? extends T>[] observableSourceArr, @NonNull Function<? super Object[], ? extends R> function, int i10) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        Objects.requireNonNull(function, "combiner is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return observableSourceArr.length == 0 ? empty() : RxJavaPlugins.onAssembly(new ObservableCombineLatest(observableSourceArr, null, function, i10 << 1, true));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T, R> Observable<R> combineLatestDelayError(@NonNull Iterable<? extends ObservableSource<? extends T>> iterable, @NonNull Function<? super Object[], ? extends R> function, int i10) {
        Objects.requireNonNull(iterable, "sources is null");
        Objects.requireNonNull(function, "combiner is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableCombineLatest(null, iterable, function, i10 << 1, true));
    }

    @CheckReturnValue
    @NonNull
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> concatArrayEager(int i10, int i11, @NonNull ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).concatMapEagerDelayError(Functions.identity(), false, i10, i11);
    }

    @CheckReturnValue
    @NonNull
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> concatArrayEagerDelayError(int i10, int i11, @NonNull ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).concatMapEagerDelayError(Functions.identity(), true, i10, i11);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> concatEager(@NonNull Iterable<? extends ObservableSource<? extends T>> iterable, int i10, int i11) {
        return fromIterable(iterable).concatMapEagerDelayError(Functions.identity(), false, i10, i11);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> concatEagerDelayError(@NonNull Iterable<? extends ObservableSource<? extends T>> iterable, int i10, int i11) {
        return fromIterable(iterable).concatMapEagerDelayError(Functions.identity(), true, i10, i11);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public static Observable<Long> interval(long j10, long j11, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableInterval(Math.max(0L, j10), Math.max(0L, j11), timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public static Observable<Long> intervalRange(long j10, long j11, long j12, long j13, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        if (j11 < 0) {
            throw new IllegalArgumentException(v.c("count >= 0 required but it was ", j11));
        }
        if (j11 == 0) {
            return empty().delay(j12, timeUnit, scheduler);
        }
        long j14 = (j11 - 1) + j10;
        if (j10 > 0 && j14 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableIntervalRange(j10, j14, Math.max(0L, j12), Math.max(0L, j13), timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> merge(@NonNull Iterable<? extends ObservableSource<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Functions.identity());
    }

    @CheckReturnValue
    @NonNull
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeArray(@NonNull ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap(Functions.identity(), observableSourceArr.length);
    }

    @CheckReturnValue
    @NonNull
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeArrayDelayError(@NonNull ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap(Functions.identity(), true, observableSourceArr.length);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeDelayError(@NonNull Iterable<? extends ObservableSource<? extends T>> iterable, int i10, int i11) {
        return fromIterable(iterable).flatMap(Functions.identity(), true, i10, i11);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Single<Boolean> sequenceEqual(@NonNull ObservableSource<? extends T> observableSource, @NonNull ObservableSource<? extends T> observableSource2, @NonNull BiPredicate<? super T, ? super T> biPredicate) {
        return sequenceEqual(observableSource, observableSource2, biPredicate, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> switchOnNextDelayError(@NonNull ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i10) {
        Objects.requireNonNull(observableSource, "sources is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableSwitchMap(observableSource, Functions.identity(), i10, true));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public static Observable<Long> timer(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableTimer(Math.max(j10, 0L), timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T, D> Observable<T> using(@NonNull Supplier<? extends D> supplier, @NonNull Function<? super D, ? extends ObservableSource<? extends T>> function, @NonNull Consumer<? super D> consumer, boolean z10) {
        Objects.requireNonNull(supplier, "resourceSupplier is null");
        Objects.requireNonNull(function, "sourceSupplier is null");
        Objects.requireNonNull(consumer, "resourceCleanup is null");
        return RxJavaPlugins.onAssembly(new ObservableUsing(supplier, function, consumer, z10));
    }

    @NonNull
    @SchedulerSupport("none")
    public final void blockingForEach(@NonNull Consumer<? super T> consumer, int i10) {
        Objects.requireNonNull(consumer, "onNext is null");
        Iterator<T> it = blockingIterable(i10).iterator();
        while (it.hasNext()) {
            try {
                consumer.accept(it.next());
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                ((Disposable) it).dispose();
                throw ExceptionHelper.wrapOrThrow(th2);
            }
        }
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Iterable<T> blockingIterable(int i10) {
        ObjectHelper.verifyPositive(i10, "capacityHint");
        return new BlockingObservableIterable(this, i10);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Stream<T> blockingStream(int i10) {
        Iterator<T> it = blockingIterable(i10).iterator();
        Stream stream = StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, 0), false);
        Disposable disposable = (Disposable) it;
        disposable.getClass();
        return r.c(stream.onClose(new f(disposable, 8)));
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(@NonNull Consumer<? super T> consumer) {
        ObservableBlockingSubscribe.subscribe(this, consumer, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<List<T>> buffer(int i10, int i11) {
        return (Observable<List<T>>) buffer(i10, i11, ArrayListSupplier.asSupplier());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMap(@NonNull Function<? super T, ? extends ObservableSource<? extends R>> function, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        if (!(this instanceof ScalarSupplier)) {
            return RxJavaPlugins.onAssembly(new ObservableConcatMap(this, function, i10, ErrorMode.IMMEDIATE));
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? empty() : ObservableScalarXMap.scalarXMap(obj, function);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable concatMapCompletable(@NonNull Function<? super T, ? extends CompletableSource> function, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "capacityHint");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapCompletable(this, function, ErrorMode.IMMEDIATE, i10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable concatMapCompletableDelayError(@NonNull Function<? super T, ? extends CompletableSource> function, boolean z10) {
        return concatMapCompletableDelayError(function, z10, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapDelayError(@NonNull Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z10, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        if (!(this instanceof ScalarSupplier)) {
            return RxJavaPlugins.onAssembly(new ObservableConcatMap(this, function, i10, z10 ? ErrorMode.END : ErrorMode.BOUNDARY));
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? empty() : ObservableScalarXMap.scalarXMap(obj, function);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapEager(@NonNull Function<? super T, ? extends ObservableSource<? extends R>> function, int i10, int i11) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapEager(this, function, ErrorMode.IMMEDIATE, i10, i11));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapEagerDelayError(@NonNull Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z10, int i10, int i11) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapEager(this, function, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10, i11));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapMaybe(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapMaybe(this, function, ErrorMode.IMMEDIATE, i10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapMaybeDelayError(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z10) {
        return concatMapMaybeDelayError(function, z10, 2);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapSingle(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapSingle(this, function, ErrorMode.IMMEDIATE, i10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapSingleDelayError(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10) {
        return concatMapSingleDelayError(function, z10, 2);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <K> Observable<T> distinct(@NonNull Function<? super T, K> function) {
        return distinct(function, Functions.createHashSet());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <K> Observable<T> distinctUntilChanged(@NonNull Function<? super T, K> function) {
        Objects.requireNonNull(function, "keySelector is null");
        return RxJavaPlugins.onAssembly(new ObservableDistinctUntilChanged(this, function, ObjectHelper.equalsPredicate()));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMap(@NonNull Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z10) {
        return flatMap(function, z10, Integer.MAX_VALUE);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable flatMapCompletable(@NonNull Function<? super T, ? extends CompletableSource> function, boolean z10) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMapCompletableCompletable(this, function, z10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMapMaybe(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z10) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMapMaybe(this, function, z10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMapSingle(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMapSingle(this, function, z10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Disposable forEachWhile(@NonNull Predicate<? super T> predicate, @NonNull Consumer<? super Throwable> consumer) {
        return forEachWhile(predicate, consumer, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <K> Observable<GroupedObservable<K, T>> groupBy(@NonNull Function<? super T, ? extends K> function, boolean z10) {
        return (Observable<GroupedObservable<K, T>>) groupBy(function, Functions.identity(), z10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> observeOn(@NonNull Scheduler scheduler, boolean z10) {
        return observeOn(scheduler, z10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> onErrorComplete(@NonNull Predicate<? super Throwable> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableOnErrorComplete(this, predicate));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> publish(@NonNull Function<? super Observable<T>, ? extends ObservableSource<R>> function) {
        Objects.requireNonNull(function, "selector is null");
        return RxJavaPlugins.onAssembly(new ObservablePublishSelector(this, function));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> repeat(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? empty() : RxJavaPlugins.onAssembly(new ObservableRepeat(this, j10));
        }
        throw new IllegalArgumentException(v.c("times >= 0 required but it was ", j10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> replay(@NonNull Function<? super Observable<T>, ? extends ObservableSource<R>> function) {
        Objects.requireNonNull(function, "selector is null");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replaySupplier(this), function);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> retry(@NonNull BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        Objects.requireNonNull(biPredicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new ObservableRetryBiPredicate(this, biPredicate));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> sample(long j10, @NonNull TimeUnit timeUnit, boolean z10) {
        return sample(j10, timeUnit, Schedulers.computation(), z10);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> sorted(@NonNull Comparator<? super T> comparator) {
        Objects.requireNonNull(comparator, "comparator is null");
        return toList().toObservable().map(Functions.listSorter(comparator)).flatMapIterable(Functions.identity());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Disposable subscribe(@NonNull Consumer<? super T> consumer) {
        return subscribe(consumer, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> switchMap(@NonNull Function<? super T, ? extends ObservableSource<? extends R>> function, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        if (!(this instanceof ScalarSupplier)) {
            return RxJavaPlugins.onAssembly(new ObservableSwitchMap(this, function, i10, false));
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? empty() : ObservableScalarXMap.scalarXMap(obj, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> switchMapDelayError(@NonNull Function<? super T, ? extends ObservableSource<? extends R>> function, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        if (!(this instanceof ScalarSupplier)) {
            return RxJavaPlugins.onAssembly(new ObservableSwitchMap(this, function, i10, true));
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? empty() : ObservableScalarXMap.scalarXMap(obj, function);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> throttleFirst(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableThrottleFirstTimed(this, j10, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> throttleLast(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return sample(j10, timeUnit, scheduler);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> throttleLatest(long j10, @NonNull TimeUnit timeUnit, boolean z10) {
        return throttleLatest(j10, timeUnit, Schedulers.computation(), z10);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> throttleWithTimeout(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return debounce(j10, timeUnit, scheduler);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<Timed<T>> timeInterval(@NonNull Scheduler scheduler) {
        return timeInterval(TimeUnit.MILLISECONDS, scheduler);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <V> Observable<T> timeout(@NonNull Function<? super T, ? extends ObservableSource<V>> function, @NonNull ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "fallback is null");
        return c(null, function, observableSource);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<Timed<T>> timestamp(@NonNull Scheduler scheduler) {
        return timestamp(TimeUnit.MILLISECONDS, scheduler);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single<List<T>> toList(int i10) {
        ObjectHelper.verifyPositive(i10, "capacityHint");
        return RxJavaPlugins.onAssembly(new ObservableToListSingle(this, i10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single<List<T>> toSortedList(@NonNull Comparator<? super T> comparator) {
        Objects.requireNonNull(comparator, "comparator is null");
        return (Single<List<T>>) toList().map(Functions.listSorter(comparator));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<Observable<T>> window(long j10, long j11) {
        return window(j10, j11, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> concat(@NonNull ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return concat(observableSource, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> concatDelayError(@NonNull ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return concatDelayError(observableSource, bufferSize(), true);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> concatEager(@NonNull ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return concatEager(observableSource, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> concatEagerDelayError(@NonNull ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return concatEagerDelayError(observableSource, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> error(@NonNull Throwable th2) {
        Objects.requireNonNull(th2, "throwable is null");
        return error((Supplier<? extends Throwable>) Functions.justSupplier(th2));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> fromFuture(@NonNull Future<? extends T> future, long j10, @NonNull TimeUnit timeUnit) {
        Objects.requireNonNull(future, "future is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        return RxJavaPlugins.onAssembly(new ObservableFromFuture(future, j10, timeUnit));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> just(@NonNull T t10, @NonNull T t11) {
        Objects.requireNonNull(t10, "item1 is null");
        Objects.requireNonNull(t11, "item2 is null");
        return fromArray(t10, t11);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> merge(@NonNull Iterable<? extends ObservableSource<? extends T>> iterable, int i10) {
        return fromIterable(iterable).flatMap(Functions.identity(), i10);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeDelayError(@NonNull Iterable<? extends ObservableSource<? extends T>> iterable, int i10) {
        return fromIterable(iterable).flatMap(Functions.identity(), true, i10);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Single<Boolean> sequenceEqual(@NonNull ObservableSource<? extends T> observableSource, @NonNull ObservableSource<? extends T> observableSource2, @NonNull BiPredicate<? super T, ? super T> biPredicate, int i10) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(biPredicate, "isEqual is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableSequenceEqualSingle(observableSource, observableSource2, biPredicate, i10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final T blockingSingle(@NonNull T t10) {
        return single(t10).blockingGet();
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(@NonNull Consumer<? super T> consumer, @NonNull Consumer<? super Throwable> consumer2) {
        ObservableBlockingSubscribe.subscribe(this, consumer, consumer2, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U extends Collection<? super T>> Observable<U> buffer(int i10, int i11, @NonNull Supplier<U> supplier) {
        ObjectHelper.verifyPositive(i10, "count");
        ObjectHelper.verifyPositive(i11, "skip");
        Objects.requireNonNull(supplier, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableBuffer(this, i10, i11, supplier));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Completable concatMapCompletableDelayError(@NonNull Function<? super T, ? extends CompletableSource> function, boolean z10, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapCompletable(this, function, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapMaybeDelayError(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z10, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapMaybe(this, function, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> concatMapSingleDelayError(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapSingle(this, function, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> concatWith(@NonNull SingleSource<? extends T> singleSource) {
        Objects.requireNonNull(singleSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableConcatWithSingle(this, singleSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> debounce(long j10, @NonNull TimeUnit timeUnit) {
        return debounce(j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> delay(long j10, @NonNull TimeUnit timeUnit) {
        return delay(j10, timeUnit, Schedulers.computation(), false);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> delaySubscription(long j10, @NonNull TimeUnit timeUnit) {
        return delaySubscription(j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <K> Observable<T> distinct(@NonNull Function<? super T, K> function, @NonNull Supplier<? extends Collection<? super K>> supplier) {
        Objects.requireNonNull(function, "keySelector is null");
        Objects.requireNonNull(supplier, "collectionSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableDistinct(this, function, supplier));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMap(@NonNull Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z10, int i10) {
        return flatMap(function, z10, i10, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U, V> Observable<V> flatMapIterable(@NonNull Function<? super T, ? extends Iterable<? extends U>> function, @NonNull BiFunction<? super T, ? super U, ? extends V> biFunction) {
        Objects.requireNonNull(function, "mapper is null");
        Objects.requireNonNull(biFunction, "combiner is null");
        return (Observable<V>) flatMap(ObservableInternalHelper.flatMapIntoIterable(function), biFunction, false, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Disposable forEachWhile(@NonNull Predicate<? super T> predicate, @NonNull Consumer<? super Throwable> consumer, @NonNull Action action) {
        Objects.requireNonNull(predicate, "onNext is null");
        Objects.requireNonNull(consumer, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        ForEachWhileObserver forEachWhileObserver = new ForEachWhileObserver(predicate, consumer, action);
        subscribe(forEachWhileObserver);
        return forEachWhileObserver;
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <K, V> Observable<GroupedObservable<K, V>> groupBy(@NonNull Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return groupBy(function, function2, false, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> mergeWith(@NonNull SingleSource<? extends T> singleSource) {
        Objects.requireNonNull(singleSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableMergeWithSingle(this, singleSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> observeOn(@NonNull Scheduler scheduler, boolean z10, int i10) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableObserveOn(this, scheduler, z10, i10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Single<R> reduce(R r3, @NonNull BiFunction<R, ? super T, R> biFunction) {
        Objects.requireNonNull(r3, "seed is null");
        Objects.requireNonNull(biFunction, "reducer is null");
        return RxJavaPlugins.onAssembly(new ObservableReduceSeedSingle(this, r3, biFunction));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> sample(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableSampleTimed(this, j10, timeUnit, scheduler, false));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> scan(@NonNull R r3, @NonNull BiFunction<R, ? super T, R> biFunction) {
        Objects.requireNonNull(r3, "initialValue is null");
        return scanWith(Functions.justSupplier(r3), biFunction);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> startWith(@NonNull SingleSource<T> singleSource) {
        Objects.requireNonNull(singleSource, "other is null");
        return concat(Single.wrap(singleSource).toObservable(), this);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Disposable subscribe(@NonNull Consumer<? super T> consumer, @NonNull Consumer<? super Throwable> consumer2) {
        return subscribe(consumer, consumer2, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> takeUntil(@NonNull Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "stopPredicate is null");
        return RxJavaPlugins.onAssembly(new ObservableTakeUntilPredicate(this, predicate));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final TestObserver<T> test(boolean z10) {
        TestObserver<T> testObserver = new TestObserver<>();
        if (z10) {
            testObserver.dispose();
        }
        subscribe(testObserver);
        return testObserver;
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> throttleLatest(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return throttleLatest(j10, timeUnit, scheduler, false);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<Timed<T>> timeInterval(@NonNull TimeUnit timeUnit) {
        return timeInterval(timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<Timed<T>> timestamp(@NonNull TimeUnit timeUnit) {
        return timestamp(timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <K, V> Single<Map<K, V>> toMap(@NonNull Function<? super T, ? extends K> function, @NonNull Function<? super T, ? extends V> function2) {
        Objects.requireNonNull(function, "keySelector is null");
        Objects.requireNonNull(function2, "valueSelector is null");
        return (Single<Map<K, V>>) collect(HashMapSupplier.asSupplier(), Functions.toMapKeyValueSelector(function, function2));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<Observable<T>> window(long j10, long j11, int i10) {
        ObjectHelper.verifyPositive(j10, "count");
        ObjectHelper.verifyPositive(j11, "skip");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableWindow(this, j10, j11, i10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> concat(@NonNull ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i10) {
        Objects.requireNonNull(observableSource, "sources is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableConcatMap(observableSource, Functions.identity(), i10, ErrorMode.IMMEDIATE));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> concatDelayError(@NonNull ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i10, boolean z10) {
        Objects.requireNonNull(observableSource, "sources is null");
        ObjectHelper.verifyPositive(i10, "bufferSize is null");
        return RxJavaPlugins.onAssembly(new ObservableConcatMap(observableSource, Functions.identity(), i10, z10 ? ErrorMode.END : ErrorMode.BOUNDARY));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> concatEager(@NonNull ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i10, int i11) {
        return wrap(observableSource).concatMapEager(Functions.identity(), i10, i11);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> concatEagerDelayError(@NonNull ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i10, int i11) {
        return wrap(observableSource).concatMapEagerDelayError(Functions.identity(), true, i10, i11);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> merge(@NonNull ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        Objects.requireNonNull(observableSource, "sources is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMap(observableSource, Functions.identity(), false, Integer.MAX_VALUE, bufferSize()));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeDelayError(@NonNull ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        Objects.requireNonNull(observableSource, "sources is null");
        return RxJavaPlugins.onAssembly(new ObservableFlatMap(observableSource, Functions.identity(), true, Integer.MAX_VALUE, bufferSize()));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> switchOnNext(@NonNull ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return switchOnNext(observableSource, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T, R> Observable<R> zip(@NonNull Iterable<? extends ObservableSource<? extends T>> iterable, @NonNull Function<? super Object[], ? extends R> function, boolean z10, int i10) {
        Objects.requireNonNull(function, "zipper is null");
        Objects.requireNonNull(iterable, "sources is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableZip(null, iterable, function, i10, z10));
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(@NonNull Consumer<? super T> consumer, @NonNull Consumer<? super Throwable> consumer2, @NonNull Action action) {
        ObservableBlockingSubscribe.subscribe(this, consumer, consumer2, action);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R, A> Single<R> collect(@NonNull Collector<? super T, A, R> collector) {
        Objects.requireNonNull(collector, "collector is null");
        return RxJavaPlugins.onAssembly(new ObservableCollectWithCollectorSingle(this, collector));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> debounce(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableDebounceTimed(this, j10, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> delay(long j10, @NonNull TimeUnit timeUnit, boolean z10) {
        return delay(j10, timeUnit, Schedulers.computation(), z10);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> delaySubscription(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return delaySubscription(timer(j10, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> distinctUntilChanged(@NonNull BiPredicate<? super T, ? super T> biPredicate) {
        Objects.requireNonNull(biPredicate, "comparer is null");
        return RxJavaPlugins.onAssembly(new ObservableDistinctUntilChanged(this, Functions.identity(), biPredicate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMap(@NonNull Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z10, int i10, int i11) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        if (this instanceof ScalarSupplier) {
            Object obj = ((ScalarSupplier) this).get();
            if (obj == null) {
                return empty();
            }
            return ObservableScalarXMap.scalarXMap(obj, function);
        }
        return RxJavaPlugins.onAssembly(new ObservableFlatMap(this, function, z10, i10, i11));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <K, V> Observable<GroupedObservable<K, V>> groupBy(@NonNull Function<? super T, ? extends K> function, @NonNull Function<? super T, ? extends V> function2, boolean z10) {
        return groupBy(function, function2, z10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> replay(@NonNull Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i10) {
        Objects.requireNonNull(function, "selector is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replaySupplier(this, i10, false), function);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> retry(long j10) {
        return retry(j10, Functions.alwaysTrue());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Disposable subscribe(@NonNull Consumer<? super T> consumer, @NonNull Consumer<? super Throwable> consumer2, @NonNull Action action) {
        Objects.requireNonNull(consumer, "onNext is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        LambdaObserver lambdaObserver = new LambdaObserver(consumer, consumer2, action, Functions.emptyConsumer());
        subscribe(lambdaObserver);
        return lambdaObserver;
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> throttleLatest(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableThrottleLatest(this, j10, timeUnit, scheduler, z10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<Timed<T>> timeInterval(@NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableTimeInterval(this, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> timeout(long j10, @NonNull TimeUnit timeUnit) {
        return b(j10, timeUnit, Schedulers.computation(), null);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<Timed<T>> timestamp(@NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return (Observable<Timed<T>>) map(Functions.timestampWith(timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U extends Collection<? super T>> Single<U> toList(@NonNull Supplier<U> supplier) {
        Objects.requireNonNull(supplier, "collectionSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableToListSingle(this, supplier));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single<List<T>> toSortedList(@NonNull Comparator<? super T> comparator, int i10) {
        Objects.requireNonNull(comparator, "comparator is null");
        return (Single<List<T>>) toList(i10).map(Functions.listSorter(comparator));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <T1, T2, R> Observable<R> withLatestFrom(@NonNull ObservableSource<T1> observableSource, @NonNull ObservableSource<T2> observableSource2, @NonNull Function3<? super T, ? super T1, ? super T2, R> function3) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(function3, "combiner is null");
        return withLatestFrom((ObservableSource<?>[]) new ObservableSource[]{observableSource, observableSource2}, Functions.toFunction(function3));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U, R> Observable<R> zipWith(@NonNull ObservableSource<? extends U> observableSource, @NonNull BiFunction<? super T, ? super U, ? extends R> biFunction) {
        Objects.requireNonNull(observableSource, "other is null");
        return zip(this, observableSource, biFunction);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T, S> Observable<T> generate(@NonNull Supplier<S> supplier, @NonNull BiConsumer<S, Emitter<T>> biConsumer) {
        Objects.requireNonNull(biConsumer, "generator is null");
        return generate(supplier, ObservableInternalHelper.simpleBiGenerator(biConsumer), Functions.emptyConsumer());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public static Observable<Long> interval(long j10, @NonNull TimeUnit timeUnit) {
        return interval(j10, j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final T blockingFirst(@NonNull T t10) {
        Objects.requireNonNull(t10, "defaultItem is null");
        BlockingFirstObserver blockingFirstObserver = new BlockingFirstObserver();
        subscribe(blockingFirstObserver);
        T tBlockingGet = blockingFirstObserver.blockingGet();
        return tBlockingGet != null ? tBlockingGet : t10;
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final T blockingLast(@NonNull T t10) {
        Objects.requireNonNull(t10, "defaultItem is null");
        BlockingLastObserver blockingLastObserver = new BlockingLastObserver();
        subscribe(blockingLastObserver);
        T tBlockingGet = blockingLastObserver.blockingGet();
        return tBlockingGet != null ? tBlockingGet : t10;
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(@NonNull Observer<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        ObservableBlockingSubscribe.subscribe(this, observer);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> concatWith(@NonNull MaybeSource<? extends T> maybeSource) {
        Objects.requireNonNull(maybeSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableConcatWithMaybe(this, maybeSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> delay(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return delay(j10, timeUnit, scheduler, false);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <K, V> Observable<GroupedObservable<K, V>> groupBy(@NonNull Function<? super T, ? extends K> function, @NonNull Function<? super T, ? extends V> function2, boolean z10, int i10) {
        Objects.requireNonNull(function, "keySelector is null");
        Objects.requireNonNull(function2, "valueSelector is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableGroupBy(this, function, function2, i10, z10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> mergeWith(@NonNull MaybeSource<? extends T> maybeSource) {
        Objects.requireNonNull(maybeSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableMergeWithMaybe(this, maybeSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> retry(long j10, @NonNull Predicate<? super Throwable> predicate) {
        if (j10 >= 0) {
            Objects.requireNonNull(predicate, "predicate is null");
            return RxJavaPlugins.onAssembly(new ObservableRetryPredicate(this, j10, predicate));
        }
        throw new IllegalArgumentException(v.c("times >= 0 required but it was ", j10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> startWith(@NonNull MaybeSource<T> maybeSource) {
        Objects.requireNonNull(maybeSource, "other is null");
        return concat(Maybe.wrap(maybeSource).toObservable(), this);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> timeout(long j10, @NonNull TimeUnit timeUnit, @NonNull ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "fallback is null");
        return b(j10, timeUnit, Schedulers.computation(), observableSource);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(@NonNull Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return toMultimap(function, function2, HashMapSupplier.asSupplier(), ArrayListSupplier.asFunction());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T1, T2, R> Observable<R> combineLatest(@NonNull ObservableSource<? extends T1> observableSource, @NonNull ObservableSource<? extends T2> observableSource2, @NonNull BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(biFunction, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2}, Functions.toFunction(biFunction), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public static Observable<Long> interval(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return interval(j10, j10, timeUnit, scheduler);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> just(@NonNull T t10, @NonNull T t11, @NonNull T t12) {
        Objects.requireNonNull(t10, "item1 is null");
        Objects.requireNonNull(t11, "item2 is null");
        Objects.requireNonNull(t12, "item3 is null");
        return fromArray(t10, t11, t12);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> merge(@NonNull ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i10) {
        Objects.requireNonNull(observableSource, "sources is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new ObservableFlatMap(observableSource, Functions.identity(), false, i10, bufferSize()));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeDelayError(@NonNull ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i10) {
        Objects.requireNonNull(observableSource, "sources is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new ObservableFlatMap(observableSource, Functions.identity(), true, i10, bufferSize()));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> delay(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableDelay(this, j10, timeUnit, scheduler, z10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> doOnEach(@NonNull Observer<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        return a(ObservableInternalHelper.observerOnNext(observer), ObservableInternalHelper.observerOnError(observer), ObservableInternalHelper.observerOnComplete(observer), Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> sample(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableSampleTimed(this, j10, timeUnit, scheduler, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <K, V> Single<Map<K, V>> toMap(@NonNull Function<? super T, ? extends K> function, @NonNull Function<? super T, ? extends V> function2, @NonNull Supplier<? extends Map<K, V>> supplier) {
        Objects.requireNonNull(function, "keySelector is null");
        Objects.requireNonNull(function2, "valueSelector is null");
        Objects.requireNonNull(supplier, "mapSupplier is null");
        return (Single<Map<K, V>>) collect(supplier, Functions.toMapKeyValueSelector(function, function2));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single<List<T>> toSortedList(int i10) {
        return toSortedList(Functions.naturalComparator(), i10);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U, R> Observable<R> zipWith(@NonNull ObservableSource<? extends U> observableSource, @NonNull BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z10) {
        return zip(this, observableSource, biFunction, z10);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> concat(@NonNull ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        return concatArray(observableSource, observableSource2);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T, S> Observable<T> generate(@NonNull Supplier<S> supplier, @NonNull BiConsumer<S, Emitter<T>> biConsumer, @NonNull Consumer<? super S> consumer) {
        Objects.requireNonNull(biConsumer, "generator is null");
        return generate(supplier, ObservableInternalHelper.simpleBiGenerator(biConsumer), consumer);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U extends Collection<? super T>> Observable<U> buffer(int i10, @NonNull Supplier<U> supplier) {
        return buffer(i10, i10, supplier);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> concatWith(@NonNull CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableConcatWithCompletable(this, completableSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> mergeWith(@NonNull CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return RxJavaPlugins.onAssembly(new ObservableMergeWithCompletable(this, completableSource));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> replay(@NonNull Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i10, boolean z10) {
        Objects.requireNonNull(function, "selector is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replaySupplier(this, i10, z10), function);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> startWith(@NonNull ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return concatArray(observableSource, this);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> timeout(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, @NonNull ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "fallback is null");
        return b(j10, timeUnit, scheduler, observableSource);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<Observable<T>> window(long j10, long j11, @NonNull TimeUnit timeUnit) {
        return window(j10, j11, timeUnit, Schedulers.computation(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U, R> Observable<R> zipWith(@NonNull ObservableSource<? extends U> observableSource, @NonNull BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z10, int i10) {
        return zip(this, observableSource, biFunction, z10, i10);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Single<Boolean> sequenceEqual(@NonNull ObservableSource<? extends T> observableSource, @NonNull ObservableSource<? extends T> observableSource2, int i10) {
        return sequenceEqual(observableSource, observableSource2, ObjectHelper.equalsPredicate(), i10);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T1, T2, R> Observable<R> zip(@NonNull ObservableSource<? extends T1> observableSource, @NonNull ObservableSource<? extends T2> observableSource2, @NonNull BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(biFunction, "zipper is null");
        return zipArray(Functions.toFunction(biFunction), false, bufferSize(), observableSource, observableSource2);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<List<T>> buffer(long j10, long j11, @NonNull TimeUnit timeUnit) {
        return (Observable<List<T>>) buffer(j10, j11, timeUnit, Schedulers.computation(), ArrayListSupplier.asSupplier());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(@NonNull Function<? super T, ? extends K> function, @NonNull Function<? super T, ? extends V> function2, @NonNull Supplier<? extends Map<K, Collection<V>>> supplier, @NonNull Function<? super K, ? extends Collection<? super V>> function3) {
        Objects.requireNonNull(function, "keySelector is null");
        Objects.requireNonNull(function2, "valueSelector is null");
        Objects.requireNonNull(supplier, "mapSupplier is null");
        Objects.requireNonNull(function3, "collectionFactory is null");
        return (Single<Map<K, Collection<V>>>) collect(supplier, Functions.toMultimapKeyValueSelector(function, function2, function3));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<Observable<T>> window(long j10, long j11, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return window(j10, j11, timeUnit, scheduler, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T, S> Observable<T> generate(@NonNull Supplier<S> supplier, @NonNull BiFunction<S, Emitter<T>, S> biFunction) {
        return generate(supplier, biFunction, Functions.emptyConsumer());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> merge(@NonNull ObservableSource<? extends T> observableSource, @NonNull ObservableSource<? extends T> observableSource2) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        return fromArray(observableSource, observableSource2).flatMap(Functions.identity(), false, 2);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeDelayError(@NonNull ObservableSource<? extends T> observableSource, @NonNull ObservableSource<? extends T> observableSource2) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        return fromArray(observableSource, observableSource2).flatMap(Functions.identity(), true, 2);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<List<T>> buffer(long j10, long j11, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return (Observable<List<T>>) buffer(j10, j11, timeUnit, scheduler, ArrayListSupplier.asSupplier());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final <R> Observable<R> concatMap(@NonNull Function<? super T, ? extends ObservableSource<? extends R>> function, int i10, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapScheduler(this, function, i10, ErrorMode.IMMEDIATE, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final <R> Observable<R> concatMapDelayError(@NonNull Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z10, int i10, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableConcatMapScheduler(this, function, i10, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, scheduler));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U, V> Observable<T> delay(@NonNull ObservableSource<U> observableSource, @NonNull Function<? super T, ? extends ObservableSource<V>> function) {
        return delaySubscription(observableSource).delay(function);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U> Observable<T> sample(@NonNull ObservableSource<U> observableSource) {
        Objects.requireNonNull(observableSource, "sampler is null");
        return RxJavaPlugins.onAssembly(new ObservableSampleWithObservable(this, observableSource, false));
    }

    @Override // io.reactivex.rxjava3.core.ObservableSource
    @SchedulerSupport("none")
    public final void subscribe(@NonNull Observer<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        try {
            Observer<? super T> observerOnSubscribe = RxJavaPlugins.onSubscribe(this, observer);
            Objects.requireNonNull(observerOnSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(observerOnSubscribe);
        } catch (NullPointerException e5) {
            throw e5;
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> timeout(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return b(j10, timeUnit, scheduler, null);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<Observable<T>> window(long j10, long j11, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, int i10) {
        ObjectHelper.verifyPositive(j10, "timespan");
        ObjectHelper.verifyPositive(j11, "timeskip");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        return RxJavaPlugins.onAssembly(new ObservableWindowTimed(this, j10, j11, timeUnit, scheduler, Long.MAX_VALUE, i10, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <T1, T2, T3, R> Observable<R> withLatestFrom(@NonNull ObservableSource<T1> observableSource, @NonNull ObservableSource<T2> observableSource2, @NonNull ObservableSource<T3> observableSource3, @NonNull Function4<? super T, ? super T1, ? super T2, ? super T3, R> function4) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(function4, "combiner is null");
        return withLatestFrom((ObservableSource<?>[]) new ObservableSource[]{observableSource, observableSource2, observableSource3}, Functions.toFunction(function4));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T1, T2, T3, R> Observable<R> combineLatest(@NonNull ObservableSource<? extends T1> observableSource, @NonNull ObservableSource<? extends T2> observableSource2, @NonNull ObservableSource<? extends T3> observableSource3, @NonNull Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(function3, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3}, Functions.toFunction(function3), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> concat(@NonNull ObservableSource<? extends T> observableSource, @NonNull ObservableSource<? extends T> observableSource2, @NonNull ObservableSource<? extends T> observableSource3) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        return concatArray(observableSource, observableSource2, observableSource3);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T, S> Observable<T> generate(@NonNull Supplier<S> supplier, @NonNull BiFunction<S, Emitter<T>, S> biFunction, @NonNull Consumer<? super S> consumer) {
        Objects.requireNonNull(supplier, "initialState is null");
        Objects.requireNonNull(biFunction, "generator is null");
        Objects.requireNonNull(consumer, "disposeState is null");
        return RxJavaPlugins.onAssembly(new ObservableGenerate(supplier, biFunction, consumer));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> just(@NonNull T t10, @NonNull T t11, @NonNull T t12, @NonNull T t13) {
        Objects.requireNonNull(t10, "item1 is null");
        Objects.requireNonNull(t11, "item2 is null");
        Objects.requireNonNull(t12, "item3 is null");
        Objects.requireNonNull(t13, "item4 is null");
        return fromArray(t10, t11, t12, t13);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final <U extends Collection<? super T>> Observable<U> buffer(long j10, long j11, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, @NonNull Supplier<U> supplier) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(supplier, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableBufferTimed(this, j10, j11, timeUnit, scheduler, supplier, Integer.MAX_VALUE, false));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final <R> Observable<R> replay(@NonNull Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i10, long j10, @NonNull TimeUnit timeUnit) {
        return replay(function, i10, j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U, V> Observable<T> timeout(@NonNull ObservableSource<U> observableSource, @NonNull Function<? super T, ? extends ObservableSource<V>> function) {
        Objects.requireNonNull(observableSource, "firstTimeoutIndicator is null");
        return c(observableSource, function, null);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final <R> Observable<R> replay(@NonNull Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i10, long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(function, "selector is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replaySupplier(this, i10, j10, timeUnit, scheduler, false), function);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U> Observable<T> sample(@NonNull ObservableSource<U> observableSource, boolean z10) {
        Objects.requireNonNull(observableSource, "sampler is null");
        return RxJavaPlugins.onAssembly(new ObservableSampleWithObservable(this, observableSource, z10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> merge(@NonNull ObservableSource<? extends T> observableSource, @NonNull ObservableSource<? extends T> observableSource2, @NonNull ObservableSource<? extends T> observableSource3) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        return fromArray(observableSource, observableSource2, observableSource3).flatMap(Functions.identity(), false, 3);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeDelayError(@NonNull ObservableSource<? extends T> observableSource, @NonNull ObservableSource<? extends T> observableSource2, @NonNull ObservableSource<? extends T> observableSource3) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        return fromArray(observableSource, observableSource2, observableSource3).flatMap(Functions.identity(), true, 3);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T1, T2, R> Observable<R> zip(@NonNull ObservableSource<? extends T1> observableSource, @NonNull ObservableSource<? extends T2> observableSource2, @NonNull BiFunction<? super T1, ? super T2, ? extends R> biFunction, boolean z10) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(biFunction, "zipper is null");
        return zipArray(Functions.toFunction(biFunction), z10, bufferSize(), observableSource, observableSource2);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMap(@NonNull Function<? super T, ? extends ObservableSource<? extends R>> function, @NonNull Function<? super Throwable, ? extends ObservableSource<? extends R>> function2, @NonNull Supplier<? extends ObservableSource<? extends R>> supplier) {
        Objects.requireNonNull(function, "onNextMapper is null");
        Objects.requireNonNull(function2, "onErrorMapper is null");
        Objects.requireNonNull(supplier, "onCompleteSupplier is null");
        return merge(new ObservableMapNotification(this, function, function2, supplier));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U, V> Observable<T> timeout(@NonNull ObservableSource<U> observableSource, @NonNull Function<? super T, ? extends ObservableSource<V>> function, @NonNull ObservableSource<? extends T> observableSource2) {
        Objects.requireNonNull(observableSource, "firstTimeoutIndicator is null");
        Objects.requireNonNull(observableSource2, "fallback is null");
        return c(observableSource, function, observableSource2);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Single<T> elementAt(long j10, @NonNull T t10) {
        if (j10 >= 0) {
            Objects.requireNonNull(t10, "defaultItem is null");
            return RxJavaPlugins.onAssembly(new ObservableElementAtSingle(this, j10, t10));
        }
        throw new IndexOutOfBoundsException(v.c("index >= 0 required but it was ", j10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> take(long j10, @NonNull TimeUnit timeUnit) {
        return takeUntil(timer(j10, timeUnit));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(@NonNull Function<? super T, ? extends K> function, @NonNull Function<? super T, ? extends V> function2, @NonNull Supplier<Map<K, Collection<V>>> supplier) {
        return toMultimap(function, function2, supplier, ArrayListSupplier.asFunction());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> concat(@NonNull ObservableSource<? extends T> observableSource, @NonNull ObservableSource<? extends T> observableSource2, @NonNull ObservableSource<? extends T> observableSource3, @NonNull ObservableSource<? extends T> observableSource4) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        return concatArray(observableSource, observableSource2, observableSource3, observableSource4);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<List<T>> buffer(long j10, @NonNull TimeUnit timeUnit) {
        return buffer(j10, timeUnit, Schedulers.computation(), Integer.MAX_VALUE);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<T> skip(long j10, @NonNull TimeUnit timeUnit) {
        return skipUntil(timer(j10, timeUnit));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:trampoline")
    public final Observable<T> skipLast(long j10, @NonNull TimeUnit timeUnit) {
        return skipLast(j10, timeUnit, Schedulers.trampoline(), false, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> take(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return takeUntil(timer(j10, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, R> Observable<R> combineLatest(@NonNull ObservableSource<? extends T1> observableSource, @NonNull ObservableSource<? extends T2> observableSource2, @NonNull ObservableSource<? extends T3> observableSource3, @NonNull ObservableSource<? extends T4> observableSource4, @NonNull Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(function4, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4}, Functions.toFunction(function4), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> just(@NonNull T t10, @NonNull T t11, @NonNull T t12, @NonNull T t13, @NonNull T t14) {
        Objects.requireNonNull(t10, "item1 is null");
        Objects.requireNonNull(t11, "item2 is null");
        Objects.requireNonNull(t12, "item3 is null");
        Objects.requireNonNull(t13, "item4 is null");
        Objects.requireNonNull(t14, "item5 is null");
        return fromArray(t10, t11, t12, t13, t14);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<List<T>> buffer(long j10, @NonNull TimeUnit timeUnit, int i10) {
        return buffer(j10, timeUnit, Schedulers.computation(), i10);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> skip(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return skipUntil(timer(j10, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:trampoline")
    public final Observable<T> skipLast(long j10, @NonNull TimeUnit timeUnit, boolean z10) {
        return skipLast(j10, timeUnit, Schedulers.trampoline(), z10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:trampoline")
    public final Observable<T> takeLast(long j10, long j11, @NonNull TimeUnit timeUnit) {
        return takeLast(j10, j11, timeUnit, Schedulers.trampoline(), false, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<Observable<T>> window(long j10, @NonNull TimeUnit timeUnit) {
        return window(j10, timeUnit, Schedulers.computation(), Long.MAX_VALUE, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, R> Observable<R> withLatestFrom(@NonNull ObservableSource<T1> observableSource, @NonNull ObservableSource<T2> observableSource2, @NonNull ObservableSource<T3> observableSource3, @NonNull ObservableSource<T4> observableSource4, @NonNull Function5<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> function5) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(function5, "combiner is null");
        return withLatestFrom((ObservableSource<?>[]) new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4}, Functions.toFunction(function5));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> merge(@NonNull ObservableSource<? extends T> observableSource, @NonNull ObservableSource<? extends T> observableSource2, @NonNull ObservableSource<? extends T> observableSource3, @NonNull ObservableSource<? extends T> observableSource4) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        return fromArray(observableSource, observableSource2, observableSource3, observableSource4).flatMap(Functions.identity(), false, 4);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> mergeDelayError(@NonNull ObservableSource<? extends T> observableSource, @NonNull ObservableSource<? extends T> observableSource2, @NonNull ObservableSource<? extends T> observableSource3, @NonNull ObservableSource<? extends T> observableSource4) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        return fromArray(observableSource, observableSource2, observableSource3, observableSource4).flatMap(Functions.identity(), true, 4);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T1, T2, R> Observable<R> zip(@NonNull ObservableSource<? extends T1> observableSource, @NonNull ObservableSource<? extends T2> observableSource2, @NonNull BiFunction<? super T1, ? super T2, ? extends R> biFunction, boolean z10, int i10) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(biFunction, "zipper is null");
        return zipArray(Functions.toFunction(biFunction), z10, i10, observableSource, observableSource2);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<List<T>> buffer(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, int i10) {
        return (Observable<List<T>>) buffer(j10, timeUnit, scheduler, i10, ArrayListSupplier.asSupplier(), false);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMap(@NonNull Function<? super T, ? extends ObservableSource<? extends R>> function, @NonNull Function<Throwable, ? extends ObservableSource<? extends R>> function2, @NonNull Supplier<? extends ObservableSource<? extends R>> supplier, int i10) {
        Objects.requireNonNull(function, "onNextMapper is null");
        Objects.requireNonNull(function2, "onErrorMapper is null");
        Objects.requireNonNull(supplier, "onCompleteSupplier is null");
        return merge(new ObservableMapNotification(this, function, function2, supplier), i10);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> skipLast(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return skipLast(j10, timeUnit, scheduler, false, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> takeLast(long j10, long j11, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return takeLast(j10, j11, timeUnit, scheduler, false, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<Observable<T>> window(long j10, @NonNull TimeUnit timeUnit, long j11) {
        return window(j10, timeUnit, Schedulers.computation(), j11, false);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final <U extends Collection<? super T>> Observable<U> buffer(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, int i10, @NonNull Supplier<U> supplier, boolean z10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(supplier, "bufferSupplier is null");
        ObjectHelper.verifyPositive(i10, "count");
        return RxJavaPlugins.onAssembly(new ObservableBufferTimed(this, j10, j10, timeUnit, scheduler, supplier, i10, z10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final <R> Observable<R> replay(@NonNull Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i10, long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10) {
        Objects.requireNonNull(function, "selector is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replaySupplier(this, i10, j10, timeUnit, scheduler, z10), function);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> skipLast(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10) {
        return skipLast(j10, timeUnit, scheduler, z10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> takeLast(long j10, long j11, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10, int i10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        if (j10 >= 0) {
            return RxJavaPlugins.onAssembly(new ObservableTakeLastTimed(this, j10, j11, timeUnit, scheduler, i10, z10));
        }
        throw new IllegalArgumentException(v.c("count >= 0 required but it was ", j10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final Observable<Observable<T>> window(long j10, @NonNull TimeUnit timeUnit, long j11, boolean z10) {
        return window(j10, timeUnit, Schedulers.computation(), j11, z10);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final Observable<T> retry(@NonNull Predicate<? super Throwable> predicate) {
        return retry(Long.MAX_VALUE, predicate);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> skipLast(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10, int i10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableSkipLastTimed(this, j10, timeUnit, scheduler, i10 << 1, z10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<Observable<T>> window(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return window(j10, timeUnit, scheduler, Long.MAX_VALUE, false);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<Observable<T>> window(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, long j11) {
        return window(j10, timeUnit, scheduler, j11, false);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T1, T2, T3, R> Observable<R> zip(@NonNull ObservableSource<? extends T1> observableSource, @NonNull ObservableSource<? extends T2> observableSource2, @NonNull ObservableSource<? extends T3> observableSource3, @NonNull Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(function3, "zipper is null");
        return zipArray(Functions.toFunction(function3), false, bufferSize(), observableSource, observableSource2, observableSource3);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> flatMap(@NonNull Function<? super T, ? extends ObservableSource<? extends R>> function, int i10) {
        return flatMap((Function) function, false, i10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<Observable<T>> window(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, long j11, boolean z10) {
        return window(j10, timeUnit, scheduler, j11, z10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, R> Observable<R> combineLatest(@NonNull ObservableSource<? extends T1> observableSource, @NonNull ObservableSource<? extends T2> observableSource2, @NonNull ObservableSource<? extends T3> observableSource3, @NonNull ObservableSource<? extends T4> observableSource4, @NonNull ObservableSource<? extends T5> observableSource5, @NonNull Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(function5, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5}, Functions.toFunction(function5), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> just(@NonNull T t10, @NonNull T t11, @NonNull T t12, @NonNull T t13, @NonNull T t14, @NonNull T t15) {
        Objects.requireNonNull(t10, "item1 is null");
        Objects.requireNonNull(t11, "item2 is null");
        Objects.requireNonNull(t12, "item3 is null");
        Objects.requireNonNull(t13, "item4 is null");
        Objects.requireNonNull(t14, "item5 is null");
        Objects.requireNonNull(t15, "item6 is null");
        return fromArray(t10, t11, t12, t13, t14, t15);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U, R> Observable<R> flatMap(@NonNull Function<? super T, ? extends ObservableSource<? extends U>> function, @NonNull BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return flatMap(function, biFunction, false, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<Observable<T>> window(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, long j11, boolean z10, int i10) {
        ObjectHelper.verifyPositive(i10, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.verifyPositive(j11, "count");
        return RxJavaPlugins.onAssembly(new ObservableWindowTimed(this, j10, j10, timeUnit, scheduler, j11, i10, z10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<List<T>> buffer(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return (Observable<List<T>>) buffer(j10, timeUnit, scheduler, Integer.MAX_VALUE, ArrayListSupplier.asSupplier(), false);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U, R> Observable<R> flatMap(@NonNull Function<? super T, ? extends ObservableSource<? extends U>> function, @NonNull BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z10) {
        return flatMap(function, biFunction, z10, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> withLatestFrom(@NonNull ObservableSource<?>[] observableSourceArr, @NonNull Function<? super Object[], R> function) {
        Objects.requireNonNull(observableSourceArr, "others is null");
        Objects.requireNonNull(function, "combiner is null");
        return RxJavaPlugins.onAssembly(new ObservableWithLatestFromMany(this, observableSourceArr, function));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <TOpening, TClosing> Observable<List<T>> buffer(@NonNull ObservableSource<? extends TOpening> observableSource, @NonNull Function<? super TOpening, ? extends ObservableSource<? extends TClosing>> function) {
        return (Observable<List<T>>) buffer(observableSource, function, ArrayListSupplier.asSupplier());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U, R> Observable<R> flatMap(@NonNull Function<? super T, ? extends ObservableSource<? extends U>> function, @NonNull BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z10, int i10) {
        return flatMap(function, biFunction, z10, i10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final <R> Observable<R> replay(@NonNull Function<? super Observable<T>, ? extends ObservableSource<R>> function, long j10, @NonNull TimeUnit timeUnit) {
        return replay(function, j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <TOpening, TClosing, U extends Collection<? super T>> Observable<U> buffer(@NonNull ObservableSource<? extends TOpening> observableSource, @NonNull Function<? super TOpening, ? extends ObservableSource<? extends TClosing>> function, @NonNull Supplier<U> supplier) {
        Objects.requireNonNull(observableSource, "openingIndicator is null");
        Objects.requireNonNull(function, "closingIndicator is null");
        Objects.requireNonNull(supplier, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableBufferBoundary(this, observableSource, function, supplier));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U, R> Observable<R> flatMap(@NonNull Function<? super T, ? extends ObservableSource<? extends U>> function, @NonNull BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z10, int i10, int i11) {
        Objects.requireNonNull(function, "mapper is null");
        Objects.requireNonNull(biFunction, "combiner is null");
        return flatMap(ObservableInternalHelper.flatMapWithCombiner(function, biFunction), z10, i10, i11);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final <R> Observable<R> replay(@NonNull Function<? super Observable<T>, ? extends ObservableSource<R>> function, long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(function, "selector is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replaySupplier(this, j10, timeUnit, scheduler, false), function);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, R> Observable<R> zip(@NonNull ObservableSource<? extends T1> observableSource, @NonNull ObservableSource<? extends T2> observableSource2, @NonNull ObservableSource<? extends T3> observableSource3, @NonNull ObservableSource<? extends T4> observableSource4, @NonNull Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(function4, "zipper is null");
        return zipArray(Functions.toFunction(function4), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <R> Observable<R> withLatestFrom(@NonNull Iterable<? extends ObservableSource<?>> iterable, @NonNull Function<? super Object[], R> function) {
        Objects.requireNonNull(iterable, "others is null");
        Objects.requireNonNull(function, "combiner is null");
        return RxJavaPlugins.onAssembly(new ObservableWithLatestFromMany(this, iterable, function));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <B> Observable<Observable<T>> window(@NonNull ObservableSource<B> observableSource) {
        return window(observableSource, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U, R> Observable<R> flatMap(@NonNull Function<? super T, ? extends ObservableSource<? extends U>> function, @NonNull BiFunction<? super T, ? super U, ? extends R> biFunction, int i10) {
        return flatMap(function, biFunction, false, i10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <B> Observable<Observable<T>> window(@NonNull ObservableSource<B> observableSource, int i10) {
        Objects.requireNonNull(observableSource, "boundaryIndicator is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableWindowBoundary(this, observableSource, i10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, R> Observable<R> combineLatest(@NonNull ObservableSource<? extends T1> observableSource, @NonNull ObservableSource<? extends T2> observableSource2, @NonNull ObservableSource<? extends T3> observableSource3, @NonNull ObservableSource<? extends T4> observableSource4, @NonNull ObservableSource<? extends T5> observableSource5, @NonNull ObservableSource<? extends T6> observableSource6, @NonNull Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(function6, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6}, Functions.toFunction(function6), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> just(@NonNull T t10, @NonNull T t11, @NonNull T t12, @NonNull T t13, @NonNull T t14, @NonNull T t15, @NonNull T t16) {
        Objects.requireNonNull(t10, "item1 is null");
        Objects.requireNonNull(t11, "item2 is null");
        Objects.requireNonNull(t12, "item3 is null");
        Objects.requireNonNull(t13, "item4 is null");
        Objects.requireNonNull(t14, "item5 is null");
        Objects.requireNonNull(t15, "item6 is null");
        Objects.requireNonNull(t16, "item7 is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <B> Observable<List<T>> buffer(@NonNull ObservableSource<B> observableSource) {
        return (Observable<List<T>>) buffer(observableSource, ArrayListSupplier.asSupplier());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final <R> Observable<R> replay(@NonNull Function<? super Observable<T>, ? extends ObservableSource<R>> function, long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10) {
        Objects.requireNonNull(function, "selector is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.multicastSelector(ObservableInternalHelper.replaySupplier(this, j10, timeUnit, scheduler, z10), function);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <B> Observable<List<T>> buffer(@NonNull ObservableSource<B> observableSource, int i10) {
        ObjectHelper.verifyPositive(i10, "initialCapacity");
        return (Observable<List<T>>) buffer(observableSource, Functions.createArrayList(i10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U, V> Observable<Observable<T>> window(@NonNull ObservableSource<U> observableSource, @NonNull Function<? super U, ? extends ObservableSource<V>> function) {
        return window(observableSource, function, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, R> Observable<R> zip(@NonNull ObservableSource<? extends T1> observableSource, @NonNull ObservableSource<? extends T2> observableSource2, @NonNull ObservableSource<? extends T3> observableSource3, @NonNull ObservableSource<? extends T4> observableSource4, @NonNull ObservableSource<? extends T5> observableSource5, @NonNull Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(function5, "zipper is null");
        return zipArray(Functions.toFunction(function5), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <B, U extends Collection<? super T>> Observable<U> buffer(@NonNull ObservableSource<B> observableSource, @NonNull Supplier<U> supplier) {
        Objects.requireNonNull(observableSource, "boundaryIndicator is null");
        Objects.requireNonNull(supplier, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new ObservableBufferExactBoundary(this, observableSource, supplier));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final <U, V> Observable<Observable<T>> window(@NonNull ObservableSource<U> observableSource, @NonNull Function<? super U, ? extends ObservableSource<V>> function, int i10) {
        Objects.requireNonNull(observableSource, "openingIndicator is null");
        Objects.requireNonNull(function, "closingIndicator is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableWindowBoundarySelector(this, observableSource, function, i10));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final ConnectableObservable<T> replay(int i10) {
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return ObservableReplay.create(this, i10, false);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:trampoline")
    public final Observable<T> takeLast(long j10, @NonNull TimeUnit timeUnit) {
        return takeLast(j10, timeUnit, Schedulers.trampoline(), false, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:trampoline")
    public final Observable<T> takeLast(long j10, @NonNull TimeUnit timeUnit, boolean z10) {
        return takeLast(j10, timeUnit, Schedulers.trampoline(), z10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public final ConnectableObservable<T> replay(int i10, boolean z10) {
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return ObservableReplay.create(this, i10, z10);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> takeLast(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return takeLast(j10, timeUnit, scheduler, false, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> takeLast(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10) {
        return takeLast(j10, timeUnit, scheduler, z10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> Observable<R> combineLatest(@NonNull ObservableSource<? extends T1> observableSource, @NonNull ObservableSource<? extends T2> observableSource2, @NonNull ObservableSource<? extends T3> observableSource3, @NonNull ObservableSource<? extends T4> observableSource4, @NonNull ObservableSource<? extends T5> observableSource5, @NonNull ObservableSource<? extends T6> observableSource6, @NonNull ObservableSource<? extends T7> observableSource7, @NonNull Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> function7) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(function7, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7}, Functions.toFunction(function7), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> just(@NonNull T t10, @NonNull T t11, @NonNull T t12, @NonNull T t13, @NonNull T t14, @NonNull T t15, @NonNull T t16, @NonNull T t17) {
        Objects.requireNonNull(t10, "item1 is null");
        Objects.requireNonNull(t11, "item2 is null");
        Objects.requireNonNull(t12, "item3 is null");
        Objects.requireNonNull(t13, "item4 is null");
        Objects.requireNonNull(t14, "item5 is null");
        Objects.requireNonNull(t15, "item6 is null");
        Objects.requireNonNull(t16, "item7 is null");
        Objects.requireNonNull(t17, "item8 is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16, t17);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final ConnectableObservable<T> replay(int i10, long j10, @NonNull TimeUnit timeUnit) {
        return replay(i10, j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final Observable<T> takeLast(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10, int i10) {
        return takeLast(Long.MAX_VALUE, j10, timeUnit, scheduler, z10, i10);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final ConnectableObservable<T> replay(int i10, long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        ObjectHelper.verifyPositive(i10, "bufferSize");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.create(this, j10, timeUnit, scheduler, i10, false);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, R> Observable<R> zip(@NonNull ObservableSource<? extends T1> observableSource, @NonNull ObservableSource<? extends T2> observableSource2, @NonNull ObservableSource<? extends T3> observableSource3, @NonNull ObservableSource<? extends T4> observableSource4, @NonNull ObservableSource<? extends T5> observableSource5, @NonNull ObservableSource<? extends T6> observableSource6, @NonNull Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(function6, "zipper is null");
        return zipArray(Functions.toFunction(function6), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final ConnectableObservable<T> replay(int i10, long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10) {
        ObjectHelper.verifyPositive(i10, "bufferSize");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.create(this, j10, timeUnit, scheduler, i10, z10);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Observable<R> combineLatest(@NonNull ObservableSource<? extends T1> observableSource, @NonNull ObservableSource<? extends T2> observableSource2, @NonNull ObservableSource<? extends T3> observableSource3, @NonNull ObservableSource<? extends T4> observableSource4, @NonNull ObservableSource<? extends T5> observableSource5, @NonNull ObservableSource<? extends T6> observableSource6, @NonNull ObservableSource<? extends T7> observableSource7, @NonNull ObservableSource<? extends T8> observableSource8, @NonNull Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(observableSource8, "source8 is null");
        Objects.requireNonNull(function8, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8}, Functions.toFunction(function8), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> just(@NonNull T t10, @NonNull T t11, @NonNull T t12, @NonNull T t13, @NonNull T t14, @NonNull T t15, @NonNull T t16, @NonNull T t17, @NonNull T t18) {
        Objects.requireNonNull(t10, "item1 is null");
        Objects.requireNonNull(t11, "item2 is null");
        Objects.requireNonNull(t12, "item3 is null");
        Objects.requireNonNull(t13, "item4 is null");
        Objects.requireNonNull(t14, "item5 is null");
        Objects.requireNonNull(t15, "item6 is null");
        Objects.requireNonNull(t16, "item7 is null");
        Objects.requireNonNull(t17, "item8 is null");
        Objects.requireNonNull(t18, "item9 is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16, t17, t18);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("io.reactivex:computation")
    public final ConnectableObservable<T> replay(long j10, @NonNull TimeUnit timeUnit) {
        return replay(j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> Observable<R> zip(@NonNull ObservableSource<? extends T1> observableSource, @NonNull ObservableSource<? extends T2> observableSource2, @NonNull ObservableSource<? extends T3> observableSource3, @NonNull ObservableSource<? extends T4> observableSource4, @NonNull ObservableSource<? extends T5> observableSource5, @NonNull ObservableSource<? extends T6> observableSource6, @NonNull ObservableSource<? extends T7> observableSource7, @NonNull Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> function7) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(function7, "zipper is null");
        return zipArray(Functions.toFunction(function7), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final ConnectableObservable<T> replay(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.create(this, j10, timeUnit, scheduler, false);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("custom")
    public final ConnectableObservable<T> replay(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.create(this, j10, timeUnit, scheduler, z10);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Observable<R> combineLatest(@NonNull ObservableSource<? extends T1> observableSource, @NonNull ObservableSource<? extends T2> observableSource2, @NonNull ObservableSource<? extends T3> observableSource3, @NonNull ObservableSource<? extends T4> observableSource4, @NonNull ObservableSource<? extends T5> observableSource5, @NonNull ObservableSource<? extends T6> observableSource6, @NonNull ObservableSource<? extends T7> observableSource7, @NonNull ObservableSource<? extends T8> observableSource8, @NonNull ObservableSource<? extends T9> observableSource9, @NonNull Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> function9) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(observableSource8, "source8 is null");
        Objects.requireNonNull(observableSource9, "source9 is null");
        Objects.requireNonNull(function9, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8, observableSource9}, Functions.toFunction(function9), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T> Observable<T> just(@NonNull T t10, @NonNull T t11, @NonNull T t12, @NonNull T t13, @NonNull T t14, @NonNull T t15, @NonNull T t16, @NonNull T t17, @NonNull T t18, @NonNull T t19) {
        Objects.requireNonNull(t10, "item1 is null");
        Objects.requireNonNull(t11, "item2 is null");
        Objects.requireNonNull(t12, "item3 is null");
        Objects.requireNonNull(t13, "item4 is null");
        Objects.requireNonNull(t14, "item5 is null");
        Objects.requireNonNull(t15, "item6 is null");
        Objects.requireNonNull(t16, "item7 is null");
        Objects.requireNonNull(t17, "item8 is null");
        Objects.requireNonNull(t18, "item9 is null");
        Objects.requireNonNull(t19, "item10 is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Observable<R> zip(@NonNull ObservableSource<? extends T1> observableSource, @NonNull ObservableSource<? extends T2> observableSource2, @NonNull ObservableSource<? extends T3> observableSource3, @NonNull ObservableSource<? extends T4> observableSource4, @NonNull ObservableSource<? extends T5> observableSource5, @NonNull ObservableSource<? extends T6> observableSource6, @NonNull ObservableSource<? extends T7> observableSource7, @NonNull ObservableSource<? extends T8> observableSource8, @NonNull Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(observableSource8, "source8 is null");
        Objects.requireNonNull(function8, "zipper is null");
        return zipArray(Functions.toFunction(function8), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Observable<R> zip(@NonNull ObservableSource<? extends T1> observableSource, @NonNull ObservableSource<? extends T2> observableSource2, @NonNull ObservableSource<? extends T3> observableSource3, @NonNull ObservableSource<? extends T4> observableSource4, @NonNull ObservableSource<? extends T5> observableSource5, @NonNull ObservableSource<? extends T6> observableSource6, @NonNull ObservableSource<? extends T7> observableSource7, @NonNull ObservableSource<? extends T8> observableSource8, @NonNull ObservableSource<? extends T9> observableSource9, @NonNull Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> function9) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(observableSource8, "source8 is null");
        Objects.requireNonNull(observableSource9, "source9 is null");
        Objects.requireNonNull(function9, "zipper is null");
        return zipArray(Functions.toFunction(function9), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8, observableSource9);
    }
}
