package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class DependencyGraph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintWidgetContainer f19202a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintWidgetContainer f19205d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BasicMeasure.Measurer f19207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BasicMeasure.Measure f19208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList<e> f19209h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19203b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19204c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<WidgetRun> f19206e = new ArrayList<>();

    public DependencyGraph(ConstraintWidgetContainer constraintWidgetContainer) {
        new ArrayList();
        this.f19207f = null;
        this.f19208g = new BasicMeasure.Measure();
        this.f19209h = new ArrayList<>();
        this.f19202a = constraintWidgetContainer;
        this.f19205d = constraintWidgetContainer;
    }

    public final void a(DependencyNode dependencyNode, int i10, ArrayList arrayList, e eVar) {
        WidgetRun widgetRun = dependencyNode.f19210a;
        if (widgetRun.f19237b == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.f19202a;
            if (widgetRun == constraintWidgetContainer.mHorizontalRun || widgetRun == constraintWidgetContainer.mVerticalRun) {
                return;
            }
            if (eVar == null) {
                eVar = new e();
                eVar.f19242a = null;
                eVar.f19243b = new ArrayList<>();
                eVar.f19242a = widgetRun;
                arrayList.add(eVar);
            }
            widgetRun.f19237b = eVar;
            eVar.f19243b.add(widgetRun);
            for (Dependency dependency : widgetRun.start.f19215f) {
                if (dependency instanceof DependencyNode) {
                    a((DependencyNode) dependency, i10, arrayList, eVar);
                }
            }
            for (Dependency dependency2 : widgetRun.end.f19215f) {
                if (dependency2 instanceof DependencyNode) {
                    a((DependencyNode) dependency2, i10, arrayList, eVar);
                }
            }
            if (i10 == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                for (Dependency dependency3 : ((VerticalWidgetRun) widgetRun).baseline.f19215f) {
                    if (dependency3 instanceof DependencyNode) {
                        a((DependencyNode) dependency3, i10, arrayList, eVar);
                    }
                }
            }
            Iterator it = widgetRun.start.f19216g.iterator();
            while (it.hasNext()) {
                a((DependencyNode) it.next(), i10, arrayList, eVar);
            }
            Iterator it2 = widgetRun.end.f19216g.iterator();
            while (it2.hasNext()) {
                a((DependencyNode) it2.next(), i10, arrayList, eVar);
            }
            if (i10 == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                Iterator it3 = ((VerticalWidgetRun) widgetRun).baseline.f19216g.iterator();
                while (it3.hasNext()) {
                    a((DependencyNode) it3.next(), i10, arrayList, eVar);
                }
            }
        }
    }

    public final void b(ConstraintWidgetContainer constraintWidgetContainer) {
        int height;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        for (ConstraintWidget constraintWidget : constraintWidgetContainer.mChildren) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.mListDimensionBehaviors;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[1];
            if (constraintWidget.getVisibility() == 8) {
                constraintWidget.measured = true;
            } else {
                if (constraintWidget.mMatchConstraintPercentWidth < 1.0f && dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.mMatchConstraintDefaultWidth = 2;
                }
                if (constraintWidget.mMatchConstraintPercentHeight < 1.0f && dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.mMatchConstraintDefaultHeight = 2;
                }
                if (constraintWidget.getDimensionRatio() > 0.0f) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour6 && (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.mMatchConstraintDefaultWidth = 3;
                    } else if (dimensionBehaviour5 == dimensionBehaviour6 && (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.mMatchConstraintDefaultHeight = 3;
                    } else if (dimensionBehaviour4 == dimensionBehaviour6 && dimensionBehaviour5 == dimensionBehaviour6) {
                        if (constraintWidget.mMatchConstraintDefaultWidth == 0) {
                            constraintWidget.mMatchConstraintDefaultWidth = 3;
                        }
                        if (constraintWidget.mMatchConstraintDefaultHeight == 0) {
                            constraintWidget.mMatchConstraintDefaultHeight = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour4 == dimensionBehaviour7 && constraintWidget.mMatchConstraintDefaultWidth == 1 && (constraintWidget.mLeft.mTarget == null || constraintWidget.mRight.mTarget == null)) {
                    dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                if (dimensionBehaviour5 == dimensionBehaviour7 && constraintWidget.mMatchConstraintDefaultHeight == 1 && (constraintWidget.mTop.mTarget == null || constraintWidget.mBottom.mTarget == null)) {
                    dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = dimensionBehaviour5;
                HorizontalWidgetRun horizontalWidgetRun = constraintWidget.mHorizontalRun;
                horizontalWidgetRun.mDimensionBehavior = dimensionBehaviour4;
                int i10 = constraintWidget.mMatchConstraintDefaultWidth;
                horizontalWidgetRun.matchConstraintsType = i10;
                VerticalWidgetRun verticalWidgetRun = constraintWidget.mVerticalRun;
                verticalWidgetRun.mDimensionBehavior = dimensionBehaviour8;
                int i11 = constraintWidget.mMatchConstraintDefaultHeight;
                verticalWidgetRun.matchConstraintsType = i11;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if ((dimensionBehaviour4 == dimensionBehaviour9 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour8 == dimensionBehaviour9 || dimensionBehaviour8 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour8 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    int width = constraintWidget.getWidth();
                    if (dimensionBehaviour4 == dimensionBehaviour9) {
                        width = (constraintWidgetContainer.getWidth() - constraintWidget.mLeft.mMargin) - constraintWidget.mRight.mMargin;
                        dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    int i12 = width;
                    int height2 = constraintWidget.getHeight();
                    if (dimensionBehaviour8 == dimensionBehaviour9) {
                        height = (constraintWidgetContainer.getHeight() - constraintWidget.mTop.mMargin) - constraintWidget.mBottom.mMargin;
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        height = height2;
                        dimensionBehaviour = dimensionBehaviour8;
                    }
                    e(constraintWidget, dimensionBehaviour4, i12, dimensionBehaviour, height);
                    constraintWidget.mHorizontalRun.f19238c.resolve(constraintWidget.getWidth());
                    constraintWidget.mVerticalRun.f19238c.resolve(constraintWidget.getHeight());
                    constraintWidget.measured = true;
                } else {
                    if (dimensionBehaviour4 == dimensionBehaviour7 && (dimensionBehaviour8 == (dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour8 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (i10 == 3) {
                            if (dimensionBehaviour8 == dimensionBehaviour3) {
                                e(constraintWidget, dimensionBehaviour3, 0, dimensionBehaviour3, 0);
                            }
                            int height3 = constraintWidget.getHeight();
                            int i13 = (int) ((height3 * constraintWidget.mDimensionRatio) + 0.5f);
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.FIXED;
                            e(constraintWidget, dimensionBehaviour10, i13, dimensionBehaviour10, height3);
                            constraintWidget.mHorizontalRun.f19238c.resolve(constraintWidget.getWidth());
                            constraintWidget.mVerticalRun.f19238c.resolve(constraintWidget.getHeight());
                            constraintWidget.measured = true;
                        } else if (i10 == 1) {
                            e(constraintWidget, dimensionBehaviour3, 0, dimensionBehaviour8, 0);
                            constraintWidget.mHorizontalRun.f19238c.f19241h = constraintWidget.getWidth();
                        } else if (i10 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = constraintWidgetContainer.mListDimensionBehaviors[0];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour11 == dimensionBehaviour12 || dimensionBehaviour11 == dimensionBehaviour9) {
                                e(constraintWidget, dimensionBehaviour12, (int) ((constraintWidget.mMatchConstraintPercentWidth * constraintWidgetContainer.getWidth()) + 0.5f), dimensionBehaviour8, constraintWidget.getHeight());
                                constraintWidget.mHorizontalRun.f19238c.resolve(constraintWidget.getWidth());
                                constraintWidget.mVerticalRun.f19238c.resolve(constraintWidget.getHeight());
                                constraintWidget.measured = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr = constraintWidget.mListAnchors;
                            if (constraintAnchorArr[0].mTarget == null || constraintAnchorArr[1].mTarget == null) {
                                e(constraintWidget, dimensionBehaviour3, 0, dimensionBehaviour8, 0);
                                constraintWidget.mHorizontalRun.f19238c.resolve(constraintWidget.getWidth());
                                constraintWidget.mVerticalRun.f19238c.resolve(constraintWidget.getHeight());
                                constraintWidget.measured = true;
                            }
                        }
                    }
                    if (dimensionBehaviour8 == dimensionBehaviour7 && (dimensionBehaviour4 == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (i11 == 3) {
                            if (dimensionBehaviour4 == dimensionBehaviour2) {
                                e(constraintWidget, dimensionBehaviour2, 0, dimensionBehaviour2, 0);
                            }
                            int width2 = constraintWidget.getWidth();
                            float f6 = constraintWidget.mDimensionRatio;
                            if (constraintWidget.getDimensionRatioSide() == -1) {
                                f6 = 1.0f / f6;
                            }
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = ConstraintWidget.DimensionBehaviour.FIXED;
                            e(constraintWidget, dimensionBehaviour13, width2, dimensionBehaviour13, (int) ((width2 * f6) + 0.5f));
                            constraintWidget.mHorizontalRun.f19238c.resolve(constraintWidget.getWidth());
                            constraintWidget.mVerticalRun.f19238c.resolve(constraintWidget.getHeight());
                            constraintWidget.measured = true;
                        } else if (i11 == 1) {
                            e(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour2, 0);
                            constraintWidget.mVerticalRun.f19238c.f19241h = constraintWidget.getHeight();
                        } else if (i11 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = constraintWidgetContainer.mListDimensionBehaviors[1];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour14 == dimensionBehaviour15 || dimensionBehaviour14 == dimensionBehaviour9) {
                                e(constraintWidget, dimensionBehaviour4, constraintWidget.getWidth(), dimensionBehaviour15, (int) ((constraintWidget.mMatchConstraintPercentHeight * constraintWidgetContainer.getHeight()) + 0.5f));
                                constraintWidget.mHorizontalRun.f19238c.resolve(constraintWidget.getWidth());
                                constraintWidget.mVerticalRun.f19238c.resolve(constraintWidget.getHeight());
                                constraintWidget.measured = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr2 = constraintWidget.mListAnchors;
                            if (constraintAnchorArr2[2].mTarget == null || constraintAnchorArr2[3].mTarget == null) {
                                e(constraintWidget, dimensionBehaviour2, 0, dimensionBehaviour8, 0);
                                constraintWidget.mHorizontalRun.f19238c.resolve(constraintWidget.getWidth());
                                constraintWidget.mVerticalRun.f19238c.resolve(constraintWidget.getHeight());
                                constraintWidget.measured = true;
                            }
                        }
                    }
                    if (dimensionBehaviour4 == dimensionBehaviour7 && dimensionBehaviour8 == dimensionBehaviour7) {
                        if (i10 == 1 || i11 == 1) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            e(constraintWidget, dimensionBehaviour16, 0, dimensionBehaviour16, 0);
                            constraintWidget.mHorizontalRun.f19238c.f19241h = constraintWidget.getWidth();
                            constraintWidget.mVerticalRun.f19238c.f19241h = constraintWidget.getHeight();
                        } else if (i11 == 2 && i10 == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidgetContainer.mListDimensionBehaviors;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = dimensionBehaviourArr2[0];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour17 == dimensionBehaviour18 && dimensionBehaviourArr2[1] == dimensionBehaviour18) {
                                e(constraintWidget, dimensionBehaviour18, (int) ((constraintWidget.mMatchConstraintPercentWidth * constraintWidgetContainer.getWidth()) + 0.5f), dimensionBehaviour18, (int) ((constraintWidget.mMatchConstraintPercentHeight * constraintWidgetContainer.getHeight()) + 0.5f));
                                constraintWidget.mHorizontalRun.f19238c.resolve(constraintWidget.getWidth());
                                constraintWidget.mVerticalRun.f19238c.resolve(constraintWidget.getHeight());
                                constraintWidget.measured = true;
                            }
                        }
                    }
                }
            }
        }
    }

    public void buildGraph() {
        buildGraph(this.f19206e);
        ArrayList<e> arrayList = this.f19209h;
        arrayList.clear();
        ConstraintWidgetContainer constraintWidgetContainer = this.f19202a;
        d(constraintWidgetContainer.mHorizontalRun, 0, arrayList);
        d(constraintWidgetContainer.mVerticalRun, 1, arrayList);
        this.f19203b = false;
    }

    public final int c(ConstraintWidgetContainer constraintWidgetContainer, int i10) {
        long wrapDimension;
        long j10;
        ArrayList<e> arrayList = this.f19209h;
        int size = arrayList.size();
        long j11 = 0;
        int i11 = 0;
        long jMax = 0;
        while (i11 < size) {
            WidgetRun widgetRun = arrayList.get(i11).f19242a;
            if (!(widgetRun instanceof ChainRun) ? !(i10 != 0 ? (widgetRun instanceof VerticalWidgetRun) : (widgetRun instanceof HorizontalWidgetRun)) : ((ChainRun) widgetRun).orientation != i10) {
                DependencyNode dependencyNode = (i10 == 0 ? constraintWidgetContainer.mHorizontalRun : constraintWidgetContainer.mVerticalRun).start;
                DependencyNode dependencyNode2 = (i10 == 0 ? constraintWidgetContainer.mHorizontalRun : constraintWidgetContainer.mVerticalRun).end;
                boolean zContains = widgetRun.start.f19216g.contains(dependencyNode);
                boolean zContains2 = widgetRun.end.f19216g.contains(dependencyNode2);
                long wrapDimension2 = widgetRun.getWrapDimension();
                if (zContains && zContains2) {
                    long jC = e.c(widgetRun.start, j11);
                    long jB = e.b(widgetRun.end, j11);
                    long j12 = jC - wrapDimension2;
                    int i12 = widgetRun.end.f19212c;
                    if (j12 >= (-i12)) {
                        j12 += (long) i12;
                    }
                    long j13 = widgetRun.start.f19212c;
                    long j14 = ((-jB) - wrapDimension2) - j13;
                    if (j14 >= j13) {
                        j14 -= j13;
                    }
                    float biasPercent = widgetRun.f19236a.getBiasPercent(i10);
                    if (biasPercent > 0.0f) {
                        j10 = (long) ((j12 / (1.0f - biasPercent)) + (j14 / biasPercent));
                    } else {
                        j10 = 0;
                    }
                    float f6 = j10;
                    wrapDimension = (((long) widgetRun.start.f19212c) + ((((long) ((f6 * biasPercent) + 0.5f)) + wrapDimension2) + ((long) androidx.datastore.preferences.protobuf.e.a(1.0f, biasPercent, f6, 0.5f)))) - ((long) widgetRun.end.f19212c);
                } else if (zContains) {
                    DependencyNode dependencyNode3 = widgetRun.start;
                    wrapDimension = Math.max(e.c(dependencyNode3, dependencyNode3.f19212c), ((long) widgetRun.start.f19212c) + wrapDimension2);
                } else if (zContains2) {
                    DependencyNode dependencyNode4 = widgetRun.end;
                    wrapDimension = Math.max(-e.b(dependencyNode4, dependencyNode4.f19212c), ((long) (-widgetRun.end.f19212c)) + wrapDimension2);
                } else {
                    wrapDimension = (widgetRun.getWrapDimension() + ((long) widgetRun.start.f19212c)) - ((long) widgetRun.end.f19212c);
                }
            } else {
                wrapDimension = j11;
            }
            jMax = Math.max(jMax, wrapDimension);
            i11++;
            j11 = 0;
        }
        return (int) jMax;
    }

    public final void d(WidgetRun widgetRun, int i10, ArrayList<e> arrayList) {
        for (Dependency dependency : widgetRun.start.f19215f) {
            if (dependency instanceof DependencyNode) {
                a((DependencyNode) dependency, i10, arrayList, null);
            } else if (dependency instanceof WidgetRun) {
                a(((WidgetRun) dependency).start, i10, arrayList, null);
            }
        }
        for (Dependency dependency2 : widgetRun.end.f19215f) {
            if (dependency2 instanceof DependencyNode) {
                a((DependencyNode) dependency2, i10, arrayList, null);
            } else if (dependency2 instanceof WidgetRun) {
                a(((WidgetRun) dependency2).end, i10, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (Dependency dependency3 : ((VerticalWidgetRun) widgetRun).baseline.f19215f) {
                if (dependency3 instanceof DependencyNode) {
                    a((DependencyNode) dependency3, i10, arrayList, null);
                }
            }
        }
    }

    public void defineTerminalWidgets(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2) {
        if (this.f19203b) {
            buildGraph();
            boolean z10 = false;
            for (ConstraintWidget constraintWidget : this.f19202a.mChildren) {
                boolean[] zArr = constraintWidget.isTerminalWidget;
                zArr[0] = true;
                zArr[1] = true;
                if (constraintWidget instanceof Barrier) {
                    z10 = true;
                }
            }
            if (z10) {
                return;
            }
            for (e eVar : this.f19209h) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z11 = dimensionBehaviour == dimensionBehaviour3;
                boolean z12 = dimensionBehaviour2 == dimensionBehaviour3;
                WidgetRun widgetRun = eVar.f19242a;
                if (z11 && (widgetRun instanceof HorizontalWidgetRun)) {
                    e.a(widgetRun, 0);
                }
                if (z12 && (widgetRun instanceof VerticalWidgetRun)) {
                    e.a(widgetRun, 1);
                }
            }
        }
    }

    public boolean directMeasure(boolean z10) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = z10 & true;
        boolean z14 = this.f19203b;
        ConstraintWidgetContainer constraintWidgetContainer = this.f19202a;
        if (z14 || this.f19204c) {
            for (ConstraintWidget constraintWidget : constraintWidgetContainer.mChildren) {
                constraintWidget.ensureWidgetRuns();
                constraintWidget.measured = false;
                constraintWidget.mHorizontalRun.e();
                constraintWidget.mVerticalRun.d();
            }
            constraintWidgetContainer.ensureWidgetRuns();
            constraintWidgetContainer.measured = false;
            constraintWidgetContainer.mHorizontalRun.e();
            constraintWidgetContainer.mVerticalRun.d();
            this.f19204c = false;
        }
        b(this.f19205d);
        constraintWidgetContainer.setX(0);
        constraintWidgetContainer.setY(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidgetContainer.getDimensionBehaviour(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidgetContainer.getDimensionBehaviour(1);
        if (this.f19203b) {
            buildGraph();
        }
        int x4 = constraintWidgetContainer.getX();
        int y7 = constraintWidgetContainer.getY();
        constraintWidgetContainer.mHorizontalRun.start.resolve(x4);
        constraintWidgetContainer.mVerticalRun.start.resolve(y7);
        measureWidgets();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        ArrayList<WidgetRun> arrayList = this.f19206e;
        if (dimensionBehaviour == dimensionBehaviour3 || dimensionBehaviour2 == dimensionBehaviour3) {
            if (z13) {
                Iterator<WidgetRun> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!it.next().c()) {
                        z13 = false;
                        break;
                    }
                }
            }
            if (z13 && dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                constraintWidgetContainer.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidgetContainer.setWidth(c(constraintWidgetContainer, 0));
                constraintWidgetContainer.mHorizontalRun.f19238c.resolve(constraintWidgetContainer.getWidth());
            }
            if (z13 && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                constraintWidgetContainer.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidgetContainer.setHeight(c(constraintWidgetContainer, 1));
                constraintWidgetContainer.mVerticalRun.f19238c.resolve(constraintWidgetContainer.getHeight());
            }
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidgetContainer.mListDimensionBehaviors[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour4 == dimensionBehaviour5 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int width = constraintWidgetContainer.getWidth() + x4;
            constraintWidgetContainer.mHorizontalRun.end.resolve(width);
            constraintWidgetContainer.mHorizontalRun.f19238c.resolve(width - x4);
            measureWidgets();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = constraintWidgetContainer.mListDimensionBehaviors[1];
            if (dimensionBehaviour6 == dimensionBehaviour5 || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int height = constraintWidgetContainer.getHeight() + y7;
                constraintWidgetContainer.mVerticalRun.end.resolve(height);
                constraintWidgetContainer.mVerticalRun.f19238c.resolve(height - y7);
            }
            measureWidgets();
            z11 = true;
        } else {
            z11 = false;
        }
        for (WidgetRun widgetRun : arrayList) {
            if (widgetRun.f19236a != constraintWidgetContainer || widgetRun.f19239d) {
                widgetRun.applyToWidget();
            }
        }
        for (WidgetRun widgetRun2 : arrayList) {
            if (z11 || widgetRun2.f19236a != constraintWidgetContainer) {
                if (!widgetRun2.start.resolved || ((!widgetRun2.end.resolved && !(widgetRun2 instanceof c)) || (!widgetRun2.f19238c.resolved && !(widgetRun2 instanceof ChainRun) && !(widgetRun2 instanceof c)))) {
                    z12 = false;
                    break;
                }
            }
        }
        constraintWidgetContainer.setHorizontalDimensionBehaviour(dimensionBehaviour);
        constraintWidgetContainer.setVerticalDimensionBehaviour(dimensionBehaviour2);
        return z12;
    }

    public boolean directMeasureSetup(boolean z10) {
        boolean z11 = this.f19203b;
        ConstraintWidgetContainer constraintWidgetContainer = this.f19202a;
        if (z11) {
            for (ConstraintWidget constraintWidget : constraintWidgetContainer.mChildren) {
                constraintWidget.ensureWidgetRuns();
                constraintWidget.measured = false;
                HorizontalWidgetRun horizontalWidgetRun = constraintWidget.mHorizontalRun;
                horizontalWidgetRun.f19238c.resolved = false;
                horizontalWidgetRun.f19239d = false;
                horizontalWidgetRun.e();
                VerticalWidgetRun verticalWidgetRun = constraintWidget.mVerticalRun;
                verticalWidgetRun.f19238c.resolved = false;
                verticalWidgetRun.f19239d = false;
                verticalWidgetRun.d();
            }
            constraintWidgetContainer.ensureWidgetRuns();
            constraintWidgetContainer.measured = false;
            HorizontalWidgetRun horizontalWidgetRun2 = constraintWidgetContainer.mHorizontalRun;
            horizontalWidgetRun2.f19238c.resolved = false;
            horizontalWidgetRun2.f19239d = false;
            horizontalWidgetRun2.e();
            VerticalWidgetRun verticalWidgetRun2 = constraintWidgetContainer.mVerticalRun;
            verticalWidgetRun2.f19238c.resolved = false;
            verticalWidgetRun2.f19239d = false;
            verticalWidgetRun2.d();
            buildGraph();
        }
        b(this.f19205d);
        constraintWidgetContainer.setX(0);
        constraintWidgetContainer.setY(0);
        constraintWidgetContainer.mHorizontalRun.start.resolve(0);
        constraintWidgetContainer.mVerticalRun.start.resolve(0);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    public boolean directMeasureWithOrientation(boolean z10, int i10) {
        boolean z11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z12 = true;
        boolean z13 = z10 & true;
        ConstraintWidgetContainer constraintWidgetContainer = this.f19202a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidgetContainer.getDimensionBehaviour(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidgetContainer.getDimensionBehaviour(1);
        int x4 = constraintWidgetContainer.getX();
        int y7 = constraintWidgetContainer.getY();
        ArrayList<WidgetRun> arrayList = this.f19206e;
        if (z13 && (dimensionBehaviour2 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour3 == dimensionBehaviour)) {
            for (WidgetRun widgetRun : arrayList) {
                if (widgetRun.orientation == i10 && !widgetRun.c()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidgetContainer.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                    constraintWidgetContainer.setWidth(c(constraintWidgetContainer, 0));
                    constraintWidgetContainer.mHorizontalRun.f19238c.resolve(constraintWidgetContainer.getWidth());
                }
            } else if (z13 && dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                constraintWidgetContainer.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidgetContainer.setHeight(c(constraintWidgetContainer, 1));
                constraintWidgetContainer.mVerticalRun.f19238c.resolve(constraintWidgetContainer.getHeight());
            }
        }
        if (i10 == 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidgetContainer.mListDimensionBehaviors[0];
            if (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int width = constraintWidgetContainer.getWidth() + x4;
                constraintWidgetContainer.mHorizontalRun.end.resolve(width);
                constraintWidgetContainer.mHorizontalRun.f19238c.resolve(width - x4);
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = constraintWidgetContainer.mListDimensionBehaviors[1];
            if (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int height = constraintWidgetContainer.getHeight() + y7;
                constraintWidgetContainer.mVerticalRun.end.resolve(height);
                constraintWidgetContainer.mVerticalRun.f19238c.resolve(height - y7);
                z11 = true;
            } else {
                z11 = false;
            }
        }
        measureWidgets();
        for (WidgetRun widgetRun2 : arrayList) {
            if (widgetRun2.orientation == i10 && (widgetRun2.f19236a != constraintWidgetContainer || widgetRun2.f19239d)) {
                widgetRun2.applyToWidget();
            }
        }
        for (WidgetRun widgetRun3 : arrayList) {
            if (widgetRun3.orientation == i10 && (z11 || widgetRun3.f19236a != constraintWidgetContainer)) {
                if (!widgetRun3.start.resolved || !widgetRun3.end.resolved || (!(widgetRun3 instanceof ChainRun) && !widgetRun3.f19238c.resolved)) {
                    z12 = false;
                    break;
                }
            }
        }
        constraintWidgetContainer.setHorizontalDimensionBehaviour(dimensionBehaviour2);
        constraintWidgetContainer.setVerticalDimensionBehaviour(dimensionBehaviour3);
        return z12;
    }

    public final void e(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i10, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i11) {
        BasicMeasure.Measure measure = this.f19208g;
        measure.horizontalBehavior = dimensionBehaviour;
        measure.verticalBehavior = dimensionBehaviour2;
        measure.horizontalDimension = i10;
        measure.verticalDimension = i11;
        this.f19207f.measure(constraintWidget, measure);
        constraintWidget.setWidth(measure.measuredWidth);
        constraintWidget.setHeight(measure.measuredHeight);
        constraintWidget.setHasBaseline(measure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(measure.measuredBaseline);
    }

    public void invalidateGraph() {
        this.f19203b = true;
    }

    public void invalidateMeasures() {
        this.f19204c = true;
    }

    public void measureWidgets() {
        a aVar;
        for (ConstraintWidget constraintWidget : this.f19202a.mChildren) {
            if (!constraintWidget.measured) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.mListDimensionBehaviors;
                boolean z10 = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i10 = constraintWidget.mMatchConstraintDefaultWidth;
                int i11 = constraintWidget.mMatchConstraintDefaultHeight;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z11 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i10 == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                b bVar = constraintWidget.mHorizontalRun.f19238c;
                boolean z12 = bVar.resolved;
                b bVar2 = constraintWidget.mVerticalRun.f19238c;
                boolean z13 = bVar2.resolved;
                if (z12 && z13) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    e(constraintWidget, dimensionBehaviour4, bVar.value, dimensionBehaviour4, bVar2.value);
                    constraintWidget.measured = true;
                } else if (z12 && z10) {
                    e(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, bVar.value, dimensionBehaviour3, bVar2.value);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.mVerticalRun.f19238c.f19241h = constraintWidget.getHeight();
                    } else {
                        constraintWidget.mVerticalRun.f19238c.resolve(constraintWidget.getHeight());
                        constraintWidget.measured = true;
                    }
                } else if (z13 && z11) {
                    e(constraintWidget, dimensionBehaviour3, bVar.value, ConstraintWidget.DimensionBehaviour.FIXED, bVar2.value);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.mHorizontalRun.f19238c.f19241h = constraintWidget.getWidth();
                    } else {
                        constraintWidget.mHorizontalRun.f19238c.resolve(constraintWidget.getWidth());
                        constraintWidget.measured = true;
                    }
                }
                if (constraintWidget.measured && (aVar = constraintWidget.mVerticalRun.f19220e) != null) {
                    aVar.resolve(constraintWidget.getBaselineDistance());
                }
            }
        }
    }

    public void setMeasurer(BasicMeasure.Measurer measurer) {
        this.f19207f = measurer;
    }

    public void buildGraph(ArrayList<WidgetRun> arrayList) {
        arrayList.clear();
        ConstraintWidgetContainer constraintWidgetContainer = this.f19205d;
        constraintWidgetContainer.mHorizontalRun.b();
        constraintWidgetContainer.mVerticalRun.b();
        arrayList.add(constraintWidgetContainer.mHorizontalRun);
        arrayList.add(constraintWidgetContainer.mVerticalRun);
        HashSet hashSet = null;
        for (ConstraintWidget constraintWidget : constraintWidgetContainer.mChildren) {
            if (constraintWidget instanceof Guideline) {
                arrayList.add(new c(constraintWidget));
            } else {
                if (constraintWidget.isInHorizontalChain()) {
                    if (constraintWidget.horizontalChainRun == null) {
                        constraintWidget.horizontalChainRun = new ChainRun(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.horizontalChainRun);
                } else {
                    arrayList.add(constraintWidget.mHorizontalRun);
                }
                if (constraintWidget.isInVerticalChain()) {
                    if (constraintWidget.verticalChainRun == null) {
                        constraintWidget.verticalChainRun = new ChainRun(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.verticalChainRun);
                } else {
                    arrayList.add(constraintWidget.mVerticalRun);
                }
                if (constraintWidget instanceof HelperWidget) {
                    arrayList.add(new d(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        for (WidgetRun widgetRun : arrayList) {
            if (widgetRun.f19236a != constraintWidgetContainer) {
                widgetRun.a();
            }
        }
    }
}
