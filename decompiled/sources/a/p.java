package a;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mx.openpay.library.core.OpenPaySdk;
import mx.openpay.library.core.model.extra.SendVoucherRequestDTO;

/* JADX INFO: loaded from: classes.dex */
public final class p extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OpenPaySdk f125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SendVoucherRequestDTO f126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OpenPaySdk f128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f129e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(OpenPaySdk openPaySdk, Continuation continuation) {
        super(continuation);
        this.f128d = openPaySdk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f127c = obj;
        this.f129e |= Integer.MIN_VALUE;
        return this.f128d.sendVoucher(null, null, this);
    }
}
