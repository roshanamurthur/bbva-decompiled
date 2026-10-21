package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SearchBar.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$DockedSearchBar$2$1$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n1#1,746:1\n76#2:747\n76#2:771\n154#3:748\n36#4:749\n36#4:757\n460#4,13:783\n473#4,3:797\n1114#5,3:750\n1117#5,3:754\n1114#5,6:758\n88#6:753\n74#7,6:764\n80#7:796\n84#7:801\n75#8:770\n76#8,11:772\n89#8:800\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$DockedSearchBar$2$1$1\n*L\n391#1:747\n399#1:771\n391#1:748\n392#1:749\n395#1:757\n399#1:783,13\n399#1:797,3\n392#1:750,3\n392#1:754,3\n395#1:758,6\n393#1:753\n399#1:764,6\n399#1:796\n399#1:801\n399#1:770\n399#1:772,11\n399#1:800\n*E\n"})
public final class e3 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SearchBarColors f12805p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f12806q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f12807r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e3(SearchBarColors searchBarColors, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
        super(3);
        this.f12805p0 = searchBarColors;
        this.f12806q0 = function3;
        this.f12807r0 = i10;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(393964167, iIntValue, -1, "androidx.compose.material3.DockedSearchBar.<anonymous>.<anonymous>.<anonymous> (SearchBar.kt:389)");
        }
        float fM4389constructorimpl = Dp.m4389constructorimpl(((Configuration) composer2.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp);
        Dp dpM4387boximpl = Dp.m4387boximpl(fM4389constructorimpl);
        composer2.startReplaceableGroup(1157296644);
        boolean zChanged = composer2.changed(dpM4387boximpl);
        Object objRememberedValue = composer2.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = Dp.m4387boximpl(Dp.m4389constructorimpl(fM4389constructorimpl * 0.6666667f));
            composer2.updateRememberedValue(objRememberedValue);
        }
        composer2.endReplaceableGroup();
        float fM4403unboximpl = ((Dp) objRememberedValue).m4403unboximpl();
        Dp dpM4387boximpl2 = Dp.m4387boximpl(fM4403unboximpl);
        composer2.startReplaceableGroup(1157296644);
        boolean zChanged2 = composer2.changed(dpM4387boximpl2);
        Object objRememberedValue2 = composer2.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = Dp.m4387boximpl(((Dp) kotlin.ranges.c.coerceAtMost(Dp.m4387boximpl(SearchBarKt.getDockedActiveTableMinHeight()), Dp.m4387boximpl(fM4403unboximpl))).m4403unboximpl());
            composer2.updateRememberedValue(objRememberedValue2);
        }
        composer2.endReplaceableGroup();
        Modifier modifierM322heightInVpY3zN4 = SizeKt.m322heightInVpY3zN4(Modifier.INSTANCE, ((Dp) objRememberedValue2).m4403unboximpl(), fM4403unboximpl);
        composer2.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyA = androidx.camera.core.impl.v.a(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM322heightInVpY3zN4);
        if (!(composer2.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor);
        } else {
            composer2.useNode();
        }
        composer2.disableReusing();
        Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
        Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyA, composerM2074constructorimpl, density));
        ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        DividerKt.m1083Divider9IZ8Weo(null, 0.0f, this.f12805p0.getDividerColor(), composer2, 0, 3);
        this.f12806q0.invoke(columnScopeInstance, composer2, Integer.valueOf(((this.f12807r0 >> 9) & 112) | 6));
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
