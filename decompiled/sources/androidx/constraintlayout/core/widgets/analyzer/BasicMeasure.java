package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class BasicMeasure {
    public static final int AT_MOST = Integer.MIN_VALUE;
    public static final int EXACTLY = 1073741824;
    public static final int FIXED = -3;
    public static final int MATCH_PARENT = -1;
    public static final int UNSPECIFIED = 0;
    public static final int WRAP_CONTENT = -2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<ConstraintWidget> f19197a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Measure f19198b = new Measure();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintWidgetContainer f19199c;

    public static class Measure {
        public static int SELF_DIMENSIONS = 0;
        public static int TRY_GIVEN_DIMENSIONS = 1;
        public static int USE_GIVEN_DIMENSIONS = 2;
        public ConstraintWidget.DimensionBehaviour horizontalBehavior;
        public int horizontalDimension;
        public int measureStrategy;
        public int measuredBaseline;
        public boolean measuredHasBaseline;
        public int measuredHeight;
        public boolean measuredNeedsSolverPass;
        public int measuredWidth;
        public ConstraintWidget.DimensionBehaviour verticalBehavior;
        public int verticalDimension;
    }

    public interface Measurer {
        void didMeasures();

        void measure(ConstraintWidget constraintWidget, Measure measure);
    }

    public BasicMeasure(ConstraintWidgetContainer constraintWidgetContainer) {
        this.f19199c = constraintWidgetContainer;
    }

    public final boolean a(int i10, ConstraintWidget constraintWidget, Measurer measurer) {
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
        Measure measure = this.f19198b;
        measure.horizontalBehavior = horizontalDimensionBehaviour;
        measure.verticalBehavior = constraintWidget.getVerticalDimensionBehaviour();
        measure.horizontalDimension = constraintWidget.getWidth();
        measure.verticalDimension = constraintWidget.getHeight();
        measure.measuredNeedsSolverPass = false;
        measure.measureStrategy = i10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.horizontalBehavior;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z10 = dimensionBehaviour == dimensionBehaviour2;
        boolean z11 = measure.verticalBehavior == dimensionBehaviour2;
        boolean z12 = z10 && constraintWidget.mDimensionRatio > 0.0f;
        boolean z13 = z11 && constraintWidget.mDimensionRatio > 0.0f;
        if (z12 && constraintWidget.mResolvedMatchConstraintDefault[0] == 4) {
            measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z13 && constraintWidget.mResolvedMatchConstraintDefault[1] == 4) {
            measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        measurer.measure(constraintWidget, measure);
        constraintWidget.setWidth(measure.measuredWidth);
        constraintWidget.setHeight(measure.measuredHeight);
        constraintWidget.setHasBaseline(measure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(measure.measuredBaseline);
        measure.measureStrategy = Measure.SELF_DIMENSIONS;
        return measure.measuredNeedsSolverPass;
    }

    public final void b(ConstraintWidgetContainer constraintWidgetContainer, int i10, int i11, int i12) {
        long jNanoTime = constraintWidgetContainer.mMetrics != null ? System.nanoTime() : 0L;
        int minWidth = constraintWidgetContainer.getMinWidth();
        int minHeight = constraintWidgetContainer.getMinHeight();
        constraintWidgetContainer.setMinWidth(0);
        constraintWidgetContainer.setMinHeight(0);
        constraintWidgetContainer.setWidth(i11);
        constraintWidgetContainer.setHeight(i12);
        constraintWidgetContainer.setMinWidth(minWidth);
        constraintWidgetContainer.setMinHeight(minHeight);
        ConstraintWidgetContainer constraintWidgetContainer2 = this.f19199c;
        constraintWidgetContainer2.setPass(i10);
        constraintWidgetContainer2.layout();
        if (constraintWidgetContainer.mMetrics != null) {
            long jNanoTime2 = System.nanoTime();
            Metrics metrics = constraintWidgetContainer.mMetrics;
            metrics.mSolverPasses++;
            metrics.measuresLayoutDuration = (jNanoTime2 - jNanoTime) + metrics.measuresLayoutDuration;
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x01bb A[PHI: r10
      0x01bb: PHI (r10v17 boolean) = (r10v16 boolean), (r10v16 boolean), (r10v16 boolean), (r10v20 boolean) binds: [B:122:0x018c, B:124:0x0192, B:126:0x0196, B:142:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:150:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:268:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x01d9 A[SYNTHETIC] */
    public long solverMeasure(ConstraintWidgetContainer constraintWidgetContainer, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean zDirectMeasureWithOrientation;
        int i19;
        boolean z10;
        int i20;
        long j10;
        boolean z11;
        Measurer measurer;
        ArrayList<ConstraintWidget> arrayList;
        int i21;
        int i22;
        boolean z12;
        int i23;
        boolean z13;
        boolean z14;
        Metrics metrics;
        HorizontalWidgetRun horizontalWidgetRun;
        VerticalWidgetRun verticalWidgetRun;
        boolean zDirectMeasureWithOrientation2;
        Metrics metrics2;
        BasicMeasure basicMeasure = this;
        ConstraintWidgetContainer constraintWidgetContainer2 = constraintWidgetContainer;
        Measurer measurer2 = constraintWidgetContainer.getMeasurer();
        int size = constraintWidgetContainer2.mChildren.size();
        int width = constraintWidgetContainer.getWidth();
        int height = constraintWidgetContainer.getHeight();
        boolean zEnabled = Optimizer.enabled(i10, 128);
        boolean z15 = zEnabled || Optimizer.enabled(i10, 64);
        boolean z16 = false;
        if (z15) {
            for (int i24 = 0; i24 < size; i24++) {
                ConstraintWidget constraintWidget = constraintWidgetContainer2.mChildren.get(i24);
                ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z17 = (horizontalDimensionBehaviour == dimensionBehaviour) && (constraintWidget.getVerticalDimensionBehaviour() == dimensionBehaviour) && constraintWidget.getDimensionRatio() > 0.0f;
                if ((constraintWidget.isInHorizontalChain() && z17) || ((constraintWidget.isInVerticalChain() && z17) || (constraintWidget instanceof VirtualLayout) || constraintWidget.isInHorizontalChain() || constraintWidget.isInVerticalChain())) {
                    z15 = false;
                    break;
                }
            }
        }
        if (z15 && (metrics2 = LinearSystem.sMetrics) != null) {
            metrics2.measures++;
        }
        boolean z18 = z15 & ((i13 == 1073741824 && i15 == 1073741824) || zEnabled);
        if (z18) {
            int iMin = Math.min(constraintWidgetContainer.getMaxWidth(), i14);
            int iMin2 = Math.min(constraintWidgetContainer.getMaxHeight(), i16);
            if (i13 == 1073741824 && constraintWidgetContainer.getWidth() != iMin) {
                constraintWidgetContainer2.setWidth(iMin);
                constraintWidgetContainer.invalidateGraph();
            }
            if (i15 == 1073741824 && constraintWidgetContainer.getHeight() != iMin2) {
                constraintWidgetContainer2.setHeight(iMin2);
                constraintWidgetContainer.invalidateGraph();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                zDirectMeasureWithOrientation = constraintWidgetContainer2.directMeasure(zEnabled);
                i19 = 2;
            } else {
                boolean zDirectMeasureSetup = constraintWidgetContainer2.directMeasureSetup(zEnabled);
                if (i13 == 1073741824) {
                    zDirectMeasureWithOrientation2 = zDirectMeasureSetup & constraintWidgetContainer2.directMeasureWithOrientation(zEnabled, 0);
                    i19 = 1;
                } else {
                    zDirectMeasureWithOrientation2 = zDirectMeasureSetup;
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    zDirectMeasureWithOrientation = constraintWidgetContainer2.directMeasureWithOrientation(zEnabled, 1) & zDirectMeasureWithOrientation2;
                    i19++;
                } else {
                    zDirectMeasureWithOrientation = zDirectMeasureWithOrientation2;
                }
            }
            if (zDirectMeasureWithOrientation) {
                constraintWidgetContainer2.updateFromRuns(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            zDirectMeasureWithOrientation = false;
            i19 = 0;
        }
        if (zDirectMeasureWithOrientation && i19 == 2) {
            j10 = 0;
        } else {
            int optimizationLevel = constraintWidgetContainer.getOptimizationLevel();
            if (size > 0) {
                int size2 = constraintWidgetContainer2.mChildren.size();
                boolean zOptimizeFor = constraintWidgetContainer2.optimizeFor(64);
                Measurer measurer3 = constraintWidgetContainer.getMeasurer();
                int i25 = 0;
                while (i25 < size2) {
                    ConstraintWidget constraintWidget2 = constraintWidgetContainer2.mChildren.get(i25);
                    if ((constraintWidget2 instanceof Guideline) || (constraintWidget2 instanceof Barrier) || constraintWidget2.isInVirtualLayout() || (zOptimizeFor && (horizontalWidgetRun = constraintWidget2.mHorizontalRun) != null && (verticalWidgetRun = constraintWidget2.mVerticalRun) != null && horizontalWidgetRun.f19238c.resolved && verticalWidgetRun.f19238c.resolved)) {
                        i22 = size2;
                        z12 = zOptimizeFor;
                        z14 = z16;
                    } else {
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget2.getDimensionBehaviour(0);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget2.getDimensionBehaviour(1);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        i22 = size2;
                        if (dimensionBehaviour2 == dimensionBehaviour4) {
                            z12 = zOptimizeFor;
                            i23 = 1;
                            if (constraintWidget2.mMatchConstraintDefaultWidth != 1 && dimensionBehaviour3 == dimensionBehaviour4 && constraintWidget2.mMatchConstraintDefaultHeight != 1) {
                                z13 = true;
                            }
                            if (z13 && constraintWidgetContainer2.optimizeFor(i23) && !(constraintWidget2 instanceof VirtualLayout)) {
                                if (dimensionBehaviour2 == dimensionBehaviour4 && constraintWidget2.mMatchConstraintDefaultWidth == 0 && dimensionBehaviour3 != dimensionBehaviour4 && !constraintWidget2.isInHorizontalChain()) {
                                    z13 = true;
                                }
                                if (dimensionBehaviour3 == dimensionBehaviour4 && constraintWidget2.mMatchConstraintDefaultHeight == 0 && dimensionBehaviour2 != dimensionBehaviour4 && !constraintWidget2.isInHorizontalChain()) {
                                    z13 = true;
                                }
                                if (dimensionBehaviour2 == dimensionBehaviour4 || dimensionBehaviour3 == dimensionBehaviour4) {
                                    z14 = false;
                                    if (constraintWidget2.mDimensionRatio > 0.0f) {
                                    }
                                } else {
                                    z14 = false;
                                }
                                if (z13) {
                                    basicMeasure.a(Measure.SELF_DIMENSIONS, constraintWidget2, measurer3);
                                    metrics = constraintWidgetContainer2.mMetrics;
                                    if (metrics != null) {
                                        metrics.measuredWidgets++;
                                    }
                                }
                            } else {
                                z14 = false;
                                if (z13) {
                                    basicMeasure.a(Measure.SELF_DIMENSIONS, constraintWidget2, measurer3);
                                    metrics = constraintWidgetContainer2.mMetrics;
                                    if (metrics != null) {
                                        metrics.measuredWidgets++;
                                    }
                                }
                            }
                        } else {
                            z12 = zOptimizeFor;
                            i23 = 1;
                        }
                        z13 = false;
                        if (z13) {
                            z14 = false;
                            if (z13) {
                                basicMeasure.a(Measure.SELF_DIMENSIONS, constraintWidget2, measurer3);
                                metrics = constraintWidgetContainer2.mMetrics;
                                if (metrics != null) {
                                    metrics.measuredWidgets++;
                                }
                            }
                        } else {
                            z14 = false;
                            if (z13) {
                                basicMeasure.a(Measure.SELF_DIMENSIONS, constraintWidget2, measurer3);
                                metrics = constraintWidgetContainer2.mMetrics;
                                if (metrics != null) {
                                    metrics.measuredWidgets++;
                                }
                            }
                        }
                    }
                    i25++;
                    size2 = i22;
                    z16 = z14;
                    zOptimizeFor = z12;
                }
                measurer3.didMeasures();
            }
            long jNanoTime = constraintWidgetContainer2.mMetrics != null ? System.nanoTime() : 0L;
            updateHierarchy(constraintWidgetContainer);
            ArrayList<ConstraintWidget> arrayList2 = basicMeasure.f19197a;
            int size3 = arrayList2.size();
            if (size > 0) {
                z10 = false;
                basicMeasure.b(constraintWidgetContainer2, 0, width, height);
            } else {
                z10 = false;
            }
            if (size3 > 0) {
                ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour2 = constraintWidgetContainer.getHorizontalDimensionBehaviour();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z19 = horizontalDimensionBehaviour2 == dimensionBehaviour5 ? true : z10;
                boolean z20 = constraintWidgetContainer.getVerticalDimensionBehaviour() == dimensionBehaviour5 ? true : z10;
                int width2 = constraintWidgetContainer.getWidth();
                ConstraintWidgetContainer constraintWidgetContainer3 = basicMeasure.f19199c;
                int iMax = Math.max(width2, constraintWidgetContainer3.getMinWidth());
                int iMax2 = Math.max(constraintWidgetContainer.getHeight(), constraintWidgetContainer3.getMinHeight());
                int i26 = 0;
                boolean zA = false;
                while (i26 < size3) {
                    ConstraintWidget constraintWidget3 = arrayList2.get(i26);
                    int i27 = optimizationLevel;
                    if (constraintWidget3 instanceof VirtualLayout) {
                        int width3 = constraintWidget3.getWidth();
                        int height2 = constraintWidget3.getHeight();
                        boolean zA2 = zA | basicMeasure.a(Measure.TRY_GIVEN_DIMENSIONS, constraintWidget3, measurer2);
                        Metrics metrics3 = constraintWidgetContainer2.mMetrics;
                        if (metrics3 != null) {
                            metrics3.measuredMatchWidgets++;
                        }
                        int width4 = constraintWidget3.getWidth();
                        int height3 = constraintWidget3.getHeight();
                        if (width4 != width3) {
                            constraintWidget3.setWidth(width4);
                            if (z19 && constraintWidget3.getRight() > iMax) {
                                iMax = Math.max(iMax, constraintWidget3.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin() + constraintWidget3.getRight());
                            }
                            zA2 = true;
                        }
                        if (height3 != height2) {
                            constraintWidget3.setHeight(height3);
                            if (z20 && constraintWidget3.getBottom() > iMax2) {
                                iMax2 = Math.max(iMax2, constraintWidget3.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin() + constraintWidget3.getBottom());
                            }
                            zA2 = true;
                        }
                        zA = ((VirtualLayout) constraintWidget3).needSolverPass() | zA2;
                    }
                    i26++;
                    basicMeasure = this;
                    constraintWidgetContainer2 = constraintWidgetContainer;
                    optimizationLevel = i27;
                    width = width;
                    height = height;
                }
                int i28 = width;
                int i29 = height;
                int i30 = optimizationLevel;
                int i31 = 0;
                int i32 = 2;
                while (true) {
                    if (i31 >= i32) {
                        constraintWidgetContainer2 = constraintWidgetContainer;
                        break;
                    }
                    int i33 = 0;
                    while (i33 < size3) {
                        ConstraintWidget constraintWidget4 = arrayList2.get(i33);
                        if (((constraintWidget4 instanceof Helper) && !(constraintWidget4 instanceof VirtualLayout)) || (constraintWidget4 instanceof Guideline) || constraintWidget4.getVisibility() == 8 || ((z18 && constraintWidget4.mHorizontalRun.f19238c.resolved && constraintWidget4.mVerticalRun.f19238c.resolved) || (constraintWidget4 instanceof VirtualLayout))) {
                            z11 = z18;
                            measurer = measurer2;
                            arrayList = arrayList2;
                            i21 = size3;
                        } else {
                            int width5 = constraintWidget4.getWidth();
                            int height4 = constraintWidget4.getHeight();
                            int baselineDistance = constraintWidget4.getBaselineDistance();
                            int i34 = Measure.TRY_GIVEN_DIMENSIONS;
                            if (i31 == 1) {
                                i34 = Measure.USE_GIVEN_DIMENSIONS;
                            }
                            int i35 = i34;
                            z11 = z18;
                            zA |= a(i35, constraintWidget4, measurer2);
                            measurer = measurer2;
                            Metrics metrics4 = constraintWidgetContainer.mMetrics;
                            arrayList = arrayList2;
                            i21 = size3;
                            if (metrics4 != null) {
                                metrics4.measuredMatchWidgets++;
                            }
                            int width6 = constraintWidget4.getWidth();
                            int height5 = constraintWidget4.getHeight();
                            if (width6 != width5) {
                                constraintWidget4.setWidth(width6);
                                if (z19 && constraintWidget4.getRight() > iMax) {
                                    iMax = Math.max(iMax, constraintWidget4.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin() + constraintWidget4.getRight());
                                }
                                zA = true;
                            }
                            if (height5 != height4) {
                                constraintWidget4.setHeight(height5);
                                if (z20 && constraintWidget4.getBottom() > iMax2) {
                                    iMax2 = Math.max(iMax2, constraintWidget4.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin() + constraintWidget4.getBottom());
                                }
                                zA = true;
                            }
                            if (constraintWidget4.hasBaseline() && baselineDistance != constraintWidget4.getBaselineDistance()) {
                                zA = true;
                            }
                        }
                        i33++;
                        arrayList2 = arrayList;
                        size3 = i21;
                        z18 = z11;
                        measurer2 = measurer;
                    }
                    constraintWidgetContainer2 = constraintWidgetContainer;
                    boolean z21 = z18;
                    Measurer measurer4 = measurer2;
                    ArrayList<ConstraintWidget> arrayList3 = arrayList2;
                    int i36 = size3;
                    if (!zA) {
                        break;
                    }
                    i31++;
                    b(constraintWidgetContainer2, i31, i28, i29);
                    arrayList2 = arrayList3;
                    size3 = i36;
                    z18 = z21;
                    measurer2 = measurer4;
                    i32 = 2;
                    zA = false;
                }
                i20 = i30;
            } else {
                i20 = optimizationLevel;
            }
            constraintWidgetContainer2.setOptimizationLevel(i20);
            j10 = jNanoTime;
        }
        return constraintWidgetContainer2.mMetrics != null ? System.nanoTime() - j10 : j10;
    }

    public void updateHierarchy(ConstraintWidgetContainer constraintWidgetContainer) {
        ArrayList<ConstraintWidget> arrayList = this.f19197a;
        arrayList.clear();
        int size = constraintWidgetContainer.mChildren.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i10);
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (horizontalDimensionBehaviour == dimensionBehaviour || constraintWidget.getVerticalDimensionBehaviour() == dimensionBehaviour) {
                arrayList.add(constraintWidget);
            }
        }
        constraintWidgetContainer.invalidateGraph();
    }
}
