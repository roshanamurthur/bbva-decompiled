package androidx.compose.material3;

import androidx.compose.material3.tokens.InputChipTokens;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b8\u00109J\u0097\u0001\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012JQ\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJQ\u0010(\u001a\u00020%2\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00142\b\b\u0002\u0010$\u001a\u00020\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'R \u0010-\u001a\u00020\u00148\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u00100\u001a\u00020\u00148\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,R \u00103\u001a\u00020\u00148\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,R\u0011\u00107\u001a\u0002048G¢\u0006\u0006\u001a\u0004\b5\u00106\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006:"}, d2 = {"Landroidx/compose/material3/InputChipDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "labelColor", "leadingIconColor", "trailingIconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "Landroidx/compose/material3/SelectableChipColors;", "inputChipColors-kwJvTHA", "(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;", "inputChipColors", "Landroidx/compose/ui/unit/Dp;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/SelectableChipElevation;", "inputChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;", "inputChipElevation", "borderColor", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "selectedBorderWidth", "Landroidx/compose/material3/SelectableChipBorder;", "inputChipBorder-gHcDVlo", "(JJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipBorder;", "inputChipBorder", "a", "F", "getHeight-D9Ej5fM", "()F", "Height", "b", "getIconSize-D9Ej5fM", "IconSize", "c", "getAvatarSize-D9Ej5fM", "AvatarSize", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class InputChipDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final InputChipDefaults INSTANCE = new InputChipDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float Height;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float IconSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final float AvatarSize;

    static {
        InputChipTokens inputChipTokens = InputChipTokens.INSTANCE;
        Height = inputChipTokens.m1759getContainerHeightD9Ej5fM();
        IconSize = inputChipTokens.m1761getLeadingIconSizeD9Ej5fM();
        AvatarSize = inputChipTokens.m1757getAvatarSizeD9Ej5fM();
    }

    /* JADX INFO: renamed from: getAvatarSize-D9Ej5fM, reason: not valid java name */
    public final float m1141getAvatarSizeD9Ej5fM() {
        return AvatarSize;
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m1142getHeightD9Ej5fM() {
        return Height;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1143getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1052444143);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1052444143, i10, -1, "androidx.compose.material3.InputChipDefaults.<get-shape> (Chip.kt:1133)");
        }
        Shape shape = ShapesKt.toShape(InputChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: inputChipBorder-gHcDVlo, reason: not valid java name */
    public final SelectableChipBorder m1144inputChipBordergHcDVlo(long j10, long j11, long j12, long j13, float f6, float f10, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-324924235);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getUnselectedOutlineColor(), composer, 6) : j10;
        long jM2543getTransparent0d7_KjU = (i11 & 2) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j11;
        long jM2507copywmQWz5c$default = (i11 & 4) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getDisabledUnselectedOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jM2543getTransparent0d7_KjU2 = (i11 & 8) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j13;
        float fM1764getUnselectedOutlineWidthD9Ej5fM = (i11 & 16) != 0 ? InputChipTokens.INSTANCE.m1764getUnselectedOutlineWidthD9Ej5fM() : f6;
        float fM1762getSelectedOutlineWidthD9Ej5fM = (i11 & 32) != 0 ? InputChipTokens.INSTANCE.m1762getSelectedOutlineWidthD9Ej5fM() : f10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-324924235, i10, -1, "androidx.compose.material3.InputChipDefaults.inputChipBorder (Chip.kt:1115)");
        }
        SelectableChipBorder selectableChipBorder = new SelectableChipBorder(color, jM2543getTransparent0d7_KjU, jM2507copywmQWz5c$default, jM2543getTransparent0d7_KjU2, fM1764getUnselectedOutlineWidthD9Ej5fM, fM1762getSelectedOutlineWidthD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipBorder;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: inputChipColors-kwJvTHA, reason: not valid java name */
    public final SelectableChipColors m1145inputChipColorskwJvTHA(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, @Nullable Composer composer, int i10, int i11, int i12) {
        composer.startReplaceableGroup(1312840646);
        long jM2543getTransparent0d7_KjU = (i12 & 1) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j10;
        long color = (i12 & 2) != 0 ? ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getUnselectedLabelTextColor(), composer, 6) : j11;
        long color2 = (i12 & 4) != 0 ? ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getUnselectedLeadingIconColor(), composer, 6) : j12;
        long color3 = (i12 & 8) != 0 ? ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getUnselectedTrailingIconColor(), composer, 6) : j13;
        long jM2543getTransparent0d7_KjU2 = (i12 & 16) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j14;
        long jM2507copywmQWz5c$default = (i12 & 32) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jM2507copywmQWz5c$default2 = (i12 & 64) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long jM2507copywmQWz5c$default3 = (i12 & 128) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long color4 = (i12 & 256) != 0 ? ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getSelectedContainerColor(), composer, 6) : j18;
        long jM2507copywmQWz5c$default4 = (i12 & 512) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getDisabledSelectedContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long color5 = (i12 & 1024) != 0 ? ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getSelectedLabelTextColor(), composer, 6) : j20;
        long color6 = (i12 & 2048) != 0 ? ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getSelectedLeadingIconColor(), composer, 6) : j21;
        long color7 = (i12 & 4096) != 0 ? ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getSelectedTrailingIconColor(), composer, 6) : j22;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1312840646, i10, i11, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1038)");
        }
        SelectableChipColors selectableChipColors = new SelectableChipColors(jM2543getTransparent0d7_KjU, color, color2, color3, jM2543getTransparent0d7_KjU2, jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2, jM2507copywmQWz5c$default3, color4, jM2507copywmQWz5c$default4, color5, color6, color7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: inputChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m1146inputChipElevationaqJV_2Y(float f6, float f10, float f11, float f12, float f13, float f14, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1745270109);
        float fM1758getContainerElevationD9Ej5fM = (i11 & 1) != 0 ? InputChipTokens.INSTANCE.m1758getContainerElevationD9Ej5fM() : f6;
        float f15 = (i11 & 2) != 0 ? fM1758getContainerElevationD9Ej5fM : f10;
        float f16 = (i11 & 4) != 0 ? fM1758getContainerElevationD9Ej5fM : f11;
        float f17 = (i11 & 8) != 0 ? fM1758getContainerElevationD9Ej5fM : f12;
        float fM1760getDraggedContainerElevationD9Ej5fM = (i11 & 16) != 0 ? InputChipTokens.INSTANCE.m1760getDraggedContainerElevationD9Ej5fM() : f13;
        float f18 = (i11 & 32) != 0 ? fM1758getContainerElevationD9Ej5fM : f14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1745270109, i10, -1, "androidx.compose.material3.InputChipDefaults.inputChipElevation (Chip.kt:1086)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(fM1758getContainerElevationD9Ej5fM, f15, f16, f17, fM1760getDraggedContainerElevationD9Ej5fM, f18, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipElevation;
    }
}
