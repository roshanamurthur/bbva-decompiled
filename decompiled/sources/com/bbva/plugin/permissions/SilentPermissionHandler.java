package com.bbva.plugin.permissions;

import android.app.Activity;
import android.content.SharedPreferences;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.bbva.androidtoolkit.plugin.permission.PermissionManager;
import com.bbva.androidtoolkit.plugin.permission.PermissionReport;
import com.bbva.androidtoolkit.plugin.permission.PermissionResultListener;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Permissions.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/plugin/permissions/SilentPermissionHandler;", "Lcom/bbva/plugin/permissions/PermissionHandler;", "()V", "checkState", "Lcom/bbva/plugin/permissions/PermissionState;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "permission", "", "request", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/bbva/androidtoolkit/plugin/permission/PermissionResultListener;", "Companion", "permissions-plugin_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SilentPermissionHandler implements PermissionHandler {

    @NotNull
    public static final String PREFERENCES_ID = "permission.plugin.id";

    @Override // com.bbva.plugin.permissions.PermissionHandler
    @NotNull
    public PermissionState checkState(@NotNull Activity activity, @NotNull String permission) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permission, "permission");
        String[] strArr = PermissionsKt.getPermissions().get(permission);
        if (strArr == null) {
            return PermissionState.UNKNOWN;
        }
        boolean z10 = false;
        for (String str : strArr) {
            if (ContextCompat.checkSelfPermission(activity, str) != 0) {
                for (String str2 : strArr) {
                    if (!ActivityCompat.shouldShowRequestPermissionRationale(activity, str2)) {
                        SharedPreferences sharedPreferences = activity.getSharedPreferences(PREFERENCES_ID, 0);
                        for (String str3 : strArr) {
                            if (sharedPreferences.getBoolean(str3, false)) {
                                z10 = true;
                                break;
                            }
                        }
                        Boolean boolValueOf = Boolean.valueOf(z10);
                        if (!boolValueOf.booleanValue()) {
                            boolValueOf = null;
                        }
                        if (boolValueOf == null) {
                            break;
                        }
                        boolValueOf.booleanValue();
                        return PermissionState.PERMANENTLY_DENIED;
                    }
                }
                return PermissionState.DENIED;
            }
        }
        return PermissionState.GRANTED;
    }

    @Override // com.bbva.plugin.permissions.PermissionHandler
    public void request(@NotNull Activity activity, @NotNull String permission, @NotNull PermissionResultListener listener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String[] strArr = PermissionsKt.getPermissions().get(permission);
        if (strArr == null) {
            listener.onRequestPermissionFinish(new PermissionReport(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList()));
            return;
        }
        SharedPreferences.Editor editorEdit = activity.getSharedPreferences(PREFERENCES_ID, 0).edit();
        for (String str : strArr) {
            editorEdit.putBoolean(str, true);
        }
        editorEdit.apply();
        PermissionManager.request(activity, strArr, listener);
    }
}
