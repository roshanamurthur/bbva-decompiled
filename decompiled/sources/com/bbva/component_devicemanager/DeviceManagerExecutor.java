package com.bbva.component_devicemanager;

import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.bbva.component_devicemanager.data.service.DeviceManagerService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeviceManagerExecutor.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/bbva/component_devicemanager/DeviceManagerExecutor;", "", "", "execute", "Landroidx/work/WorkManager;", "workManager", "<init>", "(Landroidx/work/WorkManager;)V", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDeviceManagerExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceManagerExecutor.kt\ncom/bbva/component_devicemanager/DeviceManagerExecutor\n+ 2 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequestKt\n*L\n1#1,15:1\n29#2:16\n*S KotlinDebug\n*F\n+ 1 DeviceManagerExecutor.kt\ncom/bbva/component_devicemanager/DeviceManagerExecutor\n*L\n10#1:16\n*E\n"})
public final class DeviceManagerExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WorkManager f28860a;

    public DeviceManagerExecutor(@NotNull WorkManager workManager) {
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        this.f28860a = workManager;
    }

    public final void execute() {
        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(DeviceManagerService.class).build();
        Intrinsics.checkNotNullExpressionValue(oneTimeWorkRequestBuild, "build(...)");
        this.f28860a.enqueue(oneTimeWorkRequestBuild);
    }
}
