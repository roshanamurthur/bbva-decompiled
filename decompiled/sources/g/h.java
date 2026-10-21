package g;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.OpenPaySdk;
import mx.openpay.library.core.feature.TapOnPhoneController;
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.model.taponphone.TapOnPhoneCallback;
import mx.openpay.library.domain.util.Result;
import mx.openpay.library.ui.taponphone.charge.TapOnPhoneCreateChargeViewModel;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TapOnPhoneCreateChargeViewModel f68541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f68542c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TapOnPhoneCreateChargeViewModel tapOnPhoneCreateChargeViewModel, int i10, Continuation continuation) {
        super(2, continuation);
        this.f68541b = tapOnPhoneCreateChargeViewModel;
        this.f68542c = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f68541b, this.f68542c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new h(this.f68541b, this.f68542c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f68540a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            TapOnPhoneController tapOnPhoneController = OpenPaySdk.INSTANCE.getTapOnPhoneController();
            CreateCharge createCharge = this.f68541b.f84366b;
            if (createCharge == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createCharge");
                createCharge = null;
            }
            TapOnPhoneCallback tapOnPhoneCallbackAccess$tapOnPhoneChargeCallback = TapOnPhoneCreateChargeViewModel.access$tapOnPhoneChargeCallback(this.f68541b);
            int i11 = this.f68542c;
            this.f68540a = 1;
            obj = tapOnPhoneController.onPlansModalResponse$library_release(createCharge, tapOnPhoneCallbackAccess$tapOnPhoneChargeCallback, i11, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        TapOnPhoneCreateChargeViewModel.access$evalChargeResult(this.f68541b, (Result) obj);
        return Unit.INSTANCE;
    }
}
