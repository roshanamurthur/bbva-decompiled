package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class lu extends lp {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f57001g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f57002h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final getValue f57003f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu(@NotNull lq lqVar, @NotNull setTextKeepState settextkeepstate, @NotNull mc mcVar, @NotNull getValue getvalue) {
        super(lqVar, settextkeepstate, mcVar);
        Intrinsics.checkNotNullParameter(lqVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(mcVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        this.f57003f = getvalue;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        lu luVar = (lu) objArr[0];
        int i13 = f57002h;
        int i14 = ((i13 | 89) << 1) - (i13 ^ 89);
        f57001g = i14 % 128;
        if (i14 % 2 != 0) {
            ea eaVar = ea.INSTANCE;
            throw null;
        }
        ea eaVar2 = ea.INSTANCE;
        fk fkVar = (fk) ea.setX(new Object[]{luVar.setOnFocusChangeListener(), luVar.f57003f}, -80979287, 80979290, (int) System.currentTimeMillis());
        int i15 = f57001g + 7;
        f57002h = i15 % 128;
        int i16 = i15 % 2;
        return fkVar;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setY(new Object[]{this, continuation}, 547895865, -547895865, System.identityHashCode(this));
    }
}
