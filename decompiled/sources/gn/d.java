package gn;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: compiled from: Throwables.java */
/* JADX INFO: loaded from: classes13.dex */
public final class d extends AbstractList<Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ List f68622p0;

    public d(List list) {
        this.f68622p0 = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        List list = this.f68622p0;
        return list.get((list.size() - i10) - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f68622p0.size();
    }
}
