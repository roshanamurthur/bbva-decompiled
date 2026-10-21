package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class lg extends kx {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56935j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f56936k = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56937i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg(@NotNull kz kzVar, @NotNull setTextKeepState settextkeepstate, @NotNull lj ljVar, @NotNull getValue getvalue, @NotNull setContentDescription setcontentdescription) {
        super(kzVar, settextkeepstate, ljVar, getvalue);
        Intrinsics.checkNotNullParameter(kzVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(ljVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f56937i = setcontentdescription;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        lg lgVar = (lg) objArr[0];
        setRotationX setrotationx = (setRotationX) objArr[1];
        int i14 = f56935j;
        int i15 = (i14 ^ 49) + ((i14 & 49) << 1);
        f56936k = i15 % 128;
        if (i15 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setrotationx, "");
            ef efVar = ef.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setrotationx, "");
        ef efVar2 = ef.INSTANCE;
        fk fkVar = (fk) ef.setY(new Object[]{lgVar.setOnFocusChangeListener(), lgVar.setCompoundDrawableTintBlendMode(), (ew) lgVar.setX(), setrotationx}, -1790973370, 1790973370, (int) System.currentTimeMillis());
        if (fkVar != null) {
            int i16 = f56935j;
            int i17 = i16 & 39;
            int i18 = ((i16 | 39) & (~i17)) + (i17 << 1);
            f56936k = i18 % 128;
            if (i18 % 2 == 0) {
                i13 = 81;
                int i19 = i13 / 0;
            }
        } else {
            lf lfVar = lf.INSTANCE;
            fkVar = (fk) lf.setY(new Object[]{(kz) lgVar.setOnFocusChangeListener(), lgVar.setCompoundDrawableTintBlendMode(), lgVar.setY(), lgVar.f56937i, (lj) lgVar.setX()}, -2123977884, 2123977884, (int) System.currentTimeMillis());
            int i20 = f56936k + 99;
            f56935j = i20 % 128;
            if (i20 % 2 != 0) {
                i13 = 18;
                int i110 = i13 / 0;
            }
        }
        return fkVar;
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setOnFocusChangeListener(new Object[]{this, setrotationx}, 1900774042, -1900774042, System.identityHashCode(this));
    }
}
