package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.SearchBarTokens;
import androidx.compose.material3.tokens.SearchViewTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SearchBar.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b5\u00106J3\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ¡\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u008d\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fR \u0010%\u001a\u00020 8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010(\u001a\u00020 8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u0011\u0010,\u001a\u00020)8G¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010.\u001a\u00020)8G¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0011\u00100\u001a\u00020)8G¢\u0006\u0006\u001a\u0004\b/\u0010+R\u0011\u00104\u001a\u0002018G¢\u0006\u0006\u001a\u0004\b2\u00103\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00067"}, d2 = {"Landroidx/compose/material3/SearchBarDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "dividerColor", "Landroidx/compose/material3/TextFieldColors;", "inputFieldColors", "Landroidx/compose/material3/SearchBarColors;", "colors-Klgx-Pg", "(JJLandroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;", "colors", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "cursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "inputFieldColors-ITpI4ow", "(JJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "textColor", "placeholderColor", "inputFieldColors--u-KgnY", "(JJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getElevation-D9Ej5fM", "()F", "Elevation", "b", "getInputFieldHeight-D9Ej5fM", "InputFieldHeight", "Landroidx/compose/ui/graphics/Shape;", "getInputFieldShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "inputFieldShape", "getFullScreenShape", "fullScreenShape", "getDockedShape", "dockedShape", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,746:1\n76#2:747\n76#2:748\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarDefaults\n*L\n567#1:747\n605#1:748\n*E\n"})
public final class SearchBarDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final SearchBarDefaults INSTANCE = new SearchBarDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float Elevation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float InputFieldHeight;

    static {
        SearchBarTokens searchBarTokens = SearchBarTokens.INSTANCE;
        Elevation = searchBarTokens.m1923getContainerElevationD9Ej5fM();
        InputFieldHeight = searchBarTokens.m1924getContainerHeightD9Ej5fM();
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: colors-Klgx-Pg, reason: not valid java name */
    public final SearchBarColors m1228colorsKlgxPg(long j10, long j11, @Nullable TextFieldColors textFieldColors, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(701925149);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6) : j10;
        long color2 = (i11 & 2) != 0 ? ColorSchemeKt.toColor(SearchViewTokens.INSTANCE.getDividerColor(), composer, 6) : j11;
        TextFieldColors textFieldColorsM1232inputFieldColorsITpI4ow = (i11 & 4) != 0 ? m1232inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, (i10 << 3) & 57344, 16383) : textFieldColors;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(701925149, i10, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.kt:525)");
        }
        SearchBarColors searchBarColors = new SearchBarColors(color, color2, textFieldColorsM1232inputFieldColorsITpI4ow, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return searchBarColors;
    }

    @Composable
    @JvmName(name = "getDockedShape")
    @NotNull
    public final Shape getDockedShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1447354121);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1447354121, i10, -1, "androidx.compose.material3.SearchBarDefaults.<get-dockedShape> (SearchBar.kt:511)");
        }
        Shape shape = ShapesKt.toShape(SearchViewTokens.INSTANCE.getDockedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m1229getElevationD9Ej5fM() {
        return Elevation;
    }

    @Composable
    @JvmName(name = "getFullScreenShape")
    @NotNull
    public final Shape getFullScreenShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-2009956471);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2009956471, i10, -1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenShape> (SearchBar.kt:508)");
        }
        Shape shape = ShapesKt.toShape(SearchViewTokens.INSTANCE.getFullScreenContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* JADX INFO: renamed from: getInputFieldHeight-D9Ej5fM, reason: not valid java name */
    public final float m1230getInputFieldHeightD9Ej5fM() {
        return InputFieldHeight;
    }

    @Composable
    @JvmName(name = "getInputFieldShape")
    @NotNull
    public final Shape getInputFieldShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1770571533);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1770571533, i10, -1, "androidx.compose.material3.SearchBarDefaults.<get-inputFieldShape> (SearchBar.kt:504)");
        }
        Shape shape = ShapesKt.toShape(SearchBarTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @JvmName(name = "getWindowInsets")
    @NotNull
    public final WindowInsets getWindowInsets(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1795925906);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1795925906, i10, -1, "androidx.compose.material3.SearchBarDefaults.<get-windowInsets> (SearchBar.kt:514)");
        }
        WindowInsets statusBars = WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return statusBars;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* JADX INFO: renamed from: inputFieldColors--u-KgnY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1231inputFieldColorsuKgnY(long j10, long j11, long j12, TextSelectionColors textSelectionColors, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, Composer composer, int i10, int i11, int i12) {
        composer.startReplaceableGroup(1842555178);
        long color = (i12 & 1) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j10;
        long jM2507copywmQWz5c$default = (i12 & 2) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long color2 = (i12 & 4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j12;
        TextSelectionColors textSelectionColors2 = (i12 & 8) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color3 = (i12 & 16) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j13;
        long color4 = (i12 & 32) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j14;
        long jM2507copywmQWz5c$default2 = (i12 & 64) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long color5 = (i12 & 128) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j16;
        long color6 = (i12 & 256) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j17;
        long jM2507copywmQWz5c$default3 = (i12 & 512) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long color7 = (i12 & 1024) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j19;
        long jM2507copywmQWz5c$default4 = (i12 & 2048) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1842555178, i10, i11, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.kt:599)");
        }
        int i13 = i10 << 3;
        int i14 = i11 << 6;
        TextFieldColors textFieldColorsM1232inputFieldColorsITpI4ow = m1232inputFieldColorsITpI4ow(color, color, jM2507copywmQWz5c$default, color2, textSelectionColors2, color3, color4, jM2507copywmQWz5c$default2, color5, color6, jM2507copywmQWz5c$default3, color7, color7, jM2507copywmQWz5c$default4, composer, (i10 & 14) | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (i13 & 57344) | (458752 & i13) | (3670016 & i13) | (29360128 & i13) | (234881024 & i13) | (i13 & 1879048192), ((i10 >> 27) & 14) | ((i11 << 3) & 112) | (i14 & 896) | (i14 & 7168) | (i14 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM1232inputFieldColorsITpI4ow;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: inputFieldColors-ITpI4ow, reason: not valid java name */
    public final TextFieldColors m1232inputFieldColorsITpI4ow(long j10, long j11, long j12, long j13, @Nullable TextSelectionColors textSelectionColors, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, @Nullable Composer composer, int i10, int i11, int i12) {
        composer.startReplaceableGroup(-2048506052);
        long color = (i12 & 1) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j10;
        long color2 = (i12 & 2) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j11;
        long jM2507copywmQWz5c$default = (i12 & 4) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long color3 = (i12 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j13;
        TextSelectionColors textSelectionColors2 = (i12 & 16) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color4 = (i12 & 32) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j14;
        long color5 = (i12 & 64) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j15;
        long jM2507copywmQWz5c$default2 = (i12 & 128) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long color6 = (i12 & 256) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j17;
        long color7 = (i12 & 512) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j18;
        long jM2507copywmQWz5c$default3 = (i12 & 1024) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long color8 = (i12 & 2048) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j20;
        long color9 = (i12 & 4096) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j21;
        long jM2507copywmQWz5c$default4 = (i12 & 8192) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2048506052, i10, i11, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.kt:560)");
        }
        int i13 = i11 << 18;
        TextFieldColors textFieldColorsM1366colors0hiis_0 = TextFieldDefaults.INSTANCE.m1366colors0hiis_0(color, color2, jM2507copywmQWz5c$default, 0L, 0L, 0L, 0L, 0L, color3, 0L, textSelectionColors2, 0L, 0L, 0L, 0L, color4, color5, jM2507copywmQWz5c$default2, 0L, color6, color7, jM2507copywmQWz5c$default3, 0L, 0L, 0L, 0L, 0L, color8, color9, jM2507copywmQWz5c$default4, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, (i10 & 14) | (i10 & 112) | (i10 & 896) | ((i10 << 15) & 234881024), ((i10 >> 12) & 14) | (458752 & i10) | (3670016 & i10) | (i10 & 29360128) | ((i10 << 3) & 1879048192), ((i10 >> 27) & 14) | ((i11 << 3) & 112) | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192), 0, 3072, 1204058872, 4095);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM1366colors0hiis_0;
    }
}
