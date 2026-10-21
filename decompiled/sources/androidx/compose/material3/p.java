package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,396:1\n74#2,6:397\n80#2:429\n84#2:472\n75#3:403\n76#3,11:405\n75#3:436\n76#3,11:438\n89#3:466\n89#3:471\n76#4:404\n76#4:437\n460#5,13:416\n460#5,13:449\n473#5,3:463\n473#5,3:468\n67#6,6:430\n73#6:462\n77#6:467\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3\n*L\n271#1:397,6\n271#1:429\n271#1:472\n271#1:403\n271#1:405,11\n277#1:436\n277#1:438,11\n277#1:466\n271#1:471\n271#1:404\n277#1:437\n271#1:416,13\n277#1:449,13\n277#1:463,3\n271#1:468,3\n277#1:430,6\n277#1:462\n277#1:467\n*E\n"})
public final class p extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f13040p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f13041q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f13042r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ SheetState f13043s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ boolean f13044t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f13045u0;
    public final /* synthetic */ int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, SheetState sheetState, boolean z10, CoroutineScope coroutineScope, int i11) {
        super(2);
        this.f13040p0 = function2;
        this.f13041q0 = function3;
        this.f13042r0 = i10;
        this.f13043s0 = sheetState;
        this.f13044t0 = z10;
        this.f13045u0 = coroutineScope;
        this.v0 = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1381492089, iIntValue, -1, "androidx.compose.material3.StandardBottomSheet.<anonymous> (BottomSheetScaffold.kt:269)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            SheetState sheetState = this.f13043s0;
            boolean z10 = this.f13044t0;
            CoroutineScope coroutineScope = this.f13045u0;
            composer2.startReplaceableGroup(-483455358);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyA = androidx.camera.core.impl.v.a(companion2, top, composer2, 0, -1323940314);
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxWidth$default);
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
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl, measurePolicyA, composerM2074constructorimpl, density));
            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(-176229648);
            Function2<Composer, Integer, Unit> function2 = this.f13040p0;
            if (function2 != null) {
                Strings.Companion companion4 = Strings.INSTANCE;
                String strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(companion4.m1261getBottomSheetPartialExpandDescriptionadMyvUU(), composer2, 6);
                String strM1320getStringNWtq29 = Strings_androidKt.m1320getStringNWtq28(companion4.m1257getBottomSheetDismissDescriptionadMyvUU(), composer2, 6);
                Modifier modifierSemantics = SemanticsModifierKt.semantics(columnScopeInstance.align(companion, companion2.getCenterHorizontally()), true, new l0.s(sheetState, z10, Strings_androidKt.m1320getStringNWtq28(companion4.m1259getBottomSheetExpandDescriptionadMyvUU(), composer2, 6), strM1320getStringNWtq28, strM1320getStringNWtq29, coroutineScope));
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion2, false, composer2, 0, -1323940314);
                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierSemantics);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl2, measurePolicyC, composerM2074constructorimpl2, density2));
                ai.a.j(0, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                androidx.datastore.preferences.protobuf.q.e((this.v0 >> 27) & 14, function2, composer2);
            }
            composer2.endReplaceableGroup();
            this.f13041q0.invoke(columnScopeInstance, composer2, Integer.valueOf(((this.f13042r0 << 3) & 112) | 6));
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
