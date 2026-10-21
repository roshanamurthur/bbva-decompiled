package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt$Chip$3$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,753:1\n154#2:754\n77#3,2:755\n79#3:785\n83#3:790\n78#4,11:757\n91#4:789\n456#5,8:768\n464#5,3:782\n467#5,3:786\n4144#6,6:776\n81#7:791\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt$Chip$3$1$1\n*L\n122#1:754\n114#1:755,2\n114#1:785\n114#1:790\n114#1:757,11\n114#1:789\n114#1:768,8\n114#1:782,3\n114#1:786,3\n114#1:776,6\n130#1:791\n*E\n"})
public final class b0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f8381p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ChipColors f8382q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f8383r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f8384s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f8385t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(Function2<? super Composer, ? super Integer, Unit> function2, ChipColors chipColors, boolean z10, int i10, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3) {
        super(2);
        this.f8381p0 = function2;
        this.f8382q0 = chipColors;
        this.f8383r0 = z10;
        this.f8384s0 = i10;
        this.f8385t0 = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1131213696, iIntValue, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:112)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM320defaultMinSizeVpY3zN4$default = SizeKt.m320defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m699getMinHeightD9Ej5fM(), 1, null);
            Function2<Composer, Integer, Unit> function2 = this.f8381p0;
            Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(modifierM320defaultMinSizeVpY3zN4$default, function2 == null ? ChipKt.f6963a : Dp.m4389constructorimpl(0), 0.0f, ChipKt.f6963a, 0.0f, 10, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default);
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
            Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(2084788937);
            int i10 = this.f8384s0;
            if (function2 != null) {
                SpacerKt.Spacer(SizeKt.m340width3ABfNKs(companion, ChipKt.f6964b), composer2, 6);
                State<Color> stateLeadingIconContentColor = this.f8382q0.leadingIconContentColor(this.f8383r0, composer2, ((i10 >> 6) & 14) | ((i10 >> 15) & 112));
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(stateLeadingIconContentColor.getValue().m2518unboximpl())), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2510getAlphaimpl(stateLeadingIconContentColor.getValue().m2518unboximpl())))}, function2, composer2, ((i10 >> 18) & 112) | 8);
                SpacerKt.Spacer(SizeKt.m340width3ABfNKs(companion, ChipKt.f6965c), composer2, 6);
            }
            composer2.endReplaceableGroup();
            this.f8385t0.invoke(rowScopeInstance, composer2, Integer.valueOf(((i10 >> 21) & 112) | 6));
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
