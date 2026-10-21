package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/SnapFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "initialVelocity", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Landroidx/compose/animation/core/DecayAnimationSpec;", "decayAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/unit/Density;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/material3/SnapFlingBehavior\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,356:1\n1#2:357\n154#3:358\n132#4,3:359\n33#4,4:362\n135#4,2:366\n38#4:368\n137#4:369\n33#4,6:370\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/material3/SnapFlingBehavior\n*L\n346#1:358\n71#1:359,3\n71#1:362,4\n71#1:366,2\n71#1:368\n71#1:369\n199#1:370,6\n*E\n"})
public final class SnapFlingBehavior implements FlingBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyListState f11570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DecayAnimationSpec<Float> f11571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AnimationSpec<Float> f11572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Density f11573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f11574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SnapFlingBehavior$motionScaleDuration$1 f11575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f11576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f11577h;

    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @DebugMetadata(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0, 0, 0}, l = {261}, m = "animateDecay", n = {"animationState", "previousValue", "targetOffset"}, s = {"L$0", "L$1", "F$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public float f11578p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public AnimationState f11579q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Ref.FloatRef f11580r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f11581s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f11583u0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11581s0 = obj;
            this.f11583u0 |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.a(null, 0.0f, null, null, this);
        }
    }

    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    public static final class b extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f11584p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SnapFlingBehavior f11585q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f11586r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ ScrollScope f11587s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f6, ScrollScope scrollScope, SnapFlingBehavior snapFlingBehavior, Ref.FloatRef floatRef) {
            super(1);
            this.f11584p0 = f6;
            this.f11585q0 = snapFlingBehavior;
            this.f11586r0 = floatRef;
            this.f11587s0 = scrollScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            AnimationScope<Float, AnimationVector1D> animateDecay = animationScope;
            Intrinsics.checkNotNullParameter(animateDecay, "$this$animateDecay");
            float fAbs = Math.abs(animateDecay.getValue().floatValue());
            float f6 = this.f11584p0;
            float fAbs2 = Math.abs(f6);
            ScrollScope scrollScope = this.f11587s0;
            Ref.FloatRef floatRef = this.f11586r0;
            if (fAbs >= fAbs2) {
                SnapFlingBehavior.access$animateDecay$consumeDelta(animateDecay, scrollScope, SnapFlingBehavior.access$coerceToTarget(this.f11585q0, animateDecay.getValue().floatValue(), f6) - floatRef.element);
                animateDecay.cancelAnimation();
            } else {
                SnapFlingBehavior.access$animateDecay$consumeDelta(animateDecay, scrollScope, animateDecay.getValue().floatValue() - floatRef.element);
                floatRef.element = animateDecay.getValue().floatValue();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @DebugMetadata(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0, 0, 0, 0, 0}, l = {299}, m = "animateSnap", n = {"this", "animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, s = {"L$0", "L$1", "L$2", "F$0", "F$1"})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SnapFlingBehavior f11588p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public AnimationState f11589q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Ref.FloatRef f11590r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public float f11591s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public float f11592t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public /* synthetic */ Object f11593u0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f11594w0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11593u0 = obj;
            this.f11594w0 |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.b(null, 0.0f, 0.0f, null, null, this);
        }
    }

    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    public static final class d extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SnapFlingBehavior f11595p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f11596q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f11597r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ ScrollScope f11598s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f6, ScrollScope scrollScope, SnapFlingBehavior snapFlingBehavior, Ref.FloatRef floatRef) {
            super(1);
            this.f11595p0 = snapFlingBehavior;
            this.f11596q0 = f6;
            this.f11597r0 = floatRef;
            this.f11598s0 = scrollScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            AnimationScope<Float, AnimationVector1D> animateTo = animationScope;
            Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
            float fAccess$coerceToTarget = SnapFlingBehavior.access$coerceToTarget(this.f11595p0, animateTo.getValue().floatValue(), this.f11596q0);
            Ref.FloatRef floatRef = this.f11597r0;
            float f6 = fAccess$coerceToTarget - floatRef.element;
            float fScrollBy = this.f11598s0.scrollBy(f6);
            if (Math.abs(f6 - fScrollBy) > 0.5f || fAccess$coerceToTarget != animateTo.getValue().floatValue()) {
                animateTo.cancelAnimation();
            }
            floatRef.element += fScrollBy;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @DebugMetadata(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {95}, m = "fling", n = {}, s = {})
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f11599p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f11601r0;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11599p0 = obj;
            this.f11601r0 |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.d(null, 0.0f, this);
        }
    }

    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @DebugMetadata(c = "androidx.compose.material3.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", i = {}, l = {97, 99}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super l0.c<Float, AnimationVector1D>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f11602p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f11603q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SnapFlingBehavior f11604r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ ScrollScope f11605s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(SnapFlingBehavior snapFlingBehavior, ScrollScope scrollScope, float f6, Continuation continuation) {
            super(2, continuation);
            this.f11603q0 = f6;
            this.f11604r0 = snapFlingBehavior;
            this.f11605s0 = scrollScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.f11604r0, this.f11605s0, this.f11603q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super l0.c<Float, AnimationVector1D>> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f11602p0;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return (l0.c) obj;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (l0.c) obj;
            }
            ResultKt.throwOnFailure(obj);
            float f6 = this.f11603q0;
            float fAbs = Math.abs(f6);
            SnapFlingBehavior snapFlingBehavior = this.f11604r0;
            float fAbs2 = Math.abs(snapFlingBehavior.f11574e);
            ScrollScope scrollScope = this.f11605s0;
            if (fAbs <= fAbs2) {
                this.f11602p0 = 1;
                obj = SnapFlingBehavior.access$shortSnap(snapFlingBehavior, scrollScope, f6, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (l0.c) obj;
            }
            this.f11602p0 = 2;
            obj = SnapFlingBehavior.access$longSnap(snapFlingBehavior, scrollScope, f6, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (l0.c) obj;
        }
    }

    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @DebugMetadata(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {83}, m = "performFling", n = {}, s = {})
    public static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f11606p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f11608r0;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11606p0 = obj;
            this.f11608r0 |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.performFling(null, 0.0f, this);
        }
    }

    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @DebugMetadata(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0}, l = {154}, m = "runApproach", n = {"this"}, s = {"L$0"})
    public static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SnapFlingBehavior f11609p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f11610q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f11612s0;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11610q0 = obj;
            this.f11612s0 |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.e(null, 0.0f, 0.0f, this);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.material3.SnapFlingBehavior$motionScaleDuration$1] */
    public SnapFlingBehavior(@NotNull LazyListState lazyListState, @NotNull DecayAnimationSpec<Float> decayAnimationSpec, @NotNull AnimationSpec<Float> snapAnimationSpec, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(decayAnimationSpec, "decayAnimationSpec");
        Intrinsics.checkNotNullParameter(snapAnimationSpec, "snapAnimationSpec");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f11570a = lazyListState;
        this.f11571b = decayAnimationSpec;
        this.f11572c = snapAnimationSpec;
        this.f11573d = density;
        this.f11574e = density.mo415toPx0680j_4(this.f11577h);
        this.f11575f = new MotionDurationScale() { // from class: androidx.compose.material3.SnapFlingBehavior$motionScaleDuration$1
            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public <R> R fold(R r3, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
                return (R) MotionDurationScale.DefaultImpls.fold(this, r3, function2);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            @Nullable
            public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
                return (E) MotionDurationScale.DefaultImpls.get(this, key);
            }

            @Override // androidx.compose.ui.MotionDurationScale, kotlin.coroutines.CoroutineContext.Element
            public final /* synthetic */ CoroutineContext.Key getKey() {
                return u0.h.a(this);
            }

            @Override // androidx.compose.ui.MotionDurationScale
            public float getScaleFactor() {
                return this.f11613p0.f11576g;
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            @NotNull
            public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
                return MotionDurationScale.DefaultImpls.minusKey(this, key);
            }

            @Override // kotlin.coroutines.CoroutineContext
            @NotNull
            public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
                return MotionDurationScale.DefaultImpls.plus(this, coroutineContext);
            }
        };
        this.f11576g = 1.0f;
        this.f11577h = Dp.m4389constructorimpl(400);
    }

    public static final void access$animateDecay$consumeDelta(AnimationScope animationScope, ScrollScope scrollScope, float f6) {
        if (Math.abs(f6 - scrollScope.scrollBy(f6)) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }

    public static final float access$coerceToTarget(SnapFlingBehavior snapFlingBehavior, float f6, float f10) {
        snapFlingBehavior.getClass();
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return f10 > 0.0f ? kotlin.ranges.c.coerceAtMost(f6, f10) : kotlin.ranges.c.coerceAtLeast(f6, f10);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object access$longSnap(SnapFlingBehavior snapFlingBehavior, ScrollScope scrollScope, float f6, Continuation continuation) {
        l0.c4 c4Var;
        float size;
        SnapFlingBehavior snapFlingBehavior2;
        ScrollScope scrollScope2;
        snapFlingBehavior.getClass();
        if (continuation instanceof l0.c4) {
            c4Var = (l0.c4) continuation;
            int i10 = c4Var.f82481t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4Var.f82481t0 = i10 - Integer.MIN_VALUE;
            } else {
                c4Var = new l0.c4(snapFlingBehavior, continuation);
            }
        } else {
            c4Var = new l0.c4(snapFlingBehavior, continuation);
        }
        l0.c4 c4Var2 = c4Var;
        Object objE = c4Var2.f82479r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = c4Var2.f82481t0;
        if (i11 != 0) {
            if (i11 == 1) {
                ScrollScope scrollScope3 = c4Var2.f82478q0;
                SnapFlingBehavior snapFlingBehavior3 = c4Var2.f82477p0;
                ResultKt.throwOnFailure(objE);
                scrollScope2 = scrollScope3;
                snapFlingBehavior2 = snapFlingBehavior3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objE);
            }
            return objE;
        }
        ResultKt.throwOnFailure(objE);
        float fAbs = Math.abs(DecayAnimationSpecKt.calculateTargetValue(snapFlingBehavior.f11571b, 0.0f, f6));
        LazyListState lazyListState = snapFlingBehavior.f11570a;
        if (!lazyListState.getLayoutInfo().getVisibleItemsInfo().isEmpty()) {
            List<LazyListItemInfo> visibleItemsInfo = lazyListState.getLayoutInfo().getVisibleItemsInfo();
            int size2 = visibleItemsInfo.size();
            int size3 = 0;
            for (int i12 = 0; i12 < size2; i12++) {
                size3 += visibleItemsInfo.get(i12).getSize();
            }
            size = size3 / lazyListState.getLayoutInfo().getVisibleItemsInfo().size();
        } else {
            size = 0.0f;
        }
        float fCoerceAtLeast = kotlin.ranges.c.coerceAtLeast(fAbs - size, 0.0f);
        if (fCoerceAtLeast != 0.0f) {
            fCoerceAtLeast *= Math.signum(f6);
        }
        c4Var2.f82477p0 = snapFlingBehavior;
        c4Var2.f82478q0 = scrollScope;
        c4Var2.f82481t0 = 1;
        objE = snapFlingBehavior.e(scrollScope, fCoerceAtLeast, f6, c4Var2);
        if (objE == coroutine_suspended) {
            return coroutine_suspended;
        }
        snapFlingBehavior2 = snapFlingBehavior;
        scrollScope2 = scrollScope;
        l0.c cVar = (l0.c) objE;
        float fFloatValue = ((Number) cVar.f82460a).floatValue();
        AnimationState<Float, AnimationVector1D> animationStateCopy$default = AnimationStateKt.copy$default((AnimationState) cVar.f82461b, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
        AnimationSpec<Float> animationSpec = snapFlingBehavior2.f11572c;
        c4Var2.f82477p0 = null;
        c4Var2.f82478q0 = null;
        c4Var2.f82481t0 = 2;
        objE = snapFlingBehavior2.b(scrollScope2, fFloatValue, fFloatValue, animationStateCopy$default, animationSpec, c4Var2);
        if (objE == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objE;
    }

    public static final Object access$shortSnap(SnapFlingBehavior snapFlingBehavior, ScrollScope scrollScope, float f6, Continuation continuation) {
        float fC = c(0.0f, snapFlingBehavior.f11570a);
        return snapFlingBehavior.b(scrollScope, fC, fC, AnimationStateKt.AnimationState$default(0.0f, f6, 0L, 0L, false, 28, null), snapFlingBehavior.f11572c, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    public static float c(float f6, LazyListState lazyListState) {
        LazyListLayoutInfo layoutInfo = lazyListState.getLayoutInfo();
        List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        float f10 = Float.POSITIVE_INFINITY;
        float f11 = Float.NEGATIVE_INFINITY;
        for (int i10 = 0; i10 < size; i10++) {
            LazyListItemInfo lazyListItemInfo = visibleItemsInfo.get(i10);
            float f12 = 2;
            float offset = lazyListItemInfo.getOffset() - (((((layoutInfo.getOrientation() == Orientation.Vertical ? IntSize.m4548getHeightimpl(layoutInfo.mo367getViewportSizeYbymL2g()) : IntSize.m4549getWidthimpl(layoutInfo.mo367getViewportSizeYbymL2g())) - layoutInfo.getBeforeContentPadding()) - layoutInfo.getAfterContentPadding()) / f12) - (lazyListItemInfo.getSize() / f12));
            if (offset <= 0.0f && offset > f11) {
                f11 = offset;
            }
            if (offset >= 0.0f && offset < f10) {
                f10 = offset;
            }
        }
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = ok.e.rangeTo(f11, f10);
        Intrinsics.checkNotNullParameter(closedFloatingPointRangeRangeTo, "<this>");
        float fFloatValue = closedFloatingPointRangeRangeTo.getStart().floatValue();
        Intrinsics.checkNotNullParameter(closedFloatingPointRangeRangeTo, "<this>");
        float fFloatValue2 = closedFloatingPointRangeRangeTo.getEndInclusive().floatValue();
        float fSignum = Math.signum(f6);
        if (fSignum == 0.0f) {
            if (Math.abs(fFloatValue2) <= Math.abs(fFloatValue)) {
                fFloatValue = fFloatValue2;
            }
        } else if (fSignum == 1.0f) {
            fFloatValue = fFloatValue2;
        } else if (fSignum != -1.0f) {
            fFloatValue = 0.0f;
        }
        if (fFloatValue == Float.POSITIVE_INFINITY || fFloatValue == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return fFloatValue;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ScrollScope scrollScope, float f6, AnimationState<Float, AnimationVector1D> animationState, DecayAnimationSpec<Float> decayAnimationSpec, Continuation<? super l0.c<Float, AnimationVector1D>> continuation) {
        a aVar;
        Ref.FloatRef floatRef;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f11583u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f11583u0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f11581s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f11583u0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            boolean z10 = animationState.getVelocity().floatValue() == 0.0f;
            b bVar = new b(f6, scrollScope, this, floatRef2);
            aVar.f11579q0 = animationState;
            aVar.f11580r0 = floatRef2;
            aVar.f11578p0 = f6;
            aVar.f11583u0 = 1;
            if (SuspendAnimationKt.animateDecay(animationState, decayAnimationSpec, !z10, bVar, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatRef = floatRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f6 = aVar.f11578p0;
            floatRef = aVar.f11580r0;
            animationState = aVar.f11579q0;
            ResultKt.throwOnFailure(obj);
        }
        return new l0.c(Boxing.boxFloat(f6 - floatRef.element), animationState);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object b(ScrollScope scrollScope, float f6, float f10, AnimationState<Float, AnimationVector1D> animationState, AnimationSpec<Float> animationSpec, Continuation<? super l0.c<Float, AnimationVector1D>> continuation) {
        c cVar;
        float f11;
        SnapFlingBehavior snapFlingBehavior;
        Ref.FloatRef floatRef;
        float f12;
        AnimationState<Float, AnimationVector1D> animationState2;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f11594w0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f11594w0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f11593u0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar2.f11594w0;
        float fCoerceAtMost = 0.0f;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            float fFloatValue = animationState.getVelocity().floatValue();
            Float fBoxFloat = Boxing.boxFloat(f6);
            boolean z10 = animationState.getVelocity().floatValue() == 0.0f;
            d dVar = new d(f10, scrollScope, this, floatRef2);
            cVar2.f11588p0 = this;
            cVar2.f11589q0 = animationState;
            cVar2.f11590r0 = floatRef2;
            f11 = f6;
            cVar2.f11591s0 = f11;
            cVar2.f11592t0 = fFloatValue;
            cVar2.f11594w0 = 1;
            if (SuspendAnimationKt.animateTo(animationState, fBoxFloat, animationSpec, !z10, dVar, cVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            snapFlingBehavior = this;
            floatRef = floatRef2;
            f12 = fFloatValue;
            animationState2 = animationState;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f12 = cVar2.f11592t0;
            float f13 = cVar2.f11591s0;
            floatRef = cVar2.f11590r0;
            AnimationState<Float, AnimationVector1D> animationState3 = cVar2.f11589q0;
            snapFlingBehavior = cVar2.f11588p0;
            ResultKt.throwOnFailure(obj);
            f11 = f13;
            animationState2 = animationState3;
        }
        float fFloatValue2 = animationState2.getVelocity().floatValue();
        snapFlingBehavior.getClass();
        if (f12 != 0.0f) {
            fCoerceAtMost = f12 > 0.0f ? kotlin.ranges.c.coerceAtMost(fFloatValue2, f12) : kotlin.ranges.c.coerceAtLeast(fFloatValue2, f12);
        }
        return new l0.c(Boxing.boxFloat(f11 - floatRef.element), AnimationStateKt.copy$default((AnimationState) animationState2, 0.0f, fCoerceAtMost, 0L, 0L, false, 29, (Object) null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ScrollScope scrollScope, float f6, Continuation<? super l0.c<Float, AnimationVector1D>> continuation) {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i10 = eVar.f11601r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f11601r0 = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objWithContext = eVar.f11599p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar.f11601r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            f fVar = new f(this, scrollScope, f6, null);
            eVar.f11601r0 = 1;
            objWithContext = BuildersKt.withContext(this.f11575f, fVar, eVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return (l0.c) objWithContext;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object e(ScrollScope scrollScope, float f6, float f10, Continuation<? super l0.c<Float, AnimationVector1D>> continuation) {
        h hVar;
        SnapFlingBehavior snapFlingBehavior;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i10 = hVar.f11612s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f11612s0 = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        h hVar2 = hVar;
        Object objA = hVar2.f11610q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = hVar2.f11612s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objA);
            AnimationState<Float, AnimationVector1D> animationStateAnimationState$default = AnimationStateKt.AnimationState$default(0.0f, f10, 0L, 0L, false, 28, null);
            DecayAnimationSpec<Float> decayAnimationSpec = this.f11571b;
            hVar2.f11609p0 = this;
            hVar2.f11612s0 = 1;
            objA = a(scrollScope, f6, animationStateAnimationState$default, decayAnimationSpec, hVar2);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            snapFlingBehavior = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            snapFlingBehavior = hVar2.f11609p0;
            ResultKt.throwOnFailure(objA);
        }
        AnimationState<T, V> animationState = ((l0.c) objA).f82461b;
        return new l0.c(Boxing.boxFloat(c(((Number) animationState.getVelocity()).floatValue(), snapFlingBehavior.f11570a)), animationState);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) other;
        return Intrinsics.areEqual(snapFlingBehavior.f11572c, this.f11572c) && Intrinsics.areEqual(snapFlingBehavior.f11571b, this.f11571b) && Intrinsics.areEqual(snapFlingBehavior.f11570a, this.f11570a) && Intrinsics.areEqual(snapFlingBehavior.f11573d, this.f11573d);
    }

    public int hashCode() {
        return this.f11573d.hashCode() + ((this.f11570a.hashCode() + ((this.f11571b.hashCode() + (this.f11572c.hashCode() * 31)) * 31)) * 31);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    @Nullable
    public Object performFling(@NotNull ScrollScope scrollScope, float f6, @NotNull Continuation<? super Float> continuation) {
        g gVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i10 = gVar.f11608r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f11608r0 = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objD = gVar.f11606p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = gVar.f11608r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objD);
            gVar.f11608r0 = 1;
            objD = d(scrollScope, f6, gVar);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objD);
        }
        l0.c cVar = (l0.c) objD;
        return Boxing.boxFloat(((Number) cVar.f82460a).floatValue() != 0.0f ? ((Number) cVar.f82461b.getVelocity()).floatValue() : 0.0f);
    }
}
