package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: RunGroup.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WidgetRun f19242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<WidgetRun> f19243b;

    public static void a(WidgetRun widgetRun, int i10) {
        DependencyNode dependencyNode;
        WidgetRun widgetRun2;
        DependencyNode dependencyNode2;
        WidgetRun widgetRun3;
        if (widgetRun.f19236a.isTerminalWidget[i10]) {
            for (Dependency dependency : widgetRun.start.f19215f) {
                if ((dependency instanceof DependencyNode) && (widgetRun3 = (dependencyNode2 = (DependencyNode) dependency).f19210a) != widgetRun && dependencyNode2 == widgetRun3.start) {
                    if (widgetRun instanceof ChainRun) {
                        Iterator<WidgetRun> it = ((ChainRun) widgetRun).f19200e.iterator();
                        while (it.hasNext()) {
                            a(it.next(), i10);
                        }
                    } else if (!(widgetRun instanceof d)) {
                        widgetRun.f19236a.isTerminalWidget[i10] = false;
                    }
                    a(dependencyNode2.f19210a, i10);
                }
            }
            for (Dependency dependency2 : widgetRun.end.f19215f) {
                if ((dependency2 instanceof DependencyNode) && (widgetRun2 = (dependencyNode = (DependencyNode) dependency2).f19210a) != widgetRun && dependencyNode == widgetRun2.start) {
                    if (widgetRun instanceof ChainRun) {
                        Iterator<WidgetRun> it2 = ((ChainRun) widgetRun).f19200e.iterator();
                        while (it2.hasNext()) {
                            a(it2.next(), i10);
                        }
                    } else if (!(widgetRun instanceof d)) {
                        widgetRun.f19236a.isTerminalWidget[i10] = false;
                    }
                    a(dependencyNode.f19210a, i10);
                }
            }
        }
    }

    public static long b(DependencyNode dependencyNode, long j10) {
        WidgetRun widgetRun = dependencyNode.f19210a;
        if (widgetRun instanceof d) {
            return j10;
        }
        ArrayList arrayList = dependencyNode.f19215f;
        int size = arrayList.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            Dependency dependency = (Dependency) arrayList.get(i10);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.f19210a != widgetRun) {
                    jMin = Math.min(jMin, b(dependencyNode2, ((long) dependencyNode2.f19212c) + j10));
                }
            }
        }
        if (dependencyNode != widgetRun.end) {
            return jMin;
        }
        long wrapDimension = j10 - widgetRun.getWrapDimension();
        return Math.min(Math.min(jMin, b(widgetRun.start, wrapDimension)), wrapDimension - ((long) widgetRun.start.f19212c));
    }

    public static long c(DependencyNode dependencyNode, long j10) {
        WidgetRun widgetRun = dependencyNode.f19210a;
        if (widgetRun instanceof d) {
            return j10;
        }
        ArrayList arrayList = dependencyNode.f19215f;
        int size = arrayList.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            Dependency dependency = (Dependency) arrayList.get(i10);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.f19210a != widgetRun) {
                    jMax = Math.max(jMax, c(dependencyNode2, ((long) dependencyNode2.f19212c) + j10));
                }
            }
        }
        if (dependencyNode != widgetRun.start) {
            return jMax;
        }
        long wrapDimension = j10 + widgetRun.getWrapDimension();
        return Math.max(Math.max(jMax, c(widgetRun.end, wrapDimension)), wrapDimension - ((long) widgetRun.end.f19212c));
    }
}
