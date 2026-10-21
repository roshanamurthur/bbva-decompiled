package androidx.compose.material3;

import androidx.compose.material3.tokens.ExtendedFabPrimaryTokens;
import androidx.compose.material3.tokens.FabPrimaryLargeTokens;
import androidx.compose.material3.tokens.FabPrimarySmallTokens;
import androidx.compose.material3.tokens.FabPrimaryTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J=\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ=\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\tJ;\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0014\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u001e\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\"\u001a\u00020\u001f8Gø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/material3/FloatingActionButtonDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "Landroidx/compose/material3/FloatingActionButtonElevation;", "elevation-xZ9-QkE", "(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/FloatingActionButtonElevation;", "elevation", "loweredElevation-xZ9-QkE", "loweredElevation", "bottomAppBarFabElevation-a9UjIt4", "(FFFF)Landroidx/compose/material3/FloatingActionButtonElevation;", "bottomAppBarFabElevation", "a", "F", "getLargeIconSize-D9Ej5fM", "()F", "LargeIconSize", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "getSmallShape", "smallShape", "getLargeShape", "largeShape", "getExtendedFabShape", "extendedFabShape", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "containerColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,619:1\n154#2:620\n154#2:621\n154#2:622\n154#2:623\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonDefaults\n*L\n470#1:620\n471#1:621\n472#1:622\n473#1:623\n*E\n"})
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final FloatingActionButtonDefaults INSTANCE = new FloatingActionButtonDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float LargeIconSize = FabPrimaryLargeTokens.INSTANCE.m1657getIconSizeD9Ej5fM();

    /* JADX INFO: renamed from: bottomAppBarFabElevation-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ FloatingActionButtonElevation m1120bottomAppBarFabElevationa9UjIt4$default(FloatingActionButtonDefaults floatingActionButtonDefaults, float f6, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f10 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f11 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f12 = Dp.m4389constructorimpl(0);
        }
        return floatingActionButtonDefaults.m1121bottomAppBarFabElevationa9UjIt4(f6, f10, f11, f12);
    }

    @NotNull
    /* JADX INFO: renamed from: bottomAppBarFabElevation-a9UjIt4, reason: not valid java name */
    public final FloatingActionButtonElevation m1121bottomAppBarFabElevationa9UjIt4(float defaultElevation, float pressedElevation, float focusedElevation, float hoveredElevation) {
        return new FloatingActionButtonElevation(defaultElevation, pressedElevation, focusedElevation, hoveredElevation, null);
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: elevation-xZ9-QkE, reason: not valid java name */
    public final FloatingActionButtonElevation m1122elevationxZ9QkE(float f6, float f10, float f11, float f12, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-241106249);
        if ((i11 & 1) != 0) {
            f6 = FabPrimaryTokens.INSTANCE.m1674getContainerElevationD9Ej5fM();
        }
        float f13 = f6;
        if ((i11 & 2) != 0) {
            f10 = FabPrimaryTokens.INSTANCE.m1684getPressedContainerElevationD9Ej5fM();
        }
        float f14 = f10;
        if ((i11 & 4) != 0) {
            f11 = FabPrimaryTokens.INSTANCE.m1677getFocusContainerElevationD9Ej5fM();
        }
        float f15 = f11;
        if ((i11 & 8) != 0) {
            f12 = FabPrimaryTokens.INSTANCE.m1678getHoverContainerElevationD9Ej5fM();
        }
        float f16 = f12;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-241106249, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:423)");
        }
        FloatingActionButtonElevation floatingActionButtonElevation = new FloatingActionButtonElevation(f13, f14, f15, f16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return floatingActionButtonElevation;
    }

    @Composable
    @JvmName(name = "getContainerColor")
    public final long getContainerColor(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1855656391);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1855656391, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-containerColor> (FloatingActionButton.kt:409)");
        }
        long color = ColorSchemeKt.toColor(FabPrimaryTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    @JvmName(name = "getExtendedFabShape")
    @NotNull
    public final Shape getExtendedFabShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-536021915);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-536021915, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-extendedFabShape> (FloatingActionButton.kt:405)");
        }
        Shape shape = ShapesKt.toShape(ExtendedFabPrimaryTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* JADX INFO: renamed from: getLargeIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1123getLargeIconSizeD9Ej5fM() {
        return LargeIconSize;
    }

    @Composable
    @JvmName(name = "getLargeShape")
    @NotNull
    public final Shape getLargeShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1835912187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1835912187, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-largeShape> (FloatingActionButton.kt:402)");
        }
        Shape shape = ShapesKt.toShape(FabPrimaryLargeTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-53247565);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-53247565, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-shape> (FloatingActionButton.kt:396)");
        }
        Shape shape = ShapesKt.toShape(FabPrimaryTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @JvmName(name = "getSmallShape")
    @NotNull
    public final Shape getSmallShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(394933381);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394933381, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-smallShape> (FloatingActionButton.kt:399)");
        }
        Shape shape = ShapesKt.toShape(FabPrimarySmallTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: loweredElevation-xZ9-QkE, reason: not valid java name */
    public final FloatingActionButtonElevation m1124loweredElevationxZ9QkE(float f6, float f10, float f11, float f12, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-285065125);
        if ((i11 & 1) != 0) {
            f6 = FabPrimaryTokens.INSTANCE.m1680getLoweredContainerElevationD9Ej5fM();
        }
        float f13 = f6;
        if ((i11 & 2) != 0) {
            f10 = FabPrimaryTokens.INSTANCE.m1683getLoweredPressedContainerElevationD9Ej5fM();
        }
        float f14 = f10;
        if ((i11 & 4) != 0) {
            f11 = FabPrimaryTokens.INSTANCE.m1681getLoweredFocusContainerElevationD9Ej5fM();
        }
        float f15 = f11;
        if ((i11 & 8) != 0) {
            f12 = FabPrimaryTokens.INSTANCE.m1682getLoweredHoverContainerElevationD9Ej5fM();
        }
        float f16 = f12;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-285065125, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation (FloatingActionButton.kt:446)");
        }
        FloatingActionButtonElevation floatingActionButtonElevation = new FloatingActionButtonElevation(f13, f14, f15, f16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return floatingActionButtonElevation;
    }
}
