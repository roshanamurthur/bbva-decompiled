package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.featureflags.repository.datasource.MemoryDatasource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: FeatureFlagsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class w2 extends Lambda implements Function2<Scope, ParametersHolder, MemoryDatasource> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final w2 f34193p0 = new w2(2);

    @Override // kotlin.jvm.functions.Function2
    public final MemoryDatasource invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new MemoryDatasource();
    }
}
