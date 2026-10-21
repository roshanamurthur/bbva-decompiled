package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import i1.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SelectableTextAnnotatedStringNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B²\u0001\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010*\u001a\u00020)\u0012\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0007\u0018\u00010-\u0012\b\b\u0002\u0010,\u001a\u00020+\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010&\u001a\u00020\u0016\u0012\b\b\u0002\u0010%\u001a\u00020\u0016\u0012\u0016\b\u0002\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0018\u00010!\u0012\u001e\b\u0002\u00101\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001000!\u0012\u0004\u0012\u00020\u0007\u0018\u00010-\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000104ø\u0001\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\f\u0010\n\u001a\u00020\u0007*\u00020\tH\u0016J)\u0010\u0013\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0018\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u001c\u0010\u001a\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010\u001b\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u001c\u0010\u001c\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J©\u0001\u00108\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0014\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0018\u00010!2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0007\u0018\u00010-2\u001c\u00101\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001000!\u0012\u0004\u0012\u00020\u0007\u0018\u00010-2\b\u00103\u001a\u0004\u0018\u0001022\b\u00105\u001a\u0004\u0018\u000104ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006<"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "", "onGloballyPositioned", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "minLines", "maxLines", "", "softWrap", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "onTextLayout", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "selectionController", "Landroidx/compose/ui/graphics/ColorProducer;", "color", "update-L09Iy8E", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;)V", "update", "overrideColor", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class SelectableTextAnnotatedStringNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, GlobalPositionAwareModifierNode {

    @Nullable
    public final SelectionController J0;

    @NotNull
    public final TextAnnotatedStringNode K0;

    public SelectableTextAnnotatedStringNode() {
        throw null;
    }

    public SelectableTextAnnotatedStringNode(AnnotatedString text, TextStyle style, FontFamily.Resolver fontFamilyResolver, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function2, SelectionController selectionController, ColorProducer colorProducer, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        this.J0 = selectionController;
        this.K0 = (TextAnnotatedStringNode) delegate(new TextAnnotatedStringNode(text, style, fontFamilyResolver, function1, i10, z10, i11, i12, list, function2, selectionController, colorProducer, null));
        if (selectionController == null) {
            throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null".toString());
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        this.K0.drawNonExtension(contentDrawScope);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return this.K0.maxIntrinsicHeightNonExtension(intrinsicMeasureScope, measurable, i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return this.K0.maxIntrinsicWidthNonExtension(intrinsicMeasureScope, measurable, i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo172measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return this.K0.m593measureNonExtension3p2s80s(measure, measurable, j10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return this.K0.minIntrinsicHeightNonExtension(intrinsicMeasureScope, measurable, i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return this.K0.minIntrinsicWidthNonExtension(intrinsicMeasureScope, measurable, i10);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        SelectionController selectionController = this.J0;
        if (selectionController != null) {
            selectionController.updateGlobalPosition(coordinates);
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final /* synthetic */ void onMeasureResultChanged() {
        e.a(this);
    }

    /* JADX INFO: renamed from: update-L09Iy8E, reason: not valid java name */
    public final void m587updateL09Iy8E(@NotNull AnnotatedString text, @NotNull TextStyle style, @Nullable List<AnnotatedString.Range<Placeholder>> placeholders, int minLines, int maxLines, boolean softWrap, @NotNull FontFamily.Resolver fontFamilyResolver, int overflow, @Nullable Function1<? super TextLayoutResult, Unit> onTextLayout, @Nullable Function1<? super List<Rect>, Unit> onPlaceholderLayout, @Nullable SelectionController selectionController, @Nullable ColorProducer color) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        TextAnnotatedStringNode textAnnotatedStringNode = this.K0;
        textAnnotatedStringNode.doInvalidations(textAnnotatedStringNode.updateDraw(color, style), textAnnotatedStringNode.updateText(text), this.K0.m594updateLayoutRelatedArgsMPT68mk(style, placeholders, minLines, maxLines, softWrap, fontFamilyResolver, overflow), textAnnotatedStringNode.updateCallbacks(onTextLayout, onPlaceholderLayout, selectionController));
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    public /* synthetic */ SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function2, SelectionController selectionController, ColorProducer colorProducer, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, (i13 & 8) != 0 ? null : function1, (i13 & 16) != 0 ? TextOverflow.INSTANCE.m4343getClipgIe3tQ8() : i10, (i13 & 32) != 0 ? true : z10, (i13 & 64) != 0 ? Integer.MAX_VALUE : i11, (i13 & 128) != 0 ? 1 : i12, (i13 & 256) != 0 ? null : list, (i13 & 512) != 0 ? null : function2, (i13 & 1024) != 0 ? null : selectionController, (i13 & 2048) != 0 ? null : colorProducer, null);
    }
}
