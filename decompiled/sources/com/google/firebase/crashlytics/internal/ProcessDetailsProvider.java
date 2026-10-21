package com.google.firebase.crashlytics.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ProcessDetailsProvider.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J.\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¨\u0006\u0012"}, d2 = {"Lcom/google/firebase/crashlytics/internal/ProcessDetailsProvider;", "", "Landroid/content/Context;", "context", "", "Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Event$Application$ProcessDetails;", "getAppProcessDetails", "getCurrentProcessDetails", "", "processName", "", "pid", "importance", "", "isDefaultProcess", "buildProcessDetails", "<init>", "()V", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 7, 1})
public final class ProcessDetailsProvider {

    @NotNull
    public static final ProcessDetailsProvider INSTANCE = new ProcessDetailsProvider();

    public static /* synthetic */ CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails$default(ProcessDetailsProvider processDetailsProvider, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        return processDetailsProvider.buildProcessDetails(str, i10, i11, z10);
    }

    @JvmOverloads
    @NotNull
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(@NotNull String processName) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return buildProcessDetails$default(this, processName, 0, 0, false, 14, null);
    }

    @NotNull
    public final List<CrashlyticsReport.Session.Event.Application.ProcessDetails> getAppProcessDetails(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID);
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = CollectionsKt__CollectionsKt.emptyList();
        }
        List listFilterNotNull = CollectionsKt___CollectionsKt.filterNotNull(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listFilterNotNull) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(CrashlyticsReport.Session.Event.Application.ProcessDetails.builder().setProcessName(runningAppProcessInfo.processName).setPid(runningAppProcessInfo.pid).setImportance(runningAppProcessInfo.importance).setDefaultProcess(Intrinsics.areEqual(runningAppProcessInfo.processName, str)).build());
        }
        return arrayList2;
    }

    @NotNull
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails getCurrentProcessDetails(@NotNull Context context) {
        Object next;
        String str;
        String processName;
        Intrinsics.checkNotNullParameter(context, "context");
        int iMyPid = Process.myPid();
        Iterator<T> it = getAppProcessDetails(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((CrashlyticsReport.Session.Event.Application.ProcessDetails) next).getPid() != iMyPid);
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) next;
        if (processDetails != null) {
            return processDetails;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            if (i10 < 28 || (processName = Application.getProcessName()) == null) {
                str = "";
            }
            return buildProcessDetails$default(this, str, iMyPid, 0, false, 12, null);
        }
        processName = Process.myProcessName();
        Intrinsics.checkNotNullExpressionValue(processName, "{\n      Process.myProcessName()\n    }");
        str = processName;
        return buildProcessDetails$default(this, str, iMyPid, 0, false, 12, null);
    }

    @JvmOverloads
    @NotNull
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(@NotNull String processName, int i10) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return buildProcessDetails$default(this, processName, i10, 0, false, 12, null);
    }

    @JvmOverloads
    @NotNull
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(@NotNull String processName, int i10, int i11) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return buildProcessDetails$default(this, processName, i10, i11, false, 8, null);
    }

    @JvmOverloads
    @NotNull
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(@NotNull String processName, int pid, int importance, boolean isDefaultProcess) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetailsBuild = CrashlyticsReport.Session.Event.Application.ProcessDetails.builder().setProcessName(processName).setPid(pid).setImportance(importance).setDefaultProcess(isDefaultProcess).build();
        Intrinsics.checkNotNullExpressionValue(processDetailsBuild, "builder()\n      .setProc…ltProcess)\n      .build()");
        return processDetailsBuild;
    }
}
