package a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mx.openpay.library.core.OpenPaySdk;
import mx.openpay.library.core.model.PaymentLink;

/* JADX INFO: loaded from: classes.dex */
public final class g extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OpenPaySdk f88a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PaymentLink f89b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f90c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OpenPaySdk f91d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f92e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(OpenPaySdk openPaySdk, Continuation continuation) {
        super(continuation);
        this.f91d = openPaySdk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f90c = obj;
        this.f92e |= Integer.MIN_VALUE;
        return this.f91d.createPaymentLink(null, null, this);
    }
}
