package com.bbva.sdkcatalog.openpay.plugin;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mx.openpay.library.core.OpenPaySdk;

/* JADX INFO: compiled from: DefaultOpenPayManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.DefaultOpenPayManager$handleCommand$1$1", f = "DefaultOpenPayManager.kt", i = {}, l = {400}, m = "invokeSuspend", n = {}, s = {})
public final class DefaultOpenPayManager$handleCommand$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultOpenPayManager$handleCommand$1$1(String str, Continuation<? super DefaultOpenPayManager$handleCommand$1$1> continuation) {
        super(2, continuation);
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultOpenPayManager$handleCommand$1$1(this.$it, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            OpenPaySdk openPaySdk = OpenPaySdk.INSTANCE;
            String str = this.$it;
            this.label = 1;
            if (openPaySdk.setAuthToken(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefaultOpenPayManager$handleCommand$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
