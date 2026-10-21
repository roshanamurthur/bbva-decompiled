package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes12.dex */
public interface SchedulerMultiWorkerSupport {

    public interface WorkerCallback {
        void onWorker(int i10, @NonNull Scheduler.Worker worker);
    }

    void createWorkers(int i10, @NonNull WorkerCallback workerCallback);
}
