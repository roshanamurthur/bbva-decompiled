package com.bbva.ui.extensions;

import android.app.Activity;
import android.content.Intent;
import com.bbva.ui.utils.Animation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Activity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\u001e\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\b"}, d2 = {"overrideFinishTransition", "", "Landroid/app/Activity;", "intent", "Landroid/content/Intent;", "defaultAnimationType", "Lcom/bbva/ui/utils/Animation$AnimationType;", "overrideInitTransition", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ActivityKt {
    public static final void overrideFinishTransition(@NotNull Activity activity, @NotNull Intent intent, @Nullable Animation.AnimationType animationType) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Animation.AnimationType animationType2 = Animation.INSTANCE.getAnimationType(intent);
        if (animationType2 != null) {
            animationType = animationType2;
        }
        if (animationType != null) {
            activity.overridePendingTransition(animationType.getFinishEnterAnim(), animationType.getFinishExitAnim());
        }
    }

    public static /* synthetic */ void overrideFinishTransition$default(Activity activity, Intent intent, Animation.AnimationType animationType, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationType = null;
        }
        overrideFinishTransition(activity, intent, animationType);
    }

    public static final void overrideInitTransition(@NotNull Activity activity, @NotNull Intent intent, @Nullable Animation.AnimationType animationType) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Animation.AnimationType animationType2 = Animation.INSTANCE.getAnimationType(intent);
        if (animationType2 != null) {
            animationType = animationType2;
        }
        if (animationType != null) {
            activity.overridePendingTransition(animationType.getEnterAnim(), animationType.getExitAnim());
        }
    }

    public static /* synthetic */ void overrideInitTransition$default(Activity activity, Intent intent, Animation.AnimationType animationType, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationType = null;
        }
        overrideInitTransition(activity, intent, animationType);
    }
}
