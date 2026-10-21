package com.bbva.signaturepad;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.signaturepad.ui.SignaturePadActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SignaturePad.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Lcom/bbva/signaturepad/SignaturePad;", "", "()V", "raiseSignaturePadActivity", "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "signaturepad_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SignaturePad {
    public final void raiseSignaturePadActivity(@NotNull Activity activity, @NotNull ActivityResultLauncher<Intent> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
        activityResultLauncher.launch(new Intent(activity, (Class<?>) SignaturePadActivity.class));
    }
}
