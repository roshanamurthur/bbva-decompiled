package com.google.android.material.color;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.core.os.BuildCompat;
import com.google.android.material.R;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.SchemeContent;
import com.google.android.material.resources.MaterialAttributes;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class DynamicColors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f44321a = {R.attr.dynamicColorThemeOverlay};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, c> f44322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<String, c> f44323c;

    public interface OnAppliedCallback {
        void onApplied(@NonNull Activity activity);
    }

    public interface Precondition {
        boolean shouldApplyDynamicColors(@NonNull Activity activity, @StyleRes int i10);
    }

    public class a implements c {
        @Override // com.google.android.material.color.DynamicColors.c
        public final boolean isSupported() {
            return true;
        }
    }

    public class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f44324a;

        @Override // com.google.android.material.color.DynamicColors.c
        public final boolean isSupported() {
            if (this.f44324a == null) {
                try {
                    Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                    declaredMethod.setAccessible(true);
                    this.f44324a = Long.valueOf(((Long) declaredMethod.invoke(null, "ro.build.version.oneui")).longValue());
                } catch (Exception unused) {
                    this.f44324a = -1L;
                }
            }
            return this.f44324a.longValue() >= 40100;
        }
    }

    public interface c {
        boolean isSupported();
    }

    static {
        a aVar = new a();
        b bVar = new b();
        HashMap map = new HashMap();
        map.put("fcnt", aVar);
        map.put("google", aVar);
        map.put("hmd global", aVar);
        map.put("infinix", aVar);
        map.put("infinix mobility limited", aVar);
        map.put("itel", aVar);
        map.put("kyocera", aVar);
        map.put("lenovo", aVar);
        map.put("lge", aVar);
        map.put("meizu", aVar);
        map.put("motorola", aVar);
        map.put("nothing", aVar);
        map.put("oneplus", aVar);
        map.put("oppo", aVar);
        map.put("realme", aVar);
        map.put("robolectric", aVar);
        map.put("samsung", bVar);
        map.put("sharp", aVar);
        map.put("shift", aVar);
        map.put("sony", aVar);
        map.put("tcl", aVar);
        map.put("tecno", aVar);
        map.put("tecno mobile limited", aVar);
        map.put("vivo", aVar);
        map.put("wingtech", aVar);
        map.put("xiaomi", aVar);
        f44322b = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", aVar);
        map2.put("jio", aVar);
        f44323c = Collections.unmodifiableMap(map2);
    }

    @Deprecated
    public static void applyIfAvailable(@NonNull Activity activity) {
        applyToActivityIfAvailable(activity);
    }

    public static void applyToActivitiesIfAvailable(@NonNull Application application) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().build());
    }

    public static void applyToActivityIfAvailable(@NonNull Activity activity) {
        applyToActivityIfAvailable(activity, new DynamicColorsOptions.Builder().build());
    }

    @ChecksSdkIntAtLeast(api = 31)
    @SuppressLint({"DefaultLocale"})
    public static boolean isDynamicColorAvailable() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (BuildCompat.isAtLeastT()) {
            return true;
        }
        String str = Build.MANUFACTURER;
        Locale locale = Locale.ROOT;
        c cVar = f44322b.get(str.toLowerCase(locale));
        if (cVar == null) {
            cVar = f44323c.get(Build.BRAND.toLowerCase(locale));
        }
        return cVar != null && cVar.isSupported();
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context) {
        return wrapContextIfAvailable(context, 0);
    }

    @Deprecated
    public static void applyIfAvailable(@NonNull Activity activity, @StyleRes int i10) {
        applyToActivityIfAvailable(activity, new DynamicColorsOptions.Builder().setThemeOverlay(i10).build());
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(@NonNull Application application, @StyleRes int i10) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().setThemeOverlay(i10).build());
    }

    public static void applyToActivityIfAvailable(@NonNull Activity activity, @NonNull DynamicColorsOptions dynamicColorsOptions) {
        if (isDynamicColorAvailable()) {
            int themeOverlay = 0;
            if (dynamicColorsOptions.getContentBasedSeedColor() == null) {
                if (dynamicColorsOptions.getThemeOverlay() == 0) {
                    TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(f44321a);
                    themeOverlay = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                    typedArrayObtainStyledAttributes.recycle();
                } else {
                    themeOverlay = dynamicColorsOptions.getThemeOverlay();
                }
            }
            if (dynamicColorsOptions.getPrecondition().shouldApplyDynamicColors(activity, themeOverlay)) {
                if (dynamicColorsOptions.getContentBasedSeedColor() != null) {
                    Hct hctFromInt = Hct.fromInt(dynamicColorsOptions.getContentBasedSeedColor().intValue());
                    boolean z10 = !MaterialAttributes.resolveBoolean(activity, R.attr.isLightTheme, true);
                    UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
                    SchemeContent schemeContent = new SchemeContent(hctFromInt, z10, (uiModeManager == null || Build.VERSION.SDK_INT < 34) ? 0.0f : uiModeManager.getContrast());
                    ColorResourcesOverride colorResourcesOverrideA = he.b.a();
                    if (colorResourcesOverrideA == null || !colorResourcesOverrideA.applyIfPossible(activity, MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(schemeContent))) {
                        return;
                    }
                } else {
                    ThemeUtils.applyThemeOverlay(activity, themeOverlay);
                }
                dynamicColorsOptions.getOnAppliedCallback().onApplied(activity);
            }
        }
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context, @StyleRes int i10) {
        return wrapContextIfAvailable(context, new DynamicColorsOptions.Builder().setThemeOverlay(i10).build());
    }

    @Deprecated
    public static void applyIfAvailable(@NonNull Activity activity, @NonNull Precondition precondition) {
        applyToActivityIfAvailable(activity, new DynamicColorsOptions.Builder().setPrecondition(precondition).build());
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(@NonNull Application application, @NonNull Precondition precondition) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().setPrecondition(precondition).build());
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context, @NonNull DynamicColorsOptions dynamicColorsOptions) {
        if (!isDynamicColorAvailable()) {
            return context;
        }
        int themeOverlay = dynamicColorsOptions.getThemeOverlay();
        if (themeOverlay == 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f44321a);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            themeOverlay = resourceId;
        }
        if (themeOverlay == 0) {
            return context;
        }
        if (dynamicColorsOptions.getContentBasedSeedColor() != null) {
            Hct hctFromInt = Hct.fromInt(dynamicColorsOptions.getContentBasedSeedColor().intValue());
            boolean z10 = !MaterialAttributes.resolveBoolean(context, R.attr.isLightTheme, true);
            UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
            SchemeContent schemeContent = new SchemeContent(hctFromInt, z10, (uiModeManager == null || Build.VERSION.SDK_INT < 34) ? 0.0f : uiModeManager.getContrast());
            ColorResourcesOverride colorResourcesOverrideA = he.b.a();
            if (colorResourcesOverrideA != null) {
                return colorResourcesOverrideA.wrapContextIfPossible(context, MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(schemeContent));
            }
        }
        return new ContextThemeWrapper(context, themeOverlay);
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(@NonNull Application application, @StyleRes int i10, @NonNull Precondition precondition) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().setThemeOverlay(i10).setPrecondition(precondition).build());
    }

    public static void applyToActivitiesIfAvailable(@NonNull Application application, @NonNull DynamicColorsOptions dynamicColorsOptions) {
        application.registerActivityLifecycleCallbacks(new d(dynamicColorsOptions));
    }

    public static class d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final DynamicColorsOptions f44325p0;

        public d(@NonNull DynamicColorsOptions dynamicColorsOptions) {
            this.f44325p0 = dynamicColorsOptions;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPreCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            DynamicColors.applyToActivityIfAvailable(activity, this.f44325p0);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }
    }
}
