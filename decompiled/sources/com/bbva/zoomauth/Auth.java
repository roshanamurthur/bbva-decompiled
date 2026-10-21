package com.bbva.zoomauth;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.zoomauth.data.ZoomParams;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Auth.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/bbva/zoomauth/Auth;", "", "raiseZoomActivity", "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "params", "Lcom/bbva/zoomauth/data/ZoomParams;", "isUpdate", "", "zoomauth_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface Auth {
    void raiseZoomActivity(@NotNull Activity activity, @NotNull ActivityResultLauncher<Intent> activityResultLauncher, @Nullable ZoomParams params, boolean isUpdate);
}
