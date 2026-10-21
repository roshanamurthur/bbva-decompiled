package c;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mx.openpay.library.core.feature.TapOnPhoneController;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TapOnPhoneController f25306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TapOnPhoneController f25308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25309d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TapOnPhoneController tapOnPhoneController, Continuation continuation) {
        super(continuation);
        this.f25308c = tapOnPhoneController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25307b = obj;
        this.f25309d |= Integer.MIN_VALUE;
        return this.f25308c.initTapOnPhone(this);
    }
}
