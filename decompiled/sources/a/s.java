package a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mx.openpay.library.core.OpenPaySdk;
import mx.openpay.library.core.model.extra.UpdatePaymentLink;

/* JADX INFO: loaded from: classes.dex */
public final class s extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OpenPaySdk f132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UpdatePaymentLink f133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OpenPaySdk f135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f136e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(OpenPaySdk openPaySdk, Continuation continuation) {
        super(continuation);
        this.f135d = openPaySdk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f134c = obj;
        this.f136e |= Integer.MIN_VALUE;
        return this.f135d.updatePaymentLink(null, null, this);
    }
}
