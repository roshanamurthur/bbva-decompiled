package qn;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: Scope.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class a extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Scope f92878p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ParametersHolder f92879q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Scope scope, ParametersHolder parametersHolder) {
        super(0);
        this.f92878p0 = scope;
        this.f92879q0 = parametersHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f92878p0.get_parameterStack().addFirst(this.f92879q0);
        return Unit.INSTANCE;
    }
}
