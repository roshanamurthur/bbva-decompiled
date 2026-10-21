package androidx.compose.material3;

import androidx.compose.material3.tokens.CheckboxTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Checkbox.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JQ\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/CheckboxDefaults;", "", "()V", "colors", "Landroidx/compose/material3/CheckboxColors;", "checkedColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedColor", "checkmarkColor", "disabledCheckedColor", "disabledUncheckedColor", "disabledIndeterminateColor", "colors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CheckboxColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CheckboxDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    @Composable
    @NotNull
    /* JADX INFO: renamed from: colors-5tl4gsc, reason: not valid java name */
    public final CheckboxColors m946colors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-89536160);
        long jFromToken = (i11 & 1) != 0 ? ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), CheckboxTokens.INSTANCE.getSelectedContainerColor()) : j10;
        long jFromToken2 = (i11 & 2) != 0 ? ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), CheckboxTokens.INSTANCE.getUnselectedOutlineColor()) : j11;
        long jFromToken3 = (i11 & 4) != 0 ? ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), CheckboxTokens.INSTANCE.getSelectedIconColor()) : j12;
        long jM2507copywmQWz5c$default = (i11 & 8) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), CheckboxTokens.INSTANCE.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long jM2507copywmQWz5c$default2 = (i11 & 16) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), CheckboxTokens.INSTANCE.getUnselectedDisabledOutlineColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long j16 = (i11 & 32) != 0 ? jM2507copywmQWz5c$default : j15;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-89536160, i10, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:197)");
        }
        CheckboxColors checkboxColors = new CheckboxColors(jFromToken3, Color.m2507copywmQWz5c$default(jFromToken3, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), jFromToken, Color.m2507copywmQWz5c$default(jFromToken, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), jM2507copywmQWz5c$default, Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default2, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j16, jFromToken, jFromToken2, jM2507copywmQWz5c$default, j16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return checkboxColors;
    }
}
