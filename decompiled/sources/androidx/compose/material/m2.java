package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f8833p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f8834q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f8835r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ boolean f8836s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(int i10, Function2 function2, Function2 function3, boolean z10) {
        super(2);
        this.f8833p0 = function2;
        this.f8834q0 = function3;
        this.f8835r0 = i10;
        this.f8836s0 = z10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(225114541, iIntValue, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
            }
            int i10 = this.f8835r0;
            Function2<Composer, Integer, Unit> function2 = this.f8834q0;
            Function2<Composer, Integer, Unit> function3 = this.f8833p0;
            if (function3 == null) {
                composer2.startReplaceableGroup(59708346);
                SnackbarKt.access$TextOnlySnackbar(function2, composer2, (i10 >> 21) & 14);
                composer2.endReplaceableGroup();
            } else if (this.f8836s0) {
                composer2.startReplaceableGroup(59708411);
                SnackbarKt.access$NewLineButtonSnackbar(function2, function3, composer2, (i10 & 112) | ((i10 >> 21) & 14));
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(59708478);
                SnackbarKt.access$OneRowSnackbar(function2, function3, composer2, (i10 & 112) | ((i10 >> 21) & 14));
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
