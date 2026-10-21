package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.e;
import v.f;
import v.g;
import v.h;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BN\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b\u0012\u0006\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010#\u001a\u00020\"ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001f\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\nJ\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\"\u0010\u0018\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "initialVelocity", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "onSettlingDistanceUpdated", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Landroidx/compose/ui/MotionDurationScale;", "h", "Landroidx/compose/ui/MotionDurationScale;", "getMotionScaleDuration$foundation_release", "()Landroidx/compose/ui/MotionDurationScale;", "setMotionScaleDuration$foundation_release", "(Landroidx/compose/ui/MotionDurationScale;)V", "motionScaleDuration", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "snapLayoutInfoProvider", "Landroidx/compose/animation/core/AnimationSpec;", "lowVelocityAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "highVelocityAnimationSpec", "snapAnimationSpec", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Dp;", "shortSnapVelocityThreshold", "<init>", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/unit/Density;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
@SourceDebugExtension({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n1#1,531:1\n1#2:532\n528#3,4:533\n528#3,4:537\n528#3,4:541\n528#3,4:545\n528#3,4:549\n528#3,4:553\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n*L\n119#1:533,4\n147#1:537,4\n170#1:541,4\n187#1:545,4\n210#1:549,4\n213#1:553,4\n*E\n"})
public final class SnapFlingBehavior implements FlingBehavior {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SnapLayoutInfoProvider f4058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AnimationSpec<Float> f4059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DecayAnimationSpec<Float> f4060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final AnimationSpec<Float> f4061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Density f4062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f4063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f4064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public MotionDurationScale motionScaleDuration;

    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0}, l = {131}, m = "fling", n = {"onRemainingScrollOffsetUpdate"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Function1 f4066p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f4067q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f4069s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4067q0 = obj;
            this.f4069s0 |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.a(null, 0.0f, null, this);
        }
    }

    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", i = {}, l = {133, 135}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super v.a<Float, AnimationVector1D>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f4070p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f4071q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SnapFlingBehavior f4072r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ ScrollScope f4073s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function1<Float, Unit> f4074t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SnapFlingBehavior snapFlingBehavior, ScrollScope scrollScope, float f6, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f4071q0 = f6;
            this.f4072r0 = snapFlingBehavior;
            this.f4073s0 = scrollScope;
            this.f4074t0 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f4072r0, this.f4073s0, this.f4071q0, this.f4074t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super v.a<Float, AnimationVector1D>> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f4070p0;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return (v.a) obj;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (v.a) obj;
            }
            ResultKt.throwOnFailure(obj);
            float f6 = this.f4071q0;
            float fAbs = Math.abs(f6);
            SnapFlingBehavior snapFlingBehavior = this.f4072r0;
            float fAbs2 = Math.abs(snapFlingBehavior.f4064g);
            Function1<Float, Unit> function1 = this.f4074t0;
            ScrollScope scrollScope = this.f4073s0;
            if (fAbs <= fAbs2) {
                this.f4070p0 = 1;
                obj = SnapFlingBehavior.access$shortSnap(snapFlingBehavior, scrollScope, f6, function1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (v.a) obj;
            }
            this.f4070p0 = 2;
            obj = SnapFlingBehavior.access$longSnap(snapFlingBehavior, scrollScope, f6, function1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (v.a) obj;
        }
    }

    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    public static final class c extends Lambda implements Function1<Float, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f4075p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Float f6) {
            f6.floatValue();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {117}, m = "performFling", n = {}, s = {})
    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f4076p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f4078r0;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4076p0 = obj;
            this.f4078r0 |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.performFling(null, 0.0f, null, this);
        }
    }

    public SnapFlingBehavior() {
        throw null;
    }

    public SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, AnimationSpec lowVelocityAnimationSpec, DecayAnimationSpec highVelocityAnimationSpec, AnimationSpec snapAnimationSpec, Density density, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(snapLayoutInfoProvider, "snapLayoutInfoProvider");
        Intrinsics.checkNotNullParameter(lowVelocityAnimationSpec, "lowVelocityAnimationSpec");
        Intrinsics.checkNotNullParameter(highVelocityAnimationSpec, "highVelocityAnimationSpec");
        Intrinsics.checkNotNullParameter(snapAnimationSpec, "snapAnimationSpec");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f4058a = snapLayoutInfoProvider;
        this.f4059b = lowVelocityAnimationSpec;
        this.f4060c = highVelocityAnimationSpec;
        this.f4061d = snapAnimationSpec;
        this.f4062e = density;
        this.f4063f = f6;
        this.f4064g = density.mo415toPx0680j_4(f6);
        this.motionScaleDuration = ScrollableKt.getDefaultScrollMotionDurationScale();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object access$longSnap(SnapFlingBehavior snapFlingBehavior, ScrollScope scrollScope, float f6, Function1 function1, Continuation continuation) {
        e eVar;
        ScrollScope scrollScope2;
        SnapFlingBehavior snapFlingBehavior2;
        Function1 function2;
        Ref.FloatRef floatRef;
        snapFlingBehavior.getClass();
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i10 = eVar.v0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.v0 = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(snapFlingBehavior, continuation);
            }
        } else {
            eVar = new e(snapFlingBehavior, continuation);
        }
        e eVar2 = eVar;
        Object objB = eVar2.f93920t0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar2.v0;
        if (i11 != 0) {
            if (i11 == 1) {
                floatRef = eVar2.f93919s0;
                function2 = eVar2.f93918r0;
                ScrollScope scrollScope3 = eVar2.f93917q0;
                snapFlingBehavior2 = eVar2.f93916p0;
                ResultKt.throwOnFailure(objB);
                scrollScope2 = scrollScope3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objB);
            }
            return objB;
        }
        ResultKt.throwOnFailure(objB);
        float fSignum = Math.signum(f6) * Math.abs(snapFlingBehavior.f4058a.calculateApproachOffset(snapFlingBehavior.f4062e, f6));
        Ref.FloatRef floatRef2 = new Ref.FloatRef();
        floatRef2.element = fSignum;
        function1.invoke(Boxing.boxFloat(fSignum));
        f fVar = new f(floatRef2, function1);
        eVar2.f93916p0 = snapFlingBehavior;
        scrollScope2 = scrollScope;
        eVar2.f93917q0 = scrollScope2;
        eVar2.f93918r0 = function1;
        eVar2.f93919s0 = floatRef2;
        eVar2.v0 = 1;
        objB = snapFlingBehavior.b(scrollScope, fSignum, f6, fVar, eVar2);
        if (objB == coroutine_suspended) {
            return coroutine_suspended;
        }
        snapFlingBehavior2 = snapFlingBehavior;
        function2 = function1;
        floatRef = floatRef2;
        v.a aVar = (v.a) objB;
        float fFloatValue = ((Number) aVar.f93910a).floatValue();
        AnimationState<T, V> animationState = aVar.f93911b;
        floatRef.element = fFloatValue;
        AnimationState animationStateCopy$default = AnimationStateKt.copy$default((AnimationState) animationState, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
        AnimationSpec<Float> animationSpec = snapFlingBehavior2.f4061d;
        g gVar = new g(floatRef, function2);
        eVar2.f93916p0 = null;
        eVar2.f93917q0 = null;
        eVar2.f93918r0 = null;
        eVar2.f93919s0 = null;
        eVar2.v0 = 2;
        objB = SnapFlingBehaviorKt.access$animateSnap(scrollScope2, fFloatValue, fFloatValue, animationStateCopy$default, animationSpec, gVar, eVar2);
        if (objB == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objB;
    }

    public static final Object access$shortSnap(SnapFlingBehavior snapFlingBehavior, ScrollScope scrollScope, float f6, Function1 function1, Continuation continuation) {
        float fCalculateSnappingOffset = snapFlingBehavior.f4058a.calculateSnappingOffset(snapFlingBehavior.f4062e, 0.0f);
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = fCalculateSnappingOffset;
        return SnapFlingBehaviorKt.access$animateSnap(scrollScope, fCalculateSnappingOffset, fCalculateSnappingOffset, AnimationStateKt.AnimationState$default(0.0f, f6, 0L, 0L, false, 28, null), snapFlingBehavior.f4061d, new h(floatRef, function1), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ScrollScope scrollScope, float f6, Function1<? super Float, Unit> function1, Continuation<? super v.a<Float, AnimationVector1D>> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f4069s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f4069s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithContext = aVar.f4067q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f4069s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            MotionDurationScale motionDurationScale = this.motionScaleDuration;
            b bVar = new b(this, scrollScope, f6, function1, null);
            aVar.f4066p0 = function1;
            aVar.f4069s0 = 1;
            objWithContext = BuildersKt.withContext(motionDurationScale, bVar, aVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = aVar.f4066p0;
            ResultKt.throwOnFailure(objWithContext);
        }
        v.a aVar2 = (v.a) objWithContext;
        function1.invoke(Boxing.boxFloat(0.0f));
        return aVar2;
    }

    public final Object b(ScrollScope scrollScope, float f6, float f10, Function1<? super Float, Unit> function1, Continuation<? super v.a<Float, AnimationVector1D>> continuation) {
        DecayAnimationSpec<Float> decayAnimationSpec = this.f4060c;
        float fCalculateTargetValue = DecayAnimationSpecKt.calculateTargetValue(decayAnimationSpec, 0.0f, f10);
        SnapLayoutInfoProvider snapLayoutInfoProvider = this.f4058a;
        Density density = this.f4062e;
        return SnapFlingBehaviorKt.access$approach(scrollScope, f6, f10, Math.abs(fCalculateTargetValue) >= Math.abs(f6) + snapLayoutInfoProvider.calculateSnapStepSize(density) ? new v.c(decayAnimationSpec) : new v.d(this.f4059b, snapLayoutInfoProvider, density), this.f4058a, this.f4062e, function1, continuation);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) other;
        return Intrinsics.areEqual(snapFlingBehavior.f4061d, this.f4061d) && Intrinsics.areEqual(snapFlingBehavior.f4060c, this.f4060c) && Intrinsics.areEqual(snapFlingBehavior.f4059b, this.f4059b) && Intrinsics.areEqual(snapFlingBehavior.f4058a, this.f4058a) && Intrinsics.areEqual(snapFlingBehavior.f4062e, this.f4062e) && Dp.m4394equalsimpl0(snapFlingBehavior.f4063f, this.f4063f);
    }

    @NotNull
    /* JADX INFO: renamed from: getMotionScaleDuration$foundation_release, reason: from getter */
    public final MotionDurationScale getMotionScaleDuration() {
        return this.motionScaleDuration;
    }

    public int hashCode() {
        return Dp.m4395hashCodeimpl(this.f4063f) + ((this.f4062e.hashCode() + ((this.f4058a.hashCode() + ((this.f4059b.hashCode() + ((this.f4060c.hashCode() + (this.f4061d.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    @Nullable
    public Object performFling(@NotNull ScrollScope scrollScope, float f6, @NotNull Continuation<? super Float> continuation) {
        return performFling(scrollScope, f6, c.f4075p0, continuation);
    }

    public final void setMotionScaleDuration$foundation_release(@NotNull MotionDurationScale motionDurationScale) {
        Intrinsics.checkNotNullParameter(motionDurationScale, "<set-?>");
        this.motionScaleDuration = motionDurationScale;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object performFling(@NotNull ScrollScope scrollScope, float f6, @NotNull Function1<? super Float, Unit> function1, @NotNull Continuation<? super Float> continuation) {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i10 = dVar.f4078r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f4078r0 = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objA = dVar.f4076p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = dVar.f4078r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objA);
            dVar.f4078r0 = 1;
            objA = a(scrollScope, f6, function1, dVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objA);
        }
        v.a aVar = (v.a) objA;
        return Boxing.boxFloat(((Number) aVar.f93910a).floatValue() != 0.0f ? ((Number) aVar.f93911b.getVelocity()).floatValue() : 0.0f);
    }

    public /* synthetic */ SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, AnimationSpec animationSpec2, Density density, float f6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(snapLayoutInfoProvider, animationSpec, decayAnimationSpec, animationSpec2, density, (i10 & 32) != 0 ? SnapFlingBehaviorKt.getMinFlingVelocityDp() : f6, null);
    }
}
