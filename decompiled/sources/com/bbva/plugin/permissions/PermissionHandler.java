package com.bbva.plugin.permissions;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.permission.PermissionResultListener;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Permissions.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/bbva/plugin/permissions/PermissionHandler;", "", "checkState", "Lcom/bbva/plugin/permissions/PermissionState;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "permission", "", "request", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/bbva/androidtoolkit/plugin/permission/PermissionResultListener;", "permissions-plugin_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface PermissionHandler {
    @NotNull
    PermissionState checkState(@NotNull Activity activity, @NotNull String permission);

    void request(@NotNull Activity activity, @NotNull String permission, @NotNull PermissionResultListener listener);
}
