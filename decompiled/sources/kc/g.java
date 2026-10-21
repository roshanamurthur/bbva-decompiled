package kc;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.bbva.ui.compose.TopAppBarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TopAppBar.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class g extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f79307p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f79308q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i10, Function0 function0) {
        super(2);
        this.f79307p0 = function0;
        this.f79308q0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f79308q0 | 1);
        TopAppBarKt.access$NavigationIcon(this.f79307p0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
