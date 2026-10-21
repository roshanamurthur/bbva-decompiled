package mx.openpay.library.ui.taponphone.charge;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TapOnPhoneCreateChargeActivity f84378a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TapOnPhoneCreateChargeActivity tapOnPhoneCreateChargeActivity) {
        super(1);
        this.f84378a = tapOnPhoneCreateChargeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        TapOnPhoneCreateChargeViewModel tapOnPhoneCreateChargeViewModel = this.f84378a.f84358a;
        if (tapOnPhoneCreateChargeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            tapOnPhoneCreateChargeViewModel = null;
        }
        tapOnPhoneCreateChargeViewModel.onPointsModalResponse(zBooleanValue);
        return Unit.INSTANCE;
    }
}
