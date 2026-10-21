package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> f9096p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ BottomSheetScaffoldState f9097q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f9098r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, BottomSheetScaffoldState bottomSheetScaffoldState, int i10) {
        super(2);
        this.f9096p0 = function3;
        this.f9097q0 = bottomSheetScaffoldState;
        this.f9098r0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-486138068, iIntValue, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:490)");
            }
            this.f9096p0.invoke(this.f9097q0.getSnackbarHostState(), composer2, Integer.valueOf((this.f9098r0 >> 9) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
