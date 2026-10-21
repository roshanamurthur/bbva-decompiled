package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class og extends ok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Integer f57465a;

    public og(@Nullable Integer num) {
        super(null);
        this.f57465a = num;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        return ((og) objArr[0]).f57465a;
    }

    @Nullable
    public final Integer setX() {
        return (Integer) setX(new Object[]{this}, 1306903289, -1306903289, System.identityHashCode(this));
    }
}
