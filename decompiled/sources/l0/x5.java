package l0;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.TooltipState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material3.TooltipSync$show$6", f = "Tooltip.kt", i = {}, l = {655}, m = "invokeSuspend", n = {}, s = {})
public final class x5 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f83043p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TooltipState f83044q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function1<Continuation<? super Unit>, Object> f83045r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f83046s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x5(TooltipState tooltipState, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Function0<Unit> function0, Continuation<? super x5> continuation) {
        super(1, continuation);
        this.f83044q0 = tooltipState;
        this.f83045r0 = function1;
        this.f83046s0 = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new x5(this.f83044q0, this.f83045r0, this.f83046s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((x5) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f83043p0;
        Function0<Unit> function0 = this.f83046s0;
        try {
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                MutatorMutex mutatorMutex = s5.f82921a;
                s5.f82922b = this.f83044q0;
                Function1<Continuation<? super Unit>, Object> function1 = this.f83045r0;
                this.f83043p0 = 1;
                if (function1.invoke(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MutatorMutex mutatorMutex2 = s5.f82921a;
            s5.f82922b = null;
            function0.invoke();
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            MutatorMutex mutatorMutex3 = s5.f82921a;
            s5.f82922b = null;
            function0.invoke();
            throw th2;
        }
    }
}
