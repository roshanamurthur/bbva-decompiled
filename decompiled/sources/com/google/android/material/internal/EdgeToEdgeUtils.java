package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import com.google.android.material.color.MaterialColors;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class EdgeToEdgeUtils {
    public static void applyEdgeToEdge(@NonNull Window window, boolean z10) {
        applyEdgeToEdge(window, z10, null, null);
    }

    public static void setLightNavigationBar(@NonNull Window window, boolean z10) {
        WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightNavigationBars(z10);
    }

    public static void setLightStatusBar(@NonNull Window window, boolean z10) {
        WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightStatusBars(z10);
    }

    public static void applyEdgeToEdge(@NonNull Window window, boolean z10, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2) {
        int color;
        int i10 = Build.VERSION.SDK_INT;
        boolean z11 = false;
        boolean z12 = num == null || num.intValue() == 0;
        boolean z13 = num2 == null || num2.intValue() == 0;
        if (z12 || z13) {
            int color2 = MaterialColors.getColor(window.getContext(), R.attr.colorBackground, ViewCompat.MEASURED_STATE_MASK);
            if (z12) {
                num = Integer.valueOf(color2);
            }
            if (z13) {
                num2 = Integer.valueOf(color2);
            }
        }
        WindowCompat.setDecorFitsSystemWindows(window, !z10);
        int color3 = z10 ? 0 : MaterialColors.getColor(window.getContext(), R.attr.statusBarColor, ViewCompat.MEASURED_STATE_MASK);
        Context context = window.getContext();
        if (!z10 || i10 >= 27) {
            color = z10 ? 0 : MaterialColors.getColor(context, R.attr.navigationBarColor, ViewCompat.MEASURED_STATE_MASK);
        } else {
            color = ColorUtils.setAlphaComponent(MaterialColors.getColor(context, R.attr.navigationBarColor, ViewCompat.MEASURED_STATE_MASK), 128);
        }
        window.setStatusBarColor(color3);
        window.setNavigationBarColor(color);
        setLightStatusBar(window, MaterialColors.isColorLight(color3) || (color3 == 0 && MaterialColors.isColorLight(num.intValue())));
        boolean zIsColorLight = MaterialColors.isColorLight(num2.intValue());
        if (MaterialColors.isColorLight(color) || (color == 0 && zIsColorLight)) {
            z11 = true;
        }
        setLightNavigationBar(window, z11);
    }
}
