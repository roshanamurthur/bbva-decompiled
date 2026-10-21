package c;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mx.openpay.library.core.feature.TapOnPhoneController;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TapOnPhoneController f25304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TapOnPhoneController tapOnPhoneController, Continuation continuation) {
        super(continuation);
        this.f25304b = tapOnPhoneController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25303a = obj;
        this.f25305c |= Integer.MIN_VALUE;
        return this.f25304b.createdTsdkManualInitializer(null, this);
    }
}
