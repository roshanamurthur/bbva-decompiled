package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setTopEdgeEffectColor extends setForeground {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public final String f60742p0;

    public setTopEdgeEffectColor(@Nullable String str) {
        super(null);
        this.f60742p0 = str;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        return ((setTopEdgeEffectColor) objArr[0]).f60742p0;
    }

    @Nullable
    public final String setOnFocusChangeListener() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 2139112085, -2139112085, System.identityHashCode(this));
    }
}
