package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyTokens;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextStyle;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Typography.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\b\u0007\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b:\u0010;J\u009c\u0001\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001b\u001a\u0004\b-\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u001b\u001a\u0004\b/\u0010\u001dR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u001b\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u001b\u001a\u0004\b3\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\u001b\u001a\u0004\b5\u0010\u001dR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\u001b\u001a\u0004\b7\u0010\u001dR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u001b\u001a\u0004\b9\u0010\u001d¨\u0006<"}, d2 = {"Landroidx/compose/material3/Typography;", "", "Landroidx/compose/ui/text/TextStyle;", "displayLarge", "displayMedium", "displaySmall", "headlineLarge", "headlineMedium", "headlineSmall", "titleLarge", "titleMedium", "titleSmall", "bodyLarge", "bodyMedium", "bodySmall", "labelLarge", "labelMedium", "labelSmall", "copy", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", "Landroidx/compose/ui/text/TextStyle;", "getDisplayLarge", "()Landroidx/compose/ui/text/TextStyle;", "b", "getDisplayMedium", "c", "getDisplaySmall", "d", "getHeadlineLarge", "e", "getHeadlineMedium", "f", "getHeadlineSmall", "g", "getTitleLarge", "h", "getTitleMedium", "i", "getTitleSmall", "j", "getBodyLarge", "k", "getBodyMedium", "l", "getBodySmall", "m", "getLabelLarge", "n", "getLabelMedium", "o", "getLabelSmall", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class Typography {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextStyle displayLarge;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextStyle displayMedium;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextStyle displaySmall;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextStyle headlineLarge;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextStyle headlineMedium;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextStyle headlineSmall;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextStyle titleLarge;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextStyle titleMedium;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextStyle titleSmall;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextStyle bodyLarge;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextStyle bodyMedium;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextStyle bodySmall;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final TextStyle labelLarge;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextStyle labelMedium;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextStyle labelSmall;

    public Typography() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    @NotNull
    public final Typography copy(@NotNull TextStyle displayLarge, @NotNull TextStyle displayMedium, @NotNull TextStyle displaySmall, @NotNull TextStyle headlineLarge, @NotNull TextStyle headlineMedium, @NotNull TextStyle headlineSmall, @NotNull TextStyle titleLarge, @NotNull TextStyle titleMedium, @NotNull TextStyle titleSmall, @NotNull TextStyle bodyLarge, @NotNull TextStyle bodyMedium, @NotNull TextStyle bodySmall, @NotNull TextStyle labelLarge, @NotNull TextStyle labelMedium, @NotNull TextStyle labelSmall) {
        Intrinsics.checkNotNullParameter(displayLarge, "displayLarge");
        Intrinsics.checkNotNullParameter(displayMedium, "displayMedium");
        Intrinsics.checkNotNullParameter(displaySmall, "displaySmall");
        Intrinsics.checkNotNullParameter(headlineLarge, "headlineLarge");
        Intrinsics.checkNotNullParameter(headlineMedium, "headlineMedium");
        Intrinsics.checkNotNullParameter(headlineSmall, "headlineSmall");
        Intrinsics.checkNotNullParameter(titleLarge, "titleLarge");
        Intrinsics.checkNotNullParameter(titleMedium, "titleMedium");
        Intrinsics.checkNotNullParameter(titleSmall, "titleSmall");
        Intrinsics.checkNotNullParameter(bodyLarge, "bodyLarge");
        Intrinsics.checkNotNullParameter(bodyMedium, "bodyMedium");
        Intrinsics.checkNotNullParameter(bodySmall, "bodySmall");
        Intrinsics.checkNotNullParameter(labelLarge, "labelLarge");
        Intrinsics.checkNotNullParameter(labelMedium, "labelMedium");
        Intrinsics.checkNotNullParameter(labelSmall, "labelSmall");
        return new Typography(displayLarge, displayMedium, displaySmall, headlineLarge, headlineMedium, headlineSmall, titleLarge, titleMedium, titleSmall, bodyLarge, bodyMedium, bodySmall, labelLarge, labelMedium, labelSmall);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) other;
        return Intrinsics.areEqual(this.displayLarge, typography.displayLarge) && Intrinsics.areEqual(this.displayMedium, typography.displayMedium) && Intrinsics.areEqual(this.displaySmall, typography.displaySmall) && Intrinsics.areEqual(this.headlineLarge, typography.headlineLarge) && Intrinsics.areEqual(this.headlineMedium, typography.headlineMedium) && Intrinsics.areEqual(this.headlineSmall, typography.headlineSmall) && Intrinsics.areEqual(this.titleLarge, typography.titleLarge) && Intrinsics.areEqual(this.titleMedium, typography.titleMedium) && Intrinsics.areEqual(this.titleSmall, typography.titleSmall) && Intrinsics.areEqual(this.bodyLarge, typography.bodyLarge) && Intrinsics.areEqual(this.bodyMedium, typography.bodyMedium) && Intrinsics.areEqual(this.bodySmall, typography.bodySmall) && Intrinsics.areEqual(this.labelLarge, typography.labelLarge) && Intrinsics.areEqual(this.labelMedium, typography.labelMedium) && Intrinsics.areEqual(this.labelSmall, typography.labelSmall);
    }

    @NotNull
    public final TextStyle getBodyLarge() {
        return this.bodyLarge;
    }

    @NotNull
    public final TextStyle getBodyMedium() {
        return this.bodyMedium;
    }

    @NotNull
    public final TextStyle getBodySmall() {
        return this.bodySmall;
    }

    @NotNull
    public final TextStyle getDisplayLarge() {
        return this.displayLarge;
    }

    @NotNull
    public final TextStyle getDisplayMedium() {
        return this.displayMedium;
    }

    @NotNull
    public final TextStyle getDisplaySmall() {
        return this.displaySmall;
    }

    @NotNull
    public final TextStyle getHeadlineLarge() {
        return this.headlineLarge;
    }

    @NotNull
    public final TextStyle getHeadlineMedium() {
        return this.headlineMedium;
    }

    @NotNull
    public final TextStyle getHeadlineSmall() {
        return this.headlineSmall;
    }

    @NotNull
    public final TextStyle getLabelLarge() {
        return this.labelLarge;
    }

    @NotNull
    public final TextStyle getLabelMedium() {
        return this.labelMedium;
    }

    @NotNull
    public final TextStyle getLabelSmall() {
        return this.labelSmall;
    }

    @NotNull
    public final TextStyle getTitleLarge() {
        return this.titleLarge;
    }

    @NotNull
    public final TextStyle getTitleMedium() {
        return this.titleMedium;
    }

    @NotNull
    public final TextStyle getTitleSmall() {
        return this.titleSmall;
    }

    public int hashCode() {
        return this.labelSmall.hashCode() + ad.e.b(this.labelMedium, ad.e.b(this.labelLarge, ad.e.b(this.bodySmall, ad.e.b(this.bodyMedium, ad.e.b(this.bodyLarge, ad.e.b(this.titleSmall, ad.e.b(this.titleMedium, ad.e.b(this.titleLarge, ad.e.b(this.headlineSmall, ad.e.b(this.headlineMedium, ad.e.b(this.headlineLarge, ad.e.b(this.displaySmall, ad.e.b(this.displayMedium, this.displayLarge.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        return "Typography(displayLarge=" + this.displayLarge + ", displayMedium=" + this.displayMedium + ",displaySmall=" + this.displaySmall + ", headlineLarge=" + this.headlineLarge + ", headlineMedium=" + this.headlineMedium + ", headlineSmall=" + this.headlineSmall + ", titleLarge=" + this.titleLarge + ", titleMedium=" + this.titleMedium + ", titleSmall=" + this.titleSmall + ", bodyLarge=" + this.bodyLarge + ", bodyMedium=" + this.bodyMedium + ", bodySmall=" + this.bodySmall + ", labelLarge=" + this.labelLarge + ", labelMedium=" + this.labelMedium + ", labelSmall=" + this.labelSmall + RootService.CLOSE_BRACKET;
    }

    public Typography(@NotNull TextStyle displayLarge, @NotNull TextStyle displayMedium, @NotNull TextStyle displaySmall, @NotNull TextStyle headlineLarge, @NotNull TextStyle headlineMedium, @NotNull TextStyle headlineSmall, @NotNull TextStyle titleLarge, @NotNull TextStyle titleMedium, @NotNull TextStyle titleSmall, @NotNull TextStyle bodyLarge, @NotNull TextStyle bodyMedium, @NotNull TextStyle bodySmall, @NotNull TextStyle labelLarge, @NotNull TextStyle labelMedium, @NotNull TextStyle labelSmall) {
        Intrinsics.checkNotNullParameter(displayLarge, "displayLarge");
        Intrinsics.checkNotNullParameter(displayMedium, "displayMedium");
        Intrinsics.checkNotNullParameter(displaySmall, "displaySmall");
        Intrinsics.checkNotNullParameter(headlineLarge, "headlineLarge");
        Intrinsics.checkNotNullParameter(headlineMedium, "headlineMedium");
        Intrinsics.checkNotNullParameter(headlineSmall, "headlineSmall");
        Intrinsics.checkNotNullParameter(titleLarge, "titleLarge");
        Intrinsics.checkNotNullParameter(titleMedium, "titleMedium");
        Intrinsics.checkNotNullParameter(titleSmall, "titleSmall");
        Intrinsics.checkNotNullParameter(bodyLarge, "bodyLarge");
        Intrinsics.checkNotNullParameter(bodyMedium, "bodyMedium");
        Intrinsics.checkNotNullParameter(bodySmall, "bodySmall");
        Intrinsics.checkNotNullParameter(labelLarge, "labelLarge");
        Intrinsics.checkNotNullParameter(labelMedium, "labelMedium");
        Intrinsics.checkNotNullParameter(labelSmall, "labelSmall");
        this.displayLarge = displayLarge;
        this.displayMedium = displayMedium;
        this.displaySmall = displaySmall;
        this.headlineLarge = headlineLarge;
        this.headlineMedium = headlineMedium;
        this.headlineSmall = headlineSmall;
        this.titleLarge = titleLarge;
        this.titleMedium = titleMedium;
        this.titleSmall = titleSmall;
        this.bodyLarge = bodyLarge;
        this.bodyMedium = bodyMedium;
        this.bodySmall = bodySmall;
        this.labelLarge = labelLarge;
        this.labelMedium = labelMedium;
        this.labelSmall = labelSmall;
    }

    public /* synthetic */ Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? TypographyTokens.INSTANCE.getDisplayLarge() : textStyle, (i10 & 2) != 0 ? TypographyTokens.INSTANCE.getDisplayMedium() : textStyle2, (i10 & 4) != 0 ? TypographyTokens.INSTANCE.getDisplaySmall() : textStyle3, (i10 & 8) != 0 ? TypographyTokens.INSTANCE.getHeadlineLarge() : textStyle4, (i10 & 16) != 0 ? TypographyTokens.INSTANCE.getHeadlineMedium() : textStyle5, (i10 & 32) != 0 ? TypographyTokens.INSTANCE.getHeadlineSmall() : textStyle6, (i10 & 64) != 0 ? TypographyTokens.INSTANCE.getTitleLarge() : textStyle7, (i10 & 128) != 0 ? TypographyTokens.INSTANCE.getTitleMedium() : textStyle8, (i10 & 256) != 0 ? TypographyTokens.INSTANCE.getTitleSmall() : textStyle9, (i10 & 512) != 0 ? TypographyTokens.INSTANCE.getBodyLarge() : textStyle10, (i10 & 1024) != 0 ? TypographyTokens.INSTANCE.getBodyMedium() : textStyle11, (i10 & 2048) != 0 ? TypographyTokens.INSTANCE.getBodySmall() : textStyle12, (i10 & 4096) != 0 ? TypographyTokens.INSTANCE.getLabelLarge() : textStyle13, (i10 & 8192) != 0 ? TypographyTokens.INSTANCE.getLabelMedium() : textStyle14, (i10 & 16384) != 0 ? TypographyTokens.INSTANCE.getLabelSmall() : textStyle15);
    }
}
