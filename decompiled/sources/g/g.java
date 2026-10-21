package g;

import android.content.Context;
import com.mastercard.sonic.controller.SonicController;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import mx.openpay.library.core.model.OpenPayTerminalChargeCreation;
import mx.openpay.library.ui.taponphone.charge.TapOnPhoneCreateChargeViewModel;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OpenPayTerminalChargeCreation f68536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TapOnPhoneCreateChargeViewModel f68537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f68538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SonicController f68539e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(OpenPayTerminalChargeCreation openPayTerminalChargeCreation, TapOnPhoneCreateChargeViewModel tapOnPhoneCreateChargeViewModel, Context context, SonicController sonicController, Continuation continuation) {
        super(2, continuation);
        this.f68536b = openPayTerminalChargeCreation;
        this.f68537c = tapOnPhoneCreateChargeViewModel;
        this.f68538d = context;
        this.f68539e = sonicController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f68536b, this.f68537c, this.f68538d, this.f68539e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f68535a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            mx.openpay.library.ui.taponphone.charge.f fVar = new mx.openpay.library.ui.taponphone.charge.f(this.f68536b, this.f68537c, this.f68538d, this.f68539e, null);
            this.f68535a = 1;
            if (BuildersKt.withContext(io2, fVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
