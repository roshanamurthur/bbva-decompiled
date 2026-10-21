package a;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mx.openpay.library.core.OpenPaySdk;
import mx.openpay.library.core.model.extra.OrderTerminal;

/* JADX INFO: loaded from: classes.dex */
public final class h extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OpenPaySdk f93a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppCompatActivity f94b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OrderTerminal f95c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f96d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ OpenPaySdk f97e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f98f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(OpenPaySdk openPaySdk, Continuation continuation) {
        super(continuation);
        this.f97e = openPaySdk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f96d = obj;
        this.f98f |= Integer.MIN_VALUE;
        return this.f97e.executeCharge(null, null, null, this);
    }
}
