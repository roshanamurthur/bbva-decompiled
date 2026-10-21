package com.bbva.glomohybrid.provider;

import com.bbva.glomohybrid.base.file.infrastructure.FileRemovalLifecycle;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AppDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class j extends Lambda implements Function2<Scope, ParametersHolder, FileRemovalLifecycle> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final j f33927p0 = new j(2);

    @Override // kotlin.jvm.functions.Function2
    public final FileRemovalLifecycle invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullExpressionValue("LoginActivity", "getSimpleName(...)");
        return new FileRemovalLifecycle("LoginActivity");
    }
}
