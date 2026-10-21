package com.mypinpad.tsdk.isolation;

import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class bf extends w<be> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        super(setscrollbardefaultdelaybeforefade, setAnimation.component25(), new be());
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        cs csVar = new cs();
        setImageTintList compoundDrawableTintBlendMode = csVar.setCompoundDrawableTintBlendMode();
        setImageTintList.setX(new Object[]{compoundDrawableTintBlendMode, ArraysKt___ArraysKt.sliceArray(csVar.setOnFocusChangeListener(), new IntRange(0, 3))}, -1398236510, 1398236511, System.identityHashCode(compoundDrawableTintBlendMode));
        return csVar;
    }

    @Override // com.mypinpad.tsdk.isolation.getBeepOnFailure
    @NotNull
    public final getBeepOnFailure setNavigationOnClickListener() {
        return (getBeepOnFailure) setDividerPadding(new Object[]{this}, 168166846, -168166846, System.identityHashCode(this));
    }
}
