package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.tokens.BottomAppBarTokens;
import androidx.compose.material3.tokens.FabSecondaryTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u000e8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u000e8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/BottomAppBarDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getContainerElevation-D9Ej5fM", "()F", "ContainerElevation", "Landroidx/compose/foundation/layout/PaddingValues;", "b", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "containerColor", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "getBottomAppBarFabColor", "bottomAppBarFabColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class BottomAppBarDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final BottomAppBarDefaults INSTANCE = new BottomAppBarDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerElevation = BottomAppBarTokens.INSTANCE.m1515getContainerElevationD9Ej5fM();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final PaddingValues ContentPadding = PaddingKt.m293PaddingValuesa9UjIt4$default(AppBarKt.f9238a, AppBarKt.getBottomAppBarVerticalPadding(), AppBarKt.f9238a, 0.0f, 8, null);

    @Composable
    @JvmName(name = "getBottomAppBarFabColor")
    public final long getBottomAppBarFabColor(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1464561486);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1464561486, i10, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-bottomAppBarFabColor> (AppBar.kt:999)");
        }
        long color = ColorSchemeKt.toColor(FabSecondaryTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    @JvmName(name = "getContainerColor")
    public final long getContainerColor(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-368340078);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-368340078, i10, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-containerColor> (AppBar.kt:972)");
        }
        long color = ColorSchemeKt.toColor(BottomAppBarTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    /* JADX INFO: renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m921getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    @NotNull
    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    @Composable
    @JvmName(name = "getWindowInsets")
    @NotNull
    public final WindowInsets getWindowInsets(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(688896409);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(688896409, i10, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-windowInsets> (AppBar.kt:992)");
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
