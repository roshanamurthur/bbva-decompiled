package h;

import androidx.activity.OnBackPressedCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import mx.openpay.library.databinding.ActivityTapOnPhoneCreateRefundChargeBinding;
import mx.openpay.library.ui.taponphone.refund.TapOnPhoneCreateRefundChargeActivity;
import mx.openpay.library.ui.taponphone.refund.TapOnPhoneCreateRefundChargeViewModel;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TapOnPhoneCreateRefundChargeActivity f68623a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TapOnPhoneCreateRefundChargeActivity tapOnPhoneCreateRefundChargeActivity) {
        super(1);
        this.f68623a = tapOnPhoneCreateRefundChargeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        OnBackPressedCallback addCallback = (OnBackPressedCallback) obj;
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        ActivityTapOnPhoneCreateRefundChargeBinding activityTapOnPhoneCreateRefundChargeBinding = this.f68623a.f84389b;
        TapOnPhoneCreateRefundChargeViewModel tapOnPhoneCreateRefundChargeViewModel = null;
        if (activityTapOnPhoneCreateRefundChargeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityTapOnPhoneCreateRefundChargeBinding = null;
        }
        if (activityTapOnPhoneCreateRefundChargeBinding.tapOnPhoneLoader.getVisibility() == 8) {
            TapOnPhoneCreateRefundChargeViewModel tapOnPhoneCreateRefundChargeViewModel2 = this.f68623a.f84388a;
            if (tapOnPhoneCreateRefundChargeViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                tapOnPhoneCreateRefundChargeViewModel = tapOnPhoneCreateRefundChargeViewModel2;
            }
            tapOnPhoneCreateRefundChargeViewModel.cancelProcess();
        }
        return Unit.INSTANCE;
    }
}
