package androidx.compose.material3;

import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJo\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0015\u001a\u00020\u00108\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028Gø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u00028Gø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001b\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/material3/ListItemDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "headlineColor", "leadingIconColor", "overlineColor", "supportingColor", "trailingIconColor", "disabledHeadlineColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "Landroidx/compose/material3/ListItemColors;", "colors-J08w3-E", "(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ListItemColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getElevation-D9Ej5fM", "()F", "Elevation", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "getContentColor", "contentColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class ListItemDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final ListItemDefaults INSTANCE = new ListItemDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float Elevation = ListTokens.INSTANCE.m1767getListItemContainerElevationD9Ej5fM();

    @Composable
    @NotNull
    /* JADX INFO: renamed from: colors-J08w3-E, reason: not valid java name */
    public final ListItemColors m1157colorsJ08w3E(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, @Nullable Composer composer, int i10, int i11) {
        long jM2507copywmQWz5c$default;
        long jM2507copywmQWz5c$default2;
        long jM2507copywmQWz5c$default3;
        composer.startReplaceableGroup(-352515689);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemContainerColor(), composer, 6) : j10;
        long color2 = (i11 & 2) != 0 ? ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemLabelTextColor(), composer, 6) : j11;
        long color3 = (i11 & 4) != 0 ? ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemLeadingIconColor(), composer, 6) : j12;
        long color4 = (i11 & 8) != 0 ? ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemOverlineColor(), composer, 6) : j13;
        long color5 = (i11 & 16) != 0 ? ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemSupportingTextColor(), composer, 6) : j14;
        long color6 = (i11 & 32) != 0 ? ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemTrailingIconColor(), composer, 6) : j15;
        if ((i11 & 64) != 0) {
            ListTokens listTokens = ListTokens.INSTANCE;
            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(listTokens.getListItemDisabledLabelTextColor(), composer, 6), listTokens.getListItemDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default = j16;
        }
        if ((i11 & 128) != 0) {
            ListTokens listTokens2 = ListTokens.INSTANCE;
            jM2507copywmQWz5c$default2 = Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(listTokens2.getListItemDisabledLeadingIconColor(), composer, 6), listTokens2.getListItemDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default2 = j17;
        }
        if ((i11 & 256) != 0) {
            ListTokens listTokens3 = ListTokens.INSTANCE;
            jM2507copywmQWz5c$default3 = Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(listTokens3.getListItemDisabledTrailingIconColor(), composer, 6), listTokens3.getListItemDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default3 = j18;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-352515689, i10, -1, "androidx.compose.material3.ListItemDefaults.colors (ListItem.kt:301)");
        }
        ListItemColors listItemColors = new ListItemColors(color, color2, color3, color4, color5, color6, jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2, jM2507copywmQWz5c$default3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return listItemColors;
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getContainerColor")
    public final long getContainerColor(@Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1253579929, i10, -1, "androidx.compose.material3.ListItemDefaults.<get-containerColor> (ListItem.kt:276)");
        }
        long color = ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return color;
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getContentColor")
    public final long getContentColor(@Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1076068327, i10, -1, "androidx.compose.material3.ListItemDefaults.<get-contentColor> (ListItem.kt:281)");
        }
        long color = ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return color;
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m1158getElevationD9Ej5fM() {
        return Elevation;
    }

    @JvmName(name = "getShape")
    @NotNull
    @Composable
    @ReadOnlyComposable
    public final Shape getShape(@Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-496871597, i10, -1, "androidx.compose.material3.ListItemDefaults.<get-shape> (ListItem.kt:271)");
        }
        Shape shape = ShapesKt.toShape(ListTokens.INSTANCE.getListItemContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape;
    }
}
