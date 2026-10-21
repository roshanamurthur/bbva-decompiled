package androidx.compose.ui.text;

import ad.e;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextLayoutResult.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001Bh\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0001¢\u0006\u0004\bL\u0010MBh\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010C\u001a\u00020>\u0012\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0001¢\u0006\u0004\bL\u0010NJ\u0085\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001d\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010C\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010\u0017\u001a\u00020\u00168\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010\u0015\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\bJ\u0010K\u001a\u0004\bH\u0010I\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006O"}, d2 = {"Landroidx/compose/ui/text/TextLayoutInput;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "", "maxLines", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "Landroidx/compose/ui/unit/Constraints;", "constraints", "copy-hu-1Yfo", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/Font$ResourceLoader;J)Landroidx/compose/ui/text/TextLayoutInput;", "copy", "other", "equals", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "b", "Landroidx/compose/ui/text/TextStyle;", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "c", "Ljava/util/List;", "getPlaceholders", "()Ljava/util/List;", "d", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMaxLines", "()I", "e", "Z", "getSoftWrap", "()Z", "f", "getOverflow-gIe3tQ8", "g", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "h", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "i", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "j", "J", "getConstraints-msEJaDk", "()J", "getResourceLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getResourceLoader$annotations", "()V", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/Font$ResourceLoader;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class TextLayoutInput {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnnotatedString text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextStyle style;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<AnnotatedString.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int maxLines;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean softWrap;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int overflow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Density density;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FontFamily.Resolver fontFamilyResolver;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final long constraints;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final Font.ResourceLoader f17756k;

    public TextLayoutInput() {
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Font.ResourceLoader is replaced with FontFamily.Resolver", replaceWith = @ReplaceWith(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints", imports = {}))
    public TextLayoutInput(AnnotatedString text, TextStyle style, List placeholders, int i10, boolean z10, int i11, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(text, style, (List<AnnotatedString.Range<Placeholder>>) placeholders, i10, z10, i11, density, layoutDirection, resourceLoader, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader), j10);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
    }

    @Deprecated(message = "Font.ResourceLoader is deprecated", replaceWith = @ReplaceWith(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overFlow, density, layoutDirection, fontFamilyResolver, constraints)", imports = {}))
    @NotNull
    /* JADX INFO: renamed from: copy-hu-1Yfo, reason: not valid java name */
    public final TextLayoutInput m3935copyhu1Yfo(@NotNull AnnotatedString text, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, int maxLines, boolean softWrap, int overflow, @NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull Font.ResourceLoader resourceLoader, long constraints) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
        return new TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, resourceLoader, this.fontFamilyResolver, constraints);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = (TextLayoutInput) other;
        return Intrinsics.areEqual(this.text, textLayoutInput.text) && Intrinsics.areEqual(this.style, textLayoutInput.style) && Intrinsics.areEqual(this.placeholders, textLayoutInput.placeholders) && this.maxLines == textLayoutInput.maxLines && this.softWrap == textLayoutInput.softWrap && TextOverflow.m4336equalsimpl0(this.overflow, textLayoutInput.overflow) && Intrinsics.areEqual(this.density, textLayoutInput.density) && this.layoutDirection == textLayoutInput.layoutDirection && Intrinsics.areEqual(this.fontFamilyResolver, textLayoutInput.fontFamilyResolver) && Constraints.m4351equalsimpl0(this.constraints, textLayoutInput.constraints);
    }

    /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getConstraints() {
        return this.constraints;
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
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: getOverflow-gIe3tQ8, reason: not valid java name and from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    @NotNull
    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    @NotNull
    public final Font.ResourceLoader getResourceLoader() {
        Font.ResourceLoader resourceLoader = this.f17756k;
        return resourceLoader == null ? DeprecatedBridgeFontResourceLoader.f17603b.from(this.fontFamilyResolver) : resourceLoader;
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

    public int hashCode() {
        return Constraints.m4360hashCodeimpl(this.constraints) + ((this.fontFamilyResolver.hashCode() + ((this.layoutDirection.hashCode() + ((this.density.hashCode() + ((TextOverflow.m4337hashCodeimpl(this.overflow) + ((((a.a(this.placeholders, e.b(this.style, this.text.hashCode() * 31, 31), 31) + this.maxLines) * 31) + (this.softWrap ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.text) + ", style=" + this.style + ", placeholders=" + this.placeholders + ", maxLines=" + this.maxLines + ", softWrap=" + this.softWrap + ", overflow=" + ((Object) TextOverflow.m4338toStringimpl(this.overflow)) + ", density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.m4362toStringimpl(this.constraints)) + RootService.CLOSE_BRACKET;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextLayoutInput(AnnotatedString text, TextStyle style, List placeholders, int i10, boolean z10, int i11, Density density, LayoutDirection layoutDirection, FontFamily.Resolver fontFamilyResolver, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(text, style, (List<AnnotatedString.Range<Placeholder>>) placeholders, i10, z10, i11, density, layoutDirection, (Font.ResourceLoader) null, fontFamilyResolver, j10);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
    }

    public TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i10, boolean z10, int i11, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, FontFamily.Resolver resolver, long j10) {
        this.text = annotatedString;
        this.style = textStyle;
        this.placeholders = list;
        this.maxLines = i10;
        this.softWrap = z10;
        this.overflow = i11;
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.fontFamilyResolver = resolver;
        this.constraints = j10;
        this.f17756k = resourceLoader;
    }

    @Deprecated(message = "Replaced with FontFamily.Resolver", replaceWith = @ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void getResourceLoader$annotations() {
    }
}
