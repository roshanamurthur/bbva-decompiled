package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ViewUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f1585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f1586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ChecksSdkIntAtLeast(api = 27)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final boolean f1587c;

    @RequiresApi(29)
    public static class a {
        @DoNotInline
        public static void a(@NonNull View view, @NonNull Rect rect, @NonNull Rect rect2) {
            Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
            rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
        }
    }

    static {
        f1587c = Build.VERSION.SDK_INT >= 27;
    }

    public static void computeFitSystemWindows(@NonNull View view, @NonNull Rect rect, @NonNull Rect rect2) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(view, rect, rect2);
            return;
        }
        if (!f1585a) {
            f1585a = true;
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f1586b = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f1586b.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
            }
        }
        Method method = f1586b;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused2) {
            }
        }
    }

    public static boolean isLayoutRtl(View view) {
        return view.getLayoutDirection() == 1;
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static void makeOptionalFitsSystemWindows(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
