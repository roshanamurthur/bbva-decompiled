package c;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mx.openpay.library.core.feature.TapOnPhoneController;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TapOnPhoneController f25311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25312c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TapOnPhoneController tapOnPhoneController, Continuation continuation) {
        super(continuation);
        this.f25311b = tapOnPhoneController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25310a = obj;
        this.f25312c |= Integer.MIN_VALUE;
        return this.f25311b.initTsdkManualInitializer(this);
    }
}
