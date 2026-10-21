package com.bbva.ui.navigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ui.utils.Animation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Navigator.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fJ<\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fJH\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¨\u0006\u0012"}, d2 = {"Lcom/bbva/ui/navigation/Navigator;", "", "()V", "navigateLateralTo", "", "source", "Landroid/app/Activity;", "target", "Ljava/lang/Class;", "bundle", "Landroid/os/Bundle;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "navigateModalTo", "navigateTo", "animationType", "Lcom/bbva/ui/utils/Animation$AnimationType;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Navigator.kt\ncom/bbva/ui/navigation/Navigator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
public final class Navigator {
    public static final int $stable = 0;

    @NotNull
    public static final Navigator INSTANCE = new Navigator();

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigateLateralTo$default(Navigator navigator, Activity activity, Class cls, Bundle bundle, ActivityResultLauncher activityResultLauncher, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bundle = null;
        }
        if ((i10 & 8) != 0) {
            activityResultLauncher = null;
        }
        navigator.navigateLateralTo(activity, cls, bundle, activityResultLauncher);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigateModalTo$default(Navigator navigator, Activity activity, Class cls, Bundle bundle, ActivityResultLauncher activityResultLauncher, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bundle = null;
        }
        if ((i10 & 8) != 0) {
            activityResultLauncher = null;
        }
        navigator.navigateModalTo(activity, cls, bundle, activityResultLauncher);
    }

    public final void navigateLateralTo(@NotNull Activity source, @NotNull Class<? extends Activity> target, @Nullable Bundle bundle, @Nullable ActivityResultLauncher<Intent> launcher) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        navigateTo(source, target, bundle, launcher, Animation.AnimationType.LATERAL);
    }

    public final void navigateModalTo(@NotNull Activity source, @NotNull Class<? extends Activity> target, @Nullable Bundle bundle, @Nullable ActivityResultLauncher<Intent> launcher) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        navigateTo(source, target, bundle, launcher, Animation.AnimationType.MODAL);
    }

    public final void navigateTo(@NotNull Activity source, @NotNull Class<? extends Activity> target, @Nullable Bundle bundle, @Nullable ActivityResultLauncher<Intent> launcher, @Nullable Animation.AnimationType animationType) {
        Unit unit;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        Intent intent = new Intent(source, target);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (animationType != null) {
            intent.putExtra(Animation.AnimationType.class.getName(), animationType.ordinal());
        }
        if (launcher != null) {
            launcher.launch(intent);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            source.startActivity(intent);
        }
    }
}
