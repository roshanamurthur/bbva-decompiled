package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.usecase.CountryCiscoWebexInstantiatePluginUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCountryArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryUseCaseModule$1$9\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n*L\n1#1,85:1\n44#2:86\n*S KotlinDebug\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryUseCaseModule$1$9\n*L\n68#1:86\n*E\n"})
public final class n extends Lambda implements Function2<Scope, ParametersHolder, CountryCiscoWebexInstantiatePluginUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final n f34316p0 = new n(2);

    @Override // kotlin.jvm.functions.Function2
    public final CountryCiscoWebexInstantiatePluginUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        ParametersHolder parametersHolder2 = parametersHolder;
        return new CountryCiscoWebexInstantiatePluginUseCase((ViewModelComponentsProviders) parametersHolder2.elementAt(0, androidx.activity.a.f(scope, "$this$single", parametersHolder2, "<name for destructuring parameter 0>", ViewModelComponentsProviders.class)));
    }
}
