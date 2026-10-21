package androidx.compose.ui.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextMeasurerHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "cacheSize", "Landroidx/compose/ui/text/TextMeasurer;", "rememberTextMeasurer", "(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextMeasurer;", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextMeasurerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,51:1\n76#2:52\n76#2:53\n76#2:54\n83#3,3:55\n1097#4,6:58\n*S KotlinDebug\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n*L\n44#1:52\n45#1:53\n46#1:54\n48#1:55,3\n48#1:58,6\n*E\n"})
public final class TextMeasurerHelperKt {
    @Composable
    @NotNull
    public static final TextMeasurer rememberTextMeasurer(int i10, @Nullable Composer composer, int i11, int i12) {
        composer.startReplaceableGroup(1538166871);
        if ((i12 & 1) != 0) {
            i10 = 8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1538166871, i11, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:40)");
        }
        FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        Object[] objArr = {resolver, density, layoutDirection, Integer.valueOf(i10)};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i13 = 0; i13 < 4; i13++) {
            zChanged |= composer.changed(objArr[i13]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new TextMeasurer(resolver, density, layoutDirection, i10);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        TextMeasurer textMeasurer = (TextMeasurer) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textMeasurer;
    }
}
