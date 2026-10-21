package l0;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.PlainTooltipState;
import androidx.compose.material3.RichTooltipState;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Stable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalMaterial3Api
public final class s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutatorMutex f82921a = new MutatorMutex();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static TooltipState f82922b;

    /* JADX INFO: compiled from: Tooltip.kt */
    @DebugMetadata(c = "androidx.compose.material3.TooltipSync$dismissCurrentTooltip$2", f = "Tooltip.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new a(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    @Nullable
    public static Object a(@NotNull TooltipState tooltipState, @NotNull Continuation continuation) {
        if (!Intrinsics.areEqual(tooltipState, f82922b)) {
            return Unit.INSTANCE;
        }
        Object objMutate = f82921a.mutate(MutatePriority.UserInput, new a(1, null), continuation);
        return objMutate == ek.a.getCOROUTINE_SUSPENDED() ? objMutate : Unit.INSTANCE;
    }

    @Nullable
    public static Object b(@NotNull TooltipState tooltipState, @NotNull Continuation continuation, boolean z10) {
        Function0 w5Var;
        Function1 t5Var;
        if (tooltipState instanceof PlainTooltipState) {
            t5Var = new t5(tooltipState, null);
            w5Var = new u5(tooltipState);
        } else {
            if (!(tooltipState instanceof RichTooltipState)) {
                throw new NoWhenBranchMatchedException();
            }
            v5 v5Var = new v5(tooltipState, null, z10);
            w5Var = new w5(tooltipState);
            t5Var = v5Var;
        }
        Object objMutate = f82921a.mutate(MutatePriority.Default, new x5(tooltipState, t5Var, w5Var, null), continuation);
        return objMutate == ek.a.getCOROUTINE_SUSPENDED() ? objMutate : Unit.INSTANCE;
    }
}
