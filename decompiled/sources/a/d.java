package a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mx.openpay.library.core.OpenPaySdk;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OpenPaySdk f73a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f74b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f75c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OpenPaySdk f76d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f77e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(OpenPaySdk openPaySdk, Continuation continuation) {
        super(continuation);
        this.f76d = openPaySdk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f75c = obj;
        this.f77e |= Integer.MIN_VALUE;
        return this.f76d.cancelPaymentLink(null, null, this);
    }
}
