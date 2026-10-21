package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,429:1\n67#2,6:430\n73#2:462\n77#2:467\n75#3:436\n76#3,11:438\n89#3:466\n76#4:437\n460#5,13:449\n473#5,3:463\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1\n*L\n151#1:430,6\n151#1:462\n151#1:467\n151#1:436\n151#1:438,11\n151#1:466\n151#1:437\n151#1:449,13\n151#1:463,3\n*E\n"})
public final class i4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ float f12892p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ long f12893q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ TextStyle f12894r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f12895s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f12896t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i4(float f6, long j10, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
        super(2);
        this.f12892p0 = f6;
        this.f12893q0 = j10;
        this.f12894r0 = textStyle;
        this.f12895s0 = function2;
        this.f12896t0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1824482619, iIntValue, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:149)");
            }
            Modifier modifierAlpha = AlphaKt.alpha(Modifier.INSTANCE, this.f12892p0);
            long j10 = this.f12893q0;
            TextStyle textStyle = this.f12894r0;
            Function2<Composer, Integer, Unit> function2 = this.f12895s0;
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, false, composer2, 0, -1323940314);
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierAlpha);
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
            TextFieldImplKt.m1385DecorationKTwxG1Y(j10, textStyle, function2, composer2, (this.f12896t0 >> 18) & 896, 0);
            if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
