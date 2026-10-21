package androidx.core.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bbva.androidtoolkit.utils.PluginUtils;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewConfigurationCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f20254a;

    @RequiresApi(26)
    public static class a {
        @DoNotInline
        public static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        @DoNotInline
        public static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    @RequiresApi(28)
    public static class b {
        @DoNotInline
        public static int a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        @DoNotInline
        public static boolean b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    @RequiresApi(34)
    public static class c {
        @DoNotInline
        public static int a(@NonNull ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i10, i11, i12);
        }

        @DoNotInline
        public static int b(@NonNull ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i10, i11, i12);
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f20254a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    public static float a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f20254a) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    public static float getScaledHorizontalScrollFactor(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        return Build.VERSION.SDK_INT >= 26 ? a.a(viewConfiguration) : a(viewConfiguration, context);
    }

    public static int getScaledHoverSlop(@NonNull ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? b.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static int getScaledMaximumFlingVelocity(@NonNull Context context, @NonNull ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(viewConfiguration, i10, i11, i12);
        }
        InputDevice device = InputDevice.getDevice(i10);
        int identifier = 0;
        if (!((device == null || device.getMotionRange(i11, i12) == null) ? false : true)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        if (i12 == 4194304 && i11 == 26) {
            identifier = resources.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", PluginUtils.IDENTIFIER_DIMENSION, "android");
        }
        if (identifier == 0) {
            return viewConfiguration.getScaledMaximumFlingVelocity();
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        if (dimensionPixelSize < 0) {
            return Integer.MIN_VALUE;
        }
        return dimensionPixelSize;
    }

    public static int getScaledMinimumFlingVelocity(@NonNull Context context, @NonNull ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.b(viewConfiguration, i10, i11, i12);
        }
        InputDevice device = InputDevice.getDevice(i10);
        int identifier = 0;
        if (!((device == null || device.getMotionRange(i11, i12) == null) ? false : true)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        if (i12 == 4194304 && i11 == 26) {
            identifier = resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", PluginUtils.IDENTIFIER_DIMENSION, "android");
        }
        if (identifier == 0) {
            return viewConfiguration.getScaledMinimumFlingVelocity();
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        if (dimensionPixelSize < 0) {
            return Integer.MAX_VALUE;
        }
        return dimensionPixelSize;
    }

    @Deprecated
    public static int getScaledPagingTouchSlop(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    public static float getScaledVerticalScrollFactor(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        return Build.VERSION.SDK_INT >= 26 ? a.b(viewConfiguration) : a(viewConfiguration, context);
    }

    @Deprecated
    public static boolean hasPermanentMenuKey(ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }

    public static boolean shouldShowMenuShortcutsWhenKeyboardPresent(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
