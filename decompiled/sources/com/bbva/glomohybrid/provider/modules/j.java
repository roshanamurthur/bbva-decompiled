package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomo.user.domain.usecase.StoreIsPnnUseCase;
import com.bbva.glomo.user.repository.datasource.PnnUserDataSource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCountryArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryUseCaseModule$1$5\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,85:1\n129#2,5:86\n*S KotlinDebug\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryUseCaseModule$1$5\n*L\n56#1:86,5\n*E\n"})
public final class j extends Lambda implements Function2<Scope, ParametersHolder, StoreIsPnnUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final j f34300p0 = new j(2);

    @Override // kotlin.jvm.functions.Function2
    public final StoreIsPnnUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new StoreIsPnnUseCase((PnnUserDataSource) single.get(Reflection.getOrCreateKotlinClass(PnnUserDataSource.class), null, null));
    }
}
