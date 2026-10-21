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
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import i1.e;
import i1.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y0.c;

/* JADX INFO: compiled from: TextStringSimpleNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BV\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0005ø\u0001\u0001¢\u0006\u0004\b4\u00105J\u0018\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJC\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tJ\f\u0010\u001f\u001a\u00020\u001c*\u00020\u001eH\u0016J)\u0010(\u001a\u00020%*\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\u001c\u0010,\u001a\u00020\u000e*\u00020)2\u0006\u0010\"\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000eH\u0016J\u001c\u0010.\u001a\u00020\u000e*\u00020)2\u0006\u0010\"\u001a\u00020*2\u0006\u0010-\u001a\u00020\u000eH\u0016J\u001c\u0010/\u001a\u00020\u000e*\u00020)2\u0006\u0010\"\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000eH\u0016J\u001c\u00100\u001a\u00020\u000e*\u00020)2\u0006\u0010\"\u001a\u00020*2\u0006\u0010-\u001a\u00020\u000eH\u0016J\f\u00102\u001a\u00020\u001c*\u000201H\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00066"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/graphics/ColorProducer;", "color", "Landroidx/compose/ui/text/TextStyle;", "style", "", "updateDraw", "", "text", "updateText", "", "minLines", "maxLines", "softWrap", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "updateLayoutRelatedArgs-HuAbxIM", "(Landroidx/compose/ui/text/TextStyle;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;I)Z", "updateLayoutRelatedArgs", "drawChanged", "textChanged", "layoutChanged", "", "doInvalidations", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "overrideColor", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextStringSimpleNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,338:1\n1#2:339\n245#3:340\n646#4:341\n646#4:342\n*S KotlinDebug\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n*L\n289#1:340\n315#1:341\n317#1:342\n*E\n"})
public final class TextStringSimpleNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {

    @NotNull
    public String H0;

    @NotNull
    public TextStyle I0;

    @NotNull
    public FontFamily.Resolver J0;
    public int K0;
    public boolean L0;
    public int M0;
    public int N0;

    @Nullable
    public ColorProducer O0;

    @Nullable
    public Map<AlignmentLine, Integer> P0;

    @Nullable
    public ParagraphLayoutCache Q0;

    @Nullable
    public a R0;

    /* JADX INFO: compiled from: TextStringSimpleNode.kt */
    public static final class a extends Lambda implements Function1<List<TextLayoutResult>, Boolean> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(List<TextLayoutResult> list) {
            List<TextLayoutResult> textLayoutResult = list;
            Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
            TextLayoutResult textLayoutResultSlowCreateTextLayoutResultOrNull = TextStringSimpleNode.this.a().slowCreateTextLayoutResultOrNull();
            if (textLayoutResultSlowCreateTextLayoutResultOrNull != null) {
                textLayoutResult.add(textLayoutResultSlowCreateTextLayoutResultOrNull);
            }
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: compiled from: TextStringSimpleNode.kt */
    public static final class b extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f6257p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Placeable placeable) {
            super(1);
            this.f6257p0 = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.place$default(layout, this.f6257p0, 0, 0, 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    public TextStringSimpleNode(String text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int i10, boolean z10, int i11, int i12, ColorProducer colorProducer, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        this.H0 = text;
        this.I0 = style;
        this.J0 = fontFamilyResolver;
        this.K0 = i10;
        this.L0 = z10;
        this.M0 = i11;
        this.N0 = i12;
        this.O0 = colorProducer;
    }

    public final ParagraphLayoutCache a() {
        if (this.Q0 == null) {
            this.Q0 = new ParagraphLayoutCache(this.H0, this.I0, this.J0, this.K0, this.L0, this.M0, this.N0, null);
        }
        ParagraphLayoutCache paragraphLayoutCache = this.Q0;
        Intrinsics.checkNotNull(paragraphLayoutCache);
        return paragraphLayoutCache;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        a aVar = this.R0;
        if (aVar == null) {
            aVar = new a();
            this.R0 = aVar;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(this.H0, null, null, 6, null));
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, aVar, 1, null);
    }

    public final void doInvalidations(boolean drawChanged, boolean textChanged, boolean layoutChanged) {
        if (getIsAttached()) {
            if (textChanged || (drawChanged && this.R0 != null)) {
                SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            if (textChanged || layoutChanged) {
                a().m584updateL6sJoHM(this.H0, this.I0, this.J0, this.K0, this.L0, this.M0, this.N0);
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
            Paragraph paragraph = a().getParagraph();
            if (paragraph == null) {
                throw new IllegalArgumentException("no paragraph".toString());
            }
            Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            boolean didOverflow = a().getDidOverflow();
            if (didOverflow) {
                Rect rectM2315Recttz77jQw = RectKt.m2315Recttz77jQw(Offset.INSTANCE.m2291getZeroF1C5BW0(), SizeKt.Size(IntSize.m4549getWidthimpl(a().getLayoutSize()), IntSize.m4548getHeightimpl(a().getLayoutSize())));
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
                    n1.c.d(paragraph, canvas, brush, this.I0.getAlpha(), shadow2, textDecoration2, drawStyle2, 0, 64, null);
                } else {
                    ColorProducer colorProducer = this.O0;
                    long jMo882invoke0d7_KjU = colorProducer != null ? colorProducer.mo882invoke0d7_KjU() : Color.INSTANCE.m2544getUnspecified0d7_KjU();
                    Color.Companion companion = Color.INSTANCE;
                    if (jMo882invoke0d7_KjU == companion.m2544getUnspecified0d7_KjU()) {
                        jMo882invoke0d7_KjU = this.I0.m3988getColor0d7_KjU() != companion.m2544getUnspecified0d7_KjU() ? this.I0.m3988getColor0d7_KjU() : companion.m2534getBlack0d7_KjU();
                    }
                    n1.c.b(paragraph, canvas, jMo882invoke0d7_KjU, shadow2, textDecoration2, drawStyle2, 0, 32, null);
                }
            } finally {
                if (didOverflow) {
                    canvas.restore();
                }
            }
        }
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
        ParagraphLayoutCache paragraphLayoutCacheA = a();
        paragraphLayoutCacheA.setDensity$foundation_release(intrinsicMeasureScope);
        return paragraphLayoutCacheA.intrinsicHeight(i10, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        ParagraphLayoutCache paragraphLayoutCacheA = a();
        paragraphLayoutCacheA.setDensity$foundation_release(intrinsicMeasureScope);
        return paragraphLayoutCacheA.maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo172measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        ParagraphLayoutCache paragraphLayoutCacheA = a();
        paragraphLayoutCacheA.setDensity$foundation_release(measure);
        boolean zM582layoutWithConstraintsK40F9xA = paragraphLayoutCacheA.m582layoutWithConstraintsK40F9xA(j10, measure.getLayoutDirection());
        paragraphLayoutCacheA.getObserveFontChanges$foundation_release();
        Paragraph paragraph = paragraphLayoutCacheA.getParagraph();
        Intrinsics.checkNotNull(paragraph);
        long layoutSize = paragraphLayoutCacheA.getLayoutSize();
        if (zM582layoutWithConstraintsK40F9xA) {
            LayoutModifierNodeKt.invalidateLayer(this);
            Map<AlignmentLine, Integer> linkedHashMap = this.P0;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>(2);
            }
            linkedHashMap.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(mk.c.roundToInt(paragraph.getFirstBaseline())));
            linkedHashMap.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(mk.c.roundToInt(paragraph.getLastBaseline())));
            this.P0 = linkedHashMap;
        }
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(Constraints.INSTANCE.m4365fixedJhjzzOo(IntSize.m4549getWidthimpl(layoutSize), IntSize.m4548getHeightimpl(layoutSize)));
        int iM4549getWidthimpl = IntSize.m4549getWidthimpl(layoutSize);
        int iM4548getHeightimpl = IntSize.m4548getHeightimpl(layoutSize);
        Map<AlignmentLine, Integer> map = this.P0;
        Intrinsics.checkNotNull(map);
        return measure.layout(iM4549getWidthimpl, iM4548getHeightimpl, map, new b(placeableMo3575measureBRTryo0));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        ParagraphLayoutCache paragraphLayoutCacheA = a();
        paragraphLayoutCacheA.setDensity$foundation_release(intrinsicMeasureScope);
        return paragraphLayoutCacheA.intrinsicHeight(i10, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        ParagraphLayoutCache paragraphLayoutCacheA = a();
        paragraphLayoutCacheA.setDensity$foundation_release(intrinsicMeasureScope);
        return paragraphLayoutCacheA.minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final /* synthetic */ void onMeasureResultChanged() {
        e.a(this);
    }

    public final boolean updateDraw(@Nullable ColorProducer color, @NotNull TextStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        boolean z10 = !Intrinsics.areEqual(color, this.O0);
        this.O0 = color;
        return z10 || !style.hasSameDrawAffectingAttributes(this.I0);
    }

    /* JADX INFO: renamed from: updateLayoutRelatedArgs-HuAbxIM, reason: not valid java name */
    public final boolean m595updateLayoutRelatedArgsHuAbxIM(@NotNull TextStyle style, int minLines, int maxLines, boolean softWrap, @NotNull FontFamily.Resolver fontFamilyResolver, int overflow) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        boolean z10 = !this.I0.hasSameLayoutAffectingAttributes(style);
        this.I0 = style;
        if (this.N0 != minLines) {
            this.N0 = minLines;
            z10 = true;
        }
        if (this.M0 != maxLines) {
            this.M0 = maxLines;
            z10 = true;
        }
        if (this.L0 != softWrap) {
            this.L0 = softWrap;
            z10 = true;
        }
        if (!Intrinsics.areEqual(this.J0, fontFamilyResolver)) {
            this.J0 = fontFamilyResolver;
            z10 = true;
        }
        if (TextOverflow.m4336equalsimpl0(this.K0, overflow)) {
            return z10;
        }
        this.K0 = overflow;
        return true;
    }

    public final boolean updateText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (Intrinsics.areEqual(this.H0, text)) {
            return false;
        }
        this.H0 = text;
        return true;
    }

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i10, boolean z10, int i11, int i12, ColorProducer colorProducer, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, (i13 & 8) != 0 ? TextOverflow.INSTANCE.m4343getClipgIe3tQ8() : i10, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? Integer.MAX_VALUE : i11, (i13 & 64) != 0 ? 1 : i12, (i13 & 128) != 0 ? null : colorProducer, null);
    }
}
