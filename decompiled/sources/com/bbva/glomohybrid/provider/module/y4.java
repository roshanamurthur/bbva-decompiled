package com.bbva.glomohybrid.provider.module;

import java.net.CookieManager;
import java.net.CookiePolicy;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NetworkModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class y4 extends Lambda implements Function2<Scope, ParametersHolder, CookieManager> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final y4 f34211p0 = new y4(2);

    @Override // kotlin.jvm.functions.Function2
    public final CookieManager invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        return cookieManager;
    }
}
