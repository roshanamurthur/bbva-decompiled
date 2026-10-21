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
@DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.DefaultOpenPayManager", f = "DefaultOpenPayManager.kt", i = {0, 0}, l = {436, 187}, m = "createPaymentLink-0E7RQCE", n = {"secureTerminal", "paymentLinkModel"}, s = {"L$0", "L$1"})
public final class DefaultOpenPayManager$createPaymentLink$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultOpenPayManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultOpenPayManager$createPaymentLink$1(DefaultOpenPayManager defaultOpenPayManager, Continuation<? super DefaultOpenPayManager$createPaymentLink$1> continuation) {
        super(continuation);
        this.this$0 = defaultOpenPayManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo4947createPaymentLink0E7RQCE = this.this$0.mo4947createPaymentLink0E7RQCE(null, null, this);
        return objMo4947createPaymentLink0E7RQCE == ek.a.getCOROUTINE_SUSPENDED() ? objMo4947createPaymentLink0E7RQCE : Result.m5534boximpl(objMo4947createPaymentLink0E7RQCE);
    }
}
