package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Modifier f12982p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ long f12983q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ long f12984r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f12985s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> f12986t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ float f12987u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(Modifier modifier, long j10, long j11, int i10, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, float f6) {
        super(2);
        this.f12982p0 = modifier;
        this.f12983q0 = j10;
        this.f12984r0 = j11;
        this.f12985s0 = i10;
        this.f12986t0 = function3;
        this.f12987u0 = f6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1459220575, iIntValue, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:346)");
            }
            Modifier modifier = this.f12982p0;
            long j10 = this.f12983q0;
            long j11 = this.f12984r0;
            Function3<PaddingValues, Composer, Integer, Unit> function3 = this.f12986t0;
            float f6 = this.f12987u0;
            int i10 = this.f12985s0;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 1725620860, true, new l(function3, f6, i10));
            int i11 = i10 >> 18;
            SurfaceKt.m1329SurfaceT9BRK9s(modifier, null, j10, j11, 0.0f, 0.0f, null, composableLambda, composer2, (i10 & 14) | 12582912 | (i11 & 896) | (i11 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
