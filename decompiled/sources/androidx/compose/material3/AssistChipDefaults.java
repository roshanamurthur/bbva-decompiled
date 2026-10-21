package androidx.compose.material3;

import androidx.compose.material3.tokens.AssistChipTokens;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b1\u00102Je\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJQ\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010 \u001a\u00020\u001d2\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJe\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\rJQ\u0010$\u001a\u00020\u00162\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u0018R \u0010)\u001a\u00020\u000f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010,\u001a\u00020\u000f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u0011\u00100\u001a\u00020-8G¢\u0006\u0006\u001a\u0004\b.\u0010/\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00063"}, d2 = {"Landroidx/compose/material3/AssistChipDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "labelColor", "leadingIconContentColor", "trailingIconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconContentColor", "disabledTrailingIconContentColor", "Landroidx/compose/material3/ChipColors;", "assistChipColors-oq7We08", "(JJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;", "assistChipColors", "Landroidx/compose/ui/unit/Dp;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/ChipElevation;", "assistChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;", "assistChipElevation", "borderColor", "disabledBorderColor", "borderWidth", "Landroidx/compose/material3/ChipBorder;", "assistChipBorder-d_3_b6Q", "(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;", "assistChipBorder", "elevatedAssistChipColors-oq7We08", "elevatedAssistChipColors", "elevatedAssistChipElevation-aqJV_2Y", "elevatedAssistChipElevation", "a", "F", "getHeight-D9Ej5fM", "()F", "Height", "b", "getIconSize-D9Ej5fM", "IconSize", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class AssistChipDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final AssistChipDefaults INSTANCE = new AssistChipDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float Height;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float IconSize;

    static {
        AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
        Height = assistChipTokens.m1503getContainerHeightD9Ej5fM();
        IconSize = assistChipTokens.m1512getIconSizeD9Ej5fM();
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: assistChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m913assistChipBorderd_3_b6Q(long j10, long j11, float f6, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(382372847);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j10;
        long jM2507copywmQWz5c$default = (i11 & 2) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        float fM1511getFlatOutlineWidthD9Ej5fM = (i11 & 4) != 0 ? AssistChipTokens.INSTANCE.m1511getFlatOutlineWidthD9Ej5fM() : f6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(382372847, i10, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:703)");
        }
        ChipBorder chipBorder = new ChipBorder(color, jM2507copywmQWz5c$default, fM1511getFlatOutlineWidthD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipBorder;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: assistChipColors-oq7We08, reason: not valid java name */
    public final ChipColors m914assistChipColorsoq7We08(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-391745725);
        long jM2543getTransparent0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j10;
        long color = (i11 & 2) != 0 ? ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getLabelTextColor(), composer, 6) : j11;
        long color2 = (i11 & 4) != 0 ? ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getIconColor(), composer, 6) : j12;
        long j18 = (i11 & 8) != 0 ? color2 : j13;
        long jM2543getTransparent0d7_KjU2 = (i11 & 16) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j14;
        long jM2507copywmQWz5c$default = (i11 & 32) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jM2507copywmQWz5c$default2 = (i11 & 64) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long j19 = (i11 & 128) != 0 ? jM2507copywmQWz5c$default2 : j17;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-391745725, i10, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:643)");
        }
        ChipColors chipColors = new ChipColors(jM2543getTransparent0d7_KjU, color, color2, j18, jM2543getTransparent0d7_KjU2, jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2, j19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: assistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m915assistChipElevationaqJV_2Y(float f6, float f10, float f11, float f12, float f13, float f14, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(245366099);
        float fM1510getFlatContainerElevationD9Ej5fM = (i11 & 1) != 0 ? AssistChipTokens.INSTANCE.m1510getFlatContainerElevationD9Ej5fM() : f6;
        float f15 = (i11 & 2) != 0 ? fM1510getFlatContainerElevationD9Ej5fM : f10;
        float f16 = (i11 & 4) != 0 ? fM1510getFlatContainerElevationD9Ej5fM : f11;
        float f17 = (i11 & 8) != 0 ? fM1510getFlatContainerElevationD9Ej5fM : f12;
        float fM1504getDraggedContainerElevationD9Ej5fM = (i11 & 16) != 0 ? AssistChipTokens.INSTANCE.m1504getDraggedContainerElevationD9Ej5fM() : f13;
        float f18 = (i11 & 32) != 0 ? fM1510getFlatContainerElevationD9Ej5fM : f14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(245366099, i10, -1, "androidx.compose.material3.AssistChipDefaults.assistChipElevation (Chip.kt:679)");
        }
        ChipElevation chipElevation = new ChipElevation(fM1510getFlatContainerElevationD9Ej5fM, f15, f16, f17, fM1504getDraggedContainerElevationD9Ej5fM, f18, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: elevatedAssistChipColors-oq7We08, reason: not valid java name */
    public final ChipColors m916elevatedAssistChipColorsoq7We08(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-535762675);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getElevatedContainerColor(), composer, 6) : j10;
        long color2 = (i11 & 2) != 0 ? ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getLabelTextColor(), composer, 6) : j11;
        long color3 = (i11 & 4) != 0 ? ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getIconColor(), composer, 6) : j12;
        long j18 = (i11 & 8) != 0 ? color3 : j13;
        long jM2507copywmQWz5c$default = (i11 & 16) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getElevatedDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long jM2507copywmQWz5c$default2 = (i11 & 32) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jM2507copywmQWz5c$default3 = (i11 & 64) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long j19 = (i11 & 128) != 0 ? jM2507copywmQWz5c$default3 : j17;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-535762675, i10, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:728)");
        }
        ChipColors chipColors = new ChipColors(color, color2, color3, j18, jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2, jM2507copywmQWz5c$default3, j19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: elevatedAssistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m917elevatedAssistChipElevationaqJV_2Y(float f6, float f10, float f11, float f12, float f13, float f14, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1457698077);
        float fM1505getElevatedContainerElevationD9Ej5fM = (i11 & 1) != 0 ? AssistChipTokens.INSTANCE.m1505getElevatedContainerElevationD9Ej5fM() : f6;
        float fM1509getElevatedPressedContainerElevationD9Ej5fM = (i11 & 2) != 0 ? AssistChipTokens.INSTANCE.m1509getElevatedPressedContainerElevationD9Ej5fM() : f10;
        float fM1507getElevatedFocusContainerElevationD9Ej5fM = (i11 & 4) != 0 ? AssistChipTokens.INSTANCE.m1507getElevatedFocusContainerElevationD9Ej5fM() : f11;
        float fM1508getElevatedHoverContainerElevationD9Ej5fM = (i11 & 8) != 0 ? AssistChipTokens.INSTANCE.m1508getElevatedHoverContainerElevationD9Ej5fM() : f12;
        float fM1504getDraggedContainerElevationD9Ej5fM = (i11 & 16) != 0 ? AssistChipTokens.INSTANCE.m1504getDraggedContainerElevationD9Ej5fM() : f13;
        float fM1506getElevatedDisabledContainerElevationD9Ej5fM = (i11 & 32) != 0 ? AssistChipTokens.INSTANCE.m1506getElevatedDisabledContainerElevationD9Ej5fM() : f14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1457698077, i10, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipElevation (Chip.kt:765)");
        }
        ChipElevation chipElevation = new ChipElevation(fM1505getElevatedContainerElevationD9Ej5fM, fM1509getElevatedPressedContainerElevationD9Ej5fM, fM1507getElevatedFocusContainerElevationD9Ej5fM, fM1508getElevatedHoverContainerElevationD9Ej5fM, fM1504getDraggedContainerElevationD9Ej5fM, fM1506getElevatedDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m918getHeightD9Ej5fM() {
        return Height;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m919getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1988153916);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1988153916, i10, -1, "androidx.compose.material3.AssistChipDefaults.<get-shape> (Chip.kt:782)");
        }
        Shape shape = ShapesKt.toShape(AssistChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }
}
