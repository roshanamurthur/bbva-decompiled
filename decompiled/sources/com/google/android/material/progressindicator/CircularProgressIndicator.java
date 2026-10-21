package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes10.dex */
public class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_CircularProgressIndicator;
    public static final int INDICATOR_DIRECTION_CLOCKWISE = 0;
    public static final int INDICATOR_DIRECTION_COUNTERCLOCKWISE = 1;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface IndicatorDirection {
    }

    public CircularProgressIndicator(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final BaseProgressIndicatorSpec a(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f45021p0).indicatorDirection;
    }

    @Px
    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f45021p0).indicatorInset;
    }

    @Px
    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f45021p0).indicatorSize;
    }

    public void setIndicatorDirection(int i10) {
        ((CircularProgressIndicatorSpec) this.f45021p0).indicatorDirection = i10;
        invalidate();
    }

    public void setIndicatorInset(@Px int i10) {
        S s4 = this.f45021p0;
        if (((CircularProgressIndicatorSpec) s4).indicatorInset != i10) {
            ((CircularProgressIndicatorSpec) s4).indicatorInset = i10;
            invalidate();
        }
    }

    public void setIndicatorSize(@Px int i10) {
        int iMax = Math.max(i10, getTrackThickness() * 2);
        S s4 = this.f45021p0;
        if (((CircularProgressIndicatorSpec) s4).indicatorSize != iMax) {
            ((CircularProgressIndicatorSpec) s4).indicatorSize = iMax;
            ((CircularProgressIndicatorSpec) s4).a();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i10) {
        super.setTrackThickness(i10);
        ((CircularProgressIndicatorSpec) this.f45021p0).a();
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        super(context, attributeSet, i10, DEF_STYLE_RES);
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f45021p0;
        a aVar = new a(circularProgressIndicatorSpec);
        Context context2 = getContext();
        IndeterminateDrawable indeterminateDrawable = new IndeterminateDrawable(context2, circularProgressIndicatorSpec, aVar, new b(circularProgressIndicatorSpec));
        indeterminateDrawable.setStaticDummyDrawable(VectorDrawableCompat.create(context2.getResources(), R.drawable.indeterminate_static, null));
        setIndeterminateDrawable(indeterminateDrawable);
        setProgressDrawable(new DeterminateDrawable(getContext(), circularProgressIndicatorSpec, aVar));
    }
}
