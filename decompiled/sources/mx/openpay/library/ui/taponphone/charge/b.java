package mx.openpay.library.ui.taponphone.charge;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TapOnPhoneCreateChargeActivity f84377a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TapOnPhoneCreateChargeActivity tapOnPhoneCreateChargeActivity) {
        super(1);
        this.f84377a = tapOnPhoneCreateChargeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TapOnPhoneCreateChargeViewModel.IntegratorUpdateState it = (TapOnPhoneCreateChargeViewModel.IntegratorUpdateState) obj;
        TapOnPhoneCreateChargeActivity tapOnPhoneCreateChargeActivity = this.f84377a;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        TapOnPhoneCreateChargeActivity.access$updateIntegratorState(tapOnPhoneCreateChargeActivity, it);
        return Unit.INSTANCE;
    }
}
