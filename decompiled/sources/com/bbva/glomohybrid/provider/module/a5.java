package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.UserAgent;
import com.bbva.glomohybrid.interceptors.UserAgentInterceptor;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NetworkModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a5 extends Lambda implements Function2<Scope, ParametersHolder, UserAgentInterceptor> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a5 f34006p0 = new a5(2);

    @Override // kotlin.jvm.functions.Function2
    public final UserAgentInterceptor invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new UserAgentInterceptor(UserAgent.INSTANCE.retrieve());
    }
}
