package com.bbva.glomohybrid.provider;

import com.bbva.glomohybrid.base.deeplink.DeeplinkDispatcher;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AppDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class l extends Lambda implements Function2<Scope, ParametersHolder, DeeplinkDispatcher> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final l f33931p0 = new l(2);

    @Override // kotlin.jvm.functions.Function2
    public final DeeplinkDispatcher invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new DeeplinkDispatcher();
    }
}
