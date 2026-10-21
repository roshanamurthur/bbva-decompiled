package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.cellsweb.presentation.usecase.CountryConfigureWebPrivateProfileUseCase;
import com.bbva.glomohybrid.cellsweb.usecase.ConfigureWebPrivateProfileUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCountryArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryUseCaseModule$1$4$1\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n*L\n1#1,85:1\n44#2:86\n*S KotlinDebug\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryUseCaseModule$1$4$1\n*L\n51#1:86\n*E\n"})
public final class h extends Lambda implements Function2<Scope, ParametersHolder, ConfigureWebPrivateProfileUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h f34292p0 = new h(2);

    @Override // kotlin.jvm.functions.Function2
    public final ConfigureWebPrivateProfileUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        ParametersHolder parametersHolder2 = parametersHolder;
        return new CountryConfigureWebPrivateProfileUseCase((ViewModelComponentsProviders) parametersHolder2.elementAt(0, androidx.activity.a.f(scope, "$this$scoped", parametersHolder2, "<name for destructuring parameter 0>", ViewModelComponentsProviders.class)), null, 2, null);
    }
}
