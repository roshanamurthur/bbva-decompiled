package qn;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: Scope.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class c extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Scope f92881p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Scope scope) {
        super(0);
        this.f92881p0 = scope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f92881p0.get_parameterStack().clear();
        return Unit.INSTANCE;
    }
}
