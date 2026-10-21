package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;

/* JADX INFO: compiled from: GuidelineReference.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends WidgetRun {
    public c(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.mHorizontalRun.b();
        constraintWidget.mVerticalRun.b();
        this.orientation = ((Guideline) constraintWidget).getOrientation();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void a() {
        Guideline guideline = (Guideline) this.f19236a;
        int relativeBegin = guideline.getRelativeBegin();
        int relativeEnd = guideline.getRelativeEnd();
        guideline.getRelativePercent();
        if (guideline.getOrientation() == 1) {
            if (relativeBegin != -1) {
                this.start.f19216g.add(this.f19236a.mParent.mHorizontalRun.start);
                this.f19236a.mParent.mHorizontalRun.start.f19215f.add(this.start);
                this.start.f19212c = relativeBegin;
            } else if (relativeEnd != -1) {
                this.start.f19216g.add(this.f19236a.mParent.mHorizontalRun.end);
                this.f19236a.mParent.mHorizontalRun.end.f19215f.add(this.start);
                this.start.f19212c = -relativeEnd;
            } else {
                DependencyNode dependencyNode = this.start;
                dependencyNode.delegateToWidgetRun = true;
                dependencyNode.f19216g.add(this.f19236a.mParent.mHorizontalRun.end);
                this.f19236a.mParent.mHorizontalRun.end.f19215f.add(this.start);
            }
            d(this.f19236a.mHorizontalRun.start);
            d(this.f19236a.mHorizontalRun.end);
            return;
        }
        if (relativeBegin != -1) {
            this.start.f19216g.add(this.f19236a.mParent.mVerticalRun.start);
            this.f19236a.mParent.mVerticalRun.start.f19215f.add(this.start);
            this.start.f19212c = relativeBegin;
        } else if (relativeEnd != -1) {
            this.start.f19216g.add(this.f19236a.mParent.mVerticalRun.end);
            this.f19236a.mParent.mVerticalRun.end.f19215f.add(this.start);
            this.start.f19212c = -relativeEnd;
        } else {
            DependencyNode dependencyNode2 = this.start;
            dependencyNode2.delegateToWidgetRun = true;
            dependencyNode2.f19216g.add(this.f19236a.mParent.mVerticalRun.end);
            this.f19236a.mParent.mVerticalRun.end.f19215f.add(this.start);
        }
        d(this.f19236a.mVerticalRun.start);
        d(this.f19236a.mVerticalRun.end);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void applyToWidget() {
        if (((Guideline) this.f19236a).getOrientation() == 1) {
            this.f19236a.setX(this.start.value);
        } else {
            this.f19236a.setY(this.start.value);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void b() {
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
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.readyToSolve && !dependencyNode.resolved) {
            DependencyNode dependencyNode2 = (DependencyNode) dependencyNode.f19216g.get(0);
            this.start.resolve((int) ((((Guideline) this.f19236a).getRelativePercent() * dependencyNode2.value) + 0.5f));
        }
    }
}
