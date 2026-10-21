package o6;

import com.bbva.discreetmode.combined.CombinedController;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CombinedController.kt */
/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.bbva.discreetmode.combined.CombinedController$observe$1", f = "CombinedController.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f85277p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CombinedController f85278q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CombinedController combinedController, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f85278q0 = combinedController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f85278q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f85277p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CombinedController combinedController = this.f85278q0;
            Channel<Boolean> channelIsSensorActive = combinedController.f29078u0.isSensorActive();
            this.f85277p0 = 1;
            if (CombinedController.access$processProximitySensorResponses(combinedController, channelIsSensorActive, this) == coroutine_suspended) {
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
