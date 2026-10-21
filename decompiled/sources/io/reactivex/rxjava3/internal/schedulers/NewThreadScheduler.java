package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes12.dex */
public final class NewThreadScheduler extends Scheduler {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final RxThreadFactory f77969r0 = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())));

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ThreadFactory f77970q0;

    public NewThreadScheduler() {
        this(f77969r0);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new NewThreadWorker(this.f77970q0);
    }

    public NewThreadScheduler(ThreadFactory threadFactory) {
        this.f77970q0 = threadFactory;
    }
}
