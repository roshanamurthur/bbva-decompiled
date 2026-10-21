package m0;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProduceState.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$4$1", f = "ProduceState.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
public final class m0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f83279p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f83280q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<ProduceStateScope<Object>, Continuation<? super Unit>, Object> f83281r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Object> f83282s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m0(Function2<? super ProduceStateScope<Object>, ? super Continuation<? super Unit>, ? extends Object> function2, MutableState<Object> mutableState, Continuation<? super m0> continuation) {
        super(2, continuation);
        this.f83281r0 = function2;
        this.f83282s0 = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        m0 m0Var = new m0(this.f83281r0, this.f83282s0, continuation);
        m0Var.f83280q0 = obj;
        return m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((m0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f83279p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            y yVar = new y(this.f83282s0, ((CoroutineScope) this.f83280q0).getCoroutineContext());
            this.f83279p0 = 1;
            if (this.f83281r0.invoke(yVar, this) == coroutine_suspended) {
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
