package l0;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleTheme;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.MaterialThemeKt;
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
@SourceDebugExtension({"SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialRippleTheme\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,145:1\n76#2:146\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialRippleTheme\n*L\n118#1:146\n*E\n"})
public final class e2 implements RippleTheme {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e2 f82513a = new e2();

    @Override // androidx.compose.material.ripple.RippleTheme
    @Composable
    /* JADX INFO: renamed from: defaultColor-WaAFU9c */
    public final long mo901defaultColorWaAFU9c(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-2059468846);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2059468846, i10, -1, "androidx.compose.material3.MaterialRippleTheme.defaultColor (MaterialTheme.kt:117)");
        }
        long jM2518unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jM2518unboximpl;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    @Composable
    @NotNull
    public final RippleAlpha rippleAlpha(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1285764247);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1285764247, i10, -1, "androidx.compose.material3.MaterialRippleTheme.rippleAlpha (MaterialTheme.kt:120)");
        }
        RippleAlpha rippleAlpha = MaterialThemeKt.f10594a;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rippleAlpha;
    }
}
