package c;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mx.openpay.library.core.feature.TransactionControllerImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransactionControllerImpl f25317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25318c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(TransactionControllerImpl transactionControllerImpl, Continuation continuation) {
        super(continuation);
        this.f25317b = transactionControllerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25316a = obj;
        this.f25318c |= Integer.MIN_VALUE;
        return this.f25317b.sendVoucher(null, this);
    }
}
