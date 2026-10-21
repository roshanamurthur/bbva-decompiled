package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RadioButton.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/material/RadioButtonDefaults;", "", "()V", "colors", "Landroidx/compose/material/RadioButtonColors;", "selectedColor", "Landroidx/compose/ui/graphics/Color;", "unselectedColor", "disabledColor", "colors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/RadioButtonColors;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,233:1\n67#2,3:234\n66#2:237\n1097#3,6:238\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n*L\n168#1:234,3\n168#1:237\n168#1:238,6\n*E\n"})
public final class RadioButtonDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final RadioButtonDefaults INSTANCE = new RadioButtonDefaults();

    @Composable
    @NotNull
    /* JADX INFO: renamed from: colors-RGew2ao, reason: not valid java name */
    public final RadioButtonColors m811colorsRGew2ao(long j10, long j11, long j12, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1370708026);
        long jM715getSecondary0d7_KjU = (i11 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m715getSecondary0d7_KjU() : j10;
        long jM2507copywmQWz5c$default = (i11 & 2) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jM2507copywmQWz5c$default2 = (i11 & 4) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1370708026, i10, -1, "androidx.compose.material.RadioButtonDefaults.colors (RadioButton.kt:162)");
        }
        Color colorM2498boximpl = Color.m2498boximpl(jM715getSecondary0d7_KjU);
        Color colorM2498boximpl2 = Color.m2498boximpl(jM2507copywmQWz5c$default);
        Color colorM2498boximpl3 = Color.m2498boximpl(jM2507copywmQWz5c$default2);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(colorM2498boximpl) | composer.changed(colorM2498boximpl2) | composer.changed(colorM2498boximpl3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new h0.j0(jM715getSecondary0d7_KjU, jM2507copywmQWz5c$default, jM2507copywmQWz5c$default2);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        h0.j0 j0Var = (h0.j0) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j0Var;
    }
}
