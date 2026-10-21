package com.bbva.ui.compose;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.mypinpad.tsdk.isolation.y2;
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

/* JADX INFO: compiled from: RowButton.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a_\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"RowButton", "", "isChecked", "", "checkedIconResource", "", "uncheckedIconResource", "checkedTintIconResource", "unCheckedTintIconResource", "checkedBackground", "unCheckedBackground", "onClick", "Lkotlin/Function0;", "(ZIIIIIILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRowButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowButton.kt\ncom/bbva/ui/compose/RowButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,55:1\n154#2:56\n154#2:91\n67#3,5:57\n72#3:90\n76#3:96\n78#4,11:62\n91#4:95\n456#5,8:73\n464#5,3:87\n467#5,3:92\n4144#6,6:81\n*S KotlinDebug\n*F\n+ 1 RowButton.kt\ncom/bbva/ui/compose/RowButtonKt\n*L\n41#1:56\n48#1:91\n39#1:57,5\n39#1:90\n39#1:96\n39#1:62,11\n39#1:95\n39#1:73,8\n39#1:87,3\n39#1:92,3\n39#1:81,6\n*E\n"})
public final class RowButtonKt {

    /* JADX INFO: compiled from: RowButton.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f37165p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f37166q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f37167r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f37168s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f37169t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f37170u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37171w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f37172x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, Function0<Unit> function0, int i16) {
            super(2);
            this.f37165p0 = z10;
            this.f37166q0 = i10;
            this.f37167r0 = i11;
            this.f37168s0 = i12;
            this.f37169t0 = i13;
            this.f37170u0 = i14;
            this.v0 = i15;
            this.f37171w0 = function0;
            this.f37172x0 = i16;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            RowButtonKt.RowButton(this.f37165p0, this.f37166q0, this.f37167r0, this.f37168s0, this.f37169t0, this.f37170u0, this.v0, this.f37171w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37172x0 | 1));
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void RowButton(boolean z10, @DrawableRes int i10, @DrawableRes int i11, @ColorRes int i12, @ColorRes int i13, @ColorRes int i14, @ColorRes int i15, @NotNull Function0<Unit> onClick, @Nullable Composer composer, int i16) {
        int i17;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(888022300);
        if ((i16 & 14) == 0) {
            i17 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 112) == 0) {
            i17 |= composerStartRestartGroup.changed(i10) ? 32 : 16;
        }
        if ((i16 & 896) == 0) {
            i17 |= composerStartRestartGroup.changed(i11) ? 256 : 128;
        }
        if ((i16 & 7168) == 0) {
            i17 |= composerStartRestartGroup.changed(i12) ? 2048 : 1024;
        }
        if ((57344 & i16) == 0) {
            i17 |= composerStartRestartGroup.changed(i13) ? 16384 : 8192;
        }
        if ((458752 & i16) == 0) {
            i17 |= composerStartRestartGroup.changed(i14) ? 131072 : 65536;
        }
        if ((3670016 & i16) == 0) {
            i17 |= composerStartRestartGroup.changed(i15) ? 1048576 : 524288;
        }
        if ((29360128 & i16) == 0) {
            i17 |= composerStartRestartGroup.changedInstance(onClick) ? 8388608 : 4194304;
        }
        if ((23967451 & i17) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(888022300, i17, -1, "com.bbva.ui.compose.RowButton (RowButton.kt:37)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM148clickableXHw0xAI$default = ClickableKt.m148clickableXHw0xAI$default(BackgroundKt.m122backgroundbw27NRU$default(ClipKt.clip(SizeKt.m335size3ABfNKs(companion, Dp.m4389constructorimpl(48)), RoundedCornerShapeKt.getCircleShape()), ColorResources_androidKt.colorResource(z10 ? i14 : i15, composerStartRestartGroup, 0), null, 2, null), false, null, null, onClick, 7, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM148clickableXHw0xAI$default);
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
            Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM335size3ABfNKs = SizeKt.m335size3ABfNKs(companion, Dp.m4389constructorimpl(24));
            composer2 = composerStartRestartGroup;
            IconKt.m780Iconww6aTOc(PainterResources_androidKt.painterResource(z10 ? i10 : i11, composerStartRestartGroup, 0), "", modifierM335size3ABfNKs, ColorResources_androidKt.colorResource(z10 ? i12 : i13, composerStartRestartGroup, 0), composer2, 440, 0);
            if (y2.d(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a(z10, i10, i11, i12, i13, i14, i15, onClick, i16));
        }
    }
}
