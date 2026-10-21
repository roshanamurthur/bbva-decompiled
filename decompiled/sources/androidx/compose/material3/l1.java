package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,619:1\n75#2,6:620\n81#2:652\n85#2:657\n75#3:626\n76#3,11:628\n89#3:656\n76#4:627\n460#5,13:639\n473#5,3:653\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1\n*L\n378#1:620,6\n378#1:652\n378#1:657\n378#1:626\n378#1:628,11\n378#1:656\n378#1:627\n378#1:639,13\n378#1:653,3\n*E\n"})
public final class l1 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f12975p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f12976q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(int i10, Function2 function2) {
        super(3);
        this.f12975p0 = function2;
        this.f12976q0 = i10;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(176242764, iIntValue, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:376)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, k1.f12963p0);
        composer2.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
        composer2.startReplaceableGroup(-1323940314);
        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierClearAndSetSemantics);
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
        Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, density));
        ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        SpacerKt.Spacer(SizeKt.m340width3ABfNKs(companion, FloatingActionButtonKt.f10300b), composer2, 6);
        if (androidx.appcompat.widget.g0.d(this.f12975p0, composer2, Integer.valueOf(this.f12976q0 & 14))) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
