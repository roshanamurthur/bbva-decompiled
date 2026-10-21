package com.bbva.glomohybrid.base.workers;

import android.content.Context;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WorkerHelper.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/base/workers/WorkerHelper;", "", "()V", "setRemovalWorker", "", "context", "Landroid/content/Context;", "folderName", "", "delayInSeconds", "", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWorkerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkerHelper.kt\ncom/bbva/glomohybrid/base/workers/WorkerHelper\n+ 2 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequestKt\n*L\n1#1,25:1\n29#2:26\n*S KotlinDebug\n*F\n+ 1 WorkerHelper.kt\ncom/bbva/glomohybrid/base/workers/WorkerHelper\n*L\n17#1:26\n*E\n"})
public final class WorkerHelper {

    @NotNull
    public static final WorkerHelper INSTANCE = new WorkerHelper();

    public final void setRemovalWorker(@NotNull Context context, @NotNull String folderName, long delayInSeconds) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        Data dataBuild = new Data.Builder().putString(FileRemovalWorker.KEY_FOLDER_NAME, folderName).build();
        Intrinsics.checkNotNullExpressionValue(dataBuild, "build(...)");
        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(FileRemovalWorker.class).setInputData(dataBuild).setInitialDelay(delayInSeconds, TimeUnit.SECONDS).build();
        Intrinsics.checkNotNullExpressionValue(oneTimeWorkRequestBuild, "build(...)");
        WorkManager.getInstance(context).enqueue(oneTimeWorkRequestBuild);
    }
}
