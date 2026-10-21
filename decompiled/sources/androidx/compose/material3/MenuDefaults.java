package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.MenuTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014JQ\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/MenuDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "textColor", "leadingIconColor", "trailingIconColor", "disabledTextColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "Landroidx/compose/material3/MenuItemColors;", "itemColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/MenuItemColors;", "itemColors", "Landroidx/compose/foundation/layout/PaddingValues;", "a", "Landroidx/compose/foundation/layout/PaddingValues;", "getDropdownMenuItemContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DropdownMenuItemContentPadding", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,443:1\n154#2:444\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuDefaults\n*L\n260#1:444\n*E\n"})
public final class MenuDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final MenuDefaults INSTANCE = new MenuDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final PaddingValues DropdownMenuItemContentPadding = PaddingKt.m290PaddingValuesYgX7TsA(MenuKt.f10612b, Dp.m4389constructorimpl(0));

    @NotNull
    public final PaddingValues getDropdownMenuItemContentPadding() {
        return DropdownMenuItemContentPadding;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: itemColors-5tl4gsc, reason: not valid java name */
    public final MenuItemColors m1168itemColors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1278543580);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemLabelTextColor(), composer, 6) : j10;
        long color2 = (i11 & 2) != 0 ? ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemLeadingIconColor(), composer, 6) : j11;
        long color3 = (i11 & 4) != 0 ? ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemTrailingIconColor(), composer, 6) : j12;
        long jM2507copywmQWz5c$default = (i11 & 8) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long jM2507copywmQWz5c$default2 = (i11 & 16) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long jM2507copywmQWz5c$default3 = (i11 & 32) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1278543580, i10, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:234)");
        }
        MenuItemColors menuItemColors = new MenuItemColors(color, color2, color3, jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2, jM2507copywmQWz5c$default3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return menuItemColors;
    }
}
