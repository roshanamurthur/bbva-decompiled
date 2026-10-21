package androidx.compose.material3;

import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidAlertDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\f8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\f8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\f8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\f8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/AlertDialogDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getTonalElevation-D9Ej5fM", "()F", "TonalElevation", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "containerColor", "getIconContentColor", "iconContentColor", "getTitleContentColor", "titleContentColor", "getTextContentColor", "textContentColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class AlertDialogDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final AlertDialogDefaults INSTANCE = new AlertDialogDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float TonalElevation = DialogTokens.INSTANCE.m1619getContainerElevationD9Ej5fM();

    @Composable
    @JvmName(name = "getContainerColor")
    public final long getContainerColor(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-285850401);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-285850401, i10, -1, "androidx.compose.material3.AlertDialogDefaults.<get-containerColor> (AndroidAlertDialog.android.kt:174)");
        }
        long color = ColorSchemeKt.toColor(DialogTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    @JvmName(name = "getIconContentColor")
    public final long getIconContentColor(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1074292351);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1074292351, i10, -1, "androidx.compose.material3.AlertDialogDefaults.<get-iconContentColor> (AndroidAlertDialog.android.kt:177)");
        }
        long color = ColorSchemeKt.toColor(DialogTokens.INSTANCE.getIconColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-331760525);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-331760525, i10, -1, "androidx.compose.material3.AlertDialogDefaults.<get-shape> (AndroidAlertDialog.android.kt:171)");
        }
        Shape shape = ShapesKt.toShape(DialogTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @JvmName(name = "getTextContentColor")
    public final long getTextContentColor(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1352479489);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1352479489, i10, -1, "androidx.compose.material3.AlertDialogDefaults.<get-textContentColor> (AndroidAlertDialog.android.kt:183)");
        }
        long color = ColorSchemeKt.toColor(DialogTokens.INSTANCE.getSupportingTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    @JvmName(name = "getTitleContentColor")
    public final long getTitleContentColor(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(11981687);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(11981687, i10, -1, "androidx.compose.material3.AlertDialogDefaults.<get-titleContentColor> (AndroidAlertDialog.android.kt:180)");
        }
        long color = ColorSchemeKt.toColor(DialogTokens.INSTANCE.getHeadlineColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    /* JADX INFO: renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m904getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }
}
