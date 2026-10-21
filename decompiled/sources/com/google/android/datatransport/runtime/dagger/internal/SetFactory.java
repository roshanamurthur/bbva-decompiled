package com.google.android.datatransport.runtime.dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes9.dex */
public final class SetFactory<T> implements Factory<Set<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Factory<Set<Object>> f43761c = InstanceFactory.create(Collections.emptySet());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Provider<T>> f43762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Provider<Collection<T>>> f43763b;

    public static final class Builder<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Provider<T>> f43764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<Provider<Collection<T>>> f43765b;

        public Builder(int i10, int i11) {
            this.f43764a = DaggerCollections.presizedList(i10);
            this.f43765b = DaggerCollections.presizedList(i11);
        }

        public Builder<T> addCollectionProvider(Provider<? extends Collection<? extends T>> provider) {
            this.f43765b.add(provider);
            return this;
        }

        public Builder<T> addProvider(Provider<? extends T> provider) {
            this.f43764a.add(provider);
            return this;
        }

        public SetFactory<T> build() {
            return new SetFactory<>(this.f43764a, this.f43765b);
        }
    }

    public SetFactory() {
        throw null;
    }

    public SetFactory(List list, List list2) {
        this.f43762a = list;
        this.f43763b = list2;
    }

    public static <T> Builder<T> builder(int i10, int i11) {
        return new Builder<>(i10, i11);
    }

    public static <T> Factory<Set<T>> empty() {
        return (Factory<Set<T>>) f43761c;
    }

    @Override // javax.inject.Provider
    public Set<T> get() {
        List<Provider<T>> list = this.f43762a;
        int size = list.size();
        List<Provider<Collection<T>>> list2 = this.f43763b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection<T> collection = list2.get(i10).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i11 = 0; i11 < size3; i11++) {
            hashSet.add(Preconditions.checkNotNull(list.get(i11).get()));
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            Iterator it = ((Collection) arrayList.get(i12)).iterator();
            while (it.hasNext()) {
                hashSet.add(Preconditions.checkNotNull(it.next()));
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
