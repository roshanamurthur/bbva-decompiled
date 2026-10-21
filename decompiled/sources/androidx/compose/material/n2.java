package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f8844p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f8845q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f8846r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ boolean f8847s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(int i10, Function2 function2, Function2 function3, boolean z10) {
        super(2);
        this.f8844p0 = function2;
        this.f8845q0 = function3;
        this.f8846r0 = i10;
        this.f8847s0 = z10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1939362236, iIntValue, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
            }
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getBody2(), ComposableLambdaKt.composableLambda(composer2, 225114541, true, new m2(this.f8846r0, this.f8844p0, this.f8845q0, this.f8847s0)), composer2, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
