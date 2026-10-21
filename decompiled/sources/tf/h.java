package tf;

import com.google.firebase.components.Component;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.DependencyCycleException;
import com.google.firebase.components.Qualified;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: CycleDetector.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: compiled from: CycleDetector.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Component<?> f93571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashSet f93572b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashSet f93573c = new HashSet();

        public a(Component<?> component) {
            this.f93571a = component;
        }
    }

    /* JADX INFO: compiled from: CycleDetector.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Qualified<?> f93574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f93575b;

        public b() {
            throw null;
        }

        public b(Qualified qualified, boolean z10) {
            this.f93574a = qualified;
            this.f93575b = z10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f93574a.equals(this.f93574a) && bVar.f93575b == this.f93575b;
        }

        public final int hashCode() {
            return ((this.f93574a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f93575b).hashCode();
        }
    }

    public static void a(ArrayList arrayList) {
        Set<a> set;
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (a aVar : (Set) it2.next()) {
                        for (Dependency dependency : aVar.f93571a.getDependencies()) {
                            if (dependency.isDirectInjection() && (set = (Set) map.get(new b(dependency.getInterface(), dependency.isSet()))) != null) {
                                for (a aVar2 : set) {
                                    aVar.f93572b.add(aVar2);
                                    aVar2.f93573c.add(aVar);
                                }
                            }
                        }
                    }
                }
                HashSet<a> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (a aVar3 : hashSet) {
                    if (aVar3.f93573c.isEmpty()) {
                        hashSet2.add(aVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    a aVar4 = (a) hashSet2.iterator().next();
                    hashSet2.remove(aVar4);
                    i10++;
                    for (a aVar5 : aVar4.f93572b) {
                        aVar5.f93573c.remove(aVar4);
                        if (aVar5.f93573c.isEmpty()) {
                            hashSet2.add(aVar5);
                        }
                    }
                }
                if (i10 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (a aVar6 : hashSet) {
                    if (!aVar6.f93573c.isEmpty() && !aVar6.f93572b.isEmpty()) {
                        arrayList2.add(aVar6.f93571a);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
            Component component = (Component) it.next();
            a aVar7 = new a(component);
            for (Qualified qualified : component.getProvidedInterfaces()) {
                boolean z10 = !component.isValue();
                b bVar = new b(qualified, z10);
                if (!map.containsKey(bVar)) {
                    map.put(bVar, new HashSet());
                }
                Set set2 = (Set) map.get(bVar);
                if (!set2.isEmpty() && !z10) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", qualified));
                }
                set2.add(aVar7);
            }
        }
    }
}
