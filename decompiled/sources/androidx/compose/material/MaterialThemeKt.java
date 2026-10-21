package androidx.compose.material;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
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
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"MaterialTheme", "", "colors", "Landroidx/compose/material/Colors;", "typography", "Landroidx/compose/material/Typography;", "shapes", "Landroidx/compose/material/Shapes;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialThemeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n25#2:140\n1097#3,6:141\n1#4:147\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialThemeKt\n*L\n65#1:140\n65#1:141,6\n*E\n"})
public final class MaterialThemeKt {

    /* JADX INFO: compiled from: MaterialTheme.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Typography f7266p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7267q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f7268r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Typography typography, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f7266p0 = typography;
            this.f7267q0 = function2;
            this.f7268r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1740102967, iIntValue, -1, "androidx.compose.material.MaterialTheme.<anonymous> (MaterialTheme.kt:79)");
                }
                TextKt.ProvideTextStyle(this.f7266p0.getBody1(), ComposableLambdaKt.composableLambda(composer2, 181426554, true, new c1(this.f7268r0, this.f7267q0)), composer2, 48);
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
        public final /* synthetic */ Colors f7269p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Typography f7270q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Shapes f7271r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7272s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f7273t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f7274u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Colors colors, Typography typography, Shapes shapes, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f7269p0 = colors;
            this.f7270q0 = typography;
            this.f7271r0 = shapes;
            this.f7272s0 = function2;
            this.f7273t0 = i10;
            this.f7274u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MaterialThemeKt.MaterialTheme(this.f7269p0, this.f7270q0, this.f7271r0, this.f7272s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7273t0 | 1), this.f7274u0);
            return Unit.INSTANCE;
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void MaterialTheme(@Nullable Colors colors, @Nullable Typography typography, @Nullable Shapes shapes, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Colors colors2;
        int i12;
        Typography typography2;
        Shapes shapes2;
        Typography typography3;
        Shapes shapes3;
        int i13;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-891417079);
        if ((i10 & 14) == 0) {
            if ((i11 & 1) == 0) {
                colors2 = colors;
                if (composerStartRestartGroup.changed(colors2)) {
                    i13 = 4;
                }
                i12 = i13 | i10;
            } else {
                colors2 = colors;
            }
            i13 = 2;
            i12 = i13 | i10;
        } else {
            colors2 = colors;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                typography2 = typography;
                int i14 = composerStartRestartGroup.changed(typography2) ? 32 : 16;
                i12 |= i14;
            } else {
                typography2 = typography;
            }
            i12 |= i14;
        } else {
            typography2 = typography;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                shapes2 = shapes;
                int i15 = composerStartRestartGroup.changed(shapes2) ? 256 : 128;
                i12 |= i15;
            } else {
                shapes2 = shapes;
            }
            i12 |= i15;
        } else {
            shapes2 = shapes;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            typography3 = typography2;
            shapes3 = shapes2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i11 & 1) != 0) {
                    colors2 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6);
                    i12 &= -15;
                }
                if ((i11 & 2) != 0) {
                    typography2 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    shapes2 = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6);
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
            Typography typography4 = typography2;
            Shapes shapes4 = shapes2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-891417079, i16, -1, "androidx.compose.material.MaterialTheme (MaterialTheme.kt:58)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Colors colors3 = colors2;
                objRememberedValue = colors3.m705copypvPzIIM((8191 & 1) != 0 ? colors3.m713getPrimary0d7_KjU() : 0L, (8191 & 2) != 0 ? colors3.m714getPrimaryVariant0d7_KjU() : 0L, (8191 & 4) != 0 ? colors3.m715getSecondary0d7_KjU() : 0L, (8191 & 8) != 0 ? colors3.m716getSecondaryVariant0d7_KjU() : 0L, (8191 & 16) != 0 ? colors3.m706getBackground0d7_KjU() : 0L, (8191 & 32) != 0 ? colors3.m717getSurface0d7_KjU() : 0L, (8191 & 64) != 0 ? colors3.m707getError0d7_KjU() : 0L, (8191 & 128) != 0 ? colors3.m710getOnPrimary0d7_KjU() : 0L, (8191 & 256) != 0 ? colors3.m711getOnSecondary0d7_KjU() : 0L, (8191 & 512) != 0 ? colors3.m708getOnBackground0d7_KjU() : 0L, (8191 & 1024) != 0 ? colors3.m712getOnSurface0d7_KjU() : 0L, (8191 & 2048) != 0 ? colors3.m709getOnError0d7_KjU() : 0L, (8191 & 4096) != 0 ? colors3.isLight() : false);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Colors colors4 = (Colors) objRememberedValue;
            ColorsKt.updateColorsFrom(colors4, colors2);
            typography3 = typography4;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ColorsKt.getLocalColors().provides(colors4), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composerStartRestartGroup, 6))), IndicationKt.getLocalIndication().provides(RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7)), RippleThemeKt.getLocalRippleTheme().provides(h0.n1.f68942a), ShapesKt.getLocalShapes().provides(shapes4), TextSelectionColorsKt.getLocalTextSelectionColors().provides(MaterialTextSelectionColorsKt.rememberTextSelectionColors(colors4, composerStartRestartGroup, 0)), TypographyKt.getLocalTypography().provides(typography3)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1740102967, true, new a(typography3, content, i16)), composerStartRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shapes3 = shapes4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(colors2, typography3, shapes3, content, i10, i11));
    }
}
