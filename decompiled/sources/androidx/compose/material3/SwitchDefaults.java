package androidx.compose.material3;

import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJµ\u0001\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u001c\u001a\u00020\u00178\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/SwitchDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "checkedThumbColor", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "Landroidx/compose/material3/SwitchColors;", "colors-V1nXRL4", "(JJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SwitchColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getIconSize-D9Ej5fM", "()F", "IconSize", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,478:1\n154#2:479\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchDefaults\n*L\n338#1:479\n*E\n"})
public final class SwitchDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float IconSize = Dp.m4389constructorimpl(16);

    @Composable
    @NotNull
    /* JADX INFO: renamed from: colors-V1nXRL4, reason: not valid java name */
    public final SwitchColors m1343colorsV1nXRL4(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, @Nullable Composer composer, int i10, int i11, int i12) {
        composer.startReplaceableGroup(1937926421);
        long color = (i12 & 1) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getSelectedHandleColor(), composer, 6) : j10;
        long color2 = (i12 & 2) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getSelectedTrackColor(), composer, 6) : j11;
        long jM2543getTransparent0d7_KjU = (i12 & 4) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j12;
        long color3 = (i12 & 8) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getSelectedIconColor(), composer, 6) : j13;
        long color4 = (i12 & 16) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getUnselectedHandleColor(), composer, 6) : j14;
        long color5 = (i12 & 32) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getUnselectedTrackColor(), composer, 6) : j15;
        long color6 = (i12 & 64) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getUnselectedFocusTrackOutlineColor(), composer, 6) : j16;
        long color7 = (i12 & 128) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getUnselectedIconColor(), composer, 6) : j17;
        long jM2553compositeOverOWjLjI = (i12 & 256) != 0 ? ColorKt.m2553compositeOverOWjLjI(Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledSelectedHandleColor(), composer, 6), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m978getSurface0d7_KjU()) : j18;
        long jM2553compositeOverOWjLjI2 = (i12 & 512) != 0 ? ColorKt.m2553compositeOverOWjLjI(Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledSelectedTrackColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m978getSurface0d7_KjU()) : j19;
        long jM2543getTransparent0d7_KjU2 = (i12 & 1024) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j20;
        long jM2553compositeOverOWjLjI3 = (i12 & 2048) != 0 ? ColorKt.m2553compositeOverOWjLjI(Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledSelectedIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m978getSurface0d7_KjU()) : j21;
        long jM2553compositeOverOWjLjI4 = (i12 & 4096) != 0 ? ColorKt.m2553compositeOverOWjLjI(Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledUnselectedHandleColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m978getSurface0d7_KjU()) : j22;
        long jM2553compositeOverOWjLjI5 = (i12 & 8192) != 0 ? ColorKt.m2553compositeOverOWjLjI(Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledUnselectedTrackColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m978getSurface0d7_KjU()) : j23;
        long jM2553compositeOverOWjLjI6 = (i12 & 16384) != 0 ? ColorKt.m2553compositeOverOWjLjI(Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledUnselectedTrackOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m978getSurface0d7_KjU()) : j24;
        long jM2553compositeOverOWjLjI7 = (i12 & 32768) != 0 ? ColorKt.m2553compositeOverOWjLjI(Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledUnselectedIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m978getSurface0d7_KjU()) : j25;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1937926421, i10, i11, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:283)");
        }
        SwitchColors switchColors = new SwitchColors(color, color2, jM2543getTransparent0d7_KjU, color3, color4, color5, color6, color7, jM2553compositeOverOWjLjI, jM2553compositeOverOWjLjI2, jM2543getTransparent0d7_KjU2, jM2553compositeOverOWjLjI3, jM2553compositeOverOWjLjI4, jM2553compositeOverOWjLjI5, jM2553compositeOverOWjLjI6, jM2553compositeOverOWjLjI7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return switchColors;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1344getIconSizeD9Ej5fM() {
        return IconSize;
    }
}
