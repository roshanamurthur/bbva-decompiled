package com.bbva.glomohybrid.provider.modules;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCountryArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryUseCaseModule$1$3\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,85:1\n44#2:86\n129#3,5:87\n*S KotlinDebug\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryUseCaseModule$1$3\n*L\n46#1:86\n47#1:87,5\n*E\n"})
public final class g extends Lambda implements Function2<Scope, ParametersHolder, ValidatePasswordQualityUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final g f34288p0 = new g(2);

    @Override // kotlin.jvm.functions.Function2
    public final ValidatePasswordQualityUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        ParametersHolder parametersHolder2 = parametersHolder;
        return new ValidatePasswordQualityUseCase((ViewModelComponentsProviders) parametersHolder2.elementAt(0, androidx.activity.a.f(scope2, "$this$single", parametersHolder2, "<name for destructuring parameter 0>", ViewModelComponentsProviders.class)), (MessageDispatcher) scope2.get(Reflection.getOrCreateKotlinClass(MessageDispatcher.class), null, null));
    }
}
