package h;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mx.openpay.library.ui.taponphone.refund.TapOnPhoneCreateRefundChargeViewModel;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TapOnPhoneCreateRefundChargeViewModel f68633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f68634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TapOnPhoneCreateRefundChargeViewModel f68635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f68636d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TapOnPhoneCreateRefundChargeViewModel tapOnPhoneCreateRefundChargeViewModel, Continuation continuation) {
        super(continuation);
        this.f68635c = tapOnPhoneCreateRefundChargeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f68634b = obj;
        this.f68636d |= Integer.MIN_VALUE;
        return TapOnPhoneCreateRefundChargeViewModel.access$refundCharge(this.f68635c, null, null, this);
    }
}
