package com.bbva.glomohybrid.provider;

import com.bbva.glomohybrid.base.file.infrastructure.resolver.FileNameResolver;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class f0 extends Lambda implements Function2<Scope, ParametersHolder, FileNameResolver> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CountryDependenciesProvider f33920p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(CountryDependenciesProvider countryDependenciesProvider) {
        super(2);
        this.f33920p0 = countryDependenciesProvider;
    }

    @Override // kotlin.jvm.functions.Function2
    public final FileNameResolver invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return CountryDependenciesProvider.access$provideFileNameResolver(this.f33920p0);
    }
}
