package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.ProgressUpdater;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class WorkProgressUpdater implements ProgressUpdater {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f24670c = Logger.tagWithPrefix("WorkProgressUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase f24671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskExecutor f24672b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ UUID f24673p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Data f24674q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SettableFuture f24675r0;

        public a(UUID uuid, Data data, SettableFuture settableFuture) {
            this.f24673p0 = uuid;
            this.f24674q0 = data;
            this.f24675r0 = settableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SettableFuture settableFuture = this.f24675r0;
            UUID uuid = this.f24673p0;
            String string = uuid.toString();
            Logger logger = Logger.get();
            String str = WorkProgressUpdater.f24670c;
            Data data = this.f24674q0;
            logger.debug(str, String.format("Updating progress for %s (%s)", uuid, data), new Throwable[0]);
            WorkProgressUpdater workProgressUpdater = WorkProgressUpdater.this;
            workProgressUpdater.f24671a.beginTransaction();
            try {
                WorkSpec workSpec = workProgressUpdater.f24671a.workSpecDao().getWorkSpec(string);
                if (workSpec == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (workSpec.state == WorkInfo.State.RUNNING) {
                    workProgressUpdater.f24671a.workProgressDao().insert(new WorkProgress(string, data));
                } else {
                    Logger.get().warning(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", string), new Throwable[0]);
                }
                settableFuture.set(null);
                workProgressUpdater.f24671a.setTransactionSuccessful();
            } catch (Throwable th2) {
                try {
                    Logger.get().error(WorkProgressUpdater.f24670c, "Error updating Worker progress", th2);
                    settableFuture.setException(th2);
                } finally {
                    workProgressUpdater.f24671a.endTransaction();
                }
            }
        }
    }

    public WorkProgressUpdater(@NonNull WorkDatabase workDatabase, @NonNull TaskExecutor taskExecutor) {
        this.f24671a = workDatabase;
        this.f24672b = taskExecutor;
    }

    @Override // androidx.work.ProgressUpdater
    @NonNull
    public ListenableFuture<Void> updateProgress(@NonNull Context context, @NonNull UUID uuid, @NonNull Data data) {
        SettableFuture settableFutureCreate = SettableFuture.create();
        this.f24672b.executeOnBackgroundThread(new a(uuid, data, settableFutureCreate));
        return settableFutureCreate;
    }
}
