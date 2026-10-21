package io.reactivex.flowables;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableAutoConnect;
import io.reactivex.internal.operators.flowable.FlowablePublishAlt;
import io.reactivex.internal.operators.flowable.FlowablePublishClassic;
import io.reactivex.internal.operators.flowable.FlowableRefCount;
import io.reactivex.internal.util.ConnectConsumer;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ConnectableFlowable<T> extends Flowable<T> {
    @NonNull
    public Flowable<T> autoConnect() {
        return autoConnect(1);
    }

    public final Disposable connect() {
        ConnectConsumer connectConsumer = new ConnectConsumer();
        connect(connectConsumer);
        return connectConsumer.disposable;
    }

    public abstract void connect(@NonNull Consumer<? super Disposable> consumer);

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public Flowable<T> refCount() {
        ConnectableFlowable connectableFlowableOnAssembly;
        if (this instanceof FlowablePublishClassic) {
            FlowablePublishClassic flowablePublishClassic = (FlowablePublishClassic) this;
            connectableFlowableOnAssembly = RxJavaPlugins.onAssembly((ConnectableFlowable) new FlowablePublishAlt(flowablePublishClassic.publishSource(), flowablePublishClassic.publishBufferSize()));
        } else {
            connectableFlowableOnAssembly = this;
        }
        return RxJavaPlugins.onAssembly(new FlowableRefCount(connectableFlowableOnAssembly));
    }

    @NonNull
    public Flowable<T> autoConnect(int i10) {
        return autoConnect(i10, Functions.emptyConsumer());
    }

    @NonNull
    public Flowable<T> autoConnect(int i10, @NonNull Consumer<? super Disposable> consumer) {
        if (i10 <= 0) {
            connect(consumer);
            return RxJavaPlugins.onAssembly((ConnectableFlowable) this);
        }
        return RxJavaPlugins.onAssembly(new FlowableAutoConnect(this, i10, consumer));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> refCount(int i10) {
        return refCount(i10, 0L, TimeUnit.NANOSECONDS, Schedulers.trampoline());
    }

    @SchedulerSupport("io.reactivex:computation")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> refCount(long j10, TimeUnit timeUnit) {
        return refCount(1, j10, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport("custom")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> refCount(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return refCount(1, j10, timeUnit, scheduler);
    }

    @SchedulerSupport("io.reactivex:computation")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> refCount(int i10, long j10, TimeUnit timeUnit) {
        return refCount(i10, j10, timeUnit, Schedulers.computation());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("custom")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> refCount(int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        ConnectableFlowable connectableFlowableOnAssembly;
        ObjectHelper.verifyPositive(i10, "subscriberCount");
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        if (this instanceof FlowablePublishClassic) {
            FlowablePublishClassic flowablePublishClassic = (FlowablePublishClassic) this;
            connectableFlowableOnAssembly = RxJavaPlugins.onAssembly((ConnectableFlowable) new FlowablePublishAlt(flowablePublishClassic.publishSource(), flowablePublishClassic.publishBufferSize()));
        } else {
            connectableFlowableOnAssembly = this;
        }
        return RxJavaPlugins.onAssembly(new FlowableRefCount(connectableFlowableOnAssembly, i10, j10, timeUnit, scheduler));
    }
}
