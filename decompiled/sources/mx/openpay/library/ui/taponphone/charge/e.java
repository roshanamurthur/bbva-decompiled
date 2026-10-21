package mx.openpay.library.ui.taponphone.charge;

import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TapOnPhoneCreateChargeActivity f84380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TapOnPhoneCreateChargeViewModel.ChargeUiState f84381b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TapOnPhoneCreateChargeActivity tapOnPhoneCreateChargeActivity, TapOnPhoneCreateChargeViewModel.ChargeUiState chargeUiState) {
        super(1);
        this.f84380a = tapOnPhoneCreateChargeActivity;
        this.f84381b = chargeUiState;
    }

    public final void a(Error error) {
        if (error == null) {
            Objects.toString(error);
        }
        TapOnPhoneCreateChargeViewModel tapOnPhoneCreateChargeViewModel = this.f84380a.f84358a;
        if (tapOnPhoneCreateChargeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            tapOnPhoneCreateChargeViewModel = null;
        }
        tapOnPhoneCreateChargeViewModel.postProcessedStep(((TapOnPhoneCreateChargeViewModel.ChargeUiState.PlayVisaBrandingSoundAndAnimation) this.f84381b).getCharge());
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Error) obj);
        return Unit.INSTANCE;
    }
}
