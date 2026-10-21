package l0;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.InternalMutatorMutex;
import androidx.compose.material3.SwipeableV2State;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SwipeableV2.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material3.SwipeableV2State$swipe$2", f = "SwipeableV2.kt", i = {}, l = {462}, m = "invokeSuspend", n = {}, s = {})
public final class i4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f82616p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SwipeableV2State<Object> f82617q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ MutatePriority f82618r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function1<Continuation<? super Unit>, Object> f82619s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i4(SwipeableV2State<Object> swipeableV2State, MutatePriority mutatePriority, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super i4> continuation) {
        super(2, continuation);
        this.f82617q0 = swipeableV2State;
        this.f82618r0 = mutatePriority;
        this.f82619s0 = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new i4(this.f82617q0, this.f82618r0, this.f82619s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((i4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f82616p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            InternalMutatorMutex internalMutatorMutex = this.f82617q0.f11838e;
            this.f82616p0 = 1;
            if (internalMutatorMutex.mutate(this.f82618r0, this.f82619s0, this) == coroutine_suspended) {
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
