package com.mypinpad.tsdk.isolation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ua implements tv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final uc f61259a;

    public ua(@NotNull uc ucVar) {
        Intrinsics.checkNotNullParameter(ucVar, "");
        this.f61259a = ucVar;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        ua uaVar = (ua) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        ud udVar = (ud) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        Intrinsics.checkNotNullParameter(udVar, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new ty(iIntValue, udVar, uaVar.f61259a, function1);
    }

    @Override // com.mypinpad.tsdk.isolation.tv
    @NotNull
    public final tq setX(int i10, @NotNull ud udVar, @NotNull Function1<? super ud, Unit> function1) {
        return (tq) setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10), udVar, function1}, 1706273491, -1706273491, i10);
    }
}
