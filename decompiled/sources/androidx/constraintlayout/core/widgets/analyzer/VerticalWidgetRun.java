package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;

/* JADX INFO: loaded from: classes.dex */
public class VerticalWidgetRun extends WidgetRun {
    public DependencyNode baseline;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.a f19220e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19221a;

        static {
            int[] iArr = new int[WidgetRun.b.values().length];
            f19221a = iArr;
            try {
                iArr[WidgetRun.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19221a[WidgetRun.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19221a[WidgetRun.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public VerticalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.baseline = dependencyNode;
        this.f19220e = null;
        this.start.f19211b = DependencyNode.a.TOP;
        this.end.f19211b = DependencyNode.a.BOTTOM;
        dependencyNode.f19211b = DependencyNode.a.BASELINE;
        this.orientation = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void a() {
        ConstraintWidget parent;
        ConstraintWidget parent2;
        ConstraintWidget constraintWidget = this.f19236a;
        boolean z10 = constraintWidget.measured;
        b bVar = this.f19238c;
        if (z10) {
            bVar.resolve(constraintWidget.getHeight());
        }
        if (!bVar.resolved) {
            this.mDimensionBehavior = this.f19236a.getVerticalDimensionBehaviour();
            if (this.f19236a.hasBaseline()) {
                this.f19220e = new androidx.constraintlayout.core.widgets.analyzer.a(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.mDimensionBehavior;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (parent2 = this.f19236a.getParent()) != null && parent2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int height = (parent2.getHeight() - this.f19236a.mTop.getMargin()) - this.f19236a.mBottom.getMargin();
                    addTarget(this.start, parent2.mVerticalRun.start, this.f19236a.mTop.getMargin());
                    addTarget(this.end, parent2.mVerticalRun.end, -this.f19236a.mBottom.getMargin());
                    bVar.resolve(height);
                    return;
                }
                if (this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.FIXED) {
                    bVar.resolve(this.f19236a.getHeight());
                }
            }
        } else if (this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (parent = this.f19236a.getParent()) != null && parent.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED) {
            addTarget(this.start, parent.mVerticalRun.start, this.f19236a.mTop.getMargin());
            addTarget(this.end, parent.mVerticalRun.end, -this.f19236a.mBottom.getMargin());
            return;
        }
        boolean z11 = bVar.resolved;
        if (z11) {
            ConstraintWidget constraintWidget2 = this.f19236a;
            if (constraintWidget2.measured) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.mListAnchors;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
                if (constraintAnchor2 != null && constraintAnchorArr[3].mTarget != null) {
                    if (constraintWidget2.isInVerticalChain()) {
                        this.start.f19212c = this.f19236a.mListAnchors[2].getMargin();
                        this.end.f19212c = -this.f19236a.mListAnchors[3].getMargin();
                    } else {
                        DependencyNode target = getTarget(this.f19236a.mListAnchors[2]);
                        if (target != null) {
                            addTarget(this.start, target, this.f19236a.mListAnchors[2].getMargin());
                        }
                        DependencyNode target2 = getTarget(this.f19236a.mListAnchors[3]);
                        if (target2 != null) {
                            addTarget(this.end, target2, -this.f19236a.mListAnchors[3].getMargin());
                        }
                        this.start.delegateToWidgetRun = true;
                        this.end.delegateToWidgetRun = true;
                    }
                    if (this.f19236a.hasBaseline()) {
                        addTarget(this.baseline, this.start, this.f19236a.getBaselineDistance());
                        return;
                    }
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode target3 = getTarget(constraintAnchor);
                    if (target3 != null) {
                        addTarget(this.start, target3, this.f19236a.mListAnchors[2].getMargin());
                        addTarget(this.end, this.start, bVar.value);
                        if (this.f19236a.hasBaseline()) {
                            addTarget(this.baseline, this.start, this.f19236a.getBaselineDistance());
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                if (constraintAnchor3.mTarget != null) {
                    DependencyNode target4 = getTarget(constraintAnchor3);
                    if (target4 != null) {
                        addTarget(this.end, target4, -this.f19236a.mListAnchors[3].getMargin());
                        addTarget(this.start, this.end, -bVar.value);
                    }
                    if (this.f19236a.hasBaseline()) {
                        addTarget(this.baseline, this.start, this.f19236a.getBaselineDistance());
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                if (constraintAnchor4.mTarget != null) {
                    DependencyNode target5 = getTarget(constraintAnchor4);
                    if (target5 != null) {
                        addTarget(this.baseline, target5, 0);
                        addTarget(this.start, this.baseline, -this.f19236a.getBaselineDistance());
                        addTarget(this.end, this.start, bVar.value);
                        return;
                    }
                    return;
                }
                if ((constraintWidget2 instanceof Helper) || constraintWidget2.getParent() == null || this.f19236a.getAnchor(ConstraintAnchor.Type.CENTER).mTarget != null) {
                    return;
                }
                addTarget(this.start, this.f19236a.getParent().mVerticalRun.start, this.f19236a.getY());
                addTarget(this.end, this.start, bVar.value);
                if (this.f19236a.hasBaseline()) {
                    addTarget(this.baseline, this.start, this.f19236a.getBaselineDistance());
                    return;
                }
                return;
            }
        }
        if (z11 || this.mDimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            bVar.addDependency(this);
        } else {
            ConstraintWidget constraintWidget3 = this.f19236a;
            int i10 = constraintWidget3.mMatchConstraintDefaultHeight;
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
            } else if (i10 == 3 && !constraintWidget3.isInVerticalChain()) {
                ConstraintWidget constraintWidget4 = this.f19236a;
                if (constraintWidget4.mMatchConstraintDefaultWidth != 3) {
                    b bVar3 = constraintWidget4.mHorizontalRun.f19238c;
                    bVar.f19216g.add(bVar3);
                    bVar3.f19215f.add(bVar);
                    bVar.delegateToWidgetRun = true;
                    bVar.f19215f.add(this.start);
                    bVar.f19215f.add(this.end);
                }
            }
        }
        ConstraintWidget constraintWidget5 = this.f19236a;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget5.mListAnchors;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.mTarget;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].mTarget != null) {
            if (constraintWidget5.isInVerticalChain()) {
                this.start.f19212c = this.f19236a.mListAnchors[2].getMargin();
                this.end.f19212c = -this.f19236a.mListAnchors[3].getMargin();
            } else {
                DependencyNode target6 = getTarget(this.f19236a.mListAnchors[2]);
                DependencyNode target7 = getTarget(this.f19236a.mListAnchors[3]);
                if (target6 != null) {
                    target6.addDependency(this);
                }
                if (target7 != null) {
                    target7.addDependency(this);
                }
                this.mRunType = WidgetRun.b.CENTER;
            }
            if (this.f19236a.hasBaseline()) {
                addTarget(this.baseline, this.start, 1, this.f19220e);
            }
        } else if (constraintAnchor6 != null) {
            DependencyNode target8 = getTarget(constraintAnchor5);
            if (target8 != null) {
                addTarget(this.start, target8, this.f19236a.mListAnchors[2].getMargin());
                addTarget(this.end, this.start, 1, bVar);
                if (this.f19236a.hasBaseline()) {
                    addTarget(this.baseline, this.start, 1, this.f19220e);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.mDimensionBehavior;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3 && this.f19236a.getDimensionRatio() > 0.0f) {
                    HorizontalWidgetRun horizontalWidgetRun = this.f19236a.mHorizontalRun;
                    if (horizontalWidgetRun.mDimensionBehavior == dimensionBehaviour3) {
                        horizontalWidgetRun.f19238c.f19215f.add(bVar);
                        bVar.f19216g.add(this.f19236a.mHorizontalRun.f19238c);
                        bVar.updateDelegate = this;
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.mTarget != null) {
                DependencyNode target9 = getTarget(constraintAnchor7);
                if (target9 != null) {
                    addTarget(this.end, target9, -this.f19236a.mListAnchors[3].getMargin());
                    addTarget(this.start, this.end, -1, bVar);
                    if (this.f19236a.hasBaseline()) {
                        addTarget(this.baseline, this.start, 1, this.f19220e);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.mTarget != null) {
                    DependencyNode target10 = getTarget(constraintAnchor8);
                    if (target10 != null) {
                        addTarget(this.baseline, target10, 0);
                        addTarget(this.start, this.baseline, -1, this.f19220e);
                        addTarget(this.end, this.start, 1, bVar);
                    }
                } else if (!(constraintWidget5 instanceof Helper) && constraintWidget5.getParent() != null) {
                    addTarget(this.start, this.f19236a.getParent().mVerticalRun.start, this.f19236a.getY());
                    addTarget(this.end, this.start, 1, bVar);
                    if (this.f19236a.hasBaseline()) {
                        addTarget(this.baseline, this.start, 1, this.f19220e);
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.mDimensionBehavior;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour5 && this.f19236a.getDimensionRatio() > 0.0f) {
                        HorizontalWidgetRun horizontalWidgetRun2 = this.f19236a.mHorizontalRun;
                        if (horizontalWidgetRun2.mDimensionBehavior == dimensionBehaviour5) {
                            horizontalWidgetRun2.f19238c.f19215f.add(bVar);
                            bVar.f19216g.add(this.f19236a.mHorizontalRun.f19238c);
                            bVar.updateDelegate = this;
                        }
                    }
                }
            }
        }
        if (bVar.f19216g.size() == 0) {
            bVar.readyToSolve = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.resolved) {
            this.f19236a.setY(dependencyNode.value);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void b() {
        this.f19237b = null;
        this.start.clear();
        this.end.clear();
        this.baseline.clear();
        this.f19238c.clear();
        this.f19239d = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean c() {
        return this.mDimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f19236a.mMatchConstraintDefaultHeight == 0;
    }

    public final void d() {
        this.f19239d = false;
        this.start.clear();
        this.start.resolved = false;
        this.end.clear();
        this.end.resolved = false;
        this.baseline.clear();
        this.baseline.resolved = false;
        this.f19238c.resolved = false;
    }

    public String toString() {
        return "VerticalRun " + this.f19236a.getDebugName();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        float f6;
        float dimensionRatio;
        int dimensionRatio2;
        int i10 = a.f19221a[this.mRunType.ordinal()];
        if (i10 == 1) {
            updateRunStart(dependency);
        } else if (i10 == 2) {
            updateRunEnd(dependency);
        } else if (i10 == 3) {
            ConstraintWidget constraintWidget = this.f19236a;
            updateRunCenter(dependency, constraintWidget.mTop, constraintWidget.mBottom, 1);
            return;
        }
        b bVar = this.f19238c;
        if (bVar.readyToSolve && !bVar.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.f19236a;
            int i11 = constraintWidget2.mMatchConstraintDefaultHeight;
            if (i11 == 2) {
                ConstraintWidget parent = constraintWidget2.getParent();
                if (parent != null) {
                    b bVar2 = parent.mVerticalRun.f19238c;
                    if (bVar2.resolved) {
                        bVar.resolve((int) ((bVar2.value * this.f19236a.mMatchConstraintPercentHeight) + 0.5f));
                    }
                }
            } else if (i11 == 3 && constraintWidget2.mHorizontalRun.f19238c.resolved) {
                int dimensionRatioSide = constraintWidget2.getDimensionRatioSide();
                if (dimensionRatioSide != -1) {
                    if (dimensionRatioSide == 0) {
                        ConstraintWidget constraintWidget3 = this.f19236a;
                        dimensionRatio2 = (int) ((constraintWidget3.getDimensionRatio() * constraintWidget3.mHorizontalRun.f19238c.value) + 0.5f);
                    } else if (dimensionRatioSide != 1) {
                        dimensionRatio2 = 0;
                    } else {
                        ConstraintWidget constraintWidget4 = this.f19236a;
                        f6 = constraintWidget4.mHorizontalRun.f19238c.value;
                        dimensionRatio = constraintWidget4.getDimensionRatio();
                    }
                    bVar.resolve(dimensionRatio2);
                } else {
                    ConstraintWidget constraintWidget5 = this.f19236a;
                    f6 = constraintWidget5.mHorizontalRun.f19238c.value;
                    dimensionRatio = constraintWidget5.getDimensionRatio();
                }
                dimensionRatio2 = (int) ((f6 / dimensionRatio) + 0.5f);
                bVar.resolve(dimensionRatio2);
            }
        }
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.readyToSolve) {
            DependencyNode dependencyNode2 = this.end;
            if (dependencyNode2.readyToSolve) {
                if (dependencyNode.resolved && dependencyNode2.resolved && bVar.resolved) {
                    return;
                }
                if (!bVar.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget6 = this.f19236a;
                    if (constraintWidget6.mMatchConstraintDefaultWidth == 0 && !constraintWidget6.isInVerticalChain()) {
                        DependencyNode dependencyNode3 = (DependencyNode) this.start.f19216g.get(0);
                        DependencyNode dependencyNode4 = (DependencyNode) this.end.f19216g.get(0);
                        int i12 = dependencyNode3.value;
                        DependencyNode dependencyNode5 = this.start;
                        int i13 = i12 + dependencyNode5.f19212c;
                        int i14 = dependencyNode4.value + this.end.f19212c;
                        dependencyNode5.resolve(i13);
                        this.end.resolve(i14);
                        bVar.resolve(i14 - i13);
                        return;
                    }
                }
                if (!bVar.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.matchConstraintsType == 1 && this.start.f19216g.size() > 0 && this.end.f19216g.size() > 0) {
                    DependencyNode dependencyNode6 = (DependencyNode) this.start.f19216g.get(0);
                    int i15 = (((DependencyNode) this.end.f19216g.get(0)).value + this.end.f19212c) - (dependencyNode6.value + this.start.f19212c);
                    int i16 = bVar.f19241h;
                    if (i15 < i16) {
                        bVar.resolve(i15);
                    } else {
                        bVar.resolve(i16);
                    }
                }
                if (bVar.resolved && this.start.f19216g.size() > 0 && this.end.f19216g.size() > 0) {
                    DependencyNode dependencyNode7 = (DependencyNode) this.start.f19216g.get(0);
                    DependencyNode dependencyNode8 = (DependencyNode) this.end.f19216g.get(0);
                    int i17 = dependencyNode7.value + this.start.f19212c;
                    int i18 = dependencyNode8.value + this.end.f19212c;
                    float verticalBiasPercent = this.f19236a.getVerticalBiasPercent();
                    if (dependencyNode7 == dependencyNode8) {
                        i17 = dependencyNode7.value;
                        i18 = dependencyNode8.value;
                        verticalBiasPercent = 0.5f;
                    }
                    this.start.resolve((int) ((((i18 - i17) - bVar.value) * verticalBiasPercent) + i17 + 0.5f));
                    this.end.resolve(this.start.value + bVar.value);
                }
            }
        }
    }
}
