package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class gm extends fx {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final getValue f56044f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(@NotNull fi fiVar, @NotNull setTextKeepState settextkeepstate, @NotNull gr grVar, @NotNull getValue getvalue) {
        super(fiVar, settextkeepstate, grVar);
        Intrinsics.checkNotNullParameter(fiVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(grVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        this.f56044f = getvalue;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Exception {
        gm gmVar = (gm) objArr[0];
        gh ghVar = new gh(gmVar.setOnFocusChangeListener());
        gh.setY(new Object[]{ghVar}, -574935641, 574935642, System.identityHashCode(ghVar));
        go goVar = new go(gmVar.setOnFocusChangeListener(), gmVar.f56044f);
        return (fk) go.setDividerPadding(new Object[]{goVar}, -628542188, 628542188, System.identityHashCode(goVar));
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setY(new Object[]{this, continuation}, -1172420074, 1172420074, System.identityHashCode(this));
    }
}
