package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphIntrinsicsKt;
import androidx.compose.ui.text.ParagraphKt;
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
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ParagraphLayoutCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001BJ\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\nø\u0001\u0001¢\u0006\u0004\bC\u0010DJ#\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004JK\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004R.\u0010(\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010 8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u00100\u001a\u0004\u0018\u00010)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00107\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R+\u0010?\u001a\u0002088\u0000@\u0000X\u0080\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006E"}, d2 = {"Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "layoutWithConstraints-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Z", "layoutWithConstraints", "", "width", "intrinsicHeight", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "softWrap", "maxLines", "minLines", "", "update-L6sJoHM", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZII)V", "update", "Landroidx/compose/ui/text/TextLayoutResult;", "slowCreateTextLayoutResultOrNull", "minIntrinsicWidth", "maxIntrinsicWidth", "Landroidx/compose/ui/unit/Density;", "value", "i", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/ui/text/Paragraph;", "j", "Landroidx/compose/ui/text/Paragraph;", "getParagraph$foundation_release", "()Landroidx/compose/ui/text/Paragraph;", "setParagraph$foundation_release", "(Landroidx/compose/ui/text/Paragraph;)V", "paragraph", "k", "Z", "getDidOverflow$foundation_release", "()Z", "setDidOverflow$foundation_release", "(Z)V", "didOverflow", "Landroidx/compose/ui/unit/IntSize;", "l", "J", "getLayoutSize-YbymL2g$foundation_release", "()J", "setLayoutSize-ozmzZPI$foundation_release", "(J)V", "layoutSize", "getObserveFontChanges$foundation_release", "()Lkotlin/Unit;", "observeFontChanges", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/ParagraphLayoutCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n1#2:391\n*E\n"})
public final class ParagraphLayoutCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f6186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public TextStyle f6187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public FontFamily.Resolver f6188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f6193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Density density;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Paragraph paragraph;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean didOverflow;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public long layoutSize;

    @Nullable
    public MinLinesConstrainer m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public ParagraphIntrinsics f6198n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public LayoutDirection f6199o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f6200p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6201q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6202r;

    public ParagraphLayoutCache(String text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int i10, boolean z10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        this.f6186a = text;
        this.f6187b = style;
        this.f6188c = fontFamilyResolver;
        this.f6189d = i10;
        this.f6190e = z10;
        this.f6191f = i11;
        this.f6192g = i12;
        this.f6193h = InlineDensity.INSTANCE.m573getUnspecifiedL26CHvs();
        this.layoutSize = IntSizeKt.IntSize(0, 0);
        this.f6200p = Constraints.INSTANCE.m4365fixedJhjzzOo(0, 0);
        this.f6201q = -1;
        this.f6202r = -1;
    }

    public final Paragraph a(long j10, LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsicsB = b(layoutDirection);
        return ParagraphKt.m3878Paragraph_EkL_Y(paragraphIntrinsicsB, LayoutUtilsKt.m574finalConstraintstfFHcEY(j10, this.f6190e, this.f6189d, paragraphIntrinsicsB.getMaxIntrinsicWidth()), LayoutUtilsKt.m575finalMaxLinesxdlQI24(this.f6190e, this.f6189d, this.f6191f), TextOverflow.m4336equalsimpl0(this.f6189d, TextOverflow.INSTANCE.m4344getEllipsisgIe3tQ8()));
    }

    public final ParagraphIntrinsics b(LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsicsParagraphIntrinsics$default = this.f6198n;
        if (paragraphIntrinsicsParagraphIntrinsics$default == null || layoutDirection != this.f6199o || paragraphIntrinsicsParagraphIntrinsics$default.getHasStaleResolvedFonts()) {
            this.f6199o = layoutDirection;
            String str = this.f6186a;
            TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(this.f6187b, layoutDirection);
            Density density = this.density;
            Intrinsics.checkNotNull(density);
            paragraphIntrinsicsParagraphIntrinsics$default = ParagraphIntrinsicsKt.ParagraphIntrinsics$default(str, textStyleResolveDefaults, (List) null, (List) null, density, this.f6188c, 12, (Object) null);
        }
        this.f6198n = paragraphIntrinsicsParagraphIntrinsics$default;
        return paragraphIntrinsicsParagraphIntrinsics$default;
    }

    @Nullable
    /* JADX INFO: renamed from: getDensity$foundation_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: getDidOverflow$foundation_release, reason: from getter */
    public final boolean getDidOverflow() {
        return this.didOverflow;
    }

    /* JADX INFO: renamed from: getLayoutSize-YbymL2g$foundation_release, reason: not valid java name and from getter */
    public final long getLayoutSize() {
        return this.layoutSize;
    }

    @NotNull
    public final Unit getObserveFontChanges$foundation_release() {
        ParagraphIntrinsics paragraphIntrinsics = this.f6198n;
        if (paragraphIntrinsics != null) {
            paragraphIntrinsics.getHasStaleResolvedFonts();
        }
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: getParagraph$foundation_release, reason: from getter */
    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    public final int intrinsicHeight(int width, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int i10 = this.f6201q;
        int i11 = this.f6202r;
        if (width == i10 && i10 != -1) {
            return i11;
        }
        int iCeilToIntPx = TextDelegateKt.ceilToIntPx(a(ConstraintsKt.Constraints(0, width, 0, Integer.MAX_VALUE), layoutDirection).getHeight());
        this.f6201q = width;
        this.f6202r = iCeilToIntPx;
        return iCeilToIntPx;
    }

    /* JADX INFO: renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m582layoutWithConstraintsK40F9xA(long constraints, @NotNull LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        boolean z10 = true;
        if (this.f6192g > 1) {
            MinLinesConstrainer.Companion companion = MinLinesConstrainer.INSTANCE;
            MinLinesConstrainer minLinesConstrainer = this.m;
            TextStyle textStyle = this.f6187b;
            Density density = this.density;
            Intrinsics.checkNotNull(density);
            MinLinesConstrainer minLinesConstrainerFrom = companion.from(minLinesConstrainer, layoutDirection, textStyle, density, this.f6188c);
            this.m = minLinesConstrainerFrom;
            constraints = minLinesConstrainerFrom.m577coerceMinLinesOh53vG4$foundation_release(constraints, this.f6192g);
        }
        Paragraph paragraph = this.paragraph;
        boolean z11 = false;
        if (paragraph == null || (paragraphIntrinsics = this.f6198n) == null || paragraphIntrinsics.getHasStaleResolvedFonts() || layoutDirection != this.f6199o || (!Constraints.m4351equalsimpl0(constraints, this.f6200p) && (Constraints.m4357getMaxWidthimpl(constraints) != Constraints.m4357getMaxWidthimpl(this.f6200p) || Constraints.m4356getMaxHeightimpl(constraints) < paragraph.getHeight() || paragraph.getDidExceedMaxLines()))) {
            Paragraph paragraphA = a(constraints, layoutDirection);
            this.f6200p = constraints;
            long jM4368constrain4WqzIAM = ConstraintsKt.m4368constrain4WqzIAM(constraints, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(paragraphA.getWidth()), TextDelegateKt.ceilToIntPx(paragraphA.getHeight())));
            this.layoutSize = jM4368constrain4WqzIAM;
            if (!TextOverflow.m4336equalsimpl0(this.f6189d, TextOverflow.INSTANCE.m4345getVisiblegIe3tQ8()) && (IntSize.m4549getWidthimpl(jM4368constrain4WqzIAM) < paragraphA.getWidth() || IntSize.m4548getHeightimpl(jM4368constrain4WqzIAM) < paragraphA.getHeight())) {
                z11 = true;
            }
            this.didOverflow = z11;
            this.paragraph = paragraphA;
            return true;
        }
        if (!Constraints.m4351equalsimpl0(constraints, this.f6200p)) {
            Paragraph paragraph2 = this.paragraph;
            Intrinsics.checkNotNull(paragraph2);
            long jM4368constrain4WqzIAM2 = ConstraintsKt.m4368constrain4WqzIAM(constraints, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(paragraph2.getWidth()), TextDelegateKt.ceilToIntPx(paragraph2.getHeight())));
            this.layoutSize = jM4368constrain4WqzIAM2;
            if (TextOverflow.m4336equalsimpl0(this.f6189d, TextOverflow.INSTANCE.m4345getVisiblegIe3tQ8()) || (IntSize.m4549getWidthimpl(jM4368constrain4WqzIAM2) >= paragraph2.getWidth() && IntSize.m4548getHeightimpl(jM4368constrain4WqzIAM2) >= paragraph2.getHeight())) {
                z10 = false;
            }
            this.didOverflow = z10;
        }
        return false;
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
            this.f6193h = jM565constructorimpl;
            return;
        }
        if (density == null || !InlineDensity.m567equalsimpl0(this.f6193h, jM565constructorimpl)) {
            this.density = density;
            this.f6193h = jM565constructorimpl;
            this.paragraph = null;
            this.f6198n = null;
            this.f6199o = null;
            this.f6201q = -1;
            this.f6202r = -1;
            this.f6200p = Constraints.INSTANCE.m4365fixedJhjzzOo(0, 0);
            this.layoutSize = IntSizeKt.IntSize(0, 0);
            this.didOverflow = false;
        }
    }

    public final void setDidOverflow$foundation_release(boolean z10) {
        this.didOverflow = z10;
    }

    /* JADX INFO: renamed from: setLayoutSize-ozmzZPI$foundation_release, reason: not valid java name */
    public final void m583setLayoutSizeozmzZPI$foundation_release(long j10) {
        this.layoutSize = j10;
    }

    public final void setParagraph$foundation_release(@Nullable Paragraph paragraph) {
        this.paragraph = paragraph;
    }

    @Nullable
    public final TextLayoutResult slowCreateTextLayoutResultOrNull() {
        Density density;
        LayoutDirection layoutDirection = this.f6199o;
        if (layoutDirection == null || (density = this.density) == null) {
            return null;
        }
        AnnotatedString annotatedString = new AnnotatedString(this.f6186a, null, null, 6, null);
        if (this.paragraph == null || this.f6198n == null) {
            return null;
        }
        long jM4349copyZbe2FdA$default = Constraints.m4349copyZbe2FdA$default(this.f6200p, 0, 0, 0, 0, 10, null);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, this.f6187b, CollectionsKt__CollectionsKt.emptyList(), this.f6191f, this.f6190e, this.f6189d, density, layoutDirection, this.f6188c, jM4349copyZbe2FdA$default, (DefaultConstructorMarker) null), new MultiParagraph(new MultiParagraphIntrinsics(annotatedString, this.f6187b, (List<AnnotatedString.Range<Placeholder>>) CollectionsKt__CollectionsKt.emptyList(), density, this.f6188c), jM4349copyZbe2FdA$default, this.f6191f, TextOverflow.m4336equalsimpl0(this.f6189d, TextOverflow.INSTANCE.m4344getEllipsisgIe3tQ8()), null), this.layoutSize, null);
    }

    /* JADX INFO: renamed from: update-L6sJoHM, reason: not valid java name */
    public final void m584updateL6sJoHM(@NotNull String text, @NotNull TextStyle style, @NotNull FontFamily.Resolver fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        this.f6186a = text;
        this.f6187b = style;
        this.f6188c = fontFamilyResolver;
        this.f6189d = overflow;
        this.f6190e = softWrap;
        this.f6191f = maxLines;
        this.f6192g = minLines;
        this.paragraph = null;
        this.f6198n = null;
        this.f6199o = null;
        this.f6201q = -1;
        this.f6202r = -1;
        this.f6200p = Constraints.INSTANCE.m4365fixedJhjzzOo(0, 0);
        this.layoutSize = IntSizeKt.IntSize(0, 0);
        this.didOverflow = false;
    }

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i10, boolean z10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, (i13 & 8) != 0 ? TextOverflow.INSTANCE.m4343getClipgIe3tQ8() : i10, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? Integer.MAX_VALUE : i11, (i13 & 64) != 0 ? 1 : i12, null);
    }
}
