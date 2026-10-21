package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/ExpandShrinkModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,1177:1\n1#2:1178\n79#3:1179\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/ExpandShrinkModifier\n*L\n1149#1:1179\n*E\n"})
public final class ExpandShrinkModifier extends LayoutModifierWithPassThroughIntrinsics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> f2772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> f2773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final State<ChangeSize> f2774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final State<ChangeSize> f2775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final State<Alignment> f2776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Alignment f2777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final e f2778g;

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

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f2779p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f2780q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f2781r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable, long j10, long j11) {
            super(1);
            this.f2779p0 = placeable;
            this.f2780q0 = j10;
            this.f2781r0 = j11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable placeable = this.f2779p0;
            long j10 = this.f2780q0;
            int iM4507getXimpl = IntOffset.m4507getXimpl(j10);
            long j11 = this.f2781r0;
            Placeable.PlacementScope.place$default(layout, placeable, iM4507getXimpl + IntOffset.m4507getXimpl(j11), IntOffset.m4508getYimpl(j11) + IntOffset.m4508getYimpl(j10), 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class b extends Lambda implements Function1<EnterExitState, IntSize> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f2783q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10) {
            super(1);
            this.f2783q0 = j10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final IntSize invoke(EnterExitState enterExitState) {
            EnterExitState targetState = enterExitState;
            Intrinsics.checkNotNullParameter(targetState, "it");
            ExpandShrinkModifier expandShrinkModifier = ExpandShrinkModifier.this;
            expandShrinkModifier.getClass();
            Intrinsics.checkNotNullParameter(targetState, "targetState");
            ChangeSize value = expandShrinkModifier.f2774c.getValue();
            long j10 = this.f2783q0;
            long f18319a = value != null ? value.getSize().invoke(IntSize.m4541boximpl(j10)).getF18319a() : j10;
            ChangeSize value2 = expandShrinkModifier.f2775d.getValue();
            long f18319a2 = value2 != null ? value2.getSize().invoke(IntSize.m4541boximpl(j10)).getF18319a() : j10;
            int i10 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    j10 = f18319a;
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j10 = f18319a2;
                }
            }
            return IntSize.m4541boximpl(j10);
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class c extends Lambda implements Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f2784p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final FiniteAnimationSpec<IntOffset> invoke(Transition.Segment<EnterExitState> segment) {
            Transition.Segment<EnterExitState> animate = segment;
            Intrinsics.checkNotNullParameter(animate, "$this$animate");
            return EnterExitTransitionKt.f2740d;
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class d extends Lambda implements Function1<EnterExitState, IntOffset> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f2786q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j10) {
            super(1);
            this.f2786q0 = j10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final IntOffset invoke(EnterExitState enterExitState) {
            int i10;
            long jM4517getZeronOccac;
            EnterExitState targetState = enterExitState;
            Intrinsics.checkNotNullParameter(targetState, "it");
            long j10 = this.f2786q0;
            ExpandShrinkModifier expandShrinkModifier = ExpandShrinkModifier.this;
            expandShrinkModifier.getClass();
            Intrinsics.checkNotNullParameter(targetState, "targetState");
            if (expandShrinkModifier.f2777f == null) {
                jM4517getZeronOccac = IntOffset.INSTANCE.m4517getZeronOccac();
            } else {
                State<Alignment> state = expandShrinkModifier.f2776e;
                if (state.getValue() == null || Intrinsics.areEqual(expandShrinkModifier.f2777f, state.getValue()) || (i10 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()]) == 1 || i10 == 2) {
                    jM4517getZeronOccac = IntOffset.INSTANCE.m4517getZeronOccac();
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ChangeSize value = expandShrinkModifier.f2775d.getValue();
                    if (value != null) {
                        long f18319a = value.getSize().invoke(IntSize.m4541boximpl(j10)).getF18319a();
                        Alignment value2 = state.getValue();
                        Intrinsics.checkNotNull(value2);
                        Alignment alignment = value2;
                        LayoutDirection layoutDirection = LayoutDirection.Ltr;
                        long jMo2184alignKFBX0sM = alignment.mo2184alignKFBX0sM(j10, f18319a, layoutDirection);
                        Alignment alignment2 = expandShrinkModifier.f2777f;
                        Intrinsics.checkNotNull(alignment2);
                        long jMo2184alignKFBX0sM2 = alignment2.mo2184alignKFBX0sM(j10, f18319a, layoutDirection);
                        jM4517getZeronOccac = IntOffsetKt.IntOffset(IntOffset.m4507getXimpl(jMo2184alignKFBX0sM) - IntOffset.m4507getXimpl(jMo2184alignKFBX0sM2), IntOffset.m4508getYimpl(jMo2184alignKFBX0sM) - IntOffset.m4508getYimpl(jMo2184alignKFBX0sM2));
                    } else {
                        jM4517getZeronOccac = IntOffset.INSTANCE.m4517getZeronOccac();
                    }
                }
            }
            return IntOffset.m4498boximpl(jM4517getZeronOccac);
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class e extends Lambda implements Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<EnterExitState> segment) {
            Transition.Segment<EnterExitState> segment2 = segment;
            Intrinsics.checkNotNullParameter(segment2, "$this$null");
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            boolean zIsTransitioningTo = segment2.isTransitioningTo(enterExitState, enterExitState2);
            FiniteAnimationSpec<IntSize> animationSpec = null;
            ExpandShrinkModifier expandShrinkModifier = ExpandShrinkModifier.this;
            if (zIsTransitioningTo) {
                ChangeSize value = expandShrinkModifier.f2774c.getValue();
                if (value != null) {
                    animationSpec = value.getAnimationSpec();
                }
            } else if (segment2.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                ChangeSize value2 = expandShrinkModifier.f2775d.getValue();
                if (value2 != null) {
                    animationSpec = value2.getAnimationSpec();
                }
            } else {
                animationSpec = EnterExitTransitionKt.f2741e;
            }
            return animationSpec == null ? EnterExitTransitionKt.f2741e : animationSpec;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandShrinkModifier(@NotNull Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation, @NotNull Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation, @NotNull State<ChangeSize> expand, @NotNull State<ChangeSize> shrink, @NotNull State<? extends Alignment> alignment) {
        Intrinsics.checkNotNullParameter(sizeAnimation, "sizeAnimation");
        Intrinsics.checkNotNullParameter(offsetAnimation, "offsetAnimation");
        Intrinsics.checkNotNullParameter(expand, "expand");
        Intrinsics.checkNotNullParameter(shrink, "shrink");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f2772a = sizeAnimation;
        this.f2773b = offsetAnimation;
        this.f2774c = expand;
        this.f2775d = shrink;
        this.f2776e = alignment;
        this.f2778g = new e();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo47measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(j10);
        long jIntSize = IntSizeKt.IntSize(placeableMo3575measureBRTryo0.getWidth(), placeableMo3575measureBRTryo0.getHeight());
        long f18319a = this.f2772a.animate(this.f2778g, new b(jIntSize)).getValue().getF18319a();
        long f18312a = this.f2773b.animate(c.f2784p0, new d(jIntSize)).getValue().getF18312a();
        Alignment alignment = this.f2777f;
        return MeasureScope.CC.q(measure, IntSize.m4549getWidthimpl(f18319a), IntSize.m4548getHeightimpl(f18319a), null, new a(placeableMo3575measureBRTryo0, alignment != null ? alignment.mo2184alignKFBX0sM(jIntSize, f18319a, LayoutDirection.Ltr) : IntOffset.INSTANCE.m4517getZeronOccac(), f18312a), 4, null);
    }
}
