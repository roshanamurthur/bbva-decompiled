package a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mx.openpay.library.core.OpenPaySdk;

/* JADX INFO: loaded from: classes.dex */
public final class i extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OpenPaySdk f99a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OpenPaySdk f102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f103e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(OpenPaySdk openPaySdk, Continuation continuation) {
        super(continuation);
        this.f102d = openPaySdk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f101c = obj;
        this.f103e |= Integer.MIN_VALUE;
        return this.f102d.expirePaymentLink(null, null, this);
    }
}
