package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;

/* JADX INFO: loaded from: classes.dex */
public class Optimizer {
    public static final int OPTIMIZATION_BARRIER = 2;
    public static final int OPTIMIZATION_CACHE_MEASURES = 256;
    public static final int OPTIMIZATION_CHAIN = 4;
    public static final int OPTIMIZATION_DEPENDENCY_ORDERING = 512;
    public static final int OPTIMIZATION_DIMENSIONS = 8;
    public static final int OPTIMIZATION_DIRECT = 1;
    public static final int OPTIMIZATION_GRAPH = 64;
    public static final int OPTIMIZATION_GRAPH_WRAP = 128;
    public static final int OPTIMIZATION_GROUPING = 1024;
    public static final int OPTIMIZATION_GROUPS = 32;
    public static final int OPTIMIZATION_NONE = 0;
    public static final int OPTIMIZATION_RATIO = 16;
    public static final int OPTIMIZATION_STANDARD = 257;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean[] f19194a = new boolean[3];

    public static void a(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ConstraintWidget constraintWidget) {
        constraintWidget.mHorizontalResolution = -1;
        constraintWidget.mVerticalResolution = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidgetContainer.mListDimensionBehaviors[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i10 = constraintWidget.mLeft.mMargin;
            int width = constraintWidgetContainer.getWidth() - constraintWidget.mRight.mMargin;
            ConstraintAnchor constraintAnchor = constraintWidget.mLeft;
            constraintAnchor.f19133e = linearSystem.createObjectVariable(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.mRight;
            constraintAnchor2.f19133e = linearSystem.createObjectVariable(constraintAnchor2);
            linearSystem.addEquality(constraintWidget.mLeft.f19133e, i10);
            linearSystem.addEquality(constraintWidget.mRight.f19133e, width);
            constraintWidget.mHorizontalResolution = 2;
            constraintWidget.setHorizontalDimension(i10, width);
        }
        if (constraintWidgetContainer.mListDimensionBehaviors[1] == dimensionBehaviour2 || constraintWidget.mListDimensionBehaviors[1] != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            return;
        }
        int i11 = constraintWidget.mTop.mMargin;
        int height = constraintWidgetContainer.getHeight() - constraintWidget.mBottom.mMargin;
        ConstraintAnchor constraintAnchor3 = constraintWidget.mTop;
        constraintAnchor3.f19133e = linearSystem.createObjectVariable(constraintAnchor3);
        ConstraintAnchor constraintAnchor4 = constraintWidget.mBottom;
        constraintAnchor4.f19133e = linearSystem.createObjectVariable(constraintAnchor4);
        linearSystem.addEquality(constraintWidget.mTop.f19133e, i11);
        linearSystem.addEquality(constraintWidget.mBottom.f19133e, height);
        if (constraintWidget.f19155w > 0 || constraintWidget.getVisibility() == 8) {
            ConstraintAnchor constraintAnchor5 = constraintWidget.mBaseline;
            constraintAnchor5.f19133e = linearSystem.createObjectVariable(constraintAnchor5);
            linearSystem.addEquality(constraintWidget.mBaseline.f19133e, constraintWidget.f19155w + i11);
        }
        constraintWidget.mVerticalResolution = 2;
        constraintWidget.setVerticalDimension(i11, height);
    }

    public static final boolean enabled(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
