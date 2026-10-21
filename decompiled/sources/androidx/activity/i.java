package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class i implements n {
    @Override // androidx.activity.n
    @DoNotInline
    public void a(@NotNull SystemBarStyle statusBarStyle, @NotNull SystemBarStyle navigationBarStyle, @NotNull Window window, @NotNull View view, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.setStatusBarColor(statusBarStyle.getScrim$activity_release(z10));
        window.setNavigationBarColor(navigationBarStyle.getDarkScrim());
        new WindowInsetsControllerCompat(window, view).setAppearanceLightStatusBars(!z10);
    }
}
