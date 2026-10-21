package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class WorkForegroundUpdater implements ForegroundUpdater {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskExecutor f24662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ForegroundProcessor f24663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkSpecDao f24664c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SettableFuture f24665p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ UUID f24666q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ForegroundInfo f24667r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Context f24668s0;

        public a(SettableFuture settableFuture, UUID uuid, ForegroundInfo foregroundInfo, Context context) {
            this.f24665p0 = settableFuture;
            this.f24666q0 = uuid;
            this.f24667r0 = foregroundInfo;
            this.f24668s0 = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context = this.f24668s0;
            ForegroundInfo foregroundInfo = this.f24667r0;
            WorkForegroundUpdater workForegroundUpdater = WorkForegroundUpdater.this;
            SettableFuture settableFuture = this.f24665p0;
            try {
                if (!settableFuture.isCancelled()) {
                    String string = this.f24666q0.toString();
                    WorkInfo.State state = workForegroundUpdater.f24664c.getState(string);
                    if (state == null || state.isFinished()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    workForegroundUpdater.f24663b.startForeground(string, foregroundInfo);
                    context.startService(SystemForegroundDispatcher.createNotifyIntent(context, string, foregroundInfo));
                }
                settableFuture.set(null);
            } catch (Throwable th2) {
                settableFuture.setException(th2);
            }
        }
    }

    static {
        Logger.tagWithPrefix("WMFgUpdater");
    }

    public WorkForegroundUpdater(@NonNull WorkDatabase workDatabase, @NonNull ForegroundProcessor foregroundProcessor, @NonNull TaskExecutor taskExecutor) {
        this.f24663b = foregroundProcessor;
        this.f24662a = taskExecutor;
        this.f24664c = workDatabase.workSpecDao();
    }

    @Override // androidx.work.ForegroundUpdater
    @NonNull
    public ListenableFuture<Void> setForegroundAsync(@NonNull Context context, @NonNull UUID uuid, @NonNull ForegroundInfo foregroundInfo) {
        SettableFuture settableFutureCreate = SettableFuture.create();
        this.f24662a.executeOnBackgroundThread(new a(settableFutureCreate, uuid, foregroundInfo, context));
        return settableFutureCreate;
    }
}
