package j0;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material.pullrefresh.PullRefreshState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PullRefreshState.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1", f = "PullRefreshState.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
public final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f78751p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ PullRefreshState f78752q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ float f78753r0;

    /* JADX INFO: compiled from: PullRefreshState.kt */
    @DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1", f = "PullRefreshState.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f78754p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PullRefreshState f78755q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f78756r0;

        /* JADX INFO: renamed from: j0.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PullRefreshState.kt */
        public static final class C0430a extends Lambda implements Function2<Float, Float, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ PullRefreshState f78757p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0430a(PullRefreshState pullRefreshState) {
                super(2);
                this.f78757p0 = pullRefreshState;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Float f6, Float f10) {
                float fFloatValue = f6.floatValue();
                f10.floatValue();
                this.f78757p0.f8899e.setFloatValue(fFloatValue);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PullRefreshState pullRefreshState, float f6, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f78755q0 = pullRefreshState;
            this.f78756r0 = f6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new a(this.f78755q0, this.f78756r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f78754p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                PullRefreshState pullRefreshState = this.f78755q0;
                float floatValue = pullRefreshState.f8899e.getFloatValue();
                float f6 = this.f78756r0;
                C0430a c0430a = new C0430a(pullRefreshState);
                this.f78754p0 = 1;
                if (SuspendAnimationKt.animate$default(floatValue, f6, 0.0f, null, c0430a, this, 12, null) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PullRefreshState pullRefreshState, float f6, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f78752q0 = pullRefreshState;
        this.f78753r0 = f6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new g(this.f78752q0, this.f78753r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f78751p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            PullRefreshState pullRefreshState = this.f78752q0;
            MutatorMutex mutatorMutex = pullRefreshState.f8903i;
            a aVar = new a(pullRefreshState, this.f78753r0, null);
            this.f78751p0 = 1;
            if (MutatorMutex.mutate$default(mutatorMutex, null, aVar, this, 1, null) == coroutine_suspended) {
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
