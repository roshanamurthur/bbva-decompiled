package mx.openpay.library.ui.taponphone.refund;

import android.content.Context;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import mx.openpay.library.core.OpenPaySdk;
import mx.openpay.library.core.mapper.OpenPayErrorMapperKt;
import mx.openpay.library.core.model.OpenPayResult;
import mx.openpay.library.core.model.OpenPayTransaction;
import mx.openpay.library.data.util.EglobalUtils;
import mx.openpay.library.domain.model.Error;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f84396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OpenPayTransaction f84397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TapOnPhoneCreateRefundChargeViewModel f84398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f84399d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TapOnPhoneCreateRefundChargeViewModel tapOnPhoneCreateRefundChargeViewModel, Context context, OpenPayTransaction openPayTransaction, Continuation continuation) {
        super(2, continuation);
        this.f84397b = openPayTransaction;
        this.f84398c = tapOnPhoneCreateRefundChargeViewModel;
        this.f84399d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f84398c, this.f84399d, this.f84397b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f84396a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            OpenPayTransaction openPayTransaction = this.f84397b;
            if (openPayTransaction != null) {
                TapOnPhoneCreateRefundChargeViewModel tapOnPhoneCreateRefundChargeViewModel = this.f84398c;
                Context context = this.f84399d;
                String gatewayCardPresent = openPayTransaction.getGatewayCardPresent();
                Locale locale = Locale.ROOT;
                String upperCase = gatewayCardPresent.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                String upperCase2 = EglobalUtils.GATEWAY_CARD_PRESENT_BANCOMER.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                if (Intrinsics.areEqual(upperCase, upperCase2)) {
                    OpenPaySdk openPaySdk = OpenPaySdk.INSTANCE;
                    if (!openPaySdk.getTapOnPhoneController().getIsToPInitialized() || openPaySdk.getTapOnPhoneController().getActiveMerchantInfo() == null) {
                        tapOnPhoneCreateRefundChargeViewModel.f84392b.postValue(new TapOnPhoneCreateRefundChargeViewModel.RefundChargeUiState.CompleteRefundChargeStatus(new OpenPayResult.Failure(OpenPayErrorMapperKt.mapToLibraryModel(new Error.UninitializedTapOnPhoneSDK(null, 1, null)))));
                    } else {
                        this.f84396a = 2;
                        if (TapOnPhoneCreateRefundChargeViewModel.access$refundCharge(tapOnPhoneCreateRefundChargeViewModel, context, openPayTransaction, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    this.f84396a = 1;
                    if (TapOnPhoneCreateRefundChargeViewModel.access$refundCharge(tapOnPhoneCreateRefundChargeViewModel, context, openPayTransaction, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
