package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
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
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextMeasurer.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B)\u0012\u0006\u0010 \u001a\u00020\u0016\u0012\u0006\u0010!\u001a\u00020\u0014\u0012\u0006\u0010\"\u001a\u00020\u0012\u0012\b\b\u0002\u0010#\u001a\u00020\n¢\u0006\u0004\b$\u0010%J\u008d\u0001\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJw\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u001d2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/compose/ui/text/TextMeasurer;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "skipCache", "Landroidx/compose/ui/text/TextLayoutResult;", "measure-xDpz5zY", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IZILjava/util/List;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", "measure", "", "measure-wNUYSr0", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;IZIJLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", "fallbackFontFamilyResolver", "fallbackDensity", "fallbackLayoutDirection", "cacheSize", "<init>", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;I)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class TextMeasurer {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FontFamily.Resolver f17763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Density f17764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LayoutDirection f17765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final TextLayoutCache f17766d;

    /* JADX INFO: compiled from: TextMeasurer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/TextMeasurer$Companion;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final TextLayoutResult access$layout(Companion companion, TextLayoutInput textLayoutInput) {
            companion.getClass();
            MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(textLayoutInput.getText(), TextStyleKt.resolveDefaults(textLayoutInput.getStyle(), textLayoutInput.getLayoutDirection()), textLayoutInput.getPlaceholders(), textLayoutInput.getDensity(), textLayoutInput.getFontFamilyResolver());
            int iM4359getMinWidthimpl = Constraints.m4359getMinWidthimpl(textLayoutInput.getConstraints());
            int iM4357getMaxWidthimpl = ((textLayoutInput.getSoftWrap() || TextOverflow.m4336equalsimpl0(textLayoutInput.getOverflow(), TextOverflow.INSTANCE.m4344getEllipsisgIe3tQ8())) && Constraints.m4353getHasBoundedWidthimpl(textLayoutInput.getConstraints())) ? Constraints.m4357getMaxWidthimpl(textLayoutInput.getConstraints()) : Integer.MAX_VALUE;
            int maxLines = (textLayoutInput.getSoftWrap() || !TextOverflow.m4336equalsimpl0(textLayoutInput.getOverflow(), TextOverflow.INSTANCE.m4344getEllipsisgIe3tQ8())) ? textLayoutInput.getMaxLines() : 1;
            if (iM4359getMinWidthimpl != iM4357getMaxWidthimpl) {
                iM4357getMaxWidthimpl = c.coerceIn(ParagraphKt.ceilToInt(multiParagraphIntrinsics.getMaxIntrinsicWidth()), iM4359getMinWidthimpl, iM4357getMaxWidthimpl);
            }
            MultiParagraph multiParagraph = new MultiParagraph(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, iM4357getMaxWidthimpl, 0, Constraints.m4356getMaxHeightimpl(textLayoutInput.getConstraints()), 5, null), maxLines, TextOverflow.m4336equalsimpl0(textLayoutInput.getOverflow(), TextOverflow.INSTANCE.m4344getEllipsisgIe3tQ8()), null);
            return new TextLayoutResult(textLayoutInput, multiParagraph, ConstraintsKt.m4368constrain4WqzIAM(textLayoutInput.getConstraints(), IntSizeKt.IntSize((int) Math.ceil(multiParagraph.getWidth()), (int) Math.ceil(multiParagraph.getHeight()))), null);
        }
    }

    public TextMeasurer(@NotNull FontFamily.Resolver fallbackFontFamilyResolver, @NotNull Density fallbackDensity, @NotNull LayoutDirection fallbackLayoutDirection, int i10) {
        Intrinsics.checkNotNullParameter(fallbackFontFamilyResolver, "fallbackFontFamilyResolver");
        Intrinsics.checkNotNullParameter(fallbackDensity, "fallbackDensity");
        Intrinsics.checkNotNullParameter(fallbackLayoutDirection, "fallbackLayoutDirection");
        this.f17763a = fallbackFontFamilyResolver;
        this.f17764b = fallbackDensity;
        this.f17765c = fallbackLayoutDirection;
        this.f17766d = i10 > 0 ? new TextLayoutCache(i10) : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: measure-xDpz5zY$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m3944measurexDpz5zY$default(TextMeasurer textMeasurer, AnnotatedString annotatedString, TextStyle textStyle, int i10, boolean z10, int i11, List list, long j10, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z11, int i12, Object obj) {
        return textMeasurer.m3946measurexDpz5zY(annotatedString, (i12 & 2) != 0 ? TextStyle.INSTANCE.getDefault() : textStyle, (i12 & 4) != 0 ? TextOverflow.INSTANCE.m4343getClipgIe3tQ8() : i10, (i12 & 8) != 0 ? true : z10, (i12 & 16) != 0 ? Integer.MAX_VALUE : i11, (i12 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i12 & 64) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : j10, (i12 & 128) != 0 ? textMeasurer.f17765c : layoutDirection, (i12 & 256) != 0 ? textMeasurer.f17764b : density, (i12 & 512) != 0 ? textMeasurer.f17763a : resolver, (i12 & 1024) != 0 ? false : z11);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: measure-wNUYSr0, reason: not valid java name */
    public final TextLayoutResult m3945measurewNUYSr0(@NotNull String text, @NotNull TextStyle style, int overflow, boolean softWrap, int maxLines, long constraints, @NotNull LayoutDirection layoutDirection, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver, boolean skipCache) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        return m3944measurexDpz5zY$default(this, new AnnotatedString(text, null, null, 6, null), style, overflow, softWrap, maxLines, null, constraints, layoutDirection, density, fontFamilyResolver, skipCache, 32, null);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: measure-xDpz5zY, reason: not valid java name */
    public final TextLayoutResult m3946measurexDpz5zY(@NotNull AnnotatedString text, @NotNull TextStyle style, int overflow, boolean softWrap, int maxLines, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, long constraints, @NotNull LayoutDirection layoutDirection, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver, boolean skipCache) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        TextLayoutInput textLayoutInput = new TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints, (DefaultConstructorMarker) null);
        TextLayoutCache textLayoutCache = this.f17766d;
        TextLayoutResult textLayoutResult = (skipCache || textLayoutCache == null) ? null : textLayoutCache.get(textLayoutInput);
        if (textLayoutResult != null) {
            return textLayoutResult.m3939copyO0kMr_c(textLayoutInput, ConstraintsKt.m4368constrain4WqzIAM(constraints, IntSizeKt.IntSize(ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getWidth()), ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getHeight()))));
        }
        TextLayoutResult textLayoutResultAccess$layout = Companion.access$layout(INSTANCE, textLayoutInput);
        if (textLayoutCache != null) {
            textLayoutCache.put(textLayoutInput, textLayoutResultAccess$layout);
        }
        return textLayoutResultAccess$layout;
    }

    public /* synthetic */ TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(resolver, density, layoutDirection, (i11 & 8) != 0 ? TextMeasurerKt.access$getDefaultCacheSize$p() : i10);
    }
}
