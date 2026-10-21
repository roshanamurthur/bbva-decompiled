package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class lc extends ky {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final getValue f56928f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(@NotNull kz kzVar, @NotNull setTextKeepState settextkeepstate, @NotNull lj ljVar, @NotNull getValue getvalue) {
        super(kzVar, settextkeepstate, ljVar);
        Intrinsics.checkNotNullParameter(kzVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(ljVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        this.f56928f = getvalue;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        lc lcVar = (lc) objArr[0];
        ea eaVar = ea.INSTANCE;
        return (fk) ea.setX(new Object[]{lcVar.setOnFocusChangeListener(), lcVar.f56928f}, -80979287, 80979290, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setX(new Object[]{this, continuation}, -1990398155, 1990398155, System.identityHashCode(this));
    }
}
