package v9;

import com.bbva.glomohybrid.login.data.LoginFailureCounterDataStore;
import com.bbva.glomohybrid.login.presentation.viewmodel.handler.GlobalLoginFailureCounterHandler;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GlobalLoginFailureCounterHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.handler.GlobalLoginFailureCounterHandler$isAllowSendNotification$2", f = "GlobalLoginFailureCounterHandler.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
public final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f93994p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ GlobalLoginFailureCounterHandler f93995q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GlobalLoginFailureCounterHandler globalLoginFailureCounterHandler, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f93995q0 = globalLoginFailureCounterHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new c(this.f93995q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f93994p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            GlobalLoginFailureCounterHandler globalLoginFailureCounterHandler = this.f93995q0;
            if (GlobalLoginFailureCounterHandler.access$getMemoryFailureCounter(globalLoginFailureCounterHandler).getF33327a() == 2 || ((LoginFailureCounterDataStore) globalLoginFailureCounterHandler.f33758s0.getValue()).attempts() == 5) {
                this.f93994p0 = 1;
                obj = globalLoginFailureCounterHandler.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(z);
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean z10 = ((Boolean) obj).booleanValue();
        return Boxing.boxBoolean(z10);
    }
}
