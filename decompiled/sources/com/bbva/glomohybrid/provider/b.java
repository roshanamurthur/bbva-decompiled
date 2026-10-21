package com.bbva.glomohybrid.provider;

import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AppDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends Lambda implements Function2<Scope, ParametersHolder, ThreadDispatchers> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b f33908p0 = new b(2);

    @Override // kotlin.jvm.functions.Function2
    public final ThreadDispatchers invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new DefaultThreadDispatchers();
    }
}
