package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J¡\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u0017H\u0007ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/TimePickerDefaults;", "", "()V", "colors", "Landroidx/compose/material3/TimePickerColors;", "clockDialColor", "Landroidx/compose/ui/graphics/Color;", "clockDialSelectedContentColor", "clockDialUnselectedContentColor", "selectorColor", "containerColor", "periodSelectorBorderColor", "periodSelectorSelectedContainerColor", "periodSelectorUnselectedContainerColor", "periodSelectorSelectedContentColor", "periodSelectorUnselectedContentColor", "timeSelectorSelectedContainerColor", "timeSelectorUnselectedContainerColor", "timeSelectorSelectedContentColor", "timeSelectorUnselectedContentColor", "colors-u3YEpmA", "(JJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TimePickerColors;", "layoutType", "Landroidx/compose/material3/TimePickerLayoutType;", "layoutType-sDNSZnc", "(Landroidx/compose/runtime/Composer;I)I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TimePickerDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final TimePickerDefaults INSTANCE = new TimePickerDefaults();

    @Composable
    @NotNull
    /* JADX INFO: renamed from: colors-u3YEpmA, reason: not valid java name */
    public final TimePickerColors m1401colorsu3YEpmA(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, @Nullable Composer composer, int i10, int i11, int i12) {
        composer.startReplaceableGroup(-646352288);
        long color = (i12 & 1) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getClockDialColor(), composer, 6) : j10;
        long color2 = (i12 & 2) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getClockDialSelectedLabelTextColor(), composer, 6) : j11;
        long color3 = (i12 & 4) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getClockDialUnselectedLabelTextColor(), composer, 6) : j12;
        long color4 = (i12 & 8) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getClockDialSelectorHandleContainerColor(), composer, 6) : j13;
        long color5 = (i12 & 16) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getContainerColor(), composer, 6) : j14;
        long color6 = (i12 & 32) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getPeriodSelectorOutlineColor(), composer, 6) : j15;
        long color7 = (i12 & 64) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getPeriodSelectorSelectedContainerColor(), composer, 6) : j16;
        long jM2543getTransparent0d7_KjU = (i12 & 128) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j17;
        long color8 = (i12 & 256) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getPeriodSelectorSelectedLabelTextColor(), composer, 6) : j18;
        long color9 = (i12 & 512) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getPeriodSelectorUnselectedLabelTextColor(), composer, 6) : j19;
        long color10 = (i12 & 1024) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getTimeSelectorSelectedContainerColor(), composer, 6) : j20;
        long color11 = (i12 & 2048) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getTimeSelectorUnselectedContainerColor(), composer, 6) : j21;
        long color12 = (i12 & 4096) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getTimeSelectorSelectedLabelTextColor(), composer, 6) : j22;
        long color13 = (i12 & 8192) != 0 ? ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getTimeSelectorUnselectedLabelTextColor(), composer, 6) : j23;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-646352288, i10, i11, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:274)");
        }
        TimePickerColors timePickerColors = new TimePickerColors(color, color4, color5, color6, color2, color3, color7, jM2543getTransparent0d7_KjU, color8, color9, color10, color11, color12, color13, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return timePickerColors;
    }

    @Composable
    @ReadOnlyComposable
    /* JADX INFO: renamed from: layoutType-sDNSZnc, reason: not valid java name */
    public final int m1402layoutTypesDNSZnc(@Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(517161502, i10, -1, "androidx.compose.material3.TimePickerDefaults.layoutType (TimePicker.kt:316)");
        }
        int defaultTimePickerLayoutType = TimePicker_androidKt.getDefaultTimePickerLayoutType(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTimePickerLayoutType;
    }
}
