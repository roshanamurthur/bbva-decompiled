package com.bbva.ui.compose.theme;

import androidx.compose.material.MaterialTheme;
import androidx.compose.material.Shapes;
import androidx.compose.material.Typography;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Theme.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/bbva/ui/compose/theme/Theme;", "", "()V", "colors", "Lcom/bbva/ui/compose/theme/ExtendedColors;", "getColors", "(Landroidx/compose/runtime/Composer;I)Lcom/bbva/ui/compose/theme/ExtendedColors;", "shapes", "Landroidx/compose/material/Shapes;", "getShapes", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Shapes;", "typography", "Landroidx/compose/material/Typography;", "getTypography", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Theme.kt\ncom/bbva/ui/compose/theme/Theme\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,482:1\n76#2:483\n*S KotlinDebug\n*F\n+ 1 Theme.kt\ncom/bbva/ui/compose/theme/Theme\n*L\n83#1:483\n*E\n"})
public final class Theme {
    public static final int $stable = 0;

    @NotNull
    public static final Theme INSTANCE = new Theme();

    @JvmName(name = "getColors")
    @NotNull
    @Composable
    @ReadOnlyComposable
    public final ExtendedColors getColors(@Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1561325217, i10, -1, "com.bbva.ui.compose.theme.Theme.<get-colors> (Theme.kt:82)");
        }
        ExtendedColors extendedColors = (ExtendedColors) composer.consume(ThemeKt.f37613a);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return extendedColors;
    }

    @JvmName(name = "getShapes")
    @NotNull
    @Composable
    @ReadOnlyComposable
    public final Shapes getShapes(@Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1049294492, i10, -1, "com.bbva.ui.compose.theme.Theme.<get-shapes> (Theme.kt:92)");
        }
        Shapes shapes = MaterialTheme.INSTANCE.getShapes(composer, MaterialTheme.$stable);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shapes;
    }

    @JvmName(name = "getTypography")
    @NotNull
    @Composable
    @ReadOnlyComposable
    public final Typography getTypography(@Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1842823993, i10, -1, "com.bbva.ui.compose.theme.Theme.<get-typography> (Theme.kt:87)");
        }
        Typography typography = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return typography;
    }
}
