package h0;

import androidx.compose.material.ContentColorKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MaterialTheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@SourceDebugExtension({"SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialRippleTheme\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,139:1\n76#2:140\n76#2:141\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialRippleTheme\n*L\n129#1:140\n135#1:141\n*E\n"})
public final class n1 implements RippleTheme {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n1 f68942a = new n1();

    @Override // androidx.compose.material.ripple.RippleTheme
    @Composable
    /* JADX INFO: renamed from: defaultColor-WaAFU9c */
    public final long mo901defaultColorWaAFU9c(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(550536719);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(550536719, i10, -1, "androidx.compose.material.MaterialRippleTheme.defaultColor (MaterialTheme.kt:127)");
        }
        long jM903defaultRippleColor5vOe2sY = RippleTheme.INSTANCE.m903defaultRippleColor5vOe2sY(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), MaterialTheme.INSTANCE.getColors(composer, 6).isLight());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jM903defaultRippleColor5vOe2sY;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    @Composable
    @NotNull
    public final RippleAlpha rippleAlpha(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1419762518);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1419762518, i10, -1, "androidx.compose.material.MaterialRippleTheme.rippleAlpha (MaterialTheme.kt:133)");
        }
        RippleAlpha rippleAlphaM902defaultRippleAlphaDxMtmZc = RippleTheme.INSTANCE.m902defaultRippleAlphaDxMtmZc(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), MaterialTheme.INSTANCE.getColors(composer, 6).isLight());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rippleAlphaM902defaultRippleAlphaDxMtmZc;
    }
}
