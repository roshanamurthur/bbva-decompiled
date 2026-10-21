package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LookaheadScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aB\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a0\u0010\r\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\u000e\u001aR\u0010\u000f\u001a\u00020\t*\u00020\t2A\u0010\u0010\u001a=\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0011¢\u0006\u0002\b\u0007H\u0007ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"LookaheadLayout", "", "content", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LookaheadScope;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "LookaheadScope", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "intermediateLayout", "measure", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/IntermediateMeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Lkotlin/ParameterName;", "name", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLookaheadScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScopeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,326:1\n25#2:327\n365#2,11:334\n1097#3,6:328\n*S KotlinDebug\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScopeKt\n*L\n112#1:327\n113#1:334,11\n112#1:328,6\n*E\n"})
public final class LookaheadScopeKt {

    /* JADX INFO: compiled from: LookaheadScope.kt */
    @SourceDebugExtension({"SMAP\nLookaheadScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScopeKt$LookaheadLayout$1\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,326:1\n78#2,11:327\n91#2:358\n456#3,8:338\n464#3,6:352\n4144#4,6:346\n*S KotlinDebug\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScopeKt$LookaheadLayout$1\n*L\n53#1:327,11\n53#1:358\n53#1:338,8\n53#1:352,6\n53#1:346,6\n*E\n"})
    public static final class a extends Lambda implements Function3<LookaheadScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f16615p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MeasurePolicy f16616q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f16617r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function3<LookaheadScope, Composer, Integer, Unit> f16618s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Modifier modifier, MeasurePolicy measurePolicy, int i10, Function3<? super LookaheadScope, ? super Composer, ? super Integer, Unit> function3) {
            super(3);
            this.f16615p0 = modifier;
            this.f16616q0 = measurePolicy;
            this.f16617r0 = i10;
            this.f16618s0 = function3;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(LookaheadScope lookaheadScope, Composer composer, Integer num) {
            LookaheadScope LookaheadScope = lookaheadScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(LookaheadScope, "$this$LookaheadScope");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changed(LookaheadScope) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1705879204, iIntValue, -1, "androidx.compose.ui.layout.LookaheadLayout.<anonymous> (LookaheadScope.kt:51)");
                }
                int i10 = this.f16617r0;
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(this.f16615p0);
                int i11 = ((((i10 & 112) | (i10 & 896)) << 9) & 7168) | 6;
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
                Updater.m2081setimpl(composerM2074constructorimpl, this.f16616q0, companion.getSetMeasurePolicy());
                Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
                }
                ai.a.j((i11 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                this.f16618s0.invoke(LookaheadScope, composer2, Integer.valueOf((iIntValue & 14) | ((i10 << 3) & 112)));
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LookaheadScope.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<LookaheadScope, Composer, Integer, Unit> f16619p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f16620q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MeasurePolicy f16621r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f16622s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f16623t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function3<? super LookaheadScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, MeasurePolicy measurePolicy, int i10, int i11) {
            super(2);
            this.f16619p0 = function3;
            this.f16620q0 = modifier;
            this.f16621r0 = measurePolicy;
            this.f16622s0 = i10;
            this.f16623t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LookaheadScopeKt.LookaheadLayout(this.f16619p0, this.f16620q0, this.f16621r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f16622s0 | 1), this.f16623t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LookaheadScope.kt */
    public static final class c extends Lambda implements Function0<LayoutNode> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f16624p0 = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final LayoutNode invoke() {
            return new LayoutNode(true, 0, 2, null);
        }
    }

    /* JADX INFO: compiled from: LookaheadScope.kt */
    public static final class d extends Lambda implements Function1<LayoutNode, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f16625p0 = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutNode layoutNode) {
            LayoutNode init = layoutNode;
            Intrinsics.checkNotNullParameter(init, "$this$init");
            init.setVirtualLookaheadRoot$ui_release(true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LookaheadScope.kt */
    public static final class e extends Lambda implements Function2<LayoutNode, LookaheadScopeImpl, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f16626p0 = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, LookaheadScopeImpl lookaheadScopeImpl) {
            LayoutNode set = layoutNode;
            LookaheadScopeImpl scope = lookaheadScopeImpl;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.setScopeCoordinates(new androidx.compose.ui.layout.d(set));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LookaheadScope.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<LookaheadScope, Composer, Integer, Unit> f16627p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f16628q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function3<? super LookaheadScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f16627p0 = function3;
            this.f16628q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f16628q0 | 1);
            LookaheadScopeKt.LookaheadScope(this.f16627p0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @UiComposable
    @Deprecated(message = "LookaheadLayout has been replaced with LookaheadScope that does not require a Modifier or a MeasurePolicy.", replaceWith = @ReplaceWith(expression = "LookaheadScope { Layout(content = { content() }, \n modifier = modifier, measurePolicy = measurePolicy) }", imports = {}))
    @Composable
    @ExperimentalComposeUiApi
    public static final void LookaheadLayout(@NotNull Function3<? super LookaheadScope, ? super Composer, ? super Integer, Unit> content, @Nullable Modifier modifier, @NotNull MeasurePolicy measurePolicy, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        Composer composerStartRestartGroup = composer.startRestartGroup(1551346597);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changed(measurePolicy) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1551346597, i12, -1, "androidx.compose.ui.layout.LookaheadLayout (LookaheadScope.kt:46)");
            }
            LookaheadScope(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1705879204, true, new a(modifier, measurePolicy, i12, content)), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(content, modifier2, measurePolicy, i10, i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    @ExperimentalComposeUiApi
    @UiComposable
    public static final void LookaheadScope(@NotNull Function3<? super LookaheadScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1078066484);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1078066484, i11, -1, "androidx.compose.ui.layout.LookaheadScope (LookaheadScope.kt:110)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new LookaheadScopeImpl(null, 1, 0 == true ? 1 : 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            LookaheadScopeImpl lookaheadScopeImpl = (LookaheadScopeImpl) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-692256719);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(c.f16624p0);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2078initimpl(composerM2074constructorimpl, d.f16625p0);
            Updater.m2081setimpl(composerM2074constructorimpl, lookaheadScopeImpl, e.f16626p0);
            content.invoke(lookaheadScopeImpl, composerStartRestartGroup, Integer.valueOf(((i11 << 3) & 112) | 8));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(content, i10));
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier intermediateLayout(@NotNull Modifier modifier, @NotNull Function3<? super IntermediateMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> measure) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(measure, "measure");
        return modifier.then(new IntermediateLayoutElement(measure));
    }
}
