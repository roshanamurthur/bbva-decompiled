package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ContextThemeWrapper;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.google.android.material.R;
import he.f;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class HarmonizedColors {
    @RequiresApi(api = 30)
    public static HashMap a(Context context, HarmonizedColorsOptions harmonizedColorsOptions) {
        int type;
        HashMap map = new HashMap();
        int color = MaterialColors.getColor(context, harmonizedColorsOptions.getColorAttributeToHarmonizeWith(), "HarmonizedColors");
        for (int i10 : harmonizedColorsOptions.getColorResourceIds()) {
            map.put(Integer.valueOf(i10), Integer.valueOf(MaterialColors.harmonize(ContextCompat.getColor(context, i10), color)));
        }
        HarmonizedColorAttributes colorAttributes = harmonizedColorsOptions.getColorAttributes();
        if (colorAttributes != null) {
            int[] attributes = colorAttributes.getAttributes();
            if (attributes.length > 0) {
                int themeOverlay = colorAttributes.getThemeOverlay();
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributes);
                TypedArray typedArrayObtainStyledAttributes2 = themeOverlay != 0 ? new ContextThemeWrapper(context, themeOverlay).obtainStyledAttributes(attributes) : null;
                TypedArray typedArray = typedArrayObtainStyledAttributes2 != null ? typedArrayObtainStyledAttributes2 : typedArrayObtainStyledAttributes;
                for (int i11 = 0; i11 < typedArrayObtainStyledAttributes.getIndexCount(); i11++) {
                    int resourceId = typedArray.getResourceId(i11, 0);
                    if (resourceId != 0 && typedArrayObtainStyledAttributes.hasValue(i11) && 28 <= (type = typedArrayObtainStyledAttributes.getType(i11)) && type <= 31) {
                        map.put(Integer.valueOf(resourceId), Integer.valueOf(MaterialColors.harmonize(typedArrayObtainStyledAttributes.getColor(i11, 0), color)));
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
                if (typedArrayObtainStyledAttributes2 != null) {
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
        }
        return map;
    }

    @NonNull
    public static void applyToContextIfAvailable(@NonNull Context context, @NonNull HarmonizedColorsOptions harmonizedColorsOptions) {
        if (isHarmonizedColorAvailable()) {
            HashMap mapA = a(context, harmonizedColorsOptions);
            HarmonizedColorAttributes harmonizedColorAttributes = harmonizedColorsOptions.f44341b;
            int themeOverlay = (harmonizedColorAttributes == null || harmonizedColorAttributes.getThemeOverlay() == 0) ? 0 : harmonizedColorAttributes.getThemeOverlay();
            if (!f.a(context, mapA) || themeOverlay == 0) {
                return;
            }
            ThemeUtils.applyThemeOverlay(context, themeOverlay);
        }
    }

    @ChecksSdkIntAtLeast(api = 30)
    public static boolean isHarmonizedColorAvailable() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context, @NonNull HarmonizedColorsOptions harmonizedColorsOptions) {
        if (!isHarmonizedColorAvailable()) {
            return context;
        }
        HashMap mapA = a(context, harmonizedColorsOptions);
        int themeOverlay = R.style.ThemeOverlay_Material3_HarmonizedColors_Empty;
        HarmonizedColorAttributes harmonizedColorAttributes = harmonizedColorsOptions.f44341b;
        if (harmonizedColorAttributes != null && harmonizedColorAttributes.getThemeOverlay() != 0) {
            themeOverlay = harmonizedColorAttributes.getThemeOverlay();
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, themeOverlay);
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        return f.a(contextThemeWrapper, mapA) ? contextThemeWrapper : context;
    }
}
