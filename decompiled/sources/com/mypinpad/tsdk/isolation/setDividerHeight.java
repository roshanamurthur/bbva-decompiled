package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setDividerHeight extends setHorizontalScrollBarEnabled {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f59631c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setDividerHeight(@NotNull String str, long j10) {
        super(str, null);
        Intrinsics.checkNotNullParameter(str, "");
        this.f59631c = j10;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        return Long.valueOf(((setDividerHeight) objArr[0]).f59631c);
    }

    public final long setX() {
        return ((Long) setY(new Object[]{this}, 55229847, -55229847, System.identityHashCode(this))).longValue();
    }
}
