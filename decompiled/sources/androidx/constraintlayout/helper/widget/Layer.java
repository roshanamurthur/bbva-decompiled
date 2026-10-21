package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;

/* JADX INFO: loaded from: classes.dex */
public class Layer extends ConstraintHelper {
    public float E0;
    public boolean F0;
    public boolean G0;
    protected float mComputedCenterX;
    protected float mComputedCenterY;
    protected float mComputedMaxX;
    protected float mComputedMaxY;
    protected float mComputedMinX;
    protected float mComputedMinY;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f19265q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f19266r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f19267s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ConstraintLayout f19268t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f19269u0;
    public float v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final boolean f19270w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public View[] f19271x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public float f19272y0;

    public Layer(Context context) {
        super(context);
        this.f19265q0 = Float.NaN;
        this.f19266r0 = Float.NaN;
        this.f19267s0 = Float.NaN;
        this.f19269u0 = 1.0f;
        this.v0 = 1.0f;
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        this.mComputedMaxX = Float.NaN;
        this.mComputedMaxY = Float.NaN;
        this.mComputedMinX = Float.NaN;
        this.mComputedMinY = Float.NaN;
        this.f19270w0 = true;
        this.f19271x0 = null;
        this.f19272y0 = 0.0f;
        this.E0 = 0.0f;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void applyLayoutFeaturesInConstraintSet(ConstraintLayout constraintLayout) {
        applyLayoutFeatures(constraintLayout);
    }

    public void calcCenters() {
        if (this.f19268t0 == null) {
            return;
        }
        if (this.f19270w0 || Float.isNaN(this.mComputedCenterX) || Float.isNaN(this.mComputedCenterY)) {
            if (!Float.isNaN(this.f19265q0) && !Float.isNaN(this.f19266r0)) {
                this.mComputedCenterY = this.f19266r0;
                this.mComputedCenterX = this.f19265q0;
                return;
            }
            View[] views = getViews(this.f19268t0);
            int left = views[0].getLeft();
            int top = views[0].getTop();
            int right = views[0].getRight();
            int bottom = views[0].getBottom();
            for (int i10 = 0; i10 < this.mCount; i10++) {
                View view = views[i10];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.mComputedMaxX = right;
            this.mComputedMaxY = bottom;
            this.mComputedMinX = left;
            this.mComputedMinY = top;
            if (Float.isNaN(this.f19265q0)) {
                this.mComputedCenterX = (left + right) / 2;
            } else {
                this.mComputedCenterX = this.f19265q0;
            }
            if (Float.isNaN(this.f19266r0)) {
                this.mComputedCenterY = (top + bottom) / 2;
            } else {
                this.mComputedCenterY = this.f19266r0;
            }
        }
    }

    public final void f() {
        int i10;
        if (this.f19268t0 == null || (i10 = this.mCount) == 0) {
            return;
        }
        View[] viewArr = this.f19271x0;
        if (viewArr == null || viewArr.length != i10) {
            this.f19271x0 = new View[i10];
        }
        for (int i11 = 0; i11 < this.mCount; i11++) {
            this.f19271x0[i11] = this.f19268t0.getViewById(this.mIds[i11]);
        }
    }

    public final void g() {
        if (this.f19268t0 == null) {
            return;
        }
        if (this.f19271x0 == null) {
            f();
        }
        calcCenters();
        double radians = Float.isNaN(this.f19267s0) ? 0.0d : Math.toRadians(this.f19267s0);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f6 = this.f19269u0;
        float f10 = f6 * fCos;
        float f11 = this.v0;
        float f12 = (-f11) * fSin;
        float f13 = f6 * fSin;
        float f14 = f11 * fCos;
        for (int i10 = 0; i10 < this.mCount; i10++) {
            View view = this.f19271x0[i10];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f15 = right - this.mComputedCenterX;
            float f16 = bottom - this.mComputedCenterY;
            float f17 = (((f12 * f16) + (f10 * f15)) - f15) + this.f19272y0;
            float f18 = (((f14 * f16) + (f15 * f13)) - f16) + this.E0;
            view.setTranslationX(f17);
            view.setTranslationY(f18);
            view.setScaleY(this.v0);
            view.setScaleX(this.f19269u0);
            if (!Float.isNaN(this.f19267s0)) {
                view.setRotation(this.f19267s0);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mUseViewMeasure = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ConstraintLayout_Layout_android_visibility) {
                    this.F0 = true;
                } else if (index == R.styleable.ConstraintLayout_Layout_android_elevation) {
                    this.G0 = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19268t0 = (ConstraintLayout) getParent();
        if (this.F0 || this.G0) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.mCount; i10++) {
                View viewById = this.f19268t0.getViewById(this.mIds[i10]);
                if (viewById != null) {
                    if (this.F0) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.G0 && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        applyLayoutFeatures();
    }

    @Override // android.view.View
    public void setPivotX(float f6) {
        this.f19265q0 = f6;
        g();
    }

    @Override // android.view.View
    public void setPivotY(float f6) {
        this.f19266r0 = f6;
        g();
    }

    @Override // android.view.View
    public void setRotation(float f6) {
        this.f19267s0 = f6;
        g();
    }

    @Override // android.view.View
    public void setScaleX(float f6) {
        this.f19269u0 = f6;
        g();
    }

    @Override // android.view.View
    public void setScaleY(float f6) {
        this.v0 = f6;
        g();
    }

    @Override // android.view.View
    public void setTranslationX(float f6) {
        this.f19272y0 = f6;
        g();
    }

    @Override // android.view.View
    public void setTranslationY(float f6) {
        this.E0 = f6;
        g();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        applyLayoutFeatures();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePostLayout(ConstraintLayout constraintLayout) {
        f();
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        ConstraintWidget constraintWidget = ((ConstraintLayout.LayoutParams) getLayoutParams()).getConstraintWidget();
        constraintWidget.setWidth(0);
        constraintWidget.setHeight(0);
        calcCenters();
        layout(((int) this.mComputedMinX) - getPaddingLeft(), ((int) this.mComputedMinY) - getPaddingTop(), getPaddingRight() + ((int) this.mComputedMaxX), getPaddingBottom() + ((int) this.mComputedMaxY));
        g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePreDraw(ConstraintLayout constraintLayout) {
        this.f19268t0 = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f19267s0 = rotation;
        } else {
            if (Float.isNaN(this.f19267s0)) {
                return;
            }
            this.f19267s0 = rotation;
        }
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19265q0 = Float.NaN;
        this.f19266r0 = Float.NaN;
        this.f19267s0 = Float.NaN;
        this.f19269u0 = 1.0f;
        this.v0 = 1.0f;
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        this.mComputedMaxX = Float.NaN;
        this.mComputedMaxY = Float.NaN;
        this.mComputedMinX = Float.NaN;
        this.mComputedMinY = Float.NaN;
        this.f19270w0 = true;
        this.f19271x0 = null;
        this.f19272y0 = 0.0f;
        this.E0 = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19265q0 = Float.NaN;
        this.f19266r0 = Float.NaN;
        this.f19267s0 = Float.NaN;
        this.f19269u0 = 1.0f;
        this.v0 = 1.0f;
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        this.mComputedMaxX = Float.NaN;
        this.mComputedMaxY = Float.NaN;
        this.mComputedMinX = Float.NaN;
        this.mComputedMinY = Float.NaN;
        this.f19270w0 = true;
        this.f19271x0 = null;
        this.f19272y0 = 0.0f;
        this.E0 = 0.0f;
    }
}
