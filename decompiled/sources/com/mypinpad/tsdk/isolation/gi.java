package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class gi extends fy {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56022j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f56023k = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56024i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(@NotNull fi fiVar, @NotNull setTextKeepState settextkeepstate, @NotNull gr grVar, @NotNull getValue getvalue, @NotNull setContentDescription setcontentdescription) {
        super(fiVar, settextkeepstate, grVar, getvalue);
        Intrinsics.checkNotNullParameter(fiVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(grVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f56024i = setcontentdescription;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        gi giVar = (gi) objArr[0];
        setRotationX setrotationx = (setRotationX) objArr[1];
        int i13 = f56023k;
        int i14 = ((i13 ^ 110) + ((i13 & 110) << 1)) - 1;
        f56022j = i14 % 128;
        int i15 = i14 % 2;
        Intrinsics.checkNotNullParameter(setrotationx, "");
        ef efVar = ef.INSTANCE;
        fk fkVar = (fk) ef.setY(new Object[]{giVar.setOnFocusChangeListener(), giVar.setCompoundDrawableTintBlendMode(), (ew) giVar.setX(), setrotationx}, -1790973370, 1790973370, (int) System.currentTimeMillis());
        if (fkVar != null) {
            int i16 = f56023k + 45;
            f56022j = i16 % 128;
            if (i16 % 2 == 0) {
                return fkVar;
            }
            throw null;
        }
        gc gcVar = gc.INSTANCE;
        fk fkVar2 = (fk) gc.setDividerPadding(new Object[]{(fi) giVar.setOnFocusChangeListener(), giVar.f56024i, giVar.setY()}, 117891719, -117891719, (int) System.currentTimeMillis());
        fi fiVar = (fi) giVar.setOnFocusChangeListener();
        if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar}, 910478205, -910478157, System.identityHashCode(fiVar))).booleanValue()) {
            int i17 = f56022j;
            int i18 = i17 | 75;
            int i19 = ((i18 << 1) - (~(-((~(i17 & 75)) & i18)))) - 1;
            f56023k = i19 % 128;
            if (i19 % 2 != 0) {
                return fkVar2;
            }
            int i20 = 97 / 0;
            return fkVar2;
        }
        int i21 = f56022j;
        int i22 = i21 & 69;
        int i23 = (i22 - (~((i21 ^ 69) | i22))) - 1;
        f56023k = i23 % 128;
        if (i23 % 2 != 0) {
            gr grVar = (gr) giVar.setX();
            return (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, (fi) giVar.setOnFocusChangeListener(), giVar.setCompoundDrawableTintBlendMode()}, 532812653, -532812648, System.identityHashCode(grVar));
        }
        gr grVar2 = (gr) giVar.setX();
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setOnFocusChangeListener(new Object[]{this, setrotationx}, 1754602991, -1754602991, System.identityHashCode(this));
    }
}
