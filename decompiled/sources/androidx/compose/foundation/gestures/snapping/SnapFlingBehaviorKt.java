package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import ek.a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.b;
import v.i;
import v.j;
import v.k;
import v.l;
import v.m;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a \u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0000\"\u001d\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "snapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "rememberSnapFlingBehavior", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "", "velocity", "lowerBound", "upperBound", "calculateFinalOffset", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getMinFlingVelocityDp", "()F", "MinFlingVelocityDp", "NoDistance", "NoVelocity", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,531:1\n528#1,4:543\n528#1,4:547\n76#2:532\n67#3,3:533\n66#3:536\n1097#4,6:537\n154#5:551\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n379#1:543,4\n503#1:547,4\n274#1:532\n276#1:533,3\n276#1:536\n276#1:537,6\n493#1:551\n*E\n"})
public final class SnapFlingBehaviorKt {
    public static final float NoDistance = 0.0f;
    public static final float NoVelocity = 0.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f4079a = Dp.m4389constructorimpl(400);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object access$animateDecay(ScrollScope scrollScope, float f6, AnimationState animationState, DecayAnimationSpec decayAnimationSpec, Function1 function1, Continuation continuation) {
        i iVar;
        Ref.FloatRef floatRef;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i10 = iVar.f93932t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f93932t0 = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object obj = iVar.f93931s0;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = iVar.f93932t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            boolean z10 = ((Number) animationState.getVelocity()).floatValue() == 0.0f;
            j jVar = new j(f6, floatRef2, scrollScope, function1);
            iVar.f93929q0 = animationState;
            iVar.f93930r0 = floatRef2;
            iVar.f93928p0 = f6;
            iVar.f93932t0 = 1;
            if (SuspendAnimationKt.animateDecay(animationState, decayAnimationSpec, !z10, jVar, iVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatRef = floatRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f6 = iVar.f93928p0;
            floatRef = iVar.f93930r0;
            animationState = iVar.f93929q0;
            ResultKt.throwOnFailure(obj);
        }
        return new v.a(Boxing.boxFloat(f6 - floatRef.element), animationState);
    }

    public static final void access$animateDecay$consumeDelta(AnimationScope animationScope, ScrollScope scrollScope, Function1 function1, float f6) {
        float fScrollBy = scrollScope.scrollBy(f6);
        function1.invoke(Float.valueOf(fScrollBy));
        if (Math.abs(f6 - fScrollBy) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object access$animateSnap(ScrollScope scrollScope, float f6, float f10, AnimationState animationState, AnimationSpec animationSpec, Function1 function1, Continuation continuation) {
        k kVar;
        float f11;
        Ref.FloatRef floatRef;
        float f12;
        AnimationState animationState2;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i10 = kVar.f93942u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f93942u0 = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        k kVar2 = kVar;
        Object obj = kVar2.f93941t0;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = kVar2.f93942u0;
        float fCoerceAtMost = 0.0f;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            float fFloatValue = ((Number) animationState.getVelocity()).floatValue();
            Float fBoxFloat = Boxing.boxFloat(f6);
            boolean z10 = ((Number) animationState.getVelocity()).floatValue() == 0.0f;
            l lVar = new l(f10, floatRef2, scrollScope, function1);
            kVar2.f93939r0 = animationState;
            kVar2.f93940s0 = floatRef2;
            f11 = f6;
            kVar2.f93937p0 = f11;
            kVar2.f93938q0 = fFloatValue;
            kVar2.f93942u0 = 1;
            if (SuspendAnimationKt.animateTo(animationState, fBoxFloat, animationSpec, !z10, lVar, kVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatRef = floatRef2;
            f12 = fFloatValue;
            animationState2 = animationState;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f12 = kVar2.f93938q0;
            float f13 = kVar2.f93937p0;
            floatRef = kVar2.f93940s0;
            AnimationState animationState3 = kVar2.f93939r0;
            ResultKt.throwOnFailure(obj);
            f11 = f13;
            animationState2 = animationState3;
        }
        float fFloatValue2 = ((Number) animationState2.getVelocity()).floatValue();
        if (f12 != 0.0f) {
            fCoerceAtMost = f12 > 0.0f ? c.coerceAtMost(fFloatValue2, f12) : c.coerceAtLeast(fFloatValue2, f12);
        }
        return new v.a(Boxing.boxFloat(f11 - floatRef.element), AnimationStateKt.copy$default(animationState2, 0.0f, fCoerceAtMost, 0L, 0L, false, 29, (Object) null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object access$approach(ScrollScope scrollScope, float f6, float f10, b bVar, SnapLayoutInfoProvider snapLayoutInfoProvider, Density density, Function1 function1, Continuation continuation) {
        m mVar;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i10 = mVar.f93950s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f93950s0 = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        m mVar2 = mVar;
        Object objA = mVar2.f93949r0;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = mVar2.f93950s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objA);
            Float fBoxFloat = Boxing.boxFloat(f6);
            Float fBoxFloat2 = Boxing.boxFloat(f10);
            mVar2.f93947p0 = snapLayoutInfoProvider;
            mVar2.f93948q0 = density;
            mVar2.f93950s0 = 1;
            objA = bVar.a(scrollScope, fBoxFloat, fBoxFloat2, function1, mVar2);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            density = mVar2.f93948q0;
            snapLayoutInfoProvider = mVar2.f93947p0;
            ResultKt.throwOnFailure(objA);
        }
        AnimationState<T, V> animationState = ((v.a) objA).f93911b;
        return new v.a(Boxing.boxFloat(snapLayoutInfoProvider.calculateSnappingOffset(density, ((Number) animationState.getVelocity()).floatValue())), animationState);
    }

    public static final float access$coerceToTarget(float f6, float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return f10 > 0.0f ? c.coerceAtMost(f6, f10) : c.coerceAtLeast(f6, f10);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public static final float calculateFinalOffset(float f6, float f10, float f11) {
        float fSignum = Math.signum(f6);
        if (fSignum == 0.0f) {
            if (Math.abs(f11) <= Math.abs(f10)) {
                f10 = f11;
            }
        } else if (fSignum == 1.0f) {
            f10 = f11;
        } else if (fSignum != -1.0f) {
            f10 = 0.0f;
        }
        if (f10 == Float.POSITIVE_INFINITY || f10 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return f10;
    }

    public static final float getMinFlingVelocityDp() {
        return f4079a;
    }

    @Composable
    @ExperimentalFoundationApi
    @NotNull
    public static final SnapFlingBehavior rememberSnapFlingBehavior(@NotNull SnapLayoutInfoProvider snapLayoutInfoProvider, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(snapLayoutInfoProvider, "snapLayoutInfoProvider");
        composer.startReplaceableGroup(-473984552);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-473984552, i10, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:270)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        DecayAnimationSpec decayAnimationSpecRememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(snapLayoutInfoProvider) | composer.changed(decayAnimationSpecRememberSplineBasedDecay) | composer.changed(density);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object snapFlingBehavior = new SnapFlingBehavior(snapLayoutInfoProvider, AnimationSpecKt.tween$default(0, 0, EasingKt.getLinearEasing(), 3, null), decayAnimationSpecRememberSplineBasedDecay, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), density, 0.0f, 32, null);
            composer.updateRememberedValue(snapFlingBehavior);
            objRememberedValue = snapFlingBehavior;
        }
        composer.endReplaceableGroup();
        SnapFlingBehavior snapFlingBehavior2 = (SnapFlingBehavior) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapFlingBehavior2;
    }
}
