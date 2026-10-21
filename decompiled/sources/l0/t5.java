package l0;

import androidx.compose.material3.PlainTooltipState;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.TooltipState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material3.TooltipSync$show$2", f = "Tooltip.kt", i = {}, l = {623}, m = "invokeSuspend", n = {}, s = {})
public final class t5 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f82967p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TooltipState f82968q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(TooltipState tooltipState, Continuation<? super t5> continuation) {
        super(1, continuation);
        this.f82968q0 = tooltipState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new t5(this.f82968q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((t5) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f82967p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            ((PlainTooltipState) this.f82968q0).setVisible$material3_release(true);
            this.f82967p0 = 1;
            if (DelayKt.delay(TooltipKt.TooltipDuration, this) == coroutine_suspended) {
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
