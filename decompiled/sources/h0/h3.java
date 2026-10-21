package h0;

import androidx.compose.material.SnackbarKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f68802p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f68803q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(int i10, Function2 function2) {
        super(2);
        this.f68802p0 = function2;
        this.f68803q0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f68803q0 | 1);
        SnackbarKt.access$TextOnlySnackbar(this.f68802p0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
