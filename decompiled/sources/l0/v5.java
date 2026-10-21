package l0;

import androidx.compose.material3.RichTooltipState;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.TooltipState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material3.TooltipSync$show$4", f = "Tooltip.kt", i = {}, l = {771, 642}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipSync$show$4\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,770:1\n314#2,11:771\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipSync$show$4\n*L\n637#1:771,11\n*E\n"})
public final class v5 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public TooltipState f83005p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f83006q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f83007r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ TooltipState f83008s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(TooltipState tooltipState, Continuation continuation, boolean z10) {
        super(1, continuation);
        this.f83007r0 = z10;
        this.f83008s0 = tooltipState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new v5(this.f83008s0, continuation, this.f83007r0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((v5) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f83006q0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            boolean z10 = this.f83007r0;
            TooltipState tooltipState = this.f83008s0;
            if (z10) {
                this.f83005p0 = tooltipState;
                this.f83006q0 = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                ((RichTooltipState) tooltipState).setVisible$material3_release(true);
                Object result = cancellableContinuationImpl.getResult();
                if (result == ek.a.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                ((RichTooltipState) tooltipState).setVisible$material3_release(true);
                this.f83006q0 = 2;
                if (DelayKt.delay(TooltipKt.TooltipDuration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
