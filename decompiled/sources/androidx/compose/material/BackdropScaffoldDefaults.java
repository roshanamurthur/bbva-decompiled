package androidx.compose.material;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BackdropScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00128Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/BackdropScaffoldDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getPeekHeight-D9Ej5fM", "()F", "PeekHeight", "b", "getHeaderHeight-D9Ej5fM", "HeaderHeight", "c", "getFrontLayerElevation-D9Ej5fM", "FrontLayerElevation", "Landroidx/compose/ui/graphics/Shape;", "getFrontLayerShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "frontLayerShape", "Landroidx/compose/ui/graphics/Color;", "getFrontLayerScrimColor", "(Landroidx/compose/runtime/Composer;I)J", "frontLayerScrimColor", "<init>", "()V", "material_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,522:1\n154#2:523\n154#2:524\n154#2:525\n154#2:526\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldDefaults\n*L\n507#1:523\n494#1:524\n499#1:525\n512#1:526\n*E\n"})
public final class BackdropScaffoldDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final BackdropScaffoldDefaults INSTANCE = new BackdropScaffoldDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float PeekHeight = Dp.m4389constructorimpl(56);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float HeaderHeight = Dp.m4389constructorimpl(48);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final float FrontLayerElevation = Dp.m4389constructorimpl(1);

    /* JADX INFO: renamed from: getFrontLayerElevation-D9Ej5fM, reason: not valid java name */
    public final float m663getFrontLayerElevationD9Ej5fM() {
        return FrontLayerElevation;
    }

    @Composable
    @JvmName(name = "getFrontLayerScrimColor")
    public final long getFrontLayerScrimColor(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1806270648);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1806270648, i10, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerScrimColor> (BackdropScaffold.kt:517)");
        }
        long jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m717getSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jM2507copywmQWz5c$default;
    }

    @Composable
    @JvmName(name = "getFrontLayerShape")
    @NotNull
    public final Shape getFrontLayerShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1580588700);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1580588700, i10, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerShape> (BackdropScaffold.kt:505)");
        }
        float f6 = 16;
        CornerBasedShape cornerBasedShapeCopy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer, 6).getLarge(), CornerSizeKt.m478CornerSize0680j_4(Dp.m4389constructorimpl(f6)), CornerSizeKt.m478CornerSize0680j_4(Dp.m4389constructorimpl(f6)), null, null, 12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cornerBasedShapeCopy$default;
    }

    /* JADX INFO: renamed from: getHeaderHeight-D9Ej5fM, reason: not valid java name */
    public final float m664getHeaderHeightD9Ej5fM() {
        return HeaderHeight;
    }

    /* JADX INFO: renamed from: getPeekHeight-D9Ej5fM, reason: not valid java name */
    public final float m665getPeekHeightD9Ej5fM() {
        return PeekHeight;
    }
}
