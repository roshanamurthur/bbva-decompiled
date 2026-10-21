package androidx.constraintlayout.core.widgets.analyzer;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.processing.f;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class DependencyNode implements Dependency {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetRun f19210a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19212c;
    public int value;
    public Dependency updateDelegate = null;
    public boolean delegateToWidgetRun = false;
    public boolean readyToSolve = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f19211b = a.UNKNOWN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19213d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f19214e = null;
    public boolean resolved = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f19215f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f19216g = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a BASELINE;
        public static final a BOTTOM;
        public static final a HORIZONTAL_DIMENSION;
        public static final a LEFT;
        public static final a RIGHT;
        public static final a TOP;
        public static final a UNKNOWN;
        public static final a VERTICAL_DIMENSION;

        static {
            a aVar = new a("UNKNOWN", 0);
            UNKNOWN = aVar;
            a aVar2 = new a("HORIZONTAL_DIMENSION", 1);
            HORIZONTAL_DIMENSION = aVar2;
            a aVar3 = new a("VERTICAL_DIMENSION", 2);
            VERTICAL_DIMENSION = aVar3;
            a aVar4 = new a("LEFT", 3);
            LEFT = aVar4;
            a aVar5 = new a("RIGHT", 4);
            RIGHT = aVar5;
            a aVar6 = new a("TOP", 5);
            TOP = aVar6;
            a aVar7 = new a("BOTTOM", 6);
            BOTTOM = aVar7;
            a aVar8 = new a("BASELINE", 7);
            BASELINE = aVar8;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.f19210a = widgetRun;
    }

    public void addDependency(Dependency dependency) {
        this.f19215f.add(dependency);
        if (this.resolved) {
            dependency.update(dependency);
        }
    }

    public void clear() {
        this.f19216g.clear();
        this.f19215f.clear();
        this.resolved = false;
        this.value = 0;
        this.readyToSolve = false;
        this.delegateToWidgetRun = false;
    }

    public String name() {
        String debugName = this.f19210a.f19236a.getDebugName();
        a aVar = this.f19211b;
        StringBuilder sbE = f.e((aVar == a.LEFT || aVar == a.RIGHT) ? u.f(debugName, "_HORIZONTAL") : u.f(debugName, "_VERTICAL"), DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        sbE.append(this.f19211b.name());
        return sbE.toString();
    }

    public void resolve(int i10) {
        if (this.resolved) {
            return;
        }
        this.resolved = true;
        this.value = i10;
        for (Dependency dependency : this.f19215f) {
            dependency.update(dependency);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f19210a.f19236a.getDebugName());
        sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        sb2.append(this.f19211b);
        sb2.append("(");
        sb2.append(this.resolved ? Integer.valueOf(this.value) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f19216g.size());
        sb2.append(":d=");
        sb2.append(this.f19215f.size());
        sb2.append(">");
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        ArrayList<DependencyNode> arrayList = this.f19216g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((DependencyNode) it.next()).resolved) {
                return;
            }
        }
        this.readyToSolve = true;
        Dependency dependency2 = this.updateDelegate;
        if (dependency2 != null) {
            dependency2.update(this);
        }
        if (this.delegateToWidgetRun) {
            this.f19210a.update(this);
            return;
        }
        DependencyNode dependencyNode = null;
        int i10 = 0;
        for (DependencyNode dependencyNode2 : arrayList) {
            if (!(dependencyNode2 instanceof b)) {
                i10++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i10 == 1 && dependencyNode.resolved) {
            b bVar = this.f19214e;
            if (bVar != null) {
                if (!bVar.resolved) {
                    return;
                } else {
                    this.f19212c = this.f19213d * bVar.value;
                }
            }
            resolve(dependencyNode.value + this.f19212c);
        }
        Dependency dependency3 = this.updateDelegate;
        if (dependency3 != null) {
            dependency3.update(this);
        }
    }
}
