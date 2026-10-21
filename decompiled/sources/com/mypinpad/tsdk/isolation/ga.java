package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class ga extends fx {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f55647g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f55648h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final getValue f55649f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(@NotNull fi fiVar, @NotNull setTextKeepState settextkeepstate, @NotNull gr grVar, @NotNull getValue getvalue) {
        super(fiVar, settextkeepstate, grVar);
        Intrinsics.checkNotNullParameter(fiVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(grVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        this.f55649f = getvalue;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        fk fkVar;
        ga gaVar = (ga) objArr[0];
        int i13 = f55648h + 6;
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        f55647g = i14 % 128;
        if (i14 % 2 != 0) {
            ea eaVar = ea.INSTANCE;
            fkVar = (fk) ea.setX(new Object[]{gaVar.setOnFocusChangeListener(), gaVar.f55649f}, -80979287, 80979290, (int) System.currentTimeMillis());
            int i15 = 69 / 0;
        } else {
            ea eaVar2 = ea.INSTANCE;
            fkVar = (fk) ea.setX(new Object[]{gaVar.setOnFocusChangeListener(), gaVar.f55649f}, -80979287, 80979290, (int) System.currentTimeMillis());
        }
        int i16 = f55647g;
        int i17 = ((i16 | 27) << 1) - (i16 ^ 27);
        f55648h = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 33 / 0;
        }
        return fkVar;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setY(new Object[]{this, continuation}, -1302272293, 1302272293, System.identityHashCode(this));
    }
}
