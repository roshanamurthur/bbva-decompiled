package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.core.widgets.analyzer.DependencyGraph;
import androidx.constraintlayout.core.widgets.analyzer.Direct;
import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidgetContainer extends WidgetContainer {
    public final BasicMeasure J;
    public int K;
    public boolean L;
    public int M;
    public int N;
    public ChainHead[] O;
    public ChainHead[] P;
    public int Q;
    public boolean R;
    public boolean S;
    public WeakReference<ConstraintAnchor> T;
    public WeakReference<ConstraintAnchor> U;
    public WeakReference<ConstraintAnchor> V;
    public WeakReference<ConstraintAnchor> W;
    public final HashSet<ConstraintWidget> X;
    public DependencyGraph mDependencyGraph;
    public boolean mGroupsWrapOptimized;
    public int mHorizontalChainsSize;
    public boolean mHorizontalWrapOptimized;
    public BasicMeasure.Measure mMeasure;
    protected BasicMeasure.Measurer mMeasurer;
    public Metrics mMetrics;
    public boolean mSkipSolver;
    protected LinearSystem mSystem;
    public int mVerticalChainsSize;
    public boolean mVerticalWrapOptimized;
    public int mWrapFixedHeight;
    public int mWrapFixedWidth;

    public ConstraintWidgetContainer() {
        this.J = new BasicMeasure(this);
        this.mDependencyGraph = new DependencyGraph(this);
        this.mMeasurer = null;
        this.L = false;
        this.mSystem = new LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.O = new ChainHead[4];
        this.P = new ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.Q = 257;
        this.mSkipSolver = false;
        this.R = false;
        this.S = false;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = new HashSet<>();
        this.mMeasure = new BasicMeasure.Measure();
    }

    public boolean addChildrenToSolver(LinearSystem linearSystem) {
        boolean zOptimizeFor = optimizeFor(64);
        addToSolver(linearSystem, zOptimizeFor);
        int size = this.mChildren.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.mChildren.get(i10);
            constraintWidget.setInBarrier(0, false);
            constraintWidget.setInBarrier(1, false);
            if (constraintWidget instanceof Barrier) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                ConstraintWidget constraintWidget2 = this.mChildren.get(i11);
                if (constraintWidget2 instanceof Barrier) {
                    ((Barrier) constraintWidget2).markWidgets();
                }
            }
        }
        HashSet<ConstraintWidget> hashSet = this.X;
        hashSet.clear();
        for (int i12 = 0; i12 < size; i12++) {
            ConstraintWidget constraintWidget3 = this.mChildren.get(i12);
            constraintWidget3.getClass();
            boolean z11 = constraintWidget3 instanceof VirtualLayout;
            if (z11 || (constraintWidget3 instanceof Guideline)) {
                if (z11) {
                    hashSet.add(constraintWidget3);
                } else {
                    constraintWidget3.addToSolver(linearSystem, zOptimizeFor);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<ConstraintWidget> it = hashSet.iterator();
            while (it.hasNext()) {
                VirtualLayout virtualLayout = (VirtualLayout) it.next();
                if (virtualLayout.contains(hashSet)) {
                    virtualLayout.addToSolver(linearSystem, zOptimizeFor);
                    hashSet.remove(virtualLayout);
                    break;
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<ConstraintWidget> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().addToSolver(linearSystem, zOptimizeFor);
                }
                hashSet.clear();
            }
        }
        if (LinearSystem.USE_DEPENDENCY_ORDERING) {
            HashSet<ConstraintWidget> hashSet2 = new HashSet<>();
            for (int i13 = 0; i13 < size; i13++) {
                ConstraintWidget constraintWidget4 = this.mChildren.get(i13);
                constraintWidget4.getClass();
                if (!(constraintWidget4 instanceof VirtualLayout) && !(constraintWidget4 instanceof Guideline)) {
                    hashSet2.add(constraintWidget4);
                }
            }
            addChildrenToSolverByDependency(this, linearSystem, hashSet2, getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            for (ConstraintWidget constraintWidget5 : hashSet2) {
                Optimizer.a(this, linearSystem, constraintWidget5);
                constraintWidget5.addToSolver(linearSystem, zOptimizeFor);
            }
        } else {
            for (int i14 = 0; i14 < size; i14++) {
                ConstraintWidget constraintWidget6 = this.mChildren.get(i14);
                if (constraintWidget6 instanceof ConstraintWidgetContainer) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.mListDimensionBehaviors;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget6.addToSolver(linearSystem, zOptimizeFor);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.setHorizontalDimensionBehaviour(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.setVerticalDimensionBehaviour(dimensionBehaviour2);
                    }
                } else {
                    Optimizer.a(this, linearSystem, constraintWidget6);
                    if (!(constraintWidget6 instanceof VirtualLayout) && !(constraintWidget6 instanceof Guideline)) {
                        constraintWidget6.addToSolver(linearSystem, zOptimizeFor);
                    }
                }
            }
        }
        if (this.mHorizontalChainsSize > 0) {
            Chain.applyChainConstraints(this, linearSystem, null, 0);
        }
        if (this.mVerticalChainsSize > 0) {
            Chain.applyChainConstraints(this, linearSystem, null, 1);
        }
        return true;
    }

    public void addHorizontalWrapMaxVariable(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.W;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.getFinalValue() > this.W.get().getFinalValue()) {
            this.W = new WeakReference<>(constraintAnchor);
        }
    }

    public void addHorizontalWrapMinVariable(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.U;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.getFinalValue() > this.U.get().getFinalValue()) {
            this.U = new WeakReference<>(constraintAnchor);
        }
    }

    public void defineTerminalWidgets() {
        this.mDependencyGraph.defineTerminalWidgets(getHorizontalDimensionBehaviour(), getVerticalDimensionBehaviour());
    }

    public boolean directMeasure(boolean z10) {
        return this.mDependencyGraph.directMeasure(z10);
    }

    public boolean directMeasureSetup(boolean z10) {
        return this.mDependencyGraph.directMeasureSetup(z10);
    }

    public boolean directMeasureWithOrientation(boolean z10, int i10) {
        return this.mDependencyGraph.directMeasureWithOrientation(z10, i10);
    }

    public void fillMetrics(Metrics metrics) {
        this.mMetrics = metrics;
        this.mSystem.fillMetrics(metrics);
    }

    public ArrayList<Guideline> getHorizontalGuidelines() {
        ArrayList<Guideline> arrayList = new ArrayList<>();
        int size = this.mChildren.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.mChildren.get(i10);
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                if (guideline.getOrientation() == 0) {
                    arrayList.add(guideline);
                }
            }
        }
        return arrayList;
    }

    public BasicMeasure.Measurer getMeasurer() {
        return this.mMeasurer;
    }

    public int getOptimizationLevel() {
        return this.Q;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void getSceneString(StringBuilder sb2) {
        sb2.append(this.stringId + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.f19153u);
        sb2.append(sb3.toString());
        sb2.append(RootService.LINE_BREAK);
        sb2.append("  actualHeight:" + this.f19154v);
        sb2.append(RootService.LINE_BREAK);
        Iterator<ConstraintWidget> it = getChildren().iterator();
        while (it.hasNext()) {
            it.next().getSceneString(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    public LinearSystem getSystem() {
        return this.mSystem;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String getType() {
        return "ConstraintLayout";
    }

    public ArrayList<Guideline> getVerticalGuidelines() {
        ArrayList<Guideline> arrayList = new ArrayList<>();
        int size = this.mChildren.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.mChildren.get(i10);
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                if (guideline.getOrientation() == 1) {
                    arrayList.add(guideline);
                }
            }
        }
        return arrayList;
    }

    public boolean handlesInternalConstraints() {
        return false;
    }

    public void invalidateGraph() {
        this.mDependencyGraph.invalidateGraph();
    }

    public void invalidateMeasures() {
        this.mDependencyGraph.invalidateMeasures();
    }

    public boolean isHeightMeasuredTooSmall() {
        return this.S;
    }

    public boolean isRtl() {
        return this.L;
    }

    public boolean isWidthMeasuredTooSmall() {
        return this.R;
    }

    public final void k(ConstraintWidget constraintWidget, int i10) {
        if (i10 == 0) {
            int i11 = this.mHorizontalChainsSize + 1;
            ChainHead[] chainHeadArr = this.P;
            if (i11 >= chainHeadArr.length) {
                this.P = (ChainHead[]) Arrays.copyOf(chainHeadArr, chainHeadArr.length * 2);
            }
            this.P[this.mHorizontalChainsSize] = new ChainHead(constraintWidget, 0, isRtl());
            this.mHorizontalChainsSize++;
            return;
        }
        if (i10 == 1) {
            int i12 = this.mVerticalChainsSize + 1;
            ChainHead[] chainHeadArr2 = this.O;
            if (i12 >= chainHeadArr2.length) {
                this.O = (ChainHead[]) Arrays.copyOf(chainHeadArr2, chainHeadArr2.length * 2);
            }
            this.O[this.mVerticalChainsSize] = new ChainHead(constraintWidget, 1, isRtl());
            this.mVerticalChainsSize++;
        }
    }

    public final void l(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.V;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.getFinalValue() > this.V.get().getFinalValue()) {
            this.V = new WeakReference<>(constraintAnchor);
        }
    }

    /* JADX WARN: Code duplicated, block: B:161:0x033b A[PHI: r0 r2
      0x033b: PHI (r0v20 ??) = (r0v19 ??), (r0v24 ??), (r0v24 ??), (r0v24 ??) binds: [B:148:0x02fd, B:156:0x0321, B:157:0x0323, B:159:0x0329] A[DONT_GENERATE, DONT_INLINE]
      0x033b: PHI (r2v15 boolean) = (r2v14 boolean), (r2v19 boolean), (r2v19 boolean), (r2v19 boolean) binds: [B:148:0x02fd, B:156:0x0321, B:157:0x0323, B:159:0x0329] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v13 */
    @Override // androidx.constraintlayout.core.widgets.WidgetContainer
    public void layout() {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        ?? AddChildrenToSolver;
        boolean zUpdateChildrenFromSolver;
        boolean z12;
        ?? r10;
        ?? r1;
        boolean z13;
        boolean z14;
        ?? r3;
        int i12;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i13 = 0;
        this.mX = 0;
        this.mY = 0;
        this.R = false;
        this.S = false;
        int size = this.mChildren.size();
        int iMax = Math.max(0, getWidth());
        int iMax2 = Math.max(0, getHeight());
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
        Metrics metrics = this.mMetrics;
        if (metrics != null) {
            metrics.layouts++;
        }
        if (this.K == 0 && Optimizer.enabled(this.Q, 1)) {
            Direct.solvingPass(this, getMeasurer());
            for (int i14 = 0; i14 < size; i14++) {
                ConstraintWidget constraintWidget = this.mChildren.get(i14);
                if (constraintWidget.isMeasureRequested() && !(constraintWidget instanceof Guideline) && !(constraintWidget instanceof Barrier) && !(constraintWidget instanceof VirtualLayout) && !constraintWidget.isInVirtualLayout()) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidget.getDimensionBehaviour(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = constraintWidget.getDimensionBehaviour(1);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 != dimensionBehaviour6 || constraintWidget.mMatchConstraintDefaultWidth == 1 || dimensionBehaviour5 != dimensionBehaviour6 || constraintWidget.mMatchConstraintDefaultHeight == 1) {
                        measure(0, constraintWidget, this.mMeasurer, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
                    }
                }
            }
        }
        if (size <= 2 || !((dimensionBehaviour3 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour2 == dimensionBehaviour) && Optimizer.enabled(this.Q, 1024) && Grouping.simpleSolvingPass(this, getMeasurer()))) {
            i10 = iMax2;
            i11 = iMax;
            z10 = false;
        } else {
            if (dimensionBehaviour3 == dimensionBehaviour) {
                if (iMax >= getWidth() || iMax <= 0) {
                    iMax = getWidth();
                } else {
                    setWidth(iMax);
                    this.R = true;
                }
            }
            if (dimensionBehaviour2 == dimensionBehaviour) {
                if (iMax2 >= getHeight() || iMax2 <= 0) {
                    iMax2 = getHeight();
                } else {
                    setHeight(iMax2);
                    this.S = true;
                }
            }
            i10 = iMax2;
            i11 = iMax;
            z10 = true;
        }
        boolean z15 = optimizeFor(64) || optimizeFor(128);
        LinearSystem linearSystem = this.mSystem;
        linearSystem.graphOptimizer = false;
        linearSystem.newgraphOptimizer = false;
        if (this.Q != 0 && z15) {
            linearSystem.newgraphOptimizer = true;
        }
        ArrayList<ConstraintWidget> arrayList = this.mChildren;
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z16 = horizontalDimensionBehaviour == dimensionBehaviour7 || getVerticalDimensionBehaviour() == dimensionBehaviour7;
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        for (int i15 = 0; i15 < size; i15++) {
            ConstraintWidget constraintWidget2 = this.mChildren.get(i15);
            if (constraintWidget2 instanceof WidgetContainer) {
                ((WidgetContainer) constraintWidget2).layout();
            }
        }
        boolean zOptimizeFor = optimizeFor(64);
        boolean z17 = z10;
        int i16 = 0;
        ?? r14 = 1;
        while (r14 != 0) {
            int i17 = i16 + 1;
            try {
                this.mSystem.reset();
                this.mHorizontalChainsSize = i13;
                this.mVerticalChainsSize = i13;
                createObjectVariables(this.mSystem);
                for (int i18 = i13; i18 < size; i18++) {
                    this.mChildren.get(i18).createObjectVariables(this.mSystem);
                }
                AddChildrenToSolver = addChildrenToSolver(this.mSystem);
                WeakReference<ConstraintAnchor> weakReference = this.T;
                if (weakReference == null || weakReference.get() == null) {
                    z11 = z17;
                } else {
                    boolean z18 = z17;
                    try {
                        this.mSystem.addGreaterThan(this.mSystem.createObjectVariable(this.T.get()), this.mSystem.createObjectVariable(this.mTop), 0, 5);
                        this.T = null;
                        z11 = z18;
                    } catch (Exception e5) {
                        e = e5;
                        AddChildrenToSolver = AddChildrenToSolver;
                        z11 = z18;
                        e.printStackTrace();
                        System.out.println("EXCEPTION : " + e);
                    }
                }
                WeakReference<ConstraintAnchor> weakReference2 = this.V;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.mSystem.addGreaterThan(this.mSystem.createObjectVariable(this.mBottom), this.mSystem.createObjectVariable(this.V.get()), 0, 5);
                    this.V = null;
                }
                WeakReference<ConstraintAnchor> weakReference3 = this.U;
                if (weakReference3 != null && weakReference3.get() != null) {
                    this.mSystem.addGreaterThan(this.mSystem.createObjectVariable(this.U.get()), this.mSystem.createObjectVariable(this.mLeft), 0, 5);
                    this.U = null;
                }
                WeakReference<ConstraintAnchor> weakReference4 = this.W;
                if (weakReference4 != null && weakReference4.get() != null) {
                    this.mSystem.addGreaterThan(this.mSystem.createObjectVariable(this.mRight), this.mSystem.createObjectVariable(this.W.get()), 0, 5);
                    this.W = null;
                }
                if (AddChildrenToSolver != 0) {
                    this.mSystem.minimize();
                }
            } catch (Exception e7) {
                e = e7;
                z11 = z17;
                AddChildrenToSolver = r14;
            }
            boolean[] zArr = Optimizer.f19194a;
            if (AddChildrenToSolver != 0) {
                zUpdateChildrenFromSolver = updateChildrenFromSolver(this.mSystem, zArr);
            } else {
                updateFromSolver(this.mSystem, zOptimizeFor);
                for (int i19 = 0; i19 < size; i19++) {
                    this.mChildren.get(i19).updateFromSolver(this.mSystem, zOptimizeFor);
                }
                zUpdateChildrenFromSolver = false;
            }
            if (z16 && i17 < 8 && zArr[2]) {
                int iMax3 = 0;
                int iMax4 = 0;
                for (int i20 = 0; i20 < size; i20++) {
                    ConstraintWidget constraintWidget3 = this.mChildren.get(i20);
                    iMax3 = Math.max(iMax3, constraintWidget3.getWidth() + constraintWidget3.mX);
                    iMax4 = Math.max(iMax4, constraintWidget3.getHeight() + constraintWidget3.mY);
                }
                int iMax5 = Math.max(this.mMinWidth, iMax3);
                int iMax6 = Math.max(this.mMinHeight, iMax4);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour3 != dimensionBehaviour8 || getWidth() >= iMax5) {
                    z12 = z11;
                } else {
                    setWidth(iMax5);
                    this.mListDimensionBehaviors[0] = dimensionBehaviour8;
                    zUpdateChildrenFromSolver = true;
                    z12 = true;
                }
                if (dimensionBehaviour2 == dimensionBehaviour8 && getHeight() < iMax6) {
                    setHeight(iMax6);
                    this.mListDimensionBehaviors[1] = dimensionBehaviour8;
                    zUpdateChildrenFromSolver = true;
                    z12 = true;
                }
            } else {
                z12 = z11;
            }
            int iMax7 = Math.max(this.mMinWidth, getWidth());
            boolean z19 = z12;
            if (iMax7 > getWidth()) {
                setWidth(iMax7);
                this.mListDimensionBehaviors[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                zUpdateChildrenFromSolver = true;
                z19 = true;
            }
            int iMax8 = Math.max(this.mMinHeight, getHeight());
            if (iMax8 > getHeight()) {
                setHeight(iMax8);
                r10 = 1;
                this.mListDimensionBehaviors[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                r1 = 1;
                z13 = true;
            } else {
                r10 = 1;
                r1 = zUpdateChildrenFromSolver;
                z13 = z19;
            }
            if (z13) {
                z14 = z13;
                r3 = r1;
                i12 = 8;
            } else {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = this.mListDimensionBehaviors[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour9 == dimensionBehaviour10 && i11 > 0) {
                    r1 = r1;
                    z13 = z13;
                    if (getWidth() > i11) {
                        this.R = r10;
                        this.mListDimensionBehaviors[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                        setWidth(i11);
                        ?? r4 = r10;
                        z13 = r4 == true ? 1 : 0;
                        r1 = r4;
                    }
                }
                r1 = r1;
                r1 = r1;
                z13 = z13;
                z13 = z13;
                if (this.mListDimensionBehaviors[r10] != dimensionBehaviour10 || i10 <= 0 || getHeight() <= i10) {
                    z14 = z13;
                    r3 = r1;
                    i12 = 8;
                } else {
                    this.S = r10;
                    this.mListDimensionBehaviors[r10] = ConstraintWidget.DimensionBehaviour.FIXED;
                    setHeight(i10);
                    i12 = 8;
                    r3 = 1;
                    z14 = true;
                }
            }
            ?? r15 = i17 > i12 ? 0 : r3;
            i16 = i17;
            i13 = 0;
            z17 = z14;
            r14 = r15;
        }
        boolean z20 = z17;
        this.mChildren = arrayList;
        if (z20) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.mListDimensionBehaviors;
            dimensionBehaviourArr2[0] = dimensionBehaviour3;
            dimensionBehaviourArr2[1] = dimensionBehaviour2;
        }
        resetSolverVariables(this.mSystem.getCache());
    }

    public final void m(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.T;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.getFinalValue() > this.T.get().getFinalValue()) {
            this.T = new WeakReference<>(constraintAnchor);
        }
    }

    public long measure(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.M = i17;
        this.N = i18;
        return this.J.solverMeasure(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean optimizeFor(int i10) {
        return (this.Q & i10) == i10;
    }

    @Override // androidx.constraintlayout.core.widgets.WidgetContainer, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void reset() {
        this.mSystem.reset();
        this.M = 0;
        this.N = 0;
        this.mSkipSolver = false;
        super.reset();
    }

    public void setMeasurer(BasicMeasure.Measurer measurer) {
        this.mMeasurer = measurer;
        this.mDependencyGraph.setMeasurer(measurer);
    }

    public void setOptimizationLevel(int i10) {
        this.Q = i10;
        LinearSystem.USE_DEPENDENCY_ORDERING = optimizeFor(512);
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        this.M = i10;
        this.N = i11;
    }

    public void setPass(int i10) {
        this.K = i10;
    }

    public void setRtl(boolean z10) {
        this.L = z10;
    }

    public boolean updateChildrenFromSolver(LinearSystem linearSystem, boolean[] zArr) {
        zArr[2] = false;
        boolean zOptimizeFor = optimizeFor(64);
        updateFromSolver(linearSystem, zOptimizeFor);
        int size = this.mChildren.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.mChildren.get(i10);
            constraintWidget.updateFromSolver(linearSystem, zOptimizeFor);
            if (constraintWidget.hasDimensionOverride()) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void updateFromRuns(boolean z10, boolean z11) {
        super.updateFromRuns(z10, z11);
        int size = this.mChildren.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mChildren.get(i10).updateFromRuns(z10, z11);
        }
    }

    public void updateHierarchy() {
        this.J.updateHierarchy(this);
    }

    public static boolean measure(int i10, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, BasicMeasure.Measure measure, int i11) {
        int i12;
        int i13;
        if (measurer == null) {
            return false;
        }
        if (constraintWidget.getVisibility() != 8 && !(constraintWidget instanceof Guideline) && !(constraintWidget instanceof Barrier)) {
            measure.horizontalBehavior = constraintWidget.getHorizontalDimensionBehaviour();
            measure.verticalBehavior = constraintWidget.getVerticalDimensionBehaviour();
            measure.horizontalDimension = constraintWidget.getWidth();
            measure.verticalDimension = constraintWidget.getHeight();
            measure.measuredNeedsSolverPass = false;
            measure.measureStrategy = i11;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.horizontalBehavior;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z10 = dimensionBehaviour == dimensionBehaviour2;
            boolean z11 = measure.verticalBehavior == dimensionBehaviour2;
            boolean z12 = z10 && constraintWidget.mDimensionRatio > 0.0f;
            boolean z13 = z11 && constraintWidget.mDimensionRatio > 0.0f;
            if (z10 && constraintWidget.hasDanglingDimension(0) && constraintWidget.mMatchConstraintDefaultWidth == 0 && !z12) {
                measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (z11 && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                    measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
                }
                z10 = false;
            }
            if (z11 && constraintWidget.hasDanglingDimension(1) && constraintWidget.mMatchConstraintDefaultHeight == 0 && !z13) {
                measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (z10 && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                    measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
                }
                z11 = false;
            }
            if (constraintWidget.isResolvedHorizontally()) {
                measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
                z10 = false;
            }
            if (constraintWidget.isResolvedVertically()) {
                measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
                z11 = false;
            }
            if (z12) {
                if (constraintWidget.mResolvedMatchConstraintDefault[0] == 4) {
                    measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
                } else if (!z11) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = measure.verticalBehavior;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (dimensionBehaviour3 == dimensionBehaviour4) {
                        i13 = measure.verticalDimension;
                    } else {
                        measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        measurer.measure(constraintWidget, measure);
                        i13 = measure.measuredHeight;
                    }
                    measure.horizontalBehavior = dimensionBehaviour4;
                    measure.horizontalDimension = (int) (constraintWidget.getDimensionRatio() * i13);
                }
            }
            if (z13) {
                if (constraintWidget.mResolvedMatchConstraintDefault[1] == 4) {
                    measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
                } else if (!z10) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = measure.horizontalBehavior;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (dimensionBehaviour5 == dimensionBehaviour6) {
                        i12 = measure.horizontalDimension;
                    } else {
                        measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        measurer.measure(constraintWidget, measure);
                        i12 = measure.measuredWidth;
                    }
                    measure.verticalBehavior = dimensionBehaviour6;
                    if (constraintWidget.getDimensionRatioSide() == -1) {
                        measure.verticalDimension = (int) (i12 / constraintWidget.getDimensionRatio());
                    } else {
                        measure.verticalDimension = (int) (constraintWidget.getDimensionRatio() * i12);
                    }
                }
            }
            measurer.measure(constraintWidget, measure);
            constraintWidget.setWidth(measure.measuredWidth);
            constraintWidget.setHeight(measure.measuredHeight);
            constraintWidget.setHasBaseline(measure.measuredHasBaseline);
            constraintWidget.setBaselineDistance(measure.measuredBaseline);
            measure.measureStrategy = BasicMeasure.Measure.SELF_DIMENSIONS;
            return measure.measuredNeedsSolverPass;
        }
        measure.measuredWidth = 0;
        measure.measuredHeight = 0;
        return false;
    }

    public ConstraintWidgetContainer(int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
        this.J = new BasicMeasure(this);
        this.mDependencyGraph = new DependencyGraph(this);
        this.mMeasurer = null;
        this.L = false;
        this.mSystem = new LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.O = new ChainHead[4];
        this.P = new ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.Q = 257;
        this.mSkipSolver = false;
        this.R = false;
        this.S = false;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = new HashSet<>();
        this.mMeasure = new BasicMeasure.Measure();
    }

    public ConstraintWidgetContainer(int i10, int i11) {
        super(i10, i11);
        this.J = new BasicMeasure(this);
        this.mDependencyGraph = new DependencyGraph(this);
        this.mMeasurer = null;
        this.L = false;
        this.mSystem = new LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.O = new ChainHead[4];
        this.P = new ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.Q = 257;
        this.mSkipSolver = false;
        this.R = false;
        this.S = false;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = new HashSet<>();
        this.mMeasure = new BasicMeasure.Measure();
    }

    public ConstraintWidgetContainer(String str, int i10, int i11) {
        super(i10, i11);
        this.J = new BasicMeasure(this);
        this.mDependencyGraph = new DependencyGraph(this);
        this.mMeasurer = null;
        this.L = false;
        this.mSystem = new LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.O = new ChainHead[4];
        this.P = new ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.Q = 257;
        this.mSkipSolver = false;
        this.R = false;
        this.S = false;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = new HashSet<>();
        this.mMeasure = new BasicMeasure.Measure();
        setDebugName(str);
    }
}
