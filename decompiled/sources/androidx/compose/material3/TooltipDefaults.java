package androidx.compose.material3;

import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/TooltipDefaults;", "", "()V", "plainTooltipContainerColor", "Landroidx/compose/ui/graphics/Color;", "getPlainTooltipContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "plainTooltipContainerShape", "Landroidx/compose/ui/graphics/Shape;", "getPlainTooltipContainerShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "plainTooltipContentColor", "getPlainTooltipContentColor", "richTooltipContainerShape", "getRichTooltipContainerShape", "richTooltipColors", "Landroidx/compose/material3/RichTooltipColors;", "containerColor", "contentColor", "titleContentColor", "actionContentColor", "richTooltipColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/RichTooltipColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TooltipDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final TooltipDefaults INSTANCE = new TooltipDefaults();

    @Composable
    @JvmName(name = "getPlainTooltipContainerColor")
    public final long getPlainTooltipContainerColor(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(102696215);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(102696215, i10, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerColor> (Tooltip.kt:362)");
        }
        long color = ColorSchemeKt.toColor(PlainTooltipTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    @JvmName(name = "getPlainTooltipContainerShape")
    @NotNull
    public final Shape getPlainTooltipContainerShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(49570325);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(49570325, i10, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerShape> (Tooltip.kt:356)");
        }
        Shape shape = ShapesKt.toShape(PlainTooltipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @JvmName(name = "getPlainTooltipContentColor")
    public final long getPlainTooltipContentColor(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1982928937);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1982928937, i10, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContentColor> (Tooltip.kt:368)");
        }
        long color = ColorSchemeKt.toColor(PlainTooltipTokens.INSTANCE.getSupportingTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    @JvmName(name = "getRichTooltipContainerShape")
    @NotNull
    public final Shape getRichTooltipContainerShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1138709783);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1138709783, i10, -1, "androidx.compose.material3.TooltipDefaults.<get-richTooltipContainerShape> (Tooltip.kt:373)");
        }
        Shape shape = ShapesKt.toShape(RichTooltipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: richTooltipColors-ro_MJ88, reason: not valid java name */
    public final RichTooltipColors m1488richTooltipColorsro_MJ88(long j10, long j11, long j12, long j13, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1498555081);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(RichTooltipTokens.INSTANCE.getContainerColor(), composer, 6) : j10;
        long color2 = (i11 & 2) != 0 ? ColorSchemeKt.toColor(RichTooltipTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j11;
        long color3 = (i11 & 4) != 0 ? ColorSchemeKt.toColor(RichTooltipTokens.INSTANCE.getSubheadColor(), composer, 6) : j12;
        long color4 = (i11 & 8) != 0 ? ColorSchemeKt.toColor(RichTooltipTokens.INSTANCE.getActionLabelTextColor(), composer, 6) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1498555081, i10, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:381)");
        }
        RichTooltipColors richTooltipColors = new RichTooltipColors(color, color2, color3, color4, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return richTooltipColors;
    }
}
