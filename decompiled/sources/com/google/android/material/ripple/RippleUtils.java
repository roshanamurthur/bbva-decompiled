package com.google.android.material.ripple;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.color.MaterialColors;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RippleUtils {

    @ChecksSdkIntAtLeast(api = 21)
    public static final boolean USE_FRAMEWORK_RIPPLE = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f45111a = {R.attr.state_pressed};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f45112b = {R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f45113c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f45114d = {R.attr.state_hovered};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f45115e = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f45116f = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f45117g = {R.attr.state_selected, R.attr.state_focused};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f45118h = {R.attr.state_selected, R.attr.state_hovered};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f45119i = {R.attr.state_selected};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f45120j = {R.attr.state_enabled, R.attr.state_pressed};

    @RequiresApi(21)
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        @DoNotInline
        public static Drawable b(@NonNull Context context, @Px int i10) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            return new RippleDrawable(MaterialColors.getColorStateList(context, com.google.android.material.R.attr.colorControlHighlight, ColorStateList.valueOf(0)), null, new InsetDrawable((Drawable) gradientDrawable, i10, i10, i10, i10));
        }
    }

    @ColorInt
    public static int a(@Nullable ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return USE_FRAMEWORK_RIPPLE ? ColorUtils.setAlphaComponent(colorForState, Math.min(Color.alpha(colorForState) * 2, 255)) : colorForState;
    }

    @NonNull
    public static ColorStateList convertToRippleDrawableColor(@Nullable ColorStateList colorStateList) {
        boolean z10 = USE_FRAMEWORK_RIPPLE;
        int[] iArr = f45111a;
        int[] iArr2 = f45113c;
        int[] iArr3 = f45115e;
        int[] iArr4 = f45119i;
        if (z10) {
            return new ColorStateList(new int[][]{iArr4, iArr2, StateSet.NOTHING}, new int[]{a(colorStateList, iArr3), a(colorStateList, iArr2), a(colorStateList, iArr)});
        }
        int[] iArr5 = f45116f;
        int[] iArr6 = f45117g;
        int[] iArr7 = f45118h;
        int[] iArr8 = f45112b;
        int[] iArr9 = f45114d;
        return new ColorStateList(new int[][]{iArr3, iArr5, iArr6, iArr7, iArr4, iArr, iArr8, iArr2, iArr9, StateSet.NOTHING}, new int[]{a(colorStateList, iArr3), a(colorStateList, iArr5), a(colorStateList, iArr6), a(colorStateList, iArr7), 0, a(colorStateList, iArr), a(colorStateList, iArr8), a(colorStateList, iArr2), a(colorStateList, iArr9), 0});
    }

    @NonNull
    @RequiresApi(21)
    public static Drawable createOvalRippleLollipop(@NonNull Context context, @Px int i10) {
        return a.b(context, i10);
    }

    @NonNull
    public static ColorStateList sanitizeRippleDrawableColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f45120j, 0)) != 0) {
            Log.w("RippleUtils", "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean shouldDrawRippleCompat(@NonNull int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
