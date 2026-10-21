package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LayoutModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012#\u0010\u0016\u001a\u001f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u000fø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0015J)\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0016RB\u0010\u0016\u001a\u001f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u000f8\u0006@\u0006X\u0086\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/layout/LayoutModifierImpl;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "toString", "Lkotlin/Function3;", "Lkotlin/ExtensionFunctionType;", "H0", "Lkotlin/jvm/functions/Function3;", "getMeasureBlock", "()Lkotlin/jvm/functions/Function3;", "setMeasureBlock", "(Lkotlin/jvm/functions/Function3;)V", "measureBlock", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class LayoutModifierImpl extends Modifier.Node implements LayoutModifierNode {

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @NotNull
    public Function3<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> measureBlock;

    public LayoutModifierImpl(@NotNull Function3<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> measureBlock) {
        Intrinsics.checkNotNullParameter(measureBlock, "measureBlock");
        this.measureBlock = measureBlock;
    }

    @NotNull
    public final Function3<MeasureScope, Measurable, Constraints, MeasureResult> getMeasureBlock() {
        return this.measureBlock;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.node.a.a(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.node.a.b(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo172measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return this.measureBlock.invoke(measure, measurable, Constraints.m4346boximpl(j10));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.node.a.c(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.node.a.d(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    public final void setMeasureBlock(@NotNull Function3<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> function3) {
        Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.measureBlock = function3;
    }

    @NotNull
    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.measureBlock + RootService.CLOSE_BRACKET;
    }
}
