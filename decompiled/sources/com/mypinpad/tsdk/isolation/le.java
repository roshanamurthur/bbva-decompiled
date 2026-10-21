package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class le extends ky {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final component17 f56932f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(@NotNull kz kzVar, @NotNull setTextKeepState settextkeepstate, @NotNull lj ljVar, @NotNull component17 component17Var) {
        super(kzVar, settextkeepstate, ljVar);
        Intrinsics.checkNotNullParameter(kzVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(ljVar, "");
        Intrinsics.checkNotNullParameter(component17Var, "");
        this.f56932f = component17Var;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ((i11 | i13) * (-1434)) + (i11 * 1435) + (i10 * (-716));
        int i15 = ~i12;
        int i16 = ~(i15 | i11);
        int i17 = ~(i10 | i11);
        int i18 = i13 | (~i11);
        if (((i17 | (~(i18 | i15)) | (~(i11 | i12))) * 717) + ((i16 | i17 | (~(i18 | i12))) * 717) + i14 != 1) {
            throw new fh(32, null);
        }
        le leVar = (le) objArr[0];
        a aVar = (a) objArr[1];
        setMaxWidth setmaxwidth = (setMaxWidth) a.setX(new Object[]{aVar}, -917873151, 917873153, System.identityHashCode(aVar));
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -692948779, 692948802, (int) System.currentTimeMillis());
        ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 1949712751, -1949712727, System.identityHashCode(setmaxwidth))).booleanValue();
        dz dzVar = dz.INSTANCE;
        return (fk) dz.setX(new Object[]{leVar.setCompoundDrawableTintBlendMode(), leVar.setOnFocusChangeListener(), leVar.setX(), aVar, leVar.f56932f}, -191093209, 191093210, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setX(@NotNull a aVar) {
        return setDividerPadding(new Object[]{this, aVar}, -1890883354, 1890883355, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setDividerPadding(new Object[]{this, continuation}, 1743448351, -1743448351, System.identityHashCode(this));
    }
}
