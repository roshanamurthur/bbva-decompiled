package g;

import androidx.activity.OnBackPressedCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import mx.openpay.library.databinding.ActivityTapOnPhoneCreateChargeBinding;
import mx.openpay.library.ui.taponphone.charge.TapOnPhoneCreateChargeActivity;
import mx.openpay.library.ui.taponphone.charge.TapOnPhoneCreateChargeViewModel;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TapOnPhoneCreateChargeActivity f68529a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TapOnPhoneCreateChargeActivity tapOnPhoneCreateChargeActivity) {
        super(1);
        this.f68529a = tapOnPhoneCreateChargeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        OnBackPressedCallback addCallback = (OnBackPressedCallback) obj;
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding = this.f68529a.f84359b;
        TapOnPhoneCreateChargeViewModel tapOnPhoneCreateChargeViewModel = null;
        if (activityTapOnPhoneCreateChargeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityTapOnPhoneCreateChargeBinding = null;
        }
        if (activityTapOnPhoneCreateChargeBinding.tapOnPhoneLoader.getVisibility() == 8) {
            TapOnPhoneCreateChargeViewModel tapOnPhoneCreateChargeViewModel2 = this.f68529a.f84358a;
            if (tapOnPhoneCreateChargeViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                tapOnPhoneCreateChargeViewModel = tapOnPhoneCreateChargeViewModel2;
            }
            tapOnPhoneCreateChargeViewModel.cancelProcess();
        }
        return Unit.INSTANCE;
    }
}
