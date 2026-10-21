package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class lm extends lp {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f56968g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f56969h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final component17 f56970f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm(@NotNull lq lqVar, @NotNull setTextKeepState settextkeepstate, @NotNull mc mcVar, @NotNull component17 component17Var) {
        super(lqVar, settextkeepstate, mcVar);
        Intrinsics.checkNotNullParameter(lqVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(mcVar, "");
        Intrinsics.checkNotNullParameter(component17Var, "");
        this.f56970f = component17Var;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i12;
        int i15 = ~(i13 | i14);
        int i16 = ~i11;
        int i17 = i13 | i16;
        if ((((~(i10 | i16 | i12)) | (~(i11 | i13 | i12)) | (~(i17 | i14))) * 867) + (((~i17) | (~(i13 | i12)) | (~(i16 | i12))) * (-1734)) + ((i15 | (~(i16 | i14))) * (-867)) + (i11 * 868) + (i10 * 868) == 1) {
            throw new fh(32, null);
        }
        lm lmVar = (lm) objArr[0];
        a aVar = (a) objArr[1];
        int i18 = f56968g + 121;
        f56969h = i18 % 128;
        int i19 = i18 % 2;
        dz dzVar = dz.INSTANCE;
        fk fkVar = (fk) dz.setX(new Object[]{lmVar.setCompoundDrawableTintBlendMode(), lmVar.setOnFocusChangeListener(), lmVar.setX(), aVar, lmVar.f56970f}, -191093209, 191093210, (int) System.currentTimeMillis());
        int i20 = f56969h;
        int i21 = i20 ^ 69;
        int i22 = ((i20 & 69) | i21) << 1;
        int i23 = -i21;
        int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
        f56968g = i24 % 128;
        int i25 = i24 % 2;
        return fkVar;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setOnFocusChangeListener(new Object[]{this, continuation}, 1527424073, -1527424072, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setX(@NotNull a aVar) {
        return setOnFocusChangeListener(new Object[]{this, aVar}, -980662410, 980662410, System.identityHashCode(this));
    }
}
