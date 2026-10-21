package mx.openpay.library.ui.taponphone.charge;

import android.content.Context;
import com.mastercard.sonic.controller.SonicController;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mx.openpay.library.core.OpenPaySdk;
import mx.openpay.library.core.feature.TapOnPhoneController;
import mx.openpay.library.core.mapper.OpenPayErrorMapperKt;
import mx.openpay.library.core.model.OpenPayResult;
import mx.openpay.library.core.model.OpenPayTerminalChargeCreation;
import mx.openpay.library.domain.model.Error;
import mx.openpay.library.domain.model.taponphone.TapOnPhoneCallback;
import mx.openpay.library.domain.util.Result;
import org.json.JSONException;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TapOnPhoneCreateChargeViewModel f84382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OpenPayTerminalChargeCreation f84384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TapOnPhoneCreateChargeViewModel f84385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f84386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SonicController f84387f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(OpenPayTerminalChargeCreation openPayTerminalChargeCreation, TapOnPhoneCreateChargeViewModel tapOnPhoneCreateChargeViewModel, Context context, SonicController sonicController, Continuation continuation) {
        super(2, continuation);
        this.f84384c = openPayTerminalChargeCreation;
        this.f84385d = tapOnPhoneCreateChargeViewModel;
        this.f84386e = context;
        this.f84387f = sonicController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f84384c, this.f84385d, this.f84386e, this.f84387f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        TapOnPhoneCreateChargeViewModel tapOnPhoneCreateChargeViewModel;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f84383b;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            OpenPayTerminalChargeCreation openPayTerminalChargeCreation = this.f84384c;
            if (openPayTerminalChargeCreation != null) {
                TapOnPhoneCreateChargeViewModel tapOnPhoneCreateChargeViewModel2 = this.f84385d;
                Context context = this.f84386e;
                SonicController sonicController = this.f84387f;
                OpenPaySdk openPaySdk = OpenPaySdk.INSTANCE;
                if (!openPaySdk.getTapOnPhoneController().getIsToPInitialized() || openPaySdk.getTapOnPhoneController().getActiveMerchantInfo() == null) {
                    tapOnPhoneCreateChargeViewModel2.f84368d.postValue(new TapOnPhoneCreateChargeViewModel.IntegratorUpdateState.CompleteChargeStatus(new OpenPayResult.Failure(OpenPayErrorMapperKt.mapToLibraryModel(new Error.UninitializedTapOnPhoneSDK(null, 1, null)))));
                } else {
                    TapOnPhoneCreateChargeViewModel.access$prepareMasterCardBrand(tapOnPhoneCreateChargeViewModel2, context, sonicController);
                    tapOnPhoneCreateChargeViewModel2.getClass();
                    TapOnPhoneController tapOnPhoneController = openPaySdk.getTapOnPhoneController();
                    TapOnPhoneCallback tapOnPhoneCallbackAccess$tapOnPhoneChargeCallback = TapOnPhoneCreateChargeViewModel.access$tapOnPhoneChargeCallback(tapOnPhoneCreateChargeViewModel2);
                    this.f84382a = tapOnPhoneCreateChargeViewModel2;
                    this.f84383b = 1;
                    obj = tapOnPhoneController.internalExecuteCharge$library_release(context, openPayTerminalChargeCreation, tapOnPhoneCallbackAccess$tapOnPhoneChargeCallback, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tapOnPhoneCreateChargeViewModel = tapOnPhoneCreateChargeViewModel2;
                }
            }
            return Unit.INSTANCE;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        tapOnPhoneCreateChargeViewModel = this.f84382a;
        ResultKt.throwOnFailure(obj);
        TapOnPhoneCreateChargeViewModel.access$evalChargeResult(tapOnPhoneCreateChargeViewModel, (Result) obj);
        return Unit.INSTANCE;
    }
}
