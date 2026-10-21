package androidx.compose.material.pullrefresh;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ElevationOverlay;
import androidx.compose.material.ElevationOverlayKt;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.databinding.f;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.mypinpad.tsdk.isolation.y2;
import j0.d;
import j0.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PullRefreshIndicator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aM\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011²\u0006\f\u0010\u000e\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"", "refreshing", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", ImageScaleTypeHandler.ID, "", "PullRefreshIndicator-jB83MbM", "(ZLandroidx/compose/material/pullrefresh/PullRefreshState;Landroidx/compose/ui/Modifier;JJZLandroidx/compose/runtime/Composer;II)V", "PullRefreshIndicator", "showElevation", "", "targetAlpha", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPullRefreshIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,250:1\n50#2:251\n49#2:252\n456#2,8:278\n464#2,3:292\n467#2,3:296\n25#2:301\n36#2:309\n1097#3,6:253\n1097#3,3:302\n1100#3,3:306\n1097#3,6:310\n76#4:259\n154#5:260\n154#5:334\n164#5:335\n164#5:336\n154#5:337\n154#5:338\n154#5:339\n66#6,6:261\n72#6:295\n76#6:300\n78#7,11:267\n91#7:299\n4144#8,6:286\n1#9:305\n136#10,5:316\n261#10,11:321\n81#11:332\n81#11:333\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt\n*L\n83#1:251\n83#1:252\n94#1:278,8\n94#1:292,3\n94#1:296,3\n135#1:301\n137#1:309\n83#1:253,6\n135#1:302,3\n135#1:306,3\n137#1:310,6\n90#1:259\n98#1:260\n238#1:334\n240#1:335\n241#1:336\n242#1:337\n243#1:338\n244#1:339\n94#1:261,6\n94#1:295\n94#1:300\n94#1:267,11\n94#1:299\n94#1:286,6\n230#1:316,5\n230#1:321,11\n83#1:332\n137#1:333\n*E\n"})
public final class PullRefreshIndicatorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f8865a = Dp.m4389constructorimpl(40);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final RoundedCornerShape f8866b = RoundedCornerShapeKt.getCircleShape();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f8867c = Dp.m4389constructorimpl((float) 7.5d);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f8868d = Dp.m4389constructorimpl((float) 2.5d);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f8869e = Dp.m4389constructorimpl(10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f8870f = Dp.m4389constructorimpl(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f8871g = Dp.m4389constructorimpl(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final TweenSpec<Float> f8872h = AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearEasing(), 2, null);

    /* JADX INFO: compiled from: PullRefreshIndicator.kt */
    @SourceDebugExtension({"SMAP\nPullRefreshIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$PullRefreshIndicator$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,250:1\n67#2,5:251\n72#2:284\n76#2:291\n78#3,11:256\n91#3:290\n456#4,8:267\n464#4,3:281\n467#4,3:287\n4144#5,6:275\n51#6:285\n92#6:286\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$PullRefreshIndicator$1$1\n*L\n105#1:251,5\n105#1:284\n105#1:291\n105#1:256,11\n105#1:290\n105#1:267,8\n105#1:281,3\n105#1:287,3\n105#1:275,6\n109#1:285\n109#1:286\n*E\n"})
    public static final class a extends Lambda implements Function3<Boolean, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f8873p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f8874q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PullRefreshState f8875r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, int i10, PullRefreshState pullRefreshState) {
            super(3);
            this.f8873p0 = j10;
            this.f8874q0 = i10;
            this.f8875r0 = pullRefreshState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Boolean bool, Composer composer, Integer num) {
            int i10;
            boolean zBooleanValue = bool.booleanValue();
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                i10 = (composer2.changed(zBooleanValue) ? 4 : 2) | iIntValue;
            } else {
                i10 = iIntValue;
            }
            if ((i10 & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1853731063, iIntValue, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator.<anonymous>.<anonymous> (PullRefreshIndicator.kt:103)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                long j10 = this.f8873p0;
                PullRefreshState pullRefreshState = this.f8875r0;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
                Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                float fM4389constructorimpl = Dp.m4389constructorimpl(Dp.m4389constructorimpl(PullRefreshIndicatorKt.f8868d + PullRefreshIndicatorKt.f8867c) * 2);
                int i11 = this.f8874q0;
                if (zBooleanValue) {
                    composer2.startReplaceableGroup(-2035147035);
                    ProgressIndicatorKt.m799CircularProgressIndicatorLxG7B9w(SizeKt.m335size3ABfNKs(companion, fM4389constructorimpl), j10, PullRefreshIndicatorKt.f8868d, 0L, 0, composer2, ((i11 >> 9) & 112) | 390, 24);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(-2035146781);
                    PullRefreshIndicatorKt.m890access$CircularArrowIndicatoriJQMabo(pullRefreshState, j10, SizeKt.m335size3ABfNKs(companion, fM4389constructorimpl), composer2, ((i11 >> 9) & 112) | 392);
                    composer2.endReplaceableGroup();
                }
                if (y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: PullRefreshIndicator.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f8876p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PullRefreshState f8877q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f8878r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f8879s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f8880t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f8881u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f8882w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, PullRefreshState pullRefreshState, Modifier modifier, long j10, long j11, boolean z11, int i10, int i11) {
            super(2);
            this.f8876p0 = z10;
            this.f8877q0 = pullRefreshState;
            this.f8878r0 = modifier;
            this.f8879s0 = j10;
            this.f8880t0 = j11;
            this.f8881u0 = z11;
            this.v0 = i10;
            this.f8882w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            PullRefreshIndicatorKt.m889PullRefreshIndicatorjB83MbM(this.f8876p0, this.f8877q0, this.f8878r0, this.f8879s0, this.f8880t0, this.f8881u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f8882w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: PullRefreshIndicator.kt */
    public static final class c extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f8883p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PullRefreshState f8884q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PullRefreshState pullRefreshState, boolean z10) {
            super(0);
            this.f8883p0 = z10;
            this.f8884q0 = pullRefreshState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f8883p0 || this.f8884q0.getPosition$material_release() > 0.5f);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterialApi
    /* JADX INFO: renamed from: PullRefreshIndicator-jB83MbM, reason: not valid java name */
    public static final void m889PullRefreshIndicatorjB83MbM(boolean z10, @NotNull PullRefreshState state, @Nullable Modifier modifier, long j10, long j11, boolean z11, @Nullable Composer composer, int i10, int i11) {
        long jM717getSurface0d7_KjU;
        int i12;
        long j12;
        Color colorM2498boximpl;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(308716636);
        Modifier modifier2 = (i11 & 4) != 0 ? Modifier.INSTANCE : modifier;
        if ((i11 & 8) != 0) {
            i12 = i10 & (-7169);
            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
        } else {
            jM717getSurface0d7_KjU = j10;
            i12 = i10;
        }
        if ((i11 & 16) != 0) {
            long jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
            i12 &= -57345;
            j12 = jM731contentColorForek8zF_U;
        } else {
            j12 = j11;
        }
        boolean z12 = (i11 & 32) != 0 ? false : z11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(308716636, i12, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator (PullRefreshIndicator.kt:74)");
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        int i13 = i12 & 14;
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(state);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new c(state, z10));
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        State state2 = (State) objRememberedValue;
        ElevationOverlay elevationOverlay = (ElevationOverlay) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalElevationOverlay());
        composerStartRestartGroup.startReplaceableGroup(52228748);
        if (elevationOverlay == null) {
            colorM2498boximpl = null;
        } else {
            colorM2498boximpl = Color.m2498boximpl(elevationOverlay.mo760apply7g2Lkgo(jM717getSurface0d7_KjU, f8871g, composerStartRestartGroup, ((i12 >> 9) & 14) | 48));
        }
        composerStartRestartGroup.endReplaceableGroup();
        long jM2518unboximpl = colorM2498boximpl != null ? colorM2498boximpl.m2518unboximpl() : jM717getSurface0d7_KjU;
        Modifier modifierPullRefreshIndicatorTransform = PullRefreshIndicatorTransformKt.pullRefreshIndicatorTransform(SizeKt.m335size3ABfNKs(modifier2, f8865a), state, z12);
        float fM4389constructorimpl = ((Boolean) state2.getValue()).booleanValue() ? f8871g : Dp.m4389constructorimpl(0);
        RoundedCornerShape roundedCornerShape = f8866b;
        Modifier modifierM121backgroundbw27NRU = BackgroundKt.m121backgroundbw27NRU(ShadowKt.m2202shadows4CzXII$default(modifierPullRefreshIndicatorTransform, fM4389constructorimpl, roundedCornerShape, true, 0L, 0L, 24, null), jM2518unboximpl, roundedCornerShape);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyC = f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM121backgroundbw27NRU);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
        Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, currentCompositionLocalMap);
        if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
        }
        ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        long j13 = j12;
        CrossfadeKt.Crossfade(Boolean.valueOf(z10), (Modifier) null, AnimationSpecKt.tween$default(100, 0, null, 6, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1853731063, true, new a(j12, i12, state)), composerStartRestartGroup, i13 | 24960, 10);
        if (y2.d(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, state, modifier2, jM717getSurface0d7_KjU, j13, z12, i10, i11));
    }

    public static final j0.a access$ArrowValues(float f6) {
        float fMax = (Math.max(Math.min(1.0f, f6) - 0.4f, 0.0f) * 5) / 3;
        float fCoerceIn = kotlin.ranges.c.coerceIn(Math.abs(f6) - 1.0f, 0.0f, 2.0f);
        float fPow = (((0.4f * fMax) - 0.25f) + (fCoerceIn - (((float) Math.pow(fCoerceIn, 2)) / 4))) * 0.5f;
        float f10 = 360;
        return new j0.a(fPow, fPow * f10, ((0.8f * fMax) + fPow) * f10, Math.min(1.0f, fMax));
    }

    /* JADX INFO: renamed from: access$CircularArrowIndicator-iJQMabo, reason: not valid java name */
    public static final void m890access$CircularArrowIndicatoriJQMabo(PullRefreshState pullRefreshState, long j10, Modifier modifier, Composer composer, int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-486016981);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-486016981, i10, -1, "androidx.compose.material.pullrefresh.CircularArrowIndicator (PullRefreshIndicator.kt:129)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        Object obj = objRememberedValue;
        if (objRememberedValue == companion.getEmpty()) {
            Path Path = AndroidPath_androidKt.Path();
            Path.mo2410setFillTypeoQ8Xj4U(PathFillType.INSTANCE.m2748getEvenOddRgk1Os());
            composerStartRestartGroup.updateRememberedValue(Path);
            obj = Path;
        }
        composerStartRestartGroup.endReplaceableGroup();
        Path path = (Path) obj;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(pullRefreshState);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new e(pullRefreshState));
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CanvasKt.Canvas(SemanticsModifierKt.semantics$default(modifier, false, j0.b.f78735p0, 1, null), new j0.c(pullRefreshState, AnimateAsStateKt.animateFloatAsState(((Number) ((State) objRememberedValue2).getValue()).floatValue(), f8872h, 0.0f, null, null, composerStartRestartGroup, 48, 28), j10, path), composerStartRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(pullRefreshState, j10, modifier, i10));
    }

    /* JADX INFO: renamed from: access$drawArrow-Bx497Mc, reason: not valid java name */
    public static final void m891access$drawArrowBx497Mc(DrawScope drawScope, Path path, Rect rect, long j10, float f6, j0.a aVar) {
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f10 = f8869e;
        path.lineTo(drawScope.mo415toPx0680j_4(f10) * aVar.f78734d, 0.0f);
        float fMo415toPx0680j_4 = drawScope.mo415toPx0680j_4(f10);
        float f11 = aVar.f78734d;
        path.lineTo((fMo415toPx0680j_4 * f11) / 2, drawScope.mo415toPx0680j_4(f8870f) * f11);
        path.mo2412translatek4lQ0M(OffsetKt.Offset((Offset.m2275getXimpl(rect.m2305getCenterF1C5BW0()) + (Math.min(rect.getWidth(), rect.getHeight()) / 2.0f)) - ((drawScope.mo415toPx0680j_4(f10) * f11) / 2.0f), (drawScope.mo415toPx0680j_4(f8868d) / 2.0f) + Offset.m2276getYimpl(rect.m2305getCenterF1C5BW0())));
        path.close();
        long jMo2908getCenterF1C5BW0 = drawScope.mo2908getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2921rotateUv8p0NA(aVar.f78733c, jMo2908getCenterF1C5BW0);
        a1.b.G(drawScope, path, j10, f6, null, null, 0, 56, null);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }
}
