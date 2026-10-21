package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class MotionScene {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Transition> f18679a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<ConstraintSet> f18680b = new ArrayList<>();

    public void addConstraintSet(ConstraintSet constraintSet) {
        this.f18680b.add(constraintSet);
    }

    public void addTransition(Transition transition) {
        this.f18679a.add(transition);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{\n");
        ArrayList<Transition> arrayList = this.f18679a;
        if (!arrayList.isEmpty()) {
            sb2.append("Transitions:{\n");
            Iterator<Transition> it = arrayList.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
            }
            sb2.append("},\n");
        }
        ArrayList<ConstraintSet> arrayList2 = this.f18680b;
        if (!arrayList2.isEmpty()) {
            sb2.append("ConstraintSets:{\n");
            Iterator<ConstraintSet> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                sb2.append(it2.next().toString());
            }
            sb2.append("},\n");
        }
        sb2.append("}\n");
        return sb2.toString();
    }
}
