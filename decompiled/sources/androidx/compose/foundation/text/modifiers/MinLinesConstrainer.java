package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MinLinesConstrainer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!J%\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "", "Landroidx/compose/ui/unit/Constraints;", "inConstraints", "", "minLines", "coerceMinLines-Oh53vG4$foundation_release", "(JI)J", "coerceMinLines", "Landroidx/compose/ui/unit/LayoutDirection;", "a", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/TextStyle;", "b", "Landroidx/compose/ui/text/TextStyle;", "getInputTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "inputTextStyle", "Landroidx/compose/ui/unit/Density;", "c", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "d", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class MinLinesConstrainer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static MinLinesConstrainer f6161h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextStyle inputTextStyle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Density density;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FontFamily.Resolver fontFamilyResolver;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TextStyle f6166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f6167f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f6168g = Float.NaN;

    /* JADX INFO: compiled from: MinLinesConstrainer.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer$Companion;", "", "()V", "last", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "from", "minMaxUtil", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "paramStyle", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MinLinesConstrainer from(@Nullable MinLinesConstrainer minMaxUtil, @NotNull LayoutDirection layoutDirection, @NotNull TextStyle paramStyle, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(paramStyle, "paramStyle");
            Intrinsics.checkNotNullParameter(density, "density");
            Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
            if (minMaxUtil != null && layoutDirection == minMaxUtil.getLayoutDirection() && Intrinsics.areEqual(paramStyle, minMaxUtil.getInputTextStyle()) && density.getDensity() == minMaxUtil.getDensity().getDensity() && fontFamilyResolver == minMaxUtil.getFontFamilyResolver()) {
                return minMaxUtil;
            }
            MinLinesConstrainer minLinesConstrainer = MinLinesConstrainer.f6161h;
            if (minLinesConstrainer != null && layoutDirection == minLinesConstrainer.getLayoutDirection() && Intrinsics.areEqual(paramStyle, minLinesConstrainer.getInputTextStyle()) && density.getDensity() == minLinesConstrainer.getDensity().getDensity() && fontFamilyResolver == minLinesConstrainer.getFontFamilyResolver()) {
                return minLinesConstrainer;
            }
            MinLinesConstrainer minLinesConstrainer2 = new MinLinesConstrainer(layoutDirection, TextStyleKt.resolveDefaults(paramStyle, layoutDirection), density, fontFamilyResolver, null);
            MinLinesConstrainer.f6161h = minLinesConstrainer2;
            return minLinesConstrainer2;
        }
    }

    public MinLinesConstrainer(LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver, DefaultConstructorMarker defaultConstructorMarker) {
        this.layoutDirection = layoutDirection;
        this.inputTextStyle = textStyle;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.f6166e = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
    }

    /* JADX INFO: renamed from: coerceMinLines-Oh53vG4$foundation_release, reason: not valid java name */
    public final long m577coerceMinLinesOh53vG4$foundation_release(long inConstraints, int minLines) {
        float height = this.f6168g;
        float height2 = this.f6167f;
        if (Float.isNaN(height) || Float.isNaN(height2)) {
            height = ParagraphKt.m3876ParagraphUdtVg6A(MinLinesConstrainerKt.f6169a, this.f6166e, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, (96 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null, (96 & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null, (96 & 128) != 0 ? Integer.MAX_VALUE : 1, (96 & 256) != 0 ? false : false).getHeight();
            height2 = ParagraphKt.m3876ParagraphUdtVg6A(MinLinesConstrainerKt.f6170b, this.f6166e, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, (96 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null, (96 & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null, (96 & 128) != 0 ? Integer.MAX_VALUE : 2, (96 & 256) != 0 ? false : false).getHeight() - height;
            this.f6168g = height;
            this.f6167f = height2;
        }
        return ConstraintsKt.Constraints(Constraints.m4359getMinWidthimpl(inConstraints), Constraints.m4357getMaxWidthimpl(inConstraints), minLines != 1 ? c.coerceAtMost(c.coerceAtLeast(mk.c.roundToInt((height2 * (minLines - 1)) + height), 0), Constraints.m4356getMaxHeightimpl(inConstraints)) : Constraints.m4358getMinHeightimpl(inConstraints), Constraints.m4356getMaxHeightimpl(inConstraints));
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    @NotNull
    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    @NotNull
    public final TextStyle getInputTextStyle() {
        return this.inputTextStyle;
    }

    @NotNull
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }
}
