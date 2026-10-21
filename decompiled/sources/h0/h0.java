package h0;

import androidx.compose.material.Colors;
import androidx.compose.material.ElevationOverlay;
import androidx.compose.material.ElevationOverlayKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ElevationOverlay.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nElevationOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElevationOverlay.kt\nandroidx/compose/material/DefaultElevationOverlay\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,102:1\n154#2:103\n*S KotlinDebug\n*F\n+ 1 ElevationOverlay.kt\nandroidx/compose/material/DefaultElevationOverlay\n*L\n71#1:103\n*E\n"})
public final class h0 implements ElevationOverlay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h0 f68791a = new h0();

    @Override // androidx.compose.material.ElevationOverlay
    @Composable
    @ReadOnlyComposable
    /* JADX INFO: renamed from: apply-7g2Lkgo */
    public final long mo760apply7g2Lkgo(long j10, float f6, @Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1687113661, i10, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:68)");
        }
        Colors colors = MaterialTheme.INSTANCE.getColors(composer, 6);
        if (Dp.m4388compareTo0680j_4(f6, Dp.m4389constructorimpl(0)) > 0 && !colors.isLight()) {
            j10 = ColorKt.m2553compositeOverOWjLjI(ElevationOverlayKt.m761access$calculateForegroundColorCLU3JFs(j10, f6, composer, (i10 & 112) | (i10 & 14)), j10);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j10;
    }
}
