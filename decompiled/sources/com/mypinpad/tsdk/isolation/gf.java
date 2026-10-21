package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class gf extends fy {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56011j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f56012k = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56013i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf(@NotNull fi fiVar, @NotNull setTextKeepState settextkeepstate, @NotNull gr grVar, @NotNull getValue getvalue, @NotNull setContentDescription setcontentdescription) {
        super(fiVar, settextkeepstate, grVar, getvalue);
        Intrinsics.checkNotNullParameter(fiVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(grVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f56013i = setcontentdescription;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        gf gfVar = (gf) objArr[0];
        setRotationX setrotationx = (setRotationX) objArr[1];
        int i13 = f56012k;
        int i14 = ((i13 & 83) - (~(i13 | 83))) - 1;
        f56011j = i14 % 128;
        int i15 = i14 % 2;
        Intrinsics.checkNotNullParameter(setrotationx, "");
        ea eaVar = ea.INSTANCE;
        fk fkVar = (fk) ea.setX(new Object[]{eaVar, gfVar.setOnFocusChangeListener(), gfVar.setCompoundDrawableTintBlendMode(), (ew) gfVar.setX(), setrotationx}, -221571889, 221571889, System.identityHashCode(eaVar));
        if (fkVar != null) {
            int i16 = f56012k;
            int i17 = (i16 & 47) + (i16 | 47);
            f56011j = i17 % 128;
            if (i17 % 2 == 0) {
                return fkVar;
            }
            throw null;
        }
        gc gcVar = gc.INSTANCE;
        fk fkVar2 = (fk) gc.setDividerPadding(new Object[]{(fi) gfVar.setOnFocusChangeListener(), gfVar.f56013i, gfVar.setY()}, 117891719, -117891719, (int) System.currentTimeMillis());
        int i18 = f56011j;
        int i19 = (i18 & (-58)) | ((~i18) & 57);
        int i20 = -(-((i18 & 57) << 1));
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        f56012k = i21 % 128;
        int i22 = i21 % 2;
        return fkVar2;
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setDividerPadding(new Object[]{this, setrotationx}, 1733117576, -1733117576, System.identityHashCode(this));
    }
}
