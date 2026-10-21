package com.bbva.cells.pluginkit.permission;

import android.app.Activity;
import android.content.Intent;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PermissionManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\nJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\b¨\u0006\u0011"}, d2 = {"Lcom/bbva/cells/pluginkit/permission/PermissionManager;", "", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "", "", "permissions", "Lkotlin/Function1;", "Lcom/bbva/cells/pluginkit/permission/PermissionReport;", "", "Lcom/bbva/cells/pluginkit/permission/PermissionResultCallback;", "callback", "request", "report", "onActivityResult", "<init>", "()V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public final class PermissionManager {

    @NotNull
    public static final PermissionManager INSTANCE = new PermissionManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Function1<? super PermissionReport, Unit> f26833a;

    public final void onActivityResult(@NotNull PermissionReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        Function1<? super PermissionReport, Unit> function1 = f26833a;
        if (function1 != null) {
            f26833a = null;
            if (function1 != null) {
                function1.invoke(report);
            }
        }
    }

    public final void request(@NotNull Activity activity, @NotNull List<String> permissions, @NotNull Function1<? super PermissionReport, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(callback, "callback");
        f26833a = callback;
        ArrayList arrayList = new ArrayList();
        for (Object obj : permissions) {
            if (PermissionManagerKt.access$isNotGranted(activity, (String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            onActivityResult(new PermissionReport(PermissionManagerKt.toPermissions(permissions, activity, true), CollectionsKt__CollectionsKt.emptyList()));
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) PermissionActivity.class);
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        intent.putExtra("permissions", (String[]) array);
        activity.startActivity(intent);
    }
}
