package com.mypinpad.tsdk.isolation;

import java.time.Clock;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setPointerIcon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setBaseline f60325a;

    public setPointerIcon(@NotNull setBaseline setbaseline) {
        Intrinsics.checkNotNullParameter(setbaseline, "");
        this.f60325a = setbaseline;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        setPointerIcon setpointericon = (setPointerIcon) objArr[0];
        setpointericon.f60325a.setCompoundDrawableTintBlendMode(((Number) objArr[1]).longValue());
        return Long.valueOf(Clock.systemUTC().millis());
    }

    public final long setY(long j10) {
        return ((Long) setDividerPadding(new Object[]{this, Long.valueOf(j10)}, 1455342487, -1455342487, System.identityHashCode(this))).longValue();
    }
}
