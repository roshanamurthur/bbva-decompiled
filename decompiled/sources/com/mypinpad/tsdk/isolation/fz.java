package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class fz extends fx {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final component17 f55585f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz(@NotNull fi fiVar, @NotNull setTextKeepState settextkeepstate, @NotNull gr grVar, @NotNull component17 component17Var) {
        super(fiVar, settextkeepstate, grVar);
        Intrinsics.checkNotNullParameter(fiVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(grVar, "");
        Intrinsics.checkNotNullParameter(component17Var, "");
        this.f55585f = component17Var;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = ((i10 | i13) * (-757)) + (i11 * (-756)) + (i10 * 758);
        int i15 = ~i11;
        if ((((~(i10 | i11 | i12)) | (~(i13 | i15)) | (~((~i10) | i15))) * 757) + ((~(i15 | i10 | i12)) * 1514) + i14 == 1) {
            throw new fh(32, null);
        }
        fz fzVar = (fz) objArr[0];
        a aVar = (a) objArr[1];
        dz dzVar = dz.INSTANCE;
        return (fk) dz.setX(new Object[]{fzVar.setCompoundDrawableTintBlendMode(), fzVar.setOnFocusChangeListener(), fzVar.setX(), aVar, fzVar.f55585f}, -191093209, 191093210, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setX(new Object[]{this, continuation}, 25481279, -25481278, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setX(@NotNull a aVar) {
        return setX(new Object[]{this, aVar}, -1063628305, 1063628305, System.identityHashCode(this));
    }
}
