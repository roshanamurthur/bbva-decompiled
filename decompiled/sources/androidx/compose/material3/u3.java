package androidx.compose.material3;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material3.SwipeableKt$swipeable$3$4$1", f = "Swipeable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class u3 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ CoroutineScope f14335p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ float f14336q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ SwipeableState<Object> f14337r0;

    /* JADX INFO: compiled from: Swipeable.kt */
    @DebugMetadata(c = "androidx.compose.material3.SwipeableKt$swipeable$3$4$1$1", f = "Swipeable.kt", i = {}, l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f14338p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<Object> f14339q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f14340r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SwipeableState<Object> swipeableState, float f6, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f14339q0 = swipeableState;
            this.f14340r0 = f6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f14339q0, this.f14340r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f14338p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f14338p0 = 1;
                if (this.f14339q0.performFling$material3_release(this.f14340r0, this) == coroutine_suspended) {
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
    public u3(SwipeableState<Object> swipeableState, Continuation<? super u3> continuation) {
        super(3, continuation);
        this.f14337r0 = swipeableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, Float f6, Continuation<? super Unit> continuation) {
        float fFloatValue = f6.floatValue();
        u3 u3Var = new u3(this.f14337r0, continuation);
        u3Var.f14335p0 = coroutineScope;
        u3Var.f14336q0 = fFloatValue;
        return u3Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        BuildersKt__Builders_commonKt.launch$default(this.f14335p0, null, null, new a(this.f14337r0, this.f14336q0, null), 3, null);
        return Unit.INSTANCE;
    }
}
