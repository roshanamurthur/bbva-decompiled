package androidx.compose.material3;

import androidx.compose.runtime.RecomposeScope;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m3 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SnackbarData f12996p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ l0.x1<SnackbarData> f12997q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(SnackbarData snackbarData, l0.x1<SnackbarData> x1Var) {
        super(0);
        this.f12996p0 = snackbarData;
        this.f12997q0 = x1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        l0.x1<SnackbarData> x1Var = this.f12997q0;
        Object obj = x1Var.f83032a;
        SnackbarData snackbarData = this.f12996p0;
        if (!Intrinsics.areEqual(snackbarData, obj)) {
            bk.g.removeAll((List) x1Var.f83033b, (Function1) new l3(snackbarData));
            RecomposeScope recomposeScope = x1Var.f83034c;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
            }
        }
        return Unit.INSTANCE;
    }
}
