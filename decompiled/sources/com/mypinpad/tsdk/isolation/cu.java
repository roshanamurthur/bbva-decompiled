package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class cu extends w<cq> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        super(setscrollbardefaultdelaybeforefade, setAnimation.CurrencyKt(), new cq());
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu(@NotNull getBeepOnFailure getbeeponfailure) {
        super(getbeeponfailure, setAnimation.CurrencyKt(), new cq());
        Intrinsics.checkNotNullParameter(getbeeponfailure, "");
    }

    public cu() {
        super(setAnimation.CurrencyKt(), new cq());
    }
}
