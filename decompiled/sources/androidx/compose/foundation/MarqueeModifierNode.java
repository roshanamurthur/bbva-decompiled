package androidx.compose.foundation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import t.d0;

/* JADX INFO: compiled from: BasicMarquee.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifierNode\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,497:1\n75#2:498\n108#2,2:499\n75#2:501\n108#2,2:502\n81#3:504\n107#3,2:505\n81#3:507\n107#3,2:508\n81#3:510\n107#3,2:511\n81#3:513\n214#4,8:514\n261#4,8:522\n115#4,9:530\n269#4,3:539\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifierNode\n*L\n205#1:498\n205#1:499,2\n206#1:501\n206#1:502,2\n207#1:504\n207#1:505,2\n208#1:507\n208#1:508,2\n209#1:510\n209#1:511,2\n217#1:513\n311#1:514,8\n311#1:522,8\n321#1:530,9\n311#1:539,3\n*E\n"})
public final class MarqueeModifierNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, FocusEventModifierNode {
    public int H0;
    public int I0;
    public int J0;
    public float K0;

    @NotNull
    public final MutableIntState L0;

    @NotNull
    public final MutableIntState M0;

    @NotNull
    public final MutableState N0;

    @NotNull
    public final MutableState O0;

    @NotNull
    public final MutableState P0;

    @NotNull
    public final Animatable<Float, AnimationVector1D> Q0;

    @NotNull
    public final State R0;

    /* JADX INFO: compiled from: BasicMarquee.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: BasicMarquee.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f3422p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MarqueeModifierNode f3423q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable, MarqueeModifierNode marqueeModifierNode) {
            super(1);
            this.f3422p0 = placeable;
            this.f3423q0 = marqueeModifierNode;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable placeable = this.f3422p0;
            MarqueeModifierNode marqueeModifierNode = this.f3423q0;
            Placeable.PlacementScope.placeWithLayer$default(layout, placeable, mk.c.roundToInt(marqueeModifierNode.a() * (-marqueeModifierNode.Q0.getValue().floatValue())), 0, 0.0f, null, 12, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BasicMarquee.kt */
    public static final class b extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MarqueeSpacing f3424p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MarqueeModifierNode f3425q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MarqueeSpacing marqueeSpacing, MarqueeModifierNode marqueeModifierNode) {
            super(0);
            this.f3424p0 = marqueeSpacing;
            this.f3425q0 = marqueeModifierNode;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            MarqueeModifierNode marqueeModifierNode = this.f3425q0;
            return Integer.valueOf(this.f3424p0.calculateSpacing(DelegatableNodeKt.requireDensity(marqueeModifierNode), marqueeModifierNode.L0.getIntValue(), marqueeModifierNode.M0.getIntValue()));
        }
    }

    public MarqueeModifierNode(int i10, int i11, int i12, int i13, MarqueeSpacing spacing, float f6) {
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        this.H0 = i10;
        this.I0 = i12;
        this.J0 = i13;
        this.K0 = f6;
        this.L0 = SnapshotIntStateKt.mutableIntStateOf(0);
        this.M0 = SnapshotIntStateKt.mutableIntStateOf(0);
        this.N0 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.O0 = SnapshotStateKt.mutableStateOf$default(spacing, null, 2, null);
        this.P0 = SnapshotStateKt.mutableStateOf$default(MarqueeAnimationMode.m162boximpl(i11), null, 2, null);
        this.Q0 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.R0 = SnapshotStateKt.derivedStateOf(new b(spacing, this));
    }

    public final float a() {
        float fSignum = Math.signum(this.K0);
        int i10 = WhenMappings.$EnumSwitchMapping$0[DelegatableNodeKt.requireLayoutDirection(this).ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = -1;
        }
        return fSignum * i11;
    }

    public final int b() {
        return ((Number) this.R0.getValue()).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0077  */
    /* JADX WARN: Code duplicated, block: B:16:0x0079  */
    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(@NotNull ContentDrawScope contentDrawScope) {
        boolean z10;
        int iB;
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        Animatable<Float, AnimationVector1D> animatable = this.Q0;
        float fA = a() * animatable.getValue().floatValue();
        float fA2 = a();
        MutableIntState mutableIntState = this.M0;
        MutableIntState mutableIntState2 = this.L0;
        boolean z11 = fA2 != 1.0f ? animatable.getValue().floatValue() < ((float) mutableIntState.getIntValue()) : animatable.getValue().floatValue() < ((float) mutableIntState2.getIntValue());
        if (a() == 1.0f) {
            if (animatable.getValue().floatValue() > (b() + mutableIntState2.getIntValue()) - mutableIntState.getIntValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (animatable.getValue().floatValue() > b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (a() == 1.0f) {
            iB = b() + mutableIntState2.getIntValue();
        } else {
            iB = (-mutableIntState2.getIntValue()) - b();
        }
        float f6 = iB;
        float intValue = fA + mutableIntState.getIntValue();
        float fM2341getHeightimpl = Size.m2341getHeightimpl(contentDrawScope.mo2909getSizeNHjbRc());
        int iM2497getIntersectrtfAjoo = ClipOp.INSTANCE.m2497getIntersectrtfAjoo();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2918clipRectN_I0leg(fA, 0.0f, intValue, fM2341getHeightimpl, iM2497getIntersectrtfAjoo);
        if (z11) {
            contentDrawScope.drawContent();
        }
        if (z10) {
            contentDrawScope.getDrawContext().getTransform().translate(f6, 0.0f);
            contentDrawScope.drawContent();
            contentDrawScope.getDrawContext().getTransform().translate(-f6, -0.0f);
        }
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.maxIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.maxIntrinsicWidth(i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final MeasureResult mo172measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j10, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        int iM4371constrainWidthK40F9xA = ConstraintsKt.m4371constrainWidthK40F9xA(j10, placeableMo3575measureBRTryo0.getWidth());
        MutableIntState mutableIntState = this.M0;
        mutableIntState.setIntValue(iM4371constrainWidthK40F9xA);
        this.L0.setIntValue(placeableMo3575measureBRTryo0.getWidth());
        return MeasureScope.CC.q(measure, mutableIntState.getIntValue(), placeableMo3575measureBRTryo0.getHeight(), null, new a(placeableMo3575measureBRTryo0, this), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.minIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return 0;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        if (getIsAttached()) {
            BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new d0(this, null), 3, null);
        }
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(@NotNull FocusState focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        this.N0.setValue(Boolean.valueOf(focusState.getHasFocus()));
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final /* synthetic */ void onMeasureResultChanged() {
        i1.e.a(this);
    }
}
