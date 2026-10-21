package io.reactivex.rxjava3.core;

import androidx.activity.o;
import androidx.appcompat.app.n;
import androidx.appcompat.app.r;
import androidx.appcompat.widget.g0;
import androidx.camera.core.impl.v;
import com.adobe.marketing.mobile.EventDataKeys;
import ie.z;
import io.reactivex.rxjava3.annotations.BackpressureKind;
import io.reactivex.rxjava3.annotations.BackpressureSupport;
import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.flowables.ConnectableFlowable;
import io.reactivex.rxjava3.flowables.GroupedFlowable;
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
import io.reactivex.rxjava3.functions.LongConsumer;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.fuseable.ScalarSupplier;
import io.reactivex.rxjava3.internal.jdk8.FlowableCollectWithCollectorSingle;
import io.reactivex.rxjava3.internal.jdk8.FlowableFirstStageSubscriber;
import io.reactivex.rxjava3.internal.jdk8.FlowableFlatMapStream;
import io.reactivex.rxjava3.internal.jdk8.FlowableFromCompletionStage;
import io.reactivex.rxjava3.internal.jdk8.FlowableFromStream;
import io.reactivex.rxjava3.internal.jdk8.FlowableLastStageSubscriber;
import io.reactivex.rxjava3.internal.jdk8.FlowableMapOptional;
import io.reactivex.rxjava3.internal.jdk8.FlowableSingleStageSubscriber;
import io.reactivex.rxjava3.internal.operators.flowable.BlockingFlowableIterable;
import io.reactivex.rxjava3.internal.operators.flowable.BlockingFlowableLatest;
import io.reactivex.rxjava3.internal.operators.flowable.BlockingFlowableMostRecent;
import io.reactivex.rxjava3.internal.operators.flowable.BlockingFlowableNext;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableAllSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableAmb;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableAnySingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableBlockingSubscribe;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableBuffer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableBufferBoundary;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableBufferExactBoundary;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableBufferTimed;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCache;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCollectSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCombineLatest;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatArray;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapEager;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapEagerPublisher;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapScheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatWithCompletable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatWithMaybe;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatWithSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCountSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDebounce;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDebounceTimed;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDefer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDelay;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDelaySubscriptionOther;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDematerialize;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDetach;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinct;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoAfterNext;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoFinally;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoOnEach;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoOnLifecycle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtMaybe;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableError;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMapCompletableCompletable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMapMaybe;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMapSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlattenIterable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromCallable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromCompletable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromFuture;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromObservable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromPublisher;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromRunnable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromSupplier;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableGenerate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableGroupBy;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableGroupJoin;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableHide;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableIgnoreElements;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableIgnoreElementsCompletable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableInternalHelper;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableInterval;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableIntervalRange;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJoin;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableLastMaybe;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableLastSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableLift;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMapNotification;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMaterialize;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMergeWithCompletable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMergeWithMaybe;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMergeWithSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableNever;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureBuffer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureBufferStrategy;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureDrop;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureError;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnErrorNext;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnErrorReturn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowablePublish;
import io.reactivex.rxjava3.internal.operators.flowable.FlowablePublishMulticast;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRange;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRangeLong;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableReduceMaybe;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableReduceSeedSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableReduceWithSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRepeat;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRepeatUntil;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRepeatWhen;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRetryBiPredicate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRetryPredicate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRetryWhen;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSamplePublisher;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSampleTimed;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableScalarXMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableScan;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableScanSeed;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSequenceEqualSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSerialized;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleMaybe;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSkip;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSkipLast;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSkipLastTimed;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSkipUntil;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSkipWhile;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSubscribeOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSwitchIfEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSwitchMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTakeLast;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTakeLastOne;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTakeLastTimed;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTakeUntil;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTakeUntilPredicate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTakeWhile;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableThrottleFirstTimed;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableThrottleLatest;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTimeInterval;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTimeout;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTimeoutTimed;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTimer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableToListSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableUnsubscribeOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableUsing;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableWindow;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableWindowBoundary;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableWindowBoundarySelector;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableWindowTimed;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableWithLatestFrom;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableWithLatestFromMany;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableZip;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableZipIterable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToFlowable;
import io.reactivex.rxjava3.internal.operators.mixed.FlowableConcatMapCompletable;
import io.reactivex.rxjava3.internal.operators.mixed.FlowableConcatMapMaybe;
import io.reactivex.rxjava3.internal.operators.mixed.FlowableConcatMapSingle;
import io.reactivex.rxjava3.internal.operators.mixed.FlowableSwitchMapCompletable;
import io.reactivex.rxjava3.internal.operators.mixed.FlowableSwitchMapMaybe;
import io.reactivex.rxjava3.internal.operators.mixed.FlowableSwitchMapSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.internal.operators.single.SingleToFlowable;
import io.reactivex.rxjava3.internal.schedulers.ImmediateThinScheduler;
import io.reactivex.rxjava3.internal.subscribers.BlockingFirstSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BlockingLastSubscriber;
import io.reactivex.rxjava3.internal.subscribers.ForEachWhileSubscriber;
import io.reactivex.rxjava3.internal.subscribers.FutureSubscriber;
import io.reactivex.rxjava3.internal.subscribers.LambdaSubscriber;
import io.reactivex.rxjava3.internal.subscribers.StrictSubscriber;
import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.HashMapSupplier;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.schedulers.Timed;
import io.reactivex.rxjava3.subscribers.SafeSubscriber;
import io.reactivex.rxjava3.subscribers.TestSubscriber;
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
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Flowable<T> implements Publisher<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f73940p0 = Math.max(1, Integer.getInteger("rx3.buffer-size", 128).intValue());

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73941a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            f73941a = iArr;
            try {
                iArr[BackpressureStrategy.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73941a[BackpressureStrategy.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73941a[BackpressureStrategy.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f73941a[BackpressureStrategy.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public static <T> Flowable<T> amb(@NonNull Iterable<? extends Publisher<? extends T>> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new FlowableAmb(null, iterable));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Flowable<T> ambArray(@NonNull Publisher<? extends T>... publisherArr) {
        Objects.requireNonNull(publisherArr, "sources is null");
        int length = publisherArr.length;
        if (length == 0) {
            return empty();
        }
        return length == 1 ? fromPublisher(publisherArr[0]) : RxJavaPlugins.onAssembly(new FlowableAmb(publisherArr, null));
    }

    @CheckReturnValue
    public static int bufferSize() {
        return f73940p0;
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T, R> Flowable<R> combineLatest(@NonNull Iterable<? extends Publisher<? extends T>> iterable, @NonNull Function<? super Object[], ? extends R> function) {
        return combineLatest(iterable, function, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T, R> Flowable<R> combineLatestArray(@NonNull Publisher<? extends T>[] publisherArr, @NonNull Function<? super Object[], ? extends R> function) {
        return combineLatestArray(publisherArr, function, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T, R> Flowable<R> combineLatestArrayDelayError(@NonNull Publisher<? extends T>[] publisherArr, @NonNull Function<? super Object[], ? extends R> function) {
        return combineLatestArrayDelayError(publisherArr, function, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T, R> Flowable<R> combineLatestDelayError(@NonNull Iterable<? extends Publisher<? extends T>> iterable, @NonNull Function<? super Object[], ? extends R> function) {
        return combineLatestDelayError(iterable, function, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> concat(@NonNull Iterable<? extends Publisher<? extends T>> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(Functions.identity(), false, 2);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Flowable<T> concatArray(@NonNull Publisher<? extends T>... publisherArr) {
        Objects.requireNonNull(publisherArr, "sources is null");
        if (publisherArr.length == 0) {
            return empty();
        }
        return publisherArr.length == 1 ? fromPublisher(publisherArr[0]) : RxJavaPlugins.onAssembly(new FlowableConcatArray(publisherArr, false));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Flowable<T> concatArrayDelayError(@NonNull Publisher<? extends T>... publisherArr) {
        Objects.requireNonNull(publisherArr, "sources is null");
        if (publisherArr.length == 0) {
            return empty();
        }
        return publisherArr.length == 1 ? fromPublisher(publisherArr[0]) : RxJavaPlugins.onAssembly(new FlowableConcatArray(publisherArr, true));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Flowable<T> concatArrayEager(@NonNull Publisher<? extends T>... publisherArr) {
        return concatArrayEager(bufferSize(), bufferSize(), publisherArr);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Flowable<T> concatArrayEagerDelayError(@NonNull Publisher<? extends T>... publisherArr) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), publisherArr);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> concatDelayError(@NonNull Iterable<? extends Publisher<? extends T>> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(Functions.identity());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> concatEager(@NonNull Iterable<? extends Publisher<? extends T>> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> concatEagerDelayError(@NonNull Iterable<? extends Publisher<? extends T>> iterable) {
        return concatEagerDelayError(iterable, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> create(@NonNull FlowableOnSubscribe<T> flowableOnSubscribe, @NonNull BackpressureStrategy backpressureStrategy) {
        Objects.requireNonNull(flowableOnSubscribe, "source is null");
        Objects.requireNonNull(backpressureStrategy, "mode is null");
        return RxJavaPlugins.onAssembly(new FlowableCreate(flowableOnSubscribe, backpressureStrategy));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public static <T> Flowable<T> defer(@NonNull Supplier<? extends Publisher<? extends T>> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return RxJavaPlugins.onAssembly(new FlowableDefer(supplier));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public static <T> Flowable<T> empty() {
        return RxJavaPlugins.onAssembly(FlowableEmpty.INSTANCE);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public static <T> Flowable<T> error(@NonNull Supplier<? extends Throwable> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return RxJavaPlugins.onAssembly(new FlowableError(supplier));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public static <T> Flowable<T> fromAction(@NonNull Action action) {
        Objects.requireNonNull(action, "action is null");
        return RxJavaPlugins.onAssembly(new FlowableFromAction(action));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Flowable<T> fromArray(@NonNull T... tArr) {
        Objects.requireNonNull(tArr, "items is null");
        if (tArr.length == 0) {
            return empty();
        }
        return tArr.length == 1 ? just(tArr[0]) : RxJavaPlugins.onAssembly(new FlowableFromArray(tArr));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> fromCallable(@NonNull Callable<? extends T> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return RxJavaPlugins.onAssembly(new FlowableFromCallable(callable));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public static <T> Flowable<T> fromCompletable(@NonNull CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "completableSource is null");
        return RxJavaPlugins.onAssembly(new FlowableFromCompletable(completableSource));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> fromCompletionStage(@NonNull CompletionStage<T> completionStage) {
        Objects.requireNonNull(completionStage, "stage is null");
        return RxJavaPlugins.onAssembly(new FlowableFromCompletionStage(completionStage));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> fromFuture(@NonNull Future<? extends T> future) {
        Objects.requireNonNull(future, "future is null");
        return RxJavaPlugins.onAssembly(new FlowableFromFuture(future, 0L, null));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> fromIterable(@NonNull Iterable<? extends T> iterable) {
        Objects.requireNonNull(iterable, "source is null");
        return RxJavaPlugins.onAssembly(new FlowableFromIterable(iterable));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> fromMaybe(@NonNull MaybeSource<T> maybeSource) {
        Objects.requireNonNull(maybeSource, "maybe is null");
        return RxJavaPlugins.onAssembly(new MaybeToFlowable(maybeSource));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> fromObservable(@NonNull ObservableSource<T> observableSource, @NonNull BackpressureStrategy backpressureStrategy) {
        Objects.requireNonNull(observableSource, "source is null");
        Objects.requireNonNull(backpressureStrategy, "strategy is null");
        FlowableFromObservable flowableFromObservable = new FlowableFromObservable(observableSource);
        int i10 = a.f73941a[backpressureStrategy.ordinal()];
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
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> fromOptional(@NonNull Optional<T> optional) {
        Objects.requireNonNull(optional, "optional is null");
        return (Flowable) optional.map(new z(5)).orElseGet(new qj.a());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public static <T> Flowable<T> fromPublisher(@NonNull Publisher<? extends T> publisher) {
        if (publisher instanceof Flowable) {
            return RxJavaPlugins.onAssembly((Flowable) publisher);
        }
        Objects.requireNonNull(publisher, "publisher is null");
        return RxJavaPlugins.onAssembly(new FlowableFromPublisher(publisher));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public static <T> Flowable<T> fromRunnable(@NonNull Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        return RxJavaPlugins.onAssembly(new FlowableFromRunnable(runnable));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> fromSingle(@NonNull SingleSource<T> singleSource) {
        Objects.requireNonNull(singleSource, "source is null");
        return RxJavaPlugins.onAssembly(new SingleToFlowable(singleSource));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> fromStream(@NonNull Stream<T> stream) {
        Objects.requireNonNull(stream, "stream is null");
        return RxJavaPlugins.onAssembly(new FlowableFromStream(stream));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> fromSupplier(@NonNull Supplier<? extends T> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return RxJavaPlugins.onAssembly(new FlowableFromSupplier(supplier));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> generate(@NonNull Consumer<Emitter<T>> consumer) {
        Objects.requireNonNull(consumer, "generator is null");
        return generate(Functions.nullSupplier(), FlowableInternalHelper.simpleGenerator(consumer), Functions.emptyConsumer());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("io.reactivex:computation")
    public static Flowable<Long> interval(long j10, long j11, @NonNull TimeUnit timeUnit) {
        return interval(j10, j11, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("io.reactivex:computation")
    public static Flowable<Long> intervalRange(long j10, long j11, long j12, long j13, @NonNull TimeUnit timeUnit) {
        return intervalRange(j10, j11, j12, j13, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> just(T t10) {
        Objects.requireNonNull(t10, "item is null");
        return RxJavaPlugins.onAssembly(new FlowableJust(t10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> merge(@NonNull Iterable<? extends Publisher<? extends T>> iterable, int i10, int i11) {
        return fromIterable(iterable).flatMap(Functions.identity(), false, i10, i11);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Flowable<T> mergeArray(int i10, int i11, @NonNull Publisher<? extends T>... publisherArr) {
        return fromArray(publisherArr).flatMap(Functions.identity(), false, i10, i11);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Flowable<T> mergeArrayDelayError(int i10, int i11, @NonNull Publisher<? extends T>... publisherArr) {
        return fromArray(publisherArr).flatMap(Functions.identity(), true, i10, i11);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> mergeDelayError(@NonNull Iterable<? extends Publisher<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Functions.identity(), true);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public static <T> Flowable<T> never() {
        return RxJavaPlugins.onAssembly(FlowableNever.INSTANCE);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static Flowable<Integer> range(int i10, int i11) {
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
            return RxJavaPlugins.onAssembly(new FlowableRange(i10, i11));
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static Flowable<Long> rangeLong(long j10, long j11) {
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
            return RxJavaPlugins.onAssembly(new FlowableRangeLong(j10, j11));
        }
        throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Single<Boolean> sequenceEqual(@NonNull Publisher<? extends T> publisher, @NonNull Publisher<? extends T> publisher2) {
        return sequenceEqual(publisher, publisher2, ObjectHelper.equalsPredicate(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> switchOnNext(@NonNull Publisher<? extends Publisher<? extends T>> publisher, int i10) {
        return fromPublisher(publisher).switchMap(Functions.identity(), i10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> switchOnNextDelayError(@NonNull Publisher<? extends Publisher<? extends T>> publisher) {
        return switchOnNextDelayError(publisher, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("io.reactivex:computation")
    public static Flowable<Long> timer(long j10, @NonNull TimeUnit timeUnit) {
        return timer(j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.NONE)
    @SchedulerSupport("none")
    public static <T> Flowable<T> unsafeCreate(@NonNull Publisher<T> publisher) {
        Objects.requireNonNull(publisher, "onSubscribe is null");
        if (publisher instanceof Flowable) {
            throw new IllegalArgumentException("unsafeCreate(Flowable) should be upgraded");
        }
        return RxJavaPlugins.onAssembly(new FlowableFromPublisher(publisher));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public static <T, D> Flowable<T> using(@NonNull Supplier<? extends D> supplier, @NonNull Function<? super D, ? extends Publisher<? extends T>> function, @NonNull Consumer<? super D> consumer) {
        return using(supplier, function, consumer, true);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T, R> Flowable<R> zip(@NonNull Iterable<? extends Publisher<? extends T>> iterable, @NonNull Function<? super Object[], ? extends R> function) {
        Objects.requireNonNull(function, "zipper is null");
        Objects.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new FlowableZip(null, iterable, function, bufferSize(), false));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T, R> Flowable<R> zipArray(@NonNull Function<? super Object[], ? extends R> function, boolean z10, int i10, @NonNull Publisher<? extends T>... publisherArr) {
        Objects.requireNonNull(publisherArr, "sources is null");
        if (publisherArr.length == 0) {
            return empty();
        }
        Objects.requireNonNull(function, "zipper is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableZip(publisherArr, null, function, i10, z10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> a(@NonNull Consumer<? super T> consumer, @NonNull Consumer<? super Throwable> consumer2, Action action, Action action2) {
        Objects.requireNonNull(consumer, "onNext is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        Objects.requireNonNull(action2, "onAfterTerminate is null");
        return RxJavaPlugins.onAssembly(new FlowableDoOnEach(this, consumer, consumer2, action, action2));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Single<Boolean> all(@NonNull Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new FlowableAllSingle(this, predicate));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> ambWith(@NonNull Publisher<? extends T> publisher) {
        Objects.requireNonNull(publisher, "other is null");
        return ambArray(this, publisher);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Single<Boolean> any(@NonNull Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new FlowableAnySingle(this, predicate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Flowable<R> b(Function<? super T, ? extends Publisher<? extends R>> function, int i10, boolean z10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        if (!(this instanceof ScalarSupplier)) {
            return RxJavaPlugins.onAssembly(new FlowableSwitchMap(this, function, i10, z10));
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? empty() : FlowableScalarXMap.scalarXMap(obj, function);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final T blockingFirst() {
        BlockingFirstSubscriber blockingFirstSubscriber = new BlockingFirstSubscriber();
        subscribe((FlowableSubscriber) blockingFirstSubscriber);
        T tBlockingGet = blockingFirstSubscriber.blockingGet();
        if (tBlockingGet != null) {
            return tBlockingGet;
        }
        throw new NoSuchElementException();
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final void blockingForEach(@NonNull Consumer<? super T> consumer) {
        blockingForEach(consumer, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Iterable<T> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final T blockingLast() {
        BlockingLastSubscriber blockingLastSubscriber = new BlockingLastSubscriber();
        subscribe((FlowableSubscriber) blockingLastSubscriber);
        T tBlockingGet = blockingLastSubscriber.blockingGet();
        if (tBlockingGet != null) {
            return tBlockingGet;
        }
        throw new NoSuchElementException();
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Iterable<T> blockingLatest() {
        return new BlockingFlowableLatest(this);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Iterable<T> blockingMostRecent(@NonNull T t10) {
        Objects.requireNonNull(t10, "initialItem is null");
        return new BlockingFlowableMostRecent(this, t10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Iterable<T> blockingNext() {
        return new BlockingFlowableNext(this);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final T blockingSingle() {
        return singleOrError().blockingGet();
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Stream<T> blockingStream() {
        return blockingStream(bufferSize());
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final void blockingSubscribe() {
        FlowableBlockingSubscribe.subscribe(this);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<List<T>> buffer(int i10) {
        return buffer(i10, i10);
    }

    public final Flowable c(long j10, TimeUnit timeUnit, Scheduler scheduler, Publisher publisher) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableTimeoutTimed(this, j10, timeUnit, scheduler, publisher));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> cache() {
        return cacheWithInitialCapacity(16);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> cacheWithInitialCapacity(int i10) {
        ObjectHelper.verifyPositive(i10, "initialCapacity");
        return RxJavaPlugins.onAssembly(new FlowableCache(this, i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final <U> Flowable<U> cast(@NonNull Class<U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return (Flowable<U>) map(Functions.castFunction(cls));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final <U> Single<U> collect(@NonNull Supplier<? extends U> supplier, @NonNull BiConsumer<? super U, ? super T> biConsumer) {
        Objects.requireNonNull(supplier, "initialItemSupplier is null");
        Objects.requireNonNull(biConsumer, "collector is null");
        return RxJavaPlugins.onAssembly(new FlowableCollectSingle(this, supplier, biConsumer));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final <U> Single<U> collectInto(U u2, @NonNull BiConsumer<? super U, ? super T> biConsumer) {
        Objects.requireNonNull(u2, "initialItem is null");
        return collect(Functions.justSupplier(u2), biConsumer);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final <R> Flowable<R> compose(@NonNull FlowableTransformer<? super T, ? extends R> flowableTransformer) {
        Objects.requireNonNull(flowableTransformer, "composer is null");
        return fromPublisher(flowableTransformer.apply(this));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> concatMap(@NonNull Function<? super T, ? extends Publisher<? extends R>> function) {
        return concatMap(function, 2);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Completable concatMapCompletable(@NonNull Function<? super T, ? extends CompletableSource> function) {
        return concatMapCompletable(function, 2);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Completable concatMapCompletableDelayError(@NonNull Function<? super T, ? extends CompletableSource> function) {
        return concatMapCompletableDelayError(function, true, 2);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> concatMapDelayError(@NonNull Function<? super T, ? extends Publisher<? extends R>> function) {
        return concatMapDelayError(function, true, 2);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> concatMapEager(@NonNull Function<? super T, ? extends Publisher<? extends R>> function) {
        return concatMapEager(function, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> concatMapEagerDelayError(@NonNull Function<? super T, ? extends Publisher<? extends R>> function, boolean z10) {
        return concatMapEagerDelayError(function, z10, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U> Flowable<U> concatMapIterable(@NonNull Function<? super T, ? extends Iterable<? extends U>> function) {
        return concatMapIterable(function, 2);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> concatMapMaybe(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return concatMapMaybe(function, 2);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> concatMapMaybeDelayError(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return concatMapMaybeDelayError(function, true, 2);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> concatMapSingle(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function) {
        return concatMapSingle(function, 2);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> concatMapSingleDelayError(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function) {
        return concatMapSingleDelayError(function, true, 2);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> concatMapStream(@NonNull Function<? super T, ? extends Stream<? extends R>> function) {
        return flatMapStream(function, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> concatWith(@NonNull Publisher<? extends T> publisher) {
        Objects.requireNonNull(publisher, "other is null");
        return concat(this, publisher);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Single<Boolean> contains(@NonNull Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return any(Functions.equalsWith(obj));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Single<Long> count() {
        return RxJavaPlugins.onAssembly(new FlowableCountSingle(this));
    }

    public final <U, V> Flowable<T> d(Publisher<U> publisher, Function<? super T, ? extends Publisher<V>> function, Publisher<? extends T> publisher2) {
        Objects.requireNonNull(function, "itemTimeoutIndicator is null");
        return RxJavaPlugins.onAssembly(new FlowableTimeout(this, publisher, function, publisher2));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("none")
    public final <U> Flowable<T> debounce(@NonNull Function<? super T, ? extends Publisher<U>> function) {
        Objects.requireNonNull(function, "debounceIndicator is null");
        return RxJavaPlugins.onAssembly(new FlowableDebounce(this, function));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> defaultIfEmpty(@NonNull T t10) {
        Objects.requireNonNull(t10, "defaultItem is null");
        return switchIfEmpty(just(t10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U> Flowable<T> delay(@NonNull Function<? super T, ? extends Publisher<U>> function) {
        Objects.requireNonNull(function, "itemDelayIndicator is null");
        return (Flowable<T>) flatMap(FlowableInternalHelper.itemDelay(function));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U> Flowable<T> delaySubscription(@NonNull Publisher<U> publisher) {
        Objects.requireNonNull(publisher, "subscriptionIndicator is null");
        return RxJavaPlugins.onAssembly(new FlowableDelaySubscriptionOther(this, publisher));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final <R> Flowable<R> dematerialize(@NonNull Function<? super T, Notification<R>> function) {
        Objects.requireNonNull(function, "selector is null");
        return RxJavaPlugins.onAssembly(new FlowableDematerialize(this, function));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> distinct() {
        return distinct(Functions.identity(), Functions.createHashSet());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> distinctUntilChanged() {
        return distinctUntilChanged(Functions.identity());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> doAfterNext(@NonNull Consumer<? super T> consumer) {
        Objects.requireNonNull(consumer, "onAfterNext is null");
        return RxJavaPlugins.onAssembly(new FlowableDoAfterNext(this, consumer));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> doAfterTerminate(@NonNull Action action) {
        return a(Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, action);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> doFinally(@NonNull Action action) {
        Objects.requireNonNull(action, "onFinally is null");
        return RxJavaPlugins.onAssembly(new FlowableDoFinally(this, action));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> doOnCancel(@NonNull Action action) {
        return doOnLifecycle(Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, action);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> doOnComplete(@NonNull Action action) {
        return a(Functions.emptyConsumer(), Functions.emptyConsumer(), action, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> doOnEach(@NonNull Consumer<? super Notification<T>> consumer) {
        Objects.requireNonNull(consumer, "onNotification is null");
        return a(Functions.notificationOnNext(consumer), Functions.notificationOnError(consumer), Functions.notificationOnComplete(consumer), Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> doOnError(@NonNull Consumer<? super Throwable> consumer) {
        Consumer<? super T> consumerEmptyConsumer = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        return a(consumerEmptyConsumer, consumer, action, action);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> doOnLifecycle(@NonNull Consumer<? super Subscription> consumer, @NonNull LongConsumer longConsumer, @NonNull Action action) {
        Objects.requireNonNull(consumer, "onSubscribe is null");
        Objects.requireNonNull(longConsumer, "onRequest is null");
        Objects.requireNonNull(action, "onCancel is null");
        return RxJavaPlugins.onAssembly(new FlowableDoOnLifecycle(this, consumer, longConsumer, action));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> doOnNext(@NonNull Consumer<? super T> consumer) {
        Consumer<? super Throwable> consumerEmptyConsumer = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        return a(consumer, consumerEmptyConsumer, action, action);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> doOnRequest(@NonNull LongConsumer longConsumer) {
        return doOnLifecycle(Functions.emptyConsumer(), longConsumer, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> doOnSubscribe(@NonNull Consumer<? super Subscription> consumer) {
        return doOnLifecycle(consumer, Functions.EMPTY_LONG_CONSUMER, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> doOnTerminate(@NonNull Action action) {
        return a(Functions.emptyConsumer(), Functions.actionConsumer(action), action, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Maybe<T> elementAt(long j10) {
        if (j10 >= 0) {
            return RxJavaPlugins.onAssembly(new FlowableElementAtMaybe(this, j10));
        }
        throw new IndexOutOfBoundsException(v.c("index >= 0 required but it was ", j10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Single<T> elementAtOrError(long j10) {
        if (j10 >= 0) {
            return RxJavaPlugins.onAssembly(new FlowableElementAtSingle(this, j10, null));
        }
        throw new IndexOutOfBoundsException(v.c("index >= 0 required but it was ", j10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> filter(@NonNull Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new FlowableFilter(this, predicate));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Single<T> first(@NonNull T t10) {
        return elementAt(0L, t10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Maybe<T> firstElement() {
        return elementAt(0L);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Single<T> firstOrError() {
        return elementAtOrError(0L);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final CompletionStage<T> firstOrErrorStage() {
        return n.c(subscribeWith(new FlowableFirstStageSubscriber(false, null)));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final CompletionStage<T> firstStage(@Nullable T t10) {
        return n.c(subscribeWith(new FlowableFirstStageSubscriber(true, t10)));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> flatMap(@NonNull Function<? super T, ? extends Publisher<? extends R>> function) {
        return flatMap((Function) function, false, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Completable flatMapCompletable(@NonNull Function<? super T, ? extends CompletableSource> function) {
        return flatMapCompletable(function, false, Integer.MAX_VALUE);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U> Flowable<U> flatMapIterable(@NonNull Function<? super T, ? extends Iterable<? extends U>> function) {
        return flatMapIterable(function, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final <R> Flowable<R> flatMapMaybe(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return flatMapMaybe(function, false, Integer.MAX_VALUE);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final <R> Flowable<R> flatMapSingle(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function) {
        return flatMapSingle(function, false, Integer.MAX_VALUE);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> flatMapStream(@NonNull Function<? super T, ? extends Stream<? extends R>> function) {
        return flatMapStream(function, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.NONE)
    @SchedulerSupport("none")
    public final Disposable forEach(@NonNull Consumer<? super T> consumer) {
        return subscribe(consumer);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.NONE)
    @SchedulerSupport("none")
    public final Disposable forEachWhile(@NonNull Predicate<? super T> predicate) {
        return forEachWhile(predicate, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("none")
    public final <K> Flowable<GroupedFlowable<K, T>> groupBy(@NonNull Function<? super T, ? extends K> function) {
        return (Flowable<GroupedFlowable<K, T>>) groupBy(function, Functions.identity(), false, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("none")
    public final <TRight, TLeftEnd, TRightEnd, R> Flowable<R> groupJoin(@NonNull Publisher<? extends TRight> publisher, @NonNull Function<? super T, ? extends Publisher<TLeftEnd>> function, @NonNull Function<? super TRight, ? extends Publisher<TRightEnd>> function2, @NonNull BiFunction<? super T, ? super Flowable<TRight>, ? extends R> biFunction) {
        Objects.requireNonNull(publisher, "other is null");
        Objects.requireNonNull(function, "leftEnd is null");
        Objects.requireNonNull(function2, "rightEnd is null");
        Objects.requireNonNull(biFunction, "resultSelector is null");
        return RxJavaPlugins.onAssembly(new FlowableGroupJoin(this, publisher, function, function2, biFunction));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> hide() {
        return RxJavaPlugins.onAssembly(new FlowableHide(this));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Completable ignoreElements() {
        return RxJavaPlugins.onAssembly(new FlowableIgnoreElementsCompletable(this));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Single<Boolean> isEmpty() {
        return all(Functions.alwaysFalse());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("none")
    public final <TRight, TLeftEnd, TRightEnd, R> Flowable<R> join(@NonNull Publisher<? extends TRight> publisher, @NonNull Function<? super T, ? extends Publisher<TLeftEnd>> function, @NonNull Function<? super TRight, ? extends Publisher<TRightEnd>> function2, @NonNull BiFunction<? super T, ? super TRight, ? extends R> biFunction) {
        Objects.requireNonNull(publisher, "other is null");
        Objects.requireNonNull(function, "leftEnd is null");
        Objects.requireNonNull(function2, "rightEnd is null");
        Objects.requireNonNull(biFunction, "resultSelector is null");
        return RxJavaPlugins.onAssembly(new FlowableJoin(this, publisher, function, function2, biFunction));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Single<T> last(@NonNull T t10) {
        Objects.requireNonNull(t10, "defaultItem is null");
        return RxJavaPlugins.onAssembly(new FlowableLastSingle(this, t10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Maybe<T> lastElement() {
        return RxJavaPlugins.onAssembly(new FlowableLastMaybe(this));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Single<T> lastOrError() {
        return RxJavaPlugins.onAssembly(new FlowableLastSingle(this, null));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final CompletionStage<T> lastOrErrorStage() {
        return n.c(subscribeWith(new FlowableLastStageSubscriber(false, null)));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final CompletionStage<T> lastStage(@Nullable T t10) {
        return n.c(subscribeWith(new FlowableLastStageSubscriber(true, t10)));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> lift(@NonNull FlowableOperator<? extends R, ? super T> flowableOperator) {
        Objects.requireNonNull(flowableOperator, "lifter is null");
        return RxJavaPlugins.onAssembly(new FlowableLift(this, flowableOperator));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final <R> Flowable<R> map(@NonNull Function<? super T, ? extends R> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableMap(this, function));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> mapOptional(@NonNull Function<? super T, Optional<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableMapOptional(this, function));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<Notification<T>> materialize() {
        return RxJavaPlugins.onAssembly(new FlowableMaterialize(this));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> mergeWith(@NonNull Publisher<? extends T> publisher) {
        Objects.requireNonNull(publisher, "other is null");
        return merge(this, publisher);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final Flowable<T> observeOn(@NonNull Scheduler scheduler) {
        return observeOn(scheduler, false, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final <U> Flowable<U> ofType(@NonNull Class<U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return filter(Functions.isInstanceOf(cls)).cast(cls);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Flowable<T> onBackpressureBuffer() {
        return onBackpressureBuffer(bufferSize(), false, true);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Flowable<T> onBackpressureDrop() {
        return RxJavaPlugins.onAssembly(new FlowableOnBackpressureDrop(this));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Flowable<T> onBackpressureLatest() {
        return RxJavaPlugins.onAssembly(new FlowableOnBackpressureLatest(this));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> onErrorComplete() {
        return onErrorComplete(Functions.alwaysTrue());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> onErrorResumeNext(@NonNull Function<? super Throwable, ? extends Publisher<? extends T>> function) {
        Objects.requireNonNull(function, "fallbackSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableOnErrorNext(this, function));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> onErrorResumeWith(@NonNull Publisher<? extends T> publisher) {
        Objects.requireNonNull(publisher, "fallback is null");
        return onErrorResumeNext(Functions.justFunction(publisher));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> onErrorReturn(@NonNull Function<? super Throwable, ? extends T> function) {
        Objects.requireNonNull(function, "itemSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableOnErrorReturn(this, function));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> onErrorReturnItem(@NonNull T t10) {
        Objects.requireNonNull(t10, "item is null");
        return onErrorReturn(Functions.justFunction(t10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> onTerminateDetach() {
        return RxJavaPlugins.onAssembly(new FlowableDetach(this));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final ParallelFlowable<T> parallel() {
        return ParallelFlowable.from(this);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final ConnectableFlowable<T> publish() {
        return publish(bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> rebatchRequests(int i10) {
        return observeOn(ImmediateThinScheduler.INSTANCE, true, i10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Maybe<T> reduce(@NonNull BiFunction<T, T, T> biFunction) {
        Objects.requireNonNull(biFunction, "reducer is null");
        return RxJavaPlugins.onAssembly(new FlowableReduceMaybe(this, biFunction));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final <R> Single<R> reduceWith(@NonNull Supplier<R> supplier, @NonNull BiFunction<R, ? super T, R> biFunction) {
        Objects.requireNonNull(supplier, "seedSupplier is null");
        Objects.requireNonNull(biFunction, "reducer is null");
        return RxJavaPlugins.onAssembly(new FlowableReduceWithSingle(this, supplier, biFunction));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> repeat() {
        return repeat(Long.MAX_VALUE);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> repeatUntil(@NonNull BooleanSupplier booleanSupplier) {
        Objects.requireNonNull(booleanSupplier, "stop is null");
        return RxJavaPlugins.onAssembly(new FlowableRepeatUntil(this, booleanSupplier));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> repeatWhen(@NonNull Function<? super Flowable<Object>, ? extends Publisher<?>> function) {
        Objects.requireNonNull(function, "handler is null");
        return RxJavaPlugins.onAssembly(new FlowableRepeatWhen(this, function));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final ConnectableFlowable<T> replay() {
        return FlowableReplay.createFrom(this);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> retry() {
        return retry(Long.MAX_VALUE, Functions.alwaysTrue());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> retryUntil(@NonNull BooleanSupplier booleanSupplier) {
        Objects.requireNonNull(booleanSupplier, "stop is null");
        return retry(Long.MAX_VALUE, Functions.predicateReverseFor(booleanSupplier));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> retryWhen(@NonNull Function<? super Flowable<Throwable>, ? extends Publisher<?>> function) {
        Objects.requireNonNull(function, "handler is null");
        return RxJavaPlugins.onAssembly(new FlowableRetryWhen(this, function));
    }

    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final void safeSubscribe(@NonNull Subscriber<? super T> subscriber) {
        Objects.requireNonNull(subscriber, "subscriber is null");
        if (subscriber instanceof SafeSubscriber) {
            subscribe((FlowableSubscriber) subscriber);
        } else {
            subscribe((FlowableSubscriber) new SafeSubscriber(subscriber));
        }
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<T> sample(long j10, @NonNull TimeUnit timeUnit) {
        return sample(j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> scan(@NonNull BiFunction<T, T, T> biFunction) {
        Objects.requireNonNull(biFunction, "accumulator is null");
        return RxJavaPlugins.onAssembly(new FlowableScan(this, biFunction));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> scanWith(@NonNull Supplier<R> supplier, @NonNull BiFunction<R, ? super T, R> biFunction) {
        Objects.requireNonNull(supplier, "seedSupplier is null");
        Objects.requireNonNull(biFunction, "accumulator is null");
        return RxJavaPlugins.onAssembly(new FlowableScanSeed(this, supplier, biFunction));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> serialize() {
        return RxJavaPlugins.onAssembly(new FlowableSerialized(this));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> share() {
        return publish().refCount();
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Single<T> single(@NonNull T t10) {
        Objects.requireNonNull(t10, "defaultItem is null");
        return RxJavaPlugins.onAssembly(new FlowableSingleSingle(this, t10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Maybe<T> singleElement() {
        return RxJavaPlugins.onAssembly(new FlowableSingleMaybe(this));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Single<T> singleOrError() {
        return RxJavaPlugins.onAssembly(new FlowableSingleSingle(this, null));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final CompletionStage<T> singleOrErrorStage() {
        return n.c(subscribeWith(new FlowableSingleStageSubscriber(false, null)));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final CompletionStage<T> singleStage(@Nullable T t10) {
        return n.c(subscribeWith(new FlowableSingleStageSubscriber(true, t10)));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> skip(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? RxJavaPlugins.onAssembly(this) : RxJavaPlugins.onAssembly(new FlowableSkip(this, j10));
        }
        throw new IllegalArgumentException(v.c("count >= 0 expected but it was ", j10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> skipLast(int i10) {
        if (i10 >= 0) {
            return i10 == 0 ? RxJavaPlugins.onAssembly(this) : RxJavaPlugins.onAssembly(new FlowableSkipLast(this, i10));
        }
        throw new IllegalArgumentException(g0.c("count >= 0 required but it was ", i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U> Flowable<T> skipUntil(@NonNull Publisher<U> publisher) {
        Objects.requireNonNull(publisher, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableSkipUntil(this, publisher));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> skipWhile(@NonNull Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new FlowableSkipWhile(this, predicate));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> sorted() {
        return toList().toFlowable().map(Functions.listSorter(Functions.naturalComparator())).flatMapIterable(Functions.identity());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> startWith(@NonNull CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return concat(Completable.wrap(completableSource).toFlowable(), this);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SafeVarargs
    @SchedulerSupport("none")
    public final Flowable<T> startWithArray(@NonNull T... tArr) {
        Flowable flowableFromArray = fromArray(tArr);
        return flowableFromArray == empty() ? RxJavaPlugins.onAssembly(this) : concatArray(flowableFromArray, this);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> startWithItem(@NonNull T t10) {
        Objects.requireNonNull(t10, "item is null");
        return concatArray(just(t10), this);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> startWithIterable(@NonNull Iterable<? extends T> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @NonNull
    @SchedulerSupport("none")
    public final Disposable subscribe() {
        return subscribe(Functions.emptyConsumer(), Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    public abstract void subscribeActual(@NonNull Subscriber<? super T> subscriber);

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("custom")
    public final Flowable<T> subscribeOn(@NonNull Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return subscribeOn(scheduler, !(this instanceof FlowableCreate));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public final <E extends Subscriber<? super T>> E subscribeWith(E e5) {
        subscribe(e5);
        return e5;
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> switchIfEmpty(@NonNull Publisher<? extends T> publisher) {
        Objects.requireNonNull(publisher, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchIfEmpty(this, publisher));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> switchMap(@NonNull Function<? super T, ? extends Publisher<? extends R>> function) {
        return switchMap(function, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Completable switchMapCompletable(@NonNull Function<? super T, ? extends CompletableSource> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchMapCompletable(this, function, false));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Completable switchMapCompletableDelayError(@NonNull Function<? super T, ? extends CompletableSource> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchMapCompletable(this, function, true));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> switchMapDelayError(@NonNull Function<? super T, ? extends Publisher<? extends R>> function) {
        return switchMapDelayError(function, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final <R> Flowable<R> switchMapMaybe(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchMapMaybe(this, function, false));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final <R> Flowable<R> switchMapMaybeDelayError(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchMapMaybe(this, function, true));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final <R> Flowable<R> switchMapSingle(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchMapSingle(this, function, false));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final <R> Flowable<R> switchMapSingleDelayError(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchMapSingle(this, function, true));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> take(long j10) {
        if (j10 >= 0) {
            return RxJavaPlugins.onAssembly(new FlowableTake(this, j10));
        }
        throw new IllegalArgumentException(v.c("count >= 0 required but it was ", j10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> takeLast(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(g0.c("count >= 0 required but it was ", i10));
        }
        if (i10 == 0) {
            return RxJavaPlugins.onAssembly(new FlowableIgnoreElements(this));
        }
        return i10 == 1 ? RxJavaPlugins.onAssembly(new FlowableTakeLastOne(this)) : RxJavaPlugins.onAssembly(new FlowableTakeLast(this, i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> takeUntil(@NonNull Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "stopPredicate is null");
        return RxJavaPlugins.onAssembly(new FlowableTakeUntilPredicate(this, predicate));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> takeWhile(@NonNull Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new FlowableTakeWhile(this, predicate));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final TestSubscriber<T> test() {
        TestSubscriber<T> testSubscriber = new TestSubscriber<>();
        subscribe((FlowableSubscriber) testSubscriber);
        return testSubscriber;
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<T> throttleFirst(long j10, @NonNull TimeUnit timeUnit) {
        return throttleFirst(j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<T> throttleLast(long j10, @NonNull TimeUnit timeUnit) {
        return sample(j10, timeUnit);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<T> throttleLatest(long j10, @NonNull TimeUnit timeUnit) {
        return throttleLatest(j10, timeUnit, Schedulers.computation(), false);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<T> throttleWithTimeout(long j10, @NonNull TimeUnit timeUnit) {
        return debounce(j10, timeUnit);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<Timed<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final <V> Flowable<T> timeout(@NonNull Function<? super T, ? extends Publisher<V>> function) {
        return d(null, function, null);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<Timed<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, Schedulers.computation());
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> R to(@NonNull FlowableConverter<T, ? extends R> flowableConverter) {
        Objects.requireNonNull(flowableConverter, "converter is null");
        return flowableConverter.apply(this);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Future<T> toFuture() {
        return (Future) subscribeWith(new FutureSubscriber());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Single<List<T>> toList() {
        return RxJavaPlugins.onAssembly(new FlowableToListSingle(this));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final <K> Single<Map<K, T>> toMap(@NonNull Function<? super T, ? extends K> function) {
        Objects.requireNonNull(function, "keySelector is null");
        return (Single<Map<K, T>>) collect(HashMapSupplier.asSupplier(), Functions.toMapKeySelector(function));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final <K> Single<Map<K, Collection<T>>> toMultimap(@NonNull Function<? super T, ? extends K> function) {
        return (Single<Map<K, Collection<T>>>) toMultimap(function, Functions.identity(), HashMapSupplier.asSupplier(), ArrayListSupplier.asFunction());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Observable<T> toObservable() {
        return RxJavaPlugins.onAssembly(new ObservableFromPublisher(this));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Single<List<T>> toSortedList() {
        return toSortedList(Functions.naturalComparator());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("custom")
    public final Flowable<T> unsubscribeOn(@NonNull Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableUnsubscribeOn(this, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<Flowable<T>> window(long j10) {
        return window(j10, j10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final <U, R> Flowable<R> withLatestFrom(@NonNull Publisher<? extends U> publisher, @NonNull BiFunction<? super T, ? super U, ? extends R> biFunction) {
        Objects.requireNonNull(publisher, "other is null");
        Objects.requireNonNull(biFunction, "combiner is null");
        return RxJavaPlugins.onAssembly(new FlowableWithLatestFrom(this, biFunction, publisher));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U, R> Flowable<R> zipWith(@NonNull Iterable<U> iterable, @NonNull BiFunction<? super T, ? super U, ? extends R> biFunction) {
        Objects.requireNonNull(iterable, "other is null");
        Objects.requireNonNull(biFunction, "zipper is null");
        return RxJavaPlugins.onAssembly(new FlowableZipIterable(this, iterable, biFunction));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T, R> Flowable<R> combineLatest(@NonNull Iterable<? extends Publisher<? extends T>> iterable, @NonNull Function<? super Object[], ? extends R> function, int i10) {
        Objects.requireNonNull(iterable, "sources is null");
        Objects.requireNonNull(function, "combiner is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableCombineLatest((Iterable) iterable, (Function) function, i10, false));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T, R> Flowable<R> combineLatestArray(@NonNull Publisher<? extends T>[] publisherArr, @NonNull Function<? super Object[], ? extends R> function, int i10) {
        Objects.requireNonNull(publisherArr, "sources is null");
        if (publisherArr.length == 0) {
            return empty();
        }
        Objects.requireNonNull(function, "combiner is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableCombineLatest((Publisher[]) publisherArr, (Function) function, i10, false));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T, R> Flowable<R> combineLatestArrayDelayError(@NonNull Publisher<? extends T>[] publisherArr, @NonNull Function<? super Object[], ? extends R> function, int i10) {
        Objects.requireNonNull(publisherArr, "sources is null");
        Objects.requireNonNull(function, "combiner is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return publisherArr.length == 0 ? empty() : RxJavaPlugins.onAssembly(new FlowableCombineLatest((Publisher[]) publisherArr, (Function) function, i10, true));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T, R> Flowable<R> combineLatestDelayError(@NonNull Iterable<? extends Publisher<? extends T>> iterable, @NonNull Function<? super Object[], ? extends R> function, int i10) {
        Objects.requireNonNull(iterable, "sources is null");
        Objects.requireNonNull(function, "combiner is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableCombineLatest((Iterable) iterable, (Function) function, i10, true));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Flowable<T> concatArrayEager(int i10, int i11, @NonNull Publisher<? extends T>... publisherArr) {
        Objects.requireNonNull(publisherArr, "sources is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        ObjectHelper.verifyPositive(i11, EventDataKeys.Target.PREFETCH_REQUESTS);
        return RxJavaPlugins.onAssembly(new FlowableConcatMapEager(new FlowableFromArray(publisherArr), Functions.identity(), i10, i11, ErrorMode.IMMEDIATE));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Flowable<T> concatArrayEagerDelayError(int i10, int i11, @NonNull Publisher<? extends T>... publisherArr) {
        return fromArray(publisherArr).concatMapEagerDelayError(Functions.identity(), true, i10, i11);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> concatEager(@NonNull Iterable<? extends Publisher<? extends T>> iterable, int i10, int i11) {
        Objects.requireNonNull(iterable, "sources is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        ObjectHelper.verifyPositive(i11, EventDataKeys.Target.PREFETCH_REQUESTS);
        return RxJavaPlugins.onAssembly(new FlowableConcatMapEager(new FlowableFromIterable(iterable), Functions.identity(), i10, i11, ErrorMode.BOUNDARY));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> concatEagerDelayError(@NonNull Iterable<? extends Publisher<? extends T>> iterable, int i10, int i11) {
        Objects.requireNonNull(iterable, "sources is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        ObjectHelper.verifyPositive(i11, EventDataKeys.Target.PREFETCH_REQUESTS);
        return RxJavaPlugins.onAssembly(new FlowableConcatMapEager(new FlowableFromIterable(iterable), Functions.identity(), i10, i11, ErrorMode.END));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public static Flowable<Long> interval(long j10, long j11, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableInterval(Math.max(0L, j10), Math.max(0L, j11), timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public static Flowable<Long> intervalRange(long j10, long j11, long j12, long j13, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
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
        return RxJavaPlugins.onAssembly(new FlowableIntervalRange(j10, j14, Math.max(0L, j12), Math.max(0L, j13), timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> merge(@NonNull Iterable<? extends Publisher<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Functions.identity());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Flowable<T> mergeArray(@NonNull Publisher<? extends T>... publisherArr) {
        return fromArray(publisherArr).flatMap(Functions.identity(), publisherArr.length);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SafeVarargs
    @SchedulerSupport("none")
    public static <T> Flowable<T> mergeArrayDelayError(@NonNull Publisher<? extends T>... publisherArr) {
        return fromArray(publisherArr).flatMap(Functions.identity(), true, publisherArr.length);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> mergeDelayError(@NonNull Iterable<? extends Publisher<? extends T>> iterable, int i10, int i11) {
        return fromIterable(iterable).flatMap(Functions.identity(), true, i10, i11);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Single<Boolean> sequenceEqual(@NonNull Publisher<? extends T> publisher, @NonNull Publisher<? extends T> publisher2, @NonNull BiPredicate<? super T, ? super T> biPredicate) {
        return sequenceEqual(publisher, publisher2, biPredicate, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> switchOnNext(@NonNull Publisher<? extends Publisher<? extends T>> publisher) {
        return fromPublisher(publisher).switchMap(Functions.identity());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> switchOnNextDelayError(@NonNull Publisher<? extends Publisher<? extends T>> publisher, int i10) {
        return fromPublisher(publisher).switchMapDelayError(Functions.identity(), i10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public static Flowable<Long> timer(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableTimer(Math.max(0L, j10), timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public static <T, D> Flowable<T> using(@NonNull Supplier<? extends D> supplier, @NonNull Function<? super D, ? extends Publisher<? extends T>> function, @NonNull Consumer<? super D> consumer, boolean z10) {
        Objects.requireNonNull(supplier, "resourceSupplier is null");
        Objects.requireNonNull(function, "sourceSupplier is null");
        Objects.requireNonNull(consumer, "resourceCleanup is null");
        return RxJavaPlugins.onAssembly(new FlowableUsing(supplier, function, consumer, z10));
    }

    @BackpressureSupport(BackpressureKind.FULL)
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
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Iterable<T> blockingIterable(int i10) {
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return new BlockingFlowableIterable(this, i10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final T blockingSingle(@NonNull T t10) {
        return single(t10).blockingGet();
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Stream<T> blockingStream(int i10) {
        Iterator<T> it = blockingIterable(i10).iterator();
        Stream stream = StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, 0), false);
        Disposable disposable = (Disposable) it;
        disposable.getClass();
        return r.c(stream.onClose(new o(disposable, 4)));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final void blockingSubscribe(@NonNull Consumer<? super T> consumer) {
        FlowableBlockingSubscribe.subscribe(this, consumer, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<List<T>> buffer(int i10, int i11) {
        return (Flowable<List<T>>) buffer(i10, i11, ArrayListSupplier.asSupplier());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> concatMap(@NonNull Function<? super T, ? extends Publisher<? extends R>> function, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, EventDataKeys.Target.PREFETCH_REQUESTS);
        if (!(this instanceof ScalarSupplier)) {
            return RxJavaPlugins.onAssembly(new FlowableConcatMap(this, function, i10, ErrorMode.IMMEDIATE));
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? empty() : FlowableScalarXMap.scalarXMap(obj, function);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Completable concatMapCompletable(@NonNull Function<? super T, ? extends CompletableSource> function, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, EventDataKeys.Target.PREFETCH_REQUESTS);
        return RxJavaPlugins.onAssembly(new FlowableConcatMapCompletable(this, function, ErrorMode.IMMEDIATE, i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Completable concatMapCompletableDelayError(@NonNull Function<? super T, ? extends CompletableSource> function, boolean z10) {
        return concatMapCompletableDelayError(function, z10, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> concatMapDelayError(@NonNull Function<? super T, ? extends Publisher<? extends R>> function, boolean z10, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, EventDataKeys.Target.PREFETCH_REQUESTS);
        if (!(this instanceof ScalarSupplier)) {
            return RxJavaPlugins.onAssembly(new FlowableConcatMap(this, function, i10, z10 ? ErrorMode.END : ErrorMode.BOUNDARY));
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? empty() : FlowableScalarXMap.scalarXMap(obj, function);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> concatMapEager(@NonNull Function<? super T, ? extends Publisher<? extends R>> function, int i10, int i11) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        ObjectHelper.verifyPositive(i11, EventDataKeys.Target.PREFETCH_REQUESTS);
        return RxJavaPlugins.onAssembly(new FlowableConcatMapEager(this, function, i10, i11, ErrorMode.IMMEDIATE));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> concatMapEagerDelayError(@NonNull Function<? super T, ? extends Publisher<? extends R>> function, boolean z10, int i10, int i11) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        ObjectHelper.verifyPositive(i11, EventDataKeys.Target.PREFETCH_REQUESTS);
        return RxJavaPlugins.onAssembly(new FlowableConcatMapEager(this, function, i10, i11, z10 ? ErrorMode.END : ErrorMode.BOUNDARY));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U> Flowable<U> concatMapIterable(@NonNull Function<? super T, ? extends Iterable<? extends U>> function, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, EventDataKeys.Target.PREFETCH_REQUESTS);
        return RxJavaPlugins.onAssembly(new FlowableFlattenIterable(this, function, i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> concatMapMaybe(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, EventDataKeys.Target.PREFETCH_REQUESTS);
        return RxJavaPlugins.onAssembly(new FlowableConcatMapMaybe(this, function, ErrorMode.IMMEDIATE, i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> concatMapMaybeDelayError(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z10) {
        return concatMapMaybeDelayError(function, z10, 2);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> concatMapSingle(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, EventDataKeys.Target.PREFETCH_REQUESTS);
        return RxJavaPlugins.onAssembly(new FlowableConcatMapSingle(this, function, ErrorMode.IMMEDIATE, i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> concatMapSingleDelayError(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10) {
        return concatMapSingleDelayError(function, z10, 2);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> concatMapStream(@NonNull Function<? super T, ? extends Stream<? extends R>> function, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, EventDataKeys.Target.PREFETCH_REQUESTS);
        return RxJavaPlugins.onAssembly(new FlowableFlatMapStream(this, function, i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <K> Flowable<T> distinct(@NonNull Function<? super T, K> function) {
        return distinct(function, Functions.createHashSet());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <K> Flowable<T> distinctUntilChanged(@NonNull Function<? super T, K> function) {
        Objects.requireNonNull(function, "keySelector is null");
        return RxJavaPlugins.onAssembly(new FlowableDistinctUntilChanged(this, function, ObjectHelper.equalsPredicate()));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> flatMap(@NonNull Function<? super T, ? extends Publisher<? extends R>> function, boolean z10) {
        return flatMap(function, z10, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Completable flatMapCompletable(@NonNull Function<? super T, ? extends CompletableSource> function, boolean z10, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new FlowableFlatMapCompletableCompletable(this, function, z10, i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U> Flowable<U> flatMapIterable(@NonNull Function<? super T, ? extends Iterable<? extends U>> function, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableFlattenIterable(this, function, i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final <R> Flowable<R> flatMapMaybe(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z10, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new FlowableFlatMapMaybe(this, function, z10, i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final <R> Flowable<R> flatMapSingle(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new FlowableFlatMapSingle(this, function, z10, i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> flatMapStream(@NonNull Function<? super T, ? extends Stream<? extends R>> function, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, EventDataKeys.Target.PREFETCH_REQUESTS);
        return RxJavaPlugins.onAssembly(new FlowableFlatMapStream(this, function, i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.NONE)
    @SchedulerSupport("none")
    public final Disposable forEachWhile(@NonNull Predicate<? super T> predicate, @NonNull Consumer<? super Throwable> consumer) {
        return forEachWhile(predicate, consumer, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("none")
    public final <K> Flowable<GroupedFlowable<K, T>> groupBy(@NonNull Function<? super T, ? extends K> function, boolean z10) {
        return (Flowable<GroupedFlowable<K, T>>) groupBy(function, Functions.identity(), z10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final Flowable<T> observeOn(@NonNull Scheduler scheduler, boolean z10) {
        return observeOn(scheduler, z10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Flowable<T> onBackpressureBuffer(boolean z10) {
        return onBackpressureBuffer(bufferSize(), z10, true);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Flowable<T> onBackpressureDrop(@NonNull Consumer<? super T> consumer) {
        Objects.requireNonNull(consumer, "onDrop is null");
        return RxJavaPlugins.onAssembly(new FlowableOnBackpressureDrop(this, consumer));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> onErrorComplete(@NonNull Predicate<? super Throwable> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new FlowableOnErrorComplete(this, predicate));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final ParallelFlowable<T> parallel(int i10) {
        return ParallelFlowable.from(this, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> publish(@NonNull Function<? super Flowable<T>, ? extends Publisher<R>> function) {
        return publish(function, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> repeat(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? empty() : RxJavaPlugins.onAssembly(new FlowableRepeat(this, j10));
        }
        throw new IllegalArgumentException(v.c("times >= 0 required but it was ", j10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> replay(@NonNull Function<? super Flowable<T>, ? extends Publisher<R>> function) {
        Objects.requireNonNull(function, "selector is null");
        return FlowableReplay.multicastSelector(FlowableInternalHelper.replaySupplier(this), function);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> retry(@NonNull BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        Objects.requireNonNull(biPredicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new FlowableRetryBiPredicate(this, biPredicate));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<T> sample(long j10, @NonNull TimeUnit timeUnit, boolean z10) {
        return sample(j10, timeUnit, Schedulers.computation(), z10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> sorted(@NonNull Comparator<? super T> comparator) {
        Objects.requireNonNull(comparator, "comparator is null");
        return toList().toFlowable().map(Functions.listSorter(comparator)).flatMapIterable(Functions.identity());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Disposable subscribe(@NonNull Consumer<? super T> consumer) {
        return subscribe(consumer, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> switchMap(@NonNull Function<? super T, ? extends Publisher<? extends R>> function, int i10) {
        return b(function, i10, false);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> switchMapDelayError(@NonNull Function<? super T, ? extends Publisher<? extends R>> function, int i10) {
        return b(function, i10, true);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public final Flowable<T> throttleFirst(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableThrottleFirstTimed(this, j10, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public final Flowable<T> throttleLast(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return sample(j10, timeUnit, scheduler);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<T> throttleLatest(long j10, @NonNull TimeUnit timeUnit, boolean z10) {
        return throttleLatest(j10, timeUnit, Schedulers.computation(), z10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public final Flowable<T> throttleWithTimeout(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return debounce(j10, timeUnit, scheduler);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<Timed<T>> timeInterval(@NonNull Scheduler scheduler) {
        return timeInterval(TimeUnit.MILLISECONDS, scheduler);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <V> Flowable<T> timeout(@NonNull Function<? super T, ? extends Publisher<V>> function, @NonNull Publisher<? extends T> publisher) {
        Objects.requireNonNull(publisher, "fallback is null");
        return d(null, function, publisher);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<Timed<T>> timestamp(@NonNull Scheduler scheduler) {
        return timestamp(TimeUnit.MILLISECONDS, scheduler);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Single<List<T>> toList(int i10) {
        ObjectHelper.verifyPositive(i10, "capacityHint");
        return RxJavaPlugins.onAssembly(new FlowableToListSingle(this, Functions.createArrayList(i10)));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Single<List<T>> toSortedList(@NonNull Comparator<? super T> comparator) {
        Objects.requireNonNull(comparator, "comparator is null");
        return (Single<List<T>>) toList().map(Functions.listSorter(comparator));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<Flowable<T>> window(long j10, long j11) {
        return window(j10, j11, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> concat(@NonNull Publisher<? extends Publisher<? extends T>> publisher) {
        return concat(publisher, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> concatDelayError(@NonNull Publisher<? extends Publisher<? extends T>> publisher) {
        return concatDelayError(publisher, bufferSize(), true);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public static <T> Flowable<T> error(@NonNull Throwable th2) {
        Objects.requireNonNull(th2, "throwable is null");
        return error((Supplier<? extends Throwable>) Functions.justSupplier(th2));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> fromFuture(@NonNull Future<? extends T> future, long j10, @NonNull TimeUnit timeUnit) {
        Objects.requireNonNull(future, "future is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        return RxJavaPlugins.onAssembly(new FlowableFromFuture(future, j10, timeUnit));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> just(T t10, T t11) {
        Objects.requireNonNull(t10, "item1 is null");
        Objects.requireNonNull(t11, "item2 is null");
        return fromArray(t10, t11);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> merge(@NonNull Iterable<? extends Publisher<? extends T>> iterable, int i10) {
        return fromIterable(iterable).flatMap(Functions.identity(), i10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> mergeDelayError(@NonNull Iterable<? extends Publisher<? extends T>> iterable, int i10) {
        return fromIterable(iterable).flatMap(Functions.identity(), true, i10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Single<Boolean> sequenceEqual(@NonNull Publisher<? extends T> publisher, @NonNull Publisher<? extends T> publisher2, @NonNull BiPredicate<? super T, ? super T> biPredicate, int i10) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(biPredicate, "isEqual is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableSequenceEqualSingle(publisher, publisher2, biPredicate, i10));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final void blockingSubscribe(@NonNull Consumer<? super T> consumer, int i10) {
        FlowableBlockingSubscribe.subscribe(this, consumer, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION, i10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U extends Collection<? super T>> Flowable<U> buffer(int i10, int i11, @NonNull Supplier<U> supplier) {
        ObjectHelper.verifyPositive(i10, "count");
        ObjectHelper.verifyPositive(i11, "skip");
        Objects.requireNonNull(supplier, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableBuffer(this, i10, i11, supplier));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Completable concatMapCompletableDelayError(@NonNull Function<? super T, ? extends CompletableSource> function, boolean z10, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, EventDataKeys.Target.PREFETCH_REQUESTS);
        return RxJavaPlugins.onAssembly(new FlowableConcatMapCompletable(this, function, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> concatMapMaybeDelayError(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z10, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, EventDataKeys.Target.PREFETCH_REQUESTS);
        return RxJavaPlugins.onAssembly(new FlowableConcatMapMaybe(this, function, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> concatMapSingleDelayError(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, EventDataKeys.Target.PREFETCH_REQUESTS);
        return RxJavaPlugins.onAssembly(new FlowableConcatMapSingle(this, function, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> concatWith(@NonNull SingleSource<? extends T> singleSource) {
        Objects.requireNonNull(singleSource, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableConcatWithSingle(this, singleSource));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<T> debounce(long j10, @NonNull TimeUnit timeUnit) {
        return debounce(j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<T> delay(long j10, @NonNull TimeUnit timeUnit) {
        return delay(j10, timeUnit, Schedulers.computation(), false);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<T> delaySubscription(long j10, @NonNull TimeUnit timeUnit) {
        return delaySubscription(j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <K> Flowable<T> distinct(@NonNull Function<? super T, K> function, @NonNull Supplier<? extends Collection<? super K>> supplier) {
        Objects.requireNonNull(function, "keySelector is null");
        Objects.requireNonNull(supplier, "collectionSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableDistinct(this, function, supplier));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> flatMap(@NonNull Function<? super T, ? extends Publisher<? extends R>> function, int i10) {
        return flatMap((Function) function, false, i10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.NONE)
    @SchedulerSupport("none")
    public final Disposable forEachWhile(@NonNull Predicate<? super T> predicate, @NonNull Consumer<? super Throwable> consumer, @NonNull Action action) {
        Objects.requireNonNull(predicate, "onNext is null");
        Objects.requireNonNull(consumer, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        ForEachWhileSubscriber forEachWhileSubscriber = new ForEachWhileSubscriber(predicate, consumer, action);
        subscribe((FlowableSubscriber) forEachWhileSubscriber);
        return forEachWhileSubscriber;
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("none")
    public final <K, V> Flowable<GroupedFlowable<K, V>> groupBy(@NonNull Function<? super T, ? extends K> function, @NonNull Function<? super T, ? extends V> function2) {
        return groupBy(function, function2, false, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> mergeWith(@NonNull SingleSource<? extends T> singleSource) {
        Objects.requireNonNull(singleSource, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableMergeWithSingle(this, singleSource));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final Flowable<T> observeOn(@NonNull Scheduler scheduler, boolean z10, int i10) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableObserveOn(this, scheduler, z10, i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("none")
    public final Flowable<T> onBackpressureBuffer(int i10) {
        return onBackpressureBuffer(i10, false, false);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final ParallelFlowable<T> parallel(int i10, int i11) {
        return ParallelFlowable.from(this, i10, i11);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> publish(@NonNull Function<? super Flowable<T>, ? extends Publisher<? extends R>> function, int i10) {
        Objects.requireNonNull(function, "selector is null");
        ObjectHelper.verifyPositive(i10, EventDataKeys.Target.PREFETCH_REQUESTS);
        return RxJavaPlugins.onAssembly(new FlowablePublishMulticast(this, function, i10, false));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final <R> Single<R> reduce(R r3, @NonNull BiFunction<R, ? super T, R> biFunction) {
        Objects.requireNonNull(r3, "seed is null");
        Objects.requireNonNull(biFunction, "reducer is null");
        return RxJavaPlugins.onAssembly(new FlowableReduceSeedSingle(this, r3, biFunction));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public final Flowable<T> sample(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableSampleTimed(this, j10, timeUnit, scheduler, false));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> scan(R r3, @NonNull BiFunction<R, ? super T, R> biFunction) {
        Objects.requireNonNull(r3, "initialValue is null");
        return scanWith(Functions.justSupplier(r3), biFunction);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> startWith(@NonNull SingleSource<T> singleSource) {
        Objects.requireNonNull(singleSource, "other is null");
        return concat(Single.wrap(singleSource).toFlowable(), this);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Disposable subscribe(@NonNull Consumer<? super T> consumer, @NonNull Consumer<? super Throwable> consumer2) {
        return subscribe(consumer, consumer2, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("custom")
    public final Flowable<T> subscribeOn(@NonNull Scheduler scheduler, boolean z10) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableSubscribeOn(this, scheduler, z10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final <U> Flowable<T> takeUntil(@NonNull Publisher<U> publisher) {
        Objects.requireNonNull(publisher, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableTakeUntil(this, publisher));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final TestSubscriber<T> test(long j10) {
        TestSubscriber<T> testSubscriber = new TestSubscriber<>(j10);
        subscribe((FlowableSubscriber) testSubscriber);
        return testSubscriber;
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public final Flowable<T> throttleLatest(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return throttleLatest(j10, timeUnit, scheduler, false);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<Timed<T>> timeInterval(@NonNull TimeUnit timeUnit) {
        return timeInterval(timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<Timed<T>> timestamp(@NonNull TimeUnit timeUnit) {
        return timestamp(timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final <K, V> Single<Map<K, V>> toMap(@NonNull Function<? super T, ? extends K> function, @NonNull Function<? super T, ? extends V> function2) {
        Objects.requireNonNull(function, "keySelector is null");
        Objects.requireNonNull(function2, "valueSelector is null");
        return (Single<Map<K, V>>) collect(HashMapSupplier.asSupplier(), Functions.toMapKeyValueSelector(function, function2));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<Flowable<T>> window(long j10, long j11, int i10) {
        ObjectHelper.verifyPositive(j11, "skip");
        ObjectHelper.verifyPositive(j10, "count");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableWindow(this, j10, j11, i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> concat(@NonNull Publisher<? extends Publisher<? extends T>> publisher, int i10) {
        return fromPublisher(publisher).concatMap(Functions.identity(), i10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> concatDelayError(@NonNull Publisher<? extends Publisher<? extends T>> publisher, int i10, boolean z10) {
        return fromPublisher(publisher).concatMapDelayError(Functions.identity(), z10, i10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> merge(@NonNull Publisher<? extends Publisher<? extends T>> publisher) {
        return merge(publisher, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> mergeDelayError(@NonNull Publisher<? extends Publisher<? extends T>> publisher) {
        return mergeDelayError(publisher, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T, R> Flowable<R> zip(@NonNull Iterable<? extends Publisher<? extends T>> iterable, @NonNull Function<? super Object[], ? extends R> function, boolean z10, int i10) {
        Objects.requireNonNull(function, "zipper is null");
        Objects.requireNonNull(iterable, "sources is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableZip(null, iterable, function, i10, z10));
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final void blockingSubscribe(@NonNull Consumer<? super T> consumer, @NonNull Consumer<? super Throwable> consumer2) {
        FlowableBlockingSubscribe.subscribe(this, consumer, consumer2, Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final <R, A> Single<R> collect(@NonNull Collector<? super T, A, R> collector) {
        Objects.requireNonNull(collector, "collector is null");
        return RxJavaPlugins.onAssembly(new FlowableCollectWithCollectorSingle(this, collector));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public final Flowable<T> debounce(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableDebounceTimed(this, j10, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<T> delay(long j10, @NonNull TimeUnit timeUnit, boolean z10) {
        return delay(j10, timeUnit, Schedulers.computation(), z10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final Flowable<T> delaySubscription(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return delaySubscription(timer(j10, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> distinctUntilChanged(@NonNull BiPredicate<? super T, ? super T> biPredicate) {
        Objects.requireNonNull(biPredicate, "comparer is null");
        return RxJavaPlugins.onAssembly(new FlowableDistinctUntilChanged(this, Functions.identity(), biPredicate));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> flatMap(@NonNull Function<? super T, ? extends Publisher<? extends R>> function, boolean z10, int i10) {
        return flatMap(function, z10, i10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("none")
    public final <K, V> Flowable<GroupedFlowable<K, V>> groupBy(@NonNull Function<? super T, ? extends K> function, @NonNull Function<? super T, ? extends V> function2, boolean z10) {
        return groupBy(function, function2, z10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("none")
    public final Flowable<T> onBackpressureBuffer(int i10, boolean z10) {
        return onBackpressureBuffer(i10, z10, false);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> replay(@NonNull Function<? super Flowable<T>, ? extends Publisher<R>> function, int i10) {
        Objects.requireNonNull(function, "selector is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return FlowableReplay.multicastSelector(FlowableInternalHelper.replaySupplier(this, i10, false), function);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> retry(long j10) {
        return retry(j10, Functions.alwaysTrue());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Disposable subscribe(@NonNull Consumer<? super T> consumer, @NonNull Consumer<? super Throwable> consumer2, @NonNull Action action) {
        Objects.requireNonNull(consumer, "onNext is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(consumer, consumer2, action, FlowableInternalHelper.RequestMax.INSTANCE);
        subscribe((FlowableSubscriber) lambdaSubscriber);
        return lambdaSubscriber;
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public final Flowable<T> throttleLatest(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableThrottleLatest(this, j10, timeUnit, scheduler, z10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<Timed<T>> timeInterval(@NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableTimeInterval(this, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<T> timeout(long j10, @NonNull TimeUnit timeUnit) {
        return c(j10, timeUnit, Schedulers.computation(), null);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<Timed<T>> timestamp(@NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return (Flowable<Timed<T>>) map(Functions.timestampWith(timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final <U extends Collection<? super T>> Single<U> toList(@NonNull Supplier<U> supplier) {
        Objects.requireNonNull(supplier, "collectionSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableToListSingle(this, supplier));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Single<List<T>> toSortedList(@NonNull Comparator<? super T> comparator, int i10) {
        Objects.requireNonNull(comparator, "comparator is null");
        return (Single<List<T>>) toList(i10).map(Functions.listSorter(comparator));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final <T1, T2, R> Flowable<R> withLatestFrom(@NonNull Publisher<T1> publisher, @NonNull Publisher<T2> publisher2, @NonNull Function3<? super T, ? super T1, ? super T2, R> function3) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(function3, "combiner is null");
        return withLatestFrom((Publisher<?>[]) new Publisher[]{publisher, publisher2}, Functions.toFunction(function3));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U, R> Flowable<R> zipWith(@NonNull Publisher<? extends U> publisher, @NonNull BiFunction<? super T, ? super U, ? extends R> biFunction) {
        Objects.requireNonNull(publisher, "other is null");
        return zip(this, publisher, biFunction);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> concat(@NonNull Publisher<? extends T> publisher, @NonNull Publisher<? extends T> publisher2) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        return concatArray(publisher, publisher2);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("io.reactivex:computation")
    public static Flowable<Long> interval(long j10, @NonNull TimeUnit timeUnit) {
        return interval(j10, j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> merge(@NonNull Publisher<? extends Publisher<? extends T>> publisher, int i10) {
        return fromPublisher(publisher).flatMap(Functions.identity(), i10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> mergeDelayError(@NonNull Publisher<? extends Publisher<? extends T>> publisher, int i10) {
        return fromPublisher(publisher).flatMap(Functions.identity(), true, i10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final T blockingFirst(@NonNull T t10) {
        Objects.requireNonNull(t10, "defaultItem is null");
        BlockingFirstSubscriber blockingFirstSubscriber = new BlockingFirstSubscriber();
        subscribe((FlowableSubscriber) blockingFirstSubscriber);
        T tBlockingGet = blockingFirstSubscriber.blockingGet();
        return tBlockingGet != null ? tBlockingGet : t10;
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final T blockingLast(@NonNull T t10) {
        Objects.requireNonNull(t10, "defaultItem is null");
        BlockingLastSubscriber blockingLastSubscriber = new BlockingLastSubscriber();
        subscribe((FlowableSubscriber) blockingLastSubscriber);
        T tBlockingGet = blockingLastSubscriber.blockingGet();
        return tBlockingGet != null ? tBlockingGet : t10;
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final void blockingSubscribe(@NonNull Consumer<? super T> consumer, @NonNull Consumer<? super Throwable> consumer2, int i10) {
        FlowableBlockingSubscribe.subscribe(this, consumer, consumer2, Functions.EMPTY_ACTION, i10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> concatWith(@NonNull MaybeSource<? extends T> maybeSource) {
        Objects.requireNonNull(maybeSource, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableConcatWithMaybe(this, maybeSource));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final Flowable<T> delay(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return delay(j10, timeUnit, scheduler, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> flatMap(@NonNull Function<? super T, ? extends Publisher<? extends R>> function, boolean z10, int i10, int i11) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        if (this instanceof ScalarSupplier) {
            Object obj = ((ScalarSupplier) this).get();
            if (obj == null) {
                return empty();
            }
            return FlowableScalarXMap.scalarXMap(obj, function);
        }
        return RxJavaPlugins.onAssembly(new FlowableFlatMap(this, function, z10, i10, i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U, V> Flowable<V> flatMapIterable(@NonNull Function<? super T, ? extends Iterable<? extends U>> function, @NonNull BiFunction<? super T, ? super U, ? extends V> biFunction) {
        Objects.requireNonNull(function, "mapper is null");
        Objects.requireNonNull(biFunction, "combiner is null");
        return (Flowable<V>) flatMap(FlowableInternalHelper.flatMapIntoIterable(function), biFunction, false, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public final <K, V> Flowable<GroupedFlowable<K, V>> groupBy(@NonNull Function<? super T, ? extends K> function, @NonNull Function<? super T, ? extends V> function2, boolean z10, int i10) {
        Objects.requireNonNull(function, "keySelector is null");
        Objects.requireNonNull(function2, "valueSelector is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableGroupBy(this, function, function2, i10, z10, null));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> mergeWith(@NonNull MaybeSource<? extends T> maybeSource) {
        Objects.requireNonNull(maybeSource, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableMergeWithMaybe(this, maybeSource));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public final Flowable<T> onBackpressureBuffer(int i10, boolean z10, boolean z11) {
        ObjectHelper.verifyPositive(i10, "capacity");
        return RxJavaPlugins.onAssembly(new FlowableOnBackpressureBuffer(this, i10, z11, z10, Functions.EMPTY_ACTION));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> retry(long j10, @NonNull Predicate<? super Throwable> predicate) {
        if (j10 >= 0) {
            Objects.requireNonNull(predicate, "predicate is null");
            return RxJavaPlugins.onAssembly(new FlowableRetryPredicate(this, j10, predicate));
        }
        throw new IllegalArgumentException(v.c("times >= 0 required but it was ", j10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> startWith(@NonNull MaybeSource<T> maybeSource) {
        Objects.requireNonNull(maybeSource, "other is null");
        return concat(Maybe.wrap(maybeSource).toFlowable(), this);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final TestSubscriber<T> test(long j10, boolean z10) {
        TestSubscriber<T> testSubscriber = new TestSubscriber<>(j10);
        if (z10) {
            testSubscriber.cancel();
        }
        subscribe((FlowableSubscriber) testSubscriber);
        return testSubscriber;
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<T> timeout(long j10, @NonNull TimeUnit timeUnit, @NonNull Publisher<? extends T> publisher) {
        Objects.requireNonNull(publisher, "fallback is null");
        return c(j10, timeUnit, Schedulers.computation(), publisher);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(@NonNull Function<? super T, ? extends K> function, @NonNull Function<? super T, ? extends V> function2) {
        return toMultimap(function, function2, HashMapSupplier.asSupplier(), ArrayListSupplier.asFunction());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T1, T2, R> Flowable<R> combineLatest(@NonNull Publisher<? extends T1> publisher, @NonNull Publisher<? extends T2> publisher2, @NonNull BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(biFunction, "combiner is null");
        return combineLatestArray(new Publisher[]{publisher, publisher2}, Functions.toFunction(biFunction), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> concatEager(@NonNull Publisher<? extends Publisher<? extends T>> publisher) {
        return concatEager(publisher, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> concatEagerDelayError(@NonNull Publisher<? extends Publisher<? extends T>> publisher) {
        return concatEagerDelayError(publisher, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T, S> Flowable<T> generate(@NonNull Supplier<S> supplier, @NonNull BiConsumer<S, Emitter<T>> biConsumer) {
        Objects.requireNonNull(biConsumer, "generator is null");
        return generate(supplier, FlowableInternalHelper.simpleBiGenerator(biConsumer), Functions.emptyConsumer());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public static Flowable<Long> interval(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return interval(j10, j10, timeUnit, scheduler);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> just(T t10, T t11, T t12) {
        Objects.requireNonNull(t10, "item1 is null");
        Objects.requireNonNull(t11, "item2 is null");
        Objects.requireNonNull(t12, "item3 is null");
        return fromArray(t10, t11, t12);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> merge(@NonNull Publisher<? extends T> publisher, @NonNull Publisher<? extends T> publisher2) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        return fromArray(publisher, publisher2).flatMap(Functions.identity(), false, 2);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> mergeDelayError(@NonNull Publisher<? extends T> publisher, @NonNull Publisher<? extends T> publisher2) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        return fromArray(publisher, publisher2).flatMap(Functions.identity(), true, 2);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final void blockingSubscribe(@NonNull Consumer<? super T> consumer, @NonNull Consumer<? super Throwable> consumer2, @NonNull Action action) {
        FlowableBlockingSubscribe.subscribe(this, consumer, consumer2, action);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final Flowable<T> delay(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableDelay(this, Math.max(0L, j10), timeUnit, scheduler, z10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> doOnEach(@NonNull Subscriber<? super T> subscriber) {
        Objects.requireNonNull(subscriber, "subscriber is null");
        return a(FlowableInternalHelper.subscriberOnNext(subscriber), FlowableInternalHelper.subscriberOnError(subscriber), FlowableInternalHelper.subscriberOnComplete(subscriber), Functions.EMPTY_ACTION);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final ConnectableFlowable<T> publish(int i10) {
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly((ConnectableFlowable) new FlowablePublish(this, i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public final Flowable<T> sample(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableSampleTimed(this, j10, timeUnit, scheduler, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final <K, V> Single<Map<K, V>> toMap(@NonNull Function<? super T, ? extends K> function, @NonNull Function<? super T, ? extends V> function2, @NonNull Supplier<? extends Map<K, V>> supplier) {
        Objects.requireNonNull(function, "keySelector is null");
        Objects.requireNonNull(function2, "valueSelector is null");
        return (Single<Map<K, V>>) collect(supplier, Functions.toMapKeyValueSelector(function, function2));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Single<List<T>> toSortedList(int i10) {
        return toSortedList(Functions.naturalComparator(), i10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U, R> Flowable<R> zipWith(@NonNull Publisher<? extends U> publisher, @NonNull BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z10) {
        return zip(this, publisher, biFunction, z10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> concatEager(@NonNull Publisher<? extends Publisher<? extends T>> publisher, int i10, int i11) {
        Objects.requireNonNull(publisher, "sources is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        ObjectHelper.verifyPositive(i11, EventDataKeys.Target.PREFETCH_REQUESTS);
        return RxJavaPlugins.onAssembly(new FlowableConcatMapEagerPublisher(publisher, Functions.identity(), i10, i11, ErrorMode.IMMEDIATE));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> concatEagerDelayError(@NonNull Publisher<? extends Publisher<? extends T>> publisher, int i10, int i11) {
        Objects.requireNonNull(publisher, "sources is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        ObjectHelper.verifyPositive(i11, EventDataKeys.Target.PREFETCH_REQUESTS);
        return RxJavaPlugins.onAssembly(new FlowableConcatMapEagerPublisher(publisher, Functions.identity(), i10, i11, ErrorMode.END));
    }

    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final void blockingSubscribe(@NonNull Consumer<? super T> consumer, @NonNull Consumer<? super Throwable> consumer2, @NonNull Action action, int i10) {
        FlowableBlockingSubscribe.subscribe(this, consumer, consumer2, action, i10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U extends Collection<? super T>> Flowable<U> buffer(int i10, @NonNull Supplier<U> supplier) {
        return buffer(i10, i10, supplier);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> concatWith(@NonNull CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableConcatWithCompletable(this, completableSource));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final Flowable<T> mergeWith(@NonNull CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableMergeWithCompletable(this, completableSource));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public final Flowable<T> onBackpressureBuffer(int i10, boolean z10, boolean z11, @NonNull Action action) {
        Objects.requireNonNull(action, "onOverflow is null");
        ObjectHelper.verifyPositive(i10, "capacity");
        return RxJavaPlugins.onAssembly(new FlowableOnBackpressureBuffer(this, i10, z11, z10, action));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> replay(@NonNull Function<? super Flowable<T>, ? extends Publisher<R>> function, int i10, boolean z10) {
        Objects.requireNonNull(function, "selector is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return FlowableReplay.multicastSelector(FlowableInternalHelper.replaySupplier(this, i10, z10), function);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> startWith(@NonNull Publisher<? extends T> publisher) {
        Objects.requireNonNull(publisher, "other is null");
        return concatArray(publisher, this);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final Flowable<T> timeout(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, @NonNull Publisher<? extends T> publisher) {
        Objects.requireNonNull(publisher, "fallback is null");
        return c(j10, timeUnit, scheduler, publisher);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<Flowable<T>> window(long j10, long j11, @NonNull TimeUnit timeUnit) {
        return window(j10, j11, timeUnit, Schedulers.computation(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U, R> Flowable<R> zipWith(@NonNull Publisher<? extends U> publisher, @NonNull BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z10, int i10) {
        return zip(this, publisher, biFunction, z10, i10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> concat(@NonNull Publisher<? extends T> publisher, @NonNull Publisher<? extends T> publisher2, @NonNull Publisher<? extends T> publisher3) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        return concatArray(publisher, publisher2, publisher3);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Single<Boolean> sequenceEqual(@NonNull Publisher<? extends T> publisher, @NonNull Publisher<? extends T> publisher2, int i10) {
        return sequenceEqual(publisher, publisher2, ObjectHelper.equalsPredicate(), i10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T1, T2, R> Flowable<R> zip(@NonNull Publisher<? extends T1> publisher, @NonNull Publisher<? extends T2> publisher2, @NonNull BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(biFunction, "zipper is null");
        return zipArray(Functions.toFunction(biFunction), false, bufferSize(), publisher, publisher2);
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public final void blockingSubscribe(@NonNull Subscriber<? super T> subscriber) {
        Objects.requireNonNull(subscriber, "subscriber is null");
        FlowableBlockingSubscribe.subscribe(this, subscriber);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<List<T>> buffer(long j10, long j11, @NonNull TimeUnit timeUnit) {
        return (Flowable<List<T>>) buffer(j10, j11, timeUnit, Schedulers.computation(), ArrayListSupplier.asSupplier());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U, V> Flowable<V> flatMapIterable(@NonNull Function<? super T, ? extends Iterable<? extends U>> function, @NonNull BiFunction<? super T, ? super U, ? extends V> biFunction, int i10) {
        Objects.requireNonNull(function, "mapper is null");
        Objects.requireNonNull(biFunction, "combiner is null");
        return (Flowable<V>) flatMap(FlowableInternalHelper.flatMapIntoIterable(function), biFunction, false, bufferSize(), i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
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
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public final Flowable<Flowable<T>> window(long j10, long j11, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return window(j10, j11, timeUnit, scheduler, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> merge(@NonNull Publisher<? extends T> publisher, @NonNull Publisher<? extends T> publisher2, @NonNull Publisher<? extends T> publisher3) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        return fromArray(publisher, publisher2, publisher3).flatMap(Functions.identity(), false, 3);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> mergeDelayError(@NonNull Publisher<? extends T> publisher, @NonNull Publisher<? extends T> publisher2, @NonNull Publisher<? extends T> publisher3) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        return fromArray(publisher, publisher2, publisher3).flatMap(Functions.identity(), true, 3);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public final Flowable<List<T>> buffer(long j10, long j11, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return (Flowable<List<T>>) buffer(j10, j11, timeUnit, scheduler, ArrayListSupplier.asSupplier());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final <R> Flowable<R> concatMap(@NonNull Function<? super T, ? extends Publisher<? extends R>> function, int i10, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, EventDataKeys.Target.PREFETCH_REQUESTS);
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapScheduler(this, function, i10, ErrorMode.IMMEDIATE, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final <R> Flowable<R> concatMapDelayError(@NonNull Function<? super T, ? extends Publisher<? extends R>> function, boolean z10, int i10, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, EventDataKeys.Target.PREFETCH_REQUESTS);
        Objects.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapScheduler(this, function, i10, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, scheduler));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U, V> Flowable<T> delay(@NonNull Publisher<U> publisher, @NonNull Function<? super T, ? extends Publisher<V>> function) {
        return delaySubscription(publisher).delay(function);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public final <K, V> Flowable<GroupedFlowable<K, V>> groupBy(@NonNull Function<? super T, ? extends K> function, @NonNull Function<? super T, ? extends V> function2, boolean z10, int i10, @NonNull Function<? super Consumer<Object>, ? extends Map<K, Object>> function3) {
        Objects.requireNonNull(function, "keySelector is null");
        Objects.requireNonNull(function2, "valueSelector is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        Objects.requireNonNull(function3, "evictingMapFactory is null");
        return RxJavaPlugins.onAssembly(new FlowableGroupBy(this, function, function2, i10, z10, function3));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("none")
    public final <U> Flowable<T> sample(@NonNull Publisher<U> publisher) {
        Objects.requireNonNull(publisher, "sampler is null");
        return RxJavaPlugins.onAssembly(new FlowableSamplePublisher(this, publisher, false));
    }

    @Override // org.reactivestreams.Publisher
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public final void subscribe(@NonNull Subscriber<? super T> subscriber) {
        if (subscriber instanceof FlowableSubscriber) {
            subscribe((FlowableSubscriber) subscriber);
        } else {
            Objects.requireNonNull(subscriber, "subscriber is null");
            subscribe((FlowableSubscriber) new StrictSubscriber(subscriber));
        }
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("custom")
    public final Flowable<T> timeout(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return c(j10, timeUnit, scheduler, null);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public final Flowable<Flowable<T>> window(long j10, long j11, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, int i10) {
        ObjectHelper.verifyPositive(i10, "bufferSize");
        ObjectHelper.verifyPositive(j10, "timespan");
        ObjectHelper.verifyPositive(j11, "timeskip");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        return RxJavaPlugins.onAssembly(new FlowableWindowTimed(this, j10, j11, timeUnit, scheduler, Long.MAX_VALUE, i10, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final <T1, T2, T3, R> Flowable<R> withLatestFrom(@NonNull Publisher<T1> publisher, @NonNull Publisher<T2> publisher2, @NonNull Publisher<T3> publisher3, @NonNull Function4<? super T, ? super T1, ? super T2, ? super T3, R> function4) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        Objects.requireNonNull(function4, "combiner is null");
        return withLatestFrom((Publisher<?>[]) new Publisher[]{publisher, publisher2, publisher3}, Functions.toFunction(function4));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T1, T2, T3, R> Flowable<R> combineLatest(@NonNull Publisher<? extends T1> publisher, @NonNull Publisher<? extends T2> publisher2, @NonNull Publisher<? extends T3> publisher3, @NonNull Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        Objects.requireNonNull(function3, "combiner is null");
        return combineLatestArray(new Publisher[]{publisher, publisher2, publisher3}, Functions.toFunction(function3), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T, S> Flowable<T> generate(@NonNull Supplier<S> supplier, @NonNull BiConsumer<S, Emitter<T>> biConsumer, @NonNull Consumer<? super S> consumer) {
        Objects.requireNonNull(biConsumer, "generator is null");
        return generate(supplier, FlowableInternalHelper.simpleBiGenerator(biConsumer), consumer);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> just(T t10, T t11, T t12, T t13) {
        Objects.requireNonNull(t10, "item1 is null");
        Objects.requireNonNull(t11, "item2 is null");
        Objects.requireNonNull(t12, "item3 is null");
        Objects.requireNonNull(t13, "item4 is null");
        return fromArray(t10, t11, t12, t13);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public final <U extends Collection<? super T>> Flowable<U> buffer(long j10, long j11, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, @NonNull Supplier<U> supplier) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(supplier, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableBufferTimed(this, j10, j11, timeUnit, scheduler, supplier, Integer.MAX_VALUE, false));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("none")
    public final Flowable<T> onBackpressureBuffer(int i10, @NonNull Action action) {
        return onBackpressureBuffer(i10, false, false, action);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("io.reactivex:computation")
    public final <R> Flowable<R> replay(@NonNull Function<? super Flowable<T>, ? extends Publisher<R>> function, int i10, long j10, @NonNull TimeUnit timeUnit) {
        return replay(function, i10, j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final <U, V> Flowable<T> timeout(@NonNull Publisher<U> publisher, @NonNull Function<? super T, ? extends Publisher<V>> function) {
        Objects.requireNonNull(publisher, "firstTimeoutIndicator is null");
        return d(publisher, function, null);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public final Flowable<T> onBackpressureBuffer(long j10, @Nullable Action action, @NonNull BackpressureOverflowStrategy backpressureOverflowStrategy) {
        Objects.requireNonNull(backpressureOverflowStrategy, "overflowStrategy is null");
        ObjectHelper.verifyPositive(j10, "capacity");
        return RxJavaPlugins.onAssembly(new FlowableOnBackpressureBufferStrategy(this, j10, action, backpressureOverflowStrategy));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final <R> Flowable<R> replay(@NonNull Function<? super Flowable<T>, ? extends Publisher<R>> function, int i10, long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(function, "selector is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return FlowableReplay.multicastSelector(FlowableInternalHelper.replaySupplier(this, i10, j10, timeUnit, scheduler, false), function);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("none")
    public final <U> Flowable<T> sample(@NonNull Publisher<U> publisher, boolean z10) {
        Objects.requireNonNull(publisher, "sampler is null");
        return RxJavaPlugins.onAssembly(new FlowableSamplePublisher(this, publisher, z10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> concat(@NonNull Publisher<? extends T> publisher, @NonNull Publisher<? extends T> publisher2, @NonNull Publisher<? extends T> publisher3, @NonNull Publisher<? extends T> publisher4) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        Objects.requireNonNull(publisher4, "source4 is null");
        return concatArray(publisher, publisher2, publisher3, publisher4);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T, S> Flowable<T> generate(@NonNull Supplier<S> supplier, @NonNull BiFunction<S, Emitter<T>, S> biFunction) {
        return generate(supplier, biFunction, Functions.emptyConsumer());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T1, T2, R> Flowable<R> zip(@NonNull Publisher<? extends T1> publisher, @NonNull Publisher<? extends T2> publisher2, @NonNull BiFunction<? super T1, ? super T2, ? extends R> biFunction, boolean z10) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(biFunction, "zipper is null");
        return zipArray(Functions.toFunction(biFunction), z10, bufferSize(), publisher, publisher2);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U, V> Flowable<T> timeout(@NonNull Publisher<U> publisher, @NonNull Function<? super T, ? extends Publisher<V>> function, @NonNull Publisher<? extends T> publisher2) {
        Objects.requireNonNull(publisher, "firstTimeoutIndicator is null");
        Objects.requireNonNull(publisher2, "fallback is null");
        return d(publisher, function, publisher2);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T, S> Flowable<T> generate(@NonNull Supplier<S> supplier, @NonNull BiFunction<S, Emitter<T>, S> biFunction, @NonNull Consumer<? super S> consumer) {
        Objects.requireNonNull(supplier, "initialState is null");
        Objects.requireNonNull(biFunction, "generator is null");
        Objects.requireNonNull(consumer, "disposeState is null");
        return RxJavaPlugins.onAssembly(new FlowableGenerate(supplier, biFunction, consumer));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> merge(@NonNull Publisher<? extends T> publisher, @NonNull Publisher<? extends T> publisher2, @NonNull Publisher<? extends T> publisher3, @NonNull Publisher<? extends T> publisher4) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        Objects.requireNonNull(publisher4, "source4 is null");
        return fromArray(publisher, publisher2, publisher3, publisher4).flatMap(Functions.identity(), false, 4);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> mergeDelayError(@NonNull Publisher<? extends T> publisher, @NonNull Publisher<? extends T> publisher2, @NonNull Publisher<? extends T> publisher3, @NonNull Publisher<? extends T> publisher4) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        Objects.requireNonNull(publisher4, "source4 is null");
        return fromArray(publisher, publisher2, publisher3, publisher4).flatMap(Functions.identity(), true, 4);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Single<T> elementAt(long j10, @NonNull T t10) {
        if (j10 >= 0) {
            Objects.requireNonNull(t10, "defaultItem is null");
            return RxJavaPlugins.onAssembly(new FlowableElementAtSingle(this, j10, t10));
        }
        throw new IndexOutOfBoundsException(v.c("index >= 0 required but it was ", j10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> flatMap(@NonNull Function<? super T, ? extends Publisher<? extends R>> function, @NonNull Function<? super Throwable, ? extends Publisher<? extends R>> function2, @NonNull Supplier<? extends Publisher<? extends R>> supplier) {
        Objects.requireNonNull(function, "onNextMapper is null");
        Objects.requireNonNull(function2, "onErrorMapper is null");
        Objects.requireNonNull(supplier, "onCompleteSupplier is null");
        return merge(new FlowableMapNotification(this, function, function2, supplier));
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public final void subscribe(@NonNull FlowableSubscriber<? super T> flowableSubscriber) {
        Objects.requireNonNull(flowableSubscriber, "subscriber is null");
        try {
            Subscriber<? super T> subscriberOnSubscribe = RxJavaPlugins.onSubscribe(this, flowableSubscriber);
            Objects.requireNonNull(subscriberOnSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(subscriberOnSubscribe);
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
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<T> take(long j10, @NonNull TimeUnit timeUnit) {
        return takeUntil(timer(j10, timeUnit));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(@NonNull Function<? super T, ? extends K> function, @NonNull Function<? super T, ? extends V> function2, @NonNull Supplier<Map<K, Collection<V>>> supplier) {
        return toMultimap(function, function2, supplier, ArrayListSupplier.asFunction());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<List<T>> buffer(long j10, @NonNull TimeUnit timeUnit) {
        return buffer(j10, timeUnit, Schedulers.computation(), Integer.MAX_VALUE);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> skip(long j10, @NonNull TimeUnit timeUnit) {
        return skipUntil(timer(j10, timeUnit));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Flowable<T> skipLast(long j10, @NonNull TimeUnit timeUnit) {
        return skipLast(j10, timeUnit, Schedulers.computation(), false, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("custom")
    public final Flowable<T> take(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return takeUntil(timer(j10, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, R> Flowable<R> combineLatest(@NonNull Publisher<? extends T1> publisher, @NonNull Publisher<? extends T2> publisher2, @NonNull Publisher<? extends T3> publisher3, @NonNull Publisher<? extends T4> publisher4, @NonNull Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        Objects.requireNonNull(publisher4, "source4 is null");
        Objects.requireNonNull(function4, "combiner is null");
        return combineLatestArray(new Publisher[]{publisher, publisher2, publisher3, publisher4}, Functions.toFunction(function4), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> just(T t10, T t11, T t12, T t13, T t14) {
        Objects.requireNonNull(t10, "item1 is null");
        Objects.requireNonNull(t11, "item2 is null");
        Objects.requireNonNull(t12, "item3 is null");
        Objects.requireNonNull(t13, "item4 is null");
        Objects.requireNonNull(t14, "item5 is null");
        return fromArray(t10, t11, t12, t13, t14);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<List<T>> buffer(long j10, @NonNull TimeUnit timeUnit, int i10) {
        return buffer(j10, timeUnit, Schedulers.computation(), i10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final Flowable<T> skip(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return skipUntil(timer(j10, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public final Flowable<T> skipLast(long j10, @NonNull TimeUnit timeUnit, boolean z10) {
        return skipLast(j10, timeUnit, Schedulers.computation(), z10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> takeLast(long j10, long j11, @NonNull TimeUnit timeUnit) {
        return takeLast(j10, j11, timeUnit, Schedulers.computation(), false, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<Flowable<T>> window(long j10, @NonNull TimeUnit timeUnit) {
        return window(j10, timeUnit, Schedulers.computation(), Long.MAX_VALUE, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, R> Flowable<R> withLatestFrom(@NonNull Publisher<T1> publisher, @NonNull Publisher<T2> publisher2, @NonNull Publisher<T3> publisher3, @NonNull Publisher<T4> publisher4, @NonNull Function5<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> function5) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        Objects.requireNonNull(publisher4, "source4 is null");
        Objects.requireNonNull(function5, "combiner is null");
        return withLatestFrom((Publisher<?>[]) new Publisher[]{publisher, publisher2, publisher3, publisher4}, Functions.toFunction(function5));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T1, T2, R> Flowable<R> zip(@NonNull Publisher<? extends T1> publisher, @NonNull Publisher<? extends T2> publisher2, @NonNull BiFunction<? super T1, ? super T2, ? extends R> biFunction, boolean z10, int i10) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(biFunction, "zipper is null");
        return zipArray(Functions.toFunction(biFunction), z10, i10, publisher, publisher2);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public final Flowable<List<T>> buffer(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, int i10) {
        return (Flowable<List<T>>) buffer(j10, timeUnit, scheduler, i10, ArrayListSupplier.asSupplier(), false);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("custom")
    public final Flowable<T> skipLast(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return skipLast(j10, timeUnit, scheduler, false, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final Flowable<T> takeLast(long j10, long j11, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return takeLast(j10, j11, timeUnit, scheduler, false, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<Flowable<T>> window(long j10, @NonNull TimeUnit timeUnit, long j11) {
        return window(j10, timeUnit, Schedulers.computation(), j11, false);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public final <U extends Collection<? super T>> Flowable<U> buffer(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, int i10, @NonNull Supplier<U> supplier, boolean z10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(supplier, "bufferSupplier is null");
        ObjectHelper.verifyPositive(i10, "count");
        return RxJavaPlugins.onAssembly(new FlowableBufferTimed(this, j10, j10, timeUnit, scheduler, supplier, i10, z10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <R> Flowable<R> flatMap(@NonNull Function<? super T, ? extends Publisher<? extends R>> function, @NonNull Function<Throwable, ? extends Publisher<? extends R>> function2, @NonNull Supplier<? extends Publisher<? extends R>> supplier, int i10) {
        Objects.requireNonNull(function, "onNextMapper is null");
        Objects.requireNonNull(function2, "onErrorMapper is null");
        Objects.requireNonNull(supplier, "onCompleteSupplier is null");
        return merge(new FlowableMapNotification(this, function, function2, supplier), i10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final <R> Flowable<R> replay(@NonNull Function<? super Flowable<T>, ? extends Publisher<R>> function, int i10, long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10) {
        Objects.requireNonNull(function, "selector is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return FlowableReplay.multicastSelector(FlowableInternalHelper.replaySupplier(this, i10, j10, timeUnit, scheduler, z10), function);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("custom")
    public final Flowable<T> skipLast(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10) {
        return skipLast(j10, timeUnit, scheduler, z10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final Flowable<T> takeLast(long j10, long j11, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10, int i10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        if (j10 >= 0) {
            return RxJavaPlugins.onAssembly(new FlowableTakeLastTimed(this, j10, j11, timeUnit, scheduler, i10, z10));
        }
        throw new IllegalArgumentException(v.c("count >= 0 required but it was ", j10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<Flowable<T>> window(long j10, @NonNull TimeUnit timeUnit, long j11, boolean z10) {
        return window(j10, timeUnit, Schedulers.computation(), j11, z10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final Flowable<T> retry(@NonNull Predicate<? super Throwable> predicate) {
        return retry(Long.MAX_VALUE, predicate);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("custom")
    public final Flowable<T> skipLast(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10, int i10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableSkipLastTimed(this, j10, timeUnit, scheduler, i10 << 1, z10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public final Flowable<Flowable<T>> window(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return window(j10, timeUnit, scheduler, Long.MAX_VALUE, false);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public final Flowable<Flowable<T>> window(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, long j11) {
        return window(j10, timeUnit, scheduler, j11, false);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T1, T2, T3, R> Flowable<R> zip(@NonNull Publisher<? extends T1> publisher, @NonNull Publisher<? extends T2> publisher2, @NonNull Publisher<? extends T3> publisher3, @NonNull Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        Objects.requireNonNull(function3, "zipper is null");
        return zipArray(Functions.toFunction(function3), false, bufferSize(), publisher, publisher2, publisher3);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public final Flowable<Flowable<T>> window(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, long j11, boolean z10) {
        return window(j10, timeUnit, scheduler, j11, z10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, R> Flowable<R> combineLatest(@NonNull Publisher<? extends T1> publisher, @NonNull Publisher<? extends T2> publisher2, @NonNull Publisher<? extends T3> publisher3, @NonNull Publisher<? extends T4> publisher4, @NonNull Publisher<? extends T5> publisher5, @NonNull Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        Objects.requireNonNull(publisher4, "source4 is null");
        Objects.requireNonNull(publisher5, "source5 is null");
        Objects.requireNonNull(function5, "combiner is null");
        return combineLatestArray(new Publisher[]{publisher, publisher2, publisher3, publisher4, publisher5}, Functions.toFunction(function5), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> just(T t10, T t11, T t12, T t13, T t14, T t15) {
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
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U, R> Flowable<R> flatMap(@NonNull Function<? super T, ? extends Publisher<? extends U>> function, @NonNull BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return flatMap(function, biFunction, false, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public final Flowable<Flowable<T>> window(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, long j11, boolean z10, int i10) {
        ObjectHelper.verifyPositive(i10, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.verifyPositive(j11, "count");
        return RxJavaPlugins.onAssembly(new FlowableWindowTimed(this, j10, j10, timeUnit, scheduler, j11, i10, z10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    public final Flowable<List<T>> buffer(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return (Flowable<List<T>>) buffer(j10, timeUnit, scheduler, Integer.MAX_VALUE, ArrayListSupplier.asSupplier(), false);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U, R> Flowable<R> flatMap(@NonNull Function<? super T, ? extends Publisher<? extends U>> function, @NonNull BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z10) {
        return flatMap(function, biFunction, z10, bufferSize(), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final <R> Flowable<R> withLatestFrom(@NonNull Publisher<?>[] publisherArr, @NonNull Function<? super Object[], R> function) {
        Objects.requireNonNull(publisherArr, "others is null");
        Objects.requireNonNull(function, "combiner is null");
        return RxJavaPlugins.onAssembly(new FlowableWithLatestFromMany(this, publisherArr, function));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("none")
    public final <TOpening, TClosing> Flowable<List<T>> buffer(@NonNull Publisher<? extends TOpening> publisher, @NonNull Function<? super TOpening, ? extends Publisher<? extends TClosing>> function) {
        return (Flowable<List<T>>) buffer(publisher, function, ArrayListSupplier.asSupplier());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U, R> Flowable<R> flatMap(@NonNull Function<? super T, ? extends Publisher<? extends U>> function, @NonNull BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z10, int i10) {
        return flatMap(function, biFunction, z10, i10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("io.reactivex:computation")
    public final <R> Flowable<R> replay(@NonNull Function<? super Flowable<T>, ? extends Publisher<R>> function, long j10, @NonNull TimeUnit timeUnit) {
        return replay(function, j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("none")
    public final <TOpening, TClosing, U extends Collection<? super T>> Flowable<U> buffer(@NonNull Publisher<? extends TOpening> publisher, @NonNull Function<? super TOpening, ? extends Publisher<? extends TClosing>> function, @NonNull Supplier<U> supplier) {
        Objects.requireNonNull(publisher, "openingIndicator is null");
        Objects.requireNonNull(function, "closingIndicator is null");
        Objects.requireNonNull(supplier, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableBufferBoundary(this, publisher, function, supplier));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U, R> Flowable<R> flatMap(@NonNull Function<? super T, ? extends Publisher<? extends U>> function, @NonNull BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z10, int i10, int i11) {
        Objects.requireNonNull(function, "mapper is null");
        Objects.requireNonNull(biFunction, "combiner is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return flatMap(FlowableInternalHelper.flatMapWithCombiner(function, biFunction), z10, i10, i11);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final <R> Flowable<R> replay(@NonNull Function<? super Flowable<T>, ? extends Publisher<R>> function, long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(function, "selector is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return FlowableReplay.multicastSelector(FlowableInternalHelper.replaySupplier(this, j10, timeUnit, scheduler, false), function);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, R> Flowable<R> zip(@NonNull Publisher<? extends T1> publisher, @NonNull Publisher<? extends T2> publisher2, @NonNull Publisher<? extends T3> publisher3, @NonNull Publisher<? extends T4> publisher4, @NonNull Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        Objects.requireNonNull(publisher4, "source4 is null");
        Objects.requireNonNull(function4, "zipper is null");
        return zipArray(Functions.toFunction(function4), false, bufferSize(), publisher, publisher2, publisher3, publisher4);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public final <R> Flowable<R> withLatestFrom(@NonNull Iterable<? extends Publisher<?>> iterable, @NonNull Function<? super Object[], R> function) {
        Objects.requireNonNull(iterable, "others is null");
        Objects.requireNonNull(function, "combiner is null");
        return RxJavaPlugins.onAssembly(new FlowableWithLatestFromMany(this, iterable, function));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("none")
    public final <B> Flowable<Flowable<T>> window(@NonNull Publisher<B> publisher) {
        return window(publisher, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("none")
    public final <B> Flowable<Flowable<T>> window(@NonNull Publisher<B> publisher, int i10) {
        Objects.requireNonNull(publisher, "boundaryIndicator is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableWindowBoundary(this, publisher, i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, R> Flowable<R> combineLatest(@NonNull Publisher<? extends T1> publisher, @NonNull Publisher<? extends T2> publisher2, @NonNull Publisher<? extends T3> publisher3, @NonNull Publisher<? extends T4> publisher4, @NonNull Publisher<? extends T5> publisher5, @NonNull Publisher<? extends T6> publisher6, @NonNull Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        Objects.requireNonNull(publisher4, "source4 is null");
        Objects.requireNonNull(publisher5, "source5 is null");
        Objects.requireNonNull(publisher6, "source6 is null");
        Objects.requireNonNull(function6, "combiner is null");
        return combineLatestArray(new Publisher[]{publisher, publisher2, publisher3, publisher4, publisher5, publisher6}, Functions.toFunction(function6), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> just(T t10, T t11, T t12, T t13, T t14, T t15, T t16) {
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
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("none")
    public final <B> Flowable<List<T>> buffer(@NonNull Publisher<B> publisher) {
        return (Flowable<List<T>>) buffer(publisher, ArrayListSupplier.asSupplier());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final <R> Flowable<R> replay(@NonNull Function<? super Flowable<T>, ? extends Publisher<R>> function, long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10) {
        Objects.requireNonNull(function, "selector is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return FlowableReplay.multicastSelector(FlowableInternalHelper.replaySupplier(this, j10, timeUnit, scheduler, z10), function);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("none")
    public final <B> Flowable<List<T>> buffer(@NonNull Publisher<B> publisher, int i10) {
        ObjectHelper.verifyPositive(i10, "initialCapacity");
        return (Flowable<List<T>>) buffer(publisher, Functions.createArrayList(i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final <U, R> Flowable<R> flatMap(@NonNull Function<? super T, ? extends Publisher<? extends U>> function, @NonNull BiFunction<? super T, ? super U, ? extends R> biFunction, int i10) {
        return flatMap(function, biFunction, false, i10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("none")
    public final <U, V> Flowable<Flowable<T>> window(@NonNull Publisher<U> publisher, @NonNull Function<? super U, ? extends Publisher<V>> function) {
        return window(publisher, function, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, R> Flowable<R> zip(@NonNull Publisher<? extends T1> publisher, @NonNull Publisher<? extends T2> publisher2, @NonNull Publisher<? extends T3> publisher3, @NonNull Publisher<? extends T4> publisher4, @NonNull Publisher<? extends T5> publisher5, @NonNull Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        Objects.requireNonNull(publisher4, "source4 is null");
        Objects.requireNonNull(publisher5, "source5 is null");
        Objects.requireNonNull(function5, "zipper is null");
        return zipArray(Functions.toFunction(function5), false, bufferSize(), publisher, publisher2, publisher3, publisher4, publisher5);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("none")
    public final <B, U extends Collection<? super T>> Flowable<U> buffer(@NonNull Publisher<B> publisher, @NonNull Supplier<U> supplier) {
        Objects.requireNonNull(publisher, "boundaryIndicator is null");
        Objects.requireNonNull(supplier, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableBufferExactBoundary(this, publisher, supplier));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("none")
    public final <U, V> Flowable<Flowable<T>> window(@NonNull Publisher<U> publisher, @NonNull Function<? super U, ? extends Publisher<V>> function, int i10) {
        Objects.requireNonNull(publisher, "openingIndicator is null");
        Objects.requireNonNull(function, "closingIndicator is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableWindowBoundarySelector(this, publisher, function, i10));
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final ConnectableFlowable<T> replay(int i10) {
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return FlowableReplay.create(this, i10, false);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<T> takeLast(long j10, @NonNull TimeUnit timeUnit) {
        return takeLast(j10, timeUnit, Schedulers.computation(), false, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("io.reactivex:computation")
    public final Flowable<T> takeLast(long j10, @NonNull TimeUnit timeUnit, boolean z10) {
        return takeLast(j10, timeUnit, Schedulers.computation(), z10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public final ConnectableFlowable<T> replay(int i10, boolean z10) {
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return FlowableReplay.create(this, i10, z10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final Flowable<T> takeLast(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        return takeLast(j10, timeUnit, scheduler, false, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final Flowable<T> takeLast(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10) {
        return takeLast(j10, timeUnit, scheduler, z10, bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> Flowable<R> combineLatest(@NonNull Publisher<? extends T1> publisher, @NonNull Publisher<? extends T2> publisher2, @NonNull Publisher<? extends T3> publisher3, @NonNull Publisher<? extends T4> publisher4, @NonNull Publisher<? extends T5> publisher5, @NonNull Publisher<? extends T6> publisher6, @NonNull Publisher<? extends T7> publisher7, @NonNull Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> function7) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        Objects.requireNonNull(publisher4, "source4 is null");
        Objects.requireNonNull(publisher5, "source5 is null");
        Objects.requireNonNull(publisher6, "source6 is null");
        Objects.requireNonNull(publisher7, "source7 is null");
        Objects.requireNonNull(function7, "combiner is null");
        return combineLatestArray(new Publisher[]{publisher, publisher2, publisher3, publisher4, publisher5, publisher6, publisher7}, Functions.toFunction(function7), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> just(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17) {
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
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("io.reactivex:computation")
    public final ConnectableFlowable<T> replay(int i10, long j10, @NonNull TimeUnit timeUnit) {
        return replay(i10, j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final Flowable<T> takeLast(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10, int i10) {
        return takeLast(Long.MAX_VALUE, j10, timeUnit, scheduler, z10, i10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final ConnectableFlowable<T> replay(int i10, long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return FlowableReplay.create(this, j10, timeUnit, scheduler, i10, false);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, R> Flowable<R> zip(@NonNull Publisher<? extends T1> publisher, @NonNull Publisher<? extends T2> publisher2, @NonNull Publisher<? extends T3> publisher3, @NonNull Publisher<? extends T4> publisher4, @NonNull Publisher<? extends T5> publisher5, @NonNull Publisher<? extends T6> publisher6, @NonNull Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        Objects.requireNonNull(publisher4, "source4 is null");
        Objects.requireNonNull(publisher5, "source5 is null");
        Objects.requireNonNull(publisher6, "source6 is null");
        Objects.requireNonNull(function6, "zipper is null");
        return zipArray(Functions.toFunction(function6), false, bufferSize(), publisher, publisher2, publisher3, publisher4, publisher5, publisher6);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final ConnectableFlowable<T> replay(int i10, long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return FlowableReplay.create(this, j10, timeUnit, scheduler, i10, z10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Flowable<R> combineLatest(@NonNull Publisher<? extends T1> publisher, @NonNull Publisher<? extends T2> publisher2, @NonNull Publisher<? extends T3> publisher3, @NonNull Publisher<? extends T4> publisher4, @NonNull Publisher<? extends T5> publisher5, @NonNull Publisher<? extends T6> publisher6, @NonNull Publisher<? extends T7> publisher7, @NonNull Publisher<? extends T8> publisher8, @NonNull Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        Objects.requireNonNull(publisher4, "source4 is null");
        Objects.requireNonNull(publisher5, "source5 is null");
        Objects.requireNonNull(publisher6, "source6 is null");
        Objects.requireNonNull(publisher7, "source7 is null");
        Objects.requireNonNull(publisher8, "source8 is null");
        Objects.requireNonNull(function8, "combiner is null");
        return combineLatestArray(new Publisher[]{publisher, publisher2, publisher3, publisher4, publisher5, publisher6, publisher7, publisher8}, Functions.toFunction(function8), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> just(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18) {
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
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("io.reactivex:computation")
    public final ConnectableFlowable<T> replay(long j10, @NonNull TimeUnit timeUnit) {
        return replay(j10, timeUnit, Schedulers.computation());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> Flowable<R> zip(@NonNull Publisher<? extends T1> publisher, @NonNull Publisher<? extends T2> publisher2, @NonNull Publisher<? extends T3> publisher3, @NonNull Publisher<? extends T4> publisher4, @NonNull Publisher<? extends T5> publisher5, @NonNull Publisher<? extends T6> publisher6, @NonNull Publisher<? extends T7> publisher7, @NonNull Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> function7) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        Objects.requireNonNull(publisher4, "source4 is null");
        Objects.requireNonNull(publisher5, "source5 is null");
        Objects.requireNonNull(publisher6, "source6 is null");
        Objects.requireNonNull(publisher7, "source7 is null");
        Objects.requireNonNull(function7, "zipper is null");
        return zipArray(Functions.toFunction(function7), false, bufferSize(), publisher, publisher2, publisher3, publisher4, publisher5, publisher6, publisher7);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final ConnectableFlowable<T> replay(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return FlowableReplay.create(this, j10, timeUnit, scheduler, false);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    public final ConnectableFlowable<T> replay(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, boolean z10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return FlowableReplay.create(this, j10, timeUnit, scheduler, z10);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Flowable<R> combineLatest(@NonNull Publisher<? extends T1> publisher, @NonNull Publisher<? extends T2> publisher2, @NonNull Publisher<? extends T3> publisher3, @NonNull Publisher<? extends T4> publisher4, @NonNull Publisher<? extends T5> publisher5, @NonNull Publisher<? extends T6> publisher6, @NonNull Publisher<? extends T7> publisher7, @NonNull Publisher<? extends T8> publisher8, @NonNull Publisher<? extends T9> publisher9, @NonNull Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> function9) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        Objects.requireNonNull(publisher4, "source4 is null");
        Objects.requireNonNull(publisher5, "source5 is null");
        Objects.requireNonNull(publisher6, "source6 is null");
        Objects.requireNonNull(publisher7, "source7 is null");
        Objects.requireNonNull(publisher8, "source8 is null");
        Objects.requireNonNull(publisher9, "source9 is null");
        Objects.requireNonNull(function9, "combiner is null");
        return combineLatestArray(new Publisher[]{publisher, publisher2, publisher3, publisher4, publisher5, publisher6, publisher7, publisher8, publisher9}, Functions.toFunction(function9), bufferSize());
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T> Flowable<T> just(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18, T t19) {
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
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Flowable<R> zip(@NonNull Publisher<? extends T1> publisher, @NonNull Publisher<? extends T2> publisher2, @NonNull Publisher<? extends T3> publisher3, @NonNull Publisher<? extends T4> publisher4, @NonNull Publisher<? extends T5> publisher5, @NonNull Publisher<? extends T6> publisher6, @NonNull Publisher<? extends T7> publisher7, @NonNull Publisher<? extends T8> publisher8, @NonNull Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        Objects.requireNonNull(publisher4, "source4 is null");
        Objects.requireNonNull(publisher5, "source5 is null");
        Objects.requireNonNull(publisher6, "source6 is null");
        Objects.requireNonNull(publisher7, "source7 is null");
        Objects.requireNonNull(publisher8, "source8 is null");
        Objects.requireNonNull(function8, "zipper is null");
        return zipArray(Functions.toFunction(function8), false, bufferSize(), publisher, publisher2, publisher3, publisher4, publisher5, publisher6, publisher7, publisher8);
    }

    @CheckReturnValue
    @NonNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Flowable<R> zip(@NonNull Publisher<? extends T1> publisher, @NonNull Publisher<? extends T2> publisher2, @NonNull Publisher<? extends T3> publisher3, @NonNull Publisher<? extends T4> publisher4, @NonNull Publisher<? extends T5> publisher5, @NonNull Publisher<? extends T6> publisher6, @NonNull Publisher<? extends T7> publisher7, @NonNull Publisher<? extends T8> publisher8, @NonNull Publisher<? extends T9> publisher9, @NonNull Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> function9) {
        Objects.requireNonNull(publisher, "source1 is null");
        Objects.requireNonNull(publisher2, "source2 is null");
        Objects.requireNonNull(publisher3, "source3 is null");
        Objects.requireNonNull(publisher4, "source4 is null");
        Objects.requireNonNull(publisher5, "source5 is null");
        Objects.requireNonNull(publisher6, "source6 is null");
        Objects.requireNonNull(publisher7, "source7 is null");
        Objects.requireNonNull(publisher8, "source8 is null");
        Objects.requireNonNull(publisher9, "source9 is null");
        Objects.requireNonNull(function9, "zipper is null");
        return zipArray(Functions.toFunction(function9), false, bufferSize(), publisher, publisher2, publisher3, publisher4, publisher5, publisher6, publisher7, publisher8, publisher9);
    }
}
