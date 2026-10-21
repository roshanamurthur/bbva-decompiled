package h;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;
import mx.openpay.library.core.OpenPaySdk;
import mx.openpay.library.core.model.OpenPayResult;
import mx.openpay.library.core.model.extra.TransactionDTO;
import mx.openpay.library.core.model.taponphone.OpenPayTapOnPhoneRefundChargeState;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OpenPayResult f68626b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(OpenPayResult openPayResult, Continuation continuation) {
        super(2, continuation);
        this.f68626b = openPayResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f68626b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c(this.f68626b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f68625a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<OpenPayResult<OpenPayTapOnPhoneRefundChargeState<TransactionDTO>>> mutableTapOnPhoneRefundChargeResultState$library_release = OpenPaySdk.INSTANCE.getTapOnPhoneController().getMutableTapOnPhoneRefundChargeResultState$library_release();
            OpenPayResult<OpenPayTapOnPhoneRefundChargeState<TransactionDTO>> openPayResult = this.f68626b;
            this.f68625a = 1;
            if (mutableTapOnPhoneRefundChargeResultState$library_release.emit(openPayResult, this) == coroutine_suspended) {
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
}
