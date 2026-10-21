package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.ClipKt;
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
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt$FilterChip$3$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,753:1\n154#2:754\n154#2:755\n77#3,2:756\n79#3:786\n83#3:871\n78#4,11:758\n78#4,11:794\n78#4,11:828\n91#4:860\n91#4:865\n91#4:870\n456#5,8:769\n464#5,3:783\n456#5,8:805\n464#5,3:819\n456#5,8:839\n464#5,3:853\n467#5,3:857\n467#5,3:862\n467#5,3:867\n4144#6,6:777\n4144#6,6:813\n4144#6,6:847\n65#7,7:787\n72#7:822\n67#7,5:823\n72#7:856\n76#7:861\n76#7:866\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt$FilterChip$3$1$1\n*L\n223#1:754\n231#1:755\n215#1:756,2\n215#1:786\n215#1:871\n215#1:758,11\n239#1:794,11\n264#1:828,11\n264#1:860\n239#1:865\n215#1:870\n215#1:769,8\n215#1:783,3\n239#1:805,8\n239#1:819,3\n264#1:839,8\n264#1:853,3\n264#1:857,3\n239#1:862,3\n215#1:867,3\n215#1:777,6\n239#1:813,6\n264#1:847,6\n239#1:787,7\n239#1:822\n264#1:823,5\n264#1:856\n264#1:861\n239#1:866\n*E\n"})
public final class d0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f8410p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f8411q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f8412r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f8413s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f8414t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ int f8415u0;
    public final /* synthetic */ SelectableChipColors v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ boolean f8416w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f8417x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ State<Color> f8418y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(int i10, int i11, SelectableChipColors selectableChipColors, State state, Function2 function2, Function2 function3, Function2 function4, Function3 function5, boolean z10, boolean z11) {
        super(2);
        this.f8410p0 = function2;
        this.f8411q0 = z10;
        this.f8412r0 = function3;
        this.f8413s0 = function4;
        this.f8414t0 = function5;
        this.f8415u0 = i10;
        this.v0 = selectableChipColors;
        this.f8416w0 = z11;
        this.f8417x0 = i11;
        this.f8418y0 = state;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        int i10;
        Modifier modifierClip;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1543702066, iIntValue, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:213)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM320defaultMinSizeVpY3zN4$default = SizeKt.m320defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m699getMinHeightD9Ej5fM(), 1, null);
            Function2<Composer, Integer, Unit> function2 = this.f8412r0;
            boolean z10 = this.f8411q0;
            Function2<Composer, Integer, Unit> function3 = this.f8410p0;
            float fM4389constructorimpl = (function3 != null || (z10 && function2 != null)) ? Dp.m4389constructorimpl(0) : ChipKt.f6963a;
            Function2<Composer, Integer, Unit> function4 = this.f8413s0;
            Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(modifierM320defaultMinSizeVpY3zN4$default, fM4389constructorimpl, 0.0f, function4 == null ? ChipKt.f6963a : Dp.m4389constructorimpl(0), 0.0f, 10, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(-1943412047);
            if (function3 != null || (z10 && function2 != null)) {
                SpacerKt.Spacer(SizeKt.m340width3ABfNKs(companion, ChipKt.f6964b), composer2, 6);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composer2);
                Function2 function2C2 = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl2, currentCompositionLocalMap2);
                if (composerM2074constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
                }
                ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(649985685);
                SelectableChipColors selectableChipColors = this.v0;
                boolean z11 = this.f8416w0;
                int i11 = this.f8417x0;
                if (function3 != null) {
                    State<Color> stateLeadingIconColor = selectableChipColors.leadingIconColor(z11, z10, composer2, ((i11 >> 9) & 14) | ((i11 << 3) & 112) | ((i11 >> 15) & 896));
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(stateLeadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2510getAlphaimpl(stateLeadingIconColor.getValue().m2518unboximpl())))}, function3, composer2, ((i11 >> 21) & 112) | 8);
                }
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(-1943411233);
                if (z10 && function2 != null) {
                    State<Color> state = this.f8418y0;
                    long jM2518unboximpl = state.getValue().m2518unboximpl();
                    composer2.startReplaceableGroup(649986516);
                    if (function3 != null) {
                        modifierClip = ClipKt.clip(BackgroundKt.m121backgroundbw27NRU(SizeKt.m327requiredSize3ABfNKs(companion, ChipKt.f6967e), state.getValue().m2518unboximpl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                        jM2518unboximpl = selectableChipColors.backgroundColor(z11, z10, composer2, ((i11 >> 9) & 14) | ((i11 << 3) & 112) | ((i11 >> 15) & 896)).getValue().m2518unboximpl();
                    } else {
                        modifierClip = companion;
                    }
                    composer2.endReplaceableGroup();
                    Alignment center = companion2.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierClip);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composer2);
                    Function2 function2C3 = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, composerM2074constructorimpl3, currentCompositionLocalMap3);
                    if (composerM2074constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash3, composerM2074constructorimpl3, currentCompositeKeyHash3, function2C3);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM2518unboximpl))}, function2, composer2, ((i11 >> 24) & 112) | 8);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                i10 = 6;
                SpacerKt.Spacer(SizeKt.m340width3ABfNKs(companion, ChipKt.f6965c), composer2, 6);
            } else {
                rowScopeInstance = rowScopeInstance;
                i10 = 6;
            }
            composer2.endReplaceableGroup();
            int i12 = this.f8415u0;
            this.f8414t0.invoke(rowScopeInstance, composer2, Integer.valueOf((i12 & 112) | i10));
            composer2.startReplaceableGroup(-1181292829);
            if (function4 != null) {
                SpacerKt.Spacer(SizeKt.m340width3ABfNKs(companion, ChipKt.f6966d), composer2, i10);
                function4.invoke(composer2, Integer.valueOf(i12 & 14));
                SpacerKt.Spacer(SizeKt.m340width3ABfNKs(companion, ChipKt.f6966d), composer2, i10);
            }
            if (androidx.databinding.e.e(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
