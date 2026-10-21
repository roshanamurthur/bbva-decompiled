package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ge extends fy {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f55656i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f55657j = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(@NotNull fi fiVar, @NotNull setTextKeepState settextkeepstate, @NotNull gr grVar, @NotNull getValue getvalue) {
        super(fiVar, settextkeepstate, grVar, getvalue);
        Intrinsics.checkNotNullParameter(fiVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(grVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        ge geVar = (ge) objArr[0];
        setRotationX setrotationx = (setRotationX) objArr[1];
        int i13 = f55657j;
        int i14 = (-2) - (((i13 & 104) + (i13 | 104)) ^ (-1));
        f55656i = i14 % 128;
        if (i14 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setrotationx, "");
            ef efVar = ef.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setrotationx, "");
        ef efVar2 = ef.INSTANCE;
        fk fkVar = (fk) ef.setY(new Object[]{geVar.setOnFocusChangeListener(), geVar.setCompoundDrawableTintBlendMode(), (ew) geVar.setX(), setrotationx}, -1790973370, 1790973370, (int) System.currentTimeMillis());
        if (fkVar == null) {
            fk fkVar2 = fk.setMaxEms;
            int i15 = f55657j + 9;
            f55656i = i15 % 128;
            int i16 = i15 % 2;
            return fkVar2;
        }
        int i17 = f55656i;
        int i18 = i17 & 83;
        int i19 = ((((i17 ^ 83) | i18) << 1) - (~(-((i17 | 83) & (~i18))))) - 1;
        f55657j = i19 % 128;
        if (i19 % 2 != 0) {
            return fkVar;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setDividerPadding(new Object[]{this, setrotationx}, -805468263, 805468263, System.identityHashCode(this));
    }
}
