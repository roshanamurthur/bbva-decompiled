package l0;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.ScrollState;
import androidx.compose.material3.TabRowKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material3.ScrollableTabData$onLaidOut$1$1", f = "TabRow.kt", i = {}, l = {458}, m = "invokeSuspend", n = {}, s = {})
public final class d3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f82490p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ e3 f82491q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f82492r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(e3 e3Var, int i10, Continuation<? super d3> continuation) {
        super(2, continuation);
        this.f82491q0 = e3Var;
        this.f82492r0 = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new d3(this.f82491q0, this.f82492r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((d3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f82490p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            ScrollState scrollState = this.f82491q0.f82514a;
            AnimationSpec<Float> animationSpec = TabRowKt.f11995c;
            this.f82490p0 = 1;
            if (scrollState.animateScrollTo(this.f82492r0, animationSpec, this) == coroutine_suspended) {
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
