package g;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;
import mx.openpay.library.core.OpenPaySdk;
import mx.openpay.library.core.model.OpenPayChargeState;
import mx.openpay.library.core.model.OpenPayResult;
import mx.openpay.library.core.model.extra.ChargeTransaction;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OpenPayResult f68532b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(OpenPayResult openPayResult, Continuation continuation) {
        super(2, continuation);
        this.f68532b = openPayResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f68532b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new d(this.f68532b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f68531a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<OpenPayResult<OpenPayChargeState<ChargeTransaction>>> mutableTapOnPhoneChargeResultState$library_release = OpenPaySdk.INSTANCE.getTapOnPhoneController().getMutableTapOnPhoneChargeResultState$library_release();
            OpenPayResult<OpenPayChargeState<ChargeTransaction>> openPayResult = this.f68532b;
            this.f68531a = 1;
            if (mutableTapOnPhoneChargeResultState$library_release.emit(openPayResult, this) == coroutine_suspended) {
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
