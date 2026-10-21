package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class HorizontalWidgetRun extends WidgetRun {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f19218e = new int[2];

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19219a;

        static {
            int[] iArr = new int[WidgetRun.b.values().length];
            f19219a = iArr;
            try {
                iArr[WidgetRun.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19219a[WidgetRun.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19219a[WidgetRun.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public HorizontalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.start.f19211b = DependencyNode.a.LEFT;
        this.end.f19211b = DependencyNode.a.RIGHT;
        this.orientation = 0;
    }

    public static void d(int[] iArr, int i10, int i11, int i12, int i13, float f6, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f6) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f6) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f6) + 0.5f);
        int i18 = (int) ((i15 / f6) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void a() {
        ConstraintWidget parent;
        ConstraintWidget parent2;
        ConstraintWidget constraintWidget = this.f19236a;
        boolean z10 = constraintWidget.measured;
        b bVar = this.f19238c;
        if (z10) {
            bVar.resolve(constraintWidget.getWidth());
        }
        if (bVar.resolved) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.mDimensionBehavior;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour == dimensionBehaviour2 && (parent = this.f19236a.getParent()) != null && (parent.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED || parent.getHorizontalDimensionBehaviour() == dimensionBehaviour2)) {
                addTarget(this.start, parent.mHorizontalRun.start, this.f19236a.mLeft.getMargin());
                addTarget(this.end, parent.mHorizontalRun.end, -this.f19236a.mRight.getMargin());
                return;
            }
        } else {
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = this.f19236a.getHorizontalDimensionBehaviour();
            this.mDimensionBehavior = horizontalDimensionBehaviour;
            if (horizontalDimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (horizontalDimensionBehaviour == dimensionBehaviour3 && (parent2 = this.f19236a.getParent()) != null && (parent2.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED || parent2.getHorizontalDimensionBehaviour() == dimensionBehaviour3)) {
                    int width = (parent2.getWidth() - this.f19236a.mLeft.getMargin()) - this.f19236a.mRight.getMargin();
                    addTarget(this.start, parent2.mHorizontalRun.start, this.f19236a.mLeft.getMargin());
                    addTarget(this.end, parent2.mHorizontalRun.end, -this.f19236a.mRight.getMargin());
                    bVar.resolve(width);
                    return;
                }
                if (this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.FIXED) {
                    bVar.resolve(this.f19236a.getWidth());
                }
            }
        }
        if (bVar.resolved) {
            ConstraintWidget constraintWidget2 = this.f19236a;
            if (constraintWidget2.measured) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.mListAnchors;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
                if (constraintAnchor2 != null && constraintAnchorArr[1].mTarget != null) {
                    if (constraintWidget2.isInHorizontalChain()) {
                        this.start.f19212c = this.f19236a.mListAnchors[0].getMargin();
                        this.end.f19212c = -this.f19236a.mListAnchors[1].getMargin();
                        return;
                    }
                    DependencyNode target = getTarget(this.f19236a.mListAnchors[0]);
                    if (target != null) {
                        addTarget(this.start, target, this.f19236a.mListAnchors[0].getMargin());
                    }
                    DependencyNode target2 = getTarget(this.f19236a.mListAnchors[1]);
                    if (target2 != null) {
                        addTarget(this.end, target2, -this.f19236a.mListAnchors[1].getMargin());
                    }
                    this.start.delegateToWidgetRun = true;
                    this.end.delegateToWidgetRun = true;
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode target3 = getTarget(constraintAnchor);
                    if (target3 != null) {
                        addTarget(this.start, target3, this.f19236a.mListAnchors[0].getMargin());
                        addTarget(this.end, this.start, bVar.value);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                if (constraintAnchor3.mTarget != null) {
                    DependencyNode target4 = getTarget(constraintAnchor3);
                    if (target4 != null) {
                        addTarget(this.end, target4, -this.f19236a.mListAnchors[1].getMargin());
                        addTarget(this.start, this.end, -bVar.value);
                        return;
                    }
                    return;
                }
                if ((constraintWidget2 instanceof Helper) || constraintWidget2.getParent() == null || this.f19236a.getAnchor(ConstraintAnchor.Type.CENTER).mTarget != null) {
                    return;
                }
                addTarget(this.start, this.f19236a.getParent().mHorizontalRun.start, this.f19236a.getX());
                addTarget(this.end, this.start, bVar.value);
                return;
            }
        }
        if (this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.f19236a;
            int i10 = constraintWidget3.mMatchConstraintDefaultWidth;
            if (i10 == 2) {
                ConstraintWidget parent3 = constraintWidget3.getParent();
                if (parent3 != null) {
                    b bVar2 = parent3.mVerticalRun.f19238c;
                    bVar.f19216g.add(bVar2);
                    bVar2.f19215f.add(bVar);
                    bVar.delegateToWidgetRun = true;
                    bVar.f19215f.add(this.start);
                    bVar.f19215f.add(this.end);
                }
            } else if (i10 == 3) {
                if (constraintWidget3.mMatchConstraintDefaultHeight == 3) {
                    this.start.updateDelegate = this;
                    this.end.updateDelegate = this;
                    VerticalWidgetRun verticalWidgetRun = constraintWidget3.mVerticalRun;
                    verticalWidgetRun.start.updateDelegate = this;
                    verticalWidgetRun.end.updateDelegate = this;
                    bVar.updateDelegate = this;
                    if (constraintWidget3.isInVerticalChain()) {
                        bVar.f19216g.add(this.f19236a.mVerticalRun.f19238c);
                        this.f19236a.mVerticalRun.f19238c.f19215f.add(bVar);
                        VerticalWidgetRun verticalWidgetRun2 = this.f19236a.mVerticalRun;
                        verticalWidgetRun2.f19238c.updateDelegate = this;
                        bVar.f19216g.add(verticalWidgetRun2.start);
                        bVar.f19216g.add(this.f19236a.mVerticalRun.end);
                        this.f19236a.mVerticalRun.start.f19215f.add(bVar);
                        this.f19236a.mVerticalRun.end.f19215f.add(bVar);
                    } else if (this.f19236a.isInHorizontalChain()) {
                        this.f19236a.mVerticalRun.f19238c.f19216g.add(bVar);
                        bVar.f19215f.add(this.f19236a.mVerticalRun.f19238c);
                    } else {
                        this.f19236a.mVerticalRun.f19238c.f19216g.add(bVar);
                    }
                } else {
                    b bVar3 = constraintWidget3.mVerticalRun.f19238c;
                    bVar.f19216g.add(bVar3);
                    bVar3.f19215f.add(bVar);
                    this.f19236a.mVerticalRun.start.f19215f.add(bVar);
                    this.f19236a.mVerticalRun.end.f19215f.add(bVar);
                    bVar.delegateToWidgetRun = true;
                    bVar.f19215f.add(this.start);
                    bVar.f19215f.add(this.end);
                    this.start.f19216g.add(bVar);
                    this.end.f19216g.add(bVar);
                }
            }
        }
        ConstraintWidget constraintWidget4 = this.f19236a;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget4.mListAnchors;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.mTarget;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].mTarget != null) {
            if (constraintWidget4.isInHorizontalChain()) {
                this.start.f19212c = this.f19236a.mListAnchors[0].getMargin();
                this.end.f19212c = -this.f19236a.mListAnchors[1].getMargin();
                return;
            }
            DependencyNode target5 = getTarget(this.f19236a.mListAnchors[0]);
            DependencyNode target6 = getTarget(this.f19236a.mListAnchors[1]);
            if (target5 != null) {
                target5.addDependency(this);
            }
            if (target6 != null) {
                target6.addDependency(this);
            }
            this.mRunType = WidgetRun.b.CENTER;
            return;
        }
        if (constraintAnchor5 != null) {
            DependencyNode target7 = getTarget(constraintAnchor4);
            if (target7 != null) {
                addTarget(this.start, target7, this.f19236a.mListAnchors[0].getMargin());
                addTarget(this.end, this.start, 1, bVar);
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
        if (constraintAnchor6.mTarget != null) {
            DependencyNode target8 = getTarget(constraintAnchor6);
            if (target8 != null) {
                addTarget(this.end, target8, -this.f19236a.mListAnchors[1].getMargin());
                addTarget(this.start, this.end, -1, bVar);
                return;
            }
            return;
        }
        if ((constraintWidget4 instanceof Helper) || constraintWidget4.getParent() == null) {
            return;
        }
        addTarget(this.start, this.f19236a.getParent().mHorizontalRun.start, this.f19236a.getX());
        addTarget(this.end, this.start, 1, bVar);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.resolved) {
            this.f19236a.setX(dependencyNode.value);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void b() {
        this.f19237b = null;
        this.start.clear();
        this.end.clear();
        this.f19238c.clear();
        this.f19239d = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean c() {
        return this.mDimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f19236a.mMatchConstraintDefaultWidth == 0;
    }

    public final void e() {
        this.f19239d = false;
        this.start.clear();
        this.start.resolved = false;
        this.end.clear();
        this.end.resolved = false;
        this.f19238c.resolved = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f19236a.getDebugName();
    }

    /* JADX WARN: Code duplicated, block: B:124:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d3  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        int limitedDimension;
        int i10;
        int limitedDimension2;
        float f6;
        float dimensionRatio;
        int dimensionRatio2;
        int i11 = a.f19219a[this.mRunType.ordinal()];
        if (i11 == 1) {
            updateRunStart(dependency);
        } else if (i11 == 2) {
            updateRunEnd(dependency);
        } else if (i11 == 3) {
            ConstraintWidget constraintWidget = this.f19236a;
            updateRunCenter(dependency, constraintWidget.mLeft, constraintWidget.mRight, 0);
            return;
        }
        b bVar = this.f19238c;
        if (!bVar.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.f19236a;
            int i12 = constraintWidget2.mMatchConstraintDefaultWidth;
            if (i12 == 2) {
                ConstraintWidget parent = constraintWidget2.getParent();
                if (parent != null) {
                    b bVar2 = parent.mHorizontalRun.f19238c;
                    if (bVar2.resolved) {
                        bVar.resolve((int) ((bVar2.value * this.f19236a.mMatchConstraintPercentWidth) + 0.5f));
                    }
                }
            } else if (i12 == 3) {
                int i13 = constraintWidget2.mMatchConstraintDefaultHeight;
                if (i13 == 0 || i13 == 3) {
                    VerticalWidgetRun verticalWidgetRun = constraintWidget2.mVerticalRun;
                    DependencyNode dependencyNode = verticalWidgetRun.start;
                    DependencyNode dependencyNode2 = verticalWidgetRun.end;
                    boolean z10 = constraintWidget2.mLeft.mTarget != null;
                    boolean z11 = constraintWidget2.mTop.mTarget != null;
                    boolean z12 = constraintWidget2.mRight.mTarget != null;
                    boolean z13 = constraintWidget2.mBottom.mTarget != null;
                    int dimensionRatioSide = constraintWidget2.getDimensionRatioSide();
                    if (z10 && z11 && z12 && z13) {
                        float dimensionRatio3 = this.f19236a.getDimensionRatio();
                        boolean z14 = dependencyNode.resolved;
                        int[] iArr = f19218e;
                        if (z14 && dependencyNode2.resolved) {
                            DependencyNode dependencyNode3 = this.start;
                            if (dependencyNode3.readyToSolve && this.end.readyToSolve) {
                                d(iArr, ((DependencyNode) dependencyNode3.f19216g.get(0)).value + this.start.f19212c, ((DependencyNode) this.end.f19216g.get(0)).value - this.end.f19212c, dependencyNode.value + dependencyNode.f19212c, dependencyNode2.value - dependencyNode2.f19212c, dimensionRatio3, dimensionRatioSide);
                                bVar.resolve(iArr[0]);
                                this.f19236a.mVerticalRun.f19238c.resolve(iArr[1]);
                                return;
                            }
                            return;
                        }
                        DependencyNode dependencyNode4 = this.start;
                        boolean z15 = dependencyNode4.resolved;
                        ArrayList arrayList = dependencyNode.f19216g;
                        if (z15) {
                            DependencyNode dependencyNode5 = this.end;
                            if (dependencyNode5.resolved) {
                                if (!dependencyNode.readyToSolve || !dependencyNode2.readyToSolve) {
                                    return;
                                }
                                d(iArr, dependencyNode4.value + dependencyNode4.f19212c, dependencyNode5.value - dependencyNode5.f19212c, ((DependencyNode) arrayList.get(0)).value + dependencyNode.f19212c, ((DependencyNode) dependencyNode2.f19216g.get(0)).value - dependencyNode2.f19212c, dimensionRatio3, dimensionRatioSide);
                                bVar.resolve(iArr[0]);
                                this.f19236a.mVerticalRun.f19238c.resolve(iArr[1]);
                            }
                        }
                        DependencyNode dependencyNode6 = this.start;
                        if (!dependencyNode6.readyToSolve || !this.end.readyToSolve || !dependencyNode.readyToSolve || !dependencyNode2.readyToSolve) {
                            return;
                        }
                        d(iArr, ((DependencyNode) dependencyNode6.f19216g.get(0)).value + this.start.f19212c, ((DependencyNode) this.end.f19216g.get(0)).value - this.end.f19212c, ((DependencyNode) arrayList.get(0)).value + dependencyNode.f19212c, ((DependencyNode) dependencyNode2.f19216g.get(0)).value - dependencyNode2.f19212c, dimensionRatio3, dimensionRatioSide);
                        bVar.resolve(iArr[0]);
                        this.f19236a.mVerticalRun.f19238c.resolve(iArr[1]);
                    } else if (z10 && z12) {
                        if (!this.start.readyToSolve || !this.end.readyToSolve) {
                            return;
                        }
                        float dimensionRatio4 = this.f19236a.getDimensionRatio();
                        int i14 = ((DependencyNode) this.start.f19216g.get(0)).value + this.start.f19212c;
                        int i15 = ((DependencyNode) this.end.f19216g.get(0)).value - this.end.f19212c;
                        if (dimensionRatioSide == -1 || dimensionRatioSide == 0) {
                            int limitedDimension3 = getLimitedDimension(i15 - i14, 0);
                            int i16 = (int) ((limitedDimension3 * dimensionRatio4) + 0.5f);
                            int limitedDimension4 = getLimitedDimension(i16, 1);
                            if (i16 != limitedDimension4) {
                                limitedDimension3 = (int) ((limitedDimension4 / dimensionRatio4) + 0.5f);
                            }
                            bVar.resolve(limitedDimension3);
                            this.f19236a.mVerticalRun.f19238c.resolve(limitedDimension4);
                        } else if (dimensionRatioSide == 1) {
                            int limitedDimension5 = getLimitedDimension(i15 - i14, 0);
                            int i17 = (int) ((limitedDimension5 / dimensionRatio4) + 0.5f);
                            int limitedDimension6 = getLimitedDimension(i17, 1);
                            if (i17 != limitedDimension6) {
                                limitedDimension5 = (int) ((limitedDimension6 * dimensionRatio4) + 0.5f);
                            }
                            bVar.resolve(limitedDimension5);
                            this.f19236a.mVerticalRun.f19238c.resolve(limitedDimension6);
                        }
                    } else if (z11 && z13) {
                        if (!dependencyNode.readyToSolve || !dependencyNode2.readyToSolve) {
                            return;
                        }
                        float dimensionRatio5 = this.f19236a.getDimensionRatio();
                        int i18 = ((DependencyNode) dependencyNode.f19216g.get(0)).value + dependencyNode.f19212c;
                        int i19 = ((DependencyNode) dependencyNode2.f19216g.get(0)).value - dependencyNode2.f19212c;
                        if (dimensionRatioSide == -1) {
                            limitedDimension = getLimitedDimension(i19 - i18, 1);
                            i10 = (int) ((limitedDimension / dimensionRatio5) + 0.5f);
                            limitedDimension2 = getLimitedDimension(i10, 0);
                            if (i10 != limitedDimension2) {
                                limitedDimension = (int) ((limitedDimension2 * dimensionRatio5) + 0.5f);
                            }
                            bVar.resolve(limitedDimension2);
                            this.f19236a.mVerticalRun.f19238c.resolve(limitedDimension);
                        } else if (dimensionRatioSide == 0) {
                            int limitedDimension7 = getLimitedDimension(i19 - i18, 1);
                            int i20 = (int) ((limitedDimension7 * dimensionRatio5) + 0.5f);
                            int limitedDimension8 = getLimitedDimension(i20, 0);
                            if (i20 != limitedDimension8) {
                                limitedDimension7 = (int) ((limitedDimension8 / dimensionRatio5) + 0.5f);
                            }
                            bVar.resolve(limitedDimension8);
                            this.f19236a.mVerticalRun.f19238c.resolve(limitedDimension7);
                        } else if (dimensionRatioSide == 1) {
                            limitedDimension = getLimitedDimension(i19 - i18, 1);
                            i10 = (int) ((limitedDimension / dimensionRatio5) + 0.5f);
                            limitedDimension2 = getLimitedDimension(i10, 0);
                            if (i10 != limitedDimension2) {
                                limitedDimension = (int) ((limitedDimension2 * dimensionRatio5) + 0.5f);
                            }
                            bVar.resolve(limitedDimension2);
                            this.f19236a.mVerticalRun.f19238c.resolve(limitedDimension);
                        }
                    }
                } else {
                    int dimensionRatioSide2 = constraintWidget2.getDimensionRatioSide();
                    if (dimensionRatioSide2 != -1) {
                        if (dimensionRatioSide2 == 0) {
                            ConstraintWidget constraintWidget3 = this.f19236a;
                            dimensionRatio2 = (int) ((constraintWidget3.mVerticalRun.f19238c.value / constraintWidget3.getDimensionRatio()) + 0.5f);
                        } else if (dimensionRatioSide2 != 1) {
                            dimensionRatio2 = 0;
                        } else {
                            ConstraintWidget constraintWidget4 = this.f19236a;
                            f6 = constraintWidget4.mVerticalRun.f19238c.value;
                            dimensionRatio = constraintWidget4.getDimensionRatio();
                        }
                        bVar.resolve(dimensionRatio2);
                    } else {
                        ConstraintWidget constraintWidget5 = this.f19236a;
                        f6 = constraintWidget5.mVerticalRun.f19238c.value;
                        dimensionRatio = constraintWidget5.getDimensionRatio();
                    }
                    dimensionRatio2 = (int) ((dimensionRatio * f6) + 0.5f);
                    bVar.resolve(dimensionRatio2);
                }
            }
        }
        DependencyNode dependencyNode7 = this.start;
        if (dependencyNode7.readyToSolve) {
            DependencyNode dependencyNode8 = this.end;
            if (dependencyNode8.readyToSolve) {
                if (dependencyNode7.resolved && dependencyNode8.resolved && bVar.resolved) {
                    return;
                }
                if (!bVar.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget6 = this.f19236a;
                    if (constraintWidget6.mMatchConstraintDefaultWidth == 0 && !constraintWidget6.isInHorizontalChain()) {
                        DependencyNode dependencyNode9 = (DependencyNode) this.start.f19216g.get(0);
                        DependencyNode dependencyNode10 = (DependencyNode) this.end.f19216g.get(0);
                        int i21 = dependencyNode9.value;
                        DependencyNode dependencyNode11 = this.start;
                        int i22 = i21 + dependencyNode11.f19212c;
                        int i23 = dependencyNode10.value + this.end.f19212c;
                        dependencyNode11.resolve(i22);
                        this.end.resolve(i23);
                        bVar.resolve(i23 - i22);
                        return;
                    }
                }
                if (!bVar.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.matchConstraintsType == 1 && this.start.f19216g.size() > 0 && this.end.f19216g.size() > 0) {
                    int iMin = Math.min((((DependencyNode) this.end.f19216g.get(0)).value + this.end.f19212c) - (((DependencyNode) this.start.f19216g.get(0)).value + this.start.f19212c), bVar.f19241h);
                    ConstraintWidget constraintWidget7 = this.f19236a;
                    int i24 = constraintWidget7.mMatchConstraintMaxWidth;
                    int iMax = Math.max(constraintWidget7.mMatchConstraintMinWidth, iMin);
                    if (i24 > 0) {
                        iMax = Math.min(i24, iMax);
                    }
                    bVar.resolve(iMax);
                }
                if (bVar.resolved) {
                    DependencyNode dependencyNode12 = (DependencyNode) this.start.f19216g.get(0);
                    DependencyNode dependencyNode13 = (DependencyNode) this.end.f19216g.get(0);
                    int i25 = dependencyNode12.value + this.start.f19212c;
                    int i26 = dependencyNode13.value + this.end.f19212c;
                    float horizontalBiasPercent = this.f19236a.getHorizontalBiasPercent();
                    if (dependencyNode12 == dependencyNode13) {
                        i25 = dependencyNode12.value;
                        i26 = dependencyNode13.value;
                        horizontalBiasPercent = 0.5f;
                    }
                    this.start.resolve((int) ((((i26 - i25) - bVar.value) * horizontalBiasPercent) + i25 + 0.5f));
                    this.end.resolve(this.start.value + bVar.value);
                }
            }
        }
    }
}
