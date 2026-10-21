package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NavigationBar.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JG\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ[\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/material3/NavigationBarItemDefaults;", "", "()V", "colors", "Landroidx/compose/material3/NavigationBarItemColors;", "selectedIconColor", "Landroidx/compose/ui/graphics/Color;", "selectedTextColor", "indicatorColor", "unselectedIconColor", "unselectedTextColor", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationBarItemColors;", "disabledIconColor", "disabledTextColor", "colors-69fazGs", "(JJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationBarItemColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NavigationBarItemDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final NavigationBarItemDefaults INSTANCE = new NavigationBarItemDefaults();

    @Composable
    @NotNull
    /* JADX INFO: renamed from: colors-69fazGs, reason: not valid java name */
    public final NavigationBarItemColors m1174colors69fazGs(long j10, long j11, long j12, long j13, long j14, long j15, long j16, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1618564327);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(NavigationBarTokens.INSTANCE.getActiveIconColor(), composer, 6) : j10;
        long color2 = (i11 & 2) != 0 ? ColorSchemeKt.toColor(NavigationBarTokens.INSTANCE.getActiveLabelTextColor(), composer, 6) : j11;
        long color3 = (i11 & 4) != 0 ? ColorSchemeKt.toColor(NavigationBarTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j12;
        long color4 = (i11 & 8) != 0 ? ColorSchemeKt.toColor(NavigationBarTokens.INSTANCE.getInactiveIconColor(), composer, 6) : j13;
        long color5 = (i11 & 16) != 0 ? ColorSchemeKt.toColor(NavigationBarTokens.INSTANCE.getInactiveLabelTextColor(), composer, 6) : j14;
        long jM2507copywmQWz5c$default = (i11 & 32) != 0 ? Color.m2507copywmQWz5c$default(color4, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jM2507copywmQWz5c$default2 = (i11 & 64) != 0 ? Color.m2507copywmQWz5c$default(color5, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1618564327, i10, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:293)");
        }
        NavigationBarItemColors navigationBarItemColors = new NavigationBarItemColors(color, color2, color3, color4, color5, jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return navigationBarItemColors;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with disabledIconColor and disabledTextColor")
    @Composable
    /* JADX INFO: renamed from: colors-zjMxDiM, reason: not valid java name */
    public final /* synthetic */ NavigationBarItemColors m1175colorszjMxDiM(long j10, long j11, long j12, long j13, long j14, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-213647161);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(NavigationBarTokens.INSTANCE.getActiveIconColor(), composer, 6) : j10;
        long color2 = (i11 & 2) != 0 ? ColorSchemeKt.toColor(NavigationBarTokens.INSTANCE.getActiveLabelTextColor(), composer, 6) : j11;
        long color3 = (i11 & 4) != 0 ? ColorSchemeKt.toColor(NavigationBarTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j12;
        long color4 = (i11 & 8) != 0 ? ColorSchemeKt.toColor(NavigationBarTokens.INSTANCE.getInactiveIconColor(), composer, 6) : j13;
        long color5 = (i11 & 16) != 0 ? ColorSchemeKt.toColor(NavigationBarTokens.INSTANCE.getInactiveLabelTextColor(), composer, 6) : j14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-213647161, i10, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:316)");
        }
        NavigationBarItemColors navigationBarItemColors = new NavigationBarItemColors(color, color2, color3, color4, color5, Color.m2507copywmQWz5c$default(color4, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m2507copywmQWz5c$default(color5, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return navigationBarItemColors;
    }
}
