package h0;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
public final class i3 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f68833p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f68834q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ SwipeableState<Object> f68835r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ float f68836s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ AnimationSpec<Float> f68837t0;

    /* JADX INFO: compiled from: Swipeable.kt */
    public static final class a extends Lambda implements Function1<Animatable<Float, AnimationVector1D>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DragScope f68838p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f68839q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DragScope dragScope, Ref.FloatRef floatRef) {
            super(1);
            this.f68838p0 = dragScope;
            this.f68839q0 = floatRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
            Animatable<Float, AnimationVector1D> animateTo = animatable;
            Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
            float fFloatValue = animateTo.getValue().floatValue();
            Ref.FloatRef floatRef = this.f68839q0;
            this.f68838p0.dragBy(fFloatValue - floatRef.element);
            floatRef.element = animateTo.getValue().floatValue();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(SwipeableState<Object> swipeableState, float f6, AnimationSpec<Float> animationSpec, Continuation<? super i3> continuation) {
        super(2, continuation);
        this.f68835r0 = swipeableState;
        this.f68836s0 = f6;
        this.f68837t0 = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        i3 i3Var = new i3(this.f68835r0, this.f68836s0, this.f68837t0, continuation);
        i3Var.f68834q0 = obj;
        return i3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DragScope dragScope, Continuation<? super Unit> continuation) {
        return ((i3) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f68833p0;
        SwipeableState<Object> swipeableState = this.f68835r0;
        try {
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                DragScope dragScope = (DragScope) this.f68834q0;
                Ref.FloatRef floatRef = new Ref.FloatRef();
                floatRef.element = swipeableState.f7924g.getFloatValue();
                MutableState mutableState = swipeableState.f7925h;
                float f6 = this.f68836s0;
                mutableState.setValue(Boxing.boxFloat(f6));
                swipeableState.isAnimationRunning.setValue(Boolean.valueOf(true));
                Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(floatRef.element, 0.0f, 2, null);
                Float fBoxFloat = Boxing.boxFloat(f6);
                AnimationSpec<Float> animationSpec = this.f68837t0;
                a aVar = new a(dragScope, floatRef);
                this.f68833p0 = 1;
                if (Animatable.animateTo$default(animatableAnimatable$default, fBoxFloat, animationSpec, null, aVar, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            swipeableState.f7925h.setValue(null);
            swipeableState.isAnimationRunning.setValue(Boolean.valueOf(false));
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            swipeableState.f7925h.setValue(null);
            swipeableState.isAnimationRunning.setValue(Boolean.valueOf(false));
            throw th2;
        }
    }
}
