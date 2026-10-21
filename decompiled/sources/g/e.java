package g;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import mx.openpay.library.core.OpenPaySdk;
import mx.openpay.library.core.feature.TapOnPhoneController;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68533a;

    public e(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new e((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f68533a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            TapOnPhoneController tapOnPhoneController = OpenPaySdk.INSTANCE.getTapOnPhoneController();
            this.f68533a = 1;
            if (tapOnPhoneController.cancelProcess$library_release(this) == coroutine_suspended) {
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
