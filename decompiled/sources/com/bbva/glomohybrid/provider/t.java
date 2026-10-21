package com.bbva.glomohybrid.provider;

import com.bbva.glomohybrid.base.AppLifeCycleCreationJobHandler;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AppDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class t extends Lambda implements Function2<Scope, ParametersHolder, AppLifeCycleCreationJobHandler> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final t f34373p0 = new t(2);

    @Override // kotlin.jvm.functions.Function2
    public final AppLifeCycleCreationJobHandler invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new AppLifeCycleCreationJobHandler();
    }
}
