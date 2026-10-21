package com.bbva.glomohybrid.provider;

import com.bbva.glomohybrid.landing.domain.usecase.ScheduledShutdownCheckerUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class e0 extends Lambda implements Function2<Scope, ParametersHolder, ScheduledShutdownCheckerUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final e0 f33915p0 = new e0(2);

    @Override // kotlin.jvm.functions.Function2
    public final ScheduledShutdownCheckerUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new ScheduledShutdownCheckerUseCase(null, 1, null);
    }
}
