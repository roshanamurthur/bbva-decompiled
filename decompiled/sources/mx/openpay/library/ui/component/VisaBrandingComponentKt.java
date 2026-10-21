package mx.openpay.library.ui.component;

import androidx.appcompat.widget.g0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.databinding.e;
import com.mypinpad.tsdk.isolation.y2;
import e.c;
import e.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.a;
import mx.openpay.library.R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a:\u0010\b\u001a\u00020\u00062)\u0010\u0007\u001a%\u0012\u001b\u0012\u0019\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0000H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Ljava/lang/Error;", "Lkotlin/Error;", "Lkotlin/ParameterName;", "name", "error", "", "onAnimationEnd", "VisaBrandingComponent", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "library_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVisaBrandingComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisaBrandingComponent.kt\nmx/openpay/library/ui/component/VisaBrandingComponentKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,58:1\n68#2,5:59\n73#2:90\n77#2:102\n75#3:64\n76#3,11:66\n89#3:101\n76#4:65\n460#5,13:77\n36#5:91\n473#5,3:98\n1057#6,6:92\n*S KotlinDebug\n*F\n+ 1 VisaBrandingComponent.kt\nmx/openpay/library/ui/component/VisaBrandingComponentKt\n*L\n27#1:59,5\n27#1:90\n27#1:102\n27#1:64\n27#1:66,11\n27#1:101\n27#1:65\n27#1:77,13\n44#1:91\n27#1:98,3\n44#1:92,6\n*E\n"})
public final class VisaBrandingComponentKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void VisaBrandingComponent(@NotNull Function1<? super Error, Unit> onAnimationEnd, @Nullable Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(onAnimationEnd, "onAnimationEnd");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1089455494);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(onAnimationEnd) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1089455494, i11, -1, "mx.openpay.library.ui.component.VisaBrandingComponent (VisaBrandingComponent.kt:23)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM122backgroundbw27NRU$default = BackgroundKt.m122backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 1, null), ColorResources_androidKt.colorResource(R.color.visa_blue, composerStartRestartGroup, 0), null, 2, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            Density density = (Density) y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM122backgroundbw27NRU$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) a.a(companion2, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, density));
            ai.a.j(0, function3MaterializerOf, g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM321height3ABfNKs = SizeKt.m321height3ABfNKs(SizeKt.m340width3ABfNKs(companion, Dp.m4389constructorimpl(Float.MAX_VALUE)), Dp.m4389constructorimpl(Float.MAX_VALUE));
            e.a aVar = e.a.f68209a;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(onAnimationEnd);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new c(onAnimationEnd);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(aVar, modifierM321height3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, 54, 0);
            if (e.e(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(onAnimationEnd, i10));
    }
}
