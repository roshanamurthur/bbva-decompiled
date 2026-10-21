package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowCompat {
    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;

    @RequiresApi(16)
    public static class a {
        @DoNotInline
        public static void a(@NonNull Window window, boolean z10) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    @RequiresApi(28)
    public static class b {
        @DoNotInline
        public static <T> T a(Window window, int i10) {
            return (T) window.requireViewById(i10);
        }
    }

    @RequiresApi(30)
    public static class c {
        @DoNotInline
        public static void a(@NonNull Window window, boolean z10) {
            window.setDecorFitsSystemWindows(z10);
        }
    }

    @NonNull
    public static WindowInsetsControllerCompat getInsetsController(@NonNull Window window, @NonNull View view) {
        return new WindowInsetsControllerCompat(window, view);
    }

    @NonNull
    public static <T extends View> T requireViewById(@NonNull Window window, @IdRes int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) b.a(window, i10);
        }
        T t10 = (T) window.findViewById(i10);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void setDecorFitsSystemWindows(@NonNull Window window, boolean z10) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(window, z10);
        } else {
            a.a(window, z10);
        }
    }
}
