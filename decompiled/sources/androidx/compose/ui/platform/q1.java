package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.R;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: Wrapper.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ r1 f17436p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f17437q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q1(r1 r1Var, Function2<? super Composer, ? super Integer, Unit> function2) {
        super(2);
        this.f17436p0 = r1Var;
        this.f17437q0 = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2000640158, iIntValue, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:141)");
            }
            r1 r1Var = this.f17436p0;
            AndroidComposeView androidComposeView = r1Var.f17440p0;
            int i10 = R.id.inspection_slot_table_set;
            Object tag = androidComposeView.getTag(i10);
            Set<CompositionData> set = TypeIntrinsics.isMutableSet(tag) ? (Set) tag : null;
            AndroidComposeView androidComposeView2 = r1Var.f17440p0;
            if (set == null) {
                Object parent = androidComposeView2.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(i10) : null;
                set = TypeIntrinsics.isMutableSet(tag2) ? (Set) tag2 : null;
            }
            if (set != null) {
                set.add(composer2.getCompositionData());
                composer2.collectParameterInformation();
            }
            EffectsKt.LaunchedEffect(androidComposeView2, new o1(r1Var, null), composer2, 72);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{InspectionTablesKt.getLocalInspectionTables().provides(set)}, ComposableLambdaKt.composableLambda(composer2, -1193460702, true, new p1(r1Var, this.f17437q0)), composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
