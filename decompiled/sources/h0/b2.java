package h0;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/OneLine\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,429:1\n73#2,6:430\n79#2:464\n83#2:588\n78#3,11:436\n78#3,11:471\n91#3:503\n78#3,11:510\n91#3:542\n78#3,11:550\n91#3:582\n91#3:587\n456#4,8:447\n464#4,3:461\n456#4,8:482\n464#4,3:496\n467#4,3:500\n456#4,8:521\n464#4,3:535\n467#4,3:539\n456#4,8:561\n464#4,3:575\n467#4,3:579\n467#4,3:584\n4144#5,6:455\n4144#5,6:490\n4144#5,6:529\n4144#5,6:569\n51#6:465\n67#7,5:466\n72#7:499\n76#7:504\n67#7,5:505\n72#7:538\n76#7:543\n66#7,6:544\n72#7:578\n76#7:583\n154#8:589\n154#8:590\n154#8:591\n154#8:592\n154#8:593\n154#8:594\n154#8:595\n154#8:596\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/OneLine\n*L\n143#1:430,6\n143#1:464\n143#1:588\n143#1:436,11\n145#1:471,11\n145#1:503\n156#1:510,11\n156#1:542\n163#1:550,11\n163#1:582\n143#1:587\n143#1:447,8\n143#1:461,3\n145#1:482,8\n145#1:496,3\n145#1:500,3\n156#1:521,8\n156#1:535,3\n156#1:539,3\n163#1:561,8\n163#1:575,3\n163#1:579,3\n143#1:584,3\n143#1:455,6\n145#1:490,6\n156#1:529,6\n163#1:569,6\n147#1:465\n145#1:466,5\n145#1:499\n145#1:504\n156#1:505,5\n156#1:538\n156#1:543\n163#1:544,6\n163#1:578\n163#1:583\n120#1:589\n121#1:590\n124#1:591\n125#1:592\n126#1:593\n129#1:594\n130#1:595\n133#1:596\n*E\n"})
public final class b2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f68665e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f68667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f68668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f68669i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b2 f68661a = new b2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f68662b = Dp.m4389constructorimpl(48);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f68663c = Dp.m4389constructorimpl(56);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f68664d = Dp.m4389constructorimpl(40);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f68666f = Dp.m4389constructorimpl(8);

    /* JADX INFO: compiled from: ListItem.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f68671q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f68672r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f68673s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f68674t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f68675u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, int i10, int i11) {
            super(2);
            this.f68671q0 = modifier;
            this.f68672r0 = function2;
            this.f68673s0 = function3;
            this.f68674t0 = function4;
            this.f68675u0 = i10;
            this.v0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            b2.this.a(this.f68671q0, this.f68672r0, this.f68673s0, this.f68674t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f68675u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 16;
        f68665e = Dp.m4389constructorimpl(f6);
        f68667g = Dp.m4389constructorimpl(f6);
        f68668h = Dp.m4389constructorimpl(f6);
        f68669i = Dp.m4389constructorimpl(f6);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0255  */
    /* JADX WARN: Code duplicated, block: B:102:0x0259  */
    /* JADX WARN: Code duplicated, block: B:105:0x026a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0278  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:112:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:119:0x030a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0318  */
    /* JADX WARN: Code duplicated, block: B:125:0x0337  */
    /* JADX WARN: Code duplicated, block: B:129:0x0343  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x0102  */
    /* JADX WARN: Code duplicated, block: B:74:0x010e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0112  */
    /* JADX WARN: Code duplicated, block: B:78:0x0123  */
    /* JADX WARN: Code duplicated, block: B:80:0x0131  */
    /* JADX WARN: Code duplicated, block: B:83:0x014d  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:98:0x0249  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void a(@Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull Function2<? super Composer, ? super Integer, Unit> text, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        float f6;
        Alignment.Companion companion;
        int currentCompositeKeyHash;
        ComposeUiNode.Companion companion2;
        Function0<ComposeUiNode> constructor;
        Composer composerM2074constructorimpl;
        Function2 function2C;
        RowScopeInstance rowScopeInstance;
        Modifier.Companion companion3;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Composer composerM2074constructorimpl2;
        Function2 function2C2;
        int currentCompositeKeyHash3;
        Function0<ComposeUiNode> constructor3;
        Composer composerM2074constructorimpl3;
        Function2 function2C3;
        int currentCompositeKeyHash4;
        Function0<ComposeUiNode> constructor4;
        Composer composerM2074constructorimpl4;
        Function2 function2C4;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1884451315);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(text) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i11 & 16) == 0) {
            if ((57344 & i10) == 0) {
                i12 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
            }
            if ((46811 & i12) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1884451315, i12, -1, "androidx.compose.material.OneLine.ListItem (ListItem.kt:135)");
                }
                if (function2 == null) {
                    f6 = f68662b;
                } else {
                    f6 = f68663c;
                }
                Modifier modifierM323heightInVpY3zN4$default = SizeKt.m323heightInVpY3zN4$default(modifier2, f6, 0.0f, 2, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM323heightInVpY3zN4$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1825884304);
                if (function2 != null) {
                    Modifier modifierAlign = rowScopeInstance.align(Modifier.INSTANCE, companion.getCenterVertically());
                    float f10 = f68665e;
                    Modifier modifierM342widthInVpY3zN4$default = SizeKt.m342widthInVpY3zN4$default(modifierAlign, Dp.m4389constructorimpl(f10 + f68664d), 0.0f, 2, null);
                    float f11 = f68666f;
                    Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(modifierM342widthInVpY3zN4$default, f10, f11, 0.0f, f11, 4, null);
                    Alignment centerStart = companion.getCenterStart();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor4 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl4 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C4 = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl4, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl4, currentCompositionLocalMap2);
                    if (composerM2074constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash4, composerM2074constructorimpl4, currentCompositeKeyHash4, function2C4);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    androidx.datastore.preferences.protobuf.q.e((i12 >> 3) & 14, function2, composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                companion3 = Modifier.INSTANCE;
                Modifier modifierM300paddingqDBjuR0$default2 = PaddingKt.m300paddingqDBjuR0$default(rowScopeInstance.align(x.n1.a(rowScopeInstance, companion3, 1.0f, false, 2, null), companion.getCenterVertically()), f68667g, 0.0f, f68668h, 0.0f, 10, null);
                Alignment centerStart2 = companion.getCenterStart();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(centerStart2, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C2 = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, composerM2074constructorimpl2, currentCompositionLocalMap3);
                if (composerM2074constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
                }
                ai.a.j(0, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                text.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 6) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-2068381427);
                if (function3 != null) {
                    Modifier modifierM300paddingqDBjuR0$default3 = PaddingKt.m300paddingqDBjuR0$default(rowScopeInstance.align(companion3, companion.getCenterVertically()), 0.0f, 0.0f, f68669i, 0.0f, 11, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor3 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default3);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C3 = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl3, measurePolicyC, composerM2074constructorimpl3, currentCompositionLocalMap4);
                    if (composerM2074constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash3, composerM2074constructorimpl3, currentCompositeKeyHash3, function2C3);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf4, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    androidx.datastore.preferences.protobuf.q.e((i12 >> 9) & 14, function3, composerStartRestartGroup);
                }
                if (androidx.databinding.e.e(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier3, function2, text, function3, i10, i11));
        }
        i12 |= 24576;
        if ((46811 & i12) == 9362) {
            if (i13 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1884451315, i12, -1, "androidx.compose.material.OneLine.ListItem (ListItem.kt:135)");
            }
            if (function2 == null) {
                f6 = f68662b;
            } else {
                f6 = f68663c;
            }
            Modifier modifierM323heightInVpY3zN4$default2 = SizeKt.m323heightInVpY3zN4$default(modifier2, f6, 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
            companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(start2, companion.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            companion2 = ComposeUiNode.INSTANCE;
            constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM323heightInVpY3zN4$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRowMeasurePolicy2, composerM2074constructorimpl, currentCompositionLocalMap5);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf5, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1825884304);
            if (function2 != null) {
                Modifier modifierAlign2 = rowScopeInstance.align(Modifier.INSTANCE, companion.getCenterVertically());
                float f12 = f68665e;
                Modifier modifierM342widthInVpY3zN4$default2 = SizeKt.m342widthInVpY3zN4$default(modifierAlign2, Dp.m4389constructorimpl(f12 + f68664d), 0.0f, 2, null);
                float f13 = f68666f;
                Modifier modifierM300paddingqDBjuR0$default4 = PaddingKt.m300paddingqDBjuR0$default(modifierM342widthInVpY3zN4$default2, f12, f13, 0.0f, f13, 4, null);
                Alignment centerStart3 = companion.getCenterStart();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(centerStart3, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor4 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default4);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl4 = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C4 = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, composerM2074constructorimpl4, currentCompositionLocalMap6);
                if (composerM2074constructorimpl4.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash4, composerM2074constructorimpl4, currentCompositeKeyHash4, function2C4);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash4, composerM2074constructorimpl4, currentCompositeKeyHash4, function2C4);
                }
                ai.a.j(0, function3ModifierMaterializerOf6, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                androidx.datastore.preferences.protobuf.q.e((i12 >> 3) & 14, function2, composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            companion3 = Modifier.INSTANCE;
            Modifier modifierM300paddingqDBjuR0$default5 = PaddingKt.m300paddingqDBjuR0$default(rowScopeInstance.align(x.n1.a(rowScopeInstance, companion3, 1.0f, false, 2, null), companion.getCenterVertically()), f68667g, 0.0f, f68668h, 0.0f, 10, null);
            Alignment centerStart4 = companion.getCenterStart();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(centerStart4, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default5);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C2 = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl2, measurePolicyRememberBoxMeasurePolicy4, composerM2074constructorimpl2, currentCompositionLocalMap7);
            if (composerM2074constructorimpl2.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
            }
            ai.a.j(0, function3ModifierMaterializerOf7, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            text.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 6) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-2068381427);
            if (function3 != null) {
                Modifier modifierM300paddingqDBjuR0$default6 = PaddingKt.m300paddingqDBjuR0$default(rowScopeInstance.align(companion3, companion.getCenterVertically()), 0.0f, 0.0f, f68669i, 0.0f, 11, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(companion, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default6);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C3 = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl3, measurePolicyC2, composerM2074constructorimpl3, currentCompositionLocalMap8);
                if (composerM2074constructorimpl3.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash3, composerM2074constructorimpl3, currentCompositeKeyHash3, function2C3);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash3, composerM2074constructorimpl3, currentCompositeKeyHash3, function2C3);
                }
                ai.a.j(0, function3ModifierMaterializerOf8, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                androidx.datastore.preferences.protobuf.q.e((i12 >> 9) & 14, function3, composerStartRestartGroup);
            }
            if (androidx.databinding.e.e(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i13 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1884451315, i12, -1, "androidx.compose.material.OneLine.ListItem (ListItem.kt:135)");
            }
            if (function2 == null) {
                f6 = f68662b;
            } else {
                f6 = f68663c;
            }
            Modifier modifierM323heightInVpY3zN4$default3 = SizeKt.m323heightInVpY3zN4$default(modifier2, f6, 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement.Horizontal start3 = Arrangement.INSTANCE.getStart();
            companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(start3, companion.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            companion2 = ComposeUiNode.INSTANCE;
            constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM323heightInVpY3zN4$default3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRowMeasurePolicy3, composerM2074constructorimpl, currentCompositionLocalMap9);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf9, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1825884304);
            if (function2 != null) {
                Modifier modifierAlign3 = rowScopeInstance.align(Modifier.INSTANCE, companion.getCenterVertically());
                float f14 = f68665e;
                Modifier modifierM342widthInVpY3zN4$default3 = SizeKt.m342widthInVpY3zN4$default(modifierAlign3, Dp.m4389constructorimpl(f14 + f68664d), 0.0f, 2, null);
                float f15 = f68666f;
                Modifier modifierM300paddingqDBjuR0$default7 = PaddingKt.m300paddingqDBjuR0$default(modifierM342widthInVpY3zN4$default3, f14, f15, 0.0f, f15, 4, null);
                Alignment centerStart5 = companion.getCenterStart();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(centerStart5, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor4 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default7);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl4 = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C4 = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl4, measurePolicyRememberBoxMeasurePolicy5, composerM2074constructorimpl4, currentCompositionLocalMap10);
                if (composerM2074constructorimpl4.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash4, composerM2074constructorimpl4, currentCompositeKeyHash4, function2C4);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash4, composerM2074constructorimpl4, currentCompositeKeyHash4, function2C4);
                }
                ai.a.j(0, function3ModifierMaterializerOf10, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                androidx.datastore.preferences.protobuf.q.e((i12 >> 3) & 14, function2, composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            companion3 = Modifier.INSTANCE;
            Modifier modifierM300paddingqDBjuR0$default8 = PaddingKt.m300paddingqDBjuR0$default(rowScopeInstance.align(x.n1.a(rowScopeInstance, companion3, 1.0f, false, 2, null), companion.getCenterVertically()), f68667g, 0.0f, f68668h, 0.0f, 10, null);
            Alignment centerStart6 = companion.getCenterStart();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(centerStart6, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default8);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C2 = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl2, measurePolicyRememberBoxMeasurePolicy6, composerM2074constructorimpl2, currentCompositionLocalMap11);
            if (composerM2074constructorimpl2.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
            }
            ai.a.j(0, function3ModifierMaterializerOf11, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            text.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 6) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-2068381427);
            if (function3 != null) {
                Modifier modifierM300paddingqDBjuR0$default9 = PaddingKt.m300paddingqDBjuR0$default(rowScopeInstance.align(companion3, companion.getCenterVertically()), 0.0f, 0.0f, f68669i, 0.0f, 11, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC3 = androidx.databinding.f.c(companion, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default9);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C3 = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl3, measurePolicyC3, composerM2074constructorimpl3, currentCompositionLocalMap12);
                if (composerM2074constructorimpl3.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash3, composerM2074constructorimpl3, currentCompositeKeyHash3, function2C3);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash3, composerM2074constructorimpl3, currentCompositeKeyHash3, function2C3);
                }
                ai.a.j(0, function3ModifierMaterializerOf12, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                androidx.datastore.preferences.protobuf.q.e((i12 >> 9) & 14, function3, composerStartRestartGroup);
            }
            if (androidx.databinding.e.e(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        modifier3 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier3, function2, text, function3, i10, i11));
    }
}
