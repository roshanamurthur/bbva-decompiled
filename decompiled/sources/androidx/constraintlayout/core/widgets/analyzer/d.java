package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Iterator;

/* JADX INFO: compiled from: HelperReferences.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends WidgetRun {
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void a() {
        ConstraintWidget constraintWidget = this.f19236a;
        if (constraintWidget instanceof Barrier) {
            this.start.delegateToWidgetRun = true;
            Barrier barrier = (Barrier) constraintWidget;
            int barrierType = barrier.getBarrierType();
            boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
            int i10 = 0;
            if (barrierType == 0) {
                this.start.f19211b = DependencyNode.a.LEFT;
                while (i10 < barrier.mWidgetsCount) {
                    ConstraintWidget constraintWidget2 = barrier.mWidgets[i10];
                    if (allowsGoneWidget || constraintWidget2.getVisibility() != 8) {
                        DependencyNode dependencyNode = constraintWidget2.mHorizontalRun.start;
                        dependencyNode.f19215f.add(this.start);
                        this.start.f19216g.add(dependencyNode);
                    }
                    i10++;
                }
                d(this.f19236a.mHorizontalRun.start);
                d(this.f19236a.mHorizontalRun.end);
                return;
            }
            if (barrierType == 1) {
                this.start.f19211b = DependencyNode.a.RIGHT;
                while (i10 < barrier.mWidgetsCount) {
                    ConstraintWidget constraintWidget3 = barrier.mWidgets[i10];
                    if (allowsGoneWidget || constraintWidget3.getVisibility() != 8) {
                        DependencyNode dependencyNode2 = constraintWidget3.mHorizontalRun.end;
                        dependencyNode2.f19215f.add(this.start);
                        this.start.f19216g.add(dependencyNode2);
                    }
                    i10++;
                }
                d(this.f19236a.mHorizontalRun.start);
                d(this.f19236a.mHorizontalRun.end);
                return;
            }
            if (barrierType == 2) {
                this.start.f19211b = DependencyNode.a.TOP;
                while (i10 < barrier.mWidgetsCount) {
                    ConstraintWidget constraintWidget4 = barrier.mWidgets[i10];
                    if (allowsGoneWidget || constraintWidget4.getVisibility() != 8) {
                        DependencyNode dependencyNode3 = constraintWidget4.mVerticalRun.start;
                        dependencyNode3.f19215f.add(this.start);
                        this.start.f19216g.add(dependencyNode3);
                    }
                    i10++;
                }
                d(this.f19236a.mVerticalRun.start);
                d(this.f19236a.mVerticalRun.end);
                return;
            }
            if (barrierType != 3) {
                return;
            }
            this.start.f19211b = DependencyNode.a.BOTTOM;
            while (i10 < barrier.mWidgetsCount) {
                ConstraintWidget constraintWidget5 = barrier.mWidgets[i10];
                if (allowsGoneWidget || constraintWidget5.getVisibility() != 8) {
                    DependencyNode dependencyNode4 = constraintWidget5.mVerticalRun.end;
                    dependencyNode4.f19215f.add(this.start);
                    this.start.f19216g.add(dependencyNode4);
                }
                i10++;
            }
            d(this.f19236a.mVerticalRun.start);
            d(this.f19236a.mVerticalRun.end);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void applyToWidget() {
        ConstraintWidget constraintWidget = this.f19236a;
        if (constraintWidget instanceof Barrier) {
            int barrierType = ((Barrier) constraintWidget).getBarrierType();
            if (barrierType == 0 || barrierType == 1) {
                this.f19236a.setX(this.start.value);
            } else {
                this.f19236a.setY(this.start.value);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void b() {
        this.f19237b = null;
        this.start.clear();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean c() {
        return false;
    }

    public final void d(DependencyNode dependencyNode) {
        this.start.f19215f.add(dependencyNode);
        dependencyNode.f19216g.add(this.start);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public final void update(Dependency dependency) {
        Barrier barrier = (Barrier) this.f19236a;
        int barrierType = barrier.getBarrierType();
        Iterator it = this.start.f19216g.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((DependencyNode) it.next()).value;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (barrierType == 0 || barrierType == 2) {
            this.start.resolve(barrier.getMargin() + i11);
        } else {
            this.start.resolve(barrier.getMargin() + i10);
        }
    }
}
