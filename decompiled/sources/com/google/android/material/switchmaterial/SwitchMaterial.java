package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes10.dex */
public class SwitchMaterial extends SwitchCompat {
    public static final int r1 = R.style.Widget_MaterialComponents_CompoundButton_Switch;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final int[][] f45481s1 = {new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    @NonNull
    public final ElevationOverlayProvider f45482n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    @Nullable
    public ColorStateList f45483o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    public ColorStateList f45484p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public boolean f45485q1;

    public SwitchMaterial(@NonNull Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f45483o1 == null) {
            int color = MaterialColors.getColor(this, R.attr.colorSurface);
            int color2 = MaterialColors.getColor(this, R.attr.colorControlActivated);
            float dimension = getResources().getDimension(R.dimen.mtrl_switch_thumb_elevation);
            ElevationOverlayProvider elevationOverlayProvider = this.f45482n1;
            if (elevationOverlayProvider.isThemeElevationOverlayEnabled()) {
                dimension += ViewUtils.getParentAbsoluteElevation(this);
            }
            int iCompositeOverlayIfNeeded = elevationOverlayProvider.compositeOverlayIfNeeded(color, dimension);
            this.f45483o1 = new ColorStateList(f45481s1, new int[]{MaterialColors.layer(color, color2, 1.0f), iCompositeOverlayIfNeeded, MaterialColors.layer(color, color2, 0.38f), iCompositeOverlayIfNeeded});
        }
        return this.f45483o1;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f45484p1 == null) {
            int color = MaterialColors.getColor(this, R.attr.colorSurface);
            int color2 = MaterialColors.getColor(this, R.attr.colorControlActivated);
            int color3 = MaterialColors.getColor(this, R.attr.colorOnSurface);
            this.f45484p1 = new ColorStateList(f45481s1, new int[]{MaterialColors.layer(color, color2, 0.54f), MaterialColors.layer(color, color3, 0.32f), MaterialColors.layer(color, color2, 0.12f), MaterialColors.layer(color, color3, 0.12f)});
        }
        return this.f45484p1;
    }

    public boolean isUseMaterialThemeColors() {
        return this.f45485q1;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f45485q1 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f45485q1 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f45485q1 = z10;
        if (z10) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    public SwitchMaterial(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchMaterial(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = r1;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        this.f45482n1 = new ElevationOverlayProvider(context2);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.SwitchMaterial, i10, i11, new int[0]);
        this.f45485q1 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SwitchMaterial_useMaterialThemeColors, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
