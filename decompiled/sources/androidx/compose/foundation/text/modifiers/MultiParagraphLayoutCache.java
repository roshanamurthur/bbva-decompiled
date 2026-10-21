package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MultiParagraphLayoutCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001Bb\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0018\u00010\u0018ø\u0001\u0001¢\u0006\u0004\b1\u00102J#\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004Ja\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0014\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0018\u00010\u0018ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010 \u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004R.\u0010*\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0011\u0010.\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u00100\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b/\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00063"}, d2 = {"Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "layoutWithConstraints-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Z", "layoutWithConstraints", "", "width", "intrinsicHeight", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "softWrap", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "", "update-ZNqEYIc", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILjava/util/List;)V", "update", "maxIntrinsicWidth", "minIntrinsicWidth", "Landroidx/compose/ui/unit/Density;", "value", "k", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/ui/text/TextLayoutResult;", "getTextLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "getLayoutOrNull", "layoutOrNull", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultiParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n1#2:354\n*E\n"})
public final class MultiParagraphLayoutCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public AnnotatedString f6171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public TextStyle f6172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public FontFamily.Resolver f6173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public List<AnnotatedString.Range<Placeholder>> f6178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public MinLinesConstrainer f6179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f6180j;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Density density;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public MultiParagraphIntrinsics f6182l;

    @Nullable
    public LayoutDirection m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public TextLayoutResult f6183n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6184o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6185p;

    public MultiParagraphLayoutCache() {
        throw null;
    }

    public MultiParagraphLayoutCache(AnnotatedString text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int i10, boolean z10, int i11, int i12, List list, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        this.f6171a = text;
        this.f6172b = style;
        this.f6173c = fontFamilyResolver;
        this.f6174d = i10;
        this.f6175e = z10;
        this.f6176f = i11;
        this.f6177g = i12;
        this.f6178h = list;
        this.f6180j = InlineDensity.INSTANCE.m573getUnspecifiedL26CHvs();
        this.f6184o = -1;
        this.f6185p = -1;
    }

    public final MultiParagraph a(long j10, LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsicsB = b(layoutDirection);
        return new MultiParagraph(multiParagraphIntrinsicsB, LayoutUtilsKt.m574finalConstraintstfFHcEY(j10, this.f6175e, this.f6174d, multiParagraphIntrinsicsB.getMaxIntrinsicWidth()), LayoutUtilsKt.m575finalMaxLinesxdlQI24(this.f6175e, this.f6174d, this.f6176f), TextOverflow.m4336equalsimpl0(this.f6174d, TextOverflow.INSTANCE.m4344getEllipsisgIe3tQ8()), null);
    }

    public final MultiParagraphIntrinsics b(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f6182l;
        if (multiParagraphIntrinsics == null || layoutDirection != this.m || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.m = layoutDirection;
            AnnotatedString annotatedString = this.f6171a;
            TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(this.f6172b, layoutDirection);
            Density density = this.density;
            Intrinsics.checkNotNull(density);
            FontFamily.Resolver resolver = this.f6173c;
            List<AnnotatedString.Range<Placeholder>> listEmptyList = this.f6178h;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyleResolveDefaults, listEmptyList, density, resolver);
        }
        this.f6182l = multiParagraphIntrinsics;
        return multiParagraphIntrinsics;
    }

    public final TextLayoutResult c(LayoutDirection layoutDirection, long j10, MultiParagraph multiParagraph) {
        AnnotatedString annotatedString = this.f6171a;
        TextStyle textStyle = this.f6172b;
        List<AnnotatedString.Range<Placeholder>> listEmptyList = this.f6178h;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        int i10 = this.f6176f;
        boolean z10 = this.f6175e;
        int i11 = this.f6174d;
        Density density = this.density;
        Intrinsics.checkNotNull(density);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, listEmptyList, i10, z10, i11, density, layoutDirection, this.f6173c, j10, (DefaultConstructorMarker) null), multiParagraph, ConstraintsKt.m4368constrain4WqzIAM(j10, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(multiParagraph.getWidth()), TextDelegateKt.ceilToIntPx(multiParagraph.getHeight()))), null);
    }

    @Nullable
    /* JADX INFO: renamed from: getDensity$foundation_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    @Nullable
    /* JADX INFO: renamed from: getLayoutOrNull, reason: from getter */
    public final TextLayoutResult getF6183n() {
        return this.f6183n;
    }

    @NotNull
    public final TextLayoutResult getTextLayoutResult() {
        TextLayoutResult textLayoutResult = this.f6183n;
        if (textLayoutResult != null) {
            return textLayoutResult;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int intrinsicHeight(int width, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int i10 = this.f6184o;
        int i11 = this.f6185p;
        if (width == i10 && i10 != -1) {
            return i11;
        }
        int iCeilToIntPx = TextDelegateKt.ceilToIntPx(a(ConstraintsKt.Constraints(0, width, 0, Integer.MAX_VALUE), layoutDirection).getHeight());
        this.f6184o = width;
        this.f6185p = iCeilToIntPx;
        return iCeilToIntPx;
    }

    /* JADX INFO: renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m579layoutWithConstraintsK40F9xA(long constraints, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (this.f6177g > 1) {
            MinLinesConstrainer.Companion companion = MinLinesConstrainer.INSTANCE;
            MinLinesConstrainer minLinesConstrainer = this.f6179i;
            TextStyle textStyle = this.f6172b;
            Density density = this.density;
            Intrinsics.checkNotNull(density);
            MinLinesConstrainer minLinesConstrainerFrom = companion.from(minLinesConstrainer, layoutDirection, textStyle, density, this.f6173c);
            this.f6179i = minLinesConstrainerFrom;
            constraints = minLinesConstrainerFrom.m577coerceMinLinesOh53vG4$foundation_release(constraints, this.f6177g);
        }
        TextLayoutResult textLayoutResult = this.f6183n;
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || layoutDirection != textLayoutResult.getLayoutInput().getLayoutDirection() || (!Constraints.m4351equalsimpl0(constraints, textLayoutResult.getLayoutInput().getConstraints()) && (Constraints.m4357getMaxWidthimpl(constraints) != Constraints.m4357getMaxWidthimpl(textLayoutResult.getLayoutInput().getConstraints()) || Constraints.m4356getMaxHeightimpl(constraints) < textLayoutResult.getMultiParagraph().getHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines()))) {
            this.f6183n = c(layoutDirection, constraints, a(constraints, layoutDirection));
            return true;
        }
        TextLayoutResult textLayoutResult2 = this.f6183n;
        Intrinsics.checkNotNull(textLayoutResult2);
        if (Constraints.m4351equalsimpl0(constraints, textLayoutResult2.getLayoutInput().getConstraints())) {
            return false;
        }
        TextLayoutResult textLayoutResult3 = this.f6183n;
        Intrinsics.checkNotNull(textLayoutResult3);
        this.f6183n = c(layoutDirection, constraints, textLayoutResult3.getMultiParagraph());
        return true;
    }

    public final int maxIntrinsicWidth(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return TextDelegateKt.ceilToIntPx(b(layoutDirection).getMaxIntrinsicWidth());
    }

    public final int minIntrinsicWidth(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return TextDelegateKt.ceilToIntPx(b(layoutDirection).getMinIntrinsicWidth());
    }

    public final void setDensity$foundation_release(@Nullable Density density) {
        Density density2 = this.density;
        long jM565constructorimpl = density != null ? InlineDensity.m565constructorimpl(density) : InlineDensity.INSTANCE.m573getUnspecifiedL26CHvs();
        if (density2 == null) {
            this.density = density;
            this.f6180j = jM565constructorimpl;
        } else if (density == null || !InlineDensity.m567equalsimpl0(this.f6180j, jM565constructorimpl)) {
            this.density = density;
            this.f6180j = jM565constructorimpl;
            this.f6182l = null;
            this.f6183n = null;
        }
    }

    /* JADX INFO: renamed from: update-ZNqEYIc, reason: not valid java name */
    public final void m580updateZNqEYIc(@NotNull AnnotatedString text, @NotNull TextStyle style, @NotNull FontFamily.Resolver fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines, @Nullable List<AnnotatedString.Range<Placeholder>> placeholders) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        this.f6171a = text;
        this.f6172b = style;
        this.f6173c = fontFamilyResolver;
        this.f6174d = overflow;
        this.f6175e = softWrap;
        this.f6176f = maxLines;
        this.f6177g = minLines;
        this.f6178h = placeholders;
        this.f6182l = null;
        this.f6183n = null;
    }

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i10, boolean z10, int i11, int i12, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, (i13 & 8) != 0 ? TextOverflow.INSTANCE.m4343getClipgIe3tQ8() : i10, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? Integer.MAX_VALUE : i11, (i13 & 64) != 0 ? 1 : i12, (i13 & 128) != 0 ? null : list, null);
    }
}
