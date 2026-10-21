package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ls extends lo {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56988j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f56989k = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56990i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls(@NotNull lq lqVar, @NotNull setTextKeepState settextkeepstate, @NotNull mc mcVar, @NotNull getValue getvalue, @NotNull setContentDescription setcontentdescription) {
        super(lqVar, settextkeepstate, mcVar, getvalue);
        Intrinsics.checkNotNullParameter(lqVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(mcVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f56990i = setcontentdescription;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        ls lsVar = (ls) objArr[0];
        setRotationX setrotationx = (setRotationX) objArr[1];
        int i13 = f56989k;
        int i14 = i13 & 13;
        int i15 = i14 + ((i13 ^ 13) | i14);
        f56988j = i15 % 128;
        int i16 = i15 % 2;
        Intrinsics.checkNotNullParameter(setrotationx, "");
        ea eaVar = ea.INSTANCE;
        fk fkVar = (fk) ea.setX(new Object[]{eaVar, lsVar.setOnFocusChangeListener(), lsVar.setCompoundDrawableTintBlendMode(), (ew) lsVar.setX(), setrotationx}, -221571889, 221571889, System.identityHashCode(eaVar));
        if (fkVar == null) {
            lv lvVar = lv.INSTANCE;
            fk fkVar2 = (fk) lv.setDividerPadding(new Object[]{(lq) lsVar.setOnFocusChangeListener(), lsVar.f56990i, lsVar.setY()}, -382258194, 382258194, (int) System.currentTimeMillis());
            int i17 = f56989k;
            int i18 = i17 & 25;
            int i19 = (i17 ^ 25) | i18;
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            f56988j = i20 % 128;
            int i21 = i20 % 2;
            return fkVar2;
        }
        int i22 = f56988j;
        int i23 = ((i22 & 104) + (i22 | 104)) - 1;
        int i24 = i23 % 128;
        f56989k = i24;
        int i25 = i23 % 2;
        int i26 = (i24 & 20) + (i24 | 20);
        int i27 = (i26 ^ (-1)) + (i26 << 1);
        f56988j = i27 % 128;
        int i28 = i27 % 2;
        return fkVar;
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setX(new Object[]{this, setrotationx}, 1082927187, -1082927187, System.identityHashCode(this));
    }
}
