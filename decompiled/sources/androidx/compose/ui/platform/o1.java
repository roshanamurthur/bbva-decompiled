package androidx.compose.ui.platform;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Wrapper.android.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", f = "Wrapper.android.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
public final class o1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f17429p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ r1 f17430q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(r1 r1Var, Continuation<? super o1> continuation) {
        super(2, continuation);
        this.f17430q0 = r1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o1(this.f17430q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f17429p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            AndroidComposeView androidComposeView = this.f17430q0.f17440p0;
            this.f17429p0 = 1;
            if (androidComposeView.boundsUpdatesEventLoop(this) == coroutine_suspended) {
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
