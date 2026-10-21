package mx.openpay.library.ui.taponphone.charge;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TapOnPhoneCreateChargeActivity f84376a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TapOnPhoneCreateChargeActivity tapOnPhoneCreateChargeActivity) {
        super(1);
        this.f84376a = tapOnPhoneCreateChargeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws JSONException {
        TapOnPhoneCreateChargeViewModel.ChargeUiState it = (TapOnPhoneCreateChargeViewModel.ChargeUiState) obj;
        TapOnPhoneCreateChargeActivity tapOnPhoneCreateChargeActivity = this.f84376a;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        TapOnPhoneCreateChargeActivity.access$updateUI(tapOnPhoneCreateChargeActivity, it);
        return Unit.INSTANCE;
    }
}
