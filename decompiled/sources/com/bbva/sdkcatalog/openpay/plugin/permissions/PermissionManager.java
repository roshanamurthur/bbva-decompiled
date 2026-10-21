package com.bbva.sdkcatalog.openpay.plugin.permissions;

import android.app.Activity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PermissionManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\u0010\u0013JK\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172#\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/permissions/PermissionManager;", "", "<init>", "()V", "callback", "Lcom/bbva/sdkcatalog/openpay/plugin/permissions/PermissionCallback;", "getCallback", "()Lcom/bbva/sdkcatalog/openpay/plugin/permissions/PermissionCallback;", "setCallback", "(Lcom/bbva/sdkcatalog/openpay/plugin/permissions/PermissionCallback;)V", "requestPermissions", "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "requestCode", "", "permissions", "", "", "(Landroid/app/Activity;I[Ljava/lang/String;)V", "handlePermissionsResult", "responseCode", "grantResults", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "granted", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPermissionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionManager.kt\ncom/bbva/sdkcatalog/openpay/plugin/permissions/PermissionManager\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,60:1\n12371#2,2:61\n12413#2,2:63\n*S KotlinDebug\n*F\n+ 1 PermissionManager.kt\ncom/bbva/sdkcatalog/openpay/plugin/permissions/PermissionManager\n*L\n19#1:61,2\n50#1:63,2\n*E\n"})
public final class PermissionManager {

    @NotNull
    public static final PermissionManager INSTANCE = new PermissionManager();

    @Nullable
    private static PermissionCallback callback;

    private PermissionManager() {
    }

    @Nullable
    public final PermissionCallback getCallback() {
        return callback;
    }

    public final void handlePermissionsResult(@NotNull Activity activity, int requestCode, int responseCode, @NotNull int[] grantResults, @Nullable Function1<? super Boolean, Unit> callback2) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (requestCode == responseCode) {
            boolean z10 = false;
            if (!(grantResults.length == 0)) {
                int length = grantResults.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        z10 = true;
                        break;
                    } else if (grantResults[i10] != 0) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            if (callback2 != null) {
                callback2.invoke(Boolean.valueOf(z10));
            }
            activity.finish();
        }
    }

    public final void requestPermissions(@NotNull Activity activity, int requestCode, @NotNull String[] permissions) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        try {
            for (String str : permissions) {
                if (ContextCompat.checkSelfPermission(activity, str) != 0) {
                    ActivityCompat.requestPermissions(activity, permissions, requestCode);
                    return;
                }
            }
            PermissionCallback permissionCallback = callback;
            if (permissionCallback != null) {
                permissionCallback.onPermissionResult(true);
            }
            activity.finish();
        } catch (Exception unused) {
            PermissionCallback permissionCallback2 = callback;
            if (permissionCallback2 != null) {
                permissionCallback2.onPermissionResult(false);
            }
            activity.finish();
        }
    }

    public final void setCallback(@Nullable PermissionCallback permissionCallback) {
        callback = permissionCallback;
    }
}
