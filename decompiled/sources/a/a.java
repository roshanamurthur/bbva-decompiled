package a;

import android.os.Parcelable;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mx.openpay.library.core.OpenPaySdk;
import mx.openpay.library.core.model.extra.TransactionDTO;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OpenPaySdk f64a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Parcelable f65b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TransactionDTO f66c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f67d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ OpenPaySdk f68e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f69f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(OpenPaySdk openPaySdk, Continuation continuation) {
        super(continuation);
        this.f68e = openPaySdk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f67d = obj;
        this.f69f |= Integer.MIN_VALUE;
        return this.f68e.applyTransactionRefund(null, null, null, this);
    }
}
