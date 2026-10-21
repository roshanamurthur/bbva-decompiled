package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Typography.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\" \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", "a", "Landroidx/compose/ui/text/TextStyle;", "getDefaultTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "DefaultTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Typography;", "b", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalTypography", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTypography", "material_release"}, k = 2, mv = {1, 8, 0})
public final class TypographyKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final TextStyle f8354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<Typography> f8355b;

    /* JADX INFO: compiled from: Typography.kt */
    public static final class a extends Lambda implements Function0<Typography> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f8356p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Typography invoke() {
            return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }
    }

    static {
        TextStyle textStyle = TextStyle.INSTANCE.getDefault();
        f8354a = textStyle.m3985copyv2rsoow((16252927 & 1) != 0 ? textStyle.spanStyle.m3927getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? textStyle.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : 0L, (16252927 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : null, (16252927 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (16252927 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? textStyle.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : null, (16252927 & 32768) != 0 ? textStyle.paragraphStyle.getTextAlign() : null, (16252927 & 65536) != 0 ? textStyle.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? textStyle.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? textStyle.platformStyle : DefaultPlatformTextStyle_androidKt.defaultPlatformTextStyle(), (16252927 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? textStyle.paragraphStyle.getLineBreak() : null, (16252927 & 4194304) != 0 ? textStyle.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? textStyle.paragraphStyle.getTextMotion() : null);
        f8355b = CompositionLocalKt.staticCompositionLocalOf(a.f8356p0);
    }

    public static final TextStyle access$withDefaultFontFamily(TextStyle textStyle, FontFamily fontFamily) {
        return textStyle.getFontFamily() != null ? textStyle : textStyle.m3985copyv2rsoow((16252927 & 1) != 0 ? textStyle.spanStyle.m3927getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? textStyle.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily, (16252927 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : 0L, (16252927 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : null, (16252927 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (16252927 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? textStyle.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : null, (16252927 & 32768) != 0 ? textStyle.paragraphStyle.getTextAlign() : null, (16252927 & 65536) != 0 ? textStyle.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? textStyle.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? textStyle.platformStyle : null, (16252927 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? textStyle.paragraphStyle.getLineBreak() : null, (16252927 & 4194304) != 0 ? textStyle.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? textStyle.paragraphStyle.getTextMotion() : null);
    }

    @NotNull
    public static final TextStyle getDefaultTextStyle() {
        return f8354a;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Typography> getLocalTypography() {
        return f8355b;
    }
}
