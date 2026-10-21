package com.google.android.datatransport.runtime.dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class SetBuilder<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f43760a;

    public SetBuilder(int i10) {
        this.f43760a = new ArrayList(i10);
    }

    public static <T> SetBuilder<T> newSetBuilder(int i10) {
        return new SetBuilder<>(i10);
    }

    public SetBuilder<T> add(T t10) {
        this.f43760a.add(Preconditions.checkNotNull(t10, "Set contributions cannot be null"));
        return this;
    }

    public SetBuilder<T> addAll(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            Preconditions.checkNotNull(it.next(), "Set contributions cannot be null");
        }
        this.f43760a.addAll(collection);
        return this;
    }

    public Set<T> build() {
        ArrayList arrayList = this.f43760a;
        int size = arrayList.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableSet(new HashSet(arrayList)) : Collections.singleton(arrayList.get(0));
        }
        return Collections.emptySet();
    }
}
