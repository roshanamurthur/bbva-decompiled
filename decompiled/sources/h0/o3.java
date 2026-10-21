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
import java.util.List;
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
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ThreeLine\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,429:1\n73#2,6:430\n79#2:464\n83#2:510\n78#3,11:436\n78#3,11:471\n91#3:503\n91#3:509\n456#4,8:447\n464#4,3:461\n456#4,8:482\n464#4,3:496\n467#4,3:500\n467#4,3:506\n4144#5,6:455\n4144#5,6:490\n51#6:465\n58#6:505\n67#7,5:466\n72#7:499\n76#7:504\n154#8:511\n154#8:512\n154#8:513\n154#8:514\n154#8:515\n154#8:516\n154#8:517\n154#8:518\n154#8:519\n154#8:520\n154#8:521\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ThreeLine\n*L\n303#1:430,6\n303#1:464\n303#1:510\n303#1:436,11\n306#1:471,11\n306#1:503\n303#1:509\n303#1:447,8\n303#1:461,3\n306#1:482,8\n306#1:496,3\n306#1:500,3\n303#1:506,3\n303#1:455,6\n306#1:490,6\n305#1:465\n332#1:505\n306#1:466,5\n306#1:499\n306#1:504\n276#1:511\n279#1:512\n280#1:513\n281#1:514\n284#1:515\n285#1:516\n286#1:517\n287#1:518\n288#1:519\n289#1:520\n292#1:521\n*E\n"})
public final class o3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f69005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f69006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f69007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f69008g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f69010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f69011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f69012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f69013l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o3 f69002a = new o3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f69003b = Dp.m4389constructorimpl(88);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f69004c = Dp.m4389constructorimpl(40);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f69009h = Dp.m4389constructorimpl(28);

    /* JADX INFO: compiled from: ListItem.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f69014p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f69015q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f69016r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f69017s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, Function2 function2, Function2 function3, Function2 function4) {
            super(2);
            this.f69014p0 = function2;
            this.f69015q0 = i10;
            this.f69016r0 = function3;
            this.f69017s0 = function4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-318094245, iIntValue, -1, "androidx.compose.material.ThreeLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:324)");
                }
                composer2.startReplaceableGroup(-755940677);
                int i10 = this.f69015q0;
                Function2<Composer, Integer, Unit> function2 = this.f69014p0;
                if (function2 != null) {
                    function2.invoke(composer2, Integer.valueOf((i10 >> 12) & 14));
                }
                composer2.endReplaceableGroup();
                this.f69016r0.invoke(composer2, Integer.valueOf((i10 >> 6) & 14));
                this.f69017s0.invoke(composer2, Integer.valueOf((i10 >> 9) & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ListItem.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f69019q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f69020r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f69021s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f69022t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f69023u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f69024w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f69025x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, Function2<? super Composer, ? super Integer, Unit> function6, int i10, int i11) {
            super(2);
            this.f69019q0 = modifier;
            this.f69020r0 = function2;
            this.f69021s0 = function3;
            this.f69022t0 = function4;
            this.f69023u0 = function5;
            this.v0 = function6;
            this.f69024w0 = i10;
            this.f69025x0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o3.this.a(this.f69019q0, this.f69020r0, this.f69021s0, this.f69022t0, this.f69023u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f69024w0 | 1), this.f69025x0);
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 16;
        f69005d = Dp.m4389constructorimpl(f6);
        f69006e = Dp.m4389constructorimpl(f6);
        f69007f = Dp.m4389constructorimpl(f6);
        f69008g = Dp.m4389constructorimpl(f6);
        float f10 = 20;
        f69010i = Dp.m4389constructorimpl(f10);
        f69011j = Dp.m4389constructorimpl(f10);
        f69012k = Dp.m4389constructorimpl(f6);
        f69013l = Dp.m4389constructorimpl(f6);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018a  */
    /* JADX WARN: Code duplicated, block: B:102:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:109:0x0201  */
    /* JADX WARN: Code duplicated, block: B:111:0x020f  */
    /* JADX WARN: Code duplicated, block: B:115:0x028c  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x013f  */
    /* JADX WARN: Code duplicated, block: B:91:0x014b  */
    /* JADX WARN: Code duplicated, block: B:92:0x014f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0160  */
    /* JADX WARN: Code duplicated, block: B:97:0x016e  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void a(@Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull Function2<? super Composer, ? super Integer, Unit> text, @NotNull Function2<? super Composer, ? super Integer, Unit> secondaryText, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        int i13;
        int i14;
        int i15;
        Modifier modifier3;
        Alignment.Companion companion;
        int currentCompositeKeyHash;
        ComposeUiNode.Companion companion2;
        Function0<ComposeUiNode> constructor;
        Composer composerM2074constructorimpl;
        Function2 function2C;
        float f6;
        Modifier.Companion companion3;
        Modifier modifier4;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Composer composerM2074constructorimpl2;
        Function2 function2C2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Composer composerStartRestartGroup = composer.startRestartGroup(1749738797);
        int i16 = i11 & 1;
        if (i16 != 0) {
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
            i12 |= composerStartRestartGroup.changedInstance(secondaryText) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if ((i11 & 32) == 0) {
            if ((458752 & i10) == 0) {
                i13 = composerStartRestartGroup.changedInstance(function4) ? 131072 : 65536;
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
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1749738797, i15, -1, "androidx.compose.material.ThreeLine.ListItem (ListItem.kt:294)");
                }
                Modifier modifierM323heightInVpY3zN4$default = SizeKt.m323heightInVpY3zN4$default(modifier3, f69003b, 0.0f, 2, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                companion2 = ComposeUiNode.INSTANCE;
                Modifier modifier5 = modifier3;
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
                composerStartRestartGroup.startReplaceableGroup(-280382992);
                if (function2 != null) {
                    float f10 = f69005d;
                    float fM4389constructorimpl = Dp.m4389constructorimpl(f10 + f69004c);
                    Modifier modifierM339sizeInqDBjuR0$default = SizeKt.m339sizeInqDBjuR0$default(Modifier.INSTANCE, fM4389constructorimpl, fM4389constructorimpl, 0.0f, 0.0f, 12, null);
                    float f11 = f69006e;
                    Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(modifierM339sizeInqDBjuR0$default, f10, f11, 0.0f, f11, 4, null);
                    Alignment centerStart = companion.getCenterStart();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default);
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
                f6 = f69009h;
                List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Dp[]{Dp.m4387boximpl(f6), Dp.m4387boximpl(f69010i), Dp.m4387boximpl(f69011j)});
                companion3 = Modifier.INSTANCE;
                ListItemKt.access$BaselinesOffsetColumn(listListOf, PaddingKt.m300paddingqDBjuR0$default(x.n1.a(rowScopeInstance, companion3, 1.0f, false, 2, null), f69007f, 0.0f, f69008g, 0.0f, 10, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -318094245, true, new a(i15, function3, text, secondaryText)), composerStartRestartGroup, 390, 0);
                composerStartRestartGroup.startReplaceableGroup(-678936717);
                if (function4 != null) {
                    float f12 = f69012k;
                    ListItemKt.m782access$OffsetToBaselineOrCenterKz89ssw(Dp.m4389constructorimpl(f6 - f12), PaddingKt.m300paddingqDBjuR0$default(companion3, 0.0f, f12, f69013l, 0.0f, 9, null), function4, composerStartRestartGroup, ((i15 >> 9) & 896) | 54, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier4, function2, text, secondaryText, function3, function4, i10, i11));
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
            if (i16 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1749738797, i15, -1, "androidx.compose.material.ThreeLine.ListItem (ListItem.kt:294)");
            }
            Modifier modifierM323heightInVpY3zN4$default2 = SizeKt.m323heightInVpY3zN4$default(modifier3, f69003b, 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
            companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(start2, companion.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            companion2 = ComposeUiNode.INSTANCE;
            Modifier modifier6 = modifier3;
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
            composerStartRestartGroup.startReplaceableGroup(-280382992);
            if (function2 != null) {
                float f13 = f69005d;
                float fM4389constructorimpl2 = Dp.m4389constructorimpl(f13 + f69004c);
                Modifier modifierM339sizeInqDBjuR0$default2 = SizeKt.m339sizeInqDBjuR0$default(Modifier.INSTANCE, fM4389constructorimpl2, fM4389constructorimpl2, 0.0f, 0.0f, 12, null);
                float f14 = f69006e;
                Modifier modifierM300paddingqDBjuR0$default2 = PaddingKt.m300paddingqDBjuR0$default(modifierM339sizeInqDBjuR0$default2, f13, f14, 0.0f, f14, 4, null);
                Alignment centerStart2 = companion.getCenterStart();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(centerStart2, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default2);
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
            f6 = f69009h;
            List listListOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Dp[]{Dp.m4387boximpl(f6), Dp.m4387boximpl(f69010i), Dp.m4387boximpl(f69011j)});
            companion3 = Modifier.INSTANCE;
            ListItemKt.access$BaselinesOffsetColumn(listListOf2, PaddingKt.m300paddingqDBjuR0$default(x.n1.a(rowScopeInstance2, companion3, 1.0f, false, 2, null), f69007f, 0.0f, f69008g, 0.0f, 10, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -318094245, true, new a(i15, function3, text, secondaryText)), composerStartRestartGroup, 390, 0);
            composerStartRestartGroup.startReplaceableGroup(-678936717);
            if (function4 != null) {
                float f15 = f69012k;
                ListItemKt.m782access$OffsetToBaselineOrCenterKz89ssw(Dp.m4389constructorimpl(f6 - f15), PaddingKt.m300paddingqDBjuR0$default(companion3, 0.0f, f15, f69013l, 0.0f, 9, null), function4, composerStartRestartGroup, ((i15 >> 9) & 896) | 54, 0);
            }
            if (androidx.databinding.e.e(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier6;
        } else {
            if (i16 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1749738797, i15, -1, "androidx.compose.material.ThreeLine.ListItem (ListItem.kt:294)");
            }
            Modifier modifierM323heightInVpY3zN4$default3 = SizeKt.m323heightInVpY3zN4$default(modifier3, f69003b, 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement.Horizontal start3 = Arrangement.INSTANCE.getStart();
            companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(start3, companion.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            companion2 = ComposeUiNode.INSTANCE;
            Modifier modifier7 = modifier3;
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
            composerStartRestartGroup.startReplaceableGroup(-280382992);
            if (function2 != null) {
                float f16 = f69005d;
                float fM4389constructorimpl3 = Dp.m4389constructorimpl(f16 + f69004c);
                Modifier modifierM339sizeInqDBjuR0$default3 = SizeKt.m339sizeInqDBjuR0$default(Modifier.INSTANCE, fM4389constructorimpl3, fM4389constructorimpl3, 0.0f, 0.0f, 12, null);
                float f17 = f69006e;
                Modifier modifierM300paddingqDBjuR0$default3 = PaddingKt.m300paddingqDBjuR0$default(modifierM339sizeInqDBjuR0$default3, f16, f17, 0.0f, f17, 4, null);
                Alignment centerStart3 = companion.getCenterStart();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(centerStart3, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default3);
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
            f6 = f69009h;
            List listListOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new Dp[]{Dp.m4387boximpl(f6), Dp.m4387boximpl(f69010i), Dp.m4387boximpl(f69011j)});
            companion3 = Modifier.INSTANCE;
            ListItemKt.access$BaselinesOffsetColumn(listListOf3, PaddingKt.m300paddingqDBjuR0$default(x.n1.a(rowScopeInstance3, companion3, 1.0f, false, 2, null), f69007f, 0.0f, f69008g, 0.0f, 10, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -318094245, true, new a(i15, function3, text, secondaryText)), composerStartRestartGroup, 390, 0);
            composerStartRestartGroup.startReplaceableGroup(-678936717);
            if (function4 != null) {
                float f18 = f69012k;
                ListItemKt.m782access$OffsetToBaselineOrCenterKz89ssw(Dp.m4389constructorimpl(f6 - f18), PaddingKt.m300paddingqDBjuR0$default(companion3, 0.0f, f18, f69013l, 0.0f, 9, null), function4, composerStartRestartGroup, ((i15 >> 9) & 896) | 54, 0);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier4, function2, text, secondaryText, function3, function4, i10, i11));
    }
}
