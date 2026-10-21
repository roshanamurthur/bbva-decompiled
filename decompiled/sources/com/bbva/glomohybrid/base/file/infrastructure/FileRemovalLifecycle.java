package com.bbva.glomohybrid.base.file.infrastructure;

import android.app.Activity;
import android.app.Application;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.file.constants.FileConstants;
import com.bbva.glomohybrid.base.workers.WorkerHelper;
import com.bbva.glomoutils.lifecycle.ActivityLifecycleCallbacksAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileRemovalLifecycle.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/base/file/infrastructure/FileRemovalLifecycle;", "Lcom/bbva/glomoutils/lifecycle/ActivityLifecycleCallbacksAdapter;", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "", "onActivityStarted", "", "targetScreen", "<init>", "(Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class FileRemovalLifecycle extends ActivityLifecycleCallbacksAdapter {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final String f31347p0;

    public FileRemovalLifecycle(@NotNull String targetScreen) {
        Intrinsics.checkNotNullParameter(targetScreen, "targetScreen");
        this.f31347p0 = targetScreen;
    }

    @Override // com.bbva.glomoutils.lifecycle.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) throws Throwable {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.onActivityStarted(activity);
        if (Intrinsics.areEqual(activity.getClass().getSimpleName(), this.f31347p0)) {
            WorkerHelper workerHelper = WorkerHelper.INSTANCE;
            Application application = activity.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            workerHelper.setRemovalWorker(application, FileConstants.FILE_PROVIDER_SHARED_FOLDER_NAME, 1L);
        }
    }
}
