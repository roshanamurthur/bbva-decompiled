package h0;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheet$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,748:1\n71#2,7:749\n78#2:784\n82#2:789\n78#3,11:756\n91#3:788\n456#4,8:767\n464#4,3:781\n467#4,3:785\n4144#5,6:775\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheet$3\n*L\n579#1:749,7\n579#1:784\n579#1:789\n579#1:756,11\n579#1:788\n579#1:767,8\n579#1:781,3\n579#1:785,3\n579#1:775,6\n*E\n"})
public final class u extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f69124p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f69125q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
        super(2);
        this.f69124p0 = function3;
        this.f69125q0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1944994153, iIntValue, -1, "androidx.compose.material.BottomSheet.<anonymous> (BottomSheetScaffold.kt:578)");
            }
            int i10 = (this.f69125q0 >> 15) & 7168;
            composer2.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.INSTANCE;
            int i11 = i10 >> 3;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, (i11 & 112) | (i11 & 14));
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            int i12 = ((((i10 << 3) & 112) << 9) & 7168) | 6;
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
            Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyColumnMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j((i12 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
            this.f69124p0.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i10 >> 6) & 112) | 6));
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
