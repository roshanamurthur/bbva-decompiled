package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NavigationBar.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/NavigationBarDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getElevation-D9Ej5fM", "()F", "Elevation", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "containerColor", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class NavigationBarDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final NavigationBarDefaults INSTANCE = new NavigationBarDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float Elevation = NavigationBarTokens.INSTANCE.m1786getContainerElevationD9Ej5fM();

    @Composable
    @JvmName(name = "getContainerColor")
    public final long getContainerColor(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1528098623);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1528098623, i10, -1, "androidx.compose.material3.NavigationBarDefaults.<get-containerColor> (NavigationBar.kt:265)");
        }
        long color = ColorSchemeKt.toColor(NavigationBarTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m1172getElevationD9Ej5fM() {
        return Elevation;
    }

    @Composable
    @JvmName(name = "getWindowInsets")
    @NotNull
    public final WindowInsets getWindowInsets(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1938678202);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1938678202, i10, -1, "androidx.compose.material3.NavigationBarDefaults.<get-windowInsets> (NavigationBar.kt:272)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.INSTANCE, composer, 8);
        WindowInsetsSides.Companion companion = WindowInsetsSides.INSTANCE;
        WindowInsets windowInsetsM346onlybOOhFvg = WindowInsetsKt.m346onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m352plusgK_yJZ4(companion.m361getHorizontalJoeWqyM(), companion.m359getBottomJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return windowInsetsM346onlybOOhFvg;
    }
}
