package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Animatable.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B9\u0012\u0006\u0010N\u001a\u00028\u0000\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010(\u001a\u00020#¢\u0006\u0004\bP\u0010QB1\b\u0017\u0012\u0006\u0010N\u001a\u00028\u0000\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\bP\u0010RJ%\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJj\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\n\u001a\u00028\u00002\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\b\u0002\u0010\r\u001a\u00028\u00002'\b\u0002\u0010\u0010\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e¢\u0006\u0002\b\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J^\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\r\u001a\u00028\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142'\b\u0002\u0010\u0010\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e¢\u0006\u0002\b\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bR#\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010(\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R&\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R+\u00103\u001a\u00020/2\u0006\u00100\u001a\u00020/8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R+\u0010\n\u001a\u00028\u00002\u0006\u00100\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u00100\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u00109R(\u0010\u0006\u001a\u0004\u0018\u00018\u00002\b\u00100\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b@\u00109R \u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0011\u0010H\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bG\u00109R\u0011\u0010K\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0011\u0010M\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bL\u00109\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006S"}, d2 = {"Landroidx/compose/animation/core/Animatable;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "lowerBound", "upperBound", "", "updateBounds", "(Ljava/lang/Object;Ljava/lang/Object;)V", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "initialVelocity", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "Landroidx/compose/animation/core/AnimationResult;", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "animateDecay", "(Ljava/lang/Object;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/State;", "asState", "Landroidx/compose/animation/core/TwoWayConverter;", "a", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "", "c", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "label", "Landroidx/compose/animation/core/AnimationState;", "d", "Landroidx/compose/animation/core/AnimationState;", "getInternalState$animation_core_release", "()Landroidx/compose/animation/core/AnimationState;", "internalState", "", "<set-?>", "e", "Landroidx/compose/runtime/MutableState;", "isRunning", "()Z", "setRunning", "(Z)V", "f", "getTargetValue", "()Ljava/lang/Object;", "setTargetValue", "(Ljava/lang/Object;)V", "g", "Ljava/lang/Object;", "getLowerBound", "h", "getUpperBound", "Landroidx/compose/animation/core/SpringSpec;", "j", "Landroidx/compose/animation/core/SpringSpec;", "getDefaultSpringSpec$animation_core_release", "()Landroidx/compose/animation/core/SpringSpec;", "defaultSpringSpec", "getValue", "value", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "getVelocity", "velocity", "initialValue", "visibilityThreshold", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/String;)V", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimatable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,477:1\n81#2:478\n107#2,2:479\n81#2:481\n107#2,2:482\n1#3:484\n*S KotlinDebug\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n*L\n96#1:478\n96#1:479,2\n103#1:481\n103#1:482,2\n*E\n"})
public final class Animatable<T, V extends AnimationVector> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TwoWayConverter<T, V> typeConverter;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final T f2829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String label;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnimationState<T, V> internalState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState isRunning;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState targetValue;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public T lowerBound;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public T upperBound;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutatorMutex f2836i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SpringSpec<T> defaultSpringSpec;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final V f2838k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final V f2839l;

    @NotNull
    public V m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public V f2840n;

    /* JADX INFO: compiled from: Animatable.kt */
    @DebugMetadata(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", i = {0, 0}, l = {305}, m = "invokeSuspend", n = {"endState", "clampingNeeded"}, s = {"L$0", "L$1"})
    public static final class a extends SuspendLambda implements Function1<Continuation<? super AnimationResult<T, V>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public AnimationState f2841p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Ref.BooleanRef f2842q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f2843r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Animatable<T, V> f2844s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ T f2845t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Animation<T, V> f2846u0;
        public final /* synthetic */ long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function1<Animatable<T, V>, Unit> f2847w0;

        /* JADX INFO: renamed from: androidx.compose.animation.core.Animatable$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Animatable.kt */
        public static final class C0008a extends Lambda implements Function1<AnimationScope<T, V>, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Animatable<T, V> f2848p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ AnimationState<T, V> f2849q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Function1<Animatable<T, V>, Unit> f2850r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ Ref.BooleanRef f2851s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0008a(Animatable<T, V> animatable, AnimationState<T, V> animationState, Function1<? super Animatable<T, V>, Unit> function1, Ref.BooleanRef booleanRef) {
                super(1);
                this.f2848p0 = animatable;
                this.f2849q0 = animationState;
                this.f2850r0 = function1;
                this.f2851s0 = booleanRef;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Object obj) {
                AnimationScope animate = (AnimationScope) obj;
                Intrinsics.checkNotNullParameter(animate, "$this$animate");
                Animatable<T, V> animatable = this.f2848p0;
                SuspendAnimationKt.updateState(animate, animatable.getInternalState$animation_core_release());
                Object objA = animatable.a(animate.getValue());
                boolean zAreEqual = Intrinsics.areEqual(objA, animate.getValue());
                Function1<Animatable<T, V>, Unit> function1 = this.f2850r0;
                if (!zAreEqual) {
                    animatable.getInternalState$animation_core_release().setValue$animation_core_release(objA);
                    this.f2849q0.setValue$animation_core_release((T) objA);
                    if (function1 != null) {
                        function1.invoke(animatable);
                    }
                    animate.cancelAnimation();
                    this.f2851s0.element = true;
                } else if (function1 != null) {
                    function1.invoke(animatable);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Animatable<T, V> animatable, T t10, Animation<T, V> animation, long j10, Function1<? super Animatable<T, V>, Unit> function1, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f2844s0 = animatable;
            this.f2845t0 = t10;
            this.f2846u0 = animation;
            this.v0 = j10;
            this.f2847w0 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new a(this.f2844s0, this.f2845t0, this.f2846u0, this.v0, this.f2847w0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((a) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AnimationState animationState;
            Ref.BooleanRef booleanRef;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f2843r0;
            Animatable<T, V> animatable = this.f2844s0;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    animatable.getInternalState$animation_core_release().setVelocityVector$animation_core_release(animatable.getTypeConverter().getConvertToVector().invoke(this.f2845t0));
                    Animatable.access$setTargetValue(animatable, this.f2846u0.getTargetValue());
                    Animatable.access$setRunning(animatable, true);
                    AnimationState animationStateCopy$default = AnimationStateKt.copy$default((AnimationState) animatable.getInternalState$animation_core_release(), (Object) null, (AnimationVector) null, 0L, Long.MIN_VALUE, false, 23, (Object) null);
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    Animation<T, V> animation = this.f2846u0;
                    long j10 = this.v0;
                    C0008a c0008a = new C0008a(animatable, animationStateCopy$default, this.f2847w0, booleanRef2);
                    this.f2841p0 = animationStateCopy$default;
                    this.f2842q0 = booleanRef2;
                    this.f2843r0 = 1;
                    if (SuspendAnimationKt.animate(animationStateCopy$default, animation, j10, c0008a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    animationState = animationStateCopy$default;
                    booleanRef = booleanRef2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = this.f2842q0;
                    animationState = this.f2841p0;
                    ResultKt.throwOnFailure(obj);
                }
                AnimationEndReason animationEndReason = booleanRef.element ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
                Animatable.access$endAnimation(animatable);
                return new AnimationResult(animationState, animationEndReason);
            } catch (CancellationException e5) {
                Animatable.access$endAnimation(animatable);
                throw e5;
            }
        }
    }

    /* JADX INFO: compiled from: Animatable.kt */
    @DebugMetadata(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Animatable<T, V> f2852p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T f2853q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Animatable<T, V> animatable, T t10, Continuation<? super b> continuation) {
            super(1, continuation);
            this.f2852p0 = animatable;
            this.f2853q0 = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new b(this.f2852p0, this.f2853q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Animatable<T, V> animatable = this.f2852p0;
            Animatable.access$endAnimation(animatable);
            Object objA = animatable.a(this.f2853q0);
            animatable.getInternalState$animation_core_release().setValue$animation_core_release(objA);
            Animatable.access$setTargetValue(animatable, objA);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Animatable.kt */
    @DebugMetadata(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Animatable<T, V> f2854p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Animatable<T, V> animatable, Continuation<? super c> continuation) {
            super(1, continuation);
            this.f2854p0 = animatable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new c(this.f2854p0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Animatable.access$endAnimation(this.f2854p0);
            return Unit.INSTANCE;
        }
    }

    public Animatable(T t10, @NotNull TwoWayConverter<T, V> typeConverter, @Nullable T t11, @NotNull String label) {
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(label, "label");
        this.typeConverter = typeConverter;
        this.f2829b = t11;
        this.label = label;
        this.internalState = new AnimationState<>(typeConverter, t10, null, 0L, 0L, false, 60, null);
        this.isRunning = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.targetValue = SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
        this.f2836i = new MutatorMutex();
        this.defaultSpringSpec = new SpringSpec<>(0.0f, 0.0f, t11, 3, null);
        V vInvoke = typeConverter.getConvertToVector().invoke(t10);
        int size = vInvoke.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            vInvoke.set$animation_core_release(i10, Float.NEGATIVE_INFINITY);
        }
        this.f2838k = vInvoke;
        V vInvoke2 = this.typeConverter.getConvertToVector().invoke(t10);
        int size2 = vInvoke2.getSize();
        for (int i11 = 0; i11 < size2; i11++) {
            vInvoke2.set$animation_core_release(i11, Float.POSITIVE_INFINITY);
        }
        this.f2839l = vInvoke2;
        this.m = vInvoke;
        this.f2840n = vInvoke2;
    }

    public static final void access$endAnimation(Animatable animatable) {
        AnimationState<T, V> animationState = animatable.internalState;
        animationState.getVelocityVector().reset$animation_core_release();
        animationState.setLastFrameTimeNanos$animation_core_release(Long.MIN_VALUE);
        animatable.isRunning.setValue(Boolean.FALSE);
    }

    public static final void access$setRunning(Animatable animatable, boolean z10) {
        animatable.isRunning.setValue(Boolean.valueOf(z10));
    }

    public static final void access$setTargetValue(Animatable animatable, Object obj) {
        animatable.targetValue.setValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateDecay$default(Animatable animatable, Object obj, DecayAnimationSpec decayAnimationSpec, Function1 function1, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        return animatable.animateDecay(obj, decayAnimationSpec, function1, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, Function1 function1, Continuation continuation, int i10, Object obj3) {
        if ((i10 & 2) != 0) {
            animationSpec = animatable.defaultSpringSpec;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i10 & 4) != 0) {
            obj2 = animatable.getVelocity();
        }
        Object obj4 = obj2;
        if ((i10 & 8) != 0) {
            function1 = null;
        }
        return animatable.animateTo(obj, animationSpec2, obj4, function1, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateBounds$default(Animatable animatable, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = animatable.lowerBound;
        }
        if ((i10 & 2) != 0) {
            obj2 = animatable.upperBound;
        }
        animatable.updateBounds(obj, obj2);
    }

    public final T a(T t10) {
        if (Intrinsics.areEqual(this.m, this.f2838k) && Intrinsics.areEqual(this.f2840n, this.f2839l)) {
            return t10;
        }
        TwoWayConverter<T, V> twoWayConverter = this.typeConverter;
        V vInvoke = twoWayConverter.getConvertToVector().invoke(t10);
        int size = vInvoke.getSize();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            if (vInvoke.get$animation_core_release(i10) < this.m.get$animation_core_release(i10) || vInvoke.get$animation_core_release(i10) > this.f2840n.get$animation_core_release(i10)) {
                vInvoke.set$animation_core_release(i10, kotlin.ranges.c.coerceIn(vInvoke.get$animation_core_release(i10), this.m.get$animation_core_release(i10), this.f2840n.get$animation_core_release(i10)));
                z10 = true;
            }
        }
        return z10 ? twoWayConverter.getConvertFromVector().invoke(vInvoke) : t10;
    }

    @Nullable
    public final Object animateDecay(T t10, @NotNull DecayAnimationSpec<T> decayAnimationSpec, @Nullable Function1<? super Animatable<T, V>, Unit> function1, @NotNull Continuation<? super AnimationResult<T, V>> continuation) {
        T value = getValue();
        TwoWayConverter<T, V> twoWayConverter = this.typeConverter;
        return b(new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter) twoWayConverter, (Object) value, (AnimationVector) twoWayConverter.getConvertToVector().invoke(t10)), t10, function1, continuation);
    }

    @Nullable
    public final Object animateTo(T t10, @NotNull AnimationSpec<T> animationSpec, T t11, @Nullable Function1<? super Animatable<T, V>, Unit> function1, @NotNull Continuation<? super AnimationResult<T, V>> continuation) {
        return b(AnimationKt.TargetBasedAnimation(animationSpec, this.typeConverter, getValue(), t10, t11), t11, function1, continuation);
    }

    @NotNull
    public final State<T> asState() {
        return this.internalState;
    }

    public final Object b(Animation<T, V> animation, T t10, Function1<? super Animatable<T, V>, Unit> function1, Continuation<? super AnimationResult<T, V>> continuation) {
        return MutatorMutex.mutate$default(this.f2836i, null, new a(this, t10, animation, this.internalState.getLastFrameTimeNanos(), function1, null), continuation, 1, null);
    }

    @NotNull
    public final SpringSpec<T> getDefaultSpringSpec$animation_core_release() {
        return this.defaultSpringSpec;
    }

    @NotNull
    public final AnimationState<T, V> getInternalState$animation_core_release() {
        return this.internalState;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final T getLowerBound() {
        return this.lowerBound;
    }

    public final T getTargetValue() {
        return this.targetValue.getValue();
    }

    @NotNull
    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Nullable
    public final T getUpperBound() {
        return this.upperBound;
    }

    public final T getValue() {
        return this.internalState.getValue();
    }

    public final T getVelocity() {
        return (T) this.typeConverter.getConvertFromVector().invoke(getVelocityVector());
    }

    @NotNull
    public final V getVelocityVector() {
        return (V) this.internalState.getVelocityVector();
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    @Nullable
    public final Object snapTo(T t10, @NotNull Continuation<? super Unit> continuation) {
        Object objMutate$default = MutatorMutex.mutate$default(this.f2836i, null, new b(this, t10, null), continuation, 1, null);
        return objMutate$default == ek.a.getCOROUTINE_SUSPENDED() ? objMutate$default : Unit.INSTANCE;
    }

    @Nullable
    public final Object stop(@NotNull Continuation<? super Unit> continuation) {
        Object objMutate$default = MutatorMutex.mutate$default(this.f2836i, null, new c(this, null), continuation, 1, null);
        return objMutate$default == ek.a.getCOROUTINE_SUSPENDED() ? objMutate$default : Unit.INSTANCE;
    }

    public final void updateBounds(@Nullable T lowerBound, @Nullable T upperBound) {
        V vInvoke;
        V vInvoke2;
        TwoWayConverter<T, V> twoWayConverter = this.typeConverter;
        if (lowerBound == null || (vInvoke = twoWayConverter.getConvertToVector().invoke(lowerBound)) == null) {
            vInvoke = this.f2838k;
        }
        if (upperBound == null || (vInvoke2 = twoWayConverter.getConvertToVector().invoke(upperBound)) == null) {
            vInvoke2 = this.f2839l;
        }
        int size = vInvoke.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            if (vInvoke.get$animation_core_release(i10) > vInvoke2.get$animation_core_release(i10)) {
                throw new IllegalStateException(("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + vInvoke + " is greater than upper bound " + vInvoke2 + " on index " + i10).toString());
            }
        }
        this.m = vInvoke;
        this.f2840n = vInvoke2;
        this.upperBound = upperBound;
        this.lowerBound = lowerBound;
        if (isRunning()) {
            return;
        }
        T tA = a(getValue());
        if (Intrinsics.areEqual(tA, getValue())) {
            return;
        }
        this.internalState.setValue$animation_core_release(tA);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, twoWayConverter, (i10 & 4) != 0 ? null : obj2, (i10 & 8) != 0 ? "Animatable" : str);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, twoWayConverter, (i10 & 4) != 0 ? null : obj2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility", replaceWith = @ReplaceWith(expression = "Animatable(initialValue, typeConverter, visibilityThreshold, \"Animatable\")", imports = {}))
    public /* synthetic */ Animatable(Object obj, TwoWayConverter typeConverter, Object obj2) {
        this(obj, typeConverter, obj2, "Animatable");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
    }
}
