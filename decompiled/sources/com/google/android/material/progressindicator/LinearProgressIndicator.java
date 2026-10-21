package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes10.dex */
public class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_LinearProgressIndicator;
    public static final int INDETERMINATE_ANIMATION_TYPE_CONTIGUOUS = 0;
    public static final int INDETERMINATE_ANIMATION_TYPE_DISJOINT = 1;
    public static final int INDICATOR_DIRECTION_END_TO_START = 3;
    public static final int INDICATOR_DIRECTION_LEFT_TO_RIGHT = 0;
    public static final int INDICATOR_DIRECTION_RIGHT_TO_LEFT = 1;
    public static final int INDICATOR_DIRECTION_START_TO_END = 2;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface IndeterminateAnimationType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface IndicatorDirection {
    }

    public LinearProgressIndicator(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final BaseProgressIndicatorSpec a(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f45021p0).indeterminateAnimationType;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f45021p0).indicatorDirection;
    }

    @Px
    public int getTrackStopIndicatorSize() {
        return ((LinearProgressIndicatorSpec) this.f45021p0).trackStopIndicatorSize;
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        S s4 = this.f45021p0;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s4;
        boolean z11 = true;
        if (((LinearProgressIndicatorSpec) s4).indicatorDirection != 1 && ((ViewCompat.getLayoutDirection(this) != 1 || ((LinearProgressIndicatorSpec) s4).indicatorDirection != 2) && (ViewCompat.getLayoutDirection(this) != 0 || ((LinearProgressIndicatorSpec) s4).indicatorDirection != 3))) {
            z11 = false;
        }
        linearProgressIndicatorSpec.f45039a = z11;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        int paddingRight = i10 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i11 - (getPaddingBottom() + getPaddingTop());
        IndeterminateDrawable<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        DeterminateDrawable<LinearProgressIndicatorSpec> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i10) {
        S s4 = this.f45021p0;
        if (((LinearProgressIndicatorSpec) s4).indeterminateAnimationType == i10) {
            return;
        }
        if (b() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((LinearProgressIndicatorSpec) s4).indeterminateAnimationType = i10;
        ((LinearProgressIndicatorSpec) s4).a();
        if (i10 == 0) {
            IndeterminateDrawable<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
            f fVar = new f((LinearProgressIndicatorSpec) s4);
            indeterminateDrawable.G0 = fVar;
            fVar.f45066a = indeterminateDrawable;
        } else {
            IndeterminateDrawable<LinearProgressIndicatorSpec> indeterminateDrawable2 = getIndeterminateDrawable();
            g gVar = new g(getContext(), (LinearProgressIndicatorSpec) s4);
            indeterminateDrawable2.G0 = gVar;
            gVar.f45066a = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f45021p0).a();
    }

    public void setIndicatorDirection(int i10) {
        S s4 = this.f45021p0;
        ((LinearProgressIndicatorSpec) s4).indicatorDirection = i10;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s4;
        boolean z10 = true;
        if (i10 != 1 && ((ViewCompat.getLayoutDirection(this) != 1 || ((LinearProgressIndicatorSpec) s4).indicatorDirection != 2) && (ViewCompat.getLayoutDirection(this) != 0 || i10 != 3))) {
            z10 = false;
        }
        linearProgressIndicatorSpec.f45039a = z10;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setProgressCompat(int i10, boolean z10) {
        S s4 = this.f45021p0;
        if (s4 != 0 && ((LinearProgressIndicatorSpec) s4).indeterminateAnimationType == 0 && isIndeterminate()) {
            return;
        }
        super.setProgressCompat(i10, z10);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i10) {
        super.setTrackCornerRadius(i10);
        ((LinearProgressIndicatorSpec) this.f45021p0).a();
        invalidate();
    }

    public void setTrackStopIndicatorSize(@Px int i10) {
        S s4 = this.f45021p0;
        if (((LinearProgressIndicatorSpec) s4).trackStopIndicatorSize != i10) {
            ((LinearProgressIndicatorSpec) s4).trackStopIndicatorSize = Math.min(i10, ((LinearProgressIndicatorSpec) s4).trackThickness);
            ((LinearProgressIndicatorSpec) s4).a();
            invalidate();
        }
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        d gVar;
        super(context, attributeSet, i10, DEF_STYLE_RES);
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f45021p0;
        e eVar = new e(linearProgressIndicatorSpec);
        Context context2 = getContext();
        if (linearProgressIndicatorSpec.indeterminateAnimationType == 0) {
            gVar = new f(linearProgressIndicatorSpec);
        } else {
            gVar = new g(context2, linearProgressIndicatorSpec);
        }
        setIndeterminateDrawable(new IndeterminateDrawable(context2, linearProgressIndicatorSpec, eVar, gVar));
        setProgressDrawable(new DeterminateDrawable(getContext(), linearProgressIndicatorSpec, eVar));
    }
}
