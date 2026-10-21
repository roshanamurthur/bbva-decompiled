package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AlertDialog.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f8357p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f8358q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i10, Function2 function2) {
        super(2);
        this.f8357p0 = function2;
        this.f8358q0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(770166432, iIntValue, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:62)");
            }
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getSubtitle1(), this.f8357p0, composer2, (this.f8358q0 >> 3) & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
