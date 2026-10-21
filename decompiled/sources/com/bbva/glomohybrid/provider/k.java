package com.bbva.glomohybrid.provider;

import com.bbva.cellscore.web.component.InternalWebView;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AppDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class k extends Lambda implements Function2<Scope, ParametersHolder, InternalWebView> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final k f33929p0 = new k(2);

    @Override // kotlin.jvm.functions.Function2
    public final InternalWebView invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return AppDependenciesProvider.access$provideWebView(AppDependenciesProvider.INSTANCE);
    }
}
