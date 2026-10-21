package androidx.compose.material3;

import androidx.compose.material3.tokens.FilterChipTokens;
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
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b8\u00109J\u008d\u0001\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011JQ\u0010\u001d\u001a\u00020\u001a2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJQ\u0010'\u001a\u00020$2\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u008d\u0001\u0010)\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010\u0011JQ\u0010+\u001a\u00020\u001a2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010\u001cR \u00100\u001a\u00020\u00138\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u00103\u001a\u00020\u00138\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/R\u0011\u00107\u001a\u0002048G¢\u0006\u0006\u001a\u0004\b5\u00106\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006:"}, d2 = {"Landroidx/compose/material3/FilterChipDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "labelColor", "iconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "Landroidx/compose/material3/SelectableChipColors;", "filterChipColors-XqyqHi0", "(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;", "filterChipColors", "Landroidx/compose/ui/unit/Dp;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/SelectableChipElevation;", "filterChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;", "filterChipElevation", "borderColor", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "selectedBorderWidth", "Landroidx/compose/material3/SelectableChipBorder;", "filterChipBorder-gHcDVlo", "(JJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipBorder;", "filterChipBorder", "elevatedFilterChipColors-XqyqHi0", "elevatedFilterChipColors", "elevatedFilterChipElevation-aqJV_2Y", "elevatedFilterChipElevation", "a", "F", "getHeight-D9Ej5fM", "()F", "Height", "b", "getIconSize-D9Ej5fM", "IconSize", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class FilterChipDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final FilterChipDefaults INSTANCE = new FilterChipDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float Height;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float IconSize;

    static {
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        Height = filterChipTokens.m1738getContainerHeightD9Ej5fM();
        IconSize = filterChipTokens.m1754getIconSizeD9Ej5fM();
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: elevatedFilterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m1111elevatedFilterChipColorsXqyqHi0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, @Nullable Composer composer, int i10, int i11, int i12) {
        composer.startReplaceableGroup(-915841711);
        long color = (i12 & 1) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getElevatedUnselectedContainerColor(), composer, 6) : j10;
        long color2 = (i12 & 2) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getUnselectedLabelTextColor(), composer, 6) : j11;
        long color3 = (i12 & 4) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getLeadingIconUnselectedColor(), composer, 6) : j12;
        long jM2507copywmQWz5c$default = (i12 & 8) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getElevatedDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long jM2507copywmQWz5c$default2 = (i12 & 16) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long jM2507copywmQWz5c$default3 = (i12 & 32) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long j22 = (i12 & 64) != 0 ? jM2507copywmQWz5c$default3 : j16;
        long color4 = (i12 & 128) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getElevatedSelectedContainerColor(), composer, 6) : j17;
        long j23 = (i12 & 256) != 0 ? jM2507copywmQWz5c$default : j18;
        long color5 = (i12 & 512) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getSelectedLabelTextColor(), composer, 6) : j19;
        long color6 = (i12 & 1024) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getSelectedLeadingIconColor(), composer, 6) : j20;
        long j24 = (i12 & 2048) != 0 ? color6 : j21;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-915841711, i10, i11, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:932)");
        }
        SelectableChipColors selectableChipColors = new SelectableChipColors(color, color2, color3, color3, jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2, jM2507copywmQWz5c$default3, j22, color4, j23, color5, color6, j24, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: elevatedFilterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m1112elevatedFilterChipElevationaqJV_2Y(float f6, float f10, float f11, float f12, float f13, float f14, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(684803697);
        float fM1740getElevatedContainerElevationD9Ej5fM = (i11 & 1) != 0 ? FilterChipTokens.INSTANCE.m1740getElevatedContainerElevationD9Ej5fM() : f6;
        float fM1744getElevatedPressedContainerElevationD9Ej5fM = (i11 & 2) != 0 ? FilterChipTokens.INSTANCE.m1744getElevatedPressedContainerElevationD9Ej5fM() : f10;
        float fM1742getElevatedFocusContainerElevationD9Ej5fM = (i11 & 4) != 0 ? FilterChipTokens.INSTANCE.m1742getElevatedFocusContainerElevationD9Ej5fM() : f11;
        float fM1743getElevatedHoverContainerElevationD9Ej5fM = (i11 & 8) != 0 ? FilterChipTokens.INSTANCE.m1743getElevatedHoverContainerElevationD9Ej5fM() : f12;
        float fM1739getDraggedContainerElevationD9Ej5fM = (i11 & 16) != 0 ? FilterChipTokens.INSTANCE.m1739getDraggedContainerElevationD9Ej5fM() : f13;
        float fM1741getElevatedDisabledContainerElevationD9Ej5fM = (i11 & 32) != 0 ? FilterChipTokens.INSTANCE.m1741getElevatedDisabledContainerElevationD9Ej5fM() : f14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(684803697, i10, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipElevation (Chip.kt:977)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(fM1740getElevatedContainerElevationD9Ej5fM, fM1744getElevatedPressedContainerElevationD9Ej5fM, fM1742getElevatedFocusContainerElevationD9Ej5fM, fM1743getElevatedHoverContainerElevationD9Ej5fM, fM1739getDraggedContainerElevationD9Ej5fM, fM1741getElevatedDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipElevation;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: filterChipBorder-gHcDVlo, reason: not valid java name */
    public final SelectableChipBorder m1113filterChipBordergHcDVlo(long j10, long j11, long j12, long j13, float f6, float f10, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1884534961);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getFlatUnselectedOutlineColor(), composer, 6) : j10;
        long jM2543getTransparent0d7_KjU = (i11 & 2) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j11;
        long jM2507copywmQWz5c$default = (i11 & 4) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getFlatDisabledUnselectedOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jM2543getTransparent0d7_KjU2 = (i11 & 8) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j13;
        float fM1752getFlatUnselectedOutlineWidthD9Ej5fM = (i11 & 16) != 0 ? FilterChipTokens.INSTANCE.m1752getFlatUnselectedOutlineWidthD9Ej5fM() : f6;
        float fM1748getFlatSelectedOutlineWidthD9Ej5fM = (i11 & 32) != 0 ? FilterChipTokens.INSTANCE.m1748getFlatSelectedOutlineWidthD9Ej5fM() : f10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1884534961, i10, -1, "androidx.compose.material3.FilterChipDefaults.filterChipBorder (Chip.kt:896)");
        }
        SelectableChipBorder selectableChipBorder = new SelectableChipBorder(color, jM2543getTransparent0d7_KjU, jM2507copywmQWz5c$default, jM2543getTransparent0d7_KjU2, fM1752getFlatUnselectedOutlineWidthD9Ej5fM, fM1748getFlatSelectedOutlineWidthD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipBorder;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: filterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m1114filterChipColorsXqyqHi0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, @Nullable Composer composer, int i10, int i11, int i12) {
        composer.startReplaceableGroup(-1831479801);
        long jM2543getTransparent0d7_KjU = (i12 & 1) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j10;
        long color = (i12 & 2) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getUnselectedLabelTextColor(), composer, 6) : j11;
        long color2 = (i12 & 4) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getLeadingIconUnselectedColor(), composer, 6) : j12;
        long jM2543getTransparent0d7_KjU2 = (i12 & 8) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j13;
        long jM2507copywmQWz5c$default = (i12 & 16) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long jM2507copywmQWz5c$default2 = (i12 & 32) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long j22 = (i12 & 64) != 0 ? jM2507copywmQWz5c$default2 : j16;
        long color3 = (i12 & 128) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getFlatSelectedContainerColor(), composer, 6) : j17;
        long jM2507copywmQWz5c$default3 = (i12 & 256) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getFlatDisabledSelectedContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long color4 = (i12 & 512) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getSelectedLabelTextColor(), composer, 6) : j19;
        long color5 = (i12 & 1024) != 0 ? ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getSelectedLeadingIconColor(), composer, 6) : j20;
        long j23 = (i12 & 2048) != 0 ? color5 : j21;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1831479801, i10, i11, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:820)");
        }
        SelectableChipColors selectableChipColors = new SelectableChipColors(jM2543getTransparent0d7_KjU, color, color2, color2, jM2543getTransparent0d7_KjU2, jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2, j22, color3, jM2507copywmQWz5c$default3, color4, color5, j23, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: filterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m1115filterChipElevationaqJV_2Y(float f6, float f10, float f11, float f12, float f13, float f14, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-757972185);
        float fM1745getFlatContainerElevationD9Ej5fM = (i11 & 1) != 0 ? FilterChipTokens.INSTANCE.m1745getFlatContainerElevationD9Ej5fM() : f6;
        float fM1749getFlatSelectedPressedContainerElevationD9Ej5fM = (i11 & 2) != 0 ? FilterChipTokens.INSTANCE.m1749getFlatSelectedPressedContainerElevationD9Ej5fM() : f10;
        float fM1746getFlatSelectedFocusContainerElevationD9Ej5fM = (i11 & 4) != 0 ? FilterChipTokens.INSTANCE.m1746getFlatSelectedFocusContainerElevationD9Ej5fM() : f11;
        float fM1747getFlatSelectedHoverContainerElevationD9Ej5fM = (i11 & 8) != 0 ? FilterChipTokens.INSTANCE.m1747getFlatSelectedHoverContainerElevationD9Ej5fM() : f12;
        float fM1739getDraggedContainerElevationD9Ej5fM = (i11 & 16) != 0 ? FilterChipTokens.INSTANCE.m1739getDraggedContainerElevationD9Ej5fM() : f13;
        float f15 = (i11 & 32) != 0 ? fM1745getFlatContainerElevationD9Ej5fM : f14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-757972185, i10, -1, "androidx.compose.material3.FilterChipDefaults.filterChipElevation (Chip.kt:866)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(fM1745getFlatContainerElevationD9Ej5fM, fM1749getFlatSelectedPressedContainerElevationD9Ej5fM, fM1746getFlatSelectedFocusContainerElevationD9Ej5fM, fM1747getFlatSelectedHoverContainerElevationD9Ej5fM, fM1739getDraggedContainerElevationD9Ej5fM, f15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipElevation;
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m1116getHeightD9Ej5fM() {
        return Height;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1117getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1598643637);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1598643637, i10, -1, "androidx.compose.material3.FilterChipDefaults.<get-shape> (Chip.kt:994)");
        }
        Shape shape = ShapesKt.toShape(FilterChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }
}
