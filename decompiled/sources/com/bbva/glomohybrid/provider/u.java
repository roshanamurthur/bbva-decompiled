package com.bbva.glomohybrid.provider;

import com.bbva.cellscore.app.AppLifecycle;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AppDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class u extends Lambda implements Function2<Scope, ParametersHolder, AppLifecycle.Builder> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final u f34374p0 = new u(2);

    @Override // kotlin.jvm.functions.Function2
    public final AppLifecycle.Builder invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return AppDependenciesProvider.access$configureAppLifecycle(AppDependenciesProvider.INSTANCE);
    }
}
