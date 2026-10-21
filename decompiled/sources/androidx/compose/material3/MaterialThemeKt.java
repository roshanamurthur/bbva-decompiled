package androidx.compose.material3;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MaterialTheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a@\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/ColorScheme;", "colorScheme", "Landroidx/compose/material3/Shapes;", "shapes", "Landroidx/compose/material3/Typography;", "typography", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "MaterialTheme", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "rememberTextSelectionColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "", "TextSelectionBackgroundOpacity", "F", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialThemeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,145:1\n25#2:146\n36#2:153\n1114#3,6:147\n1114#3,6:154\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialThemeKt\n*L\n64#1:146\n135#1:153\n64#1:147,6\n135#1:154,6\n*E\n"})
public final class MaterialThemeKt {
    public static final float TextSelectionBackgroundOpacity = 0.4f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final RippleAlpha f10594a = new RippleAlpha(0.16f, 0.12f, 0.08f, 0.12f);

    /* JADX INFO: compiled from: MaterialTheme.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Typography f10595p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10596q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f10597r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Typography typography, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f10595p0 = typography;
            this.f10596q0 = function2;
            this.f10597r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1066563262, iIntValue, -1, "androidx.compose.material3.MaterialTheme.<anonymous> (MaterialTheme.kt:79)");
                }
                TextKt.ProvideTextStyle(this.f10595p0.getBodyLarge(), this.f10596q0, composer2, (this.f10597r0 >> 6) & 112);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: MaterialTheme.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ColorScheme f10598p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Shapes f10599q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Typography f10600r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10601s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f10602t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f10603u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ColorScheme colorScheme, Shapes shapes, Typography typography, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f10598p0 = colorScheme;
            this.f10599q0 = shapes;
            this.f10600r0 = typography;
            this.f10601s0 = function2;
            this.f10602t0 = i10;
            this.f10603u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MaterialThemeKt.MaterialTheme(this.f10598p0, this.f10599q0, this.f10600r0, this.f10601s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10602t0 | 1), this.f10603u0);
            return Unit.INSTANCE;
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void MaterialTheme(@Nullable ColorScheme colorScheme, @Nullable Shapes shapes, @Nullable Typography typography, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        ColorScheme colorScheme2;
        int i12;
        Shapes shapes2;
        Typography typography2;
        Shapes shapes3;
        int i13;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2127166334);
        if ((i10 & 14) == 0) {
            if ((i11 & 1) == 0) {
                colorScheme2 = colorScheme;
                if (composerStartRestartGroup.changed(colorScheme2)) {
                    i13 = 4;
                }
                i12 = i13 | i10;
            } else {
                colorScheme2 = colorScheme;
            }
            i13 = 2;
            i12 = i13 | i10;
        } else {
            colorScheme2 = colorScheme;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                shapes2 = shapes;
                int i14 = composerStartRestartGroup.changed(shapes2) ? 32 : 16;
                i12 |= i14;
            } else {
                shapes2 = shapes;
            }
            i12 |= i14;
        } else {
            shapes2 = shapes;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                typography2 = typography;
                int i15 = composerStartRestartGroup.changed(typography2) ? 256 : 128;
                i12 |= i15;
            } else {
                typography2 = typography;
            }
            i12 |= i15;
        } else {
            typography2 = typography;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            shapes3 = shapes2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i11 & 1) != 0) {
                    colorScheme2 = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6);
                    i12 &= -15;
                }
                if ((i11 & 2) != 0) {
                    shapes2 = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    typography2 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    i12 &= -897;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 1) != 0) {
                    i12 &= -15;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
            }
            int i16 = i12;
            Shapes shapes4 = shapes2;
            Typography typography3 = typography2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2127166334, i16, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:57)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                ColorScheme colorScheme3 = colorScheme2;
                objRememberedValue = colorScheme3.m953copyG1PFcw((536870911 & 1) != 0 ? colorScheme3.m973getPrimary0d7_KjU() : 0L, (536870911 & 2) != 0 ? colorScheme3.m963getOnPrimary0d7_KjU() : 0L, (536870911 & 4) != 0 ? colorScheme3.m974getPrimaryContainer0d7_KjU() : 0L, (536870911 & 8) != 0 ? colorScheme3.m964getOnPrimaryContainer0d7_KjU() : 0L, (536870911 & 16) != 0 ? colorScheme3.m958getInversePrimary0d7_KjU() : 0L, (536870911 & 32) != 0 ? colorScheme3.m976getSecondary0d7_KjU() : 0L, (536870911 & 64) != 0 ? colorScheme3.m965getOnSecondary0d7_KjU() : 0L, (536870911 & 128) != 0 ? colorScheme3.m977getSecondaryContainer0d7_KjU() : 0L, (536870911 & 256) != 0 ? colorScheme3.m966getOnSecondaryContainer0d7_KjU() : 0L, (536870911 & 512) != 0 ? colorScheme3.m981getTertiary0d7_KjU() : 0L, (536870911 & 1024) != 0 ? colorScheme3.m969getOnTertiary0d7_KjU() : 0L, (536870911 & 2048) != 0 ? colorScheme3.m982getTertiaryContainer0d7_KjU() : 0L, (536870911 & 4096) != 0 ? colorScheme3.m970getOnTertiaryContainer0d7_KjU() : 0L, (536870911 & 8192) != 0 ? colorScheme3.m954getBackground0d7_KjU() : 0L, (536870911 & 16384) != 0 ? colorScheme3.m960getOnBackground0d7_KjU() : 0L, (536870911 & 32768) != 0 ? colorScheme3.m978getSurface0d7_KjU() : 0L, (536870911 & 65536) != 0 ? colorScheme3.m967getOnSurface0d7_KjU() : 0L, (536870911 & 131072) != 0 ? colorScheme3.m980getSurfaceVariant0d7_KjU() : 0L, (536870911 & 262144) != 0 ? colorScheme3.m968getOnSurfaceVariant0d7_KjU() : 0L, (536870911 & 524288) != 0 ? colorScheme3.m979getSurfaceTint0d7_KjU() : 0L, (536870911 & 1048576) != 0 ? colorScheme3.m959getInverseSurface0d7_KjU() : 0L, (536870911 & 2097152) != 0 ? colorScheme3.m957getInverseOnSurface0d7_KjU() : 0L, (536870911 & 4194304) != 0 ? colorScheme3.m955getError0d7_KjU() : 0L, (536870911 & 8388608) != 0 ? colorScheme3.m961getOnError0d7_KjU() : 0L, (536870911 & 16777216) != 0 ? colorScheme3.m956getErrorContainer0d7_KjU() : 0L, (536870911 & 33554432) != 0 ? colorScheme3.m962getOnErrorContainer0d7_KjU() : 0L, (536870911 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? colorScheme3.m971getOutline0d7_KjU() : 0L, (536870911 & 134217728) != 0 ? colorScheme3.m972getOutlineVariant0d7_KjU() : 0L, (536870911 & 268435456) != 0 ? colorScheme3.m975getScrim0d7_KjU() : 0L);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ColorScheme colorScheme4 = (ColorScheme) objRememberedValue;
            ColorSchemeKt.updateColorSchemeFrom(colorScheme4, colorScheme2);
            shapes3 = shapes4;
            typography2 = typography3;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ColorSchemeKt.getLocalColorScheme().provides(colorScheme4), IndicationKt.getLocalIndication().provides(RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7)), RippleThemeKt.getLocalRippleTheme().provides(l0.e2.f82513a), ShapesKt.getLocalShapes().provides(shapes3), TextSelectionColorsKt.getLocalTextSelectionColors().provides(rememberTextSelectionColors(colorScheme4, composerStartRestartGroup, 0)), TypographyKt.getLocalTypography().provides(typography2)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1066563262, true, new a(typography2, content, i16)), composerStartRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Typography typography4 = typography2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(colorScheme2, shapes3, typography4, content, i10, i11));
    }

    @Composable
    @NotNull
    public static final TextSelectionColors rememberTextSelectionColors(@NotNull ColorScheme colorScheme, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        composer.startReplaceableGroup(1866455512);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1866455512, i10, -1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:132)");
        }
        long jM973getPrimary0d7_KjU = colorScheme.m973getPrimary0d7_KjU();
        Color colorM2498boximpl = Color.m2498boximpl(jM973getPrimary0d7_KjU);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(colorM2498boximpl);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new TextSelectionColors(jM973getPrimary0d7_KjU, Color.m2507copywmQWz5c$default(jM973getPrimary0d7_KjU, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
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
