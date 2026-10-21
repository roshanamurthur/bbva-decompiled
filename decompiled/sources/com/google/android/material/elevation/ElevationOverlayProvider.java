package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;

/* JADX INFO: loaded from: classes10.dex */
public class ElevationOverlayProvider {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f44637f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f44642e;

    public ElevationOverlayProvider(@NonNull Context context) {
        this(MaterialAttributes.resolveBoolean(context, R.attr.elevationOverlayEnabled, false), MaterialColors.getColor(context, R.attr.elevationOverlayColor, 0), MaterialColors.getColor(context, R.attr.elevationOverlayAccentColor, 0), MaterialColors.getColor(context, R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    public int calculateOverlayAlpha(float f6) {
        return Math.round(calculateOverlayAlphaFraction(f6) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f6) {
        float f10 = this.f44642e;
        if (f10 <= 0.0f || f6 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f6 / f10)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int i10, float f6, @NonNull View view) {
        return compositeOverlay(i10, getParentAbsoluteElevation(view) + f6);
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int i10, float f6, @NonNull View view) {
        return compositeOverlayIfNeeded(i10, getParentAbsoluteElevation(view) + f6);
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f6, @NonNull View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(getParentAbsoluteElevation(view) + f6);
    }

    public float getParentAbsoluteElevation(@NonNull View view) {
        return ViewUtils.getParentAbsoluteElevation(view);
    }

    @ColorInt
    public int getThemeElevationOverlayColor() {
        return this.f44639b;
    }

    @ColorInt
    public int getThemeSurfaceColor() {
        return this.f44641d;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.f44638a;
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int i10, float f6) {
        int i11;
        float fCalculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f6);
        int iAlpha = Color.alpha(i10);
        int iLayer = MaterialColors.layer(ColorUtils.setAlphaComponent(i10, 255), this.f44639b, fCalculateOverlayAlphaFraction);
        if (fCalculateOverlayAlphaFraction > 0.0f && (i11 = this.f44640c) != 0) {
            iLayer = MaterialColors.layer(iLayer, ColorUtils.setAlphaComponent(i11, f44637f));
        }
        return ColorUtils.setAlphaComponent(iLayer, iAlpha);
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int i10, float f6) {
        return (this.f44638a && ColorUtils.setAlphaComponent(i10, 255) == this.f44641d) ? compositeOverlay(i10, f6) : i10;
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f6) {
        return compositeOverlayIfNeeded(this.f44641d, f6);
    }

    public ElevationOverlayProvider(boolean z10, @ColorInt int i10, @ColorInt int i11, @ColorInt int i12, float f6) {
        this.f44638a = z10;
        this.f44639b = i10;
        this.f44640c = i11;
        this.f44641d = i12;
        this.f44642e = f6;
    }
}
