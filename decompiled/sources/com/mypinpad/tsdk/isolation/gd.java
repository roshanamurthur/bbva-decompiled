package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class gd extends fx {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final getValue f55655f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(@NotNull fi fiVar, @NotNull setTextKeepState settextkeepstate, @NotNull gr grVar, @NotNull getValue getvalue) {
        super(fiVar, settextkeepstate, grVar);
        Intrinsics.checkNotNullParameter(fiVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(grVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        this.f55655f = getvalue;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        gd gdVar = (gd) objArr[0];
        getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -308641137, 308641263, (int) System.currentTimeMillis());
        String str = (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed));
        fi onFocusChangeListener = gdVar.setOnFocusChangeListener();
        gdVar.f55655f.setOnFocusChangeListener(new setTitleTextAppearance((getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str, (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener}, 553421671, -553421615, System.identityHashCode(onFocusChangeListener)), null, Boolean.FALSE, 28}, -976227287, 976227290, 28)));
        return fk.getSuppressed;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setX(new Object[]{this, continuation}, 1434412069, -1434412069, System.identityHashCode(this));
    }
}
