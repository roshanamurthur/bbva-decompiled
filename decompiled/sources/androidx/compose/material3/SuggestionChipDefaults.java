package androidx.compose.material3;

import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b/\u00100JQ\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJQ\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJQ\u0010 \u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u000bJQ\u0010\"\u001a\u00020\u00142\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u0016R \u0010'\u001a\u00020\r8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010*\u001a\u00020\r8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u0011\u0010.\u001a\u00020+8G¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/material3/SuggestionChipDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "labelColor", "iconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledIconContentColor", "Landroidx/compose/material3/ChipColors;", "suggestionChipColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;", "suggestionChipColors", "Landroidx/compose/ui/unit/Dp;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/ChipElevation;", "suggestionChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;", "suggestionChipElevation", "borderColor", "disabledBorderColor", "borderWidth", "Landroidx/compose/material3/ChipBorder;", "suggestionChipBorder-d_3_b6Q", "(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;", "suggestionChipBorder", "elevatedSuggestionChipColors-5tl4gsc", "elevatedSuggestionChipColors", "elevatedSuggestionChipElevation-aqJV_2Y", "elevatedSuggestionChipElevation", "a", "F", "getHeight-D9Ej5fM", "()F", "Height", "b", "getIconSize-D9Ej5fM", "IconSize", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class SuggestionChipDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final SuggestionChipDefaults INSTANCE = new SuggestionChipDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float Height;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float IconSize;

    static {
        SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
        Height = suggestionChipTokens.m1948getContainerHeightD9Ej5fM();
        IconSize = suggestionChipTokens.m1957getLeadingIconSizeD9Ej5fM();
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: elevatedSuggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m1322elevatedSuggestionChipColors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1269423125);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getElevatedContainerColor(), composer, 6) : j10;
        long color2 = (i11 & 2) != 0 ? ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getLabelTextColor(), composer, 6) : j11;
        long jM968getOnSurfaceVariant0d7_KjU = (i11 & 4) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m968getOnSurfaceVariant0d7_KjU() : j12;
        long jM2507copywmQWz5c$default = (i11 & 8) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getElevatedDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long jM2507copywmQWz5c$default2 = (i11 & 16) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long jM2507copywmQWz5c$default3 = (i11 & 32) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, 6).m967getOnSurface0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1269423125, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1243)");
        }
        Color.Companion companion = Color.INSTANCE;
        ChipColors chipColors = new ChipColors(color, color2, jM968getOnSurfaceVariant0d7_KjU, companion.m2544getUnspecified0d7_KjU(), jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2, jM2507copywmQWz5c$default3, companion.m2544getUnspecified0d7_KjU(), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: elevatedSuggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m1323elevatedSuggestionChipElevationaqJV_2Y(float f6, float f10, float f11, float f12, float f13, float f14, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1118088467);
        float fM1950getElevatedContainerElevationD9Ej5fM = (i11 & 1) != 0 ? SuggestionChipTokens.INSTANCE.m1950getElevatedContainerElevationD9Ej5fM() : f6;
        float fM1954getElevatedPressedContainerElevationD9Ej5fM = (i11 & 2) != 0 ? SuggestionChipTokens.INSTANCE.m1954getElevatedPressedContainerElevationD9Ej5fM() : f10;
        float fM1952getElevatedFocusContainerElevationD9Ej5fM = (i11 & 4) != 0 ? SuggestionChipTokens.INSTANCE.m1952getElevatedFocusContainerElevationD9Ej5fM() : f11;
        float fM1953getElevatedHoverContainerElevationD9Ej5fM = (i11 & 8) != 0 ? SuggestionChipTokens.INSTANCE.m1953getElevatedHoverContainerElevationD9Ej5fM() : f12;
        float fM1949getDraggedContainerElevationD9Ej5fM = (i11 & 16) != 0 ? SuggestionChipTokens.INSTANCE.m1949getDraggedContainerElevationD9Ej5fM() : f13;
        float fM1951getElevatedDisabledContainerElevationD9Ej5fM = (i11 & 32) != 0 ? SuggestionChipTokens.INSTANCE.m1951getElevatedDisabledContainerElevationD9Ej5fM() : f14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1118088467, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipElevation (Chip.kt:1280)");
        }
        ChipElevation chipElevation = new ChipElevation(fM1950getElevatedContainerElevationD9Ej5fM, fM1954getElevatedPressedContainerElevationD9Ej5fM, fM1952getElevatedFocusContainerElevationD9Ej5fM, fM1953getElevatedHoverContainerElevationD9Ej5fM, fM1949getDraggedContainerElevationD9Ej5fM, fM1951getElevatedDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m1324getHeightD9Ej5fM() {
        return Height;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1325getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(641188183);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(641188183, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.<get-shape> (Chip.kt:1297)");
        }
        Shape shape = ShapesKt.toShape(SuggestionChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: suggestionChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m1326suggestionChipBorderd_3_b6Q(long j10, long j11, float f6, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(439283919);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j10;
        long jM2507copywmQWz5c$default = (i11 & 2) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        float fM1956getFlatOutlineWidthD9Ej5fM = (i11 & 4) != 0 ? SuggestionChipTokens.INSTANCE.m1956getFlatOutlineWidthD9Ej5fM() : f6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(439283919, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1220)");
        }
        ChipBorder chipBorder = new ChipBorder(color, jM2507copywmQWz5c$default, fM1956getFlatOutlineWidthD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipBorder;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: suggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m1327suggestionChipColors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1882647883);
        long jM2543getTransparent0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j10;
        long color = (i11 & 2) != 0 ? ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getLabelTextColor(), composer, 6) : j11;
        long color2 = (i11 & 4) != 0 ? ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j12;
        long jM2543getTransparent0d7_KjU2 = (i11 & 8) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j13;
        long jM2507copywmQWz5c$default = (i11 & 16) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long jM2507copywmQWz5c$default2 = (i11 & 32) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1882647883, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1163)");
        }
        Color.Companion companion = Color.INSTANCE;
        ChipColors chipColors = new ChipColors(jM2543getTransparent0d7_KjU, color, color2, companion.m2544getUnspecified0d7_KjU(), jM2543getTransparent0d7_KjU2, jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2, companion.m2544getUnspecified0d7_KjU(), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: suggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m1328suggestionChipElevationaqJV_2Y(float f6, float f10, float f11, float f12, float f13, float f14, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1929994057);
        float fM1955getFlatContainerElevationD9Ej5fM = (i11 & 1) != 0 ? SuggestionChipTokens.INSTANCE.m1955getFlatContainerElevationD9Ej5fM() : f6;
        float f15 = (i11 & 2) != 0 ? fM1955getFlatContainerElevationD9Ej5fM : f10;
        float f16 = (i11 & 4) != 0 ? fM1955getFlatContainerElevationD9Ej5fM : f11;
        float f17 = (i11 & 8) != 0 ? fM1955getFlatContainerElevationD9Ej5fM : f12;
        float fM1949getDraggedContainerElevationD9Ej5fM = (i11 & 16) != 0 ? SuggestionChipTokens.INSTANCE.m1949getDraggedContainerElevationD9Ej5fM() : f13;
        float f18 = (i11 & 32) != 0 ? fM1955getFlatContainerElevationD9Ej5fM : f14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1929994057, i10, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipElevation (Chip.kt:1196)");
        }
        ChipElevation chipElevation = new ChipElevation(fM1955getFlatContainerElevationD9Ej5fM, f15, f16, f17, fM1949getDraggedContainerElevationD9Ej5fM, f18, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }
}
