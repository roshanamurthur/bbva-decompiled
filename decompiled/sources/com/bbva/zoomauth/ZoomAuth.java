package com.bbva.zoomauth;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.RequiresPermission;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.zoomauth.data.ZoomParams;
import com.bbva.zoomauth.facialauth.constant.RequestCodeConstants;
import com.bbva.zoomauth.ui.ZoomActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ZoomAuth.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017¨\u0006\u000f"}, d2 = {"Lcom/bbva/zoomauth/ZoomAuth;", "Lcom/bbva/zoomauth/Auth;", "()V", "raiseZoomActivity", "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "params", "Lcom/bbva/zoomauth/data/ZoomParams;", "isUpdate", "", "Companion", "zoomauth_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ZoomAuth implements Auth {

    @NotNull
    public static final String USER_NAME = "userName";

    @Override // com.bbva.zoomauth.Auth
    @RequiresPermission(allOf = {"android.permission.CAMERA"})
    public void raiseZoomActivity(@NotNull Activity activity, @NotNull ActivityResultLauncher<Intent> activityResultLauncher, @Nullable ZoomParams params, boolean isUpdate) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
        if (params == null && !isUpdate) {
            throw new IllegalArgumentException();
        }
        Intent intent = new Intent(activity, (Class<?>) ZoomActivity.class);
        int i10 = isUpdate ? RequestCodeConstants.REQUEST_ZOOM_UPDATE : RequestCodeConstants.REQUEST_ZOOM_AUTH;
        intent.putExtra("userName", params == null ? null : params.getUserName());
        intent.putExtra("requestCode", i10);
        activityResultLauncher.launch(intent);
    }
}
