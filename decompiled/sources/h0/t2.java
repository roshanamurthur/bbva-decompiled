package h0;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.material.SliderKt;
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

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material.SliderKt$animateToTarget$2", f = "Slider.kt", i = {}, l = {955}, m = "invokeSuspend", n = {}, s = {})
public final class t2 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f69117p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f69118q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ float f69119r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ float f69120s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ float f69121t0;

    /* JADX INFO: compiled from: Slider.kt */
    public static final class a extends Lambda implements Function1<Animatable<Float, AnimationVector1D>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DragScope f69122p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f69123q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DragScope dragScope, Ref.FloatRef floatRef) {
            super(1);
            this.f69122p0 = dragScope;
            this.f69123q0 = floatRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
            Animatable<Float, AnimationVector1D> animateTo = animatable;
            Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
            float fFloatValue = animateTo.getValue().floatValue();
            Ref.FloatRef floatRef = this.f69123q0;
            this.f69122p0.dragBy(fFloatValue - floatRef.element);
            floatRef.element = animateTo.getValue().floatValue();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(float f6, float f10, float f11, Continuation<? super t2> continuation) {
        super(2, continuation);
        this.f69119r0 = f6;
        this.f69120s0 = f10;
        this.f69121t0 = f11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        t2 t2Var = new t2(this.f69119r0, this.f69120s0, this.f69121t0, continuation);
        t2Var.f69118q0 = obj;
        return t2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DragScope dragScope, Continuation<? super Unit> continuation) {
        return ((t2) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f69117p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            DragScope dragScope = (DragScope) this.f69118q0;
            Ref.FloatRef floatRef = new Ref.FloatRef();
            float f6 = this.f69119r0;
            floatRef.element = f6;
            Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(f6, 0.0f, 2, null);
            Float fBoxFloat = Boxing.boxFloat(this.f69120s0);
            TweenSpec tweenSpec = SliderKt.f7618g;
            Float fBoxFloat2 = Boxing.boxFloat(this.f69121t0);
            a aVar = new a(dragScope, floatRef);
            this.f69117p0 = 1;
            if (animatableAnimatable$default.animateTo(fBoxFloat, tweenSpec, fBoxFloat2, aVar, this) == coroutine_suspended) {
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
