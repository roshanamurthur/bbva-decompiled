package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u.r;
import u.t;

/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aV\u0010\u0000\u001a\u00020\u00012K\u0010\u0002\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003ø\u0001\u0000\u001a]\u0010\f\u001a\u00020\u00012K\u0010\u0002\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\r\u001a5\u0010\u000e\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a-\u0010\u0014\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a-\u0010\u0017\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a%\u0010\u0019\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\bH\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001d\u0010\u001c\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a\u001f\u0010\u001e\u001a\u00020\u000b*\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010!\u001a\u001d\u0010\"\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001d\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"TransformableState", "Landroidx/compose/foundation/gestures/TransformableState;", "onTransformation", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "zoomChange", "Landroidx/compose/ui/geometry/Offset;", "panChange", "rotationChange", "", "rememberTransformableState", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/TransformableState;", "animatePanBy", TypedValues.CycleType.S_WAVE_OFFSET, "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "animatePanBy-ubNVwUQ", "(Landroidx/compose/foundation/gestures/TransformableState;JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateRotateBy", "degrees", "(Landroidx/compose/foundation/gestures/TransformableState;FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateZoomBy", "zoomFactor", "panBy", "panBy-d-4ec7I", "(Landroidx/compose/foundation/gestures/TransformableState;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rotateBy", "(Landroidx/compose/foundation/gestures/TransformableState;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopTransformation", "terminationPriority", "Landroidx/compose/foundation/MutatePriority;", "(Landroidx/compose/foundation/gestures/TransformableState;Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "zoomBy", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransformableState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,261:1\n25#2:262\n1097#3,6:263\n*S KotlinDebug\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n*L\n119#1:262\n119#1:263,6\n*E\n"})
public final class TransformableStateKt {

    /* JADX INFO: compiled from: TransformableState.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2", f = "TransformableState.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f3965p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f3966q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Ref.LongRef f3967r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f3968s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ AnimationSpec<Offset> f3969t0;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableStateKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TransformableState.kt */
        public static final class C0024a extends Lambda implements Function1<AnimationScope<Offset, AnimationVector2D>, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Ref.LongRef f3970p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ TransformScope f3971q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0024a(Ref.LongRef longRef, TransformScope transformScope) {
                super(1);
                this.f3970p0 = longRef;
                this.f3971q0 = transformScope;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(AnimationScope<Offset, AnimationVector2D> animationScope) {
                AnimationScope<Offset, AnimationVector2D> animateTo = animationScope;
                Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                long f15533a = animateTo.getValue().getF15533a();
                Ref.LongRef longRef = this.f3970p0;
                r.a(this.f3971q0, 0.0f, Offset.m2279minusMKHz9U(f15533a, longRef.element), 0.0f, 5, null);
                longRef.element = animateTo.getValue().getF15533a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.LongRef longRef, long j10, AnimationSpec<Offset> animationSpec, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f3967r0 = longRef;
            this.f3968s0 = j10;
            this.f3969t0 = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f3967r0, this.f3968s0, this.f3969t0, continuation);
            aVar.f3966q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
            return ((a) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3965p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                TransformScope transformScope = (TransformScope) this.f3966q0;
                TwoWayConverter<Offset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Offset.INSTANCE);
                Ref.LongRef longRef = this.f3967r0;
                AnimationState animationState = new AnimationState(vectorConverter, Offset.m2264boximpl(longRef.element), null, 0L, 0L, false, 60, null);
                Offset offsetM2264boximpl = Offset.m2264boximpl(this.f3968s0);
                AnimationSpec<Offset> animationSpec = this.f3969t0;
                C0024a c0024a = new C0024a(longRef, transformScope);
                this.f3965p0 = 1;
                if (SuspendAnimationKt.animateTo$default(animationState, offsetM2264boximpl, animationSpec, false, c0024a, this, 4, null) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: TransformableState.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2", f = "TransformableState.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f3972p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f3973q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f3974r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f3975s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ AnimationSpec<Float> f3976t0;

        /* JADX INFO: compiled from: TransformableState.kt */
        public static final class a extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Ref.FloatRef f3977p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ TransformScope f3978q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref.FloatRef floatRef, TransformScope transformScope) {
                super(1);
                this.f3977p0 = floatRef;
                this.f3978q0 = transformScope;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                AnimationScope<Float, AnimationVector1D> animateTo = animationScope;
                Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                float fFloatValue = animateTo.getValue().floatValue();
                Ref.FloatRef floatRef = this.f3977p0;
                r.a(this.f3978q0, 0.0f, 0L, fFloatValue - floatRef.element, 3, null);
                floatRef.element = animateTo.getValue().floatValue();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f6, AnimationSpec animationSpec, Continuation continuation, Ref.FloatRef floatRef) {
            super(2, continuation);
            this.f3974r0 = floatRef;
            this.f3975s0 = f6;
            this.f3976t0 = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.f3975s0, this.f3976t0, continuation, this.f3974r0);
            bVar.f3973q0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
            return ((b) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3972p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                TransformScope transformScope = (TransformScope) this.f3973q0;
                Ref.FloatRef floatRef = this.f3974r0;
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(floatRef.element, 0.0f, 0L, 0L, false, 30, null);
                Float fBoxFloat = Boxing.boxFloat(this.f3975s0);
                AnimationSpec<Float> animationSpec = this.f3976t0;
                a aVar = new a(floatRef, transformScope);
                this.f3972p0 = 1;
                if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, fBoxFloat, animationSpec, false, aVar, this, 4, null) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: TransformableState.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3", f = "TransformableState.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f3979p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f3980q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f3981r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f3982s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ AnimationSpec<Float> f3983t0;

        /* JADX INFO: compiled from: TransformableState.kt */
        public static final class a extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Ref.FloatRef f3984p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ TransformScope f3985q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref.FloatRef floatRef, TransformScope transformScope) {
                super(1);
                this.f3984p0 = floatRef;
                this.f3985q0 = transformScope;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                AnimationScope<Float, AnimationVector1D> animateTo = animationScope;
                Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                Ref.FloatRef floatRef = this.f3984p0;
                r.a(this.f3985q0, floatRef.element == 0.0f ? 1.0f : animateTo.getValue().floatValue() / floatRef.element, 0L, 0.0f, 6, null);
                floatRef.element = animateTo.getValue().floatValue();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f6, AnimationSpec animationSpec, Continuation continuation, Ref.FloatRef floatRef) {
            super(2, continuation);
            this.f3981r0 = floatRef;
            this.f3982s0 = f6;
            this.f3983t0 = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = new c(this.f3982s0, this.f3983t0, continuation, this.f3981r0);
            cVar.f3980q0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
            return ((c) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3979p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                TransformScope transformScope = (TransformScope) this.f3980q0;
                Ref.FloatRef floatRef = this.f3981r0;
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(floatRef.element, 0.0f, 0L, 0L, false, 30, null);
                Float fBoxFloat = Boxing.boxFloat(this.f3982s0);
                AnimationSpec<Float> animationSpec = this.f3983t0;
                a aVar = new a(floatRef, transformScope);
                this.f3979p0 = 1;
                if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, fBoxFloat, animationSpec, false, aVar, this, 4, null) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: TransformableState.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$panBy$2", f = "TransformableState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f3986p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f3987q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j10, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f3987q0 = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = new d(this.f3987q0, continuation);
            dVar.f3986p0 = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
            return ((d) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ((TransformScope) this.f3986p0).mo177transformByd4ec7I(1.0f, this.f3987q0, 0.0f);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TransformableState.kt */
    public static final class e extends Lambda implements Function3<Float, Offset, Float, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<Function3<Float, Offset, Float, Unit>> f3988p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(State<? extends Function3<? super Float, ? super Offset, ? super Float, Unit>> state) {
            super(3);
            this.f3988p0 = state;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Float f6, Offset offset, Float f10) {
            this.f3988p0.getValue().invoke(Float.valueOf(f6.floatValue()), Offset.m2264boximpl(offset.getF15533a()), Float.valueOf(f10.floatValue()));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TransformableState.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2", f = "TransformableState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f3989p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f3990q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(float f6, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f3990q0 = f6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            f fVar = new f(this.f3990q0, continuation);
            fVar.f3989p0 = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
            return ((f) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ((TransformScope) this.f3989p0).mo177transformByd4ec7I(1.0f, Offset.INSTANCE.m2291getZeroF1C5BW0(), this.f3990q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TransformableState.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2", f = "TransformableState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
        public g() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new g(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
            return ((g) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TransformableState.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2", f = "TransformableState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f3991p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f3992q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(float f6, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f3992q0 = f6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            h hVar = new h(this.f3992q0, continuation);
            hVar.f3991p0 = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
            return ((h) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ((TransformScope) this.f3991p0).mo177transformByd4ec7I(this.f3992q0, Offset.INSTANCE.m2291getZeroF1C5BW0(), 0.0f);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final TransformableState TransformableState(@NotNull Function3<? super Float, ? super Offset, ? super Float, Unit> onTransformation) {
        Intrinsics.checkNotNullParameter(onTransformation, "onTransformation");
        return new DefaultTransformableState(onTransformation);
    }

    @Nullable
    /* JADX INFO: renamed from: animatePanBy-ubNVwUQ, reason: not valid java name */
    public static final Object m224animatePanByubNVwUQ(@NotNull TransformableState transformableState, long j10, @NotNull AnimationSpec<Offset> animationSpec, @NotNull Continuation<? super Unit> continuation) {
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = Offset.INSTANCE.m2291getZeroF1C5BW0();
        Object objA = t.a(transformableState, null, new a(longRef, j10, animationSpec, null), continuation, 1, null);
        return objA == ek.a.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: animatePanBy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ Object m225animatePanByubNVwUQ$default(TransformableState transformableState, long j10, AnimationSpec animationSpec, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return m224animatePanByubNVwUQ(transformableState, j10, animationSpec, continuation);
    }

    @Nullable
    public static final Object animateRotateBy(@NotNull TransformableState transformableState, float f6, @NotNull AnimationSpec<Float> animationSpec, @NotNull Continuation<? super Unit> continuation) {
        Object objA = t.a(transformableState, null, new b(f6, animationSpec, null, new Ref.FloatRef()), continuation, 1, null);
        return objA == ek.a.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateRotateBy$default(TransformableState transformableState, float f6, AnimationSpec animationSpec, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateRotateBy(transformableState, f6, animationSpec, continuation);
    }

    @Nullable
    public static final Object animateZoomBy(@NotNull TransformableState transformableState, float f6, @NotNull AnimationSpec<Float> animationSpec, @NotNull Continuation<? super Unit> continuation) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("zoom value should be greater than 0".toString());
        }
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = 1.0f;
        Object objA = t.a(transformableState, null, new c(f6, animationSpec, null, floatRef), continuation, 1, null);
        return objA == ek.a.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateZoomBy$default(TransformableState transformableState, float f6, AnimationSpec animationSpec, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateZoomBy(transformableState, f6, animationSpec, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: panBy-d-4ec7I, reason: not valid java name */
    public static final Object m226panByd4ec7I(@NotNull TransformableState transformableState, long j10, @NotNull Continuation<? super Unit> continuation) {
        Object objA = t.a(transformableState, null, new d(j10, null), continuation, 1, null);
        return objA == ek.a.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    @Composable
    @NotNull
    public static final TransformableState rememberTransformableState(@NotNull Function3<? super Float, ? super Offset, ? super Float, Unit> onTransformation, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(onTransformation, "onTransformation");
        composer.startReplaceableGroup(1681419281);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1681419281, i10, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:114)");
        }
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onTransformation, composer, i10 & 14);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = TransformableState(new e(stateRememberUpdatedState));
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        TransformableState transformableState = (TransformableState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transformableState;
    }

    @Nullable
    public static final Object rotateBy(@NotNull TransformableState transformableState, float f6, @NotNull Continuation<? super Unit> continuation) {
        Object objA = t.a(transformableState, null, new f(f6, null), continuation, 1, null);
        return objA == ek.a.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    @Nullable
    public static final Object stopTransformation(@NotNull TransformableState transformableState, @NotNull MutatePriority mutatePriority, @NotNull Continuation<? super Unit> continuation) {
        Object objTransform = transformableState.transform(mutatePriority, new g(2, null), continuation);
        return objTransform == ek.a.getCOROUTINE_SUSPENDED() ? objTransform : Unit.INSTANCE;
    }

    public static /* synthetic */ Object stopTransformation$default(TransformableState transformableState, MutatePriority mutatePriority, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopTransformation(transformableState, mutatePriority, continuation);
    }

    @Nullable
    public static final Object zoomBy(@NotNull TransformableState transformableState, float f6, @NotNull Continuation<? super Unit> continuation) {
        Object objA = t.a(transformableState, null, new h(f6, null), continuation, 1, null);
        return objA == ek.a.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }
}
