package androidx.compose.material.ripple;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RippleTheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class a implements RippleTheme {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f8998a = new a();

    @Override // androidx.compose.material.ripple.RippleTheme
    @Composable
    /* JADX INFO: renamed from: defaultColor-WaAFU9c */
    public final long mo901defaultColorWaAFU9c(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(2042140174);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2042140174, i10, -1, "androidx.compose.material.ripple.DebugRippleTheme.defaultColor (RippleTheme.kt:214)");
        }
        long jM903defaultRippleColor5vOe2sY = RippleTheme.INSTANCE.m903defaultRippleColor5vOe2sY(Color.INSTANCE.m2534getBlack0d7_KjU(), true);
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
        composer.startReplaceableGroup(-1629816343);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1629816343, i10, -1, "androidx.compose.material.ripple.DebugRippleTheme.rippleAlpha (RippleTheme.kt:217)");
        }
        RippleAlpha rippleAlphaM902defaultRippleAlphaDxMtmZc = RippleTheme.INSTANCE.m902defaultRippleAlphaDxMtmZc(Color.INSTANCE.m2534getBlack0d7_KjU(), true);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rippleAlphaM902defaultRippleAlphaDxMtmZc;
    }
}
