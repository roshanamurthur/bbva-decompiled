package androidx.constraintlayout.core.dsl;

import ad.d;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<Constraint> f18613b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<Helper> f18614c = new ArrayList<>();

    public ConstraintSet(String str) {
        this.f18612a = str;
    }

    public void add(Constraint constraint) {
        this.f18613b.add(constraint);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(d.f(new StringBuilder(), this.f18612a, ":{\n"));
        ArrayList<Constraint> arrayList = this.f18613b;
        if (!arrayList.isEmpty()) {
            Iterator<Constraint> it = arrayList.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
            }
        }
        ArrayList<Helper> arrayList2 = this.f18614c;
        if (!arrayList2.isEmpty()) {
            Iterator<Helper> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                sb2.append(it2.next().toString());
            }
        }
        sb2.append("},\n");
        return sb2.toString();
    }

    public void add(Helper helper) {
        this.f18614c.add(helper);
    }
}
