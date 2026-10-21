package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import bk.q;
import i1.e;
import i1.p;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y0.c;

/* JADX INFO: compiled from: TextAnnotatedStringNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B²\u0001\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\u000e\u0012\u001e\b\u0002\u0010\"\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u000e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001d\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0005ø\u0001\u0001¢\u0006\u0004\bK\u0010LJ\u0018\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJY\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJD\u0010%\u001a\u00020\t2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001d2\u001c\u0010\"\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u000e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001d2\b\u0010$\u001a\u0004\u0018\u00010#J&\u0010*\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tJ\f\u0010,\u001a\u00020\u001f*\u00020+H\u0016J+\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J)\u00108\u001a\u000203*\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00105J\u001e\u0010=\u001a\u00020\u00122\u0006\u0010:\u001a\u0002092\u0006\u00100\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0012J\u001c\u0010>\u001a\u00020\u0012*\u0002092\u0006\u00100\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0012H\u0016J\u001e\u0010@\u001a\u00020\u00122\u0006\u0010:\u001a\u0002092\u0006\u00100\u001a\u00020;2\u0006\u0010?\u001a\u00020\u0012J\u001c\u0010A\u001a\u00020\u0012*\u0002092\u0006\u00100\u001a\u00020;2\u0006\u0010?\u001a\u00020\u0012H\u0016J\u001e\u0010B\u001a\u00020\u00122\u0006\u0010:\u001a\u0002092\u0006\u00100\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0012J\u001c\u0010C\u001a\u00020\u0012*\u0002092\u0006\u00100\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0012H\u0016J\u001e\u0010D\u001a\u00020\u00122\u0006\u0010:\u001a\u0002092\u0006\u00100\u001a\u00020;2\u0006\u0010?\u001a\u00020\u0012J\u001c\u0010E\u001a\u00020\u0012*\u0002092\u0006\u00100\u001a\u00020;2\u0006\u0010?\u001a\u00020\u0012H\u0016J\u000e\u0010H\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020FJ\f\u0010I\u001a\u00020\u001f*\u00020FH\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006M"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/graphics/ColorProducer;", "color", "Landroidx/compose/ui/text/TextStyle;", "style", "", "updateDraw", "Landroidx/compose/ui/text/AnnotatedString;", "text", "updateText", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "", "minLines", "maxLines", "softWrap", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "updateLayoutRelatedArgs-MPT68mk", "(Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;I)Z", "updateLayoutRelatedArgs", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "selectionController", "updateCallbacks", "drawChanged", "textChanged", "layoutChanged", "callbacksChanged", "doInvalidations", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measureNonExtension-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measureNonExtension", "measure-3p2s80s", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicWidthNonExtension", "minIntrinsicWidth", "width", "minIntrinsicHeightNonExtension", "minIntrinsicHeight", "maxIntrinsicWidthNonExtension", "maxIntrinsicWidth", "maxIntrinsicHeightNonExtension", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "contentDrawScope", "drawNonExtension", "draw", "overrideColor", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextAnnotatedStringNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,421:1\n1#2:422\n245#3:423\n646#4:424\n646#4:425\n*S KotlinDebug\n*F\n+ 1 TextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode\n*L\n368#1:423\n396#1:424\n398#1:425\n*E\n"})
public final class TextAnnotatedStringNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {

    @NotNull
    public AnnotatedString H0;

    @NotNull
    public TextStyle I0;

    @NotNull
    public FontFamily.Resolver J0;

    @Nullable
    public Function1<? super TextLayoutResult, Unit> K0;
    public int L0;
    public boolean M0;
    public int N0;
    public int O0;

    @Nullable
    public List<AnnotatedString.Range<Placeholder>> P0;

    @Nullable
    public Function1<? super List<Rect>, Unit> Q0;

    @Nullable
    public SelectionController R0;

    @Nullable
    public ColorProducer S0;

    @Nullable
    public Map<AlignmentLine, Integer> T0;

    @Nullable
    public MultiParagraphLayoutCache U0;

    @Nullable
    public a V0;

    /* JADX INFO: compiled from: TextAnnotatedStringNode.kt */
    public static final class a extends Lambda implements Function1<List<TextLayoutResult>, Boolean> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(List<TextLayoutResult> list) {
            List<TextLayoutResult> textLayoutResult = list;
            Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
            TextLayoutResult layoutOrNull = TextAnnotatedStringNode.this.a().getF6183n();
            if (layoutOrNull != null) {
                textLayoutResult.add(layoutOrNull);
            } else {
                layoutOrNull = null;
            }
            return Boolean.valueOf(layoutOrNull != null);
        }
    }

    /* JADX INFO: compiled from: TextAnnotatedStringNode.kt */
    public static final class b extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f6247p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Placeable placeable) {
            super(1);
            this.f6247p0 = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.place$default(layout, this.f6247p0, 0, 0, 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    public TextAnnotatedStringNode() {
        throw null;
    }

    public TextAnnotatedStringNode(AnnotatedString text, TextStyle style, FontFamily.Resolver fontFamilyResolver, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function2, SelectionController selectionController, ColorProducer colorProducer, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        this.H0 = text;
        this.I0 = style;
        this.J0 = fontFamilyResolver;
        this.K0 = function1;
        this.L0 = i10;
        this.M0 = z10;
        this.N0 = i11;
        this.O0 = i12;
        this.P0 = list;
        this.Q0 = function2;
        this.R0 = selectionController;
        this.S0 = colorProducer;
    }

    public final MultiParagraphLayoutCache a() {
        if (this.U0 == null) {
            this.U0 = new MultiParagraphLayoutCache(this.H0, this.I0, this.J0, this.L0, this.M0, this.N0, this.O0, this.P0, null);
        }
        MultiParagraphLayoutCache multiParagraphLayoutCache = this.U0;
        Intrinsics.checkNotNull(multiParagraphLayoutCache);
        return multiParagraphLayoutCache;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        a aVar = this.V0;
        if (aVar == null) {
            aVar = new a();
            this.V0 = aVar;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, this.H0);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, aVar, 1, null);
    }

    public final void doInvalidations(boolean drawChanged, boolean textChanged, boolean layoutChanged, boolean callbacksChanged) {
        if (getIsAttached()) {
            if (textChanged || (drawChanged && this.V0 != null)) {
                SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            if (textChanged || layoutChanged || callbacksChanged) {
                a().m580updateZNqEYIc(this.H0, this.I0, this.J0, this.L0, this.M0, this.N0, this.O0, this.P0);
                LayoutModifierNodeKt.invalidateMeasurement(this);
                DrawModifierNodeKt.invalidateDraw(this);
            }
            if (drawChanged) {
                DrawModifierNodeKt.invalidateDraw(this);
            }
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        if (getIsAttached()) {
            SelectionController selectionController = this.R0;
            if (selectionController != null) {
                selectionController.draw(contentDrawScope);
            }
            Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            TextLayoutResult textLayoutResult = a().getTextLayoutResult();
            MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
            boolean z10 = textLayoutResult.getHasVisualOverflow() && !TextOverflow.m4336equalsimpl0(this.L0, TextOverflow.INSTANCE.m4345getVisiblegIe3tQ8());
            if (z10) {
                Rect rectM2315Recttz77jQw = RectKt.m2315Recttz77jQw(Offset.INSTANCE.m2291getZeroF1C5BW0(), SizeKt.Size(IntSize.m4549getWidthimpl(textLayoutResult.getSize()), IntSize.m4548getHeightimpl(textLayoutResult.getSize())));
                canvas.save();
                c.o(canvas, rectM2315Recttz77jQw, 0, 2, null);
            }
            try {
                TextDecoration textDecoration = this.I0.getTextDecoration();
                if (textDecoration == null) {
                    textDecoration = TextDecoration.INSTANCE.getNone();
                }
                TextDecoration textDecoration2 = textDecoration;
                Shadow shadow = this.I0.getShadow();
                if (shadow == null) {
                    shadow = Shadow.INSTANCE.getNone();
                }
                Shadow shadow2 = shadow;
                DrawStyle drawStyle = this.I0.getDrawStyle();
                if (drawStyle == null) {
                    drawStyle = Fill.INSTANCE;
                }
                DrawStyle drawStyle2 = drawStyle;
                Brush brush = this.I0.getBrush();
                if (brush != null) {
                    multiParagraph.m3873painthn5TExg(canvas, brush, (64 & 4) != 0 ? Float.NaN : this.I0.getAlpha(), (64 & 8) != 0 ? null : shadow2, (64 & 16) != 0 ? null : textDecoration2, (64 & 32) != 0 ? null : drawStyle2, (64 & 64) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : 0);
                } else {
                    ColorProducer colorProducer = this.S0;
                    long jMo882invoke0d7_KjU = colorProducer != null ? colorProducer.mo882invoke0d7_KjU() : Color.INSTANCE.m2544getUnspecified0d7_KjU();
                    Color.Companion companion = Color.INSTANCE;
                    if (jMo882invoke0d7_KjU == companion.m2544getUnspecified0d7_KjU()) {
                        jMo882invoke0d7_KjU = this.I0.m3988getColor0d7_KjU() != companion.m2544getUnspecified0d7_KjU() ? this.I0.m3988getColor0d7_KjU() : companion.m2534getBlack0d7_KjU();
                    }
                    multiParagraph.m3871paintLG529CI(canvas, (32 & 2) != 0 ? Color.INSTANCE.m2544getUnspecified0d7_KjU() : jMo882invoke0d7_KjU, (32 & 4) != 0 ? null : shadow2, (32 & 8) != 0 ? null : textDecoration2, (32 & 16) == 0 ? drawStyle2 : null, (32 & 32) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : 0);
                }
                if (z10) {
                    canvas.restore();
                }
                List<AnnotatedString.Range<Placeholder>> list = this.P0;
                if (list == null || list.isEmpty()) {
                    return;
                }
                contentDrawScope.drawContent();
            } catch (Throwable th2) {
                if (z10) {
                    canvas.restore();
                }
                throw th2;
            }
        }
    }

    public final void drawNonExtension(@NotNull ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "contentDrawScope");
        draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* JADX INFO: renamed from: getShouldClearDescendantSemantics */
    public final /* synthetic */ boolean getIsClearingSemantics() {
        return p.a(this);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return p.b(this);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        MultiParagraphLayoutCache multiParagraphLayoutCacheA = a();
        multiParagraphLayoutCacheA.setDensity$foundation_release(intrinsicMeasureScope);
        return multiParagraphLayoutCacheA.intrinsicHeight(i10, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicHeightNonExtension(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int width) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return maxIntrinsicHeight(intrinsicMeasureScope, measurable, width);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        MultiParagraphLayoutCache multiParagraphLayoutCacheA = a();
        multiParagraphLayoutCacheA.setDensity$foundation_release(intrinsicMeasureScope);
        return multiParagraphLayoutCacheA.maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicWidthNonExtension(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int height) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return maxIntrinsicWidth(intrinsicMeasureScope, measurable, height);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo172measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        MultiParagraphLayoutCache multiParagraphLayoutCacheA = a();
        multiParagraphLayoutCacheA.setDensity$foundation_release(measure);
        boolean zM579layoutWithConstraintsK40F9xA = multiParagraphLayoutCacheA.m579layoutWithConstraintsK40F9xA(j10, measure.getLayoutDirection());
        TextLayoutResult textLayoutResult = multiParagraphLayoutCacheA.getTextLayoutResult();
        textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts();
        if (zM579layoutWithConstraintsK40F9xA) {
            LayoutModifierNodeKt.invalidateLayer(this);
            Function1<? super TextLayoutResult, Unit> function1 = this.K0;
            if (function1 != null) {
                function1.invoke(textLayoutResult);
            }
            SelectionController selectionController = this.R0;
            if (selectionController != null) {
                selectionController.updateTextLayout(textLayoutResult);
            }
            this.T0 = q.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(mk.c.roundToInt(textLayoutResult.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(mk.c.roundToInt(textLayoutResult.getLastBaseline()))));
        }
        Function1<? super List<Rect>, Unit> function2 = this.Q0;
        if (function2 != null) {
            function2.invoke(textLayoutResult.getPlaceholderRects());
        }
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(Constraints.INSTANCE.m4365fixedJhjzzOo(IntSize.m4549getWidthimpl(textLayoutResult.getSize()), IntSize.m4548getHeightimpl(textLayoutResult.getSize())));
        int iM4549getWidthimpl = IntSize.m4549getWidthimpl(textLayoutResult.getSize());
        int iM4548getHeightimpl = IntSize.m4548getHeightimpl(textLayoutResult.getSize());
        Map<AlignmentLine, Integer> map = this.T0;
        Intrinsics.checkNotNull(map);
        return measure.layout(iM4549getWidthimpl, iM4548getHeightimpl, map, new b(placeableMo3575measureBRTryo0));
    }

    @NotNull
    /* JADX INFO: renamed from: measureNonExtension-3p2s80s, reason: not valid java name */
    public final MeasureResult m593measureNonExtension3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long constraints) {
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return mo172measure3p2s80s(measureScope, measurable, constraints);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        MultiParagraphLayoutCache multiParagraphLayoutCacheA = a();
        multiParagraphLayoutCacheA.setDensity$foundation_release(intrinsicMeasureScope);
        return multiParagraphLayoutCacheA.intrinsicHeight(i10, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicHeightNonExtension(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int width) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return minIntrinsicHeight(intrinsicMeasureScope, measurable, width);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        MultiParagraphLayoutCache multiParagraphLayoutCacheA = a();
        multiParagraphLayoutCacheA.setDensity$foundation_release(intrinsicMeasureScope);
        return multiParagraphLayoutCacheA.minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicWidthNonExtension(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int height) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return minIntrinsicWidth(intrinsicMeasureScope, measurable, height);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final /* synthetic */ void onMeasureResultChanged() {
        e.a(this);
    }

    public final boolean updateCallbacks(@Nullable Function1<? super TextLayoutResult, Unit> onTextLayout, @Nullable Function1<? super List<Rect>, Unit> onPlaceholderLayout, @Nullable SelectionController selectionController) {
        boolean z10;
        if (Intrinsics.areEqual(this.K0, onTextLayout)) {
            z10 = false;
        } else {
            this.K0 = onTextLayout;
            z10 = true;
        }
        if (!Intrinsics.areEqual(this.Q0, onPlaceholderLayout)) {
            this.Q0 = onPlaceholderLayout;
            z10 = true;
        }
        if (Intrinsics.areEqual(this.R0, selectionController)) {
            return z10;
        }
        this.R0 = selectionController;
        return true;
    }

    public final boolean updateDraw(@Nullable ColorProducer color, @NotNull TextStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        boolean z10 = !Intrinsics.areEqual(color, this.S0);
        this.S0 = color;
        return z10 || !style.hasSameDrawAffectingAttributes(this.I0);
    }

    /* JADX INFO: renamed from: updateLayoutRelatedArgs-MPT68mk, reason: not valid java name */
    public final boolean m594updateLayoutRelatedArgsMPT68mk(@NotNull TextStyle style, @Nullable List<AnnotatedString.Range<Placeholder>> placeholders, int minLines, int maxLines, boolean softWrap, @NotNull FontFamily.Resolver fontFamilyResolver, int overflow) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        boolean z10 = !this.I0.hasSameLayoutAffectingAttributes(style);
        this.I0 = style;
        if (!Intrinsics.areEqual(this.P0, placeholders)) {
            this.P0 = placeholders;
            z10 = true;
        }
        if (this.O0 != minLines) {
            this.O0 = minLines;
            z10 = true;
        }
        if (this.N0 != maxLines) {
            this.N0 = maxLines;
            z10 = true;
        }
        if (this.M0 != softWrap) {
            this.M0 = softWrap;
            z10 = true;
        }
        if (!Intrinsics.areEqual(this.J0, fontFamilyResolver)) {
            this.J0 = fontFamilyResolver;
            z10 = true;
        }
        if (TextOverflow.m4336equalsimpl0(this.L0, overflow)) {
            return z10;
        }
        this.L0 = overflow;
        return true;
    }

    public final boolean updateText(@NotNull AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (Intrinsics.areEqual(this.H0, text)) {
            return false;
        }
        this.H0 = text;
        return true;
    }

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function2, SelectionController selectionController, ColorProducer colorProducer, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, (i13 & 8) != 0 ? null : function1, (i13 & 16) != 0 ? TextOverflow.INSTANCE.m4343getClipgIe3tQ8() : i10, (i13 & 32) != 0 ? true : z10, (i13 & 64) != 0 ? Integer.MAX_VALUE : i11, (i13 & 128) != 0 ? 1 : i12, (i13 & 256) != 0 ? null : list, (i13 & 512) != 0 ? null : function2, (i13 & 1024) != 0 ? null : selectionController, (i13 & 2048) != 0 ? null : colorProducer, null);
    }
}
