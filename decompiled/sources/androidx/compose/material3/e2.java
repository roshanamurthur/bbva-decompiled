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

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheet$2$1$5\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,571:1\n74#2,6:572\n80#2:604\n84#2:647\n75#3:578\n76#3,11:580\n75#3:611\n76#3,11:613\n89#3:641\n89#3:646\n76#4:579\n76#4:612\n460#5,13:591\n460#5,13:624\n473#5,3:638\n473#5,3:643\n67#6,6:605\n73#6:637\n77#6:642\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheet$2$1$5\n*L\n222#1:572,6\n222#1:604\n222#1:647\n222#1:578\n222#1:580,11\n228#1:611\n228#1:613,11\n228#1:641\n222#1:646\n222#1:579\n228#1:612\n222#1:591,13\n228#1:624,13\n228#1:638,3\n222#1:643,3\n228#1:605,6\n228#1:637\n228#1:642\n*E\n"})
public final class e2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f12799p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f12800q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f12801r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ SheetState f12802s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f12803t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f12804u0;
    public final /* synthetic */ int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e2(Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, SheetState sheetState, Function0<Unit> function0, CoroutineScope coroutineScope, int i11) {
        super(2);
        this.f12799p0 = function2;
        this.f12800q0 = function3;
        this.f12801r0 = i10;
        this.f12802s0 = sheetState;
        this.f12803t0 = function0;
        this.f12804u0 = coroutineScope;
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
                ComposerKt.traceEventStart(1371274015, iIntValue, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:220)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            SheetState sheetState = this.f12802s0;
            Function0<Unit> function0 = this.f12803t0;
            CoroutineScope coroutineScope = this.f12804u0;
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
            composer2.startReplaceableGroup(-11289811);
            Function2<Composer, Integer, Unit> function2 = this.f12799p0;
            if (function2 != null) {
                Strings.Companion companion4 = Strings.INSTANCE;
                String strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(companion4.m1261getBottomSheetPartialExpandDescriptionadMyvUU(), composer2, 6);
                Modifier modifierSemantics = SemanticsModifierKt.semantics(columnScopeInstance.align(companion, companion2.getCenterHorizontally()), true, new d2(sheetState, Strings_androidKt.m1320getStringNWtq28(companion4.m1257getBottomSheetDismissDescriptionadMyvUU(), composer2, 6), Strings_androidKt.m1320getStringNWtq28(companion4.m1259getBottomSheetExpandDescriptionadMyvUU(), composer2, 6), strM1320getStringNWtq28, function0, coroutineScope));
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
                androidx.datastore.preferences.protobuf.q.e((this.v0 >> 24) & 14, function2, composer2);
            }
            composer2.endReplaceableGroup();
            this.f12800q0.invoke(columnScopeInstance, composer2, Integer.valueOf(((this.f12801r0 << 3) & 112) | 6));
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
