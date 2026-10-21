package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.CompoundButtonCompat;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes10.dex */
public class MaterialRadioButton extends AppCompatRadioButton {
    public static final int v0 = R.style.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final int[][] f45090w0 = {new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public ColorStateList f45091t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f45092u0;

    public MaterialRadioButton(@NonNull Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f45091t0 == null) {
            int color = MaterialColors.getColor(this, R.attr.colorControlActivated);
            int color2 = MaterialColors.getColor(this, R.attr.colorOnSurface);
            int color3 = MaterialColors.getColor(this, R.attr.colorSurface);
            this.f45091t0 = new ColorStateList(f45090w0, new int[]{MaterialColors.layer(color3, color, 1.0f), MaterialColors.layer(color3, color2, 0.54f), MaterialColors.layer(color3, color2, 0.38f), MaterialColors.layer(color3, color2, 0.38f)});
        }
        return this.f45091t0;
    }

    public boolean isUseMaterialThemeColors() {
        return this.f45092u0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f45092u0 && CompoundButtonCompat.getButtonTintList(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f45092u0 = z10;
        if (z10) {
            CompoundButtonCompat.setButtonTintList(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.setButtonTintList(this, null);
        }
    }

    public MaterialRadioButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.radioButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = v0;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.MaterialRadioButton, i10, i11, new int[0]);
        int i12 = R.styleable.MaterialRadioButton_buttonTint;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            CompoundButtonCompat.setButtonTintList(this, MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i12));
        }
        this.f45092u0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
