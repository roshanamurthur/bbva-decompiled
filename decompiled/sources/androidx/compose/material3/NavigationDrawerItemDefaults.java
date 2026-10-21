package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NavigationDrawer.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016Je\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/NavigationDrawerItemDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "selectedContainerColor", "unselectedContainerColor", "selectedIconColor", "unselectedIconColor", "selectedTextColor", "unselectedTextColor", "selectedBadgeColor", "unselectedBadgeColor", "Landroidx/compose/material3/NavigationDrawerItemColors;", "colors-oq7We08", "(JJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationDrawerItemColors;", "colors", "Landroidx/compose/foundation/layout/PaddingValues;", "a", "Landroidx/compose/foundation/layout/PaddingValues;", "getItemPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ItemPadding", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerItemDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,876:1\n154#2:877\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerItemDefaults\n*L\n773#1:877\n*E\n"})
public final class NavigationDrawerItemDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final NavigationDrawerItemDefaults INSTANCE = new NavigationDrawerItemDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final PaddingValues ItemPadding = PaddingKt.m291PaddingValuesYgX7TsA$default(Dp.m4389constructorimpl(12), 0.0f, 2, null);

    @Composable
    @NotNull
    /* JADX INFO: renamed from: colors-oq7We08, reason: not valid java name */
    public final NavigationDrawerItemColors m1179colorsoq7We08(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1574983348);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j10;
        long color2 = (i11 & 2) != 0 ? ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getContainerColor(), composer, 6) : j11;
        long color3 = (i11 & 4) != 0 ? ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getActiveIconColor(), composer, 6) : j12;
        long color4 = (i11 & 8) != 0 ? ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getInactiveIconColor(), composer, 6) : j13;
        long color5 = (i11 & 16) != 0 ? ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getActiveLabelTextColor(), composer, 6) : j14;
        long color6 = (i11 & 32) != 0 ? ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getInactiveLabelTextColor(), composer, 6) : j15;
        long j18 = (i11 & 64) != 0 ? color5 : j16;
        long j19 = (i11 & 128) != 0 ? color6 : j17;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1574983348, i10, -1, "androidx.compose.material3.NavigationDrawerItemDefaults.colors (NavigationDrawer.kt:748)");
        }
        l0.s1 s1Var = new l0.s1(color3, color4, color5, color6, color, color2, j18, j19);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return s1Var;
    }

    @NotNull
    public final PaddingValues getItemPadding() {
        return ItemPadding;
    }
}
