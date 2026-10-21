package c;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mx.openpay.library.core.feature.PaymentLinkControllerImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentLinkControllerImpl f25295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25296c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PaymentLinkControllerImpl paymentLinkControllerImpl, Continuation continuation) {
        super(continuation);
        this.f25295b = paymentLinkControllerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25294a = obj;
        this.f25296c |= Integer.MIN_VALUE;
        return this.f25295b.getPaymentPlans(0.0d, this);
    }
}
