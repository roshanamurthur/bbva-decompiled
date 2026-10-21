package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends ConstraintHelper {
    public static final int BOTTOM = 3;
    public static final int END = 6;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int START = 5;
    public static final int TOP = 2;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f19697q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f19698r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.Barrier f19699s0;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Deprecated
    public boolean allowsGoneWidget() {
        return this.f19699s0.getAllowsGoneWidget();
    }

    public final void f(ConstraintWidget constraintWidget, int i10, boolean z10) {
        this.f19698r0 = i10;
        if (z10) {
            int i11 = this.f19697q0;
            if (i11 == 5) {
                this.f19698r0 = 1;
            } else if (i11 == 6) {
                this.f19698r0 = 0;
            }
        } else {
            int i12 = this.f19697q0;
            if (i12 == 5) {
                this.f19698r0 = 0;
            } else if (i12 == 6) {
                this.f19698r0 = 1;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier) {
            ((androidx.constraintlayout.core.widgets.Barrier) constraintWidget).setBarrierType(this.f19698r0);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f19699s0.getAllowsGoneWidget();
    }

    public int getMargin() {
        return this.f19699s0.getMargin();
    }

    public int getType() {
        return this.f19697q0;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.f19699s0 = new androidx.constraintlayout.core.widgets.Barrier();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f19699s0.setAllowsGoneWidget(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == R.styleable.ConstraintLayout_Layout_barrierMargin) {
                    this.f19699s0.setMargin(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.f19699s0;
        validateParams();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void loadParameters(ConstraintSet.Constraint constraint, HelperWidget helperWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.loadParameters(constraint, helperWidget, layoutParams, sparseArray);
        if (helperWidget instanceof androidx.constraintlayout.core.widgets.Barrier) {
            androidx.constraintlayout.core.widgets.Barrier barrier = (androidx.constraintlayout.core.widgets.Barrier) helperWidget;
            f(barrier, constraint.layout.mBarrierDirection, ((ConstraintWidgetContainer) helperWidget.getParent()).isRtl());
            barrier.setAllowsGoneWidget(constraint.layout.mBarrierAllowsGoneWidgets);
            barrier.setMargin(constraint.layout.mBarrierMargin);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void resolveRtl(ConstraintWidget constraintWidget, boolean z10) {
        f(constraintWidget, this.f19697q0, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f19699s0.setAllowsGoneWidget(z10);
    }

    public void setDpMargin(int i10) {
        this.f19699s0.setMargin((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f19699s0.setMargin(i10);
    }

    public void setType(int i10) {
        this.f19697q0 = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        super.setVisibility(8);
    }
}
