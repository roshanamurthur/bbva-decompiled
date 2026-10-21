package com.bbva.sdkcatalog.openpay.plugin.permissions;

import android.app.Activity;
import android.os.Bundle;
import com.bbva.ethermobilesdk.devicechecker.magisk.permission.MagiskApp;
import com.bbva.sdkcatalog.openpay.plugin.BuildHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PermissionStorageActivity.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J-\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/permissions/PermissionStorageActivity;", "Landroid/app/Activity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "Companion", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PermissionStorageActivity extends Activity {
    public static final int STORAGE_PERMISSION_REQUEST_CODE = 1003;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRequestPermissionsResult$lambda$0(boolean z10) {
        PermissionCallback callback = PermissionManager.INSTANCE.getCallback();
        if (callback != null) {
            callback.onPermissionResult(z10);
        }
        return Unit.INSTANCE;
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PermissionManager.INSTANCE.requestPermissions(this, 1003, BuildHelper.INSTANCE.getVersionCode() >= 33 ? new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE", MagiskApp.WRITE_EXTERNAL_STORAGE});
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        PermissionManager.INSTANCE.handlePermissionsResult(this, requestCode, 1003, grantResults, new j7.a(1));
    }
}
