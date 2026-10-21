package l0;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt$ChipContent$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,2104:1\n79#2,2:2105\n81#2:2133\n85#2:2138\n75#3:2107\n76#3,11:2109\n89#3:2137\n76#4:2108\n460#5,13:2120\n473#5,3:2134\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt$ChipContent$1\n*L\n1412#1:2105,2\n1412#1:2133\n1412#1:2138\n1412#1:2107\n1412#1:2109,11\n1412#1:2137\n1412#1:2108\n1412#1:2120,13\n1412#1:2134,3\n*E\n"})
public final class b0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ float f82430p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f82431q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82432r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f82433s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82434t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ long f82435u0;
    public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82436w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ long f82437x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(float f6, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function2, int i10, Function2<? super Composer, ? super Integer, Unit> function3, long j10, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, long j11) {
        super(2);
        this.f82430p0 = f6;
        this.f82431q0 = paddingValues;
        this.f82432r0 = function2;
        this.f82433s0 = i10;
        this.f82434t0 = function3;
        this.f82435u0 = j10;
        this.v0 = function4;
        this.f82436w0 = function5;
        this.f82437x0 = j11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1748799148, iIntValue, -1, "androidx.compose.material3.ChipContent.<anonymous> (Chip.kt:1410)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(SizeKt.m320defaultMinSizeVpY3zN4$default(companion, 0.0f, this.f82430p0, 1, null), this.f82431q0);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
            Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierPadding);
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
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) a.a(companion2, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, density));
            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Function2<Composer, Integer, Unit> function2 = this.f82432r0;
            int i10 = this.f82433s0;
            if (function2 != null) {
                composer2.startReplaceableGroup(650988036);
                function2.invoke(composer2, Integer.valueOf((i10 >> 12) & 14));
                composer2.endReplaceableGroup();
            } else {
                Function2<Composer, Integer, Unit> function3 = this.f82434t0;
                if (function3 != null) {
                    composer2.startReplaceableGroup(650988107);
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(this.f82435u0))}, function3, composer2, ((i10 >> 6) & 112) | 8);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(650988269);
                    composer2.endReplaceableGroup();
                }
            }
            SpacerKt.Spacer(SizeKt.m340width3ABfNKs(companion, ChipKt.f9689a), composer2, 6);
            this.v0.invoke(composer2, Integer.valueOf(i10 & 14));
            SpacerKt.Spacer(SizeKt.m340width3ABfNKs(companion, ChipKt.f9689a), composer2, 6);
            composer2.startReplaceableGroup(-313068567);
            Function2<Composer, Integer, Unit> function4 = this.f82436w0;
            if (function4 != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(this.f82437x0))}, function4, composer2, ((i10 >> 12) & 112) | 8);
            }
            if (androidx.databinding.e.e(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
