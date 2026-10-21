package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WindowMetricsCalculatorCompat.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculatorCompat;", "Landroidx/window/layout/WindowMetricsCalculator;", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroidx/window/layout/WindowMetrics;", "computeCurrentWindowMetrics", "computeMaximumWindowMetrics", "Landroid/graphics/Rect;", "computeWindowBoundsQ$window_release", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "computeWindowBoundsQ", "computeWindowBoundsP$window_release", "computeWindowBoundsP", "computeWindowBoundsN$window_release", "computeWindowBoundsN", "computeWindowBoundsIceCreamSandwich$window_release", "computeWindowBoundsIceCreamSandwich", "Landroid/view/Display;", "display", "Landroid/graphics/Point;", "getRealSizeForDisplay$window_release", "(Landroid/view/Display;)Landroid/graphics/Point;", "getRealSizeForDisplay", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class WindowMetricsCalculatorCompat implements WindowMetricsCalculator {

    @NotNull
    public static final WindowMetricsCalculatorCompat INSTANCE = new WindowMetricsCalculatorCompat();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f24230a;

    static {
        Intrinsics.checkNotNullExpressionValue("WindowMetricsCalculatorCompat", "WindowMetricsCalculatorC…at::class.java.simpleName");
        f24230a = "WindowMetricsCalculatorCompat";
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    @NotNull
    public WindowMetrics computeCurrentWindowMetrics(@NotNull Activity activity) {
        Rect rectComputeWindowBoundsN$window_release;
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            rectComputeWindowBoundsN$window_release = ActivityCompatHelperApi30.INSTANCE.currentWindowBounds(activity);
        } else if (i10 >= 29) {
            rectComputeWindowBoundsN$window_release = computeWindowBoundsQ$window_release(activity);
        } else if (i10 >= 28) {
            rectComputeWindowBoundsN$window_release = computeWindowBoundsP$window_release(activity);
        } else {
            rectComputeWindowBoundsN$window_release = i10 >= 24 ? computeWindowBoundsN$window_release(activity) : computeWindowBoundsIceCreamSandwich$window_release(activity);
        }
        return new WindowMetrics(rectComputeWindowBoundsN$window_release);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    @NotNull
    public WindowMetrics computeMaximumWindowMetrics(@NotNull Activity activity) {
        Rect rect;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT >= 30) {
            rect = ActivityCompatHelperApi30.INSTANCE.maximumWindowBounds(activity);
        } else {
            Display display = activity.getWindowManager().getDefaultDisplay();
            Intrinsics.checkNotNullExpressionValue(display, "display");
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(display);
            rect = new Rect(0, 0, realSizeForDisplay$window_release.x, realSizeForDisplay$window_release.y);
        }
        return new WindowMetrics(rect);
    }

    @RequiresApi(14)
    @NotNull
    public final Rect computeWindowBoundsIceCreamSandwich$window_release(@NotNull Activity activity) {
        int i10;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Intrinsics.checkNotNullExpressionValue(defaultDisplay, "defaultDisplay");
        Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
        Rect rect = new Rect();
        int i11 = realSizeForDisplay$window_release.x;
        if (i11 == 0 || (i10 = realSizeForDisplay$window_release.y) == 0) {
            defaultDisplay.getRectSize(rect);
        } else {
            rect.right = i11;
            rect.bottom = i10;
        }
        return rect;
    }

    @RequiresApi(24)
    @NotNull
    public final Rect computeWindowBoundsN$window_release(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
            Intrinsics.checkNotNullExpressionValue(defaultDisplay, "defaultDisplay");
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", PluginUtils.IDENTIFIER_DIMENSION, "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i10 = rect.bottom + dimensionPixelSize;
            if (i10 == realSizeForDisplay$window_release.y) {
                rect.bottom = i10;
            } else {
                int i11 = rect.right + dimensionPixelSize;
                if (i11 == realSizeForDisplay$window_release.x) {
                    rect.right = i11;
                }
            }
        }
        return rect;
    }

    @RequiresApi(28)
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @NotNull
    public final Rect computeWindowBoundsP$window_release(@NotNull Activity activity) {
        DisplayCutout displayCutoutB;
        String str = f24230a;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e5) {
            Log.w(str, e5);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException e7) {
            Log.w(str, e7);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e10) {
            Log.w(str, e10);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e11) {
            Log.w(str, e11);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        DisplayCompatHelperApi17 displayCompatHelperApi17 = DisplayCompatHelperApi17.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(currentDisplay, "currentDisplay");
        displayCompatHelperApi17.getRealSize(currentDisplay, point);
        ActivityCompatHelperApi24 activityCompatHelperApi24 = ActivityCompatHelperApi24.INSTANCE;
        if (!activityCompatHelperApi24.isInMultiWindowMode(activity)) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", PluginUtils.IDENTIFIER_DIMENSION, "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i10 = rect.bottom + dimensionPixelSize;
            if (i10 == point.y) {
                rect.bottom = i10;
            } else {
                int i11 = rect.right + dimensionPixelSize;
                if (i11 == point.x) {
                    rect.right = i11;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activityCompatHelperApi24.isInMultiWindowMode(activity)) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(new Object[0]);
                Method declaredMethod = currentDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(currentDisplay, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(objNewInstance);
                displayCutoutB = androidx.core.view.accessibility.d.c(obj2) ? n.b(obj2) : null;
            } catch (ClassNotFoundException e12) {
                Log.w(str, e12);
            } catch (IllegalAccessException e13) {
                Log.w(str, e13);
            } catch (InstantiationException e14) {
                Log.w(str, e14);
            } catch (NoSuchFieldException e15) {
                Log.w(str, e15);
            } catch (NoSuchMethodException e16) {
                Log.w(str, e16);
            } catch (InvocationTargetException e17) {
                Log.w(str, e17);
            }
            if (displayCutoutB != null) {
                int i12 = rect.left;
                DisplayCompatHelperApi28 displayCompatHelperApi28 = DisplayCompatHelperApi28.INSTANCE;
                if (i12 == displayCompatHelperApi28.safeInsetLeft(displayCutoutB)) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCompatHelperApi28.safeInsetRight(displayCutoutB)) {
                    rect.right = displayCompatHelperApi28.safeInsetRight(displayCutoutB) + rect.right;
                }
                if (rect.top == displayCompatHelperApi28.safeInsetTop(displayCutoutB)) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCompatHelperApi28.safeInsetBottom(displayCutoutB)) {
                    rect.bottom = displayCompatHelperApi28.safeInsetBottom(displayCutoutB) + rect.bottom;
                }
            }
        }
        return rect;
    }

    @RequiresApi(29)
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @NotNull
    public final Rect computeWindowBoundsQ$window_release(@NotNull Activity activity) {
        String str = f24230a;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            if (objInvoke != null) {
                return new Rect((Rect) objInvoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException e5) {
            Log.w(str, e5);
            return computeWindowBoundsP$window_release(activity);
        } catch (NoSuchFieldException e7) {
            Log.w(str, e7);
            return computeWindowBoundsP$window_release(activity);
        } catch (NoSuchMethodException e10) {
            Log.w(str, e10);
            return computeWindowBoundsP$window_release(activity);
        } catch (InvocationTargetException e11) {
            Log.w(str, e11);
            return computeWindowBoundsP$window_release(activity);
        }
    }

    @RequiresApi(14)
    @VisibleForTesting
    @NotNull
    public final Point getRealSizeForDisplay$window_release(@NotNull Display display) {
        Intrinsics.checkNotNullParameter(display, "display");
        Point point = new Point();
        DisplayCompatHelperApi17.INSTANCE.getRealSize(display, point);
        return point;
    }
}
