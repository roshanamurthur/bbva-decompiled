package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ld extends kx {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56929j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f56930k = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56931i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(@NotNull kz kzVar, @NotNull setTextKeepState settextkeepstate, @NotNull lj ljVar, @NotNull getValue getvalue, @NotNull setContentDescription setcontentdescription) {
        super(kzVar, settextkeepstate, ljVar, getvalue);
        Intrinsics.checkNotNullParameter(kzVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(ljVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f56931i = setcontentdescription;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        ld ldVar = (ld) objArr[0];
        setRotationX setrotationx = (setRotationX) objArr[1];
        int i13 = f56929j;
        int i14 = ((((i13 ^ 97) | (i13 & 97)) << 1) - (~(-(((~i13) & 97) | (i13 & (-98)))))) - 1;
        f56930k = i14 % 128;
        if (i14 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setrotationx, "");
            ea eaVar = ea.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setrotationx, "");
        ea eaVar2 = ea.INSTANCE;
        fk fkVar = (fk) ea.setX(new Object[]{eaVar2, ldVar.setOnFocusChangeListener(), ldVar.setCompoundDrawableTintBlendMode(), (ew) ldVar.setX(), setrotationx}, -221571889, 221571889, System.identityHashCode(eaVar2));
        if (fkVar != null) {
            int i15 = f56929j + 51;
            f56930k = i15 % 128;
            if (i15 % 2 != 0) {
                return fkVar;
            }
            int i16 = 5 / 0;
            return fkVar;
        }
        lf lfVar = lf.INSTANCE;
        fk fkVar2 = (fk) lf.setY(new Object[]{(kz) ldVar.setOnFocusChangeListener(), ldVar.setCompoundDrawableTintBlendMode(), ldVar.setY(), ldVar.f56931i, (lj) ldVar.setX()}, -2123977884, 2123977884, (int) System.currentTimeMillis());
        int i17 = f56930k;
        int i18 = ((i17 | 105) << 1) - (i17 ^ 105);
        f56929j = i18 % 128;
        int i19 = i18 % 2;
        return fkVar2;
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setX(new Object[]{this, setrotationx}, 1564935230, -1564935230, System.identityHashCode(this));
    }
}
