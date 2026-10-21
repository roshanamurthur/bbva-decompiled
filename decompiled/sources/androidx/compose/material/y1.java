package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1", f = "Slider.kt", i = {}, l = {361}, m = "invokeSuspend", n = {}, s = {})
public final class y1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ClosedFloatingPointRange<Float> E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f9113p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ float f9114q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ float f9115r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f9116s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ boolean f9117t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f9118u0;
    public final /* synthetic */ MutableFloatState v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> f9119w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f9120x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f9121y0;

    /* JADX INFO: compiled from: Slider.kt */
    public static final class a extends Lambda implements Function1<Animatable<Float, AnimationVector1D>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f9122p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f9123q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f9124r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> f9125s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f9126t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f9127u0;
        public final /* synthetic */ ClosedFloatingPointRange<Float> v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z10, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange<Float> closedFloatingPointRange) {
            super(1);
            this.f9122p0 = z10;
            this.f9123q0 = mutableFloatState;
            this.f9124r0 = mutableFloatState2;
            this.f9125s0 = state;
            this.f9126t0 = floatRef;
            this.f9127u0 = floatRef2;
            this.v0 = closedFloatingPointRange;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
            Animatable<Float, AnimationVector1D> animateTo = animatable;
            Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
            boolean z10 = this.f9122p0;
            MutableFloatState mutableFloatState = this.f9124r0;
            MutableFloatState mutableFloatState2 = this.f9123q0;
            (z10 ? mutableFloatState2 : mutableFloatState).setFloatValue(animateTo.getValue().floatValue());
            Function1<ClosedFloatingPointRange<Float>, Unit> value = this.f9125s0.getValue();
            ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = ok.e.rangeTo(mutableFloatState2.getFloatValue(), mutableFloatState.getFloatValue());
            float f6 = this.f9126t0.element;
            float f10 = this.f9127u0.element;
            ClosedFloatingPointRange<Float> closedFloatingPointRange = this.v0;
            value.invoke(SliderKt.access$scale(f6, f10, closedFloatingPointRangeRangeTo, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y1(float f6, float f10, Function0<Unit> function0, boolean z10, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange<Float> closedFloatingPointRange, Continuation<? super y1> continuation) {
        super(2, continuation);
        this.f9114q0 = f6;
        this.f9115r0 = f10;
        this.f9116s0 = function0;
        this.f9117t0 = z10;
        this.f9118u0 = mutableFloatState;
        this.v0 = mutableFloatState2;
        this.f9119w0 = state;
        this.f9120x0 = floatRef;
        this.f9121y0 = floatRef2;
        this.E0 = closedFloatingPointRange;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new y1(this.f9114q0, this.f9115r0, this.f9116s0, this.f9117t0, this.f9118u0, this.v0, this.f9119w0, this.f9120x0, this.f9121y0, this.E0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((y1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f9113p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(this.f9114q0, 0.0f, 2, null);
            Float fBoxFloat = Boxing.boxFloat(this.f9115r0);
            TweenSpec tweenSpec = SliderKt.f7618g;
            Float fBoxFloat2 = Boxing.boxFloat(0.0f);
            a aVar = new a(this.f9117t0, this.f9118u0, this.v0, this.f9119w0, this.f9120x0, this.f9121y0, this.E0);
            this.f9113p0 = 1;
            if (animatableAnimatable$default.animateTo(fBoxFloat, tweenSpec, fBoxFloat2, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Function0<Unit> function0 = this.f9116s0;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
