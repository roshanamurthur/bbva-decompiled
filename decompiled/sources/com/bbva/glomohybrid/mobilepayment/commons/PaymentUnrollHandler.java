package com.bbva.glomohybrid.mobilepayment.commons;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentUnrollHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/mobilepayment/commons/PaymentUnrollHandler;", "", "unroll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commons_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PaymentUnrollHandler {
    @Nullable
    Object unroll(@NotNull Continuation<? super Unit> continuation);
}
