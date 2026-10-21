package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.provider.ActivityDependenciesProvider;
import com.bbva.glomohybrid.cellsweb.provider.CellsDependenciesProvider;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class k6 extends Lambda implements Function2<Scope, ParametersHolder, ActivityDependenciesProvider> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final k6 f34097p0 = new k6(2);

    @Override // kotlin.jvm.functions.Function2
    public final ActivityDependenciesProvider invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scoped = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CellsDependenciesProvider(null, 1, null);
    }
}
