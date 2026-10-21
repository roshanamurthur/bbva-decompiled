package com.bbva.sdkcatalog.openpay.plugin;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DefaultOpenPayManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.DefaultOpenPayManager", f = "DefaultOpenPayManager.kt", i = {}, l = {436}, m = "getPaymentPlans-0E7RQCE", n = {}, s = {})
public final class DefaultOpenPayManager$getPaymentPlans$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultOpenPayManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultOpenPayManager$getPaymentPlans$1(DefaultOpenPayManager defaultOpenPayManager, Continuation<? super DefaultOpenPayManager$getPaymentPlans$1> continuation) {
        super(continuation);
        this.this$0 = defaultOpenPayManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo4950getPaymentPlans0E7RQCE = this.this$0.mo4950getPaymentPlans0E7RQCE(null, 0.0d, this);
        return objMo4950getPaymentPlans0E7RQCE == ek.a.getCOROUTINE_SUSPENDED() ? objMo4950getPaymentPlans0E7RQCE : Result.m5534boximpl(objMo4950getPaymentPlans0E7RQCE);
    }
}
