package org.bouncycastle.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class CollectionStore<T> implements Store<T>, Iterable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ArrayList f91634p0;

    public CollectionStore(Collection<T> collection) {
        this.f91634p0 = new ArrayList(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.bouncycastle.util.Store
    public Collection<T> getMatches(Selector<T> selector) {
        ArrayList arrayList = this.f91634p0;
        if (selector == 0) {
            return new ArrayList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (selector.match(obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
    public Iterator<T> iterator() {
        return getMatches(null).iterator();
    }
}
