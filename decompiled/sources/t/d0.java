package t;

import androidx.compose.foundation.MarqueeModifierNode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BasicMarquee.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1", f = "BasicMarquee.kt", i = {}, l = {331}, m = "invokeSuspend", n = {}, s = {})
public final class d0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f93368p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MarqueeModifierNode f93369q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(MarqueeModifierNode marqueeModifierNode, Continuation<? super d0> continuation) {
        super(2, continuation);
        this.f93369q0 = marqueeModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new d0(this.f93369q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((d0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objWithContext;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f93368p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f93368p0 = 1;
            MarqueeModifierNode marqueeModifierNode = this.f93369q0;
            if (marqueeModifierNode.H0 <= 0 || (objWithContext = BuildersKt.withContext(r.f93429p0, new androidx.compose.foundation.p(marqueeModifierNode, null), this)) != ek.a.getCOROUTINE_SUSPENDED()) {
                objWithContext = Unit.INSTANCE;
            }
            if (objWithContext == coroutine_suspended) {
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
