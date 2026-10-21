package mx.openpay.library.ui.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0004\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\u000b"}, d2 = {"changeStatusBarColor", "", "Landroid/view/Window;", "context", "Landroid/content/Context;", "colorRes", "", "hideNavigationBar", "isDarkMode", "", "setSystemBarAppearance", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class UIExtensionKt {
    public static final void changeStatusBarColor(@NotNull Window window, @NotNull Context context, @ColorRes int i10) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        window.setStatusBarColor(ContextCompat.getColor(context, i10));
    }

    public static final void hideNavigationBar(@NotNull Window window) {
        WindowInsetsController insetsController;
        Intrinsics.checkNotNullParameter(window, "<this>");
        if (Build.VERSION.SDK_INT < 30 || (insetsController = window.getInsetsController()) == null) {
            return;
        }
        insetsController.hide(WindowInsets.Type.navigationBars());
    }

    public static final boolean isDarkMode(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public static final void setSystemBarAppearance(@NotNull Window window, boolean z10) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsController insetsController = window.getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsAppearance(z10 ? 0 : 8, 8);
                return;
            }
            return;
        }
        WindowInsetsControllerCompat insetsController2 = WindowCompat.getInsetsController(window, window.getDecorView());
        boolean z11 = !z10;
        insetsController2.setAppearanceLightStatusBars(z11);
        insetsController2.setAppearanceLightNavigationBars(z11);
    }
}
