package w0;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PainterModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,361:1\n152#2:362\n120#3,4:363\n*S KotlinDebug\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterNode\n*L\n162#1:362\n340#1:363,4\n*E\n"})
public final class g extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {

    @NotNull
    public Painter H0;
    public boolean I0;

    @NotNull
    public Alignment J0;

    @NotNull
    public ContentScale K0;
    public float L0;

    @Nullable
    public ColorFilter M0;

    /* JADX INFO: compiled from: PainterModifier.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f94114p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable) {
            super(1);
            this.f94114p0 = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.placeRelative$default(layout, this.f94114p0, 0, 0, 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    public static boolean b(long j10) {
        if (!Size.m2340equalsimpl0(j10, Size.INSTANCE.m2352getUnspecifiedNHjbRc())) {
            float fM2341getHeightimpl = Size.m2341getHeightimpl(j10);
            if (!Float.isInfinite(fM2341getHeightimpl) && !Float.isNaN(fM2341getHeightimpl)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(long j10) {
        if (!Size.m2340equalsimpl0(j10, Size.INSTANCE.m2352getUnspecifiedNHjbRc())) {
            float fM2344getWidthimpl = Size.m2344getWidthimpl(j10);
            if (!Float.isInfinite(fM2344getWidthimpl) && !Float.isNaN(fM2344getWidthimpl)) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return this.I0 && this.H0.getIntrinsicSize() != Size.INSTANCE.m2352getUnspecifiedNHjbRc();
    }

    public final long d(long j10) {
        boolean z10 = false;
        boolean z11 = Constraints.m4353getHasBoundedWidthimpl(j10) && Constraints.m4352getHasBoundedHeightimpl(j10);
        if (Constraints.m4355getHasFixedWidthimpl(j10) && Constraints.m4354getHasFixedHeightimpl(j10)) {
            z10 = true;
        }
        if ((!a() && z11) || z10) {
            return Constraints.m4349copyZbe2FdA$default(j10, Constraints.m4357getMaxWidthimpl(j10), 0, Constraints.m4356getMaxHeightimpl(j10), 0, 10, null);
        }
        long jMo3001getIntrinsicSizeNHjbRc = this.H0.getIntrinsicSize();
        long jSize = SizeKt.Size(ConstraintsKt.m4371constrainWidthK40F9xA(j10, c(jMo3001getIntrinsicSizeNHjbRc) ? mk.c.roundToInt(Size.m2344getWidthimpl(jMo3001getIntrinsicSizeNHjbRc)) : Constraints.m4359getMinWidthimpl(j10)), ConstraintsKt.m4370constrainHeightK40F9xA(j10, b(jMo3001getIntrinsicSizeNHjbRc) ? mk.c.roundToInt(Size.m2341getHeightimpl(jMo3001getIntrinsicSizeNHjbRc)) : Constraints.m4358getMinHeightimpl(j10)));
        if (a()) {
            long jSize2 = SizeKt.Size(!c(this.H0.getIntrinsicSize()) ? Size.m2344getWidthimpl(jSize) : Size.m2344getWidthimpl(this.H0.getIntrinsicSize()), !b(this.H0.getIntrinsicSize()) ? Size.m2341getHeightimpl(jSize) : Size.m2341getHeightimpl(this.H0.getIntrinsicSize()));
            jSize = (Size.m2344getWidthimpl(jSize) == 0.0f || Size.m2341getHeightimpl(jSize) == 0.0f) ? Size.INSTANCE.m2353getZeroNHjbRc() : ScaleFactorKt.m3645timesUQTWf7w(jSize2, this.K0.mo3570computeScaleFactorH7hwNQA(jSize2, jSize));
        }
        return Constraints.m4349copyZbe2FdA$default(j10, ConstraintsKt.m4371constrainWidthK40F9xA(j10, mk.c.roundToInt(Size.m2344getWidthimpl(jSize))), 0, ConstraintsKt.m4370constrainHeightK40F9xA(j10, mk.c.roundToInt(Size.m2341getHeightimpl(jSize))), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(@NotNull ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        long jMo3001getIntrinsicSizeNHjbRc = this.H0.getIntrinsicSize();
        long jSize = SizeKt.Size(c(jMo3001getIntrinsicSizeNHjbRc) ? Size.m2344getWidthimpl(jMo3001getIntrinsicSizeNHjbRc) : Size.m2344getWidthimpl(contentDrawScope.mo2909getSizeNHjbRc()), b(jMo3001getIntrinsicSizeNHjbRc) ? Size.m2341getHeightimpl(jMo3001getIntrinsicSizeNHjbRc) : Size.m2341getHeightimpl(contentDrawScope.mo2909getSizeNHjbRc()));
        long jM2353getZeroNHjbRc = (Size.m2344getWidthimpl(contentDrawScope.mo2909getSizeNHjbRc()) == 0.0f || Size.m2341getHeightimpl(contentDrawScope.mo2909getSizeNHjbRc()) == 0.0f) ? Size.INSTANCE.m2353getZeroNHjbRc() : ScaleFactorKt.m3645timesUQTWf7w(jSize, this.K0.mo3570computeScaleFactorH7hwNQA(jSize, contentDrawScope.mo2909getSizeNHjbRc()));
        long jMo2184alignKFBX0sM = this.J0.mo2184alignKFBX0sM(IntSizeKt.IntSize(mk.c.roundToInt(Size.m2344getWidthimpl(jM2353getZeroNHjbRc)), mk.c.roundToInt(Size.m2341getHeightimpl(jM2353getZeroNHjbRc))), IntSizeKt.IntSize(mk.c.roundToInt(Size.m2344getWidthimpl(contentDrawScope.mo2909getSizeNHjbRc())), mk.c.roundToInt(Size.m2341getHeightimpl(contentDrawScope.mo2909getSizeNHjbRc()))), contentDrawScope.getLayoutDirection());
        float fM4507getXimpl = IntOffset.m4507getXimpl(jMo2184alignKFBX0sM);
        float fM4508getYimpl = IntOffset.m4508getYimpl(jMo2184alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(fM4507getXimpl, fM4508getYimpl);
        this.H0.m3007drawx_KDEd0(contentDrawScope, jM2353getZeroNHjbRc, this.L0, this.M0);
        contentDrawScope.getDrawContext().getTransform().translate(-fM4507getXimpl, -fM4508getYimpl);
        contentDrawScope.drawContent();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (!a()) {
            return measurable.maxIntrinsicHeight(i10);
        }
        long jD = d(ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null));
        return Math.max(Constraints.m4358getMinHeightimpl(jD), measurable.maxIntrinsicHeight(i10));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (!a()) {
            return measurable.maxIntrinsicWidth(i10);
        }
        long jD = d(ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null));
        return Math.max(Constraints.m4359getMinWidthimpl(jD), measurable.maxIntrinsicWidth(i10));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo172measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(d(j10));
        return MeasureScope.CC.q(measure, placeableMo3575measureBRTryo0.getWidth(), placeableMo3575measureBRTryo0.getHeight(), null, new a(placeableMo3575measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (!a()) {
            return measurable.minIntrinsicHeight(i10);
        }
        long jD = d(ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null));
        return Math.max(Constraints.m4358getMinHeightimpl(jD), measurable.minIntrinsicHeight(i10));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (!a()) {
            return measurable.minIntrinsicWidth(i10);
        }
        long jD = d(ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null));
        return Math.max(Constraints.m4359getMinWidthimpl(jD), measurable.minIntrinsicWidth(i10));
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final /* synthetic */ void onMeasureResultChanged() {
        i1.e.a(this);
    }

    @NotNull
    public final String toString() {
        return "PainterModifier(painter=" + this.H0 + ", sizeToIntrinsics=" + this.I0 + ", alignment=" + this.J0 + ", alpha=" + this.L0 + ", colorFilter=" + this.M0 + RootService.CLOSE_BRACKET;
    }
}
