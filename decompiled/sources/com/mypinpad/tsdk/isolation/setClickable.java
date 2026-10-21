package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setClickable extends setWeightSum {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setDividerDrawable f59548a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setClickable(@NotNull setDividerDrawable setdividerdrawable) {
        super(null);
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        this.f59548a = setdividerdrawable;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        return ((setClickable) objArr[0]).f59548a;
    }

    @NotNull
    public final setDividerDrawable setDividerPadding() {
        return (setDividerDrawable) setDividerPadding(new Object[]{this}, 2115191235, -2115191235, System.identityHashCode(this));
    }
}
