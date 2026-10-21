package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseProgressIndicatorSpec {
    public int hideAnimationBehavior;

    @NonNull
    public int[] indicatorColors;

    @Px
    public int indicatorTrackGapSize;
    public int showAnimationBehavior;

    @ColorInt
    public int trackColor;

    @Px
    public int trackCornerRadius;

    @Px
    public int trackThickness;

    public BaseProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) {
        this.indicatorColors = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.BaseProgressIndicator, i10, i11, new int[0]);
        this.trackThickness = MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, R.styleable.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.trackCornerRadius = Math.min(MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, R.styleable.BaseProgressIndicator_trackCornerRadius, 0), this.trackThickness / 2);
        this.showAnimationBehavior = typedArrayObtainStyledAttributes.getInt(R.styleable.BaseProgressIndicator_showAnimationBehavior, 0);
        this.hideAnimationBehavior = typedArrayObtainStyledAttributes.getInt(R.styleable.BaseProgressIndicator_hideAnimationBehavior, 0);
        this.indicatorTrackGapSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BaseProgressIndicator_indicatorTrackGapSize, 0);
        int i12 = R.styleable.BaseProgressIndicator_indicatorColor;
        if (!typedArrayObtainStyledAttributes.hasValue(i12)) {
            this.indicatorColors = new int[]{MaterialColors.getColor(context, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(i12).type != 1) {
            this.indicatorColors = new int[]{typedArrayObtainStyledAttributes.getColor(i12, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(i12, -1));
            this.indicatorColors = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        int i13 = R.styleable.BaseProgressIndicator_trackColor;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            this.trackColor = typedArrayObtainStyledAttributes.getColor(i13, -1);
        } else {
            this.trackColor = this.indicatorColors[0];
            TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f6 = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            this.trackColor = MaterialColors.compositeARGBWithAlpha(this.trackColor, (int) (f6 * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @CallSuper
    public void a() {
        if (this.indicatorTrackGapSize < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }

    public boolean isHideAnimationEnabled() {
        return this.hideAnimationBehavior != 0;
    }

    public boolean isShowAnimationEnabled() {
        return this.showAnimationBehavior != 0;
    }
}
