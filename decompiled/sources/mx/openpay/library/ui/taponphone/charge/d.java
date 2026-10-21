package mx.openpay.library.ui.taponphone.charge;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TapOnPhoneCreateChargeActivity f84379a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TapOnPhoneCreateChargeActivity tapOnPhoneCreateChargeActivity) {
        super(1);
        this.f84379a = tapOnPhoneCreateChargeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        TapOnPhoneCreateChargeViewModel tapOnPhoneCreateChargeViewModel = this.f84379a.f84358a;
        if (tapOnPhoneCreateChargeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            tapOnPhoneCreateChargeViewModel = null;
        }
        tapOnPhoneCreateChargeViewModel.onPlansModalResponse(iIntValue);
        return Unit.INSTANCE;
    }
}
