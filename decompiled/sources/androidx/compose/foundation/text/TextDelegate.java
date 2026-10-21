package androidx.compose.foundation.text;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 U2\u00020\u0001:\u0001UBh\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019\u0012\b\b\u0002\u0010!\u001a\u00020\u0019\u0012\b\b\u0002\u0010'\u001a\u00020\"\u0012\b\b\u0002\u0010+\u001a\u00020(\u0012\u0006\u00101\u001a\u00020,\u0012\u0006\u00107\u001a\u000202\u0012\u0014\b\u0002\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0908ø\u0001\u0001¢\u0006\u0004\bS\u0010TJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J/\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010!\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010+\u001a\u00020(8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010\u001dR\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R#\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:09088\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R$\u0010G\u001a\u0004\u0018\u00010@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010N\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0011\u0010P\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bO\u0010\u001dR\u0011\u0010R\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bQ\u0010\u001d\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006V"}, d2 = {"Landroidx/compose/foundation/text/TextDelegate;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "layoutIntrinsics", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/text/TextLayoutResult;", "prevResult", "layout-NN6Ew-U", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/ui/text/TextLayoutResult;", PluginUtils.IDENTIFIER_LAYOUT, "Landroidx/compose/ui/text/AnnotatedString;", "a", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "b", "Landroidx/compose/ui/text/TextStyle;", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "style", "", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMaxLines", "()I", "maxLines", "d", "getMinLines", "minLines", "", "e", "Z", "getSoftWrap", "()Z", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "f", "getOverflow-gIe3tQ8", "overflow", "Landroidx/compose/ui/unit/Density;", "g", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "h", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "i", "Ljava/util/List;", "getPlaceholders", "()Ljava/util/List;", "placeholders", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "j", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getParagraphIntrinsics$foundation_release", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "setParagraphIntrinsics$foundation_release", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;)V", "paragraphIntrinsics", "k", "Landroidx/compose/ui/unit/LayoutDirection;", "getIntrinsicsLayoutDirection$foundation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setIntrinsicsLayoutDirection$foundation_release", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "intrinsicsLayoutDirection", "getMinIntrinsicWidth", "minIntrinsicWidth", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IIZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@InternalFoundationTextApi
public final class TextDelegate {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnnotatedString text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextStyle style;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int maxLines;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int minLines;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean softWrap;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int overflow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Density density;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FontFamily.Resolver fontFamilyResolver;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<AnnotatedString.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MultiParagraphIntrinsics paragraphIntrinsics;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public LayoutDirection intrinsicsLayoutDirection;

    /* JADX INFO: compiled from: TextDelegate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/TextDelegate$Companion;", "", "()V", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void paint(@NotNull Canvas canvas, @NotNull TextLayoutResult textLayoutResult) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }
    }

    public TextDelegate() {
        throw null;
    }

    public TextDelegate(AnnotatedString text, TextStyle style, int i10, int i11, boolean z10, int i12, Density density, FontFamily.Resolver fontFamilyResolver, List placeholders, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        this.text = text;
        this.style = style;
        this.maxLines = i10;
        this.minLines = i11;
        this.softWrap = z10;
        this.overflow = i12;
        this.density = density;
        this.fontFamilyResolver = fontFamilyResolver;
        this.placeholders = placeholders;
        if (i10 <= 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i11 <= 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i11 > i10) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX INFO: renamed from: layout-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m533layoutNN6EwU$default(TextDelegate textDelegate, long j10, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            textLayoutResult = null;
        }
        return textDelegate.m535layoutNN6EwU(j10, layoutDirection, textLayoutResult);
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    @NotNull
    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    @Nullable
    /* JADX INFO: renamed from: getIntrinsicsLayoutDirection$foundation_release, reason: from getter */
    public final LayoutDirection getIntrinsicsLayoutDirection() {
        return this.intrinsicsLayoutDirection;
    }

    public final int getMaxIntrinsicWidth() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics != null) {
            return TextDelegateKt.ceilToIntPx(multiParagraphIntrinsics.getMaxIntrinsicWidth());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getMinIntrinsicWidth() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics != null) {
            return TextDelegateKt.ceilToIntPx(multiParagraphIntrinsics.getMinIntrinsicWidth());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public final int getMinLines() {
        return this.minLines;
    }

    /* JADX INFO: renamed from: getOverflow-gIe3tQ8, reason: not valid java name and from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    @Nullable
    /* JADX INFO: renamed from: getParagraphIntrinsics$foundation_release, reason: from getter */
    public final MultiParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    @NotNull
    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    @NotNull
    public final TextStyle getStyle() {
        return this.style;
    }

    @NotNull
    public final AnnotatedString getText() {
        return this.text;
    }

    @NotNull
    /* JADX INFO: renamed from: layout-NN6Ew-U, reason: not valid java name */
    public final TextLayoutResult m535layoutNN6EwU(long constraints, @NotNull LayoutDirection layoutDirection, @Nullable TextLayoutResult prevResult) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (prevResult != null && TextLayoutHelperKt.m558canReuse7_7YC6M(prevResult, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, constraints)) {
            return prevResult.m3939copyO0kMr_c(new TextLayoutInput(prevResult.getLayoutInput().getText(), this.style, prevResult.getLayoutInput().getPlaceholders(), prevResult.getLayoutInput().getMaxLines(), prevResult.getLayoutInput().getSoftWrap(), prevResult.getLayoutInput().getOverflow(), prevResult.getLayoutInput().getDensity(), prevResult.getLayoutInput().getLayoutDirection(), prevResult.getLayoutInput().getFontFamilyResolver(), constraints, (DefaultConstructorMarker) null), ConstraintsKt.m4368constrain4WqzIAM(constraints, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(prevResult.getMultiParagraph().getWidth()), TextDelegateKt.ceilToIntPx(prevResult.getMultiParagraph().getHeight()))));
        }
        layoutIntrinsics(layoutDirection);
        int iM4359getMinWidthimpl = Constraints.m4359getMinWidthimpl(constraints);
        int i10 = this.overflow;
        boolean z10 = this.softWrap;
        int iM4357getMaxWidthimpl = ((z10 || TextOverflow.m4336equalsimpl0(i10, TextOverflow.INSTANCE.m4344getEllipsisgIe3tQ8())) && Constraints.m4353getHasBoundedWidthimpl(constraints)) ? Constraints.m4357getMaxWidthimpl(constraints) : Integer.MAX_VALUE;
        int i11 = (z10 || !TextOverflow.m4336equalsimpl0(i10, TextOverflow.INSTANCE.m4344getEllipsisgIe3tQ8())) ? this.maxLines : 1;
        if (iM4359getMinWidthimpl != iM4357getMaxWidthimpl) {
            iM4357getMaxWidthimpl = kotlin.ranges.c.coerceIn(getMaxIntrinsicWidth(), iM4359getMinWidthimpl, iM4357getMaxWidthimpl);
        }
        int i12 = iM4357getMaxWidthimpl;
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null) {
            throw new IllegalStateException("layoutIntrinsics must be called first");
        }
        MultiParagraph multiParagraph = new MultiParagraph(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, i12, 0, Constraints.m4356getMaxHeightimpl(constraints), 5, null), i11, TextOverflow.m4336equalsimpl0(i10, TextOverflow.INSTANCE.m4344getEllipsisgIe3tQ8()), null);
        return new TextLayoutResult(new TextLayoutInput(this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, constraints, (DefaultConstructorMarker) null), multiParagraph, ConstraintsKt.m4368constrain4WqzIAM(constraints, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(multiParagraph.getWidth()), TextDelegateKt.ceilToIntPx(multiParagraph.getHeight()))), null);
    }

    public final void layoutIntrinsics(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.text, TextStyleKt.resolveDefaults(this.style, layoutDirection), this.placeholders, this.density, this.fontFamilyResolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    public final void setIntrinsicsLayoutDirection$foundation_release(@Nullable LayoutDirection layoutDirection) {
        this.intrinsicsLayoutDirection = layoutDirection;
    }

    public final void setParagraphIntrinsics$foundation_release(@Nullable MultiParagraphIntrinsics multiParagraphIntrinsics) {
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i10, int i11, boolean z10, int i12, Density density, FontFamily.Resolver resolver, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (i13 & 4) != 0 ? Integer.MAX_VALUE : i10, (i13 & 8) != 0 ? 1 : i11, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? TextOverflow.INSTANCE.m4343getClipgIe3tQ8() : i12, density, resolver, (i13 & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, null);
    }
}
