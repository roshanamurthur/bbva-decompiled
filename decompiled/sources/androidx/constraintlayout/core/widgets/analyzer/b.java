package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: compiled from: DimensionDependency.java */
/* JADX INFO: loaded from: classes.dex */
public class b extends DependencyNode {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19241h;

    public b(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof HorizontalWidgetRun) {
            this.f19211b = DependencyNode.a.HORIZONTAL_DIMENSION;
        } else {
            this.f19211b = DependencyNode.a.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    public final void resolve(int i10) {
        if (this.resolved) {
            return;
        }
        this.resolved = true;
        this.value = i10;
        for (Dependency dependency : this.f19215f) {
            dependency.update(dependency);
        }
    }
}
