package io.reactivex.flowables;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public abstract class GroupedFlowable<K, T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final K f69891q0;

    public GroupedFlowable(@Nullable K k10) {
        this.f69891q0 = k10;
    }

    @Nullable
    public K getKey() {
        return this.f69891q0;
    }
}
