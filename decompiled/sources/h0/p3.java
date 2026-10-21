package h0;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ListItemKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/TwoLine\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,429:1\n73#2,6:430\n79#2:464\n83#2:509\n78#3,11:436\n78#3,11:471\n91#3:503\n91#3:508\n456#4,8:447\n464#4,3:461\n456#4,8:482\n464#4,3:496\n467#4,3:500\n467#4,3:505\n4144#5,6:455\n4144#5,6:490\n51#6:465\n67#7,5:466\n72#7:499\n76#7:504\n154#8:510\n154#8:511\n154#8:512\n154#8:513\n154#8:514\n154#8:515\n154#8:516\n154#8:517\n154#8:518\n154#8:519\n154#8:520\n154#8:521\n154#8:522\n154#8:523\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/TwoLine\n*L\n206#1:430,6\n206#1:464\n206#1:509\n206#1:436,11\n211#1:471,11\n211#1:503\n206#1:508\n206#1:447,8\n206#1:461,3\n211#1:482,8\n211#1:496,3\n211#1:500,3\n206#1:505,3\n206#1:455,6\n211#1:490,6\n214#1:465\n211#1:466,5\n211#1:499\n211#1:504\n175#1:510\n176#1:511\n179#1:512\n180#1:513\n181#1:514\n184#1:515\n185#1:516\n186#1:517\n187#1:518\n188#1:519\n189#1:520\n190#1:521\n191#1:522\n194#1:523\n*E\n"})
public final class p3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f69039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f69040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f69041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f69042h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f69044j;
    public static final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f69047n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float f69048o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p3 f69035a = new p3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f69036b = Dp.m4389constructorimpl(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f69037c = Dp.m4389constructorimpl(72);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f69038d = Dp.m4389constructorimpl(40);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f69043i = Dp.m4389constructorimpl(24);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f69045k = Dp.m4389constructorimpl(28);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f69046l = Dp.m4389constructorimpl(32);

    /* JADX INFO: compiled from: ListItem.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f69049p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f69050q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f69051r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, Function2 function2, Function2 function3) {
            super(2);
            this.f69049p0 = function2;
            this.f69050q0 = i10;
            this.f69051r0 = function3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1675021441, iIntValue, -1, "androidx.compose.material.TwoLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:229)");
                }
                int i10 = this.f69050q0;
                this.f69049p0.invoke(composer2, Integer.valueOf((i10 >> 12) & 14));
                this.f69051r0.invoke(composer2, Integer.valueOf((i10 >> 6) & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ListItem.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f69052p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f69053q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f69054r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, Function2 function2, Function2 function3) {
            super(2);
            this.f69052p0 = function2;
            this.f69053q0 = i10;
            this.f69054r0 = function3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(993836488, iIntValue, -1, "androidx.compose.material.TwoLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:248)");
                }
                this.f69052p0.invoke(composer2, Integer.valueOf((this.f69053q0 >> 6) & 14));
                Function2<Composer, Integer, Unit> function2 = this.f69054r0;
                Intrinsics.checkNotNull(function2);
                function2.invoke(composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ListItem.kt */
    @SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/TwoLine$ListItem$1$4\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,429:1\n67#2,5:430\n72#2:463\n76#2:468\n78#3,11:435\n91#3:467\n456#4,8:446\n464#4,3:460\n467#4,3:464\n4144#5,6:454\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/TwoLine$ListItem$1$4\n*L\n262#1:430,5\n262#1:463\n262#1:468\n262#1:435,11\n262#1:467\n262#1:446,8\n262#1:460,3\n262#1:464,3\n262#1:454,6\n*E\n"})
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f69055p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f69056q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f69057r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(float f6, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f69055p0 = f6;
            this.f69056q0 = function2;
            this.f69057r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1696992176, iIntValue, -1, "androidx.compose.material.TwoLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:260)");
                }
                Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(SizeKt.m323heightInVpY3zN4$default(Modifier.INSTANCE, this.f69055p0, 0.0f, 2, null), 0.0f, 0.0f, p3.f69048o, 0.0f, 11, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (androidx.appcompat.widget.g0.d(this.f69056q0, composer2, Integer.valueOf((this.f69057r0 >> 15) & 14))) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ListItem.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f69059q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f69060r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f69061s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f69062t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f69063u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f69064w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f69065x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, Function2<? super Composer, ? super Integer, Unit> function6, int i10, int i11) {
            super(2);
            this.f69059q0 = modifier;
            this.f69060r0 = function2;
            this.f69061s0 = function3;
            this.f69062t0 = function4;
            this.f69063u0 = function5;
            this.v0 = function6;
            this.f69064w0 = i10;
            this.f69065x0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            p3.this.a(this.f69059q0, this.f69060r0, this.f69061s0, this.f69062t0, this.f69063u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f69064w0 | 1), this.f69065x0);
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 16;
        f69039e = Dp.m4389constructorimpl(f6);
        f69040f = Dp.m4389constructorimpl(f6);
        f69041g = Dp.m4389constructorimpl(f6);
        f69042h = Dp.m4389constructorimpl(f6);
        float f10 = 20;
        f69044j = Dp.m4389constructorimpl(f10);
        m = Dp.m4389constructorimpl(f10);
        f69047n = Dp.m4389constructorimpl(f10);
        f69048o = Dp.m4389constructorimpl(f6);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016d  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:105:0x0200  */
    /* JADX WARN: Code duplicated, block: B:108:0x020c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0210  */
    /* JADX WARN: Code duplicated, block: B:112:0x0221  */
    /* JADX WARN: Code duplicated, block: B:114:0x022f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0254  */
    /* JADX WARN: Code duplicated, block: B:119:0x0290  */
    /* JADX WARN: Code duplicated, block: B:121:0x029d  */
    /* JADX WARN: Code duplicated, block: B:122:0x029f  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:130:0x02dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x02de  */
    /* JADX WARN: Code duplicated, block: B:132:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:136:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:141:0x0308  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x013e  */
    /* JADX WARN: Code duplicated, block: B:94:0x014a  */
    /* JADX WARN: Code duplicated, block: B:95:0x014e  */
    /* JADX WARN: Code duplicated, block: B:98:0x015f  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void a(@Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull Function2<? super Composer, ? super Integer, Unit> text, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Function2<? super Composer, ? super Integer, Unit> function5, @Nullable Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        int i13;
        int i14;
        int i15;
        Modifier modifier3;
        float f6;
        Alignment.Companion companion;
        int currentCompositeKeyHash;
        ComposeUiNode.Companion companion2;
        Function0<ComposeUiNode> constructor;
        Composer composerM2074constructorimpl;
        Function2 function2C;
        Modifier.Companion companion3;
        Modifier modifierM300paddingqDBjuR0$default;
        float f10;
        float f11;
        float f12;
        float f13;
        int i16;
        Modifier modifier4;
        float f14;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Composer composerM2074constructorimpl2;
        Function2 function2C2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1340612993);
        int i17 = i11 & 1;
        if (i17 != 0) {
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
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function4) ? 16384 : 8192;
        }
        if ((i11 & 32) == 0) {
            if ((458752 & i10) == 0) {
                i13 = composerStartRestartGroup.changedInstance(function5) ? 131072 : 65536;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((3670016 & i10) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
            i15 = i12;
            if ((2995931 & i15) == 599186 || !composerStartRestartGroup.getSkipping()) {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1340612993, i15, -1, "androidx.compose.material.TwoLine.ListItem (ListItem.kt:196)");
                }
                if (function2 == null) {
                    f6 = f69036b;
                } else {
                    f6 = f69037c;
                }
                Modifier modifierM323heightInVpY3zN4$default = SizeKt.m323heightInVpY3zN4$default(modifier3, f6, 0.0f, 2, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifier5 = modifier3;
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
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                companion3 = Modifier.INSTANCE;
                modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(x.n1.a(rowScopeInstance, companion3, 1.0f, false, 2, null), f69041g, 0.0f, f69042h, 0.0f, 10, null);
                composerStartRestartGroup.startReplaceableGroup(-269995367);
                if (function2 != null) {
                    float f15 = f69039e;
                    Modifier modifierM339sizeInqDBjuR0$default = SizeKt.m339sizeInqDBjuR0$default(companion3, Dp.m4389constructorimpl(f69038d + f15), f6, 0.0f, 0.0f, 12, null);
                    float f16 = f69040f;
                    Modifier modifierM300paddingqDBjuR0$default2 = PaddingKt.m300paddingqDBjuR0$default(modifierM339sizeInqDBjuR0$default, f15, f16, 0.0f, f16, 4, null);
                    Alignment topStart = companion.getTopStart();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topStart, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default2);
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
                    function2C2 = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl2, currentCompositionLocalMap2);
                    if (composerM2074constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    androidx.datastore.preferences.protobuf.q.e((i15 >> 3) & 14, function2, composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                f10 = f69045k;
                f11 = f69046l;
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-269994745);
                    ListItemKt.access$BaselinesOffsetColumn(CollectionsKt__CollectionsKt.listOf((Object[]) new Dp[]{Dp.m4387boximpl(f69043i), Dp.m4387boximpl(f69044j)}), modifierM300paddingqDBjuR0$default, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1675021441, true, new a(i15, function4, text)), composerStartRestartGroup, 390, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    i16 = i15;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-269994465);
                    Dp[] dpArr = new Dp[2];
                    if (function2 != null) {
                        f12 = f11;
                    } else {
                        f12 = f10;
                    }
                    dpArr[0] = Dp.m4387boximpl(f12);
                    if (function2 != null) {
                        f13 = f69047n;
                    } else {
                        f13 = m;
                    }
                    dpArr[1] = Dp.m4387boximpl(f13);
                    i16 = i15;
                    ListItemKt.access$BaselinesOffsetColumn(CollectionsKt__CollectionsKt.listOf((Object[]) dpArr), modifierM300paddingqDBjuR0$default, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 993836488, true, new b(i15, text, function3)), composerStartRestartGroup, BluetoothState.REQUEST_CONNECT_DEVICE, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.startReplaceableGroup(-2000988345);
                if (function5 != null) {
                    if (function2 != null) {
                        f14 = f11;
                    } else {
                        f14 = f10;
                    }
                    ListItemKt.m782access$OffsetToBaselineOrCenterKz89ssw(f14, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1696992176, true, new c(f6, function5, i16)), composerStartRestartGroup, BluetoothState.REQUEST_CONNECT_DEVICE, 2);
                }
                if (androidx.databinding.e.e(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(modifier4, function2, text, function3, function4, function5, i10, i11));
        }
        i13 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i12 |= i13;
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
        } else if ((3670016 & i10) == 0) {
            if (composerStartRestartGroup.changed(this)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i12 |= i14;
        }
        i15 = i12;
        if ((2995931 & i15) == 599186) {
            if (i17 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1340612993, i15, -1, "androidx.compose.material.TwoLine.ListItem (ListItem.kt:196)");
            }
            if (function2 == null) {
                f6 = f69036b;
            } else {
                f6 = f69037c;
            }
            Modifier modifierM323heightInVpY3zN4$default2 = SizeKt.m323heightInVpY3zN4$default(modifier3, f6, 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
            companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(start2, companion.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifier6 = modifier3;
            companion2 = ComposeUiNode.INSTANCE;
            constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM323heightInVpY3zN4$default2);
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
            function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRowMeasurePolicy2, composerM2074constructorimpl, currentCompositionLocalMap3);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            companion3 = Modifier.INSTANCE;
            modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(x.n1.a(rowScopeInstance2, companion3, 1.0f, false, 2, null), f69041g, 0.0f, f69042h, 0.0f, 10, null);
            composerStartRestartGroup.startReplaceableGroup(-269995367);
            if (function2 != null) {
                float f17 = f69039e;
                Modifier modifierM339sizeInqDBjuR0$default2 = SizeKt.m339sizeInqDBjuR0$default(companion3, Dp.m4389constructorimpl(f69038d + f17), f6, 0.0f, 0.0f, 12, null);
                float f18 = f69040f;
                Modifier modifierM300paddingqDBjuR0$default3 = PaddingKt.m300paddingqDBjuR0$default(modifierM339sizeInqDBjuR0$default2, f17, f18, 0.0f, f18, 4, null);
                Alignment topStart2 = companion.getTopStart();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(topStart2, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default3);
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
                function2C2 = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, composerM2074constructorimpl2, currentCompositionLocalMap4);
                if (composerM2074constructorimpl2.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
                }
                ai.a.j(0, function3ModifierMaterializerOf4, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                androidx.datastore.preferences.protobuf.q.e((i15 >> 3) & 14, function2, composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            f10 = f69045k;
            f11 = f69046l;
            if (function4 != null) {
                composerStartRestartGroup.startReplaceableGroup(-269994745);
                ListItemKt.access$BaselinesOffsetColumn(CollectionsKt__CollectionsKt.listOf((Object[]) new Dp[]{Dp.m4387boximpl(f69043i), Dp.m4387boximpl(f69044j)}), modifierM300paddingqDBjuR0$default, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1675021441, true, new a(i15, function4, text)), composerStartRestartGroup, 390, 0);
                composerStartRestartGroup.endReplaceableGroup();
                i16 = i15;
            } else {
                composerStartRestartGroup.startReplaceableGroup(-269994465);
                Dp[] dpArr2 = new Dp[2];
                if (function2 != null) {
                    f12 = f11;
                } else {
                    f12 = f10;
                }
                dpArr2[0] = Dp.m4387boximpl(f12);
                if (function2 != null) {
                    f13 = f69047n;
                } else {
                    f13 = m;
                }
                dpArr2[1] = Dp.m4387boximpl(f13);
                i16 = i15;
                ListItemKt.access$BaselinesOffsetColumn(CollectionsKt__CollectionsKt.listOf((Object[]) dpArr2), modifierM300paddingqDBjuR0$default, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 993836488, true, new b(i15, text, function3)), composerStartRestartGroup, BluetoothState.REQUEST_CONNECT_DEVICE, 0);
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.startReplaceableGroup(-2000988345);
            if (function5 != null) {
                if (function2 != null) {
                    f14 = f11;
                } else {
                    f14 = f10;
                }
                ListItemKt.m782access$OffsetToBaselineOrCenterKz89ssw(f14, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1696992176, true, new c(f6, function5, i16)), composerStartRestartGroup, BluetoothState.REQUEST_CONNECT_DEVICE, 2);
            }
            if (androidx.databinding.e.e(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier6;
        } else {
            if (i17 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1340612993, i15, -1, "androidx.compose.material.TwoLine.ListItem (ListItem.kt:196)");
            }
            if (function2 == null) {
                f6 = f69036b;
            } else {
                f6 = f69037c;
            }
            Modifier modifierM323heightInVpY3zN4$default3 = SizeKt.m323heightInVpY3zN4$default(modifier3, f6, 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement.Horizontal start3 = Arrangement.INSTANCE.getStart();
            companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(start3, companion.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifier7 = modifier3;
            companion2 = ComposeUiNode.INSTANCE;
            constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM323heightInVpY3zN4$default3);
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
            function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRowMeasurePolicy3, composerM2074constructorimpl, currentCompositionLocalMap5);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf5, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            companion3 = Modifier.INSTANCE;
            modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(x.n1.a(rowScopeInstance3, companion3, 1.0f, false, 2, null), f69041g, 0.0f, f69042h, 0.0f, 10, null);
            composerStartRestartGroup.startReplaceableGroup(-269995367);
            if (function2 != null) {
                float f19 = f69039e;
                Modifier modifierM339sizeInqDBjuR0$default3 = SizeKt.m339sizeInqDBjuR0$default(companion3, Dp.m4389constructorimpl(f69038d + f19), f6, 0.0f, 0.0f, 12, null);
                float f110 = f69040f;
                Modifier modifierM300paddingqDBjuR0$default4 = PaddingKt.m300paddingqDBjuR0$default(modifierM339sizeInqDBjuR0$default3, f19, f110, 0.0f, f110, 4, null);
                Alignment topStart3 = companion.getTopStart();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(topStart3, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default4);
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
                function2C2 = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl2, measurePolicyRememberBoxMeasurePolicy3, composerM2074constructorimpl2, currentCompositionLocalMap6);
                if (composerM2074constructorimpl2.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
                }
                ai.a.j(0, function3ModifierMaterializerOf6, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                androidx.datastore.preferences.protobuf.q.e((i15 >> 3) & 14, function2, composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            f10 = f69045k;
            f11 = f69046l;
            if (function4 != null) {
                composerStartRestartGroup.startReplaceableGroup(-269994745);
                ListItemKt.access$BaselinesOffsetColumn(CollectionsKt__CollectionsKt.listOf((Object[]) new Dp[]{Dp.m4387boximpl(f69043i), Dp.m4387boximpl(f69044j)}), modifierM300paddingqDBjuR0$default, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1675021441, true, new a(i15, function4, text)), composerStartRestartGroup, 390, 0);
                composerStartRestartGroup.endReplaceableGroup();
                i16 = i15;
            } else {
                composerStartRestartGroup.startReplaceableGroup(-269994465);
                Dp[] dpArr3 = new Dp[2];
                if (function2 != null) {
                    f12 = f11;
                } else {
                    f12 = f10;
                }
                dpArr3[0] = Dp.m4387boximpl(f12);
                if (function2 != null) {
                    f13 = f69047n;
                } else {
                    f13 = m;
                }
                dpArr3[1] = Dp.m4387boximpl(f13);
                i16 = i15;
                ListItemKt.access$BaselinesOffsetColumn(CollectionsKt__CollectionsKt.listOf((Object[]) dpArr3), modifierM300paddingqDBjuR0$default, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 993836488, true, new b(i15, text, function3)), composerStartRestartGroup, BluetoothState.REQUEST_CONNECT_DEVICE, 0);
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.startReplaceableGroup(-2000988345);
            if (function5 != null) {
                if (function2 != null) {
                    f14 = f11;
                } else {
                    f14 = f10;
                }
                ListItemKt.m782access$OffsetToBaselineOrCenterKz89ssw(f14, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1696992176, true, new c(f6, function5, i16)), composerStartRestartGroup, BluetoothState.REQUEST_CONNECT_DEVICE, 2);
            }
            if (androidx.databinding.e.e(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier7;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(modifier4, function2, text, function3, function4, function5, i10, i11));
    }
}
