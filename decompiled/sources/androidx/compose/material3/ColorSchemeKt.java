package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ColorScheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aµ\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001aµ\u0002\u0010#\u001a\u00020\u001e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010 \u001a\u001f\u0010'\u001a\u00020\u0000*\u00020\u001e2\u0006\u0010$\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a\u001d\u0010'\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001a)\u0010.\u001a\u00020\u0000*\u00020\u001e2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001a\u001f\u00101\u001a\u00020\u0000*\u00020\u001e2\u0006\u0010+\u001a\u00020*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100\u001a\u0014\u00104\u001a\u000203*\u00020\u001e2\u0006\u00102\u001a\u00020\u001eH\u0000\u001a\u001e\u00107\u001a\u00020\u0000*\u00020\u001e2\u0006\u00106\u001a\u000205H\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108\u001a\u0016\u00109\u001a\u00020\u0000*\u000205H\u0001ø\u0001\u0001¢\u0006\u0004\b9\u0010:\" \u0010@\u001a\b\u0012\u0004\u0012\u00020\u001e0;8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0014\u0010B\u001a\u00020A8\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u0010C\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006D"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "Landroidx/compose/material3/ColorScheme;", "lightColorScheme-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "lightColorScheme", "darkColorScheme-G1PFc-w", "darkColorScheme", "backgroundColor", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material3/ColorScheme;J)J", "contentColorFor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "Landroidx/compose/ui/unit/Dp;", "elevation", "applyTonalElevation-Hht5A8o", "(Landroidx/compose/material3/ColorScheme;JF)J", "applyTonalElevation", "surfaceColorAtElevation-3ABfNKs", "(Landroidx/compose/material3/ColorScheme;F)J", "surfaceColorAtElevation", "other", "", "updateColorSchemeFrom", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "value", "fromToken", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J", "toColor", "(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalColorScheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalColorScheme", "", "DisabledAlpha", "F", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nColorScheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorSchemeKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,615:1\n658#2:616\n646#2:617\n76#3:618\n154#4:619\n*S KotlinDebug\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorSchemeKt\n*L\n475#1:616\n475#1:617\n476#1:618\n504#1:619\n*E\n"})
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<ColorScheme> f9823a = CompositionLocalKt.staticCompositionLocalOf(a.f9824p0);

    /* JADX INFO: compiled from: ColorScheme.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: ColorScheme.kt */
    public static final class a extends Lambda implements Function0<ColorScheme> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f9824p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final ColorScheme invoke() {
            return ColorSchemeKt.m1018lightColorSchemeG1PFcw$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 536870911, null);
        }
    }

    /* JADX INFO: renamed from: applyTonalElevation-Hht5A8o, reason: not valid java name */
    public static final long m1012applyTonalElevationHht5A8o(@NotNull ColorScheme applyTonalElevation, long j10, float f6) {
        Intrinsics.checkNotNullParameter(applyTonalElevation, "$this$applyTonalElevation");
        return Color.m2509equalsimpl0(j10, applyTonalElevation.m978getSurface0d7_KjU()) ? m1019surfaceColorAtElevation3ABfNKs(applyTonalElevation, f6) : j10;
    }

    /* JADX INFO: renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m1013contentColorFor4WTKRHQ(@NotNull ColorScheme contentColorFor, long j10) {
        Intrinsics.checkNotNullParameter(contentColorFor, "$this$contentColorFor");
        if (Color.m2509equalsimpl0(j10, contentColorFor.m973getPrimary0d7_KjU())) {
            return contentColorFor.m963getOnPrimary0d7_KjU();
        }
        if (Color.m2509equalsimpl0(j10, contentColorFor.m976getSecondary0d7_KjU())) {
            return contentColorFor.m965getOnSecondary0d7_KjU();
        }
        if (Color.m2509equalsimpl0(j10, contentColorFor.m981getTertiary0d7_KjU())) {
            return contentColorFor.m969getOnTertiary0d7_KjU();
        }
        if (Color.m2509equalsimpl0(j10, contentColorFor.m954getBackground0d7_KjU())) {
            return contentColorFor.m960getOnBackground0d7_KjU();
        }
        if (Color.m2509equalsimpl0(j10, contentColorFor.m955getError0d7_KjU())) {
            return contentColorFor.m961getOnError0d7_KjU();
        }
        if (Color.m2509equalsimpl0(j10, contentColorFor.m978getSurface0d7_KjU())) {
            return contentColorFor.m967getOnSurface0d7_KjU();
        }
        if (Color.m2509equalsimpl0(j10, contentColorFor.m980getSurfaceVariant0d7_KjU())) {
            return contentColorFor.m968getOnSurfaceVariant0d7_KjU();
        }
        if (Color.m2509equalsimpl0(j10, contentColorFor.m974getPrimaryContainer0d7_KjU())) {
            return contentColorFor.m964getOnPrimaryContainer0d7_KjU();
        }
        if (Color.m2509equalsimpl0(j10, contentColorFor.m977getSecondaryContainer0d7_KjU())) {
            return contentColorFor.m966getOnSecondaryContainer0d7_KjU();
        }
        if (Color.m2509equalsimpl0(j10, contentColorFor.m982getTertiaryContainer0d7_KjU())) {
            return contentColorFor.m970getOnTertiaryContainer0d7_KjU();
        }
        if (Color.m2509equalsimpl0(j10, contentColorFor.m956getErrorContainer0d7_KjU())) {
            return contentColorFor.m962getOnErrorContainer0d7_KjU();
        }
        return Color.m2509equalsimpl0(j10, contentColorFor.m959getInverseSurface0d7_KjU()) ? contentColorFor.m957getInverseOnSurface0d7_KjU() : Color.INSTANCE.m2544getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* JADX INFO: renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m1014contentColorForek8zF_U(long j10, @Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i10, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:473)");
        }
        long jM1013contentColorFor4WTKRHQ = m1013contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j10);
        if (jM1013contentColorFor4WTKRHQ == Color.INSTANCE.m2544getUnspecified0d7_KjU()) {
            jM1013contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM1013contentColorFor4WTKRHQ;
    }

    @NotNull
    /* JADX INFO: renamed from: darkColorScheme-G1PFc-w, reason: not valid java name */
    public static final ColorScheme m1015darkColorSchemeG1PFcw(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38) {
        return new ColorScheme(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, null);
    }

    /* JADX INFO: renamed from: darkColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1016darkColorSchemeG1PFcw$default(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, int i10, Object obj) {
        long jM1558getPrimary0d7_KjU = (i10 & 1) != 0 ? ColorDarkTokens.INSTANCE.m1558getPrimary0d7_KjU() : j10;
        return m1015darkColorSchemeG1PFcw(jM1558getPrimary0d7_KjU, (i10 & 2) != 0 ? ColorDarkTokens.INSTANCE.m1548getOnPrimary0d7_KjU() : j11, (i10 & 4) != 0 ? ColorDarkTokens.INSTANCE.m1559getPrimaryContainer0d7_KjU() : j12, (i10 & 8) != 0 ? ColorDarkTokens.INSTANCE.m1549getOnPrimaryContainer0d7_KjU() : j13, (i10 & 16) != 0 ? ColorDarkTokens.INSTANCE.m1543getInversePrimary0d7_KjU() : j14, (i10 & 32) != 0 ? ColorDarkTokens.INSTANCE.m1561getSecondary0d7_KjU() : j15, (i10 & 64) != 0 ? ColorDarkTokens.INSTANCE.m1550getOnSecondary0d7_KjU() : j16, (i10 & 128) != 0 ? ColorDarkTokens.INSTANCE.m1562getSecondaryContainer0d7_KjU() : j17, (i10 & 256) != 0 ? ColorDarkTokens.INSTANCE.m1551getOnSecondaryContainer0d7_KjU() : j18, (i10 & 512) != 0 ? ColorDarkTokens.INSTANCE.m1566getTertiary0d7_KjU() : j19, (i10 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m1554getOnTertiary0d7_KjU() : j20, (i10 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m1567getTertiaryContainer0d7_KjU() : j21, (i10 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m1555getOnTertiaryContainer0d7_KjU() : j22, (i10 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m1539getBackground0d7_KjU() : j23, (i10 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m1545getOnBackground0d7_KjU() : j24, (i10 & 32768) != 0 ? ColorDarkTokens.INSTANCE.m1563getSurface0d7_KjU() : j25, (i10 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m1552getOnSurface0d7_KjU() : j26, (i10 & 131072) != 0 ? ColorDarkTokens.INSTANCE.m1565getSurfaceVariant0d7_KjU() : j27, (i10 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m1553getOnSurfaceVariant0d7_KjU() : j28, (i10 & 524288) != 0 ? jM1558getPrimary0d7_KjU : j29, (i10 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m1544getInverseSurface0d7_KjU() : j30, (i10 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m1542getInverseOnSurface0d7_KjU() : j31, (i10 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m1540getError0d7_KjU() : j32, (i10 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m1546getOnError0d7_KjU() : j33, (i10 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m1541getErrorContainer0d7_KjU() : j34, (i10 & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m1547getOnErrorContainer0d7_KjU() : j35, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorDarkTokens.INSTANCE.m1556getOutline0d7_KjU() : j36, (i10 & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m1557getOutlineVariant0d7_KjU() : j37, (i10 & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m1560getScrim0d7_KjU() : j38);
    }

    public static final long fromToken(@NotNull ColorScheme colorScheme, @NotNull ColorSchemeKeyTokens value) {
        Intrinsics.checkNotNullParameter(colorScheme, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        switch (WhenMappings.$EnumSwitchMapping$0[value.ordinal()]) {
            case 1:
                return colorScheme.m954getBackground0d7_KjU();
            case 2:
                return colorScheme.m955getError0d7_KjU();
            case 3:
                return colorScheme.m956getErrorContainer0d7_KjU();
            case 4:
                return colorScheme.m957getInverseOnSurface0d7_KjU();
            case 5:
                return colorScheme.m958getInversePrimary0d7_KjU();
            case 6:
                return colorScheme.m959getInverseSurface0d7_KjU();
            case 7:
                return colorScheme.m960getOnBackground0d7_KjU();
            case 8:
                return colorScheme.m961getOnError0d7_KjU();
            case 9:
                return colorScheme.m962getOnErrorContainer0d7_KjU();
            case 10:
                return colorScheme.m963getOnPrimary0d7_KjU();
            case 11:
                return colorScheme.m964getOnPrimaryContainer0d7_KjU();
            case 12:
                return colorScheme.m965getOnSecondary0d7_KjU();
            case 13:
                return colorScheme.m966getOnSecondaryContainer0d7_KjU();
            case 14:
                return colorScheme.m967getOnSurface0d7_KjU();
            case 15:
                return colorScheme.m968getOnSurfaceVariant0d7_KjU();
            case 16:
                return colorScheme.m979getSurfaceTint0d7_KjU();
            case 17:
                return colorScheme.m969getOnTertiary0d7_KjU();
            case 18:
                return colorScheme.m970getOnTertiaryContainer0d7_KjU();
            case 19:
                return colorScheme.m971getOutline0d7_KjU();
            case 20:
                return colorScheme.m972getOutlineVariant0d7_KjU();
            case 21:
                return colorScheme.m973getPrimary0d7_KjU();
            case 22:
                return colorScheme.m974getPrimaryContainer0d7_KjU();
            case 23:
                return colorScheme.m975getScrim0d7_KjU();
            case 24:
                return colorScheme.m976getSecondary0d7_KjU();
            case 25:
                return colorScheme.m977getSecondaryContainer0d7_KjU();
            case 26:
                return colorScheme.m978getSurface0d7_KjU();
            case 27:
                return colorScheme.m980getSurfaceVariant0d7_KjU();
            case 28:
                return colorScheme.m981getTertiary0d7_KjU();
            case 29:
                return colorScheme.m982getTertiaryContainer0d7_KjU();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal<ColorScheme> getLocalColorScheme() {
        return f9823a;
    }

    @NotNull
    /* JADX INFO: renamed from: lightColorScheme-G1PFc-w, reason: not valid java name */
    public static final ColorScheme m1017lightColorSchemeG1PFcw(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38) {
        return new ColorScheme(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, null);
    }

    /* JADX INFO: renamed from: lightColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1018lightColorSchemeG1PFcw$default(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, int i10, Object obj) {
        long jM1587getPrimary0d7_KjU = (i10 & 1) != 0 ? ColorLightTokens.INSTANCE.m1587getPrimary0d7_KjU() : j10;
        return m1017lightColorSchemeG1PFcw(jM1587getPrimary0d7_KjU, (i10 & 2) != 0 ? ColorLightTokens.INSTANCE.m1577getOnPrimary0d7_KjU() : j11, (i10 & 4) != 0 ? ColorLightTokens.INSTANCE.m1588getPrimaryContainer0d7_KjU() : j12, (i10 & 8) != 0 ? ColorLightTokens.INSTANCE.m1578getOnPrimaryContainer0d7_KjU() : j13, (i10 & 16) != 0 ? ColorLightTokens.INSTANCE.m1572getInversePrimary0d7_KjU() : j14, (i10 & 32) != 0 ? ColorLightTokens.INSTANCE.m1590getSecondary0d7_KjU() : j15, (i10 & 64) != 0 ? ColorLightTokens.INSTANCE.m1579getOnSecondary0d7_KjU() : j16, (i10 & 128) != 0 ? ColorLightTokens.INSTANCE.m1591getSecondaryContainer0d7_KjU() : j17, (i10 & 256) != 0 ? ColorLightTokens.INSTANCE.m1580getOnSecondaryContainer0d7_KjU() : j18, (i10 & 512) != 0 ? ColorLightTokens.INSTANCE.m1595getTertiary0d7_KjU() : j19, (i10 & 1024) != 0 ? ColorLightTokens.INSTANCE.m1583getOnTertiary0d7_KjU() : j20, (i10 & 2048) != 0 ? ColorLightTokens.INSTANCE.m1596getTertiaryContainer0d7_KjU() : j21, (i10 & 4096) != 0 ? ColorLightTokens.INSTANCE.m1584getOnTertiaryContainer0d7_KjU() : j22, (i10 & 8192) != 0 ? ColorLightTokens.INSTANCE.m1568getBackground0d7_KjU() : j23, (i10 & 16384) != 0 ? ColorLightTokens.INSTANCE.m1574getOnBackground0d7_KjU() : j24, (i10 & 32768) != 0 ? ColorLightTokens.INSTANCE.m1592getSurface0d7_KjU() : j25, (i10 & 65536) != 0 ? ColorLightTokens.INSTANCE.m1581getOnSurface0d7_KjU() : j26, (i10 & 131072) != 0 ? ColorLightTokens.INSTANCE.m1594getSurfaceVariant0d7_KjU() : j27, (i10 & 262144) != 0 ? ColorLightTokens.INSTANCE.m1582getOnSurfaceVariant0d7_KjU() : j28, (i10 & 524288) != 0 ? jM1587getPrimary0d7_KjU : j29, (i10 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m1573getInverseSurface0d7_KjU() : j30, (i10 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m1571getInverseOnSurface0d7_KjU() : j31, (i10 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m1569getError0d7_KjU() : j32, (i10 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m1575getOnError0d7_KjU() : j33, (i10 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m1570getErrorContainer0d7_KjU() : j34, (i10 & 33554432) != 0 ? ColorLightTokens.INSTANCE.m1576getOnErrorContainer0d7_KjU() : j35, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorLightTokens.INSTANCE.m1585getOutline0d7_KjU() : j36, (i10 & 134217728) != 0 ? ColorLightTokens.INSTANCE.m1586getOutlineVariant0d7_KjU() : j37, (i10 & 268435456) != 0 ? ColorLightTokens.INSTANCE.m1589getScrim0d7_KjU() : j38);
    }

    /* JADX INFO: renamed from: surfaceColorAtElevation-3ABfNKs, reason: not valid java name */
    public static final long m1019surfaceColorAtElevation3ABfNKs(@NotNull ColorScheme surfaceColorAtElevation, float f6) {
        Intrinsics.checkNotNullParameter(surfaceColorAtElevation, "$this$surfaceColorAtElevation");
        if (Dp.m4394equalsimpl0(f6, Dp.m4389constructorimpl(0))) {
            return surfaceColorAtElevation.m978getSurface0d7_KjU();
        }
        return ColorKt.m2553compositeOverOWjLjI(Color.m2507copywmQWz5c$default(surfaceColorAtElevation.m979getSurfaceTint0d7_KjU(), ((((float) Math.log(f6 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), surfaceColorAtElevation.m978getSurface0d7_KjU());
    }

    @Composable
    @ReadOnlyComposable
    public static final long toColor(@NotNull ColorSchemeKeyTokens colorSchemeKeyTokens, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(colorSchemeKeyTokens, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1330949347, i10, -1, "androidx.compose.material3.toColor (ColorScheme.kt:611)");
        }
        long jFromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jFromToken;
    }

    public static final void updateColorSchemeFrom(@NotNull ColorScheme colorScheme, @NotNull ColorScheme other) {
        Intrinsics.checkNotNullParameter(colorScheme, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        colorScheme.m1002setPrimary8_81llA$material3_release(other.m973getPrimary0d7_KjU());
        colorScheme.m992setOnPrimary8_81llA$material3_release(other.m963getOnPrimary0d7_KjU());
        colorScheme.m1003setPrimaryContainer8_81llA$material3_release(other.m974getPrimaryContainer0d7_KjU());
        colorScheme.m993setOnPrimaryContainer8_81llA$material3_release(other.m964getOnPrimaryContainer0d7_KjU());
        colorScheme.m987setInversePrimary8_81llA$material3_release(other.m958getInversePrimary0d7_KjU());
        colorScheme.m1005setSecondary8_81llA$material3_release(other.m976getSecondary0d7_KjU());
        colorScheme.m994setOnSecondary8_81llA$material3_release(other.m965getOnSecondary0d7_KjU());
        colorScheme.m1006setSecondaryContainer8_81llA$material3_release(other.m977getSecondaryContainer0d7_KjU());
        colorScheme.m995setOnSecondaryContainer8_81llA$material3_release(other.m966getOnSecondaryContainer0d7_KjU());
        colorScheme.m1010setTertiary8_81llA$material3_release(other.m981getTertiary0d7_KjU());
        colorScheme.m998setOnTertiary8_81llA$material3_release(other.m969getOnTertiary0d7_KjU());
        colorScheme.m1011setTertiaryContainer8_81llA$material3_release(other.m982getTertiaryContainer0d7_KjU());
        colorScheme.m999setOnTertiaryContainer8_81llA$material3_release(other.m970getOnTertiaryContainer0d7_KjU());
        colorScheme.m983setBackground8_81llA$material3_release(other.m954getBackground0d7_KjU());
        colorScheme.m989setOnBackground8_81llA$material3_release(other.m960getOnBackground0d7_KjU());
        colorScheme.m1007setSurface8_81llA$material3_release(other.m978getSurface0d7_KjU());
        colorScheme.m996setOnSurface8_81llA$material3_release(other.m967getOnSurface0d7_KjU());
        colorScheme.m1009setSurfaceVariant8_81llA$material3_release(other.m980getSurfaceVariant0d7_KjU());
        colorScheme.m997setOnSurfaceVariant8_81llA$material3_release(other.m968getOnSurfaceVariant0d7_KjU());
        colorScheme.m1008setSurfaceTint8_81llA$material3_release(other.m979getSurfaceTint0d7_KjU());
        colorScheme.m988setInverseSurface8_81llA$material3_release(other.m959getInverseSurface0d7_KjU());
        colorScheme.m986setInverseOnSurface8_81llA$material3_release(other.m957getInverseOnSurface0d7_KjU());
        colorScheme.m984setError8_81llA$material3_release(other.m955getError0d7_KjU());
        colorScheme.m990setOnError8_81llA$material3_release(other.m961getOnError0d7_KjU());
        colorScheme.m985setErrorContainer8_81llA$material3_release(other.m956getErrorContainer0d7_KjU());
        colorScheme.m991setOnErrorContainer8_81llA$material3_release(other.m962getOnErrorContainer0d7_KjU());
        colorScheme.m1000setOutline8_81llA$material3_release(other.m971getOutline0d7_KjU());
        colorScheme.m1001setOutlineVariant8_81llA$material3_release(other.m972getOutlineVariant0d7_KjU());
        colorScheme.m1004setScrim8_81llA$material3_release(other.m975getScrim0d7_KjU());
    }
}
