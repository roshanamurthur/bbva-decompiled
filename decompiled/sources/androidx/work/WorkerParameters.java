package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final UUID f24340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Data f24341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final HashSet f24342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RuntimeExtras f24343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Executor f24345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TaskExecutor f24346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final WorkerFactory f24347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final ProgressUpdater f24348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ForegroundUpdater f24349j;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class RuntimeExtras {

        @RequiresApi(28)
        public Network network;

        @NonNull
        public List<String> triggeredContentAuthorities = Collections.emptyList();

        @NonNull
        public List<Uri> triggeredContentUris = Collections.emptyList();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkerParameters(@NonNull UUID uuid, @NonNull Data data, @NonNull Collection<String> collection, @NonNull RuntimeExtras runtimeExtras, @IntRange(from = 0) int i10, @NonNull Executor executor, @NonNull TaskExecutor taskExecutor, @NonNull WorkerFactory workerFactory, @NonNull ProgressUpdater progressUpdater, @NonNull ForegroundUpdater foregroundUpdater) {
        this.f24340a = uuid;
        this.f24341b = data;
        this.f24342c = new HashSet(collection);
        this.f24343d = runtimeExtras;
        this.f24344e = i10;
        this.f24345f = executor;
        this.f24346g = taskExecutor;
        this.f24347h = workerFactory;
        this.f24348i = progressUpdater;
        this.f24349j = foregroundUpdater;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Executor getBackgroundExecutor() {
        return this.f24345f;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ForegroundUpdater getForegroundUpdater() {
        return this.f24349j;
    }

    @NonNull
    public UUID getId() {
        return this.f24340a;
    }

    @NonNull
    public Data getInputData() {
        return this.f24341b;
    }

    @Nullable
    @RequiresApi(28)
    public Network getNetwork() {
        return this.f24343d.network;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ProgressUpdater getProgressUpdater() {
        return this.f24348i;
    }

    @IntRange(from = 0)
    public int getRunAttemptCount() {
        return this.f24344e;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public RuntimeExtras getRuntimeExtras() {
        return this.f24343d;
    }

    @NonNull
    public Set<String> getTags() {
        return this.f24342c;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public TaskExecutor getTaskExecutor() {
        return this.f24346g;
    }

    @NonNull
    @RequiresApi(24)
    public List<String> getTriggeredContentAuthorities() {
        return this.f24343d.triggeredContentAuthorities;
    }

    @NonNull
    @RequiresApi(24)
    public List<Uri> getTriggeredContentUris() {
        return this.f24343d.triggeredContentUris;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkerFactory getWorkerFactory() {
        return this.f24347h;
    }
}
