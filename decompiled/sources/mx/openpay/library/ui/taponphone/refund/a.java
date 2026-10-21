package mx.openpay.library.ui.taponphone.refund;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TapOnPhoneCreateRefundChargeActivity f84395a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TapOnPhoneCreateRefundChargeActivity tapOnPhoneCreateRefundChargeActivity) {
        super(1);
        this.f84395a = tapOnPhoneCreateRefundChargeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TapOnPhoneCreateRefundChargeViewModel.RefundChargeUiState it = (TapOnPhoneCreateRefundChargeViewModel.RefundChargeUiState) obj;
        TapOnPhoneCreateRefundChargeActivity tapOnPhoneCreateRefundChargeActivity = this.f84395a;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        TapOnPhoneCreateRefundChargeActivity.access$updateUI(tapOnPhoneCreateRefundChargeActivity, it);
        return Unit.INSTANCE;
    }
}
