package io.reactivex.rxjava3.flowables;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class GroupedFlowable<K, T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final K f73966q0;

    public GroupedFlowable(@Nullable K k10) {
        this.f73966q0 = k10;
    }

    @Nullable
    public K getKey() {
        return this.f73966q0;
    }
}
