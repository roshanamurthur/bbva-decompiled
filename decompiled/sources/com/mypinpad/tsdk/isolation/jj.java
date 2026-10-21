package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class jj extends jk {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final component17 f56648f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj(@NotNull iv ivVar, @NotNull setTextKeepState settextkeepstate, @NotNull kc kcVar, @NotNull component17 component17Var) {
        super(ivVar, settextkeepstate, kcVar);
        Intrinsics.checkNotNullParameter(ivVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(kcVar, "");
        Intrinsics.checkNotNullParameter(component17Var, "");
        this.f56648f = component17Var;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 253) + (i10 * 253);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~(i14 | i15);
        int i17 = i15 | (~i12);
        int i18 = i16 | (~i17);
        int i19 = i11 | i10;
        int i20 = ~(i12 | i19);
        if ((((~(i10 | i17)) | i20) * 252) + (i19 * (-252)) + ((i18 | i20) * (-252)) + i13 != 1) {
            throw new fh(32, null);
        }
        jj jjVar = (jj) objArr[0];
        a aVar = (a) objArr[1];
        dz dzVar = dz.INSTANCE;
        return (fk) dz.setX(new Object[]{jjVar.setCompoundDrawableTintBlendMode(), jjVar.setOnFocusChangeListener(), jjVar.setX(), aVar, jjVar.f56648f}, -191093209, 191093210, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setY(new Object[]{this, continuation}, 1997336821, -1997336821, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setX(@NotNull a aVar) {
        return setY(new Object[]{this, aVar}, -1918683375, 1918683376, System.identityHashCode(this));
    }
}
