package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DatePickerDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f14368p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f14369q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f14370r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i10, Function2 function2, Function2 function3) {
        super(2);
        this.f14368p0 = function2;
        this.f14369q0 = i10;
        this.f14370r0 = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2020639284, iIntValue, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:101)");
            }
            float f6 = DatePickerDialog_androidKt.f9935b;
            float f10 = DatePickerDialog_androidKt.f9936c;
            Function2<Composer, Integer, Unit> function2 = this.f14370r0;
            AlertDialogKt.m906AlertDialogFlowRowixp7dh8(f6, f10, ComposableLambdaKt.composableLambda(composer2, -1863712509, true, new w(this.f14369q0, this.f14368p0, function2)), composer2, 438);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
