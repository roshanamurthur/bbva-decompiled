package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AndroidAlertDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f12860p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f12861q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f12862r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i10, Function2 function2, Function2 function3) {
        super(2);
        this.f12860p0 = function2;
        this.f12861q0 = i10;
        this.f12862r0 = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1873210524, iIntValue, -1, "androidx.compose.material3.AlertDialog.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:93)");
            }
            float f6 = AndroidAlertDialog_androidKt.f9187a;
            float f10 = AndroidAlertDialog_androidKt.f9188b;
            Function2<Composer, Integer, Unit> function2 = this.f12862r0;
            AlertDialogKt.m906AlertDialogFlowRowixp7dh8(f6, f10, ComposableLambdaKt.composableLambda(composer2, 628285581, true, new g(this.f12861q0, this.f12860p0, function2)), composer2, 438);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
