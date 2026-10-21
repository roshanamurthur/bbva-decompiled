package com.bbva.glomohybrid.provider;

import com.bbva.glomohybrid.UserAgent;
import com.bbva.glomohybrid.userAgent.UserAgentWebDispatcher;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d0 extends Lambda implements Function2<Scope, ParametersHolder, UserAgentWebDispatcher> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final d0 f33913p0 = new d0(2);

    @Override // kotlin.jvm.functions.Function2
    public final UserAgentWebDispatcher invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new UserAgentWebDispatcher(UserAgent.INSTANCE.retrieve());
    }
}
