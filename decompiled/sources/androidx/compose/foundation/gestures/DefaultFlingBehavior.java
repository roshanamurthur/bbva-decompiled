package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.ui.MotionDurationScale;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "initialVelocity", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLastAnimationCycleCount", "()I", "setLastAnimationCycleCount", "(I)V", "lastAnimationCycleCount", "Landroidx/compose/animation/core/DecayAnimationSpec;", "flingDecay", "Landroidx/compose/ui/MotionDurationScale;", "motionDurationScale", "<init>", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/ui/MotionDurationScale;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class DefaultFlingBehavior implements FlingBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DecayAnimationSpec<Float> f3545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MotionDurationScale f3546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int lastAnimationCycleCount;

    /* JADX INFO: compiled from: Scrollable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", i = {0}, l = {TypedValues.MotionType.TYPE_EASING}, m = "invokeSuspend", n = {"velocityLeft"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Float>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Ref.FloatRef f3548p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f3549q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f3550r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ DefaultFlingBehavior f3551s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ ScrollScope f3552t0;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultFlingBehavior$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Scrollable.kt */
        public static final class C0014a extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Ref.FloatRef f3553p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ ScrollScope f3554q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Ref.FloatRef f3555r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ DefaultFlingBehavior f3556s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0014a(Ref.FloatRef floatRef, ScrollScope scrollScope, Ref.FloatRef floatRef2, DefaultFlingBehavior defaultFlingBehavior) {
                super(1);
                this.f3553p0 = floatRef;
                this.f3554q0 = scrollScope;
                this.f3555r0 = floatRef2;
                this.f3556s0 = defaultFlingBehavior;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                AnimationScope<Float, AnimationVector1D> animateDecay = animationScope;
                Intrinsics.checkNotNullParameter(animateDecay, "$this$animateDecay");
                float fFloatValue = animateDecay.getValue().floatValue();
                Ref.FloatRef floatRef = this.f3553p0;
                float f6 = fFloatValue - floatRef.element;
                float fScrollBy = this.f3554q0.scrollBy(f6);
                floatRef.element = animateDecay.getValue().floatValue();
                this.f3555r0.element = animateDecay.getVelocity().floatValue();
                if (Math.abs(f6 - fScrollBy) > 0.5f) {
                    animateDecay.cancelAnimation();
                }
                DefaultFlingBehavior defaultFlingBehavior = this.f3556s0;
                defaultFlingBehavior.setLastAnimationCycleCount(defaultFlingBehavior.getLastAnimationCycleCount() + 1);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f6, DefaultFlingBehavior defaultFlingBehavior, ScrollScope scrollScope, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f3550r0 = f6;
            this.f3551s0 = defaultFlingBehavior;
            this.f3552t0 = scrollScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f3550r0, this.f3551s0, this.f3552t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Float> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            float f6;
            Ref.FloatRef floatRef;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3549q0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                f6 = this.f3550r0;
                if (Math.abs(f6) > 1.0f) {
                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    floatRef2.element = f6;
                    Ref.FloatRef floatRef3 = new Ref.FloatRef();
                    AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(0.0f, this.f3550r0, 0L, 0L, false, 28, null);
                    DefaultFlingBehavior defaultFlingBehavior = this.f3551s0;
                    DecayAnimationSpec decayAnimationSpec = defaultFlingBehavior.f3545a;
                    C0014a c0014a = new C0014a(floatRef3, this.f3552t0, floatRef2, defaultFlingBehavior);
                    this.f3548p0 = floatRef2;
                    this.f3549q0 = 1;
                    if (SuspendAnimationKt.animateDecay$default(animationStateAnimationState$default, decayAnimationSpec, false, c0014a, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef = floatRef2;
                }
                return Boxing.boxFloat(f6);
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = this.f3548p0;
            ResultKt.throwOnFailure(obj);
            f6 = floatRef.element;
            return Boxing.boxFloat(f6);
        }
    }

    public DefaultFlingBehavior(@NotNull DecayAnimationSpec<Float> flingDecay, @NotNull MotionDurationScale motionDurationScale) {
        Intrinsics.checkNotNullParameter(flingDecay, "flingDecay");
        Intrinsics.checkNotNullParameter(motionDurationScale, "motionDurationScale");
        this.f3545a = flingDecay;
        this.f3546b = motionDurationScale;
    }

    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    @Nullable
    public Object performFling(@NotNull ScrollScope scrollScope, float f6, @NotNull Continuation<? super Float> continuation) {
        this.lastAnimationCycleCount = 0;
        return BuildersKt.withContext(this.f3546b, new a(f6, this, scrollScope, null), continuation);
    }

    public final void setLastAnimationCycleCount(int i10) {
        this.lastAnimationCycleCount = i10;
    }

    public /* synthetic */ DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec, MotionDurationScale motionDurationScale, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(decayAnimationSpec, (i10 & 2) != 0 ? ScrollableKt.getDefaultScrollMotionDurationScale() : motionDurationScale);
    }
}
