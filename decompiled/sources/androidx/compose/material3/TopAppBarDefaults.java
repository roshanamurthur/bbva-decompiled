package androidx.compose.material3;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallCenteredTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JG\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010JK\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001cH\u0007¢\u0006\u0002\u0010\u001dJK\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001cH\u0007¢\u0006\u0002\u0010\u001dJG\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u0010JG\u0010!\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\u0010J'\u0010#\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0007¢\u0006\u0002\u0010$JG\u0010%\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010\u0010JG\u0010'\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/compose/material3/TopAppBarDefaults;", "", "()V", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "centerAlignedTopAppBarColors", "Landroidx/compose/material3/TopAppBarColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "centerAlignedTopAppBarColors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarColors;", "enterAlwaysScrollBehavior", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "state", "Landroidx/compose/material3/TopAppBarState;", "canScroll", "Lkotlin/Function0;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "flingAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "(Landroidx/compose/material3/TopAppBarState;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarScrollBehavior;", "exitUntilCollapsedScrollBehavior", "largeTopAppBarColors", "largeTopAppBarColors-zjMxDiM", "mediumTopAppBarColors", "mediumTopAppBarColors-zjMxDiM", "pinnedScrollBehavior", "(Landroidx/compose/material3/TopAppBarState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarScrollBehavior;", "smallTopAppBarColors", "smallTopAppBarColors-zjMxDiM", "topAppBarColors", "topAppBarColors-zjMxDiM", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TopAppBarDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final TopAppBarDefaults INSTANCE = new TopAppBarDefaults();

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class a extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f12611p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class b extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f12612p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class c extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f12613p0 = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: centerAlignedTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m1496centerAlignedTopAppBarColorszjMxDiM(long j10, long j11, long j12, long j13, long j14, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1896017784);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(TopAppBarSmallCenteredTokens.INSTANCE.getContainerColor(), composer, 6) : j10;
        long jM1012applyTonalElevationHht5A8o = (i11 & 2) != 0 ? ColorSchemeKt.m1012applyTonalElevationHht5A8o(MaterialTheme.INSTANCE.getColorScheme(composer, 6), color, TopAppBarSmallTokens.INSTANCE.m2011getOnScrollContainerElevationD9Ej5fM()) : j11;
        long color2 = (i11 & 4) != 0 ? ColorSchemeKt.toColor(TopAppBarSmallCenteredTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j12;
        long color3 = (i11 & 8) != 0 ? ColorSchemeKt.toColor(TopAppBarSmallCenteredTokens.INSTANCE.getHeadlineColor(), composer, 6) : j13;
        long color4 = (i11 & 16) != 0 ? ColorSchemeKt.toColor(TopAppBarSmallCenteredTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1896017784, i10, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:622)");
        }
        TopAppBarColors topAppBarColors = new TopAppBarColors(color, jM1012applyTonalElevationHht5A8o, color2, color3, color4, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarColors;
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public final TopAppBarScrollBehavior enterAlwaysScrollBehavior(@Nullable TopAppBarState topAppBarState, @Nullable Function0<Boolean> function0, @Nullable AnimationSpec<Float> animationSpec, @Nullable DecayAnimationSpec<Float> decayAnimationSpec, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(959086674);
        if ((i11 & 1) != 0) {
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        if ((i11 & 2) != 0) {
            function0 = a.f12611p0;
        }
        if ((i11 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i11 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(959086674, i10, -1, "androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior (AppBar.kt:735)");
        }
        EnterAlwaysScrollBehavior enterAlwaysScrollBehavior = new EnterAlwaysScrollBehavior(topAppBarState, animationSpec, decayAnimationSpec, function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return enterAlwaysScrollBehavior;
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public final TopAppBarScrollBehavior exitUntilCollapsedScrollBehavior(@Nullable TopAppBarState topAppBarState, @Nullable Function0<Boolean> function0, @Nullable AnimationSpec<Float> animationSpec, @Nullable DecayAnimationSpec<Float> decayAnimationSpec, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1757023234);
        if ((i11 & 1) != 0) {
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        if ((i11 & 2) != 0) {
            function0 = b.f12612p0;
        }
        if ((i11 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i11 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1757023234, i10, -1, "androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior (AppBar.kt:768)");
        }
        ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior = new ExitUntilCollapsedScrollBehavior(topAppBarState, animationSpec, decayAnimationSpec, function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return exitUntilCollapsedScrollBehavior;
    }

    @Composable
    @JvmName(name = "getWindowInsets")
    @NotNull
    public final WindowInsets getWindowInsets(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(2143182847);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143182847, i10, -1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:607)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.INSTANCE, composer, 8);
        WindowInsetsSides.Companion companion = WindowInsetsSides.INSTANCE;
        WindowInsets windowInsetsM346onlybOOhFvg = WindowInsetsKt.m346onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m352plusgK_yJZ4(companion.m361getHorizontalJoeWqyM(), companion.m365getTopJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return windowInsetsM346onlybOOhFvg;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: largeTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m1497largeTopAppBarColorszjMxDiM(long j10, long j11, long j12, long j13, long j14, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1471507700);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(TopAppBarLargeTokens.INSTANCE.getContainerColor(), composer, 6) : j10;
        long jM1012applyTonalElevationHht5A8o = (i11 & 2) != 0 ? ColorSchemeKt.m1012applyTonalElevationHht5A8o(MaterialTheme.INSTANCE.getColorScheme(composer, 6), color, TopAppBarSmallTokens.INSTANCE.m2011getOnScrollContainerElevationD9Ej5fM()) : j11;
        long color2 = (i11 & 4) != 0 ? ColorSchemeKt.toColor(TopAppBarLargeTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j12;
        long color3 = (i11 & 8) != 0 ? ColorSchemeKt.toColor(TopAppBarLargeTokens.INSTANCE.getHeadlineColor(), composer, 6) : j13;
        long color4 = (i11 & 16) != 0 ? ColorSchemeKt.toColor(TopAppBarLargeTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1471507700, i10, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:684)");
        }
        TopAppBarColors topAppBarColors = new TopAppBarColors(color, jM1012applyTonalElevationHht5A8o, color2, color3, color4, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: mediumTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m1498mediumTopAppBarColorszjMxDiM(long j10, long j11, long j12, long j13, long j14, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-582474442);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(TopAppBarMediumTokens.INSTANCE.getContainerColor(), composer, 6) : j10;
        long jM1012applyTonalElevationHht5A8o = (i11 & 2) != 0 ? ColorSchemeKt.m1012applyTonalElevationHht5A8o(MaterialTheme.INSTANCE.getColorScheme(composer, 6), color, TopAppBarSmallTokens.INSTANCE.m2011getOnScrollContainerElevationD9Ej5fM()) : j11;
        long color2 = (i11 & 4) != 0 ? ColorSchemeKt.toColor(TopAppBarMediumTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j12;
        long color3 = (i11 & 8) != 0 ? ColorSchemeKt.toColor(TopAppBarMediumTokens.INSTANCE.getHeadlineColor(), composer, 6) : j13;
        long color4 = (i11 & 16) != 0 ? ColorSchemeKt.toColor(TopAppBarMediumTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-582474442, i10, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:653)");
        }
        TopAppBarColors topAppBarColors = new TopAppBarColors(color, jM1012applyTonalElevationHht5A8o, color2, color3, color4, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarColors;
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public final TopAppBarScrollBehavior pinnedScrollBehavior(@Nullable TopAppBarState topAppBarState, @Nullable Function0<Boolean> function0, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(286497075);
        if ((i11 & 1) != 0) {
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        if ((i11 & 2) != 0) {
            function0 = c.f12613p0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(286497075, i10, -1, "androidx.compose.material3.TopAppBarDefaults.pinnedScrollBehavior (AppBar.kt:713)");
        }
        PinnedScrollBehavior pinnedScrollBehavior = new PinnedScrollBehavior(topAppBarState, function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pinnedScrollBehavior;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use topAppBarColors instead.", replaceWith = @ReplaceWith(expression = "topAppBarColors(containerColor, scrolledContainerColor, navigationIconContentColor, titleContentColor, actionIconContentColor)", imports = {}))
    @Composable
    @NotNull
    /* JADX INFO: renamed from: smallTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m1499smallTopAppBarColorszjMxDiM(long j10, long j11, long j12, long j13, long j14, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1717201472);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(TopAppBarSmallTokens.INSTANCE.getContainerColor(), composer, 6) : j10;
        long jM1012applyTonalElevationHht5A8o = (i11 & 2) != 0 ? ColorSchemeKt.m1012applyTonalElevationHht5A8o(MaterialTheme.INSTANCE.getColorScheme(composer, 6), color, TopAppBarSmallTokens.INSTANCE.m2011getOnScrollContainerElevationD9Ej5fM()) : j11;
        long color2 = (i11 & 4) != 0 ? ColorSchemeKt.toColor(TopAppBarSmallTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j12;
        long color3 = (i11 & 8) != 0 ? ColorSchemeKt.toColor(TopAppBarSmallTokens.INSTANCE.getHeadlineColor(), composer, 6) : j13;
        long color4 = (i11 & 16) != 0 ? ColorSchemeKt.toColor(TopAppBarSmallTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1717201472, i10, -1, "androidx.compose.material3.TopAppBarDefaults.smallTopAppBarColors (AppBar.kt:584)");
        }
        TopAppBarColors topAppBarColorsM1500topAppBarColorszjMxDiM = m1500topAppBarColorszjMxDiM(color, jM1012applyTonalElevationHht5A8o, color2, color3, color4, composer, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (i10 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarColorsM1500topAppBarColorszjMxDiM;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: topAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m1500topAppBarColorszjMxDiM(long j10, long j11, long j12, long j13, long j14, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(2142919275);
        long color = (i11 & 1) != 0 ? ColorSchemeKt.toColor(TopAppBarSmallTokens.INSTANCE.getContainerColor(), composer, 6) : j10;
        long jM1012applyTonalElevationHht5A8o = (i11 & 2) != 0 ? ColorSchemeKt.m1012applyTonalElevationHht5A8o(MaterialTheme.INSTANCE.getColorScheme(composer, 6), color, TopAppBarSmallTokens.INSTANCE.m2011getOnScrollContainerElevationD9Ej5fM()) : j11;
        long color2 = (i11 & 4) != 0 ? ColorSchemeKt.toColor(TopAppBarSmallTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j12;
        long color3 = (i11 & 8) != 0 ? ColorSchemeKt.toColor(TopAppBarSmallTokens.INSTANCE.getHeadlineColor(), composer, 6) : j13;
        long color4 = (i11 & 16) != 0 ? ColorSchemeKt.toColor(TopAppBarSmallTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2142919275, i10, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:545)");
        }
        TopAppBarColors topAppBarColors = new TopAppBarColors(color, jM1012applyTonalElevationHht5A8o, color2, color3, color4, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarColors;
    }
}
