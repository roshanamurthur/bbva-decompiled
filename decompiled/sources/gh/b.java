package gh;

import java.util.ArrayList;

/* JADX INFO: compiled from: ExpandedRow.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f68615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f68617c = false;

    public b(int i10, ArrayList arrayList) {
        this.f68615a = new ArrayList(arrayList);
        this.f68616b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f68615a.equals(bVar.f68615a) && this.f68617c == bVar.f68617c;
    }

    public final int hashCode() {
        return this.f68615a.hashCode() ^ Boolean.valueOf(this.f68617c).hashCode();
    }

    public final String toString() {
        return "{ " + this.f68615a + " }";
    }
}
