package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes12.dex */
public final class NewThreadScheduler extends Scheduler {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final RxThreadFactory f73679s0 = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ThreadFactory f73680r0;

    public NewThreadScheduler() {
        this(f73679s0);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new NewThreadWorker(this.f73680r0);
    }

    public NewThreadScheduler(ThreadFactory threadFactory) {
        this.f73680r0 = threadFactory;
    }
}
