package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AndroidAlertDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f12838p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f12839q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f12840r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i10, Function2 function2, Function2 function3) {
        super(2);
        this.f12838p0 = function2;
        this.f12839q0 = i10;
        this.f12840r0 = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(628285581, iIntValue, -1, "androidx.compose.material3.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:97)");
            }
            composer2.startReplaceableGroup(-1969500715);
            int i10 = this.f12839q0;
            Function2<Composer, Integer, Unit> function2 = this.f12838p0;
            if (function2 != null) {
                function2.invoke(composer2, Integer.valueOf((i10 >> 9) & 14));
                Unit unit = Unit.INSTANCE;
            }
            composer2.endReplaceableGroup();
            this.f12840r0.invoke(composer2, Integer.valueOf((i10 >> 3) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
