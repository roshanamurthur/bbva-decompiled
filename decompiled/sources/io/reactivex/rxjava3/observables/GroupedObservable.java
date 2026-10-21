package io.reactivex.rxjava3.observables;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class GroupedObservable<K, T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final K f78214p0;

    public GroupedObservable(@Nullable K k10) {
        this.f78214p0 = k10;
    }

    @Nullable
    public K getKey() {
        return this.f78214p0;
    }
}
