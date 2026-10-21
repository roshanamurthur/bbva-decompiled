package com.bbva.glomohybrid.base.scheduler;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RxSchedulerProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/base/scheduler/RxSchedulerProvider;", "Lcom/bbva/glomohybrid/base/scheduler/SchedulerProvider;", "()V", "computation", "Lio/reactivex/Scheduler;", "io", "main", "thread", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RxSchedulerProvider implements SchedulerProvider {
    @Override // com.bbva.glomohybrid.base.scheduler.SchedulerProvider
    @NotNull
    public Scheduler computation() {
        Scheduler schedulerComputation = Schedulers.computation();
        Intrinsics.checkNotNullExpressionValue(schedulerComputation, "computation(...)");
        return schedulerComputation;
    }

    @Override // com.bbva.glomohybrid.base.scheduler.SchedulerProvider
    @NotNull
    public Scheduler io() {
        Scheduler schedulerIo = Schedulers.io();
        Intrinsics.checkNotNullExpressionValue(schedulerIo, "io(...)");
        return schedulerIo;
    }

    @Override // com.bbva.glomohybrid.base.scheduler.SchedulerProvider
    @NotNull
    public Scheduler main() {
        Scheduler schedulerMainThread = AndroidSchedulers.mainThread();
        Intrinsics.checkNotNullExpressionValue(schedulerMainThread, "mainThread(...)");
        return schedulerMainThread;
    }

    @Override // com.bbva.glomohybrid.base.scheduler.SchedulerProvider
    @NotNull
    public Scheduler thread() {
        Scheduler schedulerNewThread = Schedulers.newThread();
        Intrinsics.checkNotNullExpressionValue(schedulerNewThread, "newThread(...)");
        return schedulerNewThread;
    }
}
