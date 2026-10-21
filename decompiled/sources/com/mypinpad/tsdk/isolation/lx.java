package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class lx extends lo {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final component10 f57008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final setFontFeatureSettings f57009j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final setContentDescription f57010k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx(@NotNull lq lqVar, @NotNull setTextKeepState settextkeepstate, @NotNull mc mcVar, @NotNull getValue getvalue, @NotNull component10 component10Var, @NotNull setFontFeatureSettings setfontfeaturesettings, @NotNull setContentDescription setcontentdescription) {
        super(lqVar, settextkeepstate, mcVar, getvalue);
        Intrinsics.checkNotNullParameter(lqVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(mcVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f57008i = component10Var;
        this.f57009j = setfontfeaturesettings;
        this.f57010k = setcontentdescription;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        lx lxVar = (lx) objArr[0];
        setRotationX setrotationx = (setRotationX) objArr[1];
        Intrinsics.checkNotNullParameter(setrotationx, "");
        du duVar = du.INSTANCE;
        fk fkVar = (fk) du.setOnFocusChangeListener(new Object[]{lxVar.setOnFocusChangeListener(), lxVar.setCompoundDrawableTintBlendMode(), (ew) lxVar.setX(), setrotationx}, -307728844, 307728854, (int) System.currentTimeMillis());
        if (fkVar != null) {
            return fkVar;
        }
        ma maVar = ma.INSTANCE;
        return (fk) ma.setDividerPadding(new Object[]{(lq) lxVar.setOnFocusChangeListener(), lxVar.setCompoundDrawableTintBlendMode(), (ew) lxVar.setX(), lxVar.f57009j, lxVar.setY(), lxVar.f57008i, lxVar.f57010k}, 356977936, -356977936, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setDividerPadding(new Object[]{this, setrotationx}, 91379770, -91379770, System.identityHashCode(this));
    }
}
