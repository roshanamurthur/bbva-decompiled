package qn;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: Scope.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class b extends Lambda implements Function0<ParametersHolder> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Scope f92880p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Scope scope) {
        super(0);
        this.f92880p0 = scope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ParametersHolder invoke() {
        return this.f92880p0.get_parameterStack().removeFirstOrNull();
    }
}
