package androidx.compose.material;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MaterialTextSelectionColors.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/material/Colors;", "colors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "rememberTextSelectionColors", "(Landroidx/compose/material/Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "Landroidx/compose/ui/graphics/Color;", "selectionColor", "textColor", "backgroundColor", "calculateSelectionBackgroundColor-ysEtTa8", "(JJJ)J", "calculateSelectionBackgroundColor", "foreground", "background", "", "calculateContrastRatio--OWjLjI", "(JJ)F", "calculateContrastRatio", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMaterialTextSelectionColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,242:1\n658#2:243\n646#2:244\n76#3:245\n67#4,3:246\n66#4:249\n1097#5,6:250\n*S KotlinDebug\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n*L\n43#1:243\n43#1:244\n44#1:245\n48#1:246,3\n48#1:249\n48#1:250,6\n*E\n"})
public final class MaterialTextSelectionColorsKt {
    public static final float a(long j10, float f6, long j11, long j12) {
        long jM2553compositeOverOWjLjI = ColorKt.m2553compositeOverOWjLjI(Color.m2507copywmQWz5c$default(j10, f6, 0.0f, 0.0f, 0.0f, 14, null), j12);
        return m783calculateContrastRatioOWjLjI(ColorKt.m2553compositeOverOWjLjI(j11, jM2553compositeOverOWjLjI), jM2553compositeOverOWjLjI);
    }

    /* JADX INFO: renamed from: calculateContrastRatio--OWjLjI, reason: not valid java name */
    public static final float m783calculateContrastRatioOWjLjI(long j10, long j11) {
        float fM2559luminance8_81llA = ColorKt.m2559luminance8_81llA(j10) + 0.05f;
        float fM2559luminance8_81llA2 = ColorKt.m2559luminance8_81llA(j11) + 0.05f;
        return Math.max(fM2559luminance8_81llA, fM2559luminance8_81llA2) / Math.min(fM2559luminance8_81llA, fM2559luminance8_81llA2);
    }

    /* JADX INFO: renamed from: calculateSelectionBackgroundColor-ysEtTa8, reason: not valid java name */
    public static final long m784calculateSelectionBackgroundColorysEtTa8(long j10, long j11, long j12) {
        float f6;
        float fA = a(j10, 0.4f, j11, j12);
        float fA2 = a(j10, 0.2f, j11, j12);
        if (fA >= 4.5f) {
            f6 = 0.4f;
        } else {
            float f10 = 0.2f;
            if (fA2 < 4.5f) {
                f6 = 0.2f;
            } else {
                float f11 = 0.4f;
                float f12 = 0.4f;
                for (int i10 = 0; i10 < 7; i10++) {
                    float fA3 = (a(j10, f11, j11, j12) / 4.5f) - 1.0f;
                    if (0.0f <= fA3 && fA3 <= 0.01f) {
                        break;
                    }
                    if (fA3 < 0.0f) {
                        f12 = f11;
                    } else {
                        f10 = f11;
                    }
                    f11 = (f12 + f10) / 2.0f;
                }
                f6 = f11;
            }
        }
        return Color.m2507copywmQWz5c$default(j10, f6, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Composable
    @NotNull
    public static final TextSelectionColors rememberTextSelectionColors(@NotNull Colors colors, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        composer.startReplaceableGroup(-721696685);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-721696685, i10, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long jM713getPrimary0d7_KjU = colors.m713getPrimary0d7_KjU();
        long jM706getBackground0d7_KjU = colors.m706getBackground0d7_KjU();
        composer.startReplaceableGroup(35572910);
        long jM730contentColorFor4WTKRHQ = ColorsKt.m730contentColorFor4WTKRHQ(colors, jM706getBackground0d7_KjU);
        if (jM730contentColorFor4WTKRHQ == Color.INSTANCE.m2544getUnspecified0d7_KjU()) {
            jM730contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
        }
        long j10 = jM730contentColorFor4WTKRHQ;
        composer.endReplaceableGroup();
        long jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(j10, ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        Color colorM2498boximpl = Color.m2498boximpl(jM713getPrimary0d7_KjU);
        Color colorM2498boximpl2 = Color.m2498boximpl(jM706getBackground0d7_KjU);
        Color colorM2498boximpl3 = Color.m2498boximpl(jM2507copywmQWz5c$default);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(colorM2498boximpl) | composer.changed(colorM2498boximpl2) | composer.changed(colorM2498boximpl3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new TextSelectionColors(colors.m713getPrimary0d7_KjU(), m784calculateSelectionBackgroundColorysEtTa8(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, jM706getBackground0d7_KjU), null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        TextSelectionColors textSelectionColors = (TextSelectionColors) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textSelectionColors;
    }
}
