package com.bbva.glomohybrid.provider;

import com.bbva.glomohybrid.WebChromeClient;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AppDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class q extends Lambda implements Function2<Scope, ParametersHolder, WebChromeClient> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final q f34370p0 = new q(2);

    @Override // kotlin.jvm.functions.Function2
    public final WebChromeClient invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new WebChromeClient();
    }
}
