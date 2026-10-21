package p6;

import com.bbva.discreetmode.proximity.DiscreetModeProximityController;
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

/* JADX INFO: compiled from: DiscreetModeProximityController.kt */
/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.bbva.discreetmode.proximity.DiscreetModeProximityController$observeSensorActivity$1", f = "DiscreetModeProximityController.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f92579p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DiscreetModeProximityController f92580q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DiscreetModeProximityController discreetModeProximityController, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f92580q0 = discreetModeProximityController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f92580q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f92579p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            DiscreetModeProximityController discreetModeProximityController = this.f92580q0;
            Channel<Boolean> channelIsSensorActive = discreetModeProximityController.f29090t0.isSensorActive();
            this.f92579p0 = 1;
            if (DiscreetModeProximityController.access$processSensorActivity(discreetModeProximityController, channelIsSensorActive, this) == coroutine_suspended) {
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
