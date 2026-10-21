package com.google.android.material.color;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes10.dex */
public class ColorContrast {
    public static int a(Context context, ColorContrastOptions colorContrastOptions) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (isContrastAvailable() && uiModeManager != null) {
            float contrast = uiModeManager.getContrast();
            int mediumContrastThemeOverlay = colorContrastOptions.getMediumContrastThemeOverlay();
            int highContrastThemeOverlay = colorContrastOptions.getHighContrastThemeOverlay();
            if (contrast >= 0.6666667f) {
                return highContrastThemeOverlay == 0 ? mediumContrastThemeOverlay : highContrastThemeOverlay;
            }
            if (contrast >= 0.33333334f) {
                return mediumContrastThemeOverlay == 0 ? highContrastThemeOverlay : mediumContrastThemeOverlay;
            }
        }
        return 0;
    }

    public static void applyToActivitiesIfAvailable(@NonNull Application application, @NonNull ColorContrastOptions colorContrastOptions) {
        if (isContrastAvailable()) {
            application.registerActivityLifecycleCallbacks(new a(colorContrastOptions));
        }
    }

    public static void applyToActivityIfAvailable(@NonNull Activity activity, @NonNull ColorContrastOptions colorContrastOptions) {
        int iA;
        if (isContrastAvailable() && (iA = a(activity, colorContrastOptions)) != 0) {
            ThemeUtils.applyThemeOverlay(activity, iA);
        }
    }

    @ChecksSdkIntAtLeast(api = 34)
    public static boolean isContrastAvailable() {
        return Build.VERSION.SDK_INT >= 34;
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context, @NonNull ColorContrastOptions colorContrastOptions) {
        int iA;
        return (isContrastAvailable() && (iA = a(context, colorContrastOptions)) != 0) ? new ContextThemeWrapper(context, iA) : context;
    }

    @RequiresApi(34)
    public static class a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final LinkedHashSet f44309p0 = new LinkedHashSet();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ColorContrastOptions f44310q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @Nullable
        public C0198a f44311r0;

        /* JADX INFO: renamed from: com.google.android.material.color.ColorContrast$a$a, reason: collision with other inner class name */
        public class C0198a implements UiModeManager.ContrastChangeListener {
            public C0198a() {
            }

            @Override // android.app.UiModeManager.ContrastChangeListener
            public final void onContrastChanged(float f6) {
                Iterator it = a.this.f44309p0.iterator();
                while (it.hasNext()) {
                    ((Activity) it.next()).recreate();
                }
            }
        }

        public a(ColorContrastOptions colorContrastOptions) {
            this.f44310q0 = colorContrastOptions;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@NonNull Activity activity) {
            LinkedHashSet linkedHashSet = this.f44309p0;
            linkedHashSet.remove(activity);
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager == null || this.f44311r0 == null || !linkedHashSet.isEmpty()) {
                return;
            }
            uiModeManager.removeContrastChangeListener(this.f44311r0);
            this.f44311r0 = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPreCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            LinkedHashSet linkedHashSet = this.f44309p0;
            if (uiModeManager != null && linkedHashSet.isEmpty() && this.f44311r0 == null) {
                this.f44311r0 = new C0198a();
                uiModeManager.addContrastChangeListener(ContextCompat.getMainExecutor(activity.getApplicationContext()), this.f44311r0);
            }
            linkedHashSet.add(activity);
            if (uiModeManager != null) {
                ColorContrast.applyToActivityIfAvailable(activity, this.f44310q0);
            }
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
