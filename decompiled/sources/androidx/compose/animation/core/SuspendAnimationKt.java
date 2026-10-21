package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.MotionDurationScale;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SuspendAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001au\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u000426\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001ac\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000f26\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u009b\u0001\u0010\r\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000426\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0017\u001a|\u0010\u001e\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00192%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\u0012\u0004\u0012\u00020\u000b0\u001b¢\u0006\u0002\b\u001dH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001ar\u0010\u0010\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000 2\b\b\u0002\u0010\u001a\u001a\u00020\u00192%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\u0012\u0004\u0012\u00020\u000b0\u001b¢\u0006\u0002\b\u001dH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010!\u001ax\u0010\r\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"2\b\b\u0002\u0010%\u001a\u00020$2%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\u0012\u0004\u0012\u00020\u000b0\u001b¢\u0006\u0002\b\u001dH\u0080@ø\u0001\u0000¢\u0006\u0004\b\r\u0010&\u001a<\u0010(\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0000\"\u0018\u0010,\u001a\u00020\u0000*\u00020)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"", "initialValue", "targetValue", "initialVelocity", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "velocity", "", "block", "animate", "(FFFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "animateDecay", "(FFLandroidx/compose/animation/core/FloatDecayAnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "", "sequentialAnimation", "Lkotlin/Function1;", "Landroidx/compose/animation/core/AnimationScope;", "Lkotlin/ExtensionFunctionType;", "animateTo", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/Animation;", "animation", "", "startTimeNanos", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/Animation;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "state", "updateState", "Lkotlin/coroutines/CoroutineContext;", "getDurationScale", "(Lkotlin/coroutines/CoroutineContext;)F", "durationScale", "animation-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSuspendAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n1#2:364\n*E\n"})
public final class SuspendAnimationKt {

    /* JADX INFO: Add missing generic type declarations: [T, V] */
    /* JADX INFO: compiled from: SuspendAnimation.kt */
    public static final class a<T, V> extends Lambda implements Function1<AnimationScope<T, V>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<T, T, Unit> f3058p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TwoWayConverter<T, V> f3059q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super T, ? super T, Unit> function2, TwoWayConverter<T, V> twoWayConverter) {
            super(1);
            this.f3058p0 = function2;
            this.f3059q0 = twoWayConverter;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            AnimationScope animate = (AnimationScope) obj;
            Intrinsics.checkNotNullParameter(animate, "$this$animate");
            Object value = animate.getValue();
            this.f3058p0.invoke((T) value, this.f3059q0.getConvertFromVector().invoke(animate.getVelocityVector()));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SuspendAnimation.kt */
    @DebugMetadata(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {239, 278}, m = "animate", n = {"$this$animate", "animation", "block", "lateInitScope", "$this$animate", "animation", "block", "lateInitScope"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    public static final class b<T, V extends AnimationVector> extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public AnimationState f3060p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Animation f3061q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Function1 f3062r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Ref.ObjectRef f3063s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f3064t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f3065u0;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3064t0 = obj;
            this.f3065u0 |= Integer.MIN_VALUE;
            return SuspendAnimationKt.animate(null, null, 0L, null, this);
        }
    }

    /* JADX INFO: compiled from: SuspendAnimation.kt */
    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f3066p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter((AnimationScope) obj, "$this$null");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SuspendAnimation.kt */
    public static final class d extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<AnimationScope<T, V>> f3067p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T f3068q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Animation<T, V> f3069r0;

        /* JADX INFO: Incorrect field signature: TV; */
        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ AnimationVector f3070s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ AnimationState<T, V> f3071t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ float f3072u0;
        public final /* synthetic */ Function1<AnimationScope<T, V>, Unit> v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/internal/Ref$ObjectRef<Landroidx/compose/animation/core/AnimationScope<TT;TV;>;>;TT;Landroidx/compose/animation/core/Animation<TT;TV;>;TV;Landroidx/compose/animation/core/AnimationState<TT;TV;>;FLkotlin/jvm/functions/Function1<-Landroidx/compose/animation/core/AnimationScope<TT;TV;>;Lkotlin/Unit;>;)V */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Ref.ObjectRef objectRef, Object obj, Animation animation, AnimationVector animationVector, AnimationState animationState, float f6, Function1 function1) {
            super(1);
            this.f3067p0 = objectRef;
            this.f3068q0 = obj;
            this.f3069r0 = animation;
            this.f3070s0 = animationVector;
            this.f3071t0 = animationState;
            this.f3072u0 = f6;
            this.v0 = function1;
        }

        /* JADX WARN: Type inference failed for: r14v2, types: [T, androidx.compose.animation.core.AnimationScope] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l6) {
            long jLongValue = l6.longValue();
            T t10 = this.f3068q0;
            Animation<T, V> animation = this.f3069r0;
            ?? animationScope = new AnimationScope(t10, animation.getTypeConverter(), this.f3070s0, jLongValue, animation.getTargetValue(), jLongValue, true, new androidx.compose.animation.core.a(this.f3071t0));
            SuspendAnimationKt.b(animationScope, jLongValue, this.f3072u0, this.f3069r0, this.f3071t0, this.v0);
            this.f3067p0.element = animationScope;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SuspendAnimation.kt */
    public static final class e extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AnimationState<T, V> f3073p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AnimationState<T, V> animationState) {
            super(0);
            this.f3073p0 = animationState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f3073p0.setRunning$animation_core_release(false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SuspendAnimation.kt */
    public static final class f extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<AnimationScope<T, V>> f3074p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f3075q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Animation<T, V> f3076r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ AnimationState<T, V> f3077s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimationScope<T, V>, Unit> f3078t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Ref.ObjectRef<AnimationScope<T, V>> objectRef, float f6, Animation<T, V> animation, AnimationState<T, V> animationState, Function1<? super AnimationScope<T, V>, Unit> function1) {
            super(1);
            this.f3074p0 = objectRef;
            this.f3075q0 = f6;
            this.f3076r0 = animation;
            this.f3077s0 = animationState;
            this.f3078t0 = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l6) {
            long jLongValue = l6.longValue();
            T t10 = this.f3074p0.element;
            Intrinsics.checkNotNull(t10);
            SuspendAnimationKt.b((AnimationScope) t10, jLongValue, this.f3075q0, this.f3076r0, this.f3077s0, this.f3078t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SuspendAnimation.kt */
    public static final class g extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Float, Float, Unit> f3079p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function2<? super Float, ? super Float, Unit> function2) {
            super(1);
            this.f3079p0 = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            AnimationScope<Float, AnimationVector1D> animate = animationScope;
            Intrinsics.checkNotNullParameter(animate, "$this$animate");
            this.f3079p0.invoke(animate.getValue(), Float.valueOf(((AnimationVector1D) animate.getVelocityVector()).getValue()));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SuspendAnimation.kt */
    public static final class h extends Lambda implements Function1 {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f3080p0 = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter((AnimationScope) obj, "$this$null");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SuspendAnimation.kt */
    public static final class i extends Lambda implements Function1 {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f3081p0 = new i(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter((AnimationScope) obj, "$this$null");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: SuspendAnimation.kt */
    public static final class j<R> extends Lambda implements Function1<Long, R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, R> f3082p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(Function1<? super Long, ? extends R> function1) {
            super(1);
            this.f3082p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Long l6) {
            return this.f3082p0.invoke(Long.valueOf(l6.longValue()));
        }
    }

    public static final <R, T, V extends AnimationVector> Object a(Animation<T, V> animation, Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        return animation.isInfinite() ? InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(function1, continuation) : MonotonicFrameClockKt.withFrameNanos(new j(function1), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0119  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r13v1, types: [T, androidx.compose.animation.core.AnimationScope] */
    @Nullable
    public static final <T, V extends AnimationVector> Object animate(@NotNull AnimationState<T, V> animationState, @NotNull Animation<T, V> animation, long j10, @NotNull Function1<? super AnimationScope<T, V>, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        b bVar;
        Ref.ObjectRef objectRef;
        Function1<? super AnimationScope<T, V>, Unit> function2;
        AnimationState<T, V> animationState2;
        AnimationScope animationScope;
        AnimationScope animationScope2;
        f fVar;
        AnimationState<T, V> animationState3 = animationState;
        Animation<T, V> animation2 = animation;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f3065u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f3065u0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f3064t0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar2.f3065u0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            T valueFromNanos = animation2.getValueFromNanos(0L);
            AnimationVector velocityVectorFromNanos = animation2.getVelocityVectorFromNanos(0L);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                if (j10 == Long.MIN_VALUE) {
                    d dVar = new d(objectRef2, valueFromNanos, animation, velocityVectorFromNanos, animationState, getDurationScale(bVar2.getContext()), function1);
                    bVar2.f3060p0 = animationState3;
                    bVar2.f3061q0 = animation2;
                    function2 = function1;
                    bVar2.f3062r0 = function2;
                    bVar2.f3063s0 = objectRef2;
                    bVar2.f3065u0 = 1;
                    if (a(animation2, dVar, bVar2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    function2 = function1;
                    try {
                        ?? r13 = (T) new AnimationScope(valueFromNanos, animation.getTypeConverter(), velocityVectorFromNanos, j10, animation.getTargetValue(), j10, true, new e(animationState3));
                        objectRef2 = objectRef2;
                        b(r13, j10, getDurationScale(bVar2.getContext()), animation, animationState, function1);
                        objectRef2.element = r13;
                    } catch (CancellationException e5) {
                        e = e5;
                        objectRef2 = objectRef2;
                        objectRef = objectRef2;
                        animationScope = (AnimationScope) objectRef.element;
                        if (animationScope != null) {
                            animationScope.setRunning$animation_core_release(false);
                        }
                        animationScope2 = (AnimationScope) objectRef.element;
                        if (animationScope2 != null) {
                            animationState3.setRunning$animation_core_release(false);
                        }
                        throw e;
                    }
                }
                animationState2 = animationState3;
                objectRef = objectRef2;
            } catch (CancellationException e7) {
                e = e7;
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = bVar2.f3063s0;
            Function1<? super AnimationScope<T, V>, Unit> function3 = bVar2.f3062r0;
            Animation<T, V> animation3 = bVar2.f3061q0;
            animationState2 = bVar2.f3060p0;
            try {
                ResultKt.throwOnFailure(obj);
                function2 = function3;
                animation2 = animation3;
            } catch (CancellationException e10) {
                e = e10;
                animationState3 = animationState2;
                animationScope = (AnimationScope) objectRef.element;
                if (animationScope != null) {
                    animationScope.setRunning$animation_core_release(false);
                }
                animationScope2 = (AnimationScope) objectRef.element;
                if (animationScope2 != null && animationScope2.getLastFrameTimeNanos() == animationState3.getLastFrameTimeNanos()) {
                    animationState3.setRunning$animation_core_release(false);
                }
                throw e;
            }
        }
        do {
            T t10 = objectRef.element;
            Intrinsics.checkNotNull(t10);
            if (!((AnimationScope) t10).isRunning()) {
                return Unit.INSTANCE;
            }
            fVar = new f(objectRef, getDurationScale(bVar2.getContext()), animation2, animationState2, function2);
            bVar2.f3060p0 = animationState2;
            bVar2.f3061q0 = animation2;
            bVar2.f3062r0 = function2;
            bVar2.f3063s0 = objectRef;
            bVar2.f3065u0 = 2;
        } while (a(animation2, fVar, bVar2) != coroutine_suspended);
        return coroutine_suspended;
    }

    public static /* synthetic */ Object animate$default(float f6, float f10, float f11, AnimationSpec animationSpec, Function2 function2, Continuation continuation, int i10, Object obj) {
        float f12 = (i10 & 4) != 0 ? 0.0f : f11;
        if ((i10 & 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(f6, f10, f12, animationSpec, function2, continuation);
    }

    @Nullable
    public static final Object animateDecay(float f6, float f10, @NotNull FloatDecayAnimationSpec floatDecayAnimationSpec, @NotNull Function2<? super Float, ? super Float, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimate$default = animate$default(AnimationStateKt.AnimationState$default(f6, f10, 0L, 0L, false, 28, null), AnimationKt.DecayAnimation(floatDecayAnimationSpec, f6, f10), 0L, new g(function2), continuation, 2, null);
        return objAnimate$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimate$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateDecay$default(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z10, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            function1 = h.f3080p0;
        }
        return animateDecay(animationState, decayAnimationSpec, z10, function1, (Continuation<? super Unit>) continuation);
    }

    @Nullable
    public static final <T, V extends AnimationVector> Object animateTo(@NotNull AnimationState<T, V> animationState, T t10, @NotNull AnimationSpec<T> animationSpec, boolean z10, @NotNull Function1<? super AnimationScope<T, V>, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimate = animate(animationState, new TargetBasedAnimation(animationSpec, animationState.getTypeConverter(), animationState.getValue(), t10, animationState.getVelocityVector()), z10 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, function1, continuation);
        return objAnimate == ek.a.getCOROUTINE_SUSPENDED() ? objAnimate : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateTo$default(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z10, Function1 function1, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            function1 = i.f3081p0;
        }
        return animateTo(animationState, obj, animationSpec2, z11, function1, continuation);
    }

    public static final <T, V extends AnimationVector> void b(AnimationScope<T, V> animationScope, long j10, float f6, Animation<T, V> animation, AnimationState<T, V> animationState, Function1<? super AnimationScope<T, V>, Unit> function1) {
        long durationNanos = f6 == 0.0f ? animation.getDurationNanos() : (long) ((j10 - animationScope.getStartTimeNanos()) / f6);
        animationScope.setLastFrameTimeNanos$animation_core_release(j10);
        animationScope.setValue$animation_core_release(animation.getValueFromNanos(durationNanos));
        animationScope.setVelocityVector$animation_core_release(animation.getVelocityVectorFromNanos(durationNanos));
        if (animation.isFinishedFromNanos(durationNanos)) {
            animationScope.setFinishedTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
            animationScope.setRunning$animation_core_release(false);
        }
        updateState(animationScope, animationState);
        function1.invoke(animationScope);
    }

    public static final float getDurationScale(@NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "<this>");
        MotionDurationScale motionDurationScale = (MotionDurationScale) coroutineContext.get(MotionDurationScale.INSTANCE);
        float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
        if (scaleFactor >= 0.0f) {
            return scaleFactor;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final <T, V extends AnimationVector> void updateState(@NotNull AnimationScope<T, V> animationScope, @NotNull AnimationState<T, V> state) {
        Intrinsics.checkNotNullParameter(animationScope, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        state.setValue$animation_core_release(animationScope.getValue());
        AnimationVectorsKt.copyFrom(state.getVelocityVector(), animationScope.getVelocityVector());
        state.setFinishedTimeNanos$animation_core_release(animationScope.getFinishedTimeNanos());
        state.setLastFrameTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
        state.setRunning$animation_core_release(animationScope.isRunning());
    }

    @Nullable
    public static final <T, V extends AnimationVector> Object animateDecay(@NotNull AnimationState<T, V> animationState, @NotNull DecayAnimationSpec<T> decayAnimationSpec, boolean z10, @NotNull Function1<? super AnimationScope<T, V>, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimate = animate(animationState, new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter<T, AnimationVector>) animationState.getTypeConverter(), (Object) animationState.getValue(), animationState.getVelocityVector()), z10 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, function1, continuation);
        return objAnimate == ek.a.getCOROUTINE_SUSPENDED() ? objAnimate : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animate$default(AnimationState animationState, Animation animation, long j10, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MIN_VALUE;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            function1 = c.f3066p0;
        }
        return animate(animationState, animation, j11, function1, continuation);
    }

    @Nullable
    public static final Object animate(float f6, float f10, float f11, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function2<? super Float, ? super Float, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimate = animate(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Boxing.boxFloat(f6), Boxing.boxFloat(f10), Boxing.boxFloat(f11), animationSpec, function2, continuation);
        return objAnimate == ek.a.getCOROUTINE_SUSPENDED() ? objAnimate : Unit.INSTANCE;
    }

    @Nullable
    public static final <T, V extends AnimationVector> Object animate(@NotNull TwoWayConverter<T, V> twoWayConverter, T t10, T t11, @Nullable T t12, @NotNull AnimationSpec<T> animationSpec, @NotNull Function2<? super T, ? super T, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        V vNewInstance;
        if (t12 == null || (vNewInstance = twoWayConverter.getConvertToVector().invoke(t12)) == null) {
            vNewInstance = AnimationVectorsKt.newInstance(twoWayConverter.getConvertToVector().invoke(t10));
        }
        Object objAnimate$default = animate$default(new AnimationState(twoWayConverter, t10, vNewInstance, 0L, 0L, false, 56, null), new TargetBasedAnimation(animationSpec, twoWayConverter, t10, t11, vNewInstance), 0L, new a(function2, twoWayConverter), continuation, 2, null);
        return objAnimate$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimate$default : Unit.INSTANCE;
    }
}
