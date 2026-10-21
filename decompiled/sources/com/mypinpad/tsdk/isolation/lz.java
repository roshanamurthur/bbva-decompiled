package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class lz extends lp {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f57016j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f57017k = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final getValue f57018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final component10 f57019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final setFontFeatureSettings f57020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final setContentDescription f57021i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz(@NotNull lq lqVar, @NotNull setTextKeepState settextkeepstate, @NotNull mc mcVar, @NotNull getValue getvalue, @NotNull component10 component10Var, @NotNull setFontFeatureSettings setfontfeaturesettings, @NotNull setContentDescription setcontentdescription) {
        super(lqVar, settextkeepstate, mcVar);
        Intrinsics.checkNotNullParameter(lqVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(mcVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f57018f = getvalue;
        this.f57019g = component10Var;
        this.f57020h = setfontfeaturesettings;
        this.f57021i = setcontentdescription;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        lz lzVar = (lz) objArr[0];
        lq onFocusChangeListener = lzVar.setOnFocusChangeListener();
        getValue getvalue = lzVar.f57018f;
        lt ltVar = new lt(onFocusChangeListener, getvalue);
        fk fkVar = (fk) lt.setCompoundDrawableTintBlendMode(new Object[]{ltVar}, -1514599774, 1514599775, System.identityHashCode(ltVar));
        if (fkVar != null) {
            int i13 = f57017k + 42;
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            f57016j = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
        } else {
            ma maVar = ma.INSTANCE;
            fkVar = (fk) ma.setDividerPadding(new Object[]{lzVar.setOnFocusChangeListener(), lzVar.setCompoundDrawableTintBlendMode(), lzVar.setX(), lzVar.f57020h, getvalue, lzVar.f57019g, lzVar.f57021i}, 356977936, -356977936, (int) System.currentTimeMillis());
            int i15 = f57016j;
            int i16 = (i15 ^ 87) + ((i15 & 87) << 1);
            f57017k = i16 % 128;
            if (i16 % 2 == 0) {
                throw null;
            }
        }
        return fkVar;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setX(new Object[]{this, continuation}, -1504790241, 1504790241, System.identityHashCode(this));
    }
}
