package org.junit.runner.manipulation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.runner.Description;

/* JADX INFO: loaded from: classes13.dex */
public class Sorter extends Ordering implements Comparator<Description> {
    public static final Sorter NULL = new Sorter(new a());

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Comparator<Description> f91998p0;

    public static class a implements Comparator<Description> {
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Description description, Description description2) {
            return 0;
        }
    }

    public Sorter(Comparator<Description> comparator) {
        this.f91998p0 = comparator;
    }

    @Override // org.junit.runner.manipulation.Ordering
    public final boolean a() {
        return false;
    }

    @Override // org.junit.runner.manipulation.Ordering
    public void apply(Object obj) {
        if (obj instanceof Sortable) {
            ((Sortable) obj).sort(this);
        }
    }

    @Override // org.junit.runner.manipulation.Ordering
    public final List<Description> orderItems(Collection<Description> collection) {
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList, this);
        return arrayList;
    }

    @Override // java.util.Comparator
    public int compare(Description description, Description description2) {
        return this.f91998p0.compare(description, description2);
    }
}
