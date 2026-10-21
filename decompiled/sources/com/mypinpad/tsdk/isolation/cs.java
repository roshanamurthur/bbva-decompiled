package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class cs extends w<cr> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        super(setscrollbardefaultdelaybeforefade, setAnimation.setLineSpacing(), new cr());
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        cs csVar = (cs) objArr[0];
        cs csVar2 = new cs();
        ((Integer) setLeftTopRightBottom.setCompoundDrawableTintBlendMode(new Object[]{csVar2.setCompoundDrawableTintBlendMode(), csVar.setCompoundDrawableTintBlendMode().setDividerPadding()}, -1162888331, 1162888331, (int) System.currentTimeMillis())).intValue();
        return csVar2;
    }

    @Override // com.mypinpad.tsdk.isolation.getBeepOnFailure
    @NotNull
    public final getBeepOnFailure setNavigationOnClickListener() {
        return (getBeepOnFailure) setY(new Object[]{this}, 688146921, -688146921, System.identityHashCode(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs(@NotNull getBeepOnFailure getbeeponfailure) {
        super(getbeeponfailure, setAnimation.setLineSpacing(), new cr());
        Intrinsics.checkNotNullParameter(getbeeponfailure, "");
    }

    public cs() {
        super(setAnimation.setLineSpacing(), new cr());
    }
}
