package io.reactivex.observables;

import io.reactivex.Observable;
import io.reactivex.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class GroupedObservable<K, T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final K f73804p0;

    public GroupedObservable(@Nullable K k10) {
        this.f73804p0 = k10;
    }

    @Nullable
    public K getKey() {
        return this.f73804p0;
    }
}
