package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/setTextMetricsParams;", "Lcom/mypinpad/tsdk/i/setContentInsetsRelative;", "Lcom/mypinpad/tsdk/i/mv;", "p0", "", "p1", "<init>", "(Lcom/mypinpad/tsdk/i/mv;Z)V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setTextMetricsParams extends setContentInsetsRelative {
    public /* synthetic */ setTextMetricsParams(mv mvVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mvVar, (i10 & 2) != 0 ? false : z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setTextMetricsParams(@NotNull mv mvVar, boolean z10) {
        super(z10, mvVar, null);
        Intrinsics.checkNotNullParameter(mvVar, "");
    }
}
