package h;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import mx.openpay.library.core.model.OpenPayTransaction;
import mx.openpay.library.ui.taponphone.refund.TapOnPhoneCreateRefundChargeViewModel;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OpenPayTransaction f68630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TapOnPhoneCreateRefundChargeViewModel f68631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f68632d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TapOnPhoneCreateRefundChargeViewModel tapOnPhoneCreateRefundChargeViewModel, Context context, OpenPayTransaction openPayTransaction, Continuation continuation) {
        super(2, continuation);
        this.f68630b = openPayTransaction;
        this.f68631c = tapOnPhoneCreateRefundChargeViewModel;
        this.f68632d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f68631c, this.f68632d, this.f68630b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f68629a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            mx.openpay.library.ui.taponphone.refund.b bVar = new mx.openpay.library.ui.taponphone.refund.b(this.f68631c, this.f68632d, this.f68630b, null);
            this.f68629a = 1;
            if (BuildersKt.withContext(io2, bVar, this) == coroutine_suspended) {
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
