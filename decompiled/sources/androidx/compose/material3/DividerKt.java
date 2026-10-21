package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Divider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Divider", "", "modifier", "Landroidx/compose/ui/Modifier;", "thickness", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/Color;", "Divider-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Divider.kt\nandroidx/compose/material3/DividerKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,69:1\n76#2:70\n174#3:71\n*S KotlinDebug\n*F\n+ 1 Divider.kt\nandroidx/compose/material3/DividerKt\n*L\n50#1:70\n50#1:71\n*E\n"})
public final class DividerKt {

    /* JADX INFO: compiled from: Divider.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10190p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f10191q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f10192r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f10193s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f10194t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f6, int i10, int i11, long j10, Modifier modifier) {
            super(2);
            this.f10190p0 = modifier;
            this.f10191q0 = f6;
            this.f10192r0 = j10;
            this.f10193s0 = i10;
            this.f10194t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            DividerKt.m1083Divider9IZ8Weo(this.f10190p0, this.f10191q0, this.f10192r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10193s0 | 1), this.f10194t0);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Divider-9IZ8Weo, reason: not valid java name */
    public static final void m1083Divider9IZ8Weo(@Nullable Modifier modifier, float f6, long j10, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1562471785);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(f6) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i12 |= ((i11 & 4) == 0 && composerStartRestartGroup.changed(j10)) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i13 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if (i14 != 0) {
                    f6 = DividerDefaults.INSTANCE.m1082getThicknessD9Ej5fM();
                }
                if ((i11 & 4) != 0) {
                    j10 = DividerDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1562471785, i10, -1, "androidx.compose.material3.Divider (Divider.kt:43)");
            }
            composerStartRestartGroup.startReplaceableGroup(1232935509);
            float fM4389constructorimpl = Dp.m4394equalsimpl0(f6, Dp.INSTANCE.m4407getHairlineD9Ej5fM()) ? Dp.m4389constructorimpl(1.0f / ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity()) : f6;
            composerStartRestartGroup.endReplaceableGroup();
            BoxKt.Box(BackgroundKt.m122backgroundbw27NRU$default(SizeKt.m321height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), fM4389constructorimpl), j10, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        float f10 = f6;
        long j11 = j10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(f10, i10, i11, j11, modifier2));
    }
}
