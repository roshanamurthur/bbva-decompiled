package l0;

import androidx.compose.material3.TabKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Tab.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82687p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82688q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f82689r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(int i10, Function2 function2, Function2 function3) {
        super(2);
        this.f82687p0 = function2;
        this.f82688q0 = function3;
        this.f82689r0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f82689r0 | 1);
        TabKt.access$TabBaselineLayout(this.f82687p0, this.f82688q0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
