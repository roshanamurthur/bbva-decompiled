package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt$DropdownMenuItemContent$1$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,443:1\n154#2:444\n154#2:445\n67#3,6:446\n73#3:478\n77#3:483\n75#4:452\n76#4,11:454\n89#4:482\n76#5:453\n460#6,13:465\n473#6,3:479\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt$DropdownMenuItemContent$1$1$2\n*L\n190#1:444\n195#1:445\n183#1:446,6\n183#1:478\n183#1:483\n183#1:452\n183#1:454,11\n183#1:482\n183#1:453\n183#1:465,13\n183#1:479,3\n*E\n"})
public final class q1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ RowScope f13071p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f13072q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f13073r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f13074s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f13075t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q1(RowScope rowScope, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, int i10) {
        super(2);
        this.f13071p0 = rowScope;
        this.f13072q0 = function2;
        this.f13073r0 = function3;
        this.f13074s0 = function4;
        this.f13075t0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1728894036, iIntValue, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:181)");
            }
            Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(x.n1.a(this.f13071p0, Modifier.INSTANCE, 1.0f, false, 2, null), this.f13072q0 != null ? MenuKt.f10612b : Dp.m4389constructorimpl(0), 0.0f, this.f13073r0 != null ? MenuKt.f10612b : Dp.m4389constructorimpl(0), 0.0f, 10, null);
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, false, composer2, 0, -1323940314);
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM300paddingqDBjuR0$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            composer2.disableReusing();
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, density));
            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (androidx.appcompat.widget.g0.d(this.f13074s0, composer2, Integer.valueOf(this.f13075t0 & 14))) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
