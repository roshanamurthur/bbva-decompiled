package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SlideModifier extends LayoutModifierWithPassThroughIntrinsics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> f2810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final State<Slide> f2811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final State<Slide> f2812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final b f2813d;

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Placeable f2815q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f2816r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable, long j10) {
            super(1);
            this.f2815q0 = placeable;
            this.f2816r0 = j10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            SlideModifier slideModifier = SlideModifier.this;
            Placeable.PlacementScope.m3614placeWithLayeraW9wM$default(layout, this.f2815q0, slideModifier.f2810a.animate(slideModifier.f2813d, new m(slideModifier, this.f2816r0)).getValue().getF18312a(), 0.0f, null, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class b extends Lambda implements Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final FiniteAnimationSpec<IntOffset> invoke(Transition.Segment<EnterExitState> segment) {
            FiniteAnimationSpec<IntOffset> animationSpec;
            FiniteAnimationSpec<IntOffset> animationSpec2;
            Transition.Segment<EnterExitState> segment2 = segment;
            Intrinsics.checkNotNullParameter(segment2, "$this$null");
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            boolean zIsTransitioningTo = segment2.isTransitioningTo(enterExitState, enterExitState2);
            SlideModifier slideModifier = SlideModifier.this;
            if (zIsTransitioningTo) {
                Slide value = slideModifier.f2811b.getValue();
                return (value == null || (animationSpec2 = value.getAnimationSpec()) == null) ? EnterExitTransitionKt.f2740d : animationSpec2;
            }
            if (!segment2.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                return EnterExitTransitionKt.f2740d;
            }
            Slide value2 = slideModifier.f2812c.getValue();
            return (value2 == null || (animationSpec = value2.getAnimationSpec()) == null) ? EnterExitTransitionKt.f2740d : animationSpec;
        }
    }

    public SlideModifier(@NotNull Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> lazyAnimation, @NotNull State<Slide> slideIn, @NotNull State<Slide> slideOut) {
        Intrinsics.checkNotNullParameter(lazyAnimation, "lazyAnimation");
        Intrinsics.checkNotNullParameter(slideIn, "slideIn");
        Intrinsics.checkNotNullParameter(slideOut, "slideOut");
        this.f2810a = lazyAnimation;
        this.f2811b = slideIn;
        this.f2812c = slideOut;
        this.f2813d = new b();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo47measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(j10);
        return MeasureScope.CC.q(measure, placeableMo3575measureBRTryo0.getWidth(), placeableMo3575measureBRTryo0.getHeight(), null, new a(placeableMo3575measureBRTryo0, IntSizeKt.IntSize(placeableMo3575measureBRTryo0.getWidth(), placeableMo3575measureBRTryo0.getHeight())), 4, null);
    }
}
