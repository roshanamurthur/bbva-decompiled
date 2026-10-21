package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class VirtualLayout extends HelperWidget {
    public int J = 0;
    public int K = 0;
    public int L = 0;
    public int M = 0;
    public int N = 0;
    public int O = 0;
    public boolean P = false;
    public int Q = 0;
    public int R = 0;
    protected BasicMeasure.Measure mMeasure = new BasicMeasure.Measure();
    public BasicMeasure.Measurer S = null;

    public void applyRtl(boolean z10) {
        int i10 = this.L;
        if (i10 > 0 || this.M > 0) {
            if (z10) {
                this.N = this.M;
                this.O = i10;
            } else {
                this.N = i10;
                this.O = this.M;
            }
        }
    }

    public void captureWidgets() {
        for (int i10 = 0; i10 < this.mWidgetsCount; i10++) {
            ConstraintWidget constraintWidget = this.mWidgets[i10];
            if (constraintWidget != null) {
                constraintWidget.setInVirtualLayout(true);
            }
        }
    }

    public boolean contains(HashSet<ConstraintWidget> hashSet) {
        for (int i10 = 0; i10 < this.mWidgetsCount; i10++) {
            if (hashSet.contains(this.mWidgets[i10])) {
                return true;
            }
        }
        return false;
    }

    public int getMeasuredHeight() {
        return this.R;
    }

    public int getMeasuredWidth() {
        return this.Q;
    }

    public int getPaddingBottom() {
        return this.K;
    }

    public int getPaddingLeft() {
        return this.N;
    }

    public int getPaddingRight() {
        return this.O;
    }

    public int getPaddingTop() {
        return this.J;
    }

    public void measure(int i10, int i11, int i12, int i13) {
    }

    public boolean measureChildren() {
        ConstraintWidget constraintWidget = this.mParent;
        BasicMeasure.Measurer measurer = constraintWidget != null ? ((ConstraintWidgetContainer) constraintWidget).getMeasurer() : null;
        if (measurer == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.mWidgetsCount; i10++) {
            ConstraintWidget constraintWidget2 = this.mWidgets[i10];
            if (constraintWidget2 != null && !(constraintWidget2 instanceof Guideline)) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.getDimensionBehaviour(0);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget2.getDimensionBehaviour(1);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour != dimensionBehaviour3 || constraintWidget2.mMatchConstraintDefaultWidth == 1 || dimensionBehaviour2 != dimensionBehaviour3 || constraintWidget2.mMatchConstraintDefaultHeight == 1) {
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    BasicMeasure.Measure measure = this.mMeasure;
                    measure.horizontalBehavior = dimensionBehaviour;
                    measure.verticalBehavior = dimensionBehaviour2;
                    measure.horizontalDimension = constraintWidget2.getWidth();
                    this.mMeasure.verticalDimension = constraintWidget2.getHeight();
                    measurer.measure(constraintWidget2, this.mMeasure);
                    constraintWidget2.setWidth(this.mMeasure.measuredWidth);
                    constraintWidget2.setHeight(this.mMeasure.measuredHeight);
                    constraintWidget2.setBaselineDistance(this.mMeasure.measuredBaseline);
                }
            }
        }
        return true;
    }

    public boolean needSolverPass() {
        return this.P;
    }

    public void needsCallbackFromSolver(boolean z10) {
        this.P = z10;
    }

    public void setMeasure(int i10, int i11) {
        this.Q = i10;
        this.R = i11;
    }

    public void setPadding(int i10) {
        this.J = i10;
        this.K = i10;
        this.L = i10;
        this.M = i10;
    }

    public void setPaddingBottom(int i10) {
        this.K = i10;
    }

    public void setPaddingEnd(int i10) {
        this.M = i10;
    }

    public void setPaddingLeft(int i10) {
        this.N = i10;
    }

    public void setPaddingRight(int i10) {
        this.O = i10;
    }

    public void setPaddingStart(int i10) {
        this.L = i10;
        this.N = i10;
        this.O = i10;
    }

    public void setPaddingTop(int i10) {
        this.J = i10;
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.Helper
    public void updateConstraints(ConstraintWidgetContainer constraintWidgetContainer) {
        captureWidgets();
    }

    public void measure(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i10, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i11) {
        while (this.S == null && getParent() != null) {
            this.S = ((ConstraintWidgetContainer) getParent()).getMeasurer();
        }
        BasicMeasure.Measure measure = this.mMeasure;
        measure.horizontalBehavior = dimensionBehaviour;
        measure.verticalBehavior = dimensionBehaviour2;
        measure.horizontalDimension = i10;
        measure.verticalDimension = i11;
        this.S.measure(constraintWidget, measure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
    }
}
