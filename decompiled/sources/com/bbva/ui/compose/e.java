package com.bbva.ui.compose;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.bbva.ui.R;
import com.bbva.ui.extensions.ContextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: StatusNotification.kt */
/* JADX INFO: loaded from: classes9.dex */
@SourceDebugExtension({"SMAP\nStatusNotification.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatusNotification.kt\ncom/bbva/ui/compose/StatusNotificationKt$StatusNotification$2$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,105:1\n76#2:106\n76#2:177\n76#2:179\n67#3,5:107\n72#3:140\n76#3:189\n78#4,11:112\n78#4,11:148\n91#4:183\n91#4:188\n456#5,8:123\n464#5,3:137\n456#5,8:159\n464#5,3:173\n467#5,3:180\n467#5,3:185\n4144#6,6:131\n4144#6,6:167\n154#7:141\n154#7:178\n73#8,6:142\n79#8:176\n83#8:184\n*S KotlinDebug\n*F\n+ 1 StatusNotification.kt\ncom/bbva/ui/compose/StatusNotificationKt$StatusNotification$2$1\n*L\n63#1:106\n75#1:177\n80#1:179\n60#1:107,5\n60#1:140\n60#1:189\n60#1:112,11\n66#1:148,11\n66#1:183\n60#1:188\n60#1:123,8\n60#1:137,3\n66#1:159,8\n66#1:173,3\n66#1:180,3\n60#1:185,3\n60#1:131,6\n66#1:167,6\n68#1:141\n78#1:178\n66#1:142,6\n66#1:176\n66#1:184\n*E\n"})
public final class e extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ StatusNotificationType f37297p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f37298q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(StatusNotificationType statusNotificationType, int i10) {
        super(2);
        this.f37297p0 = statusNotificationType;
        this.f37298q0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-860328168, iIntValue, -1, "com.bbva.ui.compose.StatusNotification.<anonymous>.<anonymous> (StatusNotification.kt:59)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            StatusNotificationType statusNotificationType = this.f37297p0;
            Modifier modifierM122backgroundbw27NRU$default = BackgroundKt.m122backgroundbw27NRU$default(modifierFillMaxWidth$default, ColorResources_androidKt.colorResource(ContextKt.themeColorResId(context, statusNotificationType.getBackgroundResId()), composer2, 0), null, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment center = companion2.getCenter();
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM122backgroundbw27NRU$default);
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
            Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float f6 = 8;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SizeKt.m342widthInVpY3zN4$default(PaddingKt.m297paddingVpY3zN4(companion, Dp.m4389constructorimpl(16), Dp.m4389constructorimpl(f6)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen.activity_max_width, composer2, 0), 1, null), 0.0f, 1, null);
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getTop(), composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
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
            Function2 function2C2 = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl2, measurePolicyRowMeasurePolicy, composerM2074constructorimpl2, currentCompositionLocalMap2);
            if (composerM2074constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
            }
            ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            IconKt.m780Iconww6aTOc(PainterResources_androidKt.painterResource(statusNotificationType.getIconResId(), composer2, 0), (String) null, (Modifier) null, ColorResources_androidKt.colorResource(ContextKt.themeColorResId((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext()), statusNotificationType.getIconColorResId()), composer2, 0), composer2, 56, 4);
            TextKt.m879Text4IGK_g(StringResources_androidKt.stringResource(this.f37298q0, composer2, 0), PaddingKt.m295absolutePaddingqDBjuR0$default(companion, Dp.m4389constructorimpl(f6), 0.0f, 0.0f, 0.0f, 14, null), ColorResources_androidKt.colorResource(ContextKt.themeColorResId((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext()), R.attr.text_01_default), composer2, 0), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getThin(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199728, 0, 131024);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
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
