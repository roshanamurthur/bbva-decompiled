package com.google.android.material.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.ScatterMapKt;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R;
import com.google.android.material.color.utilities.Blend;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.resources.MaterialAttributes;

/* JADX INFO: loaded from: classes10.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;

    @ColorInt
    public static int a(@ColorInt int i10, @IntRange(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis) int i11) {
        Hct hctFromInt = Hct.fromInt(i10);
        hctFromInt.setTone(i11);
        return hctFromInt.toInt();
    }

    @ColorInt
    public static int compositeARGBWithAlpha(@ColorInt int i10, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i11) {
        return ColorUtils.setAlphaComponent(i10, (Color.alpha(i10) * i11) / 255);
    }

    @ColorInt
    public static int getColor(@NonNull View view, @AttrRes int i10) {
        Context context = view.getContext();
        TypedValue typedValueResolveTypedValueOrThrow = MaterialAttributes.resolveTypedValueOrThrow(view, i10);
        int i11 = typedValueResolveTypedValueOrThrow.resourceId;
        return i11 != 0 ? ContextCompat.getColor(context, i11) : typedValueResolveTypedValueOrThrow.data;
    }

    @Nullable
    @ColorInt
    public static Integer getColorOrNull(@NonNull Context context, @AttrRes int i10) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i10);
        if (typedValueResolve == null) {
            return null;
        }
        int i11 = typedValueResolve.resourceId;
        return Integer.valueOf(i11 != 0 ? ContextCompat.getColor(context, i11) : typedValueResolve.data);
    }

    @NonNull
    public static ColorRoles getColorRoles(@ColorInt int i10, boolean z10) {
        return z10 ? new ColorRoles(a(i10, 40), a(i10, 100), a(i10, 90), a(i10, 10)) : new ColorRoles(a(i10, 80), a(i10, 20), a(i10, 30), a(i10, 90));
    }

    @NonNull
    public static ColorStateList getColorStateList(@NonNull Context context, @AttrRes int i10, @NonNull ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i10);
        if (typedValueResolve != null) {
            int i11 = typedValueResolve.resourceId;
            colorStateList2 = i11 != 0 ? ContextCompat.getColorStateList(context, i11) : ColorStateList.valueOf(typedValueResolve.data);
        } else {
            colorStateList2 = null;
        }
        return colorStateList2 == null ? colorStateList : colorStateList2;
    }

    @Nullable
    public static ColorStateList getColorStateListOrNull(@NonNull Context context, @AttrRes int i10) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i10);
        if (typedValueResolve == null) {
            return null;
        }
        int i11 = typedValueResolve.resourceId;
        if (i11 != 0) {
            return ContextCompat.getColorStateList(context, i11);
        }
        int i12 = typedValueResolve.data;
        if (i12 != 0) {
            return ColorStateList.valueOf(i12);
        }
        return null;
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static int getSurfaceContainerFromSeed(@NonNull Context context, @ColorInt int i10) {
        Hct hctFromInt = Hct.fromInt(a(i10, MaterialAttributes.resolveBoolean(context, R.attr.isLightTheme, true) ? 94 : 12));
        hctFromInt.setChroma(6);
        return hctFromInt.toInt();
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static int getSurfaceContainerHighFromSeed(@NonNull Context context, @ColorInt int i10) {
        Hct hctFromInt = Hct.fromInt(a(i10, MaterialAttributes.resolveBoolean(context, R.attr.isLightTheme, true) ? 92 : 17));
        hctFromInt.setChroma(6);
        return hctFromInt.toInt();
    }

    @ColorInt
    public static int harmonize(@ColorInt int i10, @ColorInt int i11) {
        return Blend.harmonize(i10, i11);
    }

    @ColorInt
    public static int harmonizeWithPrimary(@NonNull Context context, @ColorInt int i10) {
        return harmonize(i10, getColor(context, R.attr.colorPrimary, MaterialColors.class.getCanonicalName()));
    }

    public static boolean isColorLight(@ColorInt int i10) {
        return i10 != 0 && ColorUtils.calculateLuminance(i10) > 0.5d;
    }

    @ColorInt
    public static int layer(@NonNull View view, @AttrRes int i10, @AttrRes int i11) {
        return layer(view, i10, i11, 1.0f);
    }

    @ColorInt
    public static int layer(@NonNull View view, @AttrRes int i10, @AttrRes int i11, @FloatRange(from = 0.0d, to = 1.0d) float f6) {
        return layer(getColor(view, i10), getColor(view, i11), f6);
    }

    @ColorInt
    public static int layer(@ColorInt int i10, @ColorInt int i11, @FloatRange(from = 0.0d, to = 1.0d) float f6) {
        return layer(i10, ColorUtils.setAlphaComponent(i11, Math.round(Color.alpha(i11) * f6)));
    }

    @ColorInt
    public static int getColor(Context context, @AttrRes int i10, String str) {
        TypedValue typedValueResolveTypedValueOrThrow = MaterialAttributes.resolveTypedValueOrThrow(context, i10, str);
        int i11 = typedValueResolveTypedValueOrThrow.resourceId;
        if (i11 != 0) {
            return ContextCompat.getColor(context, i11);
        }
        return typedValueResolveTypedValueOrThrow.data;
    }

    @ColorInt
    public static int layer(@ColorInt int i10, @ColorInt int i11) {
        return ColorUtils.compositeColors(i11, i10);
    }

    @ColorInt
    public static int getColor(@NonNull View view, @AttrRes int i10, @ColorInt int i11) {
        return getColor(view.getContext(), i10, i11);
    }

    @ColorInt
    public static int getColor(@NonNull Context context, @AttrRes int i10, @ColorInt int i11) {
        Integer colorOrNull = getColorOrNull(context, i10);
        return colorOrNull != null ? colorOrNull.intValue() : i11;
    }

    @NonNull
    public static ColorRoles getColorRoles(@NonNull Context context, @ColorInt int i10) {
        return getColorRoles(i10, MaterialAttributes.resolveBoolean(context, R.attr.isLightTheme, true));
    }
}
