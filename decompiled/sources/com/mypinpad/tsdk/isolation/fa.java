package com.mypinpad.tsdk.isolation;

import ek.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class fa extends fe {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final GlobalEndpoint<setScrollBarDefaultDelayBeforeFade> f55510c;

    public fa(@NotNull GlobalEndpoint<setScrollBarDefaultDelayBeforeFade> globalEndpoint) {
        Intrinsics.checkNotNullParameter(globalEndpoint, "");
        this.f55510c = globalEndpoint;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 949) + (i10 * (-947));
        int i14 = ~i10;
        int i15 = ~i11;
        if (((i10 | i15) * 948) + ((~((~i12) | i14 | i15)) * (-948)) + (((~(i15 | i12)) | i14) * (-948)) + i13 == 1) {
            fa faVar = (fa) objArr[0];
            Object y7 = faVar.f55510c.setY(fk.setZ, (Continuation<? super Unit>) objArr[4]);
            return y7 == a.getCOROUTINE_SUSPENDED() ? y7 : Unit.INSTANCE;
        }
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        final TransactionProcessingResult transactionProcessingResult = (TransactionProcessingResult) objArr[2];
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(transactionProcessingResult, "");
        cz czVar = new cz(setscrollbardefaultdelaybeforefade);
        return null;
    }

    @Override // com.mypinpad.tsdk.isolation.fe
    public final void setCompoundDrawableTintBlendMode(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull TransactionProcessingResult transactionProcessingResult) {
        setOnFocusChangeListener(new Object[]{this, setscrollbardefaultdelaybeforefade, transactionProcessingResult}, -2003361472, 2003361472, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.fe
    @Nullable
    public final Object setY(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull setTextKeepState settextkeepstate, @NotNull eu euVar, @NotNull Continuation<? super Unit> continuation) {
        return setOnFocusChangeListener(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate, euVar, continuation}, 94844771, -94844770, System.identityHashCode(this));
    }
}
