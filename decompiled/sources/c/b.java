package c;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mx.openpay.library.core.feature.PaymentLinkControllerImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentLinkControllerImpl f25283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25284c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PaymentLinkControllerImpl paymentLinkControllerImpl, Continuation continuation) {
        super(continuation);
        this.f25283b = paymentLinkControllerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25282a = obj;
        this.f25284c |= Integer.MIN_VALUE;
        return this.f25283b.checkPaymentLink(null, this);
    }
}
