package androidx.compose.material;

import androidx.compose.runtime.RecomposeScope;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l2 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SnackbarData f8825p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ h0.f1<SnackbarData> f8826q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(SnackbarData snackbarData, h0.f1<SnackbarData> f1Var) {
        super(0);
        this.f8825p0 = snackbarData;
        this.f8826q0 = f1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        h0.f1<SnackbarData> f1Var = this.f8826q0;
        Object obj = f1Var.f68762a;
        SnackbarData snackbarData = this.f8825p0;
        if (!Intrinsics.areEqual(snackbarData, obj)) {
            bk.g.removeAll((List) f1Var.f68763b, (Function1) new k2(snackbarData));
            RecomposeScope recomposeScope = f1Var.f68764c;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
            }
        }
        return Unit.INSTANCE;
    }
}
