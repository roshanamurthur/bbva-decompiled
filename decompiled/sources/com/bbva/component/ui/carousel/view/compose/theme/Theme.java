package com.bbva.component.ui.carousel.view.compose.theme;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Theme.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/ui/carousel/view/compose/theme/Theme;", "", "()V", "colors", "Lcom/bbva/component/ui/carousel/view/compose/theme/PrimaryColors;", "getColors", "(Landroidx/compose/runtime/Composer;I)Lcom/bbva/component/ui/carousel/view/compose/theme/PrimaryColors;", "typography", "Lcom/bbva/component/ui/carousel/view/compose/theme/Typography;", "getTypography", "(Landroidx/compose/runtime/Composer;I)Lcom/bbva/component/ui/carousel/view/compose/theme/Typography;", "component-ui-carousel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Theme.kt\ncom/bbva/component/ui/carousel/view/compose/theme/Theme\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,35:1\n76#2:36\n76#2:37\n*S KotlinDebug\n*F\n+ 1 Theme.kt\ncom/bbva/component/ui/carousel/view/compose/theme/Theme\n*L\n29#1:36\n33#1:37\n*E\n"})
public final class Theme {

    @NotNull
    public static final Theme INSTANCE = new Theme();

    @Composable
    @JvmName(name = "getColors")
    @NotNull
    public final PrimaryColors getColors(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-2033437346);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2033437346, i10, -1, "com.bbva.component.ui.carousel.view.compose.theme.Theme.<get-colors> (Theme.kt:28)");
        }
        PrimaryColors primaryColors = (PrimaryColors) composer.consume(ThemeKt.getLocalCustomColors());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return primaryColors;
    }

    @Composable
    @JvmName(name = "getTypography")
    @NotNull
    public final Typography getTypography(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(742578959);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(742578959, i10, -1, "com.bbva.component.ui.carousel.view.compose.theme.Theme.<get-typography> (Theme.kt:32)");
        }
        Typography typography = (Typography) composer.consume(ThemeKt.getLocalCustomTypography());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return typography;
    }
}
