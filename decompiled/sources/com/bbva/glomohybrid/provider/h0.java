package com.bbva.glomohybrid.provider;

import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class h0 extends Lambda implements Function2<Scope, ParametersHolder, List<? extends String>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CountryDependenciesProvider f33924p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(CountryDependenciesProvider countryDependenciesProvider) {
        super(2);
        this.f33924p0 = countryDependenciesProvider;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<? extends String> invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return this.f33924p0.launcherScreens();
    }
}
